-- database: shizuki_app
-- last_modified_at: 2026-02-18 21:59:41

-- modified_at: 2026-02-18 21:59:41
-- change: merged schema/data baseline from module flyway scripts
CREATE DATABASE IF NOT EXISTS shizuki_app DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE shizuki_app;

-- ===== module=user file=V1__init_schema.sql =====

CREATE TABLE IF NOT EXISTS USR_ACCOUNT (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'USR_ACCOUNT.id 自增长ID',
    username_code VARCHAR(64) NOT NULL COMMENT 'USR_ACCOUNT.username_code 登录用户名编码',
    password_hash VARCHAR(255) NULL COMMENT 'USR_ACCOUNT.password_hash 密码哈希值',
    nickname_text VARCHAR(128) NOT NULL COMMENT 'USR_ACCOUNT.nickname_text 昵称描述',
    email_text VARCHAR(128) NULL COMMENT 'USR_ACCOUNT.email_text 邮箱描述',
    email_verified_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'USR_ACCOUNT.email_verified_flag 邮箱已验证标记',
    groups_json JSON NOT NULL COMMENT 'USR_ACCOUNT.groups_json 分组集合JSON',
    permissions_json JSON NOT NULL COMMENT 'USR_ACCOUNT.permissions_json 权限集合JSON',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'USR_ACCOUNT.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'USR_ACCOUNT.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'USR_ACCOUNT.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'USR_ACCOUNT.version_num 版本号',
    CONSTRAINT PK_USR_ACCOUNT PRIMARY KEY (id),
    CONSTRAINT AK_USR_ACCOUNT_1 UNIQUE (username_code),
    CONSTRAINT AK_USR_ACCOUNT_2 UNIQUE (email_text),
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
    login_scene VARCHAR(32) NOT NULL DEFAULT 'LOGIN' COMMENT 'OAU_LOGIN.login_scene 登录场景',
    provider_user_code VARCHAR(128) NULL COMMENT 'OAU_LOGIN.provider_user_code 第三方用户编号',
    user_id BIGINT NULL COMMENT 'OAU_LOGIN.user_id 用户ID',
    initiator_user_id BIGINT NULL COMMENT 'OAU_LOGIN.initiator_user_id 发起绑定的用户ID',
    error_memo VARCHAR(512) NULL COMMENT 'OAU_LOGIN.error_memo 错误备注',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'OAU_LOGIN.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'OAU_LOGIN.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'OAU_LOGIN.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'OAU_LOGIN.version_num 版本号',
    CONSTRAINT PK_OAU_LOGIN PRIMARY KEY (id),
    CONSTRAINT AK_OAU_LOGIN_1 UNIQUE (oauth_login_code),
    KEY IX_OAU_LOGIN_1 (create_time),
    KEY IX_OAU_LOGIN_2 (provider_type, login_scene, create_time),
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

CREATE TABLE IF NOT EXISTS USR_GROUP_PERMISSION (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'USR_GROUP_PERMISSION.id 自增长ID',
    group_code VARCHAR(32) NOT NULL COMMENT 'USR_GROUP_PERMISSION.group_code 分组编码',
    permission_code VARCHAR(128) NOT NULL COMMENT 'USR_GROUP_PERMISSION.permission_code 权限编码',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'USR_GROUP_PERMISSION.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'USR_GROUP_PERMISSION.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'USR_GROUP_PERMISSION.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'USR_GROUP_PERMISSION.version_num 版本号',
    CONSTRAINT PK_USR_GROUP_PERMISSION PRIMARY KEY (id),
    CONSTRAINT AK_USR_GROUP_PERMISSION_1 UNIQUE (group_code, permission_code),
    KEY IX_USR_GROUP_PERMISSION_1 (group_code)
) COMMENT='分组权限映射表';

CREATE TABLE IF NOT EXISTS USR_PROVIDER_SECRET (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'USR_PROVIDER_SECRET.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'USR_PROVIDER_SECRET.user_id 用户ID',
    provider_code VARCHAR(64) NOT NULL COMMENT 'USR_PROVIDER_SECRET.provider_code provider编码',
    cipher_text TEXT NOT NULL COMMENT 'USR_PROVIDER_SECRET.cipher_text API Key 密文',
    key_mask VARCHAR(64) NULL COMMENT 'USR_PROVIDER_SECRET.key_mask API Key 掩码',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'USR_PROVIDER_SECRET.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'USR_PROVIDER_SECRET.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'USR_PROVIDER_SECRET.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'USR_PROVIDER_SECRET.version_num 版本号',
    CONSTRAINT PK_USR_PROVIDER_SECRET PRIMARY KEY (id),
    CONSTRAINT AK_USR_PROVIDER_SECRET_1 UNIQUE (user_id, provider_code),
    KEY IX_USR_PROVIDER_SECRET_1 (provider_code),
    CONSTRAINT FK_USR_PROVIDER_SECRET_1 FOREIGN KEY (user_id) REFERENCES USR_ACCOUNT(id)
) COMMENT='用户音乐 Provider 密钥表';

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


-- ===== module=user file=V2__seed_data.sql =====

-- 基础种子数据（V2）
-- 1) 初始化 admin 账号；
-- 2) 初始化 USER/INTERVIEWER/ADMIN 三档 AI 配额策略。

