package io.github.shizuki.site.content.mapper.admin;

import java.time.LocalDateTime;

public class AlbumAdminReadRow {
    private Long id;
    private String publicSlug;
    private String title;
    private String summary;
    private Long coverPhotoId;
    private String lifecycleStatus;
    private String visibilityStatus;
    private Integer featured;
    private Integer sortNum;
    private Integer photoCount;
    private LocalDateTime publishTime;
    private LocalDateTime recycleTime;
    private LocalDateTime purgeAfter;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer version;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getPublicSlug() { return publicSlug; }
    public void setPublicSlug(String publicSlug) { this.publicSlug = publicSlug; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }
    public Long getCoverPhotoId() { return coverPhotoId; }
    public void setCoverPhotoId(Long coverPhotoId) { this.coverPhotoId = coverPhotoId; }
    public String getLifecycleStatus() { return lifecycleStatus; }
    public void setLifecycleStatus(String lifecycleStatus) { this.lifecycleStatus = lifecycleStatus; }
    public String getVisibilityStatus() { return visibilityStatus; }
    public void setVisibilityStatus(String visibilityStatus) { this.visibilityStatus = visibilityStatus; }
    public Integer getFeatured() { return featured; }
    public void setFeatured(Integer featured) { this.featured = featured; }
    public Integer getSortNum() { return sortNum; }
    public void setSortNum(Integer sortNum) { this.sortNum = sortNum; }
    public Integer getPhotoCount() { return photoCount; }
    public void setPhotoCount(Integer photoCount) { this.photoCount = photoCount; }
    public LocalDateTime getPublishTime() { return publishTime; }
    public void setPublishTime(LocalDateTime publishTime) { this.publishTime = publishTime; }
    public LocalDateTime getRecycleTime() { return recycleTime; }
    public void setRecycleTime(LocalDateTime recycleTime) { this.recycleTime = recycleTime; }
    public LocalDateTime getPurgeAfter() { return purgeAfter; }
    public void setPurgeAfter(LocalDateTime purgeAfter) { this.purgeAfter = purgeAfter; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    public Integer getVersion() { return version; }
    public void setVersion(Integer version) { this.version = version; }
}
