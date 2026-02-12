package io.github.shizuki.common.audit.service;

/**
 * 审计 outbox 调度服务接口。
 */
public interface AuditOutboxService {

    /**
     * 扫描并分发待处理 outbox 事件。
     */
    void dispatchPendingEvents();
}
