-- database: shizuki_media
-- last_modified_at: 2026-02-09 23:09:32

-- modified_at: 2026-02-09 23:09:32
-- change: rebuild tables for empty database (drop + create) with v1.1 standard schema
CREATE DATABASE IF NOT EXISTS shizuki_media DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE shizuki_media;

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS MDA_REPORT;
DROP TABLE IF EXISTS MDA_ASSET;
DROP TABLE IF EXISTS AUD_EVENT_OUTBOX;
DROP TABLE IF EXISTS AUD_LOG;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE IF NOT EXISTS MDA_ASSET (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'MDA_ASSET.id 自增长ID',
    asset_num BIGINT NULL COMMENT 'MDA_ASSET.asset_num 资源业务编号',
    user_id BIGINT NOT NULL COMMENT 'MDA_ASSET.user_id 用户ID',
    bucket_code VARCHAR(128) NOT NULL COMMENT 'MDA_ASSET.bucket_code 存储桶编号',
    object_code VARCHAR(512) NOT NULL COMMENT 'MDA_ASSET.object_code 对象编号',
    asset_type VARCHAR(64) NOT NULL COMMENT 'MDA_ASSET.asset_type 资源类型',
    audit_status VARCHAR(32) NOT NULL DEFAULT 'PENDING_AUDIT' COMMENT 'MDA_ASSET.audit_status 审核状态',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'MDA_ASSET.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'MDA_ASSET.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_ASSET.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_ASSET.version_num 版本号',
    CONSTRAINT PK_MDA_ASSET PRIMARY KEY (id),
    CONSTRAINT AK_MDA_ASSET_1 UNIQUE (asset_num),
    KEY IX_MDA_ASSET_1 (user_id),
    KEY IX_MDA_ASSET_2 (audit_status)
) COMMENT='媒体资源表';

CREATE TABLE IF NOT EXISTS MDA_REPORT (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'MDA_REPORT.id 自增长ID',
    report_num BIGINT NULL COMMENT 'MDA_REPORT.report_num 举报业务编号',
    asset_id BIGINT NOT NULL COMMENT 'MDA_REPORT.asset_id 资源ID',
    report_status VARCHAR(32) NOT NULL DEFAULT 'CREATED' COMMENT 'MDA_REPORT.report_status 举报状态',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'MDA_REPORT.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'MDA_REPORT.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_REPORT.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_REPORT.version_num 版本号',
    CONSTRAINT PK_MDA_REPORT PRIMARY KEY (id),
    CONSTRAINT AK_MDA_REPORT_1 UNIQUE (report_num),
    KEY IX_MDA_REPORT_1 (asset_id),
    KEY IX_MDA_REPORT_2 (create_time),
    CONSTRAINT FK_MDA_REPORT_1 FOREIGN KEY (asset_id) REFERENCES MDA_ASSET(id)
) COMMENT='媒体举报表';

CREATE TABLE IF NOT EXISTS AUD_LOG (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'AUD_LOG.id 自增长ID',
    trace_code VARCHAR(64) NULL COMMENT 'AUD_LOG.trace_code 链路编号',
    user_id BIGINT NULL COMMENT 'AUD_LOG.user_id 用户ID',
    action_code VARCHAR(128) NOT NULL COMMENT 'AUD_LOG.action_code 动作编号',
    resource_code VARCHAR(128) NULL COMMENT 'AUD_LOG.resource_code 资源编号',
    result_status VARCHAR(32) NOT NULL COMMENT 'AUD_LOG.result_status 执行状态',
    error_code VARCHAR(64) NULL COMMENT 'AUD_LOG.error_code 错误编号',
    cost_value BIGINT NOT NULL COMMENT 'AUD_LOG.cost_value 耗时值',
    create_time DATETIME NOT NULL COMMENT 'AUD_LOG.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'AUD_LOG.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'AUD_LOG.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'AUD_LOG.version_num 版本号',
    CONSTRAINT PK_AUD_LOG PRIMARY KEY (id),
    KEY IX_AUD_LOG_1 (trace_code),
    KEY IX_AUD_LOG_2 (user_id),
    KEY IX_AUD_LOG_3 (action_code),
    KEY IX_AUD_LOG_4 (create_time)
) COMMENT='审计日志表';

CREATE TABLE IF NOT EXISTS AUD_EVENT_OUTBOX (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'AUD_EVENT_OUTBOX.id 自增长ID',
    event_type VARCHAR(64) NOT NULL COMMENT 'AUD_EVENT_OUTBOX.event_type 事件类型',
    payload_json JSON NOT NULL COMMENT 'AUD_EVENT_OUTBOX.payload_json 事件载荷JSON',
    event_status VARCHAR(32) NOT NULL DEFAULT 'NEW' COMMENT 'AUD_EVENT_OUTBOX.event_status 事件状态',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'AUD_EVENT_OUTBOX.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'AUD_EVENT_OUTBOX.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'AUD_EVENT_OUTBOX.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'AUD_EVENT_OUTBOX.version_num 版本号',
    processed_datetime DATETIME NULL COMMENT 'AUD_EVENT_OUTBOX.processed_datetime 处理时间',
    retry_count INT NOT NULL DEFAULT 0 COMMENT 'AUD_EVENT_OUTBOX.retry_count 重试次数',
    next_retry_datetime DATETIME NULL COMMENT 'AUD_EVENT_OUTBOX.next_retry_datetime 下次重试时间',
    last_error_memo VARCHAR(1024) NULL COMMENT 'AUD_EVENT_OUTBOX.last_error_memo 最近一次错误备注',
    CONSTRAINT PK_AUD_EVENT_OUTBOX PRIMARY KEY (id),
    KEY IX_AUD_EVENT_OUTBOX_1 (event_status, create_time),
    KEY IX_AUD_EVENT_OUTBOX_2 (event_status, next_retry_datetime, create_time)
) COMMENT='审计事件发件箱表';
