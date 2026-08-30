package io.github.shizuki.site.content.service.widget;

import java.math.BigDecimal;

/** Versioned administrator command for the singleton site-widget configuration. */
public record SiteWidgetConfigurationCommand(
    int expectedVersion,
    String displayName,
    BigDecimal latitude,
    BigDecimal longitude,
    String timezone,
    boolean weatherEnabled,
    int weatherMaxStaleMinutes,
    String quoteSourceMode,
    boolean hitokotoEnabled
) {
}
