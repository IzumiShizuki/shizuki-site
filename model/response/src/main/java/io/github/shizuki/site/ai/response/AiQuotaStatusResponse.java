package io.github.shizuki.site.ai.response;

public record AiQuotaStatusResponse(String quotaCode,
                                    Long total,
                                    Long used,
                                    Long remaining) {
}
