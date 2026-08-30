package io.github.shizuki.site.content.service.album;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.admin.response.AdminPurgeBlockerResponse;
import io.github.shizuki.site.content.cache.PublicContentCacheInvalidator;
import io.github.shizuki.site.content.entity.AlbumEntity;
import io.github.shizuki.site.content.life.LifeContentLifecycleService;
import io.github.shizuki.site.content.life.LifeContentState;
import io.github.shizuki.site.content.life.ContentPurgeReadiness;
import io.github.shizuki.site.content.mapper.AlbumMapper;
import io.github.shizuki.site.content.mapper.AlbumPhotoMapper;
import io.github.shizuki.site.content.mapper.AlbumPublicationMediaMapper;
import io.github.shizuki.site.content.mapper.AlbumPublicationMediaRow;
import io.github.shizuki.site.content.model.OpaquePublicIdentifierGenerator;
import io.github.shizuki.site.content.model.PublicContentType;
import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 相册聚合的编辑与生命周期服务。
 *
 * <p>照片批量附加和重排属于独立命令服务；这里仅负责相册自身状态与发布门槛。
 */
@Service
public class AlbumService {

    private static final String MANAGE_PERMISSION = "life.content.manage";
    private static final String PUBLIC_DELIVERY_SCOPE = "PUBLIC_MATERIALIZED";
    private static final String PRIVATE_DELIVERY_SCOPE = "PRIVATE_WORKING";
    private static final List<String> REQUIRED_VARIANTS = List.of(
        ImageVariantTypeEnum.THUMB_WEBP.name(),
        ImageVariantTypeEnum.DISPLAY_WEBP.name(),
        ImageVariantTypeEnum.FULL_SANITIZED.name()
    );

    private final AlbumMapper albumMapper;
    private final AlbumPhotoMapper albumPhotoMapper;
    private final AlbumPublicationMediaMapper publicationMediaMapper;
    private final OpaquePublicIdentifierGenerator identifierGenerator;
    private final LifeContentLifecycleService lifecycleService;
    private final PublicContentCacheInvalidator cacheInvalidator;
    private final Duration retention;
    private final String processorVersion;
    private final Clock clock;

    @Autowired
    public AlbumService(
        AlbumMapper albumMapper,
        AlbumPhotoMapper albumPhotoMapper,
        AlbumPublicationMediaMapper publicationMediaMapper,
        OpaquePublicIdentifierGenerator identifierGenerator,
        LifeContentLifecycleService lifecycleService,
        ObjectProvider<PublicContentCacheInvalidator> cacheInvalidatorProvider,
        @Value("${shizuki.media.photo-retention.retention-days:30}") int retentionDays,
        @Value("${shizuki.media.derivatives.processor-version:v1}") String processorVersion
    ) {
        this(
            albumMapper,
            albumPhotoMapper,
            publicationMediaMapper,
            identifierGenerator,
            lifecycleService,
            cacheInvalidatorProvider.getIfAvailable(),
            Duration.ofDays(requirePositiveRetention(retentionDays)),
            normalizeProcessorVersion(processorVersion),
            Clock.systemDefaultZone()
        );
    }

    AlbumService(
        AlbumMapper albumMapper,
        AlbumPhotoMapper albumPhotoMapper,
        AlbumPublicationMediaMapper publicationMediaMapper,
        OpaquePublicIdentifierGenerator identifierGenerator,
        LifeContentLifecycleService lifecycleService,
        Duration retention,
        String processorVersion,
        Clock clock
    ) {
        this(
            albumMapper,
            albumPhotoMapper,
            publicationMediaMapper,
            identifierGenerator,
            lifecycleService,
            null,
            retention,
            processorVersion,
            clock
        );
    }

    AlbumService(
        AlbumMapper albumMapper,
        AlbumPhotoMapper albumPhotoMapper,
        AlbumPublicationMediaMapper publicationMediaMapper,
        OpaquePublicIdentifierGenerator identifierGenerator,
        LifeContentLifecycleService lifecycleService,
        PublicContentCacheInvalidator cacheInvalidator,
        Duration retention,
        String processorVersion,
        Clock clock
    ) {
        this.albumMapper = albumMapper;
        this.albumPhotoMapper = albumPhotoMapper;
        this.publicationMediaMapper = publicationMediaMapper;
        this.identifierGenerator = identifierGenerator;
        this.lifecycleService = lifecycleService;
        this.cacheInvalidator = cacheInvalidator;
        this.retention = retention;
        this.processorVersion = processorVersion;
        this.clock = clock;
    }

