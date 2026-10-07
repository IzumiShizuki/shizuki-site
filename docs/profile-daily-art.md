# 个人页每日插画

入口：桌面「个人 → 个人概览 → 每日一图与每日老婆」，移动版「我的」。需要登录网站账号。

## 使用

1. 展开「画师与 Pixiv 账号」。可直接用画师 ID 或 `https://www.pixiv.net/users/{id}` 链接手动添加画师，最多 32 位。
2. 关联自己的 Pixiv 时，填写自己的账号 ID/主页和 PHPSESSID。在已登录 Pixiv 的浏览器按 F12，进入「应用程序 → Cookie → https://www.pixiv.net」，复制 PHPSESSID 的值。不要将它提交到代码、截图或聊天消息中。
3. 关联时验证会话并导入首批公开关注。点击「同步关注画师」导入至多 240 位；勾选私密关注时公开、私密各导入至多 120 位。页面说明是否达到截断限制。同步失败不替换已有关注列表。
4. 手动列表与关注列表独立保存。解除关联删除加密会话和导入关注，保留手动画师及当天已领取的结果。
5. 「每日一图」按用户及北京时间从画师列表轮换三位画师、每位选择最多两张全年龄作品。「每日老婆」从内置八位妹系角色中按天选取一位，并检索对应的全年龄插画。每张图标注作者与作品 ID，可打开原作；角色有 Pixiv 搜索入口，下方可搜索角色/标签并查找画师名字。

每日结果在首次访问时生成。成功结果写入数据库，刷新与服务器重启不重抽。已有当天结果时修改偏好从次日生效；未成功的部分可以重试。图片变为私密或不可用时显示原作入口。

## 接口与存储

- 当前用户接口根：`/api/v1/me/daily-art`，包括 GET `settings`、GET `today`、PUT/DELETE `pixiv`、POST `pixiv/sync?include_private=false`、PUT `artists`、GET `search?q=...`。
- PUT `pixiv` 请求：`{"account_id":"123","session":"123_..."}`。PUT `artists` 请求：`{"artist_ids":["123"]}`。全部个人接口必须经过网站登录鉴权。
- 公开预览：GET `/api/v1/daily-art/pixiv/artworks/{id}/preview`。只接受作品 ID，重新查询作品权限后读取固定的 HTTPS pximg CDN；拒绝重定向和任意图片 URL。
- PostgreSQL 单体迁移：`V1016__profile_daily_art.sql`，新增 `USR_DAILY_ART` 的 `config_json` 与 `daily_json`。两类字段独立原子更新，不影响音乐和外观偏好。同日每日数据合并保留最先成功的部分，避免并发重抽。
- 会话复用已有 AES-256-GCM 加密服务和现有主密钥。接口不回传明文或密文，也不保存到前端本地存储。绑定接口未启用请求参数审计记录。
- 可选代理属性：`shizuki.pixiv.proxy-url`，默认继承 `shizuki.media.wallpaper.discovery.proxy-url`。HTTP 代理支持已有用户名/密码认证；仅向匹配的代理主机发送代理凭据。请求限时 5 秒，JSON 至多 2 MiB、图片至多 8 MiB；公开元数据缓存至多 128 项、10 分钟，登录关注不缓存。每日上游工作池 4 个线程、队列 32 项，满载返回可重试状态。

后端升级和数据库迁移应先于前端发布。本次仅做本地实现和提交，没有操作生产数据库、部署或推送。

## 来源与验证边界

Pixiv Web Ajax 是非官方接口，不是对第三方应用开放的标准 OAuth。2026-10-07 实测：公开用户资料、最新作品和安全标签搜索可读取，关注接口匿名访问返回 400，必须使用有效登录会话。相关参考：[PixivPy](https://github.com/upbit/pixivpy)、[Web Ajax 接口说明](https://github.com/daydreamer-json/pixiv-ajax-api-docs)。接口变化或会话过期时可更新会话并重试。

真实账号关联及私密关注导入未使用用户的真实会话实测。自动测试验证了认证请求、加密保存、不回传凭据、用户隔离、截断、并发关联更换、每日缓存、失败恢复与图片来源限制。另用实际 Java 上游客户端实测公开资料、画师作品、角色搜索和实际图片下载，通过。浏览器桌面/手机测试使用明确的测试图片和接口数据验证布局、搜索和设置操作，不代表已获取用户自己的关注。生产数据库迁移尚未执行。

可选联网测试：启用 `-Dpixiv.live=true` 并指定 `PixivClientLiveSmokeTest`。本机 Windows JDK 的默认临时目录出现 Unix socket 回环错误，测试 JVM 增加 `-Djdk.net.unixdomain.tmpdir=D:/program/shizuki-site` 后联网测试通过；未修改机器环境或工具链。该测试默认不运行，以免常规测试依赖外网。
