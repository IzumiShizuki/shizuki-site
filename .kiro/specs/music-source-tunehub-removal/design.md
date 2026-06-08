# Design Document

## Overview

本设计文档对应 `requirements.md` 中 9 个 EARS Requirements，给出每条的实现方案、代码改动定位、SQL 草稿与风险评估。设计的核心结论是：

- **`MetingMusicProvider` 已完整对齐 `TuneHubMusicProvider` 的 8 个公开方法签名**（见 §3.1 gap 分析），所以 R2.8 列出的能力清单**零缺口**——`MediaServiceImpl` 只需做"换 bean、换 import、删除常量"的纯替换，不需要补齐方法。
- **生产 PG 主路径只有 `migration-pg/V1003`** 会真正生效，必须新写。`migration/V424` 在 MySQL 休眠路径已经做过类似事，但其语义与 R3.8/R4.3 矛盾（V424 保留 secret 改名，本次要求物理删除）——见 §3.5 的对齐处置。
- **风险点集中在两处**：(1) Source*Mode 枚举改名带来的偏好兼容窗口；(2) `vh_tunehub*\*` 虚拟歌单编码的双前缀容忍。两者都通过"读侧识别 + 写侧统一 meting 前缀 + DB 一次性副本生成"的组合方案处理。

## 1. Architecture

### 1.1 当前调用链（删除前）

```
User → Frontend (MusicLibraryPage / ProfilePage)
         │
         ├── HTTP /api/v1/me/music/api-keys/tunehub  (R3 要删)
         │
         └── HTTP /api/v1/music/search /playlists ...
                 │
                 └── Backend MediaServiceImpl
                         │
                         ├── TuneHubMusicProvider  → https://tunehub.sayqz.com  (R1 要删)
                         ├── MetingMusicProvider   → http://meting-api          (保留)
                         ├── SpotifyMusicProvider  → Spotify Web API            (保留)
                         └── AsmrMusicProvider     → ASMR.one                   (保留)
```

### 1.2 目标调用链（删除后）

```
User → Frontend (MusicLibraryPage / ProfilePage)
         │ (无 API Key 绑定 UI)
         └── HTTP /api/v1/music/search /playlists ...
                 │
                 └── Backend MediaServiceImpl
                         │
                         ├── MetingMusicProvider   → http://meting-api  (新承担 netease/kuwo/qq)
                         ├── SpotifyMusicProvider  → Spotify Web API
                         └── AsmrMusicProvider     → ASMR.one
```

`tools/meting-sidecar/`（PHP `metowolf/Meting`）部署在容器网络，主机名 `meting-api`，对最终用户透明。

## 2. Components and Interfaces

### 2.1 后端 Java 组件清单

| 状态     | 类型  | 文件路径                                                                                                                |
| -------- | ----- | ----------------------------------------------------------------------------------------------------------------------- |
| **删除** | class | `modules/media-module/src/main/java/io/github/shizuki/site/media/integration/TuneHubMusicProvider.java`                 |
| **删除** | class | `modules/media-module/src/main/java/io/github/shizuki/site/media/config/TuneHubMusicProperties.java`                    |
| **删除** | test  | `modules/media-module/src/test/java/io/github/shizuki/site/media/integration/TuneHubMusicProviderSearchParserTest.java` |
| 修改     | class | `modules/media-module/src/main/java/io/github/shizuki/site/media/service/impl/MediaServiceImpl.java`                    |
| 修改     | class | `modules/user-module/src/main/java/io/github/shizuki/site/user/service/impl/UserServiceImpl.java`                       |
| 修改     | enum  | `libs/common-core/src/main/java/io/github/shizuki/common/core/error/ErrorCode.java`                                     |
| 修改     | test  | `modules/media-module/src/test/java/io/github/shizuki/site/media/service/impl/MediaServiceImplTest.java`                |
| 保留     | class | `modules/media-module/src/main/java/io/github/shizuki/site/media/integration/MetingMusicProvider.java`                  |
| 保留     | class | `modules/media-module/src/main/java/io/github/shizuki/site/media/config/MetingMusicProperties.java`                     |

### 2.2 前端 Vue/JS 组件清单

| 状态 | 文件                                                            | 改动范围                                                                                           |
| ---- | --------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| 修改 | `fronted/vue3-merged/src/components/music/MusicRightPanel.vue`  | 删除"Meting Key"折叠卡片 + 4 个 emit 事件                                                          |
| 修改 | `fronted/vue3-merged/src/pages/MusicLibraryPage.vue`            | 删除 `METING_API_PROVIDER` 常量 / 4 个 ref / 3 个方法；`musicSourceMode` 默认值改 `'meting_first'` |
| 修改 | `fronted/vue3-merged/src/pages/ProfilePage.vue`                 | 删除"Meting Key 管理"区块（含 `musicTunehub*` ref / 方法 / 模板节点）                              |
| 修改 | `fronted/vue3-merged/src/pages/musicLibraryUiState.js`          | 删除对 `'tunehub'` 字面量的特判                                                                    |
| 修改 | `fronted/vue3-merged/src/utils/musicAuthorizationState.js`      | 枚举 value 改名 + normalize 兼容旧值                                                               |
| 修改 | `fronted/vue3-merged/src/pages/MusicLibraryPage.spec.js`        | 同步断言                                                                                           |
| 修改 | `fronted/vue3-merged/src/pages/ProfilePage.spec.js`             | 同步断言                                                                                           |
| 修改 | `fronted/vue3-merged/src/utils/musicAuthorizationState.spec.js` | 同步断言                                                                                           |

## 3. Detailed Design

### 3.1 MetingMusicProvider 能力 gap 分析（满足 R2.8）

通过 `readCode` 读取 `MetingMusicProvider.java` 的全部公开方法，对照 R2.8 列出的 8 项能力：

