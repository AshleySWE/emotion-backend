package com.an.tw.domain.repository;

import com.an.tw.domain.model.DomainNote;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmotionalNoteRepository {
    void save(DomainNote note);
    Optional<DomainNote> findById(UUID id);
    List<DomainNote> findAll();
    void deleteById(UUID id);
}