-- =====================================================================
-- V1003: TuneHub -> Meting aggregator migration (PostgreSQL primary path)
-- =====================================================================
--
-- Change set: TuneHub removal and Meting migration
-- Design ref : section 3.5
-- Constraint : schema gap on MDA_USER_MUSIC_PLAYLIST_TRACK
--             (Conclusion B: schema gap on MDA_USER_MUSIC_PLAYLIST_TRACK
--              -> step 5b uses WHERE NOT EXISTS fallback, NOT ON CONFLICT)
--
-- Purpose:
--   Retire the TuneHub aggregator provider in favour of the system-internal
--   Meting sidecar. Migrate operational metadata (provider config + guide),
--   physically delete legacy aggregator user secrets, rewrite cached
--   source_mode user preferences, and produce vh_meting_* mirror copies of
--   legacy vh_tunehub_* virtual playlists / playlist tracks while
--   preserving the originals for old-client cache compatibility (R6.5).
--
-- Idempotency contract:
--   This script MUST be safe to re-run. Concrete proof per step:
--     step 1  : INSERT ... ON CONFLICT DO UPDATE -> repeatable UPSERT.
--               Trailing DELETE 0-row matches on second run.
--     step 2  : same pattern as step 1.
--     step 3  : DELETE WHERE provider_code IN (...) -> 0-row second run.
--     step 4  : UPDATE WHERE jsonb #>> ... = 'tunehub_*' -> 0-row second
--               run since the values are now 'meting_*'. jsonb_set uses
--               create_missing=false so untouched fields are preserved.
--     step 5a : INSERT ... ON CONFLICT (playlist_code) DO NOTHING.
--     step 5b : INSERT ... SELECT ... WHERE NOT EXISTS (subquery)
--               (fallback because PG migration-pg path does not maintain
--                the (playlist_code, provider_code, track_id) UNIQUE
--                index for MDA_USER_MUSIC_PLAYLIST_TRACK -- see
--                the constraint review note). The NOT EXISTS guard makes
--                re-runs degenerate to 0 inserts.
--
-- Compatibility:
--   PostgreSQL 11+. Only standard jsonb operators (#>>, jsonb_set with
--   text[] path) and ON CONFLICT clauses are used. No extensions needed.
--   Flyway baseline-on-migrate is configured upstream (V1000); this
--   script makes no DDL changes -- DML only.
--
-- Requirements covered: R3.8, R4.1, R4.2, R4.3, R4.4, R4.5, R6.5.
-- =====================================================================


-- ---------------------------------------------------------------------
-- Step 1: MDA_MUSIC_PROVIDER_CONFIG
--   UPSERT a 'meting' row from the legacy 'tunehub' row's operational
--   fields (enabled / visible / sort), then DELETE the tunehub row.
--   If neither row existed, seed a sensible default 'meting' row.
--   R4.1, R4.2.
-- ---------------------------------------------------------------------
INSERT INTO MDA_MUSIC_PROVIDER_CONFIG
    (provider_code, enabled_flag, visible_flag, sort_num)
SELECT 'meting', enabled_flag, visible_flag, sort_num
FROM MDA_MUSIC_PROVIDER_CONFIG
WHERE provider_code = 'tunehub'
ON CONFLICT (provider_code) DO UPDATE SET
    enabled_flag = EXCLUDED.enabled_flag,
    visible_flag = EXCLUDED.visible_flag,
    sort_num     = EXCLUDED.sort_num,
    update_time  = CURRENT_TIMESTAMP;

-- Fallback seed: ensures 'meting' exists even when no legacy 'tunehub'
-- row was present (e.g. fresh PG environments). DO NOTHING preserves any
-- existing operational tuning made by the previous UPSERT.
INSERT INTO MDA_MUSIC_PROVIDER_CONFIG (provider_code, enabled_flag, visible_flag, sort_num)
VALUES ('meting', 1, 1, 10)
ON CONFLICT (provider_code) DO NOTHING;

DELETE FROM MDA_MUSIC_PROVIDER_CONFIG
WHERE provider_code = 'tunehub';


-- ---------------------------------------------------------------------
-- Step 2: MDA_MUSIC_PROVIDER_GUIDE
--   Replace tunehub end-user guidance with meting guidance. Operational
--   metadata only -- not user data. R4.2.
-- ---------------------------------------------------------------------
INSERT INTO MDA_MUSIC_PROVIDER_GUIDE
    (provider_code, guide_title, guide_text, guide_link)
