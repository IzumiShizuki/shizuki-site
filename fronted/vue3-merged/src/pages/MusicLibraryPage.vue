<template>
  <section class="route-page">
    <header class="page-header">
      <p class="eyebrow">Music Library</p>
      <h1>音乐库</h1>
      <p>这里是音乐库占位页面。底部播放器仍全局保留并可用。</p>
    </header>

    <div class="library-grid">
      <article v-for="item in albums" :key="item.name" class="album-card liquid-material ripple-trigger">
        <div class="cover"></div>
        <div class="meta">
          <h2>{{ item.name }}</h2>
          <p>{{ item.artist }}</p>
        </div>
      </article>
    </div>
  </section>
</template>

<script setup>
const albums = [
  { name: 'Shizuki Selection', artist: 'Various Artists' },
  { name: 'Night Drift', artist: 'Ambient Collective' },
  { name: 'Digital Garden', artist: 'Lo-fi Unit' },
  { name: 'Moonlight Loop', artist: 'Indie Session' }
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

.library-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 12px;
}

.album-card {
  --liquid-bg: rgba(20, 27, 42, 0.34);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.22);
  border-radius: 14px;
  padding: 10px;
  display: grid;
  grid-template-columns: 64px 1fr;
  align-items: center;
  gap: 10px;
}

.cover {
  width: 64px;
  height: 64px;
  border-radius: 10px;
  background: linear-gradient(140deg, rgba(var(--accent-rgb), 0.45), rgba(40, 52, 78, 0.84));
}

.meta h2 {
  font-size: 16px;
}

.meta p {
  margin-top: 4px;
  color: rgba(223, 230, 249, 0.84);
}

@media (max-width: 900px) {
  .library-grid {
    grid-template-columns: 1fr;
  }
}
</style>
