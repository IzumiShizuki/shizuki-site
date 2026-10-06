# Verification Report: unify-music-platform-library

验证日期：2026-10-06。范围为本仓库的普通音乐界面、平台音乐服务、公开 Folia 补丁，以及用户随后授权的个人服务器部署。精确运行身份、恢复点和真实线上验收见 [部署报告](deployment-report.md)；下方初始本地验证记录保留。

## Summary

| Dimension | Status |
| --- | --- |
| Completeness | 11/11 任务完成，4/4 需求有实现；本地交付和授权部署完成 |
| Correctness | 11/11 场景具备实现和相关覆盖；发布主站 92、媒体 77、网关 13、Folia 5 项测试通过；真实线上资源/账号读取及声音播放通过 |
| Coherence | 复用现有 NCM、账号凭据和共享播放器；无新依赖或数据库迁移 |

## Requirement and scenario coverage

| Requirement / scenarios | Implementation | Evidence |
| --- | --- | --- |
| Platform audio discovery：播客节目、FM 绑定、上游失败 | `NeteaseCookieProvider.java:110` 的推荐/搜索、节目 mainSong 映射与 FM；`MusicPlatformRadioView.vue:73` 的加载、错误及共享队列 | `NeteasePlatformLibraryTest`、`MusicPlatformRadioView.spec.js`；Edge 浏览器声音卡片、节目路由与 FM 行为验收 |
| Unified account playlists：云端歌单与无可用歌单空态 | `MediaServiceImpl.java:2841` 实时平台侧栏与旧副本去重；`NeteaseCookieProvider.java:142` 实时曲目；`useMiniMusicLibrary.js:178` 无默认歌单与空态 | `MediaServiceImplTest` 保留真实自建歌单且不创建本地 LIKED；客户端真实账号、创建/订阅分类测试；迷你库默认移除、空态及账号切换测试 |
| Account-backed likes：显式点赞/取消、失败与重复操作 | `usePlatformMusicLikes.js:33` 读取真实列表、`:59` 等待成功结果；`PlatformMusicLibraryService.java` 读取当前用户加密凭据；`PlatformMusicLibraryController.java` 校验显式状态 | 客户端验证 POST、字符串 false、Cookie 仅在 body；服务验证未登录/未绑定/平台不支持；控制器验证取消及缺失 liked；前端验证失败保留、重复点击和错误确认 |
| Shared identity and account isolation：同 ID 不同平台、请求期间切号、Folia 已完成点赞 | `usePlatformMusicLikes.js` provider:trackId、请求代数与受限 fetch；普通/迷你/移动端库与声音视图取消旧账号响应；`MusicLibraryPage.vue:2735` 只刷新 Folia 读模型并合并重复通知 | 前端 likes、mini、radio 账号切换测试；sourceSync 集成验证 Folia 连续通知只读取一次且零 mutation，普通模式显式取消只写一次；Folia 桥测试真实账号喜欢状态和已确认状态转发 |
| Guest podcast discovery：公开推荐、账号内容鉴权 | `application.yml` 精确 guest path；`AuthEntryFilterTest.java` 使用真实 YAML 校验公开推荐与受保护账号端点 | 网关 13 项通过；公网推荐/节目 200，账号 library/likes/FM 401 |

## Validation

1. 前端相关回归：10 文件、80 项通过；最终 Folia 读取去重调整后另复验受影响 2 文件、32 项通过。

   ```powershell
   npm run test:unit -- src/composables/usePlatformMusicLikes.spec.js src/composables/useMiniMusicLibrary.spec.js src/pages/music/MusicPlatformRadioView.spec.js src/pages/MusicLibraryPage.sourceSync.integration.spec.js src/pages/MusicLibraryPage.foliaSwitch.spec.js src/pages/music/MusicPlaylistDetailView.queue.spec.js src/components/music/MusicLibraryDock.queue.spec.js src/components/music/MusicAccountSyncPanel.spec.js src/pages/musicLibraryUiState.spec.js src/utils/musicCollectTargets.spec.js
   ```

2. 后端相关回归：7 个测试类、77 项通过。

   ```powershell
   cmd.exe /d /c 'call D:\environment\activate-shizuki-site.cmd && mvn -B -pl modules/media-module -am test -Dtest=NeteasePlatformLibraryTest,PlatformMusicLibraryServiceTest,PlatformMusicLibraryControllerIntegrationTest,NeteaseCookieProviderTest,MediaServiceImplTest,MusicControllerIntegrationTest,MeMusicLibraryControllerIntegrationTest -Dsurefire.failIfNoSpecifiedTests=false'
   ```

