<template>
  <section class="route-page">
    <header class="page-header">
      <p class="eyebrow">Author Space</p>
      <h1>作者介绍</h1>
      <p>这里用于展示建站者信息、建站经历与作者内容。</p>
    </header>

    <div class="dashboard-layout">
      <aside class="sidebar liquid-material">
        <button
          v-for="tab in tabs"
          :key="tab.key"
          class="side-item ripple-trigger"
          :class="{ active: activeTab === tab.key }"
          type="button"
          @click="openTab(tab.key)"
        >
          {{ tab.label }}
        </button>
      </aside>

      <section class="content-panel liquid-material">
        <div v-if="activeTab === 'overview'" class="content-block">
          <h2>作者主页</h2>
          <p>站点作者：Shizuki（占位）</p>
          <p>这里放你的公开简介、擅长方向、社交链接与项目入口。</p>
        </div>

        <div v-else-if="activeTab === 'journey'" class="content-block">
          <h2>建站经历</h2>
          <p>记录建站时间线、技术选型和关键里程碑（占位）。</p>
          <p>可扩展成按时间排序的日志、版本更新和截图对比。</p>
        </div>

        <div v-else-if="activeTab === 'posts'" class="content-block">
          <h2>作者文章</h2>
          <p>这里展示作者发布的专栏文章、教程与随笔（占位）。</p>
          <p>后续可接入标签筛选、分类聚合和阅读统计。</p>
        </div>

        <div v-else class="content-block">
          <h2>关于本站</h2>
          <p>用于说明网站定位、内容结构、更新计划和版权信息。</p>
        </div>
      </section>
    </div>
  </section>
</template>

<script setup>
import { computed, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';

const route = useRoute();
const router = useRouter();

const tabs = [
  { key: 'overview', label: '作者主页' },
  { key: 'journey', label: '建站经历' },
  { key: 'posts', label: '作者文章' },
  { key: 'about', label: '关于本站' }
];

function normalizeTab(raw) {
  return tabs.some((item) => item.key === raw) ? raw : 'overview';
}

const activeTab = computed(() => {
  const raw = typeof route.query.tab === 'string' ? route.query.tab : '';
  return normalizeTab(raw);
});

function openTab(tabKey) {
  const normalized = normalizeTab(tabKey);
  if (activeTab.value === normalized) return;
  router.replace({ path: '/author', query: { tab: normalized } });
}

watch(
  () => route.query.tab,
  (nextTab) => {
    const raw = typeof nextTab === 'string' ? nextTab : '';
    const normalized = normalizeTab(raw);
    if (raw === normalized) return;
    router.replace({ path: '/author', query: { tab: normalized } });
  },
  { immediate: true }
);
</script>

<style scoped>
.route-page {
  min-height: 100%;
  color: rgba(239, 244, 255, 0.96);
  display: grid;
  grid-template-rows: auto 1fr;
  gap: 12px;
}

.page-header {
  padding: 8px 4px 4px;
}

.eyebrow {
  font-size: 12px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.95);
}

h1 {
  margin-top: 4px;
  font-size: clamp(24px, 3.6vw, 36px);
}

.page-header p {
  margin-top: 10px;
  max-width: 760px;
  color: rgba(223, 230, 249, 0.86);
}

.dashboard-layout {
  min-height: 0;
  display: grid;
  grid-template-columns: 220px minmax(0, 1fr);
  gap: 12px;
}

.sidebar {
  --liquid-bg: rgba(20, 27, 42, 0.36);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.22);
  border-radius: 14px;
  padding: 10px;
  display: grid;
  gap: 8px;
  align-content: start;
}

.side-item {
  border: 0;
  border-radius: 10px;
  min-height: 36px;
  padding: 0 12px;
  text-align: left;
  background: rgba(255, 255, 255, 0.2);
  color: rgba(233, 241, 255, 0.92);
}

.side-item.active {
  background: rgba(var(--accent-rgb), 0.26);
  color: rgb(var(--accent-strong-rgb));
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.58);
}

.content-panel {
  --liquid-bg: rgba(20, 27, 42, 0.32);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.2);
  border-radius: 14px;
  padding: 14px 16px;
  overflow: auto;
}

.content-block {
  display: grid;
  gap: 10px;
}

.content-block h2 {
  font-size: 20px;
}

.content-block p {
  color: rgba(223, 230, 249, 0.88);
  line-height: 1.65;
}

@media (max-width: 900px) {
  .dashboard-layout {
    grid-template-columns: 1fr;
  }

  .sidebar {
    grid-template-columns: repeat(4, minmax(0, 1fr));
  }

  .side-item {
    min-height: 34px;
    padding: 0 8px;
    text-align: center;
    font-size: 12px;
  }
}
</style>
