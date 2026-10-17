# 公开内容发现与阅读

本次变更沿用 Vue Hash 应用，增加可直接阅读的服务端 HTML。站外分享使用新地址；站内编辑、播放与交互继续使用现有应用路由。

## 地址与发布边界

| 地址 | 用途 |
| --- | --- |
| `/read/` | 公开内容索引 |
| `/read/posts/{id}` | 公开文章正文、分享预览 |
| `/read/albums/{slug}` | 相册说明及可公开展示的照片 |
| `/read/moments/{publicId}` | 动态正文及可公开展示的照片 |
| `/sitemap.xml` | 全量公开内容；超过 50,000 条时返回分页站点地图索引 |
| `/robots.txt` | 抓取规则及 sitemap 地址 |

初始 HTML 包含标题、description、canonical、Open Graph、Twitter Card 与 JSON-LD，无须执行 JavaScript。页面提供进入完整交互页面的链接，不自动跳转。

robots 保留 API 总体抓取限制，并放行无查询参数的 DISPLAY_WEBP、DISPLAY_AVIF、THUMB_WEBP 展示路由，避免预览图被总体规则挡住。阅读页优先使用展示图而非缩略图；带能力凭据的媒体仍不写入 HTML。规则的具体路径优先级与 URL 结束匹配参照 [Google robots 说明](https://developers.google.com/crawling/docs/robots-txt/robots-txt-spec)。实际访问权限始终由媒体服务控制。

文章仅允许匿名可读、已发布、未删除的 PUBLIC 内容进入索引与公开阅读页，包含分类访问策略检查；管理员访问也不能扩大发现范围。相册与动态复用已有公开查询及功能开关。UNLISTED 保留直接访问，返回 noindex 和 private/no-store；需要授权能力的媒体不会写入静态 HTML，可从站内交互页查看。私密、草稿、已删除及不可访问内容返回真实错误状态，不透露标题、封面或正文。

## 域名与代理

- 后端：`shizuki.content.public-site-url`，通过 `PUBLIC_SITE_URL` 覆盖，默认 `https://site.shizuki.online`。
- 桌面分享回退域名：构建变量 `VITE_PUBLIC_SITE_URL`，默认同上。Web 分享使用当前 HTTP(S) 站点的源；桌面文件协议使用配置的公共源。
- 配置值只接受 HTTP(S) 源，不接受凭据、路径、查询参数或片段。服务器不信任请求的 Host/Forwarded 来生成 canonical。
- `deploy/nginx.frontend.conf` 已将 `/read`、`/read/**`、`/sitemap.xml`、`/robots.txt` 代理至 backend。Vite 使用现有 API target 代理同样的地址。
- 单体公开路径已配置；业务可见性仍由内容服务控制。无需数据库迁移或新增搜索服务。

部署时需同时更新后端、前端与 Nginx 配置。若修改公共域名，同步设置后端 `PUBLIC_SITE_URL` 和桌面构建的 `VITE_PUBLIC_SITE_URL`。

## 正文搜索

`GET /api/v1/posts?keyword=...` 支持跨标题、摘要、标签、分类与 Markdown 可读正文的多词搜索。空白分隔的每个词均须命中一个字段；分类、标签、时间、排序与分页规则继续生效。

非空查询只读取有权限候选文章的本地 Markdown 缓存，每批最多 200 条，仅投影 postId/markdownCache。空查询不读取正文；旧文章缺少缓存且元数据不能满足查询时才读取存储回退。旧缓存缺失较多时应先回填缓存，再根据实际规模评估数据库全文索引。更新、撤稿直接反映在下一次查询中，不需重新构建前端。

响应新增兼容字段 `searchExcerpt`，最长约 220 个字符。前端以文本节点和 mark 展示命中词，不将搜索片段当 HTML 执行。

摘要定位保留原文字形：大小写转换导致字符长度变化时，会把命中偏移映射回原文，避免越界或截断 emoji。

## 阅读与工作区

- 博客列表在会话内保存筛选、页码与位置，保留六小时；不保存文章正文或登录凭据，存储不可用时仍能阅读。
- 手机搜索与筛选入口位于内容前方，分页不再与筛选按钮叠放。正文、代码、表格和图片保持在视口内，代码/表格在自身区域滚动。
- 手机目录支持焦点限制、Escape、点击关闭和返回触发按钮，包含安全区与减少动画支持。
- 分享与自动复制都不可用时，会显示并选中正式分享链接供手动复制；桌面端不会提示复制本地文件地址。切换内容后清除旧反馈，忽略过期的异步分享结果。
- 编辑器顶部显示文章上下文、保存/失败状态及“保存草稿”主操作；保留原有编辑、上传、发布、演示和权限能力。
- 音乐、相册、动态及作者管理沿用主题和真实数据，改进层次、封面、照片数量、日期及空状态；无曲目时不显示空歌词浮层。

## 验证与部署后检查

首轮完成 160 项前端测试、63 项后端测试；本轮边界修复另通过 30 项前端、36 项后端回归测试及 Vite 生产构建。详细证据见对应 OpenSpec change 的 verification.md。

后端检查使用现有 Java 17 环境：

```powershell
cmd /c '"D:\environment\activate-shizuki-site.cmd" && mvn -pl modules/content-module,apps/monolith-app -am -Dtest=ContentServiceImplVisibilityTest,PublicContentPageControllerTest,PublicSitePropertiesTest,PublicContentDiscoveryServiceTest,PostControllerIntegrationTest,PublicMomentControllerTest,PublicAlbumQueryServiceTest,PublicMomentQueryServiceTest,AuthEntryFilterTest -Dsurefire.failIfNoSpecifiedTests=false test -q'
```

获准部署之后再执行：

1. 使用实际已发布内容请求 `/read/...`，检查原始 HTTP 正文、状态、Content-Type、canonical、预览图片和交互链接。
2. 确认 sitemap、robots 与实际公共源一致，UNLISTED/private/草稿不出现在公开索引；撤稿后阅读地址不可用。
3. 使用搜索引擎站长工具和实际分享平台检查抓取与图片缓存。单元测试证明输出契约，不代表搜索引擎已经收录或平台已刷新预览。

本次只准备并验证代码与配置，没有部署或推送远端。
