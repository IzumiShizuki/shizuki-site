package io.github.shizuki.common.audit.service;

import io.github.shizuki.common.audit.model.AuditLogEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 基于日志输出的审计服务实现。
 */
@Component
public class LoggingAuditLogService implements AuditLogService {

    /**
     * 日志组件。
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAuditLogService.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(AuditLogEntry entry) {
        LOGGER.info("audit action={} resource={} target={} result={} userId={} traceId={} costMs={} errorCode={} details={}",
            entry.getAction(), entry.getResource(), entry.getTarget(), entry.getResult(), entry.getUserId(),
            entry.getTraceId(), entry.getCostMs(), entry.getErrorCode(), entry.getDetails());
    }
}
