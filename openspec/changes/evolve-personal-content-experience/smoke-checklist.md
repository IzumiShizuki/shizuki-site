# 个人内容体验发布 Gate 与 Smoke Checklist

## 1. 执行记录

- 候选 commit：`____________`
- 前端产物 SHA-256：`____________`
- 后端产物 SHA-256：`____________`
- 环境：`local / staging / production`
- 目标主机：`____________`（生产只允许个人站 `111.228.35.186`）
- 执行人 / 复核人：`____________ / ____________`
- 开始 / 结束时间：`____________ / ____________`
- 结果：`PASS / FAIL / BLOCKED`

本清单不授权部署、推送、生产开关变更或数据清理。任一安全 gate 失败即停止推进。

## 2. 本地/候选构建 gate

- [ ] `openspec validate evolve-personal-content-experience --type change --strict --no-interactive` 通过。
- [ ] 前端目标 Vitest 通过。
- [ ] 前端全量 `pnpm test:unit` 通过；若有既有失败，已记录基线、责任文件和与本变更无关的证据。
- [ ] 前端 `pnpm build` 通过。
- [ ] `package.json` 若提供 lint 脚本则已运行；若未提供，明确记录“无 lint script”，不得写成通过。
- [ ] 使用 `D:\environment\activate-shizuki-site.cmd` 的 Java 17 环境运行 monolith reactor 单元/集成测试与构建。
- [ ] 测试环境可建立 JDK loopback/`HttpClient`/本地 `HttpServer`；环境失败与业务断言失败分开记录。
- [ ] MySQL/PostgreSQL 迁移契约、权限、缓存、定时任务和 OSS 客户端目标测试通过。
- [ ] `git diff --check` 无新增空白错误；`git status` 已复核，不覆盖用户既有改动。

## 3. 配置与基础设施 gate

- [ ] 新增功能开关初始均关闭，且父开关未打开时子开关无法启动。
- [ ] effective PostgreSQL/Redis/Kafka/API 地址属于个人站范围。
- [ ] effective OSS endpoint/private/public bucket 属于个人站；未使用示例或跨项目 fallback bucket。
- [ ] cursor、gateway capability、认证密钥来自受保护配置，未出现在日志、构建产物或本记录中。
- [ ] PostgreSQL 备份可恢复；V431/V1011 已在目标 PostgreSQL 验证。
- [ ] `/actuator/health`、Redis、Kafka 和 OSS preflight 健康。
- [ ] 媒体自动清理保持关闭；AVIF 未经区域预检不启用。

## 4. 无虚构数据与真实空态 gate

- [ ] 迁移 SQL 不包含向 `CTN_ALBUM`、`CTN_MOMENT`、`CTN_PHOTO` 写入演示数据的语句。
- [ ] 迁移前后相册/动态/照片业务行数只反映真实管理员操作。
- [ ] 空库的 featured、albums、moments API 返回空集合/明确空结果，不返回头像、壁纸或测试夹具。
- [ ] About、Blog、Albums、Moments 在无内容时显示“内容正在整理”或等价真实空态。
- [ ] 后台为空时显示创建引导，不自动创建生产记录。

## 5. 鉴权与后台 smoke

- [ ] 匿名访问个人内容后台 read/mutation 返回 401。
- [ ] 普通登录用户即使知道 URL 或持有单一 scoped permission 仍返回 403。
- [ ] ADMIN 且满足有效权限的用户可访问，类级和方法级保护一致。
- [ ] 相册/动态批量上传部分失败时，成功项保留，失败项逐项可重试且不会被发布。
- [ ] 必需派生 pending/failed、缺封面、缺 alt 或隐私确认缺失时发布被阻止。
- [ ] stale ETag 编辑/重排显示服务器当前版本，不静默覆盖。
- [ ] 回收恢复到 DRAFT/ARCHIVED，绝不自动恢复为 PUBLISHED。
- [ ] purge dry-run 显示 retention/reference/worker blockers；过期、重放、改目标、改版本或错误确认短语均拒绝。

## 6. 生命周期、可见性与缓存撤权 smoke

对一个专用验收相册、动态和共享照片记录操作时间与 mediaRef，不使用真实敏感照片。

