package io.github.shizuki.site.content.mapper.admin;

public class AlbumAdminVariantReadRow {
    private Long photoId;
    private String variantCode;
    private String processStatus;
    private Integer width;
    private Integer height;
    private Integer retryCount;
    private Integer version;

    public Long getPhotoId() { return photoId; }
    public void setPhotoId(Long photoId) { this.photoId = photoId; }
    public String getVariantCode() { return variantCode; }
    public void setVariantCode(String variantCode) { this.variantCode = variantCode; }
    public String getProcessStatus() { return processStatus; }
    public void setProcessStatus(String processStatus) { this.processStatus = processStatus; }
    public Integer getWidth() { return width; }
    public void setWidth(Integer width) { this.width = width; }
    public Integer getHeight() { return height; }
    public void setHeight(Integer height) { this.height = height; }
    public Integer getRetryCount() { return retryCount; }
    public void setRetryCount(Integer retryCount) { this.retryCount = retryCount; }
    public Integer getVersion() { return version; }
    public void setVersion(Integer version) { this.version = version; }
}
