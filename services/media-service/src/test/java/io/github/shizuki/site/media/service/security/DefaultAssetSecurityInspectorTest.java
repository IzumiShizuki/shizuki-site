package io.github.shizuki.site.media.service.security;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.model.AssetKindEnum;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DefaultAssetSecurityInspectorTest {

    @Test
    void shouldReturnBypassedStatusWhenScanHookDisabled() {
        ObjectStorageClient objectStorageClient = Mockito.mock(ObjectStorageClient.class);
        MediaAssetMapper mediaAssetMapper = Mockito.mock(MediaAssetMapper.class);
        MediaStorageProperties properties = new MediaStorageProperties();
        properties.setEnableObjectHashDedup(true);
        properties.setEnableSecurityScanHook(false);

        StorageObjectMetadata metadata = new StorageObjectMetadata();
        metadata.setEtag("\"ABCDEF123456\"");
        metadata.setContentLength(2048L);
        metadata.setContentType("image/png");
        Mockito.when(objectStorageClient.getObjectMetadata("shizuki-private", "user/1/a.png")).thenReturn(metadata);
        Mockito.when(mediaAssetMapper.existsByUserIdAndObjectHash(1L, "abcdef123456")).thenReturn(false);

        DefaultAssetSecurityInspector inspector = new DefaultAssetSecurityInspector(
            objectStorageClient,
            mediaAssetMapper,
            properties
        );

        AssetInspectionResult result = inspector.inspect(
            1L,
            "shizuki-private",
            "user/1/a.png",
            AssetKindEnum.STATIC_IMAGE,
            "image/png",
            null
        );

        Assertions.assertEquals("abcdef123456", result.objectHash());
        Assertions.assertEquals("BYPASSED", result.scanStatus());
        Assertions.assertEquals("SECURITY_SCAN_BYPASSED", result.scanMessage());
        Assertions.assertEquals(2048L, result.objectSizeBytes());
        Assertions.assertEquals("image/png", result.storageContentType());
    }

    @Test
    void shouldRejectDuplicateObjectHashForSameUser() {
        ObjectStorageClient objectStorageClient = Mockito.mock(ObjectStorageClient.class);
        MediaAssetMapper mediaAssetMapper = Mockito.mock(MediaAssetMapper.class);
        MediaStorageProperties properties = new MediaStorageProperties();
        properties.setEnableObjectHashDedup(true);
        properties.setEnableSecurityScanHook(false);

        StorageObjectMetadata metadata = new StorageObjectMetadata();
        metadata.setEtag("duplicated-hash");
        Mockito.when(objectStorageClient.getObjectMetadata("shizuki-private", "user/1/b.png")).thenReturn(metadata);
        Mockito.when(mediaAssetMapper.existsByUserIdAndObjectHash(1L, "duplicated-hash")).thenReturn(true);

        DefaultAssetSecurityInspector inspector = new DefaultAssetSecurityInspector(
            objectStorageClient,
            mediaAssetMapper,
            properties
        );

        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> inspector.inspect(
            1L,
            "shizuki-private",
            "user/1/b.png",
            AssetKindEnum.STATIC_IMAGE,
            "image/png",
            null
        ));
        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }

    @Test
    void shouldRejectWhenRequestContentTypeDiffersFromStorageContentType() {
        ObjectStorageClient objectStorageClient = Mockito.mock(ObjectStorageClient.class);
        MediaAssetMapper mediaAssetMapper = Mockito.mock(MediaAssetMapper.class);
        MediaStorageProperties properties = new MediaStorageProperties();
        properties.setEnableObjectHashDedup(false);
        properties.setEnableSecurityScanHook(false);

        StorageObjectMetadata metadata = new StorageObjectMetadata();
        metadata.setEtag("mime-mismatch-hash");
        metadata.setContentType("image/png");
        Mockito.when(objectStorageClient.getObjectMetadata("shizuki-private", "user/1/c.webp")).thenReturn(metadata);

        DefaultAssetSecurityInspector inspector = new DefaultAssetSecurityInspector(
            objectStorageClient,
            mediaAssetMapper,
            properties
        );

        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> inspector.inspect(
            1L,
            "shizuki-private",
            "user/1/c.webp",
            AssetKindEnum.STATIC_IMAGE,
            "image/webp",
            Map.of()
        ));
        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }

    @Test
    void shouldRejectWhenStorageContentTypeNotAllowedForAssetKind() {
        ObjectStorageClient objectStorageClient = Mockito.mock(ObjectStorageClient.class);
        MediaAssetMapper mediaAssetMapper = Mockito.mock(MediaAssetMapper.class);
        MediaStorageProperties properties = new MediaStorageProperties();
        properties.setEnableObjectHashDedup(false);
        properties.setEnableSecurityScanHook(false);

        StorageObjectMetadata metadata = new StorageObjectMetadata();
        metadata.setEtag("kind-mismatch-hash");
        metadata.setContentType("application/zip");
        Mockito.when(objectStorageClient.getObjectMetadata("shizuki-private", "user/1/d.zip")).thenReturn(metadata);

        DefaultAssetSecurityInspector inspector = new DefaultAssetSecurityInspector(
            objectStorageClient,
            mediaAssetMapper,
            properties
        );

        BusinessException exception = Assertions.assertThrows(BusinessException.class, () -> inspector.inspect(
            1L,
            "shizuki-private",
            "user/1/d.zip",
            AssetKindEnum.STATIC_IMAGE,
            "application/zip",
            null
        ));
        Assertions.assertEquals(ErrorCode.BAD_REQUEST, exception.getErrorCode());
    }
}
