DO $$
BEGIN
    IF EXISTS (
        SELECT 1
        FROM information_schema.tables
        WHERE table_schema = 'public'
          AND table_name = 'ctn_post_presentation'
    ) THEN
        IF NOT EXISTS (
            SELECT 1
            FROM information_schema.columns
            WHERE table_schema = 'public'
              AND table_name = 'ctn_post_presentation'
              AND column_name = 'source_hash'
        ) THEN
            EXECUTE 'ALTER TABLE CTN_POST_PRESENTATION ADD COLUMN source_hash VARCHAR(128)';
        END IF;

        IF NOT EXISTS (
            SELECT 1
            FROM information_schema.columns
            WHERE table_schema = 'public'
              AND table_name = 'ctn_post_presentation'
              AND column_name = 'export_job_id'
        ) THEN
            EXECUTE 'ALTER TABLE CTN_POST_PRESENTATION ADD COLUMN export_job_id VARCHAR(128)';
        END IF;

        IF NOT EXISTS (
            SELECT 1
            FROM information_schema.columns
            WHERE table_schema = 'public'
              AND table_name = 'ctn_post_presentation'
              AND column_name = 'preview_job_id'
        ) THEN
            EXECUTE 'ALTER TABLE CTN_POST_PRESENTATION ADD COLUMN preview_job_id VARCHAR(128)';
        END IF;

        IF NOT EXISTS (
            SELECT 1
            FROM information_schema.columns
            WHERE table_schema = 'public'
              AND table_name = 'ctn_post_presentation'
              AND column_name = 'preview_url'
        ) THEN
            EXECUTE 'ALTER TABLE CTN_POST_PRESENTATION ADD COLUMN preview_url VARCHAR(2048)';
        END IF;

        IF NOT EXISTS (
            SELECT 1
            FROM information_schema.columns
            WHERE table_schema = 'public'
              AND table_name = 'ctn_post_presentation'
              AND column_name = 'preview_expire_time'
        ) THEN
            EXECUTE 'ALTER TABLE CTN_POST_PRESENTATION ADD COLUMN preview_expire_time TIMESTAMP';
        END IF;

        IF NOT EXISTS (
            SELECT 1
            FROM information_schema.columns
            WHERE table_schema = 'public'
              AND table_name = 'ctn_post_presentation'
              AND column_name = 'ppt_download_url'
        ) THEN
            EXECUTE 'ALTER TABLE CTN_POST_PRESENTATION ADD COLUMN ppt_download_url VARCHAR(2048)';
        END IF;

        IF NOT EXISTS (
            SELECT 1
            FROM information_schema.columns
            WHERE table_schema = 'public'
              AND table_name = 'ctn_post_presentation'
              AND column_name = 'ppt_download_expire_time'
        ) THEN
            EXECUTE 'ALTER TABLE CTN_POST_PRESENTATION ADD COLUMN ppt_download_expire_time TIMESTAMP';
        END IF;

        IF NOT EXISTS (
            SELECT 1
            FROM information_schema.columns
            WHERE table_schema = 'public'
              AND table_name = 'ctn_post_presentation'
              AND column_name = 'pdf_download_url'
        ) THEN
            EXECUTE 'ALTER TABLE CTN_POST_PRESENTATION ADD COLUMN pdf_download_url VARCHAR(2048)';
        END IF;

        IF NOT EXISTS (
            SELECT 1
            FROM information_schema.columns
            WHERE table_schema = 'public'
              AND table_name = 'ctn_post_presentation'
              AND column_name = 'pdf_download_expire_time'
        ) THEN
            EXECUTE 'ALTER TABLE CTN_POST_PRESENTATION ADD COLUMN pdf_download_expire_time TIMESTAMP';
        END IF;

        EXECUTE 'CREATE INDEX IF NOT EXISTS IX_CTN_POST_PRESENTATION_2 ON CTN_POST_PRESENTATION (source_hash)';
        EXECUTE 'CREATE INDEX IF NOT EXISTS IX_CTN_POST_PRESENTATION_3 ON CTN_POST_PRESENTATION (export_job_id)';
        EXECUTE 'CREATE INDEX IF NOT EXISTS IX_CTN_POST_PRESENTATION_4 ON CTN_POST_PRESENTATION (preview_job_id)';
    END IF;
END $$;
