package io.github.shizuki.site.content.response;

import java.math.BigDecimal;

public record LightAppBalanceAssetSnapshot(
    BigDecimal totalBalance,
    BigDecimal totalDebt,
    BigDecimal netAsset
) {
}

