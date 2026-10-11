<template>
  <section class="about-overview-redesign" aria-labelledby="about-overview-title">
    <!-- Hero区域 - 全新设计 -->
    <div class="hero-section">
      <!-- 背景装饰 -->
      <div class="hero-bg-decorations" aria-hidden="true">
        <div class="decoration-blob decoration-blob-1"></div>
        <div class="decoration-blob decoration-blob-2"></div>
        <div class="decoration-blob decoration-blob-3"></div>
      </div>

      <!-- Hero内容 -->
      <div class="hero-content">
        <!-- 左侧：头像 + 状态 -->
        <div class="hero-avatar-section">
          <div class="avatar-wrapper">
            <img class="hero-avatar" :src="avatarUrl" :alt="`${displayName} avatar`" />
            <div class="avatar-ring" aria-hidden="true"></div>
          </div>
          <span class="hero-status" :class="{ offline: !enabled }">
            <span class="status-dot" aria-hidden="true"></span>
            {{ enabled ? activityStatus : '暂时离线' }}
          </span>
        </div>

        <!-- 右侧：文字信息 -->
        <div class="hero-text-section">
          <p class="hero-greeting">{{ hero.greeting || '你好，很高兴认识你' }}</p>
          <h1 id="about-overview-title" class="hero-name">{{ displayName }}</h1>
          <blockquote class="hero-quote">{{ hero.quote || '愿你终将与热爱相逢' }}</blockquote>

          <!-- 快速信息标签 -->
          <div class="hero-quick-info">
            <span v-for="fact in compactFacts" :key="fact.label" class="info-tag">
              <i :class="fact.icon" aria-hidden="true"></i>
              {{ fact.value }}
            </span>
          </div>
        </div>
      </div>
    </div>

    <!-- 技能区域 - 卡片式展示 -->
    <div v-if="visibleSkills.length" class="skills-section">
      <h2 class="section-title">
        <i class="fas fa-code" aria-hidden="true"></i>
        技能栈
      </h2>
      <div class="skills-grid">
        <span
          v-for="(skill, index) in visibleSkills"
          :key="skill"
          class="skill-card"
          :style="{ '--skill-delay': `${index * 30}ms` }"
        >
          {{ skill }}
        </span>
      </div>
    </div>

    <!-- 统计数据 - 新增 -->
    <div class="stats-section">
      <div class="stat-card">
        <div class="stat-icon">
          <i class="fas fa-file-lines"></i>
        </div>
        <div class="stat-info">
          <div class="stat-value">{{ stats.posts || 0 }}</div>
          <div class="stat-label">文章</div>
        </div>
      </div>

      <div class="stat-card">
        <div class="stat-icon">
          <i class="fas fa-folder"></i>
        </div>
        <div class="stat-info">
          <div class="stat-value">{{ stats.projects || 0 }}</div>
          <div class="stat-label">项目</div>
        </div>
      </div>

      <div class="stat-card">
        <div class="stat-icon">
          <i class="fas fa-tags"></i>
        </div>
        <div class="stat-info">
          <div class="stat-value">{{ stats.tags || 0 }}</div>
          <div class="stat-label">标签</div>
        </div>
      </div>

      <div class="stat-card">
        <div class="stat-icon">
          <i class="fas fa-eye"></i>
        </div>
        <div class="stat-info">
          <div class="stat-value">{{ formatNumber(stats.views) || 0 }}</div>
          <div class="stat-label">浏览</div>
        </div>
      </div>
    </div>

    <!-- 快捷入口 - 保留但重新设计 -->
    <nav v-if="portals.length" class="portals-section" aria-label="站点主要入口">
      <h2 class="section-title">
        <i class="fas fa-compass" aria-hidden="true"></i>
        探索更多
      </h2>
      <div class="portals-grid">
        <button
          v-for="portal in portals"
          :key="portal.key"
          type="button"
          class="portal-card ripple-trigger"
          @click="$emit('select-portal', portal)"
        >
          <div class="portal-icon">
            <i :class="portal.icon" aria-hidden="true"></i>
          </div>
          <div class="portal-content">
            <strong>{{ portal.title }}</strong>
            <small>{{ portal.description }}</small>
          </div>
          <i class="fas fa-arrow-right portal-arrow" aria-hidden="true"></i>
        </button>
      </div>
    </nav>
  </section>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps({
  hero: {
    type: Object,
    default: () => ({})
  },
  identity: {
    type: Object,
    default: () => ({})
  },
  skills: {
    type: Array,
    default: () => []
  },
  enabled: {
    type: Boolean,
    default: true
  },
  portals: {
    type: Array,
    default: () => []
  },
  stats: {
    type: Object,
    default: () => ({
      posts: 0,
      projects: 0,
      tags: 0,
      views: 0
    })
  }
});

