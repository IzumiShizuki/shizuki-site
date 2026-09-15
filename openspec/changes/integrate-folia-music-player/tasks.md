# Tasks: 接入 Folia 全屏歌词音乐播放器

## 待办任务

- [x] 服务器确认环境：Docker 24+ / Compose v2 可用（实测 29.2.1 / v5.0.2）；Docker Hub 直连与 papersman 官方镜像不可达 → 改为本地源码构建。
- [x] 服务器创建 `folia-docker/`（实际 `/opt/folia/deploy/`），编写自定义 compose 与 .env（实测无需官方镜像）。
- [x] `docker compose up -d` → gateway 容器 healthy（端口 127.0.0.1:18081）。
- [x] 验证 Web 网关：`curl http://127.0.0.1:18081/healthz` 200。
- [x] openresty 配置 `location /music/` 反代（rewrite 去前缀 + proxy_pass 18081），`nginx -t` 通过并 reload。
- [x] 域名路径 `https://shizuki.online/music/` 本机与服务器均可访问（无需新 DNS）。
- [x] 主站入口：**音乐页内嵌模式切换**——`MusicLibraryPage.vue` 顶部「普通模式 / Folia 沉浸模式」tab，Folia 模式同源 iframe 嵌入 `site.shizuki.online/music/`（localStorage 持久化）。
- [x] site.shizuki.online 增加 `/music/` 同源反代（openresty），iframe 与主站同源共享 cookie。
- [x] **账号互通**：后端新增 `GET /api/v1/me/music/source-accounts/{provider}/cookie`；前端 `syncCookieToFolia` 把网易云 cookie 通过 postMessage 写入 iframe localStorage.netease_cookie。
- [x] **歌曲互通**：Folia 新增 `shizukiExternalBridge.ts`（postMessage 桥：sync-cookie / play-track / get-status）；前端歌曲行加「用 Folia 沉浸模式播放」按钮 + `shizuki:play-in-folia` 事件 + 切歌推送。
- [x] openresty 补 `location /netease/` 根路径反代（Folia 前端内部 API 请求为根路径 `/netease/...`）。

## 后续修复（2026-09-12）

- [x] **player 详情页无缝切换**：`MusicPlayerDetailView.vue` 顶部新增「Folia 沉浸模式」按钮 → `shizuki:open-folia-mode` 事件 → 切 Folia 模式并携带当前歌曲（实测点击后 iframe 出现）。
- [x] **UI 高度适配**：`App.vue` 的 `route-content-music-shell` 加 `height: calc(100dvh - top - bottom)`，使 music 页不再溢出视口（实测 page bottom 896 ≤ 900）。
- [x] **menu 白色背景框修复**：日间模式 `--menu-glass-bg` 从 `rgba(255,255,255,0.96)` 近纯白改为 `rgba(255,252,248,0.55)` 半透明玻璃（root cause：wallpaper change 的 menu-glass 用 `--theme-panel-surface-elevated`，日间该 token 是白色渐变）。
- [x] **账号互通排查结论**：cookie 在后端 DB 有效（`music_cookie_netease` 记录，解密后登录态 `IzumiShizuki` / vipType 110 黑胶 VIP）；前端 sync 逻辑已上线；**VIP 歌在后端旧 cookie 下被网易云风控**（`song/url/v1` 404），但**用户在 Folia 内扫码登录（最新 cookie）可正常听会员歌**——关键是最新 cookie 而非旧 cookie。

## 双向互通增强（2026-09-12 第二轮）

