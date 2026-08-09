# 测试、质量门禁与交付

## 1. 按改动范围选择检查

| 改动 | 至少执行 | 说明 |
| --- | --- | --- |
| 仅文档/配置索引 | `git diff --check`、路径/链接检查、`openspec validate` | 确认不含敏感值；不因文档变更强行启动远端服务 |
| Java 公共库或后端模块 | `mvn -pl <module> -am test` | 同时覆盖受影响依赖模块 |
| 单体后端或跨模块行为 | `mvn clean install` | 必要时启动 `apps/monolith-app` 做健康/接口冒烟 |
| 前端逻辑/组件 | `pnpm --dir fronted/vue3-merged test:unit` | 可追加指定 spec 文件缩短反馈时间 |
| 前端构建/路由/依赖 | `pnpm --dir fronted/vue3-merged build` | 构建失败时检查 Vite、React/Vue 插件和手工拆包配置 |
| 数据库迁移 | 后端测试 + 迁移相关集成测试 | 不要直接对远端生产库试跑破坏性 SQL |

当前仓库已有 Java 单元/集成测试和大量前端 Vitest spec；优先补在相邻目录，沿用现有 JUnit 5/AssertJ 与 Vitest 风格。

## 2. 文档变更的本地检查

在仓库根目录运行：

```powershell
git diff --check
openspec validate add-agent-project-context --type change --strict --no-interactive
```

同时检查 `.agent/` 中的相对链接和代码路径。PowerShell 示例：

```powershell
Get-ChildItem .agent -Filter *.md | ForEach-Object {
  Select-String -LiteralPath $_.FullName -Pattern '\]\((\.\./|\./)[^)#]+' | ForEach-Object {
    $target = [regex]::Match($_.Line, '\]\((?<path>(\.\./|\./)[^)#]+)').Groups['path'].Value
    $resolved = Join-Path $_.Path.Substring(0, $_.Path.LastIndexOf('\')) $target
    if (-not (Test-Path -LiteralPath $resolved)) { "MISSING $($_.Path): $target" }
  }
}
```

链接检查脚本只适用于仓库内相对路径；外部 `D:\environment`、URL 和远端路径要单独确认，不要把它们误判为仓库文件。

## 3. 会话收尾

遵循根 [AGENTS.md](../AGENTS.md) 的项目协议：

1. 检查是否有未完成事项；必要时创建/更新 beads issue。
2. 运行适用的测试、Lint、构建和文档检查。
3. 更新任务状态并执行 `bd sync`；如果 `bd` 不可用，明确记录环境限制。
4. 查看 `git status` 和 `git diff`，确认没有无关文件、构建产物或秘密。
5. 在本地创建符合 `type: description` 格式的 commit；未经授权不要 `git push`。
6. 给下一位智能体留下完成项、未完成项、验证命令和已知阻塞。

## 4. 发布前额外门禁

只有用户明确要求发布时，才考虑 `build-push-deploy.bat`。它要求干净且已提交的工作树，会更新当前分支、运行前端测试和生产构建，经确认后推送并部署到 `111.228.35.186`。执行前必须确认：

- 当前分支和目标服务器正确；
- 变更已通过对应测试，且没有未提交的用户改动；
- 用户明确授权 Git push 和远端部署；
- `deploy/.env.server`、服务器 `data/` 等外部状态不被错误覆盖。

发布异常时先停止后续动作，保存脱敏日志，优先按 `deploy/README.md` 的手工检查和回滚说明处理。

## 5. 文档变更的回滚

本目录只影响文档和 OpenSpec 记录。若需要回滚，删除或恢复 `.agent/` 和本次 `openspec/changes/add-agent-project-context/` 变更即可；不要使用宽泛的 `git reset --hard` 覆盖用户已有工作。
