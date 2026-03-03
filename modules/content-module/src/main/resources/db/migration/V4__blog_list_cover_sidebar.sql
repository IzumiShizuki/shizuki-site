SET @col_exists = (
    SELECT COUNT(1)
    FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'CTN_POST'
      AND column_name = 'cover_image_url'
);
SET @ddl = IF(@col_exists = 0, 'ALTER TABLE CTN_POST ADD COLUMN cover_image_url VARCHAR(512) NULL', 'SELECT 1');
PREPARE stmt FROM @ddl;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;
