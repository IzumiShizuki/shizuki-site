# 音乐模块生产运维手册（Agent Runbook）

> 适用项目：`shizuki-site`  
> 生产入口：`https://site.shizuki.online`  
> 服务器边界：仅限个人站服务器 `111.228.35.186`  
> 服务器项目目录：`/opt/shizuki-site`  
> 最后校验：2026-08-24

这份文档用于让接手 Agent 在收到“音乐链接不上”“点播放没反应”“歌词/歌单空了”“音乐授权失效”等报告时，先获得可靠证据，再做最小修复。不要凭 `HTTP 200`、容器显示 `Up` 或歌单里出现曲目就宣布音乐正常；用户真正依赖的是浏览器最终能取得并播放媒体字节。

## 0. Agent 的 30 秒入口

在仓库根目录执行：

```powershell
pwsh -File .\deploy\scripts\check-music.ps1
```

结果解释：

- 最终出现 `[PASS] result=music-playable`：匿名默认曲目的入口、backend、Meting、按需解析及媒体资源当前都可用。继续检查用户所指的具体曲目、登录账号源、浏览器缓存或页面部署版本。
- `stage=site-entry`：域名、TLS、Caddy/OpenResty、前端容器或 5173 端口有问题。
- `stage=backend-health`：反向代理、backend 容器、8080 端口或后端依赖有问题。
- `stage=meting-status`：backend 到 Meting sidecar 的链路不可用，或 sidecar 不健康。
- `stage=default-bundle`：默认歌单数据、数据库迁移或歌单缓存有问题。
- `stage=resolve-playback`：曲目元数据存在，但 backend 无法取得实际播放地址；重点查 sidecar、上游、账号源策略和解析日志。
- `stage=media-range`：解析返回了地址，但真实媒体字节不可达；重点查地址过期、403、地区/版权限制、TLS、重定向和浏览器混合内容。

脚本只输出 provider、track id、媒体域名、状态码和读取字节数，不输出完整播放 URL、查询串、Cookie 或 Token。完整 URL 往往带短期签名，不得复制到 Issue、聊天、日志归档或 Git。

## 1. 不可违反的边界

1. `111.228.35.186` 才是本项目个人站服务器。除非用户在当前对话明确要求，不得访问、修改或部署到 `111.228.52.91`。
2. 不得运行 `git push`，除非用户明确授权。正常交付终点是测试、`bd sync`、本地 Commit 和清晰交接。
3. 不得打印或提交以下内容：
   - `deploy/.env.server` 的值；
   - `resouces/yaml/common-config.yaml` 中的口令；
   - 网易云、QQ 音乐、酷狗等账号 Cookie；
   - `MUSIC_WEB_AUTH_TOKEN`、Spotify/Freesound Key；
   - `Authorization` 请求头；
   - 完整临时音频 URL 或其查询串。
4. 不得为了“恢复播放”绕过音乐平台版权、地区、登录或会员限制。上游明确拒绝时，应标为上游限制或账号权限问题。
5. 不得直接执行全量 `docker compose down`、全量重建、清空 Redis、删数据库行或重装 Docker。先证明故障层，再只重启/重建相关服务。
6. 修改 `.env.server` 前必须创建权限不扩大的时间戳备份；修改后必须用同一条冒烟检查验收，并留下回滚命令。

## 2. “音乐可用”的准确定义

完整的匿名播放链路必须同时满足：

1. `GET /` 返回站点 HTML；
2. `GET /actuator/health` 返回 `status=UP`；
3. `GET /api/v1/music/meting/status` 返回 `available=true`；
4. `GET /api/v1/music/playlist/default/bundle` 至少包含一首启用曲目；
5. `POST /api/v1/music/tracks/resolve-playback` 对代表曲目返回非空 `data.audio`；
6. 对该地址执行 `Range: bytes=0-1023` 后能读取媒体字节；
7. HTTPS 页面最终没有被重定向到 HTTP 媒体地址。

