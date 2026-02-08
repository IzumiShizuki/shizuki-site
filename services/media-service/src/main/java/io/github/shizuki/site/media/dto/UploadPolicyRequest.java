package io.github.shizuki.site.media.dto;

import jakarta.validation.constraints.NotBlank;

public class UploadPolicyRequest {

    @NotBlank
    private String fileName;

    @NotBlank
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
