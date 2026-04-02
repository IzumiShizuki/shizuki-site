package io.github.shizuki.site.ai.response;

public record AiTownMapNodeResponse(
    String sceneCode,
    String title,
    Integer coordX,
    Integer coordY,
    String tone
) {
}
