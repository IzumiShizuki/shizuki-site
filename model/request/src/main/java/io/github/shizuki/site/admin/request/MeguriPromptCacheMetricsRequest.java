package io.github.shizuki.site.admin.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import java.util.List;

@Schema(description = "Content-free Meguri prompt-cache metrics snapshot")
public record MeguriPromptCacheMetricsRequest(
    @NotBlank @Size(max = 80) String sourceId,
    @NotBlank @Size(max = 48) String observedAt,
    @NotBlank @Size(max = 48) String collectingSince,
    @NotBlank @Size(max = 100) String provider,
    @Size(max = 180) String model,
    @NotBlank @Size(max = 80) String cacheMode,
    @Size(max = 64) String promptSha256,
    @PositiveOrZero long promptCharacters,
    @PositiveOrZero long totalRequests,
    @PositiveOrZero long successfulRequests,
    @PositiveOrZero long failedRequests,
    @PositiveOrZero long usageReportedRequests,
    @PositiveOrZero long cacheReportedRequests,
    @PositiveOrZero long promptTokens,
    @PositiveOrZero long outputTokens,
    @PositiveOrZero long totalTokens,
    @PositiveOrZero long cacheHitTokens,
    @PositiveOrZero long cacheMissTokens,
    Double cacheHitRate,
    Double usageCoverageRate,
    @Size(max = 32) String persistenceStatus,
    @Size(max = 220) String lastPersistenceError,
    @Size(max = 32) String exportStatus,
    @Size(max = 48) String lastExportAt,
    @Size(max = 220) String lastExportError,
    @Valid @Size(max = 31) List<Daily> daily,
    @Valid @Size(max = 100) List<Sample> recent
) {

    public record Daily(
        @NotBlank @Size(max = 10) String date,
        @PositiveOrZero long requests,
        @PositiveOrZero long successfulRequests,
        @PositiveOrZero long failedRequests,
        @PositiveOrZero long promptTokens,
        @PositiveOrZero long outputTokens,
        @PositiveOrZero long cacheHitTokens,
        @PositiveOrZero long cacheMissTokens
    ) {
    }

    public record Sample(
        @NotBlank @Size(max = 48) String observedAt,
        @NotBlank @Size(max = 80) String operation,
        @Size(max = 180) String model,
        boolean successful,
        boolean usageReported,
        boolean cacheReported,
        @PositiveOrZero long promptTokens,
        @PositiveOrZero long outputTokens,
        @PositiveOrZero long totalTokens,
        @PositiveOrZero long cacheHitTokens,
        @PositiveOrZero long cacheMissTokens
    ) {
    }
}
