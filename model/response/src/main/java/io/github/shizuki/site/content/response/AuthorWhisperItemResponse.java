package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;

public record AuthorWhisperItemResponse(
    Long whisperId,
    String status,
    Long postId,
    String postTitle,
    String content,
    String nickname,
    String remark,
    LocalDateTime createdAt
) {
}
