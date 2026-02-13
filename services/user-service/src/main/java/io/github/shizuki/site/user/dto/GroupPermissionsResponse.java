package io.github.shizuki.site.user.dto;

import java.util.Set;

public record GroupPermissionsResponse(String groupCode, Set<String> permissions) {
}
