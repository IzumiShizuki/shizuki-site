package io.github.shizuki.site.content.mapper.publiccontent;

import java.time.LocalDateTime;

/** Internal read projection; storage and asset identifiers are deliberately absent. */
public class PublicAlbumReadRow {
    private Long id;
    private String publicSlug;
    private String title;
    private String summary;
    private String visibilityStatus;
    private Integer photoCount;
    private LocalDateTime publishTime;
    private String coverMediaRef;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getPublicSlug() { return publicSlug; }
    public void setPublicSlug(String publicSlug) { this.publicSlug = publicSlug; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }
    public String getVisibilityStatus() { return visibilityStatus; }
    public void setVisibilityStatus(String visibilityStatus) { this.visibilityStatus = visibilityStatus; }
    public Integer getPhotoCount() { return photoCount; }
    public void setPhotoCount(Integer photoCount) { this.photoCount = photoCount; }
    public LocalDateTime getPublishTime() { return publishTime; }
    public void setPublishTime(LocalDateTime publishTime) { this.publishTime = publishTime; }
    public String getCoverMediaRef() { return coverMediaRef; }
    public void setCoverMediaRef(String coverMediaRef) { this.coverMediaRef = coverMediaRef; }
}
