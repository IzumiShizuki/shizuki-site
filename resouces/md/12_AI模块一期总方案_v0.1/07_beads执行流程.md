# 07_beads执行流程

- 所属总览：[12_AI模块一期总方案_v0.1](../12_AI模块一期总方案_v0.1.md)
- 适用范围：AI 一期规划落地、后续具体开发、阶段验收、会话收尾

---

## 1. 当前 beads 是否已经做好

已做好，当前 AI 一期相关 beads 已经建立并固化了依赖关系。

已确认状态如下：

1. `shizuki-site-yd1` `AI 模块一期总方案与任务拆分`
   - 状态：`closed`
   - 作用：一期 umbrella feature
2. `shizuki-site-gfb` `编写 AI 模块一期总方案主文档`
   - 状态：`closed`
   - 作用：最初总稿文档
3. `shizuki-site-37e` `编写 AI 一期 beads 执行流程文档`
   - 状态：当前文档对应任务
4. 以下开发任务已创建为 `open`
   - `shizuki-site-1qz` `AI Hub 路由与页面壳层重构`
   - `shizuki-site-kg1` `普通对话与酒馆模式双模式会话`
   - `shizuki-site-6z5` `世界书与角色卡管理`
   - `shizuki-site-zh6` `AI 小镇场景与公开漫游`
   - `shizuki-site-gyf` `RPGMaker 上传解析预览链路`
   - `shizuki-site-bdg` `自宅 companion v1`
   - `shizuki-site-a5a` `管理员专用记忆服务`
   - `shizuki-site-oie` `AI 权限配额与路由守卫整合`
   - `shizuki-site-2eq` `AI 一期回归与验收`
   - `shizuki-site-n5d` `Agent 系统占位 backlog`

当前 `bd ready --json` 已能直接返回 `shizuki-site-1qz`，说明一期开发链的起点已经打通。

---

## 2. AI 一期的 beads 结构

### 2.1 总任务

`shizuki-site-yd1`

它的职责不是实现某个功能，而是冻结这轮 AI 一期的总边界和总拆分。

### 2.2 文档任务

1. `shizuki-site-gfb`
   - 完成总方案主文档
2. `shizuki-site-37e`
   - 完成 beads 执行流程文档

### 2.3 开发任务树

1. `shizuki-site-1qz`
   - AI Hub 路由与页面壳层重构
2. `shizuki-site-kg1`
   - 普通对话与酒馆模式双模式会话
3. `shizuki-site-6z5`
   - 世界书与角色卡管理
4. `shizuki-site-zh6`
   - AI 小镇场景与公开漫游
5. `shizuki-site-gyf`
   - RPGMaker 上传解析预览链路
6. `shizuki-site-bdg`
   - 自宅 companion v1
7. `shizuki-site-a5a`
   - 管理员专用记忆服务
8. `shizuki-site-oie`
   - AI 权限配额与路由守卫整合
9. `shizuki-site-2eq`
   - AI 一期回归与验收
10. `shizuki-site-n5d`
   - Agent 系统占位 backlog

---

## 3. 完整的 beads 执行流程

下面这套流程是这次 AI 一期后续实际执行时应当遵守的标准流程。

### 3.1 Phase 0：恢复上下文

进入新会话后先执行：

```bash
bd prime
bd ready --json
```

目的：

1. 恢复 beads 工作流上下文。
2. 看当前最先可以做的 issue 是什么。

对 AI 一期来说，当前起点应优先看：

```bash
bd show shizuki-site-1qz
```

### 3.2 Phase 1：认领一个可做任务

先查看 issue：

```bash
bd show shizuki-site-1qz
```

确认无误后认领：

```bash
bd update shizuki-site-1qz --status in_progress
```

规则：

1. 一次优先只推进一个主 issue，避免状态混乱。
2. 如果做的是子任务，必须先确认它的依赖已经满足。
3. 如果 issue 还被阻塞，不要强行开始写代码。

### 3.3 Phase 2：实现前检查是否需要继续拆 beads

当 issue 过大时，先拆子任务再写代码。

例子：

如果 `shizuki-site-1qz` 太大，可以继续拆：

```bash
bd create --title="AI Hub 页面标签壳层" --description="..." --type=task --priority=2 --json
bd create --title="AI Hub 快聊说明与入口整合" --description="..." --type=task --priority=2 --json
bd dep add <新子任务> shizuki-site-1qz
```

建议规则：

1. 页面壳层、后端契约、权限守卫、回归测试可以继续拆。
2. 不要把 beads 拆成碎片化到一天都做不完的粒度。
3. 子任务命名必须一眼看出结果物，而不是空泛“优化一下”。

### 3.4 Phase 3：开发执行

认领后再开始改代码或改文档。

本阶段建议顺序：

1. `bd show <issue>`
2. 阅读对应方案文档章节
3. 写实现
4. 运行对应验证

AI 一期推荐按依赖顺序执行：