| R2.8 能力                                                           | TuneHubMusicProvider | MetingMusicProvider | 状态      |
| ------------------------------------------------------------------- | -------------------- | ------------------- | --------- |
| `searchTracks(apiKey, platform, keyword, page, limit)`              | Line 303             | Line 209            | ✅ 已存在 |
| `searchPlaylists(apiKey, platform, keyword, page, limit)`           | Line 339             | Line 247            | ✅ 已存在 |
| `listToplistPlaylists(apiKey, platformOrder, limitPerPlatform)`     | Line 155             | Line 96             | ✅ 已存在 |
| `loadPlaylistSummary(apiKey, platform, sourceType, sourceId)`       | Line 386             | Line 272            | ✅ 已存在 |
| `loadVirtualPlaylistTracks(apiKey, platform, sourceType, sourceId)` | Line 202             | Line 136            | ✅ 已存在 |
| `parseSingleTrack(apiKey, platform, trackId, quality)`              | Line 501             | Line 307            | ✅ 已存在 |
| `buildDefaultPlaylist(apiKey, platformOrder, limit)`                | Line 98              | Line 74             | ✅ 已存在 |
| `listSupportedPlatforms() -> Set<String>`                           | Line 70              | Line 59             | ✅ 已存在 |

**结论**：零 gap。`MetingMusicProvider` 内嵌的 `SearchTrackResult` / `VirtualPlaylistSummary` / `ParseTrackResult` / `DynamicPlaylistResult` / `MusicTrackResponse` 等内嵌类型也与 TuneHub 等价（在 `add_meting_status.py` 字节级补丁脚本中已对齐）。

**改动模式**：在 `MediaServiceImpl` 里把 `tuneHubMusicProvider.foo(...)` 直接替换成 `metingMusicProvider.foo(...)`，把 `TuneHubMusicProvider.SearchTrackResult` 替换成 `MetingMusicProvider.SearchTrackResult`（其它内嵌类型同理）。属于纯文本替换，无方法签名变更。

### 3.2 MediaServiceImpl 的改动定位（满足 R2.1-R2.7、R6.1-R6.4）

通过 grep 已定位文件 `modules/media-module/src/main/java/io/github/shizuki/site/media/service/impl/MediaServiceImpl.java`（约 3700 行）。需改动的位置：

#### 3.2.1 import 段（约第 19 / 24 行）

| Before                                                                  | After          |
| ----------------------------------------------------------------------- | -------------- |
| `import io.github.shizuki.site.media.config.TuneHubMusicProperties;`    | **删除**       |
| `import io.github.shizuki.site.media.integration.TuneHubMusicProvider;` | **删除**       |
| `import io.github.shizuki.site.media.integration.MetingMusicProvider;`  | 保留（已存在） |

如需用到内嵌类型 `MetingMusicProvider.SearchTrackResult` / `MetingMusicProvider.VirtualPlaylistSummary` 等，沿用 `MetingMusicProvider.*` 限定名，无需新加 import。

#### 3.2.2 常量重命名（约第 175-205 行）

| 常量名                                          | 操作                                                                                 | 备注                                          |
| ----------------------------------------------- | ------------------------------------------------------------------------------------ | --------------------------------------------- |
| `TUNEHUB_PLAYLIST_PLATFORMS`                    | 重命名为 `MUSIC_PLATFORMS`                                                           | 值不变 `Set.of("netease","kuwo","qq")`        |
| `TUNEHUB_REAL_PLAYLIST_SEARCH_PLATFORMS`        | 重命名为 `MUSIC_REAL_PLAYLIST_SEARCH_PLATFORMS`                                      | 值不变                                        |
| `SUPPORTED_MUSIC_PROVIDERS`                     | 改为 `Set.of("spotify","asmr")`                                                      | 删除 `"tunehub"`（聚合源不再公开为 provider） |
| `VIRTUAL_TUNEHUB_PLAYLIST_CODE_PATTERN`         | **保留**（重命名 `VIRTUAL_LEGACY_PLAYLIST_CODE_PATTERN`）                            | R6.1 兼容旧编码                               |
| **新增** `VIRTUAL_METING_PLAYLIST_CODE_PATTERN` | `Pattern.compile("^vh_meting_([a-z0-9_\\-]+)_([a-z0-9_\\-]+)_(.+)$")`                | R6.2                                          |
| `LOG_EVENT_API_CONTEXT_START`                   | 值由 `"MUSIC_TUNEHUB_API_CONTEXT_RESOLVE"` 改为 `"MUSIC_METING_API_CONTEXT_RESOLVE"` | 与日志检索保持一致                            |
| `SOURCE_MODE_TUNEHUB_FIRST`                     | 重命名 `SOURCE_MODE_METING_FIRST`，值 `"meting_first"`                               | R5.1                                          |
| `SOURCE_MODE_TUNEHUB_ONLY`                      | 重命名 `SOURCE_MODE_METING_ONLY`，值 `"meting_only"`                                 | R5.1                                          |

> 兼容点：`SOURCE_MODE_*` 常量改名后，所有引用需要做"读侧兼容"——见 §3.2.5。

#### 3.2.3 字段、构造器、方法名（约第 248-330 行 + 全文）

