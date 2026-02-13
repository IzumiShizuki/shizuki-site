CREATE TABLE IF NOT EXISTS CTN_POST (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_POST.id 自增长ID',
    post_num BIGINT NULL COMMENT 'CTN_POST.post_num 帖子业务编号',
    user_id BIGINT NOT NULL DEFAULT 1 COMMENT 'CTN_POST.user_id 作者用户ID',
    title_text VARCHAR(255) NOT NULL COMMENT 'CTN_POST.title_text 标题描述',
    summary_text VARCHAR(500) NOT NULL COMMENT 'CTN_POST.summary_text 摘要描述',
    visibility_status VARCHAR(32) NOT NULL DEFAULT 'PUBLIC' COMMENT 'CTN_POST.visibility_status 可见状态',
    like_value BIGINT NOT NULL DEFAULT 0 COMMENT 'CTN_POST.like_value 点赞值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_POST.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_POST.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_POST.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_POST.version_num 版本号',
    CONSTRAINT PK_CTN_POST PRIMARY KEY (id),
    CONSTRAINT AK_CTN_POST_1 UNIQUE (post_num),
    KEY IX_CTN_POST_1 (visibility_status),
    KEY IX_CTN_POST_2 (user_id)
) COMMENT='内容帖子表';

CREATE TABLE IF NOT EXISTS CTN_APP (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_APP.id 自增长ID',
    app_num BIGINT NULL COMMENT 'CTN_APP.app_num 应用业务编号',
    user_id BIGINT NOT NULL DEFAULT 1 COMMENT 'CTN_APP.user_id 作者用户ID',
    name_text VARCHAR(255) NOT NULL COMMENT 'CTN_APP.name_text 名称描述',
    category_type VARCHAR(64) NOT NULL COMMENT 'CTN_APP.category_type 分类类型',
    visibility_status VARCHAR(32) NOT NULL DEFAULT 'PUBLIC' COMMENT 'CTN_APP.visibility_status 可见状态',
    pin_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'CTN_APP.pin_flag 置顶标记',
    like_value BIGINT NOT NULL DEFAULT 0 COMMENT 'CTN_APP.like_value 点赞值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_APP.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_APP.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_APP.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_APP.version_num 版本号',
    CONSTRAINT PK_CTN_APP PRIMARY KEY (id),
    CONSTRAINT AK_CTN_APP_1 UNIQUE (app_num),
    KEY IX_CTN_APP_1 (category_type),
    KEY IX_CTN_APP_2 (visibility_status),
    KEY IX_CTN_APP_3 (user_id)
) COMMENT='内容应用表';

CREATE TABLE IF NOT EXISTS CTN_POST_GROUP_ACL (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_POST_GROUP_ACL.id 自增长ID',
    post_id BIGINT NOT NULL COMMENT 'CTN_POST_GROUP_ACL.post_id 帖子ID',
    group_code VARCHAR(32) NOT NULL COMMENT 'CTN_POST_GROUP_ACL.group_code 分组编码',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_POST_GROUP_ACL.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_POST_GROUP_ACL.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_POST_GROUP_ACL.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_POST_GROUP_ACL.version_num 版本号',
    CONSTRAINT PK_CTN_POST_GROUP_ACL PRIMARY KEY (id),
    CONSTRAINT AK_CTN_POST_GROUP_ACL_1 UNIQUE (post_id, group_code),
    KEY IX_CTN_POST_GROUP_ACL_1 (post_id),
    KEY IX_CTN_POST_GROUP_ACL_2 (group_code),
    CONSTRAINT FK_CTN_POST_GROUP_ACL_1 FOREIGN KEY (post_id) REFERENCES CTN_POST(id)
) COMMENT='帖子分组可见性表';

CREATE TABLE IF NOT EXISTS CTN_APP_GROUP_ACL (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_APP_GROUP_ACL.id 自增长ID',
    app_id BIGINT NOT NULL COMMENT 'CTN_APP_GROUP_ACL.app_id 应用ID',
    group_code VARCHAR(32) NOT NULL COMMENT 'CTN_APP_GROUP_ACL.group_code 分组编码',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_APP_GROUP_ACL.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_APP_GROUP_ACL.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_APP_GROUP_ACL.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_APP_GROUP_ACL.version_num 版本号',
    CONSTRAINT PK_CTN_APP_GROUP_ACL PRIMARY KEY (id),
    CONSTRAINT AK_CTN_APP_GROUP_ACL_1 UNIQUE (app_id, group_code),
    KEY IX_CTN_APP_GROUP_ACL_1 (app_id),
    KEY IX_CTN_APP_GROUP_ACL_2 (group_code),
    CONSTRAINT FK_CTN_APP_GROUP_ACL_1 FOREIGN KEY (app_id) REFERENCES CTN_APP(id)
) COMMENT='应用分组可见性表';

CREATE TABLE IF NOT EXISTS CTN_REPORT (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_REPORT.id 自增长ID',
    report_num BIGINT NULL COMMENT 'CTN_REPORT.report_num 举报业务编号',
    target_type VARCHAR(64) NOT NULL COMMENT 'CTN_REPORT.target_type 目标类型',
    target_id BIGINT NOT NULL COMMENT 'CTN_REPORT.target_id 目标ID',
    reason_memo VARCHAR(255) NOT NULL COMMENT 'CTN_REPORT.reason_memo 举报备注',
    report_status VARCHAR(32) NOT NULL DEFAULT 'CREATED' COMMENT 'CTN_REPORT.report_status 举报状态',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_REPORT.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_REPORT.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_REPORT.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_REPORT.version_num 版本号',
    CONSTRAINT PK_CTN_REPORT PRIMARY KEY (id),
    CONSTRAINT AK_CTN_REPORT_1 UNIQUE (report_num),
    KEY IX_CTN_REPORT_1 (target_type, target_id),
    KEY IX_CTN_REPORT_2 (create_time)
) COMMENT='内容举报表';

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
