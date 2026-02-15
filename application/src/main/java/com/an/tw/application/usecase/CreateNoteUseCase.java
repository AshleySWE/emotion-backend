package com.an.tw.application.usecase;

import com.an.tw.domain.entity.EmotionalNote;
import com.an.tw.domain.model.DomainNote;
import com.an.tw.domain.repository.EmotionalNoteRepository;
import java.time.LocalDateTime;
import java.util.UUID;

public class CreateNoteUseCase {
    private final EmotionalNoteRepository repository;

    public CreateNoteUseCase(EmotionalNoteRepository repository) {
        this.repository = repository;
    }

    public void execute(String content, String emotion, int intensity) {
        DomainNote note = DomainNote.create(content, emotion, intensity);
        repository.save(note);
    }
}