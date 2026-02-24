package io.github.shizuki.site.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;

@Schema(description = "管理员更新分组请求")
public class AdminGroupUpdateRequest {

    @Size(max = 64)
    @Schema(description = "分组展示名", example = "内容运营")
    private String displayName;

    @Size(max = 255)
    @Schema(description = "分组描述", example = "用于内容审核与运营协作")
    private String description;

    @Size(max = 16)
    @Schema(description = "分组状态 ACTIVE/DISABLED", example = "ACTIVE")
    private String status;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