-- 初始化系统管理员账号（密码为 BCrypt 哈希）。
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
    JSON_ARRAY()
)
ON DUPLICATE KEY UPDATE
    nickname_text = VALUES(nickname_text),
    email_text = VALUES(email_text),
    update_time = CURRENT_TIMESTAMP;

-- 初始化分组配额策略（用于内部配额解析接口）。
INSERT INTO USR_QUOTA_POLICY (policy_code, group_code, quota_code, quota_value)
VALUES
    ('user-ai-rounds-user', 'USER', 'ai_round_total', 5),
    ('user-ai-rounds-guest', 'GUEST', 'ai_round_total', 0),
    ('user-ai-rounds-friend', 'FRIEND', 'ai_round_total', 9223372036854775807),
    ('user-ai-rounds-interviewer', 'INTERVIEWER', 'ai_round_total', 9223372036854775807),
    ('user-ai-rounds-admin', 'ADMIN', 'ai_round_total', 9223372036854775807),
    ('user-music-pick-guest', 'GUEST', 'music_song_pick_total', 0),
    ('user-music-pick-user', 'USER', 'music_song_pick_total', 5),
    ('user-music-pick-friend', 'FRIEND', 'music_song_pick_total', 9223372036854775807),
    ('user-music-pick-interviewer', 'INTERVIEWER', 'music_song_pick_total', 9223372036854775807),
    ('user-music-pick-admin', 'ADMIN', 'music_song_pick_total', 9223372036854775807),
    ('user-music-upload-guest', 'GUEST', 'music_upload_bytes_total', 0),
    ('user-music-upload-user', 'USER', 'music_upload_bytes_total', 104857600),
    ('user-music-upload-friend', 'FRIEND', 'music_upload_bytes_total', 9223372036854775807),
    ('user-music-upload-interviewer', 'INTERVIEWER', 'music_upload_bytes_total', 9223372036854775807),
    ('user-music-upload-admin', 'ADMIN', 'music_upload_bytes_total', 9223372036854775807)
ON DUPLICATE KEY UPDATE
    quota_value = VALUES(quota_value),
    update_time = CURRENT_TIMESTAMP;

-- 初始化分组权限策略（用于 introspect 聚合权限）。
INSERT INTO USR_GROUP_PERMISSION (group_code, permission_code)
VALUES
    ('GUEST', 'basic.read'),
    ('USER', 'basic.read'),
    ('FRIEND', 'basic.read'),
    ('INTERVIEWER', 'basic.read'),
    ('ADMIN', 'quota.policy.read'),
    ('ADMIN', 'quota.policy.write'),
    ('ADMIN', 'user.group.read'),
    ('ADMIN', 'user.group.write'),
    ('ADMIN', 'group.permission.read'),
    ('ADMIN', 'group.permission.write'),
    ('ADMIN', 'music.asmr.access')
