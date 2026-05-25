# Requirements Document — 后端整体重构评审 (backend-refactor-review)

## Introduction

本规格定义对 Shizuki Site **Java 单体后端**的一次只读式整体评审。范围严格限定为
`pom.xml`、`libs/**`、`model/**`、`modules/**`、`apps/monolith-app/**` 内的源码、Maven
配置、SQL 迁移与 Spring 配置文件；不涉及 Python (`apps/memoryos-service`)、
Node (`services/slides-api`、`tools/presentation-generator`、`tools/*-sidecar`) 与前端
(`fronted/`)。本期产物为一份**评审报告 + 机器可读发现清单**，不修改任何生产代码。
报告须为后续重构提供可被属性化测试验证的"行为不变量"集合（API 契约清单）。

读者沟通语言：中文。

---

## Glossary

- **Backend_Java_Monolith**：评审范围内的 Java 后端代码集合，指 `pom.xml`、`libs/**`、`model/**`、`modules/**`、`apps/monolith-app/**` 五个根。
- **Reviewer**：执行本次评审的代理或团队（人/Agent 均适用）。
- **ReviewReport**：本期最终交付的 Markdown 报告，写入 `.kiro/specs/backend-refactor-review/report.md`。
- **FindingsJson**：与 ReviewReport 同级输出的机器可读发现清单 `findings.json`。
- **Finding**：一条评审发现，包含 `id`、`dimension`、`severity`、`evidence`、`proposed_action`、`behavior_impact` 六个字段。
- **Severity**：严重度枚举 `CRITICAL | HIGH | MEDIUM | LOW`。
- **Dimension**：维度枚举 `boundary | duplication | layering | naming | config | secret | schema | api_contract | build | test | observability | error_contract`。
- **ModuleDependencyGraph**：以 Maven `artifactId` 为节点、依赖关系为有向边的图，边标记为 `compile | runtime | test`。
- **ApiContractInventory**：所有 `@RestController` 暴露端点的清单，字段含 `(http_method, path, request_schema, response_schema, required_permissions, rate_limit)`。
- **DuplicationFinding**：跨 Maven 模块发现的高相似度代码块记录。
- **SimilarityScore**：0–100 的相似度百分比，由 PMD CPD 或 jscpd 等基于 token/AST 的工具产出。
- **DuplicationThreshold**：本评审采用 **70%** 与 **min-tokens=50**。
- **SchemaDriftFinding**：`modules/*/src/main/resources/db/migration/` 与 `apps/monolith-app/src/main/resources/monolith/db/migration-pg/` 同域脚本之间的列/索引不一致。
- **VersionDriftFinding**：同一坐标 `groupId:artifactId` 在 reactor 内被解析为两个及以上版本的依赖。
- **HygieneFinding**：误入版本控制的构建产物或本地缓存（如 `**/target/**`、`modules/content-module/.mvn/repository/**`）。
- **CoverageGapFinding**：模块行覆盖率低于阈值或测试用例数为 0 的发现。
- **ContractFinding / ErrorContractFinding**：API 响应包络或错误格式偏离项目既定标准（`ApiResponse<T>` / `application/problem+json`）的发现。
- **API_Schema_Equivalence**：两个 OpenAPI/JSON Schema 在 `(path, method, response shape, status code, error envelope)` 五元组上字节等价。

### Non-goals（本期评审明确不做）

1. 不修改任何 `*.java` / `pom.xml` / `application*.yml` / `*.sql` / `compose.yaml` / `Dockerfile.*`。
2. 不评审 `apps/memoryos-service`（Python/Flask）、`services/slides-api`（Node）、`tools/presentation-generator`（Node）、`tools/meting-sidecar`、`tools/music-ncm-sidecar`、`fronted/`、`deploy/**`。
3. 不做性能基准与压测；不做安全渗透测试。
4. 不执行重构动作（重命名、抽取、合并、拆分等），相关动作须由后续 spec 接续。
5. 不引入新业务功能、不变更对外 API。

---

## Requirements

### Requirement 1：评审范围与产物形态

