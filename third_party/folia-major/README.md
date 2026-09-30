# Folia（folia-major）AGPL-3.0 本地构建与修改说明

本目录公开 Shizuki 对上游 [chthollyphile/folia-major](https://github.com/chthollyphile/folia-major)
（AGPL-3.0）的修改，用于站点内嵌 Folia 沉浸式音乐播放器。

## 同步基线

- 上游稳定版本：`v0.7.11`，commit `6fe68d89`。
- Shizuki fork：`folia-embed` 分支，合并 commit `fa4b6714`，后续兼容修复 commit `69a97532`。
- 完整 fork 差异：[`shizuki-folia-v0.7.11.patch`](shizuki-folia-v0.7.11.patch)，包含后续修复，已验证可应用到干净的上游 v0.7.11 checkout。
- 本目录的桥接、bootstrap、可视化器与回归测试快照来自已合并源码。旧的 `embedded-history-isolation.patch` 保留作早期嵌入历史补丁参考；当前 fork 差异以完整 v0.7.11 patch 为准。

上游 v0.7.9–v0.7.11 增加歌词导入导出、本地歌词格式优先级、歌词视频层、Folium 1.3 模组 API、「绘光」Lumiere 可视化、窗口全屏按钮及歌单切换动画，并修复 Lumiere 字形纹理清空和思索（Ponder）教程重复弹出问题。

## Shizuki 修改

完整修改列表以 patch 为准，主要包括：

1. **`vite.config.ts`**：`base` 支持 `VITE_BASE_PATH` 环境变量，默认 `/`，使构建产物可挂载到 `/music/`。
2. **`src/index.tsx` 与 `src/shizukiExternalBridge.ts`**：加载外部控制桥。站点播放器是唯一音频输出；桥接完整曲目、队列、解析歌词、歌词焦点、播放状态与连续歌词时钟。嵌入态会清空并暂停 Folia 自有 `<audio>`，拦截其播放，并把选曲/控制请求回传主站。
3. **`src/bootstrap.tsx` 与 `src/components/app/AppShell.tsx`**：支持 `?embed=1` 或 `#folia-embed-root`，挂载到父页面的播放器容器并切到 player 视图；嵌入态跳过 Folium 客户端和本地封面运行时的独立窗口初始化，保持快速切换。
4. **Cadenza 可视化器**：长歌词换行时保留 `pretext` 逐行居中布局，避免把单个汉字提为焦点后令其余文字碰撞散开。回归测试为 `test/unit/cadenzaWrappedLyrics.test.ts`。
5. **网关与依赖源**：保留站点网易云 API 反代与未部署服务的路由边界；KuGou tarball 在 `package.json` 和 lockfile 中统一通过 `gh-proxy.com` 获取。

网易云登录态以 Folia 当前的 `online_provider:netease:cookie` 为主键，桥仍双写并监听旧版 `netease_cookie`，以兼容历史部署且不让旧数据库凭据覆盖新登录态。

## AGPL-3.0 合规

- Folia 上游为 AGPL-3.0，本部署保持 Folia 独立运行于 `folia-local/gateway`，没有把 Folia 业务代码并入 `fronted/vue3-merged`。
- 本目录公开完整上游差异 patch 及主要修改源码快照；上游源码可从 GitHub 获取。
- 桥文件中的来源与许可证声明随源码保留。

## 部署状态（服务器 111.228.35.186）

- 源码：`/opt/folia/folia-major-main`，`folia-embed` 分支已合并到 v0.7.11。
- 合并提交：`fa4b6714`。
- 桥接类型兼容修复：`69a97532`（`Album.coverUrl`）。
- 当前生产镜像仍为 `folia-local/gateway:0.7.7-music`；本次源代码同步未构建、未部署，也未重启服务。
- 反向代理：1Panel openresty `location /music/` → `127.0.0.1:18081`。
