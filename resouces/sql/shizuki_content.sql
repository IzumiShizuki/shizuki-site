-- database: shizuki_content
-- last_modified_at: 2026-02-08 18:03:04

-- modified_at: 2026-02-08 18:03:04
-- change: init content domain tables, audit tables, and seed data
CREATE DATABASE IF NOT EXISTS shizuki_content DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE shizuki_content;

-- 帖子表：承载社区帖子基础信息。
CREATE TABLE IF NOT EXISTS post (
    post_id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '帖子ID',
    title VARCHAR(255) NOT NULL COMMENT '帖子标题',
    summary VARCHAR(500) NOT NULL COMMENT '帖子摘要',
    visibility VARCHAR(32) NOT NULL DEFAULT 'PUBLIC' COMMENT '可见性',
    like_count BIGINT NOT NULL DEFAULT 0 COMMENT '点赞数',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间'
) COMMENT='帖子表';

-- 应用表：承载应用卡片与分类信息。
CREATE TABLE IF NOT EXISTS app (
    app_id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '应用ID',
    name VARCHAR(255) NOT NULL COMMENT '应用名称',
    category VARCHAR(64) NOT NULL COMMENT '应用分类',
    pin_able TINYINT(1) NOT NULL DEFAULT 1 COMMENT '是否可置顶',
    like_count BIGINT NOT NULL DEFAULT 0 COMMENT '点赞数',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间'
) COMMENT='应用表';

-- 举报表：统一记录帖子/应用举报。
CREATE TABLE IF NOT EXISTS content_report (
    report_id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '举报ID',
    target_type VARCHAR(64) NOT NULL COMMENT '目标类型（POST/APP）',
    target_id BIGINT NOT NULL COMMENT '目标ID',
    reason VARCHAR(255) NOT NULL COMMENT '举报原因',
    status VARCHAR(32) NOT NULL DEFAULT 'CREATED' COMMENT '举报状态',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    INDEX idx_content_report_target (target_type, target_id),
    INDEX idx_content_report_created_at (created_at)
) COMMENT='内容举报表';

-- 审计日志表：内容域操作审计。
CREATE TABLE IF NOT EXISTS audit_log (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    trace_id VARCHAR(64) NULL COMMENT '链路追踪ID',
    user_id BIGINT NULL COMMENT '操作用户ID',
    action_name VARCHAR(128) NOT NULL COMMENT '操作动作',
    resource_name VARCHAR(128) NULL COMMENT '资源名称',
    result VARCHAR(32) NOT NULL COMMENT '执行结果',
    error_code VARCHAR(64) NULL COMMENT '错误码',
    cost_ms BIGINT NOT NULL COMMENT '耗时毫秒',
    created_at DATETIME(3) NOT NULL COMMENT '创建时间',
    INDEX idx_audit_trace_id (trace_id),
    INDEX idx_audit_user_id (user_id),
    INDEX idx_audit_action_name (action_name),
    INDEX idx_audit_created_at (created_at)
) COMMENT='审计日志表';

-- 审计 outbox 表：预留异步上报。
CREATE TABLE IF NOT EXISTS audit_event_outbox (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    event_type VARCHAR(64) NOT NULL COMMENT '事件类型',
    payload_json JSON NOT NULL COMMENT '事件载荷JSON',
    status VARCHAR(32) NOT NULL DEFAULT 'NEW' COMMENT '事件状态',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    processed_at DATETIME(3) NULL COMMENT '处理时间',
    INDEX idx_audit_outbox_status_created (status, created_at)
) COMMENT='审计事件Outbox表';

-- 初始化帖子示例数据。
INSERT INTO post (post_id, title, summary, visibility)
VALUES
    (1, 'Shizuki v0.1', 'Project kickoff post', 'PUBLIC'),
    (2, 'Architecture Notes', 'Microservice baseline', 'PUBLIC')
ON DUPLICATE KEY UPDATE summary = VALUES(summary), updated_at = CURRENT_TIMESTAMP(3);

-- 初始化应用示例数据。
INSERT INTO app (app_id, name, category, pin_able)
VALUES
    (1, 'Focus Timer', 'study', 1),
    (2, 'Ambient Mixer', 'tool', 1)
ON DUPLICATE KEY UPDATE category = VALUES(category), updated_at = CURRENT_TIMESTAMP(3);

-- modified_at: 2026-02-08 18:03:04
-- change: add retry metadata columns for audit outbox dispatch and retry scheduler
SET @shizuki_content_retry_count_exists := (
    SELECT COUNT(1) FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'audit_event_outbox'
      AND column_name = 'retry_count'
);
SET @shizuki_content_retry_count_sql := IF(
    @shizuki_content_retry_count_exists = 0,
    'ALTER TABLE audit_event_outbox ADD COLUMN retry_count INT NOT NULL DEFAULT 0 COMMENT ''重试次数''',
    'SELECT 1'
);
PREPARE shizuki_content_retry_count_stmt FROM @shizuki_content_retry_count_sql;
EXECUTE shizuki_content_retry_count_stmt;
DEALLOCATE PREPARE shizuki_content_retry_count_stmt;

SET @shizuki_content_next_retry_at_exists := (
    SELECT COUNT(1) FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'audit_event_outbox'
      AND column_name = 'next_retry_at'
);
SET @shizuki_content_next_retry_at_sql := IF(
    @shizuki_content_next_retry_at_exists = 0,
    'ALTER TABLE audit_event_outbox ADD COLUMN next_retry_at DATETIME(3) NULL COMMENT ''下次重试时间''',
    'SELECT 1'
);
PREPARE shizuki_content_next_retry_at_stmt FROM @shizuki_content_next_retry_at_sql;
EXECUTE shizuki_content_next_retry_at_stmt;
DEALLOCATE PREPARE shizuki_content_next_retry_at_stmt;

SET @shizuki_content_last_error_exists := (
    SELECT COUNT(1) FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'audit_event_outbox'
      AND column_name = 'last_error'
);
SET @shizuki_content_last_error_sql := IF(
    @shizuki_content_last_error_exists = 0,
    'ALTER TABLE audit_event_outbox ADD COLUMN last_error VARCHAR(1024) NULL COMMENT ''最近一次错误信息''',
    'SELECT 1'
);
PREPARE shizuki_content_last_error_stmt FROM @shizuki_content_last_error_sql;
EXECUTE shizuki_content_last_error_stmt;
DEALLOCATE PREPARE shizuki_content_last_error_stmt;

SET @shizuki_content_idx_exists := (
    SELECT COUNT(1) FROM information_schema.statistics
    WHERE table_schema = DATABASE()
      AND table_name = 'audit_event_outbox'
      AND index_name = 'idx_audit_outbox_retry'
);
SET @shizuki_content_idx_sql := IF(
    @shizuki_content_idx_exists = 0,
    'CREATE INDEX idx_audit_outbox_retry ON audit_event_outbox (status, next_retry_at, created_at)',
    'SELECT 1'
);
PREPARE shizuki_content_idx_stmt FROM @shizuki_content_idx_sql;
EXECUTE shizuki_content_idx_stmt;
DEALLOCATE PREPARE shizuki_content_idx_stmt;
