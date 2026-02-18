package io.github.shizuki.site.user.auth;

import java.util.Set;

/**
 * 授权策略统一输出结果。
 *
 * <p>既支持直接签发 token，也支持 OAuth 冲突时返回显式绑定凭据。
 */
public class AuthGrantResult {

    /**
     * 授权结果类型。
     */
    public enum ResultType {
        /**
         * 授权成功并已签发 access/refresh token。
         */
        TOKEN_ISSUED,
        /**
         * 检测到账号冲突，需要前端走显式确认绑定流程。
         */
        BIND_REQUIRED
    }

    /**
     * 当前授权结果类型。
     */
    private ResultType resultType;
    /**
     * access token（JWT）。
     */
    private String accessToken;
    /**
     * token 类型，固定为 Bearer。
     */
    private String tokenType;
    /**
     * access token 过期秒数。
     */
    private Long expiresInSec;
    /**
     * refresh token 原文（仅签发时返回给前端）。
     */
    private String refreshToken;
    /**
     * refresh token 过期秒数。
     */
    private Long refreshExpiresInSec;
    /**
     * 已认证用户 ID。
     */
    private Long userId;
    /**
     * 用户分组集合，用于前端与网关鉴权语义。
     */
    private Set<String> groups;
    /**
     * 冲突绑定票据，仅在 {@link ResultType#BIND_REQUIRED} 时返回。
     */
    private String bindTicket;

    /**
     * 构造“需要绑定确认”的结果对象。
     *
     * @param bindTicket 冲突绑定票据
     * @return 绑定确认结果
     */
    public static AuthGrantResult bindRequired(String bindTicket) {
        AuthGrantResult result = new AuthGrantResult();
        result.setResultType(ResultType.BIND_REQUIRED);
        result.setBindTicket(bindTicket);
        return result;
    }

    /**
     * 获取授权结果类型。
     *
     * @return 授权结果类型
     */
    public ResultType getResultType() {
        return resultType;
    }

    /**
     * 设置授权结果类型。
     *
     * @param resultType 授权结果类型
     */
    public void setResultType(ResultType resultType) {
        this.resultType = resultType;
    }

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
     * 获取 access token 过期秒数。
     *
     * @return 过期秒数
     */
    public Long getExpiresInSec() {
        return expiresInSec;
    }

    /**
     * 设置 access token 过期秒数。
     *
     * @param expiresInSec 过期秒数
     */
    public void setExpiresInSec(Long expiresInSec) {
        this.expiresInSec = expiresInSec;
    }

    /**
     * 获取 refresh token。
     *
     * @return refresh token
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * 设置 refresh token。
     *
     * @param refreshToken refresh token
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * 获取 refresh token 过期秒数。
     *
     * @return refresh token 过期秒数
     */
    public Long getRefreshExpiresInSec() {
        return refreshExpiresInSec;
    }

    /**
     * 设置 refresh token 过期秒数。
     *
     * @param refreshExpiresInSec refresh token 过期秒数
     */
    public void setRefreshExpiresInSec(Long refreshExpiresInSec) {
        this.refreshExpiresInSec = refreshExpiresInSec;
    }

    /**
     * 获取用户 ID。
     *
     * @return 用户 ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户 ID。
     *
     * @param userId 用户 ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户分组集合。
     *
     * @return 用户分组集合
     */
    public Set<String> getGroups() {
        return groups;
    }

    /**
     * 设置用户分组集合。
     *
     * @param groups 用户分组集合
     */
    public void setGroups(Set<String> groups) {
        this.groups = groups;
    }

    /**
     * 获取绑定票据。
     *
     * @return 绑定票据
     */
    public String getBindTicket() {
        return bindTicket;
    }

    /**
     * 设置绑定票据。
     *
     * @param bindTicket 绑定票据
     */
    public void setBindTicket(String bindTicket) {
        this.bindTicket = bindTicket;
    }
}
