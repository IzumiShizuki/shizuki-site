package io.github.shizuki.site.media.service.derivative;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.model.AssetKindEnum;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.service.security.DerivativeOutputInspection;
import io.github.shizuki.site.media.service.security.DerivativeOutputInspector;
import io.github.shizuki.site.media.service.security.ImageUploadDraftMetadata;
import io.github.shizuki.site.media.service.security.PhotoUploadDraftValidator;
import io.github.shizuki.site.media.service.security.ProtectedPhotoProcessingContext;
import java.io.ByteArrayInputStream;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

class OssMediaDerivativeProcessorTest {

    private ObjectStorageClient storageClient;
    private MediaAssetMapper assetMapper;
    private AvifCapabilityProbe avifProbe;
    private PhotoUploadDraftValidator sourceValidator;
    private DerivativeOutputInspector outputInspector;
    private MediaDerivativeFeatureProperties derivativeProperties;
    private MediaStorageProperties storageProperties;
    private MediaAssetEntity source;

    @BeforeEach
    void setUp() {
        storageClient = Mockito.mock(ObjectStorageClient.class);
        assetMapper = Mockito.mock(MediaAssetMapper.class);
        avifProbe = Mockito.mock(AvifCapabilityProbe.class);
        sourceValidator = Mockito.mock(PhotoUploadDraftValidator.class);
        outputInspector = Mockito.mock(DerivativeOutputInspector.class);
        derivativeProperties = new MediaDerivativeFeatureProperties();
        derivativeProperties.setEnabled(true);
        derivativeProperties.setOssProcessingEnabled(true);
        derivativeProperties.setProcessorVersion("v7");
        storageProperties = new MediaStorageProperties();
        storageProperties.setPrivateBucket("site-private");
        storageProperties.setPublicBucket("site-public");
        source = new MediaAssetEntity();
        source.setId(42L);
        source.setUserId(7L);
        source.setBucketName("site-private");
        source.setObjectKey("originals/42.jpg");
        source.setContentTypeText("image/jpeg");
        source.setAssetKindCode(1);
        source.setVisibilityCode(1);
        source.setObjectHash("a".repeat(64));
        source.setDeleted(0);
        when(assetMapper.selectById(42L)).thenReturn(source);
        when(storageClient.getObjectMetadata("site-private", "originals/42.jpg"))
            .thenReturn(metadata("image/jpeg", 100, "source-etag"));
        when(storageClient.getObjectStream(Mockito.anyString(), Mockito.anyString()))
            .thenAnswer(invocation -> new ByteArrayInputStream(new byte[] {1}));
        ProtectedPhotoProcessingContext context = Mockito.mock(ProtectedPhotoProcessingContext.class);
        when(context.draftMetadata()).thenReturn(new ImageUploadDraftMetadata(
            "a".repeat(64),
            "image/jpeg",
            100,
            20,
            10,
            1,
            true,
            false
        ));
        when(sourceValidator.validate(
            Mockito.any(),
            Mockito.eq(100L),
            Mockito.eq("image/jpeg"),
            Mockito.eq(AssetKindEnum.STATIC_IMAGE)
        )).thenReturn(context);
        when(outputInspector.supports(Mockito.any(ImageVariantTypeEnum.class))).thenReturn(true);
        when(outputInspector.inspect(
            Mockito.any(),
            Mockito.anyLong(),
            Mockito.anyString(),
            Mockito.any(ImageVariantTypeEnum.class)
        )).thenReturn(new DerivativeOutputInspection("b".repeat(64), 1280, 720, 1));
    }

