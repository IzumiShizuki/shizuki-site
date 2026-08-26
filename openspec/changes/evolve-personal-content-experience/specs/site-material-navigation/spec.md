## Purpose

规定全站主导航、个人内容入口与液态材质在滚动、昼夜主题、移动端和 Focus 状态下的统一可观察行为，使用户能够稳定进入核心工作区与个人内容而不破坏既有 Home 层级。

## ADDED Requirements

### Requirement: Content navigation responds to the main page scroll
在非 Focus 的内容页面中，主导航 SHALL 在主页面位于顶部时呈现完整导航，并在用户向下滚动越过首屏导航阈值后收拢为居中的紧凑液态导航；该变化 MUST NOT 改变当前路由或页面内容状态。

#### Scenario: Content page is opened at the top
- **WHEN** 用户打开一个内容页面且主页面滚动位置位于顶部
- **THEN** 系统显示包含五个既有主入口的完整导航
- **AND** 当前路由入口保持明确高亮

#### Scenario: User scrolls down the content page
- **WHEN** 用户沿页面唯一的主纵向滚动区域向下滚动并越过导航阈值
- **THEN** 完整导航收拢为居中的紧凑液态导航
- **AND** 用户仍可从紧凑导航访问相同的主入口和 Site 个人内容入口

#### Scenario: User returns to the top
- **WHEN** 用户将主页面滚动位置返回顶部
- **THEN** 系统恢复完整导航
- **AND** 页面滚动位置与当前内容选择保持不变

### Requirement: Primary navigation preserves the existing route set
全站导航 SHALL 保留 Home、Blog、Music、Apps 与 AI Hub 五个既有主入口，新增个人内容 MUST 通过 Site 入口组织，而不是增加与这五个入口竞争的一级导航项。

#### Scenario: User inspects the full navigation
- **WHEN** 用户打开完整导航
- **THEN** 系统展示 Home、Blog、Music、Apps 与 AI Hub 五个主入口
- **AND** About、Albums 与 Moments 被组织在 Site 个人内容入口内

### Requirement: Site menu exposes the personal content hierarchy
Site 入口 SHALL 提供 About、Albums 与 Moments 三个明确入口，并 SHALL 对当前所在的个人内容页面显示一致的选中状态；打开或关闭 Site 菜单 MUST NOT 重置当前页面、播放器或其他环境状态。

#### Scenario: User opens the Site menu
- **WHEN** 用户激活 Site 入口
- **THEN** 系统展示 About、Albums 与 Moments 三个可访问目标
- **AND** 当前目标在菜单中被明确标识

#### Scenario: Recent personal content is available
- **WHEN** Site 菜单打开且存在访客可见的最近相册或动态
- **THEN** 菜单可以展示小型最近内容预览并链接到对应内容
- **AND** 预览遵守与完整页面相同的可见性和媒体授权

#### Scenario: No recent personal content is available
- **WHEN** Site 菜单打开且不存在访客可见的相册或动态
- **THEN** 菜单仍提供 About、Albums 与 Moments 三个目标
- **AND** 系统不使用头像、壁纸或测试夹具伪造最近内容预览

#### Scenario: User selects a personal content destination
- **WHEN** 用户从 Site 菜单选择 About、Albums 或 Moments
- **THEN** 系统打开对应的独立页面
- **AND** Site 入口在目标页面保持个人内容区域的激活状态

### Requirement: Mobile navigation provides a compact personal-content entry
在移动端单栏布局中，系统 SHALL 提供不遮挡主要内容的顶部玻璃导航入口，并 SHALL 通过一个明确的生活入口打开包含 About、Albums 与 Moments 的辅助抽屉。

#### Scenario: User opens navigation on a mobile viewport
- **WHEN** 用户在小于移动端断点的视口打开任一公共内容页面
- **THEN** 系统显示适合触控的紧凑顶部导航
- **AND** 生活入口可以打开包含 About、Albums 与 Moments 的辅助抽屉

#### Scenario: User dismisses the mobile personal-content drawer
- **WHEN** 用户激活关闭操作、按下 Escape 或将焦点移回主要内容
- **THEN** 辅助抽屉关闭
- **AND** 当前路由、主页面滚动位置与背景环境保持不变

### Requirement: Navigation respects the active theme and motion presentation
导航材质 SHALL 保持当前昼夜主题、壁纸取色与可读性；沉浸模式 SHALL 呈现可见的液态折射反馈，舒缓模式 SHALL 保留主题一致的基础半透明玻璃和清晰交互反馈。

#### Scenario: User changes the day or night theme
- **WHEN** 用户在导航中切换昼夜主题
- **THEN** 完整导航、紧凑导航与 Site 菜单同步采用新主题
- **AND** 文本、图标、焦点状态和选中状态保持可辨识

#### Scenario: Effective motion mode is soothing
- **WHEN** 全站有效动效模式为舒缓
- **THEN** 导航仍保持半透明玻璃、选中与按压反馈
- **AND** 导航不呈现明显的折射位移或大幅弹性移动

### Requirement: Focus suppresses normal navigation
当 Focus 激活时，系统 MUST 隐藏完整导航、紧凑导航、Site 菜单和移动生活入口，同时 SHALL 保留既有 Focus 控件、Focus 选择的生产力窗口、悬浮球与当前背景环境。

#### Scenario: Focus starts from Home or a content route
- **WHEN** 用户启动 Focus
- **THEN** 所有普通导航入口被隐藏且不可聚焦
- **AND** 既有 Focus 控件、Focus 选择的窗口、悬浮球与背景环境继续可用

#### Scenario: Focus ends
- **WHEN** 用户结束 Focus
- **THEN** 普通导航根据当前路由与主滚动位置恢复为完整或紧凑状态
- **AND** Focus 前所在页面不被重新加载或替换

### Requirement: Home retains its quiet personal-room action
Home SHALL 保留进入现有站点介绍的低强调个人空间操作，且该操作 MUST 保持在三枚上下文岛之外，不得新增大型导航卡片或复制全局主导航。

#### Scenario: User activates the quiet introduction action
- **WHEN** 用户在非 Focus 的 Home 激活站点介绍操作
- **THEN** 系统打开 About 对应的既有作者入口
- **AND** 播放、壁纸及其他无关环境状态不发生变化

#### Scenario: Focus becomes active on Home
- **WHEN** 用户从 Home 启动 Focus
- **THEN** 低强调个人空间操作与普通 Home chrome 一起被隐藏
- **AND** Home 的时间视觉中心不会被新的个人内容导航替代

### Requirement: Navigation is operable without pointer input
完整导航、紧凑导航、Site 菜单及移动辅助抽屉 MUST 支持键盘顺序访问、明确焦点状态、Enter 或 Space 激活以及 Escape 关闭临时界面。

#### Scenario: Keyboard user opens and closes the Site menu
- **WHEN** 用户通过键盘聚焦并激活 Site 入口
- **THEN** 焦点进入 Site 菜单中的可用目标
- **AND** 用户按下 Escape 后菜单关闭且焦点返回 Site 入口
