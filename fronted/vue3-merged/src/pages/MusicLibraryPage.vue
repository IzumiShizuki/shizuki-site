<template>
  <section class="route-page music-cozy-library">
    <header class="music-cozy-hero liquid-material">
      <div class="hero-copy">
        <p class="eyebrow">Cozy Music Room</p>
        <h1>今天想听点什么呀</h1>
        <p>保留现在的毛玻璃质感，做一版更生活化、温柔可爱的音乐空间。</p>
        <div class="mood-chip-row">
          <button v-for="mood in moods" :key="mood" class="mood-chip ripple-trigger" type="button">
            {{ mood }}
          </button>
        </div>
      </div>
      <article class="hero-now-card liquid-material">
        <p class="now-label">正在推荐</p>
        <h2 class="now-title">{{ nowPlaying.title }}</h2>
        <p class="now-meta">{{ nowPlaying.artist }} · {{ nowPlaying.duration }}</p>
        <p class="now-note">{{ nowPlaying.note }}</p>
      </article>
    </header>

    <div class="music-cozy-grid">
      <article v-for="item in albums" :key="item.name" class="album-card liquid-material ripple-trigger">
        <div class="album-cover"></div>
        <div class="meta">
          <h2>{{ item.name }}</h2>
          <p>{{ item.artist }}</p>
          <span class="album-tag">{{ item.tag }}</span>
        </div>
      </article>
    </div>
  </section>
</template>

<script setup>
const moods = ['学习专注', '轻松放空', '通勤节奏', '睡前治愈'];
const nowPlaying = {
  title: 'Sunset Cocoa',
  artist: 'Shizuki Session',
  duration: '03:27',
  note: '把紧绷的一天，慢慢放回柔软的节奏里。'
};

const albums = [
  { name: 'Shizuki Selection', artist: 'Various Artists', tag: '日常精选' },
  { name: 'Night Drift', artist: 'Ambient Collective', tag: '夜晚漫游' },
  { name: 'Digital Garden', artist: 'Lo-fi Unit', tag: '书桌陪伴' },
  { name: 'Moonlight Loop', artist: 'Indie Session', tag: '晚安循环' }
];
</script>
