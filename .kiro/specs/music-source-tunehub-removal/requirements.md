# Requirements Document

## Introduction

本 spec 的目标是**彻底删除 TuneHub 远端音乐源在 shizuki-site 中的所有兼容代码、配置、数据库记录与文档残留**，
让 netease / kuwo / qq 三个平台的"搜索 / 歌单 / 试听 / 解析播放"全部统一改走仓库内置的本地 sidecar
`tools/meting-sidecar/`（基于开源 `metowolf/Meting`，已通过 docker compose 装配在 monolith 周边）。
切换后，系统对外**不再要求最终用户绑定任何"音乐聚合源 API Key"**——Meting sidecar 由部署方在私网内提供，
对最终用户透明。

切换过程必须满足：

- **零数据破坏**：现网 `MDA_MUSIC_TRACK_CACHE` / `MDA_USER_MUSIC_PLAYLIST_TRACK` / `MDA_MUSIC_PLAYLIST`
  中已存在的曲目缓存与用户歌单条目不丢失（这些表的 `provider_code` 存放的是平台编码 netease/kuwo/qq，
  与本次被删除的聚合源 `tunehub` 没有引用关系）。
- **平滑过渡**：旧用户持久化的偏好值（`USR_PREFERENCE.preference_json` 中的
  `music.source_mode = 'tunehub_first' | 'tunehub_only'`）以及历史虚拟歌单编码
  （`vh_tunehub_<platform>_<type>_<id>`）必须在切换后仍可被解析或被一次性迁移，
  不得让现网登录用户出现"打开收藏的歌单 → 404"。
- **生产链路单一可追**：active Flyway 路径只有 `apps/monolith-app/.../monolith/db/migration-pg/`，
  本次新增的 PG 迁移是唯一一条会真正在生产生效的脚本；其它 MySQL 旧档与模块级 dormant 迁移按"保持
  与 PG 等价"原则同步更新。

本文档采用 EARS（Easy Approach to Requirements Syntax）+ INCOSE 质量规则编写。

## Glossary

- **Backend**：后端单体服务 `apps/monolith-app`，含 `modules/media-module` / `modules/user-module` 等模块。
- **Frontend**：前端项目 `fronted/vue3-merged/`（Vue 3 + Vite）。
- **Meting_Sidecar**：仓库内 `tools/meting-sidecar/`，基于 `metowolf/Meting` 的 PHP 服务，
  对内暴露 HTTP 接口 `/v1/search` / `/v1/playlist` / `/v1/track/resolve` / `/health`，
  在容器网络内通过主机名 `meting-api` 访问。
- **Meting_Provider**：后端 Java 类
  `io.github.shizuki.site.media.integration.MetingMusicProvider`，
  封装对 Meting_Sidecar 的调用。
- **Tunehub_Provider**：后端旧类
  `io.github.shizuki.site.media.integration.TuneHubMusicProvider`，
  封装对外网 TuneHub 服务（`https://tunehub.sayqz.com`）的调用，本 spec 要将其连同
  `TuneHubMusicProperties`、相关测试一并删除。
- **Aggregator_Provider_Code**：聚合源 provider 编码（出现在
  `MDA_MUSIC_PROVIDER_CONFIG.provider_code` / `USR_PROVIDER_SECRET.provider_code` / 前端
  `METING_API_PROVIDER` 常量）。本 spec 完成后只剩 `meting` / `spotify` / `asmr`，不再有 `tunehub`。
- **Platform_Provider_Code**：平台 provider 编码 `netease` / `kuwo` / `qq`，
  存放在 `MDA_MUSIC_TRACK_CACHE.provider_code` / `MDA_MUSIC_PLAYLIST.provider_code` /
  `MDA_USER_MUSIC_PLAYLIST_TRACK.provider_code` 等表中，**不在本次删除范围**。
