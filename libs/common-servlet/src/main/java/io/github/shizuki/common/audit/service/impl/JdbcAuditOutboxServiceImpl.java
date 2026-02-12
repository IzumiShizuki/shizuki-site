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

/**
 * 基于 JDBC 的 outbox 调度服务实现。
 *
 * <p>负责扫描待处理事件、抢占处理权、分发发布、并按指数退避更新重试状态。
 */
@Service
public class JdbcAuditOutboxServiceImpl implements AuditOutboxService {

    /**
     * 日志组件。
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(JdbcAuditOutboxServiceImpl.class);

    /**
     * 查询待处理 outbox 事件 SQL。
     */
    private static final String SELECT_PENDING_SQL = """
        SELECT id, event_type, CAST(payload_json AS CHAR) AS payload_json, event_status,
               COALESCE(retry_count, 0) AS retry_count, create_time
        FROM AUD_EVENT_OUTBOX
        WHERE event_status IN ('NEW', 'FAILED')
          AND (next_retry_datetime IS NULL OR next_retry_datetime <= NOW())
          AND COALESCE(retry_count, 0) < ?
        ORDER BY id ASC
        LIMIT ?
        """;

    /**
     * 抢占事件处理权 SQL。
     */
    private static final String CLAIM_SQL = """
        UPDATE AUD_EVENT_OUTBOX
        SET event_status = 'PROCESSING', last_error_memo = NULL
        WHERE id = ? AND event_status IN ('NEW', 'FAILED')
        """;

    /**
     * 标记处理成功 SQL。
     */
    private static final String SUCCESS_SQL = """
        UPDATE AUD_EVENT_OUTBOX
        SET event_status = 'SUCCESS', processed_datetime = NOW(), last_error_memo = NULL
        WHERE id = ?
        """;

    /**
     * 标记失败并安排下次重试 SQL。
     */
    private static final String FAIL_RETRY_SQL = """
        UPDATE AUD_EVENT_OUTBOX
        SET event_status = 'FAILED',
            retry_count = ?,
            next_retry_datetime = DATE_ADD(NOW(), INTERVAL ? SECOND),
            last_error_memo = ?,
            processed_datetime = NOW()
        WHERE id = ?
        """;

    /**
     * 标记最终失败 SQL。
     */
    private static final String FAIL_FINAL_SQL = """
        UPDATE AUD_EVENT_OUTBOX
        SET event_status = 'FAILED',
            retry_count = ?,
            next_retry_datetime = NULL,
            last_error_memo = ?,
            processed_datetime = NOW()
        WHERE id = ?
        """;

    /**
     * 回收长时间卡在 PROCESSING 的事件。
     */
    private static final String RECLAIM_STUCK_PROCESSING_SQL = """
        UPDATE AUD_EVENT_OUTBOX
        SET event_status = 'FAILED',
            next_retry_datetime = NOW(),
            last_error_memo = 'processing_timeout_reclaimed',
            processed_datetime = NOW()
        WHERE event_status = 'PROCESSING'
          AND update_time <= DATE_SUB(NOW(), INTERVAL ? SECOND)
        """;

    /**
     * outbox 事件行映射器。
     */
    private static final RowMapper<AuditOutboxEvent> EVENT_ROW_MAPPER = JdbcAuditOutboxServiceImpl::mapEvent;

    /**
     * JdbcTemplate 延迟提供者。
     */
    private final ObjectProvider<JdbcTemplate> jdbcTemplateProvider;
    /**
     * 发布器路由器。
     */
    private final AuditOutboxPublisherRouter publisherRouter;
    /**
     * outbox 配置。
     */
    private final AuditOutboxProperties properties;

    /**
     * 构造 JDBC outbox 调度服务。
     *
     * @param jdbcTemplateProvider JdbcTemplate 延迟提供者
     * @param publisherRouter 发布器路由器
     * @param properties outbox 配置
     */
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
            reclaimStuckProcessingEvents(jdbcTemplate);
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
            LOGGER.warn("审计 outbox 事件分发失败：{}", ex.getMessage());
        }
    }

    /**
     * 回收异常实例退出后长期滞留的 PROCESSING 事件，重新放回重试通道。
     *
     * @param jdbcTemplate jdbcTemplate
     */
    private void reclaimStuckProcessingEvents(JdbcTemplate jdbcTemplate) {
        int reclaimed = jdbcTemplate.update(
            RECLAIM_STUCK_PROCESSING_SQL,
            properties.getProcessingTimeoutSeconds()
        );
        if (reclaimed > 0) {
            LOGGER.warn("回收到 {} 条卡住的 PROCESSING outbox 事件", reclaimed);
        }
    }

    /**
     * 处理单条 outbox 事件。
     *
     * @param jdbcTemplate jdbcTemplate
     * @param event outbox 事件
     */
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

    /**
     * 处理发布失败逻辑。
     *
     * @param jdbcTemplate jdbcTemplate
     * @param event outbox 事件
     * @param ex 异常
     */
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

    /**
     * 计算指数退避秒数。
     *
     * @param retryCount 当前重试次数
     * @return 下次延迟秒数
     */
    private int backoffSeconds(int retryCount) {
        long candidate = (long) properties.getRetryBaseSeconds() << Math.max(retryCount - 1, 0);
        long max = properties.getRetryMaxSeconds();
        return (int) Math.max(1L, Math.min(candidate, max));
    }

    /**
     * 截断异常信息到数据库列限制长度。
     *
     * @param message 原始异常信息
     * @return 截断后消息
     */
    private String abbreviate(String message) {
        if (!StringUtils.hasText(message)) {
            return "unknown error";
        }
        // DB 列长度受限，超长错误信息做截断防止写入失败。
        return message.length() > 1024 ? message.substring(0, 1024) : message;
    }

    /**
     * ResultSet 映射为 outbox 事件。
     *
     * @param rs 结果集
     * @param rowNum 行号
     * @return outbox 事件
     * @throws SQLException SQL 异常
     */
    private static AuditOutboxEvent mapEvent(ResultSet rs, int rowNum) throws SQLException {
        Timestamp createdAt = rs.getTimestamp("create_time");
        return new AuditOutboxEvent(
            rs.getLong("id"),
            rs.getString("event_type"),
            rs.getString("payload_json"),
            rs.getString("event_status"),
            rs.getInt("retry_count"),
            createdAt == null ? Instant.now() : createdAt.toInstant()
        );
    }
}
