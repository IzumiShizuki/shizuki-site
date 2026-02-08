package io.github.shizuki.common.audit.service;

import io.github.shizuki.common.audit.model.AuditLogEntry;

public interface AuditLogService {
    void save(AuditLogEntry entry);
}