- [x] **Folia → 后端 cookie 回写**：桥新增 `shizuki:get-cookie`（读 iframe 内 Folia 已登录的网易云 cookie 回传父页面）→ 父页面 `handleFoliaBridgeMessage` 调 `upsertMusicSourceAccountCookie` 保存到后端 → 两边账号统一（Folia 最新 cookie 同步给普通模式）。
- [x] **普通模式歌单 → Folia 播放**：Folia 工具栏新增「歌单」下拉（列出普通模式的默认/创建/收藏歌单）→ 拉取歌单歌曲 trackIds → 桥 `shizuki:play-tracks` 批量播放（实测 `ok:true, played:2, failed:0`）。
- [x] **普通 → Folia 无缝切换**：传歌时带 `positionMs`（普通模式当前进度）+ 暂停普通模式播放；桥 `play-track` 支持 `positionMs`（音频就绪后 seek，实测 45s 参数被接受）；pending 机制确保 iframe 就绪后补发。
- [x] **Folia → 普通模式反向同步**：`setFoliaMode(false)` 时 `pullCurrentTrackFromFolia` 请求 Folia 状态 → 用 `playExternalTrack` 在普通模式尝试续播（版权受限时静默保留）。
- [x] **点赞同步（基础）**：桥 status 快照加 `liked` 字段；前端收到 status 时若 liked 明确且与普通模式红心不同则尽力同步。
- [x] **Spotify 调研结论**：Folia **不支持 Spotify**（源码无接入）；站点普通模式已有 Spotify 搜索+预览。Folia 面向网易云生态，Spotify 互通需独立方案（待用户确认 Spotify 形态后设计）。
- [x] 前端 `vue3-merged` 构建通过；服务器 `Dockerfile.frontend` 无缓存重建并重启容器。
- [x] **删除 TopMenu GitHub 图标**：TopMenu.vue + global.css 中 github-style-box 全部清除（fa-github 字体字形保留，属 FontAwesome 库定义）。
- [x] 后端构建部署：`Dockerfile.backend` 重建 `shizuki-site/backend:latest`，新 cookie 端点 401（鉴权正确）。
- [x] E2E 验证（Playwright + Edge）：模式切换条 ✓、GitHub 图标移除 ✓、iframe 加载 ✓、sync-cookie 写入 iframe localStorage ✓、get-status 回包 ✓、play-track 免费曲播放成功（`ok:true`，返回真实 MP3 URL）、VIP 曲返回可读错误。
- [x] 源码公开：桥文件 + 修改说明存 `third_party/folia-major/`（AGPL-3.0 合规分发）。

## 方案 A：Fork + 同文档嵌入（2026-09-12 第三轮）

用户明确要求**放弃 iframe 套皮**，改为 fork Folia 并做真正集成。已实现核心骨架：

- [x] **Fork 仓库**：服务器 `/opt/folia/folia-major-main` git 化（`git init` + 基线 commit `0643947`，分支 `folia-embed`）。
- [x] **Folia embed 模式**：`bootstrap.tsx` 支持检测 `#folia-embed-root` 容器（存在即 embed 模式，挂载到该容器而非 `#root`，并强制 `setView('player')`）；`AppShell.tsx` embed 时根元素 `fixed inset-0` → `absolute inset-0`（容器内自适应）。
- [x] **Vue 音乐页同文档嵌入**：`MusicLibraryPage.vue` 的 iframe 替换为 `folia-embed-host` 容器 + `loadFoliaEmbed()`（动态加载 runtime-config + main chunk（ES module），创建 `#folia-embed-root`，Folia React 树直接渲染在 Vue 文档内）。消息改走 `window.postMessage`（同文档桥）。
- [x] **同文档互通（零成本）**：localStorage 天然共享 → 网易云 cookie 互通直接生效（实测 `cookieMatches: True`）；无需 postMessage 传 cookie 即可互通。
- [x] **主题桥（基础）**：`shizuki:set-theme` 消息，embed 加载后同步站点昼夜模式到 Folia（`setDaylightPreference`）。
- [x] **E2E 验证**：iframeCount=0、embedMounted=True、cookieSync=True、play-result ok（带 30s 进度播放成功）。

## 音源统一 + 无缝切换（2026-09-12 第四轮）

- [x] **音源统一（普通模式 = Folia 同款）**：后端 `MediaServiceImpl.canUseNeteaseAccountSource` 放宽（绑定网易云即用账号通道，不再要求 account_first/only）；`resolvePlaybackTrack` 网易云账号优先解析（与 Folia 同款 ncm-api + cookie），meting 兜底。实测 `resolve-playback` 返回完整 audio URL（非 30s 试听）。
- [x] **Folia 预加载**：`preloadFoliaScripts` 用 `modulepreload` 后台预取 Folia 主 chunk（进入音乐页即预热，切模式时字节已缓存）。
- [x] **Folia 容器常驻（无缝切换）**：`folia-embed-pane` 由 `v-if` 改为常驻 + `folia-embed-visible/hidden` class 显隐；切走不销毁 React 树。实测：首次 12s（冷启动），**二次切换 0ms（纯 CSS 显隐）**。
- [x] **embed 布局修复**：`folia-embed-host` 加 `transform/contain/isolation` 创建独立层叠上下文，Folia 内部 fixed 遮罩不再盖住 Vue 模式切换条（实测切回普通模式按钮可点）。
- [x] **基础设施故障修复**：登录 500 根因是**磁盘 100% 满** → Redis 无法持久化（`No space left on device`）。清理 17 个旧备份快照（7.5G）+ Docker 悬空镜像/缓存 → 磁盘 0→12G；Redis 恢复 healthy；登录恢复（HTTP 400 业务响应而非 500）。

