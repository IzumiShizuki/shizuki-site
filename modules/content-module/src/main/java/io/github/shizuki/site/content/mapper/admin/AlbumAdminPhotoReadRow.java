package io.github.shizuki.site.content.mapper.admin;

public class AlbumAdminPhotoReadRow {
    private Long photoId;
    private String mediaRef;
    private String title;
    private String altText;
    private String caption;
    private String publishedLocationLabel;
    private String photoProcessingStatus;
    private Integer sortNum;
    private String downloadMode;
    private Integer associationVersion;

    public Long getPhotoId() { return photoId; }
    public void setPhotoId(Long photoId) { this.photoId = photoId; }
    public String getMediaRef() { return mediaRef; }
    public void setMediaRef(String mediaRef) { this.mediaRef = mediaRef; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAltText() { return altText; }
    public void setAltText(String altText) { this.altText = altText; }
    public String getCaption() { return caption; }
    public void setCaption(String caption) { this.caption = caption; }
    public String getPublishedLocationLabel() { return publishedLocationLabel; }
    public void setPublishedLocationLabel(String publishedLocationLabel) { this.publishedLocationLabel = publishedLocationLabel; }
    public String getPhotoProcessingStatus() { return photoProcessingStatus; }
    public void setPhotoProcessingStatus(String photoProcessingStatus) { this.photoProcessingStatus = photoProcessingStatus; }
    public Integer getSortNum() { return sortNum; }
    public void setSortNum(Integer sortNum) { this.sortNum = sortNum; }
    public String getDownloadMode() { return downloadMode; }
    public void setDownloadMode(String downloadMode) { this.downloadMode = downloadMode; }
    public Integer getAssociationVersion() { return associationVersion; }
    public void setAssociationVersion(Integer associationVersion) { this.associationVersion = associationVersion; }
}
