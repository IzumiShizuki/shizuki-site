package io.github.shizuki.site.media.config;

import io.github.shizuki.common.core.security.SecretValueValidator;
import io.github.shizuki.common.storage.config.OssProperties;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SecretStartupValidator implements ApplicationRunner {

    private final SecretValueValidator secretValueValidator;
    private final OssProperties ossProperties;
    private final boolean enforce;

    public SecretStartupValidator(SecretValueValidator secretValueValidator,
                                  OssProperties ossProperties,
                                  @Value("${shizuki.security.secret.enforce:false}") boolean enforce) {
        this.secretValueValidator = secretValueValidator;
        this.ossProperties = ossProperties;
        this.enforce = enforce;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (!enforce) {
            return;
        }

        List<String> invalidKeys = new ArrayList<>();
        if (secretValueValidator.isInvalid(ossProperties.getAccessKeyId())) {
            invalidKeys.add("shizuki.oss.access-key-id");
        }
        if (secretValueValidator.isInvalid(ossProperties.getAccessKeySecret())) {
            invalidKeys.add("shizuki.oss.access-key-secret");
        }

        if (!invalidKeys.isEmpty()) {
            throw new IllegalStateException(
                "Startup blocked by invalid secret configuration: " + String.join(", ", invalidKeys)
                    + ". Please set secure values from Nacos secret configs."
            );
        }
    }
}
