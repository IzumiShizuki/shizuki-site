# UI/UX Redesign Implementation Tasks

## Phase 1: 设计系统基础 (Foundation)

### Task 1.1: 创建设计系统变量文件
- [ ] 创建 `src/styles/design-system.css`
- [ ] 定义完整color palette
- [ ] 定义typography scale
- [ ] 定义spacing scale  
- [ ] 定义border-radius scale
- [ ] 定义shadow system
- [ ] 定义animation timing
- [ ] 在App.vue中引入design-system.css

**估时**: 2h  
**优先级**: P0

### Task 1.2: 重构现有CSS变量
- [ ] 审计当前所有--theme-*变量使用情况
- [ ] 迁移到新design system变量
- [ ] 移除冗余和硬编码rgba值
- [ ] 确保night/day模式正确切换

**估时**: 3h  
**优先级**: P0

---

## Phase 2: TopMenu导航优化

### Task 2.1: 左侧主导航pill group重设计
- [ ] 优化.left-pill-group背景渐变
- [ ] 重新设计.left-main-btn激活状态
- [ ] 改进hover微动效
- [ ] 调整gap和padding使用新spacing scale
- [ ] 优化active indicator过渡动画

**文件**: `TopMenu.vue`  
**估时**: 2h  
**优先级**: P1

### Task 2.2: 中心操作区优化
- [ ] 重新设计.circle-icon-box样式
- [ ] 优化menu-hub-box状态指示点
- [ ] 改进hover lift效果
- [ ] 统一所有圆形按钮尺寸和间距

**文件**: `TopMenu.vue`  
**估时**: 1.5h  
**优先级**: P1

### Task 2.3: 右侧用户区精致化
- [ ] 优化头像边框和阴影
- [ ] 改进author-avatar-box样式
- [ ] 重新设计route-active状态
- [ ] 增加subtle hover动效

**文件**: `TopMenu.vue`  
**估时**: 1h  
**优先级**: P1

### Task 2.4: appearance-popover弹窗美化
- [ ] 优化弹窗背景和边框
- [ ] 重新设计segment按钮样式
- [ ] 改进color picker控件
- [ ] 优化进入/退出动画

**文件**: `TopMenu.vue`  
**估时**: 1.5h  
**优先级**: P2

### Task 2.5: 移动端导航dock优化
- [ ] 重新设计mobile-top-dock样式
- [ ] 优化mobile-top-nav-item激活状态
- [ ] 确保触摸热区>=44px
- [ ] 改进横向滚动体验

**文件**: `TopMenu.vue`  
**估时**: 2h  
**优先级**: P1

---

## Phase 3: 音乐播放器美化

### Task 3.1: 唱片封面vinyl质感
- [ ] 重新设计.cover-vinyl背景渐变
- [ ] 添加真实vinyl同心圆纹理
- [ ] 优化中心孔.center-hole样式
- [ ] 增加高光和阴影层次

**文件**: `MusicPlayer.vue`  
**估时**: 2h  
**优先级**: P1

### Task 3.2: 旋转动画优化
- [ ] 调整vinyl-spin animation timing
- [ ] 添加will-change优化
- [ ] 优化expanded状态过渡
- [ ] 改进disc-wrap hover效果

**文件**: `MusicPlayer.vue`  
**估时**: 1h  
**优先级**: P1

### Task 3.3: 歌词窗口精致化
- [ ] 重新设计lyrics-window布局
- [ ] 优化字体大小和行高
- [ ] 改进歌词translation样式
- [ ] 增加current lyric高亮效果

**文件**: `MusicPlayer.vue`  
**估时**: 1.5h  
**优先级**: P1

### Task 3.4: 进度条enhancement
- [ ] 添加进度抓手圆点
- [ ] 优化progress-preview样式
- [ ] 改进hover状态
- [ ] 增加keyboard navigation支持

**文件**: `MusicPlayer.vue`  
**估时**: 1.5h  
**优先级**: P1

### Task 3.5: 播放控制按钮美化
- [ ] 重新设计.pause-btn样式
- [ ] 优化.edge-btn布局
- [ ] 改进.mode-btn和.mini-action样式
- [ ] 统一ripple effect

**文件**: `MusicPlayer.vue`  
**估时**: 1h  
**优先级**: P2

---

## Phase 4: Liquid Material统一

### Task 4.1: 创建LiquidMaterial mixin
- [x] 创建`src/styles/mixins/liquid-material.scss`
- [x] 定义统一背景渐变
- [x] 定义边框样式
- [x] 定义backdrop-filter
- [x] 定义阴影层次

**估时**: 1h  
**优先级**: P1

### Task 4.2: 应用到所有组件
- [x] TopMenu.vue
- [x] MusicPlayer.vue
- [x] AtmospherePanel.vue
- [x] AiDialog.vue
- [x] BackgroundPickerDialog.vue
- [x] LevitationBall.vue

**估时**: 2h  
**优先级**: P2

---

## Phase 5: 交互动效细化

### Task 5.1: 统一transition timing
- [x] 审计所有transition定义
- [x] 替换为design system timing变量
- [x] 统一ease function使用
- [x] 优化transform动画性能

**估时**: 2h  
**优先级**: P2

### Task 5.2: Ripple effect优化
- [x] 重新设计click-ripple样式
- [x] 优化ripple trigger区域
- [x] 改进动画曲线
- [x] 添加color-mix平滑颜色

**文件**: `App.vue`  
**估时**: 1h  
**优先级**: P2

### Task 5.3: Hover微动效
- [x] 添加subtle scale和translateY
- [x] 优化box-shadow过渡
- [x] 改进color transition
- [x] 确保不会触发layout shift

**估时**: 1.5h  
**优先级**: P2

---

