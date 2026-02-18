package io.github.shizuki.site.user.dto.auth;

public record AuthLoginResponse(String token, String tokenType, Long userId) {
}
