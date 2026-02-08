-- database: shizuki_user
-- last_modified_at: 2026-02-08 18:03:04

-- modified_at: 2026-02-08 18:03:04
-- change: init user domain tables, audit tables, and seed data
CREATE DATABASE IF NOT EXISTS shizuki_user DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE shizuki_user;

-- 用户主表：保存本地账号、分组与权限快照。
CREATE TABLE IF NOT EXISTS user_account (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    username VARCHAR(64) NOT NULL UNIQUE COMMENT '登录用户名（唯一）',
    password VARCHAR(128) NULL COMMENT '密码哈希（OAuth账号可为空）',
    nickname VARCHAR(128) NOT NULL COMMENT '展示昵称',
    email VARCHAR(128) NULL COMMENT '邮箱地址',
    groups_json JSON NOT NULL COMMENT '分组集合JSON',
    permissions_json JSON NOT NULL COMMENT '权限集合JSON',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间'
) COMMENT='用户主表';

-- 用户偏好表：按 user_id 唯一保存偏好 JSON。
CREATE TABLE IF NOT EXISTS user_preference (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    user_id BIGINT NOT NULL UNIQUE COMMENT '用户ID（唯一）',
    preference_json JSON NOT NULL COMMENT '偏好配置JSON',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间'
) COMMENT='用户偏好表';

-- OAuth 登录事务表：记录一次 oauth_login 的状态流转。
CREATE TABLE IF NOT EXISTS oauth_login (
    oauth_login_id VARCHAR(64) PRIMARY KEY COMMENT 'OAuth登录事务ID',
    provider VARCHAR(32) NOT NULL COMMENT '第三方平台（如github）',
    redirect_uri VARCHAR(512) NOT NULL COMMENT '回调地址',
    state VARCHAR(128) NOT NULL COMMENT '防重放state',
    status VARCHAR(32) NOT NULL COMMENT '登录状态（PENDING/SUCCESS/FAILED）',
    provider_user_id VARCHAR(128) NULL COMMENT '第三方用户ID',
    user_id BIGINT NULL COMMENT '本地用户ID',
    error_message VARCHAR(512) NULL COMMENT '失败原因',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
    INDEX idx_oauth_login_created_at (created_at)
) COMMENT='OAuth登录事务表';

-- OAuth 绑定表：本地用户与第三方账号的一对多绑定关系。
CREATE TABLE IF NOT EXISTS oauth_binding (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    user_id BIGINT NOT NULL COMMENT '本地用户ID',
    provider VARCHAR(32) NOT NULL COMMENT '第三方平台',
    provider_user_id VARCHAR(128) NOT NULL COMMENT '第三方用户ID',
    provider_login VARCHAR(128) NULL COMMENT '第三方登录名',
    provider_email VARCHAR(128) NULL COMMENT '第三方邮箱',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
    UNIQUE KEY uk_provider_user (provider, provider_user_id),
    INDEX idx_oauth_binding_user_id (user_id)
) COMMENT='OAuth账号绑定表';

-- 分组配额策略：按 group_code + quota_code 唯一约束。
CREATE TABLE IF NOT EXISTS group_quota_policy (
    policy_id VARCHAR(64) PRIMARY KEY COMMENT '策略ID',
    group_code VARCHAR(32) NOT NULL COMMENT '分组编码',
    quota_code VARCHAR(64) NOT NULL COMMENT '配额编码',
    quota_value BIGINT NOT NULL COMMENT '配额值',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
    UNIQUE KEY uk_group_quota (group_code, quota_code)
) COMMENT='分组配额策略表';

-- 审计日志表：本地可追责查询。
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

-- 审计 outbox 表：预留统一审计平台异步消费。
CREATE TABLE IF NOT EXISTS audit_event_outbox (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    event_type VARCHAR(64) NOT NULL COMMENT '事件类型',
    payload_json JSON NOT NULL COMMENT '事件载荷JSON',
    status VARCHAR(32) NOT NULL DEFAULT 'NEW' COMMENT '事件状态',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    processed_at DATETIME(3) NULL COMMENT '处理时间',
    INDEX idx_audit_outbox_status_created (status, created_at)
) COMMENT='审计事件Outbox表';

-- 初始化管理员账号（仅开发环境）。
INSERT INTO user_account (id, username, password, nickname, email, groups_json, permissions_json)
VALUES (1, 'admin', 'admin123', 'Administrator', 'admin@shizuki.dev', JSON_ARRAY('ADMIN', 'USER'), JSON_ARRAY('*'))
ON DUPLICATE KEY UPDATE nickname = VALUES(nickname), updated_at = CURRENT_TIMESTAMP(3);

-- 初始化 AI 回合配额策略（按分组覆盖）。
INSERT INTO group_quota_policy (policy_id, group_code, quota_code, quota_value)
VALUES
    ('user-ai-rounds-user', 'USER', 'ai_round_total', 5),
    ('user-ai-rounds-interviewer', 'INTERVIEWER', 'ai_round_total', 20),
    ('user-ai-rounds-admin', 'ADMIN', 'ai_round_total', 999999)
ON DUPLICATE KEY UPDATE quota_value = VALUES(quota_value), updated_at = CURRENT_TIMESTAMP(3);

-- modified_at: 2026-02-08 18:03:04
-- change: add retry metadata columns for audit outbox dispatch and retry scheduler
ALTER TABLE audit_event_outbox
    ADD COLUMN IF NOT EXISTS retry_count INT NOT NULL DEFAULT 0 COMMENT '重试次数',
    ADD COLUMN IF NOT EXISTS next_retry_at DATETIME(3) NULL COMMENT '下次重试时间',
    ADD COLUMN IF NOT EXISTS last_error VARCHAR(1024) NULL COMMENT '最近一次错误信息';

SET @shizuki_user_idx_exists := (
    SELECT COUNT(1) FROM information_schema.statistics
    WHERE table_schema = DATABASE()
      AND table_name = 'audit_event_outbox'
      AND index_name = 'idx_audit_outbox_retry'
);
SET @shizuki_user_idx_sql := IF(
    @shizuki_user_idx_exists = 0,
    'CREATE INDEX idx_audit_outbox_retry ON audit_event_outbox (status, next_retry_at, created_at)',
    'SELECT 1'
);
PREPARE shizuki_user_idx_stmt FROM @shizuki_user_idx_sql;
EXECUTE shizuki_user_idx_stmt;
DEALLOCATE PREPARE shizuki_user_idx_stmt;
