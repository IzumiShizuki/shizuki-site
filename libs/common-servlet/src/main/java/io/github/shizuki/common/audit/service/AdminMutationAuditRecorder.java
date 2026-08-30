package io.github.shizuki.common.audit.service;

import io.github.shizuki.common.audit.model.AuditLogEntry;
import io.github.shizuki.common.audit.util.SensitiveMasker;
import io.github.shizuki.common.security.context.LoginUserContext;
import io.github.shizuki.common.web.filter.TraceIdFilter;
import java.time.Clock;
import java.time.Instant;
import java.util.Map;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 后台写操作审计记录器。
 *
 * <p>调用方只提供业务动作、稳定目标和补充信息；操作者、链路和时间由记录器统一采集。
 */
@Component
public class AdminMutationAuditRecorder {

    private static final String RESOURCE = "ADMIN_MUTATION";

    private final AuditLogService auditLogService;
    private final Clock clock;

    /**
     * 构造生产记录器。
     *
     * @param auditLogService 审计存储服务
     */
    @Autowired
    public AdminMutationAuditRecorder(AuditLogService auditLogService) {
        this(auditLogService, Clock.systemUTC());
    }

    AdminMutationAuditRecorder(AuditLogService auditLogService, Clock clock) {
        this.auditLogService = auditLogService;
        this.clock = clock;
    }

    /**
     * 记录成功的后台写操作。
     *
     * @param action 动作编码
     * @param target 稳定目标标识
     * @param details 补充信息
     */
    public void recordSuccess(String action, String target, Map<String, ?> details) {
        record(action, target, "SUCCESS", null, details);
    }

    /**
     * 记录失败的后台写操作。
     *
     * @param action 动作编码
     * @param target 稳定目标标识
     * @param errorCode 失败编码
     * @param details 补充信息
     */
    public void recordFailure(String action, String target, String errorCode, Map<String, ?> details) {
        record(action, target, "FAILED", errorCode, details);
    }

    private void record(String action, String target, String result, String errorCode, Map<String, ?> details) {
        AuditLogEntry entry = new AuditLogEntry();
        entry.setTraceId(MDC.get(TraceIdFilter.MDC_TRACE_ID));
        entry.setUserId(LoginUserContext.get().map(user -> user.getUserId()).orElse(null));
        entry.setAction(action);
        entry.setResource(RESOURCE);
        entry.setTarget(SensitiveMasker.maskText(target));
        entry.setDetails(SensitiveMasker.mask(details));
        entry.setResult(result);
        entry.setErrorCode(errorCode);
        entry.setCreatedAt(Instant.now(clock));
        auditLogService.save(entry);
    }
}
