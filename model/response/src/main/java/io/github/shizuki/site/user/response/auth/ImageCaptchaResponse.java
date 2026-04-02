package io.github.shizuki.site.user.response.auth;

public record ImageCaptchaResponse(String captchaId, String svgContent, Long expiresInSec) {
}

