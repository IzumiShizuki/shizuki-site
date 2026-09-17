# Design: 接入 Folia 全屏歌词音乐播放器

## 决策

| 决策点 | 选择 | 理由 |
|---|---|---|
| 部署形态 | **本地源码构建镜像**（官方 `papersman/folia-*` 镜像在 Docker Hub 不可达，多加速器均 not found） | 实测可行：gh-proxy 下载源码 + npm ci + vite build 在 node:24-alpine 容器内成功 |
| 接入方式 | 主域名子路径 `https://shizuki.online/music/`（1Panel openresty 反代）；**site.shizuki.online 同步加 `/music/` 同源反代**供前端 iframe 嵌入 | 用户明确不要新域名/DNS，路由访问即可 |
| 子路径 | vite 构建注入 `VITE_BASE_PATH=/music`（上游 vite.config.ts 的 `base` 一行改为读环境变量） | 所有资源/API 路径自动带 `/music/` 前缀 |
| 网关 | 官方 gateway Dockerfile 构建（nginx:1.29-alpine），仅保留根路径 + `/netease/` location | 最小化：酷狗/QQ/backend（AI 主题）未部署，后续需要再加 |
| 音源 | 网易云**复用现有 `shizuki-site-music-ncm-api` 容器**（gateway 加入 `shizuki-site_default` external 网络） | 少建镜像、复用已验证实例 |
| 主站入口 | **music 页面内模式切换**：`MusicLibraryPage.vue` 顶部「普通模式 / Folia 沉浸模式」tab，Folia 模式同源 iframe 嵌入 `/music/`（localStorage key `shizuki.music.foliaMode` 持久化） | 用户要求 Folia 结合进 `site.shizuki.online/#/music-library/music` 路由，而非独立应用 |

## 部署拓扑（111.228.35.186）

```
浏览器 → site.shizuki.online/#/music-library/music（普通模式）
        → 切换「Folia 沉浸模式」→ iframe 加载 site.shizuki.online/music/*
  → 1Panel openresty: location ^~ /music/ { rewrite ^/music/?(.*)$ /$1 break; proxy_pass 127.0.0.1:18081; }
  → folia-gateway (nginx:8080, 仅 127.0.0.1:18081 暴露)
      ├── /netease/ → shizuki-site-music-ncm-api:3000（现有容器，shizuki-site_default 网络）
      └── / → dist 静态资源（vite base=/music/）
```

- 端口 `18081`（`18080` 已被 meguri-staging-core-1 占用）。
- 构建文件：`/opt/folia/deploy/{compose.yaml,gateway.Dockerfile,nginx.conf.template,entrypoint.sh}`；源码 `/opt/folia/folia-major-main`。
- 镜像：`folia-local/gateway:0.7.7-music`。

## 环境变量（构建期）

```env
VITE_BASE_PATH=/music
VITE_NETEASE_API_BASE=/netease        # gateway 内 location /netease/ 反代现有 ncm
FOLIA_AI_PROVIDER=google               # 未部署 backend，AI 主题暂不可用
```

## 账号与歌曲互通（同源 iframe + postMessage）

**账号互通（网易云）**：
- 后端新增 `GET /api/v1/me/music/source-accounts/{provider}/cookie`（`MediaService.getMySourceAccountCookie`，复用已有 `getSourceAccountCookiePlaintext`，仅限当前登录用户）。
- 前端切到 Folia 模式时 `authorizedFetch` 拉取 cookie → 通过 `shizuki:sync-cookie` postMessage 写入 iframe 的 `localStorage.netease_cookie`。
- Folia 的 `fetchWithCreds` 每次请求实时读 `netease_cookie` 并作为 `?cookie=` 参数 → 两套播放器共享同一网易云登录态。

**歌曲互通（双向）**：
- Folia 侧新增 `src/shizukiExternalBridge.ts`（AGPL 公开，见 `third_party/folia-major/`）：监听 `shizuki:play-track` → `neteaseApi.getSongDetail` + `getSongUrl` 解析 → `usePlaybackStore` 设置 currentSong/audioSrc 播放；监听 `shizuki:get-status` → 回传 `shizuki:status`（含 `window.__folia_current_time` 进度）。
- 前端侧：`MusicLibraryPage.vue` 监听 `shizuki:play-in-folia` 事件与 iframe 消息；`MusicLibraryHomeView.vue` 歌曲行新增「用 Folia 沉浸模式播放」按钮（幽灵图标）→ 一键切 Folia 模式并传歌。
- 当前歌曲切换：`pushCurrentTrackToFolia()` 在切模式/iframe 加载完成时把普通模式当前曲目带给 Folia。

## 验证

- `curl https://shizuki.online/music/` 与 `https://site.shizuki.online/music/` → 200，HTML 资源均带 `/music/` 前缀。
- headless Edge 加载 179 chunks + PWA SW 注册成功（截图 207KB 确认 Folia UI 渲染）。
- 网易云经 `/music/netease/`：搜索 200（277 结果）、歌词 200、二维码登录 unikey 200。
- 前端集成验证：`MusicLibraryPage` chunk 含「Folia 沉浸模式」「shizuki:play-track」「syncCookieToFolia」；`MusicLibraryHomeView` chunk 含「用 Folia 沉浸模式播放」。
- 后端 cookie 端点：`GET /api/v1/me/music/source-accounts/netease/cookie` 未认证 401（鉴权正确）。
- 播放：免费/已登录歌曲可播放；VIP/版权受限歌曲需登录（与官方行为一致）。

