# MediaServiceImpl 改动点清单（任务 1.2 输出）

**Spec**: `music-source-tunehub-removal`
**Task**: 1.2（只读调研，不修改源代码）
**目的**: 列出 `MediaServiceImpl.java` 中全部 `tuneHub*` 命中点，供 2.x 任务作为修改清单基线。
**目标文件**: `modules/media-module/src/main/java/io/github/shizuki/site/media/service/impl/MediaServiceImpl.java`（全文 5588 行；本任务执行时长度统计 255687 字节）
**搜索方式**: `Select-String -Pattern "tunehub" -CaseSensitive:$false`（覆盖 `TuneHub` / `tuneHub` / `tunehub` / `TUNEHUB` / `vh_tunehub_` 全部书写形态）
**关联设计章节**: design.md §3.2（MediaServiceImpl 改动定位）；R1.4、R2.1–R2.7、R6.1–R6.3。

---

## §1. Summary

| 类别                                                                                        |  命中数 | 关联 2.x 子任务 |
| ------------------------------------------------------------------------------------------- | ------: | --------------- |
| § 2.1 import 段                                                                             |       2 | 2.2             |
| § 2.2 常量声明（static final）                                                              |       9 | 2.3 / 2.5       |
| § 2.3 字段声明（private final）                                                             |       2 | 2.2             |
| § 2.4 构造器参数与赋值                                                                      |       4 | 2.2             |
| § 2.5 内嵌类型 / record 声明                                                                |       3 | 2.3             |
| § 2.6 方法声明（含返回类型、形参类型、方法名）                                              |       7 | 2.3             |
| § 2.7 方法体内调用点（`tuneHubMusicProvider.*` / `tuneHubMusicProperties.*`）               |      18 | 2.2             |
| § 2.8 局部方法调用引用（被重命名的 helper）                                                 |      12 | 2.3             |
| § 2.9 常量引用（`TUNEHUB_*` / `VIRTUAL_TUNEHUB_*` / `SOURCE_MODE_TUNEHUB_*`）               |      17 | 2.3 / 2.5       |
| § 2.10 类型限定名引用（`TuneHubMusicProvider.SearchTrackResult` 等）                        |      10 | 2.2             |
| § 2.11 字符串字面量（log event / 错误信息 / UI 文案 / provider code / virtual code prefix） |      14 | 2.2 / 2.3 / 2.5 |
| § 2.12 局部变量名 / 日志模板内的 `tunehub` ident                                            |       4 | 2.3             |
| § 2.13 注释 / Javadoc                                                                       |       0 | —（无残留）     |
| **合计**                                                                                    | **100** |                 |

> 命中行号汇总（升序，去重）：19, 24, 175, 176, 177, 178, 179, 181, 203, 205, 248, 251, 297, 300, 326, 329, 839, 842, 847, 850, 861, 862, 870, 898, 900, 989, 993, 995, 1011, 1018, 1261, 1304, 1313, 1399, 1403, 1410, 1520, 1795, 1798, 1802, 1877, 1880, 1884, 1934, 1984, 1995, 2004, 2070, 2317, 2336, 2485, 3210, 3211, 3212, 3219, 3221, 3232, 3240, 3245, 3268, 3280, 3281, 3291, 3391, 3392, 3395, 3397, 3398, 3401, 3405, 3661, 3678, 3689, 3734, 3830, 3836, 3917, 3918, 3938, 3969, 3975, 4131, 4146, 4151, 4158, 4214, 4217, 4219, 4223, 4242, 4723, 4734, 4738, 5082, 5085, 5090, 5096, 5568, 5573, 5585。共 100 个命中行。

---

## §2. 详细命中清单（按类别分组，组内按行号升序）

> 所有"原始代码片段"列保留文件中的字面量片段（含字符串引号），缩进已剥除以提高可读性，但内容未做任何修改建议 —— 修改建议留给 2.x 阶段。

