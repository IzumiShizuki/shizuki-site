<template>
  <section class="route-page meguri-page" :class="{ embedded, side: variant === 'side' }">
    <main
      class="meguri-web-shell"
      :class="{
        'chat-visible': chatVisible && pageReady && bootstrap.enabled,
        'chat-expanded': historyOpen,
        'controls-expanded': controlsOpen,
        'reduced-motion': reducedMotion
      }"
      :data-stage-status="stageStatus"
      aria-label="爱莉 Web companion"
      @contextmenu.prevent="controlsOpen = true"
    >
      <div class="stage-atmosphere" aria-hidden="true">
        <span class="ambient-orbit orbit-one"></span>
        <span class="ambient-orbit orbit-two"></span>
        <span class="ambient-light"></span>
        <span class="stage-grid"></span>
      </div>

      <header class="meguri-brand-strip">
        <span class="meguri-mark" aria-hidden="true">巡</span>
        <div>
          <span class="brand-kicker">MEGURI · WEB COMPANION</span>
          <strong>爱莉</strong>
        </div>
        <span class="stage-status" :class="statusTone" role="status">
          <i aria-hidden="true"></i>
          {{ statusText }}
        </span>
      </header>

      <section class="character-stage" :class="{ speaking: sending }" aria-label="爱莉角色舞台">
        <img
          v-if="spriteBaseUrl"
          class="character-sprite base"
          :class="motionClass"
          :src="spriteBaseUrl"
          alt="爱莉"
          draggable="false"
        />
        <img
          v-if="spriteOverlayUrl"
          class="character-sprite overlay"
          :class="[{ visible: spriteOverlayVisible }, motionClass]"
          :src="spriteOverlayUrl"
          alt=""
          aria-hidden="true"
          draggable="false"
        />
        <div v-if="!spriteBaseUrl && pageReady && bootstrap.enabled" class="stage-empty">
          <span class="empty-mark">巡</span>
          <strong>{{ spriteHint || '立绘尚未就绪' }}</strong>
        </div>
        <span class="character-shadow" aria-hidden="true"></span>
      </section>

      <div v-if="pageReady && bootstrap.enabled" class="presentation-badge" aria-live="polite">
        <span>{{ presentation.expressionTag }}</span>
        <small>{{ presentation.expressionIntensity }} · outfit {{ presentation.outfitCode }}</small>
      </div>

      <aside
        v-if="pageReady && bootstrap.enabled"
        class="controls-island"
        :class="{ expanded: controlsOpen }"
        aria-label="爱莉网页控制"
        @mouseenter="cancelControlsCollapse"
        @mouseleave="scheduleControlsCollapse"
      >
        <div class="controls-rail">
          <button
            class="control-button"
            type="button"
            :class="{ active: chatVisible }"
            :aria-pressed="chatVisible"
            :title="chatVisible ? '隐藏聊天' : '显示聊天'"
            @click="toggleChat"
          >
            <i class="fas fa-message" aria-hidden="true"></i>
          </button>
          <button
            class="control-button"
            type="button"
            :aria-expanded="controlsOpen"
            :title="controlsOpen ? '收起控制' : '展开控制'"
            @click="controlsOpen = !controlsOpen"
          >
            <i class="fas fa-chevron-down" :class="{ rotated: controlsOpen }" aria-hidden="true"></i>
          </button>
        </div>

        <Transition name="controls-drawer">
          <div v-if="controlsOpen" class="controls-drawer">
            <div class="controls-status" :class="statusTone">
              <span aria-hidden="true"></span>
              <div>
                <strong>{{ statusText }}</strong>
                <small v-if="bootstrap.buildId">build · {{ bootstrap.buildId }}</small>
                <small v-else>owner-only gateway</small>
              </div>
            </div>

            <section class="outfit-picker" aria-label="立绘换装">
              <header>
                <strong>立绘换装</strong>
                <small>保留当前表情</small>
              </header>
              <div>
                <button
                  v-for="code in outfitCodes"
                  :key="code"
                  type="button"
                  :class="{ active: presentation.outfitCode === code }"
                  :aria-pressed="presentation.outfitCode === code"
                  :disabled="presentationBusy"
                  @click="selectOutfit(code)"
                >
                  {{ code }}
                </button>
              </div>
            </section>

            <div class="control-grid">
              <button type="button" @click="toggleChat">
                <i class="fas fa-message" aria-hidden="true"></i><small>{{ chatVisible ? '隐藏聊天' : '显示聊天' }}</small>
              </button>
              <button type="button" :disabled="!chatVisible" @click="toggleHistory">
                <i class="fas fa-clock-rotate-left" aria-hidden="true"></i><small>{{ historyOpen ? '收起记录' : '展开记录' }}</small>
              </button>
              <button type="button" :disabled="sending" @click="startNewSession">
                <i class="fas fa-plus" aria-hidden="true"></i><small>新对话</small>
              </button>
              <button type="button" :disabled="refreshing" @click="refreshCompanion">
                <i class="fas fa-rotate" :class="{ spinning: refreshing }" aria-hidden="true"></i><small>刷新状态</small>
              </button>
            </div>

            <p class="control-note">
              Web 版保留对话与角色控制；窗口置顶、穿透和本地文件能力仍由桌面版负责。
            </p>
          </div>
        </Transition>
      </aside>

      <Transition name="dock">
        <section
          v-if="pageReady && bootstrap.enabled && chatVisible"
          class="chat-dock"
          :class="{ expanded: historyOpen }"
          aria-label="与爱莉对话"
        >
          <header class="chat-header">
            <div class="chat-title">
              <span class="chat-presence" aria-hidden="true"></span>
              <div>
                <strong>Meguri</strong>
                <small>{{ sending ? (toolHint || '正在回应') : '陪在你身边' }}</small>
              </div>
            </div>
            <div class="chat-actions">
              <button type="button" title="开始新对话" aria-label="开始新对话" :disabled="sending" @click="startNewSession">＋</button>
              <button
                type="button"
                :title="historyOpen ? '收起记录' : '展开记录'"
                :aria-label="historyOpen ? '收起聊天记录' : '展开聊天记录'"
                @click="toggleHistory"
              >
                {{ historyOpen ? '⌄' : '⌃' }}
              </button>
            </div>
          </header>

          <div ref="messageListEl" class="chat-history" :class="{ empty: !messages.length }">
            <div v-if="!messages.length" class="empty-conversation">
              <span>傍晚好。</span>
              <p>想聊点什么，或者让我帮你理一理今天？</p>
            </div>
            <article
              v-for="message in visibleMessages"
              v-else
              :key="message.id"
              class="message chat-row"
              :class="[message.role, { pending: message.pending, failed: message.failed }]"
            >
              <span class="message-role">{{ message.role === 'user' ? '你' : 'Meguri' }}</span>
              <p>{{ message.content || (message.pending ? '…' : '') }}</p>
              <small v-if="message.failed" class="message-error">{{ message.failedReason || '回复失败' }}</small>
            </article>
          </div>

          <div v-if="errorText" class="conversation-error error-banner" role="alert">
            <span>{{ errorText }}</span>
            <button v-if="lastFailedUserText" type="button" :disabled="sending" @click="retryLastMessage">重试</button>
          </div>

          <form class="composer dialog-composer" @submit.prevent="handleSend">
            <textarea
              ref="composerEl"
              v-model="draft"
              class="composer-input"
              rows="1"
              maxlength="4000"
              :placeholder="composerPlaceholder"
              :disabled="sending || !bootstrap.coreOnline"
              aria-label="发给爱莉的消息"
              @keydown.enter.exact.prevent="handleSend"
            ></textarea>
            <button
              v-if="sending"
              type="button"
              class="send-button cancel"
              aria-label="停止回复"
              title="停止回复"
              @click="handleCancel"
            >
              ■
            </button>
            <button v-else type="submit" class="send-button" :disabled="!canSend" aria-label="发送消息">↑</button>
          </form>
        </section>
      </Transition>

      <section v-if="!pageReady || refreshing" class="meguri-placeholder" aria-live="polite">
        <span class="placeholder-orbit" aria-hidden="true"><i></i></span>
        <strong>正在连接 Meguri Core...</strong>
        <small>检查网关、角色资源与会话通道</small>
      </section>

      <section v-else-if="!bootstrap.enabled" class="meguri-placeholder is-error">
        <span class="empty-mark" aria-hidden="true">巡</span>
        <strong>Meguri 网关尚未启用</strong>
        <p>请在服务端配置 <code>MEGURI_GATEWAY_ENABLED=true</code> 与 Core Token 后重试。</p>
        <button type="button" class="retry-button" @click="refreshCompanion">重新检查</button>
      </section>
    </main>
  </section>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, ref } from 'vue';
