package io.github.shizuki.site.media.service.security;

import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import java.io.InputStream;

/**
 * 对 OSS 生成结果执行独立、完整的访客安全复检。
 */
public interface DerivativeOutputInspector {

    boolean supports(ImageVariantTypeEnum variant);

    DerivativeOutputInspection inspect(InputStream inputStream,
                                       long storageSizeBytes,
                                       String storageContentType,
                                       ImageVariantTypeEnum variant);
}
