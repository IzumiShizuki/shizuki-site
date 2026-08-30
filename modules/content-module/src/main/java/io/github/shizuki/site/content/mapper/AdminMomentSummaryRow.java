package io.github.shizuki.site.content.mapper;

import java.time.LocalDateTime;

public class AdminMomentSummaryRow {
    private Long id;
    private String body;
    private String lifecycle;
    private String visibility;
    private Boolean featured;
    private Boolean pinned;
    private Integer photoCount;
    private Integer version;
    private LocalDateTime updatedAt;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }
    public String getLifecycle() { return lifecycle; }
    public void setLifecycle(String lifecycle) { this.lifecycle = lifecycle; }
    public String getVisibility() { return visibility; }
    public void setVisibility(String visibility) { this.visibility = visibility; }
    public Boolean getFeatured() { return featured; }
    public void setFeatured(Boolean featured) { this.featured = featured; }
    public Boolean getPinned() { return pinned; }
    public void setPinned(Boolean pinned) { this.pinned = pinned; }
    public Integer getPhotoCount() { return photoCount; }
    public void setPhotoCount(Integer photoCount) { this.photoCount = photoCount; }
    public Integer getVersion() { return version; }
    public void setVersion(Integer version) { this.version = version; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
