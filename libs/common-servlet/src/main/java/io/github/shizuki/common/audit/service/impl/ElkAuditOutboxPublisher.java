package io.github.shizuki.common.audit.service.impl;

import io.github.shizuki.common.audit.model.AuditOutboxEvent;
import io.github.shizuki.common.audit.service.AuditOutboxPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ELK 审计发布器（占位实现）。
 *
 * <p>当前阶段仅用于提示未接入，不执行实际投递。
 */
@Component
public class ElkAuditOutboxPublisher implements AuditOutboxPublisher {

    /**
     * 日志组件。
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ElkAuditOutboxPublisher.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public String type() {
        return "elk";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void publish(AuditOutboxEvent event) {
        LOGGER.warn("ELK audit publisher is stub-only in current phase. eventId={}, type={}",
            event.id(), event.eventType());
        throw new UnsupportedOperationException("ELK publisher is not implemented in this phase");
    }
}
