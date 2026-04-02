package io.github.shizuki.site.user.response;

import java.time.LocalDateTime;

public record OAuthBindingResponse(String provider,
                                   String providerLogin,
                                   LocalDateTime boundAt) {
}
