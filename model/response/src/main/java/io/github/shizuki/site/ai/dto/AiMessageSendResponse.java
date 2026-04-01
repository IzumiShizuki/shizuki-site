package io.github.shizuki.site.ai.dto;

import java.util.List;

public record AiMessageSendResponse(String sessionId,
                                    String userMessage,
                                    String assistantMessage,
                                    String mode,
                                    Integer contextSize,
                                    Boolean memoryEnabled,
                                    String scopeId,
                                    Boolean quotaApplied,
                                    Long characterId,
                                    List<Long> worldbookIds,
                                    String scenePrompt,
                                    String townRoomCode,
                                    String actorCode,
                                    String quotaCode,
                                    Long totalRounds,
                                    Long usedRounds,
                                    Long remainingRounds,
                                    List<String> memorySummaryHighlights,
                                    List<String> memoryJournalHighlights) {
}
