package io.github.shizuki.site.content.life;

import io.github.shizuki.site.admin.response.AdminPurgeBlockerResponse;
import java.time.LocalDateTime;
import java.util.List;

/** Server-authoritative purge eligibility evaluated immediately before issuing a capability. */
public record ContentPurgeReadiness(
    boolean eligible,
    LocalDateTime purgeAfter,
    List<AdminPurgeBlockerResponse> blockers
) {
    public ContentPurgeReadiness {
        blockers = blockers == null ? List.of() : List.copyOf(blockers);
        eligible = blockers.isEmpty();
    }
}
