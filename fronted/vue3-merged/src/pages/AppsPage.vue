<template>
  <section class="route-page">
    <header class="page-header">
      <p class="eyebrow">Apps</p>
      <h1>轻应用</h1>
      <p>这里是轻应用模块占位区域，可逐步替换为你的真实工具入口。</p>
    </header>

    <div class="apps-grid">
      <article v-for="item in apps" :key="item.title" class="app-card liquid-material ripple-trigger">
        <h2>{{ item.title }}</h2>
        <p>{{ item.desc }}</p>
      </article>
    </div>
  </section>
</template>

<script setup>
const apps = [
  { title: '专注计时', desc: '用于番茄工作法和节奏管理。' },
  { title: '语音备忘', desc: '记录灵感与短语，支持后续整理。' },
  { title: '灵感墙', desc: '以卡片方式整理想法和任务。' },
  { title: '快捷命令', desc: '保存常用操作入口，减少重复点击。' }
];
</script>

<style scoped>
.route-page {
  min-height: 100%;
  color: rgba(239, 244, 255, 0.96);
}

.page-header {
  padding: 8px 4px 14px;
}

.eyebrow {
  font-size: 12px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.95);
}

h1 {
  margin-top: 4px;
  font-size: clamp(28px, 4vw, 42px);
}

.page-header p {
  margin-top: 10px;
  max-width: 680px;
  color: rgba(223, 230, 249, 0.86);
}

.apps-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 12px;
}

.app-card {
  --liquid-bg: rgba(20, 27, 42, 0.34);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.22);
  border-radius: 14px;
  padding: 14px 16px;
}

.app-card h2 {
  font-size: 17px;
}

.app-card p {
  margin-top: 8px;
  line-height: 1.6;
  color: rgba(223, 230, 249, 0.86);
}

@media (max-width: 900px) {
  .apps-grid {
    grid-template-columns: 1fr;
  }
}
</style>
