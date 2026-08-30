# 个人内容体验分阶段发布 Runbook

## 1. 适用范围与授权边界

本 runbook 只定义 `evolve-personal-content-experience` 的发布顺序、观测点与回滚办法，不构成生产发布授权。任何部署、`git push`、生产开关变更、数据库变更执行或 OSS/CDN 操作，都必须在当次对话中另获明确授权。

- 目标只能是个人网站服务器 `111.228.35.186` 及其个人站资源。
- 不得把本站组件、数据或运维工具部署到 `111.228.52.91`。
- 新表和私有原图是保留性资产；回滚以功能开关和路由撤权为主，不执行破坏性降级或删表。
- 每一阶段必须独立通过 gate，禁止一次性同时打开后台、公共 API、公共 UI 和外部 provider。

## 2. 发布前置条件

发布负责人在变更单中记录以下事实，但不得粘贴密钥、签名 URL、精确访客坐标或完整对象键：

- 已记录候选 commit、前后端构建产物校验值、部署时间窗、负责人和回滚负责人。
- PostgreSQL 已完成可恢复备份，并已在目标环境演练 V431/V1011 配对迁移与非破坏性回滚方案。
- Redis、PostgreSQL、Kafka、API 与 OSS 可用；`/actuator/health` 健康。
- 有效 OSS endpoint、private bucket、public bucket 均属于个人站边界；不得依赖 `application.yml` 中的示例/后备 bucket 名。
- `SITE_PERSONAL_CONTENT_CURSOR_SECRET`、媒体 capability secret 与认证 secret 已由受保护配置提供，长度和轮换策略合格。
- 所有新增开关初始为关闭：个人内容公共 API、内容工作台、外部组件上游请求、媒体派生 worker、AVIF。
- [smoke-checklist.md](./smoke-checklist.md) 的“本地/候选构建 gate”已全部通过。

## 3. 观测基线

发布前至少记录 15 分钟基线，发布后每阶段保持一个明确观察窗口。观测项包括：

- API 的 2xx/4xx/5xx、p50/p95 延迟、线程池和连接池饱和度。
- 管理接口的 401/403 比例、权限拒绝原因和审计落库成功率。
- 派生任务的 pending/processing/ready/failed/retry 数量及队列年龄。
- OSS 读取、处理、保存、签名和删除错误；日志只记录安全标识，不记录签名 URL 或对象凭据。
- Redis 命中率、刷新锁竞争、缓存失效失败；禁止用全库 `FLUSH*` 作为发布步骤。
- Open-Meteo/Hitokoto 调用次数、超时、非法响应、last-good/stale/unavailable 比例。
- 相册、动态和媒体 gateway 的 404/403、缓存命中与撤权耗时。

任一阶段出现持续 5xx、权限边界回退、公共存储信息泄露、公开转私有后仍可读取、坐标/EXIF 泄露或不可解释的数据删除时，立即停止推进并执行该阶段回滚。

## 4. 阶段一：权限修复

### 变更

1. 保持所有个人内容、媒体派生和外部组件开关关闭。
2. 发布权限切面修复、权限目录和配对迁移。
3. 验证匿名请求为 401、普通已登录用户为 403、具备 ADMIN 基线及 scoped permission 的管理员才可成功。
4. 验证拒绝发生在 controller 业务调用前，响应不泄露目标是否存在。

### 监控与 gate

- 既有后台接口授权行为无回退，正常管理员没有异常 403 峰值。
- 审计记录包含操作者、动作、目标、结果和时间，并已脱敏。
- 新表为空，迁移未写入虚构相册、动态、照片、天气或语录。

### 单阶段回滚

- 回滚应用二进制或权限切面变更，保持新增表和迁移版本不动。
- 暂停新后台入口；不删除权限种子，不删表，不触碰私有对象。
- 若鉴权异常扩大，先在入口层阻断新增管理路由，再恢复上一稳定应用版本。

## 5. 阶段二：媒体管线与后台工作台

### 变更

