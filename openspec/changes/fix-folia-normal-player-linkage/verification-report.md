# Verification: fix-folia-normal-player-linkage

日期：2026-09-30；生产反馈修复复核：2026-10-01。根代理负责诊断、复核与交付；Luna 负责所有实现代码。

## 2026-10-01 生产反馈修复

- 已确认画布歌词缺少颜色 consumer：真实 `shizuki:set-lyric-color` → provider → glyph scene 回归先失败，再由 Luna 接入主歌词 shader 色值及活动场景更新；重置恢复主题/副歌颜色，翻译字幕保留独立颜色。Pixi primitives 在测试中被替代，实际画布仍需发布后浏览器验收。
- 已确认选曲身份比较丢失 provider 与非数字 ID：真实 Vue SFC message handler 的红测中 `playExternalTrack` 调用为零。最小修复使用已有 `readFoliaTrackKey`，4 种 identity 场景通过，保留主站播放队列与单音频 owner。
- 已检查实际登录页：两个旧 tab 仍加载旧站点/Folia bundle；刷新后的版本可通过 Lattice Play 与原生 Folia 歌单 Play 切换不同 NetEase 歌曲，进度增长。只聚焦卡片不会播放；不能把初次聚焦操作误判成切歌失败，也不能据此把所有用户反馈归因为缓存。
- 最终主站 **246 files / 1478 tests passed**；正式构建通过，生成 `MusicLibraryPage-CJ0iajjs.js`。Folia 受影响 **12 files / 80 tests passed**；`tsc --noEmit` 和 `/music/` 正式构建通过。既有大 chunk / Vue 生命周期警告仍存在；没有新增测试失败。
- 完整 Folia 本地提交 `822bcc5caf4103e232994247ec4f128bdcf30868`；公开 patch **116469 bytes**，与相对上游 `6fe68d89` 的完整差异一致，**15 个源码/测试快照逐字节一致**。补丁在干净上游 checkout 通过 `git apply --check`、实际应用及 `git diff --check`。
- OpenSpec 严格校验通过。主站及 Folia 的本轮推送、部署和真实渲染验收尚在进行，任务 4.4 保持未完成；下方首次发布记录保留作历史与回滚依据。

## 完整性、正确性与一致性

| 维度 | 结论 |
| --- | --- |
| 完整性 | 首次发布已完成；本轮反馈修复代码、回归与本地构建完成，生产部署/浏览器验收见任务 4.4。 |
| 正确性 | 原场景及新增颜色/选曲身份场景有代码、测试或浏览器证据；真实画布颜色验收待本轮发布完成。 |
| 一致性 | 仍以Vue播放器为唯一音频所有者；Folia保持独立源码与原生独立运行路径；共用现有API，没有新增后台协议。 |

## 需求与场景映射

