# Production deployment: unify-music-platform-library

2026-10-06 21:14（Asia/Shanghai）完成个人服务器 `111.228.35.186` 发布与线上验收。入口：[个人网站](https://site.shizuki.online/)、[Folia](https://site.shizuki.online/music/)。普通音乐左栏新增“声音 / 电台”，网易云账号歌单和喜欢状态直接读取平台。

## Release identity

本地功能提交为 `f35d9716`。实际发布以服务器原主站 `d42c34bf338738a78a3bde3a4c7f62b3fd4a64c4` 和 Folia `1fca2ef15922c55b8655873bbd4d6a4415db828b` 为基线，在独立干净 checkout 中应用功能，保留线上已有的播放会话、路由请求代数及 Folia 首次挂载保护。未包含主工作区 `TopMenu.vue` 的用户修改。

| Component | Commit / OCI revision | Running image |
| --- | --- | --- |
| Backend | `16517f6e6dfd024b2c6ca3e5241a899f2a4bf9ff` | `sha256:c2df44c35ab341d19acfe79625b61859f22b5545a867d7e339522556c4b13a93` |
| Site | `16517f6e6dfd024b2c6ca3e5241a899f2a4bf9ff` | `sha256:1d99545fee2ffebb96dfbc6b157100c1c5a0d8de69b5da5faec58f5e9795a89f` |
| Folia | `5bf98f77dfdc77f670ebf17e5c16973b4d30e6c5` | `sha256:eb896d63646e3494e8fccdff52428a3271ad7b1fae3712b2b2cf2610e9bddcc2` |

主站与后端标签为 `music-platform-16517f6e`；Folia 为 `music-platform-5bf98f77`，并更新现有 Compose 使用的运行标签。实际容器 image ID 与 revision 已逐项核对。部署标记 `/opt/shizuki-site/deploy/.deployed-commit` 已在全部验收通过后原子更新为主站发布提交。Folia `/opt/folia/folia-major-main` 为该提交且工作区清洁。

主站 229 个预期静态文件、Folia 198 个预期文件均逐项 SHA-256 匹配；新增的对应源码下载也在 Folia 清单中。后端实际运行 JAR SHA-256 为 `5a080c6228cd6235a09c001334e53afaa702e764f4c90fecf9083e1fd56d12dd`。增量更新的 43 个主站源码/测试/说明文件与发布 checkout 字节一致。旧哈希静态资源保留，以兼容部署前已打开的页面。

## Checks and live acceptance

- 干净发布主站相关 10 个测试文件共 92 项通过；修正生产会话 guard 对应 fixture 后，受影响 2 文件 38 项通过。最终面板文案 4 项复验通过。后端媒体模块 7 个测试类共 77 项通过；网关 `AuthEntryFilterTest` 13 项通过。主工作区对应面板/桥接 30 项和网关 13 项也通过。
- Folia TypeScript `--noEmit`、3 个相关文件共 5 项测试、生产 Vite 构建通过。主站生产构建与 Java 17 后端打包通过；复用现有依赖和线上 Vite 参数，无新增依赖。
- 后端 `/actuator/health` 为 `UP`，Folia `/healthz` 为 `ok: true`，主站、Folia 与公开源码入口 HTTP 200。
- 游客 `/api/v1/music/discovery/podcasts` HTTP 200，返回 10 个真实声音频道；首个频道的 bundle HTTP 200，包含 72 个有效节目 track ID。游客读取账号 library、likes、personal FM 均返回 401。
- Edge 使用已有登录态验收：显示 15 个云端歌单（喜欢 1、创建 5、收藏 9），无默认歌单或旧导入副本；喜欢歌单完整加载 2500 首，已渲染曲目的红心与平台列表一致；私人 FM 首批返回 3 首真实歌曲。
- 打开真实声音频道后显示 72 个节目；普通模式选中首个节目，播放器显示时长 `49:49`，播放进度实际推进到 `00:33`，验收结束已暂停。更新后的页面未捕获 JavaScript error。

首次切换时，Folia 尚在启动就执行健康探测，连接重置触发回滚；旧三镜像、主站源码和 Folia 提交均已恢复并通过健康检查。增加有界就绪等待后再次切换成功。线上验收还发现游客声音推荐缺少网关精确公开路径，增加该路径及鉴权回归；最终只重建并更新后端、主站。账号 library、likes、mutation、私人 FM 的鉴权保持有效。

## Recovery and capacity

发布前完整持久化恢复点：

`/opt/shizuki-site-backups/snapshot-20261006-202931-d42c34bf3387`

包含应用、配置、数据库、三个原有卷与 Folia 应用，共 9 个文件、`1,042,126,189` bytes；`READY` 与 `SHA256-MANIFEST.json` 已保存，发布前及最终确认时均逐文件校验通过。原历史恢复点及数据卷保留。快速恢复目录 `/opt/shizuki-site-backups/music-platform-20261006-f4c1dc37` 包含 `changed-app-before.tar.gz`、后续四文件修正前归档、`ROLLBACK-READY` 和完整 `release-record.json`（运行镜像、源文件、静态清单及完整恢复点索引）。

原镜像冻结标签：

- `shizuki-site/backend:backup-before-platform-20261006-91f3ea03`
- `shizuki-site/site:backup-before-platform-20261006-e5824606`
- `folia-local/gateway:backup-before-platform-20261006-91b1df73`

回滚使用这些冻结标签恢复原 Compose 运行标签，恢复修改文件归档及原 Folia 提交，再运行现有 Compose 并检查健康；完整应用/数据库/卷恢复时以完整 `READY` 快照和现有部署恢复工具为准，不混用新旧数据。

根盘最初仅余约 90 MB。只回收已核对为闲置、非共享的 BuildKit 缓存，并将 ext4 根卷系统预留调整为 3%，保留约 3.2 GB 系统应急空间；原 reserved block count 为 `1149251`，当前为 `785648`。恢复点先在私有 RAM 目录生成，再持久化并验证，未删备份或数据卷。最终根盘可用约 1.03 GB；RAM 临时发布目录已清理。主站 `.env.server` 和 `resouces/yaml/common-config.yaml` 指纹未变化。

## Source offer, scope and handoff

[Folia 对应源码与许可证](https://site.shizuki.online/music/source/) 随运行版本提供：完整 `5bf98f77` Git archive、平台音乐库补丁、AGPL 许可证；已检查源码配置不包含认证 token。补丁 SHA-256 为 `332d4f02d14aca2cd236742a729beabc8589aba3e6f172337bf47c5664645e3f`。未执行 Git push，本地发布引用 `codex/deploy-platform-music-20261006` 保留。

主站临时发布 worktree 已通过 Codex 归档，可从当前会话附件恢复；保护分支仍指向精确发布提交。Folia 独立干净发布 checkout 保留在 `D:\program\_codex_deploy\folia-music-platform-release-20261006` 供复现与检查；原 fork 未改动。本地忽略目录 `.codex-tmp/music-platform-deployment.json` 与服务器快速恢复目录中的 `release-record.json` 保存完整运行清单和发布证据。

本次完整账号库和真实点赞支持网易云；QQ/酷狗账号代理尚未部署，仍仅保留现有搜索播放。真实账号歌单、喜欢读取、FM 与声音播放已验证；未人为修改用户的真实平台喜欢列表，点赞/取消写入语义由客户端、服务、控制器、前端及桥接契约测试覆盖。

自动审批拒绝删除本次两份未完成的本地备份传输文件，原因是策略拦截；它们仍在私有临时备份目录，不作为有效恢复点。此前同样被阻止删除的 `.codex/tmp` 验证素材继续保留在忽略目录。有效恢复点为已复核的服务器持久化快照。无未完成部署或功能任务；OpenSpec 保持未归档。
