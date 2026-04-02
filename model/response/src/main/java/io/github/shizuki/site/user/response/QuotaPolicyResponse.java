package io.github.shizuki.site.user.response;

public record QuotaPolicyResponse(String policyId,
                                  String groupCode,
                                  String quotaCode,
                                  Long value) {
}
