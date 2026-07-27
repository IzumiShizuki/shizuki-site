-- AI 记忆作用域 + 小镇 RPGMaker 资产导入表（PostgreSQL 版）。
--
-- 背景：这两张表的建表脚本此前只存在于 ai-module 自己的
-- db/migration/V5__ai_memory_scope_and_town_assets.sql（MySQL 语法），
-- 合并进 monolith 迁移链（migration/ V4xx 与 migration-pg/ V10xx）时被遗漏，
-- 导致 PG 运行时自宅 companion / 小镇 NPC 的记忆 scope 接口报：
--   ERROR: relation "ai_memory_scope" does not exist
--
-- 本迁移与 V1005 的建表风格保持一致（BIGSERIAL / TIMESTAMP / INTEGER 标记位），
-- JSON 载荷按既有 PG 基线约定使用 TEXT 存储（实体层以字符串读写，见
-- AiTownAssetImportEntity），并保证幂等：已手工补过表的环境可安全重跑。

CREATE TABLE IF NOT EXISTS AI_MEMORY_SCOPE (
    id BIGSERIAL PRIMARY KEY,
    scope_id VARCHAR(160) NOT NULL,
    owner_user_id BIGINT NOT NULL,
    domain_type VARCHAR(32) NOT NULL,
    actor_code VARCHAR(64) NOT NULL,
    scene_code VARCHAR(64) NOT NULL,
    enabled_flag INTEGER NOT NULL DEFAULT 1,
    note_text VARCHAR(500),
    last_query_text VARCHAR(240),
    last_access_time TIMESTAMP,
    create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    deleted_flag INTEGER NOT NULL DEFAULT 0,
    version_num INTEGER NOT NULL DEFAULT 0,
    CONSTRAINT AK_AI_MEMORY_SCOPE_1 UNIQUE (scope_id)
);

COMMENT ON TABLE AI_MEMORY_SCOPE IS 'AI管理员记忆作用域配置表';
COMMENT ON COLUMN AI_MEMORY_SCOPE.scope_id IS '记忆作用域ID（userId:mode:actor:scene）';
COMMENT ON COLUMN AI_MEMORY_SCOPE.domain_type IS '领域类型 town_npc/companion';
COMMENT ON COLUMN AI_MEMORY_SCOPE.enabled_flag IS '是否启用该作用域记忆';

CREATE INDEX IF NOT EXISTS IX_AI_MEMORY_SCOPE_1
    ON AI_MEMORY_SCOPE (owner_user_id, domain_type, actor_code, scene_code);
CREATE INDEX IF NOT EXISTS IX_AI_MEMORY_SCOPE_2
    ON AI_MEMORY_SCOPE (owner_user_id, enabled_flag, update_time);

CREATE TABLE IF NOT EXISTS AI_TOWN_ASSET_IMPORT (
    id BIGSERIAL PRIMARY KEY,
    asset_code VARCHAR(64) NOT NULL,
    owner_user_id BIGINT NOT NULL,
    source_name VARCHAR(255) NOT NULL,
    asset_type VARCHAR(32) NOT NULL,
    parser_status VARCHAR(32) NOT NULL,
    attached_scene_code VARCHAR(64),
    raw_size_bytes BIGINT NOT NULL DEFAULT 0,
    metadata_json TEXT NOT NULL,
    preview_json TEXT NOT NULL,
    create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    deleted_flag INTEGER NOT NULL DEFAULT 0,
    version_num INTEGER NOT NULL DEFAULT 0,
    CONSTRAINT AK_AI_TOWN_ASSET_IMPORT_1 UNIQUE (asset_code)
);

COMMENT ON TABLE AI_TOWN_ASSET_IMPORT IS 'AI小镇RPGMaker资产导入记录表';
COMMENT ON COLUMN AI_TOWN_ASSET_IMPORT.parser_status IS '解析状态';

CREATE INDEX IF NOT EXISTS IX_AI_TOWN_ASSET_IMPORT_1
    ON AI_TOWN_ASSET_IMPORT (owner_user_id, attached_scene_code, update_time);
CREATE INDEX IF NOT EXISTS IX_AI_TOWN_ASSET_IMPORT_2
    ON AI_TOWN_ASSET_IMPORT (owner_user_id, parser_status, update_time);
