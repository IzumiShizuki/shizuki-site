package io.github.shizuki.site.user.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@ConfigurationProperties(prefix = "shizuki.music.web-auth")
public class MusicWebAuthProperties {

    private String baseUrl = "http://music-web-auth-sidecar:39041";
    private String apiToken = "";
    private Integer connectTimeoutMs = 1500;
    private Integer readTimeoutMs = 5000;
    private Integer pollIntervalMs = 1800;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        String normalized = StringUtils.hasText(baseUrl) ? baseUrl.trim() : "http://music-web-auth-sidecar:39041";
        this.baseUrl = normalized.endsWith("/") ? normalized.substring(0, normalized.length() - 1) : normalized;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken == null ? "" : apiToken.trim();
    }

    public Integer getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public void setConnectTimeoutMs(Integer connectTimeoutMs) {
        this.connectTimeoutMs = safePositive(connectTimeoutMs, 1500);
    }

    public Integer getReadTimeoutMs() {
        return readTimeoutMs;
    }

    public void setReadTimeoutMs(Integer readTimeoutMs) {
        this.readTimeoutMs = safePositive(readTimeoutMs, 5000);
    }

    public Integer getPollIntervalMs() {
        return pollIntervalMs;
    }

    public void setPollIntervalMs(Integer pollIntervalMs) {
        this.pollIntervalMs = safePositive(pollIntervalMs, 1800);
    }

    private Integer safePositive(Integer value, Integer fallback) {
        if (value == null || value <= 0) {
            return fallback;
        }
        return value;
    }
}
