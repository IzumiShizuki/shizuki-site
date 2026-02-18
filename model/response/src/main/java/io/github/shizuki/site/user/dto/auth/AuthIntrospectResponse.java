package io.github.shizuki.site.user.dto.auth;

import java.util.Set;

public record AuthIntrospectResponse(Long userId, Set<String> groups, Set<String> permissions) {
}
