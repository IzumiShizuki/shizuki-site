package io.github.shizuki.site.user.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "统一 token 颁发请求")
public class AuthGrantRequest {

    @NotBlank
    @Schema(description = "颁发类型", example = "email_password")
    private String grantType;

    @Schema(description = "邮箱", example = "user@example.com")
    private String email;

    @Schema(description = "密码", example = "P@ssw0rd")
    private String password;

    @Schema(description = "OAuth 提供方", example = "github")
    private String provider;

    @Schema(description = "OAuth 登录事务编号", example = "oauth-login-001")
    private String oauthLoginId;

    @Schema(description = "OAuth 授权码", example = "code-001")
    private String code;

    @Schema(description = "OAuth state", example = "state-001")
    private String state;

    @Schema(description = "Refresh token")
    private String refreshToken;

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getOauthLoginId() {
        return oauthLoginId;
    }

    public void setOauthLoginId(String oauthLoginId) {
        this.oauthLoginId = oauthLoginId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}

