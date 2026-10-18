# Shizuki 网站微信提醒插件

接收网站同组成员的公开文章和动态更新。机器人不读取微信群聊天，不自动加好友；用户先成为机器人的好友，再私聊绑定。

## 安装与配置

1. 使用 AstrBot 4.15 或更新的 4.x 版本，配置支持私聊主动发送的微信适配器。确认实际平台**实例 ID**，例如你在 AstrBot 中配置的实例名称；不是通用适配器类型。
2. 在此目录运行 `python build_plugin.py`，得到 `dist/astrbot_plugin_shizuki_notifications.zip`。从 AstrBot 插件管理上传 ZIP；也可将这些源码放进 `data/plugins/astrbot_plugin_shizuki_notifications/` 后重载。
3. 在插件配置中填写 `site_url`、`bridge_secret`、`platform_ids`。与网站环境变量保持一致，最后打开 `enabled`。不要在聊天中发送桥接密钥。
4. 站长提前添加用户微信；用户登录网站，在「个人中心 → 账号 → 微信提醒与订阅」生成指令，并**私聊**发送给机器人。绑定成功后回网站勾选分组和文章/动态，保存订阅。
5. 在测试账号间发布一篇公开文章，确认收到包含网站阅读链接的提醒。发布者与订阅者必须属于同一个有效网站分组。

网站端四个环境变量、部署顺序及 API 见仓库 `docs/development/wechat-notifications.md`。默认关闭；本插件源码和模拟测试已完成，真实微信适配器联调须在正式接入后进行。

## 私聊指令

| 指令 | 功能 |
| --- | --- |
| `/shizuki_bind <网站生成的码>` | 一次性确认绑定，有效十分钟 |
| `/shizuki_pause` | 暂停自己的提醒 |
| `/shizuki_resume` | 恢复自己的提醒 |
| `/shizuki_unbind` | 解绑自己并清空订阅 |

只接受允许的平台实例及 `platform:FriendMessage:sender` 会话。其他会话隔离格式会拒绝绑定，需要按实际适配器联调扩展，不能改成信任用户输入的微信号。建议该通知实例关闭 LLM 自动回复及消息长期记忆；插件会在处理指令时先终止后续处理。

## 运维与可靠性

- 机器人仅主动访问网站 HTTPS，无需暴露插件端口。默认十秒轮询，每次领取一条；网站限制每位用户至少间隔一分钟。
- SQLite 回执位于 AstrBot `data/plugin_data/astrbot_plugin_shizuki_notifications/delivered.sqlite3`。保留此文件，可避免网站确认请求丢失后重新发送；卸载/迁移时一并备份。
- 发送失败按网站队列退避，最多五次。平台接受请求不等于已送达或已阅读；平台侧必须真实报告发送错误。
- 发送成功到本地回执落盘之间若发生进程/系统崩溃，可能重复发送。不要用它承诺严格一次送达。
- 日志只记录通用故障，不打印用户微信身份、指令或密钥。多实例部署时，每个平台只运行一个此插件发送进程，避免跨实例缺少共享本地回执。
- 停止服务先关闭插件和网站开关，不删除队列表；迁移或更换平台实例需要重新绑定。

## 本地验证

```powershell
python -m unittest discover -s tests -v
python build_plugin.py
```

测试不登录微信，不发送真实消息。采用 AstrBot 官方的 [主动消息接口](https://github.com/AstrBotDevs/AstrBot/blob/master/docs/zh/dev/star/guides/send-message.md) 和 [4.15 插件数据目录接口](https://github.com/AstrBotDevs/AstrBot/blob/v4.15.0/astrbot/core/star/star_tools.py)。
