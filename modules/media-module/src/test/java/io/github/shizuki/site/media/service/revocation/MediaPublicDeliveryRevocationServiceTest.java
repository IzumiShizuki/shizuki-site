package io.github.shizuki.site.media.service.revocation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.mapper.MediaAssetVariantMapper;
import io.github.shizuki.site.media.mapper.MediaAssociationMapper;
import io.github.shizuki.site.media.model.OpaqueMediaReference;
import io.github.shizuki.site.media.service.authorization.MediaAssociationRow;
import java.security.SecureRandom;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

class MediaPublicDeliveryRevocationServiceTest {

    private static final String MEDIA_REF = OpaqueMediaReference.generate(new SecureRandom());

    private MediaAssociationMapper associationMapper;
    private MediaAssetVariantMapper variantMapper;
    private MediaAssetMapper assetMapper;
    private ObjectStorageClient storageClient;
    private MediaRouteCacheInvalidator invalidator;
    private MediaDerivativeFeatureProperties derivativeProperties;
    private MediaStorageProperties storageProperties;
    private MediaAssociationRow association;

    @BeforeEach
    void setUp() {
        associationMapper = Mockito.mock(MediaAssociationMapper.class);
        variantMapper = Mockito.mock(MediaAssetVariantMapper.class);
        assetMapper = Mockito.mock(MediaAssetMapper.class);
        storageClient = Mockito.mock(ObjectStorageClient.class);
        invalidator = Mockito.mock(MediaRouteCacheInvalidator.class);
        derivativeProperties = new MediaDerivativeFeatureProperties();
        derivativeProperties.setProcessorVersion("v7");
        storageProperties = new MediaStorageProperties();
        storageProperties.setPublicBucket("public-derivatives");
        association = association(false, 2);
        when(associationMapper.findByMediaRef(MEDIA_REF)).thenReturn(List.of(association));
        when(associationMapper.revokeAlbumDelivery(7L, 2)).thenReturn(1);
    }

    @Test
    void retainsSharedObjectsButRevokesAndInvalidatesTheExactAssociationRoutes() {
        when(associationMapper.countOtherEligiblePublicAssociations(42L, "ALBUM", 7L)).thenReturn(1L);

        MediaDeliveryRevocationResult result = service().revokeBeforeRestriction(MEDIA_REF, 2);

        assertThat(result.associationVersion()).isEqualTo(3);
        assertThat(result.remainingPublicReferences()).isEqualTo(1);
        assertThat(result.invalidatedRouteCount()).isEqualTo(4);
        assertThat(result.revokedPublicObjectCount()).isZero();
        verify(invalidator).invalidate(Mockito.argThat(paths -> paths.size() == 4
            && paths.stream().allMatch(path -> path.startsWith("/api/v1/media/" + MEDIA_REF + "/"))));
        verify(variantMapper, never()).findRevocablePublicBySource(Mockito.anyLong(), Mockito.anyString());
        verify(storageClient, never()).deleteObject(Mockito.anyString(), Mockito.anyString());
    }

    @Test
    void deletesPublicDerivativesOnlyAfterGateAndRouteInvalidationWhenNoReferenceRemains() {
        when(associationMapper.countOtherEligiblePublicAssociations(42L, "ALBUM", 7L)).thenReturn(0L);
        MediaAssetVariantEntity variant = variant("READY", 5);
        when(variantMapper.findRevocablePublicBySource(42L, "v7")).thenReturn(List.of(variant));
        when(variantMapper.markRevoking(51L, 5)).thenReturn(1);
        when(assetMapper.selectById(81L)).thenReturn(asset());
        when(variantMapper.markRevoked(51L, 6)).thenReturn(1);

        MediaDeliveryRevocationResult result = service().revokeBeforeRestriction(MEDIA_REF, 2);

        assertThat(result.remainingPublicReferences()).isZero();
        assertThat(result.revokedPublicObjectCount()).isEqualTo(1);
        InOrder order = inOrder(associationMapper, invalidator, variantMapper, storageClient);
        order.verify(associationMapper).revokeAlbumDelivery(7L, 2);
        order.verify(invalidator).invalidate(Mockito.anyList());
        order.verify(variantMapper).markRevoking(51L, 5);
        order.verify(storageClient).deleteObject("public-derivatives", "derived/v7/display.webp");
        order.verify(variantMapper).markRevoked(51L, 6);
    }

