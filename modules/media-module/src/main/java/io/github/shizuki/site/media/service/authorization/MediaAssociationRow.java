package io.github.shizuki.site.media.service.authorization;

/**
 * album-photo / moment-photo 的统一内部授权投影。绝不直接作为 HTTP 响应返回。
 */
public class MediaAssociationRow {

    private String associationType;
    private Long associationId;
    private String mediaRef;
    private Long photoId;
    private Long sourceAssetId;
    private String altText;
    private String processingStatus;
    private String lifecycleStatus;
    private String visibilityStatus;
    private Integer contentVersion;
    private Integer associationVersion;
    private String downloadMode;
    private Boolean deliveryRevoked;

    public String getAssociationType() {
        return associationType;
    }

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    public Long getAssociationId() {
        return associationId;
    }

    public void setAssociationId(Long associationId) {
        this.associationId = associationId;
    }

    public String getMediaRef() {
        return mediaRef;
    }

    public void setMediaRef(String mediaRef) {
        this.mediaRef = mediaRef;
    }

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public Long getSourceAssetId() {
        return sourceAssetId;
    }

    public void setSourceAssetId(Long sourceAssetId) {
        this.sourceAssetId = sourceAssetId;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public String getProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }

    public String getLifecycleStatus() {
        return lifecycleStatus;
    }

    public void setLifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
    }

    public String getVisibilityStatus() {
        return visibilityStatus;
    }

    public void setVisibilityStatus(String visibilityStatus) {
        this.visibilityStatus = visibilityStatus;
    }

    public Integer getContentVersion() {
        return contentVersion;
    }

    public void setContentVersion(Integer contentVersion) {
        this.contentVersion = contentVersion;
    }

    public Integer getAssociationVersion() {
        return associationVersion;
    }

    public void setAssociationVersion(Integer associationVersion) {
        this.associationVersion = associationVersion;
    }

    public String getDownloadMode() {
        return downloadMode;
    }

    public void setDownloadMode(String downloadMode) {
        this.downloadMode = downloadMode;
    }

    public Boolean getDeliveryRevoked() {
        return deliveryRevoked;
    }

    public void setDeliveryRevoked(Boolean deliveryRevoked) {
        this.deliveryRevoked = deliveryRevoked;
    }
}
