package io.github.shizuki.site.content.service.album.admin;

import io.github.shizuki.common.core.concurrency.ManagementCommandVersionGuard;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.content.controller.album.AlbumAdminPreviewResponse;
import io.github.shizuki.site.content.controller.album.AlbumAdminResponse;
import io.github.shizuki.site.content.controller.album.AlbumAdminSummaryResponse;
import io.github.shizuki.site.content.mapper.admin.AlbumAdminPhotoReadRow;
import io.github.shizuki.site.content.mapper.admin.AlbumAdminReadMapper;
import io.github.shizuki.site.content.mapper.admin.AlbumAdminReadRow;
import io.github.shizuki.site.content.mapper.admin.AlbumAdminVariantReadRow;
import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import io.github.shizuki.site.life.model.PhotoDownloadModeEnum;
import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/** Builds management and protected-preview projections without selecting storage identifiers. */
@Service
public class AlbumAdminQueryService {

    private static final String MANAGE_PERMISSION = "life.content.manage";
    private static final String PUBLIC_SCOPE = "PUBLIC_MATERIALIZED";
    private static final String PRIVATE_SCOPE = "PRIVATE_WORKING";
    private static final List<ImageVariantTypeEnum> REQUIRED_VARIANTS = List.of(
        ImageVariantTypeEnum.THUMB_WEBP,
        ImageVariantTypeEnum.DISPLAY_WEBP,
        ImageVariantTypeEnum.FULL_SANITIZED
    );

    private final AlbumAdminReadMapper mapper;
    private final String processorVersion;

    public AlbumAdminQueryService(
        AlbumAdminReadMapper mapper,
        @Value("${shizuki.media.derivatives.processor-version:v1}") String processorVersion
    ) {
        this.mapper = mapper;
        this.processorVersion = requireProcessorVersion(processorVersion);
    }

    public List<AlbumAdminSummaryResponse> list(boolean includeRecycled, int requestedLimit) {
        requireAdministrator();
        int limit = Math.max(1, Math.min(100, requestedLimit));
        return safe(mapper.selectAlbums(includeRecycled ? 1 : 0, limit)).stream()
            .map(this::summary)
            .toList();
    }

    public AlbumAdminResponse detail(long albumId) {
        requireAdministrator();
        return buildDetail(requireAlbum(albumId));
    }