import { useAuthSession } from '../composables/useAuthSession';
import {
  cancelMeguriTurn,
  createMeguriSessionId,
  createMeguriTurn,
  fetchMeguriSpriteObjectUrl,
  getMeguriBootstrap,
  isValidMeguriSessionId
} from '../services/meguriApi';
import {
  DEFAULT_MEGURI_PRESENTATION,
  resolveMeguriMotionClass,
  resolveMeguriPresentation
} from '../utils/meguriCharacterPresentation';
import { followMeguriTurn, isExpressionMeguriEventType } from '../utils/meguriTurnStream';

const SESSION_STORAGE_PREFIX = 'shizuki.meguri.session.v1.';
const RECENT_MESSAGE_COUNT = 4;
const outfitCodes = ['01', '02', '03', '04', '05', '06'];

defineProps({
  embedded: { type: Boolean, default: false },
  variant: {
    type: String,
    default: 'stage',
    validator: (value) => value === 'stage' || value === 'side'
  }
});

const auth = useAuthSession();
const pageReady = ref(false);
const refreshing = ref(false);
const bootstrap = ref({
  enabled: false,
  coreOnline: false,
  buildId: '',
  ragChunks: 0,
  defaultSprite: '',
  spriteAvailable: false
});

const messages = ref([]);
const draft = ref('');
const sending = ref(false);
const errorText = ref('');
const toolHint = ref('');
const lastFailedUserText = ref('');
const chatVisible = ref(true);
const historyOpen = ref(false);
const controlsOpen = ref(false);
const reducedMotion = ref(false);
const presentationBusy = ref(false);
const presentation = ref({ ...DEFAULT_MEGURI_PRESENTATION });

