package io.github.shizuki.site.content.response;

import java.time.Instant;
import java.util.List;

/** Full feed body supports accessible in-place expansion without a second navigation. */
public record PublicMomentResponse(
    String publicId,
    String body,
    boolean featured,
    boolean pinned,
    Instant publishedAt,
    List<PublicMomentPhotoResponse> photos
) {
    public PublicMomentResponse {
        photos = photos == null ? List.of() : List.copyOf(photos);
    }
}
