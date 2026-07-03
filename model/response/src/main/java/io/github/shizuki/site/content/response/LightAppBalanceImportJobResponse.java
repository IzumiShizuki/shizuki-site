package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;

public record LightAppBalanceImportJobResponse(
    Long jobId,
    String provider,
    String providerLabel,
    String triggerType,
    String status,
    Long sourceAccountId,
    Long targetAccountId,
    int importedCount,
    int duplicateCount,
    int skippedCount,
    String rawFilePath,
    String errorText,
    LocalDateTime requestFromAt,
    LocalDateTime requestToAt,
    LocalDateTime startedAt,
    LocalDateTime finishedAt,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {
}
