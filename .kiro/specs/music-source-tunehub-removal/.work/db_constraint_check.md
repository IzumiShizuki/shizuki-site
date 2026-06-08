# DB Constraint Check — `MDA_USER_MUSIC_PLAYLIST_TRACK`

**Spec**: `music-source-tunehub-removal`
**Task**: 1.1（现网约束摸底，只读调研）
**目的**: 为 V1003 step 5（生成 `vh_meting_*` 副本到 `MDA_USER_MUSIC_PLAYLIST_TRACK`）确定使用 `ON CONFLICT ... DO NOTHING` 还是 `WHERE NOT EXISTS` fallback。
**关联设计章节**: design.md §3.5 step 5；R4.5；R6.5。

---

## 1. 检查依据

### 1.1 MySQL DDL（旧档 + 模块休眠）

#### 文件 A — `apps/monolith-app/src/main/resources/monolith/db/migration/V406__add_user_music_playlist_tables.sql`

```sql
-- line 23-44 节选
CREATE TABLE IF NOT EXISTS MDA_USER_MUSIC_PLAYLIST_TRACK (
    id BIGINT NOT NULL AUTO_INCREMENT ...,
    playlist_code VARCHAR(64) NOT NULL ...,
    provider_code VARCHAR(64) NOT NULL DEFAULT 'local' ...,
    track_id VARCHAR(128) NOT NULL ...,
    ...
    CONSTRAINT PK_MDA_USER_MUSIC_PLAYLIST_TRACK PRIMARY KEY (id),
    CONSTRAINT AK_MDA_USER_MUSIC_PLAYLIST_TRACK_1 UNIQUE (playlist_code, provider_code, track_id),  -- ← line 41
    KEY IX_MDA_USER_MUSIC_PLAYLIST_TRACK_1 (playlist_code, enabled_flag, sort_num)
) COMMENT='用户歌单曲目表';
```

→ **MySQL 路径 line 41 明确包含三列复合唯一约束 `(playlist_code, provider_code, track_id)`。**

#### 文件 B — `modules/media-module/src/main/resources/db/migration/V4__add_user_music_playlist_tables.sql`

```sql
-- line 41 同样包含
CONSTRAINT AK_MDA_USER_MUSIC_PLAYLIST_TRACK_1 UNIQUE (playlist_code, provider_code, track_id),
```

→ **模块休眠路径与 V406 等价，三列唯一约束存在。**

### 1.2 PostgreSQL 主路径（active Flyway path）

`spring.flyway.locations: classpath:monolith/db/migration-pg`（`apps/monolith-app/src/main/resources/application.yml` line 302）。
`baseline-on-migrate: true`，`baseline-version: 0`（line 303-304）。

仓库中 `apps/monolith-app/src/main/resources/monolith/db/migration-pg/` 下全部脚本：

| 文件                                               | 涉及表                                     | 是否处理 `MDA_USER_MUSIC_PLAYLIST_TRACK` |
| -------------------------------------------------- | ------------------------------------------ | ---------------------------------------- |
| `V1000__postgres_runtime_compat.sql`               | `USR_ACCOUNT`（列类型转 jsonb + GIN 索引） | ❌ 无                                    |
| `V1001__blog_post_presentation_service_fields.sql` | Blog post 字段                             | ❌ 无                                    |
| `V1002__postgres_user_admin_bootstrap.sql`         | PG admin bootstrap                         | ❌ 无                                    |

全仓库 `grep MDA_USER_MUSIC_PLAYLIST_TRACK includePattern=migration-pg/**` → **0 命中**。

→ **PG active Flyway 路径下没有任何脚本创建 `MDA_USER_MUSIC_PLAYLIST_TRACK` 表或对其加唯一约束。**

### 1.3 PG 部署中此表如何存在

由于 `baseline-on-migrate: true / baseline-version: 0`，Flyway 启动时：

1. 若数据库 schema 已存在但无 `flyway_schema_history` → baseline 到版本 0；
2. 然后从 V1000 开始顺序执行。

这表示 **PG 部署中 `MDA_USER_MUSIC_PLAYLIST_TRACK` 的 DDL 必然来自**：

- (a) 手工 SQL dump（很可能是从 V406 MySQL DDL 经方言转换而来，业务字段命名一致），或
- (b) 数据库初始化脚本未纳入仓库 `resouces/sql/` 维护（仓库中 `resouces/sql/shizuki_app.sql` 是 MySQL 方言基线，PG 部署不直接使用）。

仓库无法静态验证生产 PG 库中该表的实际唯一约束是否存在。**这是一个 schema gap**：active Flyway 路径不维护该表的 DDL。

---

## 2. 落地结论：**B（schema gap，需要前置守卫）**

按用户给定的三选一模型：

