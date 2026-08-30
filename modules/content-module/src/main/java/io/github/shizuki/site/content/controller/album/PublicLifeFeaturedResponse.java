package io.github.shizuki.site.content.controller.album;

import java.util.List;

/**
 * Additive life-content preview envelope. Moments can be added by the moment public API without
 * changing the Album field or its eligibility contract.
 */
public record PublicLifeFeaturedResponse(List<PublicAlbumSummaryResponse> albums) {

    public PublicLifeFeaturedResponse {
        albums = albums == null ? List.of() : List.copyOf(albums);
    }
}
