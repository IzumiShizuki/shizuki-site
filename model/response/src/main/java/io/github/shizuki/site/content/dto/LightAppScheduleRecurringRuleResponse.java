package io.github.shizuki.site.content.dto;

import java.time.LocalDateTime;

public record LightAppScheduleRecurringRuleResponse(
    Long ruleId,
    Long projectId,
    String title,
    String detail,
    int durationMinutes,
    boolean allDay,
    String location,
    String status,
    String cronExpr,
    String timeZoneId,
    LocalDateTime startAt,
    LocalDateTime endAt,
    boolean enabled,
    int sortNum,
    LocalDateTime updatedAt
) {
}
