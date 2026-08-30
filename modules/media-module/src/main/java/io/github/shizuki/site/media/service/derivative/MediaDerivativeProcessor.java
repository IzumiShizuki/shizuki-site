package io.github.shizuki.site.media.service.derivative;

import io.github.shizuki.site.media.entity.MediaAssetVariantEntity;

/**
 * 派生执行器边界。数据库 worker 只负责领取与提交，具体 OSS/本地处理由实现负责。
 */
public interface MediaDerivativeProcessor {

    boolean supports(MediaAssetVariantEntity task);

    MediaDerivativeProcessResult process(MediaAssetVariantEntity task, String targetObjectKey);
}
