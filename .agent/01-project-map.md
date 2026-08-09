# 项目地图

## 1. 顶层结构

```text
shizuki-site/
├─ AGENTS.md                         # 智能体协作硬约束
├─ pom.xml                           # Java 17 Maven 聚合与依赖管理
├─ apps/monolith-app/                # 可运行的 Spring Boot 单体入口
├─ libs/                             # 公共能力库
│  ├─ common-core/
│  ├─ common-servlet/
│  └─ common-integration/
├─ model/                            # entity / request / response 共享模型
├─ modules/                          # 业务模块，编译时组合进单体
│  ├─ user-module/
│  ├─ content-module/
│  ├─ media-module/
│  └─ ai-module/
├─ fronted/vue3-merged/              # Vite 前端工程（目录名中的 fronted 是既有约定）
├─ resouces/                         # 项目设计、SQL、YAML、Postman 等资料
├─ deploy/                           # 服务端 Compose、Nginx、部署辅助脚本
├─ docker/                           # 镜像构建文件
├─ services/                         # 独立辅助服务，例如 slides-api
└─ tools/                            # 同步、转换和 sidecar 等工具
```

## 2. 模块职责

| 目录 | 主要职责 | 常见改动位置 |
| --- | --- | --- |
| `libs/common-core` | 通用模型、响应、错误、时间、重试等不依赖 Web 的基础能力 | `src/main/java/io/github/shizuki/common/core` |
| `libs/common-servlet` | Web、认证授权、审计、限流、过滤器和安全相关通用能力 | `src/main/java/io/github/shizuki/common` |
| `libs/common-integration` | OAuth、存储和外部系统接入适配 | `src/main/java/io/github/shizuki/common/integration` |
| `model` | 跨模块共享的实体、请求 DTO、响应 DTO 和类型处理器 | `model/entity`、`model/request`、`model/response` |
| `modules/user-module` | 用户、注册登录、OAuth、分组权限、配额和用户侧音乐账号 | `.../site/user/controller`、`service`、`mapper` |
| `modules/content-module` | 博客/帖子、作者、应用中心、轻应用、互动和可见性策略 | `.../site/content/controller`、`service`、`task` |
| `modules/media-module` | 壁纸、L2D、媒体资产、音乐检索/播放/缓存和供应商 | `.../site/media/controller`、`service`、`integration` |
| `modules/ai-module` | AI 会话、角色/世界书、记忆、配额和 AI 外部接入 | `.../site/ai/controller`、`service`、`integration` |
| `apps/monolith-app` | Spring Boot 启动、跨模块配置、入口过滤器、管理运维和 Meguri 网关 | `MonolithApplication`、`controller`、`config`、`ops` |
| `fronted/vue3-merged` | 页面、路由、组件、服务调用、组合式状态和移动端页面 | `src/pages`、`src/components`、`src/services` |
| `deploy` / `docker` | 生产 Compose、反向代理、镜像和 Windows 发布辅助 | `deploy/README.md`、`docker/*.Dockerfile` |

## 3. 常用源码入口

### 后端

- 应用启动：`apps/monolith-app/src/main/java/io/github/shizuki/site/monolith/MonolithApplication.java`
- 跨模块入口：`apps/monolith-app/src/main/java/io/github/shizuki/site/monolith/controller`
- 认证入口过滤器：`apps/monolith-app/src/main/java/io/github/shizuki/site/monolith/filter/AuthEntryFilter.java`
- 管理运维：`apps/monolith-app/src/main/java/io/github/shizuki/site/monolith/ops`
- Flyway 主迁移：`apps/monolith-app/src/main/resources/monolith/db/migration`
- 模块迁移：各模块的 `src/main/resources/db/migration`
- 共享响应：`libs/common-core/src/main/java/io/github/shizuki/common/core/response`

### 前端

- 启动入口：`fronted/vue3-merged/src/main.js`、`src/App.vue`
- 路由：`fronted/vue3-merged/src/router/index.js`
- API 服务：`fronted/vue3-merged/src/services`
- 页面：`fronted/vue3-merged/src/pages`
- 可复用组件：`fronted/vue3-merged/src/components`
- 组合式状态和浏览器能力：`fronted/vue3-merged/src/composables`、`src/utils`
- 移动端专用视图：`fronted/vue3-merged/src/mobile`
- Vite/Vitest 配置：`fronted/vue3-merged/vite.config.js`

## 4. 找功能的建议路径

1. 先用 `rg -n "关键词" modules apps fronted/vue3-merged` 查 API 名、页面名、实体名或配置键。
2. 后端从 controller 进入，沿 `service` → `mapper` → entity/SQL 追踪；不要只改 DTO 就认为功能完成。
3. 前端从路由或页面进入，沿 `services` → `composables`/`utils` → 组件追踪状态和请求。
4. 涉及数据结构时同时检查实体、request/response、Flyway migration、API 测试和前端服务。
5. 先确认功能属于哪个业务模块，再决定公共能力是否应下沉到 `libs`；不要把业务逻辑放进 `monolith-app` 仅因为入口在这里。

## 5. 相关资料

更完整的职责和设计背景见 [06-reference-index.md](06-reference-index.md)，不要把本页当成完整 API 清单。
