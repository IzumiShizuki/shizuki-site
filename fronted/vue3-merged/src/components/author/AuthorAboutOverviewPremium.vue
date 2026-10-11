<template>
  <section class="about-overview-premium" aria-labelledby="about-overview-title">
    <!-- 封面区域 - 保留并增强 -->
    <div
      class="hero-cover-section"
      ref="coverRef"
      @mousemove="handleCoverMouseMove"
      @mouseleave="resetCoverParallax"
    >
      <!-- 封面图 -->
      <div class="cover-image-wrapper">
        <img
          class="cover-image"
          :src="coverUrl"
          :alt="`${displayName} 的网站封面`"
          :style="coverParallaxStyle"
        />
        <div class="cover-overlay" aria-hidden="true"></div>

        <!-- 浮动装饰粒子 -->
        <div class="floating-particles" aria-hidden="true">
          <span v-for="i in 12" :key="i" class="particle" :style="particleStyle(i)"></span>
        </div>
      </div>

      <!-- Hero内容 - 浮在封面之上 -->
      <div class="hero-content-overlay">
        <div class="hero-content">
          <!-- 头像 + 光环 -->
          <div class="avatar-section" ref="avatarRef">
            <div class="avatar-glow-rings" aria-hidden="true">
              <span class="glow-ring ring-1"></span>
              <span class="glow-ring ring-2"></span>
              <span class="glow-ring ring-3"></span>
            </div>
            <div class="avatar-wrapper">
              <img class="hero-avatar" :src="avatarUrl" :alt="`${displayName} avatar`" />
              <div class="avatar-border" aria-hidden="true"></div>
            </div>
          </div>

          <!-- 文字内容 -->
          <div class="hero-text">
            <p class="hero-greeting animate-slide-up">{{ hero.greeting || '你好，很高兴认识你' }}</p>
            <h1 id="about-overview-title" class="hero-name animate-slide-up" style="--delay: 0.1s">
              {{ displayName }}
            </h1>
            <blockquote class="hero-quote animate-slide-up" style="--delay: 0.2s">
              {{ hero.quote || '愿你终将与热爱相逢' }}
            </blockquote>

            <!-- 状态 + 快速信息 -->
            <div class="hero-meta animate-slide-up" style="--delay: 0.3s">
              <span class="hero-status" :class="{ offline: !enabled }">
                <span class="status-pulse" aria-hidden="true"></span>
                {{ enabled ? activityStatus : '暂时离线' }}
              </span>
              <div class="quick-tags">
                <span v-for="fact in compactFacts" :key="fact.label" class="quick-tag">
                  <i :class="fact.icon" aria-hidden="true"></i>
                  {{ fact.value }}
                </span>
              </div>
            </div>
          </div>
        </div>

        <!-- 波浪过渡 - 连接封面和下方内容 -->
        <svg class="wave-divider" viewBox="0 0 1440 120" preserveAspectRatio="none" aria-hidden="true">
          <path d="M0 72C190 116 360 30 575 60C800 92 946 132 1160 76C1274 46 1367 45 1440 58V120H0Z" />
        </svg>
      </div>
    </div>

    <!-- 统计数据区 - 交叠式出现 -->
    <div class="stats-section section-reveal" data-reveal-index="0">
      <h2 class="section-title">
        <i class="fas fa-chart-line"></i>
        数据一览
      </h2>
      <div class="stats-grid">
        <div
          v-for="(stat, index) in statsData"
          :key="stat.key"
          class="stat-card"
          :style="{ '--card-delay': `${index * 0.1}s` }"
          @mouseenter="handleStatHover"
        >
          <div class="stat-icon-wrapper">
            <div class="stat-icon-glow" aria-hidden="true"></div>
            <i :class="stat.icon" class="stat-icon"></i>
          </div>
          <div class="stat-content">
            <div class="stat-value">
              <span class="stat-number" :data-target="stat.value">0</span>
            </div>
            <div class="stat-label">{{ stat.label }}</div>
          </div>
          <div class="stat-sparkle" aria-hidden="true"></div>
        </div>
      </div>
    </div>

    <!-- 技能栈区 - 磁性卡片效果 -->
    <div v-if="visibleSkills.length" class="skills-section section-reveal" data-reveal-index="1">
      <h2 class="section-title">
        <i class="fas fa-code"></i>
        技能栈
      </h2>
      <div class="skills-magnetic-grid" ref="skillsGridRef">
        <div
          v-for="(skill, index) in visibleSkills"
          :key="skill"
          class="skill-card magnetic-card"
          :style="{ '--skill-index': index }"
          :data-skill-index="index"
          @mouseenter="handleSkillHover($event, index)"
          @mouseleave="resetSkillHover"
        >
          <span class="skill-text">{{ skill }}</span>
          <div class="skill-shimmer" aria-hidden="true"></div>
        </div>
      </div>
    </div>

    <!-- 作品展示区 - 图片画廊 -->
    <div class="gallery-section section-reveal" data-reveal-index="2">
      <h2 class="section-title">
        <i class="fas fa-images"></i>
        作品展示
      </h2>
      <div class="gallery-grid">
        <div
          v-for="i in 6"
          :key="i"
          class="gallery-item"
          :style="{ '--gallery-delay': `${i * 0.08}s` }"
        >
          <div class="gallery-frame">
            <div class="gallery-image-placeholder">
              <i class="fas fa-image"></i>
              <span>图片 {{ i }}</span>
            </div>
            <div class="gallery-frame-border" aria-hidden="true"></div>
            <div class="gallery-reflection" aria-hidden="true"></div>
          </div>
          <div class="gallery-caption">
            <strong>作品标题 {{ i }}</strong>
            <small>作品描述文字</small>
          </div>
        </div>
      </div>
    </div>

    <!-- 快捷入口 - 玻璃态卡片 -->
    <nav v-if="portals.length" class="portals-section section-reveal" data-reveal-index="3" aria-label="站点入口">
      <h2 class="section-title">
        <i class="fas fa-compass"></i>
        探索更多
      </h2>
      <div class="portals-glass-grid">
        <button
          v-for="portal in portals"
          :key="portal.key"
          type="button"
          class="portal-glass-card ripple-trigger"
          @click="$emit('select-portal', portal)"
          @mouseenter="handlePortalHover"
        >
          <div class="portal-glow" aria-hidden="true"></div>
          <div class="portal-icon-wrapper">
            <i :class="portal.icon"></i>
          </div>
          <div class="portal-text">
            <strong>{{ portal.title }}</strong>
            <small>{{ portal.description }}</small>
          </div>
          <i class="fas fa-arrow-right portal-arrow"></i>
        </button>
      </div>
    </nav>
  </section>
