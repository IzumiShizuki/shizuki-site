package io.github.shizuki.common.audit.service.impl;

import io.github.shizuki.common.audit.model.AuditOutboxEvent;
import io.github.shizuki.common.audit.service.AuditOutboxPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ElkAuditOutboxPublisher implements AuditOutboxPublisher {

    private static final Logger LOGGER = LoggerFactory.getLogger(ElkAuditOutboxPublisher.class);

    @Override
    public String type() {
        return "elk";
    }

    @Override
    public void publish(AuditOutboxEvent event) {
        LOGGER.warn("ELK audit publisher is stub-only in current phase. eventId={}, type={}",
            event.id(), event.eventType());
        throw new UnsupportedOperationException("ELK publisher is not implemented in this phase");
    }
}
