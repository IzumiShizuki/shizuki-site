package io.github.shizuki.site.media.service.derivative;

import io.github.shizuki.site.media.entity.MediaAssetEntity;

/**
 * AVIF 必须经过部署目标 OSS 的真实处理预检，不能仅凭配置假设区域能力。
 */
public interface AvifCapabilityProbe {

    boolean isSupported(MediaAssetEntity sourceAsset);
}
