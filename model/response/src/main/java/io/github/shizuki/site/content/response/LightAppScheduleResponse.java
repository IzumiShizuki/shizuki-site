package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;

public record LightAppScheduleResponse(
    Long scheduleId,
    Long projectId,
    String title,
    String detail,
    LocalDateTime startAt,
    LocalDateTime endAt,
    boolean allDay,
    String location,
    String status,
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
