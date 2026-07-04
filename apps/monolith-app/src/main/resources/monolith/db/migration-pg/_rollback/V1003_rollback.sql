-- =====================================================================
-- V1003 Manual Rollback (NOT executed by Flyway)
-- =====================================================================
--
-- This file is NOT a Flyway migration. It will not be executed
-- automatically. Operators may run it manually if V1003 needs to be
-- reverted in production.
--
-- Why this lives outside the active Flyway path:
--   * Directory has a leading underscore (`_rollback/`) per project
--     convention to keep it out of the operational migration tree.
--   * `spring.flyway.locations` only includes
--     `classpath:monolith/db/migration-pg`, and even though Flyway
--     recurses, the file name is `V1003_rollback.sql` (single underscore
--     between version and description), which does NOT match Flyway's
--     required `V<version>__<description>.sql` (double underscore)
--     naming pattern. Flyway will therefore skip this file by name.
--   * The combination above is intentional belt-and-braces: the script
--     is recoverable archive material, not a deployment artefact.
--
-- Change set : TuneHub removal and Meting migration
-- Design ref : section 6.2
-- Reverses   : V1003__music_tunehub_to_meting.sql (steps 1, 2, 4)
--
-- =====================================================================
-- WARNINGS (READ BEFORE RUNNING)
-- =====================================================================
--
-- WARNING 1 -- USR_PROVIDER_SECRET rows are NOT RECOVERABLE.
--   V1003 step 3 PHYSICALLY DELETED every `provider_code IN
--   ('tunehub','meting')` row from USR_PROVIDER_SECRET. The deletions
--   are irreversible: cipher_text values referenced TuneHub API
--   endpoints that no longer exist post-removal and held no surviving
--   business value. This rollback script CANNOT and DOES NOT attempt
--   to recreate those rows. If user-bound aggregator credentials are
--   needed again, users must re-bind from the front-end after the
--   feature is restored in code.
--
-- WARNING 2 -- vh_meting_* mirror playlist rows are PRESERVED.
--   V1003 step 5 inserted vh_meting_* sibling rows into
--   MDA_USER_MUSIC_PLAYLIST and MDA_USER_MUSIC_PLAYLIST_TRACK alongside
--   the original vh_tunehub_* rows (which were never removed). After
--   running this rollback the mirror rows remain in place. They are
--   harmless because the legacy vh_tunehub_* originals coexist and
--   the post-rollback Java code can resolve either prefix. This script
--   intentionally does NOT delete the vh_meting_* rows -- doing so
--   would be unnecessary and risks losing user-curated metadata that
--   may have diverged from the originals after the cutover.
--
-- WARNING 3 -- Operator pre-flight checks (REQUIRED before running).
--   Before executing this script in any environment:
--     1. STOP the application (no live writes to USR_PREFERENCE while
--        jsonb_set rewrites the music.source_mode key).
--     2. BACK UP the database (logical pg_dump or PITR snapshot). The
--        UPDATE statements rewrite preference_json in place and are
--        not transactionally reversible without a backup.
--     3. VALIDATE first on a staging clone with production-like data
--        and confirm row counts match expectations before running on
--        production.
--   Skipping any of the three above turns this rollback into a
--   second incident.
--
-- WARNING 4 -- This script ONLY rolls back DB state.
--   Java sources, frontend sources and configuration must be reverted
--   separately (e.g. `git revert <commit>` and redeploy). Running this
--   SQL against a database while the post-removal application code is
--   still deployed will leave the system in an inconsistent state
--   (the app will not understand the restored 'tunehub' provider_code).
--
-- =====================================================================
-- ROLLBACK SQL
-- =====================================================================


-- ---------------------------------------------------------------------
-- Rollback 1: MDA_MUSIC_PROVIDER_CONFIG
--   Re-create the 'tunehub' provider_config row by reverse-UPSERTing
--   from the operational fields of the surviving 'meting' row. If no
--   'meting' row is present (unexpected), seed sensible defaults that
--   match the original V302 baseline.
-- ---------------------------------------------------------------------
INSERT INTO MDA_MUSIC_PROVIDER_CONFIG
    (provider_code, enabled_flag, visible_flag, sort_num)
