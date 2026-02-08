package io.github.shizuki.site.user.config;

import io.github.shizuki.common.core.security.SecretValueValidator;
import io.github.shizuki.common.oauth.config.OAuthProperties;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SecretStartupValidator implements ApplicationRunner {

    private final SecretValueValidator secretValueValidator;
    private final OAuthProperties oAuthProperties;
    private final boolean enforce;

    public SecretStartupValidator(SecretValueValidator secretValueValidator,
                                  OAuthProperties oAuthProperties,
                                  @Value("${shizuki.security.secret.enforce:false}") boolean enforce) {
        this.secretValueValidator = secretValueValidator;
        this.oAuthProperties = oAuthProperties;
        this.enforce = enforce;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (!enforce) {
            return;
        }

        List<String> invalidKeys = new ArrayList<>();
        if (secretValueValidator.isInvalid(oAuthProperties.getClientId())) {
            invalidKeys.add("shizuki.oauth.github.client-id");
        }
        if (secretValueValidator.isInvalid(oAuthProperties.getClientSecret())) {
            invalidKeys.add("shizuki.oauth.github.client-secret");
        }

        if (!invalidKeys.isEmpty()) {
            throw new IllegalStateException(
                "Startup blocked by invalid secret configuration: " + String.join(", ", invalidKeys)
                    + ". Please set secure values from Nacos secret configs."
            );
        }
    }
}
