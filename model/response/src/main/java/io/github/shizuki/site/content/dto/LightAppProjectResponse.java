package io.github.shizuki.site.content.dto;

import java.time.LocalDateTime;

public record LightAppProjectResponse(
    Long projectId,
    String projectCode,
    String name,
    String description,
    String color,
    boolean archived,
    int sortNum,
    LocalDateTime updatedAt
) {
}
