package io.github.shizuki.site.user.dto;

import java.time.LocalDateTime;

public record OAuthBindingResponse(String provider,
                                   String providerLogin,
                                   LocalDateTime boundAt) {
}
