package io.github.shizuki.common.oauth.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitHub token 接口响应模型。
 */
public class GitHubTokenResponse {

    /**
     * access token。
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * token 类型（通常是 bearer）。
     */
    @JsonProperty("token_type")
    private String tokenType;

    /**
     * scope 文本。
     */
    private String scope;

    /**
     * 获取 access token。
     *
     * @return access token
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * 设置 access token。
     *
     * @param accessToken access token
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 获取 token 类型。
     *
     * @return token 类型
     */
    public String getTokenType() {
        return tokenType;
    }

    /**
     * 设置 token 类型。
     *
     * @param tokenType token 类型
     */
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * 获取 scope 文本。
     *
     * @return scope 文本
     */
    public String getScope() {
        return scope;
    }

    /**
     * 设置 scope 文本。
     *
     * @param scope scope 文本
     */
    public void setScope(String scope) {
        this.scope = scope;
    }
}
