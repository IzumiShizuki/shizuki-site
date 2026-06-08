# Implementation Plan

本任务列表与 `requirements.md`（9 个 EARS Requirements）和 `design.md`（7 个章节）一一对应。

任务编号约定：

- 父任务 `N` 对应一个 logical wave（可整体并行的工作组）
- 子任务 `N.M` 是叶子任务，可被 orchestrator 独立调度
- 每个叶子任务末尾用 `_Requirements: …_` 标注覆盖的 Requirement 条款

依赖关系：除非叶子任务文本中显式写出 "depends on N.M"，否则视为只依赖其父任务序号下 `N-1.*` 全部完成。

---

- [x] 1. 现网约束摸底（不动代码）
  - [x] 1.1 确认 `MDA_USER_MUSIC_PLAYLIST_TRACK` 是否存在三列复合唯一约束 `(playlist_code, provider_code, track_id)` - 在测试 PG 库或读 schema DDL（`V406__add_user_music_playlist_tables.sql` 与 `migration-pg/` 下任一基线）中确认 UNIQUE INDEX 字段 - 若存在 → 标记 design §3.5 V1003 step 5 用 `ON CONFLICT (...) DO NOTHING` 实现 - 若不存在 → 标记 V1003 step 5 必须改用 `INSERT ... SELECT ... WHERE NOT EXISTS (...)` 形态（fallback）- 输出结论文件 `.kiro/specs/music-source-tunehub-removal/.work/db_constraint_check.md`，供后续 5.1 引用 - _Requirements: R4.5, R6.5_

  - [x] 1.2 列出 `MediaServiceImpl.java` 中全部 `tuneHub*` 命中点及行号（含 import / 字段 / 构造器 / 方法体 / 字符串字面量）- 用 grep / readCode，输出文件 `.kiro/specs/music-source-tunehub-removal/.work/mediaservice_change_points.md` - 该文档作为 2.x 任务的修改清单基线 - _Requirements: R1.4, R2.1-R2.7, R6.1-R6.3_

