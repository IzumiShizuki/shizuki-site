package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "上传策略生成请求")
public class UploadPolicyRequest {

    /**
     * 客户端原始文件名，仅用于扩展名提取与审计记录。
     */
    @NotBlank
    @Schema(description = "原始文件名", example = "avatar.png")
    private String fileName;

    /**
     * 客户端声明的 MIME 类型。
     */
    @NotBlank
    @Schema(description = "文件 Content-Type", example = "image/png")
    private String contentType;

    /**
     * 资源类别枚举字符串（STATIC_IMAGE/ANIMATED_IMAGE/LIVE2D_PACKAGE）。
     */
    @NotBlank
    @Schema(description = "资源类型", example = "STATIC_IMAGE")
    private String assetKind;

    /**
     * 可见性枚举字符串（PRIVATE/PUBLIC），为空时由服务端使用默认值。
     */
    @Schema(description = "可见性，默认 PRIVATE", example = "PRIVATE")
    private String visibility;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getAssetKind() {
        return assetKind;
    }

    public void setAssetKind(String assetKind) {
        this.assetKind = assetKind;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
}
