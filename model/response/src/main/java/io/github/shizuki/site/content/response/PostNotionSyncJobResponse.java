package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;

public record PostNotionSyncJobResponse(
    Long jobId,
    String triggerType,
    String directionCode,
    String targetTypeCode,
    Long postId,
    Long ownerUserId,
    String statusCode,
    Integer resultCount,
    Integer errorCount,
    Integer skippedCount,
    Integer conflictCount,
    String errorText,
    LocalDateTime startedAt,
    LocalDateTime finishedAt,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {
}
