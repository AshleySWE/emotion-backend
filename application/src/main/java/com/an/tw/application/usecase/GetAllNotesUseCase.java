package com.an.tw.application.usecase;

import com.an.tw.domain.model.DomainNote;
import com.an.tw.domain.repository.EmotionalNoteRepository;
import java.util.List;

public class GetAllNotesUseCase {
    private final EmotionalNoteRepository repository;

    public GetAllNotesUseCase(EmotionalNoteRepository repository) {
        this.repository = repository;
    }

    public List<DomainNote> execute() {
        return repository.findAll();
    }
}