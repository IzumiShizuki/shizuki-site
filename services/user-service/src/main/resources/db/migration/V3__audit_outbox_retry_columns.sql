SET @retry_count_exists := (
    SELECT COUNT(1) FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'audit_event_outbox'
      AND column_name = 'retry_count'
);
SET @retry_count_sql := IF(
    @retry_count_exists = 0,
    'ALTER TABLE audit_event_outbox ADD COLUMN retry_count INT NOT NULL DEFAULT 0 COMMENT ''重试次数''',
    'SELECT 1'
);
PREPARE retry_count_stmt FROM @retry_count_sql;
EXECUTE retry_count_stmt;
DEALLOCATE PREPARE retry_count_stmt;

SET @next_retry_at_exists := (
    SELECT COUNT(1) FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'audit_event_outbox'
      AND column_name = 'next_retry_at'
);
SET @next_retry_at_sql := IF(
    @next_retry_at_exists = 0,
    'ALTER TABLE audit_event_outbox ADD COLUMN next_retry_at DATETIME(3) NULL COMMENT ''下次重试时间''',
    'SELECT 1'
);
PREPARE next_retry_at_stmt FROM @next_retry_at_sql;
EXECUTE next_retry_at_stmt;
DEALLOCATE PREPARE next_retry_at_stmt;

SET @last_error_exists := (
    SELECT COUNT(1) FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'audit_event_outbox'
      AND column_name = 'last_error'
);
SET @last_error_sql := IF(
    @last_error_exists = 0,
    'ALTER TABLE audit_event_outbox ADD COLUMN last_error VARCHAR(1024) NULL COMMENT ''最近一次错误信息''',
    'SELECT 1'
);
PREPARE last_error_stmt FROM @last_error_sql;
EXECUTE last_error_stmt;
DEALLOCATE PREPARE last_error_stmt;

SET @idx_exists := (
    SELECT COUNT(1) FROM information_schema.statistics
    WHERE table_schema = DATABASE()
      AND table_name = 'audit_event_outbox'
      AND index_name = 'idx_audit_outbox_retry'
);
SET @idx_sql := IF(
    @idx_exists = 0,
    'CREATE INDEX idx_audit_outbox_retry ON audit_event_outbox (status, next_retry_at, created_at)',
    'SELECT 1'
);
PREPARE idx_stmt FROM @idx_sql;
EXECUTE idx_stmt;
DEALLOCATE PREPARE idx_stmt;
