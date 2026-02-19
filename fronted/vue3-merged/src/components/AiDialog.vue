<template>
  <motion.aside
    class="ai-dialog-shell"
    :class="[`mode-${mode}`, { visible, hidden: !visible }]"
    :initial="false"
    :animate="shellMotion"
    :transition="shellTransition"
  >
    <button v-if="mode === 'sheet'" class="sheet-backdrop" type="button" aria-label="关闭AI面板" @click="emitClose"></button>

    <section class="ai-dialog liquid-material" @click.stop>
      <header class="ai-dialog-header">
        <button class="icon-btn ripple-trigger" type="button" title="设置">
          <i class="fas fa-gear"></i>
        </button>
        <div class="dialog-title">AI 对话</div>
        <button class="icon-btn close-btn ripple-trigger" type="button" title="收起" @click="emitClose">-</button>
      </header>

      <div class="chat-stream">
        <div class="chat-row left">
          <span class="chat-dot"></span>
          <div class="chat-bubble"></div>
        </div>
        <div class="chat-row right">
          <div class="chat-bubble"></div>
          <span class="chat-dot"></span>
        </div>
        <div class="chat-row left">
          <span class="chat-dot"></span>
          <div class="chat-bubble short"></div>
        </div>
      </div>

      <footer class="chat-input-wrap">
        <div class="chat-input"></div>
        <button class="send-btn ripple-trigger" type="button" title="发送">
          <i class="fas fa-paper-plane"></i>
        </button>
      </footer>
    </section>
  </motion.aside>
</template>

<script setup>
import { computed } from 'vue';
import { motion, useReducedMotion } from 'motion-v';

const props = defineProps({
  visible: {
    type: Boolean,
    default: false
  },
  mode: {
    type: String,
    default: 'sidebar',
    validator: (value) => value === 'sidebar' || value === 'sheet'
  }
});

const emit = defineEmits(['close']);
const prefersReducedMotion = useReducedMotion();

const shellMotion = computed(() => {
  if (prefersReducedMotion.value) {
    return { opacity: props.visible ? 1 : 0, x: 0, y: 0, scale: 1 };
  }

  if (props.mode === 'sheet') {
    return props.visible ? { opacity: 1, y: 0, scale: 1 } : { opacity: 0, y: 26, scale: 0.995 };
  }

  return props.visible ? { opacity: 1, x: 0, scale: 1 } : { opacity: 0, x: 22, scale: 0.992 };
});

const shellTransition = computed(() =>
  prefersReducedMotion.value
    ? { duration: 0.14, ease: 'linear' }
    : { duration: 0.26, ease: [0.22, 1, 0.36, 1] }
);

function emitClose() {
  emit('close');
}
</script>

<style scoped>
.ai-dialog-shell {
  position: relative;
  width: 100%;
  height: 100%;
  pointer-events: none;
  z-index: 1;
}

.ai-dialog-shell.visible {
  pointer-events: auto;
}

.ai-dialog-shell.hidden {
  pointer-events: none;
}

.ai-dialog-shell.mode-sidebar {
  display: block;
}

.ai-dialog-shell.mode-sheet {
  position: fixed;
  inset: 0;
  display: flex;
  align-items: flex-end;
  justify-content: stretch;
  z-index: 1750;
}

.sheet-backdrop {
  position: absolute;
  inset: 0;
  border: 0;
  background: rgba(8, 12, 18, 0.42);
  backdrop-filter: blur(5px) saturate(120%);
  -webkit-backdrop-filter: blur(5px) saturate(120%);
}

.ai-dialog {
  --liquid-bg: rgba(var(--glass-rgb), 0.28);
  --liquid-border: rgba(255, 255, 255, 0.34);
  --liquid-shadow: 0 10px 24px rgba(20, 24, 45, 0.07);
  position: relative;
  width: 100%;
  height: 100%;
  border-radius: 20px;
  padding: 10px 10px 12px;
  display: flex;
  flex-direction: column;
  gap: 10px;
  overflow: hidden;
  isolation: isolate;
  transform: translateZ(0);
  backdrop-filter: var(--glass-blur);
  -webkit-backdrop-filter: var(--glass-blur);
  will-change: transform, opacity;
  transition: background-color 0.28s ease, border-color 0.28s ease;
}

.mode-sheet .ai-dialog {
  border-radius: 22px 22px 0 0;
  max-height: min(86vh, 720px);
  height: min(86vh, 720px);
  box-shadow: 0 -12px 36px rgba(8, 10, 16, 0.42);
}

.ai-dialog-header {
  height: 32px;
  display: grid;
  grid-template-columns: 1fr auto 1fr;
  align-items: center;
}

.dialog-title {
  text-align: center;
  color: rgba(30, 34, 44, 0.72);
  font-size: 13px;
  font-weight: 600;
  letter-spacing: 0.5px;
}

.icon-btn {
  width: 24px;
  height: 24px;
  border: 0;
  border-radius: 8px;
  background: rgba(255, 255, 255, 0.25);
  color: rgba(25, 28, 35, 0.75);
  cursor: pointer;
  transition: background-color 0.2s ease, color 0.2s ease;
  justify-self: start;
}

.close-btn {
  justify-self: end;
  font-size: 18px;
  line-height: 1;
}

.icon-btn:hover {
  background: rgba(var(--accent-rgb), 0.22);
  color: rgb(var(--accent-strong-rgb));
}

.chat-stream {
  flex: 1;
  display: flex;
  flex-direction: column;
  gap: 14px;
  padding: 10px 6px;
}

.chat-row {
  display: flex;
  align-items: center;
  gap: 10px;
}

.chat-row.right {
  justify-content: flex-end;
}

.chat-dot {
  width: 14px;
  height: 14px;
  border-radius: 50%;
  background: rgba(var(--accent-rgb), 0.46);
}

.chat-bubble {
  width: 120px;
  height: 20px;
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.45);
}

.chat-row.right .chat-bubble {
  width: 98px;
  background: rgba(var(--accent-rgb), 0.38);
}

.chat-bubble.short {
  width: 96px;
}

.chat-input-wrap {
  height: 40px;
  display: flex;
  align-items: center;
  gap: 8px;
}

.chat-input {
  flex: 1;
  height: 100%;
  border-radius: 14px;
  background: rgba(255, 255, 255, 0.36);
  border: 1px solid rgba(255, 255, 255, 0.45);
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2);
}

.send-btn {
  width: 28px;
  height: 28px;
  border: 0;
  border-radius: 50%;
  background: rgba(var(--accent-rgb), 0.28);
  color: rgba(247, 241, 255, 0.95);
  cursor: pointer;
  transition: background-color 0.2s ease, color 0.2s ease;
}

.send-btn:hover {
  background: rgba(var(--accent-rgb), 0.38);
  color: rgb(var(--accent-strong-rgb));
}

@media (max-width: 900px) {
  .mode-sheet .ai-dialog {
    max-height: 100dvh;
    height: 100dvh;
    border-radius: 0;
  }
}
</style>