    @Transactional(rollbackFor = Exception.class)
    public AlbumEntity createDraft(String title, String summary, LifeContentVisibilityEnum visibility) {
        requireAdministrator();
        AlbumEntity album = new AlbumEntity();
        album.setPublicSlug(identifierGenerator.generate(PublicContentType.ALBUM));
        album.setTitle(requireTitle(title));
        album.setSummary(normalizeSummary(summary));
        album.setLifecycleStatus(LifeContentLifecycleEnum.DRAFT.name());
        album.setVisibilityStatus((visibility == null ? LifeContentVisibilityEnum.PRIVATE : visibility).name());
        album.setFeatured(false);
        album.setSortNum(0);
        album.setDeleted(0);
        album.setVersion(0);
        if (albumMapper.insert(album) != 1 || album.getId() == null) {
            throw new BusinessException(ErrorCode.CONFLICT, "Album draft was not created");
        }
        return album;
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse edit(
        long albumId,
        int expectedVersion,
        String title,
        String summary,
        LifeContentVisibilityEnum visibility,
        boolean featured,
        int sortNum
    ) {
        requireAdministrator();
        AlbumEntity album = requireAlbum(albumId, expectedVersion);
        requireNotRecycled(album);
        LifeContentVisibilityEnum nextVisibility = visibility == null
            ? parseVisibility(album.getVisibilityStatus())
            : visibility;
        int updated = albumMapper.updateEditorial(
            albumId,
            expectedVersion,
            requireTitle(title),
            normalizeSummary(summary),
            nextVisibility.name(),
            featured ? 1 : 0,
            sortNum
        );
        requireUpdated(updated);
        if (LifeContentLifecycleEnum.PUBLISHED.name().equals(album.getLifecycleStatus())) {
            albumPhotoMapper.updateDeliveryRevoked(
                albumId,
                nextVisibility == LifeContentVisibilityEnum.PRIVATE ? 1 : 0
            );
        }
        invalidate(album);
        return nextVersion(expectedVersion);
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse selectCover(long albumId, int expectedVersion, long photoId) {
        requireAdministrator();
        AlbumEntity album = requireAlbum(albumId, expectedVersion);
        requireNotRecycled(album);
        if (photoId <= 0 || !albumPhotoMapper.existsActiveAssociation(albumId, photoId)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Album cover must be an attached photo");
        }
        requireUpdated(albumMapper.updateCover(albumId, expectedVersion, photoId));
        invalidate(album);
        return nextVersion(expectedVersion);
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse publish(long albumId, int expectedVersion) {
        requireAdministrator();
        AlbumEntity album = requireAlbum(albumId, expectedVersion);
        LifeContentState next = lifecycleService.publish(toState(album));
        validatePublication(album);
        LocalDateTime now = LocalDateTime.ofInstant(clock.instant(), clock.getZone());
        updateLifecycle(album, expectedVersion, next, now);
        boolean visitorDelivery = parseVisibility(album.getVisibilityStatus()) != LifeContentVisibilityEnum.PRIVATE;
        albumPhotoMapper.updateDeliveryRevoked(albumId, visitorDelivery ? 0 : 1);
        invalidate(album);
        return nextVersion(expectedVersion);
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse archive(long albumId, int expectedVersion) {
        requireAdministrator();
        AlbumEntity album = requireAlbum(albumId, expectedVersion);
        LifeContentState next = lifecycleService.archive(toState(album));
        albumPhotoMapper.updateDeliveryRevoked(albumId, 1);
        updateLifecycle(album, expectedVersion, next, null);
        invalidate(album);
        return nextVersion(expectedVersion);
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse recycle(long albumId, int expectedVersion) {
        requireAdministrator();
        AlbumEntity album = requireAlbum(albumId, expectedVersion);
        LifeContentState next = lifecycleService.recycle(toState(album), clock.instant(), retention);
        albumPhotoMapper.updateDeliveryRevoked(albumId, 1);
        updateLifecycle(album, expectedVersion, next, null);
        invalidate(album);
        return nextVersion(expectedVersion);
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse restore(long albumId, int expectedVersion) {
        requireAdministrator();
        AlbumEntity album = requireAlbum(albumId, expectedVersion);
        LifeContentState next = lifecycleService.restore(toState(album));
        updateLifecycle(album, expectedVersion, next, null);
        // Safe restore never restores visitor delivery, even when the item used to be public.
        albumPhotoMapper.updateDeliveryRevoked(albumId, 1);
        invalidate(album);
        return nextVersion(expectedVersion);
    }

    @Transactional(readOnly = true)
    public ContentPurgeReadiness dryRunPurge(long albumId, int expectedVersion) {
        requireAdministrator();
        AlbumEntity album = requireAlbum(albumId, expectedVersion);
        List<AdminPurgeBlockerResponse> blockers = new java.util.ArrayList<>();
        LocalDateTime now = LocalDateTime.ofInstant(clock.instant(), clock.getZone());
        if (parseLifecycle(album.getLifecycleStatus()) != LifeContentLifecycleEnum.RECYCLED) {
            blockers.add(new AdminPurgeBlockerResponse(
                "NOT_RECYCLED",
                1,
                "Album must be recycled before permanent cleanup"
            ));
        } else if (album.getPurgeAfter() == null || album.getPurgeAfter().isAfter(now)) {
            blockers.add(new AdminPurgeBlockerResponse(
                "RETENTION_ACTIVE",
                1,
                "Recorded retention period has not expired"
            ));
        }
        return new ContentPurgeReadiness(blockers.isEmpty(), album.getPurgeAfter(), blockers);
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse purge(long albumId, int expectedVersion) {
        requireAdministrator();
        AlbumEntity album = requireAlbum(albumId, expectedVersion);
        if (parseLifecycle(album.getLifecycleStatus()) != LifeContentLifecycleEnum.RECYCLED) {
            throw new BusinessException(ErrorCode.CONFLICT, "Album must be recycled before permanent cleanup");
        }
        LocalDateTime now = LocalDateTime.ofInstant(clock.instant(), clock.getZone());
        if (album.getPurgeAfter() == null || album.getPurgeAfter().isAfter(now)) {
            throw new BusinessException(ErrorCode.CONFLICT, "Album retention period has not expired");
        }
        albumPhotoMapper.tombstoneByAlbumId(albumId);
        requireUpdated(albumMapper.tombstonePurged(albumId, expectedVersion, now));
        invalidate(album);
        return nextVersion(expectedVersion);
    }

    private void invalidate(AlbumEntity album) {
        if (cacheInvalidator != null && album != null && album.getPublicSlug() != null) {
            cacheInvalidator.invalidateContentAfterCommit(PublicContentType.ALBUM, album.getPublicSlug());
        }
    }

    private void validatePublication(AlbumEntity album) {
        Long coverPhotoId = album.getCoverPhotoId();
        if (coverPhotoId == null || !albumPhotoMapper.existsActiveAssociation(album.getId(), coverPhotoId)) {
            throw new BusinessException(ErrorCode.MEDIA_NOT_READY, "Album requires an attached cover photo");
        }
        LifeContentVisibilityEnum visibility = parseVisibility(album.getVisibilityStatus());
        String deliveryScope = visibility == LifeContentVisibilityEnum.PUBLIC
            ? PUBLIC_DELIVERY_SCOPE
            : PRIVATE_DELIVERY_SCOPE;
        List<AlbumPublicationMediaRow> blockers = publicationMediaMapper.selectPublicationBlockers(
            album.getId(),
            deliveryScope,
            processorVersion,
            REQUIRED_VARIANTS
        );
        if (blockers != null && !blockers.isEmpty()) {
            AlbumPublicationMediaRow first = blockers.get(0);
            throw new BusinessException(
                ErrorCode.MEDIA_NOT_READY,
                "Album contains media that is not ready for publication",
                Map.of(
                    "photoId", first.getPhotoId(),
                    "variant", String.valueOf(first.getVariantCode()),
                    "blockingCount", blockers.size()
                )
            );
        }
    }

    private void updateLifecycle(
        AlbumEntity album,
        int expectedVersion,
        LifeContentState next,
        LocalDateTime publishTime
    ) {
        requireUpdated(albumMapper.updateLifecycle(
            album.getId(),
            expectedVersion,
            parseLifecycle(album.getLifecycleStatus()).name(),
            next.lifecycle().name(),
            publishTime,
            next.restoreLifecycle() == null ? null : next.restoreLifecycle().name(),
            toLocalDateTime(next.recycledAt()),
            toLocalDateTime(next.purgeAfter())
        ));
    }

    private LifeContentState toState(AlbumEntity album) {
        LifeContentLifecycleEnum lifecycle = parseLifecycle(album.getLifecycleStatus());
        LifeContentVisibilityEnum visibility = parseVisibility(album.getVisibilityStatus());
        if (lifecycle != LifeContentLifecycleEnum.RECYCLED) {
            return LifeContentState.active(lifecycle, visibility);
        }
        return new LifeContentState(
            lifecycle,
            visibility,
            parseLifecycle(album.getRestoreLifecycleStatus()),
            toInstant(album.getRecycleTime()),
            toInstant(album.getPurgeAfter())
        );
    }

    private AlbumEntity requireAlbum(long albumId, int expectedVersion) {
        if (albumId <= 0 || expectedVersion < 0) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Album was not found");
        }
        AlbumEntity album = albumMapper.selectById(albumId);
        if (album == null || album.getId() == null || Integer.valueOf(1).equals(album.getDeleted())) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Album was not found");
        }
        if (valueOrZero(album.getVersion()) != expectedVersion) {
            throw new BusinessException(
                ErrorCode.CONFLICT,
                "Album version changed",
                Map.of("currentVersion", valueOrZero(album.getVersion()))
            );
        }
        return album;
    }

    private void requireAdministrator() {
        LoginUser user = LoginUserContext.get().orElse(null);
        boolean admin = user != null && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
        if (!admin || !user.hasPermission(MANAGE_PERMISSION)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Life content management permission is required");
        }
    }

    private void requireNotRecycled(AlbumEntity album) {
        if (parseLifecycle(album.getLifecycleStatus()) == LifeContentLifecycleEnum.RECYCLED) {
            throw new BusinessException(ErrorCode.CONFLICT, "Recycled albums must be restored before editing");
        }
    }

    private void requireUpdated(int updated) {
        if (updated != 1) {
            throw new BusinessException(ErrorCode.CONFLICT, "Album state changed");
        }
    }

    private String requireTitle(String title) {
        String normalized = String.valueOf(title == null ? "" : title).trim();
        if (normalized.isEmpty() || normalized.length() > 256) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Album title must contain 1 to 256 characters");
        }
        return normalized;
    }

    private String normalizeSummary(String summary) {
        return summary == null ? null : summary.trim();
    }

    private LifeContentLifecycleEnum parseLifecycle(String raw) {
        try {
            return LifeContentLifecycleEnum.valueOf(String.valueOf(raw).trim().toUpperCase(Locale.ROOT));
        } catch (RuntimeException exception) {
            throw new BusinessException(ErrorCode.CONFLICT, "Album lifecycle is invalid");
        }
    }

    private LifeContentVisibilityEnum parseVisibility(String raw) {
        try {
            return LifeContentVisibilityEnum.valueOf(String.valueOf(raw).trim().toUpperCase(Locale.ROOT));
        } catch (RuntimeException exception) {
            throw new BusinessException(ErrorCode.CONFLICT, "Album visibility is invalid");
        }
    }

    private Instant toInstant(LocalDateTime value) {
        return value == null ? null : value.atZone(clock.getZone()).toInstant();
    }

    private LocalDateTime toLocalDateTime(Instant value) {
        return value == null ? null : LocalDateTime.ofInstant(value, clock.getZone());
    }

    private OptimisticVersionResponse nextVersion(int expectedVersion) {
        return OptimisticVersionResponse.of((long) expectedVersion + 1L);
    }

    private int valueOrZero(Integer value) {
        return value == null ? 0 : value;
    }

    private static long requirePositiveRetention(int retentionDays) {
        if (retentionDays <= 0) {
            throw new IllegalArgumentException("retentionDays must be positive");
        }
        return retentionDays;
    }

    private static String normalizeProcessorVersion(String value) {
        String normalized = value == null ? "" : value.trim();
        if (normalized.isEmpty()) {
            throw new IllegalArgumentException("processorVersion must not be blank");
        }
        return normalized;
    }
}
