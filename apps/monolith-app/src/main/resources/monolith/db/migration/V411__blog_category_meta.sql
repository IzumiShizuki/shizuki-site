CREATE TABLE IF NOT EXISTS CTN_POST_CATEGORY_META (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_POST_CATEGORY_META.id 自增长ID',
    category_code VARCHAR(64) NOT NULL COMMENT 'CTN_POST_CATEGORY_META.category_code 分类编码',
    display_name VARCHAR(128) NOT NULL COMMENT 'CTN_POST_CATEGORY_META.display_name 分类展示名',
    cover_image_url VARCHAR(512) NULL COMMENT 'CTN_POST_CATEGORY_META.cover_image_url 分类封面图URL',
    sort_num INT NOT NULL DEFAULT 1000 COMMENT 'CTN_POST_CATEGORY_META.sort_num 排序值，越小越靠前',
    enabled_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'CTN_POST_CATEGORY_META.enabled_flag 是否启用展示',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_POST_CATEGORY_META.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_POST_CATEGORY_META.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_POST_CATEGORY_META.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_POST_CATEGORY_META.version_num 版本号',
    CONSTRAINT PK_CTN_POST_CATEGORY_META PRIMARY KEY (id),
    CONSTRAINT AK_CTN_POST_CATEGORY_META_1 UNIQUE (category_code)
) COMMENT='帖子分类展示元数据表';

INSERT INTO CTN_POST_CATEGORY_META (
    category_code,
    display_name,
    cover_image_url,
    sort_num,
    enabled_flag,
    create_time,
    update_time,
    deleted_flag,
    version_num
)
SELECT
    LOWER(TRIM(category_code)) AS category_code,
    LOWER(TRIM(category_code)) AS display_name,
    NULL AS cover_image_url,
    1000 AS sort_num,
    1 AS enabled_flag,
    CURRENT_TIMESTAMP AS create_time,
    CURRENT_TIMESTAMP AS update_time,
    0 AS deleted_flag,
    0 AS version_num
FROM CTN_POST
WHERE deleted_flag = 0
  AND category_code IS NOT NULL
  AND TRIM(category_code) <> ''
GROUP BY LOWER(TRIM(category_code))
ON DUPLICATE KEY UPDATE update_time = CURRENT_TIMESTAMP;

INSERT INTO CTN_POST_CATEGORY_META (
    category_code,
    display_name,
    cover_image_url,
    sort_num,
    enabled_flag,
    create_time,
    update_time,
    deleted_flag,
    version_num
)
SELECT
    LOWER(TRIM(category_code)) AS category_code,
    LOWER(TRIM(category_code)) AS display_name,
    NULL AS cover_image_url,
    1000 AS sort_num,
    1 AS enabled_flag,
    CURRENT_TIMESTAMP AS create_time,
    CURRENT_TIMESTAMP AS update_time,
    0 AS deleted_flag,
    0 AS version_num
FROM CTN_POST_CATEGORY_POLICY
WHERE deleted_flag = 0
  AND category_code IS NOT NULL
  AND TRIM(category_code) <> ''
GROUP BY LOWER(TRIM(category_code))
ON DUPLICATE KEY UPDATE update_time = CURRENT_TIMESTAMP;
