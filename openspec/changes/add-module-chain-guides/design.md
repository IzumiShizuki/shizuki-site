## Context

本仓库是以 `apps/monolith-app` 为运行入口的 Maven 单体应用，业务代码按 `user-module`、`content-module`、`media-module`、`ai-module` 拆分，并由共享库提供模型、Web 安全和外部集成边界。前端位于 `fronted/vue3-merged`，通过 `src/services/*Api.js` 调用单体 API。现有 `.agent/` 文档已经覆盖目录、架构、配置和交付，但模块细节与真实源码入口之间缺少可跳转的证据链。

## Goals / Non-Goals

**Goals:**

- 为四个业务模块各提供一份“职责 → API → Service → 持久化/外部依赖 → 前端入口”的阅读路径。
- 为常见跨模块场景提供端到端链路，尤其是认证过滤、用户配额、音乐账号、AI 流式会话和对象存储。
- 使用代表性源码路径、迁移版本和前端调用点作为证据，并明确哪些内容是总览而非逐端点清单。
- 让新 Agent 能根据任务类型快速选择应先读的模块文档和源文件。

**Non-Goals:**

- 不改变 Java、Vue、SQL、配置、部署脚本或运行时行为。
- 不把每一个 DTO 字段、每一个 Controller 方法或每一条 SQL 复制到 `.agent/`；源码仍是最终事实来源。
- 不记录配置文件中的密钥、Cookie、令牌或其他敏感值。
- 不把远程个人服务器、卓望系统服务器或本地 Docker 的运维说明混入模块链路。

## Decisions

### 1. 按模块拆分文档，再单独维护跨模块链路

选择 `.agent/07-user-module.md`、`.agent/08-content-module.md`、`.agent/09-media-module.md`、`.agent/10-ai-module.md` 和 `.agent/11-cross-module-flows.md` 五份文档，而不是继续把所有细节堆进一个架构文件。这样 Agent 可以按任务加载最小上下文；跨模块链路则集中记录边界，避免在四份文档中重复且互相漂移。

替代方案是只扩展 `.agent/02-architecture.md`，但该文件会同时承担宏观架构和源码索引，难以承载轻应用、音乐、AI 会话等功能矩阵，因此不采用。

### 2. 以代表性链路和稳定入口为主，不追求 API 全量复制

每份模块指南使用功能矩阵、Mermaid/文本链路、关键源码路径和改动检查清单。API 只列 Controller 的稳定路由组和典型动作；详细实现仍链接到 Controller、Service、Mapper/Entity 和迁移目录。这样既能快速定位，也降低新增端点后文档失真的范围。

### 3. 把跨模块协作写成显式 Port/Gateway 链路

当前 Maven POM 没有让四个业务模块直接互相依赖；用户信息、配额和音乐凭据通过 `common-integration` 的 `UserServicePort` 以及 user 侧 `UserServicePortAdapter` 暴露，AI 和 media 分别使用 `UserQuotaGateway`、`UserMusicGateway`。文档将这个事实作为边界规则，并把 `apps/monolith-app` 的装配位置作为最后一跳。

替代方案是按“模块 A 直接调用模块 B”描述，虽然短，但会误导新 Agent 在错误模块添加依赖，因此不采用。

### 4. 迁移说明区分模块迁移和单体合并迁移

模块指南同时指出 `modules/*/src/main/resources/db/migration` 与 `apps/monolith-app/src/main/resources/monolith/db/migration*` 两条迁移路径，并给出版本族和典型功能。文档不假定修改一个模块迁移文件就等价于生产单体迁移已完成，遇到 schema 变更时要求 Agent 先检查单体合并路径。

### 5. 文档链接只引用仓库内可验证的路径

新增文档的源码引用优先使用相对 Markdown 链接或代码路径；不写入真实远端地址、账号、密钥和运行时配置值。校验阶段使用路径扫描、OpenSpec 严格校验和敏感信息模式扫描。

## Risks / Trade-offs

- [源码演进导致链路过时] → 每份文档保留“源码是最终事实”声明，并在任务完成前用 `rg` 对关键类、路由和文件路径复核。
- [代表性 API 被误读为完整 API 清单] → 标题和表格明确标注“代表性路由组”，并链接到 Controller 源码。
- [模块迁移与单体迁移重复维护] → 在每份涉及数据的文档和跨模块文档中同时列出两条迁移路径，提醒修改前核对发布入口。
- [文档过长导致 Agent 上下文浪费] → 总览文件只保留跳转索引，详细内容按模块拆分；跨链路只写高频链路和边界。

## Migration Plan

1. 创建四份模块指南和一份跨模块链路指南。
2. 将新指南加入 `.agent/README.md`、项目地图、架构说明和参考索引。
3. 运行 OpenSpec 严格校验、相对路径校验、敏感信息扫描和适用的文档检查。
4. 如未来源码入口发生变化，优先更新对应模块指南和跨模块链路，再更新总览索引。

本变更没有运行时迁移，也没有回滚数据库或配置的需要；若文档不再适用，删除或修订对应 `.agent/` 文件即可。

## Open Questions

无。当前任务边界、文档拆分和证据来源已经足以执行。