- **Virtual_Playlist_Code**：虚拟歌单业务编码，旧格式 `vh_tunehub_<platform>_<type>_<id>`，
  新格式 `vh_meting_<platform>_<type>_<id>`。
- **Source_Mode**：用户偏好里的音乐源策略枚举，旧值集合 `{account_first, tunehub_first,
account_only, tunehub_only}`，新值集合 `{account_first, meting_first, account_only, meting_only}`。
- **Active_Flyway_Path**：当前生产 PG 部署使用的 Flyway 迁移目录
  `classpath:monolith/db/migration-pg`（在 `apps/monolith-app/src/main/resources/application.yml`
  通过 `spring.flyway.locations` 显式指定）。
- **Dormant_Migration_Path**：休眠的迁移目录，包括 `apps/monolith-app/.../monolith/db/migration/`
  （MySQL 旧档，仅 `application-mysql.yml` profile 启用）与 `modules/<x>-module/.../db/migration/`
  （为未来微服务拆分预留，运行时不加载）。

## Requirements

### Requirement 1: 删除后端 TuneHub 客户端与配置类

**User Story:** 作为后端维护者，我希望仓库中不再保留任何 TuneHub 相关的 Java 类型与配置类，
以便代码库不再承担外网 TuneHub 服务的编译与依赖负担。

#### Acceptance Criteria

1. THE Backend SHALL 在编译产物与源码树中移除文件
   `modules/media-module/src/main/java/io/github/shizuki/site/media/integration/TuneHubMusicProvider.java`。
2. THE Backend SHALL 在编译产物与源码树中移除文件
   `modules/media-module/src/main/java/io/github/shizuki/site/media/config/TuneHubMusicProperties.java`。
3. THE Backend SHALL 在编译产物与源码树中移除文件
   `modules/media-module/src/test/java/io/github/shizuki/site/media/integration/TuneHubMusicProviderSearchParserTest.java`。
4. WHEN 任何 Java 源文件被编辑后，THE Backend SHALL 不残留对符号 `TuneHubMusicProvider`
   或 `TuneHubMusicProperties` 的 import / 类型引用 / 字段声明 / 构造器参数 / 方法调用。
5. WHEN 全仓库（排除 `tools/reverse/output/`、`.git/`、`.beads/dolt/` 等只读产物目录）执行
   不区分大小写的子串搜索 `tunehub` 时，THE Backend SHALL 仅命中：
   - 本 spec 目录下的文档文件；
   - 数据库迁移脚本中作为 `WHERE provider_code = 'tunehub'` 出现的清理条件；
   - 历史只读产物目录（`tools/reverse/output/` 内反编译产物，与本仓库代码无关）。
     不得在 `apps/`、`modules/`、`model/`、`fronted/`、`resouces/yaml/`、`apps/monolith-app/.../application.yml`、
     `deploy/`、`postman/` 中残留。

### Requirement 2: 后端核心调用路径切换到 Meting_Provider

**User Story:** 作为后端维护者，我希望音乐搜索 / 歌单 / 解析播放的所有请求路径都改由
`MetingMusicProvider` 承担，以便外部依赖只剩仓库内置 sidecar。

#### Acceptance Criteria

1. THE Backend SHALL 在 `MediaServiceImpl` 中将原本调用 `tuneHubMusicProvider.searchTracks(...)`
   的位置改为调用 `metingMusicProvider.searchTracks(...)`，且方法签名语义保持等价。
2. THE Backend SHALL 在 `MediaServiceImpl` 中将原本调用 `tuneHubMusicProvider.searchPlaylists(...)`
   的位置改为调用 `metingMusicProvider.searchPlaylists(...)`。
3. THE Backend SHALL 在 `MediaServiceImpl` 中将原本调用
   `tuneHubMusicProvider.loadVirtualPlaylistTracks(...)` 与
   `tuneHubMusicProvider.loadPlaylistSummary(...)` 的位置改为调用对应的
   `metingMusicProvider.*` 方法。
