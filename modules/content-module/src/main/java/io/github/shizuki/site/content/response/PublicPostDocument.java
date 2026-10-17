package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;

/** Deliberately contains no author administration, group ACL, storage or Notion identifiers. */
public record PublicPostDocument(Long postId, String title, String summary, String coverImageUrl,
                                 String categoryCode, LocalDateTime publishedAt, String markdown) {
}
