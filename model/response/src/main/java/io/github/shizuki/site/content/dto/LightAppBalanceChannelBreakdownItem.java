package io.github.shizuki.site.content.dto;

import java.math.BigDecimal;

public record LightAppBalanceChannelBreakdownItem(
    String channelCode,
    String channelName,
    BigDecimal incomeTotal,
    BigDecimal expenseTotal,
    int txCount
) {
}

