CREATE TABLE IF NOT EXISTS AI_COMPANION_PROFILE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'AI_COMPANION_PROFILE.id 自增长ID',
    owner_user_id BIGINT NOT NULL COMMENT 'AI_COMPANION_PROFILE.owner_user_id 所属用户ID',
    companion_code VARCHAR(64) NOT NULL COMMENT 'AI_COMPANION_PROFILE.companion_code companion 业务编码',
    display_name VARCHAR(128) NOT NULL COMMENT 'AI_COMPANION_PROFILE.display_name companion 显示名',
    persona_json JSON NOT NULL COMMENT 'AI_COMPANION_PROFILE.persona_json companion 人格配置 JSON',
    avatar_asset_id BIGINT NULL COMMENT 'AI_COMPANION_PROFILE.avatar_asset_id 角色形象资源ID',
    memory_enabled_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'AI_COMPANION_PROFILE.memory_enabled_flag 是否启用记忆',
    bound_worldbook_json JSON NOT NULL COMMENT 'AI_COMPANION_PROFILE.bound_worldbook_json 绑定世界书ID列表JSON',
    scene_prompt_text TEXT NULL COMMENT 'AI_COMPANION_PROFILE.scene_prompt_text 自宅场景补充提示',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'AI_COMPANION_PROFILE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'AI_COMPANION_PROFILE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'AI_COMPANION_PROFILE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'AI_COMPANION_PROFILE.version_num 版本号',
    CONSTRAINT PK_AI_COMPANION_PROFILE PRIMARY KEY (id),
    CONSTRAINT AK_AI_COMPANION_PROFILE_1 UNIQUE (owner_user_id),
    KEY IX_AI_COMPANION_PROFILE_1 (companion_code, update_time)
) COMMENT='AI自宅 companion 配置表';
