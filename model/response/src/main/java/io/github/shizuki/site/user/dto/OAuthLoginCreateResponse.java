package io.github.shizuki.site.user.dto;

public record OAuthLoginCreateResponse(String oauthLoginId, String authorizeUrl, String state) {
}