## 回滚

- 前端：移除 `MusicLibraryPage.vue` 的 Folia 模式代码，重建 `shizuki-site/site:latest` 重启容器。
- 反代：移除 openresty `location /music/` 块 + reload；`docker compose down`（在 /opt/folia/deploy）。不影响现有站点容器。
- 服务器配置备份：`/opt/1panel/www/conf.d/10-shizuki-migration.conf.bak-folia-*`。

## 无缝切换稳定化

- **唯一音频所有者**：普通模式的 `usePlayerEngine.audioElement` 始终负责真实声音输出。切入 Folia 时不暂停、不重建、不重新解析同一首歌；Folia 仅接收 `shizuki:follow-playback` 曲目快照与时钟锚点。
- **播放入口收敛**：Folia 工具栏歌单与 lattice 批量入口先更新站点播放队列，再发送 `follow-playback`；切回普通模式只停止 Folia 跟随，不向 Folia 拉取状态或重新播放。
- **双树常驻**：普通 Vue 音乐工作区和 Folia React 工作区都保持挂载，通过 `visibility`、`opacity`、`pointer-events` 与 `inert` 切换可见性。隐藏普通模式时暂停播放条频谱循环，隐藏 Folia 时停止跟随时钟与播放态动画。
- **首次交接一致性**：桥尚未就绪时保存完整 `{ track, trackId, positionMs, playing }` 快照；桥就绪后仍发送 `follow-playback`，禁止退回会创建第二音频源的 `play-track`。
- **平滑视觉时钟**：站点每 250ms 发送校准锚点，Folia 在两次校准之间使用 `requestAnimationFrame` 连续投影进度与歌词行，避免 200ms 跳帧感。Folia 播放/暂停按钮通过 `shizuki:playback-command` 反向控制站点播放器。
- **跨路由保温**：离开音乐页前把 `#folia-embed-root` 移入全局隐藏 parking 容器，返回时直接搬回当前 host，保持 React 树、资源缓存和音频元素身份，不重新执行主 bundle。
- **加载去重**：runtime config、入口 HTML、module preload、主脚本执行和 React mount 各自由单例 Promise 管理；普通模式首屏完成后才在浏览器 idle 时后台预热，避免与首屏数据加载争抢主线程。
- **移动端布局**：窄屏为全局顶部导航和模式开关预留固定空间，Folia 同步/状态命令收为图标按钮，工具栏不横向溢出。

## 权威播放会话（2026-09-17）

此前 `follow-playback` 只交付了曲目与时钟；Folia 因而会自行通过网易云补全曲目、歌词及队列，并保留自身媒体元素。这会造成封面、文本、歌词焦点和队列漂移，也可能产生第二路声音。

- **唯一真源**：`usePlayerEngine` 的状态和 `audioElement` 是唯一权威。Folia 在 embed/follow 模式不调用音源解析、歌词加载或 Folia 自有播放入口。
- **原子快照**：主站以单个带单调递增 `version` 的 `session` 发送 `track`、`queue`、`playlist`、`lyrics`、`lyricRenderMode`、`lyricIndex`、`positionMs`、`durationMs` 和 `playing`。Folia 忽略版本较旧的快照，避免异步结果回写旧曲目。
- **渲染映射**：Folia 将主站曲目、队列和歌词时间线映射为自己的展示 store；歌词行使用主站的已解析时间线，逐词时间存在时一并保留，绝不再为跟随会话请求 provider 歌词。
- **音频锁**：进入跟随会话或收到快照时，遍历 embed 根节点内的全部 `<audio>`，暂停、移除 `src` 并 `load()`；同时注册捕获阶段 `play` 监听，阻止 Folia 内部媒体恢复输出。
- **控制方向**：Folia 的选歌仅发送播放意图；播放、暂停、拖动、上一首、下一首仅发送命令。主站执行后立即推送新完整快照，Folia 不以本地状态作为回传真源。

## 普通模式音频交付稳定化

- **站内交付 URL**：`resolve-playback` 保留现有上游解析与缓存逻辑，但在控制器返回前把第三方 `audio` 地址换成 `/api/v1/music/tracks/stream/{capability}`。前端播放器与 Folia 跟随协议无需感知上游 CDN。
- **短时加密 capability**：令牌使用现有媒体网关密钥派生独立 AES-GCM key，密文仅包含上游 URL、版本和过期时间；篡改、过期、非规范编码均拒绝，避免形成任意 URL 开放代理。
- **Range 透传**：流式交付转发单段 `Range` 请求，并把 `200/206`、`Content-Range`、`Content-Length`、`Content-Type` 和 `Accept-Ranges` 返回给浏览器，支持首播、续播和拖动进度。
- **出站边界**：仅允许 `http/https`，拒绝凭据、片段、非标准端口、localhost、私网/链路本地 IP 和内部域名；重定向逐跳重新校验。
- **失败自愈协作**：若上游流仍失效，现有播放器恢复逻辑会强制刷新 `resolve-playback`，从而获得新的 capability 与上游地址后重试。
