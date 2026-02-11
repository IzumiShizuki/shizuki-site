package io.github.shizuki.site.user.auth;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.Locale;
import org.springframework.util.StringUtils;

public enum OAuthLoginScene {
    LOGIN,
    BIND;

    public static OAuthLoginScene from(String raw) {
        if (!StringUtils.hasText(raw)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "OAuth scene is required");
        }
        try {
            return OAuthLoginScene.valueOf(raw.trim().toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported OAuth scene: " + raw);
        }
    }
}

