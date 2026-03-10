package io.github.shizuki.site.content.dto;

import java.time.LocalDateTime;

public record LightAppTodoRecurringRuleResponse(
    Long ruleId,
    Long projectId,
    String title,
    String detail,
    String priority,
    String cronExpr,
    String timeZoneId,
    LocalDateTime startAt,
    LocalDateTime endAt,
    boolean enabled,
    int sortNum,
    LocalDateTime updatedAt
) {
}
