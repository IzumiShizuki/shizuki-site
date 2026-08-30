package io.github.shizuki.site.media.service.derivative;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OssAvifCapabilityProbeTest {

    private ObjectStorageClient storageClient;
    private MediaDerivativeFeatureProperties derivativeProperties;
    private MediaStorageProperties storageProperties;
    private MediaAssetEntity source;

    @BeforeEach
    void setUp() {
        storageClient = Mockito.mock(ObjectStorageClient.class);
        derivativeProperties = new MediaDerivativeFeatureProperties();
        derivativeProperties.setEnabled(true);
        derivativeProperties.setOssProcessingEnabled(true);
        derivativeProperties.setAvifEnabled(true);
        derivativeProperties.setProcessorVersion("v7");
        storageProperties = new MediaStorageProperties();
        storageProperties.setPrivateBucket("site-private");
        source = new MediaAssetEntity();
        source.setId(42L);
        source.setBucketName("site-private");
        source.setObjectKey("originals/42.jpg");
    }

    @Test
    void performsOneRealSaveAsProbeAndCachesSuccess() {
        StorageObjectMetadata metadata = new StorageObjectMetadata();
        metadata.setContentLength(128);
        metadata.setContentType("image/avif");
        when(storageClient.getObjectMetadata(
            "site-private",
            "personal-content/derivatives/preflight/v7/avif-42.avif"
        )).thenReturn(metadata);
        OssAvifCapabilityProbe probe = probe();

        assertThat(probe.isSupported(source)).isTrue();
        assertThat(probe.isSupported(source)).isTrue();

        verify(storageClient).saveProcessedObject(
            "site-private",
            "originals/42.jpg",
            "site-private",
            "personal-content/derivatives/preflight/v7/avif-42.avif",
            List.of("auto-orient,1", "resize,m_lfit,w_32,h_32,limit_1", "format,avif")
        );
        verify(storageClient).deleteObject(
            "site-private",
            "personal-content/derivatives/preflight/v7/avif-42.avif"
        );
    }

    @Test
    void failsClosedWhenTheSavedObjectIsNotActuallyAvif() {
        StorageObjectMetadata metadata = new StorageObjectMetadata();
        metadata.setContentLength(128);
        metadata.setContentType("image/webp");
        when(storageClient.getObjectMetadata(Mockito.anyString(), Mockito.anyString())).thenReturn(metadata);

        assertThat(probe().isSupported(source)).isFalse();
    }

    @Test
    void neverContactsOssWhileAvifIsNotExplicitlyEnabled() {
        derivativeProperties.setAvifEnabled(false);

        assertThat(probe().isSupported(source)).isFalse();

        verifyNoInteractions(storageClient);
    }

    private OssAvifCapabilityProbe probe() {
        return new OssAvifCapabilityProbe(storageClient, storageProperties, derivativeProperties);
    }
}
