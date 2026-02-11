package io.github.shizuki.site.ai.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shizuki.user")
public class AiUserServiceProperties {

    private String serviceUri = "http://localhost:8081";
    private long quotaResolveConnectTimeoutMs = 500L;
    private long quotaResolveTimeoutMs = 1200L;
    private int quotaResolveRetryCount = 1;
    private long quotaResolveRetryBackoffMs = 120L;
    private long quotaResolveRetryMaxBackoffMs = 1000L;

    public String getServiceUri() {
        return serviceUri;
    }

    public void setServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
    }

    public long getQuotaResolveConnectTimeoutMs() {
        return quotaResolveConnectTimeoutMs;
    }

    public void setQuotaResolveConnectTimeoutMs(long quotaResolveConnectTimeoutMs) {
        this.quotaResolveConnectTimeoutMs = Math.max(100L, quotaResolveConnectTimeoutMs);
    }

    public long getQuotaResolveTimeoutMs() {
        return quotaResolveTimeoutMs;
    }

    public void setQuotaResolveTimeoutMs(long quotaResolveTimeoutMs) {
        this.quotaResolveTimeoutMs = Math.max(200L, quotaResolveTimeoutMs);
    }

    public int getQuotaResolveRetryCount() {
        return quotaResolveRetryCount;
    }

    public void setQuotaResolveRetryCount(int quotaResolveRetryCount) {
        this.quotaResolveRetryCount = Math.max(0, quotaResolveRetryCount);
    }

    public long getQuotaResolveRetryBackoffMs() {
        return quotaResolveRetryBackoffMs;
    }

    public void setQuotaResolveRetryBackoffMs(long quotaResolveRetryBackoffMs) {
        this.quotaResolveRetryBackoffMs = Math.max(50L, quotaResolveRetryBackoffMs);
    }

    public long getQuotaResolveRetryMaxBackoffMs() {
        return quotaResolveRetryMaxBackoffMs;
    }

    public void setQuotaResolveRetryMaxBackoffMs(long quotaResolveRetryMaxBackoffMs) {
        this.quotaResolveRetryMaxBackoffMs = Math.max(100L, quotaResolveRetryMaxBackoffMs);
    }
}
