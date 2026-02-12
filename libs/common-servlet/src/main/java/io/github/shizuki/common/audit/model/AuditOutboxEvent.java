package io.github.shizuki.common.audit.model;

import java.time.Instant;

/**
 * 审计 outbox 事件模型。
 *
 * @param id 事件主键
 * @param eventType 事件类型
 * @param payloadJson 事件负载 JSON
 * @param status 事件状态
 * @param retryCount 重试次数
 * @param createdAt 创建时间
 */
public record AuditOutboxEvent(
    Long id,
    String eventType,
    String payloadJson,
    String status,
    int retryCount,
    Instant createdAt
) {
}
