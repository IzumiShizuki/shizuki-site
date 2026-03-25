package io.github.shizuki.site.ai.dto;

import java.time.LocalDateTime;
import java.util.List;

public record AiWorldbookDetailResponse(
    Long worldbookId,
    String worldbookCode,
    String title,
    String visibilityType,
    Boolean enabled,
    List<AiWorldbookEntryResponse> entries,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {
}
