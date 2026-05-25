# Implementation Plan — 后端整体重构评审 (backend-refactor-review)

> 配套规格：
>
> - `.kiro/specs/backend-refactor-review/requirements.md`
> - `.kiro/specs/backend-refactor-review/design.md`
>
> 实施根目录（评审者本地缓存，不入 reactor、不入版本控制）：`.kiro/tools/audit/`
>
> **强约束**：本期任务的任何代码、命令、工具产物**严禁**写入 `*.java` /
> `pom.xml` / `application*.yml` / `*.sql` / `compose.yaml` / `Dockerfile.*`，
> 写入路径必须满足
> `^\.kiro/(specs/backend-refactor-review|tools/audit)/[A-Za-z0-9._\-/]+$`。

---

## 任务执行规约

- 每个叶子任务都标注满足的 _Requirements_ 与 _Properties_。
- 标注 `[PBT]` 的子任务必须用 `hypothesis>=6.108` 编写属性测试，`min_examples=100`，
  CI 模式下 `--hypothesis-profile=ci`、`max_examples>=500`。属性测试的 docstring
  使用统一标签：`Feature: backend-refactor-review, Property <N>: <title>`。
- 标注 `[INTEGRATION]` / `[SMOKE]` / `[EXAMPLE]` 的子任务对应非属性化 AC，
  详见 design.md 附录 C。
- 任务 1–13 是 Scanner 实现层，可以并行；14 是聚合 + 渲染层；15 是端到端真跑；
  16 是移交文档。

---

- [ ] 1. 项目脚手架与 SpecWriteGate
  - [~] 1.1 在 `.kiro/tools/audit/` 下初始化 Python 包结构（`pyproject.toml`、
    `audit/__init__.py`、`audit/cli.py`、`audit/scanners/`、
    `audit/aggregator/`、`audit/renderer/`、`tests/`），固定依赖版本：
    `hypothesis>=6.108`、`ruamel.yaml==0.18.6`、`javalang==0.13.0`、
    `sqlglot==25.20.0`、`networkx==3.3`，CLI 入口 `audit run`
    _Requirements: 全局约束 1, R1.2_
  - [~] 1.2 实现 `SpecWriteGate.write(path, bytes)`：用正则
    `^\.kiro/specs/backend-refactor-review/[A-Za-z0-9._\-]+(\.md|\.json)$`
    校验目标路径；非法路径抛 `WriteBoundaryError`；写入采用
    `*.tmp → os.rename` 原子写入语义
    _Requirements: R1.5_ _Properties: P-WRITE-BOUNDARY_
  - [~] 1.3 [PBT] 为 `SpecWriteGate` 编写属性测试 `Feature: backend-refactor-review,
Property 1: Audit Toolchain 写入边界`，生成器：随机字符串拼接路径，
    断言"匹配正则 ⇔ 写入成功；否则 raise + 不落盘"
    _Properties: P-WRITE-BOUNDARY_
  - [~] 1.4 实现 `ReactorImmutabilityGuard`：评审开始前 `git ls-files` 列出
    所有 Backend*Java_Monolith 内文件并记录 sha256；评审结束后再次比对，
    任一文件 sha256 改变 → 立即落 CRITICAL `process_violation` Finding 并退出码 3
    \_Requirements: R1.5, 全局约束 1* _Properties: P-REACTOR-POM-IMMUTABLE_
  - [~] 1.5 [PBT] 为 `ReactorImmutabilityGuard` 编写属性测试 `Feature:
backend-refactor-review, Property 27: reactor pom.xml 在评审前后字节不变`，
    生成器：随机字节扰动文件子集，断言守护检测正确率 100%
    _Properties: P-REACTOR-POM-IMMUTABLE_
  - [~] 1.6 配置 `.kiro/tools/.gitignore` 全部忽略本目录，确保工具二进制不入仓
    _Requirements: 全局约束 1_

---

- [ ] 2. 稳定 ID 计算器与 Finding 数据模型
  - [~] 2.1 在 `audit/model/finding.py` 定义 `Finding` dataclass，字段
    `id / dimension / severity / evidence{file_path,line_range,symbol} /
proposed_action / behavior_impact`；`dimension` / `severity` 用枚举锁死
    _Requirements: R1.3_ _Properties: P-FINDING-SCHEMA_
  - [~] 2.2 在 `audit/model/stable_id.py` 实现
    `compute_stable_id(dimension, file_path, symbol) -> str`，算法：
    `hashlib.sha1((d + "|" + (p or "") + "|" + (s or "")).encode("utf-8"))
.hexdigest()[:12].lower()`；fallback 链：FQN → 坐标 → `basename:lines` →
    空字符串
    _Requirements: R1.4_ _Properties: P-STABLE-ID_
  - [~] 2.3 实现 ID 撞车检测：相同 ID 但 `(dimension, file_path, symbol)` 三元组
    不同时，对第二条 Finding 的 `symbol` 追加 `#dup-<n>` 重新计算
    _Requirements: R1.4_ _Properties: P-STABLE-ID_
  - [~] 2.4 [PBT] 编写 `Feature: backend-refactor-review, Property 2: Finding
序列化的 schema 完备性`，生成器：随机 `FindingDraft`，断言序列化后
    6 个字段齐全且枚举集合合法
    _Properties: P-FINDING-SCHEMA_
  - [~] 2.5 [PBT] 编写 `Feature: backend-refactor-review, Property 3: 稳定 ID
算法的纯函数性`，生成器：`text() × text() × text()`，断言：长度=12、
    小写十六进制、纯函数、对集合置换 ID 集合一致
    _Properties: P-STABLE-ID_

---

