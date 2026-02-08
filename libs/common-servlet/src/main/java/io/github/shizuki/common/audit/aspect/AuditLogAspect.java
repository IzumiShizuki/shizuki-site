package io.github.shizuki.common.audit.aspect;

import io.github.shizuki.common.audit.annotation.AuditLog;
import io.github.shizuki.common.audit.model.AuditLogEntry;
import io.github.shizuki.common.audit.service.AuditLogService;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.web.filter.TraceIdFilter;
import java.time.Instant;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditLogAspect {

    private final AuditLogService auditLogService;

    public AuditLogAspect(AuditLogService auditLogService) {
        this.auditLogService = auditLogService;
    }

    @Around("@annotation(auditLog)")
    public Object around(ProceedingJoinPoint joinPoint, AuditLog auditLog) throws Throwable {
        long start = System.currentTimeMillis();
        AuditLogEntry entry = new AuditLogEntry();
        entry.setAction(auditLog.action());
        entry.setResource(auditLog.resource());
        entry.setTraceId(MDC.get(TraceIdFilter.MDC_TRACE_ID));
        entry.setUserId(LoginUserContext.get().map(user -> user.getUserId()).orElse(null));
        entry.setCreatedAt(Instant.now());

        try {
            Object result = joinPoint.proceed();
            entry.setResult("SUCCESS");
            return result;
        } catch (Throwable throwable) {
            entry.setResult("FAILED");
            entry.setErrorCode(throwable.getClass().getSimpleName());
            throw throwable;
        } finally {
            entry.setCostMs(System.currentTimeMillis() - start);
            auditLogService.save(entry);
        }
    }
}