</template>

<script setup>
import { computed, onMounted, onUnmounted, ref } from 'vue';

const props = defineProps({
  hero: { type: Object, default: () => ({}) },
  identity: { type: Object, default: () => ({}) },
  skills: { type: Array, default: () => [] },
  enabled: { type: Boolean, default: true },
  portals: { type: Array, default: () => [] },
  stats: { type: Object, default: () => ({ posts: 0, projects: 0, tags: 0, views: 0 }) }
});

defineEmits(['select-portal']);

const coverRef = ref(null);
const avatarRef = ref(null);
const skillsGridRef = ref(null);

const coverParallax = ref({ x: 0, y: 0 });
const coverParallaxStyle = computed(() => ({
  transform: `translate(${coverParallax.value.x}px, ${coverParallax.value.y}px) scale(1.1)`
}));

const displayName = computed(() => String(props.hero?.name || 'Shizuki').trim());
const avatarUrl = computed(() => String(props.hero?.avatarUrl || '/images/katanegai.jpg').trim());
const coverUrl = computed(() => String(props.hero?.coverImageUrl || avatarUrl.value).trim());
const activityStatus = computed(() => String(props.identity?.activityStatus || '学习中').trim());

const compactFacts = computed(() => {
  const facts = [];
  if (props.identity?.role) facts.push({ label: '角色', value: props.identity.role, icon: 'fas fa-briefcase' });
  if (props.identity?.location) facts.push({ label: '位置', value: props.identity.location, icon: 'fas fa-location-dot' });
  else if (props.identity?.school) facts.push({ label: '学校', value: props.identity.school, icon: 'fas fa-graduation-cap' });
  return facts.slice(0, 3);
});

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

