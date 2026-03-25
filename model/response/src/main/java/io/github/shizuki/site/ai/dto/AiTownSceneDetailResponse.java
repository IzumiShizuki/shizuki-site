package io.github.shizuki.site.ai.dto;

import java.util.List;

public record AiTownSceneDetailResponse(
    String sceneCode,
    String title,
    String sceneType,
    String description,
    String atmosphereHint,
    boolean publicVisible,
    List<String> highlights,
    List<AiTownNpcResponse> npcs
) {
}
