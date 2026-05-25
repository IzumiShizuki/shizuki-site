-- Migrate TuneHub music provider metadata to Meting sidecar naming.

INSERT INTO MDA_MUSIC_PROVIDER_CONFIG (provider_code, enabled_flag, visible_flag, sort_num)
SELECT
    'meting' AS provider_code,
    enabled_flag,
    visible_flag,
    sort_num
FROM MDA_MUSIC_PROVIDER_CONFIG
WHERE provider_code = 'tunehub'
ON DUPLICATE KEY UPDATE
    enabled_flag = VALUES(enabled_flag),
    visible_flag = VALUES(visible_flag),
    sort_num = VALUES(sort_num),
    update_time = CURRENT_TIMESTAMP;

DELETE FROM MDA_MUSIC_PROVIDER_CONFIG
WHERE provider_code = 'tunehub';

INSERT INTO MDA_MUSIC_PROVIDER_GUIDE (provider_code, guide_title, guide_text, guide_link)
SELECT
    'meting' AS provider_code,
    'Meting 系统服务说明' AS guide_title,
    'Meting 为系统内置服务，无需用户 API Key。Spotify 继续使用官方开发者凭证；网易云/QQ/酷狗账号能力请使用 Cookie 绑定助手。' AS guide_text,
    'https://github.com/injahow/meting-api' AS guide_link
FROM DUAL
ON DUPLICATE KEY UPDATE
    guide_title = VALUES(guide_title),
    guide_text = VALUES(guide_text),
    guide_link = VALUES(guide_link),
    update_time = CURRENT_TIMESTAMP;

DELETE FROM MDA_MUSIC_PROVIDER_GUIDE
WHERE provider_code = 'tunehub';

-- Keep legacy provider secret records but rename provider code for consistency.
INSERT INTO USR_PROVIDER_SECRET (user_id, provider_code, cipher_text, key_mask, create_time, update_time, deleted_flag, version_num)
SELECT
    user_id,
    'meting' AS provider_code,
    cipher_text,
    key_mask,
    create_time,
    update_time,
    deleted_flag,
    version_num
FROM USR_PROVIDER_SECRET
WHERE provider_code = 'tunehub'
ON DUPLICATE KEY UPDATE
    cipher_text = VALUES(cipher_text),
    key_mask = VALUES(key_mask),
    deleted_flag = VALUES(deleted_flag),
    version_num = VALUES(version_num),
    update_time = CURRENT_TIMESTAMP;

DELETE FROM USR_PROVIDER_SECRET
WHERE provider_code = 'tunehub';

-- Normalize legacy music source mode values in user preference JSON.
UPDATE USR_PREFERENCE
SET preference_json = JSON_REPLACE(
    JSON_REPLACE(preference_json, '$.music.source_mode', 'meting_first'),
    '$."music.source_mode"',
    'meting_first'
)
WHERE JSON_UNQUOTE(JSON_EXTRACT(preference_json, '$.music.source_mode')) = 'tunehub_first'
   OR JSON_UNQUOTE(JSON_EXTRACT(preference_json, '$."music.source_mode"')) = 'tunehub_first';

UPDATE USR_PREFERENCE
SET preference_json = JSON_REPLACE(
    JSON_REPLACE(preference_json, '$.music.source_mode', 'meting_only'),
    '$."music.source_mode"',
    'meting_only'
)
WHERE JSON_UNQUOTE(JSON_EXTRACT(preference_json, '$.music.source_mode')) = 'tunehub_only'
   OR JSON_UNQUOTE(JSON_EXTRACT(preference_json, '$."music.source_mode"')) = 'tunehub_only';
