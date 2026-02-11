package io.github.shizuki.site.user.auth;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.Locale;
import org.springframework.util.StringUtils;

public enum AuthGrantType {
    EMAIL_PASSWORD,
    OAUTH_CODE,
    REFRESH_TOKEN;

    public static AuthGrantType from(String raw) {
        if (!StringUtils.hasText(raw)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "grant_type is required");
        }
        String normalized = raw.trim().toUpperCase(Locale.ROOT);
        try {
            return AuthGrantType.valueOf(normalized);
        } catch (IllegalArgumentException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported grant_type: " + raw);
        }
    }
}