- [ ] DRAFT 仅管理员预览；公共列表和详情不可见。
- [ ] PUBLIC 出现在合格列表/featured，站内媒体 gateway 可读取安全派生。
- [ ] UNLISTED 仅高熵直达可见，不进入列表/search/feed/sitemap，并返回 `noindex` 与 `private, no-store`。
- [ ] PRIVATE 与不存在对访客不泄露差异。
- [ ] PUBLIC → PRIVATE 后，旧详情、旧 mediaRef 和已有页面中的后续媒体请求均被拒绝。
- [ ] PUBLISHED → ARCHIVED 后，列表、featured、详情、search/feed/sitemap 和关联媒体均撤权。
- [ ] RECYCLED 从正常管理列表和全部访客面消失；恢复不自动公开。
- [ ] 共享照片仍被另一合格 PUBLIC 内容引用时，只保留该合格关联的交付能力。
- [ ] 撤权只失效目标缓存/capability，没有全库 Redis flush，也没有误伤无关内容。

## 7. 媒体隐私 smoke

- [ ] GPS JPEG 的原图仅保存在 private bucket。
- [ ] THUMB_WEBP、DISPLAY_WEBP、FULL_SANITIZED 可完整解码且无 GPS、设备、相机等 EXIF。
- [ ] 伪装 MIME、损坏图、超大像素、截断流和超限动态图 fail closed，不进入 READY/可发布状态。
- [ ] 公共 JSON、响应头、浏览器请求和应用日志不包含 bucket、object key、OSS hostname、签名 query、长期原图 URL。
- [ ] 原图下载默认 NONE；SANITIZED 只交付清理版；ORIGINAL 需要关联级显式确认和短时 capability。
- [ ] 一个相册启用 ORIGINAL 不会提升复用同一照片的其他相册/动态权限。
- [ ] purge 前保留期、活动引用和活动 worker 均会阻断物理删除；成功 purge 后仅删除已确认且无引用的对象。

## 8. Provider 与故障隔离 smoke

- [ ] Open-Meteo 成功响应包含地点范围、观测/抓取时间、新鲜度和可用 attribution 链接。
- [ ] Hitokoto 成功后同一站点日期只产生一个不可变 canonical snapshot。
- [ ] timeout、非 2xx、超大响应和非法 JSON 不会作为 fresh 数据展示。
- [ ] 有 last-good 时明确显示 stale 和原时间；超 max-stale 或无 fallback 时显示 unavailable，不补零或猜测数据。
- [ ] Redis/刷新锁不可用时只读数据库事实，不向每个访客扇出上游请求。
- [ ] About/Blog 主内容、导航和播放器在天气/语录失败时仍独立可用。
- [ ] 未点击“我的天气”不调用 geolocation；拒绝/撤销时不发送 nearby POST。
- [ ] nearby 请求先校验并归一化坐标，返回 `private, no-store`，无原始坐标日志、持久化或身份关联。

## 9. UI、主题、动效与输入 smoke

分别在 `1440x900`、`1024x768`、`390x844` 执行昼/夜 × 沉浸/舒缓组合：

- [ ] About、Blog、Albums、Album detail、Moments 分别呈现三/二/一栏预期，中心内容保持主层级。
- [ ] 横向 rail 支持触控、滚轮、方向按钮和键盘；到边缘后归还页面纵向滚动。
- [ ] 顶部完整导航按主滚动根收拢；Site 菜单包含 About/Albums/Moments，Focus 中全部隐藏且不可聚焦。
- [ ] 默认保存模式为沉浸；设置中只有沉浸/舒缓；旧 vivid/calm/off 迁移正确。
- [ ] 系统 reduced motion 只临时影响 effective mode，不改写 saved mode；设备、网络、电池、帧率和视口不自动降档。
- [ ] 暗色和亮色下玻璃文字、图标、焦点环、选中态和危险操作对比清晰。
- [ ] 菜单、抽屉、分享、动态展开和灯箱支持纯键盘；Escape 关闭后焦点返回触发点。
- [ ] 灯箱前后导航、触控和 alt/title 正确，永不切换为未经授权原图。
- [ ] 页面切换、筛选、展开和打开抽屉不自动播放、不重置歌曲、队列、进度或创建第二播放器。

## 10. 回滚演练与放行

- [ ] 已演练按“上游请求 → 单个 widget → 公共 UI/API → studio/worker”的逆序开关回滚。
- [ ] 回滚后新增表、私有原图、审计和快照仍保留；未执行删表、批量对象删除或 Redis 全库清空。
- [ ] 已验证回滚后的旧 About/Blog 主路径、认证和播放器正常。
- [ ] 所有 FAIL/BLOCKED 项都有 issue、负责人和复验条件。
- [ ] 安全、数据、后端、前端和运维复核人均签字后，才可请求下一阶段的明确生产授权。
