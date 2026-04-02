package io.github.shizuki.site.user.response.auth;

public record AuthLoginResponse(String token, String tokenType, Long userId) {
}
