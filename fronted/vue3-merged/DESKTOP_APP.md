# Shizuki 桌面版

Shizuki 桌面版把现有 Vue 前端打包进 Electron，应用数据仍使用个人站点网关 `http://111.228.35.186:8080`。安装后不需要 Node.js；前端资源在本机，网络内容与账号数据保持和网站一致。

## 本地构建

```powershell
cd D:\program\shizuki-site\fronted\vue3-merged
pnpm install
pnpm desktop:dev       # Vite + Electron 开发模式
pnpm desktop:smoke     # 控制协议与运行时烟雾测试
pnpm desktop:dir       # 生成 desktop-release\win-unpacked
pnpm desktop:build     # 生成 Windows NSIS 安装程序
```

安装包为 `desktop-release\Shizuki-Setup-0.1.0.exe`。这是未签名的本地构建，Windows 可能显示信誉提示；公开分发前应配置代码签名证书。

可用环境变量：

- `SHIZUKI_GATEWAY_ORIGIN`：覆盖远端网关，默认 `http://111.228.35.186:8080`。
- `SHIZUKI_DESKTOP_DEV_URL`：让 Electron 加载指定开发服务器，仅供开发脚本使用。
- `SHIZUKI_USER_DATA_DIR`：覆盖用户数据目录，主要供隔离测试使用。

## 桌面安全边界

- Vue renderer 开启 `contextIsolation` 与 sandbox，关闭 `nodeIntegration`。
- `app://shizuki` 只读取打包后的 `dist`，并拦截相对 `/api/` 请求转发到已配置网关。
- 外部 HTTP/HTTPS 链接由系统默认浏览器打开，不替换可信 renderer。
- 控制服务只绑定随机的 `127.0.0.1` 端口，每次启动生成新的 256-bit bearer token。
- 控制 API 不支持 JavaScript、Shell、任意 URL、DOM selector 或文件系统命令。

## Meguri Pet 控制接口

协议版本为 `1.0`。桌面程序启动后会生成：

```text
%APPDATA%\Shizuki\control-api.json
```

manifest 结构：

```json
{
  "protocolVersion": "1.0",
  "endpoint": "http://127.0.0.1:49152",
  "pid": 12345,
  "token": "<process-lifetime bearer token>",
  "createdAt": "2026-08-20T00:00:00.000Z"
}
```

token 仅在本次 Shizuki 进程内有效，正常退出时 manifest 会被删除。Meguri Pet 应在它的 Electron main process 或本地服务中读取 manifest；不要把 token 发送到 renderer 日志、对话内容或远程服务。

### 端点

| 方法 | 路径 | 鉴权 | 用途 |
| --- | --- | --- | --- |
| `GET` | `/v1/health` | 否 | 存活状态与协议版本 |
| `GET` | `/v1/capabilities` | Bearer | 支持的命令与 payload 合同 |
| `GET` | `/v1/state` | Bearer | 窗口、renderer、路由和播放器状态 |
| `POST` | `/v1/commands` | Bearer | 执行带唯一 id 的语义命令 |
| `GET` | `/v1/events` | Bearer | SSE 状态/命令结果事件；支持 `Last-Event-ID` |

### 首版命令

- `app.navigate`：payload 为 `{ "destination": "home|blog|music|apps|aiHub|profile|admin|author" }`。
- `window.show`、`window.hide`、`window.focus`、`window.minimize`、`window.toggleVisibility`。
- `music.play`、`music.pause`、`music.toggle`、`music.next`、`music.previous`。

### PowerShell 调用示例

```powershell
$manifest = Get-Content "$env:APPDATA\Shizuki\control-api.json" -Raw | ConvertFrom-Json
$headers = @{ Authorization = "Bearer $($manifest.token)" }

Invoke-RestMethod "$($manifest.endpoint)/v1/state" -Headers $headers

$body = @{
  id = "meguri-$(New-Guid)"
  command = "app.navigate"
  payload = @{ destination = "aiHub" }
} | ConvertTo-Json

Invoke-RestMethod "$($manifest.endpoint)/v1/commands" `
  -Method Post `
  -Headers $headers `
  -ContentType "application/json" `
  -Body $body
```

### Meguri Pet 接入建议

1. 在 Meguri Pet main process 启动时读取 manifest；不存在时将 Shizuki capability 标为离线。
2. 先请求 `/v1/health` 和 `/v1/capabilities`，只在 major protocol 为 `1` 时启用工具。
3. 把允许的命令注册成明确工具，例如 `open_shizuki_music`、`pause_shizuki_music`，不要向模型暴露自由格式 command name。
4. 每个命令使用新的稳定 id；HTTP 返回值用于本次 tool result，SSE 用于后续状态同步。
5. 收到 `401`、连接失败或 PID 变化时重新读取 manifest，不缓存旧 token。

建议后续在 `D:\program\meguri-pet` 单独建立 OpenSpec 变更，增加一个只运行在 main/core 层的 Shizuki `1.0` client adapter；本次变更不直接修改另一个仓库。

## 常见错误

- `401 UNAUTHORIZED`：重新读取 manifest，旧 token 会在 Shizuki 重启后失效。
- `503 RENDERER_UNAVAILABLE`：应用还在启动，等待 `state.changed` 事件或重试 `/v1/state`。
- `504 RENDERER_TIMEOUT`：renderer 在 5 秒内没有确认命令；客户端可以用新 id 重试一次。
- `422 UNSUPPORTED_COMMAND`：先重新读取 `/v1/capabilities`，不要猜测命令名。
