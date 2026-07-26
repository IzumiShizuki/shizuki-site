package io.github.shizuki.site.media.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "创建 Wallhaven 导入任务请求")
public class WallhavenImportCreateRequest {

    @NotBlank
    @Schema(description = "Wallhaven 壁纸 ID", example = "x8gxgz")
    private String wallhavenId;

    @Schema(description = "导入后可见性，默认 PRIVATE", example = "PRIVATE")
    private String visibility;

    @Schema(description = "可选标题覆盖")
    private String title;

    public String getWallhavenId() {
        return wallhavenId;
    }

    public void setWallhavenId(String wallhavenId) {
        this.wallhavenId = wallhavenId;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
