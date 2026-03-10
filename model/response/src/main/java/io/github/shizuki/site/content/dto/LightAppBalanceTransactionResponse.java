package io.github.shizuki.site.content.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record LightAppBalanceTransactionResponse(
    Long transactionId,
    Long accountId,
    String direction,
    BigDecimal amount,
    String currencyCode,
    String category,
    String note,
    LocalDateTime occurredAt,
    int sortNum,
    LocalDateTime updatedAt
) {
}
