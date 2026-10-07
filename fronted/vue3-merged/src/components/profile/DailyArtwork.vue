<template>
  <figure class="daily-work" :class="{ portrait }">
    <a class="image-link" :href="artwork.sourceUrl" target="_blank" rel="noopener noreferrer">
      <img v-if="!imageFailed" :key="artwork.imageUrl" :src="artwork.imageUrl" :alt="artwork.title"
        loading="lazy" referrerpolicy="no-referrer" @error="imageFailed = true" />
      <span v-else class="image-fallback"><i class="fas fa-image" aria-hidden="true"></i>图片暂时无法显示，点击查看原作</span>
    </a>
    <figcaption>
      <a class="work-title" :href="artwork.sourceUrl" target="_blank" rel="noopener noreferrer">{{ artwork.title }}</a>
      <a class="work-artist" :href="`https://www.pixiv.net/users/${artwork.artistId}`" target="_blank" rel="noopener noreferrer">{{ artwork.artistName }} · Pixiv {{ artwork.id }}</a>
    </figcaption>
  </figure>
</template>

<script setup>
import { ref, watch } from 'vue';
const props = defineProps({ artwork: { type: Object, required: true }, portrait: Boolean });
const imageFailed = ref(false);
watch(() => props.artwork.imageUrl, () => { imageFailed.value = false; });
</script>

<style scoped>
.daily-work { margin: 0; min-width: 0; }
.image-link { display: grid; overflow: hidden; aspect-ratio: 4 / 3; border-radius: 12px; background: var(--theme-surface-soft, #fff8f5); color: var(--theme-text-secondary, #8b7885); text-decoration: none; }
.image-link img { width: 100%; height: 100%; object-fit: contain; min-height: 0; }
.portrait .image-link { aspect-ratio: 3 / 4; }
.image-fallback { display: flex; flex-direction: column; gap: 12px; align-items: center; justify-content: center; padding: 20px; font-size: 12px; text-align: center; }
figcaption { display: grid; gap: 4px; padding: 9px 2px; }
figcaption a { overflow: hidden; text-overflow: ellipsis; white-space: nowrap; text-decoration: none; }
.work-title { color: var(--theme-text-primary, #403843); font-weight: 600; font-size: 13px; }
.work-artist { color: var(--theme-text-secondary, #8b7885); font-size: 11px; }
a:hover { text-decoration: underline; }
a:focus-visible { outline: 2px solid var(--accent-hex, #f2b39d); outline-offset: 3px; }
</style>