- ❌ **结论 A**（MySQL DDL 有 + PG 基线也有）—— 不成立。仓库内可见的 PG `migration-pg/` 路径下不存在该表/约束的 DDL。
- ✅ **结论 B**（MySQL DDL 有 + PG 基线没有该表）—— **成立**。schema gap：PG active 路径无 baseline DDL 维护此表与其唯一约束，生产环境是否携带该约束依赖外部 dump 内容。
- ❌ **结论 C**（MySQL DDL 也没有该唯一索引）—— 不成立。MySQL 路径 V406 / V4 line 41 明确存在三列唯一约束。

### 2.1 结论 B 的两种落地选项

| 选项                | 描述                                                                                         | 风险                                                                                                               |
| ------------------- | -------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------ |
| **B-Guard（推荐）** | V1003 step 5 之前，先 `CREATE UNIQUE INDEX IF NOT EXISTS` 显式建立约束，再用 `ON CONFLICT`。 | 若生产 PG 表中已有违反该唯一性的脏数据，CREATE INDEX 会失败 → 启动失败但属可观察、可修复。                         |
| **B-Fallback**      | V1003 step 5 改用 `INSERT ... SELECT ... WHERE NOT EXISTS (...)` 形态，不依赖唯一约束。      | 即便生产表无唯一约束也能正确去重；竞态下并发执行可能违反业务唯一性，但本迁移是单事务、启动期单点执行，无并发问题。 |

**推荐采用 B-Fallback** 作为 V1003 内部默认实现（design §3.5 step 5 修订），原因：

1. **零依赖**：不依赖生产 PG 该表的实际 schema 状态，可在所有环境（旧 dump / 新 init / testcontainers）下幂等执行。
2. **最低耦合**：不需要在 V1003 内部夹带 schema 变更（`CREATE UNIQUE INDEX`），保留 schema 稳态。
3. **如未来需要补齐 schema**：通过新增独立的前置 PG 脚本（建议命名 `V0999__user_music_playlist_track_baseline.sql` 或 `V1003a__playlist_track_unique_index_guard.sql`）维护，与 V1003 业务迁移解耦。本任务**不修复**该 gap，仅在 §4 标记建议任务。

### 2.2 design.md §3.5 step 5 的修正项

**原 design 草稿（design.md line 376-386）**：

```sql
INSERT INTO MDA_USER_MUSIC_PLAYLIST_TRACK
    (playlist_code, provider_code, track_id, sort_num,
     create_time, update_time, deleted_flag, version_num)
SELECT
    REPLACE(playlist_code, 'vh_tunehub_', 'vh_meting_') AS playlist_code,
    provider_code, track_id, sort_num,
    create_time, update_time, deleted_flag, version_num
FROM MDA_USER_MUSIC_PLAYLIST_TRACK
WHERE playlist_code LIKE 'vh_tunehub_%'
ON CONFLICT (playlist_code, provider_code, track_id) DO NOTHING;
```

**修正为 B-Fallback 形态**（5.1 实现时落实）：

```sql
-- V1003 step 5b: vh_meting_* 副本（fallback：不依赖唯一约束）
INSERT INTO MDA_USER_MUSIC_PLAYLIST_TRACK
    (playlist_code, provider_code, track_id, sort_num,
     create_time, update_time, deleted_flag, version_num)
SELECT
    REPLACE(src.playlist_code, 'vh_tunehub_', 'vh_meting_') AS new_playlist_code,
    src.provider_code,
    src.track_id,
    src.sort_num,
    src.create_time,
    src.update_time,
    src.deleted_flag,
    src.version_num
FROM MDA_USER_MUSIC_PLAYLIST_TRACK AS src
WHERE src.playlist_code LIKE 'vh_tunehub_%'
  AND NOT EXISTS (
      SELECT 1
      FROM MDA_USER_MUSIC_PLAYLIST_TRACK AS dst
      WHERE dst.playlist_code = REPLACE(src.playlist_code, 'vh_tunehub_', 'vh_meting_')
        AND dst.provider_code = src.provider_code
        AND dst.track_id      = src.track_id
  );
```

#### 幂等性证明

| 运行   | `WHERE NOT EXISTS` 子查询的语义             | 行为   |
| ------ | ------------------------------------------- | ------ |
| 第一次 | 副本不存在 → NOT EXISTS 返回 true → 插入    | 插入   |
| 第二次 | 副本已存在 → NOT EXISTS 返回 false → 不插入 | 空操作 |

**注**：`MDA_USER_MUSIC_PLAYLIST` 主表（playlist_code 单列唯一）原 design line 367-375 用的 `ON CONFLICT (playlist_code) DO NOTHING` 仍然成立——因为 `playlist_code` 单列唯一约束在 V406 / V4 line 21 明确存在（`CONSTRAINT AK_MDA_USER_MUSIC_PLAYLIST_1 UNIQUE (playlist_code)`），且业务模型上 PG 部署也必然保留（否则现存逻辑会违反唯一性）。**只有 `MDA_USER_MUSIC_PLAYLIST_TRACK` 这张表的复合三列约束在 PG 路径不可证**，故仅本表降级使用 `WHERE NOT EXISTS`。