重要：歌单接口中 `audio: ""`、`lyric: ""` **不一定是故障**。当前设计会先返回轻量曲目元数据，用户点击时才调用 `resolve-playback` 获取短时有效音频和歌词。只看歌单 JSON 会造成误判。

对于登录用户，还要额外满足：

- 浏览器的 Bearer Token 有效；
- 用户配置的 `music.source_mode` 与绑定 provider 相符；
- 账号 Cookie 在服务端仍有效；
- 账号接口返回的曲目确实属于该账号权限；
- 账号源失败时，`account_first` 可按设计回退，`account_only` 则应给出明确最终失败。

## 3. 链路拓扑与责任边界

```text
浏览器 / 桌面壳 / 移动壳
        |
        | HTTPS: site.shizuki.online
        v
Caddy/OpenResty（宿主机入口）
        |
        | 127.0.0.1:5173
        v
shizuki-site-frontend（Nginx 静态站点）
        |
        | /api/* -> backend:8080
        v
shizuki-site-backend（Spring Boot monolith）
        |
        +--> shizuki-site-meting-api:80
        |       +--> 网易云 / 酷我 / QQ 上游
        |
        +--> shizuki-site-music-ncm-api:3000
        |       +--> 网易云二维码登录与账号接口
        |
        +--> shizuki-site-music-web-auth-sidecar:39041
        |       +--> QQ/酷狗网页授权会话
        |
        +--> PostgreSQL：歌单、曲目、用户源配置
        +--> Redis：音乐首页与播放源缓存
        +--> Kafka/对象存储：缓存上传（非每次播放的前置条件）
```

不要混淆三类 URL：

- 页面入口 URL：用户浏览器访问的 `site.shizuki.online`；
- 产品 API URL：`/api/v1/music/...`，由 backend 负责；
- 上游媒体 URL：backend 按需解析后返回的短时地址，通常来自音乐平台域名。

## 4. 组件清单

| Compose 服务 | 容器名 | 作用 | 基本健康判据 |
|---|---|---|---|
| `site` | `shizuki-site-frontend` | 前端静态资源和 `/api/` 反代 | 根页面 200 |
| `backend` | `shizuki-site-backend` | 音乐 API、源策略、缓存与业务日志 | `/actuator/health` 为 `UP` |
| `meting-api` | `shizuki-site-meting-api` | 匿名搜索、歌单、曲目地址和歌词解析 | `/health` 可用且 provider 列表非空 |
| `music-ncm-api` | `shizuki-site-music-ncm-api` | 网易云二维码登录和账号 API | `/login/qr/key` 可响应 |
| `music-web-auth-sidecar` | `shizuki-site-music-web-auth-sidecar` | QQ/酷狗网页授权 | `/healthz` 可响应 |

关键仓库文件：

- 生产 Compose：`deploy/docker-compose.server.yml`
- 服务器私有环境：`deploy/.env.server`（不提交）
- 私有应用配置：`resouces/yaml/common-config.yaml`（不得回显秘密）
- 前端反代：`deploy/nginx.frontend.conf`
- 域名入口示例：`deploy/Caddyfile.snippet`
- Meting sidecar：`tools/meting-sidecar/`
- 网易云 sidecar：`tools/music-ncm-sidecar/`
- 网页授权 sidecar：`tools/music-web-auth-sidecar/`
- 后端音乐实现：`modules/media-module/`
- 前端音乐 API：`fronted/vue3-merged/src/services/musicApi.js`
- 播放引擎：`fronted/vue3-merged/src/composables/usePlayerEngine.js`
- 本手册配套检查：`deploy/scripts/check-music.ps1`

## 5. API 契约与人工复现

### 5.1 外部健康与元数据

```powershell
curl.exe -fsS --max-time 10 https://site.shizuki.online/actuator/health
curl.exe -fsS --max-time 10 https://site.shizuki.online/api/v1/music/meting/status
curl.exe -fsS --max-time 15 https://site.shizuki.online/api/v1/music/playlist/default/bundle
```

不要把第三条返回里的 `audio` 为空直接判为故障。它只用来取得 `provider` 和 `track_id`。

### 5.2 按需解析请求

