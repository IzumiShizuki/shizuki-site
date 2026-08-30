package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;
import java.util.List;

/** Dedicated studio response. It is never served by a public moment endpoint or shared cache. */
public record AdminMomentDetailResponse(
    long id,
    String publicId,
    String body,
    String lifecycle,
    String visibility,
    boolean featured,
    boolean pinned,
    LocalDateTime publishedAt,
    LocalDateTime recycledAt,
    LocalDateTime purgeAfter,
    int version,
    String etag,
    List<AdminMomentPhotoStatusResponse> photos
) {
    public AdminMomentDetailResponse {
        photos = photos == null ? List.of() : List.copyOf(photos);
    }
}
