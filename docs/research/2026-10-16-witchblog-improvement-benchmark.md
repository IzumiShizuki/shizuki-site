# witchBlog 对照调研与 Shizuki Site 提升建议

调研日期：2026-10-16。

**建议先做公开内容的收录与分享、RSS 订阅、正文搜索，再补作品集与兴趣展示。** 本站已经具备较丰富的阅读、音乐、相册、动态、轻应用和作者工作台能力；witchBlog 更有参考价值的部分，是内容如何被发现、持续回访，以及如何呈现作者的兴趣与作品。

## 调研范围与基线

- 已下载到 [D:/program/witchBlog](D:/program/witchBlog)，使用 `git clone --depth 1`；对照提交为 `080d8a016ac90ec2a7e340ba0af0ffb1ee595651`，提交时间为 2026-10-12 00:23:28 +08:00。
- 对方结构为 Next.js 前台、React 管理后台、FastAPI 服务。检查了实际路由、阅读组件、搜索、RSS、站点地图、兴趣展示、项目解析、访客分析、定时任务及缓存刷新代码，不能仅以 README 的功能表判定完成情况。见 [项目说明][W00]。
- 本站对照代码基线为 `08c47de32383674b31cbadef93efdaae8c7b328f`；配套盘点见 [本站能力与证据清单](D:/program/shizuki-site/docs/research/2026-10-16-shizuki-capability-inventory.md)。
- 本次是源码调研，没有启动 witchBlog 的数据库、前后台及第三方集成，也没有进行线上页面、移动真机或性能实测。以下“具备”表示找到相关实现，不表示验证了其生产可用性；收益、优先级和改进方向均为本次判断。
- 本次交付研究文档；后续选定材料性功能后，应按本站 OpenSpec 约定创建 proposal、design、spec 与 tasks，再实施和验收。

## 建议优先级

P0 表示建议进入下一轮计划；P1 表示随后推进。工作量仅按代码涉及范围粗分，不是工期承诺。

| 优先级 | 方向 | 本站现状 | 适合吸收的部分 | 预期收益与工作量 |
| --- | --- | --- | --- | --- |
| P0 | 公开内容 SEO 与分享预览 | Hash 路由、统一 HTML 入口、运行时标题；未找到完整公开站点地图与文章级初始元信息输出 | 独立文章 URL、文章 metadata、canonical、结构化数据、公开内容 sitemap | 改善搜索发现与外链预览；中至大 |
| P0 | RSS 订阅 | 未找到公开 Feed 输出及订阅入口 | 自动生成公开文章 Feed、易复制的订阅入口 | 增加持续回访方式；小至中，需配合稳定 URL |
| P0 | 正文搜索与统一入口 | 标题、摘要、标签检索已有；不覆盖正文 | 多字段、多词检索及桌面弹层/移动面板 | 提升旧文章可找回性；中 |
| P1 | 项目作品集 | 有项目数量、技能和建站经历；未找到独立项目集合 | 项目卡、仓库链接、技术栈、状态、语言统计 | 补足作者作品展示；中 |
| P1 | 兴趣与“最近在做什么” | 音乐、相册、动态已有；未找到追番清单或 Steam 游戏库展示 | 追番进度、游戏状态、收藏与短评 | 增强个人表达和内容更新理由；中 |
| P1 | 跨内容的最近更新 | 博客已有精选相册/动态轨道，三类内容仍独立 | 将项目与时间线聚合显示的思路，扩展到本站公开内容 | 让已有内容彼此连通；小至中 |
| P1 | 访客与内容分析 | 作者页有浏览数字展示及运维概览；未确认访客埋点聚合链路 | 趋势、来源、热门内容、人类/机器人区分 | 支持内容与功能取舍；中 |
| P1 | 公开页面的移动阅读 | 响应式、辅助抽屉和阅读工具已有；独立移动外壳主要覆盖音乐 | 手机目录折叠、搜索面板、返回路径、内容优先布局 | 打磨公共内容的手机体验；中，先做体验验收 |

## 1. 公开内容 SEO 与分享预览

**对方实际实现：** 文章页服务端生成 title、description、canonical、Open Graph、Twitter metadata，并输出文章结构化数据；单独实现 `sitemap.ts` 和 `robots.ts`，站点地图筛选公开且非加密文章。文章还有预生成参数与重新验证机制。见 [文章页面][W01]、[站点地图][W02]、[爬虫规则][W03]。

