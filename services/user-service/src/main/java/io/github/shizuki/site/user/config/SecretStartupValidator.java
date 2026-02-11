package io.github.shizuki.site.user.config;

import io.github.shizuki.common.core.security.SecretValueValidator;
import io.github.shizuki.common.oauth.config.OAuthProviderProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SecretStartupValidator implements ApplicationRunner {

    private final SecretValueValidator secretValueValidator;
    private final OAuthProviderProperties oAuthProviderProperties;
    private final AuthProperties authProperties;
    private final boolean enforce;

    public SecretStartupValidator(SecretValueValidator secretValueValidator,
                                  OAuthProviderProperties oAuthProviderProperties,
                                  AuthProperties authProperties,
                                  @Value("${shizuki.security.secret.enforce:false}") boolean enforce) {
        this.secretValueValidator = secretValueValidator;
        this.oAuthProviderProperties = oAuthProviderProperties;
        this.authProperties = authProperties;
        this.enforce = enforce;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (!enforce) {
            return;
        }

        List<String> invalidKeys = new ArrayList<>();
        if (secretValueValidator.isInvalid(authProperties.getJwt().getSecret())) {
            invalidKeys.add("shizuki.auth.jwt.secret");
        }

        for (Map.Entry<String, OAuthProviderProperties.ProviderProperties> entry : oAuthProviderProperties.getProviders().entrySet()) {
            String provider = entry.getKey();
            OAuthProviderProperties.ProviderProperties config = entry.getValue();
            if (secretValueValidator.isInvalid(config.getClientId())) {
                invalidKeys.add("shizuki.oauth.providers." + provider + ".client-id");
            }
            if (secretValueValidator.isInvalid(config.getClientSecret())) {
                invalidKeys.add("shizuki.oauth.providers." + provider + ".client-secret");
            }
        }

        if (!invalidKeys.isEmpty()) {
            throw new IllegalStateException(
                "Startup blocked by invalid secret configuration: " + String.join(", ", invalidKeys)
                    + ". Please set secure values from Nacos secret configs."
            );
        }
    }
}
