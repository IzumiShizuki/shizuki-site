package io.github.shizuki.site.media.service.derivative;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.service.security.DerivativeOutputInspector;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MediaDerivativePlanServiceTest {

    private MediaAssetMapper assetMapper;
    private MediaDerivativeTaskService taskService;
    private AvifCapabilityProbe avifProbe;
    private DerivativeOutputInspector outputInspector;
    private MediaDerivativeFeatureProperties properties;
    private MediaAssetEntity source;

    @BeforeEach
    void setUp() {
        assetMapper = Mockito.mock(MediaAssetMapper.class);
        taskService = Mockito.mock(MediaDerivativeTaskService.class);
        avifProbe = Mockito.mock(AvifCapabilityProbe.class);
        outputInspector = Mockito.mock(DerivativeOutputInspector.class);
        properties = new MediaDerivativeFeatureProperties();
        source = new MediaAssetEntity();
        source.setId(42L);
        source.setDeleted(0);
        when(assetMapper.selectById(42L)).thenReturn(source);
        when(taskService.enqueue(
            Mockito.eq(42L),
            Mockito.any(ImageVariantTypeEnum.class),
            Mockito.eq(MediaDerivativeDeliveryScope.PRIVATE_WORKING)
        )).thenAnswer(invocation -> {
            MediaAssetVariantEntity task = new MediaAssetVariantEntity();
            task.setVariantCode(invocation.getArgument(1, ImageVariantTypeEnum.class).name());
            return task;
        });
    }

    @Test
    void alwaysEnqueuesExactlyTheThreeRequiredVariants() {
        List<MediaAssetVariantEntity> tasks = service().enqueueForPhoto(
            42L,
            MediaDerivativeDeliveryScope.PRIVATE_WORKING
        );

        assertThat(tasks).extracting(MediaAssetVariantEntity::getVariantCode)
            .containsExactly("THUMB_WEBP", "DISPLAY_WEBP", "FULL_SANITIZED");
        verifyNoMoreInteractions(avifProbe);
    }

    @Test
    void enqueuesAvifOnlyAfterTheCapabilityProbePasses() {
        properties.setAvifEnabled(true);
        when(outputInspector.supports(ImageVariantTypeEnum.DISPLAY_AVIF)).thenReturn(true);
        when(avifProbe.isSupported(source)).thenReturn(true);

        List<MediaAssetVariantEntity> tasks = service().enqueueForPhoto(
            42L,
            MediaDerivativeDeliveryScope.PRIVATE_WORKING
        );

        assertThat(tasks).extracting(MediaAssetVariantEntity::getVariantCode)
            .containsExactly("THUMB_WEBP", "DISPLAY_WEBP", "FULL_SANITIZED", "DISPLAY_AVIF");
        verify(avifProbe).isSupported(source);
    }

    @Test
    void keepsRequiredVariantsWhenAvifPreflightFails() {
        properties.setAvifEnabled(true);
        when(outputInspector.supports(ImageVariantTypeEnum.DISPLAY_AVIF)).thenReturn(true);
        when(avifProbe.isSupported(source)).thenReturn(false);

        List<MediaAssetVariantEntity> tasks = service().enqueueForPhoto(
            42L,
            MediaDerivativeDeliveryScope.PRIVATE_WORKING
        );

        assertThat(tasks).hasSize(3);
    }

    @Test
    void doesNotProbeOrEnqueueAvifWithoutAnIndependentInspector() {
        properties.setAvifEnabled(true);
        when(outputInspector.supports(ImageVariantTypeEnum.DISPLAY_AVIF)).thenReturn(false);

        List<MediaAssetVariantEntity> tasks = service().enqueueForPhoto(
            42L,
            MediaDerivativeDeliveryScope.PRIVATE_WORKING
        );

        assertThat(tasks).hasSize(3);
        verifyNoMoreInteractions(avifProbe);
    }

    private MediaDerivativePlanService service() {
        return new MediaDerivativePlanService(
            assetMapper,
            taskService,
            avifProbe,
            outputInspector,
            properties
        );
    }
}
