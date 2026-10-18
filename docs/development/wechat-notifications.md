# 微信同组更新提醒（AstrBot）

## 已实现的范围

用户在「个人中心 → 账号 → 微信提醒与订阅」绑定真实私聊身份，明确选择网站分组与文章/动态类型，接收其他同组成员的新公开内容。默认无订阅，不补发绑定前历史内容。微信好友由站长提前添加；不读取、转发微信群聊天。

代码默认关闭，未部署、未连接真实微信。站内分组使用现有用户分组，例如 FRIEND、自定义组；不增加独立聊天群模型。GUEST 不能订阅。动态目前仍沿用已有管理员发布权限，这次只增加创建者归属与提醒链路。

## 启用顺序

1. 先在隔离环境验证数据库迁移和下述闭环。生产部署需另行执行，不能把测试连接指向远程真实库。
2. 部署后端及前端，Flyway 自动应用 PostgreSQL `V1018__wechat_group_notifications.sql`。MySQL 对应 `V436`。均为新增表与可空动态作者字段，不回填旧动态归属。旧动态不触发同组提醒。
3. 设置网站环境变量：

   | 变量 | 默认 | 配置 |
   | --- | --- | --- |
   | `WECHAT_NOTIFICATIONS_ENABLED` | `false` | 准备完毕后设 `true` |
   | `WECHAT_NOTIFICATIONS_BRIDGE_SECRET` | 空 | 至少 32 字符的独立高熵随机密钥，建议 32 随机字节的十六进制串 |
   | `WECHAT_NOTIFICATIONS_PLATFORM_IDS` | 空 | AstrBot 微信平台**实例 ID**，多个用英文逗号分隔 |
   | `WECHAT_NOTIFICATIONS_SITE_ORIGIN` | `https://site.shizuki.online` | 网站 HTTPS 根地址，不能带路径、用户信息、查询参数 |

   配置映射为 `shizuki.notifications.wechat.*`。密钥放现有私密配置或环境，不进 Git，不与用户 JWT 混用。修改后重启后端。未启用、密钥太短、平台为空或 origin 无效时均不可调用桥接接口。

4. 使用本地插件源码：`tools/astrbot-notifications`。在该目录执行 `python build_plugin.py`，上传生成的 `dist/astrbot_plugin_shizuki_notifications.zip` 到 AstrBot，或复制源码到插件目录。安装说明见该目录 README。
5. AstrBot 配置相同的 `site_url`、`bridge_secret` 与 `platform_ids`，再打开插件 `enabled`。需要支持私聊主动发送的微信适配器，不能据“已添加微信好友”推断适配器已经连接成功。插件仅需出站 HTTPS，无入站监听端口。
6. 测试账号 A、B 加入同一个有效网站分组。B 私聊发送网站生成的绑定指令，在网站选择该分组的文章/动态并保存。A 发布公开文章，B 应收到阅读链接；发布自己的文章不提醒。
7. 再验证暂停、免打扰、退组、撤回内容、解绑和重启插件。验证完成后再开放给其他用户。

## 绑定与撤销

- 登录后生成 128-bit 随机码，数据库仅存 SHA-256；有效十分钟，每三十秒允许重新生成。新码替换旧码，不放 URL 或浏览器存储。接口响应 `Cache-Control: no-store`。
- 实际私聊事件提供平台 ID、发送者 ID、完整 UMO：`platform:FriendMessage:sender`。只接受网站和插件都允许的平台，拒绝群聊、手填目标或跨平台目标。
- 一个平台/发送者只能归属一个网站账号；重新绑定需要新身份实际确认。换绑会取消旧目标的未发送任务；解绑会清空订阅、绑定码和联系地址。确认前旧绑定保持有效。
- 私聊 `/shizuki_pause`、`/shizuki_resume`、`/shizuki_unbind` 只操作发送者自己。
- 当前插件严格要求私聊 session ID 等于 sender ID。若实际微信适配器采用不同会话隔离格式，需在联调时明确映射后扩展双方校验，不能直接放开到任意 UMO。
- 桥接密钥是受信任机器人凭据，能够确认绑定并领取投递目标，只有站长保存。轮换网站与插件密钥即可撤销旧机器人权限。

## 投递与可见性

发布事务提交前写入持久队列，事务回滚不留下通知。按“类型 + 内容 ID + 接收用户”去重。原作者、收件人必须仍有同一个当前有效且已订阅的网站分组。初版仅允许匿名可读的 PUBLIC、PUBLISHED 内容；私密、仅链接、草稿、回收及删除内容均不会授权。分组权限受限、匿名不能读取的文章也不会推送。

队列不保存正文和联系地址。插件每次领取一条租约（两分钟），发送前再授权，网站实时检查绑定版本、双方组关系、订阅、暂停与免打扰、文章/动态作者与公开可读性。授权返回短标题、摘要和 `/read/posts/{id}` 或 `/read/moments/{publicId}` 链接。用户解绑或撤回后不再授权；已经交给微信平台的发送请求无法撤回。

