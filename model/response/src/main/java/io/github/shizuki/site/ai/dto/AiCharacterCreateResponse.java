package io.github.shizuki.site.ai.dto;

import java.util.Map;

public record AiCharacterCreateResponse(String status,
                                        String type,
                                        Long id,
                                        String displayName,
                                        String visibilityType,
                                        Map<String, Object> payload) {
}
