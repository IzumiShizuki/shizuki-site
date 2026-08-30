package io.github.shizuki.site.content.request;

import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AdminMomentCreateRequest(
    @NotBlank @Size(max = 20_000) String body,
    LifeContentVisibilityEnum visibility
) {
}
