package io.github.shizuki.site.content.dto;

import java.time.LocalDateTime;

public record LightAppBalanceAnalyticsRange(
    LocalDateTime fromDatetime,
    LocalDateTime toDatetime,
    String timeZone
) {
}

