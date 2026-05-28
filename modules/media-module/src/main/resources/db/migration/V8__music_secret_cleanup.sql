-- V8: Music aggregator secret cleanup + legacy vh_tunehub_* playlist mirror.
--
-- Dormant module-level path. This migration lives under the media-module
-- resources tree and is NOT loaded by the active monolith Flyway location
-- (apps/monolith-app/.../monolith/db/migration). It is reserved here as
-- the dormant baseline copy for a future microservice extraction so that
-- if the media-module is ever booted with its own Flyway scope, it will
-- carry the same cleanup semantics already applied by the monolith path.
--
-- Semantics MUST stay aligned with the dormant monolith MySQL counterpart
-- V427__music_provider_secret_cleanup.sql:
--   1) Physically delete legacy aggregator secrets ('tunehub' + 'meting')
--      from USR_PROVIDER_SECRET (R3.8 — divergent from earlier V424 which
--      preserved them via UPSERT-rename; cipher_text references the
--      removed TuneHub endpoints and is no longer usable).
--   2) Generate vh_meting_* mirror rows for legacy vh_tunehub_* playlist
--      codes in MDA_USER_MUSIC_PLAYLIST and MDA_USER_MUSIC_PLAYLIST_TRACK
--      using ON DUPLICATE KEY UPDATE update_time = update_time as a
--      no-op idempotent guard (R6.5).
--
-- USR_PREFERENCE rewrite is intentionally NOT included here: this dormant
-- module path does not own / does not see the user_module preference
-- table. The preference normalization happens in the monolith PG path
-- (V1003) and the read-side normalize helper inside MediaServiceImpl.
--
-- Idempotent: re-running produces no changes.
--   * DELETE WHERE provider_code IN (...) — second run matches 0 rows.
--   * INSERT ... SELECT ... ON DUPLICATE KEY UPDATE update_time = update_time
--     — second run leaves mirror rows untouched (NO-OP self-assignment).

------------------------------------------------------------
-- 1) USR_PROVIDER_SECRET: physical delete of aggregator secrets. R3.8.
------------------------------------------------------------
DELETE FROM USR_PROVIDER_SECRET
WHERE provider_code IN ('tunehub', 'meting');

------------------------------------------------------------
-- 2) MDA_USER_MUSIC_PLAYLIST: vh_meting_* mirror copies of legacy
--    vh_tunehub_* playlists. Original rows are preserved so that any
--    cached old-client request keyed by vh_tunehub_* still resolves
--    via the read-side legacy regex in MediaServiceImpl. R6.5.
--    Column list matches V4__add_user_music_playlist_tables.sql exactly
--    (auto-increment id is omitted so MySQL allocates a fresh id).
------------------------------------------------------------
INSERT INTO MDA_USER_MUSIC_PLAYLIST
    (playlist_code, user_id, playlist_type, name_text, description_text,
     cover_url, public_flag, system_reserved_flag, sort_num, metadata_json,
     create_time, update_time, deleted_flag, version_num)
SELECT
    REPLACE(playlist_code, 'vh_tunehub_', 'vh_meting_') AS playlist_code,
    user_id,
    playlist_type,
    name_text,
    description_text,
    cover_url,
    public_flag,
    system_reserved_flag,
    sort_num,
    metadata_json,
    create_time,
    update_time,
    deleted_flag,
    version_num
FROM MDA_USER_MUSIC_PLAYLIST
WHERE playlist_code LIKE 'vh_tunehub_%'
ON DUPLICATE KEY UPDATE
    update_time = MDA_USER_MUSIC_PLAYLIST.update_time;  -- NO-OP idempotency guard

------------------------------------------------------------
-- 3) MDA_USER_MUSIC_PLAYLIST_TRACK: vh_meting_* mirror copies of legacy
--    vh_tunehub_* playlist tracks. Same idempotency strategy as section 2.
--    Unique key is (playlist_code, provider_code, track_id).
------------------------------------------------------------
INSERT INTO MDA_USER_MUSIC_PLAYLIST_TRACK
    (playlist_code, provider_code, track_id, title_text, artist_text,
     cover_url, audio_url, lyric_url, sort_num, enabled_flag, metadata_json,
     create_time, update_time, deleted_flag, version_num)
SELECT
    REPLACE(playlist_code, 'vh_tunehub_', 'vh_meting_') AS playlist_code,
    provider_code,
    track_id,
    title_text,
    artist_text,
    cover_url,
    audio_url,
    lyric_url,
    sort_num,
    enabled_flag,
    metadata_json,
    create_time,
    update_time,
    deleted_flag,
    version_num
FROM MDA_USER_MUSIC_PLAYLIST_TRACK
WHERE playlist_code LIKE 'vh_tunehub_%'
ON DUPLICATE KEY UPDATE
    update_time = MDA_USER_MUSIC_PLAYLIST_TRACK.update_time;  -- NO-OP idempotency guard
