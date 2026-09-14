# Design: Twilight_Echo 普通模式能力融合

## 决策

| 决策点 | 选择 | 理由 |
|---|---|---|
| 融合方式 | **组件级移植**（不整体网页化 Twilight_Echo） | 桌面应用：C++ audio-engine + 339 处 IPC 依赖，整体网页化不可行；renderer 是 Vue 3 与站点同框架，Apache-2.0 允许移植 |
| 播放内核 | 保留站点 HTML5 Audio / Web Audio | 不移植 C++ 内核；可视化/均衡器用 Web Audio AnalyserNode/BiquadFilter 替代 |
| 歌词引擎 | 移植 Twilight_Echo lyric* utils（逐字/焦点窗口/AMLL TTML） | 站点现有歌词较基础，此为核心增强点 |
| Folia 角色 | 保持 embed，作为沉浸歌词/视觉（Lattice） | 已有同文档 embed + 桥，不重复建设 |
| 音源 | 站点现有 ncm-api 账号 cookie 通道（已统一） | 不引入 Twilight_Echo 的 Electron 网易云通道 |
| fork 管理 | 服务器本地 git 仓库 + 站点 third_party 记录 | GitHub 推送需用户 PAT（后续补） |

## 分层架构

```
视图层： 普通模式 Vue（移植组件）  |  沉浸模式 Folia embed
状态层： 现有 Vue stores + Folia postMessage 桥
播放层： HTML5 Audio / Web Audio（站点现有）
数据层： Spring Boot + ncm-api + meting（音源已统一）
```

## 移植规则

1. 仅移植渲染层（Vue 组件 + 纯 TS utils），一律替换 `window.electron/api` 为站点 API/Web Audio
2. 每个移植文件保留 Apache-2.0 版权头（来源 Twilight_Echo，Px-asen）
3. 移植组件接入站点现有 stores/API 约定（musicApi.js、useMusicLibraryContext）
4. 不引入新构建依赖（不装 Electron 相关包）

## 渲染升级设计（普通模式逐字高亮 / 焦点窗口）

### 数据流（新增逐字层）
```
播放歌 → 后端 resolve-playback（现有 lrc/tlyric/romalrc）
        → 前端额外调 musicApi.fetchAmllLyric(trackId, 'ncm') 获取逐字 TTML
        → lyricEngine parseAmlTtml → 行内 words[]（逐字时间戳）
        → 挂到 lyricTimeline 行的 words 字段（timed 行）
```
- AMLL 逐字歌词为**可选增强**：获取失败静默回退行级渲染（不影响现有行为）
- 缓存：AMLL TTML 结果按 trackId 内存缓存（会话级）

### 渲染改造点（调研确认的现状 → 目标）
| 文件 | 现状 | 目标 |
|---|---|---|
| MusicPlayerDetailView.vue lyric-scroll | 行级高亮（`.lyric-row.active` + `.line-main` 整行） | 行内 words 逐字高亮：`.line-main` 内按 words 拆 `<span>`，当前词用 `findActiveWordIndex(words, currentTime)` 定位 + lyricEmphasis 的 WAAPI keyframes 或 CSS transition 渐变 |
| MusicPlayer.vue 三联窗 | 行级显示 | 保持行级（三联窗窄，逐字不适用）；但可加焦点窗口模式入口 |
| App.vue 全局歌词条 | 行级 | 保持行级 |

### 焦点窗口（可选，阶段 B）
- 移植 lyricViewportController（每行独立弹簧）+ PlayingLyricLine/Words 组件到新组件 `LyricFocusWindow.vue`
- 与现有 `.lyric-scroll` CSS 冲突（viewportController 用绝对定位 + CSS 变量）→ 独立组件，不混用

### 验收
- 有 words 数据的歌：逐字高亮随播放推进（词级时间戳）
- 无 words 数据的歌：行级高亮（现有行为）
- 构建 + 全量测试通过；浏览器实测逐字同步

## 验证

- 每阶段：组件级单测（vitest）+ 站点构建通过 + 浏览器实测
- 端到端：普通模式歌词逐字高亮、可视化、均衡器随播放正常工作；沉浸模式 Folia 切换正常
