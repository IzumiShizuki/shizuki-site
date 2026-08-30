package io.github.shizuki.site.content.controller.album;

import java.util.List;

/** Association-scoped media presentation without an asset ID or storage location. */
public record PublicAlbumMediaResponse(
    String mediaRef,
    String altText,
    List<PublicAlbumMediaVariantResponse> variants
) {

    public PublicAlbumMediaResponse {
        variants = variants == null ? List.of() : List.copyOf(variants);
    }
}
