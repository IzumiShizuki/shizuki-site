# Music cover production deployment

2026-10-27（Asia/Shanghai），用户明确授权“部署”后，已发布到个人网站服务器 `111.228.35.186`。入口：[音乐库](https://site.shizuki.online/#/music-library/music)。

## 发布范围与身份

- 运行基线：`92cd9e760a8ae508bf6809d1160ac167b9210372`，包含当天已上线的小镇编辑器恢复。
- 原修复提交：`9280d218`；在独立工作树中仅 cherry-pick 本修复，再提交部署计划。
- 实际部署版本：`0861f40d5ea8f73edea9ff5452e4897dc614b08c`。
- 发布保护分支：`codex/deploy-music-covers-20261027`。
- 新前端镜像：`sha256:add2b3f90e096b64c5155c650350b01b675a4700ecdb689ddcc25ccee299d866`。
- 新镜像标签：`shizuki-site/site:music-covers-0861f40d5ea8`。

相对生产基线只有 9 个路径发生变化：3 个音乐组件/CSS 文件与本 change 的 6 个 OpenSpec 文档。原工作区的账号、头像、菜单、移动端等未完成改动未进入发布包。已有生产构建参数从服务器配置读取并仅在进程内复用，未输出其值。没有 Git push、数据库迁移或 OpenSpec 归档。

仅重建 `site` 前端服务。后端及其余 7 个 `shizuki-site-*` 容器的实例 ID、镜像 ID 和启动时间全部保持一致；私有 `.env.server` 和 `common-config.yaml` 摘要保持一致。

## 发布门禁

- 隔离工作树的 5 个相关测试文件、22 项测试全部通过。
- 生产前端构建成功；保留已有大 chunk 提示。
- 既有 `scripts/check-town-release.mjs --dist dist` 通过，确认 128×128 地图及 7 项小镇资源完整，避免覆盖当天已发布功能。
- OpenSpec 严格校验和 `git diff --check` 通过。
- 上传包摘要、新镜像全部 528 个静态文件的 SHA-256、Nginx 配置均验证通过。
- 激活后再次核对全部静态文件和受影响源文件摘要。
- 公网首页及两份音乐 CSS 均 HTTP 200，内容摘要与隔离构建逐字节一致；`/actuator/health` 为 HTTP 200 / `UP`。服务器回环 API 与站点健康检查通过。
- 发布标识 `/opt/shizuki-site/deploy/.deployed-commit` 在全部运行检查通过后原子更新为实际部署版本，发布锁已释放。

## 生产浏览器验收

使用独立 Microsoft Edge 会话对同一真实公开歌单与首页推荐执行发布前后测量，没有修改远程用户数据。

| 页面/状态 | 发布前 | 发布后 |
| --- | --- | --- |
| 真实歌单，1440px，100 首 | 存在 27.46、33.89、34.14、35.19、36.89、38.90、39.77px 等不同宽度，高度均 40px | 全部 40×40 |
| 同一歌单，768px / 390px | 未重复采样 | 两种宽度下均全部 40×40 |
| 首页推荐，200 首 | 实际缩略图为 0×0 | 1440px、768px、390px 下均全部 40×40，播放遮罩边界与封面一致 |

曾在保持旧文档的 hash 导航下再次测到旧 CSS；完整重新加载页面后立即通过。原站点链接无需附加参数即可加载新静态资源。已打开旧页面的用户需要刷新（可用 `Ctrl+F5`）加载新版本。

## 回滚与证据

完整回滚点：`/opt/shizuki-site-backups/snapshot-20261027-202024-0861f40d5ea8`。应用/配置、数据库 dump 和全部 3 个配置存储卷已备份；`READY`、gzip 完整性与 `pg_restore --list` 检查均通过。

- 上一前端镜像：`sha256:bf56989513205300c1ff18a6e116f3a356309b6a8dc4e4195811a8b3b9269fa1`。
- 冻结标签：`shizuki-site/site:before-music-covers-0861f40d5ea8`。
- 源文件/部署标识精确恢复包：`/opt/shizuki-site/.music-covers-staging/0861f40d5ea8/previous-source.tar`。
- 本地执行器、构建日志、完整文件清单及浏览器测量 JSON：`D:/program/_codex_deploy/music-covers-20261027`。

执行器在激活和健康检查期间配置了自动回滚；本次没有发生回滚。全部部署任务完成，无待处理发布问题。
