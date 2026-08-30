package io.github.shizuki.site.media.response;

import java.time.LocalDateTime;

public record PhotoRecycleResponse(
    long photoId,
    int version,
    String etag,
    LocalDateTime recycledAt,
    LocalDateTime purgeAfter
) {
}