**User Story:** 作为项目维护者，我希望本次评审有清晰的范围与可追溯的产物，
以便后续重构 spec 直接消费。

#### Acceptance Criteria

1. THE Reviewer SHALL 仅对 Backend_Java_Monolith 范围内的文件生成 Finding。
2. WHEN 评审完成，THE Reviewer SHALL 在 `.kiro/specs/backend-refactor-review/` 下产出 `report.md` 与 `findings.json` 两个文件。
3. THE ReviewReport SHALL 在文件首部包含按 `dimension × severity` 的二维计数表，并在每条 Finding 中给出 `id`、`dimension`、`severity`、`evidence`、`proposed_action`、`behavior_impact` 六个字段。
4. THE FindingsJson SHALL 为每条 Finding 生成一个稳定的 `id`，该 `id` 由 `dimension`、`evidence.file_path`、`evidence.symbol` 三者拼接后取 SHA‑1 前 12 位。
5. IF Reviewer 在评审过程中修改了 Backend_Java_Monolith 中任何文件，THEN THE Reviewer SHALL 在 ReviewReport 顶部以 CRITICAL 级别记录一条流程违规 Finding 并回滚改动。
6. THE ReviewReport SHALL 在末尾附录中列出本次评审使用的工具及其版本号（PMD CPD、jscpd、`mvn dependency:tree`、`mvn dependency:analyze`、JaCoCo 等）。

### Requirement 2：模块依赖图与边界（最高优先级）

**User Story:** 作为架构负责人，我希望以图形化形式看到当前模块间的真实依赖，
并定位每一条违反"libs 不依赖 modules、modules 之间不直接互相依赖"原则的边。

#### Acceptance Criteria

1. THE Reviewer SHALL 基于全部 reactor `pom.xml` 构建 ModuleDependencyGraph，节点取 `artifactId`，边标记为 `compile | runtime | test`。
2. WHEN ModuleDependencyGraph 生成，THE ReviewReport SHALL 以 Mermaid 语法在报告中嵌入该图，并附 DOT 文本备份。
3. IF ModuleDependencyGraph 中存在自环或长度大于等于 2 的环路，THEN THE ReviewReport SHALL 列出一条 severity = CRITICAL 的 Finding。
4. IF `libs/**` 中任一模块依赖 `modules/**` 或 `apps/**` 中任一模块，THEN THE ReviewReport SHALL 列出一条 severity = HIGH 的 BoundaryFinding。
5. IF `modules/**` 中任一模块在 `pom.xml` 中声明了对另一 `modules/**` 模块的 `compile` 依赖（例如已观察到 `modules/media-module` 依赖 `user-service`、`modules/ai-module` 依赖 `user-service`），THEN THE ReviewReport SHALL 列出一条 BoundaryFinding，并在 `proposed_action` 中给出"下沉至 libs 或上移至 apps 装配层"两种可选拆解路径。
6. THE ReviewReport SHALL 给出每个 `modules/**` 模块"对外暴露 API 类型 / 内部实现类型"的数量比，并将该比值小于 0.05 的模块标注为"过度内聚但接口稀薄"以备后续评估。

### Requirement 3：跨模块重复代码识别（最高优先级）

**User Story:** 作为重构负责人，我希望拿到一份按相似度排序的重复代码清单，
明确每一段重复的归并去向。

#### Acceptance Criteria

1. THE Reviewer SHALL 使用基于 token 或 AST 的工具对 Backend_Java_Monolith 全量执行重复检测，参数为 `min-tokens >= 50`、SimilarityScore 阈值 `>= 70`。
2. WHEN 一段代码块在两个及以上不同 Maven 模块下命中阈值，THE ReviewReport SHALL 记录一条 DuplicationFinding，包含双方文件路径、起止行号、SimilarityScore、`proposed_extraction_target`（取值范围：`libs/common-core` / `libs/common-servlet` / `libs/common-integration` / `model/*` / `保留就地` 之一）。
3. WHEN 多个模块各自定义了同名启动校验类（已观察到 `modules/user-module/.../config/SecretStartupValidator.java`、`modules/media-module/.../config/SecretStartupValidator.java`），THE ReviewReport SHALL 把同名类聚合为一条 ConsolidationFinding 并标记为 HIGH。
4. THE ReviewReport SHALL 在附录中以 Markdown 表格形式给出 Top 30 重复块矩阵，列含 `pair_a`、`pair_b`、`similarity`、`tokens`、`proposed_target`。
5. IF 重复检测工具因配置错误未能跑通，THEN THE Reviewer SHALL 在 ReviewReport 中显式记录工具失败原因与重试结果，并不得以"工具失败"为由跳过本需求。

