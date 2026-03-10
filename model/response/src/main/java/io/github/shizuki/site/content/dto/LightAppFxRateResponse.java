package io.github.shizuki.site.content.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record LightAppFxRateResponse(
    String baseCurrency,
    String quoteCurrency,
    BigDecimal rate,
    String provider,
    LocalDateTime updatedAt
) {
}
