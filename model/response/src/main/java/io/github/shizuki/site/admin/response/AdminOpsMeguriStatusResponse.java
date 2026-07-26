package io.github.shizuki.site.admin.response;

public record AdminOpsMeguriStatusResponse(boolean containerFound,
                                           String containerId,
                                           String containerName,
                                           String state,
                                           String status,
                                           boolean running,
                                           boolean manageable,
                                           boolean metricsPresent,
                                           String metricsReceivedAt,
                                           long metricsAgeSeconds,
                                           boolean metricsStale,
                                           AdminOpsServiceHealthResponse health) {
}
