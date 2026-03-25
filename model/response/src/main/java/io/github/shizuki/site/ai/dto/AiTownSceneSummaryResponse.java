package io.github.shizuki.site.ai.dto;

public record AiTownSceneSummaryResponse(
    String sceneCode,
    String title,
    String sceneType,
    String description,
    String atmosphereHint,
    Integer npcCount,
    boolean publicVisible
) {
}
