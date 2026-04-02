package io.github.shizuki.site.ai.response;

import java.util.List;

public record AiTownPublicMapResponse(
    List<AiTownMapNodeResponse> scenes
) {
}