| Before                                                                                                                    | After                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `private final TuneHubMusicProvider tuneHubMusicProvider;`                                                                | **删除**                                                                                                                                 |
| `private final TuneHubMusicProperties tuneHubMusicProperties;`                                                            | **删除**                                                                                                                                 |
| 已存在的 `private final MetingMusicProvider metingMusicProvider;`                                                         | 保留                                                                                                                                     |
| `MediaServiceImpl(... TuneHubMusicProvider tuneHubMusicProvider, ... TuneHubMusicProperties tuneHubMusicProperties, ...)` | 删除两个构造器参数 + 对应 `this.xxx = xxx` 赋值                                                                                          |
| `resolveTuneHubApiContext(...)` 方法                                                                                      | 重命名为 `resolveMusicApiContext(...)`                                                                                                   |
| `TuneHubApiContext` 内嵌 record/class                                                                                     | 重命名为 `MusicApiContext`                                                                                                               |
| `TuneHubVirtualPlaylistRef` 内嵌 record/class                                                                             | 重命名为 `MusicVirtualPlaylistRef`                                                                                                       |
| `parseVirtualTunehubPlaylistCode(...)`                                                                                    | 重命名为 `parseVirtualMusicPlaylistCode(...)`（合并 meting 与旧 tunehub 两个正则）                                                       |
| `loadVirtualTunehubPlaylistBundle(...)`                                                                                   | 重命名为 `loadVirtualMusicPlaylistBundle(...)`                                                                                           |
| 所有调用 `tuneHubMusicProvider.foo(...)`                                                                                  | 替换成 `metingMusicProvider.foo(...)`                                                                                                    |
| 所有 `TuneHubMusicProvider.SearchTrackResult` 等                                                                          | 替换成 `MetingMusicProvider.SearchTrackResult` 等                                                                                        |
| `tuneHubMusicProperties.getDefaultQuality()`                                                                              | `metingMusicProperties.getDefaultQuality()`（构造器中注入已存在）                                                                        |
| `tuneHubMusicProperties.getDefaultApiKey()`                                                                               | `metingMusicProperties.getDefaultApiKey()`（默认值 `"meting-system"`，R2.7）                                                             |
| 错误信息字符串 `"TuneHub API key missing"`                                                                                | 因 sidecar 不需要用户 Key，**整段 `if (!StringUtils.hasText(apiContext.apiKey())) { ... }` 可简化或删除**——sidecar 总是有 system api key |

#### 3.2.4 vh*\** 双前缀解析（满足 R6.1-R6.4）

`getMusicPlaylistBundle(String playlistCode)`（约第 896 行）的解析路径修改为：

```java
@Override
public MusicPlaylistBundleResponse getMusicPlaylistBundle(String playlistCode) {
    String normalizedCode = normalizePlaylistCode(playlistCode);

    // R6.2 优先匹配新前缀
    MusicVirtualPlaylistRef virtualPlaylistRef = parseVirtualMusicPlaylistCode(normalizedCode);
    if (virtualPlaylistRef != null) {
        return loadVirtualMusicPlaylistBundle(virtualPlaylistRef);
    }

    AsmrVirtualPlaylistRef asmrVirtualPlaylistRef = parseVirtualAsmrPlaylistCode(normalizedCode);
    if (asmrVirtualPlaylistRef != null) {
        return loadVirtualAsmrPlaylistBundle(asmrVirtualPlaylistRef);
    }
    /* ...其余分支不变... */
}

/**
 * R6.1 / R6.2: 同时识别新前缀 vh_meting_* 与旧前缀 vh_tunehub_*。
 */
private MusicVirtualPlaylistRef parseVirtualMusicPlaylistCode(String playlistCode) {
    Matcher m = VIRTUAL_METING_PLAYLIST_CODE_PATTERN.matcher(playlistCode);
    if (m.matches()) {
        return new MusicVirtualPlaylistRef(playlistCode, m.group(1), m.group(2), m.group(3));
    }
    // 旧编码兼容（一个 release 周期内）
    m = VIRTUAL_LEGACY_PLAYLIST_CODE_PATTERN.matcher(playlistCode);
    if (m.matches()) {
        return new MusicVirtualPlaylistRef(playlistCode, m.group(1), m.group(2), m.group(3));
    }
    return null;
}
```

> R6.4 保证：`MusicVirtualPlaylistRef` 第一个字段 `playlistCode` 直接保存原始字符串（`vh_tunehub_*` 或 `vh_meting_*`），后续构造 `MusicPlaylistBundleResponse.profile.playlistCode` 时直接回填，**不强制改写**。

#### 3.2.5 写侧统一前缀（满足 R6.3）

约第 3733 行的 search 虚拟歌单生成代码：

```java
// Before
return "vh_tunehub_" + normalizedProvider + "_search_" + encodedKeyword;
// After
return "vh_meting_" + normalizedProvider + "_search_" + encodedKeyword;
```

`MetingMusicProvider.buildVirtualPlaylistCode(...)`（已存在，第 337 行）已经写入 `vh_meting_` 前缀，所以榜单歌单和默认歌单的写侧自动正确。`MediaServiceImpl` 内部独立生成的所有 `"vh_tunehub_" + ...` 字面量都要改成 `"vh_meting_" + ...`——通过全文搜索 `"vh_tunehub_"` 字面量定位（grep 已确认仅 1 处，第 3734 行）。

#### 3.2.6 source_mode 读侧兼容（满足 R5.2-R5.3 后端镜像）

`MediaServiceImpl` 内部所有比较 source_mode 字面量的地方应同时识别新旧值：

```java
// 增加一个统一的 normalize helper
private static String normalizeSourceModeForRead(String raw) {
    if (raw == null) return SOURCE_MODE_ACCOUNT_FIRST;
    return switch (raw.trim().toLowerCase(Locale.ROOT)) {
        case "tunehub_first" -> SOURCE_MODE_METING_FIRST;
        case "tunehub_only"  -> SOURCE_MODE_METING_ONLY;
        case "account_first" -> SOURCE_MODE_ACCOUNT_FIRST;
        case "meting_first"  -> SOURCE_MODE_METING_FIRST;
        case "account_only"  -> SOURCE_MODE_ACCOUNT_ONLY;
        case "meting_only"   -> SOURCE_MODE_METING_ONLY;
        default              -> SOURCE_MODE_ACCOUNT_FIRST;
    };
}
```