- [ ] 3. ModuleGraphScanner（R2）
  - [~] 3.1 在 `audit/scanners/module_graph.py` 实现 reactor `pom.xml` 递归发现
    与 XML 解析（`xml.etree.ElementTree`），抽取
    `(groupId, artifactId, packaging)` 与 `<dependency>` 列表，标注
    `tier ∈ {LIBS, MODEL, MODULES, APPS, ROOT}`
    _Requirements: R2.1_ _Properties: P-GRAPH-MODEL_
  - [~] 3.2 构建 `ModuleDependencyGraph`：节点 = artifactId，边 =
    `(from, to, scope)`，仅 `groupId == io.github.shizuki` 入图；记录
    每条边 `pom_file` + 行号区间到 `evidence`
    _Requirements: R2.1_ _Properties: P-GRAPH-MODEL_
  - [~] 3.3 实现 Mermaid `flowchart TD` 渲染：节点按 tier 分 subgraph，scope
    编码（compile 实线 / runtime 虚线 / test 灰色虚线）
    _Requirements: R2.2_ _Properties: P-GRAPH-MODEL_
  - [~] 3.4 实现 DOT 文本渲染（不落二进制 SVG），输出附录代码块文本
    _Requirements: R2.2_ _Properties: P-GRAPH-MODEL_
  - [~] 3.5 实现 Tarjan SCC 环路检测；自环或 `|C| >= 2` SCC → CRITICAL
    BoundaryFinding；NetworkX 不可用时回退到自写 Tarjan（< 50 行）
    _Requirements: R2.3_ _Properties: P-CYCLE-DETECTION_
  - [~] 3.6 实现层级矩阵违规判定：按 design.md §Components 1 给出的允许矩阵，
    ❌ 处出 HIGH BoundaryFinding；`MODULES → MODULES` 的 compile/runtime 边
    `proposed_action` 必须同时含中文子串"下沉至 libs"和"上移至 apps"
    _Requirements: R2.4, R2.5_ _Properties: P-TIER-VIOLATION_
  - [~] 3.7 实现 API/内部类型比：API 类型识别（public + 包路径含
    `api|client|facade|dto|event` 任一段）；`api_ratio = a / max(i, 1)`；
    `< 0.05` 仅在报告标注"过度内聚但接口稀薄"，不出 Finding
    _Requirements: R2.6_ _Properties: P-API-RATIO_
  - [~] 3.8 [PBT] `Feature: backend-refactor-review, Property 4: 模块依赖图
建模的双向一致`：生成 directed*graphs，断言节点/边集合等价 + Mermaid/DOT
    双射回填
    \_Properties: P-GRAPH-MODEL*
  - [~] 3.9 [PBT] `Feature: backend-refactor-review, Property 5: 环路检测的
可靠性与完备性`：注入随机环路（长度 1/2/3/4），断言检测集合 = Tarjan SCC
    且 ⇔ CRITICAL Finding
    _Properties: P-CYCLE-DETECTION_
  - [~] 3.10 [PBT] `Feature: backend-refactor-review, Property 6: 层级矩阵下的
边界违规判定`：枚举 `(tier_from, tier_to) × scope` 全笛卡尔积，断言
    Finding 的产生 ⇔ ❌ 单元；MODULES→MODULES 边附加关键短语校验
    _Properties: P-TIER-VIOLATION_
  - [~] 3.11 [PBT] `Feature: backend-refactor-review, Property 7: API/内部类型比`：
    生成 `(a, i) ∈ N²`，断言 `ratio = a / max(i, 1)` 与 `< 0.05 ⇔ 标注`
    _Properties: P-API-RATIO_

---

- [ ] 4. DuplicationScanner（R3）
  - [~] 4.1 在 `audit/scanners/duplication.py` 实现 PMD CPD 7.7.0 主路径调用：
    `--minimum-tokens 50 --language java --format xml --files libs model
modules apps/monolith-app --skip-lexical-errors --no-fail-on-violation`，
    XML 解析得到 `DuplicationBlock` 列表
    _Requirements: R3.1_ _Properties: P-DUPLICATION-FILTER_
  - [~] 4.2 实现跨模块判定：把 occurrence 路径映射到模块根（`libs/<m>` /
    `model/<m>` / `modules/<m>` / `apps/monolith-app`），覆盖 ≥ 2 个根才入选
    _Requirements: R3.2_ _Properties: P-DUPLICATION-FILTER_
  - [~] 4.3 实现 SimilarityScore：100% token 等价命中得 100；其余以
    `difflib.SequenceMatcher.ratio() * 100` 在源码片段上计算字符级相似度；
    阈值过滤 `tokens >= 50 AND SimilarityScore >= 70`
    _Requirements: R3.1, R3.2_ _Properties: P-DUPLICATION-FILTER_
  - [~] 4.4 实现 `proposed_extraction_target` 决策树（5 条规则按优先级取首个命中）
    _Requirements: R3.2_ _Properties: P-DUPLICATION-FILTER_
  - [~] 4.5 实现同名启动校验类聚合：检测 `SecretStartupValidator` 等同名类（按
    简单类名）跨模块出现 → 折叠为 ConsolidationFinding，severity=HIGH，
    target=libs/common-servlet
    _Requirements: R3.3_ _Properties: P-DUPLICATION-FILTER_
  - [~] 4.6 实现 jscpd 4.0.5 备用路径：PMD 退出码非 0 或解析失败时回退
    `npx jscpd@4.0.5 --min-tokens 50 --threshold 30 --reporters json`
    _Requirements: R3.5_ _Properties: P-DUPLICATION-FAILSAFE_
  - [~] 4.7 实现工具双失败兜底：两套都失败 → 落 1 条 HIGH
    `duplication_tooling_failed` Finding；不得跳过 R3
    _Requirements: R3.5_ _Properties: P-DUPLICATION-FAILSAFE_
  - [~] 4.8 实现 Top 30 表渲染：按 SimilarityScore 降序、tokens 次降序的稳定排序，
    表大小 = `min(30, |findings|)`
    _Requirements: R3.4_ _Properties: P-DUPLICATION-FILTER_
  - [~] 4.9 [PBT] `Feature: backend-refactor-review, Property 8: 重复检测过滤
与归并目标`：生成 `DuplicationBlockDraft` 列表，断言阈值过滤 + 跨模块
    判定 + extraction*target 域 + Top 30 排序稳定
    \_Properties: P-DUPLICATION-FILTER*
  - [~] 4.10 [PBT] `Feature: backend-refactor-review, Property 9: 重复检测工具
失败的兜底`：mock PMD/jscpd 退出码与输出，断言两套工具全失败时恰好 1 条
    HIGH Finding 且 Top 30 表标注"未能采集"
    _Properties: P-DUPLICATION-FAILSAFE_

