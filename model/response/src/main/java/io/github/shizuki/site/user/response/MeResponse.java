package io.github.shizuki.site.user.response;

import java.util.Set;

public record MeResponse(Long userId,
                         String nickname,
                         String avatarUrl,
                         Set<String> groups,
                         Set<String> permissions) {
}
