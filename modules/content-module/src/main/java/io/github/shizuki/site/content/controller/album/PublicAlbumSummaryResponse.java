package io.github.shizuki.site.content.controller.album;

import java.time.Instant;

/** Discoverable Album card. Its public slug is the only content identity exposed. */
public record PublicAlbumSummaryResponse(
    String publicSlug,
    String title,
    String summary,
    Instant publishedAt,
    int photoCount,
    PublicAlbumMediaResponse cover
) {
}
