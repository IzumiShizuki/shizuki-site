package io.github.shizuki.site.admin.response;

public record AdminOpsServiceHealthResponse(String name,
                                            String url,
                                            boolean healthy,
                                            int statusCode,
                                            long latencyMs,
                                            String message) {
}
