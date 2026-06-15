package io.github.shizuki.site.content.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "悄悄话公开状态更新请求")
public class AuthorWhisperStatusUpdateRequest {

    @NotBlank
    @Size(max = 16)
    @Schema(description = "目标状态，仅支持 PUBLISHED 或 HIDDEN", example = "PUBLISHED")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
