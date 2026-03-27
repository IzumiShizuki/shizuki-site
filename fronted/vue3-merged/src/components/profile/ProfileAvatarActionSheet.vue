<template>
  <transition name="sheet-fade">
    <div v-if="visible" class="sheet-overlay" role="dialog" aria-modal="true" @click.self="$emit('close')">
      <div class="sheet-panel liquid-material">
        <p class="sheet-title">头像操作</p>
        <p class="sheet-desc">选择你要执行的动作</p>
        <div class="sheet-actions">
          <button class="sheet-btn primary ripple-trigger" type="button" @click="$emit('view')">查看头像</button>
          <button class="sheet-btn ripple-trigger" type="button" @click="$emit('edit')">修改头像</button>
          <button class="sheet-btn ghost ripple-trigger" type="button" @click="$emit('close')">取消</button>
        </div>
      </div>
    </div>
  </transition>
</template>

<script setup>
defineProps({
  visible: {
    type: Boolean,
    default: false
  }
});

defineEmits(['close', 'view', 'edit']);
</script>

<style scoped>
.sheet-overlay {
  position: fixed;
  inset: 0;
  z-index: 920;
  display: grid;
  place-items: center;
  background: var(--theme-scrim, rgba(24, 14, 12, 0.64));
  backdrop-filter: blur(4px);
}

.sheet-panel {
  --liquid-bg: var(--theme-surface, linear-gradient(155deg, rgba(35, 20, 17, 0.74), rgba(18, 12, 10, 0.66)));
  --liquid-border: var(--theme-border, rgba(255, 224, 208, 0.24));
  --liquid-shadow: 0 26px 44px rgba(18, 9, 8, 0.36);
  width: min(92vw, 340px);
  border-radius: 16px;
  padding: 16px;
  display: grid;
  gap: 10px;
}

.sheet-title {
  font-size: 16px;
  font-weight: 650;
}

.sheet-desc {
  color: var(--theme-text-secondary, rgba(231, 211, 196, 0.88));
  font-size: 12px;
}

.sheet-actions {
  display: grid;
  gap: 8px;
}

.sheet-btn {
  border: 0;
  border-radius: 10px;
  min-height: 38px;
  padding: 0 12px;
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
  background: var(--theme-surface-soft, rgba(247, 223, 210, 0.16));
}

.sheet-btn.primary {
  background: rgba(var(--accent-rgb), 0.34);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.44);
}

.sheet-btn.ghost {
  background: rgba(247, 223, 210, 0.1);
}

.sheet-fade-enter-active,
.sheet-fade-leave-active {
  transition: opacity 0.22s ease;
}

.sheet-fade-enter-active .sheet-panel,
.sheet-fade-leave-active .sheet-panel {
  transition: transform 0.22s ease, opacity 0.22s ease;
}

.sheet-fade-enter-from,
.sheet-fade-leave-to {
  opacity: 0;
}

.sheet-fade-enter-from .sheet-panel,
.sheet-fade-leave-to .sheet-panel {
  opacity: 0;
  transform: translateY(12px) scale(0.98);
}
</style>