### Requirement 4：分层与命名一致性

**User Story:** 作为代码评审者，我希望分层和命名按既定规范统一，
以便新成员能从包名直接定位职责。

#### Acceptance Criteria

1. THE Reviewer SHALL 把 `modules/**` 与 `apps/monolith-app/**` 中的每个 `*.java` 类型映射到 `controller | service-interface | service-impl | mapper | model | support | task | config | integration | mq | util` 中的一项。
2. IF 一个类型的所在包路径与其 Spring 注解集合冲突（示例：包名包含 `controller` 但缺少 `@RestController`/`@Controller`，或包名包含 `service` 而类被注解为 `@Repository`），THEN THE ReviewReport SHALL 列出一条 LayeringFinding。
3. WHERE 一个 Maven 模块的目录名与其 `artifactId` 不一致（已观察到 `modules/user-module → user-service`、`modules/content-module → content-service`、`modules/media-module → media-service`、`modules/ai-module → ai-service`），THE ReviewReport SHALL 为每个不一致项列出一条 NamingFinding，并在 `proposed_action` 中给出"统一命名"与"保留现状但更新文档"两种方案。
4. WHERE 文档与实际架构形态不一致（例如 `CLAUDE.md` 描述为微服务架构，而实际 `apps/monolith-app/pom.xml` 为单体装配），THE ReviewReport SHALL 列出一条 DocumentationDriftFinding。
5. THE ReviewReport SHALL 给出"包名 → 注解 → 文件位置"三元一致率（命中数 / 总数）作为分层一致性度量。

### Requirement 5：配置与密钥治理

**User Story:** 作为安全负责人，我希望评审输出一份完整的环境变量与密钥清单，
并把硬编码秘密、明文密码这类问题立刻标红。

#### Acceptance Criteria

1. THE Reviewer SHALL 抽取 `apps/monolith-app/src/main/resources/application*.yml` 中所有 `${...}` 占位符，生成一张 `EnvVarInventory` 表，列含 `key`、`default_value`、`referenced_files`。
2. IF 任一占位符的默认值落入 `password | secret | token | key`（不区分大小写）相关键名且默认值为可识别凭据（例如 `DB_PASSWORD:postgres`、`AUTH_JWT_SECRET:${random.uuid}`），THEN THE ReviewReport SHALL 把该项列为 severity = CRITICAL 的 SecretFinding。
3. IF 任一受版本控制的文件包含明文生产凭据（已观察到 `AGENTS.md` 中含服务器明文密码），THEN THE ReviewReport SHALL 把该项列为 severity = CRITICAL 的 SecretFinding，且 `proposed_action` SHALL 包含"立即轮换密钥"与"从历史中清除"两条具体指令。
4. WHEN 多个 Spring `*Properties` 类映射同一组前缀（例如 `shizuki.music.*`），THE ReviewReport SHALL 在 ConsolidationFinding 中给出归并建议。
5. THE ReviewReport SHALL 列出每条"未在生产环境给出实际值就会启动失败"的强制环境变量，并标注其失败模式。

### Requirement 6：数据库迁移双轨一致性

**User Story:** 作为数据库负责人，我希望明确 `modules/*/db/migration` 与
`apps/monolith-app/.../monolith/db/migration-pg` 之间的差异，避免历史脚本被改写。

#### Acceptance Criteria

