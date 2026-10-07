<template>
  <figure class="daily-work" :class="{ portrait, featured }">
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
const props = defineProps({ artwork: { type: Object, required: true }, portrait: Boolean, featured: Boolean });
const imageFailed = ref(false);
watch(() => props.artwork.imageUrl, () => { imageFailed.value = false; });
</script>

<style scoped>
.daily-work { margin: 0; min-width: 0; }
.image-link { display: block; overflow: hidden; border-radius: 12px; color: var(--theme-text-secondary, #8b7885); text-decoration: none; }
.image-link img { display: block; width: 100%; height: auto; }
.featured .image-link { width: fit-content; max-width: 100%; margin-inline: auto; }
.featured .image-link img { width: auto; max-width: 100%; max-height: min(65svh, 640px); }
.featured figcaption { padding-top: 12px; text-align: center; }
.featured .work-title { font-size: 15px; }
.image-fallback { display: flex; flex-direction: column; gap: 12px; align-items: center; justify-content: center; min-height: 160px; padding: 20px; box-sizing: border-box; background: var(--theme-surface-soft, #fff8f5); font-size: 12px; text-align: center; }
.featured .image-fallback { width: min(480px, 100%); min-height: 280px; }
figcaption { display: grid; gap: 4px; padding: 9px 2px; }
figcaption a { overflow: hidden; text-overflow: ellipsis; white-space: nowrap; text-decoration: none; }
.work-title { color: var(--theme-text-primary, #403843); font-weight: 600; font-size: 13px; }
.work-artist { color: var(--theme-text-secondary, #8b7885); font-size: 11px; }
a:hover { text-decoration: underline; }
a:focus-visible { outline: 2px solid var(--accent-hex, #f2b39d); outline-offset: 3px; }
</style>
