CREATE TABLE IF NOT EXISTS MDA_MUSIC_PLAYLIST_PROFILE (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'MDA_MUSIC_PLAYLIST_PROFILE.id 自增长ID',
    playlist_code VARCHAR(64) NOT NULL COMMENT 'MDA_MUSIC_PLAYLIST_PROFILE.playlist_code 歌单业务编码',
    name_text VARCHAR(256) NOT NULL DEFAULT '' COMMENT 'MDA_MUSIC_PLAYLIST_PROFILE.name_text 歌单名称',
    description_text VARCHAR(1024) NULL COMMENT 'MDA_MUSIC_PLAYLIST_PROFILE.description_text 歌单简介',
    cover_url VARCHAR(1024) NULL COMMENT 'MDA_MUSIC_PLAYLIST_PROFILE.cover_url 歌单封面',
    metadata_json JSON NULL COMMENT 'MDA_MUSIC_PLAYLIST_PROFILE.metadata_json 扩展字段',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'MDA_MUSIC_PLAYLIST_PROFILE.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'MDA_MUSIC_PLAYLIST_PROFILE.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_PLAYLIST_PROFILE.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'MDA_MUSIC_PLAYLIST_PROFILE.version_num 版本号',
    CONSTRAINT PK_MDA_MUSIC_PLAYLIST_PROFILE PRIMARY KEY (id),
    CONSTRAINT AK_MDA_MUSIC_PLAYLIST_PROFILE_1 UNIQUE (playlist_code)
) COMMENT='默认歌单资料表';

INSERT INTO MDA_MUSIC_PLAYLIST_PROFILE (playlist_code, name_text, description_text, cover_url, metadata_json)
VALUES (
    'default_public',
    '默认歌单',
    '全站共通默认歌单',
    '',
    JSON_OBJECT()
)
ON DUPLICATE KEY UPDATE
    name_text = VALUES(name_text),
    description_text = VALUES(description_text),
    cover_url = VALUES(cover_url),
    update_time = CURRENT_TIMESTAMP;
