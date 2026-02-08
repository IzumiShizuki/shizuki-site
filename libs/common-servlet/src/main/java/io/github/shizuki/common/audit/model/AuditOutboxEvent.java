package io.github.shizuki.common.audit.model;

import java.time.Instant;

public record AuditOutboxEvent(
    Long id,
    String eventType,
    String payloadJson,
    String status,
    int retryCount,
    Instant createdAt
) {
}
