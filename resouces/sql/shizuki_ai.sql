-- database: shizuki_ai
-- last_modified_at: 2026-02-08 18:03:04

-- modified_at: 2026-02-08 18:03:04
-- change: init ai domain tables and audit/outbox tables
CREATE DATABASE IF NOT EXISTS shizuki_ai DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE shizuki_ai;

-- 会话表：记录用户会话元信息。
CREATE TABLE IF NOT EXISTS ai_session (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    session_id VARCHAR(64) NOT NULL UNIQUE COMMENT '会话业务ID',
    user_id BIGINT NOT NULL COMMENT '用户ID',
    title VARCHAR(255) NOT NULL COMMENT '会话标题',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
    INDEX idx_ai_session_user_id (user_id)
) COMMENT='AI会话表';

-- 消息表：记录会话内 user/assistant 消息。
CREATE TABLE IF NOT EXISTS ai_message (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    session_id VARCHAR(64) NOT NULL COMMENT '会话业务ID',
    user_id BIGINT NOT NULL COMMENT '用户ID',
    role_name VARCHAR(32) NOT NULL COMMENT '角色（user/assistant）',
    content TEXT NOT NULL COMMENT '消息内容',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    INDEX idx_ai_message_session_id (session_id),
    INDEX idx_ai_message_user_id (user_id)
) COMMENT='AI消息表';

-- 配额使用表：按用户与 quota_code 追踪配额消耗。
CREATE TABLE IF NOT EXISTS ai_quota_usage (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    user_id BIGINT NOT NULL COMMENT '用户ID',
    quota_code VARCHAR(64) NOT NULL COMMENT '配额编码',
    total_rounds BIGINT NOT NULL COMMENT '总配额',
    used_rounds BIGINT NOT NULL DEFAULT 0 COMMENT '已使用配额',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
    UNIQUE KEY uk_ai_quota_user_code (user_id, quota_code)
) COMMENT='AI配额使用表';

-- 角色配置表：保存角色与角色卡 JSON。
CREATE TABLE IF NOT EXISTS ai_character (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    user_id BIGINT NOT NULL COMMENT '用户ID',
    type_name VARCHAR(64) NOT NULL COMMENT '配置类型',
    payload_json JSON NOT NULL COMMENT '配置载荷JSON',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    INDEX idx_ai_character_user_id (user_id),
    INDEX idx_ai_character_type_name (type_name)
) COMMENT='AI角色配置表';

-- 审计日志表：AI 域关键操作追踪。
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

-- 审计 outbox 表：后续统一平台消费入口。
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
ALTER TABLE audit_event_outbox
    ADD COLUMN IF NOT EXISTS retry_count INT NOT NULL DEFAULT 0 COMMENT '重试次数',
    ADD COLUMN IF NOT EXISTS next_retry_at DATETIME(3) NULL COMMENT '下次重试时间',
    ADD COLUMN IF NOT EXISTS last_error VARCHAR(1024) NULL COMMENT '最近一次错误信息';

SET @shizuki_ai_idx_exists := (
    SELECT COUNT(1) FROM information_schema.statistics
    WHERE table_schema = DATABASE()
      AND table_name = 'audit_event_outbox'
      AND index_name = 'idx_audit_outbox_retry'
);
SET @shizuki_ai_idx_sql := IF(
    @shizuki_ai_idx_exists = 0,
    'CREATE INDEX idx_audit_outbox_retry ON audit_event_outbox (status, next_retry_at, created_at)',
    'SELECT 1'
);
PREPARE shizuki_ai_idx_stmt FROM @shizuki_ai_idx_sql;
EXECUTE shizuki_ai_idx_stmt;
DEALLOCATE PREPARE shizuki_ai_idx_stmt;
