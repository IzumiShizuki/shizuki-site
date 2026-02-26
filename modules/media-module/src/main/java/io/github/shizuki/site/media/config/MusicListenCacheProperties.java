package io.github.shizuki.site.media.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 音乐收听缓存配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.music.listen-cache")
public class MusicListenCacheProperties {

    private boolean enabled = true;
    private int retentionDays = 30;
    private long cleanupIntervalMs = 3_600_000L;
    private boolean loginOnly = true;

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
}
