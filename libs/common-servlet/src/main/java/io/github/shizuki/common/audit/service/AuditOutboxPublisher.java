package io.github.shizuki.common.audit.service;

import io.github.shizuki.common.audit.model.AuditOutboxEvent;

public interface AuditOutboxPublisher {

    String type();

    void publish(AuditOutboxEvent event);
}
