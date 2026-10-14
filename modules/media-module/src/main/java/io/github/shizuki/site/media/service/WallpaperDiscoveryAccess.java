package io.github.shizuki.site.media.service;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.security.model.LoginUser;

/** Authorization boundary for unmoderated external wallpaper sources. */
public final class WallpaperDiscoveryAccess {
    public static final String PERMISSION = "media.wallpaper.discovery";

    private WallpaperDiscoveryAccess() { }

    public static void requireAccess() {
        LoginUser user = LoginUserContext.get().orElse(null);
        if (user == null || user.getUserId() == null || user.getUserId() <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "Login required");
        }
        if (!user.inGroup("ADMIN") && !user.hasPermission(PERMISSION)) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Wallpaper discovery access denied");
        }
    }
}
