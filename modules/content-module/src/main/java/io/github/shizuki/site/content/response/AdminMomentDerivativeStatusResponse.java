package io.github.shizuki.site.content.response;

public record AdminMomentDerivativeStatusResponse(
    String variant,
    String deliveryScope,
    String status,
    String failureCode,
    String auditStatus,
    boolean retryEligible,
    Integer version,
    String etag,
    String retryRoute,
    String previewPath
) {
}