所有读 `preference_json#>>'{music,source_mode}'` 的位置统一过 `normalizeSourceModeForRead(...)`。这是双保险——即使 V1003 迁移失败，旧值也能被读侧识别。

### 3.3 UserServiceImpl 的改动（满足 R3.6、R3.7）

文件 `modules/user-module/src/main/java/io/github/shizuki/site/user/service/impl/UserServiceImpl.java`：

| Before（line ~88-90）                                      | After                                            |
| ---------------------------------------------------------- | ------------------------------------------------ |
| `Set.of("tunehub", "spotify", "asmr")`                     | `Set.of("spotify", "asmr")`                      |
| `Set.of("netease","qqmusic","kugou","tunehub","spotify")`  | `Set.of("netease","qqmusic","kugou","spotify")`  |
| `List.of("netease","qqmusic","kugou","tunehub","spotify")` | `List.of("netease","qqmusic","kugou","spotify")` |

R3.7 的 400 错误：第 1268 行的 `validateMusicProvider`（推断方法名）已经在 `!SUPPORTED_MUSIC_PROVIDERS.contains(normalized)` 时抛 `BAD_REQUEST`，**无需新加分支**——`tunehub` 被移出后会自动落入此分支。但错误码常量需要更精确：

```java
// Before
throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported provider: " + provider);

// After
throw new BusinessException(
    ErrorCode.BAD_REQUEST,
    "Unsupported provider: " + provider,
    Map.of("music_error_code", "MUSIC_PROVIDER_NOT_SUPPORTED")
);
```

### 3.4 ErrorCode 新增（满足 R3.7 业务码）

文件 `libs/common-core/src/main/java/io/github/shizuki/common/core/error/ErrorCode.java`。当前 `ErrorCode` 是简单 enum（`BAD_REQUEST` / `FORBIDDEN` / `NOT_FOUND`...）。`MUSIC_PROVIDER_NOT_SUPPORTED` 不是顶层错误，是业务 sub-code，按现有惯例放在响应 detail 的 `music_error_code` 字段里（与 `MUSIC_ERROR_CODE_SEARCH_API_KEY_MISSING` 同级），**不新增 enum 值**。

### 3.5 PG 迁移 V1003 完整 SQL（满足 R4.1-R4.5、R6.5、R3.8）

文件：`apps/monolith-app/src/main/resources/monolith/db/migration-pg/V1003__music_tunehub_to_meting.sql`

```sql
-- V1003: Migrate TuneHub aggregator provider to Meting; clean up legacy
-- secrets, virtual playlist codes, and user source_mode preferences.
--
-- Idempotent: re-running this script after success produces no changes.
--   * UPSERT (ON CONFLICT DO UPDATE) handles repeated MDA_MUSIC_PROVIDER_*
--     row writes.
--   * DELETE WHERE clauses are inherently idempotent (no row matches second
--     time).
--   * UPDATE WHERE preference_json #>> ... = 'tunehub_*' won't match after
--     first run.

------------------------------------------------------------
-- 1) MDA_MUSIC_PROVIDER_CONFIG: copy legacy 'tunehub' row attrs to 'meting',
--    then delete the legacy row. Operational fields (enabled/visible/sort_num)
--    survive the rename. R4.2.
------------------------------------------------------------
INSERT INTO MDA_MUSIC_PROVIDER_CONFIG
    (provider_code, enabled_flag, visible_flag, sort_num)
SELECT 'meting', enabled_flag, visible_flag, sort_num
FROM MDA_MUSIC_PROVIDER_CONFIG
WHERE provider_code = 'tunehub'
ON CONFLICT (provider_code) DO UPDATE SET
    enabled_flag  = EXCLUDED.enabled_flag,
    visible_flag  = EXCLUDED.visible_flag,
    sort_num      = EXCLUDED.sort_num,
    update_time   = CURRENT_TIMESTAMP;

-- Fallback: if neither 'tunehub' nor 'meting' existed, seed default 'meting'.
INSERT INTO MDA_MUSIC_PROVIDER_CONFIG (provider_code, enabled_flag, visible_flag, sort_num)
VALUES ('meting', 1, 1, 10)
ON CONFLICT (provider_code) DO NOTHING;

DELETE FROM MDA_MUSIC_PROVIDER_CONFIG WHERE provider_code = 'tunehub';

------------------------------------------------------------
-- 2) MDA_MUSIC_PROVIDER_GUIDE: replace tunehub guide with meting guide. R4.2.
------------------------------------------------------------
INSERT INTO MDA_MUSIC_PROVIDER_GUIDE
    (provider_code, guide_title, guide_text, guide_link)
VALUES (
    'meting',
    'Meting 系统服务说明',
    'Meting 为系统内置服务，无需用户 API Key。Spotify 继续使用官方开发者凭证；网易云/QQ/酷狗账号能力请使用 Cookie 绑定助手。',
    'https://github.com/injahow/meting-api'
)
ON CONFLICT (provider_code) DO UPDATE SET
    guide_title   = EXCLUDED.guide_title,
    guide_text    = EXCLUDED.guide_text,
    guide_link    = EXCLUDED.guide_link,
    update_time   = CURRENT_TIMESTAMP;

DELETE FROM MDA_MUSIC_PROVIDER_GUIDE WHERE provider_code = 'tunehub';

------------------------------------------------------------
-- 3) USR_PROVIDER_SECRET: PHYSICAL DELETE legacy aggregator secrets.
--    R3.8 / R4.3. Note: this DIVERGES from dormant V424 which preserved
--    secrets via UPSERT-rename. Rationale: cipher_text references TuneHub
--    API endpoints that no longer exist post-removal.
------------------------------------------------------------
DELETE FROM USR_PROVIDER_SECRET
WHERE provider_code IN ('tunehub', 'meting');

------------------------------------------------------------
-- 4) USR_PREFERENCE: rewrite music.source_mode legacy values. R4.4.
--    Two storage shapes are tolerated:
--      a) JSON path $.music.source_mode (nested object)
--      b) JSON path $."music.source_mode" (flat dotted key, legacy)
------------------------------------------------------------
UPDATE USR_PREFERENCE
SET preference_json = jsonb_set(
        preference_json,
        '{music,source_mode}',
        '"meting_first"'::jsonb,
        false
    )
WHERE preference_json #>> '{music,source_mode}' = 'tunehub_first';

UPDATE USR_PREFERENCE
SET preference_json = jsonb_set(
        preference_json,
        '{music,source_mode}',
        '"meting_only"'::jsonb,
        false
    )
WHERE preference_json #>> '{music,source_mode}' = 'tunehub_only';

-- Flat-key shape (older clients).
UPDATE USR_PREFERENCE
SET preference_json = jsonb_set(
        preference_json,
        ARRAY['music.source_mode'],
        '"meting_first"'::jsonb,
        false
    )
WHERE preference_json #>> ARRAY['music.source_mode'] = 'tunehub_first';

UPDATE USR_PREFERENCE
SET preference_json = jsonb_set(
        preference_json,
        ARRAY['music.source_mode'],
        '"meting_only"'::jsonb,
        false
    )
WHERE preference_json #>> ARRAY['music.source_mode'] = 'tunehub_only';

------------------------------------------------------------
-- 5) MDA_USER_MUSIC_PLAYLIST + MDA_USER_MUSIC_PLAYLIST_TRACK:
--    Generate vh_meting_* mirror rows for legacy vh_tunehub_* codes,
--    preserving original rows for old client cache compatibility. R6.5.
------------------------------------------------------------
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

INSERT INTO MDA_USER_MUSIC_PLAYLIST_TRACK
    (playlist_code, provider_code, track_id, sort_num,
     create_time, update_time, deleted_flag, version_num)
SELECT
    REPLACE(playlist_code, 'vh_tunehub_', 'vh_meting_') AS playlist_code,
    provider_code, track_id, sort_num,
    create_time, update_time, deleted_flag, version_num
FROM MDA_USER_MUSIC_PLAYLIST_TRACK
WHERE playlist_code LIKE 'vh_tunehub_%'
ON CONFLICT (playlist_code, provider_code, track_id) DO NOTHING;
```

