## Why

个人界面缺少与用户插画喜好相关的每日内容。用户希望关联 Pixiv 账号，从喜欢的画师作品中每天获得图片推荐，并从妹系角色中抽取每日老婆。

## What Changes

- 在桌面与移动个人页增加每日一图、每日老婆和站内作品搜索。
- 支持用 Pixiv 账号 ID 与 PHPSESSID 关联账号、同步公开及可选私密关注；服务端加密存储会话，界面支持更新及解绑。
- 支持独立管理手动喜欢的画师；保留作品、作者与 Pixiv 搜索跳转。
- 按 Asia/Shanghai 日期及网站用户固定每日结果，刷新或重启不重抽；内容失败时提供重试及明确状态。
- 以 Pixiv Web Ajax 作为非官方读取来源，服务端代理图片并过滤非全年龄内容。

## Capabilities

### New Capabilities
- `profile-daily-art`: 个人每日插画推荐、Pixiv 账号关联、画师管理、作品搜索与每日角色抽取。

### Modified Capabilities

无。

## Impact

- Vue 个人页、移动个人页、新的每日内容组件与 API 服务。
- user-module 新增当前用户每日内容接口、Pixiv 上游客户端及独立数据库记录；复用现有 AES-GCM 服务。
- 新增 monolith PostgreSQL 迁移；匿名白名单只开放经全年龄校验的作品预览接口。
- 无新增依赖；复用既有工具链与可选网络代理。Pixiv 关注接口需要真实登录会话，不假装提供官方第三方 OAuth。
