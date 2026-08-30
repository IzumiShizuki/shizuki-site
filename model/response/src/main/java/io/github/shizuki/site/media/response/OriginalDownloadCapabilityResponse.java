package io.github.shizuki.site.media.response;

import java.time.Instant;

/**
 * 仅可用于站内原图下载路由的短时 capability。
 */
public record OriginalDownloadCapabilityResponse(
    String capability,
    Instant expiresAt
) {
}