---

- [ ] 5. LayeringScanner（R4）
  - [~] 5.1 在 `audit/scanners/layering.py` 用 `javalang` 解析每个 `.java`，
    抽取 `(annotations, simple_name, package_segments)` 三元组
    _Requirements: R4.1_ _Properties: P-CLASSIFIER-TOTALITY_
  - [~] 5.2 实现 4 级优先级分类器（注解 → 后缀 → 包段 → 兜底 `support`），
    值域锁死为 11 项枚举
    _Requirements: R4.1_ _Properties: P-CLASSIFIER-TOTALITY_
  - [~] 5.3 实现冲突检测（注解级 vs 包段级 标签不同且非兜底）→ MEDIUM
    LayeringFinding，`proposed_action` 给出"按注解迁移包" 与 "按包迁移注解"
    互斥候选
    _Requirements: R4.2_ _Properties: P-CLASSIFIER-TOTALITY_
  - [~] 5.4 实现命名一致性：每个子模块对比目录名 vs `<artifactId>` →
    不等出 LOW NamingFinding，`proposed_action` 必须同时含中文子串
    "统一命名"和"保留现状"
    _Requirements: R4.3_ _Properties: P-NAMING-DRIFT_
  - [~] 5.5 [EXAMPLE] 实现文档漂移检测：扫描根目录 `CLAUDE.md` / `README.md` /
    `AGENTS.md` / `HELP.md` 中的"微服务|microservice|单体|monolith"关键词，
    与 `apps/monolith-app/pom.xml` 是否为 Spring Boot 单体装配比较；
    不一致 → LOW DocumentationDriftFinding
    _Requirements: R4.4_
  - [~] 5.6 实现三元一致率：`trinity_rate = #{type | annotation_class ==
suffix_class == package_class} / total_types`；分母为 0 时定义为 1
    _Requirements: R4.5_ _Properties: P-RATE-BOUNDS_
  - [~] 5.7 [PBT] `Feature: backend-refactor-review, Property 10: 分类器的
全函数性与冲突判定`：生成三元组（含全空），断言返回值落 11 项枚举 +
    冲突 ⇔ Finding
    _Properties: P-CLASSIFIER-TOTALITY_
  - [~] 5.8 [PBT] `Feature: backend-refactor-review, Property 11: 模块目录名
与 artifactId 一致性`：生成 `(dir, artifactId)` 对，断言不等 ⇔ Finding +
    关键短语
    _Properties: P-NAMING-DRIFT_

---

- [ ] 6. ConfigSecretScanner（R5）
  - [~] 6.1 在 `audit/scanners/config_secret.py` 用 `ruamel.yaml==0.18.6`
    解析 `apps/monolith-app/src/main/resources/application*.yml`，保留行/列号
    _Requirements: R5.1_ _Properties: P-ENV-INVENTORY-COMPLETENESS_
  - [~] 6.2 实现占位符抽取：正则 `\$\{([^:}]+)(?::([^}]*))?\}`；同 key 多文件
    合并 `referenced_files`；default 冲突 → MEDIUM `env_default_conflict`
    Finding，default 字段填 `<<conflicting>>`
    _Requirements: R5.1_ _Properties: P-ENV-INVENTORY-COMPLETENESS_
  - [~] 6.3 实现 4 条密钥规则（`S-DEFAULT-PASSWORD` / `S-RANDOM-FALLBACK` /
    `S-PLAINTEXT-CREDENTIAL-IN-DOC` / `S-HOST-IP-LITERAL`），按 design.md
    §Components 4 表格逐条实现
    _Requirements: R5.2, R5.3_ _Properties: P-SECRET-DETECTION_
  - [~] 6.4 强制脱敏：写 `findings.json` 时，命中 `S-PLAINTEXT-CREDENTIAL-IN-DOC` /
    `S-DEFAULT-PASSWORD` 的 evidence 仅保留 `file_path` / `line_range` /
    `symbol`，不复刻明文凭据值
    _Requirements: R5.2, R5.3_ _Properties: P-SECRET-DETECTION_
  - [~] 6.5 `proposed_action` 文案校验：`S-PLAINTEXT-CREDENTIAL-IN-DOC` 必须
    同时含中文子串"立即"+"轮换"+"历史"+"清除"
    _Requirements: R5.3_ _Properties: P-SECRET-DETECTION_
  - [~] 6.6 [EXAMPLE] AGENTS.md 中已观测到的服务器明文密码行 → 必产生
    `S-PLAINTEXT-CREDENTIAL-IN-DOC` Finding
    _Requirements: R5.3_
  - [~] 6.7 实现 `*Properties` 同前缀归并：依赖 LayeringScanner 输出，按
    `prefix` group*by；`|group| >= 2` → MEDIUM ConsolidationFinding，
    `evidence.symbol = "prefix:" + prefix`，`proposed_action` ≥ 2 条候选
    \_Requirements: R5.4* _Properties: P-PROPERTIES-CONSOLIDATION_
  - [~] 6.8 实现强制环境变量列表：default 为 null 且不在任何 profile fallback 中
    → `boot_required_if_missing = true`，写入报告附录"必需环境变量"小节，
    `failure_mode = "boot-fail-fast"`
    _Requirements: R5.5_ _Properties: P-ENV-INVENTORY-COMPLETENESS_
  - [~] 6.9 [PBT] `Feature: backend-refactor-review, Property 13: 环境变量清单
的提取-定位往返`：生成 YAML 文档（深度 ≤ 4），断言 key 集合 = 正则全捕获 + referenced*files 行号可定位 + mandatory ⊆ inventory
    \_Properties: P-ENV-INVENTORY-COMPLETENESS*
  - [~] 6.10 [PBT] `Feature: backend-refactor-review, Property 14: 密钥检测
规则的全称判定`：生成 `(key, default)` 对与文档行，断言 4 条规则 ⇔
    CRITICAL Finding 且不复刻明文
    _Properties: P-SECRET-DETECTION_
  - [~] 6.11 [PBT] `Feature: backend-refactor-review, Property 15: *Properties
同前缀归并`：生成 prefix → class 多重映射，断言 `|group| >= 2` ⇔
    ConsolidationFinding
    _Properties: P-PROPERTIES-CONSOLIDATION_

