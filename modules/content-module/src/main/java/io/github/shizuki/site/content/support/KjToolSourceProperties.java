package io.github.shizuki.site.content.support;

import org.springframework.boot.context.properties.ConfigurationProperties;

/** Runtime limits for the read-only KJ application-community source. */
@ConfigurationProperties(prefix = "shizuki.tools.kj-source")
public class KjToolSourceProperties {

    private boolean enabled = true;
    private String endpoint = "https://oa.sgguo.com/";
    private String sourceHomeUrl = "https://kj.sgguo.com/";
    private int connectTimeoutMs = 2500;
    private int readTimeoutMs = 8000;
    private int cacheTtlSeconds = 300;
    private int maxCatalogItems = 300;
    private int maxResponseBytes = 2 * 1024 * 1024;
    private int maxDetailCacheEntries = 128;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint == null ? "" : endpoint.trim();
    }

    public String getSourceHomeUrl() {
        return sourceHomeUrl;
    }

    public void setSourceHomeUrl(String sourceHomeUrl) {
        this.sourceHomeUrl = sourceHomeUrl == null ? "" : sourceHomeUrl.trim();
    }

    public int getConnectTimeoutMs() {
        return connectTimeoutMs;
    }

    public void setConnectTimeoutMs(int connectTimeoutMs) {
        this.connectTimeoutMs = connectTimeoutMs;
    }

    public int getReadTimeoutMs() {
        return readTimeoutMs;
    }

    public void setReadTimeoutMs(int readTimeoutMs) {
        this.readTimeoutMs = readTimeoutMs;
    }

    public int getCacheTtlSeconds() {
        return cacheTtlSeconds;
    }

    public void setCacheTtlSeconds(int cacheTtlSeconds) {
        this.cacheTtlSeconds = cacheTtlSeconds;
    }

    public int getMaxCatalogItems() {
        return maxCatalogItems;
    }

    public void setMaxCatalogItems(int maxCatalogItems) {
        this.maxCatalogItems = maxCatalogItems;
    }

    public int getMaxResponseBytes() {
        return maxResponseBytes;
    }

    public void setMaxResponseBytes(int maxResponseBytes) {
        this.maxResponseBytes = maxResponseBytes;
    }

    public int getMaxDetailCacheEntries() {
        return maxDetailCacheEntries;
    }

    public void setMaxDetailCacheEntries(int maxDetailCacheEntries) {
        this.maxDetailCacheEntries = maxDetailCacheEntries;
    }
}
