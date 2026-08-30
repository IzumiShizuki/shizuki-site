package io.github.shizuki.site.content.mapper;

/**
 * A publication blocker projected from the content/media tables without exposing storage identity.
 */
public class AlbumPublicationMediaRow {

    private Long photoId;
    private String variantCode;
    private String photoStatus;
    private String derivativeStatus;
    private String assetAuditStatus;

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public String getVariantCode() {
        return variantCode;
    }

    public void setVariantCode(String variantCode) {
        this.variantCode = variantCode;
    }

    public String getPhotoStatus() {
        return photoStatus;
    }

    public void setPhotoStatus(String photoStatus) {
        this.photoStatus = photoStatus;
    }

    public String getDerivativeStatus() {
        return derivativeStatus;
    }

    public void setDerivativeStatus(String derivativeStatus) {
        this.derivativeStatus = derivativeStatus;
    }

    public String getAssetAuditStatus() {
        return assetAuditStatus;
    }

    public void setAssetAuditStatus(String assetAuditStatus) {
        this.assetAuditStatus = assetAuditStatus;
    }
}