1. THE Reviewer SHALL 对每个域（`user`、`content`、`media`、`ai`）分别比对两套 Flyway 脚本树，输出 `SchemaDiffMatrix`，列含 `domain`、`module_path`、`monolith_path`、`column_diff_count`、`index_diff_count`、`first_diverging_version`。
2. IF 在某域下两套脚本对同一表生成不同列、不同主键、或不同索引集合，THEN THE ReviewReport SHALL 列出一条 SchemaDriftFinding，severity 不低于 HIGH。
3. WHEN `apps/monolith-app/.../monolith/db/migration-pg/` 存在 `monolith/db/migration/`（MySQL 旧路径）的派生脚本，THE ReviewReport SHALL 在 `proposed_action` 中给出"删除旧路径并标注 baseline"或"保留双轨并加锁"两种迁移路线及其前置条件。
4. THE ReviewReport SHALL 不修改任何 SQL 脚本；任何"修复"动作必须以"追加新版本号 V_xxx" 作为合规约束写入 `proposed_action`，禁止改写已发布版本号。
5. WHILE 比对运行，IF 任一 SQL 文件不能被解析，THEN THE Reviewer SHALL 把解析失败列为 MEDIUM 级 SchemaToolFinding，并在 ReviewReport 中说明缺口范围。

### Requirement 7：API 契约清单与重构不变量

**User Story:** 作为下游重构 spec 的输入提供方，我希望本次评审落地一份 API 契约清单，
作为后续任何重构的"行为标尺"。

#### Acceptance Criteria

1. THE Reviewer SHALL 扫描 `modules/**` 与 `apps/monolith-app/**` 中所有被 `@RestController` 标注的类，生成 ApiContractInventory，列含 `http_method`、`path`、`request_schema`、`response_schema`、`required_permissions`、`rate_limit`、`controller_class`。
2. WHEN ApiContractInventory 生成，THE ReviewReport SHALL 在文档中显式声明：任何下游重构 SHALL 保持 `(http_method, path, response_schema, error_envelope, status_code)` 五元组与本清单字节等价（API_Schema_Equivalence 不变量）。
3. THE ReviewReport SHALL 同步导出 `api-contract.openapi.json`（OpenAPI 3.x），与 ApiContractInventory 保持一一对应，作为后续合约测试的输入。
4. THE ReviewReport SHALL 把以下命题登记为可由属性化/合约测试验证的不变量：
   - **(Invariant)** FOR ALL endpoints e ∈ ApiContractInventory，重构前后请求方法与路径集合 SHALL 相等。
   - **(Invariant)** FOR ALL endpoints e ∈ ApiContractInventory，重构前后响应 JSON Schema 在结构层面 SHALL 等价（含 `snake_case` 字段名集合相等）。
   - **(Round-trip)** FOR ALL `(request_payload p)` 满足 e 的请求 schema，重构前后 `serialize ∘ controller ∘ deserialize` 输出的 JSON 在 schema 等价意义下 SHALL 相同（错误响应使用 `application/problem+json` 标准化对照）。
   - **(Idempotence)** WHERE 端点声明为幂等（`GET`、`PUT`、`DELETE` 中 `idempotent = true` 标注或语义可推断者），FOR ALL 输入 p，连续两次调用 SHALL 与一次调用产生 schema 等价的响应。
5. WHERE 一个 `@RestController` 端点没有显式权限注解（`@RequirePermission` / `@RequireGroup` / `@RequireAdminPrivilege`）也未在 `shizuki.gateway.auth.public-paths` / `guest-paths` 中登记，THE ReviewReport SHALL 列出一条 severity = HIGH 的 ContractFinding。

### Requirement 8：响应包络与错误契约一致性

**User Story:** 作为前端协作者，我希望所有响应都是 `ApiResponse<T>` 包装，
错误一律走 `application/problem+json`，避免出现"裸 ResponseEntity"或自定义错误结构。

#### Acceptance Criteria

