package io.github.shizuki.common.security.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LoginUser {

    private final Long userId;
    private final Set<String> groups;
    private final Set<String> permissions;

    public LoginUser(Long userId, Set<String> groups, Set<String> permissions) {
        this.userId = userId;
        this.groups = groups == null ? Collections.emptySet() : new HashSet<>(groups);
        this.permissions = permissions == null ? Collections.emptySet() : new HashSet<>(permissions);
    }

    public Long getUserId() {
        return userId;
    }

    public Set<String> getGroups() {
        return Collections.unmodifiableSet(groups);
    }

    public Set<String> getPermissions() {
        return Collections.unmodifiableSet(permissions);
    }

    public boolean hasPermission(String permission) {
        return permissions.contains(permission);
    }

    public boolean inGroup(String groupCode) {
        return groups.contains(groupCode);
    }
}
