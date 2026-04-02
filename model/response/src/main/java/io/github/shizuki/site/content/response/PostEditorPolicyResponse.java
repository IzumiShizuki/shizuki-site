package io.github.shizuki.site.content.response;

import java.util.List;
import java.util.Set;

public record PostEditorPolicyResponse(
    List<String> groupOptions,
    List<CategoryDefaultItem> categoryDefaults
) {
    public record CategoryDefaultItem(
        String categoryCode,
        boolean enabled,
        Set<String> allowedGroupCodes
    ) {
    }
}
