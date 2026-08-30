-- Personal content foundation. Additive only: no fictional albums, moments, photos, weather, or quotes.

SET @audit_target_col_exists = (
    SELECT COUNT(1)
    FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'AUD_LOG'
      AND column_name = 'target_code'
);
SET @audit_target_ddl = IF(
    @audit_target_col_exists = 0,
    'ALTER TABLE AUD_LOG ADD COLUMN target_code VARCHAR(256) NULL COMMENT ''AUD_LOG.target_code stable audited target'' AFTER resource_code',
    'SELECT 1'
);
PREPARE audit_target_stmt FROM @audit_target_ddl;
EXECUTE audit_target_stmt;
DEALLOCATE PREPARE audit_target_stmt;

SET @audit_detail_col_exists = (
    SELECT COUNT(1)
    FROM information_schema.columns
    WHERE table_schema = DATABASE()
      AND table_name = 'AUD_LOG'
      AND column_name = 'detail_json'
);
SET @audit_detail_ddl = IF(
    @audit_detail_col_exists = 0,
    'ALTER TABLE AUD_LOG ADD COLUMN detail_json TEXT NULL COMMENT ''AUD_LOG.detail_json redacted audit details'' AFTER target_code',
    'SELECT 1'
);
PREPARE audit_detail_stmt FROM @audit_detail_ddl;
EXECUTE audit_detail_stmt;
DEALLOCATE PREPARE audit_detail_stmt;

CREATE TABLE IF NOT EXISTS CTN_PHOTO (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_PHOTO.id managed photo ID',
    original_asset_id BIGINT NOT NULL COMMENT 'Private original MDA_ASSET ID',
    title_text VARCHAR(256) NOT NULL DEFAULT '' COMMENT 'Administrator title',
    alt_text VARCHAR(512) NOT NULL DEFAULT '' COMMENT 'Visitor-facing alternative text',
    captured_at_draft DATETIME NULL COMMENT 'Administrator-only capture time draft',
    published_location_label VARCHAR(256) NULL COMMENT 'Explicitly reviewed public location label',
    processing_status VARCHAR(32) NOT NULL DEFAULT 'PENDING' COMMENT 'PENDING/PROCESSING/READY/FAILED',
    recycle_time DATETIME NULL COMMENT 'Recycle entry time',
    purge_after DATETIME NULL COMMENT 'Earliest permanent purge time',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'Permanent-purge tombstone only',
    version_num INT NOT NULL DEFAULT 0,
    CONSTRAINT PK_CTN_PHOTO PRIMARY KEY (id),
    CONSTRAINT AK_CTN_PHOTO_1 UNIQUE (original_asset_id),
    KEY IX_CTN_PHOTO_1 (processing_status, deleted_flag),
    KEY IX_CTN_PHOTO_2 (recycle_time, purge_after),
    CONSTRAINT FK_CTN_PHOTO_1 FOREIGN KEY (original_asset_id) REFERENCES MDA_ASSET(id)
) COMMENT='Managed personal photo';

CREATE TABLE IF NOT EXISTS CTN_ALBUM (
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT 'CTN_ALBUM.id album ID',
    public_slug VARCHAR(96) NOT NULL COMMENT 'High-entropy public identifier',
    title_text VARCHAR(256) NOT NULL COMMENT 'Album title',
    summary_text TEXT NULL COMMENT 'Album summary',
    cover_photo_id BIGINT NULL COMMENT 'Managed cover photo',
    lifecycle_status VARCHAR(32) NOT NULL DEFAULT 'DRAFT' COMMENT 'DRAFT/PUBLISHED/ARCHIVED/RECYCLED',
    visibility_status VARCHAR(32) NOT NULL DEFAULT 'PRIVATE' COMMENT 'PUBLIC/UNLISTED/PRIVATE',
    featured_flag TINYINT(1) NOT NULL DEFAULT 0,
    sort_num INT NOT NULL DEFAULT 0,
    publish_time DATETIME NULL,
    restore_lifecycle_status VARCHAR(32) NULL COMMENT 'Safe DRAFT/ARCHIVED restore target',
    recycle_time DATETIME NULL,
    purge_after DATETIME NULL,
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'Permanent-purge tombstone only',
    version_num INT NOT NULL DEFAULT 0,
    CONSTRAINT PK_CTN_ALBUM PRIMARY KEY (id),
    CONSTRAINT AK_CTN_ALBUM_1 UNIQUE (public_slug),
    KEY IX_CTN_ALBUM_1 (lifecycle_status, visibility_status, publish_time, id),
    KEY IX_CTN_ALBUM_2 (featured_flag, sort_num, publish_time),
    KEY IX_CTN_ALBUM_3 (recycle_time, purge_after),
    CONSTRAINT FK_CTN_ALBUM_1 FOREIGN KEY (cover_photo_id) REFERENCES CTN_PHOTO(id)
) COMMENT='Personal photo album';

