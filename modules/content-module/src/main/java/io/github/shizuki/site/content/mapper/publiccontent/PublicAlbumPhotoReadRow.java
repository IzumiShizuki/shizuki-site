package io.github.shizuki.site.content.mapper.publiccontent;

/** Ordered visitor photo projection containing only association-scoped opaque media identity. */
public class PublicAlbumPhotoReadRow {
    private String mediaRef;
    private String title;
    private String altText;
    private String caption;
    private String publishedLocationLabel;
    private Integer sortNum;

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
    public Integer getSortNum() { return sortNum; }
    public void setSortNum(Integer sortNum) { this.sortNum = sortNum; }
}
