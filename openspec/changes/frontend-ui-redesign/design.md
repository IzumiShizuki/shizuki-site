# UI/UX Redesign Design Specification

## 设计哲学 (Design Philosophy)

**核心理念**: "精致、柔和、呼吸感"

- **精致**: 每个细节都经过推敲,圆角、间距、阴影都有规律
- **柔和**: 避免生硬的颜色跳跃,所有过渡都要丝滑
- **呼吸感**: 给界面留白,让元素有空间"呼吸"

---

## 1. 设计系统基础 (Design Foundation)

### 1.1 Color System

#### 主色调 (Primary Palette)
```css
--accent-base: #F2B39D;  /* 保留原主色基础 */
--accent-soft: #F5C9B8;
--accent-strong: #E89E7E;
--accent-vivid: #FF9A6C;
```

#### 中性色 (Neutral Palette)
```css
/* Night Mode */
--neutral-900: #0A0E16;
--neutral-800: #141821;
--neutral-700: #1C212D;
--neutral-600: #2A3041;
--neutral-500: #3D4455;
--neutral-400: #5C6375;
--neutral-300: #8893A8;
--neutral-200: #B4BCCF;
--neutral-100: #D9DFE8;
--neutral-50: #F2F4F7;

/* Day Mode */
--neutral-day-50: #FAFBFC;
--neutral-day-100: #F3F5F7;
--neutral-day-200: #E8ECF0;
--neutral-day-300: #D4DBE3;
--neutral-day-400: #9DA8B8;
--neutral-day-500: #6B7688;
--neutral-day-600: #4A5568;
--neutral-day-700: #2D3748;
--neutral-day-800: #1A202C;
--neutral-day-900: #0F1419;
```

#### 状态色 (Status Colors)
```css
--success: #4ECDC4;
--warning: #F7B731;
--error: #EE5A6F;
--info: #6C9DE8;
```

### 1.2 Typography Scale

```css
--text-xs: 0.625rem;   /* 10px */
--text-sm: 0.75rem;    /* 12px */
--text-base: 0.875rem; /* 14px */
--text-md: 1rem;       /* 16px */
--text-lg: 1.125rem;   /* 18px */
--text-xl: 1.25rem;    /* 20px */
--text-2xl: 1.5rem;    /* 24px */
--text-3xl: 1.875rem;  /* 30px */
--text-4xl: 2.25rem;   /* 36px */

--font-weight-normal: 400;
--font-weight-medium: 500;
--font-weight-semibold: 600;
--font-weight-bold: 700;

--line-height-tight: 1.25;
--line-height-normal: 1.5;
--line-height-relaxed: 1.75;
```

### 1.3 Spacing Scale (4px基准)

```css
--space-1: 0.25rem;  /* 4px */
--space-2: 0.5rem;   /* 8px */
--space-3: 0.75rem;  /* 12px */
--space-4: 1rem;     /* 16px */
--space-5: 1.25rem;  /* 20px */
--space-6: 1.5rem;   /* 24px */
--space-8: 2rem;     /* 32px */
--space-10: 2.5rem;  /* 40px */
--space-12: 3rem;    /* 48px */
--space-16: 4rem;    /* 64px */
--space-20: 5rem;    /* 80px */
```

### 1.4 Border Radius Scale

```css
--radius-xs: 0.25rem;  /* 4px */
--radius-sm: 0.5rem;   /* 8px */
--radius-md: 0.75rem;  /* 12px */
--radius-lg: 1rem;     /* 16px */
--radius-xl: 1.25rem;  /* 20px */
--radius-2xl: 1.5rem;  /* 24px */
--radius-3xl: 2rem;    /* 32px */
--radius-full: 9999px;
```

### 1.5 Shadow System

```css
/* Elevation Levels */
--shadow-xs: 0 1px 2px 0 rgba(0, 0, 0, 0.05);
--shadow-sm: 0 2px 4px 0 rgba(0, 0, 0, 0.08),
             0 1px 2px 0 rgba(0, 0, 0, 0.04);
--shadow-md: 0 4px 8px 0 rgba(0, 0, 0, 0.12),
             0 2px 4px 0 rgba(0, 0, 0, 0.06);
--shadow-lg: 0 8px 16px 0 rgba(0, 0, 0, 0.16),
             0 4px 8px 0 rgba(0, 0, 0, 0.08);
--shadow-xl: 0 12px 24px 0 rgba(0, 0, 0, 0.20),
             0 6px 12px 0 rgba(0, 0, 0, 0.10);
--shadow-2xl: 0 16px 32px 0 rgba(0, 0, 0, 0.24),
              0 8px 16px 0 rgba(0, 0, 0, 0.12);

/* Inner Shadows */
--shadow-inner: inset 0 2px 4px 0 rgba(0, 0, 0, 0.06);
--shadow-inner-lg: inset 0 4px 8px 0 rgba(0, 0, 0, 0.10);

/* Glow Effects */
--glow-sm: 0 0 8px rgba(var(--accent-rgb), 0.3);
--glow-md: 0 0 16px rgba(var(--accent-rgb), 0.4);
--glow-lg: 0 0 24px rgba(var(--accent-rgb), 0.5);
```

### 1.6 Animation Timing

