# Shizuki 桌面版

Shizuki 桌面版把现有 Vue 首页作为 Explorer 图标下方的可交互桌面层，并提供独立的全局控制球与可复用主应用窗口。Explorer、任务栏和安全桌面仍由 Windows 管理。应用数据继续使用个人站点网关 `http://111.228.35.186:8080`；安装后不需要 Node.js。

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
- `SHIZUKI_DESKTOP_ENVIRONMENT=0`：关闭桌面环境，回退到普通单窗口应用。
- `SHIZUKI_DESKTOP_SMOKE=1`：启用自动退出的桌面烟测模式，仅供测试脚本使用。

## 桌面环境行为

- 每个显示器创建一个 Home 桌面层，并尝试挂载到 Explorer 的 WorkerW。挂载失败时，主显示器回退为普通窗口，其他显示器的失败层会隐藏。
- Windows 桌面图标默认隐藏，但不会删除；托盘菜单可以重新显示。完整退出会恢复启动时记录的原始值。
- 普通模式只让标记为 `data-desktop-interactive` 的区域捕获输入，空白位置继续交给 Windows；编辑模式由整个桌面层接收输入。
- Menu 只在桌面 Home 显示为紧凑下拉框。路由统一进入一个可复用主窗口。
- 控制球是独立的全局窗口：收起态、一级轻控制、二级路由；无关应用全屏时自动隐藏。
- 关闭主窗口只会隐藏到托盘。必须选择“完全退出并恢复桌面”才会结束桌面进程。
- 开机启动为用户主动开启的每用户设置；登录启动会延迟 4 秒，且不会自动播放音乐。

本地状态位于 `%APPDATA%\Shizuki`：

- `desktop-state.json`：桌面偏好、交互模式、开机启动与窗口位置。
- `desktop-recovery.json`：原生修改恢复日志。每次修改先记录原值，再调用 Windows helper。
- `paired-clients.json`：配对设备、scrypt 凭据校验值、授权与有限审计记录；不保存可复用明文密钥。

如果上次退出不完整，启动时会先恢复未完成修改。恢复失败会进入安全模式并停止新的系统修改。可先执行 `pnpm desktop:diagnose` 只读检查 Explorer 层级，再从托盘完全退出；必要时手动重新显示 Windows 桌面图标后保留恢复日志用于排查。

## 桌面安全边界

- Vue renderer 开启 `contextIsolation` 与 sandbox，关闭 `nodeIntegration`。
- `app://shizuki` 只读取打包后的 `dist`，并拦截相对 `/api/` 请求转发到已配置网关。
- 外部 HTTP/HTTPS 链接由系统默认浏览器打开，不替换可信 renderer。
- 控制服务只绑定随机的 `127.0.0.1` 端口，每次启动生成新的 256-bit bootstrap bearer token。
- 控制 API 不支持 JavaScript、Shell、任意 URL、DOM selector 或文件系统命令。
- 持久客户端使用一次性下发的配对密钥；每个语义命令在分发前检查 capability grant。

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

token 仅在本次 Shizuki 进程内有效，正常退出时 manifest 会被删除。它用于协议 1.0 兼容和发起配对，不是持久设备身份。Meguri Pet 应在它的 Electron main process 或本地服务中读取 manifest；不要把 token 或配对 secret 发送到 renderer 日志、对话内容或远程服务。

### 端点

| 方法 | 路径 | 鉴权 | 用途 |
| --- | --- | --- | --- |
| `GET` | `/v1/health` | 否 | 存活状态与协议版本 |
| `GET` | `/v1/capabilities` | Bootstrap 或 Client | 当前身份获准的命令与 payload 合同 |
| `GET` | `/v1/state` | Bootstrap 或 `desktop.read` | 窗口、renderer、路由和播放器状态 |
| `POST` | `/v1/commands` | Bootstrap 或命令对应 grant | 执行带唯一 id 的语义命令 |
| `GET` | `/v1/events` | Bootstrap 或 `desktop.read` | SSE 状态/命令结果事件；支持 `Last-Event-ID` |
| `POST` | `/v1/pairing-requests` | Bootstrap | 创建待用户审批的配对请求 |
| `GET` | `/v1/pairing-requests/{id}` | Bootstrap | 查询状态，并且只领取一次批准后的凭据 |