CREATE TABLE IF NOT EXISTS CTN_ALBUM_PHOTO (
    id BIGINT NOT NULL AUTO_INCREMENT,
    album_id BIGINT NOT NULL,
    photo_id BIGINT NOT NULL,
    media_ref_id VARCHAR(96) NOT NULL COMMENT 'Opaque association-scoped media reference',
    sort_num INT NOT NULL DEFAULT 0,
    caption_text TEXT NULL,
    download_mode VARCHAR(32) NOT NULL DEFAULT 'NONE' COMMENT 'NONE/SANITIZED/ORIGINAL',
    delivery_revoked_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'Fail-closed public delivery gate',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0,
    version_num INT NOT NULL DEFAULT 0,
    CONSTRAINT PK_CTN_ALBUM_PHOTO PRIMARY KEY (id),
    CONSTRAINT AK_CTN_ALBUM_PHOTO_1 UNIQUE (album_id, photo_id),
    CONSTRAINT AK_CTN_ALBUM_PHOTO_2 UNIQUE (media_ref_id),
    KEY IX_CTN_ALBUM_PHOTO_1 (album_id, sort_num, id),
    KEY IX_CTN_ALBUM_PHOTO_2 (photo_id),
    CONSTRAINT FK_CTN_ALBUM_PHOTO_1 FOREIGN KEY (album_id) REFERENCES CTN_ALBUM(id),
    CONSTRAINT FK_CTN_ALBUM_PHOTO_2 FOREIGN KEY (photo_id) REFERENCES CTN_PHOTO(id)
) COMMENT='Ordered album-photo association';

CREATE TABLE IF NOT EXISTS CTN_MOMENT (
    id BIGINT NOT NULL AUTO_INCREMENT,
    public_id VARCHAR(96) NOT NULL COMMENT 'High-entropy public identifier',
    body_text TEXT NOT NULL,
    lifecycle_status VARCHAR(32) NOT NULL DEFAULT 'DRAFT',
    visibility_status VARCHAR(32) NOT NULL DEFAULT 'PRIVATE',
    featured_flag TINYINT(1) NOT NULL DEFAULT 0,
    pinned_flag TINYINT(1) NOT NULL DEFAULT 0,
    publish_time DATETIME NULL,
    restore_lifecycle_status VARCHAR(32) NULL COMMENT 'Safe DRAFT/ARCHIVED restore target',
    recycle_time DATETIME NULL,
    purge_after DATETIME NULL,
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'Permanent-purge tombstone only',
    version_num INT NOT NULL DEFAULT 0,
    CONSTRAINT PK_CTN_MOMENT PRIMARY KEY (id),
    CONSTRAINT AK_CTN_MOMENT_1 UNIQUE (public_id),
    KEY IX_CTN_MOMENT_1 (lifecycle_status, visibility_status, publish_time, id),
    KEY IX_CTN_MOMENT_2 (featured_flag, pinned_flag, publish_time),
    KEY IX_CTN_MOMENT_3 (recycle_time, purge_after)
) COMMENT='Short personal life moment';