- [x] 2. 后端代码切换：MediaServiceImpl + UserServiceImpl + ErrorCode
  - [x] 2.1 重构 `UserServiceImpl.java` 的 `SUPPORTED_MUSIC_PROVIDERS` / `SUPPORTED_MUSIC_SOURCE_PROVIDERS` / `DEFAULT_SOURCE_PROVIDER_ORDER` - 删除 `"tunehub"` 字面量；保留 `spotify` / `asmr` / `netease` / `qqmusic` / `kugou` - 在 `validateMusicProvider(...)` 抛错处携带 `Map.of("music_error_code","MUSIC_PROVIDER_NOT_SUPPORTED")` detail（design §3.3）- 不新增 ErrorCode enum 值（design §3.4 已明确）- _Requirements: R3.6, R3.7_

  - [x] 2.2 在 `MediaServiceImpl.java` 替换 TuneHub 调用与字段（依赖 1.2 的清单）- 删除 import：`TuneHubMusicProperties`、`TuneHubMusicProvider` - 删除字段：`tuneHubMusicProvider`、`tuneHubMusicProperties` + 构造器对应参数与 `this.xxx = xxx` - 全文替换 `tuneHubMusicProvider.foo(...)` → `metingMusicProvider.foo(...)` - 全文替换 `TuneHubMusicProvider.SearchTrackResult/VirtualPlaylistSummary/ParseTrackResult` → `MetingMusicProvider.*` - 替换 `tuneHubMusicProperties.getDefaultQuality()` / `getDefaultApiKey()` → `metingMusicProperties.*` - 字符串字面量 `"TuneHub API key missing"` 改为 `"Music api key missing"`，并简化对应 `if (!StringUtils.hasText(apiContext.apiKey())) { ... }` 分支（sidecar 默认有 system key，分支应几乎不触发）- _Requirements: R2.1-R2.7_

  - [x] 2.3 重命名 `MediaServiceImpl.java` 中的常量、内嵌类型与辅助方法 - 常量：`TUNEHUB_PLAYLIST_PLATFORMS` → `MUSIC_PLATFORMS`；`TUNEHUB_REAL_PLAYLIST_SEARCH_PLATFORMS` → `MUSIC_REAL_PLAYLIST_SEARCH_PLATFORMS` - 常量：`SUPPORTED_MUSIC_PROVIDERS` 值改为 `Set.of("spotify","asmr")` - 常量：`LOG_EVENT_API_CONTEXT_START` 值由 `"MUSIC_TUNEHUB_API_CONTEXT_RESOLVE"` 改为 `"MUSIC_METING_API_CONTEXT_RESOLVE"` - 常量：`SOURCE_MODE_TUNEHUB_FIRST` → `SOURCE_MODE_METING_FIRST = "meting_first"`；`SOURCE_MODE_TUNEHUB_ONLY` → `SOURCE_MODE_METING_ONLY = "meting_only"` - 内嵌类型：`TuneHubApiContext` → `MusicApiContext`；`TuneHubVirtualPlaylistRef` → `MusicVirtualPlaylistRef` - 方法：`resolveTuneHubApiContext` → `resolveMusicApiContext`；`parseVirtualTunehubPlaylistCode` → `parseVirtualMusicPlaylistCode`；`loadVirtualTunehubPlaylistBundle` → `loadVirtualMusicPlaylistBundle` - 用 IDE 重命名（semanticRename）或全文替换，确保编译通过 - _Requirements: R1.4, R2.1-R2.7, R5.1_

  - [x] 2.4 实现 source*mode 后端读侧兼容（depends on 2.3）- 新增 private static helper `normalizeSourceModeForRead(String raw)`，把 `tunehub_first/only` 映射为 `meting_first/only`，把无效值兜底为 `account_first` - 所有读 `preference_json#>>'{music,source_mode}'` 的位置统一过该 helper - 单元测试：在 `MediaServiceImplTest` 中新加 `shouldNormalizeLegacySourceModeOnRead` - \_Requirements: R5.2, R5.3（后端镜像）*

  - [x] 2.5 实现虚拟歌单编码双前缀解析（depends on 2.3）- 新增常量 `VIRTUAL_METING_PLAYLIST_CODE_PATTERN = Pattern.compile("^vh_meting_([a-z0-9_\\-]+)_([a-z0-9_\\-]+)_(.+)$")` - 重命名 `VIRTUAL_TUNEHUB_PLAYLIST_CODE_PATTERN` 为 `VIRTUAL_LEGACY_PLAYLIST_CODE_PATTERN`（保持原正则）- `parseVirtualMusicPlaylistCode(code)` 实现：先匹配 meting，命中即短路；否则尝试 legacy；都不匹配返回 null - 第 3734 行写侧 `"vh_tunehub_" + ...` 字面量改为 `"vh_meting_" + ...` - 全文 grep 验证 `MediaServiceImpl` 中不再有 `"vh_tunehub_"` 字面量（除注释外）- _Requirements: R6.1-R6.4_

- [x] 3. 后端文件物理删除（depends on 2.x 全部完成且编译通过）
  - [x] 3.1 删除 `modules/media-module/src/main/java/io/github/shizuki/site/media/integration/TuneHubMusicProvider.java` - _Requirements: R1.1_

  - [x] 3.2 删除 `modules/media-module/src/main/java/io/github/shizuki/site/media/config/TuneHubMusicProperties.java` - _Requirements: R1.2_

  - [x] 3.3 删除 `modules/media-module/src/test/java/io/github/shizuki/site/media/integration/TuneHubMusicProviderSearchParserTest.java` - _Requirements: R1.3_