1. `shizuki-site-1qz`
2. `shizuki-site-kg1`
3. `shizuki-site-6z5`
4. `shizuki-site-zh6`
5. `shizuki-site-gyf`
6. `shizuki-site-bdg`
7. `shizuki-site-a5a`
8. `shizuki-site-oie`
9. `shizuki-site-2eq`

`shizuki-site-n5d` 是 backlog，不进一期主线。

### 3.5 Phase 4：实现中追加 follow-up beads

如果开发时发现当前 issue 无法在本轮做完，必须补 follow-up issue。

例子：

```bash
bd create --title="AI Hub 移动端交互细节回归" --description="..." --type=task --priority=2 --json
bd dep add <新issue> shizuki-site-1qz
```

适用场景：

1. 某块需求被证实过大。
2. 有明确后续项，但不属于本轮提交。
3. 验证阶段暴露出新问题。

### 3.6 Phase 5：验证与验收

每个 AI 开发任务结束前至少执行：

```bash
mvn -DskipTests compile
```

按任务内容补充：

1. AI 模块后端改动：
   - 跑 `modules/ai-module` 定向测试
2. 前端 `/ai-tavern` 改动：
   - 跑相关前端单测
   - 手工回归 `/ai-tavern`
   - 手工回归顶部 `AI Chat`
3. 权限改动：
   - 验证游客 / 登录用户 / ADMIN 三档行为
4. 记忆改动：
   - 验证 `scope_id` 不串线

如果验证失败：

1. 不要直接 close issue。
2. 先修复，或新建 follow-up beads。

### 3.7 Phase 6：关闭 issue

功能完成并验证通过后：

```bash
bd close shizuki-site-1qz --reason "AI Hub 路由与页面壳层完成并通过本地验证"
```

关闭标准：

1. 需求范围真的完成。
2. 必要验证已执行。
3. 遗留项已经另建 issue，而不是写在脑子里。

### 3.8 Phase 7：会话收尾

当前仓库要求收尾时必须做：

```bash
bd sync
git status
```

如果本轮有代码改动，还应执行：

```bash
git add <files>
git commit -m "feat|fix : 具体内容"
bd sync
git status
```

收尾目标：

1. beads 状态已同步。
2. 本轮完成项已关闭。
3. 未完成项已建好 follow-up beads。
4. 本地 commit 已完成。

---

## 4. AI 一期的推荐实操命令流

下面给出你后续实际推进 AI 一期时可以直接照抄的命令流。

### 4.1 从当前起点开始

```bash
bd prime
bd ready --json
bd show shizuki-site-1qz
bd update shizuki-site-1qz --status in_progress
```

### 4.2 完成 AI Hub 后推进下一项

```bash
bd close shizuki-site-1qz --reason "AI Hub 页面壳层完成"
bd ready --json
bd show shizuki-site-kg1
bd update shizuki-site-kg1 --status in_progress
```

### 4.3 遇到过大任务时拆分

```bash
bd create --title="AI 小镇地图预览组件" --description="负责房间地图预览与切换状态" --type=task --priority=2 --json
bd dep add <新issue> shizuki-site-zh6
bd update <新issue> --status in_progress
```

### 4.4 最终验收阶段

```bash
bd show shizuki-site-2eq
bd update shizuki-site-2eq --status in_progress
```

完成回归后：

```bash
bd close shizuki-site-2eq --reason "AI 一期回归完成"
```

---

## 5. 常用命令清单

### 5.1 查看

```bash
bd prime
bd ready --json
bd show <issue-id>
```

### 5.2 创建与认领

```bash
bd create --title="标题" --description="说明" --type=task --priority=2 --json
bd update <issue-id> --status in_progress
```

### 5.3 依赖管理

```bash
bd dep add <issue-id> <depends-on-id>
```

含义：

`<issue-id>` 依赖 `<depends-on-id>`。

### 5.4 完成与同步

```bash
bd close <issue-id> --reason "完成原因"
bd sync
```

---

## 6. 本仓库里的注意事项

1. `bd ready --json` 当前可正常使用。
2. 之前本地环境里 `bd list --status=open --json` 出现过崩溃，不建议把它当主工作流命令。
3. 本仓库要求提交身份固定为：
   - `user.name = Izumi`
   - `user.email = 29301481@qq.com`
4. commit 信息格式固定为：

```text
fix|feat : 具体内容（简要说明做了什么）
```

5. 收尾时不要忘记 `bd sync`。
6. 若只是写文档，也应先建 beads 再落文档。

---

## 7. 推荐你下一步怎么做

如果你准备开始真正开发 AI 一期，建议从这里开始：

1. `bd show shizuki-site-1qz`
2. `bd update shizuki-site-1qz --status in_progress`
3. 对照 [05_技术文档撰写](./05_技术文档撰写.md) 和 [06_技术文档评审](./06_技术文档评审.md) 开始实现 AI Hub

等 `shizuki-site-1qz` 做完，再继续推进 `shizuki-site-kg1`。