---

- [ ] 7. FlywayDiffScanner（R6）
  - [~] 7.1 在 `audit/scanners/flyway_diff.py` 用 `sqlglot==25.20.0` 静态解析
    `modules/<domain>-module/.../db/migration/`、
    `apps/monolith-app/.../monolith/db/migration-pg/` 与
    `apps/monolith-app/.../monolith/db/migration/`（旧 MySQL 路径）；
    方言按目录路径自动选择
    _Requirements: R6.1, R6.5_ _Properties: P-SCHEMA-DIFF_
  - [~] 7.2 实现 schema 折叠：解析 `CREATE TABLE` / `ALTER TABLE` /
    `CREATE INDEX`，归约为 `(table → columns + pk + indexes + types)`
    _Requirements: R6.1_ _Properties: P-SCHEMA-DIFF_
  - [~] 7.3 实现 `SchemaDiffMatrix` 生成：按域 user/content/media/ai 比对，
    `column_diff_count`、`index_diff_count`、`first_diverging_version`
    _Requirements: R6.1, R6.2_ _Properties: P-SCHEMA-DIFF_
  - [~] 7.4 实现 SchemaDriftFinding：任一 diff*count > 0 → severity ∈ {HIGH,
    CRITICAL}
    \_Requirements: R6.2* _Properties: P-SCHEMA-DIFF_
  - [~] 7.5 实现双轨决策建议：旧 `migration/` 与 `migration-pg/` 重叠时，
    `proposed_action` 必须同时含中文子串"删除旧路径"和"保留双轨"，且 ≥ 2 条
    互斥候选
    _Requirements: R6.3_ _Properties: P-DUAL-TRACK-MIGRATION_
  - [~] 7.6 实现 schema 类 Finding 的关键短语强校验：`dimension == schema` 且
    `severity ∈ {HIGH, CRITICAL}` → `proposed_action` 必须含中文子串
    "以追加新版本号 V*xxx 的方式修复，禁止改写已发布版本号"；缺关键短语 →
    Renderer 抛 `SpecRenderError` 终止评审 + 退出码 3
    \_Requirements: R6.4* _Properties: P-RENDER-SCHEMA-KEYWORD_
  - [~] 7.7 实现解析失败兜底：每个无法解析的 `.sql` 单独 1 条 MEDIUM
    SchemaToolFinding，`evidence.symbol = basename(file)`
    _Requirements: R6.5_ _Properties: P-SCHEMA-DIFF_
  - [~] 7.8 [PBT] `Feature: backend-refactor-review, Property 16: Flyway schema
diff 与解析失败兜底`：生成两个独立 schema + 注入 sym*diff，断言
    diff_count > 0 ⇔ HIGH/CRITICAL Finding；解析失败 ⇔ MEDIUM Finding
    \_Properties: P-SCHEMA-DIFF*
  - [~] 7.9 [PBT] `Feature: backend-refactor-review, Property 17: 双轨迁移
路径的文案规约`：生成 `(migration_exists, migration_pg_exists)` 组合，
    断言双存在时关键短语齐全 + ≥ 2 条候选
    _Properties: P-DUAL-TRACK-MIGRATION_
  - [~] 7.10 [PBT] `Feature: backend-refactor-review, Property 18: Schema 类
Finding 的关键短语强校验`：生成各种 `proposed_action` 文案，断言缺关键
    短语 ⇔ Renderer raise + 不写产物
    _Properties: P-RENDER-SCHEMA-KEYWORD_

---

