package io.github.shizuki.common.audit.task;

import io.github.shizuki.common.audit.config.AuditOutboxProperties;
import io.github.shizuki.common.audit.service.AuditOutboxService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AuditOutboxRetryTask {

    private final AuditOutboxProperties properties;
    private final AuditOutboxService auditOutboxService;

    public AuditOutboxRetryTask(AuditOutboxProperties properties,
                                AuditOutboxService auditOutboxService) {
        this.properties = properties;
        this.auditOutboxService = auditOutboxService;
    }

    @Scheduled(fixedDelayString = "${shizuki.audit.outbox.poll-interval:5000}")
    public void retryPendingEvents() {
        if (!properties.isEnabled()) {
            return;
        }
        auditOutboxService.dispatchPendingEvents();
    }
}
