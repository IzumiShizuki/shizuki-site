package io.github.shizuki.site.ai.dto;

public record AiQuotaStatusResponse(String quotaCode,
                                    Long total,
                                    Long used,
                                    Long remaining) {
}
