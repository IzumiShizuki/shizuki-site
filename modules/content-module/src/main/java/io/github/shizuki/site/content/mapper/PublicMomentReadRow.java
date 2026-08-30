package io.github.shizuki.site.content.mapper;

import java.time.LocalDateTime;

public class PublicMomentReadRow {
    private Long id;
    private String publicId;
    private String body;
    private String visibilityStatus;
    private Boolean featured;
    private Boolean pinned;
    private LocalDateTime publishedAt;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getPublicId() { return publicId; }
    public void setPublicId(String publicId) { this.publicId = publicId; }
    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }
    public String getVisibilityStatus() { return visibilityStatus; }
    public void setVisibilityStatus(String visibilityStatus) { this.visibilityStatus = visibilityStatus; }
    public Boolean getFeatured() { return featured; }
    public void setFeatured(Boolean featured) { this.featured = featured; }
    public Boolean getPinned() { return pinned; }
    public void setPinned(Boolean pinned) { this.pinned = pinned; }
    public LocalDateTime getPublishedAt() { return publishedAt; }
    public void setPublishedAt(LocalDateTime publishedAt) { this.publishedAt = publishedAt; }
}
