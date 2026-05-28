-- media-service baseline seed
-- 初始化音乐 provider 配置与引导文案。

INSERT INTO MDA_MUSIC_PROVIDER_CONFIG (provider_code, enabled_flag, visible_flag, sort_num)
VALUES
    ('meting', 1, 1, 10),
    ('spotify', 1, 1, 20),
    ('asmr', 1, 0, 30)
ON DUPLICATE KEY UPDATE
    enabled_flag = VALUES(enabled_flag),
    visible_flag = VALUES(visible_flag),
    sort_num = VALUES(sort_num),
    update_time = CURRENT_TIMESTAMP;

INSERT INTO MDA_MUSIC_PROVIDER_GUIDE (provider_code, guide_title, guide_text, guide_link)
VALUES
    ('meting', 'Meting 系统服务说明', 'Meting 为系统内置服务，无需用户 API Key。Spotify 继续使用官方开发者凭证；网易云/QQ/酷狗账号能力请使用 Cookie 绑定助手。', 'https://github.com/injahow/meting-api'),
    ('spotify', 'Spotify 连接说明', '首版支持搜索与预览播放，完整播放能力后续补齐。', 'https://developer.spotify.com/')
ON DUPLICATE KEY UPDATE
    guide_title = VALUES(guide_title),
    guide_text = VALUES(guide_text),
    guide_link = VALUES(guide_link),
    update_time = CURRENT_TIMESTAMP;