ON DUPLICATE KEY UPDATE
    update_time = CURRENT_TIMESTAMP;

-- 为管理员补充 FRIEND 分组，便于后台测试“朋友及以上”策略。
UPDATE USR_ACCOUNT
SET groups_json = JSON_ARRAY('ADMIN', 'USER', 'FRIEND')
WHERE id = 1;


-- ===== module=content file=V1__init_schema.sql =====

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


-- ===== module=content file=V2__seed_data.sql =====

INSERT INTO CTN_POST (id, post_num, user_id, title_text, summary_text, visibility_status)
VALUES
    (1, 1001, 1, 'Shizuki v0.1', 'Project kickoff post', 'PUBLIC'),
    (2, 1002, 1, 'Architecture Notes', 'Microservice baseline', 'PUBLIC')
ON DUPLICATE KEY UPDATE
    summary_text = VALUES(summary_text),
    update_time = CURRENT_TIMESTAMP;

INSERT INTO CTN_APP (id, app_num, user_id, name_text, category_type, visibility_status, pin_flag)
VALUES
    (1, 2001, 1, 'Focus Timer', 'study', 'PUBLIC', 1),
    (2, 2002, 1, 'Ambient Mixer', 'tool', 'PUBLIC', 1)
ON DUPLICATE KEY UPDATE
    category_type = VALUES(category_type),
    update_time = CURRENT_TIMESTAMP;


-- ===== module=media file=V1__init_schema.sql =====

CREATE TABLE IF NOT EXISTS MDA_ASSET (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'MDA_ASSET.id 自增长ID',
    asset_num BIGINT NULL COMMENT 'MDA_ASSET.asset_num 资源业务编号',
    user_id BIGINT NOT NULL COMMENT 'MDA_ASSET.user_id 用户ID',
    bucket_code VARCHAR(128) NOT NULL COMMENT 'MDA_ASSET.bucket_code 存储桶编号',
    object_code VARCHAR(512) NOT NULL COMMENT 'MDA_ASSET.object_code 对象编号',
    asset_type VARCHAR(64) NOT NULL COMMENT 'MDA_ASSET.asset_type 资源类型(兼容字段)',
    asset_kind_code TINYINT NOT NULL DEFAULT 1 COMMENT 'MDA_ASSET.asset_kind_code 资源类别编码：1静态图 2动态图 3L2D包 4音频',
    visibility_code TINYINT NOT NULL DEFAULT 1 COMMENT 'MDA_ASSET.visibility_code 可见性编码：1私有 2公开 3分组',
    home_enabled_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_ASSET.home_enabled_flag 是否加入首页公开角色池',
    home_sort_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_ASSET.home_sort_num 首页角色排序号',
    content_type_text VARCHAR(128) NOT NULL DEFAULT 'application/octet-stream' COMMENT 'MDA_ASSET.content_type_text 原始内容类型',
    object_hash VARCHAR(128) NULL COMMENT 'MDA_ASSET.object_hash 对象内容指纹(ETag归一化)',
    metadata_json JSON NULL COMMENT 'MDA_ASSET.metadata_json 扩展元数据',
    audit_status VARCHAR(32) NOT NULL DEFAULT 'PENDING_AUDIT' COMMENT 'MDA_ASSET.audit_status 审核状态',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'MDA_ASSET.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'MDA_ASSET.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_ASSET.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_ASSET.version_num 版本号',
    CONSTRAINT PK_MDA_ASSET PRIMARY KEY (id),
    CONSTRAINT AK_MDA_ASSET_1 UNIQUE (asset_num),
    CONSTRAINT AK_MDA_ASSET_2 UNIQUE (bucket_code, object_code),
    KEY IX_MDA_ASSET_1 (user_id),
    KEY IX_MDA_ASSET_2 (audit_status),
    KEY IX_MDA_ASSET_3 (visibility_code, audit_status, home_enabled_flag, home_sort_num),
    KEY IX_MDA_ASSET_4 (user_id, object_hash, deleted_flag)
) COMMENT='媒体资源表';

