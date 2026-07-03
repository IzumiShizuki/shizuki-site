package io.github.shizuki.site.content.response;

import java.time.LocalDateTime;

public record LightAppBalanceSourceAccountStatusResponse(
    String provider,
    String providerLabel,
    boolean bound,
    String status,
    Long targetAccountId,
    String targetAccountName,
    String targetCurrencyCode,
    boolean nightlyEnabled,
    LocalDateTime lastVerifiedAt,
    LocalDateTime lastSyncedAt,
    String lastSyncStatus,
    String lastSyncErrorText,
    String activeBindSessionId,
    String activeBindSessionStatus,
    LocalDateTime activeBindSessionExpiresAt,
    LocalDateTime updatedAt
) {
}