- [x] 4. 前端代码切换（与 2/3 可并行）
  - [x] 4.1 重构 `MusicRightPanel.vue` - 删除 `<article class="integration-card accordion-card" :class="{ expanded: isTunehubExpanded }">` 整段卡片 - 删除 props：`tunehubKeyInput` / `tunehubStatus` / `tunehubBusy` - 删除 emits：`update:tunehubKeyInput` / `save-tunehub-key` / `delete-tunehub-key` / `refresh-tunehub-status` - 删除 computed：`isTunehubExpanded` / `tunehubBound` / `tunehubSummary` / `tunehubStatusText` - `<select>` option value：`tunehub_first` → `meting_first`；`tunehub_only` → `meting_only`（label 文字保持中文不变）- _Requirements: R3.1, R5.1, R5.4_

  - [x] 4.2 重构 `MusicLibraryPage.vue` - 删除常量 `METING_API_PROVIDER` - 删除 ref：`tunehubKeyInput` / `tunehubStatus` / `tunehubBusy` - 删除方法：`loadTunehubStatus` / `handleSaveTunehubKey` / `handleDeleteTunehubKey` - 删除 `<MusicRightPanel>` 上 6 个相关 prop / event 绑定 - `musicSourceMode` 默认 ref 值由 `'tunehub_first'` 改为 `'meting_first'` - 第 882 行 `if (normalizedProvider === 'meting' || normalizedProvider === 'tunehub')` 改为 `if (normalizedProvider === 'meting')` - _Requirements: R3.2, R3.5, R5.1, R5.4_

  - [x] 4.3 重构 `ProfilePage.vue` - 删除"Meting Key 管理"整段 `<article>` 模板节点（约 line 307-331）- 删除常量 `METING_API_PROVIDER` - 删除 ref：`musicTunehubBusy` / `musicTunehubKeyInput` / `musicTunehubStatus` - 删除方法：`loadMusicTunehubStatus` / `saveMusicTunehubKey` / `deleteMusicTunehubKey` - 第 1379 行 `Promise.all([..., loadMusicTunehubStatus(), ...])` 中删除该调用 - 第 1950 行 `musicAuthConfiguredCount` 计算删除 `Number(musicTunehubStatus.value.keyBound)` 项 - 删除 computed `musicTunehubStatusText` - `musicSourceMode` 默认 ref 值改为 `'meting_first'` - _Requirements: R3.3, R3.5, R5.1, R5.4_

  - [x] 4.4 重构 `musicLibraryUiState.js` - 第 122-126 行：删除对 `'tunehub'` 字面量的 `expandedProvider.value` 赋值分支，仅保留 `'spotify'` - _Requirements: R3.4_

  - [x] 4.5 重构 `musicAuthorizationState.js`（兼容映射）- `MUSIC_SOURCE_MODE_OPTIONS`：`tunehub_first` → `meting_first`；`tunehub_only` → `meting_only` - `normalizeMusicSourceModeValue`：兜底返回值改为 `'meting_first'`；新增 `tunehub_first → meting_first`、`tunehub_only → meting_only` 映射 - _Requirements: R5.1, R5.2, R5.3_

  - [x] 4.6 同步更新三个 `.spec.js` 测试文件（depends on 4.1-4.5）- `musicAuthorizationState.spec.js`：所有 `'tunehub_first'` 期望值改为 `'meting_first'`；新增对兼容映射 `tunehub_first → meting_first`、`tunehub_only → meting_only` 的断言 - `MusicLibraryPage.spec.js`：删除 `getMusicApiKeyStatus` mock 期望调用；`source_mode` 期望值改为 `'meting_first'` - `ProfilePage.spec.js`：第 478 行 `getPreference` mock 中 `source_mode: 'tunehub_first'` 改为 `'meting_first'`；删除 `musicTunehub*` 相关断言 - _Requirements: R5.5, R8.4_

