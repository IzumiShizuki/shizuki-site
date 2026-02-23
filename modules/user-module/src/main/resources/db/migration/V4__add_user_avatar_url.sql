SET @avatar_url_exists := (
    SELECT COUNT(1)
    FROM information_schema.COLUMNS
    WHERE TABLE_SCHEMA = DATABASE()
      AND TABLE_NAME = 'USR_ACCOUNT'
      AND COLUMN_NAME = 'avatar_url_text'
);

SET @avatar_url_ddl := IF(
    @avatar_url_exists = 0,
    'ALTER TABLE USR_ACCOUNT ADD COLUMN avatar_url_text VARCHAR(512) NULL COMMENT ''USR_ACCOUNT.avatar_url_text avatar url''',
    'SELECT 1'
);

PREPARE avatar_url_stmt FROM @avatar_url_ddl;
EXECUTE avatar_url_stmt;
DEALLOCATE PREPARE avatar_url_stmt;
