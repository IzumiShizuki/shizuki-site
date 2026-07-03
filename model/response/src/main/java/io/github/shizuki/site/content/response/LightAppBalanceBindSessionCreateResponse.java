package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;

public record LightAppBalanceBindSessionCreateResponse(
    String provider,
    String sessionId,
    String status,
    String loginUrl,
    String qrCodePayload,
    String qrCodeImageDataUrl,
    LocalDateTime expiresAt
) {
}
