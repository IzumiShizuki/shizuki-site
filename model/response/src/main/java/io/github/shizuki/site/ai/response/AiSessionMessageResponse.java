package io.github.shizuki.site.ai.response;

import java.time.LocalDateTime;

public record AiSessionMessageResponse(
    Long messageId,
    String role,
    String content,
    LocalDateTime createdAt
) {
}
