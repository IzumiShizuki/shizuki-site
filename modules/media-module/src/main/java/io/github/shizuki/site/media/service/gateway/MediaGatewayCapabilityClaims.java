package io.github.shizuki.site.media.service.gateway;

import io.github.shizuki.site.media.model.ImageVariantTypeEnum;

/**
 * capability 中经签名保护的最小授权事实。
 */
public record MediaGatewayCapabilityClaims(
    String mediaRef,
    String associationType,
    long associationId,
    ImageVariantTypeEnum variant,
    MediaGatewayActorScope actorScope,
    long actorId,
    int contentVersion,
    int associationVersion,
    long expiresAtEpochSecond
) {
}