4. THE Backend SHALL 在 `MediaServiceImpl` 中将原本调用
   `tuneHubMusicProvider.parseSingleTrack(...)` 与
   `tuneHubMusicProvider.listToplistPlaylists(...)` 的位置改为调用对应的
   `metingMusicProvider.*` 方法。
5. WHEN `MediaServiceImpl` 注入 bean 时，THE Backend SHALL 仅注入 `MetingMusicProvider`，
   不再注入 `TuneHubMusicProvider` 或 `TuneHubMusicProperties`。
6. THE Backend SHALL 将 `MediaServiceImpl` 中读取
   `tuneHubMusicProperties.getDefaultQuality()` 的位置改为读取 `MetingMusicProperties.getDefaultQuality()`。
7. THE Backend SHALL 将 `MediaServiceImpl` 中读取
   `tuneHubMusicProperties.getDefaultApiKey()` 的位置改为读取 `MetingMusicProperties.getDefaultApiKey()`，
   且新值在容器网络内默认为常量 `meting-system`（无需用户绑定）。
8. WHERE 现有 `MetingMusicProvider` 公共方法集合不能完整覆盖被替换的 `TuneHubMusicProvider`
   方法语义，THE Backend SHALL 在 Design 阶段对每个缺口（gap）给出补齐方案，并在 Tasks 阶段拆为
   独立子任务实现，不得降低覆盖到下面任何能力：
   - `searchTracks(apiKey, platform, keyword, page, limit) -> List<SearchTrackResult>`；
   - `searchPlaylists(apiKey, platform, keyword, page, limit) -> List<VirtualPlaylistSummary>`；
   - `listToplistPlaylists(apiKey, platformOrder, limitPerPlatform) -> List<VirtualPlaylistSummary>`；
   - `loadPlaylistSummary(apiKey, platform, sourceType, sourceId) -> VirtualPlaylistSummary`；
   - `loadVirtualPlaylistTracks(apiKey, platform, sourceType, sourceId) -> List<MusicTrackResponse>`；
   - `parseSingleTrack(apiKey, platform, trackId, quality) -> ParseTrackResult`；
   - `buildDefaultPlaylist(apiKey, platformOrder, limit) -> DynamicPlaylistResult`；
   - `listSupportedPlatforms() -> Set<String>`。

### Requirement 3: 删除聚合源 API Key UX 与持久化

**User Story:** 作为最终用户，我不应再被要求为系统内置音乐源（Meting）输入或维护任何 API Key，
以便音乐源切换对我完全透明。

#### Acceptance Criteria

1. THE Frontend SHALL 在 `fronted/vue3-merged/src/components/music/MusicRightPanel.vue`
   中移除"Meting Key"折叠卡片的整段（含 API Key 输入框、保存按钮、删除按钮、刷新状态按钮、
   状态文案、相关 prop / event 声明）。
2. THE Frontend SHALL 在 `fronted/vue3-merged/src/pages/MusicLibraryPage.vue` 中移除
   常量 `METING_API_PROVIDER`、状态 `tunehubKeyInput` / `tunehubStatus` / `tunehubBusy`、
   方法 `loadTunehubStatus` / `handleSaveTunehubKey` / `handleDeleteTunehubKey` 及其全部调用点。
3. THE Frontend SHALL 在 `fronted/vue3-merged/src/pages/ProfilePage.vue` 中移除
   "Meting Key 管理"区块（含 `musicTunehubKeyInput` / `musicTunehubBusy` /
   `musicTunehubStatus` / `loadMusicTunehubStatus` / `saveMusicTunehubKey` /
   `deleteMusicTunehubKey` 及其模板节点）。
4. THE Frontend SHALL 在 `fronted/vue3-merged/src/pages/musicLibraryUiState.js` 中
   移除对 `'tunehub'` 字面量的特判分支，仅保留对 `'spotify'` 等仍需展开面板的合法 provider 的判断。
