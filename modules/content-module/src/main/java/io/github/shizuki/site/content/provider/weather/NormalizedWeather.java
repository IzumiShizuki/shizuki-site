package io.github.shizuki.site.content.provider.weather;

import io.github.shizuki.site.content.provider.ProviderAttribution;
import java.time.Instant;
import java.util.List;

/** 不依赖具体上游 JSON 的站内天气事实。 */
public record NormalizedWeather(
    String providerCode,
    String locationLabel,
    double temperature,
    double apparentTemperature,
    int relativeHumidity,
    int weatherCode,
    double windSpeed,
    Instant observedAt,
    List<NormalizedWeatherDay> forecast,
    ProviderAttribution attribution
) {

    public NormalizedWeather {
        if (providerCode == null || providerCode.isBlank()
            || locationLabel == null || locationLabel.isBlank()
            || !Double.isFinite(temperature)
            || !Double.isFinite(apparentTemperature)
            || !Double.isFinite(windSpeed)
            || windSpeed < 0
            || relativeHumidity < 0
            || relativeHumidity > 100
            || observedAt == null
            || attribution == null) {
            throw new IllegalArgumentException("invalid normalized weather observation");
        }
        providerCode = providerCode.trim();
        locationLabel = locationLabel.trim();
        forecast = forecast == null ? List.of() : List.copyOf(forecast);
    }
}
