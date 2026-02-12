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

/**
 * 审计日志切面。
 *
 * <p>拦截 {@link AuditLog} 注解的方法，统一记录动作、资源、用户、耗时和执行结果。
 */
@Aspect
@Component
public class AuditLogAspect {

    /**
     * 审计日志持久化服务。
     */
    private final AuditLogService auditLogService;

    /**
     * 构造审计切面。
     *
     * @param auditLogService 审计日志持久化服务
     */
    public AuditLogAspect(AuditLogService auditLogService) {
        this.auditLogService = auditLogService;
    }

    /**
     * 审计环绕通知。
     *
     * @param joinPoint 切点信息
     * @param auditLog 注解配置
     * @return 原方法返回值
     * @throws Throwable 原方法异常
     */
    @Around("@annotation(auditLog)")
    public Object around(ProceedingJoinPoint joinPoint, AuditLog auditLog) throws Throwable {
        long start = System.currentTimeMillis();
        AuditLogEntry entry = new AuditLogEntry();
        entry.setAction(auditLog.action());
        entry.setResource(auditLog.resource());
        // trace_id 由 TraceIdFilter 写入 MDC，这里直接读取用于链路关联。
        entry.setTraceId(MDC.get(TraceIdFilter.MDC_TRACE_ID));
        entry.setUserId(LoginUserContext.get().map(user -> user.getUserId()).orElse(null));
        entry.setCreatedAt(Instant.now());

        try {
            Object result = joinPoint.proceed();
            entry.setResult("SUCCESS");
            return result;
        } catch (Throwable throwable) {
            entry.setResult("FAILED");
            // 记录异常类型用于审计聚合统计，原始异常继续抛出给上层处理。
            entry.setErrorCode(throwable.getClass().getSimpleName());
            throw throwable;
        } finally {
            // finally 中保证无论成功失败都落审计。
            entry.setCostMs(System.currentTimeMillis() - start);
            auditLogService.save(entry);
        }
    }
}
