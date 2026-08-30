package io.github.shizuki.site.media.mapper.admin;

public class AdminMediaDerivativeRetryRow {
    private Long variantId;
    private Long photoId;
    private String mediaRef;
    private String variantCode;
    private String processStatus;
    private Integer version;

    public Long getVariantId() { return variantId; }
    public void setVariantId(Long variantId) { this.variantId = variantId; }
    public Long getPhotoId() { return photoId; }
    public void setPhotoId(Long photoId) { this.photoId = photoId; }
    public String getMediaRef() { return mediaRef; }
    public void setMediaRef(String mediaRef) { this.mediaRef = mediaRef; }
    public String getVariantCode() { return variantCode; }
    public void setVariantCode(String variantCode) { this.variantCode = variantCode; }
    public String getProcessStatus() { return processStatus; }
    public void setProcessStatus(String processStatus) { this.processStatus = processStatus; }
    public Integer getVersion() { return version; }
    public void setVersion(Integer version) { this.version = version; }
}
