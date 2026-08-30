package io.github.shizuki.site.content.cache;

import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import java.util.Objects;

/** A direct-link presentation paired with the visibility that decides cache eligibility. */
public record PublicContentDetail<T>(LifeContentVisibilityEnum visibility, T value) {

    public PublicContentDetail {
        Objects.requireNonNull(visibility, "visibility");
        Objects.requireNonNull(value, "value");
    }

    public static <T> PublicContentDetail<T> of(LifeContentVisibilityEnum visibility, T value) {
        return new PublicContentDetail<>(visibility, value);
    }
}
