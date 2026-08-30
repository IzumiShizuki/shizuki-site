package io.github.shizuki.site.media.service.download;

import java.time.Instant;

public record IssuedOriginalDownloadCapability(String token, Instant expiresAt) {
}
