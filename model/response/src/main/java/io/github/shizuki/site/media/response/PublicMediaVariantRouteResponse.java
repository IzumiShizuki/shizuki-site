package io.github.shizuki.site.media.response;

import io.github.shizuki.site.media.model.ImageVariantTypeEnum;

/**
 * 站内媒体路由，不包含任何存储地址或资产标识。
 */
public record PublicMediaVariantRouteResponse(
    ImageVariantTypeEnum variant,
    String path,
    int width,
    int height,
    String format
) {

    public PublicMediaVariantRouteResponse {
        if (variant == null || path == null
            || !path.startsWith("/api/v1/media/med_")
            || path.contains("://")
            || width <= 0 || height <= 0
            || format == null || format.isBlank()) {
            throw new IllegalArgumentException("public media route must be site-owned and complete");
        }
    }
}
