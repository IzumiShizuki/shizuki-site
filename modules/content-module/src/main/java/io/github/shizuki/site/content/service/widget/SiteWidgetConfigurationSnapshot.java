package io.github.shizuki.site.content.service.widget;

import java.math.BigDecimal;

/** Safe administrator-facing projection of the active singleton configuration. */
public record SiteWidgetConfigurationSnapshot(
    long version,
    Long activeLocationId,
    String displayName,
    BigDecimal latitude,
    BigDecimal longitude,
    String timezone,
    boolean weatherEnabled,
    int weatherMaxStaleMinutes,
    SiteWidgetQuoteSourceMode quoteSourceMode,
    boolean hitokotoEnabled
) {
}
