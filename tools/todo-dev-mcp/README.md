# Shizuki Todo 研发 MCP

Codex 在本机启动此 stdio 适配器；适配器只访问 Shizuki Site 的
`/api/v1/light-apps/todos/dev`，不监听端口、不读取 Todo 数据库、不启动 Agent。
网站始终是任务进度的来源。生产地址必须使用 HTTPS；HTTP 仅允许回环地址用于本地测试，不跟随重定向。

## 安装与连接

1. 在此目录使用 Node.js 22+，运行 `npm ci --ignore-scripts`。
2. 确认目标站已运行本功能，在网站给一个自有项目里的 Todo 开启「研发模式」并绑定 GitHub 仓库。
3. 由站点维护者将单独生成的随机凭据绑定到这一个人项目。后端配置
   `SHIZUKI_TODO_DEV_OWNER_ID`、`SHIZUKI_TODO_DEV_PROJECT_ID` 及
   `SHIZUKI_TODO_DEV_TOKEN_SHA256`（64 位十六进制的 SHA-256 摘要），不需要明文；
   客户端使用原始凭据（32–256 个字母、数字、`_`、`-`），而不是摘要。
   不复用网站登录 Token。未配置时服务器拒绝 MCP 凭据。
4. 在启动 Codex 的环境中，通过本机秘密管理器注入 `SHIZUKI_TODO_TOKEN`。
   在自己的 Codex 配置（通常为 `~/.codex/config.toml`）加入下例。
   替换 checkout 路径与站点 origin；必要时将 `node` 替换为其绝对路径。
   不把明文填到 TOML、命令参数、日志或 Git。

```toml
[mcp_servers.shizuki_todo]
command = "node"
args = ["/absolute/path/to/shizuki-site/tools/todo-dev-mcp/src/server.mjs"]
env_vars = ["SHIZUKI_TODO_TOKEN"]

[mcp_servers.shizuki_todo.env]
SHIZUKI_TODO_ORIGIN = "https://your-site.example"
```

Windows 的 TOML 字符串可以使用单引号包裹带反斜线的绝对路径。
在 Shizuki Site 仓库启动 Codex 时会使用仓库内的 `.agents/skills/todo-dev`；
在其他开发仓库也要使用时，将此 Skill 复制到对应仓库的 `.agents/skills` 或自己的
`$HOME/.agents/skills`，不要复制令牌。重启 Codex 后，在目标 checkout 试运行
「用 `$todo-dev` 查找编号为 123 的任务，只读，不改代码」。

## 工具

| 工具 | 用途 |
|---|---|
| `todo_search` | 搜索凭据项目内已启用研发模式的任务，可传 `q` 或 `project_id` |
| `todo_get_context` | 读取当前阶段、审批状态、版本、仓库、Skill 提示与进展 |
| `todo_report_progress` | 追加摘要、下一步、卡点或成果，不推进阶段 |
| `todo_submit_stage` | 提交当前阶段所需成果，等待网站批准或按服务器规则推进 |

项目和任务 ID 始终用字符串。写入使用最近读到的 `expected_version` 和本次操作的
`request_id`（UUID）；不确定是否写入时先读回，再仅用同一 ID 和相同载荷重试。
409 冲突应重读并核对状态，不应盲目改版本重放。阶段所需成果种类以返回的
`required_artifact` 为准。链接只是记录，不由适配器打开；不要提交带签名、
Token、公司内网信息的 URL。此 MCP 不允许启用、审批、删除或勾销日常待办，
也不具备代码推送或部署权限。

## 验证

`npm test` 使用独立的回环假 API 验证真实 stdio 握手、四个工具、跨会话回读、
输入验证、凭据错误、冲突和重定向等行为。它不访问生产站点，也不替代 Java 后端、
网站界面和真实 Codex 项目的端到端验收。

### 试点验收
- 在隔离环境建立一个个人开发项目和普通 Todo。开启研发模式、绑定该任务的真实 GitHub 仓库，保留原提醒做回归对照。
- 从该仓库启动 Codex 会话 A，运行 `$todo-dev`，写回一条只有测试内容的进展。退出后从同一仓库开始会话 B，用任务名称找到同一编号，核对进展、阶段和下一步。
- 提交方案成果，确认网站显示「待确认」；此时 Agent 既不能替人确认，也不能提交下一阶段。网站确认后再读回，预期进入「代码编写」。
- 用另一个项目的测试任务验证 scoped token 不可见、旧版本写入不可覆盖、同请求重复提交不再追加，并核对日常 Todo 的提醒、完成勾选未被研发流程动过。
