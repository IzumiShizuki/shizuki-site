package io.github.shizuki.site.content.service.album;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.common.response.CursorPageResponse;
import io.github.shizuki.site.content.cache.PublicContentCacheStore;
import io.github.shizuki.site.content.cache.PublicContentDetail;
import io.github.shizuki.site.content.config.PersonalContentFeatureProperties;
import io.github.shizuki.site.content.controller.album.PublicAlbumDetailResponse;
import io.github.shizuki.site.content.controller.album.PublicAlbumMediaResponse;
import io.github.shizuki.site.content.controller.album.PublicAlbumMediaVariantResponse;
import io.github.shizuki.site.content.controller.album.PublicAlbumPhotoResponse;
import io.github.shizuki.site.content.controller.album.PublicAlbumSummaryResponse;
import io.github.shizuki.site.content.mapper.publiccontent.PublicAlbumPhotoReadRow;
import io.github.shizuki.site.content.mapper.publiccontent.PublicAlbumReadMapper;
import io.github.shizuki.site.content.mapper.publiccontent.PublicAlbumReadRow;
import io.github.shizuki.site.content.model.OpaquePublicIdentifierGenerator;
import io.github.shizuki.site.content.model.PublicContentCursorCodec;
import io.github.shizuki.site.content.model.PublicContentCursorKey;
import io.github.shizuki.site.content.model.PublicContentType;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import io.github.shizuki.site.media.port.PublicMediaPresentationPort;
import io.github.shizuki.site.media.response.ProtectedMediaPresentationResponse;
import io.github.shizuki.site.media.response.PublicMediaPresentationResponse;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** Read-only visitor Album service with stable keyset cursors and fail-closed media projection. */
@Service
public class PublicAlbumQueryService {

    private static final int DEFAULT_FEATURED_LIMIT = 6;
    private static final int MAX_FEATURED_LIMIT = 12;

    private final PublicAlbumReadMapper readMapper;
    private final PublicContentCursorCodec cursorCodec;
    private final PersonalContentFeatureProperties featureProperties;
    private final PublicMediaPresentationPort mediaPresentationPort;
    private final PublicContentCacheStore cacheStore;
    private final String processorVersion;
    private final Clock clock;

    @Autowired
    public PublicAlbumQueryService(
        PublicAlbumReadMapper readMapper,
        PublicContentCursorCodec cursorCodec,
        PersonalContentFeatureProperties featureProperties,
        ObjectProvider<PublicMediaPresentationPort> mediaPresentationPortProvider,
        ObjectProvider<PublicContentCacheStore> cacheStoreProvider,
        @Value("${shizuki.media.derivatives.processor-version:v1}") String processorVersion
    ) {
        this(
            readMapper,
            cursorCodec,
            featureProperties,
            mediaPresentationPortProvider.getIfAvailable(),
            cacheStoreProvider.getIfAvailable(),
            processorVersion,
            Clock.systemDefaultZone()
        );
    }

    PublicAlbumQueryService(
        PublicAlbumReadMapper readMapper,
        PublicContentCursorCodec cursorCodec,
        PersonalContentFeatureProperties featureProperties,
        PublicMediaPresentationPort mediaPresentationPort,
        String processorVersion,
        Clock clock
    ) {
        this(readMapper, cursorCodec, featureProperties, mediaPresentationPort, null, processorVersion, clock);
    }

    PublicAlbumQueryService(
        PublicAlbumReadMapper readMapper,
        PublicContentCursorCodec cursorCodec,
        PersonalContentFeatureProperties featureProperties,
        PublicMediaPresentationPort mediaPresentationPort,
        PublicContentCacheStore cacheStore,
        String processorVersion,
        Clock clock
    ) {
        this.readMapper = readMapper;
        this.cursorCodec = cursorCodec;
        this.featureProperties = featureProperties;
        this.mediaPresentationPort = mediaPresentationPort;
        this.cacheStore = cacheStore;
        this.processorVersion = normalizeProcessorVersion(processorVersion);
        this.clock = clock;
    }

    @Transactional(readOnly = true)
    public CursorPageResponse<PublicAlbumSummaryResponse> list(String cursor, Integer requestedLimit) {
        requireAvailable();
        int limit = normalizePageLimit(requestedLimit);
        if (cacheStore != null) {
            return cacheStore.getOrLoadList(
                PublicContentType.ALBUM,
                cursor,
                limit,
                new ParameterizedTypeReference<CursorPageResponse<PublicAlbumSummaryResponse>>() { },
                () -> loadList(cursor, limit)
            );
        }
        return loadList(cursor, limit);
    }