defineEmits(['select-portal']);

const displayName = computed(() => String(props.hero?.name || 'Shizuki').trim());
const avatarUrl = computed(() => String(props.hero?.avatarUrl || '/images/katanegai.jpg').trim());
const activityStatus = computed(() => String(props.identity?.activityStatus || '学习中').trim());

// 紧凑的facts - 只显示最重要的信息
const compactFacts = computed(() => {
  const facts = [];

  if (props.identity?.role) {
    facts.push({
      label: '角色',
      value: props.identity.role,
      icon: 'fas fa-briefcase'
    });
  }

  if (props.identity?.location) {
    facts.push({
      label: '位置',
      value: props.identity.location,
      icon: 'fas fa-location-dot'
    });
  } else if (props.identity?.school) {
    facts.push({
      label: '学校',
      value: props.identity.school,
      icon: 'fas fa-graduation-cap'
    });
  }

  return facts.slice(0, 3);
});

// 扩展技能显示数量到20个
const visibleSkills = computed(() => {
  const seen = new Set();
  return props.skills
    .map((item) => String(item || '').trim())
    .filter((item) => {
      const key = item.toLowerCase();
      if (!item || seen.has(key)) return false;
      seen.add(key);
      return true;
    })
    .slice(0, 20);
});

function formatNumber(num) {
  if (!num) return '0';
  if (num >= 10000) return `${(num / 10000).toFixed(1)}万`;
  if (num >= 1000) return `${(num / 1000).toFixed(1)}k`;
  return num.toString();
}
</script>

<style scoped>
.about-overview-redesign {
  display: flex;
  flex-direction: column;
  gap: var(--space-6);
}

/* ============================================================
   Hero区域 - 现代化设计
   ============================================================ */

.hero-section {
  position: relative;
  padding: var(--space-10) var(--space-6);
  border-radius: var(--radius-2xl);
  overflow: hidden;

  background: rgba(var(--theme-panel-surface-rgb, 20, 20, 30), 0.6);
  backdrop-filter: blur(20px);
  -webkit-backdrop-filter: blur(20px);

  border: 1px solid rgba(255, 255, 255, 0.1);
  box-shadow: 0 20px 60px rgba(0, 0, 0, 0.3);
}

/* 背景装饰 - 流动的blob */
.hero-bg-decorations {
  position: absolute;
  inset: 0;
  overflow: hidden;
  pointer-events: none;
  z-index: 0;
}

.decoration-blob {
  position: absolute;
  border-radius: 50%;
  filter: blur(80px);
  opacity: 0.15;
  animation: blob-float 20s ease-in-out infinite;
}

.decoration-blob-1 {
  width: 300px;
  height: 300px;
  top: -100px;
  left: -100px;
  background: rgba(var(--accent-rgb), 0.6);
  animation-delay: 0s;
}

.decoration-blob-2 {
  width: 250px;
  height: 250px;
  bottom: -80px;
  right: -80px;
  background: rgba(147, 197, 253, 0.6);
  animation-delay: 5s;
}

.decoration-blob-3 {
  width: 200px;
  height: 200px;
  top: 50%;
  right: 20%;
  background: rgba(196, 181, 253, 0.6);
  animation-delay: 10s;
}

@keyframes blob-float {
  0%, 100% { transform: translate(0, 0) scale(1); }
  33% { transform: translate(30px, -30px) scale(1.1); }
  66% { transform: translate(-30px, 30px) scale(0.9); }
}

/* Hero内容布局 */
.hero-content {
  position: relative;
  z-index: 1;
  display: grid;
  grid-template-columns: auto 1fr;
  gap: var(--space-8);
  align-items: start;
}

/* 头像区域 */
.hero-avatar-section {
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: var(--space-4);
}

.avatar-wrapper {
  position: relative;
  width: 120px;
  height: 120px;
}

