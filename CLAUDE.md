# CLAUDE.md

本文件为 Claude Code (claude.ai/code) 在此代码仓库中工作时提供指导。

## 项目概述

**Shizuki Site** 是一个个人学习陪伴平台，采用 Spring Boot 3.x、Spring Cloud 和 Alibaba Nacos 构建的微服务架构。平台提供学习陪伴功能（角色、背景、环境音）、内容管理（博客、时间线、项目展示）、互动功能（评论、点赞）以及 AI 能力（角色卡、世界书、OpenAI 兼容 API）。

**核心特征：**
- Maven 多模块 Monorepo 结构
- 从第一天起就采用微服务架构（网关 + 4 个业务服务）
- 目标部署环境：单机 8GB 内存，使用 Docker Compose
- 安全基线：OWASP ASVS L1，强制限流、配额、白名单和审计日志
- API 标准：`/api/v1/**` 基础路径，JSON/查询参数使用 snake_case，错误响应使用 `application/problem+json`

## 构建与开发命令

### 本地开发环境搭建

1. **启动中间件（MySQL、Redis、Nacos）：**
   ```bash
   ./scripts/up-middleware.sh
   # 或手动执行：docker compose up -d mysql redis nacos
   ```

2. **停止中间件：**
   ```bash
   ./scripts/down-middleware.sh
   # 或手动执行：docker compose down
   ```

3. **构建整个项目：**
   ```bash
   mvn clean install
   ```

4. **构建特定模块：**
   ```bash
   mvn clean install -pl services/user-service -am
   ```

5. **本地运行单个服务：**
   ```bash
   mvn -pl services/user-service spring-boot:run
   ```

6. **运行测试：**
   ```bash
   # 所有测试
   mvn test

   # 单个模块测试
   mvn test -pl services/user-service

   # 单个测试类
   mvn test -pl services/user-service -Dtest=AuthControllerTest

   # 单个测试方法
   mvn test -pl services/user-service -Dtest=AuthControllerTest#testLogin
   ```

7. **检查 SQL 规范（提交前）：**
   ```bash
   ./scripts/check_sql_conventions.sh
   ```

8. **在 Docker 中启动所有服务：**
   ```bash
   docker compose --profile apps up -d
   ```

### 服务端口

- Gateway: 8080
- User Service: 8081
- Content Service: 8082
- Media Service: 8083
- AI Service: 8084
- Nacos: 8848, 9848, 9849
- MySQL: 3306
- Redis: 6379

## 架构概览

### 模块结构

```
shizuki-site/
├── libs/                          # 共享库
│   ├── common-core/              # 核心工具（ApiResponse、ErrorCode、BaseEntity、ClockProvider）
│   ├── common-servlet/           # Web 层（安全、审计、限流、XSS、追踪）
│   └── common-integration/       # 外部集成（OAuth、OSS 存储）
├── services/                      # 微服务
│   ├── gateway-service/          # Spring Cloud Gateway（路由、鉴权、限流）
│   ├── user-service/             # 用户账户、鉴权、分组、配额、偏好设置
│   ├── content-service/          # 博客文章、时间线、项目展示、评论
│   ├── media-service/            # 媒体资源、OSS 集成、CDN
│   └── ai-service/               # AI 对话、角色卡、世界书、OpenAI 代理
├── resouces/
│   ├── md/                       # 架构与开发文档
│   └── sql/                      # 数据库初始化脚本
└── scripts/                      # 工具脚本（中间件、SQL 检查）
```

### 服务依赖关系

- **Gateway Service**：路由到所有其他服务，执行统一鉴权和限流
- **User Service**：独立服务，为其他服务提供鉴权验证和配额解析
- **Content Service**：依赖 User Service 获取作者信息
- **Media Service**：依赖 User Service 进行上传配额控制
- **AI Service**：依赖 User Service 进行配额执行和 API 密钥验证

### 核心架构模式

**认证与授权：**
- 使用 Sa-Token 进行令牌管理
- 网关通过 User Service 验证执行统一认证
- 业务服务执行资源级二次授权（纵深防御）
- 令牌通过 HTTP Header 传递（不使用查询参数）

**审计日志：**
- 通过 common-servlet 中的 `@AuditLog` 注解实现
- 使用 Outbox 模式确保审计事件可靠发布
- 支持多种发布器：Kafka、ELK 或 Noop（可配置）
- 失败审计事件的自动重试机制

