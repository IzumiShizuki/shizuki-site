package io.github.shizuki.common.audit.service.impl;

import io.github.shizuki.common.audit.model.AuditOutboxEvent;
import io.github.shizuki.common.audit.service.AuditOutboxPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class NoopAuditOutboxPublisher implements AuditOutboxPublisher {

    private static final Logger LOGGER = LoggerFactory.getLogger(NoopAuditOutboxPublisher.class);

    @Override
    public String type() {
        return "noop";
    }

    @Override
    public void publish(AuditOutboxEvent event) {
        LOGGER.debug("Audit outbox noop publisher consumed event id={}, type={}", event.id(), event.eventType());
    }
}
