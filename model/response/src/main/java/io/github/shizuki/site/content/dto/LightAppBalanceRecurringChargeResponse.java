package io.github.shizuki.site.content.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record LightAppBalanceRecurringChargeResponse(
    Long recurringChargeId,
    Long accountId,
    String title,
    BigDecimal amount,
    String currencyCode,
    String category,
    String note,
    String cronExpr,
    String timeZoneId,
    LocalDateTime startAt,
    LocalDateTime endAt,
    LocalDateTime lastTriggerAt,
    boolean enabled,
    int sortNum,
    LocalDateTime updatedAt
) {
}
