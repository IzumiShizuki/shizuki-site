package io.github.shizuki.site.content.dto;

import java.time.LocalDateTime;

public record LightAppTaskResponse(
    Long taskId,
    Long projectId,
    String columnCode,
    String title,
    String detail,
    LocalDateTime dueAt,
    int sortNum,
    LocalDateTime updatedAt
) {
}
