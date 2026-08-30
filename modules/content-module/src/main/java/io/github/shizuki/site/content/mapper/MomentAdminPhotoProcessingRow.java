package io.github.shizuki.site.content.mapper;

/** Admin-safe processing projection; deliberately excludes asset and object-storage identity. */
public class MomentAdminPhotoProcessingRow {

    private Long photoId;
    private String mediaRef;
    private Integer sortNum;
    private String title;
    private String altText;
    private String publishedLocationLabel;
    private String photoStatus;
    private String variantCode;
    private String deliveryScope;
    private String derivativeStatus;
    private Integer derivativeVersion;
    private String assetAuditStatus;

    public Long getPhotoId() { return photoId; }
    public void setPhotoId(Long photoId) { this.photoId = photoId; }
    public String getMediaRef() { return mediaRef; }
    public void setMediaRef(String mediaRef) { this.mediaRef = mediaRef; }
    public Integer getSortNum() { return sortNum; }
    public void setSortNum(Integer sortNum) { this.sortNum = sortNum; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAltText() { return altText; }
    public void setAltText(String altText) { this.altText = altText; }
    public String getPublishedLocationLabel() { return publishedLocationLabel; }
    public void setPublishedLocationLabel(String publishedLocationLabel) { this.publishedLocationLabel = publishedLocationLabel; }
    public String getPhotoStatus() { return photoStatus; }
    public void setPhotoStatus(String photoStatus) { this.photoStatus = photoStatus; }
    public String getVariantCode() { return variantCode; }
    public void setVariantCode(String variantCode) { this.variantCode = variantCode; }
    public String getDeliveryScope() { return deliveryScope; }
    public void setDeliveryScope(String deliveryScope) { this.deliveryScope = deliveryScope; }
    public String getDerivativeStatus() { return derivativeStatus; }
    public void setDerivativeStatus(String derivativeStatus) { this.derivativeStatus = derivativeStatus; }
    public Integer getDerivativeVersion() { return derivativeVersion; }
    public void setDerivativeVersion(Integer derivativeVersion) { this.derivativeVersion = derivativeVersion; }
    public String getAssetAuditStatus() { return assetAuditStatus; }
    public void setAssetAuditStatus(String assetAuditStatus) { this.assetAuditStatus = assetAuditStatus; }
}
