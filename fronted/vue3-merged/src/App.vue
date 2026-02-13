<template>
  <div class="app-shell">
    <div class="bg-layer" :style="bgStyle"></div>
    <TopMenu
      :menu-expanded="menuExpanded"
      :ai-chat-active="aiChatActive"
      @toggle-menu="toggleMenu"
      @toggle-ai-chat="toggleAiChat"
    />
    <AiDialog :visible="aiChatActive" :menu-expanded="menuExpanded" @close="closeAiChat" />
    <LevitationBall ref="levitationRef" />
  </div>
</template>

<script setup>
import { onBeforeUnmount, onMounted, ref } from 'vue';
import AiDialog from './components/AiDialog.vue';
import TopMenu from './components/TopMenu.vue';
import LevitationBall from './components/LevitationBall.vue';

const menuExpanded = ref(false);
const aiChatActive = ref(false);
const levitationRef = ref(null);

const originalAbsoluteBgUrl = 'file:///D:/G/Katanegai/Extracted_Final/Images_CG_p/35d3d9bfcb4340b3c9d8d80fb7d4cd90.png';
const localAbsoluteBgUrl = 'file:///D:/xuexi/10.program/shizuki-site/shizuki-site/fronted/vue3-merged/public/images/original-bg.png';
const bgUrl = `${import.meta.env.BASE_URL}images/original-bg.png`;
const bgStyle = {
  backgroundImage: `url('${originalAbsoluteBgUrl}'), url('${localAbsoluteBgUrl}'), url('${bgUrl}')`
};

function toggleMenu() {
  menuExpanded.value = !menuExpanded.value;
}

function toggleAiChat() {
  aiChatActive.value = !aiChatActive.value;
}

function closeAiChat() {
  aiChatActive.value = false;
}

function onGlobalHotkey(e) {
  if (!e.ctrlKey || !e.shiftKey || e.altKey || e.metaKey) return;

  const target = e.target;
  if (target instanceof HTMLElement) {
    const tag = target.tagName;
    if (tag === 'INPUT' || tag === 'TEXTAREA' || target.isContentEditable) return;
  }

  if (e.code === 'Backquote') {
    e.preventDefault();
    levitationRef.value?.toggleExpanded?.();
    return;
  }

  if (e.code === 'Minus') {
    e.preventDefault();
    toggleAiChat();
    return;
  }

  if (e.code === 'Equal') {
    e.preventDefault();
    toggleMenu();
  }
}

onMounted(() => {
  window.addEventListener('keydown', onGlobalHotkey);
});

onBeforeUnmount(() => {
  window.removeEventListener('keydown', onGlobalHotkey);
});
</script>

<style scoped>
.app-shell {
  position: relative;
  width: 100%;
  height: 100%;
  overflow: hidden;
  isolation: isolate;
  background: linear-gradient(120deg, #d3dceb, #e6dff0, #dccedf);
}

.bg-layer {
  position: fixed;
  inset: 0;
  z-index: 0;
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;
  pointer-events: none;
}
</style>
