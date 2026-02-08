CREATE TABLE IF NOT EXISTS post (
    post_id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '帖子ID',
    title VARCHAR(255) NOT NULL COMMENT '帖子标题',
    summary VARCHAR(500) NOT NULL COMMENT '帖子摘要',
    visibility VARCHAR(32) NOT NULL DEFAULT 'PUBLIC' COMMENT '可见性',
    like_count BIGINT NOT NULL DEFAULT 0 COMMENT '点赞数',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间'
) COMMENT='帖子表';

CREATE TABLE IF NOT EXISTS app (
    app_id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '应用ID',
    name VARCHAR(255) NOT NULL COMMENT '应用名称',
    category VARCHAR(64) NOT NULL COMMENT '应用分类',
    pin_able TINYINT(1) NOT NULL DEFAULT 1 COMMENT '是否可置顶',
    like_count BIGINT NOT NULL DEFAULT 0 COMMENT '点赞数',
    created_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    updated_at DATETIME(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间'
) COMMENT='应用表';

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
