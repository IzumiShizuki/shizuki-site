package io.github.shizuki.site.user.config;

import io.github.shizuki.common.core.security.SecretValueValidator;
import io.github.shizuki.common.oauth.config.OAuthProviderProperties;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SecretStartupValidatorTest {

    @Test
    void shouldCollectInvalidSecretKeys() {
        OAuthProviderProperties properties = new OAuthProviderProperties();
        OAuthProviderProperties.ProviderProperties github = new OAuthProviderProperties.ProviderProperties();
        github.setClientId("github-client-id");
        github.setClientSecret("github-client-secret");
        OAuthProviderProperties.ProviderProperties linuxdo = new OAuthProviderProperties.ProviderProperties();
        linuxdo.setClientId("<LINUXDO_CLIENT_ID>");
        linuxdo.setClientSecret("<LINUXDO_CLIENT_SECRET>");
        OAuthProviderProperties.ProviderProperties spotify = new OAuthProviderProperties.ProviderProperties();
        spotify.setClientId("");
        spotify.setClientSecret("");
        Map<String, OAuthProviderProperties.ProviderProperties> providers = new LinkedHashMap<>();
        providers.put("github", github);
        providers.put("linuxdo", linuxdo);
        providers.put("spotify", spotify);
        properties.setProviders(providers);

        AuthProperties authProperties = new AuthProperties();
        authProperties.getJwt().setSecret("secure-jwt-secret");
        MusicSecurityProperties musicSecurityProperties = new MusicSecurityProperties();
        musicSecurityProperties.setKeyEncryptionMasterKey("ENC(AES:abc123)");

        SecretStartupValidator validator = new SecretStartupValidator(
            new SecretValueValidator(),
            properties,
            authProperties,
            musicSecurityProperties,
            false
        );

        Assertions.assertEquals(
            List.of(
                "shizuki.oauth.providers.linuxdo.client-id",
                "shizuki.oauth.providers.linuxdo.client-secret",
                "shizuki.oauth.providers.spotify.client-id",
                "shizuki.oauth.providers.spotify.client-secret"
            ),
            validator.collectInvalidKeys()
        );
    }

    @Test
    void shouldSummarizeInvalidKeysByProvider() {
        String summary = SecretStartupValidator.summarizeInvalidKeys(List.of(
            "shizuki.auth.jwt.secret",
            "shizuki.oauth.providers.linuxdo.client-id",
            "shizuki.oauth.providers.linuxdo.client-secret",
            "shizuki.oauth.providers.spotify.client-id",
            "shizuki.oauth.providers.spotify.client-secret"
        ));

        Assertions.assertEquals(
            "JWT secret (AUTH_JWT_SECRET or shizuki.auth.jwt.secret); "
                + "LinuxDo OAuth credentials (LINUXDO_CLIENT_ID/LINUXDO_CLIENT_SECRET); "
                + "Spotify OAuth credentials (SPOTIFY_CLIENT_ID/SPOTIFY_CLIENT_SECRET)",
            summary
        );
    }
}