**本站对照：** [router/index.js:196](D:/program/shizuki-site/fronted/vue3-merged/src/router/index.js:196) 使用 `createWebHashHistory()`；[index.html:7](D:/program/shizuki-site/fronted/vue3-merged/index.html:7) 为统一标题，App 在运行时修改 `document.title`。本站已有生活内容可索引资格及运行时 `noindex` 控制，不能把这部分概括成“完全没有 SEO”；但未找到完整公开 Feed、sitemap 与文章级初始 HTML metadata 输出。详细位置见能力清单。

**适合本站的落地：** 为公开博客先建立稳定的无 Hash URL，输出包含标题、摘要、作者、封面、发布时间和正文的可发现页面；补 canonical、分享元信息与文章结构化数据，再接 sitemap。沿用 Vue/Spring 结构，可评估公开页面预渲染或后端生成 HTML，不需要据此决定更换整站框架。只切换路由模式或在浏览器里设置标题，不足以完成该项。

**验收重点：** 直接请求文章地址可取得该文章的初始元信息；旧 Hash 链接可继续到达；刷新深链正常；草稿、私人内容和仅链接可访问内容不进入公开索引。对方 sitemap 一次最多取 1000 条，本站应采用可覆盖全部公开内容的分页生成方式。见 [站点地图查询上限][W02]。

## 2. RSS 订阅

**对方实际实现：** 有 RSS XML 生成器、公开/加密过滤与缓存响应，以及复制订阅地址的侧栏卡片；但卡片仍写死为 `https://example.com/rss/feed`，因此“有组件”不能等同于开箱即可用。见 [Feed 生成][W04]、[订阅卡片][W05]。

**适合本站的落地：** 首期提供公开博客 RSS，文章列表或作者页放简洁的“订阅更新”入口，支持复制及直接打开；后续再评估动态/相册聚合 Feed。订阅地址来自本站公开配置，文章链接与第 1 项统一；Feed 的 GUID、发布时间和更新策略要稳定，避免一改文章就被订阅器识别成新文章。

**验收重点：** 新发布文章可被订阅器读到；改稿、删除、转私密能更新结果；XML 正确转义；私人或 UNLISTED 内容不进入聚合；空 Feed 也保持合法。RSS 可以先独立交付，SEO 的稳定 URL 方案确定后再统一链接。

## 3. 正文搜索与统一入口

**对方实际实现：** 搜索标题、描述、正文、标签和分类，并要求多个搜索词逐一命中；桌面弹层与手机底部面板分别呈现。实现从 `contentlayer/generated` 读取 `allPosts`，文章详情却可以来自后端动态文件 API，因此静态搜索数据与动态内容是否同步需要额外验证。代码中“防抖”注释下主要是 `useMemo` 过滤，也不应仅据注释认定已实现输入防抖。见 [搜索组件][W06]、[动态文章页][W01]。

**本站对照：** [BlogListPage.vue:100](D:/program/shizuki-site/fronted/vue3-merged/src/pages/BlogListPage.vue:100) 明确提示“搜索标题 / 摘要 / 标签”；[ContentServiceImpl.java:2538](D:/program/shizuki-site/modules/content-module/src/main/java/io/github/shizuki/site/content/service/impl/ContentServiceImpl.java:2538) 的过滤方法也只覆盖这三类，不含正文。

**适合本站的落地：** 为已发布文章建立正文检索数据，显示命中片段，并继续支持分类、标签、日期过滤；从稳定的全站入口进入，手机以简短面板呈现。全站搜索第一步只服务文章，之后再按文章/动态/相册分组扩展。索引应随发布、修改、撤稿同步，检索结果也必须经过可见性约束。

**验收重点：** 只出现在正文中的独特词能检索到文章；撤稿后无法查出；结果可分页；没有命中时给出清楚的清空/重试路径。首次不必引入独立搜索集群；采用哪种索引取决于真实文章量、中文检索需求和测量结果。

## 4. 项目作品集

**对方实际实现：** 具有独立项目列表及管理表单，解析 GitHub/Gitee 仓库，提取说明、Star、Fork 和语言信息；最新项目还能进入侧栏。见 [项目解析][W07]、[项目管理][W08]、[最近更新][W09]。

**本站对照：** 作者介绍中有 `projects` 数字，技能、建站经历和公开链接也已有；未找到包含项目状态、仓库地址、技术栈、封面及详情的完整项目集合。见 [AuthorAboutExperience.vue:11](D:/program/shizuki-site/fronted/vue3-merged/src/components/author/AuthorAboutExperience.vue:11) 与能力清单。

**适合本站的落地：** 在作者空间加入“作品”页签，先人工维护标题、一句话价值、截图、技术栈、状态、仓库/演示链接、关联文章；可从本站及已有工具的真实项目开始。仓库指标作为后续增强，展示同步时间，接口失败时保留内容。

