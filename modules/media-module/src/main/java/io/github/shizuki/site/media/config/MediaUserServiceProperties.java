package io.github.shizuki.site.media.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 媒体服务访问用户服务的配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.user")
public class MediaUserServiceProperties {

    private String serviceUri = "http://localhost:8081";
    private long timeoutMs = 1200L;

    public String getServiceUri() {
        return serviceUri;
    }

    public void setServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
    }

    public long getTimeoutMs() {
        return timeoutMs;
    }

    public void setTimeoutMs(long timeoutMs) {
        this.timeoutMs = Math.max(200L, timeoutMs);
    }
}
