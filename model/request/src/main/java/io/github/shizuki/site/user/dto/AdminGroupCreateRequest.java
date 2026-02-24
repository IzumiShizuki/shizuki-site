package io.github.shizuki.site.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "管理员创建分组请求")
public class AdminGroupCreateRequest {

    @NotBlank
    @Size(max = 64)
    @Schema(description = "分组展示名", example = "内容运营")
    private String displayName;

    @Size(max = 255)
    @Schema(description = "分组描述", example = "用于内容审核与运营协作")
    private String description;

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
}