#### 幂等性证明

| 语句类型                                                        | 第一次运行 | 第二次运行                      | 证明                 |
| --------------------------------------------------------------- | ---------- | ------------------------------- | -------------------- |
| `INSERT ... SELECT ... ON CONFLICT DO UPDATE`                   | 插入或更新 | UPDATE 重复，结果集相同         | UPDATE 是 idempotent |
| `INSERT ... VALUES ... ON CONFLICT DO NOTHING`                  | 插入或忽略 | 忽略                            | NOTHING 是空操作     |
| `DELETE WHERE provider_code='tunehub'`                          | 删除       | 0 行匹配                        | 第二次空操作         |
| `UPDATE WHERE jsonb #>> ... = 'tunehub_*'`                      | 替换       | 0 行匹配（已经是 'meting\_\*'） | 第二次空操作         |
| `INSERT ... vh_meting_ FROM vh_tunehub_ ON CONFLICT DO NOTHING` | 插入副本   | 副本已存在，NOTHING             | 幂等                 |

> **依赖前提**：`MDA_USER_MUSIC_PLAYLIST_TRACK` 必须存在三列复合唯一约束 `(playlist_code, provider_code, track_id)`。如果实际表只有 PK 而无该唯一约束，§5 给出 fallback 写法（用 `WHERE NOT EXISTS` 子查询）。需要在 Tasks 阶段先确认。

### 3.6 休眠路径同步（满足 R4.6、R4.7）

#### V427（MySQL 休眠）`apps/monolith-app/src/main/resources/monolith/db/migration/V427__music_provider_secret_cleanup.sql`

V424 已经做了 UPSERT-rename，但与 R3.8 矛盾。V427 需要补齐：

```sql
-- V427: Reconcile dormant MySQL path with R3.8/R4.3 — physical delete of
-- aggregator secrets. V424 left them via rename which is now incorrect.

DELETE FROM USR_PROVIDER_SECRET
WHERE provider_code IN ('tunehub', 'meting');

-- vh_meting_ mirror copies for legacy vh_tunehub_ playlists. R6.5.
INSERT INTO MDA_USER_MUSIC_PLAYLIST
    (playlist_code, user_id, playlist_type, name_text, description_text,
     cover_url, sort_num, public_flag, create_time, update_time,
     deleted_flag, version_num)
SELECT
    REPLACE(playlist_code, 'vh_tunehub_', 'vh_meting_'),
    user_id, playlist_type, name_text, description_text,
    cover_url, sort_num, public_flag, create_time, update_time,
    deleted_flag, version_num
FROM MDA_USER_MUSIC_PLAYLIST
WHERE playlist_code LIKE 'vh_tunehub_%'
ON DUPLICATE KEY UPDATE update_time = update_time;  -- no-op for idempotency

INSERT INTO MDA_USER_MUSIC_PLAYLIST_TRACK
    (playlist_code, provider_code, track_id, sort_num,
     create_time, update_time, deleted_flag, version_num)
SELECT
    REPLACE(playlist_code, 'vh_tunehub_', 'vh_meting_'),
    provider_code, track_id, sort_num,
    create_time, update_time, deleted_flag, version_num
FROM MDA_USER_MUSIC_PLAYLIST_TRACK
WHERE playlist_code LIKE 'vh_tunehub_%'
ON DUPLICATE KEY UPDATE update_time = update_time;
```

#### V8（模块休眠）`modules/media-module/src/main/resources/db/migration/V8__music_secret_cleanup.sql`

