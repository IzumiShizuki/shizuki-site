# Folia 音乐播放器部署 Runbook

> 关联 OpenSpec change：`integrate-folia-music-player`
> 服务器：`111.228.35.186`（Shizuki 个人站点，1Panel openresty 反代）
> 上游：https://github.com/chthollyphile/folia-major（AGPL-3.0）

## 架构总览

```
浏览器 → site.shizuki.online/#/music-library/music
        → 「Folia 沉浸模式」tab → iframe 同源嵌入 site.shizuki.online/music/*
  → openresty:
      location ^~ /music/     → rewrite 去前缀 → 127.0.0.1:18081
      location ^~ /netease/   → 根路径（Folia 前端内部 API 调用）→ 127.0.0.1:18081
  → folia-gateway (nginx:8080, 仅 127.0.0.1:18081 暴露)
      ├── /netease/ → shizuki-site-music-ncm-api:3000（现有容器，shizuki-site_default 网络）
      ├── / → dist 静态资源（vite base=/music/）
```

- 端口：`18081`（官方默认 18080 被 meguri-staging 占用）
- gateway 加入 `shizuki-site_default` external 网络以访问现有网易云 API 容器
- Folia 前端对网易云 API 的调用是**根路径** `/netease/...`（`VITE_NETEASE_API_BASE=/netease` 构建时注入），因此 openresty 必须同时反代 `/music/`（带前缀页面）与 `/netease/`（根路径 API）

## 服务器文件布局

| 路径 | 用途 |
|---|---|
| `/opt/folia/folia-major-main/` | Folia 源码（含补丁） |
| `/opt/folia/deploy/` | 构建文件（compose / Dockerfile / nginx 模板 / entrypoint） |
| `/opt/folia/deploy/compose.yaml` | 自定义 compose（gateway + external 网络） |
| 镜像 `folia-local/gateway:0.7.7-music` | Folia gateway 构建产物 |

## 补丁记录（相对上游 main）

1. **`src/vite.config.ts`**：`base` 支持 `VITE_BASE_PATH` 环境变量
   ```ts
   base: process.env.ELECTRON === 'true' ? './'
     : (process.env.VITE_BASE_PATH ? process.env.VITE_BASE_PATH.replace(/\/+$/, '') + '/' : '/'),
   ```
2. **`src/shizukiExternalBridge.ts`**（新增）：外部控制桥（cookie 同步 / play-track / get-status），源码见 `third_party/folia-major/`
3. **`src/index.tsx`**：挂载桥
4. **`deploy/docker/gateway/nginx.conf.template`**：netease 反代指向 `shizuki-site-music-ncm-api:3000`（而非官方 netease-api 容器）；移除 kugou/qq/backend（未部署）
5. **`deploy/docker/images/gateway.Dockerfile`**：新增 `ARG VITE_BASE_PATH=/music` + `ENV VITE_BASE_PATH=${VITE_BASE_PATH}`

## 部署步骤（新环境）

```bash
# 1. 下载源码（gh-proxy 代理 GitHub）
cd /opt/folia
curl -fLo src.zip "https://gh-proxy.com/https://github.com/chthollyphile/folia-major/archive/refs/heads/main.zip"
unzip src.zip && mv folia-major-main folia-major-main

# 2. 应用补丁（见上方清单；npm 依赖需将 package-lock.json 中
#    MakcRe/KuGouMusicApi 的 github URL 改为 gh-proxy 前缀）

# 3. 准备基础镜像（Docker Hub 不可达，用 daocloud 加速并 retag）
docker pull m.daocloud.io/docker.io/library/node:24-alpine && docker tag ... node:24-alpine
docker pull m.daocloud.io/docker.io/library/nginx:1.29-alpine && docker tag ... nginx:1.29-alpine

# 4. 构建并启动（compose.yaml 见本目录）
cd /opt/folia/deploy
docker compose -f compose.yaml build gateway
docker compose -f compose.yaml up -d
curl http://127.0.0.1:18081/healthz   # 期望 {"ok":true,...}

# 5. openresty 反代（/opt/1panel/www/conf.d/10-shizuki-migration.conf）
#    在 site.shizuki.online 与 shizuki.online 的 443 server 块加：
#    location ^~ /music/ { rewrite ^/music/?(.*)$ /$1 break; proxy_pass http://127.0.0.1:18081; ... }
#    location ^~ /netease/ { proxy_pass http://127.0.0.1:18081; ... }
docker exec openresty nginx -t && docker exec openresty nginx -s reload
```

## 升级 Folia

```bash
# 重下 main 源码 → 重放补丁 1/2/3/4/5 → 重新构建 gateway → up -d
# 前端互通代码在 vue3-merged 仓库（MusicLibraryPage.vue 等），随主站前端一起发布
```

## 回滚

- 前端：还原 `MusicLibraryPage.vue` / `MusicLibraryHomeView.vue` / `musicApi.js` / `TopMenu.vue` / `global.css`，重建 `shizuki-site/site:latest`
- 反代：移除 `/music/` 与 `/netease/` location + reload
- Folia：`docker compose down`（不清卷，可再拉起）
- 服务器配置备份：`10-shizuki-migration.conf.bak-folia-*`

## 已知边界

- 酷狗 / QQ 音源、AI 主题生成（backend `/api/`）未部署——需要时构建对应官方镜像并恢复 gateway nginx location
- VIP/版权受限歌曲需登录（匿名状态返回可读错误）
- AGPL-3.0：修改随 `third_party/folia-major/` 公开；`vue3-merged` 仅含 iframe/postMessage 对外集成，未引入 Folia 业务代码