- [ ] 8. ApiContractScanner（R7）—— 一等公民
  - [~] 8.1 在 `audit/scanners/api_contract.py` 用 `javalang` 扫描全部
    `@RestController` 或 `(@Controller AND @ResponseBody)` 类
    _Requirements: R7.1_ _Properties: P-API-INVENTORY-ROUNDTRIP_
  - [~] 8.2 抽取每个 public 方法的 `(http_method, path, request_schema,
response_schema, required_permissions, rate_limit, controller_class,
idempotent, evidence)`；类级 `@RequestMapping` 与方法级 mapping 路径
    合并 + 规范化
    _Requirements: R7.1_ _Properties: P-API-INVENTORY-ROUNDTRIP_
  - [~] 8.3 实现 OpenAPI 3.0.3 静态生成器（AST → OpenAPI），不依赖 Spring 启动；
    `info.x-audit-fallback = true|false` 区分来源
    _Requirements: R7.3_ _Properties: P-API-INVENTORY-ROUNDTRIP_
  - [~] 8.4 实现首选路径：springdoc-openapi-cli 1.8.0；通过
    `-Dspring.config.location=.kiro/tools/audit-app.yml` 启动单体
    （配置文件 **不入 reactor**）；监听 `127.0.0.1:8898/v3/api-docs`，
    导出后立即关闭 Spring 进程
    _Requirements: R7.3_
  - [~] 8.5 实现回退切换：springdoc 任一阶段失败 → 切静态生成 + 落 MEDIUM
    `openapi_export_fallback` Finding，`info.x-audit-fallback=true`
    _Requirements: R7.3_ _Properties: P-API-INVENTORY-ROUNDTRIP_
  - [~] 8.6 实现 `equiv` 等价关系：`(field_name_set, field_type_set + format,
required_set)` 三元组深递归比较；数组字段递归比 `items`
    _Requirements: R7.2, R7.4_ _Properties: P-API-EQUIVALENCE_
  - [~] 8.7 在 `info.x-audit-invariants` 写入 4 条 Inv-7.4-A/B/C/D 不变量列表
    （路径方法集合相等 / 响应 schema 等价 / round-trip / idempotence）
    _Requirements: R7.4_ _Properties: P-DOWNSTREAM-INVARIANTS_
  - [~] 8.8 实现未授权端点检测：`required_permissions == ∅` 且 path 未通配匹配
    `shizuki.gateway.auth.public-paths` / `guest-paths` → HIGH ContractFinding
    _Requirements: R7.5_ _Properties: P-UNAUTHED-ENDPOINT_
  - [~] 8.9 [PBT] `Feature: backend-refactor-review, Property 19: API 契约清单
的完整性与 OpenAPI 双向映射`：生成 controller AST，断言 inventory 与
    OpenAPI 双射 + `equiv` 在五元组上成立
    _Properties: P-API-INVENTORY-ROUNDTRIP_
  - [~] 8.10 [PBT] `Feature: backend-refactor-review, Property 20: API Schema
等价关系的代数性质`：生成 JSON Schema（深度 ≤ 3），断言反身性 / 对称性 /
    传递性 / 函数关系
    _Properties: P-API-EQUIVALENCE_
  - [~] 8.11 [PBT] `Feature: backend-refactor-review, Property 22: 未授权端点
的检出`：生成端点 + 通配规则，断言 ⇔ HIGH ContractFinding
    _Properties: P-UNAUTHED-ENDPOINT_
  - [~] 8.12 [SMOKE] 把 4 条 Inv-7.4-\* 不变量以列表形式写入
    `api-contract.openapi.json` 的 `info.x-audit-invariants`，并由下游 spec
    消费
    _Requirements: R7.4_ _Properties: P-DOWNSTREAM-INVARIANTS_

---

- [ ] 9. EnvelopeScanner（R8）
  - [~] 9.1 在 `audit/scanners/envelope.py` 复用 ApiContractScanner 输出，
    把每个端点的返回类型分桶为 `ApiResponse<T>` / `PageResponse<T>` /
    `ResponseEntity<T>` / `raw object`
    _Requirements: R8.1_ _Properties: P-ENVELOPE-DETECTION_
  - [~] 9.2 实现 `ResponseEntity<?>` 二次静态分析：方法体内若含 `ApiResponse`
    字面构造或 `ApiResponse.success(...)` 调用 → 视为已包装；否则
    ContractFinding（severity ∈ {MEDIUM, HIGH}）
    _Requirements: R8.2_ _Properties: P-ENVELOPE-DETECTION_
  - [~] 9.3 实现 `@ExceptionHandler` 字段集合检查：返回体字段集合不包含
    `{type, title, status, detail}` 全集 → ErrorContractFinding，
    `evidence.symbol = declaring_class + "#" + method_name`
    _Requirements: R8.3_ _Properties: P-ERROR-ENVELOPE-FIELDS_
  - [~] 9.4 实现 `wrap_rate = (#ApiResponse + #PageResponse) / total_endpoints`，
    总数为 0 时记 N/A；保留两位小数
    _Requirements: R8.4_ _Properties: P-RATE-BOUNDS_
  - [~] 9.5 [PBT] `Feature: backend-refactor-review, Property 23: 响应包络分桶
与未包装检测`：生成 controller 方法返回类型 + 方法体片段，断言分桶恰一 + 未包装 ⇔ ContractFinding
    _Properties: P-ENVELOPE-DETECTION_
  - [~] 9.6 [PBT] `Feature: backend-refactor-review, Property 24: 错误响应字段
集合检查`：生成 `@ExceptionHandler` 返回类型，断言缺字段 ⇔ Finding
    _Properties: P-ERROR-ENVELOPE-FIELDS_

---

- [ ] 10. BuildHygieneScanner（R9）
  - [~] 10.1 在 `audit/scanners/build_hygiene.py` 调用
    `mvn -B -DskipTests dependency:tree -Doutput=.tmp/dep-tree.txt`，
    归并到 `DependencyMatrix(groupId:artifactId → set<version>)`；超时 300s
    → HIGH `DependencyResolutionFinding`
    _Requirements: R9.1_ _Properties: P-DEP-MATRIX-MERGE-COMMUTATIVE_
  - [~] 10.2 调用 `mvn -B -DskipTests dependency:analyze -DignoreNonCompile=true`，
    解析 `Unused declared dependencies found` 段，每条 → LOW
    UnusedDependencyFinding
    _Requirements: R9.3_ _Properties: P-BUILD-HYGIENE-RULES_
  - [~] 10.3 实现版本漂移检测：`|set<version>| >= 2` → HIGH VersionDriftFinding，
    `evidence.symbol = "<groupId>:<artifactId>"`
    _Requirements: R9.2_ _Properties: P-BUILD-HYGIENE-RULES_
  - [~] 10.4 实现 git 仓库内构建产物检测：`git ls-files` 匹配
    `**/target/**` / `modules/**/.mvn/repository/**` / `%BASE_WIN%/.venv-cpu/**`
    → HIGH HygieneFinding，`proposed_action` 含对应 `.gitignore` 规则字符串
    _Requirements: R9.4_ _Properties: P-BUILD-HYGIENE-RULES_
  - [~] 10.5 实现 BOM 升级判定：父 pom 占位符 vs 子模块解析版本逐一比对，
    值域锁死为 `{KEEP_AS_IS, UPGRADE_TO_BOM, BOM_OK_BUT_OUTDATED,
INCONSISTENT_OVERRIDE}`
    _Requirements: R9.5_ _Properties: P-BUILD-HYGIENE-RULES_
  - [~] 10.6 [PBT] `Feature: backend-refactor-review, Property 25: 依赖矩阵
合并的可交换`：生成 `dependency_tree_drafts` 列表 + 任意置换，断言
    merge 可交换 + 结合
    _Properties: P-DEP-MATRIX-MERGE-COMMUTATIVE_
  - [~] 10.7 [PBT] `Feature: backend-refactor-review, Property 26: 构建卫生
规则的全称判定`：分别覆盖版本漂移 / unused / hygiene / BOM 4 子规则
    _Properties: P-BUILD-HYGIENE-RULES_

