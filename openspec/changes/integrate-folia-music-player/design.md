# Design: 接入 Folia 全屏歌词音乐播放器

## 决策

| 决策点 | 选择 | 理由 |
|---|---|---|
| 部署形态 | **本地源码构建镜像**（官方 `papersman/folia-*` 镜像在 Docker Hub 不可达，多加速器均 not found） | 实测可行：gh-proxy 下载源码 + npm ci + vite build 在 node:24-alpine 容器内成功 |
| 接入方式 | 主域名子路径 `https://shizuki.online/music/`（1Panel openresty 反代） | 用户明确不要新域名/DNS，路由访问即可 |
| 子路径 | vite 构建注入 `VITE_BASE_PATH=/music`（上游 vite.config.ts 的 `base` 一行改为读环境变量） | 所有资源/API 路径自动带 `/music/` 前缀 |
| 网关 | 官方 gateway Dockerfile 构建（nginx:1.29-alpine），仅保留根路径 + `/netease/` location | 最小化：酷狗/QQ/backend（AI 主题）未部署，后续需要再加 |
| 音源 | 网易云**复用现有 `shizuki-site-music-ncm-api` 容器**（gateway 加入 `shizuki-site_default` external 网络） | 少建镜像、复用已验证实例 |
| 主站入口 | 本次不改 vue3-merged 导航（用户直接用路由访问） | 可后续按需加外链 |

## 部署拓扑（111.228.35.186）

```
浏览器 → https://shizuki.online/music/*
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

## 验证

- `curl https://shizuki.online/music/` → 200，HTML 资源均带 `/music/` 前缀。
- headless Edge 加载 179 chunks + PWA SW 注册成功（截图 207KB 确认 UI 渲染）。
- 网易云经 `/music/netease/`：搜索 200（277 结果）、歌词 200、二维码登录 unikey 200。
- 播放：免费/已登录歌曲可播放；VIP/版权受限歌曲需登录（与官方行为一致）。

## 回滚

- 移除 openresty `location /music/` 块 + reload；`docker compose down`（在 /opt/folia/deploy）。不影响现有站点容器。
- 服务器配置备份：`/opt/1panel/www/conf.d/10-shizuki-migration.conf.bak-folia-*`。
