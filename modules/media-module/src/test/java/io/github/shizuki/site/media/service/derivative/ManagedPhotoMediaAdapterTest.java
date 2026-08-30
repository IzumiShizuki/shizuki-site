package io.github.shizuki.site.media.service.derivative;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.model.AssetKindEnum;
import io.github.shizuki.site.media.model.AssetVisibilityEnum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ManagedPhotoMediaAdapterTest {

    @Mock
    private MediaAssetMapper assetMapper;
    @Mock
    private MediaDerivativePlanService derivativePlanService;

    private ManagedPhotoMediaAdapter adapter;

    @BeforeEach
    void setUp() {
        adapter = new ManagedPhotoMediaAdapter(assetMapper, derivativePlanService);
    }

    @Test
    void acceptsOnlyAnOwnedPrivateImage() {
        when(assetMapper.selectById(12L)).thenReturn(asset(7L, AssetVisibilityEnum.PRIVATE.getCode(), "image/webp"));

        adapter.requireOwnedPrivateImage(12L, 7L);

        verify(assetMapper).selectById(12L);
    }

    @Test
    void rejectsAStorageValidImageOwnedByAnotherUser() {
        when(assetMapper.selectById(12L)).thenReturn(asset(8L, AssetVisibilityEnum.PRIVATE.getCode(), "image/jpeg"));

        assertThatThrownBy(() -> adapter.requireOwnedPrivateImage(12L, 7L))
            .isInstanceOfSatisfying(BusinessException.class, exception ->
                org.assertj.core.api.Assertions.assertThat(exception.getErrorCode()).isEqualTo(ErrorCode.BAD_REQUEST));
        verify(derivativePlanService, never()).enqueueForPhoto(12L, MediaDerivativeDeliveryScope.PRIVATE_WORKING);
    }

    @Test
    void schedulesOnlyThePrivateWorkingPlan() {
        adapter.enqueuePrivateWorkingDerivatives(12L);

        verify(derivativePlanService).enqueueForPhoto(12L, MediaDerivativeDeliveryScope.PRIVATE_WORKING);
    }

    @Test
    void schedulesPublicMaterializationOnlyWhenExplicitlyRequested() {
        adapter.enqueuePublicMaterializedDerivatives(12L);

        verify(derivativePlanService).enqueueForPhoto(12L, MediaDerivativeDeliveryScope.PUBLIC_MATERIALIZED);
    }

    private MediaAssetEntity asset(long owner, int visibility, String contentType) {
        MediaAssetEntity asset = new MediaAssetEntity();
        asset.setId(12L);
        asset.setUserId(owner);
        asset.setVisibilityCode(visibility);
        asset.setAssetKindCode(AssetKindEnum.STATIC_IMAGE.getCode());
        asset.setContentTypeText(contentType);
        asset.setDeleted(0);
        return asset;
    }
}
