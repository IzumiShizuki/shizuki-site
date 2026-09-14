# Tasks: Twilight_Echo 普通模式能力融合

## 阶段 0：移植清单盘点（并行调研）

- [x] 歌词系统可移植性调研（子 agent A：`8b39215a`）→ `tmp/twilight-lyrics-portability.md`：utils 层 16 文件零 IPC（A 级直移），核心 9-11 人日
- [x] 可视化 + 均衡器可移植性调研（子 agent B：`e6104a3b`）→ `tmp/twilight-visualizer-eq-portability.md`：A 级 ~3700 行可直移，EQ MVP 4-6 人日（可视化借鉴不替换）
- [x] 播放栏 + 在线发现可移植性调研（子 agent C：`4e5cb855`）→ `tmp/twilight-playerbar-discovery-portability.md`：播放栏三件套 A 级可提取，在线发现需后端新增 REST 端点，一期 18-25 人日

## 阶段 1：歌词系统移植（依赖 A 清单）

- [ ] 实施子 agent `becdd763`：歌词 utils 纯逻辑层移植（lyricEngine/ 目录）——运行中

## 阶段 2-3：可视化 + 均衡器移植（依赖 B 清单）

- [ ] 实施子 agent `58de383f`：EQ/可视化纯逻辑层移植（audioEngine/ + components/music/equalizer/）——运行中

## 阶段 4：播放栏增强（依赖 C 清单）

- [ ] 实施子 agent（新）：播放栏纯逻辑层移植（composables/playerBar/）——已分发

## 后端前置依赖（调研发现）

- [x] 网易云逐字歌词 yrc 获取实测：`/api/song/lyric` + lv=1、`/api/song/lyric/v1` + yv=1、ncm-api `/lyric/new` 均不返回 yrc（**网易云对第三方 API 逐字歌词风控**）
- [ ] 替代方案：AMLL TTML 逐字歌词库代理（`amll-ttml-db.stevexmh.net`，Folia 已在用）→ 后端加代理接口（阶段 5 前完成）

## 阶段 5：Folia 沉浸视图整合

- [ ] 歌词区普通（移植版）/ 沉浸（Folia Lattice）切换
- [ ] 歌单列表 / 大屏切换

## 阶段 6（可选）：在线发现后端适配

- [ ] 网易云每日推荐 / 私人 FM / 云盘 → 站点后端 API

## 已完成

- [x] 两项目 fork：Folia（/opt/folia/folia-major-main，folia-embed 分支，基线 0643947）；Twilight_Echo（/opt/folia/Twilight_Echo-main，shizuki-fork 分支，基线 3af33d9）
- [x] 融合计划 + OpenSpec change 骨架（proposal/design）
- [x] 阶段 0 三个并行调研子 agent 已分发
