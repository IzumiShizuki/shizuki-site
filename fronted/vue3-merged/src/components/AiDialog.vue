<template>
  <aside
    class="ai-dialog-shell"
    :class="{
      visible,
      hidden: !visible,
      expanded: menuExpanded,
      collapsed: !menuExpanded
    }"
  >
    <section class="ai-dialog liquid-material">
      <header class="ai-dialog-header">
        <button class="icon-btn ripple-trigger" type="button" title="设置">
          <i class="fas fa-gear"></i>
        </button>
        <div class="dialog-title">AI 对话</div>
        <button class="icon-btn close-btn ripple-trigger" type="button" title="退出" @click="emit('close')">-</button>
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
  </aside>
</template>

<script setup>
defineProps({
  visible: {
    type: Boolean,
    default: false
  },
  menuExpanded: {
    type: Boolean,
    default: false
  }
});

const emit = defineEmits(['close']);
</script>

<style scoped>
.ai-dialog-shell {
  --panel-width: 260px;
  --dialog-top-expanded: 138px;
  --dialog-top-collapsed: 34px;
  --dialog-bottom-gap: 10px;
  position: fixed;
  right: 18px;
  top: var(--dialog-top-collapsed);
  bottom: var(--dialog-bottom-gap);
  width: var(--panel-width);
  z-index: 900;
  pointer-events: none;
  opacity: 0;
  transform: translateY(6px) scale(0.985);
  transition:
    top 0.6s cubic-bezier(0.22, 1, 0.36, 1),
    opacity 0.28s ease,
    transform 0.28s ease;
}

.ai-dialog-shell.expanded {
  top: var(--dialog-top-expanded);
}

.ai-dialog-shell.collapsed {
  top: var(--dialog-top-collapsed);
}

.ai-dialog-shell.visible {
  opacity: 1;
  transform: translateY(0) scale(1);
  pointer-events: auto;
}

.ai-dialog-shell.hidden {
  pointer-events: none;
}

.ai-dialog {
  --liquid-bg: rgba(var(--glass-rgb), 0.28);
  --liquid-border: rgba(255, 255, 255, 0.34);
  --liquid-shadow: 0 10px 24px rgba(20, 24, 45, 0.07);
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
  background: rgba(184, 160, 236, 0.22);
  color: #b79cff;
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
  background: rgba(255, 255, 255, 0.45);
}

.chat-bubble {
  width: 120px;
  height: 20px;
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.45);
}

.chat-row.right .chat-bubble {
  width: 98px;
  background: rgba(192, 171, 235, 0.45);
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
  background: rgba(255, 255, 255, 0.38);
  color: rgba(75, 76, 84, 0.85);
  cursor: pointer;
  transition: background-color 0.2s ease, color 0.2s ease;
}

.send-btn:hover {
  background: rgba(184, 160, 236, 0.26);
  color: #b79cff;
}
</style>