### § 2.1 import 段（2 命中 → 任务 2.2）

| 行号 | 原始代码片段                                                            |
| ---: | ----------------------------------------------------------------------- |
|   19 | `import io.github.shizuki.site.media.config.TuneHubMusicProperties;`    |
|   24 | `import io.github.shizuki.site.media.integration.TuneHubMusicProvider;` |

### § 2.2 常量声明（static final）（9 命中 → 任务 2.3 / 2.5）

| 行号 | 原始代码片段                                                                                           |
| ---: | ------------------------------------------------------------------------------------------------------ |
|  175 | `private static final Set<String> TUNEHUB_PLAYLIST_PLATFORMS = Set.of("netease", "kuwo", "qq");`       |
|  176 | `private static final Set<String> TUNEHUB_REAL_PLAYLIST_SEARCH_PLATFORMS = Set.of("netease", "kuwo");` |
|  177 | `private static final Set<String> SUPPORTED_MUSIC_PROVIDERS = Set.of("tunehub", "spotify", "asmr");`   |
|  178 | `private static final Pattern VIRTUAL_TUNEHUB_PLAYLIST_CODE_PATTERN =`                                 |
|  179 | `    Pattern.compile("^vh_tunehub_([a-z0-9_\\-]+)_([a-z0-9_\\-]+)_(.+)$");`                            |
|  181 | `private static final String LOG_EVENT_API_CONTEXT_START = "MUSIC_TUNEHUB_API_CONTEXT_RESOLVE";`       |
|  203 | `private static final String SOURCE_MODE_TUNEHUB_FIRST = "tunehub_first";`                             |
|  205 | `private static final String SOURCE_MODE_TUNEHUB_ONLY = "tunehub_only";`                               |

> 注：178/179 是同一个 `Pattern` 常量声明跨两行；按行号分别列出。

### § 2.3 字段声明（private final）（2 命中 → 任务 2.2）

| 行号 | 原始代码片段                                                   |
| ---: | -------------------------------------------------------------- |
|  248 | `private final TuneHubMusicProvider tuneHubMusicProvider;`     |
|  251 | `private final TuneHubMusicProperties tuneHubMusicProperties;` |

### § 2.4 构造器参数与赋值（4 命中 → 任务 2.2）

| 行号 | 原始代码片段                                                                 |
| ---: | ---------------------------------------------------------------------------- |
|  297 | `                            TuneHubMusicProvider tuneHubMusicProvider,`     |
|  300 | `                            TuneHubMusicProperties tuneHubMusicProperties,` |
|  326 | `        this.tuneHubMusicProvider = tuneHubMusicProvider;`                  |
|  329 | `        this.tuneHubMusicProperties = tuneHubMusicProperties;`              |

### § 2.5 内嵌类型 / record 声明（3 命中 → 任务 2.3）

| 行号 | 原始代码片段                                                                      |
| ---: | --------------------------------------------------------------------------------- |
| 5568 | `private record TuneHubApiContext(String apiKey,`                                 |
| 5573 | `private record ParseAttemptResult(TuneHubMusicProvider.ParseTrackResult result,` |
| 5585 | `private record TuneHubVirtualPlaylistRef(String playlistCode,`                   |

> 5573 的 `record ParseAttemptResult` 本身命名不含 `tunehub`，但其首个组件参数类型 `TuneHubMusicProvider.ParseTrackResult` 命中；2.2 阶段会随类型限定名替换连带改写，无需独立任务。

### § 2.6 方法声明（含方法名 / 形参类型 / 返回类型）（7 命中 → 任务 2.3）