const spriteBaseUrl = ref('');
const spriteOverlayUrl = ref('');
const spriteOverlayVisible = ref(false);
const spriteHint = ref('');
const messageListEl = ref(null);
const composerEl = ref(null);

let sessionId = '';
let activeTurnId = '';
let sessionLastSequence = 0;
let followAbortController = null;
let messageSeed = 0;
let sessionRecordLoaded = false;
let spriteSwapTimer = null;
let controlsCollapseTimer = null;
let motionMediaQuery = null;
const spriteUrlCache = new Map();

const visibleMessages = computed(() =>
  historyOpen.value ? messages.value : messages.value.slice(-RECENT_MESSAGE_COUNT)
);
const canSend = computed(() => Boolean(draft.value.trim()) && !sending.value && bootstrap.value.coreOnline);
const stageStatus = computed(() => {
  if (!pageReady.value || refreshing.value) return 'loading';
  if (!bootstrap.value.enabled || errorText.value) return 'error';
  if (!bootstrap.value.coreOnline) return 'offline';
  return sending.value ? 'speaking' : 'ready';
});
const statusTone = computed(() => {
  if (stageStatus.value === 'speaking' || stageStatus.value === 'loading') return 'busy';
  if (stageStatus.value === 'error' || stageStatus.value === 'offline') return 'error';
  return 'ready';
});
const statusText = computed(() => {
  if (!pageReady.value || refreshing.value) return '正在连接';
  if (!bootstrap.value.enabled) return '网关未启用';
  if (!bootstrap.value.coreOnline) return 'Core 暂时离线';
  if (sending.value) return toolHint.value || '正在回应';
  return 'Meguri 已就绪';
});
const composerPlaceholder = computed(() =>
  bootstrap.value.coreOnline ? '输入消息，和爱莉说点什么…' : 'Core 离线，稍后再试'
);
const motionClass = computed(() =>
  resolveMeguriMotionClass(presentation.value.motionTag, reducedMotion.value)
);

function resolveErrorMessage(error) {
  if (error instanceof Error && String(error.message || '').trim()) return error.message;
  return '操作失败，请稍后再试。';
}

