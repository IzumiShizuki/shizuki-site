# 钱迹本地自动同步

这个脚本用于把钱迹导出的 `CSV / JSON` 账单自动推送到 `Balance Ledger`。

## 为什么先做本地同步

钱迹官方文档公开支持的是：

- 导出账单
- Android URL Scheme / Tasker 自动记账写入
- Android / iOS 端本地自动记账

目前没有公开、稳定、官方支持的“读取你钱迹云端账单”的服务端 API。所以这一版默认走本地导出目录同步，风险更低，也更稳定。

## 钱迹导出里我们关心的字段

钱迹导入模板和导出文档里，和我们同步直接相关的字段包括：

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

这意味着钱迹本身是区分资金来源的。这个脚本会优先读取原始记录里的 `账户 / 账户1 / 资产账户 / 支付账户` 字段，并按账户分组推送，尽量保住“工资卡 / 微信零钱 / 支付宝余额”这类维度。

## 文件位置

- 脚本入口: [qianji-local-sync.mjs](/D:/program/shizuki-site/fronted/vue3-merged/scripts/qianji-local-sync.mjs)
- 配置样例: [qianji-local-sync.config.example.jsonc](/D:/program/shizuki-site/fronted/vue3-merged/scripts/qianji-local-sync.config.example.jsonc)
- 核心逻辑: [qianji-local-sync-lib.mjs](/D:/program/shizuki-site/fronted/vue3-merged/scripts/qianji-local-sync-lib.mjs)

## 运行方式

先复制一份配置：

```bash
cd D:\program\shizuki-site\fronted\vue3-merged
copy scripts\qianji-local-sync.config.example.jsonc scripts\qianji-local-sync.config.jsonc
```

然后把下面几项改成你自己的：

- `apiBaseUrl`
- `email` / `password` 或 `accessToken`
- `watchDir`
- `archiveDir`
- `accountMappings`

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

## 账户映射建议

推荐直接把钱迹里的资金账户映射到你站里的本地账户，例如：

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
- 这个脚本虽然会按钱迹账户分组分别入账，但来源状态卡片最终只会停在一个锚点账户上。
- Android 钱迹可导出 `CSV / JSON`；iOS / PC 主要是 `CSV`。
- 转账、还款、报销等记录目前仍按现有导入规则跳过，不会当普通收支直接入账。

## 推荐使用方式

最稳的方式是：

1. 在钱迹里定期导出 `CSV` 到固定目录。
2. 本地运行这个脚本 `--watch`。
3. 让脚本自动把新导出文件推送进站点。

如果你后面想再进一步，我可以继续帮你补：

- Windows 开机自启动
- 任务计划程序定时运行
- 自动把“最新导出文件”从指定目录归档
- 针对你自己的钱迹账户名做一份默认映射配置