与 V427 同语义（MySQL 方言），因为模块级是为未来微服务拆分预留的 dormant 副本。

#### 基线 SQL 同步（R4.7）

| 文件                                                                                   | 操作                                                 |
| -------------------------------------------------------------------------------------- | ---------------------------------------------------- |
| `resouces/sql/shizuki_app.sql`（line 600-615 区域）                                    | `'tunehub'` 行替换为 `'meting'` 行（含引导文案改写） |
| `apps/monolith-app/src/main/resources/monolith/db/migration/V302__media_seed_data.sql` | 同上                                                 |
| `modules/media-module/src/main/resources/db/migration/V2__seed_data.sql`               | 同上                                                 |

### 3.7 前端最小补丁（满足 R3.1-R3.5、R5.1-R5.5）

#### 3.7.1 `MusicRightPanel.vue`

整段删除 `<article class="integration-card accordion-card" :class="{ expanded: isTunehubExpanded }">` 卡片（约第 91-152 行）。同步删除：

- `props`: `tunehubKeyInput` / `tunehubStatus` / `tunehubBusy`
- `emits`: `update:tunehubKeyInput` / `save-tunehub-key` / `delete-tunehub-key` / `refresh-tunehub-status`
- `computed`: `isTunehubExpanded` / `tunehubBound` / `tunehubSummary` / `tunehubStatusText`

`<select v-model="...">` 中的 option 值由 `'tunehub_first'` 改为 `'meting_first'`，由 `'tunehub_only'` 改为 `'meting_only'`。Label 文字本来就是中文 "Meting 优先" / "仅 Meting"，无需改文案。

#### 3.7.2 `MusicLibraryPage.vue`

| 删除项                                                                               | 行号    |
| ------------------------------------------------------------------------------------ | ------- |
| `const METING_API_PROVIDER = 'tunehub';`                                             | 251     |
| `const tunehubKeyInput = ref('');` 等 4 个 ref                                       | 299-301 |
| `loadTunehubStatus()` / `handleSaveTunehubKey()` / `handleDeleteTunehubKey()` 全函数 | 1483 起 |
| `<MusicRightPanel>` 上的 6 个 `:tunehub-*` prop 绑定与事件绑定                       | 109-133 |

| 修改项                                                                       | 改法                                        |
| ---------------------------------------------------------------------------- | ------------------------------------------- |
| `musicSourceMode = ref('tunehub_first')`                                     | 改为 `ref('meting_first')`                  |
| `if (normalizedProvider === 'meting' \|\| normalizedProvider === 'tunehub')` | 改为 `if (normalizedProvider === 'meting')` |

#### 3.7.3 `ProfilePage.vue`

| 删除项                                                                                     | 行号      |
| ------------------------------------------------------------------------------------------ | --------- |
| `<article>` 内 "Meting Key 管理" 整块（含 4 个 button + 1 个 input + 1 个 helper-text）    | 307-331   |
| `const METING_API_PROVIDER = 'tunehub';`                                                   | 720       |
| `musicTunehubBusy` / `musicTunehubKeyInput` / `musicTunehubStatus` ref                     | 781-787   |
| `loadMusicTunehubStatus()` / `saveMusicTunehubKey()` / `deleteMusicTunehubKey()` 全函数    | 1317-1366 |
| 1379 行 `Promise.all([..., loadMusicTunehubStatus(), ...])` 中删除该调用                   | 1379      |
| 1949 行 `musicAuthConfiguredCount` 计算删除 `Number(musicTunehubStatus.value.keyBound)` 项 | 1950      |
| `musicTunehubStatusText` computed                                                          | 1952-1959 |

| 修改项                                   | 改法                       |
| ---------------------------------------- | -------------------------- |
| `musicSourceMode = ref('tunehub_first')` | 改为 `ref('meting_first')` |

#### 3.7.4 `musicLibraryUiState.js`

第 122-126 行：

```diff
- if (normalized === 'tunehub' || normalized === 'spotify') {
-     expandedProvider.value = normalized;
- }
+ if (normalized === 'spotify') {
+     expandedProvider.value = normalized;
+ }
```

#### 3.7.5 `musicAuthorizationState.js`

```diff
 export const MUSIC_SOURCE_MODE_OPTIONS = Object.freeze([
   Object.freeze({ value: 'account_first', label: '账号优先' }),
-  Object.freeze({ value: 'tunehub_first', label: 'Meting 优先' }),
+  Object.freeze({ value: 'meting_first',  label: 'Meting 优先' }),
   Object.freeze({ value: 'account_only',  label: '仅账号源' }),
-  Object.freeze({ value: 'tunehub_only',  label: '仅 Meting' })
+  Object.freeze({ value: 'meting_only',   label: '仅 Meting' })
 ]);

 export function normalizeMusicSourceModeValue(raw) {
   const normalized = String(raw || '').trim().toLowerCase();
+  // R5.2/R5.3: 一个 release 的兼容窗口
+  if (normalized === 'tunehub_first') return 'meting_first';
+  if (normalized === 'tunehub_only')  return 'meting_only';
   if (MUSIC_SOURCE_MODE_OPTIONS.some((item) => item.value === normalized)) {
     return normalized;
   }
-  return 'tunehub_first';
+  return 'meting_first';
 }
```

#### 3.7.6 三个 `.spec.js` 同步

- `musicAuthorizationState.spec.js`：补充对 `'tunehub_first' -> 'meting_first'` / `'tunehub_only' -> 'meting_only'` 兼容映射的断言；将所有 `'tunehub_first'` 期望值改为 `'meting_first'`。
- `MusicLibraryPage.spec.js`：删除 mock 中的 `getMusicApiKeyStatus` 期望调用；`source_mode` 期望值改为 `'meting_first'`。
- `ProfilePage.spec.js`：第 478 行 `getPreference` mock 中 `source_mode: 'tunehub_first'` 改为 `'meting_first'`；删除 `musicTunehub*` 相关断言。

