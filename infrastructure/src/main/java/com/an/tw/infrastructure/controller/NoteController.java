package com.an.tw.infrastructure.controller;

import com.an.tw.application.usecase.CreateNoteUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final CreateNoteUseCase createNoteUseCase;

    public NoteController(CreateNoteUseCase createNoteUseCase) {
        this.createNoteUseCase = createNoteUseCase;
    }

    @PostMapping
    public void createNote(@RequestBody CreateNoteRequest request) {
        createNoteUseCase.execute(request.getContent(), request.getEmotion(), request.getIntensity());
    }

    public static class CreateNoteRequest {
        private String content;
        private String emotion;
        private int intensity;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getEmotion() {
            return emotion;
        }

        public void setEmotion(String emotion) {
            this.emotion = emotion;
        }

        public int getIntensity() {
            return intensity;
        }

        public void setIntensity(int intensity) {
            this.intensity = intensity;
        }
    }
}
