package io.github.shizuki.site.media.service.derivative;

import io.github.shizuki.common.storage.client.ObjectStorageClient;
import io.github.shizuki.common.storage.model.StorageObjectMetadata;
import io.github.shizuki.site.media.config.MediaDerivativeFeatureProperties;
import io.github.shizuki.site.media.config.MediaStorageProperties;
import io.github.shizuki.site.media.entity.MediaAssetEntity;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 使用私有临时对象执行一次真实的 OSS AVIF save-as 预检，并在当前进程缓存结果。
 */
@Component
public class OssAvifCapabilityProbe implements AvifCapabilityProbe {

    private static final Logger LOGGER = LoggerFactory.getLogger(OssAvifCapabilityProbe.class);
    private static final List<String> AVIF_PROBE_OPERATIONS = List.of(
        "auto-orient,1",
        "resize,m_lfit,w_32,h_32,limit_1",
        "format,avif"
    );

    private final ObjectStorageClient storageClient;
    private final MediaStorageProperties storageProperties;
    private final MediaDerivativeFeatureProperties derivativeProperties;
    private volatile Boolean cachedResult;

    public OssAvifCapabilityProbe(ObjectStorageClient storageClient,
                                  MediaStorageProperties storageProperties,
                                  MediaDerivativeFeatureProperties derivativeProperties) {
        this.storageClient = storageClient;
        this.storageProperties = storageProperties;
        this.derivativeProperties = derivativeProperties;
    }

    @Override
    public boolean isSupported(MediaAssetEntity sourceAsset) {
        if (!derivativeProperties.canUseOssProcessing() || !derivativeProperties.isAvifEnabled()) {
            return false;
        }
        Boolean known = cachedResult;
        if (known != null) {
            return known;
        }
        synchronized (this) {
            if (cachedResult == null) {
                cachedResult = runPreflight(sourceAsset);
            }
            return cachedResult;
        }
    }

    private boolean runPreflight(MediaAssetEntity sourceAsset) {
        if (sourceAsset == null || sourceAsset.getId() == null
            || !StringUtils.hasText(sourceAsset.getBucketName())
            || !StringUtils.hasText(sourceAsset.getObjectKey())
            || !StringUtils.hasText(storageProperties.getPrivateBucket())) {
            return false;
        }

        String destinationBucket = storageProperties.getPrivateBucket();
        String destinationKey = "personal-content/derivatives/preflight/"
            + derivativeProperties.getProcessorVersion()
            + "/avif-" + sourceAsset.getId() + ".avif";
        try {
            storageClient.saveProcessedObject(
                sourceAsset.getBucketName(),
                sourceAsset.getObjectKey(),
                destinationBucket,
                destinationKey,
                AVIF_PROBE_OPERATIONS
            );
            StorageObjectMetadata metadata = storageClient.getObjectMetadata(destinationBucket, destinationKey);
            boolean supported = metadata != null
                && metadata.getContentLength() > 0
                && "image/avif".equalsIgnoreCase(metadata.getContentType());
            LOGGER.info("MEDIA_DERIVATIVE_AVIF_PREFLIGHT supported={}", supported);
            return supported;
        } catch (RuntimeException exception) {
            LOGGER.warn("MEDIA_DERIVATIVE_AVIF_PREFLIGHT supported=false");
            return false;
        } finally {
            try {
                storageClient.deleteObject(destinationBucket, destinationKey);
            } catch (RuntimeException ignored) {
                LOGGER.warn("MEDIA_DERIVATIVE_AVIF_PREFLIGHT_CLEANUP_FAIL");
            }
        }
    }
}
