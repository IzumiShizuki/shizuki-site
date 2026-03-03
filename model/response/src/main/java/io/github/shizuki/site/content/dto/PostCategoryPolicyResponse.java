package io.github.shizuki.site.content.dto;

import java.util.Set;

public record PostCategoryPolicyResponse(
    String categoryCode,
    boolean enabled,
    Set<String> allowedGroupCodes
) {
}