CREATE TABLE IF NOT EXISTS MDA_ASSET_GROUP_ACL (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'MDA_ASSET_GROUP_ACL.id 自增长ID',
    asset_id BIGINT NOT NULL COMMENT 'MDA_ASSET_GROUP_ACL.asset_id 资源ID',
    group_code VARCHAR(32) NOT NULL COMMENT 'MDA_ASSET_GROUP_ACL.group_code 分组编码',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'MDA_ASSET_GROUP_ACL.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'MDA_ASSET_GROUP_ACL.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_ASSET_GROUP_ACL.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_ASSET_GROUP_ACL.version_num 版本号',
    CONSTRAINT PK_MDA_ASSET_GROUP_ACL PRIMARY KEY (id),
    CONSTRAINT AK_MDA_ASSET_GROUP_ACL_1 UNIQUE (asset_id, group_code),
    KEY IX_MDA_ASSET_GROUP_ACL_1 (asset_id),
    KEY IX_MDA_ASSET_GROUP_ACL_2 (group_code),
    CONSTRAINT FK_MDA_ASSET_GROUP_ACL_1 FOREIGN KEY (asset_id) REFERENCES MDA_ASSET(id)
) COMMENT='媒体资源分组可见性表';

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

CREATE TABLE IF NOT EXISTS MDA_L2D_PACKAGE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'MDA_L2D_PACKAGE.id 自增长ID',
    asset_id BIGINT NOT NULL COMMENT 'MDA_L2D_PACKAGE.asset_id 资源ID',
    entry_model_json VARCHAR(512) NOT NULL COMMENT 'MDA_L2D_PACKAGE.entry_model_json model3.json 入口路径',
    moc_path VARCHAR(512) NOT NULL COMMENT 'MDA_L2D_PACKAGE.moc_path moc3 文件路径',
    texture_count INT NOT NULL COMMENT 'MDA_L2D_PACKAGE.texture_count 纹理数量',
    motion_group_count INT NOT NULL DEFAULT 0 COMMENT 'MDA_L2D_PACKAGE.motion_group_count 动作组数量',
    expression_count INT NOT NULL DEFAULT 0 COMMENT 'MDA_L2D_PACKAGE.expression_count 表情数量',
    has_physics_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_L2D_PACKAGE.has_physics_flag 是否包含 physics',
    has_pose_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_L2D_PACKAGE.has_pose_flag 是否包含 pose',
    references_json JSON NOT NULL COMMENT 'MDA_L2D_PACKAGE.references_json 引用文件清单',
    validation_code TINYINT NOT NULL COMMENT 'MDA_L2D_PACKAGE.validation_code 校验状态编码：1通过 2失败',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'MDA_L2D_PACKAGE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'MDA_L2D_PACKAGE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_L2D_PACKAGE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_L2D_PACKAGE.version_num 版本号',
    CONSTRAINT PK_MDA_L2D_PACKAGE PRIMARY KEY (id),
    CONSTRAINT AK_MDA_L2D_PACKAGE_1 UNIQUE (asset_id),
    KEY IX_MDA_L2D_PACKAGE_1 (create_time),
    CONSTRAINT FK_MDA_L2D_PACKAGE_1 FOREIGN KEY (asset_id) REFERENCES MDA_ASSET(id)
) COMMENT='L2D 包扩展信息表';

