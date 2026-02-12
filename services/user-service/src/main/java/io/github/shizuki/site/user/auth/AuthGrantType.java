package io.github.shizuki.site.user.auth;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.Locale;
import org.springframework.util.StringUtils;

/**
 * 统一授权类型枚举。
 *
 * <p>用于标识 `/auth/tokens` 接口的 grant_type 分发目标。
 */
public enum AuthGrantType {
    /**
     * 邮箱 + 密码登录。
     */
    EMAIL_PASSWORD,
    /**
     * OAuth 授权码登录。
     */
    OAUTH_CODE,
    /**
     * refresh token 刷新登录态。
     */
    REFRESH_TOKEN;

    /**
     * 将前端传入 grant_type 字符串转换为枚举值。
     *
     * @param raw 前端请求中的 grant_type
     * @return 解析后的授权类型枚举
     */
    public static AuthGrantType from(String raw) {
        if (!StringUtils.hasText(raw)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "grant_type is required");
        }
        // 容忍大小写差异，统一走大写标准值。
        String normalized = raw.trim().toUpperCase(Locale.ROOT);
        try {
            return AuthGrantType.valueOf(normalized);
        } catch (IllegalArgumentException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported grant_type: " + raw);
        }
    }
}
