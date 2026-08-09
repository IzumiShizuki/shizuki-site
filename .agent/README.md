# Shizuki Site：智能体上下文入口

这不是第二份项目规约，而是给后续智能体使用的“阅读地图”。开始任何工作前，先读根目录 [AGENTS.md](../AGENTS.md)；它定义协作协议、服务器归属、提交与推送权限。本目录只负责把项目事实、入口和权威资料组织起来。

## 1. 推荐阅读顺序

1. [根目录 AGENTS.md](../AGENTS.md)：硬性约束、`bd` 任务流、服务器边界和会话收尾要求。
2. [01-project-map.md](01-project-map.md)：仓库结构、模块职责和源码入口。
3. 按当前任务选择一份主题文档：
   - 后端或架构：阅读 [02-architecture.md](02-architecture.md)。
   - 本地启动或调试：阅读 [03-development.md](03-development.md)。
   - 配置、中间件或部署边界：阅读 [04-configuration-and-boundaries.md](04-configuration-and-boundaries.md)。
   - 测试、发布或交付：阅读 [05-testing-and-delivery.md](05-testing-and-delivery.md)。
4. 需要深入背景时，再从 [06-reference-index.md](06-reference-index.md) 进入详细设计、规范、API 和部署文档。

## 2. 信息来源优先级

当不同文档出现差异时，按下面顺序判断：

| 优先级 | 来源 | 用途 |
| --- | --- | --- |
| 1 | `AGENTS.md` 与用户当前指令 | 协作权限、服务器归属、提交/推送等硬约束 |
| 2 | 当前脚本、配置和源码 | 实际可执行命令、路径、端口、API 和行为 |
| 3 | `.agent/` | 快速导航、摘要和任务分流 |
| 4 | `resouces/md/` 等设计资料 | 背景、设计决策、历史方案和专题说明；实现前仍需核对源码 |

`.agent/` 中的 Windows 外部路径表示本机开发依赖，不代表这些目录属于 Git 仓库；仓库内文件尽量使用相对链接。

## 3. 项目快照

- 后端：Java 17、Maven 多模块、Spring Boot 单体应用；启动入口是 `apps/monolith-app`。
- 业务模块：`modules/user-module`、`content-module`、`media-module`、`ai-module`。
- 公共层：`libs/common-core`、`common-servlet`、`common-integration`；共享模型在 `model`。
- 前端：`fronted/vue3-merged`，以 Vue 3 + Vite 为主，同时包含 React/tldraw 等局部能力。
- 默认本地端口：后端 `8080`，前端 Vite `5173`；中间件默认仍连接 `111.228.35.186`。
- 默认开发工具链根目录：`D:\environment`。具体版本和启动方式见 [03-development.md](03-development.md)。

## 4. 按任务分流

| 任务 | 最少阅读 | 主要入口 |
| --- | --- | --- |
| 找模块/找类 | 01 + 02 | `rg --files`、模块 `src/main/java` |
| 新增后端 API | 02 + 03 + 06 | controller → service → mapper；同步 request/response 与测试 |
| 修改前端页面 | 01 + 02 + 03 | `src/pages`、`src/components`、`src/services`、`src/router` |
| 修改认证/权限 | 02 + 04 + 06 | `common-servlet`、`user-module`、现有安全测试和规范文档 |
| 修改数据库 | 02 + 04 + 05 | Flyway migration、实体/请求/响应、集成测试；先确认迁移范围 |
| 启动失败/中间件异常 | 03 + 04 | 先确认配置来源和远端连通性，不擅自切换本地 Docker |
| 发布或部署 | 04 + 05 | `deploy/README.md`、`build-push-deploy.bat`；推送必须得到明确授权 |

## 5. 不可忽略的边界

- `111.228.35.186` 是本项目个人网站、个人中间件和部署目标的默认服务器。
- `111.228.52.91` 属于另一个项目；除非用户明确要求，不要把本项目或个人站点部署到那里。
- `resouces/yaml/common-config.yaml`、`deploy/.env.server` 等文件可能含私有配置。只读取完成任务所需的键名或结构，不把密码、Token、私钥和完整配置输出到聊天、日志或新文档。
- 未经用户明确授权，不执行 `git push`、生产部署或会造成数据覆盖的操作。
- `bd` 是项目约定的任务引擎；如果当前环境找不到 `bd`，记录为环境限制，仍完成可行的本地检查，不要伪造同步成功。

## 6. 文档维护

当模块、启动脚本、端口、配置路径、测试命令、部署目标或服务器边界变化时，同步更新本目录。更新后至少检查：

- 文档中引用的仓库路径和相对链接仍存在；
- 命令与当前脚本、`package.json`、`pom.xml` 一致；
- 没有把私有配置值复制进文档；
- `git diff --check` 通过，并在涉及代码时运行对应测试和构建。

最后更新时间：2026-08-09。动态事实以脚本、配置和源码为准。
