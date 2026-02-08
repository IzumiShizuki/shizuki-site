package io.github.shizuki.common.audit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shizuki.audit.outbox")
public class AuditOutboxProperties {

    private boolean enabled = true;
    private int batchSize = 100;
    private long pollInterval = 5000L;
    private int maxRetries = 5;
    private int retryBaseSeconds = 5;
    private int retryMaxSeconds = 300;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(int batchSize) {
        this.batchSize = Math.max(batchSize, 1);
    }

    public long getPollInterval() {
        return pollInterval;
    }

    public void setPollInterval(long pollInterval) {
        this.pollInterval = Math.max(pollInterval, 1000L);
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = Math.max(maxRetries, 1);
    }

    public int getRetryBaseSeconds() {
        return retryBaseSeconds;
    }

    public void setRetryBaseSeconds(int retryBaseSeconds) {
        this.retryBaseSeconds = Math.max(retryBaseSeconds, 1);
    }

    public int getRetryMaxSeconds() {
        return retryMaxSeconds;
    }

    public void setRetryMaxSeconds(int retryMaxSeconds) {
        this.retryMaxSeconds = Math.max(retryMaxSeconds, 1);
    }
}
