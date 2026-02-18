# Beads 集成与使用说明（含 MCP Router）

更新时间：2026-02-18

## 1. 已完成下载

- 仓库：`https://github.com/steveyegge/beads`
- 本地目录：`D:\github\beads`
- 当前提交：`8748be3`

## 2. 版本信息（当前查询）

- `@beads/bd`（npm）：`0.52.0`
- `beads-mcp`（PyPI）：`0.52.0`

## 3. 集成思路（先看这个）

Beads 官方建议：
- 对于 **Claude Code / Cursor / Windsurf** 这类有 shell 权限的环境，优先用 `bd` CLI（更省 token）。
- 对于必须走 MCP 的环境，再用 `beads-mcp`。

你当前是 “客户端 -> mcp-router -> 各 MCP server”，所以可以按下面两层来配：

1. 在项目里使用 `bd` 管任务（本地数据库与 issue graph）
2. 在 MCP Router 里增加一个 `beads-mcp` server，让模型可通过 MCP 调用 beads 工具

## 4. 安装步骤

### 4.1 安装 bd CLI

任选一种方式：

```bash
# npm（最简单）
npm install -g @beads/bd@latest

# 或 Go
go install github.com/steveyegge/beads/cmd/bd@latest
```

验证：

```bash
bd version
```

### 4.2 在你的项目初始化 beads

在项目根目录执行：

```bash
bd init
```

执行后会创建 `.beads/` 并初始化数据库（当前版本默认 `Dolt` 后端）。

## 5. 在 MCP Router 里接入 beads-mcp

### 5.1 安装 beads-mcp

推荐（uv）：

```bash
uv tool install beads-mcp
```

或：

```bash
pip install beads-mcp
```

### 5.2 在 Router 新增一个 stdio MCP Server

Server 名称建议：`beads`

命令建议：

- 如果已安装可执行：`beads-mcp`
- 如果要用 uv 直接启动：`uvx beads-mcp`

可选环境变量（常用）：

- `BEADS_WORKING_DIR`: 你的项目目录（建议设置，避免跑错仓库）
- `BEADS_PATH`: `bd` 可执行路径（如果 PATH 里找不到 `bd` 时设置）
- `BEADS_USE_DAEMON`: 默认 `1`，一般不用改

## 6. 使用方式（最小可用）

初始化后，你可以让 AI 直接调用 beads 的 MCP 工具做任务管理，例如：

1. `init`：初始化（一般你手动 `bd init` 后可不再用）
2. `create`：创建任务
3. `list`：列任务
4. `ready`：查可开始任务（无 blocker）
5. `update` / `close`：更新状态与关闭任务
6. `dep`：维护依赖关系
7. `stats`：看项目统计

如果你不走 MCP，也可以直接在终端用 CLI：

```bash
bd create "接入 beads 到 mcp-router" -p 1 -t task
bd list
bd ready
bd update <issue-id> --claim
bd close <issue-id> --reason "done"
```

## 7. 推荐实践（你这个场景）

1. 日常开发主要用 `bd` CLI（快、便宜、稳定）
2. 需要让 AI 自动读写任务图时，启用 `beads-mcp`
3. 在 Router 里只保留一个 `beads` server，避免多实例串库
4. 为 `beads-mcp` 固定 `BEADS_WORKING_DIR` 到当前项目目录，降低误操作概率

## 8. 排错要点

- `beads-mcp` 启动失败：先确认 `bd version` 正常
- 找不到项目数据库：检查是否已在项目执行过 `bd init`
- MCP 调用了错误仓库：设置 `BEADS_WORKING_DIR`
- 工具列表不显示：重启 MCP 客户端会话
- Windows 上如果 `bd init` 报错 `dolt: this binary was built without CGO support`：

```bash
# 在 beads 源码目录重编译（使用 CGO + pure-go regex + internal linkmode）
set CGO_ENABLED=1
go build -tags=gms_pure_go -ldflags=-linkmode=internal -o C:\Users\29301\.local\bin\bd.exe ./cmd/bd
```

说明：
- `gms_pure_go` 用于绕过 ICU 头文件依赖；
- `-linkmode=internal` 可避免外部 gcc 链接产物在部分 Windows 环境下不可执行的问题。

## 9. 参考

- `D:\github\beads\README.md`
- `D:\github\beads\docs\QUICKSTART.md`
- `D:\github\beads\integrations\beads-mcp\README.md`
- `https://www.npmjs.com/package/@beads/bd`
- `https://pypi.org/project/beads-mcp/`