5. WHEN 一个登录用户进入音乐页或个人中心时，THE Frontend SHALL 不发起任何
   `getMusicApiKeyStatus('tunehub' | 'meting')` 或 `upsertMusicApiKey('tunehub' | 'meting')` 或
   `deleteMusicApiKey('tunehub' | 'meting')` HTTP 请求。
6. THE Backend SHALL 在 `modules/user-module/.../service/impl/UserServiceImpl.java` 的
   `SUPPORTED_MUSIC_PROVIDERS` 常量集合中移除 `"tunehub"` 与 `"meting"` 两个值
   （因为新流程不再支持任何用户级聚合源 Key 绑定），且
   `SUPPORTED_MUSIC_SOURCE_PROVIDERS` 与 `DEFAULT_SOURCE_PROVIDER_ORDER` 也不得再
   包含 `"tunehub"`。
7. WHEN 调用 `POST /api/v1/me/music/api-keys/{provider}` 时，IF `provider` 取值为 `tunehub`
   或 `meting`，THEN THE Backend SHALL 返回 `400 Bad Request` 携带 ErrorCode
   `MUSIC_PROVIDER_NOT_SUPPORTED`（业务语义："系统已不支持此 provider 的用户级 Key 绑定"）。
8. THE Backend SHALL 删除 `USR_PROVIDER_SECRET` 表中所有 `provider_code IN ('tunehub','meting')`
   的现存行（通过 Active_Flyway_Path 下的新增 PG 迁移脚本完成；非软删，直接物理删除，因为 cipher_text
   是无业务价值的过时密钥）。

### Requirement 4: 数据库 provider_code 切换迁移（PG）

**User Story:** 作为运维，我希望生产 PostgreSQL 部署在升级后只看到一条
`MDA_MUSIC_PROVIDER_CONFIG.provider_code = 'meting'` 行，并保留 enabled / visible / sort_num
等用户已调过的运营字段。

#### Acceptance Criteria

1. THE Backend SHALL 在 `apps/monolith-app/src/main/resources/monolith/db/migration-pg/`
   下新增 PG 迁移脚本（版本号紧接 V1002，即 `V1003__music_tunehub_to_meting.sql`）。
2. WHEN 该 PG 迁移执行完毕，THE Backend SHALL 保证：
   - `MDA_MUSIC_PROVIDER_CONFIG` 表中存在唯一的 `provider_code = 'meting'` 行，
     其 `enabled_flag` / `visible_flag` / `sort_num` 继承自原 `tunehub` 行（若原行不存在则使用默认 `1, 1, 10`）；
   - `MDA_MUSIC_PROVIDER_CONFIG` 表中不存在任何 `provider_code = 'tunehub'` 的行；
   - `MDA_MUSIC_PROVIDER_GUIDE` 表中存在 `provider_code = 'meting'` 的引导行，文案为
     "Meting 为系统内置服务，无需用户 API Key"，且不存在 `provider_code = 'tunehub'` 的行。
3. WHEN 该 PG 迁移执行完毕，THE Backend SHALL 删除 `USR_PROVIDER_SECRET` 表中所有
   `provider_code IN ('tunehub','meting')` 的行（详见 Requirement 3.8）。
4. WHEN 该 PG 迁移执行完毕，THE Backend SHALL 将 `USR_PREFERENCE.preference_json` 中
   `$.music.source_mode` 等于 `'tunehub_first'` 的 JSON 路径就地改写为 `'meting_first'`，
   等于 `'tunehub_only'` 的改写为 `'meting_only'`，其它值保持不变。
5. THE Backend SHALL 保证该 PG 迁移在重复执行时是幂等的（即第二次执行不再产生效果且不抛错），
   通过使用 PG 原生 `ON CONFLICT (provider_code) DO UPDATE` 与 `WHERE` 条件守护实现。
