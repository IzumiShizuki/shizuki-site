package io.github.shizuki.site.media.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * TuneHub 音乐接口配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.music.tunehub")
public class TuneHubMusicProperties {

    private String baseUrl = "https://tunehub.sayqz.com/api";
    private String defaultApiKey = "";
    private List<String> defaultPlatformOrder = new ArrayList<>(List.of("netease", "kuwo", "qq"));
    private String defaultQuality = "128k";
    private long cacheTtlSeconds = 900L;
    private long connectTimeoutMs = 1200L;
    private long readTimeoutMs = 5000L;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl == null ? "" : baseUrl.trim();
    }

    public String getDefaultApiKey() {
        return defaultApiKey;
    }

    public void setDefaultApiKey(String defaultApiKey) {
        this.defaultApiKey = defaultApiKey == null ? "" : defaultApiKey.trim();
    }

    public List<String> getDefaultPlatformOrder() {
        return defaultPlatformOrder;
    }

    public void setDefaultPlatformOrder(List<String> defaultPlatformOrder) {
        if (defaultPlatformOrder == null || defaultPlatformOrder.isEmpty()) {
            this.defaultPlatformOrder = new ArrayList<>(List.of("netease", "kuwo", "qq"));
            return;
        }
        this.defaultPlatformOrder = new ArrayList<>(defaultPlatformOrder);
    }

    public String getDefaultQuality() {
        return defaultQuality;
    }

    public void setDefaultQuality(String defaultQuality) {
        this.defaultQuality = defaultQuality == null ? "128k" : defaultQuality.trim();
    }

    public long getCacheTtlSeconds() {
        return cacheTtlSeconds;
    }

    public void setCacheTtlSeconds(long cacheTtlSeconds) {
        this.cacheTtlSeconds = Math.max(60L, cacheTtlSeconds);
    }

    public long getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public void setConnectTimeoutMs(long connectTimeoutMs) {
        this.connectTimeoutMs = Math.max(200L, connectTimeoutMs);
    }

    public long getReadTimeoutMs() {
        return readTimeoutMs;
    }

    public void setReadTimeoutMs(long readTimeoutMs) {
        this.readTimeoutMs = Math.max(500L, readTimeoutMs);
    }
}

