package io.github.shizuki.common.audit.service;

public interface AuditOutboxService {

    void dispatchPendingEvents();
}