3. 主站 `npm run build` 与 `D:\environment\build-shizuki-monolith.cmd` 均成功；构建使用原有 Node 和 Java 17 环境。前端现有大包提示不阻断构建；没有新增依赖。

4. 现有完整 Folia fork 的干净源码解包到本仓库临时目录，覆盖本次公开快照并复用原有依赖：TypeScript `--noEmit`、3 个相关测试文件共 5 项，以及 `vite build --base=/music/` 均成功。未改动外部 fork 的工作区。

   ```text
   test/unit/shizukiPlatformLikes.integration.test.ts
   test/unit/shizukiExternalBridge.integration.test.ts
   test/unit/player-panel/playerPanelLikedState.test.ts
   ```

5. 后续补丁 `third_party/folia-major/shizuki-platform-library.patch` 应用检查通过，须接在已有完整 v0.7.11 补丁之后。SHA-256：`332d4f02d14aca2cd236742a729beabc8589aba3e6f172337bf47c5664645e3f`。它包含两个修改快照及桥测试；应用说明保留 AGPL 上游出处与历史部署记录。空白上下文行规范化后再次通过应用与 Git 空白检查。

6. 使用已有 Microsoft Edge 无头浏览器验收，通过确定的 API fixtures 验证：默认歌单消失、平台喜欢/创建歌单展示、真实声音卡片结构、声音节目路由、私人 FM 曲目、一次显式取消喜欢和确认后的红心。未出现页面 JavaScript 异常。脚本为本目录 `browser-smoke.py`；以下命令在主站 Vite 已启动时重现，截图写入临时目录：

   ```powershell
   & 'D:\environment\anaconda3\envs\py314\python.exe' 'D:\program\shizuki-site\openspec\changes\unify-music-platform-library\browser-smoke.py' 'http://127.0.0.1:5187' 'D:\program\shizuki-site\.codex\tmp\music-platform-ui'
   ```

## Design coherence

- 新账号 API 始终从当前网站用户读取已绑定凭据，POST body 带 Cookie 与时间戳，不把凭据放进新接口 URL 或异常输出。
- 平台歌单直接读取，不再通过普通同步入口创建本站静态副本；真实自建歌单继续保留。平台歌单也不会被误列为本站写入曲目的目标。
- 上游严格验证成功 code 与预期数据；登录失效、能力不可用与连接失败有明确错误，不把异常转换成空列表成功。
- 喜欢状态先等待平台确认，避免本地“假点赞”；普通/Folia 之间只有状态交接，Folia 原有的账号 mutation 不会重复执行。
- NCM 的取消状态按上游接口要求传字符串 `false`。该行为参考 [API Enhanced like 模块](https://github.com/NeteaseCloudMusicApiEnhanced/api-enhanced/blob/main/module/like.js)，并由本地契约测试固定；节目播放 ID 来自 mainSong，使用 [dj_program 模块](https://github.com/NeteaseCloudMusicApiEnhanced/api-enhanced/blob/main/module/dj_program.js) 的 rid/limit/offset。

## Issues and practical limits

- CRITICAL：无未实现需求或失败的适用检查。
- WARNING：无已发现的需求/设计偏离。
- 能力边界：本次完整账号库和真实点赞支持网易云。现有 QQ/酷狗账号代理尚未部署，继续保留已有搜索播放能力，账号操作显示明确不可用。该边界已写入 proposal/design。
- 验证边界：初始本地浏览器使用模拟 API；随后授权部署已完成，以已有真实登录态验收平台歌单、喜欢读取、声音节目、FM 及普通模式播放。未修改真实平台喜欢列表；点赞和取消的写入行为由契约/集成测试覆盖，不能把真实读取验收等同于真实 mutation 端到端验收。
- 历史默认歌单管理 API 与用户数据保留兼容；普通和迷你音乐界面不再展示或自动选择默认歌单。

## Handoff

实现与授权部署完成，OpenSpec 保持未归档；其他平台账号服务仍为后续范围。实际发布身份和恢复点见部署报告，本地提交号可通过 `git log -1` 获取。`TopMenu.vue` 用户修改保持原样，未纳入发布或提交。原浏览器测试服务已停止，服务器 RAM 发布目录已清理；自动审批策略拦截的本地临时素材/未完成备份传输文件继续保留，不作为恢复点，不影响实现或部署。
