package io.github.shizuki.site.media.service.revocation;

/**
 * 两阶段内容限制流程的媒体撤权结果，不包含任何存储定位信息。
 */
public record MediaDeliveryRevocationResult(
    String mediaRef,
    int associationVersion,
    long remainingPublicReferences,
    int invalidatedRouteCount,
    int revokedPublicObjectCount
) {
}
