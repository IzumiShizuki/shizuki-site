package io.github.shizuki.site.ai.dto;

import java.util.List;

public record AiTownNpcResponse(
    String npcCode,
    String sceneCode,
    String displayName,
    String roleLabel,
    String intro,
    boolean adminOnly,
    boolean memoryEnabled,
    Long characterId,
    List<Long> worldbookIds
) {
}
