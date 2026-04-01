package io.github.shizuki.site.user.dto;

public record QuotaPolicyResponse(String policyId,
                                  String groupCode,
                                  String quotaCode,
                                  Long value) {
}
