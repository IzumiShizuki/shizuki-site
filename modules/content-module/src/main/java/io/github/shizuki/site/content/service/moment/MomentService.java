package io.github.shizuki.site.content.service.moment;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.admin.response.AdminPurgeBlockerResponse;
import io.github.shizuki.site.content.cache.PublicContentCacheInvalidator;
import io.github.shizuki.site.content.entity.MomentEntity;
import io.github.shizuki.site.content.entity.MomentPhotoEntity;
import io.github.shizuki.site.content.entity.PhotoEntity;
import io.github.shizuki.site.content.life.LifeContentLifecycleService;
import io.github.shizuki.site.content.life.LifeContentState;
import io.github.shizuki.site.content.life.ContentPurgeReadiness;
import io.github.shizuki.site.content.mapper.AlbumPublicationMediaRow;
import io.github.shizuki.site.content.mapper.MomentMapper;
import io.github.shizuki.site.content.mapper.MomentPhotoMapper;
import io.github.shizuki.site.content.mapper.MomentPublicationMediaMapper;
import io.github.shizuki.site.content.mapper.PhotoMapper;
import io.github.shizuki.site.content.model.OpaquePublicIdentifierGenerator;
import io.github.shizuki.site.content.model.PublicContentType;
import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import java.security.SecureRandom;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** Focused aggregate service for drafting, arranging, publishing and safely restoring life moments. */
@Service
public class MomentService {

    private static final String MANAGE_PERMISSION = "life.content.manage";
    private static final String PUBLIC_DELIVERY_SCOPE = "PUBLIC_MATERIALIZED";
    private static final String PRIVATE_DELIVERY_SCOPE = "PRIVATE_WORKING";
    private static final int MAX_BODY_LENGTH = 20_000;
    private static final int MAX_PHOTOS = 24;
    private static final List<String> REQUIRED_VARIANTS = List.of(
        ImageVariantTypeEnum.THUMB_WEBP.name(),
        ImageVariantTypeEnum.DISPLAY_WEBP.name(),
        ImageVariantTypeEnum.FULL_SANITIZED.name()
    );

    private final MomentMapper momentMapper;
    private final MomentPhotoMapper momentPhotoMapper;
    private final MomentPublicationMediaMapper publicationMediaMapper;
    private final PhotoMapper photoMapper;
    private final OpaquePublicIdentifierGenerator identifierGenerator;
    private final LifeContentLifecycleService lifecycleService;
    private final PublicContentCacheInvalidator cacheInvalidator;
    private final Duration retention;
    private final String processorVersion;
    private final Clock clock;
    private final SecureRandom secureRandom;

    @Autowired
    public MomentService(
        MomentMapper momentMapper,
        MomentPhotoMapper momentPhotoMapper,
        MomentPublicationMediaMapper publicationMediaMapper,
        PhotoMapper photoMapper,
        OpaquePublicIdentifierGenerator identifierGenerator,
        LifeContentLifecycleService lifecycleService,
        ObjectProvider<PublicContentCacheInvalidator> cacheInvalidatorProvider,
        @Value("${shizuki.media.photo-retention.retention-days:30}") int retentionDays,
        @Value("${shizuki.media.derivatives.processor-version:v1}") String processorVersion
    ) {
        this(
            momentMapper,
            momentPhotoMapper,
            publicationMediaMapper,
            photoMapper,
            identifierGenerator,
            lifecycleService,
            cacheInvalidatorProvider.getIfAvailable(),
            Duration.ofDays(requirePositiveRetention(retentionDays)),
            normalizeProcessorVersion(processorVersion),
            Clock.systemDefaultZone(),
            new SecureRandom()
        );
    }

