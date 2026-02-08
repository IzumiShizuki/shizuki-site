package io.github.shizuki.common.audit.service;

import io.github.shizuki.common.audit.model.AuditLogEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggingAuditLogService implements AuditLogService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAuditLogService.class);

    @Override
    public void save(AuditLogEntry entry) {
        LOGGER.info("audit action={} resource={} result={} userId={} traceId={} costMs={} errorCode={}",
            entry.getAction(), entry.getResource(), entry.getResult(), entry.getUserId(), entry.getTraceId(),
            entry.getCostMs(), entry.getErrorCode());
    }
}