.hero-avatar {
  width: 100%;
  height: 100%;
  border-radius: 50%;
  object-fit: cover;
  border: 4px solid rgba(255, 255, 255, 0.1);
  box-shadow: 0 8px 32px rgba(0, 0, 0, 0.3);
  position: relative;
  z-index: 1;
}

.avatar-ring {
  position: absolute;
  inset: -8px;
  border-radius: 50%;
  background: conic-gradient(
    from 0deg,
    rgba(var(--accent-rgb), 0.5),
    rgba(147, 197, 253, 0.5),
    rgba(196, 181, 253, 0.5),
    rgba(var(--accent-rgb), 0.5)
  );
  animation: ring-rotate 4s linear infinite;
  filter: blur(8px);
  z-index: 0;
}

@keyframes ring-rotate {
  0% { transform: rotate(0deg); }
  100% { transform: rotate(360deg); }
}

.hero-status {
  display: flex;
  align-items: center;
  gap: 6px;
  padding: 6px 12px;
  border-radius: var(--radius-full);
  background: rgba(255, 255, 255, 0.1);
  font-size: 12px;
  font-weight: 600;
  color: rgba(255, 255, 255, 0.9);
}

.status-dot {
  width: 8px;
  height: 8px;
  border-radius: 50%;
  background: #4ECDC4;
  animation: status-pulse 2s ease-in-out infinite;
}

.hero-status.offline .status-dot {
  background: #95a5a6;
  animation: none;
}

@keyframes status-pulse {
  0%, 100% { opacity: 1; }
  50% { opacity: 0.5; }
}

/* 文字区域 */
.hero-text-section {
  display: flex;
  flex-direction: column;
  gap: var(--space-3);
  min-width: 0;
}

.hero-greeting {
  font-size: 14px;
  font-weight: 600;
  letter-spacing: 0.1em;
  text-transform: uppercase;
  color: rgba(var(--accent-rgb), 1);
  margin: 0;
}

.hero-name {
  font-size: clamp(32px, 5vw, 48px);
  font-weight: 800;
  line-height: 1.2;
  margin: 0;
  background: linear-gradient(135deg, rgba(255, 255, 255, 1), rgba(147, 197, 253, 1));
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  background-clip: text;
}

.hero-quote {
  font-size: 16px;
  font-style: italic;
  color: rgba(255, 255, 255, 0.7);
  margin: 0;
  padding-left: var(--space-4);
  border-left: 3px solid rgba(var(--accent-rgb), 0.5);
}

.hero-quick-info {
  display: flex;
  flex-wrap: wrap;
  gap: var(--space-2);
  margin-top: var(--space-2);
}

.info-tag {
  display: flex;
  align-items: center;
  gap: 6px;
  padding: 6px 12px;
  border-radius: var(--radius-md);
  background: rgba(255, 255, 255, 0.08);
  font-size: 13px;
  color: rgba(255, 255, 255, 0.8);
}

.info-tag i {
  font-size: 12px;
  color: rgba(var(--accent-rgb), 0.8);
}

/* ============================================================
   技能区域
   ============================================================ */

.skills-section {
  padding: var(--space-6);
  border-radius: var(--radius-xl);
  background: rgba(var(--theme-panel-surface-rgb, 20, 20, 30), 0.4);
  border: 1px solid rgba(255, 255, 255, 0.1);
}

.section-title {
  display: flex;
  align-items: center;
  gap: var(--space-2);
  font-size: 18px;
  font-weight: 700;
  color: rgba(255, 255, 255, 0.95);
  margin-bottom: var(--space-4);
}

.section-title i {
  color: rgba(var(--accent-rgb), 0.8);
}

.skills-grid {
  display: flex;
  flex-wrap: wrap;
  gap: var(--space-2);
}

.skill-card {
  padding: 8px 16px;
  border-radius: var(--radius-md);
  background: rgba(255, 255, 255, 0.08);
  border: 1px solid rgba(255, 255, 255, 0.1);
  font-size: 14px;
  font-weight: 500;
  color: rgba(255, 255, 255, 0.9);
  transition: all 0.3s ease;
  animation: skill-appear 0.4s ease var(--skill-delay) backwards;
}

@keyframes skill-appear {
  from {
    opacity: 0;
    transform: translateY(10px) scale(0.9);
  }
  to {
    opacity: 1;
    transform: translateY(0) scale(1);
  }
}

