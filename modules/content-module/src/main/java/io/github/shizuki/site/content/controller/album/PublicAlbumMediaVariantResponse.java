package io.github.shizuki.site.content.controller.album;

import io.github.shizuki.site.media.model.ImageVariantTypeEnum;

/** Site-owned media route. Capability is present only for private/no-store link-only content. */
public record PublicAlbumMediaVariantResponse(
    ImageVariantTypeEnum variant,
    String path,
    int width,
    int height,
    String format,
    String capability
) {
}