const statsData = computed(() => [
  { key: 'posts', label: '文章', value: props.stats.posts || 0, icon: 'fas fa-file-lines' },
  { key: 'projects', label: '项目', value: props.stats.projects || 0, icon: 'fas fa-folder' },
  { key: 'tags', label: '标签', value: props.stats.tags || 0, icon: 'fas fa-tags' },
  { key: 'views', label: '浏览', value: props.stats.views || 0, icon: 'fas fa-eye' }
]);

function particleStyle(index) {
  const delay = Math.random() * 8;
  const duration = 15 + Math.random() * 10;
  const x = Math.random() * 100;
  const y = Math.random() * 100;
  return {
    left: `${x}%`,
    top: `${y}%`,
    animationDelay: `${delay}s`,
    animationDuration: `${duration}s`
  };
}

function handleCoverMouseMove(e) {
  if (!coverRef.value) return;
  const rect = coverRef.value.getBoundingClientRect();
  const x = (e.clientX - rect.left - rect.width / 2) / rect.width;
  const y = (e.clientY - rect.top - rect.height / 2) / rect.height;
  coverParallax.value = { x: x * 30, y: y * 30 };
}

function resetCoverParallax() {
  coverParallax.value = { x: 0, y: 0 };
}

function handleStatHover(e) {
  const card = e.currentTarget;
  card.style.transform = 'translateY(-8px) scale(1.02)';
}

function handleSkillHover(e, index) {
  const card = e.currentTarget;
  card.style.transform = 'translateY(-4px) scale(1.05)';
}

function resetSkillHover(e) {
  const card = e.currentTarget;
  card.style.transform = '';
}

function handlePortalHover(e) {
  const card = e.currentTarget;
  const glow = card.querySelector('.portal-glow');
  if (glow) glow.style.opacity = '1';
}

// 数字动画
function animateNumber(element, target) {
  const duration = 2000;
  const start = 0;
  const startTime = performance.now();

  function update(currentTime) {
    const elapsed = currentTime - startTime;
    const progress = Math.min(elapsed / duration, 1);
    const easeProgress = 1 - Math.pow(1 - progress, 3);
    const current = Math.floor(start + (target - start) * easeProgress);
    element.textContent = current;
    if (progress < 1) requestAnimationFrame(update);
  }

  requestAnimationFrame(update);
}

// Intersection Observer - 滚动触发动画
let observer = null;
onMounted(() => {
  // 平滑滚动
  document.documentElement.style.scrollBehavior = 'smooth';

  // 数字动画
  setTimeout(() => {
    document.querySelectorAll('.stat-number').forEach(el => {
      const target = parseInt(el.dataset.target) || 0;
      animateNumber(el, target);
    });
  }, 500);

  // 交叠式reveal
  observer = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
      if (entry.isIntersecting) {
        entry.target.classList.add('revealed');
      }
    });
  }, { threshold: 0.1, rootMargin: '-50px' });

  document.querySelectorAll('.section-reveal').forEach(el => observer.observe(el));
});

onUnmounted(() => {
  if (observer) observer.disconnect();
});
</script>

<style scoped>
.about-overview-premium {
  display: flex;
  flex-direction: column;
  gap: var(--space-10);
}

/* ============================================================
   封面区域 - 保留并增强
   ============================================================ */

.hero-cover-section {
  position: relative;
  min-height: 600px;
  border-radius: var(--radius-2xl);
  overflow: hidden;
  box-shadow: 0 30px 90px rgba(0, 0, 0, 0.5);
}

.cover-image-wrapper {
  position: absolute;
  inset: 0;
  overflow: hidden;
}

.cover-image {
  width: 100%;
  height: 100%;
  object-fit: cover;
  transition: transform 0.3s ease-out;
  will-change: transform;
}

.cover-overlay {
  position: absolute;
  inset: 0;
  background: linear-gradient(
    180deg,
    rgba(0, 0, 0, 0.2) 0%,
    rgba(0, 0, 0, 0.5) 60%,
    rgba(0, 0, 0, 0.8) 100%
  );
}

/* 浮动粒子 */
.floating-particles {
  position: absolute;
  inset: 0;
  pointer-events: none;
  overflow: hidden;
}

