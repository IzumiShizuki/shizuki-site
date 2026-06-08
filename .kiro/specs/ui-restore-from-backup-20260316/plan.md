# UI Restore Plan: backup → master (保结构、还原样式)

**目标**：把 `backup/master-before-integrate-20260316` 上做过的"视觉/布局简化"反向合到 `master`，但保留 master 上 2 个月演进的所有结构（路由、后端配套、新功能）。

**工作分支**：`ui-restore-from-backup-20260316`（已创建，基于 master）

---

## 总差异规模

- 5 CSS / SCSS：纯样式
- 64 Vue SFC：含 template + script + style 三段，需逐个拆
- 73 JS（非测试）：composables / stores / utils / router / services
- 36 spec.js：测试文件
- 5 其它（package.json、md、jsx、lockfile）

---

## 取舍原则（按你最新指示：样式从 backup，结构从 master）

| 文件类型                                          | 处置                                                                                                                                                    |
| ------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **纯 CSS / SCSS**                                 | 全文从 backup 拉过来；如有 master 引入的"主题变量化"丢失，事后单独补回                                                                                  |
| **Vue SFC `<style>` 段**                          | 从 backup 抽出 `<style scoped>` 块替换 master 对应文件的 `<style>` 段                                                                                   |
| **Vue SFC `<template>` 段**                       | **关键判断点**：如果 backup template 渲染元素是 master 的真子集（仅删除按钮 / 删除卡片），则 backup template；否则保 master template，仅做 class 名对齐 |
| **Vue SFC `<script>` 段**                         | **保 master**——这是结构层（业务逻辑、状态、ref 名、事件处理）。template/style 必须配合 master 的 props/emits/computed                                   |
| **`*.spec.js`**                                   | 保 master（已经在本会话 7.1 阶段对齐过 Meting 改造）                                                                                                    |
| **`router/index.js`**                             | 保 master（路由数量是结构而非样式，你已确认）                                                                                                           |
| **`composables/**`、`utils/**`、`services/**`\*\* | 保 master（结构）                                                                                                                                       |
| **`package.json`、`pnpm-lock.yaml`**              | 保 master（依赖版本演进）                                                                                                                               |

---

## 阶段划分（按风险与可见性排序）

### Phase 1: CSS 基线（已完成 1/2）

- [x] 1.1 拷 backup 的 4 个 styles/\*.css → 当前分支
  - `liquid-material.css`（玻璃材质回到蓝紫色 `(240,240,255)`，但 master 的主题变量 `--theme-surface-soft` 引用会丢——验证视觉与编译）
  - `theme.css`（主题变量定义）
  - `global.css`（800 行精简）
  - `blog-editor-theme.css`（141 行精简）
- [x] 1.2 验证 `npm run build` 通过 ✅

- [ ] 1.3 跳过 `aos.css`（vendor 第三方 1 行差，可能是换行符）—— 不动

- [ ] 1.4 用户视觉验证：跑 `npm run dev` 看页面是否回到"接近 backup 的视觉"
  - 若是 → Phase 2 开工
  - 若否 → 回退此 4 个文件，重新讨论

### Phase 2: 应用骨架（关键三件套）

- [ ] 2.1 `App.vue`（5567 行 diff）
  - 拆 template/script/style 三段对照
  - script 段保 master（含 useAuthSession、router guard、sidebar 状态、provider 检查）
  - template 段：评估 backup 是否仅做"删除元素"——若是用 backup template；若新增元素无对应 script，删除新增；若 script 引用的元素被 backup 删掉，必须保留
  - style 段从 backup 抽

- [ ] 2.2 `TopMenu.vue`（754 行 diff）
  - 你最在意的"减少作者入口" `0512a3af` commit 应在此体现
  - 同样拆三段处理

- [ ] 2.3 `RailScaffold.vue`（backup 上不存在）
  - **不删除**：master 上多个组件 import 它，删了会编译失败
  - 保 master 原样

### Phase 3: 个人页 + 音乐库相关 SFC（用户高频路径）

按 backup 上你做过的相关 commit 优先级：

