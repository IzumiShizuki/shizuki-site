package io.github.shizuki.site.ai.dto;

import java.time.LocalDateTime;
import java.util.List;

public record AiMemoryScopeResponse(
    Long memoryScopeId,
    String scopeId,
    Long ownerUserId,
    String domainType,
    String actorCode,
    String sceneCode,
    Boolean enabled,
    String note,
    String lastQuery,
    String profileSummary,
    List<String> summaryHighlights,
    List<String> episodicHighlights,
    List<String> journalHighlights,
    LocalDateTime lastAccessedAt,
    LocalDateTime updatedAt
) {
}