```css
--duration-instant: 100ms;
--duration-fast: 200ms;
--duration-base: 300ms;
--duration-slow: 400ms;
--duration-slower: 500ms;

--ease-in: cubic-bezier(0.4, 0, 1, 1);
--ease-out: cubic-bezier(0, 0, 0.2, 1);
--ease-in-out: cubic-bezier(0.4, 0, 0.2, 1);
--ease-bounce: cubic-bezier(0.68, -0.55, 0.265, 1.55);
--ease-smooth: cubic-bezier(0.22, 1, 0.36, 1);
```

---

## 2. 组件细化设计

### 2.1 TopMenu Navigation

#### 视觉层次
- **主导航按钮**: 使用柔和的圆角pill,激活时微微放大
- **中心操作区**: 保持圆形按钮,增加间距呼吸感
- **右侧用户区**: 头像增加精致边框和subtle hover效果

#### 激活状态
```css
.left-main-btn.active {
  background: linear-gradient(135deg, 
    rgba(var(--accent-rgb), 0.20), 
    rgba(var(--accent-rgb), 0.12));
  box-shadow: 
    0 0 0 1px rgba(var(--accent-rgb), 0.24),
    0 2px 8px rgba(var(--accent-rgb), 0.16),
    inset 0 1px 0 rgba(255, 255, 255, 0.1);
  transform: scale(1.02);
}
```

#### Hover微动效
```css
.icon-minimal:hover {
  transform: scale(1.08) translateY(-1px);
  color: var(--accent-strong);
}
```

### 2.2 Music Player Vinyl Disc

#### 唱片质感
```css
.cover-vinyl {
  background: 
    radial-gradient(circle at 30% 30%, 
      rgba(255, 255, 255, 0.08), 
      transparent 50%),
    radial-gradient(circle at 50% 50%, 
      rgba(0, 0, 0, 0.3) 35%, 
      transparent 40%),
    conic-gradient(
      from 0deg,
      rgba(0, 0, 0, 0.05) 0deg,
      rgba(255, 255, 255, 0.03) 90deg,
      rgba(0, 0, 0, 0.05) 180deg,
      rgba(255, 255, 255, 0.03) 270deg,
      rgba(0, 0, 0, 0.05) 360deg
    );
  box-shadow:
    0 0 0 2px rgba(255, 255, 255, 0.1),
    0 8px 24px rgba(0, 0, 0, 0.3),
    inset 0 2px 4px rgba(255, 255, 255, 0.1),
    inset 0 -2px 4px rgba(0, 0, 0, 0.2);
}
```

#### 旋转动画
```css
@keyframes vinyl-spin {
  from { transform: rotate(0deg); }
  to { transform: rotate(360deg); }
}

.cover-vinyl.spinning {
  animation: vinyl-spin 3s linear infinite;
  /* 更smooth的旋转 */
  will-change: transform;
}
```

### 2.3 Progress Bar Enhancement

#### 进度条抓手
```css
.progress-fill::after {
  content: '';
  position: absolute;
  right: -6px;
  top: 50%;
  transform: translateY(-50%);
  width: 14px;
  height: 14px;
  background: white;
  border-radius: 50%;
  box-shadow: 
    0 0 0 2px var(--accent-strong),
    0 2px 6px rgba(0, 0, 0, 0.3);
  opacity: 0;
  transition: opacity 0.2s ease;
}

.progress-wrap:hover .progress-fill::after {
  opacity: 1;
}
```

### 2.4 Liquid Glass Material

#### 统一玻璃态质感
```css
.liquid-material {
  background: 
    linear-gradient(135deg,
      rgba(255, 255, 255, 0.08),
      rgba(255, 255, 255, 0.02)),
    var(--surface-base);
  border: 1px solid rgba(255, 255, 255, 0.12);
  backdrop-filter: blur(20px) saturate(180%);
  box-shadow: 
    0 8px 32px rgba(0, 0, 0, 0.12),
    inset 0 1px 0 rgba(255, 255, 255, 0.08);
}
```

---

## 3. 响应式断点

### 断点定义
```css
/* Desktop First Approach */
--breakpoint-2xl: 1536px;
--breakpoint-xl: 1280px;
--breakpoint-lg: 1024px;
--breakpoint-md: 768px;
--breakpoint-sm: 640px;
--breakpoint-xs: 480px;
```

### 触摸热区最小尺寸
```css
/* 移动端按钮最小尺寸 */
--touch-target-min: 44px; /* iOS规范 */
--touch-target-comfortable: 48px; /* Material Design */
```

---

## 4. 可访问性 (Accessibility)

### Focus Ring
```css
:focus-visible {
  outline: 2px solid rgba(var(--accent-rgb), 0.8);
  outline-offset: 2px;
  box-shadow: 0 0 0 4px rgba(var(--accent-rgb), 0.2);
}
```

### Reduced Motion
```css
@media (prefers-reduced-motion: reduce) {
  * {
    animation-duration: 0.01ms !important;
    transition-duration: 0.01ms !important;
  }
}
```

---

## 5. 实施优先级

### Phase 1: 设计系统基础 (P0)
- [ ] 创建CSS变量文件 `design-system.css`
- [ ] 定义color palette
- [ ] 定义spacing/typography/radius scale
- [ ] 设置shadow system

### Phase 2: 核心组件 (P1)
- [ ] 优化TopMenu导航
- [ ] 重新设计音乐播放器
- [ ] 统一liquid-material样式

### Phase 3: 细节打磨 (P2)
- [ ] 微动效和transition优化
- [ ] 响应式断点调整
- [ ] 可访问性增强

### Phase 4: 验收测试 (P3)
- [ ] 跨浏览器测试
- [ ] 移动端真机测试
- [ ] 性能优化检查
