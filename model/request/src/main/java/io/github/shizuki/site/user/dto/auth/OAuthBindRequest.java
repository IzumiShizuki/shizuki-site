package io.github.shizuki.site.user.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "登录用户绑定 OAuth 请求")
public class OAuthBindRequest {

    @NotBlank
    @Schema(description = "OAuth 提供方", example = "github")
    private String provider;

    @NotBlank
    @Schema(description = "OAuth 登录事务编号", example = "oauth-login-001")
    private String oauthLoginId;

    @NotBlank
    @Schema(description = "OAuth 授权码", example = "code-001")
    private String code;

    @NotBlank
    @Schema(description = "OAuth state", example = "state-001")
    private String state;

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
}

