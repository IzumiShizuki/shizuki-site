package io.github.shizuki.site.media.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 个人照片派生管线的独立发布与上游处理开关。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.media.derivatives")
public class MediaDerivativeFeatureProperties implements InitializingBean {

    private boolean enabled = false;
    private boolean workerEnabled = false;
    private boolean ossProcessingEnabled = false;
    private String processorVersion = "v1";
    private int maxRetries = 3;
    private int batchSize = 8;
    private int leaseTimeoutSeconds = 300;
    private boolean avifEnabled = false;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isWorkerEnabled() {
        return workerEnabled;
    }

    public void setWorkerEnabled(boolean workerEnabled) {
        this.workerEnabled = workerEnabled;
    }

    public boolean isOssProcessingEnabled() {
        return ossProcessingEnabled;
    }

    public void setOssProcessingEnabled(boolean ossProcessingEnabled) {
        this.ossProcessingEnabled = ossProcessingEnabled;
    }

    public String getProcessorVersion() {
        return processorVersion;
    }

    public void setProcessorVersion(String processorVersion) {
        this.processorVersion = processorVersion;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public int getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(int batchSize) {
        this.batchSize = batchSize;
    }

    public int getLeaseTimeoutSeconds() {
        return leaseTimeoutSeconds;
    }

    public void setLeaseTimeoutSeconds(int leaseTimeoutSeconds) {
        this.leaseTimeoutSeconds = leaseTimeoutSeconds;
    }

    public boolean isAvifEnabled() {
        return avifEnabled;
    }

    public void setAvifEnabled(boolean avifEnabled) {
        this.avifEnabled = avifEnabled;
    }

    public boolean canRunWorker() {
        return enabled && workerEnabled && ossProcessingEnabled;
    }

    public boolean canUseOssProcessing() {
        return enabled && ossProcessingEnabled;
    }

    @Override
    public void afterPropertiesSet() {
        if (!enabled && (workerEnabled || ossProcessingEnabled)) {
            throw new IllegalStateException(
                "shizuki.media.derivatives.enabled must be true before worker or OSS processing is enabled"
            );
        }
        if (workerEnabled && !ossProcessingEnabled) {
            throw new IllegalStateException("media derivative worker requires oss-processing-enabled=true");
        }
        if (processorVersion == null || processorVersion.isBlank() || processorVersion.length() > 40) {
            throw new IllegalStateException("media derivative processor-version must contain 1 to 40 characters");
        }
        processorVersion = processorVersion.trim();
        if (!processorVersion.matches("[A-Za-z0-9._-]+")) {
            throw new IllegalStateException("media derivative processor-version contains unsupported characters");
        }
        if (maxRetries < 0 || maxRetries > 10) {
            throw new IllegalStateException("media derivative max-retries must be between 0 and 10");
        }
        if (batchSize < 1 || batchSize > 100) {
            throw new IllegalStateException("media derivative batch-size must be between 1 and 100");
        }
        if (leaseTimeoutSeconds < 30 || leaseTimeoutSeconds > 3600) {
            throw new IllegalStateException(
                "media derivative lease-timeout-seconds must be between 30 and 3600"
            );
        }
    }
}
