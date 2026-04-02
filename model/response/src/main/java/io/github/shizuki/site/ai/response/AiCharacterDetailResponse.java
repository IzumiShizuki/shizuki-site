package io.github.shizuki.site.ai.response;

import java.time.LocalDateTime;
import java.util.Map;

public record AiCharacterDetailResponse(
    Long characterId,
    String characterType,
    String displayName,
    Long coverAssetId,
    String visibilityType,
    Map<String, Object> payload,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {
}
