<template>
  <div v-if="isOwner" v-show="!suspended && !inAiHub" class="site-companion">
    <section
      v-if="mounted"
      v-show="expanded"
      id="site-meguri-panel"
      class="companion-panel"
      role="region"
      aria-label="爱莉陪伴窗口"
    >
      <header class="companion-toolbar">
        <span>爱莉 · 随页陪伴</span>
        <nav aria-label="陪伴窗口操作">
          <button type="button" title="在 AI Hub 中打开" aria-label="在 AI Hub 中打开" @click="openWorkspace">
            <i class="fas fa-up-right-and-down-left-from-center" aria-hidden="true"></i>
          </button>
          <button type="button" title="最小化，保留当前对话" aria-label="最小化陪伴窗口" @click="minimize">
            <i class="fas fa-minus" aria-hidden="true"></i>
          </button>
          <button type="button" title="关闭陪伴窗口" aria-label="关闭陪伴窗口" @click="close">
            <i class="fas fa-xmark" aria-hidden="true"></i>
          </button>
        </nav>
      </header>
      <MeguriPage :key="ownerId" embedded variant="side" @sprite-change="spriteUrl = $event" />
    </section>

    <button
      v-show="!expanded"
      ref="launcher"
      class="companion-launcher"
      :class="{ 'with-character': spriteUrl }"
      type="button"
      aria-label="打开爱莉陪伴窗口"
      aria-controls="site-meguri-panel"
      :aria-expanded="expanded"
      @click="open"
    >
      <img v-if="spriteUrl" :src="spriteUrl" alt="" draggable="false" />
      <span v-else class="companion-mark" aria-hidden="true">巡</span>
      <span>{{ mounted ? '继续和爱莉聊' : '爱莉陪伴' }}</span>
    </button>
  </div>
</template>

<script setup>
import { computed, defineAsyncComponent, nextTick, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { useAuthSession } from '../../composables/useAuthSession';
import { MEGURI_COMPANION_OPEN_EVENT } from '../../utils/meguriCompanionBus';

const MeguriPage = defineAsyncComponent(() => import('../../pages/MeguriPage.vue'));
defineProps({ suspended: { type: Boolean, default: false } });
const auth = useAuthSession();
const route = useRoute();
const router = useRouter();
const mounted = ref(false);
const expanded = ref(false);
const spriteUrl = ref('');
const launcher = ref(null);
const ownerId = computed(() => auth.user.value?.userId || auth.user.value?.id || '');
const isOwner = computed(() => auth.isAuthenticated.value && (auth.user.value?.groups || []).some(
  (group) => String(group).trim().toUpperCase() === 'ADMIN'
));
const inAiHub = computed(() => route.name === 'ai-hub' || route.path === '/ai-hub');

function open() {
  if (!isOwner.value || inAiHub.value) return;
  mounted.value = true;
  expanded.value = true;
}

async function minimize() {
  expanded.value = false;
  await nextTick();
  launcher.value?.focus();
}

function reset() {
  expanded.value = false;
  mounted.value = false;
  spriteUrl.value = '';
}

async function close() {
  reset();
  await nextTick();
  launcher.value?.focus();
}

function openWorkspace() {
  router.push({ name: 'ai-hub', query: { mode: 'meguri' } });
}

watch([isOwner, ownerId, inAiHub], ([owner, id, hub], previous) => {
  if (!owner || hub || (previous && id !== previous[1])) reset();
});

onMounted(() => window.addEventListener(MEGURI_COMPANION_OPEN_EVENT, open));
onBeforeUnmount(() => window.removeEventListener(MEGURI_COMPANION_OPEN_EVENT, open));
</script>

<style scoped>
.site-companion {
  position: fixed;
  right: max(18px, env(safe-area-inset-right));
  bottom: max(96px, calc(env(safe-area-inset-bottom) + 76px));
  z-index: 2250;
  color: var(--theme-text-primary);
}

.companion-panel {
  width: min(390px, calc(100vw - 36px));
  height: min(650px, calc(100dvh - 124px));
  display: grid;
  grid-template-rows: auto minmax(0, 1fr);
  overflow: hidden;
  border-radius: 16px;
  background: var(--theme-panel-surface-elevated);
  box-shadow: 0 16px 48px rgb(0 0 0 / 24%);
}

.companion-toolbar {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 6px 8px 6px 16px;
  gap: 12px;
  font-size: 13px;
  background: var(--theme-input-surface);
}

.companion-toolbar nav { display: flex; }
.companion-toolbar button {
  width: 36px;
  height: 36px;
  color: inherit;
  background: transparent;
  border: 0;
  border-radius: 8px;
  cursor: pointer;
}

.companion-toolbar button:hover { background: var(--theme-surface-soft); }
.companion-launcher {
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 6px;
  padding: 8px 12px;
  border: 0;
  border-radius: 12px;
  background: var(--theme-reader-surface);
  color: inherit;
  font: inherit;
  font-size: 12px;
  box-shadow: 0 6px 24px rgb(0 0 0 / 16%);
  cursor: pointer;
}

.companion-launcher:hover { background: var(--theme-surface-soft); }
.companion-launcher.with-character { background: transparent; box-shadow: none; padding: 0; }
.companion-launcher.with-character > span {
  padding: 6px 10px;
  border-radius: 10px;
  background: var(--theme-panel-surface-elevated);
}
.companion-launcher img { width: 100px; height: 148px; object-fit: contain; }
.companion-mark { font-size: 24px; color: rgb(var(--accent-rgb)); }
.site-companion button:focus-visible { outline: 2px solid rgb(var(--accent-rgb)); outline-offset: 3px; }

.companion-panel :deep(.meguri-page.embedded .meguri-web-shell) { height: 100%; min-height: 0; border-radius: 0; }
.companion-panel :deep(.meguri-page) { min-height: 0; }
.companion-panel :deep(.meguri-brand-strip) { top: 12px; left: 12px; gap: 8px; }
.companion-panel :deep(.brand-kicker) { display: none; }
.companion-panel :deep(.meguri-mark) { width: 32px; height: 32px; font-size: 16px; }
.companion-panel :deep(.controls-island) { top: 12px; right: 12px; }
.companion-panel :deep(.presentation-badge) { display: none; }
.companion-panel :deep(.chat-dock) { left: 10px; right: 10px; bottom: 10px; width: auto; }
.companion-panel :deep(.chat-history) { max-height: 150px; }
.companion-panel :deep(.chat-title strong) { font-size: 13px; }
.companion-panel :deep(.chat-title small) { font-size: 11px; }
.companion-panel :deep(.message-role) { font-size: 11px; }
.companion-panel :deep(.message p) { font-size: 13px; }
.companion-panel :deep(.empty-conversation p) { font-size: 12px; color: #746051; }
.companion-panel :deep(.chat-dock.expanded .chat-history) { max-height: min(250px, 36dvh); }
.companion-panel :deep(.meguri-web-shell.chat-visible .character-stage) { inset: 48px 0 198px; }
.companion-panel :deep(.meguri-placeholder) { padding: 20px; }

@media (max-width: 600px) {
  .site-companion { right: 12px; }
  .companion-panel { width: calc(100vw - 24px); }
}
@media (max-height: 620px) {
  .companion-panel :deep(.chat-history) { max-height: 80px; }
  .companion-panel :deep(.meguri-brand-strip > div) { display: none; }
}
</style>
