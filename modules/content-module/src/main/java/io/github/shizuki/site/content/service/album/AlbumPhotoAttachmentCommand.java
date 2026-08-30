package io.github.shizuki.site.content.service.album;

import io.github.shizuki.site.life.model.PhotoDownloadModeEnum;

/** One managed photo to attach to an album without duplicating its original asset. */
public record AlbumPhotoAttachmentCommand(
    long photoId,
    String caption,
    PhotoDownloadModeEnum downloadMode
) {
}
