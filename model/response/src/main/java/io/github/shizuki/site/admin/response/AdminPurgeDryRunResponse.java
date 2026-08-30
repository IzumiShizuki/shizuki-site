package io.github.shizuki.site.admin.response;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

public record AdminPurgeDryRunResponse(
    String targetType,
    long targetId,
    int version,
    boolean eligible,
    LocalDateTime purgeAfter,
    int derivativeCount,
    List<AdminPurgeBlockerResponse> blockers,
    String capability,
    Instant capabilityExpiresAt,
    String confirmationPhrase
) {
    public AdminPurgeDryRunResponse {
        blockers = blockers == null ? List.of() : List.copyOf(blockers);
        if (!eligible) {
            capability = null;
            capabilityExpiresAt = null;
            confirmationPhrase = null;
        }
    }
}
