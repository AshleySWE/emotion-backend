package com.an.tw.infrastructure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "emotional_notes")
public class EmotionalNoteEntity {
    @Id
    private UUID id;
    private String content;
    private String emotion;
    private int intensity;
    private LocalDateTime createdAt;

    // Default constructor for JPA
    public EmotionalNoteEntity() {}

    public EmotionalNoteEntity(UUID id, String content, String emotion, int intensity, LocalDateTime createdAt) {
        this.id = id;
        this.content = content;
        this.emotion = emotion;
        this.intensity = intensity;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public String getEmotion() { return emotion; }
    public void setEmotion(String emotion) { this.emotion = emotion; }
    public int getIntensity() { return intensity; }
    public void setIntensity(int intensity) { this.intensity = intensity; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}