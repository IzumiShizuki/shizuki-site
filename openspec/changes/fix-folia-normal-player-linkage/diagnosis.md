# Folia / 普通模式联动排查

## 2026-10-01 production feedback follow-up

The user reports an ordinary-mode track remaining audible after selecting another Folia track, plus a lyric color picker that leaves lyrics white. Browser inspection distinguished two stale user tabs from the fresh deployment: the latest tab initially held site `index-hh_Iw5I0.js` and Folia `main-DvNzgpb0.js`; after reload it held `index-BXPorIWF.js` and `main-DtKcOlQb.js`. Another pre-existing tab still held `index-CDjbjNra.js` and `main-dRxIvTiL.js`.

In the fresh bundle, a native Lattice card selection followed by its Play button changed the host from `こころに響く恋ほたる` to `Like a cloud`; the toolbar and dock both changed, position advanced, and Folia-owned audio sources remained empty. This numeric NetEase scenario does not reproduce the reported selection failure after reload. Other identity and projection-order cases remain under behavioral investigation; stale tabs alone do not prove every reported selection is fixed.

The native Folia Home → `purple` collection → focused track Play path also changed `アオイトリ` to `Like a cloud`, with the host reaching 00:04 / 02:32. An initial click on a non-focused card's hidden Play button merely centered that card; its `--play-pe` disables pointer interaction until focus. This observation was corrected before any selection code was changed. A card focus alone is not a playback intent. Native navigation also writes `#home` / `#collection/...` into the host URL; that is a separate navigation concern, not a demonstrated cause of this audio regression.

A narrower **selection defect is confirmed by the real Vue SFC message handler**: `readFoliaTrackId()` maps all nonnumeric IDs to 0 and discards provider identity. With normal-mode A `{trackId: 'shared-track-17', provider: 'spotify'}` and Folia B `{trackId: 'shared-track-17', provider: 'netease'}`, the handler never calls `playExternalTrack`. The new integration case failed (six existing cases passed). Using the existing provider-and-track key will distinguish new selections while retaining the host queue and sole audio owner. This edge case does not prove that the user's numeric NetEase selection was caused by it; old loaded bundles remain relevant to that report.

The color symptom **does reproduce in the fresh deployment**: the picker and embed CSS variable both hold `#e43b57`, but the Lattice primary lyric glyphs stay white. There is one Lattice canvas and no `[data-shizuki-folia-lyric-word-body]` element. Ranked predictions were: (1) canvas/Pixi does not consume the CSS override, (2) the selected color fails to reach the reactive visualizer input, (3) cached scenes keep their previous glyph color, and (4) a stale bundle hides the update. The fresh-bundle observation excludes (4) for the color defect.

The tight regression command is `node node_modules/vitest/vitest.mjs run -c vitest.config.ts test/unit/shizukiLatticeLyricColor.integration.test.ts` in the complete Folia checkout. Before implementation it reports one failure from the real `createLatticeLineView`/glyph-shader path: expected RGB `[228/255, 59/255, 87/255]`, received white `[1, 1, 1]` with the existing 0.98 accent alpha. The bridge setter only injected a DOM style; the Lattice renderer consumed `input.theme.primaryColor` directly. Repair must connect the custom color to rendered glyphs and update/reset an already active scene, while preserving theme opacity and standalone behavior.

Luna connected bridge color changes to the reactive Lattice provider and GPU scene, including updates to cached primary glyph shaders. Reset restores original theme/chorus colors; translation colors remain governed by the subtitle theme. The provider re-reads after subscribing to avoid losing an update during mount. The regression drives the real bridge, provider and scene with mocked Pixi primitives; runtime wiring also requires browser acceptance. The affected Folia subset currently passes 80 tests across 12 files.

日期：2026-09-30（Asia/Shanghai）。根代理负责排查、审查与验证；Luna 子代理负责实现。

## 首次排查 Git 基线（后续发布状态见文末与验证报告）