---

- [ ] 11. TestCoverageScanner（R10）—— **不修改 reactor pom.xml**
  - [~] 11.1 在 `audit/scanners/test_coverage.py` 调用
    `mvn -B test -Dargline=-javaagent:.kiro/tools/jacocoagent.jar=destfile=
.tmp/jacoco.exec,append=true`，fail-at-end 模式
    _Requirements: R10.1, R10.2_ _Properties: P-REACTOR-POM-IMMUTABLE_
  - [~] 11.2 [INTEGRATION] 在容器化 runner 中跑一次完整 reactor `mvn -B test`，
    断言每模块 `tests_run / failures / errors / skipped` 字段全部存在
    _Requirements: R10.1_
  - [~] 11.3 解析 surefire-reports XML（即使部分失败也尽量解析），
    按模块汇总 `tests_run / failures / errors / skipped`
    _Requirements: R10.1, R10.5_ _Properties: P-COVERAGE-FALLBACK_
  - [~] 11.4 调用 `java -jar .kiro/tools/jacococli.jar report ... --xml
.tmp/jacoco.xml`，每模块 `--classfiles` 显式列出；缺失 `target/classes`
    时先 `mvn -B -pl <m> -am test-compile`，仍失败 → MEDIUM
    `coverage_classfile_missing` Finding
    _Requirements: R10.2_ _Properties: P-COVERAGE-FALLBACK_
  - [~] 11.5 解析 jacoco.xml，按模块汇总 `line / branch / method` 覆盖率
    （0.00–100.00，两位小数；无数据 N/A）
    _Requirements: R10.2_ _Properties: P-COVERAGE-FALLBACK_
  - [~] 11.6 实现 CoverageGapFinding：`line_coverage < 30.00%` 或 `tests_run = 0`
    → MEDIUM Finding（排除纯聚合 pom 模块）
    _Requirements: R10.3_ _Properties: P-COVERAGE-FALLBACK_
  - [~] 11.7 [SMOKE] 报告输出建议覆盖率门槛文案，明确"建议非强制"：
    `apps/monolith-app` + `modules/*-module` 行 ≥ 60%、分支 ≥ 40%；
    `libs/*` 行 ≥ 50% / 分支 ≥ 30%；`model/*` 行 ≥ 30% / 分支 ≥ 10%
    _Requirements: R10.4_
  - [~] 11.8 实现 mvn test 全失败兜底：单条 MEDIUM TestEnvFinding，
    `proposed_action` 至少枚举 3 关键词："testcontainers"、"flyway"、
    "go-offline"；评审整体退出码仍为 0
    _Requirements: R10.5_ _Properties: P-COVERAGE-FALLBACK_
  - [~] 11.9 [PBT] `Feature: backend-refactor-review, Property 28: 覆盖率收集
与失败兜底`：生成模块覆盖率 + tests*run 组合，断言阈值 ⇔ Finding +
    全失败时退出码 0
    \_Properties: P-COVERAGE-FALLBACK*

---

- [ ] 12. ObservabilityScanner（R11）
  - [~] 12.1 在 `audit/scanners/observability.py` 用 `javalang` 扫描入站接入点：
    `Filter` / `OncePerRequestFilter` 实现类、`@KafkaListener` /
    `@RabbitListener` / `@Scheduled` 方法、`MessageListener` 实现类、
    WebSocketHandler
    _Requirements: R11.1_ _Properties: P-OBSERVABILITY-RULES_
  - [~] 12.2 判定 trace/request id 覆盖：HTTP 入口检查同链 `TraceIdFilter` /
    `RequestIdFilter` 是否就位（基于 `@Order` + `addFilterBefore/After` 静态
    分析）；非 HTTP 入口检查方法首行是否调用 `MDC.put` 或
    `TraceContext.beginSpan`
    _Requirements: R11.1_ _Properties: P-OBSERVABILITY-RULES_
  - [~] 12.3 生成 `TraceCoverageTable`：列含 `entrypoint_kind / symbol /
trace_filter_present / request_id_filter_present / coverage`
    （FULL/PARTIAL/MISSING），MISSING → HIGH Finding
    _Requirements: R11.1_ _Properties: P-OBSERVABILITY-RULES_
  - [~] 12.4 实现写端点 `@AuditLog` 审计：复用 ApiContractScanner，
    `POST/PUT/PATCH/DELETE` 端点 缺 `@AuditLog` 且不在 public-paths 通配中
    → MEDIUM ObservabilityFinding，记录 `(FQN, method, path, missing)`
    _Requirements: R11.2_ _Properties: P-OBSERVABILITY-RULES_
  - [~] 12.5 实现日志密度：`grep -E 'LoggerFactory\.getLogger|log\.(info|warn|
error|debug|trace)'` 统计每模块 `log_calls`；`cloc` 或自写计数器统计
    `kloc`；`density = log_calls / kloc`，2 位小数；`< 5.00 ∨ > 100.00` →
    LOW Finding
    _Requirements: R11.3_ _Properties: P-RATE-BOUNDS, P-OBSERVABILITY-RULES_
  - [~] 12.6 实现 `logging.level` 检查：YAML 解析，键
    `logging.level.io.github.shizuki.**` 在生产 profile 下值 ∈
    `{DEBUG, TRACE, ALL}` → MEDIUM ObservabilityFinding
    _Requirements: R11.4_ _Properties: P-OBSERVABILITY-RULES_
  - [~] 12.7 [PBT] `Feature: backend-refactor-review, Property 29: 可观测性
入站接入点判定`：覆盖 trace 缺失 / 写端点 / logging.level 三组规则
    _Properties: P-OBSERVABILITY-RULES_

