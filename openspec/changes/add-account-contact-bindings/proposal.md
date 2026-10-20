## Why

用户需要在 Shizuki 账号层统一管理可联系身份，而不是在某个站点或某一种提醒功能里重复绑定。一个账号可以绑定多个 QQ 和微信身份，主站与 DJ 站的个人设置应读取同一份绑定数据，便于 Todo 操作授权和提醒投递复用。

## What Changes

- 增加账号级联系方式绑定模型，支持一个账号绑定多个 QQ/微信身份。
- 通过网站生成一次性绑定指令，由已配置的消息桥接确认真实私聊身份。
- 在个人设置提供绑定列表、添加、解绑和用途开关，支持 Todo 操作与提醒用途。
- 提供与站点无关的 `/api/v1/me` 绑定接口，主站与 DJ 站共用。
- 对绑定身份只返回脱敏标识；绑定挑战、来源和内部身份值按现有安全约定保存。
- 保留现有微信订阅提醒接口，新增绑定数据作为后续 Todo 与多目标提醒的共享身份目录。

## Capabilities

### New Capabilities

- `account-contact-bindings`: 账号级 QQ/微信绑定、验证、解绑和用途授权。
- `shared-profile-contact-settings`: 主站与 DJ 站个人设置共用绑定数据和交互。

### Modified Capabilities

无。

## Impact

- user-module：新增绑定 API、桥接确认接口、服务和数据库访问。
- monolith：新增 PostgreSQL/MySQL Flyway 迁移。
- desktop/mobile profile frontend：新增共享联系人绑定面板和 API 客户端。
- AstrBot/其他消息桥接：可使用新的确认接口；现有微信通知桥接保持兼容。
- 不包含生产部署、QQ/微信机器人适配器安装或远程配置写入。