.particle {
  position: absolute;
  width: 4px;
  height: 4px;
  background: rgba(255, 255, 255, 0.6);
  border-radius: 50%;
  box-shadow: 0 0 10px rgba(255, 255, 255, 0.8);
  animation: particle-float 15s ease-in-out infinite;
}

@keyframes particle-float {
  0%, 100% { transform: translateY(0) translateX(0); opacity: 0; }
  10% { opacity: 1; }
  90% { opacity: 1; }
  100% { transform: translateY(-100vh) translateX(50px); opacity: 0; }
}

/* Hero内容层 */
.hero-content-overlay {
  position: relative;
  z-index: 2;
  display: flex;
  flex-direction: column;
  justify-content: flex-end;
  min-height: 600px;
  padding: var(--space-10) var(--space-6) 0;
}

.hero-content {
  display: flex;
  align-items: flex-end;
  gap: var(--space-6);
  padding-bottom: var(--space-8);
}

/* 头像 + 光环 */
.avatar-section {
  position: relative;
  flex-shrink: 0;
}

.avatar-glow-rings {
  position: absolute;
  inset: -40px;
  pointer-events: none;
}

.glow-ring {
  position: absolute;
  inset: 0;
  border-radius: 50%;
  border: 2px solid;
  opacity: 0.3;
  animation: ring-pulse 3s ease-in-out infinite;
}

.ring-1 {
  border-color: rgba(var(--accent-rgb), 0.8);
  animation-delay: 0s;
}

.ring-2 {
  border-color: rgba(147, 197, 253, 0.6);
  animation-delay: 1s;
}

.ring-3 {
  border-color: rgba(196, 181, 253, 0.6);
  animation-delay: 2s;
}

@keyframes ring-pulse {
  0%, 100% { transform: scale(0.8); opacity: 0; }
  50% { transform: scale(1.2); opacity: 0.5; }
}

.avatar-wrapper {
  position: relative;
  width: 140px;
  height: 140px;
}

.hero-avatar {
  width: 100%;
  height: 100%;
  border-radius: 50%;
  object-fit: cover;
  border: 4px solid rgba(255, 255, 255, 0.2);
  box-shadow: 0 20px 60px rgba(0, 0, 0, 0.5);
  position: relative;
  z-index: 1;
}

.avatar-border {
  position: absolute;
  inset: -6px;
  border-radius: 50%;
  background: conic-gradient(
    from 0deg,
    rgba(var(--accent-rgb), 1),
    rgba(147, 197, 253, 1),
    rgba(196, 181, 253, 1),
    rgba(var(--accent-rgb), 1)
  );
  animation: border-rotate 4s linear infinite;
  z-index: 0;
}

@keyframes border-rotate {
  0% { transform: rotate(0deg); }
  100% { transform: rotate(360deg); }
}

/* 文字内容 */
.hero-text {
  flex: 1;
  min-width: 0;
  display: flex;
  flex-direction: column;
  gap: var(--space-3);
}

.animate-slide-up {
  animation: slide-up 0.8s ease-out backwards;
  animation-delay: var(--delay, 0s);
}

@keyframes slide-up {
  from {
    opacity: 0;
    transform: translateY(30px);
  }
  to {
    opacity: 1;
    transform: translateY(0);
  }
}

.hero-greeting {
  font-size: 14px;
  font-weight: 700;
  letter-spacing: 0.15em;
  text-transform: uppercase;
  color: rgba(var(--accent-rgb), 1);
  text-shadow: 0 2px 10px rgba(var(--accent-rgb), 0.5);
  margin: 0;
}

.hero-name {
  font-size: clamp(40px, 6vw, 72px);
  font-weight: 900;
  line-height: 1.1;
  margin: 0;
  background: linear-gradient(
    135deg,
    rgba(255, 255, 255, 1) 0%,
    rgba(147, 197, 253, 1) 50%,
    rgba(196, 181, 253, 1) 100%
  );
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  background-clip: text;
  text-shadow: 0 10px 40px rgba(0, 0, 0, 0.5);
}

.hero-quote {
  font-size: 18px;
  font-style: italic;
  color: rgba(255, 255, 255, 0.9);
  margin: 0;
  padding-left: var(--space-4);
  border-left: 4px solid rgba(var(--accent-rgb), 0.6);
  text-shadow: 0 2px 10px rgba(0, 0, 0, 0.5);
}

