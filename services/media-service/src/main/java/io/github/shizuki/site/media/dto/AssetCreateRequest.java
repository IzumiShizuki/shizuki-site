package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import java.util.Map;
import java.util.Set;

@Schema(description = "创建资源记录请求")
public class AssetCreateRequest {

    /**
     * 上传目标 bucket。
     */
    @NotBlank
    @Schema(description = "Bucket 名称", example = "shizuki-private")
    private String bucket;

    /**
     * 上传完成后的对象 key。
     */
    @NotBlank
    @Schema(description = "对象 Key", example = "user/1/avatar/xxx.png")
    private String key;

    /**
     * 历史兼容字段，短期仍保留并写入（建议传 enum 字符串）。
     */
    @Deprecated
    @Schema(description = "资源类型", example = "image")
    private String assetType;

    /**
     * 资源类别枚举字符串，驱动服务端校验流程。
     */
    @NotBlank
    @Schema(description = "资源类别", example = "STATIC_IMAGE")
    private String assetKind;

    /**
     * 文件 MIME 类型。
     */
    @NotBlank
    @Schema(description = "文件 Content-Type", example = "image/png")
    private String contentType;

    /**
     * 资源可见性。
     */
    @NotBlank
    @Schema(description = "可见性", example = "PRIVATE")
    private String visibility;

    /**
     * 业务扩展元数据，服务端序列化后写入 metadata_json。
     */
    @Schema(description = "扩展元数据（可选）")
    private Map<String, Object> metadata;

    /**
     * 当 visibility=GROUP 时生效的授权分组编码集合。
     */
    @Schema(description = "分组可见授权列表（visibility=GROUP 时必填）", example = "[\"FAMILY\", \"FRIEND\"]")
    private Set<String> allowedGroupCodes;

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

    public String getAssetKind() {
        return assetKind;
    }

    public void setAssetKind(String assetKind) {
        this.assetKind = assetKind;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public Set<String> getAllowedGroupCodes() {
        return allowedGroupCodes;
    }

    public void setAllowedGroupCodes(Set<String> allowedGroupCodes) {
        this.allowedGroupCodes = allowedGroupCodes;
    }
}
