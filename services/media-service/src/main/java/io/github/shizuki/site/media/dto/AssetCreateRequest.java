package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "创建资源记录请求")
public class AssetCreateRequest {

    @NotBlank
    @Schema(description = "Bucket 名称", example = "shizuki-private")
    private String bucket;

    @NotBlank
    @Schema(description = "对象 Key", example = "user/1/avatar/xxx.png")
    private String key;

    @NotBlank
    @Schema(description = "资源类型", example = "image")
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
