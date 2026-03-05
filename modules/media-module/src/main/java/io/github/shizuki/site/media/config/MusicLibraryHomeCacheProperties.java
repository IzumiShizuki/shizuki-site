package io.github.shizuki.site.media.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 音乐库首页缓存配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.music.library-home-cache")
public class MusicLibraryHomeCacheProperties {

    private boolean enabled = true;
    private String redisKey = "music:library:home:v1";
    private long ttlSeconds = 172_800L;
    private String refreshCron = "0 0 0 * * *";
    private String refreshZone = "Asia/Shanghai";

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getRedisKey() {
        return redisKey;
    }

    public void setRedisKey(String redisKey) {
        this.redisKey = redisKey == null ? "music:library:home:v1" : redisKey.trim();
    }

    public long getTtlSeconds() {
        return ttlSeconds;
    }

    public void setTtlSeconds(long ttlSeconds) {
        this.ttlSeconds = Math.max(0L, ttlSeconds);
    }

    public String getRefreshCron() {
        return refreshCron;
    }

    public void setRefreshCron(String refreshCron) {
        this.refreshCron = refreshCron == null ? "0 0 0 * * *" : refreshCron.trim();
    }

    public String getRefreshZone() {
        return refreshZone;
    }

    public void setRefreshZone(String refreshZone) {
        this.refreshZone = refreshZone == null ? "Asia/Shanghai" : refreshZone.trim();
    }
}
