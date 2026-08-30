package io.github.shizuki.site.media.service.retention;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.site.admin.response.OptimisticVersionResponse;
import io.github.shizuki.site.media.config.PhotoRetentionProperties;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.mapper.MediaAssetVariantMapper;
import io.github.shizuki.site.media.mapper.PhotoRetentionMapper;
import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.response.PhotoPurgeBlockerResponse;
import io.github.shizuki.site.media.response.PhotoPurgeDryRunResponse;
import io.github.shizuki.site.media.response.PhotoRecycleResponse;
import io.github.shizuki.site.media.service.revocation.MediaRouteCacheInvalidator;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 照片回收、恢复与永久清理 dry-run。首期不包含任何定时或自动物理删除入口。
 */
@Service
public class PhotoRetentionService {

    private static final String MANAGE_PERMISSION = "life.content.manage";

    private final PhotoRetentionMapper retentionMapper;
    private final MediaAssetVariantMapper variantMapper;
    private final MediaAssetMapper assetMapper;
    private final MediaRouteCacheInvalidator cacheInvalidator;
    private final ObjectStorageClient storageClient;
    private final PhotoRetentionProperties properties;
    private final Clock clock;

    @Autowired
    public PhotoRetentionService(PhotoRetentionMapper retentionMapper,
                                 MediaAssetVariantMapper variantMapper,
                                 MediaAssetMapper assetMapper,
                                 MediaRouteCacheInvalidator cacheInvalidator,
                                 PhotoRetentionProperties properties,
                                 ObjectStorageClient storageClient) {
        this(
            retentionMapper,
            variantMapper,
            assetMapper,
            cacheInvalidator,
            properties,
            storageClient,
            Clock.systemDefaultZone()
        );
    }

    PhotoRetentionService(PhotoRetentionMapper retentionMapper,
                          MediaAssetVariantMapper variantMapper,
                          MediaAssetMapper assetMapper,
                          MediaRouteCacheInvalidator cacheInvalidator,
                          PhotoRetentionProperties properties,
                          ObjectStorageClient storageClient,
                          Clock clock) {
        this.retentionMapper = retentionMapper;
        this.variantMapper = variantMapper;
        this.assetMapper = assetMapper;
        this.cacheInvalidator = cacheInvalidator;
        this.properties = properties;
        this.storageClient = storageClient;
        this.clock = clock;
    }

