## Why

当前 `.agent/` 已能帮助 Agent 定位仓库、启动方式和主要目录，但还停留在“导航层”：没有把 `user`、`content`、`media`、`ai` 四个业务模块的功能边界、代表性 API、服务实现、持久化以及跨模块适配器串起来。后续 Agent 仍需要重新遍历 Controller、Service、Mapper、迁移文件和前端 service，容易漏掉认证、配额、音乐账号、对象存储、AI 流式会话等关键链路。

## What Changes

- 新增四份按业务模块组织的 Agent 阅读指南，分别说明模块职责、功能分组、代表性 API、后端调用链、数据迁移和前端入口。
- 新增一份跨模块链路指南，记录认证、配额、音乐账号、博客/演示文稿、轻应用账单同步、媒体资源、AI SSE 会话、后台运维和 Meguri 网关等主链路。
- 更新 `.agent/README.md`、项目地图、架构说明和参考索引，让 Agent 能从总览快速跳转到模块级说明。
- 在文档中明确模块间通过 `UserServicePort`、`UserQuotaGateway`、`UserMusicGateway` 等边界协作，避免把当前 Maven 依赖关系误读为业务模块直接互相依赖。
- 不修改运行时代码、数据库结构、API 行为或部署配置；本变更只补充可维护的项目知识文档。

## Capabilities

### New Capabilities

本变更是纯文档和 Agent 导航改进，不引入运行时能力，因此不创建行为规格。

### Modified Capabilities

无。

本变更通过 `openspec/changes/add-module-chain-guides/.openspec.yaml` 设置 `skip_specs: true`。

## Impact

- 受影响文件：`.agent/` 下的导航和模块指南，以及本 OpenSpec 变更记录。
- 依据来源：`modules/*-module/src/main/java`、各模块 Flyway 迁移、`apps/monolith-app`、`fronted/vue3-merged/src/services` 和主要页面组件。
- 不产生新的依赖、迁移、接口或外部系统变更。