- [ ] 3.1 `ProfilePage.vue`（已在本会话 4.3 阶段动过，需重新对照 backup）
  - 注意：master 上这个文件已经是"删除 Meting Key 管理区块"后的状态
  - backup 上的 ProfilePage 完全没有 Meting Key 概念（更早的形态）
  - 取舍：保留我们刚改过的 master 版（不引入 Meting Key），但 style 段抽 backup
- [ ] 3.2 `MusicLibraryPage.vue`
- [ ] 3.3 `MusicRightPanel.vue`
- [ ] 3.4 `MusicLibraryHomeView.vue`
- [ ] 3.5 `MusicLeftSidebar.vue`
- [ ] 3.6 `MusicLibraryDock.vue`
- [ ] 3.7 `MusicSearchToolbar.vue`
- [ ] 3.8 `MusicCollectTrackDialog.vue`
- [ ] 3.9 `MusicCreatePlaylistDialog.vue`
- [ ] 3.10 `TrackCollectButton.vue`
- [ ] 3.11 `MusicPlayer.vue`
- [ ] 3.12 `music/MusicPlayerDetailView.vue`
- [ ] 3.13 `music/MusicPlaylistDetailView.vue`

### Phase 4: 通用组件（layout/dialog/header）

- [ ] 4.1 `AtmospherePanel.vue`、`SettingsPanel.vue`、`AiDialog.vue`、`LevitationBall.vue`
- [ ] 4.2 `app/AppMenuBar.vue`、`app/BackgroundPickerDialog.vue`
- [ ] 4.3 `common/ImageCropDialog.vue`、`common/PageIntroHeader.vue`
- [ ] 4.4 `profile/Profile*` 7 个组件

### Phase 5: 博客 + 应用中心相关 SFC

- [ ] 5.1 `pages/AppsPage.vue`、`pages/BlogListPage.vue`、`pages/BlogPage.vue`
- [ ] 5.2 `components/blog/BlogPresentationWorkspace.vue`、`components/blog/BlogRichEditor.vue`
- [ ] 5.3 `pages/AuthPage.vue`、`pages/AuthCallbackPage.vue`、`pages/AuthorPage.vue`、`pages/AdminPage.vue`
- [ ] 5.4 `pages/AiHubPage.vue`（保 master，因为 ai-hub 本身是 master 新结构；仅 style 段从 backup 的 `AiTavernPage.vue` 抽——若有可对齐的）

### Phase 6: 轻应用相关 SFC（21 个）

- [ ] 6.1 `lightapps/CollapsiblePanel.vue`、`LightAppHeaderPortal.vue`、`LightAppTopToolbar.vue`、`LightAppWindowHost.vue`、`balance/BalanceLedgerWindow.vue`、`blog/BlogSlidevWindow.vue`、`board/BoardCanvasWindow.vue`、`pomodoro/PomodoroWindow.vue`、`url/UrlLinksWindow.vue`
- [ ] 6.2 `lightapps/timeprism/*`（7 个）

### Phase 7: 后端管理面板 SFC

- [ ] 7.1 `admin/AdminBlogCategoriesPanel.vue`、`admin/AdminBlogWhispersPanel.vue`、`admin/AdminServerOpsPanel.vue`

### Phase 8: 验证与提交

- [ ] 8.1 `npm run test:unit` 全过
- [ ] 8.2 `npm run build` 全过
- [ ] 8.3 跑 dev server，按你列出的"backup 上的视觉记忆"逐项对照
- [ ] 8.4 拆成多个原子 commit（每 Phase 一个）
- [ ] 8.5 合到 master（fast-forward 或 squash 由你决定）

---

## 风险与撤销

- **每个文件改动都会先 staged，commit 前你随时可 `git checkout -- <path>` 撤销**
- **整体撤销**：`git checkout master && git branch -D ui-restore-from-backup-20260316`
- **完成后回到 master**：在 master 上 `git merge --ff-only ui-restore-from-backup-20260316`，或 `git merge --squash ui-restore-from-backup-20260316`（推荐 squash，保留一个干净的 commit）

---

## 进度追踪

每完成一个 Phase 我会更新此文档与你确认。当前位置：**Phase 1 已完成，待你视觉验证**。