.hero-meta {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: var(--space-3);
  margin-top: var(--space-2);
}

.hero-status {
  display: flex;
  align-items: center;
  gap: 8px;
  padding: 8px 16px;
  border-radius: var(--radius-full);
  background: rgba(255, 255, 255, 0.15);
  backdrop-filter: blur(10px);
  font-size: 13px;
  font-weight: 600;
  color: rgba(255, 255, 255, 1);
  box-shadow: 0 4px 20px rgba(0, 0, 0, 0.3);
}

.status-pulse {
  width: 10px;
  height: 10px;
  border-radius: 50%;
  background: #4ECDC4;
  box-shadow: 0 0 10px #4ECDC4;
  animation: pulse 2s ease-in-out infinite;
}

@keyframes pulse {
  0%, 100% { opacity: 1; transform: scale(1); }
  50% { opacity: 0.5; transform: scale(1.3); }
}

.hero-status.offline .status-pulse {
  background: #95a5a6;
  box-shadow: none;
  animation: none;
}

.quick-tags {
  display: flex;
  flex-wrap: wrap;
  gap: var(--space-2);
}

.quick-tag {
  display: flex;
  align-items: center;
  gap: 6px;
  padding: 6px 12px;
  border-radius: var(--radius-md);
  background: rgba(255, 255, 255, 0.1);
  backdrop-filter: blur(10px);
  font-size: 13px;
  color: rgba(255, 255, 255, 0.95);
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.2);
}

.quick-tag i {
  color: rgba(var(--accent-rgb), 1);
}

/* 波浪分隔 */
.wave-divider {
  position: absolute;
  bottom: -1px;
  left: 0;
  width: 100%;
  height: 80px;
  fill: var(--theme-bg);
}

/* ============================================================
   统计数据区 - 动画卡片
   ============================================================ */

.section-reveal {
  opacity: 0;
  transform: translateY(40px);
  transition: all 0.8s cubic-bezier(0.16, 1, 0.3, 1);
}

.section-reveal.revealed {
  opacity: 1;
  transform: translateY(0);
}

.stats-section,
.skills-section,
.gallery-section,
.portals-section {
  padding: var(--space-8) var(--space-6);
  border-radius: var(--radius-2xl);
  background: rgba(var(--theme-panel-surface-rgb, 20, 20, 30), 0.5);
  backdrop-filter: blur(20px);
  border: 1px solid rgba(255, 255, 255, 0.1);
}

.section-title {
  display: flex;
  align-items: center;
  gap: var(--space-3);
  font-size: 24px;
  font-weight: 800;
  color: rgba(255, 255, 255, 0.95);
  margin-bottom: var(--space-6);
}

.section-title i {
  font-size: 20px;
  color: rgba(var(--accent-rgb), 1);
}

.stats-grid {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
  gap: var(--space-4);
}

.stat-card {
  position: relative;
  display: flex;
  align-items: center;
  gap: var(--space-4);
  padding: var(--space-5);
  border-radius: var(--radius-xl);
  background: rgba(255, 255, 255, 0.05);
  border: 1px solid rgba(255, 255, 255, 0.1);
  overflow: hidden;
  transition: all 0.4s cubic-bezier(0.16, 1, 0.3, 1);
  animation: stat-appear 0.6s ease-out backwards;
  animation-delay: var(--card-delay);
}

@keyframes stat-appear {
  from {
    opacity: 0;
    transform: scale(0.8) translateY(20px);
  }
  to {
    opacity: 1;
    transform: scale(1) translateY(0);
  }
}

.stat-card:hover {
  background: rgba(255, 255, 255, 0.08);
  border-color: rgba(var(--accent-rgb), 0.5);
  box-shadow: 0 20px 60px rgba(var(--accent-rgb), 0.3);
}

.stat-icon-wrapper {
  position: relative;
  width: 60px;
  height: 60px;
  display: flex;
  align-items: center;
  justify-content: center;
  border-radius: var(--radius-lg);
  background: rgba(var(--accent-rgb), 0.15);
  flex-shrink: 0;
}

