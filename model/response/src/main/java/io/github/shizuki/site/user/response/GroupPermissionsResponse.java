package io.github.shizuki.site.user.response;

import java.util.Set;

public record GroupPermissionsResponse(String groupCode, Set<String> permissions) {
}
