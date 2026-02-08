ALTER TABLE audit_event_outbox
    ADD COLUMN IF NOT EXISTS retry_count INT NOT NULL DEFAULT 0 COMMENT '重试次数',
    ADD COLUMN IF NOT EXISTS next_retry_at DATETIME(3) NULL COMMENT '下次重试时间',
    ADD COLUMN IF NOT EXISTS last_error VARCHAR(1024) NULL COMMENT '最近一次错误信息';

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
