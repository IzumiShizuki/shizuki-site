package io.github.shizuki.site.user.auth;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.util.Locale;
import org.springframework.util.StringUtils;

/**
 * OAuth 登录场景枚举。
 *
 * <p>用于区分“登录/注册”与“已登录绑定”两类 OAuth 流程。
 */
public enum OAuthLoginScene {
    /**
     * OAuth 登录场景：用于新登录或快捷注册。
     */
    LOGIN,
    /**
     * OAuth 绑定场景：用于已登录用户追加绑定第三方凭据。
     */
    BIND;

    /**
     * 解析 OAuth 场景字符串。
     *
     * @param raw 前端传入 scene
     * @return 场景枚举
     */
    public static OAuthLoginScene from(String raw) {
        if (!StringUtils.hasText(raw)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "OAuth scene is required");
        }
        // 支持大小写无关输入，降低接入端对大小写的耦合。
        try {
            return OAuthLoginScene.valueOf(raw.trim().toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException ex) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported OAuth scene: " + raw);
        }
    }
}
