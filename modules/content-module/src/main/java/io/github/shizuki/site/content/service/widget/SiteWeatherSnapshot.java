package io.github.shizuki.site.content.service.widget;

import io.github.shizuki.site.content.provider.ProviderAttribution;
import io.github.shizuki.site.content.provider.weather.NormalizedWeatherDay;
import java.time.Instant;
import java.util.List;

/** Stable site-weather projection used by public controllers and widget cards. */
public record SiteWeatherSnapshot(
    String locationLabel,
    Double temperature,
    Double apparentTemperature,
    Integer relativeHumidity,
    Integer weatherCode,
    Double windSpeed,
    List<NormalizedWeatherDay> forecast,
    Instant observedAt,
    Instant fetchedAt,
    SiteWeatherFreshness freshness,
    ProviderAttribution attribution
) {

    public SiteWeatherSnapshot {
        forecast = forecast == null ? List.of() : List.copyOf(forecast);
        if (freshness == null || attribution == null) {
            throw new IllegalArgumentException("freshness and weather attribution are required");
        }
        if (freshness == SiteWeatherFreshness.UNAVAILABLE) {
            temperature = null;
            apparentTemperature = null;
            relativeHumidity = null;
            weatherCode = null;
            windSpeed = null;
            forecast = List.of();
            observedAt = null;
            fetchedAt = null;
        }
    }
}
