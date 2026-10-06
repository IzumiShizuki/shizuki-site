# Folia（folia-major）源码与本地构建

本目录公开站点内嵌 Folia 的修改。上游 [chthollyphile/folia-major](https://github.com/chthollyphile/folia-major) 为 AGPL-3.0，基线 **v0.7.11 / `6fe68d89`**。

## 当前对应源码

2026-10-06 普通音乐页的平台歌单/点赞集成另提供后续补丁 [`shizuki-platform-library.patch`](shizuki-platform-library.patch)，须在下述完整补丁之后应用。它更新 `src/App.tsx` 与 `src/shizukiExternalBridge.ts`，并增加账号红心桥接测试：状态读取真实平台喜欢列表，主站已确认的点赞结果只更新 Folia 界面。本次已部署至个人服务器，运行提交为 `5bf98f77dfdc77f670ebf17e5c16973b4d30e6c5`，镜像为 `sha256:eb896d63646e3494e8fccdff52428a3271ad7b1fae3712b2b2cf2610e9bddcc2`；198 个预期文件逐项 SHA-256 校验通过。[完整对应源码与 AGPL 许可证](https://site.shizuki.online/music/source/) 随运行版本公开提供，详见 [平台音乐库部署报告](../../openspec/changes/unify-music-platform-library/deployment-report.md)。下述字幕色提交与镜像记录为此前发布。

- 用户 fork：[IzumiShizuki/folia-major](https://github.com/IzumiShizuki/folia-major)，分支 `codex/unify-folia-workspace`。
- 此前字幕色实现：`c755facfe0d2fb53303aefc977d41f72375e2e07`；本次发布前运行提交（含空白清理）：`1fca2ef15922c55b8655873bbd4d6a4415db828b`。原 fork 源码 tip：`d8f8725388d94f02ce99da95ecd632f2d1f96a26`，新增部分仅为此前验收文档；此次音乐库桥接以生产基线单独生成 `5bf98f77`，保留原 fork 工作区。
- 完整差异：[`shizuki-folia-v0.7.11.patch`](shizuki-folia-v0.7.11.patch)，**310,935 bytes; SHA-256 `d79e9167675ca415a9cc80e5ec1f941b1f68eda42770ca5395d36c7a83fa3000`; `76` changed files**。可应用到干净 `6fe68d89`，已实际应用并逐项核对全部目标 Git blob。
- 此前公开的 **57 个 TS/TSX 源码及测试快照**与完整 fork 逐字节一致；本次另更新两个快照并添加桥接测试，重现这些修改需再应用后续平台音乐库补丁。桥快照 `shizukiExternalBridge.ts` 对应 fork 的 `src/shizukiExternalBridge.ts`。
- 完整 fork 的本地目录 `D:\program\_codex_deploy\folia-major-v0.7.8-upstream` 保留旧目录名，实际基线为 v0.7.11。旧 `embedded-history-isolation.patch` 仅作历史参考。

## 主要修改

1. `/music/` 构建 base、同文档嵌入 bootstrap 和外部桥。主站是唯一音频输出，Folia 自有音频清空并暂停；选曲、暂停、seek 等意图交给主站。连续歌词时钟和内容指纹避免时钟更新重挂歌词。
2. 嵌入工作区使用有界内存导航，保留当前歌单返回上下文，不修改主站 URL/history。完整歌单播放交接整个有序队列及来源；墙选曲使用准确槽位，快捷选曲保留或插入队列。停放后的键盘/异步结果不再改变界面。
3. 修复实际 Lattice 动画退出边界：活动墙可见，退出墙立即停止接收点击，海报列表退出不会阻塞整个墙到播放器的切换。真实 Framer Motion 多轮测试覆盖第三次退出和大海报波次。
4. 歌词、焦点、几何位置和控件统一使用 queueEntryId，并保留独立运行的歌曲键回退；重复曲目槽位相互区分。工具栏主歌词色驱动实际字形 shader，恢复默认时恢复主题，翻译保留自身颜色。
5. Cadenza 长歌词逐行布局、网易云 API 代理和依赖获取修复保留。登录态兼容当前 `online_provider:netease:cookie` 与历史 `netease_cookie`，防止旧凭据覆盖新登录态。
6. 完整播放器在共享 renderer 边界消费主歌词色，包括 Canvas 等派生强调色；背景、翻译与和声保留原主题，重置恢复当前主题。主站选色过程即时发送并去重，移除重复的 host 播放栏，普通列表扩展到当前准确队列项并在返回时定位。

## 验证与历史

本次平台音乐库桥接通过 TypeScript、3 个相关测试文件的 5 项测试及生产构建，后续补丁应用检查通过。主站验证与能力边界见 [平台音乐库验收报告](../../openspec/changes/unify-music-platform-library/verification-report.md)。以下为此前字幕色与队列改动的历史验证记录。

本次 Folia 受影响验证 **100 files / 1056 passed / 1 skipped**；背景隔离后再验证 **9 files / 130 tests**，TypeScript 与严格 OpenSpec 通过。独立干净发布分支 **251 files / 1513 tests，exit 0**；最终居中定位调整另通过 **2 files / 4 tests** 并重建精确生产提交。实际字幕色、重置、单播放栏、原生暂停/拖动/Esc、第 450 首返回定位与原生 purple 83 首歌单替换验收通过。此前完整套件 4,385 通过、2 跳过；唯一 Windows modSignature 符号链接 EPERM 在干净上游也复现，未削弱该测试。

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

此前跟进：[排查记录](../../openspec/changes/fix-folia-color-controls-and-queue-return/diagnosis.md)、[验证与交付报告](../../openspec/changes/fix-folia-color-controls-and-queue-return/verification-report.md)。下方保留该次历史部署身份；当前平台音乐库部署身份见本文开头和部署报告。

## 2026-10-02 个人服务器部署历史

服务器 `111.228.35.186`；源码 `/opt/folia/folia-major-main`，部署分支 `codex/deploy-shizuki-folia-20261001`，运行实现 `1fca2ef15922c55b8655873bbd4d6a4415db828b`。从干净提交与现有生产 Vite 参数本地构建，逐文件 SHA-256 清单校验运行镜像中的全部 193 个文件，OCI revision 与提交一致。

运行镜像 **`sha256:91b1df73ec35c4372e48750e89859bd9d69f547b385c359a4089ad3098170620`**。历史标签 `folia-local/gateway:0.7.7-music` 保留；版本以 commit/digest 为准。网关 `/music/` 实际模块 `main-pG2vG0Xv.js`；主站运行提交 `7abce02172af0bd5b459f3b7147f25a928a3ffc3`，模块 `index-Cd9jeifr.js`，229 个运行文件逐项匹配。健康检查与实际签入页面验收通过。Folia 回滚 `backup-before-color-20261002-7069103b`、主站初始/中间回滚、源码 stash 与完整 READY 恢复点保留，详见本次验证与交付报告。后端、私有配置与数据卷未改动；临时构建上下文已清理。

1Panel openresty `location /music/` 代理到 `127.0.0.1:18081`。Folia 独立运行于 `folia-local/gateway`，源码与许可证声明随修改保留；本目录提供完整 patch 和主要源码快照，上游源码可从 GitHub 获取。
