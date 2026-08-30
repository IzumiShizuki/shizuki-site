package io.github.shizuki.site.content.mapper;

public class PublicMomentPhotoReadRow {
    private Long momentId;
    private String mediaRef;
    private String publishedLocationLabel;
    private Integer sortNum;

    public Long getMomentId() { return momentId; }
    public void setMomentId(Long momentId) { this.momentId = momentId; }
    public String getMediaRef() { return mediaRef; }
    public void setMediaRef(String mediaRef) { this.mediaRef = mediaRef; }
    public String getPublishedLocationLabel() { return publishedLocationLabel; }
    public void setPublishedLocationLabel(String publishedLocationLabel) { this.publishedLocationLabel = publishedLocationLabel; }
    public Integer getSortNum() { return sortNum; }
    public void setSortNum(Integer sortNum) { this.sortNum = sortNum; }
}
