# Folia（folia-major）源码与本地构建

本目录公开站点内嵌 Folia 的修改。上游 [chthollyphile/folia-major](https://github.com/chthollyphile/folia-major) 为 AGPL-3.0，基线 **v0.7.11 / `6fe68d89`**。

## 当前对应源码

- 用户 fork：[IzumiShizuki/folia-major](https://github.com/IzumiShizuki/folia-major)，分支 `codex/unify-folia-workspace`。
- 本次字幕色实现及源码 tip：`c755facfe0d2fb53303aefc977d41f72375e2e07`；当前线上基线为 `7069103b4ce862f0e1f8befde5c48dbe778777f4`，部署验收进度见本次报告。
- 完整差异：[`shizuki-folia-v0.7.11.patch`](shizuki-folia-v0.7.11.patch)，**305,683 bytes; SHA-256 `880e88ade4d0173d88d6978210541e5dd192fbed3ef8bed786fe428fd571bed0`; `76` changed files**。可应用到干净 `6fe68d89`，已实际应用并逐项核对全部目标 Git blob。
- 本目录 **57 个 TS/TSX 源码及测试快照**与完整 fork 逐字节一致；桥快照 `shizukiExternalBridge.ts` 对应 fork 的 `src/shizukiExternalBridge.ts`。
- 完整 fork 的本地目录 `D:\program\_codex_deploy\folia-major-v0.7.8-upstream` 保留旧目录名，实际基线为 v0.7.11。旧 `embedded-history-isolation.patch` 仅作历史参考。

## 主要修改

1. `/music/` 构建 base、同文档嵌入 bootstrap 和外部桥。主站是唯一音频输出，Folia 自有音频清空并暂停；选曲、暂停、seek 等意图交给主站。连续歌词时钟和内容指纹避免时钟更新重挂歌词。
2. 嵌入工作区使用有界内存导航，保留当前歌单返回上下文，不修改主站 URL/history。完整歌单播放交接整个有序队列及来源；墙选曲使用准确槽位，快捷选曲保留或插入队列。停放后的键盘/异步结果不再改变界面。
3. 修复实际 Lattice 动画退出边界：活动墙可见，退出墙立即停止接收点击，海报列表退出不会阻塞整个墙到播放器的切换。真实 Framer Motion 多轮测试覆盖第三次退出和大海报波次。
4. 歌词、焦点、几何位置和控件统一使用 queueEntryId，并保留独立运行的歌曲键回退；重复曲目槽位相互区分。工具栏主歌词色驱动实际字形 shader，恢复默认时恢复主题，翻译保留自身颜色。
5. Cadenza 长歌词逐行布局、网易云 API 代理和依赖获取修复保留。登录态兼容当前 `online_provider:netease:cookie` 与历史 `netease_cookie`，防止旧凭据覆盖新登录态。
6. 完整播放器在共享 renderer 边界消费主歌词色，包括 Canvas 等派生强调色；背景、翻译与和声保留原主题，重置恢复当前主题。主站选色过程即时发送并去重，移除重复的 host 播放栏，普通列表扩展到当前准确队列项并在返回时定位。

## 验证与历史

本次 Folia 受影响验证 **100 files / 1056 passed / 1 skipped**；背景隔离后再验证 **9 files / 130 tests**，TypeScript 与严格 OpenSpec 通过。主站 **251 files / 1512 tests** 与构建通过；精确提交的部署构建与线上验收单独记录。此前完整套件 4,385 通过、2 跳过；唯一 Windows modSignature 符号链接 EPERM 在干净上游也复现，未削弱该测试。

| 实现 | 修复 |
| --- | --- |
| `388f3e72` | 首次普通/Folia 音频、时钟与身份联动 |
| `822bcc5c` | Lattice 主歌词颜色 |
| `9b2346e2` | 完整歌单播放、嵌入导航、当前歌单返回 |
| `311b98d5` | 透明退出墙的点击与重新进入 |
| `9ed6ab22` | 当前队列槽位的歌词、焦点和控件 |
| `7069103b` | 多次退出后海报波次阻塞完整播放器 |
| `c755facf` | 完整播放器字幕色与背景主题隔离 |

详见 [排查记录](../../openspec/changes/unify-folia-workspace-navigation/diagnosis.md) 与 [最终验收报告](../../openspec/changes/unify-folia-workspace-navigation/verification-report.md)。

本次跟进：[排查记录](../../openspec/changes/fix-folia-color-controls-and-queue-return/diagnosis.md)、[验证与交付报告](../../openspec/changes/fix-folia-color-controls-and-queue-return/verification-report.md)。下方为本次部署前的线上基线；新镜像与实际模块身份将在本次报告中记录。

## 个人服务器部署

服务器 `111.228.35.186`；源码 `/opt/folia/folia-major-main`，部署分支 `codex/deploy-shizuki-folia-20261001`，运行实现 `7069103b4ce862f0e1f8befde5c48dbe778777f4`。从精确 Git archive 构建，避免宿主未跟踪依赖覆盖 lockfile 安装。

运行镜像 **`sha256:1d74dd2d4bee41abd9832a6698f7a4144efc814ca46057740e792b71b1c2b529`**，OCI revision 与实现一致。历史标签 `folia-local/gateway:0.7.7-music` 保留；版本以 commit/digest 为准。网关 `/music/` 实际模块 `main-rROf5Ust.js`；站点模块 `index-Bvvt1XEq.js`。健康检查和真实连续选曲、点击/键盘、暂停/拖动、颜色与两种歌单返回验收通过。回滚镜像、源码 stash、站点恢复点保留，详见 [部署记录](../../openspec/changes/unify-folia-workspace-navigation/delivery-preparation.md)。

1Panel openresty `location /music/` 代理到 `127.0.0.1:18081`。Folia 独立运行于 `folia-local/gateway`，源码与许可证声明随修改保留；本目录提供完整 patch 和主要源码快照，上游源码可从 GitHub 获取。
