package io.github.shizuki.site.ai.dto;

public record AiTownMapNodeResponse(
    String sceneCode,
    String title,
    Integer coordX,
    Integer coordY,
    String tone
) {
}
