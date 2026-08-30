package io.github.shizuki.site.content.controller.photo;

import java.time.LocalDateTime;

/** Management-only photo metadata. Storage identities and original asset IDs never leave the API. */
public record AdminManagedPhotoResponse(
    long id,
    String title,
    String altText,
    LocalDateTime capturedAtDraft,
    String publishedLocationLabel,
    String processingStatus,
    LocalDateTime recycledAt,
    LocalDateTime purgeAfter,
    LocalDateTime createdAt,
    LocalDateTime updatedAt,
    int version,
    String etag
) {
}
