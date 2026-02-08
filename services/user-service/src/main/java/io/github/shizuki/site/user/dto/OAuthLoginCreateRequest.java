package io.github.shizuki.site.user.dto;

import jakarta.validation.constraints.NotBlank;

public class OAuthLoginCreateRequest {

    @NotBlank
    private String provider;

    @NotBlank
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