1. THE Reviewer SHALL 统计每个控制器方法的返回类型，并按 `ApiResponse<T> | PageResponse<T> | ResponseEntity<T> | raw object` 分桶。
2. IF 某端点返回 `ResponseEntity<?>` 但其负载未包装为 `ApiResponse<T>` 或 `PageResponse<T>`，THEN THE ReviewReport SHALL 列出一条 ContractFinding。
3. IF 某 `@ExceptionHandler` 返回结构与 `application/problem+json` 不一致（缺少 `type | title | status | detail` 任意字段），THEN THE ReviewReport SHALL 列出一条 ErrorContractFinding。
4. THE ReviewReport SHALL 给出"`ApiResponse` 包装率"（包装端点数 / 总端点数）作为契约一致性度量。

### Requirement 9：构建与依赖卫生

**User Story:** 作为构建负责人，我希望评审能找出版本漂移、未使用依赖与误入仓库的构建产物。

#### Acceptance Criteria

1. THE Reviewer SHALL 对每个 reactor 模块运行 `mvn -B -DskipTests dependency:tree`，并归并到一张 `DependencyMatrix`。
2. IF 同一 `groupId:artifactId` 在 DependencyMatrix 中出现两个及以上版本，THEN THE ReviewReport SHALL 列出一条 VersionDriftFinding，severity 不低于 HIGH。
3. WHERE 一个模块声明的依赖未在该模块源码中出现 import 引用（由 `mvn dependency:analyze` 给出），THE ReviewReport SHALL 列出一条 UnusedDependencyFinding。
4. IF 受版本控制的目录中存在构建产物或本地仓库（已观察到 `**/target/**`、`modules/content-module/.mvn/repository/**`、`%BASE_WIN%/.venv-cpu/**`），THEN THE ReviewReport SHALL 列出 severity = HIGH 的 HygieneFinding，并在 `proposed_action` 中给出对应的 `.gitignore` 规则。
5. THE ReviewReport SHALL 在父 `pom.xml` 的版本占位符（`spring-boot.version`、`flyway.version`、`mybatis-plus.version`、`sa-token.version`、`owasp-sanitizer.version`、`springdoc.version`）与各子模块实际解析版本之间做一致性校验，并给出"是否升级到 BOM 管理"的结论。

### Requirement 10：测试基线与覆盖率

**User Story:** 作为质量负责人，我希望评审先把全量测试跑一遍，再用 JaCoCo 拿到覆盖率快照，
作为下一阶段覆盖率门槛的依据。

#### Acceptance Criteria

1. THE Reviewer SHALL 执行 `mvn -B test` 覆盖整个 reactor，并在 ReviewReport 中按模块给出 `tests_run`、`failures`、`errors`、`skipped` 四列汇总。
2. WHILE 收集测试结果，THE Reviewer SHALL 临时启用 JaCoCo（仅在评审本地 profile 内，不修改 reactor `pom.xml`），按模块给出 `line_coverage_pct`、`branch_coverage_pct`、`method_coverage_pct` 三列。
3. IF 某模块行覆盖率低于 30%，OR 某模块的 `tests_run = 0`，THEN THE ReviewReport SHALL 列出一条 CoverageGapFinding。
4. THE ReviewReport SHALL 为每个 `modules/**` 与 `apps/monolith-app` 提出一个建议覆盖率门槛（示例：核心路径 ≥ 60%、非核心 ≥ 30%），并标明"建议"而非"强制"，由后续 spec 决定是否落地。
5. IF `mvn test` 因依赖缺失、Flyway 版本冲突或 testcontainer 不可用导致中途失败，THEN THE Reviewer SHALL 在 ReviewReport 中以 MEDIUM 级 TestEnvFinding 记录失败原因、影响模块与建议的修复路径，且不得以失败为由跳过本需求。

### Requirement 11：可观测性与日志一致性

**User Story:** 作为运维者，我希望关键路径的请求都带 trace、关键操作都被审计、日志格式可被结构化解析。

#### Acceptance Criteria

