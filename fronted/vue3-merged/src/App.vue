<template>
  <div class="app-shell">
    <div class="bg-layer" :style="bgStyle"></div>
    <TopMenu
      :menu-expanded="menuExpanded"
      :ai-chat-active="aiChatActive"
      @toggle-menu="toggleMenu"
      @toggle-ai-chat="toggleAiChat"
      @select-main-route="handleMainRouteSelect"
      @author-info-click="handleAuthorInfoClick"
    />
    <AiDialog :visible="aiChatActive" :menu-expanded="menuExpanded" @close="closeAiChat" />
    <LevitationBall ref="levitationRef" />
    <div class="click-ripple-layer" aria-hidden="true">
      <span
        v-for="ripple in clickRipples"
        :key="ripple.id"
        class="click-ripple"
        :style="{
          left: `${ripple.x}px`,
          top: `${ripple.y}px`,
          width: `${ripple.size}px`,
          height: `${ripple.size}px`,
          borderColor: ripple.borderColor,
          backgroundImage: ripple.backgroundImage,
          boxShadow: ripple.boxShadow
        }"
      ></span>
    </div>
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
const currentMainRoute = ref('home');
const clickRipples = ref([]);
let rippleSeq = 0;
const ripplePalette = [
  {
    borderColor: 'rgba(186, 170, 255, 0.24)',
    boxShadow: '0 0 0 1px rgba(186, 170, 255, 0.2)',
    backgroundImage: 'radial-gradient(circle, rgba(186, 170, 255, 0.24) 0%, rgba(186, 170, 255, 0.12) 38%, rgba(186, 170, 255, 0) 74%)'
  },
  {
    borderColor: 'rgba(220, 190, 255, 0.22)',
    boxShadow: '0 0 0 1px rgba(220, 190, 255, 0.18)',
    backgroundImage: 'radial-gradient(circle, rgba(220, 190, 255, 0.22) 0%, rgba(220, 190, 255, 0.12) 38%, rgba(220, 190, 255, 0) 74%)'
  },
  {
    borderColor: 'rgba(176, 210, 255, 0.22)',
    boxShadow: '0 0 0 1px rgba(176, 210, 255, 0.18)',
    backgroundImage: 'radial-gradient(circle, rgba(176, 210, 255, 0.22) 0%, rgba(176, 210, 255, 0.12) 38%, rgba(176, 210, 255, 0) 74%)'
  }
];

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

function handleMainRouteSelect(routeKey) {
  currentMainRoute.value = routeKey;
}

function handleAuthorInfoClick() {
  console.log('Author info clicked');
}

function onGlobalPointerDown(e) {
  if (e.button !== 0) return;
  const target = e.target;
  if (!(target instanceof Element)) return;

  const trigger = target.closest('.ripple-trigger');
  if (!trigger) return;

  const rect = trigger.getBoundingClientRect();
  const baseSize = Math.max(rect.width, rect.height);
  const size = Math.max(72, Math.min(148, baseSize * 1.6));
  const x = rect.left + rect.width * 0.5 - size * 0.5;
  const y = rect.top + rect.height * 0.5 - size * 0.5;
  const colorDef = ripplePalette[Math.floor(Math.random() * ripplePalette.length)];
  const id = rippleSeq++;
  clickRipples.value.push({
    id,
    size,
    x,
    y,
    borderColor: colorDef.borderColor,
    boxShadow: colorDef.boxShadow,
    backgroundImage: colorDef.backgroundImage
  });

  window.setTimeout(() => {
    clickRipples.value = clickRipples.value.filter((ripple) => ripple.id !== id);
  }, 580);
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
  window.addEventListener('pointerdown', onGlobalPointerDown, true);
});

onBeforeUnmount(() => {
  window.removeEventListener('keydown', onGlobalHotkey);
  window.removeEventListener('pointerdown', onGlobalPointerDown, true);
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

.click-ripple-layer {
  position: fixed;
  inset: 0;
  z-index: 2200;
  pointer-events: none;
  overflow: hidden;
}

.click-ripple {
  position: absolute;
  border-radius: 50%;
  border: 1.2px solid transparent;
  background: radial-gradient(circle, rgba(186, 170, 255, 0.24) 0%, rgba(186, 170, 255, 0.12) 38%, rgba(186, 170, 255, 0) 74%);
  transform: scale(0.2);
  opacity: 0.7;
  animation: click-ripple 580ms cubic-bezier(0.22, 1, 0.36, 1) forwards;
}

@keyframes click-ripple {
  0% {
    transform: scale(0.2);
    opacity: 0.75;
  }
  100% {
    transform: scale(1.85);
    opacity: 0;
  }
}
</style>
