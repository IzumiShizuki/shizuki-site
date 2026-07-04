# 钱迹本地自动同步

这个方案用于把钱迹导出的 `CSV / JSON` 账单自动推送到 `Balance Ledger`，并补上 Windows 常驻监听、每天 `02:00` 自动触发，以及 TimePrism 周期任务提醒。

## 为什么先做本地同步

钱迹官方公开支持的能力主要是：

- 导出账单
- Android URL Scheme / Tasker 自动记账写入
- Android / iOS 端本地自动记账

目前没有公开、稳定、官方支持的“读取你钱迹云端账单”的服务端 API，所以这一版默认走本地导出目录同步，风险更低，也更稳定。

## 钱迹导出里我们关心的字段

和这次同步最相关的字段包括：

- `时间`
- `分类`
- `二级分类`
- `类型`
- `金额`
- `账户1`
- `账户2`
- `备注`
- `标签`
- `手续费`
- `优惠券`

这意味着钱迹本身是区分资金来源的。脚本会优先读取原始记录里的 `账户 / 账户1 / 资产账户 / 支付账户` 字段，并按账户分组推送，尽量保住“工资卡 / 微信零钱 / 支付宝余额”这类维度。

## 文件位置

- 脚本入口: [qianji-local-sync.mjs](/D:/program/shizuki-site/fronted/vue3-merged/scripts/qianji-local-sync.mjs)
- 脚本核心: [qianji-local-sync-lib.mjs](/D:/program/shizuki-site/fronted/vue3-merged/scripts/qianji-local-sync-lib.mjs)
- 配置样例: [qianji-local-sync.config.example.jsonc](/D:/program/shizuki-site/fronted/vue3-merged/scripts/qianji-local-sync.config.example.jsonc)
- TimePrism 周期任务注册器: [qianji-timeprism-task.mjs](/D:/program/shizuki-site/fronted/vue3-merged/scripts/qianji-timeprism-task.mjs)

Windows 启动脚本：

- 常驻监听: [qianji-local-sync-watch.bat](/D:/program/shizuki-site/fronted/vue3-merged/scripts/qianji-local-sync-watch.bat)
- 单次同步: [qianji-local-sync-once.bat](/D:/program/shizuki-site/fronted/vue3-merged/scripts/qianji-local-sync-once.bat)
- 安装 `02:00` 计划任务: [install-qianji-local-sync-2am-task.bat](/D:/program/shizuki-site/fronted/vue3-merged/scripts/install-qianji-local-sync-2am-task.bat)
- 删除 `02:00` 计划任务: [remove-qianji-local-sync-2am-task.bat](/D:/program/shizuki-site/fronted/vue3-merged/scripts/remove-qianji-local-sync-2am-task.bat)
- 注册 TimePrism 周期任务: [register-qianji-timeprism-task.bat](/D:/program/shizuki-site/fronted/vue3-merged/scripts/register-qianji-timeprism-task.bat)

## 第一步：准备配置

先复制一份配置：

```bash
cd D:\program\shizuki-site\fronted\vue3-merged
copy scripts\qianji-local-sync.config.example.jsonc scripts\qianji-local-sync.config.jsonc
```

然后至少改这几项：

- `apiBaseUrl`
- `email` / `password` 或 `accessToken`
- `watchDir`
- `archiveDir`
- `accountMappings`

## CLI 运行方式

单次同步：

```bash
cd D:\program\shizuki-site\fronted\vue3-merged
node scripts/qianji-local-sync.mjs --config .\scripts\qianji-local-sync.config.jsonc --once
```

持续监听目录：

```bash
cd D:\program\shizuki-site\fronted\vue3-merged
node scripts/qianji-local-sync.mjs --config .\scripts\qianji-local-sync.config.jsonc --watch
```

只看解析和账户映射，不真的入账：

```bash
cd D:\program\shizuki-site\fronted\vue3-merged
node scripts/qianji-local-sync.mjs --config .\scripts\qianji-local-sync.config.jsonc --once --dry-run
```

注册 TimePrism 周期任务：

```bash
cd D:\program\shizuki-site\fronted\vue3-merged
node scripts/qianji-timeprism-task.mjs --config .\scripts\qianji-local-sync.config.jsonc
```

## BAT 用法

如果你更习惯双击：

1. `qianji-local-sync-watch.bat`
用途：常驻监听导出目录，适合你白天开着电脑时自动同步。

2. `qianji-local-sync-once.bat`
用途：执行一次同步，适合计划任务或手动补跑。

3. `install-qianji-local-sync-2am-task.bat`
用途：自动在 Windows 任务计划程序里注册一个每天 `02:00` 的任务。

4. `register-qianji-timeprism-task.bat`
用途：往 TimePrism 看板里注册一个“钱迹凌晨同步检查”的周期任务，方便你在应用里看到这件事。

## 计划任务和 TimePrism 的区别

这两层不是一回事：

- Windows 计划任务：真的会在每天 `02:00` 执行同步脚本。
- TimePrism 周期任务：只是你在应用里的可视化任务提醒和记录，不负责后台运行脚本。

推荐同时开：

- 系统层保证自动执行
- TimePrism 层保证你在界面里看得到这件事

## 账户映射建议

推荐把钱迹里的资金账户映射到站里的本地账户，例如：

- `招商银行卡` -> `工资卡`
- `微信零钱` -> `微信零钱`
- `支付宝余额` -> `支付宝余额`

如果脚本找不到对应本地账户，会自动创建。

默认渠道推断规则：

- 名称包含 `支付宝` / `余额宝` -> `alipay`
- 名称包含 `微信` -> `wechat`
- 名称包含 `银行` / `储蓄卡` / `工资卡` -> `bank_card`
- 名称包含 `花呗` / `信用卡` / `白条` -> `credit_card`
- 名称包含 `现金` -> `cash`
- 其余 -> `qianji`

## 当前限制

- 后端当前的 `qianji` 来源状态仍然只有一个“当前目标账户”展示位。
- 脚本虽然会按钱迹账户分组分别入账，但来源状态卡片最终只会停在一个锚点账户上。
- Android 钱迹可导出 `CSV / JSON`；iOS / PC 主要是 `CSV`。
- 转账、还款、报销等记录目前仍按现有导入规则跳过，不会当普通收支直接入账。
- TimePrism 周期任务不会替代 Windows 计划任务，它只是提醒与留痕。

## 推荐搭配

最稳的用法是：

1. 钱迹导出到固定目录。
2. 平时开 `qianji-local-sync-watch.bat` 持续监听。
3. 再运行一次 `install-qianji-local-sync-2am-task.bat`，保证每天凌晨 `02:00` 补跑一次。
4. 最后运行 `register-qianji-timeprism-task.bat`，把这件事记进 TimePrism。
