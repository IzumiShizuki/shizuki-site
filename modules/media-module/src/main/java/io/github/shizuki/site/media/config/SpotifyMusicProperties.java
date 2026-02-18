package io.github.shizuki.site.media.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Spotify 音乐接口配置。
 */
@Component
@ConfigurationProperties(prefix = "shizuki.music.spotify")
public class SpotifyMusicProperties {

    /**
     * Spotify 应用凭证：client id。
     */
    private String clientId = "";

    /**
     * Spotify 应用凭证：client secret。
     */
    private String clientSecret = "";

    /**
     * Spotify token 接口地址。
     */
    private String tokenUrl = "https://accounts.spotify.com/api/token";

    /**
     * Spotify 搜索接口地址。
     */
    private String searchUrl = "https://api.spotify.com/v1/search";

    /**
     * Spotify 曲目详情接口地址。
     */
    private String trackUrl = "https://api.spotify.com/v1/tracks";

    /**
     * HTTP 连接超时（毫秒）。
     */
    private long connectTimeoutMs = 800L;

    /**
     * HTTP 读取超时（毫秒）。
     */
    private long readTimeoutMs = 1500L;

    /**
     * 重试次数（不含首次请求）。
     */
    private int retryCount = 2;

    /**
     * 重试初始退避（毫秒）。
     */
    private long retryBackoffMs = 80L;

    /**
     * 重试最大退避（毫秒）。
     */
    private long retryMaxBackoffMs = 600L;

    /**
     * 连续瞬态失败达到阈值后打开熔断。
     */
    private int circuitBreakerFailureThreshold = 3;

    /**
     * 熔断打开时长（秒）。
     */
    private long circuitBreakerOpenSeconds = 30L;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getTokenUrl() {
        return tokenUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public String getSearchUrl() {
        return searchUrl;
    }

    public void setSearchUrl(String searchUrl) {
        this.searchUrl = searchUrl;
    }

    public String getTrackUrl() {
        return trackUrl;
    }

    public void setTrackUrl(String trackUrl) {
        this.trackUrl = trackUrl;
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
        this.retryCount = Math.max(0, retryCount);
    }

    public long getRetryBackoffMs() {
        return retryBackoffMs;
    }

    public void setRetryBackoffMs(long retryBackoffMs) {
        this.retryBackoffMs = Math.max(10L, retryBackoffMs);
    }

    public long getRetryMaxBackoffMs() {
        return retryMaxBackoffMs;
    }

    public void setRetryMaxBackoffMs(long retryMaxBackoffMs) {
        this.retryMaxBackoffMs = Math.max(retryBackoffMs, retryMaxBackoffMs);
    }

    public int getCircuitBreakerFailureThreshold() {
        return circuitBreakerFailureThreshold;
    }

    public void setCircuitBreakerFailureThreshold(int circuitBreakerFailureThreshold) {
        this.circuitBreakerFailureThreshold = Math.max(1, circuitBreakerFailureThreshold);
    }

    public long getCircuitBreakerOpenSeconds() {
        return circuitBreakerOpenSeconds;
    }

    public void setCircuitBreakerOpenSeconds(long circuitBreakerOpenSeconds) {
        this.circuitBreakerOpenSeconds = Math.max(5L, circuitBreakerOpenSeconds);
    }
}
