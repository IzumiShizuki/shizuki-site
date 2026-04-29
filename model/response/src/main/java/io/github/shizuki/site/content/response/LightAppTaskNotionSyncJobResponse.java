package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;

public record LightAppTaskNotionSyncJobResponse(
    Long jobId,
    String triggerType,
    String direction,
    String targetType,
    Long taskId,
    String statusCode,
    int resultCount,
    int errorCount,
    int skippedCount,
    int conflictCount,
    String errorText,
    LocalDateTime startedAt,
    LocalDateTime finishedAt,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {
}
