package io.github.shizuki.site.media.service.authorization;

import io.github.shizuki.site.media.model.ImageVariantTypeEnum;
import io.github.shizuki.site.media.service.derivative.MediaDerivativeDeliveryScope;

/**
 * gateway 内部使用的授权结果。包含内部 ID，因此不能进入控制器响应或日志详情。
 */
public record AuthorizedMediaAssociation(
    String mediaRef,
    String associationType,
    long associationId,
    long variantAssetId,
    int contentVersion,
    int associationVersion,
    ImageVariantTypeEnum variant,
    MediaDerivativeDeliveryScope deliveryScope,
    int width,
    int height,
    String altText
) {
}
