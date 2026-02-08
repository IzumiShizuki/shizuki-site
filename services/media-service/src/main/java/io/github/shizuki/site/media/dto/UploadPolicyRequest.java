package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "上传策略生成请求")
public class UploadPolicyRequest {

    @NotBlank
    @Schema(description = "原始文件名", example = "avatar.png")
    private String fileName;

    @NotBlank
    @Schema(description = "文件 Content-Type", example = "image/png")
    private String contentType;

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
}
