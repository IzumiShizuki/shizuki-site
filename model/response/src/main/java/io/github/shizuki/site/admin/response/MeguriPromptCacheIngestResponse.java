package io.github.shizuki.site.admin.response;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Meguri metrics ingest receipt")
public record MeguriPromptCacheIngestResponse(
    String sourceId,
    String acceptedAt
) {
}
