package io.github.shizuki.site.content.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Stable server-side secret used by typed Album/Moment public cursors.
 *
 * <p>The configured value is never embedded in a cursor. It is domain-separated and hashed into
 * the fixed-size AES key consumed by {@code PublicContentCursorCodec}.
 */
@ConfigurationProperties(prefix = "shizuki.site.personal-content.cursor")
public class PublicContentCursorProperties {

    private String secret;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