function storageKey() {
  const userId = auth.user.value?.userId || auth.user.value?.id || 'anonymous';
  return `${SESSION_STORAGE_PREFIX}${userId}`;
}

function loadSessionRecord() {
  if (typeof window === 'undefined') return null;
  try {
    const raw = window.localStorage.getItem(storageKey());
    if (!raw) return null;
    const parsed = JSON.parse(raw);
    if (!parsed || parsed.version !== 1 || !isValidMeguriSessionId(parsed.sessionId)) {
      window.localStorage.removeItem(storageKey());
      return null;
    }
    return parsed;
  } catch {
    return null;
  }
}

function persistSessionRecord() {
  if (typeof window === 'undefined' || !sessionId) return;
  try {
    window.localStorage.setItem(
      storageKey(),
      JSON.stringify({
        version: 1,
        sessionId,
        activeTurnId: activeTurnId || undefined,
        presentation: {
          chatVisible: chatVisible.value,
          historyOpen: historyOpen.value,
          outfitCode: presentation.value.outfitCode
        }
      })
    );
  } catch {
    // Storage can be unavailable; the current session still works in memory.
  }
}

function ensureSession() {
  if (sessionRecordLoaded) return sessionId;
  const saved = loadSessionRecord();
  sessionId = saved?.sessionId || createMeguriSessionId();
  activeTurnId = saved?.activeTurnId || '';
  chatVisible.value = saved?.presentation?.chatVisible !== false;
  historyOpen.value = Boolean(saved?.presentation?.historyOpen);
  presentation.value = resolveMeguriPresentation(DEFAULT_MEGURI_PRESENTATION, {
    outfitCode: saved?.presentation?.outfitCode
  });
  sessionRecordLoaded = true;
  persistSessionRecord();
  return sessionId;
}

function appendMessage(role, content, extra = {}) {
  messageSeed += 1;
  messages.value.push({
    id: `meguri-${Date.now()}-${messageSeed}`,
    role,
    content,
    pending: false,
    failed: false,
    failedReason: '',
    ...extra
  });
  void scrollMessagesToEnd();
  return messages.value[messages.value.length - 1];
}

async function scrollMessagesToEnd() {
  await nextTick();
  const element = messageListEl.value;
  if (element) element.scrollTop = element.scrollHeight;
}

async function resolveSpriteUrl(fileName) {
  const normalized = String(fileName || '').trim();
  if (!normalized) return '';
  if (spriteUrlCache.has(normalized)) return spriteUrlCache.get(normalized);
  const objectUrl = await fetchMeguriSpriteObjectUrl(normalized, auth.authorizedRawFetch);
  spriteUrlCache.set(normalized, objectUrl);
  return objectUrl;
}

async function showSprite(fileName) {
  if (!bootstrap.value.spriteAvailable) return false;
  try {
    const url = await resolveSpriteUrl(fileName);
    if (!url) return false;
    spriteHint.value = '';
    if (!spriteBaseUrl.value || reducedMotion.value) {
      spriteBaseUrl.value = url;
      spriteOverlayUrl.value = '';
      spriteOverlayVisible.value = false;
      return true;
    }
    if (url === spriteBaseUrl.value) return true;
    spriteOverlayUrl.value = url;
    spriteOverlayVisible.value = false;
    await nextTick();
    spriteOverlayVisible.value = true;
    if (spriteSwapTimer) clearTimeout(spriteSwapTimer);
    spriteSwapTimer = setTimeout(() => {
      spriteBaseUrl.value = url;
      spriteOverlayUrl.value = '';
      spriteOverlayVisible.value = false;
    }, 280);
    return true;
  } catch (error) {
    spriteHint.value = resolveErrorMessage(error);
    return false;
  }
}

async function applyPresentationCue(cue) {
  const next = resolveMeguriPresentation(presentation.value, cue);
  const spriteChanged = next.spriteFile !== presentation.value.spriteFile || !spriteBaseUrl.value;
  if (spriteChanged && !(await showSprite(next.spriteFile))) return false;
  presentation.value = next;
  persistSessionRecord();
  return true;
}

