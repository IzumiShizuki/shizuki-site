package io.github.shizuki.site.ai.response;

import java.util.List;

public record AiSessionMessagesResponse(
    String sessionId,
    String title,
    String mode,
    Long characterId,
    List<Long> worldbookIds,
    String scenePrompt,
    String townRoomCode,
    String actorCode,
    List<AiSessionMessageResponse> messages
) {
}