CREATE TABLE IF NOT EXISTS CTN_MOMENT_PHOTO (
    id BIGINT NOT NULL AUTO_INCREMENT,
    moment_id BIGINT NOT NULL,
    photo_id BIGINT NOT NULL,
    media_ref_id VARCHAR(96) NOT NULL COMMENT 'Opaque association-scoped media reference',
    sort_num INT NOT NULL DEFAULT 0,
    delivery_revoked_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT 'Fail-closed public delivery gate',
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0,
    version_num INT NOT NULL DEFAULT 0,
    CONSTRAINT PK_CTN_MOMENT_PHOTO PRIMARY KEY (id),
    CONSTRAINT AK_CTN_MOMENT_PHOTO_1 UNIQUE (moment_id, photo_id),
    CONSTRAINT AK_CTN_MOMENT_PHOTO_2 UNIQUE (media_ref_id),
    KEY IX_CTN_MOMENT_PHOTO_1 (moment_id, sort_num, id),
    KEY IX_CTN_MOMENT_PHOTO_2 (photo_id),
    CONSTRAINT FK_CTN_MOMENT_PHOTO_1 FOREIGN KEY (moment_id) REFERENCES CTN_MOMENT(id),
    CONSTRAINT FK_CTN_MOMENT_PHOTO_2 FOREIGN KEY (photo_id) REFERENCES CTN_PHOTO(id)
) COMMENT='Ordered moment-photo association';

CREATE TABLE IF NOT EXISTS CTN_SITE_LOCATION (
    id BIGINT NOT NULL AUTO_INCREMENT,
    display_name VARCHAR(128) NOT NULL,
    latitude_value DECIMAL(9,6) NOT NULL,
    longitude_value DECIMAL(9,6) NOT NULL,
    timezone_code VARCHAR(64) NOT NULL,
    enabled_flag TINYINT(1) NOT NULL DEFAULT 1,
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0,
    version_num INT NOT NULL DEFAULT 0,
    CONSTRAINT PK_CTN_SITE_LOCATION PRIMARY KEY (id),
    KEY IX_CTN_SITE_LOCATION_1 (enabled_flag, deleted_flag)
) COMMENT='Administrator-maintained site weather location';

CREATE TABLE IF NOT EXISTS CTN_SITE_WIDGET_CONFIG (
    singleton_key VARCHAR(32) NOT NULL,
    active_location_id BIGINT NULL,
    weather_enabled_flag TINYINT(1) NOT NULL DEFAULT 0,
    weather_max_stale_minutes INT NOT NULL DEFAULT 360,
    quote_source_mode VARCHAR(32) NOT NULL DEFAULT 'LOCAL',
    hitokoto_enabled_flag TINYINT(1) NOT NULL DEFAULT 0,
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0,
    version_num INT NOT NULL DEFAULT 0,
    CONSTRAINT PK_CTN_SITE_WIDGET_CONFIG PRIMARY KEY (singleton_key),
    CONSTRAINT FK_CTN_SITE_WIDGET_CONFIG_1 FOREIGN KEY (active_location_id) REFERENCES CTN_SITE_LOCATION(id)
) COMMENT='Singleton site widget configuration; providers disabled by default';

CREATE TABLE IF NOT EXISTS CTN_QUOTE (
    id BIGINT NOT NULL AUTO_INCREMENT,
    quote_text TEXT NOT NULL,
    author_text VARCHAR(256) NULL,
    source_title VARCHAR(256) NULL,
    category_code VARCHAR(64) NULL,
    provider_code VARCHAR(32) NOT NULL DEFAULT 'LOCAL',
    provider_uuid VARCHAR(128) NULL,
    source_url VARCHAR(1024) NULL,
    approval_status VARCHAR(32) NOT NULL DEFAULT 'DRAFT',
    enabled_flag TINYINT(1) NOT NULL DEFAULT 0,
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0,
    version_num INT NOT NULL DEFAULT 0,
    CONSTRAINT PK_CTN_QUOTE PRIMARY KEY (id),
    CONSTRAINT AK_CTN_QUOTE_1 UNIQUE (provider_code, provider_uuid),
    KEY IX_CTN_QUOTE_1 (approval_status, enabled_flag, deleted_flag)
) COMMENT='Curated local quote library';

