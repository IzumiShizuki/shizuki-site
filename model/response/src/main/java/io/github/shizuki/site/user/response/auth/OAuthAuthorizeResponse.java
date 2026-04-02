package io.github.shizuki.site.user.response.auth;

public record OAuthAuthorizeResponse(String oauthLoginId, String authorizeUrl, String state) {
}