---

- [ ] 13. ModelEntityScanner（R12）
  - [~] 13.1 在 `audit/scanners/model_entity.py` 扫描 `model/entity/.../`
    `{ai,content,media,user}/entity/**/*.java`，抽取每个 entity 中以
    `io.github.shizuki.site.{ai,content,media,user}.entity.` 开头的 import
    _Requirements: R12.1_ _Properties: P-CROSS-DOMAIN-ENTITY_
  - [~] 13.2 生成 `EntityCrossDomainImportTable`：源 FQN / 源域 / 目标 FQN /
    目标域 / 文件路径 / 行号
    _Requirements: R12.1_ _Properties: P-CROSS-DOMAIN-ENTITY_
  - [~] 13.3 对 6 对域两两组合（ai-content / ai-media / ai-user / content-media /
    content-user / media-user）任一方向命中跨域 import → 每条跨域引用 1 条
    BoundaryFinding，severity ∈ {HIGH, CRITICAL}
    _Requirements: R12.2_ _Properties: P-CROSS-DOMAIN-ENTITY_
  - [~] 13.4 [SMOKE] 实现 build-helper 拆分 vs 单 jar 五维决策矩阵：受影响文件
    数量、构建耗时变化、依赖隔离强度、对 modules 调用方破坏性、推荐度；
    给出推荐方案 + 理由
    _Requirements: R12.3_
  - [~] 13.5 实现重复 entity 类名归并：`modules/<m>/.../*.java` 中的简单类名
    与 `model/entity/.../*.java` 简单类名相等 → MEDIUM ConsolidationFinding，
    含 `(modules_fqn, model_fqn, field_diff_summary, merge_suggestion)`
    字段；`proposed_action` 必须含 3 关键词："保留 model 侧"、"保留
    modules 侧"、"重命名"
    _Requirements: R12.4_ _Properties: P-DUPLICATE-ENTITY-NAME_
  - [~] 13.6 [PBT] `Feature: backend-refactor-review, Property 30: 跨域 entity
引用判定`
    _Properties: P-CROSS-DOMAIN-ENTITY_
  - [~] 13.7 [PBT] `Feature: backend-refactor-review, Property 31: modules 内
重复 entity 类名归并`
    _Properties: P-DUPLICATE-ENTITY-NAME_

---

- [ ] 14. Aggregator + Renderers（产物渲染层）
  - [~] 14.1 在 `audit/aggregator/finding_merger.py` 实现 Finding 合并：
    所有 Scanner 输出汇入 → StableIdComputer 计算 ID → 撞车检测追加
    `#dup-<n>`
    _Requirements: R1.4_ _Properties: P-STABLE-ID, P-FINDING-SCHEMA_
  - [~] 14.2 在 `audit/aggregator/invariant_builder.py` 把 ApiContractScanner
    输出的 4 条 Inv-7.4-\* 不变量构造为 OpenAPI `info.x-audit-invariants`
    列表
    _Requirements: R7.4_ _Properties: P-DOWNSTREAM-INVARIANTS_
  - [~] 14.3 在 `audit/renderer/findings_renderer.py` 实现
    `findings.json` 渲染：`schema_version / spec_id / generated_at /
reactor_commit / findings[]`；UTF-8、`indent=2`、key 字典序稳定
    _Requirements: R1.2, R1.3, R1.4_ _Properties: P-FINDING-SCHEMA_
  - [~] 14.4 在 `audit/renderer/openapi_renderer.py` 实现
    `api-contract.openapi.json` 渲染（OpenAPI 3.0.3）
    _Requirements: R7.3_ _Properties: P-API-INVENTORY-ROUNDTRIP_
  - [~] 14.5 在 `audit/renderer/report_renderer.py` 实现 `report.md` 渲染：
    按 design.md §Output Schemas §1 骨架（0–12 章 + 附录 A/B/C），
    首部维度 × 严重度二维计数表
    _Requirements: R1.2, R1.3_ _Properties: P-FINDING-SCHEMA_
  - [~] 14.6 实现 schema 类 Finding 关键短语 Renderer 强校验，缺则
    `SpecRenderError` + 删除已写出产物 + 退出码 3
    _Requirements: R6.4_ _Properties: P-RENDER-SCHEMA-KEYWORD_
  - [~] 14.7 实现原子写入：`*.tmp → os.rename`，崩溃不留半成品
    _Requirements: R1.2_ _Properties: P-WRITE-BOUNDARY_
  - [~] 14.8 [SMOKE] 工具版本附录非空：附录 B 必须列出 Maven / PMD CPD /
    jscpd / sqlglot / javalang / ruamel.yaml / hypothesis / jacoco /
    springdoc / dot 全部版本与 OK/FAILED/SKIPPED 状态
    _Requirements: R1.6_

---

