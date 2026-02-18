package io.github.shizuki.site.content.dto;

import java.util.Set;

public record ContentVisibilityResponse(Long targetId, String visibility, Set<String> allowedGroupCodes) {
}