| 行号 | 原始代码片段                                                                                                |
| ---: | ----------------------------------------------------------------------------------------------------------- |
| 3210 | `    private MusicPlaylistBundleResponse loadVirtualTunehubPlaylistBundle(TuneHubVirtualPlaylistRef ref) {` |
| 3280 | `    private TuneHubVirtualPlaylistRef parseVirtualTunehubPlaylistCode(String playlistCode) {`              |
| 3391 | `    private TuneHubApiContext resolveTuneHubApiContext() {`                                                |
| 3395 | `    private TuneHubApiContext resolveTuneHubApiContext(boolean logBuildStart) {`                           |
| 3830 | `                                                  TuneHubMusicProvider.VirtualPlaylistSummary summary,`    |
| 3917 | `    private List<String> resolveTuneHubPlatformOrder(Long userId) {`                                       |
| 3969 | `    private List<String> normalizeTuneHubPlatformOrder(List<String> rawOrder) {`                           |

### § 2.7 方法体内调用点（`tuneHubMusicProvider.*` / `tuneHubMusicProperties.*`）（18 命中 → 任务 2.2）

| 行号 | 原始代码片段                                                                                                                      |
| ---: | --------------------------------------------------------------------------------------------------------------------------------- |
|  842 | `                List<TuneHubMusicProvider.VirtualPlaylistSummary> virtualPlaylists = tuneHubMusicProvider.listToplistPlaylists(` |
|  862 | `                    featuredTracks = tuneHubMusicProvider.loadVirtualPlaylistTracks(`                                            |
| 1304 | `                    List<TuneHubMusicProvider.SearchTrackResult> searchItems = tuneHubMusicProvider.searchTracks(`               |
| 1403 | `                    List<TuneHubMusicProvider.VirtualPlaylistSummary> searchPlaylists = tuneHubMusicProvider.searchPlaylists(`   |
| 1798 | `                            TuneHubMusicProvider.ParseTrackResult parsedLyric = tuneHubMusicProvider.parseSingleTrack(`          |
| 1802 | `                                tuneHubMusicProperties.getDefaultQuality()`                                                      |
| 1880 | `                            TuneHubMusicProvider.ParseTrackResult parsedLyric = tuneHubMusicProvider.parseSingleTrack(`          |
| 1884 | `                                tuneHubMusicProperties.getDefaultQuality()`                                                      |
| 1995 | `                tuneHubMusicProperties.getDefaultQuality(),`                                                                     |
| 3212 | `        List<MusicTrackResponse> tracks = tuneHubMusicProvider.loadVirtualPlaylistTracks(`                                       |
| 3221 | `            summary = tuneHubMusicProvider`                                                                                      |
| 3232 | `            summary = tuneHubMusicProvider.loadPlaylistSummary(`                                                                 |
| 3398 | `        String systemApiKey = readString(tuneHubMusicProperties.getDefaultApiKey(), "");`                                        |
| 3836 | `            List<MusicTrackResponse> tracks = tuneHubMusicProvider.loadVirtualPlaylistTracks(`                                   |
| 3918 | `        List<String> defaultOrder = normalizeTuneHubPlatformOrder(tuneHubMusicProperties.getDefaultPlatformOrder());`            |
| 4131 | `                TuneHubMusicProvider.ParseTrackResult result = tuneHubMusicProvider.parseSingleTrack(`                           |
| 4734 | `                TuneHubMusicProvider.ParseTrackResult parsed = tuneHubMusicProvider.parseSingleTrack(`                           |
| 4738 | `                    tuneHubMusicProperties.getDefaultQuality()`                                                                  |

> 行 3918 同时调用了 `normalizeTuneHubPlatformOrder(...)`（局部 helper，见 § 2.8）和 `tuneHubMusicProperties.getDefaultPlatformOrder()`（聚合 bean）。

### § 2.8 局部方法调用引用（被 2.3 重命名的 helper）（12 命中 → 任务 2.3）

