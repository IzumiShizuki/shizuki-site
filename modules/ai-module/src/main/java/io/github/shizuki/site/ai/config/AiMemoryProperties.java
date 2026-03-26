package io.github.shizuki.site.ai.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shizuki.ai.memory")
public class AiMemoryProperties {

    private boolean enabled = true;
    private String baseUrl = "http://127.0.0.1:8788";
    private long connectTimeoutMs = 1200L;
    private long readTimeoutMs = 4000L;
    private int retrievalMaxResults = 4;
    private int journalLimit = 5;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl == null ? "" : baseUrl.trim();
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

    public int getRetrievalMaxResults() {
        return retrievalMaxResults;
    }

    public void setRetrievalMaxResults(int retrievalMaxResults) {
        this.retrievalMaxResults = Math.max(1, Math.min(retrievalMaxResults, 10));
    }

    public int getJournalLimit() {
        return journalLimit;
    }

    public void setJournalLimit(int journalLimit) {
        this.journalLimit = Math.max(0, Math.min(journalLimit, 20));
    }
}
