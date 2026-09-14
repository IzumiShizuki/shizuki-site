# 融合计划：Twilight_Echo 普通模式播放器能力 + Folia 沉浸歌词视觉

> 目标 change：`integrate-twilight-echo-player`
> 用户诉求：现有自研音乐播放器功能有限，优先复用已有开源项目（Twilight_Echo + Folia）完成增强。

## 1. 调研结论（两项目技术事实）

### Folia（chthollyphile/folia-major，AGPL-3.0）
| 项 | 结论 |
|---|---|
| 形态 | React 18 + Vite **Web 应用**（Electron 仅为桌面壳） |
| 能力 | 沉浸歌词动画（Lattice 等）、视觉器、AI 主题、网易云/酷狗/QQ 音源 |
| fork 状态 | 已完成：`/opt/folia/folia-major-main`，分支 `folia-embed`，基线 `0643947` |
| 集成状态 | 已同文档 embed 进 Vue 音乐页 + postMessage 桥（cookie 互通/歌单播放/进度继承/歌词时间戳修复均已完成） |

### Twilight_Echo（Px-asen/Twilight_Echo → 现仓库 asenyarzc-cpu/Twilight_Echo，**Apache-2.0**）
| 项 | 结论 |
|---|---|
| 形态 | **Electron 桌面应用**（Windows 10/11 主要平台），renderer 为 **Vue 3 + TypeScript**（electron-vite） |
| 能力 | 网易云登录（扫码）、每日推荐/私人 FM/云盘、歌词系统（逐字/焦点窗口/AMLL TTML）、均衡器（含 Parametric EQ）、音频可视化、播放栏、迷你播放器、桌面歌词、主题工作室 |
| 播放内核 | C++ `audio-engine` + VST3（桌面专用，**不能网页化**） |
| IPC 耦合 | renderer 中 339 处 `window.electron/api` 依赖 |
| fork 状态 | 已完成：`/opt/folia/Twilight_Echo-main`，分支 `shizuki-fork`，基线 `3af33d9` |

### 站点现状
- `fronted/vue3-merged`：Vue 3 + Vite（与 Twilight_Echo renderer **同框架**）
- 后端 Spring Boot + `music-ncm-api`（网易云）+ meting；音源已统一到网易云账号 cookie 通道
- 现有音乐模块：MusicPlayer.vue、MusicLibraryDock、MusicLibraryHomeView 等（功能有限）

## 2. 融合架构决策

**核心判断**：Twilight_Echo 是桌面应用，整体网页化不可行（C++ 音频引擎 + 339 处 IPC）。但 Apache-2.0 许可 + renderer 是 Vue 3 = **组件级移植是首选路径**：把它的高价值 Vue 组件/TS 逻辑移植进 `vue3-merged`，替换 IPC 依赖为站点自己的 API/状态。

**分层**：
```
┌─ 视图层 ────────────────────────────────┐
│ 普通模式：Vue（移植 Twilight_Echo 组件）  │
│  - 歌词引擎（逐字/焦点窗口/AMLL TTML）    │
│  - 音频可视化（Web Audio AnalyserNode）  │
│  - 均衡器（Web Audio BiquadFilter）      │
│  - 播放栏交互增强（PlayerBar 模式）       │
│ 沉浸模式：Folia embed（已有）            │
├─ 状态层 ────────────────────────────────┤
│ 现有 Vue stores + 桥（Folia postMessage）│
├─ 播放层 ────────────────────────────────┤
│ HTML5 Audio / Web Audio（站点现有，       │
│ 不移植 Twilight_Echo 的 C++ 内核）        │
├─ 数据层 ────────────────────────────────┤
│ Spring Boot 后端 + ncm-api（已统一音源）  │
└─────────────────────────────────────────┘
```

## 3. 分阶段实施计划

### 阶段 0：移植清单盘点（并行调研）
- 逐组件分析 Twilight_Echo 的 IPC 依赖，产出「可直接移植 / 需适配 / 不可移植」清单
- 交付物：`docs/twilight-echo-portability.md`

### 阶段 1：歌词系统移植（普通模式歌词增强）
- 移植：`lyricTimeline.ts`、`lyricFocusWindow.ts`、`lyricEmphasis.ts`、`lyricWordChunks.ts`、`lyricSpring.ts`、AMLL TTML 解析
- 替换 IPC 依赖为站点歌词 API
- 增强 MusicPlayer 歌词渲染：逐字高亮 + 焦点窗口 + 翻译行

### 阶段 2：音频可视化移植
- 移植 `AudioVisualizerPanel.vue` + `audioVisualizerFormatting.ts`
- 适配 Web Audio API（AnalyserNode 替代桌面音频回调）

### 阶段 3：均衡器移植
- 移植 `EqualizerPage.vue` + `equalizer/`（含 Parametric EQ）
- 适配 Web Audio `BiquadFilterNode`（10 段均衡）

### 阶段 4：播放栏增强
- 参考 Twilight_Echo `PlayerBar.vue` / `compactPlayerBar` 的交互模式增强 MusicLibraryDock
- 迷你播放器（可选）

### 阶段 5：Folia 沉浸视图整合（延续合一方向）
- 歌词区「普通（移植版）/ 沉浸（Folia Lattice）」切换
- 歌单「列表 / 大屏」切换

### 阶段 6：在线发现能力（可选，后端适配）
- 参考 Twilight_Echo 的网易云推荐/私人 FM/云盘 → 站点后端 API + 普通模式 UI

## 4. 子 agent 分工

| Agent | 任务 | 并行性 |
|---|---|---|
| A | 阶段 0 调研：歌词系统可移植性（IPC 依赖分析 + 移植清单） | 与 B、C 并行 |
| B | 阶段 0 调研：可视化 + 均衡器可移植性 | 与 A、C 并行 |
| C | 阶段 0 调研：播放栏 + 在线发现可移植性 | 与 A、B 并行 |
| D | 阶段 1：歌词系统移植（依赖 A 的清单） | 阶段 0 后 |
| E | 阶段 2+3：可视化 + 均衡器移植（依赖 B） | 阶段 0 后 |

## 5. 风险与约束
- **许可证**：Twilight_Echo Apache-2.0（移植需保留版权声明/THIRD-PARTY-NOTICES）；Folia AGPL-3.0（保持独立 embed，桥文件随 third_party 公开）
- **播放内核**：不移植 C++ audio-engine；Web 端用 HTML5 Audio/Web Audio
- **IPC 替换**：339 处依赖是主要工作量，优先选择依赖最少的组件
- **GitHub fork**：如需推送到用户 GitHub（IzumiShizuki）仓库，需用户提供 PAT 或网页 fork；当前为服务器本地 git 仓库
