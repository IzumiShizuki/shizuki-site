package io.github.shizuki.site.user.dto;

import java.time.LocalDateTime;

public record OAuthBindingView(String provider,
                               String providerLogin,
                               LocalDateTime boundAt) {
}