每位用户成功提交后至少间隔六十秒，插件轮询至少五秒。免打扰采用北京时间整点范围，支持跨夜；延后到时段外再发。全局暂停时不为新内容入队，既有待发送任务保留等待恢复。更改订阅后会按最新订阅取消不再匹配的任务。

发送失败按 30、60、120、240 秒退避，最多五次；过期租约可重领。平台返回 False 或抛异常不算成功。SQLite 保存已提交的消息 ID，网站确认请求丢失后重试确认而不重复发送。发送完成但 SQLite 尚未落盘时崩溃仍可能重复；这是有界重试与尽力去重，不保证严格一次或终端送达/已读。每个平台运行单个插件实例，持久化并备份插件数据目录。

网站只显示最近三十天的二十条记录，SENT 文案为“已提交微信平台”。轮询清理过期绑定码和三十天前终态记录中的租约秘密、错误码；保留最小内容/用户/状态回执用于去重，不保存文章正文。绑定原始联系信息只在绑定表中，网站仅返回尾号遮罩。

## API 约定

JSON 遵循项目现有 snake_case，响应使用 `ApiResponse.data`；错误使用现有 ProblemDetail。用户接口从登录上下文取 user_id，不接受请求指定他人账号。

| 方法与路径 | 身份 | 请求/用途 |
| --- | --- | --- |
| GET `/api/v1/me/wechat-notifications` | 网站用户 | available、bound、masked_identity、当前组/订阅、历史 |
| POST `/api/v1/me/wechat-notifications/binding-code` | 网站用户 | 返回 command、expires_at；码仅此时返回 |
| DELETE `/api/v1/me/wechat-notifications/binding` | 网站用户 | 解绑并清空订阅 |
| PUT `/api/v1/me/wechat-notifications/preferences` | 网站用户 | paused、quiet_start/end、subscriptions:[{group_code,kind}] |
| POST `/api/v1/integrations/astrbot/bindings/confirm` | 桥接密钥 | code、sender:{platform_id,sender_id,origin} |
| POST `/api/v1/integrations/astrbot/controls` | 桥接密钥 | action: PAUSE/RESUME/UNBIND、sender |
| POST `/api/v1/integrations/astrbot/deliveries/lease` | 桥接密钥 | platform_ids；返回 [{id,token}] 或 [] |
| POST `/api/v1/integrations/astrbot/deliveries/{id}/authorize` | 桥接密钥 | token；返回 {send,origin,text}；send=false 不发送 |
| POST `/api/v1/integrations/astrbot/deliveries/{id}/ack` | 桥接密钥 | token、success；成功回执支持同租约幂等重试 |

桥接使用 `Authorization: Bearer <bridge_secret>`，恒定时间比较；不使用 query 参数。该精确接口前缀在网关 public-paths 中免 JWT，但每个控制器方法都会校验独立密钥。不要给任何其他个人接口配置匿名访问。

无登录/错误密钥 401、不可订阅的组/平台 403、冲突或过期租约 409、生成码过快 429、功能关闭或配置不全 404。绑定码无效统一 400，不泄露是否曾属于某用户。接口参数有长度、数量与类型限制。

## 实现位置

- `modules/user-module/.../notification`：绑定、偏好、订阅、数据库串行锁、队列、桥接控制器。
- `model/contract/.../notification`：仅包含源标识的发布事件、公开内容解析契约。
- `apps/monolith-app/.../notification`：发布事务监听和现有公开读取服务适配。
- `fronted/vue3-merged/src/components/profile/WechatNotificationsPanel.vue`：绑定、订阅、免打扰、近期记录，沿用个人中心主题。
- `tools/astrbot-notifications`：Python 插件、可重建 ZIP、模拟测试。

## 本地验证与边界

后端测试使用独立 H2 内存库，运行 PostgreSQL/MySQL 兼容模式迁移，不读取远程业务数据库。覆盖绑定码/身份竞争、事务回滚、去重、成员与可见性撤销、暂停、免打扰、租约、退避和接口 snake_case/认证。发布服务及 monolith 解析适配器有单元回归。

插件测试覆盖命令先终止后续处理、真实事件身份、群聊拒绝、发送失败、取消、回执丢失和持久回执重启；使用 SDK 形状替身，不登录真实 AstrBot。接口依据官方 [主动发送指南](https://github.com/AstrBotDevs/AstrBot/blob/master/docs/zh/dev/star/guides/send-message.md)、[Context 实现](https://github.com/AstrBotDevs/AstrBot/blob/master/astrbot/core/star/context.py)、[4.15 数据目录接口](https://github.com/AstrBotDevs/AstrBot/blob/v4.15.0/astrbot/core/star/star_tools.py)。实际微信适配器、账号在线状态及服务商主动发送能力仍需接入后验证。

前端有绑定/保存/解绑/过期/账号切换回归，并在本地数据下检查桌面、390px 移动屏及日夜主题。生产构建通过。未执行生产迁移、部署、真实微信发送或 Git push。

关闭功能时先停插件，再设置网站开关为 false 并重启。不删除数据表；恢复后仍需检查适配器在线及既有绑定。数据库互斥锁适合个人网站规模；如增长到大量订阅，应改为分页扇出、独立队列工作进程与集中发送回执。