VALUES (
    'meting',
    'Meting 缂傚倷绶￠崹闈涚暦閻㈤潧鍨濇繛宸簻鐎氬鈧箍鍎遍幊搴綖閵堝鍋ｉ柛銉戝懏鎲煎┑?,
    'Meting 濠电偞鍨堕幑浣糕枍閿濆鐒鹃悗闈涙憸绾惧ジ鏌ｉ弬鍨Щ闁轰礁澧庣槐鎾诲礃閹勭亶濠电姭鍋撻柛銉墮缁€澶愭煃閽樺鍣界紒鈧径鎰厸闁告劦浜滈埢鍫熺箾閹惧磭鍩ｉ柟顔荤矙婵℃悂鏁冮埀顒勬偂?API Key闂備線娼уΛ鏃傜紦缁差湹tify 缂傚倸鍊风紞鈧柛娑卞灡閺嗙増绻涙潏鍓хК婵炲娲熷顐﹀Χ閸ワ絽浜鹃悷娆忓閹达箑钃熼柣鏂款殠閸ゆ洟鏌嶈閸撶喎鐣烽敐澶婄闁挎繂鍊告禍楣冩煕濞戝崬骞栨繛鍫濈埣閹綊宕堕敂鍓х摌缂備浇绮炬禍顒傛閺冨牆绠ｉ柣鎰儗濞笺劍绻?QQ/闂傚倷妞掗崡鎶剿夐幘鍨涘亾濮橆剛肖闁瑰嘲缍婇弫鍐焵椤掑啨浜归柛褎顨嗛崵鍕煢濡警妲告い顐ｆ閹綊宕堕鍛板悅婵犵數鍋涘ú顓㈠箖?Cookie 缂傚倸鍊烽悞锕傚垂閻㈠憡鍋╁Δ锝呭暙缁€澶愭煃閸濆嫬鈧悂路娓氣偓閺?,
    'https://github.com/injahow/meting-api'
)
ON CONFLICT (provider_code) DO UPDATE SET
    guide_title = EXCLUDED.guide_title,
    guide_text  = EXCLUDED.guide_text,
    guide_link  = EXCLUDED.guide_link,
    update_time = CURRENT_TIMESTAMP;

DELETE FROM MDA_MUSIC_PROVIDER_GUIDE
WHERE provider_code = 'tunehub';


-- ---------------------------------------------------------------------
-- Step 3: USR_PROVIDER_SECRET
--   PHYSICALLY DELETE legacy aggregator secrets for both 'tunehub' and
--   'meting'. R3.8 / R4.3.
--
--   Note: this DIVERGES from dormant MySQL V424 which preserved secrets
--   via UPSERT-rename. Rationale: the cipher_text values reference
--   TuneHub API endpoints that no longer exist post-removal; meting is
--   a system-internal sidecar that does not require user-bound secrets.
--   Recovery is not possible -- this is intentional per R3.8.
-- ---------------------------------------------------------------------
DELETE FROM USR_PROVIDER_SECRET
WHERE provider_code IN ('tunehub', 'meting');


-- ---------------------------------------------------------------------
-- Step 4: USR_PREFERENCE -- rewrite music.source_mode legacy values
--   Two storage shapes are tolerated for forward+backward compatibility:
--     (a) nested object   :  preference_json -> 'music' -> 'source_mode'
--                            (jsonb path '{music,source_mode}')
--     (b) flat dotted key :  preference_json -> 'music.source_mode'
--                            (legacy clients; jsonb path ARRAY['music.source_mode'])
--   jsonb_set(..., create_missing=false) means we only rewrite when the
--   target key already exists, so we never accidentally synthesise the
--   key on documents that have a different shape.
--   R4.4, R5.2.
-- ---------------------------------------------------------------------

-- 4a: nested form, tunehub_first -> meting_first
UPDATE USR_PREFERENCE
SET preference_json = jsonb_set(
        preference_json,
        '{music,source_mode}',
        '"meting_first"'::jsonb,
        false
    )
WHERE preference_json #>> '{music,source_mode}' = 'tunehub_first';

-- 4b: nested form, tunehub_only -> meting_only
UPDATE USR_PREFERENCE
SET preference_json = jsonb_set(
        preference_json,
        '{music,source_mode}',
        '"meting_only"'::jsonb,
        false
    )
WHERE preference_json #>> '{music,source_mode}' = 'tunehub_only';

