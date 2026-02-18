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
