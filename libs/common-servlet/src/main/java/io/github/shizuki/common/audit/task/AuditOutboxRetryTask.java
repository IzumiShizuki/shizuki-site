package io.github.shizuki.common.audit.task;

import io.github.shizuki.common.audit.config.AuditOutboxProperties;
import io.github.shizuki.common.audit.service.AuditOutboxService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 审计 outbox 重试任务。
 */
@Component
public class AuditOutboxRetryTask {

    /**
     * outbox 配置。
     */
    private final AuditOutboxProperties properties;
    /**
     * outbox 调度服务。
     */
    private final AuditOutboxService auditOutboxService;

    /**
     * 构造 outbox 重试任务。
     *
     * @param properties outbox 配置
     * @param auditOutboxService outbox 调度服务
     */
    public AuditOutboxRetryTask(AuditOutboxProperties properties,
                                AuditOutboxService auditOutboxService) {
        this.properties = properties;
        this.auditOutboxService = auditOutboxService;
    }

    /**
     * 定时扫描并分发待处理事件。
     */
    @Scheduled(fixedDelayString = "${shizuki.audit.outbox.poll-interval:5000}")
    public void retryPendingEvents() {
        if (!properties.isEnabled()) {
            return;
        }
        auditOutboxService.dispatchPendingEvents();
    }
}
