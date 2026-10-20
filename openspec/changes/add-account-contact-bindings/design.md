## Context

当前微信提醒功能把单个微信身份直接存放在 `WX_NOTIFY_PREFERENCE`，它只服务于微信订阅提醒，无法表达多个 QQ/微信身份、用途授权或跨站点复用。主站与 DJ 站需要共享账号域的数据，因此绑定能力应放在 user-module 的 `/api/v1/me` API，而不是某个前端站点或 Todo 页面中。

## Decisions

### 1. 账号级绑定表

新增 `USR_CONTACT_BINDING`：

- `id` 为 UUID 字符串，`user_id` 外键指向 `USR_ACCOUNT`。
- `platform_code` 只允许 `QQ`、`WECHAT`。
- `platform_id` 保存桥接平台标识，`sender_id` 和 `origin_text` 保存确认所需的内部值。
- `identity_hash` 对 `platform_id + sender_id` 做 SHA-256，并建立唯一约束，保证一个消息身份只能归属一个网站账号。
- `masked_identity`、`bound_at`、`binding_version`、`active` 用于展示和并发失效。
- `todo_edit_enabled`、`todo_notify_enabled` 是明确的用途授权，默认均开启；业务消费者按用途筛选。

新增 `USR_CONTACT_CHALLENGE` 保存按用户和平台生成的一次性挑战，挑战只存哈希，十分钟过期并在确认后删除。

### 2. 验证流程

网站端 `POST /api/v1/me/contact-bindings/challenge` 接收平台，返回 `/shizuki_bind <code>` 指令和过期时间。桥接端调用 `/api/v1/integrations/astrbot/contact-bindings/confirm`，提交挑战码和真实私聊 sender。服务校验：

- 站点绑定功能和桥接密钥已启用；
- 平台在允许列表中；
- origin 精确匹配 `<platformId>:FriendMessage:<senderId>`；
- 挑战未过期且只能使用一次；
- 身份未绑定其他账号。

网站个人设置只显示脱敏身份、平台、用途开关和绑定时间，不返回 sender 原文。

### 3. API

- `GET /api/v1/me/contact-bindings`
- `POST /api/v1/me/contact-bindings/challenge`
- `PUT /api/v1/me/contact-bindings/{id}/capabilities`
- `DELETE /api/v1/me/contact-bindings/{id}`
- `POST /api/v1/integrations/astrbot/contact-bindings/confirm`

返回使用现有 `ApiResponse` 和 no-store 缓存策略。主站和 DJ 站只需要使用同一组 API，不保存各自副本。

### 4. 前端复用

新增 `ContactBindingsPanel.vue` 和 `contactBindingsApi.js`。桌面个人页与移动个人页都挂载该组件，显示相同数据和操作。现有 `WechatNotificationsPanel` 保留，用于历史微信订阅设置；后续通知投递可按 `todo_notify_enabled` 和绑定列表扩展。

### 5. 数据库兼容

同时提供 MySQL 与 PostgreSQL 迁移，使用新增表和索引，不改写现有 `WX_NOTIFY_*` 表；将旧微信提醒中的有效绑定复制到新目录，旧提醒仍使用原表。这样可以先部署账号绑定目录，再逐步迁移 Todo 和提醒消费者，回滚时只需停用新 API。

## Risks

- QQ/微信桥接未配置时，接口返回不可用状态，前端保持可解释的禁用状态。
- 身份值属于敏感联系数据；网站响应脱敏，挑战和身份哈希不落明文。
- 现有微信订阅服务仍是单目标模型；本变更提供共享绑定目录，但不改变旧提醒投递的既有语义。
