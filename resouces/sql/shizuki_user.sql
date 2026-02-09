-- database: shizuki_user
-- last_modified_at: 2026-02-09 23:09:32

-- modified_at: 2026-02-09 23:09:32
-- change: rebuild tables for empty database (drop + create) with v1.1 standard schema
CREATE DATABASE IF NOT EXISTS shizuki_user DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE shizuki_user;

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS OAU_BINDING;
DROP TABLE IF EXISTS OAU_LOGIN;
DROP TABLE IF EXISTS USR_PREFERENCE;
DROP TABLE IF EXISTS USR_QUOTA_POLICY;
DROP TABLE IF EXISTS AUD_EVENT_OUTBOX;
DROP TABLE IF EXISTS AUD_LOG;
DROP TABLE IF EXISTS USR_ACCOUNT;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE IF NOT EXISTS USR_ACCOUNT (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增长ID',
    username_code VARCHAR(64) NOT NULL COMMENT '登录用户名编码',
    password_hash VARCHAR(255) NULL COMMENT '密码哈希值',
    nickname_text VARCHAR(128) NOT NULL COMMENT '昵称描述',
    email_text VARCHAR(128) NULL COMMENT '邮箱描述',
    groups_json JSON NOT NULL COMMENT '分组集合JSON',
    permissions_json JSON NOT NULL COMMENT '权限集合JSON',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    CONSTRAINT PK_USR_ACCOUNT PRIMARY KEY (id),
    CONSTRAINT AK_USR_ACCOUNT_1 UNIQUE (username_code),
    KEY IX_USR_ACCOUNT_1 (email_text)
) COMMENT='用户主数据表';

CREATE TABLE IF NOT EXISTS USR_PREFERENCE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增长ID',
    user_id BIGINT NOT NULL COMMENT '用户ID',
    preference_json JSON NOT NULL COMMENT '偏好配置JSON',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    CONSTRAINT PK_USR_PREFERENCE PRIMARY KEY (id),
    CONSTRAINT AK_USR_PREFERENCE_1 UNIQUE (user_id),
    KEY IX_USR_PREFERENCE_1 (create_time),
    CONSTRAINT FK_USR_PREFERENCE_1 FOREIGN KEY (user_id) REFERENCES USR_ACCOUNT(id)
) COMMENT='用户偏好表';

CREATE TABLE IF NOT EXISTS OAU_LOGIN (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增长ID',
    oauth_login_code VARCHAR(64) NOT NULL COMMENT 'OAuth登录编号',
    provider_type VARCHAR(32) NOT NULL COMMENT '平台类型',
    redirect_uri_text VARCHAR(512) NOT NULL COMMENT '回调地址描述',
    state_code VARCHAR(128) NOT NULL COMMENT '防重放状态码',
    login_status VARCHAR(32) NOT NULL COMMENT '登录状态',
    provider_user_code VARCHAR(128) NULL COMMENT '第三方用户编号',
    user_id BIGINT NULL COMMENT '用户ID',
    error_memo VARCHAR(512) NULL COMMENT '错误备注',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    CONSTRAINT PK_OAU_LOGIN PRIMARY KEY (id),
    CONSTRAINT AK_OAU_LOGIN_1 UNIQUE (oauth_login_code),
    KEY IX_OAU_LOGIN_1 (create_time),
    CONSTRAINT FK_OAU_LOGIN_1 FOREIGN KEY (user_id) REFERENCES USR_ACCOUNT(id)
) COMMENT='OAuth登录事务表';

CREATE TABLE IF NOT EXISTS OAU_BINDING (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增长ID',
    user_id BIGINT NOT NULL COMMENT '用户ID',
    provider_type VARCHAR(32) NOT NULL COMMENT '平台类型',
    provider_user_code VARCHAR(128) NOT NULL COMMENT '平台用户编号',
    provider_login_code VARCHAR(128) NULL COMMENT '平台登录编号',
    provider_email_text VARCHAR(128) NULL COMMENT '平台邮箱描述',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    CONSTRAINT PK_OAU_BINDING PRIMARY KEY (id),
    CONSTRAINT AK_OAU_BINDING_1 UNIQUE (provider_type, provider_user_code),
    KEY IX_OAU_BINDING_1 (user_id),
    CONSTRAINT FK_OAU_BINDING_1 FOREIGN KEY (user_id) REFERENCES USR_ACCOUNT(id)
) COMMENT='OAuth绑定关系表';

