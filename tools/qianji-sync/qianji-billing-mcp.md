# Shizuki Billing MCP

`qianji-billing-mcp.mjs` is a local stdio-only MCP server. It reuses the local
Qianji sync configuration for authenticated read access, but it never returns
access tokens, refresh tokens, passwords, or configuration values.

Start it from an MCP client with:

```text
command: D:\environment\nodejs\runtime\node-v24.17.0-win-x64\node.exe
args: ["D:\program\shizuki-site\tools\qianji-sync\qianji-billing-mcp.mjs", "--config", "D:\program\shizuki-site\tools\qianji-sync\qianji-local-sync.config.jsonc"]
```

Available tools:

- `shizuki_billing_analytics`: required `from_datetime` and `to_datetime`, with optional time zone, currency, channel, and account filters.
- `shizuki_billing_transactions`: required time range, optional `income`/`expense` direction, channel, account, and capped `limit` (maximum 100). Notes and raw payloads are omitted by default and require explicit flags.

Every query must span at most 32 days. The server has no HTTP listener, is
read-only, and should only be registered for the local user who owns the
Qianji configuration.
