package io.github.shizuki.common.audit.service;

import io.github.shizuki.common.audit.model.AuditOutboxEvent;

/**
 * 审计 outbox 发布器接口。
 */
public interface AuditOutboxPublisher {

    /**
     * 发布器类型标识。
     *
     * @return 发布器类型
     */
    String type();

    /**
     * 发布审计 outbox 事件。
     *
     * @param event outbox 事件
     */
    void publish(AuditOutboxEvent event);
}
