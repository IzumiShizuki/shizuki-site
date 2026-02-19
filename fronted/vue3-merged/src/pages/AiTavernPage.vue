<template>
  <section class="route-page ai-tavern-page">
    <header class="page-header">
      <p class="eyebrow">AI Tavern</p>
      <h1>AI酒馆</h1>
      <p>这是完整 AI 页面。该路由下不会再显示右侧 1/4 辅助面板。</p>
    </header>

    <section class="ai-main liquid-material">
      <div class="bubble-row left">
        <span class="dot"></span>
        <div class="bubble">欢迎来到 AI 酒馆，你可以在这里发起完整对话流程。</div>
      </div>
      <div class="bubble-row right">
        <div class="bubble short">后续可接入真实 AI API 与上下文记忆。</div>
        <span class="dot"></span>
      </div>
      <div class="bubble-row left">
        <span class="dot"></span>
        <div class="bubble">当前版本先交付结构与布局，保证移动端与桌面端都可适配。</div>
      </div>

      <footer class="composer">
        <div class="input">输入消息（占位）</div>
        <button class="send ripple-trigger" type="button">
          <i class="fas fa-paper-plane"></i>
        </button>
      </footer>
    </section>
  </section>
</template>

<style scoped>
.route-page {
  min-height: 100%;
  color: rgba(239, 244, 255, 0.96);
}

.page-header {
  padding: 8px 4px 14px;
}

.eyebrow {
  font-size: 12px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.95);
}

h1 {
  margin-top: 4px;
  font-size: clamp(28px, 4vw, 42px);
}

.page-header p {
  margin-top: 10px;
  max-width: 760px;
  color: rgba(223, 230, 249, 0.86);
}

.ai-main {
  --liquid-bg: rgba(20, 27, 42, 0.34);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.22);
  border-radius: 16px;
  padding: 14px;
  min-height: 420px;
  display: grid;
  gap: 12px;
}

.bubble-row {
  display: flex;
  align-items: flex-start;
  gap: 10px;
}

.bubble-row.right {
  justify-content: flex-end;
}

.dot {
  width: 10px;
  height: 10px;
  border-radius: 50%;
  background: rgba(var(--accent-rgb), 0.9);
  margin-top: 8px;
}

.bubble {
  max-width: min(82%, 680px);
  border-radius: 14px;
  padding: 10px 12px;
  background: rgba(255, 255, 255, 0.17);
  color: rgba(237, 242, 255, 0.94);
  line-height: 1.6;
}

.bubble.short {
  max-width: 62%;
}

.composer {
  margin-top: auto;
  display: flex;
  gap: 10px;
  align-items: center;
}

.input {
  flex: 1;
  min-height: 42px;
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.22);
  background: rgba(255, 255, 255, 0.16);
  display: flex;
  align-items: center;
  padding: 0 12px;
  color: rgba(223, 230, 249, 0.7);
}

.send {
  width: 38px;
  height: 38px;
  border: 0;
  border-radius: 50%;
  background: rgba(var(--accent-rgb), 0.3);
  color: rgba(247, 242, 255, 0.95);
}
</style>
