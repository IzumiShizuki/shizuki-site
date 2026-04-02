package io.github.shizuki.site.content.response;

import java.util.Set;

public record PostCategoryPolicyResponse(
    String categoryCode,
    boolean enabled,
    Set<String> allowedGroupCodes
) {
}
