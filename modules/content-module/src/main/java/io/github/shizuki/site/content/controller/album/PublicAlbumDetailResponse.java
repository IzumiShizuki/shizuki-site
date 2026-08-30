package io.github.shizuki.site.content.controller.album;

import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import java.time.Instant;
import java.util.List;

/** Public or non-enumerable link-only Album detail. */
public record PublicAlbumDetailResponse(
    String publicSlug,
    String title,
    String summary,
    LifeContentVisibilityEnum visibility,
    Instant publishedAt,
    boolean noIndex,
    boolean searchEligible,
    boolean feedEligible,
    boolean sitemapEligible,
    List<PublicAlbumPhotoResponse> photos
) {

    public PublicAlbumDetailResponse {
        photos = photos == null ? List.of() : List.copyOf(photos);
    }
}
