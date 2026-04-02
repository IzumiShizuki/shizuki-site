package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;
import java.util.List;

public record AuthorPostItemResponse(
    Long postId,
    String title,
    String summary,
    String categoryCode,
    String slugCode,
    String coverImageUrl,
    String visibility,
    String statusCode,
    List<String> tags,
    Long wordCount,
    Long lineCount,
    Integer readingMinutes,
    Long likeCount,
    LocalDateTime publishedAt,
    LocalDateTime updatedAt
) {
}