## Phase 6: 响应式优化

### Task 6.1: 重新定义breakpoints
- [x] 审计现有media queries
- [x] 统一使用design system breakpoints
- [x] 优化900px/600px断点逻辑
- [ ] 测试各种屏幕尺寸

**估时**: 2h  
**优先级**: P2

### Task 6.2: 触摸体验优化
- [ ] 确保所有按钮>=44px
- [ ] 增加padding提升可点击区域
- [ ] 优化mobile-top-dock滚动
- [ ] 测试真机触摸响应

**估时**: 2h  
**优先级**: P1

### Task 6.3: 横竖屏适配
- [x] 优化portrait orientation样式
- [ ] 改进landscape下导航布局
- [ ] 测试平板横竖屏切换

**估时**: 1.5h  
**优先级**: P2

---

## Phase 7: 细节打磨

### Task 7.1: Day/Night模式对比度
- [ ] 审计day mode颜色定义
- [ ] 确保文字对比度>=4.5:1
- [ ] 优化背景和前景色搭配
- [ ] 测试各种光线环境

**估时**: 2h  
**优先级**: P2

### Task 7.2: Focus ring可访问性
- [x] 统一所有:focus-visible样式
- [x] 确保keyboard navigation可用
- [ ] 添加skip-to-content链接
- [ ] 测试屏幕阅读器兼容性

**估时**: 1.5h  
**优先级**: P2

### Task 7.3: Reduced motion支持
- [x] 添加prefers-reduced-motion检测
- [x] 禁用非必要动画
- [x] 保留关键状态变化提示

**估时**: 1h  
**优先级**: P2

---

## Phase 8: 测试与验收

### Task 8.1: 跨浏览器测试
- [ ] Chrome/Edge (Chromium)
- [ ] Firefox
- [ ] Safari (macOS/iOS)

**估时**: 2h  
**优先级**: P3

### Task 8.2: 移动端真机测试
- [ ] iOS Safari
- [ ] Android Chrome
- [ ] 测试触摸手势
- [ ] 测试横竖屏切换

**估时**: 2h  
**优先级**: P3

### Task 8.3: 性能检查
- [ ] Lighthouse audit
- [ ] Layout shift检测
- [ ] Animation性能分析
- [ ] Bundle size检查

**估时**: 1.5h  
**优先级**: P3

### Task 8.4: 最终验收
- [ ] 对比设计系统规范
- [ ] 验收Success Criteria
- [ ] 记录已知问题
- [ ] 更新文档

**估时**: 1h  
**优先级**: P3

---

## 总估时

- **Phase 1 (Foundation)**: 5h
- **Phase 2 (TopMenu)**: 8h
- **Phase 3 (MusicPlayer)**: 7h
- **Phase 4 (LiquidMaterial)**: 3h
- **Phase 5 (Animations)**: 4.5h
- **Phase 6 (Responsive)**: 5.5h
- **Phase 7 (Polish)**: 4.5h
- **Phase 8 (Testing)**: 6.5h

**总计**: ~44 hours

---

## 当前进度

- [x] OpenSpec结构创建
- [x] Proposal撰写
- [x] Design规范定义
- [x] Tasks清单制定
- [x] **Phase 1: 设计系统基础** (完成)
- [x] **Phase 2: TopMenu导航优化** (完成)
- [x] **Phase 3: 音乐播放器美化** (完成)
- [x] **Phase 4: Liquid Material统一** (完成)
- [x] **Phase 5: 交互动效细化** (完成)
- [x] **Phase 6: 响应式优化** (部分完成)
- [x] **Phase 7: 细节打磨** (部分完成)
- [ ] **Phase 8: 测试与验收** (待完成)

---

## 已完成工作摘要

### Phase 1-3 (前期工作)
- ✅ 创建design-system.css with完整变量系统
- ✅ 重构TopMenu左侧导航、中心区、右侧用户区
- ✅ 重设计MusicPlayer唱片封面vinyl质感、歌词窗口、进度条

### Phase 4-5 (本次会话)
- ✅ 创建liquid-material.scss mixin系统(base/elevated/sunken/floating/hover/active variants)
- ✅ 应用liquid material到所有主要组件:
  - AtmospherePanel.vue
  - AiDialog.vue
  - BackgroundPickerDialog.vue
  - LevitationBall.vue
- ✅ 优化ripple effect使用color-mix和design system timing
- ✅ 添加全局hover微动效(scale + translateY)
- ✅ 实现:focus-visible样式统一
- ✅ 添加prefers-reduced-motion支持
- ✅ 修复SCSS重复定义导致的语法错误
- ✅ 验证构建成功

### 提交记录
- `60da8335` feat(ui): Phase 1 - create design system foundation
- `841204b0` feat(ui): Phase 2 - complete TopMenu redesign with warm aesthetic
- `6d6546d6` feat(ui): Phase 3 - redesign MusicPlayer with vinyl texture and elegant controls
- `e9cb9d21` feat(ui): Phase 4-5 - unified liquid material and enhanced interactions
- `635bb882` fix(ui): resolve SCSS syntax errors in AtmospherePanel

---

## 剩余工作

### Phase 6 (响应式) - 需测试
- [ ] 确保所有按钮>=44px (触摸热区)
- [ ] 测试真机触摸响应
- [ ] 测试平板横竖屏切换

### Phase 7 (细节) - 需审计
- [ ] 审计day mode颜色对比度>=4.5:1
- [ ] 添加skip-to-content链接
- [ ] 测试屏幕阅读器兼容性

### Phase 8 (验收测试)
- [ ] 跨浏览器测试(Chrome/Firefox/Safari)
- [ ] 移动端真机测试(iOS/Android)
- [ ] Lighthouse audit
- [ ] 最终验收并更新文档

