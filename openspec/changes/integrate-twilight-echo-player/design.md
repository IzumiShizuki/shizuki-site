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

## 验证

- 每阶段：组件级单测（vitest）+ 站点构建通过 + 浏览器实测
- 端到端：普通模式歌词逐字高亮、可视化、均衡器随播放正常工作；沉浸模式 Folia 切换正常
