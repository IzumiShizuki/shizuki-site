package io.github.shizuki.site.content.provider.weather;

import java.math.BigDecimal;
import java.time.ZoneId;

/** 管理员站点地点或已匿名归一化的明确同意坐标。 */
public record WeatherProviderRequest(
    BigDecimal latitude,
    BigDecimal longitude,
    ZoneId timezone,
    String locationLabel
) {

    public WeatherProviderRequest {
        if (latitude == null || latitude.compareTo(BigDecimal.valueOf(-90)) < 0
            || latitude.compareTo(BigDecimal.valueOf(90)) > 0) {
            throw new IllegalArgumentException("latitude is outside the geographic range");
        }
        if (longitude == null || longitude.compareTo(BigDecimal.valueOf(-180)) < 0
            || longitude.compareTo(BigDecimal.valueOf(180)) > 0) {
            throw new IllegalArgumentException("longitude is outside the geographic range");
        }
        if (timezone == null || locationLabel == null || locationLabel.isBlank() || locationLabel.length() > 128) {
            throw new IllegalArgumentException("timezone and bounded locationLabel are required");
        }
        locationLabel = locationLabel.trim();
    }
}
