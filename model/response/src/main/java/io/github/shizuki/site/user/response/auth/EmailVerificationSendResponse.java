package io.github.shizuki.site.user.response.auth;

public record EmailVerificationSendResponse(String status, Long cooldownSec) {
}

