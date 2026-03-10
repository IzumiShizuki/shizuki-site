package io.github.shizuki.site.content.dto;

import java.time.LocalDateTime;

public record LightAppTaskRecurringRuleResponse(
    Long ruleId,
    Long projectId,
    String columnCode,
    String title,
    String detail,
    String cronExpr,
    String timeZoneId,
    LocalDateTime startAt,
    LocalDateTime endAt,
    boolean enabled,
    int sortNum,
    LocalDateTime updatedAt
) {
}
