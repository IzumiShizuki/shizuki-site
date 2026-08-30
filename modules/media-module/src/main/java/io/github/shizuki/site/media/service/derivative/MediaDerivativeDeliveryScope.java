package io.github.shizuki.site.media.service.derivative;

/**
 * 派生对象的持久化交付边界。工作区对象始终保持私有；公开对象仅在内容发布链路中启用。
 */
public enum MediaDerivativeDeliveryScope {
    PRIVATE_WORKING,
    PUBLIC_MATERIALIZED
}
