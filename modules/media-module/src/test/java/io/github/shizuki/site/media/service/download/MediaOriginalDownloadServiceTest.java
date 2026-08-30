package io.github.shizuki.site.media.service.download;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.service.gateway.MediaGatewayStream;
import java.io.ByteArrayInputStream;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MediaOriginalDownloadServiceTest {

    private OriginalDownloadAuthorizationService authorizationService;
    private MediaAssetMapper assetMapper;
    private ObjectStorageClient storageClient;
    private MediaStorageProperties storageProperties;

    @BeforeEach
    void setUp() {
        authorizationService = Mockito.mock(OriginalDownloadAuthorizationService.class);
        assetMapper = Mockito.mock(MediaAssetMapper.class);
        storageClient = Mockito.mock(ObjectStorageClient.class);
        storageProperties = new MediaStorageProperties();
        storageProperties.setPrivateBucket("private-originals");
    }

    @Test
    void streamsPrivateOriginalWithNoStoreAndNeverGeneratesAnOssUrl() throws Exception {
        byte[] bytes = new byte[] {1, 2, 3, 4};
        when(authorizationService.authorize("media-ref", "original-cap"))
            .thenReturn(Optional.of(new AuthorizedOriginalDownload("media-ref", 42L, 3, 2)));
        when(assetMapper.selectById(42L)).thenReturn(asset());
        when(storageClient.getObjectMetadata("private-originals", "private/photo/original.jpg"))
            .thenReturn(metadata(bytes.length));
        when(storageClient.getObjectStream("private-originals", "private/photo/original.jpg"))
            .thenReturn(new ByteArrayInputStream(bytes));

        MediaGatewayStream result = service().open("media-ref", "original-cap");

        assertThat(result.inputStream().readAllBytes()).isEqualTo(bytes);
        assertThat(result.contentType()).isEqualTo("image/jpeg");
        assertThat(result.cacheControl()).isEqualTo("private, no-store, max-age=0");
        verify(storageClient, never()).generateGetUrl(Mockito.anyString(), Mockito.anyString(), Mockito.anyLong());
    }

    private MediaOriginalDownloadService service() {
        return new MediaOriginalDownloadService(
            authorizationService,
            assetMapper,
            storageClient,
            storageProperties
        );
    }

    private MediaAssetEntity asset() {
        MediaAssetEntity asset = new MediaAssetEntity();
        asset.setId(42L);
        asset.setBucketName("private-originals");
        asset.setObjectKey("private/photo/original.jpg");
        asset.setVisibilityCode(1);
        asset.setAssetKindCode(1);
        asset.setContentTypeText("image/jpeg");
        asset.setObjectHash("a".repeat(64));
        asset.setAuditStatus("APPROVED");
        asset.setDeleted(0);
        return asset;
    }

    private StorageObjectMetadata metadata(long length) {
        StorageObjectMetadata metadata = new StorageObjectMetadata();
        metadata.setContentLength(length);
        metadata.setContentType("image/jpeg");
        metadata.setEtag("upstream-etag");
        return metadata;
    }
}