后端启用了 snake_case JSON。直接用 curl/PowerShell 时必须发送 `track_id`、`playlist_code`、`resolve_lyric`、`force_refresh`；发送前端内部使用的 `trackId` 会得到 `400 track_id is required`。

请求形状：

```json
{
  "provider": "netease",
  "track_id": "<track-id>",
  "playlist_code": "default_public",
  "resolve_lyric": true,
  "force_refresh": true
}
```

正常响应必须有非空 `data.audio`。只记录音频域名；不要记录 `data.audio` 原值。

### 5.3 媒体字节探针

媒体平台可能不支持 HEAD，所以不要用 HEAD 作为唯一判据。使用 Range GET，并最多读取少量字节。配套 PowerShell 脚本通过 `ResponseHeadersRead` 在读取 1024 字节后释放连接，避免把整首歌下载到磁盘。

## 6. 标准诊断流程

### 阶段 A：收窄用户症状

至少记录以下非敏感信息：

- 发生时间（含时区）；
- 页面路径，如 `/music-library/music`、歌单详情或播放器详情；
- 匿名还是登录用户；
- provider 与 track id（不要完整音频 URL）；
- 所有曲目失败还是单曲失败；
- 第一次点击失败、第二次成功，还是始终失败；
- 页面提示、HTTP 状态和浏览器控制台错误码；
- Web、桌面壳还是移动壳。

分类原则：

- 单曲失败、多首其他曲目正常：优先考虑版权、地区、会员或单条缓存。
- 同一 provider 全部失败：优先考虑该 provider 上游、sidecar 或账号 Cookie。
- 所有 provider 都失败：优先考虑 backend、Meting、网关、部署版本或共享缓存。
- 只有桌面/移动壳失败：优先查 API Base、相对 URL 补全、WebView TLS/CORS。
- 只有登录用户失败：优先查账号源策略和绑定会话，不要先改匿名 Meting。

### 阶段 B：先运行外部端到端检查

```powershell
pwsh -File .\deploy\scripts\check-music.ps1
```

针对用户报告的已知曲目：

```powershell
pwsh -File .\deploy\scripts\check-music.ps1 -Provider netease -TrackId '<track-id>'
```

连续运行 3 次。如果结果不一致，按抖动故障处理：记录成功率、每次失败阶段和耗时，不要用一次成功覆盖失败。

### 阶段 C：浏览器侧检查

在 DevTools Network 中按 `music`、`resolve-playback` 或 `media` 过滤：

1. 页面是否请求 `/api/v1/music/library/home`；
2. 点击播放时是否发送 `/api/v1/music/tracks/resolve-playback`；
3. 请求体是否是 snake_case（Network 中看到的线上 JSON 应有 `track_id`）；
4. 响应中的 `audio` 是否非空；
5. 浏览器随后是否请求媒体域名；
6. 媒体请求是否 200/206，是否发生 HTTP 降级、CORS、证书、403 或 416；
7. Console 是否出现 mixed content、`NotAllowedError`、`MEDIA_ERR_SRC_NOT_SUPPORTED`；
8. 强制刷新/无痕窗口是否恢复。如果恢复，重点查 Service Worker、浏览器缓存和前端资源版本。

不要在截图或 HAR 中保留 Authorization、Cookie 和完整音频 URL。导出 HAR 前必须脱敏。

### 阶段 D：服务器只读检查

连接 `111.228.35.186` 后：

```bash
cd /opt/shizuki-site/deploy
docker compose -f docker-compose.server.yml --env-file .env.server ps
docker inspect --format '{{.Name}} status={{.State.Status}} health={{if .State.Health}}{{.State.Health.Status}}{{else}}none{{end}} restarts={{.RestartCount}}' \
  shizuki-site-frontend \
  shizuki-site-backend \
  shizuki-site-meting-api \
  shizuki-site-music-ncm-api \
  shizuki-site-music-web-auth-sidecar
```

期望：相关容器为 `running`，带 healthcheck 的容器为 `healthy`，重启次数没有持续增长。`healthy` 仍不能证明可播放，下一步必须测真实解析。

