package com.an.tw.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class DomainNote {
    private final UUID id;
    private final String content;
    private final String emotion;
    private final int intensity; // 1-10
    private final LocalDateTime createdAt;

    public DomainNote(UUID id, String content, String emotion, int intensity, LocalDateTime createdAt) {
        this.id = id;
        this.content = content;
        this.emotion = emotion;
        this.intensity = intensity;
        this.createdAt = createdAt;
    }

    public static DomainNote create(String content, String emotion, int intensity) {
        return new DomainNote(UUID.randomUUID(), content, emotion, intensity, LocalDateTime.now());
    }

    public UUID getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getEmotion() {
        return emotion;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}