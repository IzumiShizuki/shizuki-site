# 架构与请求链路

## 1. 总体形态

这是“单体运行、模块化组织”的后端，不是当前已拆分部署的微服务。Maven 在编译期把 `libs`、`model` 和 `modules` 组合进 `apps/monolith-app`，Spring Boot 在一个进程和一个应用上下文内加载它们。

```text
浏览器
  │  Vite 开发服务器 / 生产静态资源
  ▼
fronted/vue3-merged/src/services
  │  /api/v1 + Authorization: Bearer ...
  ▼
monolith-app
  ├─ 入口过滤器、配置、异常/响应和跨域能力
  ├─ 模块 Controller
  │   ├─ user-module
  │   ├─ content-module
  │   ├─ media-module
  │   └─ ai-module
  ├─ Service / Integration / Task
  └─ Mapper / MyBatis-Plus
       ├─ PostgreSQL（默认远端）
       ├─ Redis / Kafka（按功能和配置使用）
       └─ 外部 OAuth、媒体、AI 或辅助服务
```

## 2. 后端分层规则

- `controller`：HTTP 协议、参数校验、权限注解和响应包装；不承载复杂业务流程。
- `service` / `service.impl`：业务用例、事务边界、状态变化和跨组件编排。
- `mapper`：MyBatis-Plus 数据访问；复杂 SQL 要与实体字段、迁移和分页语义保持一致。
- `integration`：第三方 HTTP/OAuth/存储等外部协议适配，避免把外部 SDK 细节散落到业务层。
- `task` / `mq`：定时任务、异步任务或消息处理；修改时要考虑幂等、重试和可观测性。
- `model`：跨模块共享的实体与 DTO。请求/响应结构变化时，前后端调用和 Postman 集合也要一起检查。
- `libs`：只放可跨业务复用的能力；业务规则应留在对应 module。

公共响应、错误、重试、安全和审计能力优先复用 `libs` 中已有实现。先搜索现有类，再新增工具类，避免产生第二套响应或认证约定。

## 3. 认证与请求入口

- 应用配置将 Sa-Token 的请求头约定为 `Authorization: Bearer <token>`；不要在新接口中发明另一种认证头。
- `AuthEntryFilter` 和 `common-servlet` 中的安全能力负责入口级处理；模块 controller 继续执行自身的资源/分组权限检查。
- 普通用户、分组权限和管理操作的边界不同。看到 `ADMIN`、`@RequireGroup` 或 privilege 相关代码时，先阅读现有测试和 [代码开发文档](../resouces/md/02_代码开发文档_v0.1.md) 的认证章节。
- 前端带认证请求通常经过 `src/composables/useAuthSession.js`、`src/services/httpClient.js` 或现有 API service；不要在页面内散落裸 `fetch`，除非已有同类模式。

## 4. 数据与迁移

- 数据库迁移以 Flyway 文件为事实来源。主单体迁移位于 `apps/monolith-app/src/main/resources/monolith/db/migration`，模块迁移位于各模块 `src/main/resources/db/migration`。
- 新表/新字段通常需要同时更新 migration、entity、mapper、service、request/response、测试和必要的种子数据。
- `application.yml`、`application-docker.yml` 和 `application-mysql.yml` 体现不同运行环境；不要把本地默认值误当成生产配置。
- 数据库、Redis、Kafka 的地址和凭据从外部配置注入。开发时不要把远端数据导出到仓库，也不要未经确认执行破坏性 SQL。

## 5. 前端分层

- `src/pages` 负责路由页面和页面级编排；`src/components` 负责可复用 UI；`src/services` 负责 API；`src/composables` 和 `src/utils` 负责可测试的状态/纯逻辑。
- `src/router` 是页面入口与权限守卫的集中位置；新增受保护页面时同时检查登录和管理权限路径。
- 工程以 Vue 3 + Vite 为主，但依赖和配置同时支持 React、React DOM、tldraw、TipTap 等局部能力。修改编辑器/白板相关代码时先确认实际挂载方式，不要按“纯 Vue 项目”假设重构。
- `vite.config.js` 使用 `jsdom` 作为 Vitest 环境，并配置了 vendor/editor 等拆包；构建问题先检查依赖版本和手工分包配置。

## 6. 典型请求修改清单

当新增或修改一个业务功能时，按下面顺序追踪：

1. 前端路由/页面与 `services` 调用。
2. 后端 controller 的路径、HTTP 方法、鉴权和参数模型。
3. service 用例、事务和外部调用。
4. mapper、entity、migration 与数据兼容性。
5. 成功/错误响应、前端状态更新和测试。
6. 日志、审计、限流、重试和权限边界。

详细模块设计与 API 约束见 [06-reference-index.md](06-reference-index.md) 所列权威资料；若摘要与源码冲突，以源码和测试为准。
