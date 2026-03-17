package io.github.shizuki.site.content.dto;

import java.time.LocalDateTime;

public record LightAppTodoResponse(
    Long todoId,
    Long projectId,
    String title,
    String detail,
    String priority,
    boolean done,
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
