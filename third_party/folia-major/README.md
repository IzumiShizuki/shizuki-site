# Folia (folia-major) AGPL-3.0 本地构建与修改说明

本目录记录对上游 [chthollyphile/folia-major](https://github.com/chthollyphile/folia-major)
（AGPL-3.0）的**部署期修改**，用于 Shizuki 站点内嵌 Folia 沉浸式音乐播放器。

## 修改内容

对上游仓库的修改共两处（均为最小化、非业务逻辑改动）：

1. **`src/vite.config.ts`**：`base` 一行改为读 `VITE_BASE_PATH` 环境变量
   （默认 `/`，不破坏上游行为），使构建产物可挂载到子路径 `/music/`。
2. **`src/index.tsx`**：挂载本目录的 `shizukiExternalBridge.ts`（外部控制桥）。

桥接协议以站点播放器为唯一音频输出：`shizuki:follow-playback` 同步曲目与播放态，
`shizuki:sync-clock` 提供定期校准，Folia 在两次校准之间以 rAF 连续投影歌词时钟；
Folia 的播放/暂停操作通过 `shizuki:playback-command` 回传站点。主站歌单与 lattice
批量入口也必须先更新主站队列，不能调用 Folia 自有的 `play-track` / `play-tracks`。

## AGPL-3.0 合规

- Folia 上游为 AGPL-3.0，本部署**未并入** `fronted/vue3-merged` 私有仓库，
  以独立 Docker 镜像（`folia-local/gateway`）运行。
- 对 Folia 的全部修改随本目录公开（同 AGPL-3.0 分发），
  上游源码可自行 `git clone https://github.com/chthollyphile/folia-major` 获取。
- 桥文件 `shizukiExternalBridge.ts` 全文见本目录，注释内已声明来源与许可证。

## 部署位置（服务器 111.228.35.186）

- 源码：`/opt/folia/folia-major-main`
- 构建文件：`/opt/folia/deploy/`
- 镜像：`folia-local/gateway:0.7.7-music`
- 反向代理：1Panel openresty `location /music/` → `127.0.0.1:18081`
