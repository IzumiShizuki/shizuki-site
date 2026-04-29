SET @col_exists = (
    SELECT COUNT(1)
    FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'CTN_POST'
      AND column_name = 'notion_page_id'
);
SET @ddl = IF(
    @col_exists = 0,
    'ALTER TABLE CTN_POST ADD COLUMN notion_page_id VARCHAR(64) NULL COMMENT ''CTN_POST.notion_page_id Notion 页面ID''',
    'SELECT 1'
);
PREPARE stmt FROM @ddl;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SET @col_exists = (
    SELECT COUNT(1)
    FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'CTN_POST'
      AND column_name = 'notion_data_source_id'
);
SET @ddl = IF(
    @col_exists = 0,
    'ALTER TABLE CTN_POST ADD COLUMN notion_data_source_id VARCHAR(64) NULL COMMENT ''CTN_POST.notion_data_source_id Notion 数据源ID''',
    'SELECT 1'
);
PREPARE stmt FROM @ddl;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SET @col_exists = (
    SELECT COUNT(1)
    FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'CTN_POST'
      AND column_name = 'notion_last_edited_time'
);
SET @ddl = IF(
    @col_exists = 0,
    'ALTER TABLE CTN_POST ADD COLUMN notion_last_edited_time DATETIME NULL COMMENT ''CTN_POST.notion_last_edited_time Notion 最近编辑时间''',
    'SELECT 1'
);
PREPARE stmt FROM @ddl;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SET @col_exists = (
    SELECT COUNT(1)
    FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'CTN_POST'
      AND column_name = 'sync_status_code'
);
SET @ddl = IF(
    @col_exists = 0,
    'ALTER TABLE CTN_POST ADD COLUMN sync_status_code VARCHAR(32) NOT NULL DEFAULT ''LOCAL_ONLY'' COMMENT ''CTN_POST.sync_status_code 同步状态''',
    'SELECT 1'
);
PREPARE stmt FROM @ddl;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SET @col_exists = (
    SELECT COUNT(1)
    FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'CTN_POST'
      AND column_name = 'sync_error_text'
);
SET @ddl = IF(
    @col_exists = 0,
    'ALTER TABLE CTN_POST ADD COLUMN sync_error_text TEXT NULL COMMENT ''CTN_POST.sync_error_text 同步错误信息''',
    'SELECT 1'
);
PREPARE stmt FROM @ddl;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SET @col_exists = (
    SELECT COUNT(1)
    FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'CTN_POST'
      AND column_name = 'last_remote_pull_time'
);
SET @ddl = IF(
    @col_exists = 0,
    'ALTER TABLE CTN_POST ADD COLUMN last_remote_pull_time DATETIME NULL COMMENT ''CTN_POST.last_remote_pull_time 最近远端拉取时间''',
    'SELECT 1'
);
PREPARE stmt FROM @ddl;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SET @col_exists = (
    SELECT COUNT(1)
    FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'CTN_POST'
      AND column_name = 'last_remote_push_time'
);
SET @ddl = IF(
    @col_exists = 0,
    'ALTER TABLE CTN_POST ADD COLUMN last_remote_push_time DATETIME NULL COMMENT ''CTN_POST.last_remote_push_time 最近远端推送时间''',
    'SELECT 1'
);
PREPARE stmt FROM @ddl;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SET @idx_exists = (
    SELECT COUNT(1)
    FROM information_schema.statistics
    WHERE table_schema = DATABASE()
      AND table_name = 'CTN_POST'
      AND index_name = 'AK_CTN_POST_3'
);
SET @ddl = IF(@idx_exists = 0, 'ALTER TABLE CTN_POST ADD UNIQUE INDEX AK_CTN_POST_3 (notion_page_id)', 'SELECT 1');
PREPARE stmt FROM @ddl;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SET @idx_exists = (
    SELECT COUNT(1)
    FROM information_schema.statistics
    WHERE table_schema = DATABASE()
      AND table_name = 'CTN_POST'
      AND index_name = 'IX_CTN_POST_6'
);
SET @ddl = IF(@idx_exists = 0, 'ALTER TABLE CTN_POST ADD INDEX IX_CTN_POST_6 (sync_status_code)', 'SELECT 1');
PREPARE stmt FROM @ddl;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SET @idx_exists = (
    SELECT COUNT(1)
    FROM information_schema.statistics
    WHERE table_schema = DATABASE()
      AND table_name = 'CTN_POST'
      AND index_name = 'IX_CTN_POST_7'
);
SET @ddl = IF(@idx_exists = 0, 'ALTER TABLE CTN_POST ADD INDEX IX_CTN_POST_7 (notion_last_edited_time)', 'SELECT 1');
PREPARE stmt FROM @ddl;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

CREATE TABLE IF NOT EXISTS CTN_POST_CONTENT (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_POST_CONTENT.id 自增长ID',
    post_id BIGINT NOT NULL COMMENT 'CTN_POST_CONTENT.post_id 帖子ID',
    content_mode VARCHAR(32) NOT NULL DEFAULT 'NOTION_BLOCKS' COMMENT 'CTN_POST_CONTENT.content_mode 正文模式',
    notion_blocks_json LONGTEXT NULL COMMENT 'CTN_POST_CONTENT.notion_blocks_json Notion block JSON',
    markdown_cache LONGTEXT NULL COMMENT 'CTN_POST_CONTENT.markdown_cache Markdown 缓存',
    content_hash VARCHAR(128) NULL COMMENT 'CTN_POST_CONTENT.content_hash 正文哈希',
    unsupported_block_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_POST_CONTENT.unsupported_block_flag 是否包含不可逆块',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_POST_CONTENT.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_POST_CONTENT.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_POST_CONTENT.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_POST_CONTENT.version_num 版本号',
    CONSTRAINT PK_CTN_POST_CONTENT PRIMARY KEY (id),
    CONSTRAINT AK_CTN_POST_CONTENT_1 UNIQUE (post_id),
    KEY IX_CTN_POST_CONTENT_1 (content_hash),
    CONSTRAINT FK_CTN_POST_CONTENT_1 FOREIGN KEY (post_id) REFERENCES CTN_POST(id)
) COMMENT='帖子正文缓存表';

