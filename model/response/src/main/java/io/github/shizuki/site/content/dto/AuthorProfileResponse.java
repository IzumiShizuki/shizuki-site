package io.github.shizuki.site.content.dto;

import java.time.LocalDateTime;
import java.util.Map;

public record AuthorProfileResponse(
    String authorCode,
    boolean enabled,
    Map<String, Object> profileJson,
    LocalDateTime updatedAt
) {
}
