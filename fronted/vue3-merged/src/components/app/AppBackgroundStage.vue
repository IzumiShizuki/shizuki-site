<template>
  <div class="bg-layer" :class="{ home: isHomeRoute }" aria-hidden="true">
    <img class="bg-image" :src="activeImageBackground" alt="background" />
    <video
      v-if="activeVideoBackground && !videoFailed"
      class="bg-video"
      :src="activeVideoBackground"
      autoplay
      muted
      loop
      playsinline
      preload="auto"
      @error="$emit('video-error')"
    ></video>
    <WallpaperL2dCanvas
      v-if="activeL2dVisible"
      :model-url="modelUrl"
      :model-entry="modelEntry"
      :fallback-src="activeImageBackground"
      @error="$emit('l2d-error')"
    />
    <audio
      :ref="setWallpaperBgmRef || undefined"
      class="wallpaper-audio"
      :src="activeWallpaperBgmUrl"
      preload="metadata"
      loop
      playsinline
    ></audio>
    <video
      :ref="setWallpaperBgvRef || undefined"
      class="wallpaper-audio"
      :src="activeWallpaperBgvUrl"
      preload="metadata"
      loop
      playsinline
    ></video>
    <div class="bg-fx" :class="{ 'bg-fx-home': isHomeRoute }"></div>
    <SceneEffectLayer :effect="effect" :is-home-route="isHomeRoute" :reduced-motion="reducedMotion" />
  </div>
</template>

<script setup>
import SceneEffectLayer from '../SceneEffectLayer.vue';
import WallpaperL2dCanvas from '../WallpaperL2dCanvas.vue';

defineProps({
  activeImageBackground: { type: String, default: '' },
  activeVideoBackground: { type: String, default: '' },
  videoFailed: { type: Boolean, default: false },
  activeL2dVisible: { type: Boolean, default: false },
  modelUrl: { type: String, default: '' },
  modelEntry: { type: String, default: '' },
  activeWallpaperBgmUrl: { type: String, default: '' },
  activeWallpaperBgvUrl: { type: String, default: '' },
  isHomeRoute: { type: Boolean, default: false },
  effect: {
    type: Object,
    default: () => ({})
  },
  reducedMotion: { type: Boolean, default: false },
  setWallpaperBgmRef: { type: Function, default: null },
  setWallpaperBgvRef: { type: Function, default: null }
});

defineEmits(['video-error', 'l2d-error']);
</script>

<style scoped>
.bg-layer {
  position: fixed;
  inset: 0;
  z-index: 0;
  pointer-events: none;
  overflow: hidden;
}

.bg-image,
.bg-video {
  position: absolute;
  inset: 0;
  width: 100%;
  height: 100%;
  object-fit: cover;
  object-position: center;
  filter: brightness(0.64) saturate(118%);
  transition: filter 420ms cubic-bezier(0.22, 1, 0.36, 1);
}

.bg-layer.home .bg-image,
.bg-layer.home .bg-video {
  filter: brightness(0.98) saturate(108%);
}

.bg-video {
  z-index: 1;
}

.bg-fx {
  position: absolute;
  inset: 0;
  z-index: 2;
  background: linear-gradient(180deg, rgba(8, 11, 18, 0.34), rgba(8, 11, 18, 0.52));
  backdrop-filter: blur(7px) saturate(120%);
  -webkit-backdrop-filter: blur(7px) saturate(120%);
  opacity: 1;
  transition:
    opacity 360ms ease,
    backdrop-filter 360ms ease,
    -webkit-backdrop-filter 360ms ease;
}

.bg-fx.bg-fx-home {
  opacity: 0;
  backdrop-filter: blur(0px) saturate(100%);
  -webkit-backdrop-filter: blur(0px) saturate(100%);
}

.wallpaper-audio {
  position: absolute;
  width: 1px;
  height: 1px;
  opacity: 0;
  pointer-events: none;
}
</style>
