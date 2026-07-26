package io.github.shizuki.site.media.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Freesound 环境音库配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.music.freesound")
public class FreesoundProperties {

    /**
     * Freesound API Token，留空表示未启用在线音源库。
     */
    private String apiKey = "";

    private String searchUrl = "https://freesound.org/apiv2/search/";

    private long connectTimeoutMs = 1200L;

    private long readTimeoutMs = 4000L;

    private int retryCount = 1;

    private long retryBackoffMs = 120L;

    private long retryMaxBackoffMs = 800L;

    /**
     * 单页返回条数上限。
     */
    private int maxPageSize = 48;

    /**
     * 只返回时长在该区间内的音频，避免搜到一秒钟的碎音效。
     */
    private int minDurationSeconds = 15;

    private int maxDurationSeconds = 600;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey == null ? "" : apiKey.trim();
    }

    public String getSearchUrl() {
        return searchUrl;
    }

    public void setSearchUrl(String searchUrl) {
        this.searchUrl = searchUrl;
    }

    public long getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public void setConnectTimeoutMs(long connectTimeoutMs) {
        this.connectTimeoutMs = Math.max(100L, connectTimeoutMs);
    }

    public long getReadTimeoutMs() {
        return readTimeoutMs;
    }

    public void setReadTimeoutMs(long readTimeoutMs) {
        this.readTimeoutMs = Math.max(200L, readTimeoutMs);
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = Math.max(0, Math.min(5, retryCount));
    }

    public long getRetryBackoffMs() {
        return retryBackoffMs;
    }

    public void setRetryBackoffMs(long retryBackoffMs) {
        this.retryBackoffMs = Math.max(1L, retryBackoffMs);
    }

    public long getRetryMaxBackoffMs() {
        return retryMaxBackoffMs;
    }

    public void setRetryMaxBackoffMs(long retryMaxBackoffMs) {
        this.retryMaxBackoffMs = Math.max(1L, retryMaxBackoffMs);
    }

    public int getMaxPageSize() {
        return maxPageSize;
    }

    public void setMaxPageSize(int maxPageSize) {
        this.maxPageSize = Math.max(1, Math.min(150, maxPageSize));
    }

    public int getMinDurationSeconds() {
        return minDurationSeconds;
    }

    public void setMinDurationSeconds(int minDurationSeconds) {
        this.minDurationSeconds = Math.max(0, minDurationSeconds);
    }

    public int getMaxDurationSeconds() {
        return maxDurationSeconds;
    }

    public void setMaxDurationSeconds(int maxDurationSeconds) {
        this.maxDurationSeconds = Math.max(1, maxDurationSeconds);
    }

    /**
     * 是否已配置可用的 API Token。
     */
    public boolean isEnabled() {
        return !apiKey.isBlank();
    }
}
