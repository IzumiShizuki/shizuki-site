package io.github.shizuki.common.security.service;

import io.github.shizuki.common.security.model.LoginUser;

public interface AclChecker {

    default boolean hasPermission(LoginUser loginUser, String permission) {
        return loginUser != null && loginUser.hasPermission(permission);
    }

    default boolean inGroup(LoginUser loginUser, String groupCode) {
        return loginUser != null && loginUser.inGroup(groupCode);
    }
}