    @Test
    void materializesRequiredWebpAndApprovesOnlyAfterIndependentInspection() {
        StorageObjectMetadata metadata = metadata("image/webp", 12_000, "\"ABC123\"");
        when(storageClient.getObjectMetadata("site-public", targetKey("DISPLAY_WEBP"))).thenReturn(metadata);
        when(assetMapper.insert(Mockito.any(MediaAssetEntity.class))).thenAnswer(invocation -> {
            MediaAssetEntity inserted = invocation.getArgument(0);
            inserted.setId(901L);
            return 1;
        });

        MediaDerivativeProcessResult result = processor().process(
            task("DISPLAY_WEBP"),
            targetKey("DISPLAY_WEBP")
        );

        assertThat(result.variantAssetId()).isEqualTo(901L);
        assertThat(result.width()).isEqualTo(1280);
        assertThat(result.height()).isEqualTo(720);
        verify(storageClient).saveProcessedObject(
            "site-private",
            "originals/42.jpg",
            "site-public",
            targetKey("DISPLAY_WEBP"),
            List.of(
                "auto-orient,1",
                "resize,m_lfit,w_1920,h_1920,limit_1",
                "quality,q_86",
                "format,webp"
            )
        );
        ArgumentCaptor<MediaAssetEntity> assetCaptor = ArgumentCaptor.forClass(MediaAssetEntity.class);
        verify(assetMapper).insert(assetCaptor.capture());
        assertThat(assetCaptor.getValue().getContentTypeText()).isEqualTo("image/webp");
        assertThat(assetCaptor.getValue().getVisibilityCode()).isEqualTo(2);
        assertThat(assetCaptor.getValue().getAuditStatus()).isEqualTo("APPROVED");
        assertThat(assetCaptor.getValue().getObjectHash()).isEqualTo("b".repeat(64));
        assertThat(assetCaptor.getValue().getMetadataJson()).contains(
            "DISPLAY_WEBP",
            "PUBLIC_MATERIALIZED",
            "metadata_reinspection",
            "PASSED",
            "decoded_width",
            "1280"
        );
        verify(avifProbe, never()).isSupported(source);
    }

    @Test
    void reusesTheSameRegisteredAssetAfterAWorkerRestart() {
        MediaAssetEntity existing = new MediaAssetEntity();
        existing.setId(902L);
        existing.setUserId(7L);
        existing.setDeleted(0);
        existing.setVersion(0);
        when(storageClient.getObjectMetadata("site-public", targetKey("FULL_SANITIZED")))
            .thenReturn(metadata("image/webp", 10, "etag"));
        when(assetMapper.findByStorageIdentity("site-public", targetKey("FULL_SANITIZED")))
            .thenReturn(existing);
        when(assetMapper.updateById(existing)).thenReturn(1);

        MediaDerivativeProcessResult result = processor().process(
            task("FULL_SANITIZED"),
            targetKey("FULL_SANITIZED")
        );

        assertThat(result.variantAssetId()).isEqualTo(902L);
        verify(assetMapper, never()).insert(Mockito.any(MediaAssetEntity.class));
        verify(assetMapper).updateById(existing);
        assertThat(existing.getAuditStatus()).isEqualTo("APPROVED");
    }

    @Test
    void generatesAvifOnlyWhenTheRealProbeIsKnownToPass() {
        derivativeProperties.setAvifEnabled(true);
        when(avifProbe.isSupported(source)).thenReturn(true);
        when(storageClient.getObjectMetadata("site-public", targetKey("DISPLAY_AVIF")))
            .thenReturn(metadata("image/avif", 10, "etag"));
        when(assetMapper.insert(Mockito.any(MediaAssetEntity.class))).thenAnswer(invocation -> {
            MediaAssetEntity inserted = invocation.getArgument(0);
            inserted.setId(903L);
            return 1;
        });

        MediaDerivativeProcessResult result = processor().process(
            task("DISPLAY_AVIF"),
            targetKey("DISPLAY_AVIF")
        );

        assertThat(result.variantAssetId()).isEqualTo(903L);
        verify(avifProbe).isSupported(source);
    }

