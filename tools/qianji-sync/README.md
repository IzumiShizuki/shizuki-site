# 钱迹本地同步 Companion

这套脚本的 canonical home 现在是 [tools/qianji-sync](</D:/program/shizuki-site/tools/qianji-sync>)。

它负责三件事：

- 读取你本机导出的钱迹 `CSV / JSON`
- 把账单同步到 `111.228.35.186:8080` 的站点账本
- 在 Windows 登录后常驻监听，并支持凌晨补跑

## 目录说明

- 主入口: [qianji-local-sync.mjs](/D:/program/shizuki-site/tools/qianji-sync/qianji-local-sync.mjs)
- 核心库: [qianji-local-sync-lib.mjs](/D:/program/shizuki-site/tools/qianji-sync/qianji-local-sync-lib.mjs)
- Token 工具: [qianji-local-sync-token.mjs](/D:/program/shizuki-site/tools/qianji-sync/qianji-local-sync-token.mjs)
- 区间补录: [qianji-local-sync-range.mjs](/D:/program/shizuki-site/tools/qianji-sync/qianji-local-sync-range.mjs)
- TimePrism 注册器: [qianji-timeprism-task.mjs](/D:/program/shizuki-site/tools/qianji-sync/qianji-timeprism-task.mjs)
- 配置样例: [qianji-local-sync.config.example.jsonc](/D:/program/shizuki-site/tools/qianji-sync/qianji-local-sync.config.example.jsonc)
- 本地密钥: [qianji-local-sync.secret.bat](/D:/program/shizuki-site/tools/qianji-sync/qianji-local-sync.secret.bat)

## 推荐模式

推荐用 `accessToken + refreshToken` 常驻运行：

- `QIANJI_SYNC_ACCESS_TOKEN`
- `QIANJI_SYNC_REFRESH_TOKEN`

`QIANJI_SYNC_EMAIL` / `QIANJI_SYNC_PASSWORD` 只保留给首次签发 token 或紧急补发。

轮换后的 token 会持久化到：

- [qianji-local-sync.auth.json](/D:/program/shizuki-site/data/qianji-sync/qianji-local-sync.auth.json)

## 常用命令

```bash
cd D:\program\shizuki-site\tools\qianji-sync
node qianji-local-sync-token.mjs --config .\qianji-local-sync.config.jsonc --issue
node qianji-local-sync.mjs --config .\qianji-local-sync.config.jsonc --once
node qianji-local-sync.mjs --config .\qianji-local-sync.config.jsonc --watch
node qianji-local-sync-range.mjs --config .\qianji-local-sync.config.jsonc --from 2026-07-01 --to 2026-07-03
node qianji-timeprism-task.mjs --config .\qianji-local-sync.config.jsonc
```

## Windows 启动

- 常驻监听: [qianji-local-sync-watch.bat](/D:/program/shizuki-site/tools/qianji-sync/qianji-local-sync-watch.bat)
- 隐藏启动器: [qianji-local-sync-watch-hidden.ps1](/D:/program/shizuki-site/tools/qianji-sync/qianji-local-sync-watch-hidden.ps1)
- 单次同步: [qianji-local-sync-once.bat](/D:/program/shizuki-site/tools/qianji-sync/qianji-local-sync-once.bat)
- Token 签发/刷新: [qianji-local-sync-token.bat](/D:/program/shizuki-site/tools/qianji-sync/qianji-local-sync-token.bat)
- 安装登录后自启: [install-qianji-local-sync-startup-task.bat](/D:/program/shizuki-site/tools/qianji-sync/install-qianji-local-sync-startup-task.bat)
- 删除登录后自启: [remove-qianji-local-sync-startup-task.bat](/D:/program/shizuki-site/tools/qianji-sync/remove-qianji-local-sync-startup-task.bat)
- 安装凌晨 `02:00` 补跑: [install-qianji-local-sync-2am-task.bat](/D:/program/shizuki-site/tools/qianji-sync/install-qianji-local-sync-2am-task.bat)
- 删除凌晨 `02:00` 补跑: [remove-qianji-local-sync-2am-task.bat](/D:/program/shizuki-site/tools/qianji-sync/remove-qianji-local-sync-2am-task.bat)
- 注册 TimePrism 提醒: [register-qianji-timeprism-task.bat](/D:/program/shizuki-site/tools/qianji-sync/register-qianji-timeprism-task.bat)

## 兼容说明

[fronted/vue3-merged/scripts](/D:/program/shizuki-site/fronted/vue3-merged/scripts) 里的同名 `qianji` 脚本仍然保留，但现在只作为兼容入口，避免你已经装好的自启动和快捷方式失效。
