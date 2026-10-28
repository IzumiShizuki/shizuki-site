# 项目边界

自 2026-10-28 起，个人网站与 DJ 读经共读分别维护。

| 项目 | 本地目录 | GitHub | 职责 |
| --- | --- | --- | --- |
| Shizuki | `D:/program/shizuki-site` | [shizuki-site](https://github.com/IzumiShizuki/shizuki-site) | 个人网站、音乐、AI 与网站账号能力 |
| DJ | `D:/program/dj` | [dj](https://github.com/IzumiShizuki/dj) | 读经、打卡、小组、书架与移动端提醒 |

DJ 初始源码取自原 `codex/dj-native-reading-reminders` 的 `dbd3baa1`。后续 DJ 修改在新仓库完成，旧工作树作为历史保留。两个项目都有自己的 OpenSpec、构建入口和提交历史。DJ 已去除主站前端以及音乐、AI 后端模块，并携带所需账号及公共库源码，不需要相邻的主站源码才能构建。

两者继续兼容既有个人服务器 `111.228.35.186` 的账户/API/数据库；仓库拆分不会自动新建数据库、迁移用户或改变线上服务。DJ 通知修复需更新 APK；新组员打卡通知还需匹配后端与 `V1028` 迁移。生产部署不属于本次 GitHub 提交。

DJ 原生版本从 `0.2.0` 开始统一维护，Android build 2 保留原应用标识与签名以支持覆盖升级。推送通过现有设备收件箱同步：Android 后台通常至少间隔 15 分钟，iOS 当前打开 App 才同步，APNs/FCM 即时投递尚未配置。

私有配置、签名密钥和构建缓存继续留在本机安全目录，不提交到 GitHub。