6. THE Backend SHALL 同步将上述语义补齐到 Dormant_Migration_Path：
   - 在 `apps/monolith-app/src/main/resources/monolith/db/migration/` 中新增同语义的 MySQL 版本
     脚本（版本号紧接现有 V426，即 V427），保证 `application-mysql.yml` profile 切回时行为一致；
   - 在 `modules/media-module/src/main/resources/db/migration/` 中新增对应的模块级休眠版本
     （版本号紧接 V7，即 V8），与未来微服务拆分计划保持一致。
7. THE Backend SHALL 同步更新基线文件 `resouces/sql/shizuki_app.sql` 与
   `apps/monolith-app/src/main/resources/monolith/db/migration/V302__media_seed_data.sql` 与
   `modules/media-module/src/main/resources/db/migration/V2__seed_data.sql`，把其中初始化插入的
   `'tunehub'` 行替换为等价的 `'meting'` 行（含引导文案），使初始化路径与升级路径达到同一终态。

### Requirement 5: Source_Mode 枚举改名与向后兼容窗口

**User Story:** 作为现网用户，当我升级到新版本后，我之前选过的"Meting 优先" / "仅 Meting"音乐源
策略应当继续生效，不应被重置为默认值。

#### Acceptance Criteria

1. THE Frontend SHALL 在 `fronted/vue3-merged/src/utils/musicAuthorizationState.js` 中：
   - 将 `MUSIC_SOURCE_MODE_OPTIONS` 中的 `value: 'tunehub_first'` 改为 `value: 'meting_first'`，
     `value: 'tunehub_only'` 改为 `value: 'meting_only'`；
   - 将 `normalizeMusicSourceModeValue` 的兜底返回值由 `'tunehub_first'` 改为 `'meting_first'`。
2. WHEN `normalizeMusicSourceModeValue` 收到字符串 `'tunehub_first'` 时，
   THE Frontend SHALL 返回 `'meting_first'`（一个 release 的兼容窗口，避免登录瞬间偏好
   网络往返尚未完成时 UI 抖动）。
3. WHEN `normalizeMusicSourceModeValue` 收到字符串 `'tunehub_only'` 时，
   THE Frontend SHALL 返回 `'meting_only'`。
4. THE Frontend SHALL 在 `MusicLibraryPage.vue` / `MusicRightPanel.vue` /
   `ProfilePage.vue` 中将所有 `<select>`、计算属性、默认 `ref` 初始值
   从 `'tunehub_first'` / `'tunehub_only'` 字面量改为 `'meting_first'` / `'meting_only'`。
5. THE Frontend SHALL 在测试文件 `musicAuthorizationState.spec.js` /
   `MusicLibraryPage.spec.js` / `ProfilePage.spec.js` 中同步更新断言。

### Requirement 6: Virtual_Playlist_Code 双前缀读侧兼容

**User Story:** 作为现网用户，我之前收藏的虚拟歌单（编码以 `vh_tunehub_` 开头）应在新版本中
仍可正常打开，至少在一个 release 周期内。

#### Acceptance Criteria

1. THE Backend SHALL 在 `MediaServiceImpl.getMusicPlaylistBundle(playlistCode)` 的解析路径中
   保留对 `^vh_tunehub_([a-z0-9_\-]+)_([a-z0-9_\-]+)_(.+)$` 正则的识别能力，
   命中后内部统一规约为 Meting 调用。
2. THE Backend SHALL 在 `MediaServiceImpl.getMusicPlaylistBundle(playlistCode)` 的解析路径中
   识别新前缀 `^vh_meting_([a-z0-9_\-]+)_([a-z0-9_\-]+)_(.+)$`。
3. WHEN `MediaServiceImpl` 内部需要生成新的 Virtual*Playlist_Code（例如默认歌单 / 搜索结果歌单 /
   榜单歌单）时，THE Backend SHALL 一律使用 `vh_meting*_`前缀，不再写入`vh*tunehub*_`。
