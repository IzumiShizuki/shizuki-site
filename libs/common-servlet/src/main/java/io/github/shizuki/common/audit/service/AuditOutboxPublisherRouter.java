package io.github.shizuki.common.audit.service;

import io.github.shizuki.common.audit.config.AuditPublisherProperties;
import io.github.shizuki.common.audit.model.AuditOutboxEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class AuditOutboxPublisherRouter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuditOutboxPublisherRouter.class);

    private final AuditPublisherProperties properties;
    private final Map<String, AuditOutboxPublisher> publisherByType;
    private final AuditOutboxPublisher defaultPublisher;

    public AuditOutboxPublisherRouter(AuditPublisherProperties properties,
                                      List<AuditOutboxPublisher> publishers) {
        this.properties = properties;
        this.publisherByType = new HashMap<>();
        for (AuditOutboxPublisher publisher : publishers) {
            publisherByType.put(normalizeType(publisher.type()), publisher);
        }
        this.defaultPublisher = publisherByType.getOrDefault("noop", publishers.get(0));
    }

    public void publish(AuditOutboxEvent event) {
        String configuredType = normalizeType(properties.getType());
        AuditOutboxPublisher publisher = publisherByType.get(configuredType);
        if (publisher == null) {
            LOGGER.warn("Unknown audit publisher type={}, fallback to noop", configuredType);
            publisher = defaultPublisher;
        }
        publisher.publish(event);
    }

    private String normalizeType(String value) {
        return StringUtils.hasText(value) ? value.trim().toLowerCase(Locale.ROOT) : "noop";
    }
}
