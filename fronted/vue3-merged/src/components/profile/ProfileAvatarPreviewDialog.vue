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
  background: var(--theme-scrim, rgba(24, 14, 12, 0.64));
  backdrop-filter: blur(5px);
}

.preview-panel {
  --liquid-bg: var(--theme-surface, linear-gradient(155deg, rgba(35, 20, 17, 0.74), rgba(18, 12, 10, 0.66)));
  --liquid-border: var(--theme-border, rgba(255, 224, 208, 0.24));
  --liquid-shadow: 0 26px 50px rgba(18, 9, 8, 0.42);
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
  background: rgba(20, 13, 12, 0.4);
}

.close-btn {
  justify-self: end;
  border: 0;
  border-radius: 10px;
  min-height: 34px;
  padding: 0 12px;
  background: var(--theme-surface-soft, rgba(247, 223, 210, 0.16));
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
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
