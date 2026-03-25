package io.github.shizuki.site.ai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "更新世界书请求")
public class UpdateWorldbookRequest {

    @NotBlank
    @Size(max = 255)
    @Schema(description = "世界书标题", example = "图书馆设定集")
    private String title;

    @Size(max = 16)
    @Schema(description = "可见性类型", example = "PRIVATE")
    private String visibilityType;

    @Schema(description = "是否启用", example = "true")
    private Boolean enabled;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVisibilityType() {
        return visibilityType;
    }

    public void setVisibilityType(String visibilityType) {
        this.visibilityType = visibilityType;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
