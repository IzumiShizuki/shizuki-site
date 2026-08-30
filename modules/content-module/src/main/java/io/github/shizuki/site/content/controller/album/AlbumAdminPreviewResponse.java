package io.github.shizuki.site.content.controller.album;

import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import io.github.shizuki.site.life.model.PhotoDownloadModeEnum;
import java.util.List;

/** Dedicated protected preview; media routes remain inside the admin namespace. */
public record AlbumAdminPreviewResponse(
    String title,
    String summary,
    LifeContentLifecycleEnum lifecycle,
    LifeContentVisibilityEnum visibility,
    boolean featured,
    String coverMediaRef,
    List<Photo> photos
) {
    public AlbumAdminPreviewResponse {
        photos = photos == null ? List.of() : List.copyOf(photos);
    }

    public record Photo(
        String mediaRef,
        String altText,
        String caption,
        String publishedLocationLabel,
        PhotoDownloadModeEnum downloadMode,
        List<AlbumAdminResponse.AdminPreviewVariant> variants
    ) {
        public Photo {
            variants = variants == null ? List.of() : List.copyOf(variants);
        }
    }
}
