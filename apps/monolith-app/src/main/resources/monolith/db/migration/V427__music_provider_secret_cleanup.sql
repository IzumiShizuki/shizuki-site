-- V427: Music aggregator secret cleanup + legacy vh_tunehub_* playlist mirror.
--
-- Dormant monolith MySQL path. This migration lives under
--   apps/monolith-app/src/main/resources/monolith/db/migration
-- and is loaded ONLY when the legacy `application-mysql.yml` profile is
-- active. The production runtime targets the PostgreSQL path
--   apps/monolith-app/src/main/resources/monolith/db/migration-pg
-- where the equivalent normalization happens in V1003.
--
-- Chain with V424:
--   V424 already performed:
--     * MDA_MUSIC_PROVIDER_CONFIG / MDA_MUSIC_PROVIDER_GUIDE UPSERT-rename
--       from 'tunehub' to 'meting'.
--     * USR_PROVIDER_SECRET UPSERT-rename ('tunehub' -> 'meting'), keeping
--       the old cipher_text under the new provider_code.
--     * USR_PREFERENCE JSON_REPLACE rewriting `music.source_mode` from
--       'tunehub_first' / 'tunehub_only' to 'meting_first' / 'meting_only'.
--
--   V427 補齐 (see Requirements R3.8 / R4.6 / R6.5):
--     1) PHYSICAL DELETE of legacy aggregator secrets ('tunehub' + 'meting')
--        from USR_PROVIDER_SECRET. This DIVERGES from V424's UPSERT-rename
--        because the cipher_text references the removed TuneHub HTTP
--        endpoints and is no longer usable post-removal — Meting sidecar
--        does not consume per-user API keys (R2.7).
--     2) Generate vh_meting_* mirror rows for legacy vh_tunehub_* playlist
--        codes in MDA_USER_MUSIC_PLAYLIST and MDA_USER_MUSIC_PLAYLIST_TRACK.
--        Original vh_tunehub_* rows are preserved so any cached old-client
--        request still resolves via the read-side legacy regex inside
--        MediaServiceImpl (R6.1).
--
-- Semantics MUST stay aligned with:
--   * Production PG path:        migration-pg/V1003__music_tunehub_to_meting.sql
--   * Module-level dormant path: modules/media-module/.../V8__music_secret_cleanup.sql
--
-- USR_PREFERENCE rewrite is intentionally NOT repeated here: V424 already
-- performed it via JSON_REPLACE on the same MySQL profile.
--
-- Idempotent: re-running produces no changes.
--   * DELETE WHERE provider_code IN (...) — second run matches 0 rows.
--   * INSERT ... SELECT ... ON DUPLICATE KEY UPDATE update_time = update_time
--     — second run leaves mirror rows untouched (NO-OP self-assignment).

------------------------------------------------------------
-- 1) USR_PROVIDER_SECRET: physical delete of aggregator secrets. R3.8.
--    Removes both the legacy 'tunehub' rows (in case any survived V424's
--    rename — defensive) and the V424-renamed 'meting' rows whose
--    cipher_text references the dismantled TuneHub endpoints.
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