### 首版命令

- `app.navigate`：payload 为 `{ "destination": "home|blog|music|apps|aiHub|profile|admin|author" }`。
- `window.show`、`window.hide`、`window.focus`、`window.minimize`、`window.toggleVisibility`。
- `music.play`、`music.pause`、`music.toggle`、`music.next`、`music.previous`。

命令所需 grant：

- `app.navigate` → `app.navigation`
- `window.*` → `window.control`
- `music.*` → `music.control`
- `/v1/state` 与 `/v1/events` → `desktop.read`

### Meguri 配对流程

1. 使用本次 manifest 的 Bearer token 调用 `POST /v1/pairing-requests`：

   ```json
   {
     "clientName": "Meguri Pet",
     "instanceId": "meguri:<stable-install-id>",
     "requestedCapabilities": ["app.navigation", "music.control", "desktop.read"]
   }
   ```

2. Shizuki 桌面弹出审批卡片。用户可以逐项取消能力，也可以拒绝请求。
3. Meguri 轮询 `/v1/pairing-requests/{requestId}`。批准后响应只会返回一次 `clientId`、`secret` 和完整 Authorization 值。
4. Meguri 将凭据保存在 main/core 层的系统安全存储中，后续使用：

   ```text
   Authorization: ShizukiClient <clientId>:<secret>
   ```

5. 凭据领取后再次查询不会返回 secret。Shizuki 内部可以撤销 client；撤销后请求立即返回 `401`。

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

1. 在 Meguri Pet main process 启动时读取 manifest；不存在时将 Shizuki capability 标为离线。已配对凭据与进程 token 分开保存。
2. 先请求 `/v1/health` 和 `/v1/capabilities`，只在 major protocol 为 `1` 时启用服务端实际公布的工具。
3. 把获批命令注册成明确工具，例如 `open_shizuki_music`、`pause_shizuki_music`，不要向模型暴露自由格式 command name。
4. 每个命令使用新的稳定 id；HTTP 返回值用于本次 tool result，SSE 用于后续状态同步。
5. 收到 `401` 时停止使用该 client 并提示重新配对；收到 `403 INSUFFICIENT_CAPABILITY` 时提示用户到 Shizuki 调整授权，不要自动升级权限。

建议后续在 `D:\program\meguri-pet` 单独建立 OpenSpec 变更，增加一个只运行在 main/core 层的 Shizuki `1.0` client adapter；本次变更不直接修改另一个仓库。

## 常见错误

- `401 UNAUTHORIZED`：重新读取 manifest，旧 token 会在 Shizuki 重启后失效。
- `403 INSUFFICIENT_CAPABILITY`：当前配对 client 未获所需 grant；命令未被分发，拒绝已写入审计。
- `503 RENDERER_UNAVAILABLE`：应用还在启动，等待 `state.changed` 事件或重试 `/v1/state`。
- `504 RENDERER_TIMEOUT`：renderer 在 5 秒内没有确认命令；客户端可以用新 id 重试一次。
- `422 UNSUPPORTED_COMMAND`：先重新读取 `/v1/capabilities`，不要猜测命令名。

## 第一阶段已知限制

- 仅验证当前设备的 Windows 11；Windows 10、macOS 与 Linux 尚未承诺兼容。
- WorkerW helper 目前是固定操作的 PowerShell/PInvoke 实现，后续可在不改变适配器合同的前提下替换为签名的编译 helper。
- 完整主题包、任务栏/光标/图标/声音/锁屏修改、统一多音源音乐服务、专注自动化与桌面布局编辑器尚未进入本阶段。
- 网站与 Capacitor 保持原行为；桌面 Home 目前仍复用现有首页渲染，后续会继续拆分共享播放器和后台服务所有权。
