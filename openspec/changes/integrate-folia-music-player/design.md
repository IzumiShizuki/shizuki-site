# Design: 接入 Folia 全屏歌词音乐播放器

## 决策

| 决策点 | 选择 | 理由 |
|---|---|---|
| 部署形态 | 官方 Docker 镜像栈（`papersman/folia-*`） | 无需源码、官方维护、Compose 一键拉起 |
| 接入方式 | 独立子域名反代（`music.shizuki.online`） | 与主站隔离，AGPL 传染面最小，全屏 UI 完整 |
| 音源 | 网易云复用现有 `music-ncm-api`；酷狗/QQ 用官方镜像 | 少跑容器、复用已验证的网易云 cookie/登录链 |
| 主站入口 | 导航外链 | 无需改动组件，避免 iframe 破坏全屏沉浸式布局 |
| Sync Server | 本期不部署 | 非核心，可后续按官方 guide 补充 |

## 部署拓扑（111.228.35.186）

```
Caddy (music.shizuki.online)
   └── 127.0.0.1:18080 ── folia gateway (nginx:8080)
                          ├── backend (folia-web-api:3000)
                          ├── netease-api (:3000)      ← 可选改用现有 music-ncm-api
                          ├── kugou-api (:3000)
                          └── qq-api (:3000)           ← 需 QQ_SESSION_SECRET
```

- 仅 gateway 与 Sync 端口对外；内部服务仅在 Docker 网络内互访（官方 compose 已隔离）。
- 网易云若复用现有实例，则调整 `VITE_NETEASE_API_BASE` 指向已有容器地址并在其网关放行 Folia 来源 CORS。

## 配置清单（.env）

```env
FOLIA_IMAGE_NAMESPACE=papersman
FOLIA_STACK_VERSION=latest
FOLIA_SYNC_VERSION=latest
SYNC_TOKEN=<openssl rand -hex 32>          # 本期不部署 sync，可留空
FOLIA_HTTP_BIND=127.0.0.1                   # 只让 Caddy 访问
FOLIA_HTTP_PORT=18080
VITE_NETEASE_API_BASE=http://netease-api:3000   # 或复用现有实例地址
VITE_KUGOU_API_BASE=                        # 空=内置
VITE_QQ_API_BASE=/api/qq                    # 或留空；填了需 QQ_SESSION_SECRET
QQ_SESSION_SECRET=<随机长字符串>
# AI（可选）
FOLIA_AI_PROVIDER=openai
OPENAI_API_URL=https://api.deepseek.com
OPENAI_API_KEY=<deepseek key>
OPENAI_API_MODEL=deepseek-v4-pro
```

## 主站入口（vue3-merged）

在导航配置（首页/顶栏）新增一项：

```js
{ label: 'Folia 音乐', href: 'https://music.shizuki.online', external: true }
```

具体挂载位置以实现会话按 `src/` 导航结构确认（推荐放在「音乐」附近或独立入口）。

## 验证

- `docker compose ps` 全部 healthy；`curl http://127.0.0.1:18080/healthz` 200。
- 浏览器访问 `https://music.shizuki.online`：搜索/播放/全屏歌词/主题切换正常。
- 网易云登录（复用现有 cookie 链）；QQ 登录（设备码/扫码）可选。
- 主站导航入口可达、新标签页打开。

## 回滚

- 删除 `music.shizuki.online` Caddy 规则 + `docker compose down`；主站导航移除入口。不影响现有站点容器。