CREATE TABLE IF NOT EXISTS MDA_MUSIC_PLAYLIST (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'MDA_MUSIC_PLAYLIST.id 自增长ID',
    track_id VARCHAR(128) NOT NULL COMMENT 'MDA_MUSIC_PLAYLIST.track_id 曲目业务ID',
    provider_code VARCHAR(64) NOT NULL DEFAULT 'local' COMMENT 'MDA_MUSIC_PLAYLIST.provider_code provider编码',
    title_text VARCHAR(256) NOT NULL COMMENT 'MDA_MUSIC_PLAYLIST.title_text 曲目标题',
    artist_text VARCHAR(256) NULL COMMENT 'MDA_MUSIC_PLAYLIST.artist_text 艺术家',
    cover_url VARCHAR(1024) NULL COMMENT 'MDA_MUSIC_PLAYLIST.cover_url 封面URL',
    audio_url VARCHAR(1024) NOT NULL COMMENT 'MDA_MUSIC_PLAYLIST.audio_url 音频URL',
    lyric_url VARCHAR(1024) NULL COMMENT 'MDA_MUSIC_PLAYLIST.lyric_url 歌词URL',
    sort_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_PLAYLIST.sort_num 排序号',
    enabled_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'MDA_MUSIC_PLAYLIST.enabled_flag 是否启用',
    metadata_json JSON NULL COMMENT 'MDA_MUSIC_PLAYLIST.metadata_json 扩展字段',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'MDA_MUSIC_PLAYLIST.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'MDA_MUSIC_PLAYLIST.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_PLAYLIST.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_PLAYLIST.version_num 版本号',
    CONSTRAINT PK_MDA_MUSIC_PLAYLIST PRIMARY KEY (id),
    CONSTRAINT AK_MDA_MUSIC_PLAYLIST_1 UNIQUE (track_id),
    KEY IX_MDA_MUSIC_PLAYLIST_1 (enabled_flag, sort_num)
) COMMENT='默认音乐歌单表';

CREATE TABLE IF NOT EXISTS MDA_MUSIC_PICK_USAGE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'MDA_MUSIC_PICK_USAGE.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'MDA_MUSIC_PICK_USAGE.user_id 用户ID',
    quota_code VARCHAR(64) NOT NULL COMMENT 'MDA_MUSIC_PICK_USAGE.quota_code 配额编码',
    used_count BIGINT NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_PICK_USAGE.used_count 已用次数',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'MDA_MUSIC_PICK_USAGE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'MDA_MUSIC_PICK_USAGE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_PICK_USAGE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_PICK_USAGE.version_num 版本号',
    CONSTRAINT PK_MDA_MUSIC_PICK_USAGE PRIMARY KEY (id),
    CONSTRAINT AK_MDA_MUSIC_PICK_USAGE_1 UNIQUE (user_id, quota_code)
) COMMENT='音乐选歌累计用量表';

CREATE TABLE IF NOT EXISTS MDA_MUSIC_PROVIDER_CONFIG (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'MDA_MUSIC_PROVIDER_CONFIG.id 自增长ID',
    provider_code VARCHAR(64) NOT NULL COMMENT 'MDA_MUSIC_PROVIDER_CONFIG.provider_code provider编码',
    enabled_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'MDA_MUSIC_PROVIDER_CONFIG.enabled_flag 是否启用',
    visible_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'MDA_MUSIC_PROVIDER_CONFIG.visible_flag 前端是否可见',
    sort_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_PROVIDER_CONFIG.sort_num 排序号',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'MDA_MUSIC_PROVIDER_CONFIG.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'MDA_MUSIC_PROVIDER_CONFIG.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_PROVIDER_CONFIG.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_PROVIDER_CONFIG.version_num 版本号',
    CONSTRAINT PK_MDA_MUSIC_PROVIDER_CONFIG PRIMARY KEY (id),
    CONSTRAINT AK_MDA_MUSIC_PROVIDER_CONFIG_1 UNIQUE (provider_code)
) COMMENT='音乐 provider 配置表';

CREATE TABLE IF NOT EXISTS MDA_MUSIC_PROVIDER_GUIDE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'MDA_MUSIC_PROVIDER_GUIDE.id 自增长ID',
    provider_code VARCHAR(64) NOT NULL COMMENT 'MDA_MUSIC_PROVIDER_GUIDE.provider_code provider编码',
    guide_title VARCHAR(256) NULL COMMENT 'MDA_MUSIC_PROVIDER_GUIDE.guide_title 引导标题',
    guide_text TEXT NULL COMMENT 'MDA_MUSIC_PROVIDER_GUIDE.guide_text 引导正文',
    guide_link VARCHAR(1024) NULL COMMENT 'MDA_MUSIC_PROVIDER_GUIDE.guide_link 引导链接',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'MDA_MUSIC_PROVIDER_GUIDE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'MDA_MUSIC_PROVIDER_GUIDE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_PROVIDER_GUIDE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_PROVIDER_GUIDE.version_num 版本号',
    CONSTRAINT PK_MDA_MUSIC_PROVIDER_GUIDE PRIMARY KEY (id),
    CONSTRAINT AK_MDA_MUSIC_PROVIDER_GUIDE_1 UNIQUE (provider_code)
) COMMENT='音乐 provider key 引导文档表';

