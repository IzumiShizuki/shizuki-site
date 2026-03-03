package io.github.shizuki.site.content.dto;

import java.time.LocalDateTime;
import java.util.List;

public record PostDetailResponse(
    Long postId,
    String title,
    String summary,
    String coverImageUrl,
    String categoryCode,
    String slugCode,
    String visibility,
    String statusCode,
    List<String> tags,
    Long wordCount,
    Long lineCount,
    Integer readingMinutes,
    Long likeCount,
    LocalDateTime publishedAt,
    String markdown
) {
}
