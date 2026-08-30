package io.github.shizuki.site.media.response;

import io.github.shizuki.site.media.model.ImageVariantTypeEnum;

/**
 * Site-owned media path plus a short-lived gateway capability. The capability is intentionally
 * separate from the path so it is not copied into URLs, referrers, access logs, or share links.
 */
public record ProtectedMediaVariantRouteResponse(
    ImageVariantTypeEnum variant,
    String path,
    int width,
    int height,
    String format,
    String capability
) {

    public ProtectedMediaVariantRouteResponse {
        if (variant == null || path == null
            || !path.startsWith("/api/v1/media/med_")
            || path.contains("://") || path.contains("?")
            || width <= 0 || height <= 0
            || format == null || format.isBlank()
            || capability == null || capability.isBlank()
            || capability.indexOf('\r') >= 0 || capability.indexOf('\n') >= 0) {
            throw new IllegalArgumentException("protected media route must be site-owned and complete");
        }
    }
}
