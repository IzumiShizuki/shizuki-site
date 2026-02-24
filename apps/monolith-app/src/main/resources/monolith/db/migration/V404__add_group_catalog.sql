CREATE TABLE IF NOT EXISTS USR_GROUP (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'USR_GROUP.id 自增长ID',
    group_code VARCHAR(32) NOT NULL COMMENT 'USR_GROUP.group_code 分组编码',
    display_name VARCHAR(64) NOT NULL COMMENT 'USR_GROUP.display_name 分组展示名',
    description_text VARCHAR(255) NULL COMMENT 'USR_GROUP.description_text 分组描述',
    status_code VARCHAR(16) NOT NULL DEFAULT 'ACTIVE' COMMENT 'USR_GROUP.status_code 分组状态',
    built_in_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'USR_GROUP.built_in_flag 是否系统内置',
    sort_num INT NOT NULL DEFAULT 0 COMMENT 'USR_GROUP.sort_num 排序号',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'USR_GROUP.create_time 创建时间',
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'USR_GROUP.update_time 更新时间',
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'USR_GROUP.deleted_flag 删除标记',
    version_num INT NOT NULL DEFAULT 0 COMMENT 'USR_GROUP.version_num 版本号',
    CONSTRAINT PK_USR_GROUP PRIMARY KEY (id),
    CONSTRAINT AK_USR_GROUP_1 UNIQUE (group_code),
    KEY IX_USR_GROUP_1 (status_code, sort_num)
) COMMENT='分组目录主表';

INSERT INTO USR_GROUP (group_code, display_name, description_text, status_code, built_in_flag, sort_num)
VALUES
    ('GUEST', '游客', '系统游客默认分组', 'ACTIVE', 1, 10),
    ('USER', '用户', '系统登录用户默认分组', 'ACTIVE', 1, 20),
    ('FRIEND', '好友', '系统好友分组', 'ACTIVE', 1, 30),
    ('INTERVIEWER', '面试官', '系统面试官分组', 'ACTIVE', 1, 40),
    ('ADMIN', '管理员', '系统管理员分组', 'ACTIVE', 1, 50)
ON DUPLICATE KEY UPDATE
    display_name = VALUES(display_name),
    description_text = VALUES(description_text),
    status_code = 'ACTIVE',
    built_in_flag = VALUES(built_in_flag),
    update_time = CURRENT_TIMESTAMP;

INSERT IGNORE INTO USR_GROUP (group_code, display_name, description_text, status_code, built_in_flag, sort_num)
SELECT DISTINCT
    UPPER(TRIM(src.group_code)) AS group_code,
    UPPER(TRIM(src.group_code)) AS display_name,
    'Migrated from existing policies/acl' AS description_text,
    'ACTIVE' AS status_code,
    0 AS built_in_flag,
    900 AS sort_num
FROM (
    SELECT group_code FROM USR_GROUP_PERMISSION
    UNION ALL
    SELECT group_code FROM USR_QUOTA_POLICY
    UNION ALL
    SELECT group_code FROM CTN_POST_GROUP_ACL
    UNION ALL
    SELECT group_code FROM CTN_APP_GROUP_ACL
    UNION ALL
    SELECT group_code FROM MDA_ASSET_GROUP_ACL
) src
WHERE src.group_code IS NOT NULL
  AND TRIM(src.group_code) <> '';

INSERT IGNORE INTO USR_GROUP (group_code, display_name, description_text, status_code, built_in_flag, sort_num)
SELECT DISTINCT
    UPPER(TRIM(jt.group_code)) AS group_code,
    UPPER(TRIM(jt.group_code)) AS display_name,
    'Migrated from user groups_json' AS description_text,
    'ACTIVE' AS status_code,
    0 AS built_in_flag,
    900 AS sort_num
FROM USR_ACCOUNT ua
JOIN JSON_TABLE(
    ua.groups_json,
    '$[*]' COLUMNS (
        group_code VARCHAR(64) PATH '$'
    )
) jt
WHERE jt.group_code IS NOT NULL
  AND TRIM(jt.group_code) <> '';