    MomentService(
        MomentMapper momentMapper,
        MomentPhotoMapper momentPhotoMapper,
        MomentPublicationMediaMapper publicationMediaMapper,
        PhotoMapper photoMapper,
        OpaquePublicIdentifierGenerator identifierGenerator,
        LifeContentLifecycleService lifecycleService,
        Duration retention,
        String processorVersion,
        Clock clock,
        SecureRandom secureRandom
    ) {
        this(
            momentMapper,
            momentPhotoMapper,
            publicationMediaMapper,
            photoMapper,
            identifierGenerator,
            lifecycleService,
            null,
            retention,
            processorVersion,
            clock,
            secureRandom
        );
    }

    MomentService(
        MomentMapper momentMapper,
        MomentPhotoMapper momentPhotoMapper,
        MomentPublicationMediaMapper publicationMediaMapper,
        PhotoMapper photoMapper,
        OpaquePublicIdentifierGenerator identifierGenerator,
        LifeContentLifecycleService lifecycleService,
        PublicContentCacheInvalidator cacheInvalidator,
        Duration retention,
        String processorVersion,
        Clock clock,
        SecureRandom secureRandom
    ) {
        this.momentMapper = momentMapper;
        this.momentPhotoMapper = momentPhotoMapper;
        this.publicationMediaMapper = publicationMediaMapper;
        this.photoMapper = photoMapper;
        this.identifierGenerator = identifierGenerator;
        this.lifecycleService = lifecycleService;
        this.cacheInvalidator = cacheInvalidator;
        this.retention = retention;
        this.processorVersion = processorVersion;
        this.clock = clock;
        this.secureRandom = secureRandom;
    }

