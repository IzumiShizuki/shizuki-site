# Remotion 下载与 MCP Router 集成说明

更新时间：2026-02-18

## 1. 已完成下载

- 仓库地址：`https://github.com/remotion-dev/remotion`
- 本地目录：`D:\github\remotion`
- 当前检出的提交：`e2bf54d`
- 下载方式：`git clone --depth 1 --filter=blob:none --sparse`

> 说明：这是轻量检出（主要用于集成和文档查阅），不是完整历史仓库。

## 2. Remotion MCP 基本信息

- 官方 MCP 包名：`@remotion/mcp`
- 当前 npm 最新版本：`4.0.424`
- 运行方式：`stdio` MCP Server（适合被 Router 或 MCP 客户端拉起）
- 官方工具名：`remotion-documentation`

在 `remotion` 源码中，MCP 实现在 `packages/mcp`，通过标准输入输出通信，并向 Remotion 文档服务发起查询。

## 3. 直接可用的 MCP 配置（官方格式）

如果你在某个客户端里是“直接接 MCP Server”，可以使用：

```json
{
  "mcpServers": {
    "remotion-documentation": {
      "command": "npx",
      "args": ["-y", "@remotion/mcp@latest"]
    }
  }
}
```

## 4. 集成到你的 MCP Router（推荐）

你的场景是让客户端只连 `mcp-router`，由 Router 统一管理 Remotion：

1. 在 MCP Router 中新增一个 `Local/stdio` MCP Server（名称可自定义，建议 `remotion-documentation`）。
2. Command 填：`npx`
3. Args 填：`-y @remotion/mcp@latest`
4. Env 可留空（Remotion 官方当前测试阶段无需鉴权）。
5. 在 Router 里启用该 Server。
6. 客户端（Codex/Claude）继续只连 `mcp-router`，不用再单独直连 Remotion。

你当前 `Codex` 侧的 Router 入口可以保持如下（已存在）：

```toml
[mcp_servers.mcp-router]
command = "cmd.exe"
args = ["/c", "set MCPR_TOKEN=<你的token>&& npx -y @mcp_router/cli@latest connect --host localhost --port 3282"]
```

## 5. 最小验证步骤

1. 重启 MCP 客户端会话（让配置生效）。
2. 在 AI 对话中明确要求调用 Remotion 工具，例如：
   - “请使用 `remotion-documentation`，告诉我 `Sequence` 的基本用法。”
3. 在 Router 日志里确认出现 `remotion-documentation` 调用记录。

本地启动自检命令（仅检查进程能拉起）：

```bash
timeout 8s npx -y @remotion/mcp@latest
```

若返回超时码（`124`）且没有报错，通常代表 MCP 进程已正常启动并在等待客户端握手。

## 6. 常见问题

- WSL 里直接 `npx @mcp_router/cli connect` 可能因网络路径/代理问题失败；使用 `cmd.exe` 走 Windows 侧命令通常更稳。
- 首次拉取 `@remotion/mcp` 可能较慢，属于正常 npm 下载行为。
- 如果 Router 里看不到工具，优先检查：
  - `MCPR_TOKEN` 是否正确；
  - Router 端口是否与 `connect --port` 一致；
  - 是否已重启客户端会话。

## 7. 参考来源

- Remotion 官方 MCP 文档：`https://www.remotion.dev/docs/ai/mcp`
- Remotion 仓库：`https://github.com/remotion-dev/remotion`
- Remotion MCP 包：`https://www.npmjs.com/package/@remotion/mcp`
- MCP Router CLI：`https://www.npmjs.com/package/@mcp_router/cli`
