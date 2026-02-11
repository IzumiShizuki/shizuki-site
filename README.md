# Shizuki Site - 个人学习陪伴平台

> 一个集学习陪伴、内容沉淀、作品展示与 AI 对话于一体的个人站点

## 项目简介

Shizuki Site 是一个"长期生活系统"型个人站点，提供：

- 🎭 **学习陪伴**：动态角色 + 背景音乐 + 环境音 + 可定制 Widgets
- 📝 **内容沉淀**：博客文章、时间线、项目展示
- 🤖 **AI 对话**：支持角色卡、世界书、OpenAI 兼容协议
- 🎨 **视觉体验**：毛玻璃效果、圆角卡片、分区背景配置

## 技术栈

### 后端
- **语言与框架**：Java 17 + Spring Boot 3.2.x
- **微服务治理**：Spring Cloud Gateway + Nacos
- **数据访问**：MyBatis-Plus + MySQL 8
- **缓存与会话**：Redis 7
- **对象存储**：阿里云 OSS
- **安全认证**：Sa-Token
- **构建工具**：Maven 多模块

### 架构设计
- 微服务架构（Gateway + 4 个业务服务）
- 统一鉴权与限流
- 审计日志与配额管理
- OWASP ASVS L1 安全基线

## 快速开始

### 前置要求
- JDK 17+
- Maven 3.6+
- Docker & Docker Compose

### 启动步骤

1. **启动中间件**
```bash
./scripts/up-middleware.sh
# 或手动：docker compose up -d mysql redis nacos
```

2. **构建项目**
```bash
mvn clean install
```

3. **运行服务**
```bash
# 运行单个服务
mvn -pl services/user-service spring-boot:run

# 或使用 Docker 启动所有服务
docker compose --profile apps up -d
```

4. **访问服务**
- Gateway: http://localhost:8080
- Nacos 控制台: http://localhost:8848/nacos (默认账号密码: nacos/nacos)

### 停止服务
```bash
./scripts/down-middleware.sh
# 或手动：docker compose down
```

## 项目结构

```
shizuki-site/
├── libs/                      # 公共库
│   ├── common-core/          # 核心工具类
│   ├── common-servlet/       # Web 层组件
│   └── common-integration/   # 外部集成
├── services/                  # 微服务
│   ├── gateway-service/      # 网关服务 (8080)
│   ├── user-service/         # 用户服务 (8081)
│   ├── content-service/      # 内容服务 (8082)
│   ├── media-service/        # 媒体服务 (8083)
│   └── ai-service/           # AI 服务 (8084)
├── resouces/
│   ├── md/                   # 架构文档
│   └── sql/                  # 数据库脚本
└── scripts/                  # 工具脚本
```

## 核心功能

### 用户体系
- **GUEST**：游客，公开内容浏览
- **USER**：普通用户，基础功能 + 个人偏好
- **INTERVIEWER**：面试官（3 天有效期，自动降级）
- **FRIEND**：友人，受邀分组
- **ADMIN**：管理员，全站管理

### AI 配额策略
- 无自带 API 用户：**总生命周期 5 轮**（1 问 + 1 答 = 1 轮）
- 自带 API 用户：无总轮数限制，但受 30/min 限流保护
- 对话历史保留 30 天，可自行清理

### 安全特性
- 统一鉴权与限流（网关级 + 服务级）
- XSS 防护（OWASP Java HTML Sanitizer）
- 审计日志（关键操作可追溯）
- 配额管理与紧急止损开关
- 外链跳转确认与白名单机制

## 开发指南

### 运行测试
```bash
# 所有测试
mvn test

# 单个模块测试
mvn test -pl services/user-service

# 单个测试类
mvn test -pl services/user-service -Dtest=AuthControllerTest
```

### SQL 规范检查
```bash
./scripts/check_sql_conventions.sh
```

### API 文档
启动服务后访问 Swagger UI：
- User Service: http://localhost:8081/swagger-ui.html
- Content Service: http://localhost:8082/swagger-ui.html
- Media Service: http://localhost:8083/swagger-ui.html
- AI Service: http://localhost:8084/swagger-ui.html

## Git 提交规范

**重要**：所有提交必须遵循以下格式：

```
emoji type : description
```

### 常用操作（优先使用）

| Emoji | Type     | 用途                           |
| ----- | -------- | ------------------------------ |
| ✨     | feat     | 新增功能                       |
| 🐛     | fix      | 修复 bug                       |
| ♻️     | refactor | 重构（不改变功能）             |
| 🎨     | style    | 代码风格/格式调整（不改逻辑）  |
| ⚡     | perf     | 性能优化                       |
| ✅     | test     | 新增/修改测试                  |
| 📝     | docs     | 文档（README、注释、接口文档） |
| 🔧     | chore    | 维护（构建脚本、依赖、配置）   |
| 🚀     | build    | 构建相关（打包、编译）         |
| 👷     | ci       | CI 配置（GitHub Actions 等）   |
| 🔥     | del      | 删除代码/文件/无用逻辑         |
| ⏪     | revert   | 回滚提交                       |

### 扩展操作

| Emoji | Type     | 用途                  |
| ----- | -------- | --------------------- |
| 🚚     | move     | 移动/重命名文件或目录 |
| 🔒     | security | 安全修复/加固         |
| 🌐     | i18n     | 国际化/本地化         |
| 📦     | deps     | 依赖变更（升级/降级） |
| 🧹     | cleanup  | 清理死代码/临时代码   |
|️ 🗃     | data     | 数据/SQL/迁移脚本变更 |
| 🧱     | init     | 初始化项目/基础功能   |

### 提交示例

```bash
git commit -m "✨ feat : 新增用户偏好设置同步功能"
git commit -m "🐛 fix : 修复 AI 配额计算错误"
git commit -m "📝 docs : 更新 API 文档"
```

## 文档

详细文档请查看 `resouces/md/` 目录：

- [总体设计文档](resouces/md/总体设计文档_f.md) - 产品定位、架构设计、安全基线
- [代码开发文档](resouces/md/02_代码开发文档_v0.1.md) - 技术栈、工程结构、开发规范
- [AI协作开发规范](resouces/md/05_AI协作开发规范_v0.1.md) - AI 必遵守规则、可复用工具类、提交流程
- [CLAUDE.md](CLAUDE.md) - Claude Code 工作指南

## 部署说明

### 资源要求
- **最低配置**：单机 8GB 内存
- **中间件**：MySQL (1.2-1.6GB) + Redis (0.25-0.5GB) + Nacos (0.5-0.8GB)
- **应用服务**：约 2.65-3.7GB
- **系统预留**：1.0-1.4GB

### 环境变量

关键环境变量（参考 `compose.yaml`）：
- `NACOS_ENABLED`: 是否启用 Nacos 服务发现
- `NACOS_ADDR`: Nacos 服务地址
- `DB_URL`, `DB_USERNAME`, `DB_PASSWORD`: 数据库连接
- `REDIS_HOST`, `REDIS_PORT`: Redis 连接
- `INTERVIEWER_SECRET`: 面试官注册密钥（必需）

## 许可证


---

**注意**：本项目处于起步阶段，功能基本未实现。