.stat-icon-glow {
  position: absolute;
  inset: -10px;
  background: radial-gradient(circle, rgba(var(--accent-rgb), 0.4), transparent 70%);
  filter: blur(20px);
  opacity: 0;
  transition: opacity 0.3s ease;
}

.stat-card:hover .stat-icon-glow {
  opacity: 1;
}

.stat-icon {
  font-size: 24px;
  color: rgba(var(--accent-rgb), 1);
}

.stat-content {
  flex: 1;
  min-width: 0;
}

.stat-value {
  font-size: 32px;
  font-weight: 800;
  line-height: 1;
  color: rgba(255, 255, 255, 0.95);
}

.stat-label {
  font-size: 13px;
  color: rgba(255, 255, 255, 0.6);
  margin-top: 4px;
}

.stat-sparkle {
  position: absolute;
  top: 10px;
  right: 10px;
  width: 20px;
  height: 20px;
  background: radial-gradient(circle, rgba(255, 255, 255, 0.8), transparent);
  border-radius: 50%;
  opacity: 0;
  animation: sparkle 2s ease-in-out infinite;
}

@keyframes sparkle {
  0%, 100% { opacity: 0; transform: scale(0.5) rotate(0deg); }
  50% { opacity: 1; transform: scale(1) rotate(180deg); }
}

/* ============================================================
   技能栈 - 磁性卡片
   ============================================================ */

.skills-magnetic-grid {
  display: flex;
  flex-wrap: wrap;
  gap: var(--space-3);
}

.skill-card {
  position: relative;
  padding: 12px 20px;
  border-radius: var(--radius-lg);
  background: rgba(255, 255, 255, 0.08);
  border: 1px solid rgba(255, 255, 255, 0.15);
  font-size: 15px;
  font-weight: 600;
  color: rgba(255, 255, 255, 0.95);
  overflow: hidden;
  transition: all 0.3s cubic-bezier(0.16, 1, 0.3, 1);
  cursor: pointer;
  animation: skill-pop 0.5s ease-out backwards;
  animation-delay: calc(var(--skill-index) * 0.03s);
}

@keyframes skill-pop {
  from {
    opacity: 0;
    transform: scale(0.8);
  }
  to {
    opacity: 1;
    transform: scale(1);
  }
}

.skill-card:hover {
  background: rgba(var(--accent-rgb), 0.2);
  border-color: rgba(var(--accent-rgb), 0.6);
  box-shadow: 0 10px 30px rgba(var(--accent-rgb), 0.3);
}

.skill-shimmer {
  position: absolute;
  top: 0;
  left: -100%;
  width: 100%;
  height: 100%;
  background: linear-gradient(
    90deg,
    transparent,
    rgba(255, 255, 255, 0.3),
    transparent
  );
  transition: left 0.5s ease;
}

.skill-card:hover .skill-shimmer {
  left: 100%;
}

/* ============================================================
   作品展示 - 图片画廊
   ============================================================ */

.gallery-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(280px, 1fr));
  gap: var(--space-6);
}

.gallery-item {
  display: flex;
  flex-direction: column;
  gap: var(--space-3);
  animation: gallery-reveal 0.6s ease-out backwards;
  animation-delay: var(--gallery-delay);
}

@keyframes gallery-reveal {
  from {
    opacity: 0;
    transform: translateY(30px) scale(0.9);
  }
  to {
    opacity: 1;
    transform: translateY(0) scale(1);
  }
}

.gallery-frame {
  position: relative;
  aspect-ratio: 4 / 3;
  border-radius: var(--radius-xl);
  overflow: hidden;
  transition: all 0.4s cubic-bezier(0.16, 1, 0.3, 1);
}

.gallery-frame:hover {
  transform: translateY(-8px) scale(1.02);
}

.gallery-image-placeholder {
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  gap: var(--space-2);
  background: linear-gradient(
    135deg,
    rgba(var(--accent-rgb), 0.1),
    rgba(147, 197, 253, 0.1)
  );
  color: rgba(255, 255, 255, 0.5);
  font-size: 14px;
}

.gallery-image-placeholder i {
  font-size: 48px;
  opacity: 0.3;
}

.gallery-frame-border {
  position: absolute;
  inset: 0;
  border: 3px solid rgba(255, 255, 255, 0.1);
  border-radius: inherit;
  pointer-events: none;
  transition: all 0.3s ease;
}

