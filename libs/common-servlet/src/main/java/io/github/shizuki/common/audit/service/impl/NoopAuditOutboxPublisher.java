package io.github.shizuki.common.audit.service.impl;

import io.github.shizuki.common.audit.model.AuditOutboxEvent;
import io.github.shizuki.common.audit.service.AuditOutboxPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Noop 审计发布器实现。
 *
 * <p>用于开发环境或关闭真实发布时吞掉 outbox 事件。
 */
@Component
public class NoopAuditOutboxPublisher implements AuditOutboxPublisher {

    /**
     * 日志组件。
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(NoopAuditOutboxPublisher.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public String type() {
        return "noop";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void publish(AuditOutboxEvent event) {
        LOGGER.debug("Audit outbox noop publisher consumed event id={}, type={}", event.id(), event.eventType());
    }
}