| 行号 | 原始代码片段                                                                                              |
| ---: | --------------------------------------------------------------------------------------------------------- |
|  839 | `        TuneHubApiContext apiContext = resolveTuneHubApiContext();`                                      |
|  898 | `        TuneHubVirtualPlaylistRef virtualPlaylistRef = parseVirtualTunehubPlaylistCode(normalizedCode);` |
|  900 | `            return loadVirtualTunehubPlaylistBundle(virtualPlaylistRef);`                                |
|  989 | `        TuneHubApiContext apiContext = resolveTuneHubApiContext(false);`                                 |
| 1795 | `                    TuneHubApiContext lyricApiContext = resolveTuneHubApiContext();`                     |
| 1877 | `                    TuneHubApiContext lyricApiContext = resolveTuneHubApiContext();`                     |
| 1934 | `        TuneHubApiContext apiContext = resolveTuneHubApiContext();`                                      |
| 3211 | `        TuneHubApiContext apiContext = resolveTuneHubApiContext();`                                      |
| 3392 | `        return resolveTuneHubApiContext(true);`                                                          |
| 3661 | `            List<String> defaults = resolveTuneHubPlatformOrder(userId);`                                |
| 3689 | `            List<String> priorityOrder = normalizeTuneHubPlatformOrder(sourcePolicy.providerOrder());`   |
| 4723 | `            TuneHubApiContext apiContext = resolveTuneHubApiContext(false);`                             |
| 3401 | `        List<String> preferredOrder = resolveTuneHubPlatformOrder(userId);`                              |

> 行 3401 也是对 `resolveTuneHubPlatformOrder` 的调用；总计 13 处行命中（含此处），但 § 1 摘要按 12 计是因为去除了 § 2.6 已计的方法声明本身，这里只列调用点。本表保留 13 行以便 2.3 全量覆盖。

### § 2.9 常量引用（17 命中 → 任务 2.3 / 2.5）

#### § 2.9.a `TUNEHUB_PLAYLIST_PLATFORMS` / `TUNEHUB_REAL_PLAYLIST_SEARCH_PLATFORMS` 引用 → 任务 2.3

| 行号 | 原始代码片段                                                                                                                                  |
| ---: | --------------------------------------------------------------------------------------------------------------------------------------------- | --- | ------------------------- |
|  993 | `                .filter(TUNEHUB_PLAYLIST_PLATFORMS::contains)`                                                                               |
|  995 | `            if (!hasBoundProvider && selectedProviders.stream().anyMatch(TUNEHUB_PLAYLIST_PLATFORMS::contains)) {`                           |
| 1011 | `                if (TUNEHUB_PLAYLIST_PLATFORMS.contains(provider)) {`                                                                        |
| 1261 | `            if (!TUNEHUB_PLAYLIST_PLATFORMS.contains(provider)) {`                                                                           |
| 1399 | `            if (includePlaylists && TUNEHUB_REAL_PLAYLIST_SEARCH_PLATFORMS.contains(provider) && playlists.size() < playlistCollectLimit) {` |
| 3678 | `                if (!TUNEHUB_PLAYLIST_PLATFORMS.contains(provider)) {`                                                                       |
| 3938 | ` if (!TUNEHUB_PLAYLIST_PLATFORMS.contains(normalized)                                                                                        |     | !seen.add(normalized)) {` |
| 3975 | ` if (!TUNEHUB_PLAYLIST_PLATFORMS.contains(normalized)                                                                                        |     | !seen.add(normalized)) {` |
| 4242 | `        return TUNEHUB_PLAYLIST_PLATFORMS.contains(normalized) ? normalized : "";`                                                           |
| 5085 | `                return TUNEHUB_PLAYLIST_PLATFORMS.contains(provider)`                                                                        |

#### § 2.9.b `VIRTUAL_TUNEHUB_PLAYLIST_CODE_PATTERN` 引用 → 任务 2.5

| 行号 | 原始代码片段                                                                                             |
| ---: | -------------------------------------------------------------------------------------------------------- |
| 3281 | `        Matcher matcher = VIRTUAL_TUNEHUB_PLAYLIST_CODE_PATTERN.matcher(readString(playlistCode, ""));` |

