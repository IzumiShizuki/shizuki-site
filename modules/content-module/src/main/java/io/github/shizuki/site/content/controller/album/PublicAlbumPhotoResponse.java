package io.github.shizuki.site.content.controller.album;

/** Visitor photo metadata. Location can only be the explicitly reviewed display label. */
public record PublicAlbumPhotoResponse(
    String title,
    String altText,
    String caption,
    String locationLabel,
    PublicAlbumMediaResponse media
) {
}
