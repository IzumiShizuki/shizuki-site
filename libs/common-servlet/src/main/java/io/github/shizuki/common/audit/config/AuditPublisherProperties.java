package io.github.shizuki.common.audit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shizuki.audit.publisher")
public class AuditPublisherProperties {

    private String type = "noop";
    private String kafkaTopic = "shizuki.audit.log";
    private long kafkaSendTimeoutMs = 3000L;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKafkaTopic() {
        return kafkaTopic;
    }

    public void setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
    }

    public long getKafkaSendTimeoutMs() {
        return kafkaSendTimeoutMs;
    }

    public void setKafkaSendTimeoutMs(long kafkaSendTimeoutMs) {
        this.kafkaSendTimeoutMs = Math.max(500L, kafkaSendTimeoutMs);
    }
}
