package io.github.shizuki.site.user.auth;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.Locale;
import org.springframework.util.StringUtils;

/**
 * 邮箱验证码用途枚举。
 *
 * <p>用于区分注册、绑定与重置密码等验证码业务语义。
 */
public enum EmailVerificationPurpose {
    /**
     * 邮箱注册验证码。
     */
    REGISTER,
    /**
     * 绑定邮箱验证码。
     */
    BIND,
    /**
     * 重置密码验证码。
     */
    RESET_PASSWORD;

    /**
     * 解析邮箱验证码用途。
     *
     * @param raw 前端传入用途
     * @return 用途枚举
     */
    public static EmailVerificationPurpose from(String raw) {
        if (!StringUtils.hasText(raw)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Email verification purpose is required");
        }
        // 统一按大写枚举匹配，避免前端枚举大小写不一致导致请求失败。
        try {
            return EmailVerificationPurpose.valueOf(raw.trim().toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported verification purpose: " + raw);
        }
    }
}
