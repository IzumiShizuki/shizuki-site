package io.github.shizuki.site.media.service.revocation;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.site.life.model.LifeContentLifecycleEnum;
import io.github.shizuki.site.life.model.LifeContentVisibilityEnum;
import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.mapper.MediaAssetVariantMapper;
import io.github.shizuki.site.media.mapper.MediaAssociationMapper;
import io.github.shizuki.site.media.model.AssetAuditStatusEnum;
import io.github.shizuki.site.media.model.AssetVisibilityEnum;
import io.github.shizuki.site.media.model.ImageDerivativeStatusEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import io.github.shizuki.site.media.service.authorization.MediaAssociationRow;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 在内容状态变为非公开之前先撤销关联路由，并仅在无其他公开引用时删除共享公开派生。
 */
@Service
public class MediaPublicDeliveryRevocationService {

    private final MediaAssociationMapper associationMapper;
    private final MediaAssetVariantMapper variantMapper;
    private final MediaAssetMapper assetMapper;
    private final ObjectStorageClient storageClient;
    private final MediaRouteCacheInvalidator cacheInvalidator;
    private final MediaDerivativeFeatureProperties derivativeProperties;
    private final MediaStorageProperties storageProperties;

    public MediaPublicDeliveryRevocationService(MediaAssociationMapper associationMapper,
                                                MediaAssetVariantMapper variantMapper,
                                                MediaAssetMapper assetMapper,
                                                ObjectStorageClient storageClient,
                                                MediaRouteCacheInvalidator cacheInvalidator,
                                                MediaDerivativeFeatureProperties derivativeProperties,
                                                MediaStorageProperties storageProperties) {
        this.associationMapper = associationMapper;
        this.variantMapper = variantMapper;
        this.assetMapper = assetMapper;
        this.storageClient = storageClient;
        this.cacheInvalidator = cacheInvalidator;
        this.derivativeProperties = derivativeProperties;
        this.storageProperties = storageProperties;
    }

    /**
     * 返回成功后，调用方才可以提交相册/动态的私有、归档或回收状态。
     * 任一步失败都保持关联 fail-closed，允许使用当前版本幂等重试。
     */
    public MediaDeliveryRevocationResult revokeBeforeRestriction(String mediaRef,
                                                                 int expectedAssociationVersion) {
        MediaAssociationRow association = requireCanonicalAssociation(mediaRef);
        if (valueOrZero(association.getAssociationVersion()) != expectedAssociationVersion
            || !isRestrictableState(association)) {
            throw conflict();
        }

        int currentAssociationVersion = expectedAssociationVersion;
        if (!Boolean.TRUE.equals(association.getDeliveryRevoked())) {
            int changed = revokeAssociation(association, expectedAssociationVersion);
            if (changed != 1) {
                throw conflict();
            }
            currentAssociationVersion++;
        }

        List<String> paths = mediaPaths(mediaRef);
        cacheInvalidator.invalidate(paths);

        long remaining = associationMapper.countOtherEligiblePublicAssociations(
            association.getSourceAssetId(),
            association.getAssociationType(),
            association.getAssociationId()
        );
        int revokedObjects = remaining > 0 ? 0 : revokeUnreferencedPublicObjects(association.getSourceAssetId());
        return new MediaDeliveryRevocationResult(
            mediaRef,
            currentAssociationVersion,
            remaining,
            paths.size(),
            revokedObjects
        );
    }

    private int revokeUnreferencedPublicObjects(Long sourceAssetId) {
        List<MediaAssetVariantEntity> variants = variantMapper.findRevocablePublicBySource(
            sourceAssetId,
            derivativeProperties.getProcessorVersion()
        );
        if (variants == null || variants.isEmpty()) {
            return 0;
        }
        int revoked = 0;
        for (MediaAssetVariantEntity variant : variants) {
            int version = valueOrZero(variant.getVersion());
            if (ImageDerivativeStatusEnum.READY.name().equals(variant.getProcessStatus())) {
                if (variantMapper.markRevoking(variant.getId(), version) != 1) {
                    throw conflict();
                }
                version++;
            } else if (!ImageDerivativeStatusEnum.REVOKING.name().equals(variant.getProcessStatus())) {
                continue;
            }

            MediaAssetEntity asset = assetMapper.selectById(variant.getVariantAssetId());
            requireDeletablePublicDerivative(asset);
            try {
                storageClient.deleteObject(asset.getBucketName(), asset.getObjectKey());
            } catch (RuntimeException exception) {
                throw new BusinessException(ErrorCode.UPSTREAM_UNAVAILABLE, "Media revocation is incomplete");
            }
            if (variantMapper.markRevoked(variant.getId(), version) != 1) {
                throw conflict();
            }
            revoked++;
        }
        return revoked;
    }

    private MediaAssociationRow requireCanonicalAssociation(String mediaRef) {
        if (!OpaqueMediaReference.isValid(mediaRef)) {
            throw notFound();
        }
        List<MediaAssociationRow> rows = associationMapper.findByMediaRef(mediaRef);
        if (rows == null || rows.size() != 1 || rows.get(0) == null) {
            throw notFound();
        }
        return rows.get(0);
    }

    private int revokeAssociation(MediaAssociationRow row, int expectedVersion) {
        return switch (row.getAssociationType()) {
            case "ALBUM" -> associationMapper.revokeAlbumDelivery(row.getAssociationId(), expectedVersion);
            case "MOMENT" -> associationMapper.revokeMomentDelivery(row.getAssociationId(), expectedVersion);
            default -> throw notFound();
        };
    }

    private boolean isRestrictableState(MediaAssociationRow row) {
        return row.getAssociationId() != null
            && row.getSourceAssetId() != null
            && LifeContentLifecycleEnum.PUBLISHED.name().equals(row.getLifecycleStatus())
            && (LifeContentVisibilityEnum.PUBLIC.name().equals(row.getVisibilityStatus())
                || LifeContentVisibilityEnum.UNLISTED.name().equals(row.getVisibilityStatus()));
    }

    private void requireDeletablePublicDerivative(MediaAssetEntity asset) {
        if (asset == null || Integer.valueOf(1).equals(asset.getDeleted())
            || asset.getId() == null || !StringUtils.hasText(asset.getObjectKey())
            || !storageProperties.getPublicBucket().equals(asset.getBucketName())
            || !Integer.valueOf(AssetVisibilityEnum.PUBLIC.getCode()).equals(asset.getVisibilityCode())
            || !AssetAuditStatusEnum.APPROVED.name().equals(asset.getAuditStatus())) {
            throw conflict();
        }
    }

    private List<String> mediaPaths(String mediaRef) {
        return Arrays.stream(ImageVariantTypeEnum.values())
            .map(variant -> "/api/v1/media/" + mediaRef + "/variants/" + variant.name())
            .toList();
    }

    private int valueOrZero(Integer value) {
        return value == null ? 0 : value;
    }

    private BusinessException notFound() {
        return new BusinessException(ErrorCode.NOT_FOUND, "Media is unavailable");
    }

    private BusinessException conflict() {
        return new BusinessException(ErrorCode.CONFLICT, "Media authorization state changed; retry with current data");
    }
}