.gallery-frame:hover .gallery-frame-border {
  border-color: rgba(var(--accent-rgb), 0.6);
  box-shadow:
    inset 0 0 30px rgba(var(--accent-rgb), 0.2),
    0 0 30px rgba(var(--accent-rgb), 0.3);
}

.gallery-reflection {
  position: absolute;
  inset: 0;
  background: linear-gradient(
    135deg,
    rgba(255, 255, 255, 0.2) 0%,
    transparent 50%
  );
  opacity: 0;
  transition: opacity 0.3s ease;
  pointer-events: none;
}

.gallery-frame:hover .gallery-reflection {
  opacity: 1;
}

.gallery-caption {
  display: flex;
  flex-direction: column;
  gap: 4px;
}

.gallery-caption strong {
  font-size: 15px;
  font-weight: 600;
  color: rgba(255, 255, 255, 0.95);
}

.gallery-caption small {
  font-size: 13px;
  color: rgba(255, 255, 255, 0.6);
}

/* ============================================================
   快捷入口 - 玻璃态
   ============================================================ */

.portals-glass-grid {
  display: grid;
  gap: var(--space-4);
}

.portal-glass-card {
  position: relative;
  display: grid;
  grid-template-columns: auto 1fr auto;
  align-items: center;
  gap: var(--space-4);
  padding: var(--space-5);
  border-radius: var(--radius-xl);
  border: none;
  background: rgba(255, 255, 255, 0.05);
  backdrop-filter: blur(20px);
  cursor: pointer;
  overflow: hidden;
  transition: all 0.4s cubic-bezier(0.16, 1, 0.3, 1);
  text-align: left;
}

.portal-glow {
  position: absolute;
  inset: 0;
  background: radial-gradient(
    circle at 50% 50%,
    rgba(var(--accent-rgb), 0.2),
    transparent 70%
  );
  opacity: 0;
  transition: opacity 0.3s ease;
  pointer-events: none;
}

.portal-glass-card:hover {
  background: rgba(255, 255, 255, 0.1);
  border: 1px solid rgba(var(--accent-rgb), 0.3);
  transform: translateX(8px);
  box-shadow: 0 20px 60px rgba(var(--accent-rgb), 0.2);
}

.portal-icon-wrapper {
  width: 56px;
  height: 56px;
  display: flex;
  align-items: center;
  justify-content: center;
  border-radius: var(--radius-lg);
  background: rgba(var(--accent-rgb), 0.15);
  font-size: 24px;
  color: rgba(var(--accent-rgb), 1);
  flex-shrink: 0;
}

.portal-text {
  display: flex;
  flex-direction: column;
  gap: 4px;
  min-width: 0;
}

.portal-text strong {
  font-size: 16px;
  font-weight: 700;
  color: rgba(255, 255, 255, 0.95);
}

.portal-text small {
  font-size: 14px;
  color: rgba(255, 255, 255, 0.7);
}

.portal-arrow {
  font-size: 18px;
  color: rgba(255, 255, 255, 0.4);
  transition: all 0.3s ease;
}

.portal-glass-card:hover .portal-arrow {
  color: rgba(var(--accent-rgb), 1);
  transform: translateX(6px);
}

/* ============================================================
   响应式
   ============================================================ */

@media (max-width: 1024px) {
  .hero-content {
    flex-direction: column;
    align-items: center;
    text-align: center;
  }

  .hero-quote {
    border-left: none;
    border-top: 4px solid rgba(var(--accent-rgb), 0.6);
    padding-left: 0;
    padding-top: var(--space-2);
  }

  .hero-meta {
    justify-content: center;
  }
}

@media (max-width: 768px) {
  .hero-cover-section {
    min-height: 500px;
  }

  .hero-name {
    font-size: clamp(32px, 8vw, 48px);
  }

  .stats-grid {
    grid-template-columns: repeat(2, 1fr);
  }

  .gallery-grid {
    grid-template-columns: 1fr;
  }
}

/* ============================================================
   降低动画
   ============================================================ */

@media (prefers-reduced-motion: reduce) {
  * {
    animation-duration: 0.01ms !important;
    animation-iteration-count: 1 !important;
    transition-duration: 0.01ms !important;
  }
}
</style>
