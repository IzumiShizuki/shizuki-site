package io.github.shizuki.site.content.config;

import io.github.shizuki.site.content.model.PublicContentCursorCodec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** Shared cursor configuration for every public life-content type. */
@Configuration
@EnableConfigurationProperties(PublicContentCursorProperties.class)
public class PublicContentCursorConfiguration {

    private static final String KEY_DOMAIN = "shizuki:personal-content:cursor:v1:";
    private static final int MIN_SECRET_CHARACTERS = 32;

    @Bean
    public PublicContentCursorCodec publicContentCursorCodec(
        PublicContentCursorProperties cursorProperties,
        PersonalContentFeatureProperties featureProperties
    ) {
        String secret = normalize(cursorProperties.getSecret());
        if (featureProperties.isPublicApiAvailable() && secret.length() < MIN_SECRET_CHARACTERS) {
            throw new IllegalStateException(
                "shizuki.site.personal-content.cursor.secret must contain at least 32 characters "
                    + "when the public API is enabled"
            );
        }
        if (secret.isEmpty()) {
            byte[] disabledKey = new byte[32];
            new SecureRandom().nextBytes(disabledKey);
            return new PublicContentCursorCodec(disabledKey);
        }
        return new PublicContentCursorCodec(deriveKey(secret));
    }

    static byte[] deriveKey(String secret) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return digest.digest((KEY_DOMAIN + secret).getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException exception) {
            throw new IllegalStateException("SHA-256 is unavailable", exception);
        }
    }

    private static String normalize(String value) {
        return value == null ? "" : value.trim();
    }
}
