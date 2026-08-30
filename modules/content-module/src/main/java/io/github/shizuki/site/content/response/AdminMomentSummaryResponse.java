package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;

public record AdminMomentSummaryResponse(
    long id,
    String excerpt,
    String lifecycle,
    String visibility,
    boolean featured,
    boolean pinned,
    int photoCount,
    int version,
    String etag,
    LocalDateTime updatedAt
) {
}
