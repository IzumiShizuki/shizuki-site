package io.github.shizuki.common.audit.service.impl;

import io.github.shizuki.common.audit.config.AuditOutboxProperties;
import io.github.shizuki.common.audit.model.AuditOutboxEvent;
import io.github.shizuki.common.audit.service.AuditOutboxPublisherRouter;
import io.github.shizuki.common.audit.service.AuditOutboxService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class JdbcAuditOutboxServiceImpl implements AuditOutboxService {

    private static final Logger LOGGER = LoggerFactory.getLogger(JdbcAuditOutboxServiceImpl.class);

    private static final String SELECT_PENDING_SQL = """
        SELECT id, event_type, CAST(payload_json AS CHAR) AS payload_json, status,
               COALESCE(retry_count, 0) AS retry_count, created_at
        FROM audit_event_outbox
        WHERE status IN ('NEW', 'FAILED')
          AND (next_retry_at IS NULL OR next_retry_at <= NOW(3))
          AND COALESCE(retry_count, 0) < ?
        ORDER BY id ASC
        LIMIT ?
        """;

    private static final String CLAIM_SQL = """
        UPDATE audit_event_outbox
        SET status = 'PROCESSING', last_error = NULL
        WHERE id = ? AND status IN ('NEW', 'FAILED')
        """;

    private static final String SUCCESS_SQL = """
        UPDATE audit_event_outbox
        SET status = 'SUCCESS', processed_at = NOW(3), last_error = NULL
        WHERE id = ?
        """;

    private static final String FAIL_RETRY_SQL = """
        UPDATE audit_event_outbox
        SET status = 'FAILED',
            retry_count = ?,
            next_retry_at = DATE_ADD(NOW(3), INTERVAL ? SECOND),
            last_error = ?,
            processed_at = NOW(3)
        WHERE id = ?
        """;

    private static final String FAIL_FINAL_SQL = """
        UPDATE audit_event_outbox
        SET status = 'FAILED',
            retry_count = ?,
            next_retry_at = NULL,
            last_error = ?,
            processed_at = NOW(3)
        WHERE id = ?
        """;

    private static final RowMapper<AuditOutboxEvent> EVENT_ROW_MAPPER = JdbcAuditOutboxServiceImpl::mapEvent;

    private final ObjectProvider<JdbcTemplate> jdbcTemplateProvider;
    private final AuditOutboxPublisherRouter publisherRouter;
    private final AuditOutboxProperties properties;

    public JdbcAuditOutboxServiceImpl(ObjectProvider<JdbcTemplate> jdbcTemplateProvider,
                                      AuditOutboxPublisherRouter publisherRouter,
                                      AuditOutboxProperties properties) {
        this.jdbcTemplateProvider = jdbcTemplateProvider;
        this.publisherRouter = publisherRouter;
        this.properties = properties;
    }

    /**
     * 调度入口：扫描待处理事件并逐条分发。
     */
    @Override
    public void dispatchPendingEvents() {
        JdbcTemplate jdbcTemplate = jdbcTemplateProvider.getIfAvailable();
        if (jdbcTemplate == null || !properties.isEnabled()) {
            return;
        }

        try {
            var events = jdbcTemplate.query(
                SELECT_PENDING_SQL,
                EVENT_ROW_MAPPER,
                properties.getMaxRetries(),
                properties.getBatchSize()
            );
            for (AuditOutboxEvent event : events) {
                processSingleEvent(jdbcTemplate, event);
            }
        } catch (Exception ex) {
            LOGGER.warn("Dispatch audit outbox events failed: {}", ex.getMessage());
        }
    }

    private void processSingleEvent(JdbcTemplate jdbcTemplate, AuditOutboxEvent event) {
        // 先抢占事件状态，避免多实例并发重复消费同一条 outbox 数据。
        int claimed = jdbcTemplate.update(CLAIM_SQL, event.id());
        if (claimed == 0) {
            return;
        }

        try {
            publisherRouter.publish(event);
            jdbcTemplate.update(SUCCESS_SQL, event.id());
        } catch (Exception ex) {
            handleFailure(jdbcTemplate, event, ex);
        }
    }

    private void handleFailure(JdbcTemplate jdbcTemplate, AuditOutboxEvent event, Exception ex) {
        int nextRetryCount = event.retryCount() + 1;
        String message = abbreviate(ex.getMessage());

        if (nextRetryCount >= properties.getMaxRetries()) {
            // 到达最大重试次数后保留 FAILED，等待人工排查。
            jdbcTemplate.update(FAIL_FINAL_SQL, nextRetryCount, message, event.id());
            return;
        }

        // 指数退避，避免下游故障时高频重试放大压力。
        int delaySeconds = backoffSeconds(nextRetryCount);
        jdbcTemplate.update(FAIL_RETRY_SQL, nextRetryCount, delaySeconds, message, event.id());
    }

    private int backoffSeconds(int retryCount) {
        long candidate = (long) properties.getRetryBaseSeconds() << Math.max(retryCount - 1, 0);
        long max = properties.getRetryMaxSeconds();
        return (int) Math.max(1L, Math.min(candidate, max));
    }

    private String abbreviate(String message) {
        if (!StringUtils.hasText(message)) {
            return "unknown error";
        }
        // DB 列长度受限，超长错误信息做截断防止写入失败。
        return message.length() > 1024 ? message.substring(0, 1024) : message;
    }

    private static AuditOutboxEvent mapEvent(ResultSet rs, int rowNum) throws SQLException {
        Timestamp createdAt = rs.getTimestamp("created_at");
        return new AuditOutboxEvent(
            rs.getLong("id"),
            rs.getString("event_type"),
            rs.getString("payload_json"),
            rs.getString("status"),
            rs.getInt("retry_count"),
            createdAt == null ? Instant.now() : createdAt.toInstant()
        );
    }
}
