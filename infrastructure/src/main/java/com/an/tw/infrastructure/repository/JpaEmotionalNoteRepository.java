package com.an.tw.infrastructure.repository;

import com.an.tw.infrastructure.entity.EmotionalNoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface JpaEmotionalNoteRepository extends JpaRepository<EmotionalNoteEntity, UUID> {
}