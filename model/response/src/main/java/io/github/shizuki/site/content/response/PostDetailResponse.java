package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public record PostDetailResponse(
    Long postId,
    String title,
    String summary,
    String coverImageUrl,
    String categoryCode,
    String slugCode,
    String visibility,
    Set<String> allowedGroupCodes,
    String statusCode,
    List<String> tags,
    Long wordCount,
    Long lineCount,
    Integer readingMinutes,
    Long likeCount,
    LocalDateTime publishedAt,
    boolean editable,
    String markdown
) {
}
