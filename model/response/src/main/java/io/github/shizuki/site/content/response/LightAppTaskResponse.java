package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;

public record LightAppTaskResponse(
    Long taskId,
    Long projectId,
    String columnCode,
    String title,
    String detail,
    LocalDateTime dueAt,
    boolean showOnCalendar,
    String timePrecision,
    String timingMode,
    LocalDateTime rangeStartAt,
    boolean reminderEnabled,
    Integer startRemindValue,
    String startRemindUnit,
    Integer deadlineRemindValue,
    String deadlineRemindUnit,
    int sortNum,
    LocalDateTime updatedAt
) {
}