### 3.8 配置与文档清理（满足 R7）

| 文件                                                              | 操作                                                                                                                      |
| ----------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `resouces/yaml/monolith.yaml`                                     | 已确认仅有 `shizuki.music.meting.*` 段（grep 结果），R7.1 满足                                                            |
| `apps/monolith-app/src/main/resources/application.yml`            | 检查并删除任何 `shizuki.music.tunehub.*` 残留                                                                             |
| `resouces/yaml/common-config.example.yaml`                        | 已确认仅有 `meting` 段，R7.1 满足                                                                                         |
| `deploy/README.md` line 11-13                                     | 改写为 `# music sidecar URL: shizuki.music.meting.base-url（部署方在容器网络内提供 meting-api 服务，无需用户级 API Key）` |
| `postman/shizuki-site-apis.postman_collection.json`               | 顶层 var `musicProvider` 由 `"tunehub"` 改为 `"meting"`；删除"TuneHub API Key 获取"示例条目（因 Meting 不需要 Key）       |
| `Dockerfile.frontend` 的 `VITE_METING_CONSOLE_URL`                | **保留**（R9.4）                                                                                                          |
| `monolith.yaml` 网关 guest-paths 中 `/api/v1/music/meting/status` | **保留**（R7.5）                                                                                                          |

## 4. Data Models

本次 spec 不引入新表，不修改表结构。涉及表的语义变化：

| 表                              | 列                                    | 影响                                                     |
| ------------------------------- | ------------------------------------- | -------------------------------------------------------- |
| `MDA_MUSIC_PROVIDER_CONFIG`     | `provider_code`                       | 新增枚举值 `meting`，删除 `tunehub`                      |
| `MDA_MUSIC_PROVIDER_GUIDE`      | `provider_code`                       | 同上                                                     |
| `USR_PROVIDER_SECRET`           | `provider_code`                       | 物理删除 `tunehub` / `meting` 行                         |
| `USR_PREFERENCE`                | `preference_json $.music.source_mode` | 字面量替换                                               |
| `MDA_USER_MUSIC_PLAYLIST`       | `playlist_code`                       | 新增 `vh_meting_*` 副本，保留 `vh_tunehub_*` 原行        |
| `MDA_USER_MUSIC_PLAYLIST_TRACK` | `playlist_code`                       | 同上                                                     |
| `MDA_MUSIC_TRACK_CACHE`         | `provider_code`                       | **不动**（存平台编码 netease/kuwo/qq，与本次无关，R9.3） |
| `MDA_MUSIC_PLAYLIST`            | `provider_code`                       | **不动**（同上）                                         |

## 5. Testing Strategy

### 5.1 跳过 Correctness Properties / PBT

本 feature 是"配置切换 + 代码删除 + 数据迁移"，不涉及算法 / 状态机 / 协议解析等可形式化的不变量域。Property-Based Testing 的核心场景（生成大量随机输入验证不变量）在此不适用。**改用传统单元 + 集成 + 迁移测试**。

### 5.2 Unit Tests

| 文件                        | 改动                                                                                                                                                                                                              |
| --------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `MediaServiceImplTest.java` | 所有 `Mockito.mock(TuneHubMusicProvider.class)` 替换为 `mock(MetingMusicProvider.class)`；类型 `TuneHubMusicProvider.SearchTrackResult` 等替换为 `MetingMusicProvider.*`；删除 `TuneHubMusicProperties` 相关 mock |
| `MediaServiceImplTest.java` | 删除测试 `shouldThrowForbiddenWhenAllTuneHubProvidersMissingApiKey`（行为已不存在，sidecar 不依赖用户 Key）                                                                                                       |
| `MediaServiceImplTest.java` | 新增测试 `shouldRouteSearchTracksToMetingProvider`、`shouldFallbackOnVhTunehubLegacyCode`、`shouldNormalizeLegacySourceModeOnRead`                                                                                |

### 5.3 Migration Tests

在 `apps/monolith-app/src/test/`（如果不存在则新建）添加 `MusicTunehubToMetingMigrationTest.java`，使用 testcontainers PostgreSQL 14：

1. 启动空 PG → Flyway migrate 到 V1002 → 手动插入 `tunehub` 行 + 一条 `vh_tunehub_netease_search_xxxx` 收藏 + 一个 `source_mode = 'tunehub_first'` 偏好
2. 执行 V1003 → 断言：
   - `MDA_MUSIC_PROVIDER_CONFIG` 中无 `tunehub` 行，有 `meting` 行（继承 sort_num）
   - `USR_PROVIDER_SECRET` 中两个 provider_code 行已删除
   - `USR_PREFERENCE` 的 source_mode 字段值为 `'meting_first'`
   - `MDA_USER_MUSIC_PLAYLIST` 中既有 `vh_tunehub_*` 也有对应 `vh_meting_*` 副本
3. **再次执行 V1003**（手动触发）→ 断言无报错、所有断言项保持不变（幂等性证明）

### 5.4 Integration / E2E

R8.5 的三条 curl 路径（在已发布到测试环境后跑）：

```bash
curl -fsS "http://<host>/api/v1/music/search?q=樱花&type=track&providers=netease,kuwo,qq&page=1&limit=10" | jq '.data.tracks | length'
curl -fsS "http://<host>/api/v1/music/library/home" | jq '.data.featuredPlaylists | length'
curl -fsS "http://<host>/api/v1/music/meting/status" | jq '.data.available'
```

全部要求 200 + 非空 body，第三条要求 `available == true`。

### 5.5 Frontend vitest

`fronted/vue3-merged/` 目录下：

- `npm run test` 全套通过率 100%
- 重点覆盖 `musicAuthorizationState.spec.js` 的兼容映射断言
- `ProfilePage.spec.js` 中确认不再发起 `getMusicApiKeyStatus('tunehub')` mock 调用