## 合一方向确认 + 歌词对齐修复（2026-09-12 第五轮）

- [x] **合一架构方向确认**：保留 Vue 壳（歌单管理/搜索/收藏/导航），Folia 四项能力注入各视图（网易云音源统一✓、歌词普通/沉浸切换、歌单列表/大屏切换、播放条桥接），不做整页模式切换。
- [x] **沉浸歌词对齐修复**：桥 `playTrack` 直接播放绕过了 Folia 歌词加载流程（`omni.getLyrics`）→ 歌词可能未加载或 fallback。修复：桥播放后主动调 `neteaseApi.getLyric` + `processNeteaseLyrics` + `setLyricsState`，确保沉浸歌词用**真实 LRC 时间戳**（非平均分配）。实测播放后 Folia 显示「00:39 播放中 Beyond」。
- [x] **进度继承双向**：普通→Folia 传 `positionMs`（桥内轮询 seek 至 duration 就绪）；Folia→普通 播放后调 `player.seekToTime` 继承进度。

**待办（后续增量）**：
- [ ] 合一落地：歌词普通/沉浸切换、歌单列表/大屏切换、播放条桥接（阶段2-4）
- [ ] 主题深度桥接（站点 accent/壁纸 → Folia 视觉参数）
- [ ] Spotify 支持方案（Folia 无 Spotify，需独立设计）
- [x] 本地 git commit（不 push）。

## 无缝切换稳定化（2026-09-14）

- [x] **模式树常驻**：普通 Vue 工作区移除 `v-if` 卸载，普通/Folia 两侧改为同尺寸常驻层，以 `visibility`、`opacity`、`pointer-events` 和 `inert` 切换；隐藏普通模式时停止播放条频谱循环。
- [x] **唯一音频源交接**：首次与后续切换统一发送完整 `shizuki:follow-playback` 快照，歌单/lattice 入口先更新站点队列，切回时不再拉取 Folia 重播；Folia 播放/暂停命令反向控制站点播放器。
- [x] **平滑时钟与跨路由保温**：Folia 用 rAF 投影站点时钟，离开音乐页时停泊 React 根节点、返回时直接搬回；脚本与 mount 过程改为单例 Promise 并在首屏完成后 idle 预热。
- [x] **回归验证**：新增 Folia 切换契约测试；全量 Vitest `238 files / 1389 tests` 通过，Vite 生产构建通过；真实 Folia 资源代理下 12 次往返切换处理耗时 `0.1-1.8ms`，DOM 与音频元素身份稳定，390px 窄屏无横向溢出。

## 实施要点（供后续维护）

- 镜像：`folia-local/gateway:0.7.7-music`（源码在 `/opt/folia/folia-major-main`，构建文件在 `/opt/folia/deploy/`）。
- 子路径：vite 构建时 `VITE_BASE_PATH=/music`（改自上游 vite.config.ts 一行），gateway nginx 模板 netease 反代指向 `shizuki-site-music-ncm-api:3000`。
- 网络：gateway 加入 `shizuki-site_default`（external）以访问现有网易云 API 容器。
- 前端集成：`MusicLibraryPage.vue` 新增 `foliaMode` ref（localStorage key `shizuki.music.foliaMode`），`FOLIA_EMBED_URL='/music/'`；iframe `allow="autoplay; fullscreen; encrypted-media; picture-in-picture"`。
- 酷狗/QQ/AI 主题（backend /api/）：未部署，后续需要时构建对应镜像并恢复 nginx location。
- 升级：重新下载上游 main 源码 → 重放两处补丁（vite base + nginx 模板）→ `docker compose build`；前端改动随 `vue3-merged` 正常构建发布。

## 已完成任务

- [x] 调研 folia-major：技术栈、Web 版可行性、音源 API 依赖、Docker 部署形态（见 `tmp/folia-integration-plan.md`）。
- [x] 确定方案 A（独立子路径挂载）并记录 proposal / design / spec。
- [x] 服务器实测：Docker Hub / papersman 镜像不可达；gh-proxy 可下载源码；npm ci + vite build 在 node:24-alpine 容器内成功。
- [x] 部署：本地构建 gateway 镜像 → 容器启动 healthy → openresty /music/ 反代 → 端到端验证通过。
- [x] 前端集成：music 页面 Folia 模式开关 + 同源 iframe 嵌入 → 线上发布。
