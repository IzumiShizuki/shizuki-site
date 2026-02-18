package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 管理员更新 Provider 显隐请求。
 */
@Schema(description = "管理员更新 Provider 显隐请求")
public class AdminMusicProviderVisibilityUpdateRequest {

    @Schema(description = "是否启用")
    private Boolean enabled;

    @Schema(description = "是否可见")
    private Boolean visible;

    @Schema(description = "排序值")
    private Integer sort;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
