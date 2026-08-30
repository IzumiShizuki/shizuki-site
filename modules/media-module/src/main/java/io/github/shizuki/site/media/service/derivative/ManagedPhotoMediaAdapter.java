package io.github.shizuki.site.media.service.derivative;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.model.AssetKindEnum;
import io.github.shizuki.site.media.model.AssetVisibilityEnum;
import io.github.shizuki.site.media.port.ManagedPhotoMediaPort;
import java.util.Objects;
import org.springframework.stereotype.Service;

/** Media-owned implementation of managed-photo registration checks and private derivative plans. */
@Service
public class ManagedPhotoMediaAdapter implements ManagedPhotoMediaPort {

    private final MediaAssetMapper assetMapper;
    private final MediaDerivativePlanService derivativePlanService;

    public ManagedPhotoMediaAdapter(
        MediaAssetMapper assetMapper,
        MediaDerivativePlanService derivativePlanService
    ) {
        this.assetMapper = assetMapper;
        this.derivativePlanService = derivativePlanService;
    }

    @Override
    public void requireOwnedPrivateImage(long assetId, long actorUserId) {
        MediaAssetEntity asset = assetId <= 0 ? null : assetMapper.selectById(assetId);
        boolean imageKind = asset != null
            && (Objects.equals(asset.getAssetKindCode(), AssetKindEnum.STATIC_IMAGE.getCode())
                || Objects.equals(asset.getAssetKindCode(), AssetKindEnum.ANIMATED_IMAGE.getCode()));
        boolean imageType = asset != null
            && asset.getContentTypeText() != null
            && asset.getContentTypeText().toLowerCase().startsWith("image/");
        if (asset == null
            || Integer.valueOf(1).equals(asset.getDeleted())
            || actorUserId <= 0
            || !Objects.equals(asset.getUserId(), actorUserId)
            || !Objects.equals(asset.getVisibilityCode(), AssetVisibilityEnum.PRIVATE.getCode())
            || !imageKind
            || !imageType) {
            throw new BusinessException(
                ErrorCode.BAD_REQUEST,
                "Managed photos require an owned private image asset"
            );
        }
    }

    @Override
    public void enqueuePrivateWorkingDerivatives(long assetId) {
        derivativePlanService.enqueueForPhoto(assetId, MediaDerivativeDeliveryScope.PRIVATE_WORKING);
    }

    @Override
    public void enqueuePublicMaterializedDerivatives(long assetId) {
        derivativePlanService.enqueueForPhoto(assetId, MediaDerivativeDeliveryScope.PUBLIC_MATERIALIZED);
    }
}
