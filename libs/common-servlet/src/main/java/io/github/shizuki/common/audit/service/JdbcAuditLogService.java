package io.github.shizuki.common.audit.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.audit.model.AuditLogEntry;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Map;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JdbcAuditLogService implements AuditLogService {

    private final ObjectProvider<JdbcTemplate> jdbcTemplateProvider;
    private final LoggingAuditLogService fallback;
    private final ObjectMapper objectMapper;

    public JdbcAuditLogService(ObjectProvider<JdbcTemplate> jdbcTemplateProvider,
                               LoggingAuditLogService fallback,
                               ObjectMapper objectMapper) {
        this.jdbcTemplateProvider = jdbcTemplateProvider;
        this.fallback = fallback;
        this.objectMapper = objectMapper;
    }

    @Override
    public void save(AuditLogEntry entry) {
        JdbcTemplate jdbcTemplate = jdbcTemplateProvider.getIfAvailable();
        if (jdbcTemplate == null) {
            fallback.save(entry);
            return;
        }

        try {
            jdbcTemplate.update(
                "INSERT INTO AUD_LOG(trace_code, user_id, action_code, resource_code, result_status, error_code, cost_value, create_time) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)",
                entry.getTraceId(),
                entry.getUserId(),
                entry.getAction(),
                entry.getResource(),
                entry.getResult(),
                entry.getErrorCode(),
                entry.getCostMs(),
                Timestamp.from(entry.getCreatedAt() == null ? Instant.now() : entry.getCreatedAt())
            );

            jdbcTemplate.update(
                "INSERT INTO AUD_EVENT_OUTBOX(event_type, payload_json, event_status, create_time) VALUES(?, CAST(? AS JSON), ?, ?)",
                "AUDIT_LOG",
                toPayloadJson(entry),
                "NEW",
                Timestamp.from(Instant.now())
            );
        } catch (Exception ex) {
            fallback.save(entry);
        }
    }

    private String toPayloadJson(AuditLogEntry entry) {
        try {
            return objectMapper.writeValueAsString(Map.of(
                "trace_id", entry.getTraceId(),
                "user_id", entry.getUserId(),
                "action", entry.getAction(),
                "resource", entry.getResource(),
                "result", entry.getResult(),
                "error_code", entry.getErrorCode(),
                "cost_ms", entry.getCostMs(),
                "created_at", entry.getCreatedAt()
            ));
        } catch (JsonProcessingException e) {
            return "{}";
        }
    }
}
