package io.github.shizuki.site.user.dto;

import java.util.List;

public record MeAccountResponse(Long userId,
                                String username,
                                String nickname,
                                String email,
                                Integer emailVerified,
                                String avatarUrl,
                                Boolean hasPassword,
                                List<OAuthBindingResponse> oauthBindings) {
}
