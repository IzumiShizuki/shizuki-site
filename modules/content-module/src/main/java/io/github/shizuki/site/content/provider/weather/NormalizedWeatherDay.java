package io.github.shizuki.site.content.provider.weather;

import java.time.LocalDate;

/** 归一化的轻量日预报。 */
public record NormalizedWeatherDay(
    LocalDate date,
    double minimumTemperature,
    double maximumTemperature,
    int weatherCode,
    int precipitationProbability
) {

    public NormalizedWeatherDay {
        if (date == null
            || !Double.isFinite(minimumTemperature)
            || !Double.isFinite(maximumTemperature)
            || minimumTemperature > maximumTemperature
            || precipitationProbability < 0
            || precipitationProbability > 100) {
            throw new IllegalArgumentException("invalid normalized daily weather values");
        }
    }
}
