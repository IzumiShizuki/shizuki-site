-- PostgreSQL runtime compatibility patch for migrated schemas.
-- This migration is intentionally idempotent and safe on partially migrated environments.

DO $$
BEGIN
    IF EXISTS (
        SELECT 1
        FROM information_schema.tables
        WHERE table_schema = 'public'
          AND table_name = 'usr_account'
    ) THEN
        IF EXISTS (
            SELECT 1
            FROM information_schema.columns
            WHERE table_schema = 'public'
              AND table_name = 'usr_account'
              AND column_name = 'groups_json'
              AND data_type <> 'jsonb'
        ) THEN
            EXECUTE 'ALTER TABLE USR_ACCOUNT ALTER COLUMN groups_json TYPE jsonb USING groups_json::jsonb';
        END IF;

        IF EXISTS (
            SELECT 1
            FROM information_schema.columns
            WHERE table_schema = 'public'
              AND table_name = 'usr_account'
              AND column_name = 'permissions_json'
              AND data_type <> 'jsonb'
        ) THEN
            EXECUTE 'ALTER TABLE USR_ACCOUNT ALTER COLUMN permissions_json TYPE jsonb USING permissions_json::jsonb';
        END IF;

        EXECUTE 'CREATE INDEX IF NOT EXISTS IX_USR_ACCOUNT_GROUPS_GIN ON USR_ACCOUNT USING GIN (groups_json)';
        EXECUTE 'CREATE INDEX IF NOT EXISTS IX_USR_ACCOUNT_GROUPS_GIN_ACTIVE ON USR_ACCOUNT USING GIN (groups_json) WHERE deleted_flag = 0';
    END IF;
END $$;