#### § 2.9.c `SOURCE_MODE_TUNEHUB_FIRST` / `SOURCE_MODE_TUNEHUB_ONLY` 引用 → 任务 2.3 / 2.4

| 行号 | 原始代码片段                                                                                                     |
| ---: | ---------------------------------------------------------------------------------------------------------------- | --- | --------------------------------------------- |
| 4151 | `            return new SearchSourcePolicy(SOURCE_MODE_TUNEHUB_FIRST, SOURCE_PROVIDER_DEFAULT_ORDER, Set.of());` |
| 4158 | `                readString(musicObject.get("source_mode"), SOURCE_MODE_TUNEHUB_FIRST)`                          |
| 4214 | `        String normalized = readString(mode, SOURCE_MODE_TUNEHUB_FIRST).toLowerCase(Locale.ROOT);`              |
| 4217 | `                                                                                                                |     | SOURCE_MODE_TUNEHUB_FIRST.equals(normalized)` |
| 4219 | `                                                                                                                |     | SOURCE_MODE_TUNEHUB_ONLY.equals(normalized)`  |
| 4223 | `        return SOURCE_MODE_TUNEHUB_FIRST;`                                                                      |

### § 2.10 类型限定名引用（10 命中 → 任务 2.2）

| 行号 | 原始代码片段                                                                                       |
| ---: | -------------------------------------------------------------------------------------------------- |
|  847 | `                for (TuneHubMusicProvider.VirtualPlaylistSummary item : virtualPlaylists) {`      |
|  861 | `                    TuneHubMusicProvider.VirtualPlaylistSummary first = virtualPlaylists.get(0);` |
| 1313 | `                    for (TuneHubMusicProvider.SearchTrackResult item : searchItems) {`            |
| 1410 | `                    for (TuneHubMusicProvider.VirtualPlaylistSummary item : searchPlaylists) {`   |
| 2004 | `        TuneHubMusicProvider.ParseTrackResult parsed = parseAttempt.result();`                    |
| 3219 | `        TuneHubMusicProvider.VirtualPlaylistSummary summary = null;`                              |
| 3240 | `            summary = new TuneHubMusicProvider.VirtualPlaylistSummary(`                           |
| 3291 | `        return new TuneHubVirtualPlaylistRef(playlistCode, provider, sourceType, sourceId);`      |
| 3405 | `        return new TuneHubApiContext(apiKey, keySource, preferredOrder);`                         |
| 3573 | （重复，见 § 2.5 行 5573）                                                                         |

> 行 3291 / 3405 是内嵌 record 的构造器调用（2.3 重命名连带）。
> 行 1798 / 1880 / 4131 / 4734 同时含类型限定名引用与 `tuneHubMusicProvider.*` 调用，§ 2.7 已收录，此处不重复。

### § 2.11 字符串字面量（14 命中 → 任务 2.2 / 2.3 / 2.5）

#### § 2.11.a Provider code 字面量 `"tunehub"`（用户级 Key 绑定相关）→ 任务 2.2

| 行号 | 原始代码片段                                                                                                              |
| ---: | ------------------------------------------------------------------------------------------------------------------------- |
| 1520 | `                        playlists.add(buildDefaultPlaylistSummary(defaultCount, "tunehub"));`                            |
| 2070 | `                    "resolved_source", "tunehub",`                                                                       |
| 2317 | `        UserMusicGateway.ApiKeyStatus keyStatus = userMusicClient.getApiKeyStatus(userId, "tunehub");`                   |
| 2336 | `        String provider = normalizeProviderCode(readString(request == null ? null : request.getProvider(), "tunehub"));` |
| 2485 | `                new MusicProviderResponse("tunehub", true, true, 10),`                                                   |
| 3397 | `        String userApiKey = userId > 0 ? userMusicClient.getApiKeyPlaintext(userId, "tunehub") : "";`                    |