只查看窄时间窗、窄事件名：

```bash
docker logs shizuki-site-backend --since 20m --tail 500 2>&1 \
  | grep -E 'MUSIC_(RESOLVE_PLAYBACK|METING|SOURCE|LYRIC|LIBRARY_HOME)|Exception|ERROR|WARN'

docker logs shizuki-site-meting-api --since 20m --tail 200 2>&1
docker logs shizuki-site-music-ncm-api --since 20m --tail 200 2>&1
docker logs shizuki-site-music-web-auth-sidecar --since 20m --tail 200 2>&1
```

如果日志出现 URL、Cookie 或 Token，只在终端本地查看，不要原样复制到文档。持久记录仅写事件名、provider、track id、HTTP 状态和已脱敏原因。

### 阶段 E：安全检查运行配置是否存在

禁止使用 `docker inspect ... | grep MUSIC_` 直接展示值。使用下面的状态化输出：

```bash
docker inspect shizuki-site-backend --format '{{range .Config.Env}}{{println .}}{{end}}' \
  | awk -F= '$1 ~ /^(MUSIC_METING_BASE_URL|MUSIC_NCM_BASE_URL|MUSIC_WEB_AUTH_BASE_URL|MUSIC_WEB_AUTH_TOKEN|MUSIC_LISTEN_CACHE_STORAGE_MODE|MUSIC_LIBRARY_HOME_CACHE_ENABLED)$/ {print $1 "=" (length(substr($0,index($0,"=")+1)) ? "SET" : "EMPTY")}'

docker inspect shizuki-site-meting-api --format '{{range .Config.Env}}{{println .}}{{end}}' \
  | awk -F= '$1 == "METING_ALLOWED_PROVIDERS" {print $1 "=" (length(substr($0,index($0,"=")+1)) ? "SET" : "EMPTY")}'
```

这里的 `SET` 只说明变量非空，不说明值正确。需要比较秘密时只比较长度或哈希，绝不打印原值。

### 阶段 F：容器内部探针

Meting 自检：

```bash
docker exec shizuki-site-meting-api php -r '$b=file_get_contents("http://127.0.0.1/health"); $j=json_decode($b,true); echo json_encode(["available"=>$j["available"]??false,"providers"=>$j["providers"]??[]]), PHP_EOL;'
```

Meting 真实曲目解析（只输出是否有地址，不输出地址）：

```bash
docker exec shizuki-site-meting-api php -r '$u="http://127.0.0.1/v1/track/resolve?provider=netease&track_id=1367158056&bitrate=128"; $j=json_decode(file_get_contents($u),true); echo json_encode(["trackId"=>$j["trackId"]??"","audioPresent"=>!empty($j["audio"]),"lyricPresent"=>!empty($j["lyricText"])]), PHP_EOL;'
```

网易云登录 sidecar 自检：

```bash
docker exec shizuki-site-music-ncm-api node -e "fetch('http://127.0.0.1:3000/login/qr/key?timestamp=' + Date.now()).then(async r => console.log(JSON.stringify({status:r.status,ok:r.ok}))).catch(e => { console.error(e.name); process.exit(1) })"
```

网页授权 sidecar 自检：

```bash
docker exec shizuki-site-music-web-auth-sidecar node -e "fetch('http://127.0.0.1:39041/healthz').then(async r => console.log(JSON.stringify({status:r.status,ok:r.ok}))).catch(e => { console.error(e.name); process.exit(1) })"
```

如果 sidecar 内部成功、backend 外部失败，问题在 backend 配置、容器 DNS/网络、超时或业务策略；如果 sidecar 内部也失败，问题在 sidecar 或音乐平台上游。

## 7. 常见症状与优先假设