**取舍：** 优先呈现“做了什么、解决什么问题、怎么体验”，再补 Star 与语言统计。对方包含 HTML 抓取实现，本站可独立选择更稳定的数据来源，不必照搬解析规则。

## 5. 兴趣与“最近在做什么”

**对方实际实现：** 追番支持在看、看完、计划、搁置，包含集数、评分和收藏；游戏展示区分最近、正在玩和喜爱作品，另有 Steam 相关后端服务与管理。见 [追番组件][W10]、[游戏组件][W11]、[公开游戏接口][W12]。

**本站对照：** 已有音乐库、动态和相册；当前代码中的 Steam 相关能力主要服务壁纸创意工坊，不能当成已具备游戏库。配套能力清单标明了检索范围和证据。

**适合本站的落地：** 先在作者页做小规模的“最近在听 / 在看 / 在玩”公开卡片，支持进度、状态及一句短评，并关联已有动态或文章。首期可手动维护；确认持续使用后再增加外部账号同步。只展示作者主动选择公开的条目，自动同步失败不清空卡片。

**取舍：** 有持续内容才扩展成独立页面；目前音乐已很丰富，应优先连接已有歌单与收听内容，新增重点放在追番/游戏记录。对方具备 Steam 集成不代表所有兴趣数据都能无配置自动获取。

## 6. 跨内容的最近更新

**对方实际实现：** `LatestUpdatesSidebar` 并行取项目和时间线，分别选最近 1 条显示。它不是覆盖全站类型的统一时间流；这里借鉴的是“跨模块给出更新入口”的思路。见 [最近更新][W09]。

**本站对照：** [BlogListPage.vue:199](D:/program/shizuki-site/fronted/vue3-merged/src/pages/BlogListPage.vue:199) 与同文件第 248 行已有精选相册/动态轨道，[第 677 行](D:/program/shizuki-site/fronted/vue3-merged/src/pages/BlogListPage.vue:677) 分别请求精选内容。因此这项应归为已有能力的扩展。

**适合本站的落地：** 在作者公开页提供紧凑的“最近更新”，按时间汇总文章、动态、相册，后续接作品集；每项显示类型、标题、日期和直接链接。主内容区可展开全部，侧栏只放少量预览。明确用“首次发布”还是“内容更新”排序，避免一次小改稿反复顶到最前。

**验收重点：** 跨类型时间排序稳定，列表分页不重复；内容转私密后及时消失；相册增加照片时能按既定规则更新；UNLISTED 不因聚合而获得公开入口。不要把 TimePrism 私人日程混入这里。

## 7. 访客与内容分析

**对方实际实现：** 管理页有流量趋势、热门页面、来源、时段与地区，并区分人类和机器人；指标中明确存在请求数和按 IP 去重的访客数。见 [访客分析页面][W13]。

**本站对照：** 作者页已有浏览数字展示，但本次未确认其访客埋点聚合链路；运维管理已有服务健康、容器、日志、配额、提示词缓存指标等。这与“哪些公开内容被阅读、访客从哪里来”是不同的统计用途。现有管理与发布工作台无需重新搭建，详见能力清单。

**适合本站的落地：** 在现有作者工作台增加近 7/30 天内容趋势、来源、热门文章、搜索无结果词及公开模块入口点击。优先回答“用户看了什么、搜索不到什么、下一步去了哪里”，统计结果用于决定继续维护哪些页面。

**统计口径：** 页面浏览、接口请求和音乐/图片资源请求分别计量；同一位访客打开播放器产生的多次 API 请求不能直接算作多次阅读。IP 去重仅作为近似口径，机器人、作者本人和管理访问应标注或排除。留存时间与公开聚合字段在实施时明确。

## 8. 公开页面的移动阅读

**对方实际实现：** 手机隐藏大侧栏，以移动顶栏/返回路径进入页面；目录使用折叠区，搜索另用底部面板。见 [页面布局][W14]、[目录][W15]、[搜索][W06]。

**本站对照：** 现有博客已具备目录、当前章节、字数、时长、阅读进度、相关文章及辅助抽屉；作者、相册、动态也已有响应式实现。独立 `/m` 外壳主要覆盖音乐相关页面。不能把“新增目录/阅读进度”列为本次增量，亦不能仅凭源码判定现有手机布局不好。

**适合本站的落地：** 先验收手机上的“从列表搜索 → 打开文章 → 展开目录 → 返回原列表位置”，以及相册/动态的连续浏览；根据实际问题调整顶栏、目录与操作面板。保持正文为第一视觉层，不必为全部公开页面再建设一套独立功能外壳。

