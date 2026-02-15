package com.an.tw.domain.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class EmotionalNote {
    private UUID id;
    private String content;
    private String emotion; // e.g., "Happy", "Sad", "Angry"
    private int intensity; // 1-10
    private LocalDateTime createdAt;

    public EmotionalNote(UUID id, String content, String emotion, int intensity, LocalDateTime createdAt) {
        this.id = id;
        this.content = content;
        this.emotion = emotion;
        this.intensity = intensity;
        this.createdAt = createdAt;
    }

    // Getters
    public UUID getId() { return id; }
    public String getContent() { return content; }
    public String getEmotion() { return emotion; }
    public int getIntensity() { return intensity; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    // Setters (if needed for updates)
    public void setContent(String content) { this.content = content; }
    public void setEmotion(String emotion) { this.emotion = emotion; }
    public void setIntensity(int intensity) { this.intensity = intensity; }
}