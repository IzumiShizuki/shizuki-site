package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;
import java.util.List;

public record PostSummary(
    Long postId,
    String title,
    String summary,
    String coverImageUrl,
    String visibility,
    String categoryCode,
    List<String> tags,
    Long wordCount,
    Integer readingMinutes,
    Long likeCount,
    LocalDateTime publishedAt
) {
}
