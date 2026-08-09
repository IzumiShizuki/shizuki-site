# 权威资料索引

`.agent/` 是导航层，不是所有设计的副本。下面按“遇到什么问题读什么”列出仓库内的主要来源；详细内容可能包含历史计划，落地时必须回到当前源码、测试和配置核对。

## 1. 必读约束与入口

| 文件 | 内容 |
| --- | --- |
| [AGENTS.md](../AGENTS.md) | 智能体协作协议、服务器归属、bd/git 收尾和推送限制 |
| [README.md](../README.md) | 项目保留入口、常用启动/构建命令和顶层结构 |
| [pom.xml](../pom.xml) | Java 版本、Spring Boot 版本、Maven 模块和依赖管理 |
| [fronted/vue3-merged/package.json](../fronted/vue3-merged/package.json) | 前端脚本、依赖和 pnpm overrides |

## 2. 设计与开发规范

| 文件 | 适用场景 |
| --- | --- |
| [01_总体设计文档_v0.1.md](../resouces/md/01_总体设计文档_v0.1.md) | 产品定位、用户/权限模型、业务边界、单体模块化和部署容量 |
| [02_代码开发文档_v0.1.md](../resouces/md/02_代码开发文档_v0.1.md) | 技术栈、模块职责、API/数据库/迁移和开发顺序 |
| [03_框架与工具类搭建计划_v0.1.md](../resouces/md/03_框架与工具类搭建计划_v0.1.md) | 公共库、基础组件、测试计划和阶段 DoD |
| [05_AI协作开发规范_v0.1.md](../resouces/md/05_AI协作开发规范_v0.1.md) | API、安全、数据、注释、工具入口和 AI 协作要求 |
| [standards/00_规范导航.md](../resouces/md/standards/00_规范导航.md) | 规范索引、术语、命名、前端分层和 API/SQL 对齐 |
| `resouces/md/standards/01_术语总表.md` | 领域术语和统一命名 |
| `resouces/md/standards/02_命名规范.md` | 后端/前端/数据库命名规则 |
| `resouces/md/standards/05_API_SQL_模型命名对齐规范.md` | API、SQL、实体和 DTO 的对齐方式 |

## 3. 后端阅读与专项方案

| 文件/目录 | 适用场景 |
| --- | --- |
| [boke/00_后端阅读地图.md](../resouces/md/boke/00_后端阅读地图.md) | 从请求入口、鉴权、治理、迁移和核心表开始阅读后端 |
| [boke/09_配置清单与运行建议.md](../resouces/md/boke/09_配置清单与运行建议.md) | 配置分层、启动校验、存储可用性和运行策略 |
| `resouces/md/boke/01_单体模块化架构与请求链路.md` | 单体模块边界与请求链路专题 |
| `resouces/md/boke/02_认证授权与用户域设计.md` | 认证、授权、用户域专题 |
| `resouces/md/boke/03_博客内容域与可见性策略.md` | 内容、博客和可见性专题 |
| `resouces/md/boke/04_媒体资产域与L2D校验链路.md` | 媒体资产和 L2D 专题 |
| `resouces/md/boke/05_音乐系统：检索_解析_缓存_歌单.md` | 音乐链路和缓存专题 |
| `resouces/md/boke/06_AI会话与配额联动.md` | AI 会话和配额专题 |
| `resouces/md/boke/07_审计_限流_异常与安全基线.md` | 审计、限流、异常和安全基线 |
| `resouces/md/boke/08_Flyway迁移与核心数据表地图.md` | Flyway 与核心数据表地图 |

## 4. API、数据库与部署

| 文件/目录 | 内容 |
| --- | --- |
| [resouces/postman/shizuki-site-apis.postman_collection.json](../resouces/postman/shizuki-site-apis.postman_collection.json) | 可导入的 API 请求集合；请求前确认环境和认证信息来源 |
| `resouces/sql/` | 初始化 SQL、对象名映射和按域拆分的 SQL 资料 |
| `apps/monolith-app/src/main/resources/monolith/db/migration/` | 单体 Flyway 迁移事实来源 |
| `deploy/README.md` | Windows 发布入口、服务端 Compose 和运行时说明 |
| `deploy/docker-compose.server.yml` | 服务端生产编排；修改前确认外部状态影响 |
| `deploy/nginx.frontend.conf` | 前端静态资源、API 代理和缓存边界 |
| `deploy/meguri-website.md` | Meguri 网关的后端/前端/部署/回滚专项说明 |
| `docker/` | 镜像构建文件；不等于默认本地中间件方案 |

## 5. 查找命令

```powershell
# 找 Java 类、接口或配置键
rg -n "关键词" apps modules libs model

# 找前端页面、服务、路由或测试
rg -n "关键词" fronted/vue3-merged/src

# 找迁移、脚本和配置入口
rg --files apps modules deploy resouces | rg "migration|application|compose|\.bat$|\.sh$|\.yml$|\.yaml$"
```

遇到文档中的旧版本号、计划项或与源码不一致的描述时，保留它作为历史背景，但不要按它执行未经验证的操作；优先以当前 Git 工作树、测试、脚本和用户当前指令为准。
