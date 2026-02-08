package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Schema(description = "内容举报请求")
public class ReportRequest {

    @NotBlank
    @Schema(description = "目标类型", example = "POST")
    private String targetType;

    @NotNull
    @Schema(description = "目标 ID", example = "1")
    private Long targetId;

    @NotBlank
    @Schema(description = "举报原因", example = "包含违规内容")
    private String reason;

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
