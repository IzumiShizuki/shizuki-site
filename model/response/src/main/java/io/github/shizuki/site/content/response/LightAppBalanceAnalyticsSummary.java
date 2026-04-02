package io.github.shizuki.site.content.response;

import java.math.BigDecimal;

public record LightAppBalanceAnalyticsSummary(
    BigDecimal incomeTotal,
    BigDecimal expenseTotal,
    BigDecimal netFlow,
    int incomeCount,
    int expenseCount,
    int txCount
) {
}

