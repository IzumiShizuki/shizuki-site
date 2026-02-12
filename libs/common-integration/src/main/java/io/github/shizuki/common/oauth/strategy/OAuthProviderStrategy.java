package io.github.shizuki.common.oauth.strategy;

import io.github.shizuki.common.oauth.model.OAuthIdentity;

/**
 * OAuth provider 策略接口。
 */
public interface OAuthProviderStrategy {

    /**
     * 返回 provider 编码（如 github / linuxdo）。
     *
     * @return provider code
     */
    String providerCode();

    /**
     * 构建授权跳转 URL。
     *
     * @param state OAuth state
     * @param redirectUri 回调地址
     * @return 授权 URL
     */
    String buildAuthorizeUrl(String state, String redirectUri);

    /**
     * 用授权码交换用户身份信息。
     *
     * @param code 授权码
     * @param redirectUri 回调地址
     * @return 标准化 OAuth 身份
     */
    OAuthIdentity exchangeCode(String code, String redirectUri);
}
