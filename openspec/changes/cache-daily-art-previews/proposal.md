## Why

每日一图和每日角色的选择已经按日保存，但服务器收到图片预览请求时仍会重新下载图片。用户报告轮播加载缓慢，需要复用已下载的图片，同时继续检查当前作品是否属于全年龄内容。

## What Changes

- 增加有容量、有效期上限的服务端图片缓存；同一图片的并发请求合并下载。
- 每次预览请求继续刷新作品信息并验证全年龄、可见性和可信图片来源，验证通过后才允许读取缓存。
- 支持浏览器条件请求，避免重复传输未改变的图片。
- 增加重复访问、并发下载、失效淘汰和缓存命中后的内容过滤回归验证，记录上线前后加载耗时。

## Capabilities

### New Capabilities
- `daily-art-preview-cache`: 有界的预览图片复用、并发下载合并及条件响应。

### Modified Capabilities
- None. Existing all-ages validation and daily selection behavior remain applicable.

## Impact

- `user-module` Pixiv 图片客户端、预览控制器及测试。
- 无数据库迁移、无新增依赖；缓存只保存公开作品图片，不保存 Pixiv 登录会话。
- 部署到个人站点服务器 `111.228.35.186`，记录不可变构建与恢复点。
