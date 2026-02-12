-- 认证体系升级迁移（V3）
-- 目标：
-- 1) 用户表新增邮箱验证标记；
-- 2) OAuth 登录事务新增场景与发起人；
-- 3) 增加按 provider + scene 的检索索引。

-- 为邮箱注册/绑定流程提供“已验证”状态位。
ALTER TABLE USR_ACCOUNT
    ADD COLUMN email_verified_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT '邮箱已验证标记' AFTER email_text;

-- 补充邮箱唯一约束：允许多个 NULL，但非空邮箱必须唯一。
ALTER TABLE USR_ACCOUNT
    ADD CONSTRAINT AK_USR_ACCOUNT_2 UNIQUE (email_text);

-- OAuth 登录事务增加场景字段（LOGIN/BIND）。
ALTER TABLE OAU_LOGIN
    ADD COLUMN login_scene VARCHAR(32) NOT NULL DEFAULT 'LOGIN' COMMENT '登录场景' AFTER login_status;

-- 记录发起绑定动作的用户主体（仅 BIND 场景有值）。
ALTER TABLE OAU_LOGIN
    ADD COLUMN initiator_user_id BIGINT NULL COMMENT '发起绑定的用户ID' AFTER user_id;

-- 优化 OAuth 场景查询性能（按 provider + scene + 时间）。
ALTER TABLE OAU_LOGIN
    ADD KEY IX_OAU_LOGIN_2 (provider_type, login_scene, create_time);
