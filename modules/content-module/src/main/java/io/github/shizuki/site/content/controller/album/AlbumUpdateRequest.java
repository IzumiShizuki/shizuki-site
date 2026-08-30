package io.github.shizuki.site.content.controller.album;

import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AlbumUpdateRequest(
    @NotBlank @Size(max = 256) String title,
    @Size(max = 8_000) String summary,
    @NotNull LifeContentVisibilityEnum visibility,
    boolean featured,
    int sortNum
) {
}
