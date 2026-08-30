package io.github.shizuki.site.content.service.moment;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.common.response.CursorPageResponse;
import io.github.shizuki.site.content.cache.PublicContentCacheStore;
import io.github.shizuki.site.content.cache.PublicContentDetail;
import io.github.shizuki.site.content.config.PersonalContentFeatureProperties;
import io.github.shizuki.site.content.mapper.PublicMomentMapper;
import io.github.shizuki.site.content.mapper.PublicMomentPhotoReadRow;
import io.github.shizuki.site.content.mapper.PublicMomentReadRow;
import io.github.shizuki.site.content.model.OpaquePublicIdentifierGenerator;
import io.github.shizuki.site.content.model.PublicContentCursorCodec;
import io.github.shizuki.site.content.model.PublicContentCursorKey;
import io.github.shizuki.site.content.model.PublicContentType;
import io.github.shizuki.site.content.response.PublicMomentDetailResponse;
import io.github.shizuki.site.content.response.PublicMomentPhotoResponse;
import io.github.shizuki.site.content.response.PublicMomentResponse;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import io.github.shizuki.site.media.port.PublicMediaPresentationPort;
import io.github.shizuki.site.media.response.ProtectedMediaPresentationResponse;
import io.github.shizuki.site.media.response.PublicMediaPresentationResponse;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PublicMomentQueryService {

    private final PublicMomentMapper mapper;
    private final PublicContentCursorCodec cursorCodec;
    private final PersonalContentFeatureProperties featureProperties;
    private final ObjectProvider<PublicMediaPresentationPort> mediaPresentationPort;
    private final PublicContentCacheStore cacheStore;
    private final Clock clock;

    @Autowired
    public PublicMomentQueryService(
        PublicMomentMapper mapper,
        PublicContentCursorCodec cursorCodec,
        PersonalContentFeatureProperties featureProperties,
        ObjectProvider<PublicMediaPresentationPort> mediaPresentationPort,
        ObjectProvider<PublicContentCacheStore> cacheStoreProvider
    ) {
        this(
            mapper,
            cursorCodec,
            featureProperties,
            mediaPresentationPort,
            cacheStoreProvider.getIfAvailable(),
            Clock.systemDefaultZone()
        );
    }

    PublicMomentQueryService(
        PublicMomentMapper mapper,
        PublicContentCursorCodec cursorCodec,
        PersonalContentFeatureProperties featureProperties,
        ObjectProvider<PublicMediaPresentationPort> mediaPresentationPort,
        Clock clock
    ) {
        this(mapper, cursorCodec, featureProperties, mediaPresentationPort, null, clock);
    }

    PublicMomentQueryService(
        PublicMomentMapper mapper,
        PublicContentCursorCodec cursorCodec,
        PersonalContentFeatureProperties featureProperties,
        ObjectProvider<PublicMediaPresentationPort> mediaPresentationPort,
        PublicContentCacheStore cacheStore,
        Clock clock
    ) {
        this.mapper = mapper;
        this.cursorCodec = cursorCodec;
        this.featureProperties = featureProperties;
        this.mediaPresentationPort = mediaPresentationPort;
        this.cacheStore = cacheStore;
        this.clock = clock;
    }

    @Transactional(readOnly = true)
    public CursorPageResponse<PublicMomentResponse> feed(String cursorToken, Integer requestedLimit) {
        requirePublicApi();
        int limit = normalizeLimit(requestedLimit);
        if (cacheStore != null) {
            return cacheStore.getOrLoadList(
                PublicContentType.MOMENT,
                cursorToken,
                limit,
                new ParameterizedTypeReference<CursorPageResponse<PublicMomentResponse>>() { },
                () -> loadFeed(cursorToken, limit)
            );
        }
        return loadFeed(cursorToken, limit);
    }

    private CursorPageResponse<PublicMomentResponse> loadFeed(String cursorToken, int limit) {
        PublicContentCursorKey cursor = cursorToken == null || cursorToken.isBlank()
            ? null
            : cursorCodec.decode(PublicContentType.MOMENT, cursorToken);
        List<PublicMomentReadRow> fetched = safe(mapper.selectPublicFeed(
            cursor == null ? null : toLocalDateTime(cursor.publishedAt()),
            cursor == null ? null : cursor.stableSortKey(),
            cursor == null ? null : cursor.publicId(),
            limit + 1
        ));
        boolean hasMore = fetched.size() > limit;
        List<PublicMomentReadRow> pageRows = hasMore ? fetched.subList(0, limit) : fetched;
        List<PublicMomentResponse> items = presentations(pageRows, false);
        String nextCursor = hasMore && !pageRows.isEmpty()
            ? cursorCodec.encode(PublicContentType.MOMENT, cursorKey(pageRows.get(pageRows.size() - 1)))
            : null;
        return CursorPageResponse.of(items, nextCursor, hasMore);
    }

    @Transactional(readOnly = true)
    public List<PublicMomentResponse> featured(Integer requestedLimit) {
        requirePublicApi();
        int limit = requestedLimit == null ? Math.min(6, featureProperties.getDefaultPageSize()) : requestedLimit;
        if (limit < 1 || limit > Math.min(12, featureProperties.getMaxPageSize())) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Featured moment limit is invalid");
        }
        if (cacheStore != null) {
            return cacheStore.getOrLoadFeatured(
                PublicContentType.MOMENT,
                limit,
                new ParameterizedTypeReference<List<PublicMomentResponse>>() { },
                () -> presentations(safe(mapper.selectFeatured(limit)), false)
            );
        }
        return presentations(safe(mapper.selectFeatured(limit)), false);
    }

    @Transactional(readOnly = true)
    public PublicMomentDetailResponse detail(String publicId) {
        requirePublicApi();
        if (!OpaquePublicIdentifierGenerator.isValidFor(PublicContentType.MOMENT, publicId)) {
            throw notFound();
        }
        if (cacheStore != null) {
            return cacheStore.getOrLoadDetail(
                PublicContentType.MOMENT,
                publicId,
                new ParameterizedTypeReference<PublicMomentDetailResponse>() { },
                () -> loadDetail(publicId)
            );
        }
        return loadDetail(publicId).value();
    }

    private PublicContentDetail<PublicMomentDetailResponse> loadDetail(String publicId) {
        PublicMomentReadRow row = mapper.selectDirectDetail(publicId);
        if (row == null || row.getId() == null) {
            throw notFound();
        }
        boolean unlisted = "UNLISTED".equalsIgnoreCase(row.getVisibilityStatus());
        List<PublicMomentResponse> result = presentations(List.of(row), unlisted);
        if (result.isEmpty()) {
            throw notFound();
        }
        PublicMomentDetailResponse response = new PublicMomentDetailResponse(result.get(0), unlisted, unlisted);
        return PublicContentDetail.of(
            unlisted ? LifeContentVisibilityEnum.UNLISTED : LifeContentVisibilityEnum.PUBLIC,
            response
        );
    }

    private List<PublicMomentResponse> presentations(List<PublicMomentReadRow> rows, boolean protectedMedia) {
        if (rows.isEmpty()) {
            return List.of();
        }
        List<Long> momentIds = rows.stream().map(PublicMomentReadRow::getId).toList();
        Map<Long, List<PublicMomentPhotoReadRow>> photosByMoment = new HashMap<>();
        safe(mapper.selectPhotos(momentIds)).forEach(photo ->
            photosByMoment.computeIfAbsent(photo.getMomentId(), ignored -> new ArrayList<>()).add(photo)
        );
        return rows.stream().map(row -> new PublicMomentResponse(
            row.getPublicId(),
            row.getBody(),
            Boolean.TRUE.equals(row.getFeatured()),
            Boolean.TRUE.equals(row.getPinned()),
            toInstant(row.getPublishedAt()),
            resolvePhotos(photosByMoment.getOrDefault(row.getId(), List.of()), protectedMedia)
        )).toList();
    }

    private List<PublicMomentPhotoResponse> resolvePhotos(
        List<PublicMomentPhotoReadRow> rows,
        boolean protectedMedia
    ) {
        PublicMediaPresentationPort port = mediaPresentationPort.getIfAvailable();
        if (port == null) {
            return List.of();
        }
        List<PublicMomentPhotoResponse> photos = new ArrayList<>();
        for (PublicMomentPhotoReadRow row : rows) {
            if (protectedMedia) {
                ProtectedMediaPresentationResponse presentation = port.resolveUnlistedPresentation(row.getMediaRef())
                    .orElse(null);
                if (presentation != null) {
                    photos.add(new PublicMomentPhotoResponse(
                        presentation.mediaRef(),
                        presentation.altText(),
                        row.getPublishedLocationLabel(),
                        List.of(),
                        presentation.variants()
                    ));
                }
            } else {
                PublicMediaPresentationResponse presentation = port.resolvePublicPresentation(row.getMediaRef())
                    .orElse(null);
                if (presentation != null) {
                    photos.add(new PublicMomentPhotoResponse(
                        presentation.mediaRef(),
                        presentation.altText(),
                        row.getPublishedLocationLabel(),
                        presentation.variants(),
                        List.of()
                    ));
                }
            }
        }
        return List.copyOf(photos);
    }

    private int normalizeLimit(Integer requestedLimit) {
        int limit = requestedLimit == null ? featureProperties.getDefaultPageSize() : requestedLimit;
        if (limit < 1 || limit > featureProperties.getMaxPageSize()) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Moment feed limit is invalid");
        }
        return limit;
    }

    private PublicContentCursorKey cursorKey(PublicMomentReadRow row) {
        return new PublicContentCursorKey(toInstant(row.getPublishedAt()), row.getId(), row.getPublicId());
    }

    private void requirePublicApi() {
        if (!featureProperties.isPublicApiAvailable()) {
            throw new BusinessException(ErrorCode.FEATURE_DISABLED, "Public moments are disabled");
        }
    }

    private BusinessException notFound() {
        return new BusinessException(ErrorCode.NOT_FOUND, "Moment was not found");
    }

    private Instant toInstant(LocalDateTime value) {
        if (value == null) {
            throw new BusinessException(ErrorCode.CONFLICT, "Published moment is missing publication time");
        }
        return value.atZone(clock.getZone()).toInstant();
    }

    private LocalDateTime toLocalDateTime(Instant value) {
        return LocalDateTime.ofInstant(value, clock.getZone());
    }

    private <T> List<T> safe(List<T> values) {
        return values == null ? List.of() : values;
    }
}
