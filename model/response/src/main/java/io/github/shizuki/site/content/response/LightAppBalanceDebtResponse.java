package io.github.shizuki.site.content.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record LightAppBalanceDebtResponse(
    Long debtId,
    String title,
    String creditor,
    BigDecimal amount,
    String currencyCode,
    LocalDateTime occurredAt,
    LocalDateTime dueAt,
    String status,
    String note,
    int sortNum,
    LocalDateTime updatedAt
) {
}
