package io.github.shizuki.site.user.auth;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.Locale;
import org.springframework.util.StringUtils;

public enum EmailVerificationPurpose {
    REGISTER,
    BIND,
    RESET_PASSWORD;

    public static EmailVerificationPurpose from(String raw) {
        if (!StringUtils.hasText(raw)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Email verification purpose is required");
        }
        try {
            return EmailVerificationPurpose.valueOf(raw.trim().toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported verification purpose: " + raw);
        }
    }
}

