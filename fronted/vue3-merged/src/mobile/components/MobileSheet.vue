<template>
  <Teleport to="body">
    <transition name="m-sheet">
      <div v-if="visible" class="m-sheet-layer" @click.self="$emit('close')">
        <section class="m-sheet" :style="{ maxHeight: maxHeight }" role="dialog" aria-modal="true">
          <header class="m-sheet-head">
            <span class="m-sheet-grip" aria-hidden="true"></span>
            <h3 v-if="title" class="m-sheet-title">{{ title }}</h3>
          </header>
          <div class="m-sheet-body">
            <slot />
          </div>
        </section>
      </div>
    </transition>
  </Teleport>
</template>

<script setup>
defineProps({
  visible: {
    type: Boolean,
    default: false
  },
  title: {
    type: String,
    default: ''
  },
  maxHeight: {
    type: String,
    default: '72dvh'
  }
});

defineEmits(['close']);
</script>

<style scoped>
.m-sheet-layer {
  position: fixed;
  inset: 0;
  z-index: 120;
  background: rgba(8, 11, 20, 0.55);
  backdrop-filter: blur(4px);
  -webkit-backdrop-filter: blur(4px);
  display: flex;
  align-items: flex-end;
  justify-content: center;
}

.m-sheet {
  width: min(100%, 560px);
  background: var(--m-surface-strong);
  border: 1px solid var(--m-border);
  border-bottom: none;
  border-radius: 24px 24px 0 0;
  backdrop-filter: var(--m-blur);
  -webkit-backdrop-filter: var(--m-blur);
  box-shadow: var(--m-shadow);
  display: flex;
  flex-direction: column;
  padding-bottom: calc(var(--m-safe-bottom) + 12px);
  color: var(--m-text);
}

.m-sheet-head {
  flex-shrink: 0;
  display: grid;
  justify-items: center;
  gap: 8px;
  padding: 10px 20px 6px;
}

.m-sheet-grip {
  width: 40px;
  height: 4px;
  border-radius: 999px;
  background: var(--m-border-strong);
}

.m-sheet-title {
  margin: 0;
  font-size: 15px;
  font-weight: 700;
}

.m-sheet-body {
  min-height: 0;
  overflow-y: auto;
  -webkit-overflow-scrolling: touch;
  padding: 6px 16px 10px;
  scrollbar-width: none;
}

.m-sheet-body::-webkit-scrollbar {
  display: none;
}

.m-sheet-enter-active,
.m-sheet-leave-active {
  transition: opacity 220ms ease;
}

.m-sheet-enter-active .m-sheet,
.m-sheet-leave-active .m-sheet {
  transition: transform 260ms cubic-bezier(0.32, 0.72, 0.24, 1);
}

.m-sheet-enter-from,
.m-sheet-leave-to {
  opacity: 0;
}

.m-sheet-enter-from .m-sheet,
.m-sheet-leave-to .m-sheet {
  transform: translateY(100%);
}
</style>