CREATE TABLE IF NOT EXISTS USR_QUOTA_POLICY (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增长ID',
    policy_code VARCHAR(64) NOT NULL COMMENT '策略编号',
    group_code VARCHAR(32) NOT NULL COMMENT '分组编号',
    quota_code VARCHAR(64) NOT NULL COMMENT '配额编号',
    quota_value BIGINT NOT NULL COMMENT '配额值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    CONSTRAINT PK_USR_QUOTA_POLICY PRIMARY KEY (id),
    CONSTRAINT AK_USR_QUOTA_POLICY_1 UNIQUE (policy_code),
    CONSTRAINT AK_USR_QUOTA_POLICY_2 UNIQUE (group_code, quota_code),
    KEY IX_USR_QUOTA_POLICY_1 (group_code)
) COMMENT='分组配额策略表';

CREATE TABLE IF NOT EXISTS AUD_LOG (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增长ID',
    trace_code VARCHAR(64) NULL COMMENT '链路编号',
    user_id BIGINT NULL COMMENT '用户ID',
    action_code VARCHAR(128) NOT NULL COMMENT '动作编号',
    resource_code VARCHAR(128) NULL COMMENT '资源编号',
    result_status VARCHAR(32) NOT NULL COMMENT '执行状态',
    error_code VARCHAR(64) NULL COMMENT '错误编号',
    cost_value BIGINT NOT NULL COMMENT '耗时值',
    create_time DATETIME NOT NULL COMMENT '创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    CONSTRAINT PK_AUD_LOG PRIMARY KEY (id),
    KEY IX_AUD_LOG_1 (trace_code),
    KEY IX_AUD_LOG_2 (user_id),
    KEY IX_AUD_LOG_3 (action_code),
    KEY IX_AUD_LOG_4 (create_time)
) COMMENT='审计日志表';

CREATE TABLE IF NOT EXISTS AUD_EVENT_OUTBOX (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增长ID',
    event_type VARCHAR(64) NOT NULL COMMENT '事件类型',
    payload_json JSON NOT NULL COMMENT '事件载荷JSON',
    event_status VARCHAR(32) NOT NULL DEFAULT 'NEW' COMMENT '事件状态',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    processed_datetime DATETIME NULL COMMENT '处理时间',
    retry_count INT NOT NULL DEFAULT 0 COMMENT '重试次数',
    next_retry_datetime DATETIME NULL COMMENT '下次重试时间',
    last_error_memo VARCHAR(1024) NULL COMMENT '最近一次错误备注',
    CONSTRAINT PK_AUD_EVENT_OUTBOX PRIMARY KEY (id),
    KEY IX_AUD_EVENT_OUTBOX_1 (event_status, create_time),
    KEY IX_AUD_EVENT_OUTBOX_2 (event_status, next_retry_datetime, create_time)
) COMMENT='审计事件发件箱表';

INSERT INTO USR_ACCOUNT (
    id, username_code, password_hash, nickname_text, email_text, groups_json, permissions_json
)
VALUES (
    1,
    'admin',
    '$2b$10$XLD4Et5rk2AsIFQtFaYM1Ohq/NOudqui7Blmg1NVuEEQ3IjQBHweC',
    'Administrator',
    'admin@shizuki.dev',
    JSON_ARRAY('ADMIN', 'USER'),
    JSON_ARRAY('*')
)
ON DUPLICATE KEY UPDATE
    nickname_text = VALUES(nickname_text),
    email_text = VALUES(email_text),
    update_time = CURRENT_TIMESTAMP;

INSERT INTO USR_QUOTA_POLICY (policy_code, group_code, quota_code, quota_value)
VALUES
    ('user-ai-rounds-user', 'USER', 'ai_round_total', 5),
    ('user-ai-rounds-interviewer', 'INTERVIEWER', 'ai_round_total', 20),
    ('user-ai-rounds-admin', 'ADMIN', 'ai_round_total', 999999)
ON DUPLICATE KEY UPDATE
    quota_value = VALUES(quota_value),
    update_time = CURRENT_TIMESTAMP;