    private CursorPageResponse<PublicAlbumSummaryResponse> loadList(String cursor, int limit) {
        PublicContentCursorKey cursorKey = decodeCursor(cursor);
        List<PublicAlbumReadRow> rows = safe(readMapper.selectPublicPage(
            cursorKey == null ? null : LocalDateTime.ofInstant(cursorKey.publishedAt(), clock.getZone()),
            cursorKey == null ? null : cursorKey.stableSortKey(),
            cursorKey == null ? null : cursorKey.publicId(),
            limit + 1,
            processorVersion
        ));
        boolean hasMore = rows.size() > limit;
        List<PublicAlbumReadRow> pageRows = hasMore ? rows.subList(0, limit) : rows;
        List<PublicAlbumSummaryResponse> items = pageRows.stream()
            .map(this::toSummary)
            .toList();
        String nextCursor = hasMore && !pageRows.isEmpty()
            ? cursorCodec.encode(PublicContentType.ALBUM, cursorKey(pageRows.get(pageRows.size() - 1)))
            : null;
        return CursorPageResponse.of(items, nextCursor, hasMore);
    }

    @Transactional(readOnly = true)
    public List<PublicAlbumSummaryResponse> featured(Integer requestedLimit) {
        requireAvailable();
        int limit = requestedLimit == null ? DEFAULT_FEATURED_LIMIT : requestedLimit;
        if (limit < 1 || limit > MAX_FEATURED_LIMIT) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Featured Album limit must be between 1 and 12");
        }
        if (cacheStore != null) {
            return cacheStore.getOrLoadFeatured(
                PublicContentType.ALBUM,
                limit,
                new ParameterizedTypeReference<List<PublicAlbumSummaryResponse>>() { },
                () -> loadFeatured(limit)
            );
        }
        return loadFeatured(limit);
    }

    private List<PublicAlbumSummaryResponse> loadFeatured(int limit) {
        return safe(readMapper.selectFeatured(limit, processorVersion)).stream()
            .map(this::toSummary)
            .toList();
    }

    @Transactional(readOnly = true)
    public PublicAlbumDetailResponse detail(String publicSlug) {
        requireAvailable();
        if (!OpaquePublicIdentifierGenerator.isValidFor(PublicContentType.ALBUM, publicSlug)) {
            throw notFound();
        }
        if (cacheStore != null) {
            return cacheStore.getOrLoadDetail(
                PublicContentType.ALBUM,
                publicSlug,
                new ParameterizedTypeReference<PublicAlbumDetailResponse>() { },
                () -> loadDetail(publicSlug)
            );
        }
        return loadDetail(publicSlug).value();
    }

    private PublicContentDetail<PublicAlbumDetailResponse> loadDetail(String publicSlug) {
        PublicAlbumReadRow album = readMapper.selectVisitorDetail(publicSlug, processorVersion);
        if (album == null || album.getId() == null) {
            throw notFound();
        }
        LifeContentVisibilityEnum visibility = parseVisitorVisibility(album.getVisibilityStatus());
        List<PublicAlbumPhotoReadRow> photoRows = safe(readMapper.selectVisitorPhotos(album.getId()));
        if (photoRows.isEmpty()) {
            throw notFound();
        }
        List<PublicAlbumPhotoResponse> photos = new ArrayList<>(photoRows.size());
        for (PublicAlbumPhotoReadRow photo : photoRows) {
            PublicAlbumMediaResponse media = resolveMedia(photo.getMediaRef(), visibility)
                .orElseThrow(PublicAlbumQueryService::notFound);
            photos.add(new PublicAlbumPhotoResponse(
                normalizeNullable(photo.getTitle()),
                media.altText(),
                normalizeNullable(photo.getCaption()),
                normalizeNullable(photo.getPublishedLocationLabel()),
                media
            ));
        }
        boolean discoverable = visibility == LifeContentVisibilityEnum.PUBLIC;
        PublicAlbumDetailResponse response = new PublicAlbumDetailResponse(
            album.getPublicSlug(),
            album.getTitle(),
            album.getSummary(),
            visibility,
            toInstant(album.getPublishTime()),
            !discoverable,
            discoverable,
            discoverable,
            discoverable,
            photos
        );
        return PublicContentDetail.of(visibility, response);
    }

    private PublicAlbumSummaryResponse toSummary(PublicAlbumReadRow row) {
        if (row == null || row.getId() == null || row.getPublishTime() == null) {
            throw new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "Album listing is temporarily unavailable");
        }
        PublicAlbumMediaResponse cover = resolveMedia(row.getCoverMediaRef(), LifeContentVisibilityEnum.PUBLIC)
            .orElseThrow(() -> new BusinessException(
                ErrorCode.UPSTREAM_UNAVAILABLE,
                "Album media is temporarily unavailable"
            ));
        return new PublicAlbumSummaryResponse(
            row.getPublicSlug(),
            row.getTitle(),
            row.getSummary(),
            toInstant(row.getPublishTime()),
            row.getPhotoCount() == null ? 0 : row.getPhotoCount(),
            cover
        );
    }

    private Optional<PublicAlbumMediaResponse> resolveMedia(
        String mediaRef,
        LifeContentVisibilityEnum visibility
    ) {
        if (mediaPresentationPort == null || mediaRef == null || mediaRef.isBlank()) {
            return Optional.empty();
        }
        if (visibility == LifeContentVisibilityEnum.PUBLIC) {
            return mediaPresentationPort.resolvePublicPresentation(mediaRef).map(this::fromPublicMedia);
        }
        return mediaPresentationPort.resolveUnlistedPresentation(mediaRef).map(this::fromProtectedMedia);
    }

    private PublicAlbumMediaResponse fromPublicMedia(PublicMediaPresentationResponse media) {
        List<PublicAlbumMediaVariantResponse> variants = media.variants().stream()
            .map(variant -> new PublicAlbumMediaVariantResponse(
                variant.variant(),
                variant.path(),
                variant.width(),
                variant.height(),
                variant.format(),
                null
            ))
            .toList();
        return new PublicAlbumMediaResponse(media.mediaRef(), media.altText(), variants);
    }

    private PublicAlbumMediaResponse fromProtectedMedia(ProtectedMediaPresentationResponse media) {
        List<PublicAlbumMediaVariantResponse> variants = media.variants().stream()
            .map(variant -> new PublicAlbumMediaVariantResponse(
                variant.variant(),
                variant.path(),
                variant.width(),
                variant.height(),
                variant.format(),
                variant.capability()
            ))
            .toList();
        return new PublicAlbumMediaResponse(media.mediaRef(), media.altText(), variants);
    }

    private PublicContentCursorKey decodeCursor(String cursor) {
        return cursor == null || cursor.isBlank()
            ? null
            : cursorCodec.decode(PublicContentType.ALBUM, cursor.trim());
    }

    private PublicContentCursorKey cursorKey(PublicAlbumReadRow row) {
        return new PublicContentCursorKey(toInstant(row.getPublishTime()), row.getId(), row.getPublicSlug());
    }

    private int normalizePageLimit(Integer requestedLimit) {
        int limit = requestedLimit == null ? featureProperties.getDefaultPageSize() : requestedLimit;
        if (limit < 1 || limit > featureProperties.getMaxPageSize()) {
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "Album page limit must be between 1 and " + featureProperties.getMaxPageSize()
            );
        }
        return limit;
    }

    private LifeContentVisibilityEnum parseVisitorVisibility(String raw) {
        try {
            LifeContentVisibilityEnum visibility = LifeContentVisibilityEnum.valueOf(
                String.valueOf(raw).trim().toUpperCase(Locale.ROOT)
            );
            if (visibility == LifeContentVisibilityEnum.PRIVATE) {
                throw notFound();
            }
            return visibility;
        } catch (BusinessException exception) {
            throw exception;
        } catch (RuntimeException exception) {
            throw notFound();
        }
    }

    private void requireAvailable() {
        if (!featureProperties.isPublicApiAvailable()) {
            throw new BusinessException(ErrorCode.FEATURE_DISABLED);
        }
        if (mediaPresentationPort == null) {
            throw new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "Album media gateway is unavailable");
        }
    }

    private Instant toInstant(LocalDateTime value) {
        if (value == null) {
            throw new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "Album publication time is unavailable");
        }
        return value.atZone(clock.getZone()).toInstant();
    }

    private static String normalizeNullable(String value) {
        if (value == null) {
            return null;
        }
        String normalized = value.trim();
        return normalized.isEmpty() ? null : normalized;
    }

    private static String normalizeProcessorVersion(String value) {
        String normalized = value == null ? "" : value.trim();
        if (normalized.isEmpty()) {
            throw new IllegalArgumentException("processorVersion must not be blank");
        }
        return normalized;
    }

    private static <T> List<T> safe(List<T> values) {
        return values == null ? List.of() : List.copyOf(values);
    }

    private static BusinessException notFound() {
        return new BusinessException(ErrorCode.NOT_FOUND, "Album was not found");
    }
}
