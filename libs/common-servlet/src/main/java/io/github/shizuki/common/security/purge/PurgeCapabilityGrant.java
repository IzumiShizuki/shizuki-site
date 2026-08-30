package io.github.shizuki.common.security.purge;

import java.time.Instant;

/** Opaque, short-lived, single-use authorization returned only after an eligible purge dry-run. */
public record PurgeCapabilityGrant(String capability, Instant expiresAt) {

    public PurgeCapabilityGrant {
        if (capability == null || capability.isBlank() || expiresAt == null) {
            throw new IllegalArgumentException("purge capability grant is incomplete");
        }
    }
}