CREATE TABLE IF NOT EXISTS MDA_MUSIC_UPLOAD_USAGE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'MDA_MUSIC_UPLOAD_USAGE.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'MDA_MUSIC_UPLOAD_USAGE.user_id 用户ID',
    used_bytes BIGINT NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_UPLOAD_USAGE.used_bytes 已上传总字节',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'MDA_MUSIC_UPLOAD_USAGE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'MDA_MUSIC_UPLOAD_USAGE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_UPLOAD_USAGE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_UPLOAD_USAGE.version_num 版本号',
    CONSTRAINT PK_MDA_MUSIC_UPLOAD_USAGE PRIMARY KEY (id),
    CONSTRAINT AK_MDA_MUSIC_UPLOAD_USAGE_1 UNIQUE (user_id)
) COMMENT='音乐上传容量累计表';

CREATE TABLE IF NOT EXISTS MDA_MUSIC_TRACK_CACHE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'MDA_MUSIC_TRACK_CACHE.id 自增长ID',
    provider_code VARCHAR(64) NOT NULL COMMENT 'MDA_MUSIC_TRACK_CACHE.provider_code provider编码',
    track_id VARCHAR(128) NOT NULL COMMENT 'MDA_MUSIC_TRACK_CACHE.track_id 曲目ID',
    bucket_code VARCHAR(128) NOT NULL COMMENT 'MDA_MUSIC_TRACK_CACHE.bucket_code OSS桶',
    object_code VARCHAR(512) NOT NULL COMMENT 'MDA_MUSIC_TRACK_CACHE.object_code OSS对象key',
    public_url VARCHAR(1024) NOT NULL COMMENT 'MDA_MUSIC_TRACK_CACHE.public_url 公网播放URL',
    source_url VARCHAR(1024) NULL COMMENT 'MDA_MUSIC_TRACK_CACHE.source_url 源链接',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'MDA_MUSIC_TRACK_CACHE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'MDA_MUSIC_TRACK_CACHE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_TRACK_CACHE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_TRACK_CACHE.version_num 版本号',
    CONSTRAINT PK_MDA_MUSIC_TRACK_CACHE PRIMARY KEY (id),
    CONSTRAINT AK_MDA_MUSIC_TRACK_CACHE_1 UNIQUE (provider_code, track_id)
) COMMENT='音乐曲目OSS缓存索引表';

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


-- ===== module=media file=V2__seed_data.sql =====

-- media-service baseline seed
-- 初始化音乐 provider 配置与引导文案。

INSERT INTO MDA_MUSIC_PROVIDER_CONFIG (provider_code, enabled_flag, visible_flag, sort_num)
VALUES
    ('tunehub', 1, 1, 10),
    ('spotify', 1, 1, 20),
    ('asmr', 1, 0, 30)
ON DUPLICATE KEY UPDATE
    enabled_flag = VALUES(enabled_flag),
    visible_flag = VALUES(visible_flag),
    sort_num = VALUES(sort_num),
    update_time = CURRENT_TIMESTAMP;

INSERT INTO MDA_MUSIC_PROVIDER_GUIDE (provider_code, guide_title, guide_text, guide_link)
VALUES
    ('tunehub', 'TuneHub API Key 获取指南', '登录 TuneHub 控制台后在 Dashboard 生成 API Key。', 'https://tunehub.sayqz.com/dashboard'),
    ('spotify', 'Spotify 连接说明', '首版支持搜索与预览播放，完整播放能力后续补齐。', 'https://developer.spotify.com/')
