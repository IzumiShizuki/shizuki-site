package io.github.shizuki.site.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "发起 OAuth 登录请求")
public class OAuthLoginCreateRequest {

    @NotBlank
    @Schema(description = "OAuth 提供方", example = "github")
    private String provider;

    @NotBlank
    @Schema(description = "登录回调地址", example = "https://example.com/oauth/callback")
    private String redirectUri;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }
}
