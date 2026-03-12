package io.github.shizuki.site.content.dto;

import java.math.BigDecimal;

public record LightAppBalanceDailyTrendItem(
    String day,
    BigDecimal incomeTotal,
    BigDecimal expenseTotal,
    BigDecimal netFlow
) {
}

