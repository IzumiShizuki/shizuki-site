package io.github.shizuki.site.media.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 站内音乐流代理配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.music.playback-gateway")
public class MusicPlaybackGatewayProperties implements InitializingBean {

    private boolean enabled = true;
    private long tokenTtlSeconds = 1_800L;
    private int connectTimeoutMs = 5_000;
    private int maxRedirects = 3;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public long getTokenTtlSeconds() {
        return tokenTtlSeconds;
    }

    public void setTokenTtlSeconds(long tokenTtlSeconds) {
        this.tokenTtlSeconds = tokenTtlSeconds;
    }

    public int getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public void setConnectTimeoutMs(int connectTimeoutMs) {
        this.connectTimeoutMs = connectTimeoutMs;
    }

    public int getMaxRedirects() {
        return maxRedirects;
    }

    public void setMaxRedirects(int maxRedirects) {
        this.maxRedirects = maxRedirects;
    }

    @Override
    public void afterPropertiesSet() {
        if (tokenTtlSeconds < 60L || tokenTtlSeconds > 7_200L) {
            throw new IllegalStateException("music playback gateway token TTL must be between 60 and 7200 seconds");
        }
        if (connectTimeoutMs < 500 || connectTimeoutMs > 15_000) {
            throw new IllegalStateException("music playback gateway connect timeout must be between 500 and 15000 ms");
        }
        if (maxRedirects < 0 || maxRedirects > 5) {
            throw new IllegalStateException("music playback gateway redirects must be between 0 and 5");
        }
    }
}