-- 4c: flat dotted-key form, tunehub_first -> meting_first
UPDATE USR_PREFERENCE
SET preference_json = jsonb_set(
        preference_json,
        ARRAY['music.source_mode'],
        '"meting_first"'::jsonb,
        false
    )
WHERE preference_json #>> ARRAY['music.source_mode'] = 'tunehub_first';

-- 4d: flat dotted-key form, tunehub_only -> meting_only
UPDATE USR_PREFERENCE
SET preference_json = jsonb_set(
        preference_json,
        ARRAY['music.source_mode'],
        '"meting_only"'::jsonb,
        false
    )
WHERE preference_json #>> ARRAY['music.source_mode'] = 'tunehub_only';


-- ---------------------------------------------------------------------
-- Step 5a: MDA_USER_MUSIC_PLAYLIST -- vh_meting_* mirror copies
--   For each legacy vh_tunehub_* virtual playlist, insert a vh_meting_*
--   sibling row that the new client code can resolve directly. The
--   original vh_tunehub_* row is NOT removed -- old clients with cached
--   playlist codes continue to work via the read-side legacy regex. R6.5.
--
--   Idempotency: ON CONFLICT (playlist_code) DO NOTHING. The
--   playlist_code single-column UNIQUE constraint
--   (AK_MDA_USER_MUSIC_PLAYLIST_1) is asserted by the V406 / V4 MySQL
--   DDL and assumed in PG by the operational baseline -- see
--   the original playlist uniqueness review note.
-- ---------------------------------------------------------------------
INSERT INTO MDA_USER_MUSIC_PLAYLIST
    (playlist_code, user_id, playlist_type, name_text, description_text,
     cover_url, sort_num, public_flag, create_time, update_time,
     deleted_flag, version_num)
SELECT
    REPLACE(playlist_code, 'vh_tunehub_', 'vh_meting_') AS playlist_code,
    user_id, playlist_type, name_text, description_text,
    cover_url, sort_num, public_flag, create_time, update_time,
    deleted_flag, version_num
FROM MDA_USER_MUSIC_PLAYLIST
WHERE playlist_code LIKE 'vh_tunehub_%'
ON CONFLICT (playlist_code) DO NOTHING;


-- ---------------------------------------------------------------------
-- Step 5b: MDA_USER_MUSIC_PLAYLIST_TRACK -- vh_meting_* mirror copies
--   FALLBACK FORM (WHERE NOT EXISTS) because the active PG path does not
--
--   Why not ON CONFLICT (playlist_code, provider_code, track_id):
--     The active Flyway path migration-pg/ does NOT maintain DDL for
--     MDA_USER_MUSIC_PLAYLIST_TRACK, so the three-column UNIQUE index
--     (AK_MDA_USER_MUSIC_PLAYLIST_TRACK_1) defined in MySQL DDL V406/V4
--     is not statically provable on the production PG schema. Using
--     WHERE NOT EXISTS removes the dependency on that index entirely.
--
--   Idempotency proof:
--     First run  : matching dst row absent -> NOT EXISTS = true -> insert.
--     Second run : matching dst row now present -> NOT EXISTS = false
--                  -> 0 inserts.
--   No concurrency hazard: Flyway runs this script single-threaded at
--   application startup.
--   R4.5, R6.5.
-- ---------------------------------------------------------------------
INSERT INTO MDA_USER_MUSIC_PLAYLIST_TRACK
    (playlist_code, provider_code, track_id, sort_num,
     create_time, update_time, deleted_flag, version_num)
SELECT
    REPLACE(src.playlist_code, 'vh_tunehub_', 'vh_meting_') AS new_playlist_code,
    src.provider_code,
    src.track_id,
    src.sort_num,
    src.create_time,
    src.update_time,
    src.deleted_flag,
    src.version_num
FROM MDA_USER_MUSIC_PLAYLIST_TRACK AS src
WHERE src.playlist_code LIKE 'vh_tunehub_%'
  AND NOT EXISTS (
      SELECT 1
      FROM MDA_USER_MUSIC_PLAYLIST_TRACK AS dst
      WHERE dst.playlist_code = REPLACE(src.playlist_code, 'vh_tunehub_', 'vh_meting_')
        AND dst.provider_code = src.provider_code
        AND dst.track_id      = src.track_id
  );

-- =====================================================================
-- End of V1003. All five sections above are individually idempotent and
-- collectively produce zero observable change on a second invocation.
-- =====================================================================
