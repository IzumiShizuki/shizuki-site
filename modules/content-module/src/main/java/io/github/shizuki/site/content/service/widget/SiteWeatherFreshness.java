package io.github.shizuki.site.content.service.widget;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Locale;

/** Public freshness state; unavailable never carries fabricated weather values. */
public enum SiteWeatherFreshness {
    FRESH,
    STALE,
    UNAVAILABLE;

    @JsonValue
    public String code() {
        return name().toLowerCase(Locale.ROOT);
    }
}
