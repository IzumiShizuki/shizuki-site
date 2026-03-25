package io.github.shizuki.site.content.dto;

import java.time.LocalDateTime;

public record PostPresentationResponse(
    Long postId,
    String status,
    Integer slideCount,
    LocalDateTime generatedAt,
    String templateVersion,
    String slidevMarkdown,
    boolean pptReady,
    String errorText
) {
}
