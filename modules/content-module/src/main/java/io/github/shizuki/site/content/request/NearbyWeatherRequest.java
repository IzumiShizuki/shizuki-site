package io.github.shizuki.site.content.request;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

/** Coordinates sent only after the visitor explicitly grants browser geolocation consent. */
public record NearbyWeatherRequest(
    @NotNull BigDecimal latitude,
    @NotNull BigDecimal longitude,
    @AssertTrue(message = "explicit geolocation consent is required") boolean consent
) {
}
