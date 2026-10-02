ALTER TABLE MDA_WALLPAPER_IMPORT_JOB
    ADD COLUMN downloaded_bytes BIGINT NOT NULL DEFAULT 0 AFTER progress_percent,
    ADD COLUMN total_bytes BIGINT NULL AFTER downloaded_bytes;
