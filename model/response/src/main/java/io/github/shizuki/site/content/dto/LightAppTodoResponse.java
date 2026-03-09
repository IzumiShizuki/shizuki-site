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
    int sortNum,
    LocalDateTime updatedAt
) {
}