- [x] 5. 数据库迁移与 SQL 基线（depends on 1.1）
  - [x] 5.1 创建 PG 主迁移 `V1003__music_tunehub_to_meting.sql` - 路径：`apps/monolith-app/src/main/resources/monolith/db/migration-pg/V1003__music_tunehub_to_meting.sql` - 完整 SQL 见 design §3.5；五段：UPSERT meting + DELETE tunehub（provider*config）→ UPSERT meting + DELETE tunehub（provider_guide）→ DELETE USR_PROVIDER_SECRET tunehub/meting → UPDATE source_mode（嵌套 + 扁平两种 JSON 形态）→ 生成 vh_meting*_ 副本（保留 vh*tunehub*_ 原行）- 根据 1.1 结论决定 step 5 用 `ON CONFLICT` 还是 `WHERE NOT EXISTS` fallback - 全部语句必须幂等（重跑零变更）- _Requirements: R3.8, R4.1, R4.2, R4.3, R4.4, R4.5, R6.5_

  - [x] 5.2 创建 MySQL 休眠迁移 `V427__music_provider_secret_cleanup.sql` - 路径：`apps/monolith-app/src/main/resources/monolith/db/migration/V427__music_provider_secret_cleanup.sql` - V424 已做 UPSERT-rename 但与 R3.8 物理删除矛盾；V427 在 V424 基础上补 DELETE - 同时补齐 `vh_meting_*` 副本生成（MySQL 方言：`ON DUPLICATE KEY UPDATE update_time = update_time` 实现 NO-OP idempotency）- _Requirements: R3.8, R4.6, R6.5_

  - [x] 5.3 创建模块休眠迁移 `V8__music_secret_cleanup.sql` - 路径：`modules/media-module/src/main/resources/db/migration/V8__music_secret_cleanup.sql` - 与 V427 同语义（MySQL 方言）- _Requirements: R4.6_

  - [x] 5.4 同步基线 SQL 文件中的 seed 行（3 个文件）- `resouces/sql/shizuki_app.sql`：line 600-615 `'tunehub'` 行改为 `'meting'`，引导文案改为 design §3.5 step 2 的内容 - `apps/monolith-app/src/main/resources/monolith/db/migration/V302__media_seed_data.sql`：同上 - `modules/media-module/src/main/resources/db/migration/V2__seed_data.sql`：同上 - _Requirements: R4.7_

  - [x] 5.5 创建回滚 SQL 存档（不放在 Flyway 主路径）- 路径：`apps/monolith-app/src/main/resources/monolith/db/migration-pg/_rollback/V1003_rollback.sql` - 内容见 design §6.2；明确注释"Manual rollback, NOT executed by Flyway" - 注意：USR*PROVIDER_SECRET 已物理删除，不可恢复，文件中需写明此事实 - \_Requirements: 风险缓解（design §6.2）*

- [x] 6. 配置与文档清理（与 5 可并行）
  - [x] 6.1 验证 yaml 配置文件无 `shizuki.music.tunehub.*` 残留 - 文件：`resouces/yaml/monolith.yaml`、`apps/monolith-app/src/main/resources/application.yml`、`resouces/yaml/common-config.example.yaml` - 用 grep 确认；若有残留则删除整段 - _Requirements: R7.1_

  - [x] 6.2 重写 `deploy/README.md` 第 11-13 行 - 旧文案："music search key now comes from: ../resouces/yaml/common-config.yaml / field: shizuki.music.tunehub.default-api-key" - 新文案："music sidecar URL: shizuki.music.meting.base-url（部署方在容器网络内提供 meting-api 服务，无需用户级 API Key）" - _Requirements: R7.2_

  - [x] 6.3 更新 `postman/shizuki-site-apis.postman_collection.json` - 顶层 variable `musicProvider` 由 `"tunehub"` 改为 `"meting"` - 删除"TuneHub API Key 获取"示例条目（含 `https://tunehub.sayqz.com/dashboard` 链接）。Meting 不需要 Key，整个绑定示例直接删除 - _Requirements: R7.3_

