package io.github.shizuki.site.user.response;

import java.util.Set;

public record UserGroupsResponse(Long userId, Set<String> groups) {
}