## 6. Risks and Rollback

### 6.1 风险矩阵

| ID   | 风险                                                                                                              | 概率 | 影响             | 缓解                                                                                                  |
| ---- | ----------------------------------------------------------------------------------------------------------------- | ---- | ---------------- | ----------------------------------------------------------------------------------------------------- |
| R-01 | V1003 在生产 PG 执行失败                                                                                          | 低   | 高（启动失败）   | 在 stage 环境用 testcontainers 跑两遍幂等测试；保留手写回滚 SQL（§6.2）                               |
| R-02 | `MDA_USER_MUSIC_PLAYLIST_TRACK` 实际无 (playlist_code, provider_code, track_id) 唯一索引，导致 `ON CONFLICT` 失败 | 中   | 中（迁移失败）   | Tasks 阶段先 `\d+ MDA_USER_MUSIC_PLAYLIST_TRACK` 确认；如无该约束，改用 `WHERE NOT EXISTS` 子查询写法 |
| R-03 | 旧前端读到 `meting_first` 但前端代码只识别 `tunehub_first`，select 显示空白                                       | 中   | 低（视觉抖动）   | 部署顺序：先后端（V1003 改写偏好）+ 旧前端会落到 normalize 兜底分支 `'tunehub_first'`，再发新前端     |
| R-04 | 用户旧客户端缓存了 `vh_tunehub_*` 收藏 ID，新版本被误删                                                           | 低   | 中               | R6.4 + V1003 step 5：保留旧行同时生成 meting 副本                                                     |
| R-05 | TuneHubMusicProvider 仍在某处被反射调用（注解扫描、Spring AOP）                                                   | 极低 | 中               | 删除前 `grep -r "TuneHub" --include='*.java'` 确认仅在被替换的位置出现                                |
| R-06 | meting-sidecar 健康度问题导致全站音乐降级                                                                         | 低   | 高（功能不可用） | sidecar 已在生产稳定运行；`/api/v1/music/meting/status` 端点保留以监控；运维面板可见                  |

### 6.2 回滚

Flyway 不支持自动回滚 V\_\_ 脚本。配套手写回滚 SQL 存档于 `apps/monolith-app/src/main/resources/monolith/db/migration-pg/_rollback/V1003_rollback.sql`（不放在 `migration-pg/` 主路径，避免被误执行）：

```sql
-- Manual rollback for V1003 (NOT executed by Flyway).
-- Restore 'tunehub' provider config, restore 'tunehub_*' source_mode.
-- Note: deleted secrets in USR_PROVIDER_SECRET CANNOT be restored.

INSERT INTO MDA_MUSIC_PROVIDER_CONFIG (provider_code, enabled_flag, visible_flag, sort_num)
SELECT 'tunehub', enabled_flag, visible_flag, sort_num
FROM MDA_MUSIC_PROVIDER_CONFIG
WHERE provider_code = 'meting'
ON CONFLICT (provider_code) DO NOTHING;

UPDATE USR_PREFERENCE
SET preference_json = jsonb_set(preference_json, '{music,source_mode}', '"tunehub_first"'::jsonb, false)
WHERE preference_json #>> '{music,source_mode}' = 'meting_first';

UPDATE USR_PREFERENCE
SET preference_json = jsonb_set(preference_json, '{music,source_mode}', '"tunehub_only"'::jsonb, false)
WHERE preference_json #>> '{music,source_mode}' = 'meting_only';

-- Note: vh_meting_ mirror rows can stay (harmless).
```

回滚还需要：手动 `git revert` Java/前端代码改动 → 重新构建部署。

### 6.3 兼容窗口下线

| 兼容点                                                                      | 下线条件                                                                                                    |
| --------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| 后端 `parseVirtualMusicPlaylistCode` 中识别 `vh_tunehub_*` 旧前缀           | 在生产稳定运行 1 个 release 周期（通常 ≥ 30 天）后，监控该正则命中频次降为 0，然后下一次 release 删除该分支 |
| 前端 `normalizeMusicSourceModeValue` 中 `tunehub_first → meting_first` 映射 | 同上                                                                                                        |
| `vh_tunehub_*` 收藏行（DB 中保留的旧行）                                    | 在两个 release 周期后，再补一个迁移把 `vh_tunehub_*` 收藏全部删除（届时所有客户端都已升级）                 |

### 6.4 部署顺序

1. **后端先发**：含 V1003 迁移 + 后端 `normalizeSourceModeForRead` 兼容旧值。旧前端继续工作（前端发的还是 `tunehub_first`，被后端 normalize 为 `meting_first` 写入；但 V1003 已经把 DB 里值都改成 `meting_*`，所以新写入也是 meting，旧前端拿到 `meting_first` 落到 normalize 兜底显示成 `tunehub_first`，不影响功能）。
2. **前端再发**：识别 `meting_*` 新值；老用户偏好已被 V1003 改写，select 直接选中正确选项。
3. 按 §6.3 安排兼容窗口下线。

## 7. Out-of-Scope（与 R9 对齐）

- `tools/meting-sidecar/`：sidecar 实现稳定，本次不动
- `.kiro/specs/backend-refactor-review/`：只读评审 spec，不动
- 三张平台缓存表（`MDA_MUSIC_TRACK_CACHE` / `MDA_MUSIC_PLAYLIST` / `MDA_USER_MUSIC_PLAYLIST_TRACK`）的 `provider_code` 列：存的是平台编码（netease/kuwo/qq），与聚合源 tunehub 没有引用关系
- `Dockerfile.frontend` 的 `VITE_METING_CONSOLE_URL`：与 TuneHub 无关
- `MetingMusicProvider` 已有方法签名：不修改（gap 分析为零，无需新增方法）
