package io.github.shizuki.common.oauth.strategy;

import io.github.shizuki.common.core.resilience.SpringRetryExecutor;
import io.github.shizuki.common.oauth.config.OAuthProviderProperties;
import io.github.shizuki.common.oauth.model.OAuthIdentity;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestClient;

class SpotifyOAuthProviderStrategyTest {

    @Test
    void shouldMapSpotifyIdentitySuccessfully() {
        ExposedSpotifyOAuthProviderStrategy strategy = new ExposedSpotifyOAuthProviderStrategy(
            new OAuthProviderProperties(),
            RestClient.builder(),
            new SpringRetryExecutor()
        );
        OAuthIdentity identity = strategy.publicMapIdentity(
            Map.of(
                "id", "spotify-user-1",
                "display_name", "Spotify Demo",
                "email", "demo@spotify.test",
                "images", List.of(Map.of("url", "https://cdn.spotify.test/avatar.png"))
            )
        );

        Assertions.assertEquals("spotify", identity.provider());
        Assertions.assertEquals("spotify-user-1", identity.providerUserId());
        Assertions.assertEquals("Spotify Demo", identity.login());
        Assertions.assertEquals("demo@spotify.test", identity.email());
        Assertions.assertEquals("https://cdn.spotify.test/avatar.png", identity.avatarUrl());
    }

    private static final class ExposedSpotifyOAuthProviderStrategy extends SpotifyOAuthProviderStrategy {

        private ExposedSpotifyOAuthProviderStrategy(OAuthProviderProperties properties,
                                                    RestClient.Builder restClientBuilder,
                                                    SpringRetryExecutor retryExecutor) {
            super(properties, restClientBuilder, retryExecutor);
        }

        private OAuthIdentity publicMapIdentity(Map<String, Object> payload) {
            return super.mapIdentity(payload);
        }
    }
}