    public AlbumAdminPreviewResponse preview(long albumId) {
        requireAdministrator();
        AlbumAdminResponse detail = buildDetail(requireAlbum(albumId));
        if (detail.lifecycle() == LifeContentLifecycleEnum.RECYCLED) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Album preview is unavailable");
        }
        String coverMediaRef = detail.photos().stream()
            .filter(photo -> detail.coverPhotoId() != null && detail.coverPhotoId() == photo.photoId())
            .map(AlbumAdminResponse.Photo::mediaRef)
            .findFirst()
            .orElse(null);
        List<AlbumAdminPreviewResponse.Photo> photos = detail.photos().stream()
            .map(photo -> new AlbumAdminPreviewResponse.Photo(
                photo.mediaRef(),
                photo.altText(),
                photo.caption(),
                photo.publishedLocationLabel(),
                photo.downloadMode(),
                photo.previewVariants()
            ))
            .toList();
        return new AlbumAdminPreviewResponse(
            detail.title(),
            detail.summary(),
            detail.lifecycle(),
            detail.visibility(),
            detail.featured(),
            coverMediaRef,
            photos
        );
    }

    private AlbumAdminResponse buildDetail(AlbumAdminReadRow album) {
        LifeContentVisibilityEnum visibility = parseVisibility(album.getVisibilityStatus());
        String scope = visibility == LifeContentVisibilityEnum.PUBLIC ? PUBLIC_SCOPE : PRIVATE_SCOPE;
        List<AlbumAdminPhotoReadRow> photoRows = safe(mapper.selectPhotos(album.getId()));
        Map<Long, Map<ImageVariantTypeEnum, AlbumAdminVariantReadRow>> variantsByPhoto = indexVariants(
            mapper.selectVariants(album.getId(), scope, processorVersion)
        );
        Map<Long, Map<ImageVariantTypeEnum, AlbumAdminVariantReadRow>> previewVariantsByPhoto = scope.equals(PRIVATE_SCOPE)
            ? variantsByPhoto
            : indexVariants(mapper.selectVariants(album.getId(), PRIVATE_SCOPE, processorVersion));
        List<AlbumAdminResponse.Photo> photos = photoRows.stream()
            .map(row -> photo(
                row,
                variantsByPhoto.getOrDefault(row.getPhotoId(), Map.of()),
                previewVariantsByPhoto.getOrDefault(row.getPhotoId(), Map.of())
            ))
            .toList();
        int version = valueOrZero(album.getVersion());
        return new AlbumAdminResponse(
            album.getId(),
            album.getPublicSlug(),
            album.getTitle(),
            album.getSummary(),
            album.getCoverPhotoId(),
            parseLifecycle(album.getLifecycleStatus()),
            visibility,
            valueOrZero(album.getFeatured()) == 1,
            valueOrZero(album.getSortNum()),
            photos,
            new AlbumAdminResponse.AuditInfo(
                album.getCreatedAt(),
                album.getUpdatedAt(),
                album.getPublishTime(),
                album.getRecycleTime(),
                album.getPurgeAfter(),
                version,
                ManagementCommandVersionGuard.toStrongEtag(version)
            )
        );
    }

    private Map<Long, Map<ImageVariantTypeEnum, AlbumAdminVariantReadRow>> indexVariants(
        List<AlbumAdminVariantReadRow> rows
    ) {
        Map<Long, Map<ImageVariantTypeEnum, AlbumAdminVariantReadRow>> variantsByPhoto = new HashMap<>();
        for (AlbumAdminVariantReadRow row : safe(rows)) {
            ImageVariantTypeEnum variant = parseVariant(row.getVariantCode());
            variantsByPhoto.computeIfAbsent(row.getPhotoId(), ignored -> new EnumMap<>(ImageVariantTypeEnum.class))
                .put(variant, row);
        }
        return variantsByPhoto;
    }

    private AlbumAdminResponse.Photo photo(
        AlbumAdminPhotoReadRow photo,
        Map<ImageVariantTypeEnum, AlbumAdminVariantReadRow> publicationAvailable,
        Map<ImageVariantTypeEnum, AlbumAdminVariantReadRow> previewAvailable
    ) {
        List<AlbumAdminResponse.Variant> variants = new ArrayList<>();
        for (ImageVariantTypeEnum variant : REQUIRED_VARIANTS) {
            variants.add(variant(photo.getMediaRef(), variant, publicationAvailable.get(variant)));
        }
        if (publicationAvailable.containsKey(ImageVariantTypeEnum.DISPLAY_AVIF)) {
            variants.add(variant(
                photo.getMediaRef(),
                ImageVariantTypeEnum.DISPLAY_AVIF,
                publicationAvailable.get(ImageVariantTypeEnum.DISPLAY_AVIF)
            ));
        }
        ImageDerivativeStatusEnum photoStatus = parseStatus(photo.getPhotoProcessingStatus());
        boolean requiredReady = variants.stream()
            .filter(item -> REQUIRED_VARIANTS.contains(item.variant()))
            .allMatch(item -> item.status() == ImageDerivativeStatusEnum.READY);
        ImageDerivativeStatusEnum aggregate = aggregate(photoStatus, variants, requiredReady);
        List<AlbumAdminResponse.AdminPreviewVariant> previewVariants = previewAvailable.entrySet().stream()
            .filter(entry -> parseStatus(entry.getValue().getProcessStatus()) == ImageDerivativeStatusEnum.READY)
            .sorted(Map.Entry.comparingByKey())
            .map(entry -> new AlbumAdminResponse.AdminPreviewVariant(
                entry.getKey(),
                adminPreviewRoute(photo.getMediaRef(), entry.getKey()),
                entry.getValue().getWidth(),
                entry.getValue().getHeight(),
                format(entry.getKey())
            ))
            .toList();
        int associationVersion = valueOrZero(photo.getAssociationVersion());
        return new AlbumAdminResponse.Photo(
            photo.getPhotoId(),
            photo.getMediaRef(),
            photo.getTitle(),
            normalizeText(photo.getAltText()),
            normalizeText(photo.getCaption()),
            normalizeText(photo.getPublishedLocationLabel()),
            valueOrZero(photo.getSortNum()),
            parseDownloadMode(photo.getDownloadMode()),
            associationVersion,
            ManagementCommandVersionGuard.toStrongEtag(associationVersion),
            new AlbumAdminResponse.Processing(
                aggregate,
                photoStatus == ImageDerivativeStatusEnum.READY && requiredReady,
                variants
            ),
            previewVariants
        );
    }

    private AlbumAdminResponse.Variant variant(
        String mediaRef,
        ImageVariantTypeEnum variant,
        AlbumAdminVariantReadRow row
    ) {
        if (row == null) {
            return new AlbumAdminResponse.Variant(
                variant,
                ImageDerivativeStatusEnum.PENDING,
                null,
                null,
                format(variant),
                null,
                false,
                null,
                null,
                null
            );
        }
        ImageDerivativeStatusEnum status = parseStatus(row.getProcessStatus());
        int version = valueOrZero(row.getVersion());
        return new AlbumAdminResponse.Variant(
            variant,
            status,
            row.getWidth(),
            row.getHeight(),
            format(variant),
            status == ImageDerivativeStatusEnum.FAILED ? ErrorCode.MEDIA_NOT_READY : null,
            status == ImageDerivativeStatusEnum.FAILED,
            status == ImageDerivativeStatusEnum.FAILED ? adminRetryRoute(mediaRef, variant) : null,
            version,
            ManagementCommandVersionGuard.toStrongEtag(version)
        );
    }

    private AlbumAdminSummaryResponse summary(AlbumAdminReadRow row) {
        int version = valueOrZero(row.getVersion());
        return new AlbumAdminSummaryResponse(
            row.getId(),
            row.getTitle(),
            parseLifecycle(row.getLifecycleStatus()),
            parseVisibility(row.getVisibilityStatus()),
            valueOrZero(row.getFeatured()) == 1,
            valueOrZero(row.getPhotoCount()),
            version,
            ManagementCommandVersionGuard.toStrongEtag(version),
            row.getUpdatedAt()
        );
    }

    private ImageDerivativeStatusEnum aggregate(
        ImageDerivativeStatusEnum photoStatus,
        List<AlbumAdminResponse.Variant> variants,
        boolean requiredReady
    ) {
        if (photoStatus == ImageDerivativeStatusEnum.FAILED
            || variants.stream().anyMatch(item -> item.status() == ImageDerivativeStatusEnum.FAILED)) {
            return ImageDerivativeStatusEnum.FAILED;
        }
        if (photoStatus == ImageDerivativeStatusEnum.READY && requiredReady) {
            return ImageDerivativeStatusEnum.READY;
        }
        if (photoStatus == ImageDerivativeStatusEnum.PROCESSING
            || variants.stream().anyMatch(item -> item.status() == ImageDerivativeStatusEnum.PROCESSING)) {
            return ImageDerivativeStatusEnum.PROCESSING;
        }
        return ImageDerivativeStatusEnum.PENDING;
    }

    private AlbumAdminReadRow requireAlbum(long albumId) {
        if (albumId <= 0) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Album was not found");
        }
        AlbumAdminReadRow row = mapper.selectAlbum(albumId);
        if (row == null || row.getId() == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Album was not found");
        }
        return row;
    }

    private void requireAdministrator() {
        LoginUser user = LoginUserContext.get().orElse(null);
        boolean admin = user != null && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
        if (!admin || !user.hasPermission(MANAGE_PERMISSION)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Life content management permission is required");
        }
    }

    private String adminPreviewRoute(String mediaRef, ImageVariantTypeEnum variant) {
        return "/api/v1/admin/life/media-associations/" + mediaRef
            + "/preview/" + variant.name();
    }

    private String adminRetryRoute(String mediaRef, ImageVariantTypeEnum variant) {
        return "/api/v1/admin/life/media-associations/" + mediaRef
            + "/processing/" + variant.name() + "/retry";
    }

    private String format(ImageVariantTypeEnum variant) {
        return variant == ImageVariantTypeEnum.DISPLAY_AVIF ? "avif" : "webp";
    }

    private String normalizeText(String value) {
        return value == null ? null : value.trim();
    }

    private LifeContentLifecycleEnum parseLifecycle(String value) {
        try {
            return LifeContentLifecycleEnum.valueOf(normalizeEnum(value));
        } catch (RuntimeException exception) {
            throw new BusinessException(ErrorCode.CONFLICT, "Album lifecycle is invalid");
        }
    }

    private LifeContentVisibilityEnum parseVisibility(String value) {
        try {
            return LifeContentVisibilityEnum.valueOf(normalizeEnum(value));
        } catch (RuntimeException exception) {
            throw new BusinessException(ErrorCode.CONFLICT, "Album visibility is invalid");
        }
    }

    private PhotoDownloadModeEnum parseDownloadMode(String value) {
        try {
            return PhotoDownloadModeEnum.valueOf(normalizeEnum(value));
        } catch (RuntimeException exception) {
            return PhotoDownloadModeEnum.NONE;
        }
    }

    private ImageDerivativeStatusEnum parseStatus(String value) {
        try {
            return ImageDerivativeStatusEnum.valueOf(normalizeEnum(value));
        } catch (RuntimeException exception) {
            return ImageDerivativeStatusEnum.PENDING;
        }
    }

    private ImageVariantTypeEnum parseVariant(String value) {
        try {
            return ImageVariantTypeEnum.valueOf(normalizeEnum(value));
        } catch (RuntimeException exception) {
            throw new BusinessException(ErrorCode.CONFLICT, "Album media variant is invalid");
        }
    }

    private String normalizeEnum(String value) {
        return String.valueOf(value == null ? "" : value).trim().toUpperCase(Locale.ROOT);
    }

    private int valueOrZero(Integer value) {
        return value == null ? 0 : value;
    }

    private <T> List<T> safe(List<T> values) {
        return values == null ? List.of() : values;
    }

    private static String requireProcessorVersion(String value) {
        String normalized = value == null ? "" : value.trim();
        if (normalized.isEmpty()) {
            throw new IllegalArgumentException("processorVersion must not be blank");
        }
        return normalized;
    }
}
