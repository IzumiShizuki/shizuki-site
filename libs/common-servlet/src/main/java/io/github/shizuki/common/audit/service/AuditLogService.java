package io.github.shizuki.common.audit.service;

import io.github.shizuki.common.audit.model.AuditLogEntry;

/**
 * 审计日志保存服务接口。
 */
public interface AuditLogService {

    /**
     * 保存审计日志。
     *
     * @param entry 审计日志实体
     */
    void save(AuditLogEntry entry);
}
