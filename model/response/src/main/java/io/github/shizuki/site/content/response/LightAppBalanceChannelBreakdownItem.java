package io.github.shizuki.site.content.response;

import java.math.BigDecimal;

public record LightAppBalanceChannelBreakdownItem(
    String channelCode,
    String channelName,
    BigDecimal incomeTotal,
    BigDecimal expenseTotal,
    int txCount
) {
}

