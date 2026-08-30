package io.github.shizuki.site.media.service.gateway;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.site.media.config.MediaGatewayProperties;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.model.AssetVisibilityEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.service.authorization.AuthorizedMediaAssociation;
import io.github.shizuki.site.media.service.authorization.MediaAssociationAuthorizationService;
import io.github.shizuki.site.media.service.derivative.MediaDerivativeDeliveryScope;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MediaGatewayServiceTest {

    private MediaAssociationAuthorizationService authorizationService;
    private MediaAssetMapper assetMapper;
    private ObjectStorageClient storageClient;
    private MediaStorageProperties storageProperties;
    private MediaGatewayProperties gatewayProperties;

    @BeforeEach
    void setUp() {
        authorizationService = Mockito.mock(MediaAssociationAuthorizationService.class);
        assetMapper = Mockito.mock(MediaAssetMapper.class);
        storageClient = Mockito.mock(ObjectStorageClient.class);
        storageProperties = new MediaStorageProperties();
        storageProperties.setPublicBucket("public-derivatives");
        storageProperties.setPrivateBucket("private-originals");
        gatewayProperties = new MediaGatewayProperties();
        gatewayProperties.setCapabilitySecret("test-media-gateway-capability-secret-1234567890");
        gatewayProperties.setPublicMaxAgeSeconds(45);
        gatewayProperties.afterPropertiesSet();
    }

    @Test
    void streamsPublicDerivativeWithoutGeneratingOrExposingAnUpstreamUrl() throws Exception {
        String mediaRef = "med_012345678901234567890123456";
        byte[] bytes = "safe-webp".getBytes(StandardCharsets.UTF_8);
        AuthorizedMediaAssociation authorization = authorization(
            mediaRef,
            MediaDerivativeDeliveryScope.PUBLIC_MATERIALIZED
        );
        when(authorizationService.authorizeGatewayVariant(
            mediaRef,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            null
        )).thenReturn(Optional.of(authorization));
        MediaAssetEntity asset = asset(81L, "public-derivatives", AssetVisibilityEnum.PUBLIC.getCode());
        when(assetMapper.selectById(81L)).thenReturn(asset);
        when(storageClient.getObjectMetadata("public-derivatives", "internal/not-for-response.webp"))
            .thenReturn(metadata(bytes.length));
        when(storageClient.getObjectStream("public-derivatives", "internal/not-for-response.webp"))
            .thenReturn(new ByteArrayInputStream(bytes));

        MediaGatewayStream result = service().open(mediaRef, ImageVariantTypeEnum.DISPLAY_WEBP, null);

        assertThat(result.inputStream().readAllBytes()).isEqualTo(bytes);
        assertThat(result.cacheControl()).isEqualTo("public, max-age=45, must-revalidate");
        assertThat(result.siteEtag()).startsWith("\"mgw-").endsWith("\"");
        verify(storageClient, never()).generateGetUrl(Mockito.anyString(), Mockito.anyString(), Mockito.anyLong());
        verify(storageClient, never()).generateProcessedGetUrl(
            Mockito.anyString(), Mockito.anyString(), Mockito.<List<String>>any(), Mockito.anyLong()
        );
    }

    @Test
    void capabilityDeliveryUsesPrivateNoStoreAndPrivateAsset() {
        String mediaRef = "med_012345678901234567890123456";
        when(authorizationService.authorizeGatewayVariant(
            mediaRef,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            "capability"
        )).thenReturn(Optional.of(authorization(mediaRef, MediaDerivativeDeliveryScope.PRIVATE_WORKING)));
        when(assetMapper.selectById(81L)).thenReturn(
            asset(81L, "private-originals", AssetVisibilityEnum.PRIVATE.getCode())
        );
        when(storageClient.getObjectMetadata("private-originals", "internal/not-for-response.webp"))
            .thenReturn(metadata(4));
        when(storageClient.getObjectStream("private-originals", "internal/not-for-response.webp"))
            .thenReturn(new ByteArrayInputStream(new byte[4]));

        MediaGatewayStream result = service().open(
            mediaRef,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            "capability"
        );

        assertThat(result.cacheControl()).isEqualTo("private, no-store, max-age=0");
    }

    @Test
    void deniedAssociationNeverTouchesAssetStorage() {
        when(authorizationService.authorizeGatewayVariant(
            Mockito.anyString(), Mockito.any(), Mockito.isNull()
        )).thenReturn(Optional.empty());

        assertThatThrownBy(() -> service().open(
            "med_012345678901234567890123456",
            ImageVariantTypeEnum.DISPLAY_WEBP,
            null
        )).isInstanceOf(BusinessException.class);

        verify(assetMapper, never()).selectById(Mockito.anyLong());
        verify(storageClient, never()).getObjectStream(Mockito.anyString(), Mockito.anyString());
    }

    private MediaGatewayService service() {
        return new MediaGatewayService(
            authorizationService,
            assetMapper,
            storageClient,
            storageProperties,
            gatewayProperties
        );
    }

    private AuthorizedMediaAssociation authorization(String mediaRef,
                                                       MediaDerivativeDeliveryScope scope) {
        return new AuthorizedMediaAssociation(
            mediaRef,
            "ALBUM",
            7L,
            81L,
            3,
            2,
            ImageVariantTypeEnum.DISPLAY_WEBP,
            scope,
            1280,
            720,
            "safe"
        );
    }

    private MediaAssetEntity asset(long id, String bucket, int visibility) {
        MediaAssetEntity asset = new MediaAssetEntity();
        asset.setId(id);
        asset.setBucketName(bucket);
        asset.setObjectKey("internal/not-for-response.webp");
        asset.setContentTypeText("image/webp");
        asset.setVisibilityCode(visibility);
        asset.setAuditStatus("APPROVED");
        asset.setDeleted(0);
        return asset;
    }

    private StorageObjectMetadata metadata(long length) {
        StorageObjectMetadata metadata = new StorageObjectMetadata();
        metadata.setContentType("image/webp");
        metadata.setContentLength(length);
        metadata.setEtag("upstream-etag-must-not-be-used");
        return metadata;
    }
}
