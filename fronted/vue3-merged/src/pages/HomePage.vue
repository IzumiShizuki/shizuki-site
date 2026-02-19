<template>
  <section class="route-page home-page">
    <header class="page-header">
      <p class="eyebrow">Home</p>
      <h1>主页</h1>
      <p>这是主页面内容占位。后续可替换为你的真实首页模块。</p>
    </header>

    <div class="card-grid">
      <article class="page-card liquid-material">
        <h2>今日状态</h2>
        <p>音乐、悬浮球、菜单都在全局保留，页面仅切换主内容区。</p>
      </article>
      <article class="page-card liquid-material">
        <h2>快捷入口</h2>
        <p>可以在菜单中继续切换到博客、音乐库、轻应用、AI酒馆、个人页面。</p>
      </article>
    </div>
  </section>
</template>

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

.card-grid {
  margin-top: 14px;
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 14px;
}

.page-card {
  --liquid-bg: rgba(20, 27, 42, 0.34);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.22);
  border-radius: 16px;
  padding: 16px;
}

.page-card h2 {
  font-size: 18px;
  margin-bottom: 8px;
}

.page-card p {
  color: rgba(223, 230, 249, 0.86);
  line-height: 1.6;
}

@media (max-width: 900px) {
  .card-grid {
    grid-template-columns: 1fr;
  }
}
</style>
