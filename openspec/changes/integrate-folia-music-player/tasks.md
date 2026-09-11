# Tasks: 接入 Folia 全屏歌词音乐播放器

## 待办任务

- [x] 服务器确认环境：Docker 24+ / Compose v2 可用（实测 29.2.1 / v5.0.2）；Docker Hub 直连与 papersman 官方镜像不可达 → 改为本地源码构建。
- [x] 服务器创建 `folia-docker/`（实际 `/opt/folia/deploy/`），编写自定义 compose 与 .env（实测无需官方镜像）。
- [x] `docker compose up -d` → gateway 容器 healthy（端口 127.0.0.1:18081）。
- [x] 验证 Web 网关：`curl http://127.0.0.1:18081/healthz` 200。
- [x] openresty 配置 `location /music/` 反代（rewrite 去前缀 + proxy_pass 18081），`nginx -t` 通过并 reload。
- [x] 域名路径 `https://shizuki.online/music/` 本机与服务器均可访问（无需新 DNS）。
- [x] 主站入口：改为**音乐页内嵌模式切换**——`MusicLibraryPage.vue` 顶部加「普通模式 / Folia 沉浸模式」开关，Folia 模式同源 iframe 嵌入 `site.shizuki.online/music/`（localStorage 持久化）。
- [x] site.shizuki.online 增加 `/music/` 同源反代（openresty），iframe 与主站同源共享 cookie。
- [x] 前端 `vue3-merged` 构建通过（本地 vite build 21.7s）；服务器 `Dockerfile.frontend` 重建 `shizuki-site/site:latest` 并重启容器。
- [x] 线上验证：`MusicLibraryPage` chunk 含「Folia 沉浸模式」「/music/」「shizuki.music.foliaMode」。
- [x] 浏览器端到端验证：headless Edge 加载 179 chunks + PWA SW 注册成功；音乐页截图 948KB 确认 UI 渲染。
- [x] 音源验证：网易云搜索（277 结果）、歌词（lrc 200）、二维码登录（unikey 正常）通过 gateway /netease/ 反代到现有 music-ncm-api。
- [x] `openspec validate integrate-folia-music-player --type change --strict` 通过。
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
