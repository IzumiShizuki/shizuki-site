# Meguri 网站端接入（爱莉 · /meguri）

本页记录 shizuki-site 作为 Meguri 第三客户端（网站端）的接入方式。设计依据为
Notion `AI/meguri` 文档 07（多端能力矩阵：网站 = 文字 + 静态立绘，无 TTS、无识屏）、
11（shizuki-site 部署与共存）与 19.7/20.7（统一 turn 事件协议）。meguri-pet 仓库
保持独立，网站只是 `meguri-core` 的一个客户端。

## 架构

```text
浏览器 /meguri（仅 ADMIN 可见）
  → site nginx /api/v1/meguri/*（SSE 关闭缓冲）
  → monolith MeguriGatewayController（站点登录 + ADMIN 校验）
  → MeguriGatewayService（注入 Bearer Token 与 X-Meguri-* 身份头）
  → https://bot.shizuki.online/meguri-core（远端 Java meguri-core）
```

- Core Token 与 `meguri_user_id` 只存在于服务端，浏览器拿不到（对应桌宠端
  `web-server.mjs` 的本地网关模式）。
- `client_id=website`、能力矩阵 `text+sprite`、`voice=false`、`screen_context=false`。
- 站长（ADMIN 组）映射到 `MEGURI_OWNER_USER_ID`（默认 `local-airi-user`，与桌宠一致，
  三端共享长期记忆）；其他登录用户仍走原有快聊/普通/酒馆模式，看不到 Meguri 入口。

## 新增内容一览

后端（monolith-app，无数据库迁移）：

- `config/MeguriGatewayProperties`：`shizuki.meguri.gateway.*` 配置。
- `meguri/MeguriGatewayService`：turn 创建、SSE 中继、取消、状态、立绘读取、健康探测。
- `controller/MeguriGatewayController`：`/api/v1/meguri/bootstrap|turns|sessions/{id}/events|assets/sprites/{file}`，
  类级 `@RequireGroup("ADMIN")` + 方法内二次校验。

前端（vue3-merged）：

- `pages/MeguriPage.vue`：立绘舞台 + 流式对话页（打字机、表情切换、会话恢复、停止、新会话）。
- `services/meguriApi.js`、`utils/meguriTurnStream.js`：网关调用与 SSE 解析/重连。
- 路由 `/meguri`（`requiresAuth + requiresAdmin`）；AI Hub 顶栏与 TopMenu 的管理员入口。
- `useAuthSession.authorizedRawFetch`：带 Bearer 的原生 fetch（SSE 与立绘 blob 需要）。

部署文件：`compose.yaml`、`deploy/docker-compose.server.yml`、`deploy/.env.server.example`、
`deploy/nginx.frontend.conf`（`/api/v1/meguri/` 关闭缓冲、超时 3600s）。

## 本地开发

```powershell
# 后端（7070）：先设置网关环境变量再启动
$env:MEGURI_GATEWAY_ENABLED = 'true'
$env:MEGURI_CORE_BASE_URL = 'https://bot.shizuki.online/meguri-core'   # 或本地 core
$env:MEGURI_CORE_TOKEN_FILE = 'D:\environment\secrets\meguri\desktop-core-token.txt'
$env:MEGURI_SPRITE_DIR = 'D:\program\meguri-pet\data\meguri\assets\sprites\meguri'
mvn -pl apps/monolith-app spring-boot:run

# 前端
cd fronted/vue3-merged
npm run test:unit   # 含 meguri 新增用例
npm run dev
```

本地 core 联调可把 `MEGURI_CORE_BASE_URL` 指到 `http://127.0.0.1:18080`（Java core）
并复用其 token；`MEGURI_TENANT_ID` 与 `MEGURI_OWNER_USER_ID` 需与该环境的身份约定一致。

## 服务器部署步骤

1. **上传立绘素材（一次性）**：把本机
   `D:\program\meguri-pet\data\meguri\assets\sprites\meguri\` 整个目录复制到服务器
   `/opt/shizuki-site/data/meguri-assets/sprites/meguri/`（约 400 张 PNG）。
   素材为游戏解包立绘，只经 ADMIN 鉴权接口下发，勿放公开静态目录。
2. **配置 `deploy/.env.server`**：参照 `.env.server.example` 新增 `MEGURI_*` 变量；
   `MEGURI_CORE_TOKEN` 填 meguri-core 接受的共享 Token（与桌宠端同源，不入 Git）。
3. **发布**：正常走 `build-push-deploy.bat`（backend 与 site 镜像都会重建，
   nginx 新增的 meguri location 随 site 镜像生效）。
4. **验收**：
   - 未登录访问 `/meguri` → 跳转登录；非 ADMIN → 跳回 profile。
   - ADMIN 打开 `/meguri`：状态显示「Meguri Core 在线 · build …」，默认立绘出现。
   - 发送消息：文字流式出现，`semantic.completed` 后立绘/表情切换。
   - 断网重连：刷新页面后未完成回合可恢复；「停止」按钮可取消回合。
   - 跨端记忆：网站告知爱莉一件事，桌宠/AstrBot 端可召回（同一 owner user id）。
   - 桌宠离线不影响网站聊天；AstrBot 原有功能无回归。
   - `docker logs shizuki-site-backend` 无 Token 泄漏（只应出现 warn 级摘要）。

## 回滚

无数据库迁移、无 meguri-stack 侧改动。设 `MEGURI_GATEWAY_ENABLED=false` 重启 backend
即完全关闭（前端 `/meguri` 显示「网关未启用」，其余站点功能不受影响）；或直接回退镜像。

## 已知边界（MVP）

- 聊天历史只存在于服务端会话上下文；刷新页面后不重建旧消息列表（会话 ID 会延续）。
- 未实现 outfit/mode 手动覆盖面板与天气/日报（桌面端主页功能），按 07 号文档网站
  能力矩阵保持纯文字 + 立绘。
- SSE 中继按站长单人使用设计（同步 servlet 线程,1–2 并发）；如未来开放多人需改
  异步中继与限流。