1. THE Reviewer SHALL 列出所有未配合 `TraceIdFilter` / `RequestIdFilter` 的入站接入点（HTTP Filter、Kafka Listener、定时任务），生成 `TraceCoverageTable`。
2. IF 一个写入型端点（POST/PUT/PATCH/DELETE）未被 `@AuditLog` 标注且未在 `shizuki.gateway.auth.public-paths` 中登记，THEN THE ReviewReport SHALL 列出一条 ObservabilityFinding。
3. THE ReviewReport SHALL 抽取所有 `LoggerFactory.getLogger` 与 `log.*` 调用，统计每模块的"日志调用密度"（每千行代码的日志条数），用于横向比较。
4. WHERE `application.yml` 中 `logging.level` 对生产关键包（`io.github.shizuki.**`）配置过于宽松（DEBUG 或更低），THE ReviewReport SHALL 给出 MEDIUM 级 ObservabilityFinding。

### Requirement 12：模型层（model/）与 entity 归属

**User Story:** 作为持久化负责人，我希望 `model/` 下的 entity/request/response 能与 `modules/**` 内部模型清晰分离，避免跨域 entity 互相引用。

#### Acceptance Criteria

1. THE Reviewer SHALL 扫描 `model/entity/src/main/java/io/github/shizuki/site/{ai,content,media,user}/entity/**` 下所有 `.java` 源文件，提取每个 entity 中指向 `io.github.shizuki.site.{ai,content,media,user}.entity` 但所属域与当前类不同的 import 语句，生成 `EntityCrossDomainImportTable`，至少包含字段：源类全限定名、源域、目标类全限定名、目标域、import 所在文件路径与行号。
2. IF 在 `ai`、`content`、`media`、`user` 四个域之间任意两两组合（共 6 对方向）中存在 entity 互相 import 的情况，THEN THE ReviewReport SHALL 为每一处跨域引用列出一条 BoundaryFinding，至少包含字段：源类全限定名、目标类全限定名、跨域方向、文件路径、行号、严重等级。
3. WHEN `model/` 通过 `build-helper-maven-plugin` 将 `entity/`、`request/`、`response/` 三个源目录混入同一 jar，THE ReviewReport SHALL 评估"拆分为三个独立 Maven 子模块"与"保留单 jar + 强约束包结构"两个方案，并按以下固定维度逐项对比：受影响文件数量、构建耗时变化、依赖隔离强度、对 `modules/**` 调用方的破坏性，最终给出推荐方案及理由。
4. IF `modules/**` 模块内部定义了与 `model/entity/**` 中任一类简单类名（不含包名）相同的领域类（重复 entity），THEN THE ReviewReport SHALL 为每个重复类列出一条 ConsolidationFinding，至少包含字段：modules 侧类全限定名、model 侧类全限定名、字段差异摘要、合并建议（保留 model 侧 / 保留 modules 侧 / 重命名）。

---

## Constraints（贯穿所有 Requirement）

1. THE Reviewer SHALL NOT 修改 Backend_Java_Monolith 范围内的任何文件（仅可读取与生成 `.kiro/specs/backend-refactor-review/**` 下的产物）。
2. THE ReviewReport SHALL 用中文撰写；FindingsJson 的 `proposed_action` 字段亦使用中文。
3. THE Reviewer SHALL 在每条 Finding 的 `evidence` 中提供 `file_path` 与 `line_range`（行号区间），以便后续 spec 直接消费。
4. WHERE 评审工具因许可证或环境原因不可用，THE Reviewer SHALL 以等价开源工具替代并在附录注明替代关系。
5. IF 任何 Finding 的 `behavior_impact` 字段为 "改变对外 API"，THEN THE Reviewer SHALL 把 severity 至少设置为 HIGH，并在 `proposed_action` 中标注"必须先经过合约测试基线评估"。

---

## 与下游重构 spec 的衔接

本 spec 的产出（`report.md` + `findings.json` + `api-contract.openapi.json`）将作为
下一份重构 spec 的输入。下一份 spec 应：

- 以 ApiContractInventory 为基准建立合约测试套件（验证 Requirement 7 中登记的不变量）。
- 按 `severity = CRITICAL → HIGH → MEDIUM → LOW` 顺序消费 Findings。
- 任何重构动作 SHALL 在 PR 描述中显式列出"它修复的 Finding id 集合"与"它影响的 ApiContractInventory 端点集合"。