async function selectOutfit(code) {
  if (presentationBusy.value || presentation.value.outfitCode === code) return;
  presentationBusy.value = true;
  try {
    await applyPresentationCue({ outfitCode: code, spriteFile: '' });
  } finally {
    presentationBusy.value = false;
  }
}

async function handleTurnEvent(envelope, trackerState, assistantMessage) {
  if (envelope.sequence > sessionLastSequence) sessionLastSequence = envelope.sequence;
  if (envelope.type === 'text.delta' || envelope.type === 'text.completed') {
    assistantMessage.content = trackerState.text;
    void scrollMessagesToEnd();
  } else if (isExpressionMeguriEventType(envelope.type) && trackerState.expression) {
    await applyPresentationCue(trackerState.expression);
  }
  toolHint.value = trackerState.toolHint || '';
}

function finalizeAssistantMessage(assistantMessage, trackerState) {
  assistantMessage.pending = false;
  if (trackerState.status === 'failed') {
    assistantMessage.failed = true;
    assistantMessage.failedReason = trackerState.error || '回复失败';
  } else if (trackerState.status === 'cancelled') {
    assistantMessage.failed = !assistantMessage.content;
    assistantMessage.failedReason = '已停止';
    if (assistantMessage.content) assistantMessage.content += '（已停止）';
  }
}

async function followActiveTurn(assistantMessage, afterSequence = 0) {
  followAbortController = new AbortController();
  try {
    const trackerState = await followMeguriTurn({
      rawFetch: auth.authorizedRawFetch,
      sessionId,
      turnId: activeTurnId,
      afterSequence,
      signal: followAbortController.signal,
      onEvent: (envelope, state) => handleTurnEvent(envelope, state, assistantMessage)
    });
    finalizeAssistantMessage(assistantMessage, trackerState);
    return trackerState;
  } finally {
    followAbortController = null;
    activeTurnId = '';
    persistSessionRecord();
    toolHint.value = '';
  }
}

async function submitMessage(text, { appendUser = true } = {}) {
  const normalized = String(text || '').trim();
  if (!normalized || sending.value || !bootstrap.value.enabled) return;
  errorText.value = '';
  lastFailedUserText.value = '';
  sending.value = true;
  ensureSession();
  if (appendUser) appendMessage('user', normalized);
  const assistantMessage = appendMessage('assistant', '', { pending: true });

  try {
    const created = await createMeguriTurn(
      {
        message: normalized,
        sessionId,
        idempotencyKey: `website-${Date.now()}-${messageSeed}`
      },
      auth.authorizedFetch
    );
    sessionId = created.sessionId || sessionId;
    activeTurnId = created.turnId;
    persistSessionRecord();
    const trackerState = await followActiveTurn(assistantMessage, sessionLastSequence);
    if (trackerState.status === 'failed') {
      lastFailedUserText.value = normalized;
      errorText.value = trackerState.error || '回复失败，请重试。';
    }
  } catch (error) {
    assistantMessage.pending = false;
    assistantMessage.failed = true;
    assistantMessage.failedReason = error?.name === 'AbortError' ? '已停止' : '发送失败';
    if (error?.name !== 'AbortError') {
      lastFailedUserText.value = normalized;
      errorText.value = resolveErrorMessage(error);
    }
  } finally {
    sending.value = false;
    void scrollMessagesToEnd();
  }
}

async function handleSend() {
  const text = draft.value.trim();
  if (!canSend.value) return;
  draft.value = '';
  await submitMessage(text);
}

async function retryLastMessage() {
  const text = lastFailedUserText.value;
  if (!text || sending.value) return;
  const failedIndex = messages.value.findLastIndex((message) => message.role === 'assistant' && message.failed);
  if (failedIndex >= 0) messages.value.splice(failedIndex, 1);
  await submitMessage(text, { appendUser: false });
}

async function handleCancel() {
  const turnId = activeTurnId;
  if (!turnId) {
    followAbortController?.abort();
    return;
  }
  try {
    await cancelMeguriTurn(turnId, auth.authorizedFetch);
  } catch (error) {
    errorText.value = resolveErrorMessage(error);
  }
}

