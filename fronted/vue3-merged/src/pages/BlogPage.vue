<template>
  <section class="route-page blog-page">
    <header class="page-header">
      <p class="eyebrow">Blog</p>
      <h1>博客</h1>
      <p>这里是博客模块占位内容。左侧主内容 + 右侧辅助 AI 对话已支持。</p>
    </header>

    <div class="post-list">
      <article v-for="item in posts" :key="item.title" class="post-card liquid-material ripple-trigger">
        <h2>{{ item.title }}</h2>
        <p>{{ item.summary }}</p>
      </article>
    </div>
  </section>
</template>

<script setup>
const posts = [
  { title: '路由化改造完成', summary: '主菜单点击后将真正切换路由并显示对应模块内容。' },
  { title: 'AI 辅助面板模式', summary: '博客页可在右侧 1/4 直接提问 AI，保持阅读上下文。' },
  { title: '主题色支持', summary: '交互高亮默认淡紫色，可在个人设置中切换预设或自定义 HEX。' }
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

.post-list {
  display: grid;
  gap: 12px;
}

.post-card {
  --liquid-bg: rgba(20, 27, 42, 0.34);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.22);
  border-radius: 14px;
  padding: 14px 16px;
}

.post-card h2 {
  font-size: 17px;
}

.post-card p {
  margin-top: 8px;
  line-height: 1.6;
  color: rgba(223, 230, 249, 0.86);
}
</style>
