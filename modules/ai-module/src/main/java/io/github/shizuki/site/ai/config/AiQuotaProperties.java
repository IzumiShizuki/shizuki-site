package io.github.shizuki.site.ai.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shizuki.ai.quota")
public class AiQuotaProperties {

    private String code = "ai_round_total";
    private long defaultTotalRounds = 5L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getDefaultTotalRounds() {
        return defaultTotalRounds;
    }

    public void setDefaultTotalRounds(long defaultTotalRounds) {
        this.defaultTotalRounds = defaultTotalRounds;
    }
}
