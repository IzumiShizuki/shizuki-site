package io.github.shizuki.site.content.dto;

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
    int sortNum,
    LocalDateTime updatedAt
) {
}
