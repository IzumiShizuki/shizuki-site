package io.github.shizuki.site.ai.dto;

import java.util.List;

public record AiTownPublicMapResponse(
    List<AiTownMapNodeResponse> scenes
) {
}
