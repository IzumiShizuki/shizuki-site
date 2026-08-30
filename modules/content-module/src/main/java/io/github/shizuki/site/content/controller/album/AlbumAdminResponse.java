package io.github.shizuki.site.content.controller.album;

import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import io.github.shizuki.site.life.model.PhotoDownloadModeEnum;
import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import java.time.LocalDateTime;
import java.util.List;

/** Management-only album representation. It deliberately contains no storage identity. */
public record AlbumAdminResponse(
    long id,
    String publicSlug,
    String title,
    String summary,
    Long coverPhotoId,
    LifeContentLifecycleEnum lifecycle,
    LifeContentVisibilityEnum visibility,
    boolean featured,
    int sortNum,
    List<Photo> photos,
    AuditInfo audit
) {
    public AlbumAdminResponse {
        photos = photos == null ? List.of() : List.copyOf(photos);
    }

    public record Photo(
        long photoId,
        String mediaRef,
        String title,
        String altText,
        String caption,
        String publishedLocationLabel,
        int sortNum,
        PhotoDownloadModeEnum downloadMode,
        int associationVersion,
        String associationEtag,
        Processing processing,
        List<AdminPreviewVariant> previewVariants
    ) {
        public Photo {
            previewVariants = previewVariants == null ? List.of() : List.copyOf(previewVariants);
        }
    }

    public record Processing(
        ImageDerivativeStatusEnum status,
        boolean readyForPublication,
        List<Variant> variants
    ) {
        public Processing {
            variants = variants == null ? List.of() : List.copyOf(variants);
        }
    }

    public record Variant(
        ImageVariantTypeEnum variant,
        ImageDerivativeStatusEnum status,
        Integer width,
        Integer height,
        String format,
        ErrorCode errorCode,
        boolean retryAllowed,
        String retryRoute,
        Integer version,
        String etag
    ) {
    }

    public record AdminPreviewVariant(
        ImageVariantTypeEnum variant,
        String route,
        Integer width,
        Integer height,
        String format
    ) {
    }

    public record AuditInfo(
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        LocalDateTime publishedAt,
        LocalDateTime recycledAt,
        LocalDateTime purgeAfter,
        int version,
        String etag
    ) {
    }
}