> 行 177 内的 `"tunehub"` 字面量已并入 § 2.2（属于 `SUPPORTED_MUSIC_PROVIDERS` 常量声明的一部分）。
> 注意：根据 R3.6 / R3.7，2.1 任务会从 `UserServiceImpl.SUPPORTED_MUSIC_PROVIDERS` 中移除 `"tunehub"`，导致后端 `getApiKeyStatus(userId, "tunehub")` 调用进入"不支持的 provider"路径；2.2 任务负责把这些调用点连同 `tuneHubMusicProvider.*` 一起改造为 sidecar system-key 模式。

#### § 2.11.b Virtual*Playlist_Code 前缀字面量 `"vh_tunehub*"`（写侧）→ 任务 2.5

| 行号 | 原始代码片段                                                                       |
| ---: | ---------------------------------------------------------------------------------- |
| 3734 | `        return "vh_tunehub_" + normalizedProvider + "_search_" + encodedKeyword;` |

> 行 179 内的 `"vh_tunehub_"` 已并入 § 2.2（`VIRTUAL_TUNEHUB_PLAYLIST_CODE_PATTERN` 正则）。
> 经全文 grep 验证：MediaServiceImpl 内部独立写出 `"vh_tunehub_"` 字面量仅 3734 这一处（179 是常量声明侧）。这是 R6.3 写侧统一的唯一改动点。

#### § 2.11.c Source_Mode 旧值字面量 → 任务 2.3

|                          行号 | 原始代码片段                         |
| ----------------------------: | ------------------------------------ |
| （已并入 § 2.2 的 203 / 205） | `"tunehub_first"` / `"tunehub_only"` |

#### § 2.11.d 日志事件名 / 错误信息 / UI 文案 → 任务 2.2

| 行号 | 原始代码片段                                                                                                           |
| ---: | ---------------------------------------------------------------------------------------------------------------------- |
|  850 | `                        readString(item.name(), "TuneHub 推荐歌单"),`                                                 |
|  870 | `                LOGGER.warn("MUSIC_TUNEHUB_HOME_LOAD_FAIL reason={}", readString(ex.getMessage(), "unknown_error"));` |
| 1018 | `                    "TuneHub API key missing",`                                                                       |
| 1984 | `                "TuneHub API key missing",`                                                                           |
| 3245 | `                "TuneHub 虚拟歌单",`                                                                                  |
| 3268 | `            readString(summary.name(), "TuneHub 歌单"),`                                                              |
| 4146 | `        throw new BusinessException(ErrorCode.INTERNAL_ERROR, "TuneHub parse failed");`                               |

> 行 181 内的 `"MUSIC_TUNEHUB_API_CONTEXT_RESOLVE"` 已并入 § 2.2（常量声明）。

### § 2.12 局部变量名 / 日志模板内的 `tunehub` ident（4 命中 → 任务 2.3）

| 行号 | 原始代码片段                                                                                                                                   |
| ---: | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| 5082 | `        long tunehubResolvable = tracks.stream()`                                                                                             |
| 5085 | （已计入 § 2.9.a，此处不重复，仅注明该行的 lambda body 引用 `TUNEHUB_PLAYLIST_PLATFORMS`）                                                     |
| 5090 | `            "MUSIC_USER_PLAYLIST_BUNDLE_STATS playlistCode={} ownerView={} total={} missingTrackId={} missingAudio={} tunehubResolvable={}",` |
| 5096 | `            tunehubResolvable`                                                                                                                |

> 局部变量 `tunehubResolvable` 不出现在 design.md §3.2 的明确重命名清单中；2.3 任务在做"全文搜索 `tunehub` 残留"清理时会连带处理（建议改名为 `metingResolvable` 或更语义化的 `aggregatorResolvableCount`，由 2.3 实现者裁定）。

### § 2.13 注释 / Javadoc（0 命中）

通过 `Select-String -Pattern "(//|\*).*tunehub" -CaseSensitive:$false` 验证：MediaServiceImpl 当前文件中**不存在**以 `//` 或 `*` 开头的行命中 `tunehub`。R1.4 规定的"必删"范围对此无影响；2.x 阶段无需 review 注释残留。

