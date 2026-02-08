-- database: shizuki_media
-- last_modified_at: 2026-02-08 18:03:04

-- modified_at: 2026-02-08 18:03:04
-- change: init media domain tables and audit/outbox tables
CREATE DATABASE IF NOT EXISTS shizuki_media DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE shizuki_media;

-- 资源主表：保存对象存储元数据与审核状态。
CREATE TABLE IF NOT EXISTS media_asset (
    asset_id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '资源ID',
    user_id BIGINT NOT NULL COMMENT '上传用户ID',
    bucket_name VARCHAR(128) NOT NULL COMMENT '对象存储Bucket',
    object_key VARCHAR(512) NOT NULL COMMENT '对象存储Key',
    asset_type VARCHAR(64) NOT NULL COMMENT '资源类型',
    audit_status VARCHAR(32) NOT NULL DEFAULT 'PENDING_AUDIT' COMMENT '审核状态',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
    INDEX idx_media_asset_user_id (user_id),
    INDEX idx_media_asset_audit_status (audit_status)
) COMMENT='媒体资源表';

-- 资源举报表：记录资源级举报工单。
CREATE TABLE IF NOT EXISTS media_asset_report (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    asset_id BIGINT NOT NULL COMMENT '资源ID',
    status VARCHAR(32) NOT NULL DEFAULT 'CREATED' COMMENT '举报状态',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    INDEX idx_media_asset_report_asset_id (asset_id),
    INDEX idx_media_asset_report_created_at (created_at)
) COMMENT='媒体资源举报表';

-- 审计日志表：媒体域操作审计。
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

-- 审计 outbox 表：预留统一消费。
CREATE TABLE IF NOT EXISTS audit_event_outbox (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    event_type VARCHAR(64) NOT NULL COMMENT '事件类型',
    payload_json JSON NOT NULL COMMENT '事件载荷JSON',
    status VARCHAR(32) NOT NULL DEFAULT 'NEW' COMMENT '事件状态',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    processed_at DATETIME(3) NULL COMMENT '处理时间',
    INDEX idx_audit_outbox_status_created (status, created_at)
) COMMENT='审计事件Outbox表';

-- modified_at: 2026-02-08 18:03:04
-- change: add retry metadata columns for audit outbox dispatch and retry scheduler
SET @shizuki_media_retry_count_exists := (
    SELECT COUNT(1) FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'audit_event_outbox'
      AND column_name = 'retry_count'
);
SET @shizuki_media_retry_count_sql := IF(
    @shizuki_media_retry_count_exists = 0,
    'ALTER TABLE audit_event_outbox ADD COLUMN retry_count INT NOT NULL DEFAULT 0 COMMENT ''重试次数''',
    'SELECT 1'
);
PREPARE shizuki_media_retry_count_stmt FROM @shizuki_media_retry_count_sql;
EXECUTE shizuki_media_retry_count_stmt;
DEALLOCATE PREPARE shizuki_media_retry_count_stmt;

SET @shizuki_media_next_retry_at_exists := (
    SELECT COUNT(1) FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'audit_event_outbox'
      AND column_name = 'next_retry_at'
);
SET @shizuki_media_next_retry_at_sql := IF(
    @shizuki_media_next_retry_at_exists = 0,
    'ALTER TABLE audit_event_outbox ADD COLUMN next_retry_at DATETIME(3) NULL COMMENT ''下次重试时间''',
    'SELECT 1'
);
PREPARE shizuki_media_next_retry_at_stmt FROM @shizuki_media_next_retry_at_sql;
EXECUTE shizuki_media_next_retry_at_stmt;
DEALLOCATE PREPARE shizuki_media_next_retry_at_stmt;

SET @shizuki_media_last_error_exists := (
    SELECT COUNT(1) FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'audit_event_outbox'
      AND column_name = 'last_error'
);
SET @shizuki_media_last_error_sql := IF(
    @shizuki_media_last_error_exists = 0,
    'ALTER TABLE audit_event_outbox ADD COLUMN last_error VARCHAR(1024) NULL COMMENT ''最近一次错误信息''',
    'SELECT 1'
);
PREPARE shizuki_media_last_error_stmt FROM @shizuki_media_last_error_sql;
EXECUTE shizuki_media_last_error_stmt;
DEALLOCATE PREPARE shizuki_media_last_error_stmt;

SET @shizuki_media_idx_exists := (
    SELECT COUNT(1) FROM information_schema.statistics
    WHERE table_schema = DATABASE()
      AND table_name = 'audit_event_outbox'
      AND index_name = 'idx_audit_outbox_retry'
);
SET @shizuki_media_idx_sql := IF(
    @shizuki_media_idx_exists = 0,
    'CREATE INDEX idx_audit_outbox_retry ON audit_event_outbox (status, next_retry_at, created_at)',
    'SELECT 1'
);
PREPARE shizuki_media_idx_stmt FROM @shizuki_media_idx_sql;
EXECUTE shizuki_media_idx_stmt;
DEALLOCATE PREPARE shizuki_media_idx_stmt;
