package io.github.shizuki.site.media.dto;

import jakarta.validation.constraints.NotBlank;

public class AssetCreateRequest {

    @NotBlank
    private String bucket;

    @NotBlank
    private String key;

    @NotBlank
    private String assetType;

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }
}
