CREATE TABLE IF NOT EXISTS CTN_LA_URL_LINK (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_LA_URL_LINK.id 自增长ID',
    user_id BIGINT NOT NULL COMMENT 'CTN_LA_URL_LINK.user_id 用户ID',
    title_text VARCHAR(160) NOT NULL COMMENT 'CTN_LA_URL_LINK.title_text 标题',
    url_text VARCHAR(2048) NOT NULL COMMENT 'CTN_LA_URL_LINK.url_text 网址',
    icon_mode_code VARCHAR(16) NOT NULL DEFAULT 'AUTO' COMMENT 'CTN_LA_URL_LINK.icon_mode_code 图标模式 AUTO/UPLOAD',
    icon_asset_id BIGINT NULL COMMENT 'CTN_LA_URL_LINK.icon_asset_id 上传图标资产ID',
    favicon_url VARCHAR(2048) NULL COMMENT 'CTN_LA_URL_LINK.favicon_url 图标URL',
    sort_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_URL_LINK.sort_num 排序值',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_LA_URL_LINK.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_LA_URL_LINK.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_LA_URL_LINK.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_LA_URL_LINK.version_num 版本号',
    CONSTRAINT PK_CTN_LA_URL_LINK PRIMARY KEY (id),
    KEY IX_CTN_LA_URL_LINK_1 (user_id, sort_num, update_time),
    KEY IX_CTN_LA_URL_LINK_2 (user_id, icon_mode_code)
) COMMENT='轻应用自定义网址表';
