<template>
  <div v-show="!suspended && (!isAnime || !inAiHub)" class="site-companion">
    <section v-if="!isAnime && normalExpanded" id="site-cat-panel" class="ordinary-companion-panel" role="region" aria-label="小猫陪伴窗口">
      <header>
        <strong>小猫陪伴</strong>
        <button type="button" aria-label="收起小猫陪伴" @click="minimizeNormal">×</button>
      </header>
      <p>慢慢来，我陪你待一会儿。</p>
      <nav aria-label="小猫快捷操作">
        <button type="button" @click="openFocus"><i class="fas fa-bullseye" aria-hidden="true"></i> 开始专注</button>
        <button type="button" @click="router.push('/music-library/music')"><i class="fas fa-music" aria-hidden="true"></i> 听点音乐</button>
      </nav>
    </section>
    <section
      v-if="isAnime && mounted"
      v-show="expanded"
      id="site-meguri-panel"
      class="companion-panel"
      role="region"
      aria-label="爱莉陪伴窗口"
    >
      <header class="companion-toolbar">
        <span>爱莉 · 随页陪伴</span>
        <nav aria-label="陪伴窗口操作">
          <button type="button" title="返回普通模式" aria-label="返回普通模式" @click="returnToNormal">
            <i class="fas fa-cat" aria-hidden="true"></i>
          </button>
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
      v-show="!isAnime || !expanded"
      ref="launcher"
      class="companion-launcher"
      :class="{ 'with-character': isAnime && spriteUrl, 'ordinary-launcher': !isAnime }"
      type="button"
      :aria-label="isAnime ? '打开爱莉陪伴窗口' : '打开小猫陪伴窗口'"
      :aria-controls="isAnime ? 'site-meguri-panel' : 'site-cat-panel'"
      :aria-expanded="isAnime ? expanded : normalExpanded"
      @click="activateLauncher"
    >
      <svg v-if="!isAnime" class="companion-cat" viewBox="0 0 64 64" aria-hidden="true">
        <path class="cat-body" d="M13 29 12 9 26 18 Q32 15 38 18 L52 9 51 29 Q57 55 32 57 Q7 55 13 29Z" />
        <path class="cat-ears" d="m16 15 7 6-7 4Zm32 0-7 6 7 4Z" />
        <path class="cat-face" d="M23 32v3m18-3v3m-12 6 3 2 3-2m-3 2v3m-15-7-7-1m7 6-7 1m37-6 7-1m-7 6 7 1" />
      </svg>
      <img v-else-if="spriteUrl" :src="spriteUrl" alt="" draggable="false" />
      <span v-else class="companion-mark" aria-hidden="true">巡</span>
      <span>{{ isAnime ? (mounted ? '继续和爱莉聊' : '爱莉陪伴') : '小猫陪伴' }}</span>
    </button>
  </div>
</template>

<script setup>
import { computed, defineAsyncComponent, nextTick, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { useAuthSession } from '../../composables/useAuthSession';
import { useCompanionMode } from '../../composables/useCompanionMode';
import { useFocusSession } from '../../utils/focusSessionState';
import { MEGURI_COMPANION_OPEN_EVENT } from '../../utils/meguriCompanionBus';

const MeguriPage = defineAsyncComponent(() => import('../../pages/MeguriPage.vue'));
defineProps({ suspended: { type: Boolean, default: false } });
const auth = useAuthSession();
const { isAnime, registerActivation, returnToNormal } = useCompanionMode(auth);
const focus = useFocusSession();
const route = useRoute();
const router = useRouter();
const mounted = ref(false);
const expanded = ref(false);
const normalExpanded = ref(false);
const spriteUrl = ref('');
const launcher = ref(null);
const ownerId = computed(() => auth.user.value?.userId || auth.user.value?.id || '');
const inAiHub = computed(() => route.name === 'ai-hub' || route.path === '/ai-hub');

function open() {
  if (!isAnime.value) {
    normalExpanded.value = true;
    return;
  }
  if (inAiHub.value) return;
  mounted.value = true;
  expanded.value = true;
}

function activateLauncher() {
  if (!isAnime.value && registerActivation()) normalExpanded.value = false;
  open();
}

async function minimizeNormal() {
  normalExpanded.value = false;
  await nextTick();
  launcher.value?.focus();
}

function openFocus() {
  focus.startFocusSession({ presetId: 'desk' });
  minimizeNormal();
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

watch([isAnime, ownerId, inAiHub], ([anime, id, hub], previous) => {
  if (!anime || hub || (previous && id !== previous[1])) reset();
  if (previous && id !== previous[1]) normalExpanded.value = false;
});

onMounted(() => window.addEventListener(MEGURI_COMPANION_OPEN_EVENT, open));
onBeforeUnmount(() => window.removeEventListener(MEGURI_COMPANION_OPEN_EVENT, open));
</script>

<style scoped>
.ordinary-companion-panel {
  width: min(280px, calc(100vw - 36px));
  margin-bottom: 12px;
  padding: 16px;
  border-radius: 16px;
  background: var(--theme-panel-surface-elevated);
  box-shadow: var(--theme-shadow-soft);
}
.ordinary-companion-panel header { display: flex; align-items: center; justify-content: space-between; }
.ordinary-companion-panel p { margin: 12px 0 16px; line-height: 1.6; }
.ordinary-companion-panel button {
  padding: 10px 12px;
  border: 0;
  border-radius: 8px;
  color: inherit;
  background: var(--theme-input-surface);
  cursor: pointer;
}
.ordinary-companion-panel nav { display: flex; flex-wrap: wrap; gap: 8px; }
.ordinary-companion-panel button:hover { background: var(--theme-surface-soft); }
.companion-cat { width: 48px; height: 48px; overflow: visible; }
.cat-body { fill: var(--theme-panel-surface-elevated); stroke: currentColor; stroke-width: 2; }
.cat-ears { fill: var(--theme-accent); opacity: 0.6; }
.cat-face { fill: none; stroke: currentColor; stroke-width: 2; stroke-linecap: round; stroke-linejoin: round; }
.ordinary-launcher:hover .companion-cat { transform: translateY(-3px) rotate(-4deg); }
.companion-cat { transition: transform 180ms ease-out; }
@media (prefers-reduced-motion: reduce) { .companion-cat { transition: none; } }
.ordinary-companion-panel button:focus-visible, .companion-launcher:focus-visible { outline: 2px solid var(--theme-accent); outline-offset: 3px; }
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
