package io.github.shizuki.common.audit.service.impl;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.github.shizuki.common.audit.config.AuditOutboxProperties;
import io.github.shizuki.common.audit.service.AuditOutboxPublisherRouter;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * {@link JdbcAuditOutboxServiceImpl} 单元测试。
 *
 * <p>关注 PROCESSING 超时回收行为，确保在扫描 pending 前先执行 reclaim。
 */
@ExtendWith(MockitoExtension.class)
class JdbcAuditOutboxServiceImplTest {

    @Mock
    private ObjectProvider<JdbcTemplate> jdbcTemplateProvider;
    @Mock
    private JdbcTemplate jdbcTemplate;
    @Mock
    private AuditOutboxPublisherRouter publisherRouter;

    private AuditOutboxProperties properties;
    private JdbcAuditOutboxServiceImpl service;

    /**
     * 初始化被测服务并预置 JdbcTemplate 基础 stub。
     */
    @BeforeEach
    void setUp() {
        properties = new AuditOutboxProperties();
        properties.setEnabled(true);
        properties.setBatchSize(10);
        properties.setMaxRetries(3);
        properties.setProcessingTimeoutSeconds(180);

        service = new JdbcAuditOutboxServiceImpl(jdbcTemplateProvider, publisherRouter, properties);
        when(jdbcTemplateProvider.getIfAvailable()).thenReturn(jdbcTemplate);
        when(jdbcTemplate.update(contains("WHERE event_status = 'PROCESSING'"), anyInt())).thenReturn(0);
        when(jdbcTemplate.query(anyString(), any(RowMapper.class), any(), any())).thenReturn(List.of());
    }

    /**
     * 目标：验证 dispatch 会先执行 reclaim，再执行 pending 查询。
     */
    @Test
    void shouldReclaimStuckProcessingBeforeScanningPendingEvents() {
        service.dispatchPendingEvents();

        InOrder order = inOrder(jdbcTemplate);
        order.verify(jdbcTemplate).update(contains("WHERE event_status = 'PROCESSING'"), eq(180));
        order.verify(jdbcTemplate).query(anyString(), any(RowMapper.class), eq(3), eq(10));
    }

    /**
     * 目标：验证 reclaim SQL 使用配置化 processing timeout 参数。
     */
    @Test
    void shouldUseConfiguredProcessingTimeoutWhenReclaiming() {
        properties.setProcessingTimeoutSeconds(420);

        service.dispatchPendingEvents();

        verify(jdbcTemplate).update(contains("DATE_SUB(NOW(), INTERVAL ? SECOND)"), eq(420));
        verify(jdbcTemplate).query(anyString(), any(RowMapper.class), anyInt(), anyInt());
    }
}
