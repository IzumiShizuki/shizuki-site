package io.github.shizuki.common.oauth.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * GitHub OAuth 旧版配置属性。
 *
 * <p>对应配置前缀 {@code shizuki.oauth.github}。
 */
@ConfigurationProperties(prefix = "shizuki.oauth.github")
public class OAuthProperties {

    /**
     * OAuth client id。
     */
    private String clientId;
    /**
     * OAuth client secret。
     */
    private String clientSecret;
    /**
     * 授权地址。
     */
    private String authorizeUrl = "https://github.com/login/oauth/authorize";
    /**
     * token 交换地址。
     */
    private String tokenUrl = "https://github.com/login/oauth/access_token";
    /**
     * 用户信息地址。
     */
    private String userApiUrl = "https://api.github.com/user";

    /**
     * 获取 OAuth client id。
     *
     * @return client id
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * 设置 OAuth client id。
     *
     * @param clientId client id
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * 获取 OAuth client secret。
     *
     * @return client secret
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * 设置 OAuth client secret。
     *
     * @param clientSecret client secret
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * 获取授权地址。
     *
     * @return 授权地址
     */
    public String getAuthorizeUrl() {
        return authorizeUrl;
    }

    /**
     * 设置授权地址。
     *
     * @param authorizeUrl 授权地址
     */
    public void setAuthorizeUrl(String authorizeUrl) {
        this.authorizeUrl = authorizeUrl;
    }

    /**
     * 获取 token 交换地址。
     *
     * @return token 地址
     */
    public String getTokenUrl() {
        return tokenUrl;
    }

    /**
     * 设置 token 交换地址。
     *
     * @param tokenUrl token 地址
     */
    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    /**
     * 获取用户信息地址。
     *
     * @return 用户信息地址
     */
    public String getUserApiUrl() {
        return userApiUrl;
    }

    /**
     * 设置用户信息地址。
     *
     * @param userApiUrl 用户信息地址
     */
    public void setUserApiUrl(String userApiUrl) {
        this.userApiUrl = userApiUrl;
    }
}
