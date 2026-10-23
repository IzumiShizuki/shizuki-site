# 菜单配色调研与缺陷定位

调查日期：2026-10-23（Asia/Shanghai）。范围是当前仓库的导航、MENU 氛围面板、主页外观弹层和色彩设置；DJ 的网络检查另见 verification-report.md。

## 验收依据

1. 普通文字（包括说明、占位文字）按 4.5:1 验证，大文字按 3:1；不能把 4.49 四舍五入为通过。标准针对前景和实际背景，不是仅比较主题种子色。[W3C：Contrast Minimum](https://www.w3.org/WAI/WCAG22/Understanding/contrast-minimum.html)
2. 识别控件所需图标、状态与焦点提示按 3:1 验证；装饰性边框和禁用内容不等同于必需识别信息。[W3C：Non-text Contrast](https://www.w3.org/WAI/WCAG22/Understanding/non-text-contrast.html)
3. 键盘操作时必须能看见焦点，不能只保留代码中的 focus 选择器而被全局覆盖。[W3C：Focus Visible](https://www.w3.org/WAI/WCAG22/Understanding/focus-visible.html)
4. Material 的背景和前景按角色配对，例如 primary/onPrimary、primaryContainer/onPrimaryContainer。项目已经安装动态调色库，可以复用现有角色，避免继续维护相互独立的白字规则。[Android Developers：Material 3 color roles](https://developer.android.com/develop/ui/compose/designsystems/material3)
5. color-mix 接受颜色值；linear-gradient 是图像，不能当颜色参数使用。[MDN：color-mix](https://developer.mozilla.org/en-US/docs/Web/CSS/Reference/Values/color_value/color-mix)

## 经过复现的缺陷

| 等级 | 问题 | 影响与处理 |
| --- | --- | --- |
| P1 | 氛围标签与标题图标使用固定白字，底色是浅桃色渐变 | 默认夜间主题已经能复现；改为 primaryContainer/onPrimaryContainer 或 primary/onPrimary 配对。 |
| P1 | 夜间导航仍继承旧 surface-soft 的浅色半透明值 | 文字切换为浅色，但控件底色没有一起切换；导航旧样式映射到同一套稳定表面。 |
| P1 | 全局 primary 按钮的 important 覆盖局部组件配色 | 同一面板里的按钮实际使用不同背景/墨色来源；局部同步提供全局规则消费的背景及前景变量。 |
| P1 | 特效标签和封面占位符依赖半透明、固定浅色 | 中间验证时浅色特效标签仅 2.394:1；改为不透明表面及匹配文字。 |
| P1 | 原始主色染色的已选歌单背景削弱说明文字 | 黑色种子日间可复现 4.168:1，蓝色 4.270:1，红色 4.494:1；已选卡片使用稳定的 raised surface。 |
| P1 | 全局 outline:none important 抹掉组件焦点线 | Tab 实测 outline 为 none，只剩半透明桃色阴影；将菜单从该重置中排除，复测有可见不透明焦点线。 |
| P2 | 移动 dock 把渐变传入 color-mix | 声明无效后依赖其它背景兜底；改为实际的语义表面颜色。 |
| P2 | 移动 More 初次点击与实际抽屉状态不一致 | App 使用桌面页首自动展开结果，移动 CSS 却隐藏抽屉；共享状态函数增加 mobile 条件，首点打开、再点关闭。 |
| P2 | 主导航及部分图标入口缺少键盘或名称语义 | 为入口提供角色、Tab 顺序、Enter/Space 操作和图标模式下仍存在的名称。 |
| P2 | 色板卡片次要说明降低透明度，hover 再叠色 | 在最低对比配色下消耗文字余量；说明保持完整墨色，hover 改为描边，按压保留位移而不再次滤色。 |

## 采用的颜色策略

情绪维持原站的暖杏、桃色和暖炭色；主色仍由访客选择。菜单内部采用不透明的低饱和表面，保留周围壁纸与原有圆角/布局。正文与说明使用相应的 onSurface/onSurfaceVariant，主按钮与选中项各自使用完整的角色对。

默认暖色下实际生成的角色如下（不是给所有自定义主题写死这些值）：

| 用途 | 日间 | 夜间 |
| --- | --- | --- |
| 菜单表面 | #FEEAE3 | #221714 |
| 提升表面 | #FAE4DD | #291D19 |
| 正文 | #3E2F2A | #F9E0D9 |
| 次要文字 | #6D5B55 | #BCA69F |
| 选中背景 / 文字 | #F3A68B / #5A2815 | #764635 / #FFDCD0 |
| 主按钮背景 / 文字 | #8B4F39 / #FFF7F5 | #F9B7A1 / #603524 |

黑到白的连续渐变会经过任意中间亮度，用同一文字色无法在整段上保证对比度。菜单动作不再直接使用未经校正的原始渐变；自定义渐变仍作为调色输入及预览保留。描边、阴影和模糊不作为文字对比度保障。

## 保障方式与范围

- 单元测试读取真实 CSS token 映射，计算生成色的相对亮度；覆盖四种色板、日夜主题、13 个纯色与 6 组代表性渐变，共 152 组配置及静态兜底配色。
- 浏览器读取真实 computed style，检查渐变色/透明度合成、实际启用文字和图标；覆盖菜单和六个页签，同时单独检查主页外观、移动与平板视口。
- 黑白背景测试确认导航和弹层的表面值完全不随壁纸改变；焦点通过真实 Tab 按键复测。
- 数值检查不等于整个站点的 WCAG 认证：未宣称覆盖所有页面、登录后数据、所有操作系统或所有辅助技术。

设计检测另发现 5 个既有样式提醒（3 处弹性 easing、1 处 padding 动画、1 处渐变标题），均在本次未改动的代码行。它们作为后续视觉/性能整理事项记录，不扩大此次菜单配色修改范围。
