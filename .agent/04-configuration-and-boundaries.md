# 配置、环境与服务器边界

## 1. 关键边界

| 范围 | 当前约定 | 处理原则 |
| --- | --- | --- |
| 仓库 | `D:\program\shizuki-site` | 项目源码、文档和可提交配置 |
| 本机工具链 | `D:\environment` | 复用现有运行时；不要覆盖或清理 |
| 私有公共配置 | `resouces/yaml/common-config.yaml` | 只按需读取；不回显密钥，不提交新凭据 |
| 默认个人网站服务器 | `111.228.35.186` | PostgreSQL `5432`、Redis `6379`、Kafka `9092`、API `8080` |
| 默认生产部署目录 | 服务器 `/opt/shizuki-site` | 只通过已授权的发布/运维流程修改 |
| 另一个项目的服务器 | `111.228.52.91` | 属于 zhuowang_system；本项目默认禁止使用 |

除非用户在当前任务中明确覆盖，以上服务器归属和部署边界保持不变。

## 2. 配置来源地图

- `apps/monolith-app/src/main/resources/application.yml`：单体应用的公共 Spring、MyBatis-Plus、Sa-Token、审计和 AI 配置。
- `apps/monolith-app/src/main/resources/application-docker.yml`：容器内 PostgreSQL/Redis/Kafka 等连接方式。
- `apps/monolith-app/src/main/resources/application-mysql.yml`：MySQL 兼容环境配置，不代表默认开发/生产路径。
- `resouces/yaml/common-config.yaml`：本机/部署同步使用的私有配置；可对照不含真实值的 `common-config.example.yaml`。
- `resouces/yaml/monolith.yaml`：单体相关配置资料/覆盖项，修改前确认实际加载关系。
- `compose.yaml`、`deploy/docker-compose.server.yml`：容器编排和部署服务边界。
- `deploy/.env.server.example`：服务器环境变量名称示例；真实 `deploy/.env.server` 不应进入文档或日志。
- `fronted/vue3-merged/vite.config.js` 与 `package.json`：前端构建、测试和拆包配置。

配置键的真实覆盖顺序以 Spring、启动脚本和部署文件为准。文档中的示例值不能替代私有配置，也不能用空值覆盖生产配置。

## 3. 中间件原则

- 默认路径是连接个人网站服务器上的 PostgreSQL、Redis、Kafka 和 API，不是本地 Docker。
- 启动失败时先检查目标地址、端口、环境变量、网络和服务状态；不要为了“让它启动”直接改为另一个项目的服务器。
- 需要本地中间件隔离时，必须得到用户明确要求，并把修改范围、回滚方式和数据影响说清楚。
- 数据库迁移、缓存清理、Kafka topic 变更和远端 Compose 操作都属于有外部影响的动作，执行前确认目标和授权。

## 4. 敏感信息规则

以下内容只能留在既有私有配置或安全的本地环境中：密码、API key、OAuth secret、JWT secret、Token、私钥、完整 Cookie、真实账号和私有 URL 查询参数。

允许写入 `.agent/` 的内容：

- 文件路径、配置键名、非敏感默认端口和服务角色；
- 不含真实值的变量名，例如 `DB_URL`、`DB_USERNAME`、`DB_PASSWORD`、`AI_CHAT_API_KEY`；
- “从哪个配置入口读取”的说明，以及缺少配置时应如何诊断。

读取日志或 YAML 时，只输出脱敏后的键名和结构。发现疑似泄露时停止扩散，先隔离并通知用户，不要把秘密复制到 issue、commit message 或测试快照。

## 5. 发布归属

项目的 `build-push-deploy.bat` 和 `deploy/server_deploy_fast.py` 面向 `111.228.35.186`。发布前会检查工作树、运行前端测试和生产构建，并可能执行 Git 拉取/推送与远端重建。普通开发任务不要调用它；需要发布时先阅读 [deploy/README.md](../deploy/README.md) 和 [05-testing-and-delivery.md](05-testing-and-delivery.md)，并确认用户已授权推送/部署。