ON DUPLICATE KEY UPDATE
    guide_title = VALUES(guide_title),
    guide_text = VALUES(guide_text),
    guide_link = VALUES(guide_link),
    update_time = CURRENT_TIMESTAMP;


-- ===== module=ai file=V1__init_schema.sql =====

CREATE TABLE IF NOT EXISTS AI_SESSION (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'AI_SESSION.id 自增长ID',
    session_code VARCHAR(64) NOT NULL COMMENT 'AI_SESSION.session_code 会话业务编号',
    user_id BIGINT NOT NULL COMMENT 'AI_SESSION.user_id 用户ID',
    title_text VARCHAR(255) NOT NULL COMMENT 'AI_SESSION.title_text 标题描述',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'AI_SESSION.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'AI_SESSION.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'AI_SESSION.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'AI_SESSION.version_num 版本号',
    CONSTRAINT PK_AI_SESSION PRIMARY KEY (id),
    CONSTRAINT AK_AI_SESSION_1 UNIQUE (session_code),
    KEY IX_AI_SESSION_1 (user_id)
) COMMENT='AI会话表';

CREATE TABLE IF NOT EXISTS AI_MESSAGE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'AI_MESSAGE.id 自增长ID',
    session_id BIGINT NOT NULL COMMENT 'AI_MESSAGE.session_id 会话ID',
    user_id BIGINT NOT NULL COMMENT 'AI_MESSAGE.user_id 用户ID',
    role_type VARCHAR(32) NOT NULL COMMENT 'AI_MESSAGE.role_type 角色类型',
    content_text TEXT NOT NULL COMMENT 'AI_MESSAGE.content_text 消息描述',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'AI_MESSAGE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'AI_MESSAGE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'AI_MESSAGE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'AI_MESSAGE.version_num 版本号',
    CONSTRAINT PK_AI_MESSAGE PRIMARY KEY (id),
    KEY IX_AI_MESSAGE_1 (session_id),
    KEY IX_AI_MESSAGE_2 (user_id),
    CONSTRAINT FK_AI_MESSAGE_1 FOREIGN KEY (session_id) REFERENCES AI_SESSION(id)
) COMMENT='AI消息表';

CREATE TABLE IF NOT EXISTS AI_QUOTA_USAGE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'AI_QUOTA_USAGE.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'AI_QUOTA_USAGE.user_id 用户ID',
    quota_code VARCHAR(64) NOT NULL COMMENT 'AI_QUOTA_USAGE.quota_code 配额编号',
    total_value BIGINT NOT NULL COMMENT 'AI_QUOTA_USAGE.total_value 总额度值',
    used_value BIGINT NOT NULL DEFAULT 0 COMMENT 'AI_QUOTA_USAGE.used_value 已用额度值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'AI_QUOTA_USAGE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'AI_QUOTA_USAGE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'AI_QUOTA_USAGE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'AI_QUOTA_USAGE.version_num 版本号',
    CONSTRAINT PK_AI_QUOTA_USAGE PRIMARY KEY (id),
    CONSTRAINT AK_AI_QUOTA_USAGE_1 UNIQUE (user_id, quota_code)
) COMMENT='AI配额使用表';

CREATE TABLE IF NOT EXISTS AI_CHARACTER (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'AI_CHARACTER.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'AI_CHARACTER.user_id 用户ID',
    character_type VARCHAR(64) NOT NULL COMMENT 'AI_CHARACTER.character_type 角色类型',
    payload_json JSON NOT NULL COMMENT 'AI_CHARACTER.payload_json 角色配置JSON',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'AI_CHARACTER.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'AI_CHARACTER.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'AI_CHARACTER.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'AI_CHARACTER.version_num 版本号',
    CONSTRAINT PK_AI_CHARACTER PRIMARY KEY (id),
    KEY IX_AI_CHARACTER_1 (user_id),
    KEY IX_AI_CHARACTER_2 (character_type)
) COMMENT='AI角色配置表';

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


-- ===== module=ai file=V2__seed_data.sql =====

-- ai-service baseline: no seed data required.
