package com.an.tw.infrastructure.repository;

import com.an.tw.domain.model.DomainNote;
import com.an.tw.domain.repository.EmotionalNoteRepository;
import com.an.tw.infrastructure.entity.EmotionalNoteEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class EmotionalNoteRepositoryImpl implements EmotionalNoteRepository {

    private final JpaEmotionalNoteRepository jpaRepository;

    public EmotionalNoteRepositoryImpl(JpaEmotionalNoteRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public void save(DomainNote note) {
        EmotionalNoteEntity entity = new EmotionalNoteEntity(
            note.getId(),
            note.getContent(),
            note.getEmotion(),
            note.getIntensity(),
            note.getCreatedAt()
        );
        jpaRepository.save(entity);
    }

    @Override
    public Optional<DomainNote> findById(UUID id) {
        return jpaRepository.findById(id)
                .map(this::toDomain);
    }

    @Override
    public List<DomainNote> findAll() {
        return jpaRepository.findAll().stream()
                .map(this::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(UUID id) {
        jpaRepository.deleteById(id);
    }

    private DomainNote toDomain(EmotionalNoteEntity entity) {
        return new DomainNote(
                entity.getId(),
                entity.getContent(),
                entity.getEmotion(),
                entity.getIntensity(),
                entity.getCreatedAt()
        );
    }
}
