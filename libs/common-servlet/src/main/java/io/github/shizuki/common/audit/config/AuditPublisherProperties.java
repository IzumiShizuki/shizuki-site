package io.github.shizuki.common.audit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shizuki.audit.publisher")
public class AuditPublisherProperties {

    private String type = "noop";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
