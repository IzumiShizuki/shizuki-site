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
