-- database: shizuki_content
-- last_modified_at: 2026-02-09 23:09:32

-- modified_at: 2026-02-09 23:09:32
-- change: rebuild tables for empty database (drop + create) with v1.1 standard schema
CREATE DATABASE IF NOT EXISTS shizuki_content DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE shizuki_content;

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS CTN_REPORT;
DROP TABLE IF EXISTS CTN_APP;
DROP TABLE IF EXISTS CTN_POST;
DROP TABLE IF EXISTS AUD_EVENT_OUTBOX;
DROP TABLE IF EXISTS AUD_LOG;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE IF NOT EXISTS CTN_POST (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增长ID',
    post_num BIGINT NULL COMMENT '帖子业务编号',
    title_text VARCHAR(255) NOT NULL COMMENT '标题描述',
    summary_text VARCHAR(500) NOT NULL COMMENT '摘要描述',
    visibility_status VARCHAR(32) NOT NULL DEFAULT 'PUBLIC' COMMENT '可见状态',
    like_value BIGINT NOT NULL DEFAULT 0 COMMENT '点赞值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT '删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT '版本号',
    CONSTRAINT PK_CTN_POST PRIMARY KEY (id),
    CONSTRAINT AK_CTN_POST_1 UNIQUE (post_num),
    KEY IX_CTN_POST_1 (visibility_status)
) COMMENT='内容帖子表';

CREATE TABLE IF NOT EXISTS CTN_APP (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增长ID',
    app_num BIGINT NULL COMMENT '应用业务编号',
    name_text VARCHAR(255) NOT NULL COMMENT '名称描述',
    category_type VARCHAR(64) NOT NULL COMMENT '分类类型',
    pin_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT '置顶标记',
    like_value BIGINT NOT NULL DEFAULT 0 COMMENT '点赞值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT '删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT '版本号',
    CONSTRAINT PK_CTN_APP PRIMARY KEY (id),
    CONSTRAINT AK_CTN_APP_1 UNIQUE (app_num),
    KEY IX_CTN_APP_1 (category_type)
) COMMENT='内容应用表';

CREATE TABLE IF NOT EXISTS CTN_REPORT (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '自增长ID',
    report_num BIGINT NULL COMMENT '举报业务编号',
    target_type VARCHAR(64) NOT NULL COMMENT '目标类型',
    target_id BIGINT NOT NULL COMMENT '目标ID',
    reason_memo VARCHAR(255) NOT NULL COMMENT '举报备注',
    report_status VARCHAR(32) NOT NULL DEFAULT 'CREATED' COMMENT '举报状态',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT '删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT '版本号',
    CONSTRAINT PK_CTN_REPORT PRIMARY KEY (id),
    CONSTRAINT AK_CTN_REPORT_1 UNIQUE (report_num),
    KEY IX_CTN_REPORT_1 (target_type, target_id),
    KEY IX_CTN_REPORT_2 (create_time)
) COMMENT='内容举报表';

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
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT '删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT '版本号',
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
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT '删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT '版本号',
    processed_datetime DATETIME NULL COMMENT '处理时间',
    retry_count INT NOT NULL DEFAULT 0 COMMENT '重试次数',
    next_retry_datetime DATETIME NULL COMMENT '下次重试时间',
    last_error_memo VARCHAR(1024) NULL COMMENT '最近一次错误备注',
    CONSTRAINT PK_AUD_EVENT_OUTBOX PRIMARY KEY (id),
    KEY IX_AUD_EVENT_OUTBOX_1 (event_status, create_time),
    KEY IX_AUD_EVENT_OUTBOX_2 (event_status, next_retry_datetime, create_time)
) COMMENT='审计事件发件箱表';

INSERT INTO CTN_POST (id, post_num, title_text, summary_text, visibility_status)
VALUES
    (1, 1001, 'Shizuki v0.1', 'Project kickoff post', 'PUBLIC'),
    (2, 1002, 'Architecture Notes', 'Microservice baseline', 'PUBLIC')
ON DUPLICATE KEY UPDATE
    summary_text = VALUES(summary_text),
    update_time = CURRENT_TIMESTAMP;

INSERT INTO CTN_APP (id, app_num, name_text, category_type, pin_flag)
VALUES
    (1, 2001, 'Focus Timer', 'study', 1),
    (2, 2002, 'Ambient Mixer', 'tool', 1)
ON DUPLICATE KEY UPDATE
    category_type = VALUES(category_type),
    update_time = CURRENT_TIMESTAMP;
