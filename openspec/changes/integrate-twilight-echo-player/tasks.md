# Tasks: Twilight_Echo 普通模式能力融合

## 阶段 0：移植清单盘点（并行调研）

- [x] 歌词系统可移植性调研（子 agent A：`8b39215a`）→ `tmp/twilight-lyrics-portability.md`：utils 层 16 文件零 IPC（A 级直移），核心 9-11 人日
- [x] 可视化 + 均衡器可移植性调研（子 agent B：`e6104a3b`）→ `tmp/twilight-visualizer-eq-portability.md`：A 级 ~3700 行可直移，EQ MVP 4-6 人日（可视化借鉴不替换）
- [x] 播放栏 + 在线发现可移植性调研（子 agent C：`4e5cb855`）→ `tmp/twilight-playerbar-discovery-portability.md`：播放栏三件套 A 级可提取，在线发现需后端新增 REST 端点，一期 18-25 人日

## 阶段 1：歌词系统移植（依赖 A 清单）

- [x] 实施子 agent `becdd763`：歌词 utils 纯逻辑层移植完成——`src/utils/lyricEngine/` 32 文件，203 用例全绿
- [x] 数据管道对接（子 agent `6c4f4c0b`）：siteProjection.js 投影 + usePlayerEngine 解析切换（旧路径保留 fallback），232 文件/1341 tests 全绿
- [x] 后端 AMLL 逐字歌词代理上线：`GET /api/v1/music/tracks/{trackId}/amll-lyric`（游客可访问），实测 200 返回 TTML
- [x] 渲染升级（子 agent `a2998bc9`）：siteWordEnhancer AMLL 逐字挂接 + 逐字高亮渲染（lyric-word active/past），236 文件/1379 tests 全绿
- [x] 前端全量部署：歌词引擎/EQ/队列/逐字高亮/发现接口全部上线（chunk 实测）+ E2E smoke test 通过

## 阶段 2-3：可视化 + 均衡器移植（依赖 B 清单）

- [x] 实施子 agent `58de383f`：EQ/可视化纯逻辑层移植完成——audioEngine/ 16 文件 + equalizer/ 5 组件，79 用例全绿
- [x] EQ 音频链接入（子 agent `05b9a866`）：createEqualizerChain 替换 3×BiquadFilter + 3→10 段迁移 + EqualizerPanelHost 骨架，235 文件/1370 tests 全绿

## 阶段 4：播放栏增强（依赖 C 清单）

- [x] 实施子 agent `a2bfd623`：播放栏纯逻辑层移植完成——playerBar/ 14 文件，36 用例全绿
- [x] 队列引擎扩展（子 agent `38e6ad1f`）：queueEntryId + removeQueueItem/clearQueue/appendToQueueEnd，31 tests 全绿
- [ ] 队列抽屉 UI（W4，可选）

## 阶段 5：Folia 沉浸视图整合

- [x] Folia 桥 `shizuki:set-view` 扩展（folia-embed 分支 commit `4cb026c`）+ gateway 重建部署
- [x] 歌词区「沉浸歌词」按钮（MusicPlayerDetailView → open-folia-lattice 事件，同曲续播）
- [x] 歌单「大屏」按钮（MusicLibraryHomeView → open-folia-lattice 事件）
- [x] MusicLibraryPage 视图级切换处理（set-view + play-tracks 桥接）+ 前端部署验证（沉浸歌词/大屏/set-view 串均在 chunk）

## 阶段 6（可选）：在线发现

- [x] 后端：NeteaseDiscoveryClient + daily-songs/recommend-playlists 端点（已部署，需登录 cookie）
- [x] 前端：musicApi.getDailyRecommendSongs/getRecommendPlaylists
- [ ] 发现页 UI（每日推荐/推荐歌单展示——可选增量）

## 阶段 7：UI 视觉层融合（Twilight_Echo 外观）

- [x] 播放栏视觉（子 agent `e35b3b45`）：MusicLibraryDock 重组为 TE 三区玻璃布局 + twLightBar/ 频谱条（96 频带）+ 三形态响应式，237 文件/1384 tests 全绿，已部署（blur 28px 实测）
- [x] 顶部模式切换去文字改图标（🎵/✨ + tooltip）
- [x] 无缝切换优化：Folia bootstrap embed 跳过 service worker 慢初始化（fork commit）+ host 兜底重试 + 后台预热 + 280ms 淡入过渡；预热完成后切换 0ms
- [ ] 播放详情页视觉（子 agent `0458a45f`：PlayingMusic 大封面玻璃布局 → MusicPlayerDetailView）——运行中
- [ ] 首页/歌单卡片 liquid-material 玻璃风格（可选第三步）

## 已完成

- [x] 两项目 fork：Folia（/opt/folia/folia-major-main，folia-embed 分支，基线 0643947）；Twilight_Echo（/opt/folia/Twilight_Echo-main，shizuki-fork 分支，基线 3af33d9）
- [x] 融合计划 + OpenSpec change 骨架（proposal/design）
- [x] 阶段 0 三个并行调研子 agent 已分发