    @Test
    void storageFailureLeavesVariantRevokingAndNeverReportsRevoked() {
        when(associationMapper.countOtherEligiblePublicAssociations(42L, "ALBUM", 7L)).thenReturn(0L);
        when(variantMapper.findRevocablePublicBySource(42L, "v7"))
            .thenReturn(List.of(variant("READY", 5)));
        when(variantMapper.markRevoking(51L, 5)).thenReturn(1);
        when(assetMapper.selectById(81L)).thenReturn(asset());
        Mockito.doThrow(new IllegalStateException("https://oss.example/internal/key?signature=secret"))
            .when(storageClient).deleteObject("public-derivatives", "derived/v7/display.webp");

        assertThatThrownBy(() -> service().revokeBeforeRestriction(MEDIA_REF, 2))
            .isInstanceOf(BusinessException.class)
            .hasMessage("Media revocation is incomplete")
            .hasMessageNotContaining("oss")
            .hasMessageNotContaining("signature")
            .hasMessageNotContaining("internal");
        verify(variantMapper, never()).markRevoked(Mockito.anyLong(), Mockito.anyInt());
    }

    @Test
    void resumesAnAlreadyRevokedAssociationAndRevokingVariantIdempotently() {
        association = association(true, 3);
        when(associationMapper.findByMediaRef(MEDIA_REF)).thenReturn(List.of(association));
        when(associationMapper.countOtherEligiblePublicAssociations(42L, "ALBUM", 7L)).thenReturn(0L);
        when(variantMapper.findRevocablePublicBySource(42L, "v7"))
            .thenReturn(List.of(variant("REVOKING", 6)));
        when(assetMapper.selectById(81L)).thenReturn(asset());
        when(variantMapper.markRevoked(51L, 6)).thenReturn(1);

        MediaDeliveryRevocationResult result = service().revokeBeforeRestriction(MEDIA_REF, 3);

        assertThat(result.associationVersion()).isEqualTo(3);
        verify(associationMapper, never()).revokeAlbumDelivery(Mockito.anyLong(), Mockito.anyInt());
        verify(variantMapper, never()).markRevoking(Mockito.anyLong(), Mockito.anyInt());
        verify(storageClient).deleteObject("public-derivatives", "derived/v7/display.webp");
        verify(variantMapper).markRevoked(51L, 6);
    }

    private MediaPublicDeliveryRevocationService service() {
        return new MediaPublicDeliveryRevocationService(
            associationMapper,
            variantMapper,
            assetMapper,
            storageClient,
            invalidator,
            derivativeProperties,
            storageProperties
        );
    }

    private MediaAssociationRow association(boolean revoked, int version) {
        MediaAssociationRow row = new MediaAssociationRow();
        row.setAssociationType("ALBUM");
        row.setAssociationId(7L);
        row.setMediaRef(MEDIA_REF);
        row.setSourceAssetId(42L);
        row.setLifecycleStatus("PUBLISHED");
        row.setVisibilityStatus("PUBLIC");
        row.setProcessingStatus("READY");
        row.setAssociationVersion(version);
        row.setContentVersion(4);
        row.setDeliveryRevoked(revoked);
        return row;
    }

    private MediaAssetVariantEntity variant(String status, int version) {
        MediaAssetVariantEntity variant = new MediaAssetVariantEntity();
        variant.setId(51L);
        variant.setVariantAssetId(81L);
        variant.setProcessStatus(status);
        variant.setVersion(version);
        return variant;
    }

    private MediaAssetEntity asset() {
        MediaAssetEntity asset = new MediaAssetEntity();
        asset.setId(81L);
        asset.setBucketName("public-derivatives");
        asset.setObjectKey("derived/v7/display.webp");
        asset.setVisibilityCode(2);
        asset.setAuditStatus("APPROVED");
        asset.setDeleted(0);
        return asset;
    }
}