SELECT 'tunehub', enabled_flag, visible_flag, sort_num
FROM MDA_MUSIC_PROVIDER_CONFIG
WHERE provider_code = 'meting'
ON CONFLICT (provider_code) DO UPDATE SET
    enabled_flag = EXCLUDED.enabled_flag,
    visible_flag = EXCLUDED.visible_flag,
    sort_num     = EXCLUDED.sort_num,
    update_time  = CURRENT_TIMESTAMP;

-- Fallback seed: matches the original V302 row in case 'meting' was
-- already removed before this rollback ran.
INSERT INTO MDA_MUSIC_PROVIDER_CONFIG (provider_code, enabled_flag, visible_flag, sort_num)
VALUES ('tunehub', 1, 1, 10)
ON CONFLICT (provider_code) DO NOTHING;


-- ---------------------------------------------------------------------
-- Rollback 2: MDA_MUSIC_PROVIDER_GUIDE
--   Re-create the 'tunehub' guide row using the exact Chinese copy
--   from the original V302 baseline so that the front-end displays
--   the historical guidance verbatim.
-- ---------------------------------------------------------------------
INSERT INTO MDA_MUSIC_PROVIDER_GUIDE
    (provider_code, guide_title, guide_text, guide_link)
VALUES (
    'tunehub',
    'TuneHub API Key 閼惧嘲褰囬幐鍥у础',
    '閻ц缍?TuneHub 閹貉冨煑閸欐澘鎮楅崷?Dashboard 閻㈢喐鍨?API Key閵?,
    'https://tunehub.sayqz.com/dashboard'
)
ON CONFLICT (provider_code) DO UPDATE SET
    guide_title = EXCLUDED.guide_title,
    guide_text  = EXCLUDED.guide_text,
    guide_link  = EXCLUDED.guide_link,
    update_time = CURRENT_TIMESTAMP;


-- ---------------------------------------------------------------------
-- Rollback 3: USR_PREFERENCE -- revert music.source_mode values
--   Mirrors V1003 step 4 in reverse, covering both stored shapes:
--     (a) nested object   :  preference_json -> 'music' -> 'source_mode'
--     (b) flat dotted key :  preference_json -> 'music.source_mode'
--   jsonb_set(..., create_missing=false) ensures we only rewrite when
--   the key already exists.
-- ---------------------------------------------------------------------

-- 3a: nested form, meting_first -> tunehub_first
UPDATE USR_PREFERENCE
SET preference_json = jsonb_set(
        preference_json,
        '{music,source_mode}',
        '"tunehub_first"'::jsonb,
        false
    )
WHERE preference_json #>> '{music,source_mode}' = 'meting_first';

-- 3b: nested form, meting_only -> tunehub_only
UPDATE USR_PREFERENCE
SET preference_json = jsonb_set(
        preference_json,
        '{music,source_mode}',
        '"tunehub_only"'::jsonb,
        false
    )
WHERE preference_json #>> '{music,source_mode}' = 'meting_only';

-- 3c: flat dotted-key form, meting_first -> tunehub_first
UPDATE USR_PREFERENCE
SET preference_json = jsonb_set(
        preference_json,
        ARRAY['music.source_mode'],
        '"tunehub_first"'::jsonb,
        false
    )
WHERE preference_json #>> ARRAY['music.source_mode'] = 'meting_first';

-- 3d: flat dotted-key form, meting_only -> tunehub_only
UPDATE USR_PREFERENCE
SET preference_json = jsonb_set(
        preference_json,
        ARRAY['music.source_mode'],
        '"tunehub_only"'::jsonb,
        false
    )
WHERE preference_json #>> ARRAY['music.source_mode'] = 'meting_only';


-- =====================================================================
-- End of V1003 manual rollback.
--
-- Not rolled back by this script (intentionally):
--   * USR_PROVIDER_SECRET tunehub/meting rows  -- physically deleted,
--                                                 not recoverable
--   * vh_meting_* mirror playlist rows         -- preserved alongside
--                                                 the vh_tunehub_*
--                                                 originals; harmless
-- =====================================================================
