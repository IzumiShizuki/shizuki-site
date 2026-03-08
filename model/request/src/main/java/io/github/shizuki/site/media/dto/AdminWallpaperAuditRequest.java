package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "管理员审核壁纸请求")
public class AdminWallpaperAuditRequest {

    @NotBlank
    @Schema(description = "审核状态 PENDING_AUDIT/APPROVED/REJECTED", example = "APPROVED")
    private String auditStatus;

    @Schema(description = "可见性 PRIVATE/PUBLIC", example = "PUBLIC")
    private String visibility;

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
}
