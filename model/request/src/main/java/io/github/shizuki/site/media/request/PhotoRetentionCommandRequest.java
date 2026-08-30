package io.github.shizuki.site.media.request;

import jakarta.validation.constraints.Min;

public record PhotoRetentionCommandRequest(@Min(0) int expectedVersion) {
}
