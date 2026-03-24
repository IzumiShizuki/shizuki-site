package io.github.shizuki.site.ai.dto;

import java.util.List;

public record AiSessionSummary(
    String sessionId,
    String title,
    String mode,
    Long characterId,
    List<Long> worldbookIds,
    String scenePrompt,
    String townRoomCode,
    String actorCode
) {
}
