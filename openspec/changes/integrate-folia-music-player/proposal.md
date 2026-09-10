# Proposal: 接入 Folia 全屏歌词音乐播放器（Web 独立部署）

## Why

用户希望在网页中直接体验到 Folia（folia-major，AGPL-3.0）的完整沉浸式歌词动画 UI。站点当前已有自研 Vue 音乐模块（MusicPlayer.vue、meting/ncm sidecar），但缺少 Folia 级别的全屏歌词动画与 AI 主题体验。

Folia 官方支持 Web 部署（React 18 + Vite + howler.js + PWA），Electron 仅为桌面壳。经调研（见 `tmp/folia-integration-plan.md`），选择**方案 A：独立子路径挂载**——在 `111.228.35.186` 以官方 Docker 镜像栈部署 Folia Web 网关，通过 Caddy 反代 `music.shizuki.online` 暴露，主站增加入口链接。不把 Folia 代码并入 `vue3-merged`（React→Vue 移植成本高，且 AGPL-3.0 会使私有仓库落入传染面）。

## What Changes

- 在服务器部署 Folia 官方 Docker 栈（gateway / backend / netease-api / kugou-api / qq-api），对外仅暴露 Web 网关端口。
- Caddy 增加 `music.shizuki.online` 反代到 Folia Web 网关（127.0.0.1:18080）。
- 音源配置：网易云复用站点现有 `music-ncm-api`（或 Folia 内置 netease-api），酷狗/QQ 使用官方镜像，QQ 需 `QQ_SESSION_SECRET`。
- 主站 `vue3-merged` 导航增加「Folia 音乐」入口（外链，保证全屏沉浸式 UI 完整）。
- 部署脚本与 .env 模板入库（`deploy/folia/`），便于复现与升级。

## Capabilities

### New Capabilities

- `folia-web-player`: 通过 `music.shizuki.online` 提供 Folia Web 播放器（搜索、播放、全屏歌词动画、PWA 安装、QQ/网易云/酷狗音源登录与播放、可选 AI 主题）。

### Modified Capabilities

- `site-navigation`: 主站导航新增 Folia 音乐入口。
- `music-playback`: 现有音乐模块保持不变，Folia 为独立实例（数据不打通，本次不做）。

## Impact

- 前端 `vue3-merged`：仅导航入口处新增一个外链项，无组件级改动。
- 后端 monolith-app：无改动（复用现有 music-ncm-api 可选）。
- 服务器 `111.228.35.186`：新增 Folia Docker 栈 + Caddy 规则 + `.env`；不修改现有站点容器。
- 无新 Maven 依赖；无构建链改动。
- 风险：AGPL-3.0（独立进程隔离，不并入私有仓库）；QQ 登录依赖会话签名与密钥保管；Docker Hub/镜像源可达性需在服务器确认。

## Non-Goals

- 不把 Folia 代码/动画逻辑移植进 `vue3-merged`（AGPL 传染 + 成本）。
- 不打通 Folia 与主站歌单/收藏/账号数据。
- 不部署 Folia Sync Server（跨设备主题同步，本期可选，默认不启用）。
