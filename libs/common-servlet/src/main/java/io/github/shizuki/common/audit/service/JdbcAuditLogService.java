package io.github.shizuki.common.audit.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.audit.model.AuditLogEntry;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * 基于 JDBC 的审计日志服务实现。
 *
 * <p>优先写入 AUD_LOG 和 AUD_EVENT_OUTBOX，失败时回退到日志输出实现。
 */
@Component
@Primary
public class JdbcAuditLogService implements AuditLogService {

    /**
     * JdbcTemplate 延迟提供者。
     */
    private final ObjectProvider<JdbcTemplate> jdbcTemplateProvider;
    /**
     * DB 不可用时的回退实现。
     */
    private final LoggingAuditLogService fallback;
    /**
     * JSON 序列化器。
     */
    private final ObjectMapper objectMapper;

    /**
     * 构造 JDBC 审计日志服务。
     *
     * @param jdbcTemplateProvider JdbcTemplate 延迟提供者
     * @param fallback 日志回退实现
     * @param objectMapper JSON 序列化器
     */
    public JdbcAuditLogService(ObjectProvider<JdbcTemplate> jdbcTemplateProvider,
                               LoggingAuditLogService fallback,
                               ObjectMapper objectMapper) {
        this.jdbcTemplateProvider = jdbcTemplateProvider;
        this.fallback = fallback;
        this.objectMapper = objectMapper;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void save(AuditLogEntry entry) {
        JdbcTemplate jdbcTemplate = jdbcTemplateProvider.getIfAvailable();
        if (jdbcTemplate == null) {
            fallback.save(entry);
            return;
        }

        try {
            // 主表落审计记录。
            jdbcTemplate.update(
                "INSERT INTO AUD_LOG(trace_code, user_id, action_code, resource_code, target_code, detail_json, "
                    + "result_status, error_code, cost_value, create_time) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                entry.getTraceId(),
                entry.getUserId(),
                entry.getAction(),
                entry.getResource(),
                entry.getTarget(),
                toDetailsJson(entry),
                entry.getResult(),
                entry.getErrorCode(),
                entry.getCostMs(),
                Timestamp.from(entry.getCreatedAt() == null ? Instant.now() : entry.getCreatedAt())
            );

            // outbox 落盘，交由异步任务可靠发布。
            jdbcTemplate.update(
                "INSERT INTO AUD_EVENT_OUTBOX(event_type, payload_json, event_status, create_time) VALUES(?, CAST(? AS JSON), ?, ?)",
                "AUDIT_LOG",
                toPayloadJson(entry),
                "NEW",
                Timestamp.from(Instant.now())
            );
        } catch (Exception ex) {
            // 任意 DB 异常都降级到日志输出，避免影响业务主流程。
            fallback.save(entry);
        }
    }

    /**
     * 构造 outbox payload JSON。
     *
     * @param entry 审计日志实体
     * @return payload JSON
     */
    private String toPayloadJson(AuditLogEntry entry) {
        try {
            Map<String, Object> payload = new LinkedHashMap<>();
            payload.put("trace_id", entry.getTraceId());
            payload.put("user_id", entry.getUserId());
            payload.put("action", entry.getAction());
            payload.put("resource", entry.getResource());
            payload.put("target", entry.getTarget());
            payload.put("details", entry.getDetails());
            payload.put("result", entry.getResult());
            payload.put("error_code", entry.getErrorCode());
            payload.put("cost_ms", entry.getCostMs());
            payload.put("created_at", entry.getCreatedAt());
            return objectMapper.writeValueAsString(payload);
        } catch (JsonProcessingException e) {
            // 序列化失败时返回空 JSON，避免因脏字段导致整条审计写入失败。
            return "{}";
        }
    }

    private String toDetailsJson(AuditLogEntry entry) {
        try {
            return objectMapper.writeValueAsString(entry.getDetails());
        } catch (JsonProcessingException e) {
            return "{}";
        }
    }
}
