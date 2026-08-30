package io.github.shizuki.site.content.controller.album;

import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AlbumCreateRequest(
    @NotBlank @Size(max = 256) String title,
    @Size(max = 8_000) String summary,
    LifeContentVisibilityEnum visibility
) {
}
