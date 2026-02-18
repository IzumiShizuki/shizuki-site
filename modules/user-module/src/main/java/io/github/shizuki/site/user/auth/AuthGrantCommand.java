package io.github.shizuki.site.user.auth;

/**
 * 授权命令对象。
 *
 * <p>由 controller 请求组装而成，作为策略层的统一输入载体。
 */
public class AuthGrantCommand {

    /**
     * 授权类型，决定由哪个策略执行。
     */
    private AuthGrantType grantType;
    /**
     * 邮箱登录时使用的邮箱地址。
     */
    private String email;
    /**
     * 邮箱登录或冲突绑定确认时使用的密码明文（仅本次请求内使用）。
     */
    private String password;
    /**
     * OAuth provider 编码（github / linuxdo）。
     */
    private String provider;
    /**
     * OAuth 授权事务 ID，用于关联 state 与登录场景。
     */
    private String oauthLoginId;
    /**
     * OAuth 回调授权码。
     */
    private String code;
    /**
     * OAuth 回调 state，用于 CSRF 防护与事务校验。
     */
    private String state;
    /**
     * 刷新登录态时使用的 refresh token。
     */
    private String refreshToken;
    /**
     * 当前登录用户 ID，仅绑定流程需要。
     */
    private Long loginUserId;

    /**
     * 获取授权类型。
     *
     * @return 授权类型
     */
    public AuthGrantType getGrantType() {
        return grantType;
    }

    /**
     * 设置授权类型。
     *
     * @param grantType 授权类型
     */
    public void setGrantType(AuthGrantType grantType) {
        this.grantType = grantType;
    }

    /**
     * 获取邮箱地址。
     *
     * @return 邮箱地址
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱地址。
     *
     * @param email 邮箱地址
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取密码明文。
     *
     * @return 密码明文
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码明文。
     *
     * @param password 密码明文
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取 OAuth provider 编码。
     *
     * @return provider 编码
     */
    public String getProvider() {
        return provider;
    }

    /**
     * 设置 OAuth provider 编码。
     *
     * @param provider provider 编码
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * 获取 OAuth 授权事务 ID。
     *
     * @return oauth_login_id
     */
    public String getOauthLoginId() {
        return oauthLoginId;
    }

    /**
     * 设置 OAuth 授权事务 ID。
     *
     * @param oauthLoginId oauth_login_id
     */
    public void setOauthLoginId(String oauthLoginId) {
        this.oauthLoginId = oauthLoginId;
    }

    /**
     * 获取 OAuth 授权码。
     *
     * @return OAuth 授权码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置 OAuth 授权码。
     *
     * @param code OAuth 授权码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取 OAuth 状态值。
     *
     * @return state 值
     */
    public String getState() {
        return state;
    }

    /**
     * 设置 OAuth 状态值。
     *
     * @param state state 值
     */
    public void setState(String state) {
        this.state = state;
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
     * 获取当前登录用户 ID。
     *
     * @return 当前登录用户 ID
     */
    public Long getLoginUserId() {
        return loginUserId;
    }

    /**
     * 设置当前登录用户 ID。
     *
     * @param loginUserId 当前登录用户 ID
     */
    public void setLoginUserId(Long loginUserId) {
        this.loginUserId = loginUserId;
    }
}