- 原分支：`codex/upgrade-folia-v0711`，工作区干净。
- 仓库原主分支名为 `master`，没有 `main`。从本地 `master` 创建 `main` 后，以 merge commit `c7bae206` 合并原分支，双方提交均保留。
- 当前排查/修复分支：`codex/diagnose-folia-normal-linkage`。
- 首次本地提交时未推送、未部署。用户随后明确授权推送排查分支：网站分支已推到 `origin/codex/diagnose-folia-normal-linkage` 并核验同步；没有执行生产部署。
- 完整 Folia checkout 的 `origin` 指向上游 `chthollyphile/folia-major`。检查未找到可用的 Shizuki Folia fork，因此未将该完整源码分支推到上游；与其内容一致的公开 patch 已包含在并已推送的网站分支中。
- 收尾时其他工作区将 `main` 推进到 `554bd949`，包含壁纸下载字节进度及既有Folia代理DNS/字幕颜色修复。本排查分支以 `f79391e9` 无冲突合入这些提交，保留双方意图；本地修复首次提交为 `ca168f2c`。

## 证据与反馈循环

1. 主站基线命令（在 `fronted/vue3-merged`）：
   `pnpm exec vitest run src/pages/MusicLibraryPage.foliaSwitch.spec.js src/pages/MusicLibraryPage.foliaLyrics.spec.js src/composables/usePlayerEngine.queue.spec.js`
   结果：38 tests，31 pass、7 fail。歌词套件4个失败；Cookie key、viewport、wallpaper兼容断言3个失败。它们证实升级后的源码快照丢失兼容逻辑，但不是完整播放功能的端到端证明。
2. 只读检查用户现有 Edge 音乐页：普通模式滑块 title 是 `播放进度 00:46 / 04:14`，aria current=18；同文档 `#folia-embed-root input[type=range]` 的 value=0、max=254.013、disabled=true。Folia 内部两个 audio 都 source为空、paused=true、readyState=0。主站音频通过独立 Audio 对象播放，不在 DOM 中；未以 DOM 缺少该音频推断主站停止。
3. 同页只读 console 检查：Folia 隐藏于普通模式时仍有 `[Prefetch] Will prefetch 2 songs near index 0`，随后分别解析下一首音源/歌词。日志原文件也显示一次预取3首并跨 QQ / AMLLDB / 酷狗探测。
4. 生产 `/music/` 当前入口为 `/music/assets/main-DvNzgpb0.js`，与用户日志一致；主站入口为 `/assets/index-hh_Iw5I0.js`。部署说明记载生产仍用0.7.7镜像、0.7.11仅源码同步；本次只确认公共资源标识，未用这些标识推断完整部署 commit。
5. 只读 HTTP probe：`GET https://site.shizuki.online/api/lyric-proxy?url=https%3A%2F%2Famll-ttml-db.stevexmh.net%2Fncm%2F28684001%3Fformat%3Dttml` 返回401、`application/problem+json`，正文为 `{"title":"UNAUTHORIZED","detail":"Login required","code":"UNAUTHORIZED","status":401}`。这不是“歌曲没有歌词”的证据。
6. Luna 已在完整本地 Folia 源的真实 `buildPlayerViewFlags` seam 复现：嵌入、有当前歌曲、audioSrc=null、duration=180 时，可播放标志仍为 false。共享引擎的下一首准备/随机顺序/快速选歌用例也先运行失败后实现。

## 排查假设及可证伪预测

| 优先级 | 假设 | 预测与验证 |
| --- | --- | --- |
| 1 | 控件和显示仍消费 Folia 本地音频状态，而桥有意清空该音频 | 若向所有 UI 时钟信号投射主站进度、嵌入控件按权威会话判可用，则不需恢复 Folia 音源即可修复零进度/假禁用。已复现 flags=false 和线上两套进度不一致。 |
| 2 | 基于120–900ms的 echo 抑制吞掉真实操作 | 紧接同步后发 pause/seek 应仍只回传一次；去掉时间窗，改同步调用栈内抑制，应让即时动作通过且不产生同步回声。 |
| 3 | Folia 选歌仍执行本地解析和预取，同时主站也解析 | 从入口直接relay intent并停止嵌入原生流水线，应没有 Folia 独立解析/预取日志，独立模式仍保留其流程。线上日志已证实多余工作。 |
| 4 | 普通入口缺少共享歌单导入/下一首准备 | 普通入口运行生命周期应调已有import API、主引擎按队列顺序准备下一首；当前入口只GET source status、import仅由手动操作触发。 |
| 5 | 同名根路径 `/api/` 请求进入主站授权边界 | 若是路由错位，本地配置无Folia proxy route，响应会带主站problem格式且要求网站登录。公共probe与本地配置符合此预测；未登录真实Folia后台进行验证。 |

