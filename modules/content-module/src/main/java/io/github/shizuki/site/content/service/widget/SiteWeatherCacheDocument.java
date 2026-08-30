package io.github.shizuki.site.content.service.widget;

import io.github.shizuki.site.content.provider.weather.NormalizedWeather;
import java.time.Instant;

/** Internal Redis document; every value is derived from one committed database snapshot. */
record SiteWeatherCacheDocument(long locationId, NormalizedWeather weather, Instant fetchedAt) {

    SiteWeatherCacheDocument {
        if (locationId <= 0 || weather == null || fetchedAt == null) {
            throw new IllegalArgumentException("invalid site weather cache document");
        }
    }
}
