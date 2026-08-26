## Purpose

规定 About、Blog、Albums 与 Moments 的共享响应式内容结构、滚动方式和模块层级，使个人资料、生活内容与阅读体验在桌面、平板和移动端保持连贯，同时延续播放器与真实生产内容。

## ADDED Requirements

### Requirement: Public personal content uses defined responsive columns
公共个人内容页面 SHALL 在视口宽度不小于 1200 CSS 像素时呈现左侧辅助栏、中央主内容和右侧辅助栏三栏；在 900 至 1199 CSS 像素时呈现主内容与一个辅助区域两栏；在小于 900 CSS 像素时呈现单栏主内容并将辅助模块收纳到可显式打开的抽屉。

#### Scenario: Desktop viewport opens a personal content page
- **WHEN** 用户在宽度不小于 1200 CSS 像素的视口打开 About、Blog 列表、文章详情、Albums 或 Moments
- **THEN** 页面同时呈现左侧辅助栏、中央主内容和右侧辅助栏
- **AND** 中央主内容获得主要的可用宽度与视觉优先级

#### Scenario: Tablet viewport opens a personal content page
- **WHEN** 用户在宽度为 900 至 1199 CSS 像素的视口打开公共个人内容页面
- **THEN** 页面呈现中央主内容与一个可见辅助区域两栏
- **AND** 其余辅助模块仍可通过明确入口访问而不会覆盖主内容

#### Scenario: Mobile viewport opens a personal content page
- **WHEN** 用户在宽度小于 900 CSS 像素的视口打开公共个人内容页面
- **THEN** 页面呈现聚焦的单栏主内容
- **AND** 天气、今日一言、音乐和其他辅助模块被收纳到可显式打开和关闭的生活抽屉

### Requirement: Public content pages use one primary vertical scroll
About、Blog 列表、文章详情、Albums 与 Moments SHALL 各自使用一个页面级主纵向滚动区域；桌面辅助栏 SHALL 以分段吸附方式随该滚动区域工作，且 MUST NOT 为普通浏览引入彼此竞争的独立纵向滚动栏。

#### Scenario: User scrolls a desktop three-column page
- **WHEN** 用户在三栏公共内容页面纵向滚动
- **THEN** 中央内容、左侧辅助栏与右侧辅助栏依据同一个主滚动位置更新
- **AND** 分段吸附的辅助卡片不会截留页面纵向滚动

#### Scenario: User returns from a local horizontal rail to page scrolling
- **WHEN** 用户将横向内容滑轨滚动到边缘后继续作纵向输入
- **THEN** 页面主纵向滚动继续响应
- **AND** 横向滑轨不会形成无法离开的滚动区域

### Requirement: Local preview rails remain horizontally operable
相册、动态和精选内容预览 SHALL 在主页面纵向流中以局部横向滑轨呈现，并 MUST 支持触控滑动、鼠标滚轮、可见方向操作和键盘访问，而不把整页改造成横向翻页。

#### Scenario: User browses a preview rail
- **WHEN** 用户通过触控、鼠标、键盘或可见方向操作浏览相册或动态预览
- **THEN** 仅该预览轨道沿水平方向移动
- **AND** 页面其他栏目与主纵向位置保持稳定

### Requirement: About provides the complete personal overview
About 页面 SHALL 在左栏展示作者资料与统计，在中央展示既有个人故事、建站经历以及精选 Albums 和 Moments，在右栏展示天气、今日一言和复用全局播放状态的音乐卡片；现有可公开作者内容 SHALL 在新结构中继续可见。

#### Scenario: User opens About with published life content
- **WHEN** 用户打开 About 且存在可见的精选相册或动态
- **THEN** 左栏展示作者资料与统计
- **AND** 中央内容展示个人故事以及相册和动态预览
- **AND** 右栏展示天气、今日一言和当前音乐状态

#### Scenario: User follows a preview to full content
- **WHEN** 用户从 About 的相册或动态预览激活“查看全部”或具体内容
- **THEN** 系统打开对应的独立 Albums、相册详情或 Moments 页面
- **AND** About 的其他模块状态不会被清空

### Requirement: Blog list balances discovery and personal context
Blog 列表 SHALL 在左栏提供分类与归档，在中央提供文章流并穿插精选相册或动态预览，在右栏提供最新文章、站点状态以及紧凑天气、今日一言和当前音乐状态；辅助生活内容 MUST NOT 替代文章流的主要视觉层级。

#### Scenario: User opens the Blog list
- **WHEN** 用户打开 Blog 列表
- **THEN** 分类与归档位于左侧辅助区域
- **AND** 文章流占据中央主要区域
- **AND** 最新文章与紧凑生活模块位于右侧辅助区域

#### Scenario: User filters the article flow
- **WHEN** 用户选择分类、标签或归档条件
- **THEN** 中央文章流更新为符合条件的文章
- **AND** 天气、今日一言与播放器状态不因筛选而重置

### Requirement: Blog detail preserves reading focus
文章详情 SHALL 以正文阅读为视觉中心，仅提供可收起的今日一言和播放器状态作为生活辅助；页面 MUST NOT 在正文中插入相册预览、动态预览或其他与当前文章无关的生活内容。

