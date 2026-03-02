package io.github.shizuki.site.media.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 音乐收听缓存配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.music.listen-cache")
public class MusicListenCacheProperties {

    public enum StorageMode {
        SMART("smart"),
        URL_ONLY("url_only"),
        HYBRID("hybrid");

        private final String code;

        StorageMode(String code) {
            this.code = code;
        }

        public String code() {
            return code;
        }

        public static StorageMode from(String rawMode) {
            String normalized = rawMode == null ? "" : rawMode.trim().toLowerCase();
            return switch (normalized) {
                case "url_only" -> URL_ONLY;
                case "hybrid" -> HYBRID;
                default -> SMART;
            };
        }
    }

    private boolean enabled = true;
    private int retentionDays = 30;
    private long cleanupIntervalMs = 3_600_000L;
    private boolean loginOnly = true;
    private String storageMode = StorageMode.SMART.code();
    private long urlTtlThresholdSeconds = 86_400L;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(int retentionDays) {
        this.retentionDays = Math.max(1, retentionDays);
    }

    public long getCleanupIntervalMs() {
        return cleanupIntervalMs;
    }

    public void setCleanupIntervalMs(long cleanupIntervalMs) {
        this.cleanupIntervalMs = Math.max(60_000L, cleanupIntervalMs);
    }

    public boolean isLoginOnly() {
        return loginOnly;
    }

    public void setLoginOnly(boolean loginOnly) {
        this.loginOnly = loginOnly;
    }

    public String getStorageMode() {
        return storageMode;
    }

    public void setStorageMode(String storageMode) {
        this.storageMode = StorageMode.from(storageMode).code();
    }

    public StorageMode resolveStorageMode() {
        return StorageMode.from(storageMode);
    }

    public long getUrlTtlThresholdSeconds() {
        return urlTtlThresholdSeconds;
    }

    public void setUrlTtlThresholdSeconds(long urlTtlThresholdSeconds) {
        this.urlTtlThresholdSeconds = Math.max(60L, urlTtlThresholdSeconds);
    }
}
