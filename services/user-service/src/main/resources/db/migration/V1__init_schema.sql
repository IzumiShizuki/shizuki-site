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

CREATE TABLE IF NOT EXISTS user_preference (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    user_id BIGINT NOT NULL UNIQUE COMMENT '用户ID（唯一）',
    preference_json JSON NOT NULL COMMENT '偏好配置JSON',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间'
) COMMENT='用户偏好表';

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

CREATE TABLE IF NOT EXISTS group_quota_policy (
    policy_id VARCHAR(64) PRIMARY KEY COMMENT '策略ID',
    group_code VARCHAR(32) NOT NULL COMMENT '分组编码',
    quota_code VARCHAR(64) NOT NULL COMMENT '配额编码',
    quota_value BIGINT NOT NULL COMMENT '配额值',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
    UNIQUE KEY uk_group_quota (group_code, quota_code)
) COMMENT='分组配额策略表';

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

CREATE TABLE IF NOT EXISTS audit_event_outbox (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    event_type VARCHAR(64) NOT NULL COMMENT '事件类型',
    payload_json JSON NOT NULL COMMENT '事件载荷JSON',
    status VARCHAR(32) NOT NULL DEFAULT 'NEW' COMMENT '事件状态',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    processed_at DATETIME(3) NULL COMMENT '处理时间',
    INDEX idx_audit_outbox_status_created (status, created_at)
) COMMENT='审计事件Outbox表';
