# Tasks: 接入 Folia 全屏歌词音乐播放器

## 待办任务

- [ ] 服务器确认环境：Docker 24+ / Compose v2 可用；Docker Hub 或镜像源可达（拉取 `papersman/folia-*`）；Caddy 可新增 `music.shizuki.online` 域名记录。
- [ ] 在服务器创建 `folia-docker/` 目录，下载官方 `compose.yaml` 与 `.env.example`，按 design 配置 `.env`（含 `QQ_SESSION_SECRET`、`SYNC_TOKEN`）。
- [ ] `docker compose config` 校验 → `docker compose pull` → `docker compose up -d --wait` → `docker compose ps` 全部 healthy。
- [ ] 验证 Web 网关：`curl http://127.0.0.1:18080/healthz` 返回 200；`/api/healthz` 正常。
- [ ] Caddy 增加 `music.shizuki.online` 反代到 `127.0.0.1:18080`，重载配置。
- [ ] 域名 `music.shizuki.online` DNS 解析到 `111.228.35.186`（如未解析）。
- [ ] 主站 `vue3-merged` 导航新增「Folia 音乐」外链入口，本地构建通过。
- [ ] 浏览器端到端验证：搜索/播放、全屏歌词动画主题、PWA 安装、移动端适配。
- [ ] 音源验证：网易云登录与播放（复用现有 ncm 实例或内置）；QQ 扫码/设备码登录（可选）；酷狗搜索播放。
- [ ] `openspec validate integrate-folia-music-player --type change --strict` 通过。
- [ ] 本地 git commit（不 push）。

## 已完成任务

- [x] 调研 folia-major：技术栈、Web 版可行性、音源 API 依赖、Docker 部署形态（见 `tmp/folia-integration-plan.md`）。
- [x] 确定方案 A（独立子路径挂载）并记录 proposal / design / spec。
