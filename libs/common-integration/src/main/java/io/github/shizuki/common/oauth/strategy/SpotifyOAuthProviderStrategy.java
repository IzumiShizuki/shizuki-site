package io.github.shizuki.common.oauth.strategy;

import io.github.shizuki.common.core.resilience.SpringRetryExecutor;
import io.github.shizuki.common.oauth.config.OAuthProviderProperties;
import io.github.shizuki.common.oauth.model.OAuthIdentity;
import java.util.Map;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;

/**
 * Spotify OAuth provider 策略实现。
 */
@Component
public class SpotifyOAuthProviderStrategy extends AbstractOAuthProviderStrategy {

    public SpotifyOAuthProviderStrategy(OAuthProviderProperties properties,
                                        RestClient.Builder restClientBuilder,
                                        SpringRetryExecutor retryExecutor) {
        super(properties, restClientBuilder, retryExecutor);
    }

    @Override
    public String providerCode() {
        return "spotify";
    }

    @Override
    protected OAuthIdentity mapIdentity(Map<String, Object> userInfo) {
        String providerUserId = readString(userInfo, "id");
        if (!StringUtils.hasText(providerUserId)) {
            throw new NonRetryableOAuthException("Spotify user response missing id");
        }
        String login = firstNonBlank(
            readString(userInfo, "display_name"),
            readString(userInfo, "id")
        );
        String avatarUrl = "";
        Object images = userInfo == null ? null : userInfo.get("images");
        if (images instanceof Iterable<?> iterable) {
            for (Object item : iterable) {
                if (item instanceof Map<?, ?> imageMap) {
                    Object rawUrl = imageMap.get("url");
                    if (rawUrl != null) {
                        String normalized = String.valueOf(rawUrl).trim();
                        if (StringUtils.hasText(normalized)) {
                            avatarUrl = normalized;
                            break;
                        }
                    }
                }
            }
        }

        return new OAuthIdentity(
            providerCode(),
            providerUserId,
            login,
            readString(userInfo, "email"),
            login,
            avatarUrl
        );
    }
}