.skill-card:hover {
  background: rgba(var(--accent-rgb), 0.2);
  border-color: rgba(var(--accent-rgb), 0.5);
  transform: translateY(-2px);
}

/* ============================================================
   统计数据区域
   ============================================================ */

.stats-section {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(120px, 1fr));
  gap: var(--space-4);
}

.stat-card {
  display: flex;
  align-items: center;
  gap: var(--space-3);
  padding: var(--space-4);
  border-radius: var(--radius-xl);
  background: rgba(var(--theme-panel-surface-rgb, 20, 20, 30), 0.4);
  border: 1px solid rgba(255, 255, 255, 0.1);
  transition: all 0.3s ease;
}

.stat-card:hover {
  background: rgba(var(--theme-panel-surface-rgb, 20, 20, 30), 0.6);
  border-color: rgba(var(--accent-rgb), 0.5);
  transform: translateY(-4px);
}

.stat-icon {
  width: 48px;
  height: 48px;
  display: flex;
  align-items: center;
  justify-content: center;
  border-radius: var(--radius-md);
  background: rgba(var(--accent-rgb), 0.15);
  color: rgba(var(--accent-rgb), 1);
  font-size: 20px;
}

.stat-info {
  flex: 1;
  min-width: 0;
}

.stat-value {
  font-size: 24px;
  font-weight: 700;
  line-height: 1.2;
  color: rgba(255, 255, 255, 0.95);
}

.stat-label {
  font-size: 12px;
  color: rgba(255, 255, 255, 0.6);
  margin-top: 2px;
}

/* ============================================================
   快捷入口区域
   ============================================================ */

.portals-section {
  padding: var(--space-6);
  border-radius: var(--radius-xl);
  background: rgba(var(--theme-panel-surface-rgb, 20, 20, 30), 0.4);
  border: 1px solid rgba(255, 255, 255, 0.1);
}

.portals-grid {
  display: grid;
  gap: var(--space-3);
}

.portal-card {
  display: grid;
  grid-template-columns: auto 1fr auto;
  align-items: center;
  gap: var(--space-4);
  padding: var(--space-4);
  border-radius: var(--radius-lg);
  border: none;
  background: rgba(255, 255, 255, 0.05);
  cursor: pointer;
  transition: all 0.3s ease;
  text-align: left;
}

.portal-card:hover {
  background: rgba(255, 255, 255, 0.1);
  transform: translateX(4px);
}

.portal-icon {
  width: 48px;
  height: 48px;
  display: flex;
  align-items: center;
  justify-content: center;
  border-radius: var(--radius-md);
  background: rgba(var(--accent-rgb), 0.15);
  color: rgba(var(--accent-rgb), 1);
  font-size: 20px;
}

.portal-content {
  display: flex;
  flex-direction: column;
  gap: 4px;
  min-width: 0;
}

.portal-content strong {
  font-size: 15px;
  font-weight: 600;
  color: rgba(255, 255, 255, 0.95);
}

.portal-content small {
  font-size: 13px;
  color: rgba(255, 255, 255, 0.6);
}

.portal-arrow {
  font-size: 16px;
  color: rgba(255, 255, 255, 0.4);
  transition: all 0.3s ease;
}

.portal-card:hover .portal-arrow {
  color: rgba(var(--accent-rgb), 1);
  transform: translateX(4px);
}

/* ============================================================
   响应式
   ============================================================ */

@media (max-width: 768px) {
  .hero-content {
    grid-template-columns: 1fr;
    text-align: center;
  }

  .hero-avatar-section {
    justify-self: center;
  }

  .hero-quote {
    padding-left: 0;
    border-left: none;
    border-top: 3px solid rgba(var(--accent-rgb), 0.5);
    padding-top: var(--space-2);
  }

  .hero-quick-info {
    justify-content: center;
  }

  .stats-section {
    grid-template-columns: repeat(2, 1fr);
  }
}

/* ============================================================
   降低动画（无障碍支持）
   ============================================================ */

@media (prefers-reduced-motion: reduce) {
  .decoration-blob,
  .avatar-ring,
  .status-dot,
  .skill-card {
    animation: none !important;
  }

  .stat-card,
  .portal-card,
  .skill-card {
    transition-duration: 0.01ms !important;
  }
}
</style>
