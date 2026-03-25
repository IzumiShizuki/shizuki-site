ALTER TABLE AI_SESSION
    ADD COLUMN session_mode VARCHAR(32) NOT NULL DEFAULT 'quick_chat' COMMENT 'AI_SESSION.session_mode 会话模式 quick_chat/normal/tavern/town_npc/companion' AFTER title_text,
    ADD COLUMN character_id BIGINT NULL COMMENT 'AI_SESSION.character_id 绑定角色ID' AFTER session_mode,
    ADD COLUMN bound_worldbook_json JSON NULL COMMENT 'AI_SESSION.bound_worldbook_json 绑定世界书ID列表JSON' AFTER character_id,
    ADD COLUMN scene_prompt_text TEXT NULL COMMENT 'AI_SESSION.scene_prompt_text 场景设定文本' AFTER bound_worldbook_json,
    ADD COLUMN town_room_code VARCHAR(64) NULL COMMENT 'AI_SESSION.town_room_code 房间编码' AFTER scene_prompt_text,
    ADD COLUMN actor_code VARCHAR(64) NULL COMMENT 'AI_SESSION.actor_code 对象编码' AFTER town_room_code;

ALTER TABLE AI_SESSION
    ADD KEY IX_AI_SESSION_2 (user_id, session_mode, update_time);