| 症状 | 优先检查 | 常见原因 | 不应先做 |
|---|---|---|---|
| 页面 404/白屏 | 入口、前端容器、静态资源、路由 fallback | 前端未部署、Nginx/Caddy 配置错误、资源 hash 失配 | 重启数据库 |
| 所有音乐 API 502/504 | backend、反代、8080 | backend 未启动、依赖启动阻塞、超时 | 清音乐缓存 |
| `meting/status` 不可用 | Meting health、backend DNS/URL | 容器不健康、base URL 配错、网络不通 | 修改用户 Cookie |
| 歌单有曲目但 `audio` 空 | 先调用 `resolve-playback` | 可能完全正常的惰性解析 | 直接改数据库 audio 字段 |
| `400 track_id is required` | 请求 JSON | 手工请求用了 camelCase `trackId` | 重启服务 |
| `resolve-playback` 500 | backend 窄日志、Meting 真解析 | 上游响应异常、超时、provider 不支持 | 全量重建所有服务 |
| 解析有 URL，但媒体 403/404 | Range GET、URL TTL、单曲对照 | 短时 URL 过期、上游签名/地区/版权 | 把完整 URL 写进 Issue |
| HTTPS 页面报 mixed content | 音频最终 scheme | 上游或缓存仍返回 HTTP | 放宽浏览器安全策略 |
| 只有一首歌失败 | 同 provider 其他曲目 | 版权、会员、下架、单条过期缓存 | 修改全局 provider 顺序 |
| 登录用户失败，匿名正常 | source mode、绑定状态、Cookie | Cookie 过期、account_only、会员权限 | 修改匿名 Meting |
| 第一次失败第二次成功 | `force_refresh`、缓存来源日志 | 通用缓存 URL 过期、前端恢复流程旧 | 增加无限重试 |
| 歌词空但音频正常 | `resolve_lyric`、lyric 日志 | 上游无歌词、解析失败、仅翻译轨 | 判定整个音乐服务宕机 |
| 首页歌单/曲目长期不更新 | Redis key 和定时刷新日志 | `music:library:home:v2` 陈旧、凌晨刷新失败 | `FLUSHALL` |
| 只有桌面/移动壳失败 | API Base、相对 URL 补全 | WebView 指向本地 bundle、TLS/CORS | 修改生产 Caddy |

## 8. 假设检验纪律

在改动服务器前列出 3～5 个可证伪假设。推荐格式：

> 如果 X 是原因，那么只改变/探测 Y 后，失败阶段应从 A 变为 B；若仍停在 A，则否定 X。

典型排序示例：

1. 如果前端部署版本没有实际发起 `resolve-playback`，那么 API 冒烟会绿、浏览器点击后 Network 中没有该 POST；强刷不能改变服务端结果。
2. 如果 Meting 真实解析失败，那么 `/health` 可能仍绿，但容器内 `/v1/track/resolve` 的 `audioPresent=false`；换两首同 provider 曲目仍失败。
3. 如果是单条过期缓存，那么 `force_refresh=true` 会恢复，而默认解析可能返回旧地址或媒体 Range 失败；其他曲目正常。
4. 如果是账号 Cookie 失效，那么匿名 Meting 冒烟会绿，只有登录账号源失败，账号接口返回登录/权限错误。
5. 如果是音乐平台单曲限制，那么站内各层和同 provider 其他曲目都绿，只有目标 track id 无地址或 403。

一次只改变一个变量。不要同时改 provider、重建 backend、清缓存和重新登录，否则即使恢复也无法知道原因。

## 9. 最小修复手册

### 9.1 单服务瞬时异常

先保存状态与最近日志，再只重启确认异常的服务：

```bash
cd /opt/shizuki-site/deploy
docker compose -f docker-compose.server.yml --env-file .env.server restart meting-api
docker compose -f docker-compose.server.yml --env-file .env.server ps meting-api backend
```

只在 backend 本身异常时重启 backend。重启后立即运行外部冒烟检查；无效则回到假设阶段，不要循环重启。

### 9.2 `.env.server` 配置错误

先备份：

```bash
cd /opt/shizuki-site/deploy
umask 077
cp -p .env.server ".env.server.bak.$(date +%Y%m%d-%H%M%S)"
```

只编辑已确认的键，不要整理或重排整个文件。然后只重建使用该键的服务：

```bash
docker compose -f docker-compose.server.yml --env-file .env.server up -d --no-deps --force-recreate meting-api
```

