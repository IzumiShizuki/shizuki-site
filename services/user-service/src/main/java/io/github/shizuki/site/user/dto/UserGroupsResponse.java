package io.github.shizuki.site.user.dto;

import java.util.Set;

public record UserGroupsResponse(Long userId, Set<String> groups) {
}
