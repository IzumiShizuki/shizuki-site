## Purpose

定义全站唯一的沉浸与舒缓动效偏好、旧值迁移和系统减少动态下的有效表现，使所有页面共享一致且可预测的交互反馈，同时避免基于性能环境擅自改变用户选择。

## ADDED Requirements

### Requirement: The site exposes exactly two motion choices
全站动效设置 SHALL 仅向用户提供“沉浸”和“舒缓”两个选择，默认选择 MUST 为“沉浸”，且任何普通页面 MUST NOT 再展示“关闭”或第三档动效选项。

#### Scenario: First visit has no saved motion preference
- **WHEN** 用户首次访问且没有可迁移的旧动效值
- **THEN** 系统将“沉浸”设为已选择和有效的动效模式
- **AND** 设置界面仅显示“沉浸”和“舒缓”两个选项

#### Scenario: User opens motion settings on any route
- **WHEN** 用户从任一普通路由打开动效设置
- **THEN** 系统显示同一份全站“沉浸”和“舒缓”选择
- **AND** 当前选择与其他路由一致

### Requirement: Manual motion choice persists globally
用户手动选择的动效模式 SHALL 被持久保存，并 SHALL 在后续路由切换和新的访问会话中继续生效，直到用户再次手动修改或系统减少动态临时改变有效表现。

#### Scenario: User selects soothing
- **WHEN** 用户将动效模式从沉浸改为舒缓
- **THEN** 当前页面立即采用舒缓表现
- **AND** 用户访问 About、Blog、Albums、Moments 或 Home 时仍保持舒缓选择

#### Scenario: User returns in a later session
- **WHEN** 用户曾保存有效的沉浸或舒缓选择并在之后再次访问网站
- **THEN** 系统恢复该选择
- **AND** 不以默认值覆盖用户的有效手动选择

### Requirement: Legacy motion values migrate deterministically
系统 MUST 将旧动效值 `vivid` 迁移为“沉浸”，将 `calm` 与 `off` 迁移为“舒缓”；缺失、损坏或未知的旧值 MUST 迁移为默认“沉浸”，迁移后 MUST 只保存新的两档值。

#### Scenario: Legacy vivid value is found
- **WHEN** 系统读取到旧值 `vivid`
- **THEN** 用户的动效选择迁移为“沉浸”
- **AND** 后续持久化结果不再包含旧值

#### Scenario: Legacy calm or off value is found
- **WHEN** 系统读取到旧值 `calm` 或 `off`
- **THEN** 用户的动效选择迁移为“舒缓”
- **AND** 原有用户不会因迁移突然获得更强的空间运动

#### Scenario: Legacy value is invalid
- **WHEN** 系统读取到缺失、无法解析或不受支持的旧动效值
- **THEN** 用户的动效选择迁移为默认“沉浸”
- **AND** 设置界面仍只显示两种有效选择

### Requirement: Reduced-motion preference changes only the effective presentation
当操作系统请求减少动态时，系统 SHALL 强制采用舒缓的有效表现，但 MUST 保留用户已保存的沉浸或舒缓选择；当系统请求取消时，系统 SHALL 恢复已保存选择对应的有效表现。

#### Scenario: Operating system requests reduced motion while immersive is saved
- **WHEN** 用户保存的是沉浸且操作系统启用减少动态
- **THEN** 页面立即采用舒缓的有效表现
- **AND** 设置中保存的用户选择仍为沉浸

#### Scenario: Operating system stops requesting reduced motion
- **WHEN** 操作系统取消减少动态且用户保存的是沉浸
- **THEN** 页面恢复沉浸的有效表现
- **AND** 用户无需重新选择模式

### Requirement: Performance environment does not override motion choice
系统 MUST NOT 根据设备类型、处理能力、实时帧率、电池状态、网络状态、页面内容量或主观性能评估自动更改用户选择或有效动效模式；除操作系统减少动态外，模式变化 MUST 来自用户明确操作。

#### Scenario: Site runs on a low-power or mobile device
- **WHEN** 用户在低功耗设备、移动设备或内容较多的页面访问网站且系统未请求减少动态
- **THEN** 系统继续使用用户保存的有效模式
- **AND** 不显示或记录一次自动降档

#### Scenario: A visual capability is unavailable
- **WHEN** 当前浏览器无法呈现沉浸模式中的某一种视觉原语
- **THEN** 系统使用最接近且可读的静态或基础材质呈现该元素
- **AND** 用户保存与界面显示的动效模式不被重新归类或改写

### Requirement: Immersive mode provides spatial material feedback
沉浸模式 SHALL 在适用的导航、相册卡片、动态卡片和页面切换中提供液态折射、层叠、指针响应、弹性倾斜或连续空间过渡，并 MUST 保持文字阅读、键盘焦点和主要操作稳定可用。

#### Scenario: User interacts with a gallery card in immersive mode
- **WHEN** 有效模式为沉浸且用户悬停、聚焦或打开一张相册卡片
- **THEN** 卡片呈现明确的层叠或空间响应并连续过渡到浏览体验
- **AND** 卡片标题与激活操作始终可读和可访问

#### Scenario: User navigates with keyboard in immersive mode
- **WHEN** 有效模式为沉浸且用户仅使用键盘浏览交互元素
- **THEN** 系统提供与指针交互同等明确的焦点和激活反馈
- **AND** 不要求指针移动才能完成任何操作

### Requirement: Soothing mode limits spatial displacement
舒缓模式 SHALL 保留淡入、轻微位移、基础玻璃、按压和焦点反馈，同时 MUST 停用明显折射位移、持续视差、三维倾斜、弹性摆动和大范围共享空间移动。

#### Scenario: User opens personal content in soothing mode
- **WHEN** 有效模式为舒缓且用户打开菜单、相册、动态或文章
- **THEN** 内容以淡入或轻微位移呈现
- **AND** 页面不出现明显折射、持续视差或大范围空间移动

#### Scenario: User presses an interactive card in soothing mode
- **WHEN** 有效模式为舒缓且用户按下或键盘激活一张卡片
- **THEN** 系统仍提供清晰的按压、选中或焦点反馈
- **AND** 反馈不依赖弹性摆动或三维倾斜

### Requirement: Motion mode applies consistently across the site
同一有效动效模式 SHALL 同时约束导航、Home、About、Blog、Albums、Moments、灯箱与辅助抽屉，页面 MUST NOT 各自保留互相冲突的独立动效档位。

#### Scenario: User moves between content routes
- **WHEN** 用户在 About、Blog、Albums 与 Moments 之间导航
- **THEN** 所有目标页面采用同一有效动效模式
- **AND** 页面内不会出现第三种独立动效选择
