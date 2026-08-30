package io.github.shizuki.site.media.service.derivative;

import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;
import io.github.shizuki.site.media.mapper.MediaAssetMapper;
import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.service.security.DerivativeOutputInspector;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * 为照片建立派生计划：三种 WebP/净化派生始终必需，AVIF 仅在真实预检通过后加入。
 */
@Service
public class MediaDerivativePlanService {

    private static final List<ImageVariantTypeEnum> REQUIRED_VARIANTS = List.of(
        ImageVariantTypeEnum.THUMB_WEBP,
        ImageVariantTypeEnum.DISPLAY_WEBP,
        ImageVariantTypeEnum.FULL_SANITIZED
    );

    private final MediaAssetMapper mediaAssetMapper;
    private final MediaDerivativeTaskService taskService;
    private final AvifCapabilityProbe avifCapabilityProbe;
    private final DerivativeOutputInspector outputInspector;
    private final MediaDerivativeFeatureProperties properties;

    public MediaDerivativePlanService(MediaAssetMapper mediaAssetMapper,
                                      MediaDerivativeTaskService taskService,
                                      AvifCapabilityProbe avifCapabilityProbe,
                                      DerivativeOutputInspector outputInspector,
                                      MediaDerivativeFeatureProperties properties) {
        this.mediaAssetMapper = mediaAssetMapper;
        this.taskService = taskService;
        this.avifCapabilityProbe = avifCapabilityProbe;
        this.outputInspector = outputInspector;
        this.properties = properties;
    }

    public List<MediaAssetVariantEntity> enqueueForPhoto(long sourceAssetId,
                                                          MediaDerivativeDeliveryScope scope) {
        if (scope == null) {
            throw new IllegalArgumentException("delivery scope is required");
        }
        MediaAssetEntity source = mediaAssetMapper.selectById(sourceAssetId);
        if (source == null || Integer.valueOf(1).equals(source.getDeleted())) {
            throw new IllegalArgumentException("source asset does not exist");
        }

        List<MediaAssetVariantEntity> tasks = new ArrayList<>(4);
        for (ImageVariantTypeEnum variant : REQUIRED_VARIANTS) {
            tasks.add(taskService.enqueue(sourceAssetId, variant, scope));
        }
        if (properties.isAvifEnabled()
            && outputInspector.supports(ImageVariantTypeEnum.DISPLAY_AVIF)
            && avifCapabilityProbe.isSupported(source)) {
            tasks.add(taskService.enqueue(sourceAssetId, ImageVariantTypeEnum.DISPLAY_AVIF, scope));
        }
        return List.copyOf(tasks);
    }
}