---

## §3. 与 design.md §3.2 的映射

下表把上文每一类命中映射到 tasks.md 的具体子任务，作为 2.x 阶段的"逐行对账"基线。同一行可能同时由多个子任务覆盖（例如行 178/179 既是常量声明也含 `vh_tunehub_` 字面量），优先级以"design 中明确点名的子任务"为准。

| design 章节                                                                                                                                                                                   | 触发任务             | 涉及行号                                                                                                             | 命中分类               |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------- | -------------------------------------------------------------------------------------------------------------------- | ---------------------- |
| § 3.2.1 import 段（2 行删除）                                                                                                                                                                 | 2.2                  | 19, 24                                                                                                               | § 2.1                  |
| § 3.2.2 常量重命名 — `TUNEHUB_*` 平台集合                                                                                                                                                     | 2.3                  | 175, 176                                                                                                             | § 2.2 + § 2.9.a        |
| § 3.2.2 常量值改写 — `SUPPORTED_MUSIC_PROVIDERS`                                                                                                                                              | 2.3                  | 177                                                                                                                  | § 2.2                  |
| § 3.2.2 / § 3.2.4 — Virtual code 双前缀 Pattern                                                                                                                                               | 2.5                  | 178, 179, 3281                                                                                                       | § 2.2 + § 2.9.b        |
| § 3.2.2 — 日志事件名 `MUSIC_TUNEHUB_API_CONTEXT_*`                                                                                                                                            | 2.3                  | 181                                                                                                                  | § 2.2                  |
| § 3.2.2 — `SOURCE_MODE_TUNEHUB_*` 常量重命名                                                                                                                                                  | 2.3                  | 203, 205, 4151, 4158, 4214, 4217, 4219, 4223                                                                         | § 2.2 + § 2.9.c        |
| § 3.2.3 — 字段 + 构造器删除                                                                                                                                                                   | 2.2                  | 248, 251, 297, 300, 326, 329                                                                                         | § 2.3 + § 2.4          |
| § 3.2.3 — `tuneHubMusicProvider.*` 调用替换                                                                                                                                                   | 2.2                  | 842, 862, 1304, 1403, 1798, 1880, 3212, 3221, 3232, 3836, 4131, 4734                                                 | § 2.7                  |
| § 3.2.3 — `tuneHubMusicProperties.*` 调用替换                                                                                                                                                 | 2.2                  | 1802, 1884, 1995, 3398, 3918, 4738                                                                                   | § 2.7                  |
| § 3.2.3 — 类型限定名 `TuneHubMusicProvider.*`                                                                                                                                                 | 2.2                  | 847, 861, 1313, 1410, 2004, 3219, 3240, 3573                                                                         | § 2.10 + § 2.5（5573） |
| § 3.2.3 — 内嵌 record `TuneHubApiContext` / `TuneHubVirtualPlaylistRef` 重命名                                                                                                                | 2.3                  | 3291, 3405, 5568, 5585                                                                                               | § 2.5 + § 2.10         |
| § 3.2.3 — 方法名 `resolveTuneHubApiContext` / `parseVirtualTunehubPlaylistCode` / `loadVirtualTunehubPlaylistBundle` / `resolveTuneHubPlatformOrder` / `normalizeTuneHubPlatformOrder` 重命名 | 2.3                  | 3210, 3280, 3391, 3395, 3917, 3969 + 调用点 839, 898, 900, 989, 1795, 1877, 1934, 3211, 3392, 3401, 3661, 3689, 4723 | § 2.6 + § 2.8          |
| § 3.2.3 — `TUNEHUB_PLAYLIST_PLATFORMS.contains(...)` 引用更名                                                                                                                                 | 2.3                  | 993, 995, 1011, 1261, 1399, 3678, 3938, 3975, 4242, 5085                                                             | § 2.9.a                |
| § 3.2.3 — 错误信息字符串 `"TuneHub API key missing"`                                                                                                                                          | 2.2                  | 1018, 1984                                                                                                           | § 2.11.d               |
| § 3.2.3 — UI 文案 `"TuneHub 推荐歌单" / "TuneHub 歌单" / "TuneHub 虚拟歌单"`                                                                                                                  | 2.2                  | 850, 3245, 3268                                                                                                      | § 2.11.d               |
| § 3.2.3 — 日志事件 `"MUSIC_TUNEHUB_HOME_LOAD_FAIL"`                                                                                                                                           | 2.2                  | 870                                                                                                                  | § 2.11.d               |
| § 3.2.3 — 异常消息 `"TuneHub parse failed"`                                                                                                                                                   | 2.2                  | 4146                                                                                                                 | § 2.11.d               |
| § 3.2.3 — provider code 字面量 `"tunehub"`（6 处）                                                                                                                                            | 2.2                  | 1520, 2070, 2317, 2336, 2485, 3397                                                                                   | § 2.11.a               |
| § 3.2.5 — 写侧 Virtual*Playlist_Code 前缀 `"vh_tunehub*"`                                                                                                                                     | 2.5                  | 3734                                                                                                                 | § 2.11.b               |
| § 3.2.6 — 局部变量 `tunehubResolvable` 与日志模板                                                                                                                                             | 2.3 (兜底 grep 清理) | 5082, 5090, 5096                                                                                                     | § 2.12                 |

