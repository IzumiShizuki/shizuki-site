package io.github.shizuki.site.user.dto;

import java.util.Set;

public record MeResponse(Long userId, String nickname, Set<String> groups, Set<String> permissions) {
}
