package io.github.shizuki.site.user.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "创建 OAuth 授权请求")
public class OAuthAuthorizeRequest {

    @NotBlank
    @Schema(description = "OAuth 提供方", example = "github")
    private String provider;

    @NotBlank
    @Schema(description = "回调地址", example = "https://example.com/oauth/callback")
    private String redirectUri;

    @NotBlank
    @Schema(description = "场景：login|bind", example = "login")
    private String scene;

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

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }
}

