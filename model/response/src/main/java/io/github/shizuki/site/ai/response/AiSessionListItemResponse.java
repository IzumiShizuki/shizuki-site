package io.github.shizuki.site.ai.response;

import java.util.List;

/**
 * 会话列表项（带 updatedAt 时间戳），供会话侧栏按最近程度分组。
 * 不复用一期冻结的 {@link AiSessionSummary}，避免改动其构造契约。
 * {@code updatedAtEpochMs} 为毫秒时间戳，前端可直接用于分组，无需解析时区。
 */
public record AiSessionListItemResponse(
    String sessionId,
    String title,
    String mode,
    Long characterId,
    List<Long> worldbookIds,
    String scenePrompt,
    String townRoomCode,
    String actorCode,
    Long updatedAtEpochMs
) {
}