async function resumeInterruptedTurn() {
  if (!activeTurnId) return;
  sending.value = true;
  const assistantMessage = appendMessage('assistant', '', { pending: true });
  try {
    await followActiveTurn(assistantMessage, 0);
  } catch (error) {
    assistantMessage.pending = false;
    assistantMessage.failed = true;
    assistantMessage.failedReason = '上次回复未能恢复';
    errorText.value = resolveErrorMessage(error);
  } finally {
    sending.value = false;
  }
}

function startNewSession() {
  if (sending.value) return;
  followAbortController?.abort();
  sessionId = createMeguriSessionId();
  activeTurnId = '';
  sessionLastSequence = 0;
  messages.value = [];
  draft.value = '';
  errorText.value = '';
  lastFailedUserText.value = '';
  persistSessionRecord();
  void nextTick(() => composerEl.value?.focus());
}

function toggleChat() {
  chatVisible.value = !chatVisible.value;
  if (!chatVisible.value) historyOpen.value = false;
  persistSessionRecord();
}

function toggleHistory() {
  if (!chatVisible.value) return;
  historyOpen.value = !historyOpen.value;
  persistSessionRecord();
  void scrollMessagesToEnd();
}

async function loadBootstrap() {
  const payload = await getMeguriBootstrap(auth.authorizedFetch);
  bootstrap.value = payload;
  if (payload.enabled && payload.spriteAvailable) {
    const initial = resolveMeguriPresentation(DEFAULT_MEGURI_PRESENTATION, {
      spriteFile: payload.defaultSprite || DEFAULT_MEGURI_PRESENTATION.spriteFile
    });
    const preferred = resolveMeguriPresentation(initial, {
      outfitCode: presentation.value.outfitCode,
      spriteFile: presentation.value.outfitCode === initial.outfitCode ? initial.spriteFile : ''
    });
    await applyPresentationCue(preferred);
  } else if (payload.enabled && !payload.spriteAvailable) {
    spriteHint.value = '服务端未配置立绘目录（MEGURI_SPRITE_DIR）';
  }
}

async function refreshCompanion() {
  if (refreshing.value) return;
  refreshing.value = true;
  errorText.value = '';
  try {
    await loadBootstrap();
  } catch (error) {
    errorText.value = resolveErrorMessage(error);
  } finally {
    refreshing.value = false;
    pageReady.value = true;
  }
}

function scheduleControlsCollapse() {
  if (controlsCollapseTimer) clearTimeout(controlsCollapseTimer);
  controlsCollapseTimer = setTimeout(() => {
    controlsOpen.value = false;
  }, 1800);
}

function cancelControlsCollapse() {
  if (controlsCollapseTimer) clearTimeout(controlsCollapseTimer);
}

function handleWindowKeydown(event) {
  if (event.key === 'Escape') {
    controlsOpen.value = false;
    return;
  }
  if (event.ctrlKey && event.shiftKey && event.key.toLowerCase() === 'm') {
    event.preventDefault();
    toggleChat();
  }
}

function syncReducedMotion(event) {
  reducedMotion.value = Boolean(event?.matches);
}

onMounted(async () => {
  try {
    await auth.ensureReady();
    ensureSession();
    if (typeof window !== 'undefined') {
      window.addEventListener('keydown', handleWindowKeydown);
      motionMediaQuery = window.matchMedia?.('(prefers-reduced-motion: reduce)') || null;
      reducedMotion.value = Boolean(motionMediaQuery?.matches);
      motionMediaQuery?.addEventListener?.('change', syncReducedMotion);
    }
    await loadBootstrap();
    await resumeInterruptedTurn();
  } catch (error) {
    errorText.value = resolveErrorMessage(error);
  } finally {
    pageReady.value = true;
  }
});

onBeforeUnmount(() => {
  followAbortController?.abort();
  if (spriteSwapTimer) clearTimeout(spriteSwapTimer);
  if (controlsCollapseTimer) clearTimeout(controlsCollapseTimer);
  if (typeof window !== 'undefined') window.removeEventListener('keydown', handleWindowKeydown);
  motionMediaQuery?.removeEventListener?.('change', syncReducedMotion);
  for (const url of spriteUrlCache.values()) {
    try {
      URL.revokeObjectURL(url);
    } catch {
      // Ignore browsers that already released the object URL.
    }
  }
  spriteUrlCache.clear();
});
</script>

<style scoped src="../styles/meguri-web-companion.css"></style>
