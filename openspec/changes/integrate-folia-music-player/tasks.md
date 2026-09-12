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
- [x] **账号互通排查结论**：cookie 在后端 DB 有效（`music_cookie_netease` 记录，解密后登录态 `IzumiShizuki` / vipType 110 黑胶 VIP）；前端 sync 逻辑已上线；**VIP 歌播放失败是网易云对第三方 API 的风控**（`song/url/v1` 返回 code 404，匿名与带 cookie 均 NULL），普通歌正常——非集成 bug，与 Folia/本站均无关。
- [x] 前端 `vue3-merged` 构建通过；服务器 `Dockerfile.frontend` 无缓存重建并重启容器。
- [x] **删除 TopMenu GitHub 图标**：TopMenu.vue + global.css 中 github-style-box 全部清除（fa-github 字体字形保留，属 FontAwesome 库定义）。
- [x] 后端构建部署：`Dockerfile.backend` 重建 `shizuki-site/backend:latest`，新 cookie 端点 401（鉴权正确）。
- [x] E2E 验证（Playwright + Edge）：模式切换条 ✓、GitHub 图标移除 ✓、iframe 加载 ✓、sync-cookie 写入 iframe localStorage ✓、get-status 回包 ✓、play-track 免费曲播放成功（`ok:true`，返回真实 MP3 URL）、VIP 曲返回可读错误。
- [x] 源码公开：桥文件 + 修改说明存 `third_party/folia-major/`（AGPL-3.0 合规分发）。
- [ ] 本地 git commit（不 push）。

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
