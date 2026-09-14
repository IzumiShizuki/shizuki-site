# composables/playerBar — Twilight_Echo 播放栏纯逻辑层移植

> 来源：Twilight_Echo v1.2.1（Apache-2.0，作者 Px-asen / Pxasen.com）
> 上游路径：`/opt/folia/Twilight_Echo-main/src/renderer/src/...`
> 调研依据：`D:\program\shizuki-site\tmp\twilight-playerbar-discovery-portability.md`

本目录**只做纯逻辑/纯 composable 层**移植：不改动站点任何现有文件，不做数据层
对接。所有文件为 JavaScript（站点无 TypeScript 编译链），类型经 JSDoc 表达，
骨架在 `types.js`。

## 文件清单

| 文件 | 上游来源 | 内容 |
| --- | --- | --- |
| `types.js` | types/music.ts、types/settings.ts | queueEntryId 队列身份模型与 JSDoc 类型骨架（B 级，不接数据层） |
| `frameCoalescer.js` | utils/liquidGlassPointer.ts | `createFrameCoalescer` rAF 帧合并节流（仅移植该函数） |
| `playerQueueUtils.js` | utils/playerQueueUtils.ts | `shuffleArray` |
| `playbackQueueVirtualization.js` | utils/playbackQueueVirtualization.ts | 54px 行高 + overscan 6 + translateY 窗口 + 快照瘦身 + queueEntryId 分配 |
| `usePlaybackQueueVirtualScroll.js` | player-bar/usePlaybackQueueVirtualScroll.ts | 虚拟滚动 composable + 打开/切歌自动定位当前曲目 |
| `usePlaybackQueueDrawerActions.js` | player-bar/usePlaybackQueueDrawerActions.ts | 抽屉动作层（下一首/队尾/移除/清空/存歌单/拖拽，按 queueEntryId 解析） |
| `playbackQueueController.js` | stores/player/playbackQueueController.ts | 队列编辑控制器 + 个性化流会话（快照化 commitQueueEdit，可单测） |
| `usePlaybarAutoHide.js` | player-bar/usePlaybarAutoHide.ts | 自动隐藏策略（阈值揭示 / hold-open / flashReveal / 帧合并节流） |

## 降级点（TS → JS / Electron → 站点）

1. TypeScript 类型全部降级为 JSDoc typedef（站点无 TS 编译链）。
2. `createFrameCoalescer` 从 liquidGlassPointer.ts 抽出，只保留节流器本体
   （指针高光/弹性偏移与站点液体玻璃体系无关）。
3. 控制器中「原生队列同步」`queueNativeQueueStateSync` 保持注入式——站点
   HTML5 Audio 无原生队列，接入时传 no-op 即可；`setAudioEngineError` 对应
   站点错误上报；`clearAutomaticLyricsBaselines` 对应站点 lyricEngine 基线清理。
4. 播放模式枚举保留上游语义（`shuffle`/`heart`），未与站点
   `sequential/random/single` 做映射（本次不接数据层）。

## TODO 对接清单（后续 W3/W4/W5 工作包）

1. **queueEntryId 队列身份**：✅ 已对接 —— `usePlayerEngine.normalizeTrack` 已为每条
   曲目补 `queueEntryId`（格式 `<provider>:<trackId>:<自增序号>`，输入自带
   queueEntryId 时保留，懒解析/时长同步等重归一化不换身份）。剩余事项：
   `toPlaybackQueueSnapshot` 需保留站点播放必需字段（audio / lyricText /
   translationLyricText / durationLabel / sort / provider），否则快照化会丢字段。
2. **usePlayerEngine 新出口**（types.js 对接点 4）：✅ 已新增
   - `removeQueueItem(entryIdOrIndex)`：按 queueEntryId 移除（兼容抽屉层按整数索引下命令）
   - `clearQueue()`：清空队列并复位播放状态
   - `appendToQueueEnd(rawTrack)`：队尾追加（`enqueueTrack` 为同引用别名），
     区别于 `enqueueNextTrack` 的「插入当前曲目之后」插队语义
   - `reorderTracks` 已存在（维护 sort 字段）
3. **saveQueueAsPlaylist** 接站点收藏/歌单链路（MusicCollectTrackDialog）。
4. **playMode 映射**（types.js 对接点 2）：`sequential/random/single` ↔
   `sequential/shuffle/repeat`；`applyPendingRendererPlayModeAtBoundary` 需站点
   引入「shuffle 重新排队」语义才有意义。
5. **个性化流会话**（types.js 对接点 3）：FM/雷达二期时在 usePlayerEngine 增加
   会话状态，控制器已就绪（startPersonalizedStream / appendPersonalizedStreamTracks）。
6. **自动隐藏接入**：usePlaybarAutoHide 的 autoHide 等设置项沿用站点 persisted
   设置模式；Dock 需先有 mini/compact 形态。
7. **许可**：Apache-2.0，保留版权头即可；站点关于页可加 attribution。

## 测试

- `playbackQueueVirtualization.spec.js`（快照瘦身 / 身份稳定 / 窗口边界 / 定位居中 / 20k 虚拟滚动揭示）
- `playbackQueueController.spec.js`（enqueue / playNext / remove / clear / reorder / 个性化流会话 / 播放模式边界）
- `usePlaybackQueueDrawerActions.spec.js`（2 万行虚拟窗口下按稳定身份解析拖拽起止；重复曲目条目命令）
- `usePlaybarAutoHide.spec.js`（shouldRevealForPointer 纯函数 / 阈值揭示 / hold-open / flashReveal）

上游 `playbackQueueVirtualization.test.ts` 中两条源码巡检测试（读取
PlayerBar.vue / usePlayerStore.ts 断言）依赖 Twilight_Echo 自身源文件，不属于
纯逻辑层，未搬运。

运行：`npx vitest run src/composables/playerBar`