**验收重点：** 360px 窄屏、软键盘弹出、安全区、长标题、长代码块、横图、目录深层级、返回保留筛选/位置、字体放大。手机上的音乐播放器与看板娘不遮挡正文操作。此项需要后续浏览器与真机证据，本次不作画面评分。

## 适合后置的两类增强

- **国际化：** 对方有中、英、日、韩语言配置与消息文件，见 [语言配置][W16]。若本站有明确的非中文读者，再先做导航、作者简介和精选文章；需要区分“界面翻译”和“内容翻译”，避免只有空的语言入口。
- **定时任务与发布反馈：** 对方后台显示上次/下次运行、状态和手动触发，另有管理操作后通知前台刷新缓存的机制，见 [定时任务页][W17]、[缓存刷新通知][W18]。本站已有强大的运维台与缓存机制；可先补统一的“最近同步 / 失败重试 / 发布是否生效”反馈，再评估是否需要新增任务总览。

## 本站已有能力与借鉴边界

| 能力 | 本次判断 |
| --- | --- |
| Markdown、目录、阅读进度、字数/时长、同分类相关文章 | 本站已经实现，继续围绕具体问题打磨。 |
| 分类、标签、月归档、公开文章日历 | 本站已经实现；对方年度归档样式可作为后续呈现参考。 |
| 音乐、相册、动态、作者页 | 本站已有较多功能，适合通过最近更新与关联内容连接起来。 |
| 看板娘、主题色、动效 | 本站已有 Meguri 和视觉配置；没有必要仅因对方使用 Live2D/樱花再叠加一套。 |
| 用户权限、独立管理能力、对象存储、日志/健康 | 本站已有对应体系，沿用已有实现并补内容运营维度。 |
| 评论 | 本站公开文章评论可另行评估，但本次未找到 witchBlog 的成套评论实现，不把它包装成该项目的直接借鉴项。 |

对方选择 CC BY-NC-SA 4.0，并在第三方清单中另列 Live2D、音乐和插画的权利边界。当前建议以功能与组织方式为参考，按本站技术栈独立实现；若以后直接复用源码或素材，应先核对仓库对应许可与署名要求。见 [许可说明][W19]、[第三方清单][W20]。

## 建议交付顺序与待决事项

1. **内容分发基础：** 确定公开文章 URL/初始 HTML 方案，交付 RSS，再完善文章 metadata、站点地图和分享预览。RSS 可以先做，但要预留链接迁移的一致性。
2. **内容发现：** 正文搜索、统一搜索入口、手机搜索与文章返回流程；在已有目录/推荐能力上验收完整路径。
3. **作者表达：** 作品集与小规模兴趣卡，利用现有作者空间发布；随后把它们接入最近更新。
4. **运营反馈：** 基于前述公开路径补内容分析；按真实内容量和访问情况决定后续投入。

尚需在实施阶段确定：公开页面的渲染与深链兼容方案、RSS 输出范围、搜索的中文分词与更新机制、作品/兴趣首批真实内容、统计事件口径。以上是候选待办，本次未将其标记为已开发或已验收。

## 一手源码索引

下列 witchBlog 链接固定到本次下载的提交，避免后续 main 更新改变证据。

[W00]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/README.md
[W01]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/web/src/app/%5Blocale%5D/posts/%5Bslug%5D/page.tsx#L71
[W02]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/web/src/app/sitemap.ts#L15
[W03]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/web/src/app/robots.ts#L4
[W04]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/web/src/lib/rss-handler.ts#L72
[W05]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/web/src/components/RSSSubscribeCard.tsx#L7
[W06]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/web/src/components/SearchModal.tsx#L23
[W07]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/backend/app/services/project_parser.py#L35
[W08]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/admin/src/pages/Projects.tsx#L38
[W09]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/web/src/components/LatestUpdatesSidebar.tsx#L13
[W10]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/web/src/components/AnimeList.tsx#L10
[W11]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/web/src/components/GameShowcase.tsx#L100
[W12]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/backend/app/api/v1/game_showcase_public.py#L22
[W13]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/admin/src/pages/VisitorAnalytics.tsx#L92
[W14]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/web/src/components/PageLayout.tsx#L17
[W15]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/web/src/components/TableOfContents.tsx#L16
[W16]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/web/src/i18n.ts#L8
[W17]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/admin/src/pages/ScheduledTasks.tsx#L171
[W18]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/backend/app/services/frontend_cache.py#L25
[W19]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/README.md#L172
[W20]: https://github.com/witchscottishfoldcat/witchBlog/blob/080d8a016ac90ec2a7e340ba0af0ffb1ee595651/THIRD_PARTY_NOTICES.md