    @Transactional(rollbackFor = Exception.class)
    public MomentEntity createDraft(String body, LifeContentVisibilityEnum visibility) {
        requireAdministrator();
        MomentEntity moment = new MomentEntity();
        moment.setPublicId(identifierGenerator.generate(PublicContentType.MOMENT));
        moment.setBody(requireBody(body));
        moment.setLifecycleStatus(LifeContentLifecycleEnum.DRAFT.name());
        moment.setVisibilityStatus((visibility == null ? LifeContentVisibilityEnum.PRIVATE : visibility).name());
        moment.setFeatured(false);
        moment.setPinned(false);
        moment.setDeleted(0);
        moment.setVersion(0);
        if (momentMapper.insert(moment) != 1 || moment.getId() == null) {
            throw new BusinessException(ErrorCode.CONFLICT, "Moment draft was not created");
        }
        return moment;
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse edit(
        long momentId,
        int expectedVersion,
        String body,
        LifeContentVisibilityEnum visibility,
        boolean featured,
        boolean pinned
    ) {
        requireAdministrator();
        MomentEntity moment = requireMoment(momentId, expectedVersion);
        requireNotRecycled(moment);
        LifeContentVisibilityEnum nextVisibility = visibility == null
            ? parseVisibility(moment.getVisibilityStatus())
            : visibility;
        requireUpdated(momentMapper.updateEditorial(
            momentId,
            expectedVersion,
            requireBody(body),
            nextVisibility.name(),
            featured ? 1 : 0,
            pinned ? 1 : 0
        ));
        if (LifeContentLifecycleEnum.PUBLISHED.name().equals(moment.getLifecycleStatus())) {
            momentPhotoMapper.updateDeliveryRevoked(
                momentId,
                nextVisibility == LifeContentVisibilityEnum.PRIVATE ? 1 : 0
            );
        }
        invalidate(moment);
        return nextVersion(expectedVersion);
    }

    /** Attaches already-managed photos without creating a second original asset. */
    @Transactional(rollbackFor = Exception.class)
    public MomentPhotoMutationResult attachPhotos(
        long momentId,
        int expectedVersion,
        List<Long> requestedPhotoIds
    ) {
        requireAdministrator();
        List<Long> photoIds = normalizePhotoIds(requestedPhotoIds, false);
        MomentEntity moment = claimPhotoMutation(momentId, expectedVersion);
        requireReusablePhotos(photoIds);

        Map<Long, MomentPhotoEntity> existingByPhotoId = new HashMap<>();
        safe(momentPhotoMapper.selectAnyByMomentAndPhotoIds(momentId, photoIds))
            .forEach(association -> existingByPhotoId.put(association.getPhotoId(), association));
        int nextSort = safe(momentPhotoMapper.selectByMomentIdOrdered(momentId)).stream()
            .map(MomentPhotoEntity::getSortNum)
            .filter(value -> value != null)
            .max(Integer::compareTo)
            .orElse(-1) + 1;

        for (Long photoId : photoIds) {
            MomentPhotoEntity existing = existingByPhotoId.get(photoId);
            if (existing != null && !Integer.valueOf(1).equals(existing.getDeleted())) {
                continue;
            }
            if (existing != null) {
                requireAssociationUpdated(momentPhotoMapper.restoreAssociation(
                    momentId,
                    existing.getId(),
                    nextMediaRef(),
                    nextSort++
                ));
                continue;
            }
            MomentPhotoEntity association = new MomentPhotoEntity();
            association.setMomentId(momentId);
            association.setPhotoId(photoId);
            association.setMediaRefId(nextMediaRef());
            association.setSortNum(nextSort++);
            association.setDeliveryRevoked(true);
            association.setDeleted(0);
            association.setVersion(0);
            if (momentPhotoMapper.insert(association) != 1) {
                throw new BusinessException(ErrorCode.CONFLICT, "Moment photo was not attached");
            }
        }
        invalidate(moment);
        return photoResult(expectedVersion, momentId);
    }

    @Transactional(rollbackFor = Exception.class)
    public MomentPhotoMutationResult reorderPhotos(
        long momentId,
        int expectedVersion,
        List<Long> requestedPhotoIds
    ) {
        requireAdministrator();
        List<Long> orderedPhotoIds = normalizePhotoIds(requestedPhotoIds, true);
        MomentEntity moment = claimPhotoMutation(momentId, expectedVersion);
        List<MomentPhotoEntity> current = safe(momentPhotoMapper.selectByMomentIdOrdered(momentId));
        Map<Long, MomentPhotoEntity> currentByPhotoId = new HashMap<>();
        current.forEach(association -> currentByPhotoId.put(association.getPhotoId(), association));
        if (currentByPhotoId.size() != orderedPhotoIds.size()
            || !currentByPhotoId.keySet().equals(new HashSet<>(orderedPhotoIds))) {
            throw new BusinessException(
                ErrorCode.CONFLICT,
                "A reorder command must contain the complete current moment photo set",
                Map.of("currentPhotoIds", current.stream().map(MomentPhotoEntity::getPhotoId).toList())
            );
        }
        for (int index = 0; index < orderedPhotoIds.size(); index++) {
            MomentPhotoEntity association = currentByPhotoId.get(orderedPhotoIds.get(index));
            requireAssociationUpdated(momentPhotoMapper.updateSort(momentId, association.getId(), index));
        }
        invalidate(moment);
        return photoResult(expectedVersion, momentId);
    }

    @Transactional(rollbackFor = Exception.class)
    public MomentPhotoMutationResult detachPhotos(
        long momentId,
        int expectedVersion,
        List<Long> requestedPhotoIds
    ) {
        requireAdministrator();
        List<Long> photoIds = normalizePhotoIds(requestedPhotoIds, false);
        MomentEntity moment = claimPhotoMutation(momentId, expectedVersion);
        int detached = momentPhotoMapper.revokeAndDetach(momentId, photoIds);
        if (detached != photoIds.size()) {
            throw new BusinessException(
                ErrorCode.CONFLICT,
                "Moment photo set changed",
                Map.of("requestedCount", photoIds.size(), "detachedCount", detached)
            );
        }
        invalidate(moment);
        return photoResult(expectedVersion, momentId);
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse publish(long momentId, int expectedVersion) {
        requireAdministrator();
        MomentEntity moment = requireMoment(momentId, expectedVersion);
        LifeContentState next = lifecycleService.publish(toState(moment));
        validatePublication(moment);
        LocalDateTime now = LocalDateTime.ofInstant(clock.instant(), clock.getZone());
        updateLifecycle(moment, expectedVersion, next, now);
        boolean visitorDelivery = parseVisibility(moment.getVisibilityStatus()) != LifeContentVisibilityEnum.PRIVATE;
        momentPhotoMapper.updateDeliveryRevoked(momentId, visitorDelivery ? 0 : 1);
        invalidate(moment);
        return nextVersion(expectedVersion);
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse archive(long momentId, int expectedVersion) {
        requireAdministrator();
        MomentEntity moment = requireMoment(momentId, expectedVersion);
        LifeContentState next = lifecycleService.archive(toState(moment));
        momentPhotoMapper.updateDeliveryRevoked(momentId, 1);
        updateLifecycle(moment, expectedVersion, next, null);
        invalidate(moment);
        return nextVersion(expectedVersion);
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse recycle(long momentId, int expectedVersion) {
        requireAdministrator();
        MomentEntity moment = requireMoment(momentId, expectedVersion);
        LifeContentState next = lifecycleService.recycle(toState(moment), clock.instant(), retention);
        momentPhotoMapper.updateDeliveryRevoked(momentId, 1);
        updateLifecycle(moment, expectedVersion, next, null);
        invalidate(moment);
        return nextVersion(expectedVersion);
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse restore(long momentId, int expectedVersion) {
        requireAdministrator();
        MomentEntity moment = requireMoment(momentId, expectedVersion);
        LifeContentState next = lifecycleService.restore(toState(moment));
        updateLifecycle(moment, expectedVersion, next, null);
        momentPhotoMapper.updateDeliveryRevoked(momentId, 1);
        invalidate(moment);
        return nextVersion(expectedVersion);
    }

    @Transactional(readOnly = true)
    public ContentPurgeReadiness dryRunPurge(long momentId, int expectedVersion) {
        requireAdministrator();
        MomentEntity moment = requireMoment(momentId, expectedVersion);
        List<AdminPurgeBlockerResponse> blockers = new ArrayList<>();
        LocalDateTime now = LocalDateTime.ofInstant(clock.instant(), clock.getZone());
        if (parseLifecycle(moment.getLifecycleStatus()) != LifeContentLifecycleEnum.RECYCLED) {
            blockers.add(new AdminPurgeBlockerResponse(
                "NOT_RECYCLED",
                1,
                "Moment must be recycled before permanent cleanup"
            ));
        } else if (moment.getPurgeAfter() == null || moment.getPurgeAfter().isAfter(now)) {
            blockers.add(new AdminPurgeBlockerResponse(
                "RETENTION_ACTIVE",
                1,
                "Recorded retention period has not expired"
            ));
        }
        return new ContentPurgeReadiness(blockers.isEmpty(), moment.getPurgeAfter(), blockers);
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse purge(long momentId, int expectedVersion) {
        requireAdministrator();
        MomentEntity moment = requireMoment(momentId, expectedVersion);
        if (parseLifecycle(moment.getLifecycleStatus()) != LifeContentLifecycleEnum.RECYCLED) {
            throw new BusinessException(ErrorCode.CONFLICT, "Moment must be recycled before permanent cleanup");
        }
        LocalDateTime now = LocalDateTime.ofInstant(clock.instant(), clock.getZone());
        if (moment.getPurgeAfter() == null || moment.getPurgeAfter().isAfter(now)) {
            throw new BusinessException(ErrorCode.CONFLICT, "Moment retention period has not expired");
        }
        momentPhotoMapper.tombstoneByMomentId(momentId);
        requireUpdated(momentMapper.tombstonePurged(momentId, expectedVersion, now));
        invalidate(moment);
        return nextVersion(expectedVersion);
    }

    private void invalidate(MomentEntity moment) {
        if (cacheInvalidator != null && moment != null && moment.getPublicId() != null) {
            cacheInvalidator.invalidateContentAfterCommit(PublicContentType.MOMENT, moment.getPublicId());
        }
    }

    private void validatePublication(MomentEntity moment) {
        LifeContentVisibilityEnum visibility = parseVisibility(moment.getVisibilityStatus());
        String deliveryScope = visibility == LifeContentVisibilityEnum.PUBLIC
            ? PUBLIC_DELIVERY_SCOPE
            : PRIVATE_DELIVERY_SCOPE;
        List<AlbumPublicationMediaRow> blockers = publicationMediaMapper.selectPublicationBlockers(
            moment.getId(),
            deliveryScope,
            processorVersion,
            REQUIRED_VARIANTS
        );
        if (blockers != null && !blockers.isEmpty()) {
            AlbumPublicationMediaRow first = blockers.get(0);
            throw new BusinessException(
                ErrorCode.MEDIA_NOT_READY,
                "Moment contains media that is not ready for publication",
                Map.of(
                    "photoId", first.getPhotoId(),
                    "variant", String.valueOf(first.getVariantCode()),
                    "blockingCount", blockers.size()
                )
            );
        }
    }

    private MomentEntity claimPhotoMutation(long momentId, int expectedVersion) {
        MomentEntity moment = requireMoment(momentId, expectedVersion);
        requireNotRecycled(moment);
        if (momentMapper.claimPhotoCompositionMutation(momentId, expectedVersion) != 1) {
            MomentEntity current = momentMapper.selectById(momentId);
            throw versionConflict(current == null ? valueOrZero(moment.getVersion()) : valueOrZero(current.getVersion()));
        }
        return moment;
    }

    private void requireReusablePhotos(List<Long> photoIds) {
        List<PhotoEntity> photos = safe(photoMapper.selectReusableByIds(photoIds));
        Set<Long> reusableIds = new HashSet<>();
        photos.forEach(photo -> reusableIds.add(photo.getId()));
        if (reusableIds.size() != photoIds.size() || !reusableIds.containsAll(photoIds)) {
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "One or more photos are unavailable for reuse",
                Map.of("unavailablePhotoIds", photoIds.stream().filter(id -> !reusableIds.contains(id)).toList())
            );
        }
    }

    private void updateLifecycle(
        MomentEntity moment,
        int expectedVersion,
        LifeContentState next,
        LocalDateTime publishTime
    ) {
        requireUpdated(momentMapper.updateLifecycle(
            moment.getId(),
            expectedVersion,
            parseLifecycle(moment.getLifecycleStatus()).name(),
            next.lifecycle().name(),
            publishTime,
            next.restoreLifecycle() == null ? null : next.restoreLifecycle().name(),
            toLocalDateTime(next.recycledAt()),
            toLocalDateTime(next.purgeAfter())
        ));
    }

    private LifeContentState toState(MomentEntity moment) {
        LifeContentLifecycleEnum lifecycle = parseLifecycle(moment.getLifecycleStatus());
        LifeContentVisibilityEnum visibility = parseVisibility(moment.getVisibilityStatus());
        if (lifecycle != LifeContentLifecycleEnum.RECYCLED) {
            return LifeContentState.active(lifecycle, visibility);
        }
        return new LifeContentState(
            lifecycle,
            visibility,
            parseLifecycle(moment.getRestoreLifecycleStatus()),
            toInstant(moment.getRecycleTime()),
            toInstant(moment.getPurgeAfter())
        );
    }

    private MomentEntity requireMoment(long momentId, int expectedVersion) {
        if (momentId <= 0 || expectedVersion < 0) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Moment was not found");
        }
        MomentEntity moment = momentMapper.selectById(momentId);
        if (moment == null || moment.getId() == null || Integer.valueOf(1).equals(moment.getDeleted())) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Moment was not found");
        }
        int currentVersion = valueOrZero(moment.getVersion());
        if (currentVersion != expectedVersion) {
            throw versionConflict(currentVersion);
        }
        return moment;
    }

    private BusinessException versionConflict(int currentVersion) {
        return new BusinessException(
            ErrorCode.CONFLICT,
            "Moment version changed",
            Map.of("currentVersion", currentVersion)
        );
    }

    private void requireAdministrator() {
        LoginUser user = LoginUserContext.get().orElse(null);
        boolean admin = user != null && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
        if (!admin || !user.hasPermission(MANAGE_PERMISSION)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Life content management permission is required");
        }
    }

    private void requireNotRecycled(MomentEntity moment) {
        if (parseLifecycle(moment.getLifecycleStatus()) == LifeContentLifecycleEnum.RECYCLED) {
            throw new BusinessException(ErrorCode.CONFLICT, "Recycled moments must be restored before editing");
        }
    }

    private String requireBody(String body) {
        String normalized = body == null ? "" : body.trim();
        if (normalized.isEmpty() || normalized.length() > MAX_BODY_LENGTH) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Moment body must contain 1 to 20000 characters");
        }
        return normalized;
    }

    private List<Long> normalizePhotoIds(List<Long> requested, boolean allowEmpty) {
        if (requested == null || (!allowEmpty && requested.isEmpty()) || requested.size() > MAX_PHOTOS) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Moment photo batch is invalid");
        }
        Set<Long> seen = new HashSet<>();
        for (Long photoId : requested) {
            if (photoId == null || photoId <= 0 || !seen.add(photoId)) {
                throw new BusinessException(ErrorCode.BAD_REQUEST, "Moment photo batch contains an invalid duplicate");
            }
        }
        return List.copyOf(requested);
    }

    private LifeContentLifecycleEnum parseLifecycle(String raw) {
        try {
            return LifeContentLifecycleEnum.valueOf(String.valueOf(raw).trim().toUpperCase(Locale.ROOT));
        } catch (RuntimeException exception) {
            throw new BusinessException(ErrorCode.CONFLICT, "Moment lifecycle is invalid");
        }
    }

    private LifeContentVisibilityEnum parseVisibility(String raw) {
        try {
            return LifeContentVisibilityEnum.valueOf(String.valueOf(raw).trim().toUpperCase(Locale.ROOT));
        } catch (RuntimeException exception) {
            throw new BusinessException(ErrorCode.CONFLICT, "Moment visibility is invalid");
        }
    }

    private void requireUpdated(int updated) {
        if (updated != 1) {
            throw new BusinessException(ErrorCode.CONFLICT, "Moment state changed");
        }
    }

    private void requireAssociationUpdated(int updated) {
        if (updated != 1) {
            throw new BusinessException(ErrorCode.CONFLICT, "Moment photo set changed");
        }
    }

    private String nextMediaRef() {
        return OpaqueMediaReference.generate(secureRandom);
    }

    private MomentPhotoMutationResult photoResult(int expectedVersion, long momentId) {
        return new MomentPhotoMutationResult(
            nextVersion(expectedVersion),
            safe(momentPhotoMapper.selectByMomentIdOrdered(momentId))
        );
    }

    private OptimisticVersionResponse nextVersion(int expectedVersion) {
        return OptimisticVersionResponse.of((long) expectedVersion + 1L);
    }

    private int valueOrZero(Integer value) {
        return value == null ? 0 : value;
    }

    private Instant toInstant(LocalDateTime value) {
        return value == null ? null : value.atZone(clock.getZone()).toInstant();
    }

    private LocalDateTime toLocalDateTime(Instant value) {
        return value == null ? null : LocalDateTime.ofInstant(value, clock.getZone());
    }

    private <T> List<T> safe(List<T> values) {
        return values == null ? List.of() : values;
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