- [x] 7. 测试更新与执行
  - [x] 7.1 重构 `MediaServiceImplTest.java`（depends on 2.x、3.x）- 所有 `Mockito.mock(TuneHubMusicProvider.class)` → `mock(MetingMusicProvider.class)` - 类型 `TuneHubMusicProvider.SearchTrackResult` 等 → `MetingMusicProvider.*` - 删除 `TuneHubMusicProperties` 相关 mock；改用 `MetingMusicProperties` - 删除测试方法 `shouldThrowForbiddenWhenAllTuneHubProvidersMissingApiKey`（行为已不存在）- 新增 `shouldRouteSearchTracksToMetingProvider`、`shouldFallbackOnVhTunehubLegacyCode`、`shouldNormalizeLegacySourceModeOnRead` - _Requirements: R8.1, R8.2_

  - [x] 7.2 新增 testcontainers PG 迁移测试 `MusicTunehubToMetingMigrationTest.java` - 路径：`apps/monolith-app/src/test/java/io/github/shizuki/site/monolith/migration/MusicTunehubToMetingMigrationTest.java` - 步骤：启动 PG 14 testcontainer → Flyway migrate 到 V1002 → 手动种入测试数据（一行 `tunehub` provider*config + 一行 `vh_tunehub_netease_search_xxxx` 收藏 + 一个 `source_mode='tunehub_first'` 偏好）- 执行 V1003 → 验证终态（meting 行存在、tunehub 行不存在、source_mode 已改写、vh_meting*\* 副本已生成）- 再次手动执行 V1003 → 验证幂等（断言项保持不变、无报错）- _Requirements: R4.5, R8.5_

  - [x] 7.3 运行后端全量单元测试 - `mvn -pl apps/monolith-app -am test` - 通过率必须 100%（无新增 failure / error）- _Requirements: R8.3_

  - [x] 7.4 运行前端 vitest 套件 - 在 `fronted/vue3-merged/` 下执行 `npm run test`（或对应的 vitest 命令）- 通过率必须 100% - _Requirements: R8.4_

- [x] 8. 终验与清理
  - [x] 8.1 全仓库残留检查 - 用 grep 在 `apps/`、`modules/`、`model/`、`fronted/`、`resouces/yaml/`、`apps/monolith-app/.../application.yml`、`deploy/`、`postman/` 中搜索 `tunehub`（不区分大小写）- 允许命中点：迁移脚本中 `WHERE provider_code = 'tunehub'` 清理条件、本 spec 文档自身、`.kiro/specs/backend-refactor-review/` 评审产物（只读）- 若有除上述允许命中点之外的残留 → 回到对应任务修复 - _Requirements: R1.5, R7.1_

  - [x] 8.2 后端构建验证 - `mvn -pl apps/monolith-app -am clean package -DskipTests` - 必须成功；任何编译错误回到对应任务修复 - _Requirements: R8.3_

  - [x] 8.3 集成验证 curl 路径（需要部署到 staging）- `GET /api/v1/music/search?q=樱花&type=track&providers=netease,kuwo,qq&page=1&limit=10` → 200 + 非空 tracks - `GET /api/v1/music/library/home` → 200 + 非空 featuredPlaylists - `GET /api/v1/music/meting/status` → 200 + `available: true` - 把 curl 命令存档到 `.kiro/specs/music-source-tunehub-removal/.work/integration_check.sh` - _Requirements: R8.5_

---

## 任务图（依赖关系速查）

```
1.1, 1.2  (摸底，可并行)
   │
   ├─→ 2.1, 2.2 (并行)
   │     │
   │     └─→ 2.3 ─→ 2.4, 2.5 (并行)
   │              │
   │              └─→ 3.1, 3.2, 3.3 (并行)
   │                       │
   │                       └─→ 7.1
   │
   └─→ 5.1, 5.2, 5.3, 5.4, 5.5 (并行，仅 5.1 依赖 1.1)
            │
            └─→ 7.2

4.1, 4.2, 4.3, 4.4, 4.5 (前端，与后端完全并行)
   │
   └─→ 4.6 (前端测试更新)
            │
            └─→ 7.4

6.1, 6.2, 6.3 (配置文档，与一切并行)

7.1, 7.2 ─→ 7.3 (后端测试)
4.6      ─→ 7.4 (前端测试)

7.3, 7.4, 5.x, 6.x ─→ 8.1, 8.2 (终验)
                          │
                          └─→ 8.3 (集成验证，最后)
```

---

## 备注

- 所有任务以"修改单个文件 / 一组紧密相关文件"为粒度，可被 spec-task-execution 子代理独立执行
- Commit 节奏：建议每个父任务（1/2/3/.../8）完成后做一次本地 commit，commit author 必须是 `Izumi <29301481@qq.com>`（AGENTS.md §4）
- 严禁 `git push` 除非用户显式授权（AGENTS.md §3）
- 7.2 / 7.3 / 7.4 / 8.2 / 8.3 涉及实际执行测试与构建命令，spec-task-execution 子代理会运行；如本地缺少 docker（testcontainers 依赖），7.2 可降级为单元 mock 测试 + 在 CI 上运行 testcontainers