| 需求/场景 | 实现与证据 | 验证 |
| --- | --- | --- |
| Audible song has advancing progress | Folia `src/shizukiExternalBridge.ts:701` 同时投射 `currentTime` 与歌词时钟；`buildPlayerViewFlags.ts:38` 接受嵌入当前曲目；App memo包含currentSong。 | flags真实函数先复现false；同文档bridge运行测试验证12.5→18→20.5秒，Folia自有音频被暂停/清空。 |
| Pause and seek are intentional controls | `usePlaybackInteractionBridge.ts:141`、`App.tsx:2041` 直接relay；同步回声只在 `applyingFollowSession` 调用栈内抑制。 | 真实bridge+store验证同步零回声，立即pause/seek各一条，range input即刻回传；不依赖120–900ms时间窗。 |
| Rapidly choose two songs | Folia `usePlaybackQueueController.ts:448` 在解析前转交选曲；主站 `usePlayerEngine.js:1005` selectionGeneration、queueEntryId、授权上下文保护。 | 延迟A→B解析、旧歌词请求、旧toggle/recovery拒绝、队列重排fallback测试；旧结果不能覆盖新状态。 |
| Normal playback prepares the next track | `usePlayerEngine.js:848` 下一首准备；顺序/随机/单曲按主队列；Folia恢复会话、playSong、shuffle三处原生预取入口均在嵌入模式隔离。 | 正常下一首、已存在audio的刷新/复用、尾部环回、随机顺序、暂停/单曲、30秒过期且剩20秒内刷新测试。 |
| Queue changes during preparation | 准备key含队列身份、provider、track、playlist、quality、用户；队列/授权切换失效。`App.vue:530` 返回稳定的按用户授权闭包；Auth支持expectedUserId。 | 移除队列项、改变授权丢弃旧准备；延迟ensureReady从用户7变8时不发送旧cookie写入请求。 |
| Open normal mode after Folia login | `MusicLibraryPage.vue:3727` 普通入口读当前cookie并调用 `musicSourceAccountSync.js`，使用已有upsert/import/sidebar API。 | 真实SFC生命周期测试验证persist→import→sidebar；后端已绑定且无local cookie也导入；guest不调用；原页面基线upsert调用为0。 |
| Login changes or expires | cookie/account去重与owner marker；响应投射再次核对用户；`MusicLibraryPage.vue:2885` 页面同步按钮可重试完整链路。 | helper重叠/账户变化/失败重试；SFC不同owner阻止写入、等待中换账号阻止导入、首次写入失败后页面事件成功重试。测试和报告未输出真实凭据。 |
| Optional lyric provider returns unauthorized | `diagnosis.md` 保存生产入口资源标识、只读DOM、日志来源、401 problem响应及本地无proxy route证据。 | 401被归类为主站路由/授权边界，未当作无歌词；源码修复与线上接受分开说明。 |

Folia文件路径在完整fork中相对`src/`；本仓库公开主要快照，App/flags/hooks等完整改动在`third_party/folia-major/shizuki-folia-v0.7.11.patch`中。

## 最终质量检查

- 主站：合入最新main后重新运行 `pnpm test:unit --reporter=dot`，**246 files / 1474 tests passed**；`pnpm build` 通过。
- 主站受影响子集：播放器50/50、Folia页面26/26、Auth/账号同步26/26，均包含在最终全量结果中。
- 完整Folia：末次直接定向复跑**11/11通过**；之前末次同步时嵌入flags、relay、真实bridge及wordGlow定向套件**16/16通过**。TypeScript `tsc --noEmit`、API TypeScript编译及设置`VITE_BASE_PATH=/music`的生产构建均通过。末次尝试通过pnpm启动测试时，pnpm先触发依赖协调并因下载`onnxruntime-node`超时而未启动测试；使用已存在的依赖目录完成了上述定向复跑。
- 完整Folia全量（联动修复后、末次main同步前）：**4385 passed、2 skipped、1 failed**。失败测试为 `test/unit/mod-system/modSignature.test.ts:137` 的 `signed digest and message (shared vector) > refuses trees that cannot hash the same on every machine`，`fs.symlinkSync` 返回Windows EPERM。末次同步针对字幕颜色与gateway DNS，重新运行相关16项、类型检查和构建，均通过；同文档测试包含字幕颜色设置/恢复断言。
- 上述环境失败在**干净上游v0.7.11 / 6fe68d89**同样复现：该文件7/8通过；`electron/modSystem/modSignature.cjs` 与测试均未修改。没有跳过或弱化该用例；应在支持创建符号链接的环境复跑它。
- Folia默认生产构建及设置 `VITE_BASE_PATH=/music/` 后的正式构建都通过。主站/上游构建仍有大chunk等警告，未作为本次播放故障归因。
- 最终公开patch **98538 bytes** 与完整fork相对6fe68d89的`git diff`逐字节一致；9个桥/服务/可视化器/配置/测试快照SHA-256一致；末次同步后在干净tag worktree中`git apply --check`及实际应用通过。
- 源码`git diff --check`通过。仓库级检查排除作为文本保存的patch本身：patch中的空白context行必须包含一个前导空格，普通diff会将新增这些context行误报为尾随空白；实际patch应用没有whitespace warning。
- 临时基线SFC与patch检验worktree均已移除；保留用户已有worktree。本地完整fork首次修复：`34a51405`；末次同步提交：`388f3e72`，分支`codex/fix-folia-normal-linkage`。
- 收尾时并行工作区将main推进到`554bd949`，本排查分支以`f79391e9`无冲突合入，保留壁纸字节进度、Folia字幕颜色及网易云代理动态DNS修复；完整fork和公开patch同步保留相应Folia改动。最后只读NetEase song/detail probe返回200，独立lyric-proxy仍返回401；这是单独的歌词代理授权/路由问题。
- `openspec validate fix-folia-normal-player-linkage --type change --strict --no-interactive` 严格校验通过；网站诊断分支`codex/diagnose-folia-normal-linkage`已推送至`origin`。本次发行提交`612250bc1098c9317d5ef358a18cc60d54ffb0de`已推至`origin/master`并部署。
- 完整Folía fork的`codex/fix-folia-normal-linkage`分支已推送至用户仓库`https://github.com/IzumiShizuki/folia-major.git`，远端tip为`388f3e727e5ea523c3be16313f5a60034b70965b`；服务器gateway镜像由此提交构建，镜像ID为`sha256:b4c4b14cbb73f3a5b632dc92b2241d8e74367c4299ea1a2eb6586b493ff059e6`。部署时保存了旧镜像回滚标签，并将服务器原有脏改动保存至Git stash。

