package io.github.shizuki.site.content.dto;

import java.math.BigDecimal;

public record LightAppBalanceCategoryBreakdownItem(
    String categoryName,
    BigDecimal amountTotal,
    BigDecimal ratioPercent,
    int txCount
) {
}
