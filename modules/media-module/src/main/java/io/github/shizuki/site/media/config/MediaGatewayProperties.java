package io.github.shizuki.site.media.config;

import java.nio.charset.StandardCharsets;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 站内媒体网关缓存与短时 capability 配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.media.gateway")
public class MediaGatewayProperties implements InitializingBean {

    private String capabilitySecret = "";
    private long capabilityTtlSeconds = 300L;
    private long publicMaxAgeSeconds = 0L;

    public String getCapabilitySecret() {
        return capabilitySecret;
    }

    public void setCapabilitySecret(String capabilitySecret) {
        this.capabilitySecret = capabilitySecret;
    }

    public long getCapabilityTtlSeconds() {
        return capabilityTtlSeconds;
    }

    public void setCapabilityTtlSeconds(long capabilityTtlSeconds) {
        this.capabilityTtlSeconds = capabilityTtlSeconds;
    }

    public long getPublicMaxAgeSeconds() {
        return publicMaxAgeSeconds;
    }

    public void setPublicMaxAgeSeconds(long publicMaxAgeSeconds) {
        this.publicMaxAgeSeconds = publicMaxAgeSeconds;
    }

    public byte[] capabilitySecretBytes() {
        return capabilitySecret == null
            ? new byte[0]
            : capabilitySecret.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public void afterPropertiesSet() {
        if (capabilitySecretBytes().length < 32) {
            throw new IllegalStateException("media gateway capability-secret must contain at least 32 bytes");
        }
        if (capabilityTtlSeconds < 30 || capabilityTtlSeconds > 900) {
            throw new IllegalStateException("media gateway capability-ttl-seconds must be between 30 and 900");
        }
        if (publicMaxAgeSeconds < 0 || publicMaxAgeSeconds > 300) {
            throw new IllegalStateException("media gateway public-max-age-seconds must be between 0 and 300");
        }
    }
}
