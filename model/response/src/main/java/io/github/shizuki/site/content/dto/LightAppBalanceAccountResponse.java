package io.github.shizuki.site.content.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record LightAppBalanceAccountResponse(
    Long accountId,
    String channelCode,
    String channelName,
    String accountName,
    String currencyCode,
    BigDecimal balanceAmount,
    int sortNum,
    LocalDateTime updatedAt
) {
}
