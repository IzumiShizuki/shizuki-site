# 从 Todo 查看本机阶段运行

在 TimePrism 的待办列表中，打开自己任务旁的「研发详情」。新任务先归入项目，填写 GitHub 仓库名（如 `owner/repo`），再点「启用研发模式」。调研可以在启用时跳过。

看板顺序是调研、方案、开发、验收。每张卡显示阶段职责、状态、经过时间和已提交的产物。时间从服务端收到首个「运行中」事件开始计算，包含同阶段重试与等待时间；历史任务缺少开始事件时显示「—」。方案和验收提交后，需要任务所有者在网站确认。页面打开时每 15 秒刷新；恢复连接后会立即重读，也可以点击「刷新研发进度」。

## 关联 Obsidian

1. 在自己的 Obsidian 中复制笔记的打开链接。在 Todo 详情点「关联笔记」，粘贴带有 `vault` 和相对 `file` 的 `obsidian://open` 链接，点击「保存」。
2. 点击「打开本机笔记」进入 Obsidian。点击「复制返回 Todo 的 Markdown」，把复制的文本粘贴进笔记；以后可从笔记返回这个任务。打开返回链接时按网站登录账号检查权限。
3. 关联保存在当前浏览器、站点、账号和任务下。「替换关联」用于笔记移动或改名，「解除关联」只清除本机记录。换浏览器或设备时会提示重新关联。网站无法检查本机是否安装了 Obsidian，或笔记是否仍存在。

## 本机阶段执行

在包含本次开发改动的网站仓库根目录打开 PowerShell。需要 Node.js 22+，以及本机已有的 `openai-agents-starter`。账号 MCP 的站点和凭据沿用原 MCP 设置，见[现有安装说明](README.md)。下面用环境变量名检查配置，不显示其值。这些命令面向你明确选择的测试实例。

```powershell
$worker = '.\tools\todo-dev-mcp\src\stage-runner.mjs'
$py = Join-Path $HOME 'openai-agents-starter\.venv\Scripts\python.exe'
& $py -B -X utf8 .\tools\todo-dev-mcp\stage_worker.py check RESEARCH
if ($LASTEXITCODE -ne 0) { throw '请先按 starter 的 README 在专用 CLI 目录手动登录 ChatGPT。' }
if (-not ($env:SHIZUKI_TODO_ORIGIN -and $env:SHIZUKI_MCP_TOKEN)) { throw '请先配置目标测试站及该项目的账号 MCP 授权。' }
$id = Read-Host 'Todo 十进制 ID'
$stage = Read-Host '当前阶段 RESEARCH、DESIGN、IMPLEMENTATION 或 VERIFICATION'
node $worker run $id $stage
```

`run` 先从账号授权的 Todo 接口读当前阶段和版本，检查 starter 专用 CLI 的 ChatGPT 登录，登记开始事件，再在空临时目录调用只读的 `gpt-6.2-astra`。模型收到任务标题和合规的前序仓库产物引用，输出只显示在本机终端。开发角色给出修改建议，验收角色给出检查清单；实际改动及测试证据由操作者核对。网页没有启动本机进程的接口。

核对该阶段的实际成果后，再提交已有的 GitHub issue、PR 或 commit 链接。仓库须与该任务绑定的仓库一致。接口仅收到固定的阶段摘要、版本、请求标识与产物引用。

```powershell
$artifact = Read-Host '该仓库现有的 issue、PR 或 commit 成果链接'
node $worker submit $id $stage $artifact
```

回到网站查看新的当前阶段。如果出现「待确认」，先核对产物并在网站通过，再运行下一阶段。遇到中断时，先刷新详情。已运行中的阶段可在确认原进程结束后用 `node $worker resume $id $stage` 重新计算本机建议；失败的阶段使用 `run` 重试。已提交、已推进或待审批的阶段无需重复提交。

## 本机验收

### 客户端兼容与发布

执行失败使用现有的 `BLOCKED` 存储状态，并在 MCP 进度事件中附带固定的失败标记。新版看板显示「失败」，旧版可继续读取状态和审批历史。普通阻塞仍显示「阻塞」。站点与本机 worker 可以分别安装和发布；只有操作者在终端显式执行 `run` 或 `resume` 才会启动本机模型。

看板本次增加的计时查询直接使用既有事件表。从尚未安装 Todo/MCP 前置功能的主站分支集成时，还需核对 PostgreSQL 的 `V1106.1` 和 `V1106.2` 迁移及原 DJ 网关。共享站点后端必须遵循[现有窄范围后端组装说明](../todo-release/README.md)，核对运行镜像、JAR 及迁移账本后单独验收。

两名合成测试用户在隔离的 Edge 会话中使用真实 Vue 组件、路由和登录客户端。回环 HTTP 服务提供测试数据与身份，全流程从现有 Python SDK 离线角色产物，经本机执行器和 MCP HTTP 客户端写回，再由网页审批。验收覆盖四阶段、开发失败与重试、跳过调研、断线恢复、换号、中文笔记返回链接以及缺少本机关联。Java 的 Todo 服务、控制器与 MCP 授权另行运行测试，阶段计时查询在独立内存 PostgreSQL 上核对。查看[运行中的阶段](../../docs/todo-stage-board/board-running.png)及[跳过调研和未关联笔记](../../docs/todo-stage-board/board-skipped.png)。

本次运行时 starter 专用登录尚未完成，真实模型四阶段链路仍待专用账号验证。浏览器验收核对了 Obsidian 跳转地址和实际返回 Todo 的链接，未打开用户的笔记库。

## 本机验收记录

数据库升级、旧代码回退、账号隔离、SDK trace 计数及真机验收范围见[本机补验与复现步骤](qa/ACCEPTANCE.md)。
