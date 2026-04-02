package io.github.shizuki.site.ai.response;

import java.util.Map;

public record AiCharacterImportResponse(String status,
                                        String type,
                                        Long id,
                                        String displayName,
                                        String visibilityType,
                                        Map<String, Object> payload) {
}