**限流与配额：**
- 网关级限流（时间窗口内的请求数）
- 服务级配额执行（如 AI 对话轮数、媒体上传）
- 配额策略按用户组定义，支持继承规则
- 每个模块都有紧急停止开关

**错误处理：**
- 所有错误返回 RFC 7807 `application/problem+json` 格式
- common-servlet 中的全局异常处理器
- 自定义 `BusinessException` 配合 `ErrorCode` 枚举
- 通过 `X-Request-Id` 和 `X-Trace-Id` 请求头传播请求/追踪 ID

## 代码标准与约定

### API 设计规则

1. **URL 结构：**
   - 基础路径：`/api/v1`
   - 使用小写 + kebab-case + 复数资源名
   - 禁止基于动词的 URL（使用 HTTP 方法代替）
   - 示例：`GET /api/v1/blog-posts` 而不是 `/api/v1/getBlogPosts`

2. **命名约定：**
   - JSON 字段和查询参数：`snake_case`
   - Java 类/方法：`PascalCase`/`camelCase`
   - 数据库表/列：`snake_case`

3. **响应格式：**
   - 成功：包装在 `ApiResponse<T>` 或 `PageResponse<T>` 中
   - 错误：使用 `application/problem+json`（RFC 7807）
   - 响应中始终包含追踪请求头

### 数据库约定

1. **实体基类：**
   - 所有实体继承 `BaseEntity`，包含：`id`、`created_at`、`updated_at`、`deleted`、`version`
   - 使用 `@Version` 进行乐观锁并发更新

2. **SQL 文件要求：**
   - 所有 SQL 文件必须包含头部：`-- modified_at:` 和 `-- change:`
   - 所有列必须有 `COMMENT` 子句
   - Flyway 迁移：`V{number}__{description}.sql` 格式
   - 提交前运行 `./scripts/check_sql_conventions.sh`

3. **MyBatis-Plus：**
   - 使用 `@TableName` 进行表映射
   - 使用 `@TableField` 进行列映射（snake_case）
   - 优先使用内置 CRUD 方法，仅在必要时编写自定义 SQL

### 安全要求（OWASP ASVS L1）

1. **强制控制：**
   - 所有非公开端点必须进行身份验证
   - 网关级限流
   - 服务级配额执行
   - 通过 OWASP Java HTML Sanitizer 进行 XSS 防护
   - 敏感操作的审计日志
   - 适用时基于白名单的访问控制

2. **敏感操作：**
   - 使用 `@AuditLog` 注解标记
   - 包含用户上下文、操作、资源和结果
   - 审计事件存储在 outbox 中以确保可靠交付

### Git 提交规范

所有提交必须遵循此格式：`emoji type : description`

**常用操作（优先使用）：**
- ✨ feat：新增功能
- 🐛 fix：修复 bug
- ♻️ refactor：重构（不改变功能）
- 🎨 style：代码风格/格式调整（不改逻辑）
- ⚡ perf：性能优化
- ✅ test：新增/修改测试
- 📝 docs：文档（README、注释、接口文档）
- 🔧 chore：维护（构建脚本、依赖、配置）
- 🚀 build：构建相关（打包、编译）
- 👷 ci：CI 配置（GitHub Actions 等）
- 🔥 del：删除代码/文件/无用逻辑
- ⏪ revert：回滚提交

**扩展操作：**
- 🚚 move：移动/重命名文件或目录
- 🔒 security：安全修复/加固
- 🌐 i18n：国际化/本地化
- 📦 deps：依赖变更（升级/降级）
- 🧹 cleanup：清理死代码/临时代码
- 🗃️ data：数据/SQL/迁移脚本变更
- 🧱 init：初始化项目/基础功能

## 用户与权限系统

### 用户分组

- **GUEST**：仅公开浏览
- **USER**：基础功能 + 个人偏好设置
- **INTERVIEWER**：临时高权限分组（默认 3 天后自动降级）
- **FRIEND**：受邀分组，权限高于 USER
- **ADMIN**：全站管理

### 权限模型

- 权限命名：`module.action`（如 `blog.post.create`、`media.asset.audit`）
- 计算规则：
  - 权限：所有分组的并集
  - 配额：取最严格的
  - 模块开关：任一分组禁用则禁用（ADMIN 可覆盖）

### 配额系统

