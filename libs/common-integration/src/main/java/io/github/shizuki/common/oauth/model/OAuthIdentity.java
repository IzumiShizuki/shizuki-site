package io.github.shizuki.common.oauth.model;

public record OAuthIdentity(String provider,
                            String providerUserId,
                            String login,
                            String email,
                            String nickname,
                            String avatarUrl) {
}