## 已确认原因

- **状态分裂**：主站持有可听音频，Folia 自己的音源被锁为空。`buildPlayerViewFlags` 以本地 audioSrc 判定可用。截图所用的 `LatticePlaybackControls.tsx` 又以 `isCurrentSong && canTogglePlayback` 决定是否消费实际时钟；false 时显示 `idleTime=0` 并禁用滑块及其他控制，但播放按钮仍调用 `onPlay(tile)`。这直接解释“0、像禁用但实际上能点”。桥必须同步 `currentTime` 和 `lyricCurrentTime`，控件必须按嵌入会话判定可用。
- **控制丢失风险**：桥用同步后的时间窗口排除状态订阅事件，真实用户暂停也可能落入该窗口。应对主站投影的同步调用进行局部抑制，并为嵌入按钮直接relay意图。
- **多余独立流水线**：嵌入选歌仍进入 Folia 原生播放/预取/歌词匹配，再与主站镜像逻辑并行。锁音频没有取消这些网络和状态副作用。
- **快速选歌竞态**：主站 async selection 缺少统一过期操作保护，较早请求迟到可覆盖之后的选择。延迟行为测试还复现了队列重排后歌词 fallback 沿用旧数组索引，以及旧 toggle/recovery 的拒绝清空新歌曲播放状态。现在按 queueEntryId 重新定位，并检查选择代次、曲目和授权上下文。
- **普通入口功能未接线**：绑定状态查询不等于歌单导入，普通入口没有自动import；Folia已有自己的账号歌单读取。主站API已提供幂等导入与sidebar刷新，可共用。
- **预加载来源不同**：日志里的 `[Prefetch]` 来自 Folia 独立播放器，不是共享主引擎。正常切换应只保留主引擎的有限下一首准备。
- **歌词代理路由缺口**：Folia Web客户端请求根 `/api/lyric-proxy`，本地gateway模板未配置Folia `/api/`后台；本仓库主站也无该歌词路由。公共返回要求主站登录，无法靠“重新登录网易云”解释或解决。嵌入模式应使用主站解析好的歌词，从而不走此独立匹配流水线；独立Folia代理部署问题另行保留。

## 验证结果与边界

- 同文档真实 bridge 测试验证两个时钟、同步无回声、即时 pause/seek、空音频与歌词对象 identity 保持。真实页面生命周期测试验证普通入口 persist → import → sidebar，以及失败后通过页面同步操作重试。
- 主站合并最新main后的全量单测：246 files、1474 tests 全部通过；生产构建通过。首次修复检查为1472 tests，随后完整重跑覆盖并行合入的改动。完整 Folia 的定向测试、类型检查与 `/music/` 构建通过，公开 patch 与完整 fork diff 字节一致，并已在干净 v0.7.11 实际应用。
- Folia 全量套件：4385 passed、2 skipped、1 failed。唯一失败为 modSignature 测试创建符号链接的 Windows EPERM，在未修改的 v0.7.11 基线也复现（该文件7/8通过）；相关源码与测试没有修改。
- 最终源码映射、检查命令及发布验收见 [verification-report.md](verification-report.md)。本地完整 fork 的联动修复为 `34a51405`，保留并行main更新后的最终提交为 `388f3e72`；网站与公开 patch 已提交在当前排查分支。
- 发布后仍需在实际账号/歌曲/CDN环境验证权限受限歌曲、音频Range拖动、持续播放和模式切换；本地 mock 测试不能替代该验收。
- 最后只读复查：网易云 `/netease/song/detail?ids=28684001` 返回200；根 `/api/lyric-proxy` 同样返回401。合入的动态DNS修复针对网易云代理容器IP变化，并没有补上独立歌词代理路由；两种代理问题不能混为一谈。
