package io.github.shizuki.site.ai.response;

import java.time.LocalDateTime;
import java.util.List;

public record AiWorldbookEntryResponse(
    Long entryId,
    List<String> keywords,
    String content,
    Integer priorityNum,
    Boolean enabled,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {
}