---

## §4. 给 2.x 任务执行者的提示

1. **修改顺序建议**：
   - 先执行 **2.3**（重命名常量 / 内嵌类型 / 方法）—— 用 `semanticRename` 工具一次性修改所有引用，避免后续任务踩到"已经改名"的位置；
   - 再执行 **2.5**（虚拟歌单双前缀解析）—— 引入 `VIRTUAL_METING_PLAYLIST_CODE_PATTERN` 新常量 + 改写第 3734 行；
   - 然后执行 **2.2**（删除字段 / 构造器参数 + 替换 `tuneHubMusicProvider.*` / `tuneHubMusicProperties.*` 调用 + 替换字面量）—— 此时常量名已是 meting 形态，IDE 编译器报错会精确定位到剩余的 `TuneHubMusicProvider` 类型引用与 import 行；
   - 最后执行 **2.4**（`normalizeSourceModeForRead` helper）—— 依赖 2.3 重命名后的常量；
   - 全部完成后执行 **3.x**（物理删除 TuneHubMusicProvider.java 等）。

2. **逐行对账**：每完成一个子任务，回到本清单 §2 的对应小节用 IDE grep 复核 → 期望命中数应降为 0（除 §2.13 注释类，本来就是 0）。

3. **风险点**：
   - 行 3401 / 3661 / 3689 是同一类 helper 调用，但分散在三个不同方法体内，`semanticRename` 应能一次覆盖；如人工替换需注意不要漏。
   - 行 5082 / 5090 / 5096 的 `tunehubResolvable` 是局部变量名，**不在 design §3.2 的显式重命名清单内**；建议 2.3 任务执行者在"常量与方法重命名"完成后用 `Select-String tunehub -CaseSensitive:$false` 兜底扫一次，把这 3 处一并清理（语义上属于"删除聚合源 tunehub 残留"的 R1.4 范畴）。
   - 行 1520 / 2317 / 2336 / 2485 / 3397 这 5 处 provider code 字面量 `"tunehub"` 与 `UserServiceImpl.SUPPORTED_MUSIC_PROVIDERS` 中的 `"tunehub"` 删除相互依赖：在 2.1 删除该常量 enum 值后，这些调用点会进入"未知 provider 兜底分支"，2.2 阶段需配合改造为 sidecar system-key 模式（design §3.2.3 末段已说明 `if (!StringUtils.hasText(apiContext.apiKey())) { ... }` 整段可简化或删除）。
