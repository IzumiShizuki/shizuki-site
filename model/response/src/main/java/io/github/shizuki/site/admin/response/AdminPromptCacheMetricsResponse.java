package io.github.shizuki.site.admin.response;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Map;

@Schema(description = "Latest Meguri prompt-cache metrics visible only to administrators")
public record AdminPromptCacheMetricsResponse(
    boolean available,
    String receivedAt,
    long ageSeconds,
    boolean stale,
    Map<String, Object> metrics
) {
}
