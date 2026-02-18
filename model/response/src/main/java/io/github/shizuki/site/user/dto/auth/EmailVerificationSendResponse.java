package io.github.shizuki.site.user.dto.auth;

public record EmailVerificationSendResponse(String status, Long cooldownSec) {
}

