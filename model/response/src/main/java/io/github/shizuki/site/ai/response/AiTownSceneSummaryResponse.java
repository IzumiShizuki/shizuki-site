package io.github.shizuki.site.ai.response;

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
