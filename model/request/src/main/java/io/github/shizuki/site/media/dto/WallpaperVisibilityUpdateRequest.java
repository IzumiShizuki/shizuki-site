package io.github.shizuki.site.media.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "壁纸可见性更新请求")
public class WallpaperVisibilityUpdateRequest {

    @NotBlank
    @Schema(description = "可见性 PRIVATE/PUBLIC", example = "PUBLIC")
    private String visibility;

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
}