1. `SITE_PERSONAL_CONTENT_ENABLED=true`，仅在授权窗口内打开 `SITE_PERSONAL_CONTENT_STUDIO_ENABLED=true`；保持 `SITE_PERSONAL_CONTENT_PUBLIC_API_ENABLED=false`。
2. 经 OSS 能力预检后依次打开 `MEDIA_DERIVATIVES_ENABLED`、`MEDIA_DERIVATIVE_OSS_PROCESSING_ENABLED`、`MEDIA_DERIVATIVE_WORKER_ENABLED`；AVIF 单独保持关闭，直到区域能力验证通过。
3. 仅由管理员上传测试夹具，完成魔数/解码/像素/帧数/SHA-256、EXIF 清除、WebP 必需派生、失败重试和重启续作验收。
4. 验证统一回收站、safe restore、保留期、dry-run capability、单次确认和引用阻断。

### 监控与 gate

- 原图仅位于私有 bucket；公共响应、响应头和日志无 bucket、object key、OSS host/signature。
- GPS/设备/相机 EXIF 不存在于所有访客派生；必需派生未 ready 时无法发布。
- worker 无无限重试、重复保存或队列持续增长；失败项保留可诊断原因。
- dry-run capability 过期、重放、改目标、改版本均失败；没有自动 purge 调度。

### 单阶段回滚

1. 先关闭工作台写入口和派生 worker，再关闭 OSS processing 与媒体派生总开关。
2. 保留数据库记录、私有原图和已生成派生，停止新任务领取。
3. 通过站内 gateway 的定向失效器撤销相关 capability/cache；禁止批量清空 Redis。
4. 回滚应用版本。任何对象物理清理由后续经审计的人工任务处理，不作为紧急回滚步骤。

## 6. 阶段三：只读公共 API

### 变更

1. 保持公共 UI 未发布，仅打开 `SITE_PERSONAL_CONTENT_PUBLIC_API_ENABLED=true`。
2. 外部组件总开关和上游请求仍关闭；天气/语录先验证 unavailable/last-good 的诚实返回。
3. 以无内容、PUBLIC、UNLISTED、PRIVATE、ARCHIVED、RECYCLED 数据逐项验证列表、详情、featured 和媒体 gateway。
4. 验证游标稳定性、ETag/Last-Modified、UNLISTED 的 `private, no-store` 与 `noindex`。

### 监控与 gate

- 空库返回真实空结果，不出现头像、壁纸、夹具或生成内容充当相册/动态。
- PRIVATE/不存在对访客呈现同形拒绝，不暴露资源存在性。
- PUBLIC 转 PRIVATE、归档或回收后，内容与关联媒体在目标撤权时限内不可访问。
- 公共 API 不同步调用 Hitokoto；Redis/锁不可用不会造成 provider 扇出。

### 单阶段回滚

- 关闭 `SITE_PERSONAL_CONTENT_PUBLIC_API_ENABLED`，保持 studio 和私有媒体事实不变。
- 对已撤回的 album/moment/mediaRef 执行定向缓存与 capability 失效。
- 不修改内容生命周期，不自动删除派生，不回滚新增表。

## 7. 阶段四：公共 UI 与外部组件

### 变更

1. 发布公共前端产物，先验证 About/Blog 的主内容在组件请求失败时仍可用。
2. 验证三/二/一栏、Site 菜单、紧凑导航、暗色主题、默认沉浸和手动舒缓。
3. 在独立 gate 后依次打开外部组件总开关、单个天气/语录能力，最后才允许 `SITE_WIDGET_UPSTREAM_REQUESTS_ENABLED=true`。
4. 首次真实相册/动态只能由管理员工作流创建和发布，不导入演示内容。

### 监控与 gate

- 核心页面、导航和全局播放器不因 widget 超时而阻断或重置。
- Open-Meteo 始终显示来源；Hitokoto 每站点日期最多一个 canonical snapshot。
- “我的天气”只在明确点击后调用 geolocation；拒绝或未点击不发送附近天气 POST。
- 沉浸/舒缓、昼/夜、键盘/触控和灯箱焦点返回均通过 smoke checklist。

### 单阶段回滚

1. 先关闭上游请求，再分别关闭 quote/weather，最后关闭外部组件总开关。
2. 回滚公共前端产物或关闭公共 API；About/Blog 保留原有主内容。
3. 对公开转私有/归档内容执行定向 gateway/cache 撤权。
4. 保留数据库快照、私有原图和管理员内容，不运行破坏性 SQL。

## 8. 结束与交接

每阶段结束记录 gate 结果、监控截图/查询链接、异常、回滚是否演练及下一阶段授权。全部阶段完成后仍需一个稳定观察窗口；在该窗口结束前不得删除旧 UI 兼容分支、原始作者数据、新表或私有媒体。
