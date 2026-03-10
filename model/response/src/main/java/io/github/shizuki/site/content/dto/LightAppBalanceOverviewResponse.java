package io.github.shizuki.site.content.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record LightAppBalanceOverviewResponse(
    String baseCurrency,
    BigDecimal totalBalance,
    BigDecimal totalDebt,
    BigDecimal netAsset,
    LocalDateTime calculatedAt
) {
}
