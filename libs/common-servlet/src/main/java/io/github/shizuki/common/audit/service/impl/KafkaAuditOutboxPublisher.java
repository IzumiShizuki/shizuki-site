package io.github.shizuki.common.audit.service.impl;

import io.github.shizuki.common.audit.model.AuditOutboxEvent;
import io.github.shizuki.common.audit.service.AuditOutboxPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class KafkaAuditOutboxPublisher implements AuditOutboxPublisher {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaAuditOutboxPublisher.class);

    @Override
    public String type() {
        return "kafka";
    }

    @Override
    public void publish(AuditOutboxEvent event) {
        LOGGER.warn("Kafka audit publisher is stub-only in current phase. eventId={}, type={}",
            event.id(), event.eventType());
        throw new UnsupportedOperationException("Kafka publisher is not implemented in this phase");
    }
}
