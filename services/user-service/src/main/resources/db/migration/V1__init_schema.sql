CREATE TABLE IF NOT EXISTS USR_ACCOUNT (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'USR_ACCOUNT.id 自增长ID',
    username_code VARCHAR(64) NOT NULL COMMENT 'USR_ACCOUNT.username_code 登录用户名编码',
    password_hash VARCHAR(255) NULL COMMENT 'USR_ACCOUNT.password_hash 密码哈希值',
    nickname_text VARCHAR(128) NOT NULL COMMENT 'USR_ACCOUNT.nickname_text 昵称描述',
    email_text VARCHAR(128) NULL COMMENT 'USR_ACCOUNT.email_text 邮箱描述',
    groups_json JSON NOT NULL COMMENT 'USR_ACCOUNT.groups_json 分组集合JSON',
    permissions_json JSON NOT NULL COMMENT 'USR_ACCOUNT.permissions_json 权限集合JSON',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'USR_ACCOUNT.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'USR_ACCOUNT.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'USR_ACCOUNT.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'USR_ACCOUNT.version_num 版本号',
    CONSTRAINT PK_USR_ACCOUNT PRIMARY KEY (id),
    CONSTRAINT AK_USR_ACCOUNT_1 UNIQUE (username_code),
    KEY IX_USR_ACCOUNT_1 (email_text)
) COMMENT='用户主数据表';

CREATE TABLE IF NOT EXISTS USR_PREFERENCE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'USR_PREFERENCE.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'USR_PREFERENCE.user_id 用户ID',
    preference_json JSON NOT NULL COMMENT 'USR_PREFERENCE.preference_json 偏好配置JSON',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'USR_PREFERENCE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'USR_PREFERENCE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'USR_PREFERENCE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'USR_PREFERENCE.version_num 版本号',
    CONSTRAINT PK_USR_PREFERENCE PRIMARY KEY (id),
    CONSTRAINT AK_USR_PREFERENCE_1 UNIQUE (user_id),
    KEY IX_USR_PREFERENCE_1 (create_time),
    CONSTRAINT FK_USR_PREFERENCE_1 FOREIGN KEY (user_id) REFERENCES USR_ACCOUNT(id)
) COMMENT='用户偏好表';

CREATE TABLE IF NOT EXISTS OAU_LOGIN (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'OAU_LOGIN.id 自增长ID',
    oauth_login_code VARCHAR(64) NOT NULL COMMENT 'OAU_LOGIN.oauth_login_code OAuth登录编号',
    provider_type VARCHAR(32) NOT NULL COMMENT 'OAU_LOGIN.provider_type 平台类型',
    redirect_uri_text VARCHAR(512) NOT NULL COMMENT 'OAU_LOGIN.redirect_uri_text 回调地址描述',
    state_code VARCHAR(128) NOT NULL COMMENT 'OAU_LOGIN.state_code 防重放状态码',
    login_status VARCHAR(32) NOT NULL COMMENT 'OAU_LOGIN.login_status 登录状态',
    provider_user_code VARCHAR(128) NULL COMMENT 'OAU_LOGIN.provider_user_code 第三方用户编号',
    user_id BIGINT NULL COMMENT 'OAU_LOGIN.user_id 用户ID',
    error_memo VARCHAR(512) NULL COMMENT 'OAU_LOGIN.error_memo 错误备注',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'OAU_LOGIN.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'OAU_LOGIN.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'OAU_LOGIN.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'OAU_LOGIN.version_num 版本号',
    CONSTRAINT PK_OAU_LOGIN PRIMARY KEY (id),
    CONSTRAINT AK_OAU_LOGIN_1 UNIQUE (oauth_login_code),
    KEY IX_OAU_LOGIN_1 (create_time),
    CONSTRAINT FK_OAU_LOGIN_1 FOREIGN KEY (user_id) REFERENCES USR_ACCOUNT(id)
) COMMENT='OAuth登录事务表';

CREATE TABLE IF NOT EXISTS OAU_BINDING (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'OAU_BINDING.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'OAU_BINDING.user_id 用户ID',
    provider_type VARCHAR(32) NOT NULL COMMENT 'OAU_BINDING.provider_type 平台类型',
    provider_user_code VARCHAR(128) NOT NULL COMMENT 'OAU_BINDING.provider_user_code 平台用户编号',
    provider_login_code VARCHAR(128) NULL COMMENT 'OAU_BINDING.provider_login_code 平台登录编号',
    provider_email_text VARCHAR(128) NULL COMMENT 'OAU_BINDING.provider_email_text 平台邮箱描述',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'OAU_BINDING.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'OAU_BINDING.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'OAU_BINDING.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'OAU_BINDING.version_num 版本号',
    CONSTRAINT PK_OAU_BINDING PRIMARY KEY (id),
    CONSTRAINT AK_OAU_BINDING_1 UNIQUE (provider_type, provider_user_code),
    KEY IX_OAU_BINDING_1 (user_id),
    CONSTRAINT FK_OAU_BINDING_1 FOREIGN KEY (user_id) REFERENCES USR_ACCOUNT(id)
) COMMENT='OAuth绑定关系表';

CREATE TABLE IF NOT EXISTS USR_QUOTA_POLICY (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'USR_QUOTA_POLICY.id 自增长ID',
    policy_code VARCHAR(64) NOT NULL COMMENT 'USR_QUOTA_POLICY.policy_code 策略编号',
    group_code VARCHAR(32) NOT NULL COMMENT 'USR_QUOTA_POLICY.group_code 分组编号',
    quota_code VARCHAR(64) NOT NULL COMMENT 'USR_QUOTA_POLICY.quota_code 配额编号',
    quota_value BIGINT NOT NULL COMMENT 'USR_QUOTA_POLICY.quota_value 配额值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'USR_QUOTA_POLICY.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'USR_QUOTA_POLICY.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'USR_QUOTA_POLICY.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'USR_QUOTA_POLICY.version_num 版本号',
    CONSTRAINT PK_USR_QUOTA_POLICY PRIMARY KEY (id),
    CONSTRAINT AK_USR_QUOTA_POLICY_1 UNIQUE (policy_code),
    CONSTRAINT AK_USR_QUOTA_POLICY_2 UNIQUE (group_code, quota_code),
    KEY IX_USR_QUOTA_POLICY_1 (group_code)
) COMMENT='分组配额策略表';

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
