package io.github.shizuki.site.user.dto.auth;

public record OAuthAuthorizeResponse(String oauthLoginId, String authorizeUrl, String state) {
}