4. WHEN 用户访问以 `vh_tunehub_*` 开头的旧编码时，THE Backend SHALL 返回的
   `MusicPlaylistBundleResponse.profile.playlistCode` 仍以原始 `vh_tunehub_*` 字面量原样返回
   （不强制改写，避免前端基于编码做相等判断的旧缓存被破坏）。
5. THE Backend SHALL 在新增 PG 迁移 V1003 中，对 `MDA_USER_MUSIC_PLAYLIST` 与
   `MDA_USER_MUSIC_PLAYLIST_TRACK` 表中以 `vh_tunehub_` 开头的 `playlist_code` 行同步生成
   一份以 `vh_meting_` 开头的副本（保留 owner / sort*num / track_id 等字段），
   原 `vh_tunehub*\*` 行保留以兼容旧客户端缓存。

### Requirement 7: 配置与文档清理

**User Story:** 作为运维，我希望部署文档与配置示例不再提及 TuneHub，
以便新部署的运维只需关心 Meting sidecar。

#### Acceptance Criteria

1. THE Backend SHALL 确认 `resouces/yaml/monolith.yaml`、
   `apps/monolith-app/src/main/resources/application.yml`、
   `resouces/yaml/common-config.example.yaml` 中只存在 `shizuki.music.meting.*`
   配置段，不存在 `shizuki.music.tunehub.*`。
2. THE Backend SHALL 在 `deploy/README.md` 中将
   "music search key now comes from: ../resouces/yaml/common-config.yaml / field:
   shizuki.music.tunehub.default-api-key" 一段改写为
   "music sidecar URL comes from: shizuki.music.meting.base-url（部署方在容器网络内提供
   meting-api 服务，无需用户级 API Key）"。
3. THE Backend SHALL 更新 `postman/shizuki-site-apis.postman_collection.json`：
   - collection 顶部 variable `musicProvider` 由 `"tunehub"` 改为 `"meting"`；
   - 删除或重写其中"TuneHub API Key 获取"示例条目（含
     `https://tunehub.sayqz.com/dashboard` 链接），使其指向 Meting GitHub 项目
     `https://github.com/injahow/meting-api` 或干脆删除该绑定示例（因为 Meting 不需要 Key）。
4. THE Backend SHALL 保留 Dockerfile.frontend 中的 `VITE_METING_CONSOLE_URL` 构建参数
   （此参数与 TuneHub 无关，仅决定前端"打开 Meting 配置页"按钮跳转链接），不在本次 spec 删除范围。
5. THE Backend SHALL 在网关白名单（`monolith.yaml` 与 `application.yml` 的
   `shizuki.gateway.auth.guest-paths`）中保留 `/api/v1/music/meting/status`，
   不删除该端点（已被 `AdminOpsServiceImpl.getOverview()` 与
   `AdminOpsControllerIntegrationTest` 调用，且语义为"sidecar 健康度 + 平台支持列表"，
   前端运维面板用）。

### Requirement 8: 测试与验证

**User Story:** 作为开发者，我希望本次切换有自动化测试覆盖，以便回归时能快速发现问题。

#### Acceptance Criteria

1. THE Backend SHALL 更新 `modules/media-module/src/test/.../service/impl/MediaServiceImplTest.java`
   将其中所有 `Mockito.mock(TuneHubMusicProvider.class)` 替换为
   `Mockito.mock(MetingMusicProvider.class)`，并相应替换方法签名上的
   `TuneHubMusicProvider.SearchTrackResult` / `VirtualPlaylistSummary` / `ParseTrackResult`
   类型为 `MetingMusicProvider.*` 等价类型。
2. THE Backend SHALL 更新或删除测试方法
   `shouldThrowForbiddenWhenAllTuneHubProvidersMissingApiKey`（在 Meting 模式下
   sidecar 不依赖用户 API Key，对应行为已不存在；删除该测试或重构为
   "shouldThrowWhenMetingSidecarUnreachable"）。
