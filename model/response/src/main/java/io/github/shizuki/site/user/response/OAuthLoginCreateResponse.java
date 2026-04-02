package io.github.shizuki.site.user.response;

public record OAuthLoginCreateResponse(String oauthLoginId, String authorizeUrl, String state) {
}