    @Transactional(rollbackFor = Exception.class)
    public PhotoRecycleResponse recycle(long photoId, int expectedVersion) {
        requireAdministrator();
        PhotoRetentionRow photo = requirePhoto(photoId);
        requireVersion(photo, expectedVersion);
        if (photo.getRecycleTime() != null) {
            throw new BusinessException(ErrorCode.CONFLICT, "Photo is already recycled");
        }
        LocalDateTime recycledAt = LocalDateTime.now(clock);
        LocalDateTime purgeAfter = recycledAt.plusDays(properties.getRetentionDays());
        if (retentionMapper.recycle(photoId, expectedVersion, recycledAt, purgeAfter) != 1) {
            throw conflict();
        }
        invalidateAssociatedRoutes(photoId);
        int nextVersion = expectedVersion + 1;
        return new PhotoRecycleResponse(
            photoId,
            nextVersion,
            OptimisticVersionResponse.toEtag(nextVersion),
            recycledAt,
            purgeAfter
        );
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse restore(long photoId, int expectedVersion) {
        requireAdministrator();
        PhotoRetentionRow photo = requirePhoto(photoId);
        requireVersion(photo, expectedVersion);
        if (photo.getRecycleTime() == null || photo.getPurgeAfter() == null) {
            throw new BusinessException(ErrorCode.CONFLICT, "Photo is not recycled");
        }
        if (retentionMapper.restore(photoId, expectedVersion) != 1) {
            throw conflict();
        }
        return OptimisticVersionResponse.of((long) expectedVersion + 1L);
    }

    @Transactional(readOnly = true)
    public PhotoPurgeDryRunResponse dryRunPurge(long photoId, int expectedVersion) {
        requireAdministrator();
        PhotoRetentionRow photo = requirePhoto(photoId);
        requireVersion(photo, expectedVersion);

        List<PhotoPurgeBlockerResponse> blockers = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now(clock);
        if (photo.getRecycleTime() == null || photo.getPurgeAfter() == null) {
            blockers.add(blocker("NOT_RECYCLED", 1, "Photo must be recycled before permanent cleanup"));
        } else if (photo.getPurgeAfter().isAfter(now)) {
            blockers.add(blocker("RETENTION_ACTIVE", 1, "Recorded retention period has not expired"));
        }

        long references = retentionMapper.countNonPurgedContentReferences(photoId);
        if (references > 0) {
            blockers.add(blocker(
                "CONTENT_REFERENCES",
                references,
                "Non-purged albums or moments still reference this photo"
            ));
        }
        long otherOwners = photo.getOriginalAssetId() == null
            ? 0
            : retentionMapper.countOtherPhotoOwners(photoId, photo.getOriginalAssetId());
        if (otherOwners > 0) {
            blockers.add(blocker(
                "SHARED_ORIGINAL",
                otherOwners,
                "Another managed photo still owns the same original"
            ));
        }

        MediaAssetEntity original = photo.getOriginalAssetId() == null
            ? null
            : assetMapper.selectById(photo.getOriginalAssetId());
        if (original == null || Integer.valueOf(1).equals(original.getDeleted())) {
            blockers.add(blocker("ORIGINAL_MISSING", 1, "Original asset metadata is unavailable"));
        }

        List<MediaAssetVariantEntity> variants = photo.getOriginalAssetId() == null
            ? List.of()
            : safeVariants(variantMapper.findAllBySource(photo.getOriginalAssetId()));
        long activeWorkers = variants.stream()
            .filter(variant -> ImageDerivativeStatusEnum.PROCESSING.name().equals(variant.getProcessStatus())
                || ImageDerivativeStatusEnum.REVOKING.name().equals(variant.getProcessStatus()))
            .count();
        if (activeWorkers > 0) {
            blockers.add(blocker(
                "DERIVATIVE_ACTIVITY",
                activeWorkers,
                "Derivative processing or revocation is still active"
            ));
        }

        return new PhotoPurgeDryRunResponse(
            photoId,
            expectedVersion,
            blockers.isEmpty(),
            photo.getPurgeAfter(),
            variants.size(),
            blockers
        );
    }

    @Transactional(rollbackFor = Exception.class)
    public OptimisticVersionResponse purge(long photoId, int expectedVersion) {
        PhotoPurgeDryRunResponse readiness = dryRunPurge(photoId, expectedVersion);
        if (!readiness.eligible()) {
            throw new BusinessException(
                ErrorCode.CONFLICT,
                "Photo is not eligible for permanent cleanup",
                Map.of("blockers", readiness.blockers())
            );
        }

        PhotoRetentionRow photo = requirePhoto(photoId);
        LocalDateTime now = LocalDateTime.now(clock);
        List<MediaAssetVariantEntity> variants = safeVariants(
            variantMapper.findAllBySource(photo.getOriginalAssetId())
        );
        Map<Long, MediaAssetEntity> assets = collectAssets(photo.getOriginalAssetId(), variants);

        if (retentionMapper.tombstonePurged(photoId, expectedVersion, now) != 1) {
            throw conflict();
        }
        invalidateAssociatedRoutes(photoId);
        variantMapper.tombstoneBySource(photo.getOriginalAssetId(), now);
        for (MediaAssetEntity asset : assets.values()) {
            if (assetMapper.tombstonePurgedAsset(asset.getId(), now) != 1) {
                throw conflict();
            }
        }
        for (MediaAssetEntity asset : assets.values()) {
            deleteStorageObject(asset);
        }
        return OptimisticVersionResponse.of((long) expectedVersion + 1L);
    }

    private Map<Long, MediaAssetEntity> collectAssets(
        Long originalAssetId,
        List<MediaAssetVariantEntity> variants
    ) {
        Map<Long, MediaAssetEntity> assets = new LinkedHashMap<>();
        addAsset(assets, originalAssetId);
        for (MediaAssetVariantEntity variant : variants) {
            addAsset(assets, variant.getVariantAssetId());
        }
        return assets;
    }

    private void addAsset(Map<Long, MediaAssetEntity> assets, Long assetId) {
        if (assetId == null || assets.containsKey(assetId)) {
            return;
        }
        MediaAssetEntity asset = assetMapper.selectById(assetId);
        if (asset != null && !Integer.valueOf(1).equals(asset.getDeleted())) {
            assets.put(assetId, asset);
        }
    }

    private void deleteStorageObject(MediaAssetEntity asset) {
        if (asset.getBucketName() == null || asset.getBucketName().isBlank()
            || asset.getObjectKey() == null || asset.getObjectKey().isBlank()) {
            throw new BusinessException(ErrorCode.CONFLICT, "Media storage identity is unavailable");
        }
        storageClient.deleteObject(asset.getBucketName(), asset.getObjectKey());
    }

    private void invalidateAssociatedRoutes(long photoId) {
        List<String> mediaRefs = retentionMapper.findAssociatedMediaRefs(photoId);
        if (mediaRefs == null || mediaRefs.isEmpty()) {
            return;
        }
        List<String> paths = mediaRefs.stream()
            .filter(ref -> ref != null && !ref.isBlank())
            .flatMap(ref -> java.util.Arrays.stream(ImageVariantTypeEnum.values())
                .map(variant -> "/api/v1/media/" + ref + "/variants/" + variant.name()))
            .distinct()
            .toList();
        if (!paths.isEmpty()) {
            cacheInvalidator.invalidate(paths);
        }
    }

    private List<MediaAssetVariantEntity> safeVariants(List<MediaAssetVariantEntity> variants) {
        return variants == null ? List.of() : List.copyOf(variants);
    }

    private PhotoPurgeBlockerResponse blocker(String code, long count, String message) {
        return new PhotoPurgeBlockerResponse(code, count, message);
    }

    private PhotoRetentionRow requirePhoto(long photoId) {
        if (photoId <= 0) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Photo was not found");
        }
        PhotoRetentionRow photo = retentionMapper.findManagedById(photoId);
        if (photo == null || photo.getPhotoId() == null || photo.getOriginalAssetId() == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND, "Photo was not found");
        }
        return photo;
    }

    private void requireVersion(PhotoRetentionRow photo, int expectedVersion) {
        if (expectedVersion < 0 || valueOrZero(photo.getVersion()) != expectedVersion) {
            throw conflict();
        }
    }

    private void requireAdministrator() {
        LoginUser user = LoginUserContext.get().orElse(null);
        boolean admin = user != null && user.getGroups().stream().anyMatch("ADMIN"::equalsIgnoreCase);
        if (!admin || !user.hasPermission(MANAGE_PERMISSION)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Life content management permission is required");
        }
    }

    private int valueOrZero(Integer value) {
        return value == null ? 0 : value;
    }

    private BusinessException conflict() {
        return new BusinessException(ErrorCode.CONFLICT, "Photo retention state changed");
    }
}
