package io.github.shizuki.site.user.dto.auth;

import java.util.Set;

public record AuthTokenResponse(String resultType,
                                String accessToken,
                                String tokenType,
                                Long expiresInSec,
                                String refreshToken,
                                Long refreshExpiresInSec,
                                Long userId,
                                Set<String> groups,
                                String bindTicket) {
}