- 无 API 密钥用户的 AI 配额：**生命周期 5 轮**（1 问 + 1 答 = 1 轮）
- 使用自己 API 密钥的用户：无总轮数限制，但仍受限流保护
- 配额策略在 `group_quota_policy` 表中按分组定义
- 配额解析端点：`/internal/quotas/resolve`（仅内部使用）

## 公共库（libs/）

### common-core

所有服务共享的核心工具：
- `ApiResponse<T>`：标准成功响应包装器
- `PageResponse<T>`：分页响应包装器
- `ErrorCode`：所有错误码的枚举
- `BusinessException`：带错误码的自定义异常
- `BaseEntity`：所有实体的基类（id、时间戳、软删除、版本）
- `ClockProvider`：可测试的时间提供者（避免使用 `LocalDateTime.now()`）

### common-servlet

Web 层组件（通过 Spring Boot starter 自动配置）：
- **全局异常处理器**：将异常转换为 RFC 7807 Problem Details
- **追踪过滤器**：`TraceIdFilter`、`RequestIdFilter` 用于分布式追踪
- **安全**：Sa-Token 配置、鉴权拦截器
- **审计**：`@AuditLog` 注解 + AOP 切面用于审计日志
- **限流**：基于注解的 Redis 限流
- **XSS 防护**：使用 OWASP sanitizer 进行请求/响应净化
- **Web 配置**：CORS、Jackson snake_case 序列化、参数校验

### common-integration

外部服务集成：
- **OAuth**：GitHub、Google OAuth 登录流程
- **存储**：阿里云 OSS 媒体存储集成
- **HTTP 客户端**：配置好的 RestTemplate/WebClient beans

## 服务特定说明

### gateway-service

- 使用 Spring Cloud Gateway 进行路由
- 通过 User Service 验证执行统一认证
- 路由到后端服务前进行全局限流
- 路由配置支持静态 URI 和 Nacos 服务发现
- 环境变量：`NACOS_ENABLED`、`NACOS_ADDR`、`*_SERVICE_URI`

### user-service

- 核心认证与授权服务
- 管理用户账户、分组、角色、权限
- OAuth 登录集成（GitHub、Google）
- 配额策略管理（管理员端点）
- 用户偏好设置存储，支持乐观锁
- 内部端点用于鉴权验证和配额解析
- **密钥验证**：启动时需要 `INTERVIEWER_SECRET` 环境变量

### content-service

- 博客文章、时间线条目、项目展示
- 评论系统与审核
- 点赞/反应功能
- 可见性控制（公开、仅好友、私密）
- 内容审核与举报
- 与 User Service 集成获取作者信息

### media-service

- 媒体资源管理（图片、音频、视频）
- OSS 存储集成（阿里云 OSS）
- CDN URL 生成
- 上传配额执行
- 资源审核工作流
- 缩略图生成和格式转换

### ai-service

- AI 对话，支持角色卡和世界书
- OpenAI 兼容 API 代理
- 对话历史管理
- 配额执行（每用户轮数）
- 支持用户提供的 API 密钥（绕过配额限制）
- 角色卡导入（PNG 元数据、JSON）
- 世界书管理用于上下文注入
- 与 User Service 集成进行配额验证

## 测试指南

### 测试结构

- 单元测试：独立测试单个组件
- 集成测试：使用真实依赖测试服务交互（testcontainers）
- 集成测试使用 `@SpringBootTest`
- 控制器层测试使用 `@WebMvcTest`
- 单元测试中模拟外部服务调用

### 测试命名

- 测试类：`{ClassName}Test`
- 测试方法：`test{MethodName}_{Scenario}_{ExpectedResult}`
- 示例：`testLogin_ValidCredentials_ReturnsToken()`

### 测试覆盖率要求

- 所有新 API 必须有测试
- 关键路径（鉴权、配额、支付）需要集成测试
- 敏感操作的审计日志必须在测试中验证

## 文档要求

### OpenAPI/Swagger

- 所有 REST 端点必须使用 OpenAPI 注解进行文档化
- 使用 `@Operation`、`@ApiResponse`、`@Parameter` 注解
- OpenAPI 规范必须与代码保持同步
- 访问 Swagger UI：`http://localhost:{port}/swagger-ui.html`

### 代码文档

- 公共 API 需要 Javadoc
- 复杂业务逻辑需要内联注释
- 架构决策应记录在 `resouces/md/` 中