## 审查结论与遗留验收

没有发现未实现的本地需求或新增回归。唯一未通过单测为已证明存在于上游基线的Windows符号链接权限限制；本次变更保持该测试。生产部署和公开入口烟测通过，但真实账号播放链路尚未在浏览器登录态中验收，因此OpenSpec change保持未归档状态。

## 生产部署与烟测

- 主站：`origin/master`提交`612250bc1098c9317d5ef358a18cc60d54ffb0de`已部署。远端快照为`snapshot-20261001-132119-612250bc1098`；部署脚本报告30个文件上传并逐一校验、健康检查通过。主站和候选前端文件哈希一致。
- Folia：Fork分支`codex/fix-folia-normal-linkage`提交`388f3e727e5ea523c3be16313f5a60034b70965b`已部署至gateway。新镜像`sha256:b4c4b14cbb73f3a5b632dc92b2241d8e74367c4299ea1a2eb6586b493ff059e6`健康；旧镜像保留为`folia-local/gateway:backup-pre-linkage-20261001`，旧站端工作区改动保留在stash`bd706be40eaed87fe5e1ce95858c89ada426c29a`。
- 线上`/music/`、Folia入口bundle、`/netease/login/qr/key`均返回HTTP 200。线上站点JS入口引用的`MusicLibraryPage-CBinEqdK.js`返回200，且包含本次歌单同步及失败重试文案。浏览器service worker/真实账号播放行为尚未通过用户会话手动确认。

## 待实际账号验收

1. 使用实际网易云账号验证普通入口同步、失败重试和账号切换；顺序/随机队列中连续播放，并频繁A→B选择及正常模式/Folia往返。
2. 在截图的Lattice界面验证时间持续增长、控件可用、立即暂停/恢复及向前/向后拖动；确认只有主站音频输出、没有Folia独立prefetch日志。
3. 验证实际权限受限歌曲、试播链接和CDN Range seek；模拟源过期后恢复。本地mock只能证明时序/状态，不证明每首歌曲的远端播放权限。
4. 独立歌词搜索中的`/api/lyric-proxy`仍有401，属于单独的路由/授权问题；本次未修改它，也不应通过放宽主站登录校验解决。嵌入模式使用主站已解析的歌词，避免启动该独立流水线。
