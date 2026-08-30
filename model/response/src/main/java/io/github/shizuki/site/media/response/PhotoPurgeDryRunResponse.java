package io.github.shizuki.site.media.response;

import java.time.LocalDateTime;
import java.util.List;

public record PhotoPurgeDryRunResponse(
    long photoId,
    int version,
    boolean eligible,
    LocalDateTime purgeAfter,
    int derivativeCount,
    List<PhotoPurgeBlockerResponse> blockers
) {
    public PhotoPurgeDryRunResponse {
        blockers = blockers == null ? List.of() : List.copyOf(blockers);
    }
}