如果改的是 backend 的 `MUSIC_*_BASE_URL`、Token 或缓存策略，则目标改为 `backend`。任何非敏感默认值变更都必须同步回仓库 Compose 示例；秘密只留在 `.env.server`。

### 9.3 Meting provider 列表异常

默认 Compose 允许 `netease,kuwo,qq`。如果生产健康响应只列出部分 provider，先确认这是主动收缩还是误配置。只有用户确实需要缺失 provider 且该上游可用时，才修改 `METING_ALLOWED_PROVIDERS` 并重建 `meting-api`。

缺失 provider 不会解释“网易云默认曲目也不能播放”；不要把列表数量当作唯一根因。

### 9.4 音乐首页缓存陈旧

默认 key 是 `music:library:home:v2`。只在日志和响应证明首页缓存陈旧时删除这个精确 key；不得执行 `FLUSHALL`、`FLUSHDB` 或模糊批量删除。删除前记录 TTL、类型和内容哈希（不要记录内容），删除后让 backend 重建并验证。

如果当前环境不能在不暴露 Redis 口令的情况下安全执行精确删除，应停止并使用已有管理入口或私密运维会话，不要把口令拼进命令历史。

### 9.5 账号源 Cookie 失效

- 让用户通过既有二维码/网页授权流程重新绑定；
- 只检查 Cookie 是否存在、更新时间和账号接口状态，不导出 Cookie；
- `account_first` 失败应观察是否回退；
- `account_only` 不应被偷偷改成匿名源以掩盖授权问题；
- 不得把自己的账号 Cookie 写入系统级默认配置。

### 9.6 前端部署版本或浏览器缓存错误

对比线上 `index.html` 引用的资源 hash、服务器前端容器创建时间与本地预期构建。确认服务端旧版本后，按标准部署脚本发布已提交代码；不要手工替换单个 minified JS。

仅用户浏览器旧缓存时，优先使用无痕窗口、强制刷新和清理站点缓存。不要通过取消所有静态缓存长期规避版本治理。

### 9.7 上游版权、地区或会员限制

若同 provider 其他曲目正常、目标曲目持续无地址或 403，记录为上游限制。可提供合法可播放替代曲目、明确用户提示或要求具备权限的账号绑定；不得伪造成功、抓取绕过地址或无限重试。

## 10. 回滚

### 环境配置回滚

1. 找到本次变更前创建的确切备份文件；
2. 用 `diff` 在服务器本地确认只涉及预期键，不把 diff 复制到外部；
3. 恢复 `.env.server` 权限和内容；
4. 只重新创建受影响服务；
5. 重跑冒烟检查。

示意命令（把文件名替换为本次明确记录的备份，禁止使用不经核对的通配符）：

```bash
cp -p /opt/shizuki-site/deploy/.env.server.bak.YYYYMMDD-HHMMSS /opt/shizuki-site/deploy/.env.server
cd /opt/shizuki-site/deploy
docker compose -f docker-compose.server.yml --env-file .env.server up -d --no-deps --force-recreate meting-api
```

### 镜像/代码回滚

优先回滚到已知本地 Commit 和对应镜像。不要使用 `git reset --hard`，不要覆盖服务器的 `.env.server` 和 `data/`。标准部署脚本本来就保护这两个路径；手工部署也必须保护。

## 11. 修复验收清单

- [ ] 原始 `check-music.ps1` 命令从同一失败阶段转为 `[PASS] result=music-playable`。
- [ ] 连续运行至少 3 次一致通过，或已记录上游抖动率。
- [ ] 用户报告的具体 provider/track id 已单独验证。
- [ ] 媒体 Range 请求返回 200/206 且读取到字节。
- [ ] HTTPS 页面没有 HTTP 媒体或 HTTP 降级重定向。
- [ ] 浏览器点击实际触发 `resolve-playback` 和媒体请求。
- [ ] backend/Meting 最近日志没有持续错误或重启循环。
- [ ] 没有打印、提交 Cookie、Token、口令或完整临时 URL。
- [ ] 只修改了已确认的服务/配置，回滚路径明确。
- [ ] 非敏感持久修复已经回写仓库并通过测试、构建和 OpenSpec 校验。

