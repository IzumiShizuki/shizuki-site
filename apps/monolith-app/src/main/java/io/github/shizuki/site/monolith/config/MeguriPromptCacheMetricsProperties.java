package io.github.shizuki.site.monolith.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@ConfigurationProperties(prefix = "shizuki.admin.meguri-metrics")
public class MeguriPromptCacheMetricsProperties {
    private String ingestToken = "";
    private long staleAfterSeconds = 300L;

    public String getIngestToken() {
        return ingestToken;
    }

    public void setIngestToken(String ingestToken) {
        this.ingestToken = StringUtils.hasText(ingestToken) ? ingestToken.trim() : "";
    }

    public long getStaleAfterSeconds() {
        return staleAfterSeconds;
    }

    public void setStaleAfterSeconds(long staleAfterSeconds) {
        this.staleAfterSeconds = Math.max(30L, staleAfterSeconds);
    }
}