#### Scenario: User reads a blog article
- **WHEN** 用户打开一篇文章详情
- **THEN** 标题、正文、目录与阅读进度保持主要层级
- **AND** 今日一言和播放器以可收起的辅助形式提供
- **AND** 正文中不出现相册或动态推荐轨道

#### Scenario: User collapses article auxiliary content
- **WHEN** 用户收起文章详情中的今日一言或播放器辅助内容
- **THEN** 正文获得更多可用空间
- **AND** 当前阅读位置与播放状态保持不变

### Requirement: Albums and Moments have preview and standalone levels
Albums 与 Moments SHALL 同时提供嵌入 About 或 Blog 列表的精选预览和可直接访问的独立完整页面；相册预览 SHALL 能进入具体相册浏览，动态预览 SHALL 能进入完整动态浏览。

#### Scenario: User opens the standalone Albums page
- **WHEN** 用户从 Site 菜单或精选预览进入 Albums
- **THEN** 系统展示所有对该用户可见的相册入口
- **AND** 用户可以继续进入一个具体相册的完整浏览体验

#### Scenario: User opens the standalone Moments page
- **WHEN** 用户从 Site 菜单或精选预览进入 Moments
- **THEN** 系统展示所有对该用户可见的动态
- **AND** 用户可以展开动态正文并查看其可见媒体

### Requirement: Global playback continues across personal content navigation
About、Blog、Albums 与 Moments 中的音乐卡片 SHALL 投射同一个全局播放器状态；打开、关闭、筛选或切换这些页面 MUST NOT 自动开始播放、停止播放、重置曲目、改变播放位置或创建独立播放队列。

#### Scenario: Playing user navigates between personal content pages
- **WHEN** 音乐正在播放且用户从 About 导航到 Blog、Albums、Moments 或文章详情
- **THEN** 当前曲目与播放位置连续保持
- **AND** 目标页面的音乐卡片显示同一播放状态

#### Scenario: No music is playing
- **WHEN** 用户打开含音乐卡片的页面且全局播放器当前未播放
- **THEN** 音乐卡片可以展示后台推荐歌单或空闲状态
- **AND** 页面不会自动开始播放音频

#### Scenario: User activates the music card
- **WHEN** 用户激活 About、Blog、Albums 或 Moments 中的音乐卡片
- **THEN** 系统展开或打开既有全局播放器体验
- **AND** 当前曲目、播放位置与队列保持连续而不创建第二套播放器状态

### Requirement: Article navigation preserves selected-card context
从 Blog 列表进入文章详情 SHALL 在沉浸模式下提供从所选文章卡片到阅读页的连续空间过渡，并 MUST 在舒缓模式或浏览器不支持该能力时提供可读、可聚焦且功能等价的普通导航。

#### Scenario: User opens an article in immersive mode
- **WHEN** 有效动效模式为沉浸且用户激活一张文章卡片
- **THEN** 所选卡片的标题或封面连续过渡到文章阅读页
- **AND** 目标页面聚焦阅读标题而不重置全局播放器或生活组件缓存

#### Scenario: Continuous transition is unavailable
- **WHEN** 有效动效模式为舒缓或浏览器不支持连续页面过渡
- **THEN** 系统使用轻量普通导航打开同一文章
- **AND** 链接语义、键盘操作和目标内容保持完整

### Requirement: Eligible personal content is shareable without weakening visibility
公开或未列出的文章、相册和动态 SHALL 提供稳定内容链接以及系统分享或复制链接的回退操作；分享操作 MUST NOT 暴露私有内容、原始 OSS 地址或管理员预览凭据。

#### Scenario: Visitor shares public content
- **WHEN** 访客在支持系统分享的环境中分享一篇公开文章、相册或动态
- **THEN** 系统分享该内容的站内稳定链接和公开标题
- **AND** 分享载荷不包含签名媒体 URL、存储对象地址或账户数据

#### Scenario: System sharing is unavailable
- **WHEN** 当前环境不支持系统分享
- **THEN** 系统提供复制同一稳定内容链接的操作
- **AND** 当前阅读、相册或动态位置保持不变

#### Scenario: Private preview is open
- **WHEN** 管理员正在查看草稿或私有预览
- **THEN** 普通访客分享入口不可用或明确只复制受保护的管理员预览地址
- **AND** 系统不会生成绕过访问控制的公开链接

### Requirement: Production pages do not fabricate personal content
系统 MUST 迁移并继续展示现有真实作者资料、建站经历与关于本站内容，且 MUST NOT 使用头像、壁纸、测试夹具或生成图片伪装成生产相册或动态；没有已发布内容时 SHALL 展示诚实空状态。

#### Scenario: Site has no published albums or moments
- **WHEN** 生产环境尚无可见相册或动态
- **THEN** 独立页面展示“内容正在整理”或含义等同的空状态
- **AND** About 与 Blog 不展示虚构生活照片或虚构动态

#### Scenario: First real content is published
- **WHEN** 管理员发布第一组可见相册或动态并将其设为精选
- **THEN** 对应精选预览自动出现在允许该模块的页面
- **AND** 无需使用或保留任何生产演示内容
