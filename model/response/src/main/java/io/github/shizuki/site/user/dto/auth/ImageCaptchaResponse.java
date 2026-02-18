package io.github.shizuki.site.user.dto.auth;

public record ImageCaptchaResponse(String captchaId, String svgContent, Long expiresInSec) {
}

