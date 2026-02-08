CREATE TABLE IF NOT EXISTS ai_session (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    session_id VARCHAR(64) NOT NULL UNIQUE COMMENT '会话业务ID',
    user_id BIGINT NOT NULL COMMENT '用户ID',
    title VARCHAR(255) NOT NULL COMMENT '会话标题',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
    INDEX idx_ai_session_user_id (user_id)
) COMMENT='AI会话表';

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

CREATE TABLE IF NOT EXISTS ai_character (
    id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '主键ID',
    user_id BIGINT NOT NULL COMMENT '用户ID',
    type_name VARCHAR(64) NOT NULL COMMENT '配置类型',
    payload_json JSON NOT NULL COMMENT '配置载荷JSON',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    INDEX idx_ai_character_user_id (user_id),
    INDEX idx_ai_character_type_name (type_name)
) COMMENT='AI角色配置表';

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