    @Test
    void deletesGeneratedOutputAndDoesNotApproveWhenMetadataReinspectionFails() {
        when(storageClient.getObjectMetadata("site-public", targetKey("DISPLAY_WEBP")))
            .thenReturn(metadata("image/webp", 10, "etag"));
        when(outputInspector.inspect(
            Mockito.any(),
            Mockito.eq(10L),
            Mockito.eq("image/webp"),
            Mockito.eq(ImageVariantTypeEnum.DISPLAY_WEBP)
        )).thenThrow(new IllegalStateException("derivative contains embedded private metadata"));

        assertThatThrownBy(() -> processor().process(
            task("DISPLAY_WEBP"),
            targetKey("DISPLAY_WEBP")
        )).isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("private metadata");

        verify(storageClient).deleteObject("site-public", targetKey("DISPLAY_WEBP"));
        verify(assetMapper, never()).insert(Mockito.any(MediaAssetEntity.class));
    }

    @Test
    void leavesTheTaskUnapprovedWhenOssProcessingTimesOut() {
        Mockito.doThrow(new IllegalStateException("OSS processing timed out"))
            .when(storageClient)
            .saveProcessedObject(
                "site-private",
                "originals/42.jpg",
                "site-public",
                targetKey("DISPLAY_WEBP"),
                List.of(
                    "auto-orient,1",
                    "resize,m_lfit,w_1920,h_1920,limit_1",
                    "quality,q_86",
                    "format,webp"
                )
            );

        assertThatThrownBy(() -> processor().process(
            task("DISPLAY_WEBP"),
            targetKey("DISPLAY_WEBP")
        )).isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("timed out");

        verify(storageClient, never()).getObjectMetadata("site-public", targetKey("DISPLAY_WEBP"));
        verify(assetMapper, never()).insert(Mockito.any(MediaAssetEntity.class));
    }

    @Test
    void rejectsAChangedSourceBeforeRequestingAnyOssDerivative() {
        ProtectedPhotoProcessingContext changedContext = Mockito.mock(ProtectedPhotoProcessingContext.class);
        when(changedContext.draftMetadata()).thenReturn(new ImageUploadDraftMetadata(
            "c".repeat(64),
            "image/jpeg",
            100,
            20,
            10,
            1,
            false,
            false
        ));
        when(sourceValidator.validate(
            Mockito.any(),
            Mockito.eq(100L),
            Mockito.eq("image/jpeg"),
            Mockito.eq(AssetKindEnum.STATIC_IMAGE)
        )).thenReturn(changedContext);

        assertThatThrownBy(() -> processor().process(
            task("DISPLAY_WEBP"),
            targetKey("DISPLAY_WEBP")
        )).isInstanceOf(IllegalStateException.class)
            .hasMessageContaining("changed after upload validation");

        verify(storageClient, never()).saveProcessedObject(
            Mockito.anyString(),
            Mockito.anyString(),
            Mockito.anyString(),
            Mockito.anyString(),
            Mockito.anyList()
        );
    }

    private OssMediaDerivativeProcessor processor() {
        return new OssMediaDerivativeProcessor(
            storageClient,
            assetMapper,
            storageProperties,
            derivativeProperties,
            avifProbe,
            new MediaDerivativeObjectKeyFactory(),
            sourceValidator,
            outputInspector,
            new ObjectMapper()
        );
    }

    private MediaAssetVariantEntity task(String variant) {
        MediaAssetVariantEntity task = new MediaAssetVariantEntity();
        task.setSourceAssetId(42L);
        task.setVariantCode(variant);
        task.setDeliveryScope("PUBLIC_MATERIALIZED");
        task.setProcessorVersion("v7");
        return task;
    }

    private StorageObjectMetadata metadata(String contentType, long length, String etag) {
        StorageObjectMetadata metadata = new StorageObjectMetadata();
        metadata.setContentType(contentType);
        metadata.setContentLength(length);
        metadata.setEtag(etag);
        return metadata;
    }

    private String targetKey(String variant) {
        return new MediaDerivativeObjectKeyFactory().create(task(variant));
    }
}
