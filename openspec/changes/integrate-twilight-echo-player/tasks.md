# Tasks: Twilight_Echo 普通模式能力融合

## 阶段 0：移植清单盘点（并行调研）

- [ ] 歌词系统可移植性调研（子 agent A：`8b39215a`）→ `tmp/twilight-lyrics-portability.md`
- [ ] 可视化 + 均衡器可移植性调研（子 agent B：`e6104a3b`）→ `tmp/twilight-visualizer-eq-portability.md`
- [ ] 播放栏 + 在线发现可移植性调研（子 agent C：`4e5cb855`）→ `tmp/twilight-playerbar-discovery-portability.md`

## 阶段 1：歌词系统移植（依赖 A 清单）

- [ ] 移植 lyricTimeline / lyricFocusWindow / lyricEmphasis / lyricWordChunks / lyricSpring / AMLL TTML 解析
- [ ] 适配站点歌词数据源（musicApi 网易云 LRC）
- [ ] 增强普通模式歌词渲染（逐字高亮 + 焦点窗口 + 翻译行）

## 阶段 2：音频可视化移植（依赖 B 清单）

- [ ] 移植 AudioVisualizerPanel + audioVisualizerFormatting
- [ ] 适配 Web Audio AnalyserNode 数据源

## 阶段 3：均衡器移植（依赖 B 清单）

- [ ] 移植 EqualizerPage + ParametricEqWorkspace
- [ ] 适配 Web Audio BiquadFilterNode

## 阶段 4：播放栏增强（依赖 C 清单）

- [ ] 参考 PlayerBar 交互增强 MusicLibraryDock（队列抽屉/紧凑模式/自动隐藏）

## 阶段 5：Folia 沉浸视图整合

- [ ] 歌词区普通（移植版）/ 沉浸（Folia Lattice）切换
- [ ] 歌单列表 / 大屏切换

## 阶段 6（可选）：在线发现后端适配

- [ ] 网易云每日推荐 / 私人 FM / 云盘 → 站点后端 API

## 已完成

- [x] 两项目 fork：Folia（/opt/folia/folia-major-main，folia-embed 分支，基线 0643947）；Twilight_Echo（/opt/folia/Twilight_Echo-main，shizuki-fork 分支，基线 3af33d9）
- [x] 融合计划 + OpenSpec change 骨架（proposal/design）
- [x] 阶段 0 三个并行调研子 agent 已分发
