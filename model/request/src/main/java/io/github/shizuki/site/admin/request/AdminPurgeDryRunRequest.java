package io.github.shizuki.site.admin.request;

import jakarta.validation.constraints.Min;

public record AdminPurgeDryRunRequest(@Min(0) int expectedVersion) {
}
