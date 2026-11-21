# Todo 看板本机补验

候选基线为 `e3b6e9fb`。2026-11-21 在 Windows 独立工作区完成以下检查。

| 范围 | 条件与观察 |
| --- | --- |
| PostgreSQL 升级 | PostgreSQL 16.6、Flyway 11.20.1。合成 V1106 基线包含旧 Todo 的测试数据。实际候选 V1106.1、V1106.2 首轮执行两条，重跑执行零条。旧提醒保留，三张新增表初始为空。 |
| 旧代码读写 | 升级后写入合成阶段事件和授权数据，再用止于 V1106 的旧迁移清单执行校验。归档的旧 mapper 字节码通过读取、插入、去重、乐观锁和归属检查。再次升级执行零条，事件、授权及提醒值保留。 |
| 回滚冲突 | 旧清单加入合成 V1107 后，Flyway 对 V1106.1、V1106.2 均报告已执行但无法解析。打包工具现会在输出 JAR 前检查基础 JAR 主应用目录中的 PostgreSQL 迁移版本，并拒绝这一冲突。 |
| 看板 | 真实 Vue 页面、SDK fixture、本机回环 HTTP 测试服务和两个合成账号跑通四阶段、人工审批、失败重试、跳过、断线恢复。跨账号读取被拒，使用有效的另一账号 MCP 令牌跨账号写入返回 404。页面还核对了手机新会话未关联笔记的提示。 |
| 写回与 trace | 看板验收逐条核对了运行器写回的字段、产物地址及合成凭据。阶段写回只含版本、请求 ID、固定摘要和状态或产物。独立 SDK 探针的 exporter 阳性对照记录到 2 项，四个 fixture 阶段共记录 0 次导出调用。运行器向子进程传递 starter 需要的 Windows 和网络配置字段。 |
| 既有功能 | Vue 测试 1,897 项、后端授权与 Todo 测试 30 项、MCP 测试 9 项通过。打包和迁移历史工具各 4 项通过。 |

### 真机范围

Docker Desktop 的 WSL 发行版处于停止状态，本次使用原生临时 PostgreSQL。所查本地 DJ 构建 JAR 的 SHA-256 为 `c573bfa6289a26cf5f1a3c3aae48c58c275a0c88218ea458643e6e67837d76d9`。其中 V1101–V1106 可见，内嵌的 content-service 缺少打包工具要求的旧 Todo mapper。目标旧镜像仍需在隔离运行时实际启动并访问升级后的临时库，才能通过镜像回滚验收。旧 mapper 的结果仅覆盖它实际执行的 SQL。

四个角色使用本机 Agents SDK 的离线模型。starter 的专用 Codex CLI 登录检查返回未登录。真实 Astra 四阶段待单独验收。

浏览器确认 `中文/第二 层/交付 #1.md` 的 URI 解码正确，复制的 Markdown 链接在测试浏览器打开了同一 Todo。Windows 注册的 Obsidian 和浏览器协议处理器均指向用户默认应用，缺少能隔离这两个处理器的桌面环境。原生 Obsidian 打开的测试文件数为 0，从真实笔记点击返回仍待验证。

### PowerShell 复现

在候选仓库根目录运行。准备 Java 17、Maven 缓存、Node 22 或以上、前端依赖、Playwright、Edge 和已安装 SDK 的本机 starter。数据库脚本还需要 PostgreSQL 16 的 Windows 二进制目录，以及单独归档、可核对摘要的旧 mapper。

```powershell
$python = Join-Path $HOME 'openai-agents-starter/.venv/Scripts/python.exe'
& $python -B -X utf8 tools/todo-dev-mcp/test/fixture_trace.py
node --test tools/todo-dev-mcp/test/*.test.mjs
python -B -m unittest discover -s tools/todo-release -p 'test_*.py'
python -B -m unittest discover -s tools/flyway-history -p 'test_*.py'
mvn.cmd -o -pl apps/monolith-app -am '-Dtest=AccountMcpToken*Test,TodoDevServiceTest,TodoDevControllerTest,AuthEntryFilterTest' '-Dsurefire.failIfNoSpecifiedTests=false' test
```

若依赖位于自定义本地 Maven 仓库，将 `"-Dmaven.repo.local=$env:QA_MAVEN_REPO"` 加到 Maven 参数中。运行过 AuthEntryFilterTest 后即可使用其 Surefire classpath。把下列路径环境变量设为本机实际文件或目录。数据库探针自行创建回环临时库、随机生成临时密码，并在结束时停库、清理。

```powershell
& ./tools/todo-dev-mcp/test/upgrade/run.ps1 -PostgresBin $env:QA_POSTGRES_BIN -OldMapperClass $env:QA_OLD_MAPPER -ExpectedOldMapperSha256 'ab2103d1703f1b7b5938456b24d9f512ecda68eb42ed576828bc939f345f99cd'
$env:QA_EVIDENCE = Join-Path $env:TEMP ('todo-board-' + [guid]::NewGuid())
# QA_BROWSER 指向 Edge 可执行文件，QA_PLAYWRIGHT 指向已安装的 playwright 包。
node ./tools/todo-dev-mcp/qa/board-acceptance.mjs
Get-ChildItem -LiteralPath $env:QA_EVIDENCE
npm.cmd --prefix ./fronted/vue3-merged run test:unit
```