## 12. 事故记录模板

```markdown
### YYYY-MM-DD 音乐播放事件

- 用户症状：
- 影响范围：匿名/登录、provider、单曲/全量、Web/桌面/移动
- 首次红灯命令：`pwsh -File .\deploy\scripts\check-music.ps1 ...`
- 首次失败阶段：
- 排序假设：
- 已执行只读探针：
- 已确认根因：
- 最小修复：
- 服务器备份/回滚标识（不得含秘密）：
- 绿色证据：连续次数、HTTP 阶段、media host/status/bytes
- 回归保护：测试、脚本、文档或配置默认值
- 遗留风险：
```

## 13. 2026-08-24 本次事件

- 用户症状：音乐部分似乎链接不上。
- 外部入口：`site.shizuki.online` 解析到 `111.228.35.186`，根页面 200。
- backend：`/actuator/health` 为 `UP`。
- Meting：公开状态为可用，当前公开 provider 列表包含 `netease`。
- 默认歌单：返回曲目元数据；其中空 `audio`/`lyric` 属于惰性解析，不能单独作为故障证据。
- 首次红灯：`deploy/scripts/check-music.ps1` 在 `stage=resolve-playback` 失败，原因是 HTTPS 站点收到 HTTP 媒体地址。
- 只读服务器证据：相关容器均为 running，三个音乐 sidecar 为 healthy，重启次数为 0；Meting 容器直接解析默认曲目及另外两首网易云曲目时均为 `audioPresent=true`、`scheme=http`。
- 排除项：`force_refresh=true` 仍得到 HTTP，因此不是单纯旧播放缓存；三首不同曲目均为 HTTP，因此不是单曲版权问题；sidecar 原始输出已经是 HTTP，因此不是前端凭空改写。
- 已确认根因：上游 Meting 返回可用但使用 `http://` 的媒体地址，Meting sidecar 和 backend 原样返回。浏览器从 `https://site.shizuki.online` 播放时会把它视为混合内容，导致链接看似存在却无法安全加载。
- 修复决策：在 `tools/meting-sidecar` 的播放 URL 边界把 `http://` 和协议相对媒体地址规范化为 HTTPS，只改变 scheme，保留 host/path/query/fragment；不修改歌单数据、不清 Redis、不改账号 Cookie。
- 修复前安全验证：把同一默认曲目的 scheme 改为 HTTPS 后，媒体主机返回 `206 audio/mpeg` 并可读取 1024 字节，证明该资源支持 HTTPS。
- 独立遗留观察：backend 持续报告 Kafka `host.docker.internal:9092` 不可达，可能影响音乐缓存上传消费，但不在本次混合内容故障的因果链内，应另建事项处理。
- 服务器备份：`/opt/shizuki-site/data/ops-backups/music-http-mixed-content-20260824`，权限已限制为仅所有者可读写。
- 旧镜像回滚标签：`shizuki-site/meting-api:rollback-mixed-content-20260824`。
- 生产修复：只重建并替换 `meting-api`；backend、前端、数据库、Redis、NCM 与网页授权 sidecar 均未重启。
- 修复后容器：`shizuki-site-meting-api` 为 running/healthy、重启数 0；容器内默认曲目解析为 `audioPresent=true`、`scheme=https`。
- 绿色证据：原始 `check-music.ps1` 完整连续通过 3 次，每次播放解析均返回 HTTPS 媒体域名，Range 请求均为 `206 audio/mpeg` 并读取 1024 字节。
- 本次精确回滚：在服务器执行 `docker tag shizuki-site/meting-api:rollback-mixed-content-20260824 shizuki-site/meting-api:latest`，然后在 `/opt/shizuki-site/deploy` 执行 `docker compose -f docker-compose.server.yml --env-file .env.server up -d --no-deps --force-recreate meting-api`，最后重跑冒烟检查。若还要恢复服务器源码，使用上述备份目录中的确切相对路径逐文件恢复，不得删除整个项目目录。