- [ ] 15. 端到端跑通：执行 Audit Toolchain 并产出三份产物
  - [~] 15.1 在 reactor 根目录执行 `python -m audit.cli run
--reactor-root . --output-dir .kiro/specs/backend-refactor-review/`，
    驱动全部 11 个 Scanner（并行可选）→ Aggregator → 3 个 Renderer
    _Requirements: R1.2_
  - [~] 15.2 评审开始前 `ReactorImmutabilityGuard.snapshot()`；评审结束后
    `verify()` 比对 sha256；任一改变 → CRITICAL `process_violation`
    _Requirements: R1.5_ _Properties: P-REACTOR-POM-IMMUTABLE_
  - [~] 15.3 [SMOKE] 三个产物文件存在、大小 > 0、JSON 可解析、Markdown 通过
    markdownlint
    _Requirements: R1.2_
  - [~] 15.4 `findings.json` 至少包含设计中明确点名的实例 Finding：
    AGENTS.md 服务器明文密码（CRITICAL）、`media-service → user-service` + `ai-service → user-service`（HIGH）、`SecretStartupValidator` 同名类
    归并（HIGH）
    _Requirements: R2.5, R3.3, R5.3_
  - [~] 15.5 `api-contract.openapi.json` 的 `info.x-audit-invariants` 数组
    长度 = 4，包含 Inv-7.4-A/B/C/D
    _Requirements: R7.4_ _Properties: P-DOWNSTREAM-INVARIANTS_
  - [~] 15.6 评审完成后清理 `.kiro/specs/backend-refactor-review/.tmp/`，
    仅保留 3 份正式产物
    _Requirements: R1.2_
  - [~] 15.7 [SMOKE] 运行 `git status -s -- '*.java' '*/pom.xml'
'*/application*.yml' '*.sql' compose.yaml 'Dockerfile.*'`，断言输出
    为空（reactor 文件未被任何 Scanner / Renderer 改写）
    _Requirements: R1.5, 全局约束 1_ _Properties: P-REACTOR-POM-IMMUTABLE_

---

- [ ] 16. 文档化与下游 spec 移交
  - [~] 16.1 在 `report.md` 末尾附录 D 列出后续重构 spec 的入口与消费协议：
    `findings.json` 按 `severity = CRITICAL → HIGH → MEDIUM → LOW` 顺序消费；
    `api-contract.openapi.json.info.x-audit-invariants` 作为合约测试 fixture；
    PR 描述显式列出"修复的 Finding id 集合 + 影响的 Inventory 端点集合"
    _Requirements: R1.2_
  - [~] 16.2 在 `requirements.md` / `design.md` / `tasks.md` 与产物之间建立
    交叉链接（TOC + section anchor），便于下游 spec 直接引用
    _Requirements: R1.2_
  - [~] 16.3 在 git 工作树上提交本期产物（仅
    `.kiro/specs/backend-refactor-review/**`）；commit 作者
    `Izumi <29301481@qq.com>`，message 格式 `feat: backend refactor review
report and findings`；不 push
    _Requirements: 全局约束 1_

---

## 任务-需求-属性 反向索引

| Task | Requirements 覆盖                        | Properties 覆盖                                                                                                              |
| ---- | ---------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| 1    | 1.5                                      | P-WRITE-BOUNDARY, P-REACTOR-POM-IMMUTABLE                                                                                    |
| 2    | 1.3, 1.4                                 | P-FINDING-SCHEMA, P-STABLE-ID                                                                                                |
| 3    | 2.1–2.6                                  | P-GRAPH-MODEL, P-CYCLE-DETECTION, P-TIER-VIOLATION, P-API-RATIO                                                              |
| 4    | 3.1–3.5                                  | P-DUPLICATION-FILTER, P-DUPLICATION-FAILSAFE                                                                                 |
| 5    | 4.1–4.5                                  | P-CLASSIFIER-TOTALITY, P-NAMING-DRIFT, P-RATE-BOUNDS                                                                         |
| 6    | 5.1–5.5                                  | P-ENV-INVENTORY-COMPLETENESS, P-SECRET-DETECTION, P-PROPERTIES-CONSOLIDATION                                                 |
| 7    | 6.1–6.5                                  | P-SCHEMA-DIFF, P-DUAL-TRACK-MIGRATION, P-RENDER-SCHEMA-KEYWORD                                                               |
| 8    | 7.1–7.5                                  | P-API-INVENTORY-ROUNDTRIP, P-API-EQUIVALENCE, P-DOWNSTREAM-INVARIANTS, P-UNAUTHED-ENDPOINT                                   |
| 9    | 8.1–8.4                                  | P-ENVELOPE-DETECTION, P-ERROR-ENVELOPE-FIELDS, P-RATE-BOUNDS                                                                 |
| 10   | 9.1–9.5                                  | P-DEP-MATRIX-MERGE-COMMUTATIVE, P-BUILD-HYGIENE-RULES                                                                        |
| 11   | 10.1–10.5                                | P-REACTOR-POM-IMMUTABLE, P-COVERAGE-FALLBACK                                                                                 |
| 12   | 11.1–11.4                                | P-OBSERVABILITY-RULES, P-RATE-BOUNDS                                                                                         |
| 13   | 12.1–12.4                                | P-CROSS-DOMAIN-ENTITY, P-DUPLICATE-ENTITY-NAME                                                                               |
| 14   | 1.2, 1.3, 1.4, 1.6, 6.4, 7.3, 7.4        | P-FINDING-SCHEMA, P-STABLE-ID, P-WRITE-BOUNDARY, P-RENDER-SCHEMA-KEYWORD, P-API-INVENTORY-ROUNDTRIP, P-DOWNSTREAM-INVARIANTS |
| 15   | 1.2, 1.5, 2.5, 3.3, 5.3, 7.4, 全局约束 1 | P-REACTOR-POM-IMMUTABLE, P-DOWNSTREAM-INVARIANTS                                                                             |
| 16   | 1.2, 全局约束 1                          | —                                                                                                                            |
