<template>
  <transition name="preview-fade">
    <div v-if="visible" class="preview-overlay" role="dialog" aria-modal="true" @click.self="$emit('close')">
      <div class="preview-panel liquid-material">
        <img class="preview-image" :src="avatarUrl" alt="avatar-preview" />
        <button class="close-btn ripple-trigger" type="button" @click="$emit('close')">关闭</button>
      </div>
    </div>
  </transition>
</template>

<script setup>
defineProps({
  visible: {
    type: Boolean,
    default: false
  },
  avatarUrl: {
    type: String,
    required: true
  }
});

defineEmits(['close']);
</script>

<style scoped>
.preview-overlay {
  position: fixed;
  inset: 0;
  z-index: 930;
  display: grid;
  place-items: center;
  background: rgba(3, 8, 14, 0.66);
  backdrop-filter: blur(5px);
}

.preview-panel {
  --liquid-bg: rgba(16, 24, 36, 0.68);
  --liquid-border: rgba(225, 234, 247, 0.26);
  --liquid-shadow: 0 26px 50px rgba(4, 7, 12, 0.42);
  width: min(94vw, 520px);
  border-radius: 18px;
  padding: 16px;
  display: grid;
  gap: 10px;
}

.preview-image {
  width: 100%;
  border-radius: 14px;
  aspect-ratio: 1 / 1;
  object-fit: cover;
  background: rgba(9, 14, 21, 0.5);
}

.close-btn {
  justify-self: end;
  border: 0;
  border-radius: 10px;
  min-height: 34px;
  padding: 0 12px;
  background: rgba(255, 255, 255, 0.16);
  color: rgba(240, 246, 255, 0.94);
}

.preview-fade-enter-active,
.preview-fade-leave-active {
  transition: opacity 0.22s ease;
}

.preview-fade-enter-active .preview-panel,
.preview-fade-leave-active .preview-panel {
  transition: transform 0.22s ease, opacity 0.22s ease;
}

.preview-fade-enter-from,
.preview-fade-leave-to {
  opacity: 0;
}

.preview-fade-enter-from .preview-panel,
.preview-fade-leave-to .preview-panel {
  opacity: 0;
  transform: translateY(8px) scale(0.985);
}
</style>