CREATE TABLE IF NOT EXISTS CTN_NOTION_SYNC_CURSOR (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_NOTION_SYNC_CURSOR.id 自增长ID',
    sync_scope_code VARCHAR(64) NOT NULL COMMENT 'CTN_NOTION_SYNC_CURSOR.sync_scope_code 同步范围编码',
    data_source_id VARCHAR(64) NOT NULL COMMENT 'CTN_NOTION_SYNC_CURSOR.data_source_id 数据源ID',
    cursor_value VARCHAR(255) NULL COMMENT 'CTN_NOTION_SYNC_CURSOR.cursor_value 游标值',
    status_code VARCHAR(32) NOT NULL DEFAULT 'IDLE' COMMENT 'CTN_NOTION_SYNC_CURSOR.status_code 状态',
    error_text TEXT NULL COMMENT 'CTN_NOTION_SYNC_CURSOR.error_text 错误信息',
    last_synced_time DATETIME NULL COMMENT 'CTN_NOTION_SYNC_CURSOR.last_synced_time 最近同步时间',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_NOTION_SYNC_CURSOR.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_NOTION_SYNC_CURSOR.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_NOTION_SYNC_CURSOR.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_NOTION_SYNC_CURSOR.version_num 版本号',
    CONSTRAINT PK_CTN_NOTION_SYNC_CURSOR PRIMARY KEY (id),
    CONSTRAINT AK_CTN_NOTION_SYNC_CURSOR_1 UNIQUE (sync_scope_code)
) COMMENT='Notion 同步游标表';

CREATE TABLE IF NOT EXISTS CTN_NOTION_SYNC_JOB (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_NOTION_SYNC_JOB.id 自增长ID',
    trigger_type VARCHAR(32) NOT NULL COMMENT 'CTN_NOTION_SYNC_JOB.trigger_type 触发类型',
    direction_code VARCHAR(32) NOT NULL COMMENT 'CTN_NOTION_SYNC_JOB.direction_code 同步方向',
    target_type_code VARCHAR(32) NOT NULL COMMENT 'CTN_NOTION_SYNC_JOB.target_type_code 目标类型',
    post_id BIGINT NULL COMMENT 'CTN_NOTION_SYNC_JOB.post_id 帖子ID',
    owner_user_id BIGINT NOT NULL COMMENT 'CTN_NOTION_SYNC_JOB.owner_user_id 站长用户ID',
    status_code VARCHAR(32) NOT NULL DEFAULT 'PENDING' COMMENT 'CTN_NOTION_SYNC_JOB.status_code 任务状态',
    result_count INT NOT NULL DEFAULT 0 COMMENT 'CTN_NOTION_SYNC_JOB.result_count 成功数量',
    error_count INT NOT NULL DEFAULT 0 COMMENT 'CTN_NOTION_SYNC_JOB.error_count 错误数量',
    skipped_count INT NOT NULL DEFAULT 0 COMMENT 'CTN_NOTION_SYNC_JOB.skipped_count 跳过数量',
    conflict_count INT NOT NULL DEFAULT 0 COMMENT 'CTN_NOTION_SYNC_JOB.conflict_count 冲突数量',
    error_text TEXT NULL COMMENT 'CTN_NOTION_SYNC_JOB.error_text 错误信息',
    started_time DATETIME NULL COMMENT 'CTN_NOTION_SYNC_JOB.started_time 开始时间',
    finished_time DATETIME NULL COMMENT 'CTN_NOTION_SYNC_JOB.finished_time 完成时间',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'CTN_NOTION_SYNC_JOB.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'CTN_NOTION_SYNC_JOB.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'CTN_NOTION_SYNC_JOB.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'CTN_NOTION_SYNC_JOB.version_num 版本号',
    CONSTRAINT PK_CTN_NOTION_SYNC_JOB PRIMARY KEY (id),
    KEY IX_CTN_NOTION_SYNC_JOB_1 (status_code, create_time),
    KEY IX_CTN_NOTION_SYNC_JOB_2 (post_id, create_time),
    KEY IX_CTN_NOTION_SYNC_JOB_3 (owner_user_id, create_time)
) COMMENT='Notion 同步任务表';

INSERT INTO CTN_POST_CONTENT (
    post_id,
    content_mode,
    notion_blocks_json,
    markdown_cache,
    content_hash,
    unsupported_block_flag,
    create_time,
    update_time,
    deleted_flag,
    version_num
)
SELECT
    p.id AS post_id,
    'NOTION_BLOCKS' AS content_mode,
    NULL AS notion_blocks_json,
    NULL AS markdown_cache,
    NULL AS content_hash,
    0 AS unsupported_block_flag,
    CURRENT_TIMESTAMP AS create_time,
    CURRENT_TIMESTAMP AS update_time,
    0 AS deleted_flag,
    0 AS version_num
FROM CTN_POST p
LEFT JOIN CTN_POST_CONTENT c ON c.post_id = p.id AND c.deleted_flag = 0
WHERE p.deleted_flag = 0
  AND c.id IS NULL;

UPDATE CTN_POST
SET sync_status_code = COALESCE(NULLIF(sync_status_code, ''), 'LOCAL_ONLY')
WHERE deleted_flag = 0;
