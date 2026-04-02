package io.github.shizuki.site.ai.response;

import java.time.LocalDateTime;

public record AiWorldbookSummaryResponse(
    Long worldbookId,
    String worldbookCode,
    String title,
    String visibilityType,
    Boolean enabled,
    Integer entryCount,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {
}