3. WHEN 运行 `apps/monolith-app` 的全量单元测试套件时，
   THE Backend SHALL 通过率 100%（无新增 failure / error）。
4. WHEN 运行 `fronted/vue3-merged` 的 vitest 套件时，
   THE Frontend SHALL 通过率 100%。
5. THE Backend SHALL 提供一个集成验证命令脚本（或在 spec 的 tasks.md 中列出明确的 curl 调用），
   验证以下三条端到端路径在新代码下返回 200 + 非空 body：
   - `GET /api/v1/music/search?q=樱花&type=track&providers=netease,kuwo,qq&page=1&limit=10`；
   - `GET /api/v1/music/library/home`；
   - `GET /api/v1/music/meting/status`。

### Requirement 9: 不在删除范围（显式排除）

**User Story:** 作为评审者，我希望本 spec 明确列出"哪些看似与 tunehub/meting 相关、但本次不动"的项，
以避免后续误改造。

#### Acceptance Criteria

1. THE Backend SHALL **不修改** `tools/meting-sidecar/` 目录下的任何文件
   （sidecar 实现稳定，本次只做后端调用方与配置切换）。
2. THE Backend SHALL **不评审或修改** `.kiro/specs/backend-refactor-review/` 下的任何文件
   （那是只读评审型 spec，按其自身 Requirement 1 也明确"不评审 tools/meting-sidecar"）。
3. THE Backend SHALL **不修改** `MDA_MUSIC_TRACK_CACHE` / `MDA_MUSIC_PLAYLIST` /
   `MDA_USER_MUSIC_PLAYLIST_TRACK` 中 `provider_code` 列的取值
   （这三张表的 `provider_code` 存的是 Platform_Provider_Code = netease/kuwo/qq，
   与本次删除的 Aggregator_Provider_Code = tunehub 没有引用关系）。
4. THE Backend SHALL **不修改** Dockerfile.frontend 中的 `VITE_METING_CONSOLE_URL`
   构建参数（与 TuneHub 无关）。
5. THE Backend SHALL **不修改** `MetingMusicProvider` 的现有方法签名
   （只在 Design 阶段确认其能力覆盖足够后直接接管 TuneHub 调用点）。

## Open Decisions Encoded as Defaults

下列默认决策在 Requirements 阶段已写入上文条款，标记如下以方便审阅时定向修改：

| 决策点                           | 默认                                                  | 出处条款        | 备选                          |
| -------------------------------- | ----------------------------------------------------- | --------------- | ----------------------------- |
| API Key UX                       | **完全删除**                                          | R3.1–R3.7       | 改为隐藏但保留 endpoint       |
| Source_Mode 旧值兼容             | **PG 迁移就地改写 + 前端 normalize 容忍一个 release** | R4.4 / R5.2-5.3 | 强制重置为 default            |
| `MDA_MUSIC_PROVIDER_CONFIG` 旧行 | **UPSERT 'meting' 后 DELETE 'tunehub'**               | R4.2            | 直接 UPDATE provider_code     |
| `USR_PROVIDER_SECRET` 旧行       | **物理删除 (R3.8 / R4.3)**                            | R3.8 / R4.3     | 改名 provider_code='meting'   |
| `/api/v1/music/meting/status`    | **保留**                                              | R7.5            | 删除并合并到 /providers       |
| Virtual_Playlist_Code 兼容       | **双前缀读侧识别 + DB 一次性补齐 meting 副本**        | R6.1–R6.5       | 仅靠正则容忍 / 一次性强制改写 |
| Flyway 多轨同步                  | **PG 主路径 + MySQL/模块休眠路径同步**                | R4.6            | 仅写 PG 主路径                |

任一项不符合预期，请在审阅时明确指出，将回到 Requirements 阶段修改。