---

## 3. 给后续 5.1 任务的输入

5.1（创建 `V1003__music_tunehub_to_meting.sql`）执行时：

- step 1（`MDA_MUSIC_PROVIDER_CONFIG`）—— 维持原 design `ON CONFLICT (provider_code)`，PG 部署中此表 schema 由仓库 V1002 之前的外部初始化或后续 PG 基线脚本维护，且该唯一性是单列业务主键约束，假定存在风险低。
- step 2（`MDA_MUSIC_PROVIDER_GUIDE`）—— 同上。
- step 3（`USR_PROVIDER_SECRET`）—— 仅 `DELETE`，不依赖唯一约束。
- step 4（`USR_PREFERENCE` JSON 改写）—— 仅 `UPDATE`，不依赖唯一约束。
- step 5a（`MDA_USER_MUSIC_PLAYLIST` 镜像）—— `playlist_code` 单列 UNIQUE 在 PG 部署中假定存在，维持原 design `ON CONFLICT (playlist_code) DO NOTHING`。
  - 进一步加固选项（可选，由 5.1 决定是否引入）：可改成同样的 `WHERE NOT EXISTS` 形态以彻底解耦 schema 假设。
- **step 5b（`MDA_USER_MUSIC_PLAYLIST_TRACK` 镜像）—— 强制使用 `WHERE NOT EXISTS` fallback 形态（本结论文件 §2.2 给出的 SQL 草稿）。**

## 4. Schema Gap：建议的前置任务（不修改 tasks.md，仅记录）

**Gap 描述**：active Flyway 路径 `migration-pg/` 下不存在创建 `MDA_USER_MUSIC_PLAYLIST_TRACK`（以及同批 `MDA_USER_MUSIC_PLAYLIST` / `MDA_USER_MUSIC_PLAYLIST_COLLECT`）的 DDL；仓库中只有 MySQL 方言版本（V406 / V4）。生产 PG 库中此表是否携带 `(playlist_code, provider_code, track_id)` 唯一约束依赖外部 dump，**不可由仓库静态验证**。

**建议加入 tasks.md（5.0 前置）的任务文本草稿**：

```md
- [ ] 5.0 (建议) 补齐 `migration-pg/` 路径中音乐歌单三表的 PG 基线 DDL（schema gap）
  - 起因：active Flyway 路径 `migration-pg/` 不维护 `MDA_USER_MUSIC_PLAYLIST` /
    `MDA_USER_MUSIC_PLAYLIST_TRACK` / `MDA_USER_MUSIC_PLAYLIST_COLLECT` 的 DDL；
    现生产环境表 schema 来自外部 dump（不可由仓库静态验证）。
  - 路径：`apps/monolith-app/src/main/resources/monolith/db/migration-pg/V0999__user_music_playlist_baseline.sql`
    （版本号选 V0999 表示先于 V1003 业务迁移；亦可选 V1003a 但需保证执行顺序在 V1003 之前）
  - 内容：将 V406 / V4 的 MySQL DDL 转为 PG 方言（`BIGSERIAL` / `BOOLEAN` / `JSONB` /
    `TIMESTAMP` 等），全部使用 `CREATE TABLE IF NOT EXISTS` 与 `CREATE UNIQUE INDEX
IF NOT EXISTS` 守护，确保对**已携带表的旧库**幂等无副作用，对**新建空库**正确创建表与
    `(playlist_code, provider_code, track_id)` 唯一约束。
  - 该任务完成后，本 spec 5.1 的 V1003 step 5b 也可改回更简洁的 `ON CONFLICT
(playlist_code, provider_code, track_id) DO NOTHING`；但本 spec 范围内仍按
    fallback 形态实现以避免顺序耦合。
  - 验证：在 testcontainers 上分别用"空库"与"预先注入 V406 dump 后的库"两种起点执行
    Flyway，断言 `\d+ MDA_USER_MUSIC_PLAYLIST_TRACK` 含三列唯一约束。
  - _Requirements: schema-gap finding（不属本 spec 9 个 EARS Requirement）_
```

> 是否纳入本 spec、还是另起一个 spec（例如 `pg-schema-baseline-fillin`），需要在 spec 评审时由 owner 决策。本任务（1.1）只读调研、不修改 tasks.md。

---

## 5. 总结一句话

**结论 B**：`MDA_USER_MUSIC_PLAYLIST_TRACK` 在 MySQL DDL（V406 line 41 / V4 line 41）有三列复合唯一约束 `(playlist_code, provider_code, track_id)`，但 active Flyway 主路径 `migration-pg/` 下没有维护该表的 DDL；V1003 step 5（针对该表的副本插入）必须采用 `INSERT ... SELECT ... WHERE NOT EXISTS (...)` fallback 形态以解除对 PG schema 状态的依赖。schema gap 建议另起前置任务 5.0 补齐 PG baseline，但本次 spec 范围内不修复。
