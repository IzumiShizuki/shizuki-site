package io.github.shizuki.site.ai.response;

import java.time.LocalDateTime;

public record AiCharacterSummaryResponse(
    Long characterId,
    String characterType,
    String displayName,
    Long coverAssetId,
    String visibilityType,
    LocalDateTime createdAt
) {
}
