package io.github.shizuki.site.content.dto;

import java.util.List;

public record LightAppBalanceAnalyticsResponse(
    String baseCurrency,
    LightAppBalanceAnalyticsRange range,
    LightAppBalanceAnalyticsSummary summary,
    LightAppBalanceAssetSnapshot assetSnapshot,
    List<LightAppBalanceDailyTrendItem> dailyTrend,
    List<LightAppBalanceChannelBreakdownItem> channelBreakdown
) {
}