CREATE TABLE IF NOT EXISTS CTN_DAILY_QUOTE_SNAPSHOT (
    id BIGINT NOT NULL AUTO_INCREMENT,
    quote_date DATE NOT NULL,
    quote_id BIGINT NULL,
    quote_text TEXT NOT NULL,
    author_text VARCHAR(256) NULL,
    source_title VARCHAR(256) NULL,
    category_code VARCHAR(64) NULL,
    provider_code VARCHAR(32) NOT NULL,
    provider_uuid VARCHAR(128) NULL,
    source_url VARCHAR(1024) NULL,
    stale_flag TINYINT(1) NOT NULL DEFAULT 0,
    fetched_at DATETIME NOT NULL,
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0,
    version_num INT NOT NULL DEFAULT 0,
    CONSTRAINT PK_CTN_DAILY_QUOTE_SNAPSHOT PRIMARY KEY (id),
    CONSTRAINT AK_CTN_DAILY_QUOTE_SNAPSHOT_1 UNIQUE (quote_date),
    KEY IX_CTN_DAILY_QUOTE_SNAPSHOT_1 (fetched_at),
    CONSTRAINT FK_CTN_DAILY_QUOTE_SNAPSHOT_1 FOREIGN KEY (quote_id) REFERENCES CTN_QUOTE(id)
) COMMENT='Immutable canonical quote snapshot per site-local date';

CREATE TABLE IF NOT EXISTS CTN_WEATHER_SNAPSHOT (
    id BIGINT NOT NULL AUTO_INCREMENT,
    site_location_id BIGINT NOT NULL,
    provider_code VARCHAR(32) NOT NULL DEFAULT 'OPEN_METEO',
    payload_json JSON NOT NULL,
    observed_at DATETIME NOT NULL,
    fetched_at DATETIME NOT NULL,
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0,
    version_num INT NOT NULL DEFAULT 0,
    CONSTRAINT PK_CTN_WEATHER_SNAPSHOT PRIMARY KEY (id),
    KEY IX_CTN_WEATHER_SNAPSHOT_1 (site_location_id, fetched_at),
    CONSTRAINT FK_CTN_WEATHER_SNAPSHOT_1 FOREIGN KEY (site_location_id) REFERENCES CTN_SITE_LOCATION(id)
) COMMENT='Durable last-good snapshots for configured site locations only';

CREATE TABLE IF NOT EXISTS MDA_ASSET_VARIANT (
    id BIGINT NOT NULL AUTO_INCREMENT,
    source_asset_id BIGINT NOT NULL,
    variant_asset_id BIGINT NULL,
    variant_code VARCHAR(32) NOT NULL,
    delivery_scope VARCHAR(32) NOT NULL,
    width_value INT NULL,
    height_value INT NULL,
    processor_version VARCHAR(64) NOT NULL,
    process_status VARCHAR(32) NOT NULL DEFAULT 'PENDING',
    retry_count INT NOT NULL DEFAULT 0,
    last_error VARCHAR(1024) NULL,
    create_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted_flag TINYINT(1) NOT NULL DEFAULT 0,
    version_num INT NOT NULL DEFAULT 0,
    CONSTRAINT PK_MDA_ASSET_VARIANT PRIMARY KEY (id),
    CONSTRAINT AK_MDA_ASSET_VARIANT_1 UNIQUE (source_asset_id, variant_code, delivery_scope, processor_version),
    CONSTRAINT AK_MDA_ASSET_VARIANT_2 UNIQUE (variant_asset_id),
    KEY IX_MDA_ASSET_VARIANT_1 (process_status, update_time),
    CONSTRAINT FK_MDA_ASSET_VARIANT_1 FOREIGN KEY (source_asset_id) REFERENCES MDA_ASSET(id),
    CONSTRAINT FK_MDA_ASSET_VARIANT_2 FOREIGN KEY (variant_asset_id) REFERENCES MDA_ASSET(id)
) COMMENT='Versioned privacy-safe media derivative';

INSERT INTO USR_GROUP_PERMISSION (group_code, permission_code)
VALUES
    ('ADMIN', 'life.content.manage'),
    ('ADMIN', 'site.widgets.manage'),
    ('ADMIN', 'media.derivative.manage')
ON DUPLICATE KEY UPDATE
    update_time = CURRENT_TIMESTAMP,
    deleted_flag = 0;
