package io.github.shizuki.site.ai.response;

import java.time.LocalDateTime;
import java.util.List;

public record AiCompanionConfigResponse(
    Long companionProfileId,
    String companionCode,
    String displayName,
    String personaPrompt,
    Long avatarAssetId,
    Boolean memoryEnabled,
    List<Long> worldbookIds,
    String scenePrompt,
    LocalDateTime updatedAt
) {
}
