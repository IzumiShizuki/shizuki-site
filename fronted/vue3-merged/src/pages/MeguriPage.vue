<template>
  <section class="route-page meguri-page" :class="{ embedded, side: variant === 'side' }">
    <section class="meguri-shell" :data-stage-status="stageStatus">
      <!-- 立绘舞台层 -->
      <div class="stage-layer" aria-hidden="false">
        <img
          v-if="spriteBaseUrl"
          class="stage-sprite base"
          :src="spriteBaseUrl"
          alt="Meguri 立绘"
        />
        <img
          v-if="spriteOverlayUrl"
          class="stage-sprite overlay"
          :class="{ visible: spriteOverlayVisible }"
          :src="spriteOverlayUrl"
          alt=""
          aria-hidden="true"
        />
        <div v-if="!spriteBaseUrl && pageReady && bootstrap.enabled" class="stage-empty">
          <strong>{{ spriteHint || '立绘尚未就绪' }}</strong>
        </div>
        <div class="stage-glow" aria-hidden="true"></div>
        <div class="stage-scrim" aria-hidden="true"></div>
      </div>

      <!-- 顶部悬浮：标题 + 状态 + 控制 -->
      <header class="meguri-topbar">
        <div class="meguri-title">
          <h1>爱莉</h1>
        </div>
        <div class="meguri-topbar-side">
          <span class="status-pill" :class="coreStatusTone">{{ coreStatusLabel }}</span>
          <span v-if="bootstrap.buildId" class="status-pill muted">build · {{ bootstrap.buildId }}</span>
          <button
            class="quick-btn ripple-trigger"
            type="button"
            :disabled="sending"
            aria-label="新会话"
            @click="startNewSession"
          >
            <i class="fas fa-rotate" aria-hidden="true"></i>
            新会话
          </button>
          <button
            class="quick-btn ripple-trigger"
            type="button"
            :class="{ active: historyOpen }"
            aria-label="展开完整对话记录"
            @click="historyOpen = !historyOpen"
          >
            <i class="fas fa-clock-rotate-left" aria-hidden="true"></i>
            记录
          </button>
        </div>
      </header>

      <div v-if="!pageReady" class="meguri-placeholder">
        <strong>正在连接 Meguri Core...</strong>
      </div>

      <div v-else-if="!bootstrap.enabled" class="meguri-placeholder">
        <strong>Meguri 网关尚未启用</strong>
        <p>请在服务端配置 <code>MEGURI_GATEWAY_ENABLED=true</code> 与 Core Token 后刷新本页。</p>
      </div>

      <!-- 浮层对话：最近气泡贴在立绘下方，可展开完整记录 -->
      <div v-else class="float-dialog" :class="{ 'history-open': historyOpen }">
        <div ref="messageListEl" class="dialog-scroll">
          <div v-if="!messages.length" class="dialog-empty">
            <strong>和爱莉打个招呼吧</strong>
          </div>
          <article
            v-for="message in visibleMessages"
            :key="message.id"
            class="chat-row"
            :class="[message.role, { pending: message.pending, failed: message.failed }]"
          >
            <div class="bubble-meta">{{ message.role === 'user' ? '你' : '爱莉' }}</div>
            <div class="chat-bubble">
              <p>{{ message.content || (message.pending ? '...' : '') }}</p>
              <span v-if="message.pending" class="bubble-tag">回复中...</span>
              <span v-else-if="message.failed" class="bubble-tag error">{{ message.failedReason || '回复失败' }}</span>
            </div>
          </article>
        </div>

        <p v-if="errorText" class="error-banner">{{ errorText }}</p>

        <form class="dialog-composer" @submit.prevent="handleSend">
          <textarea
            v-model="draft"
            class="composer-input"
            rows="1"
            :placeholder="composerPlaceholder"
            :disabled="sending || !bootstrap.enabled"
            @keydown.enter.exact.prevent="handleSend"
          ></textarea>
          <div class="composer-actions">
            <button
              v-if="sending"
              class="quick-btn ripple-trigger"
              type="button"
              aria-label="停止回复"
              @click="handleCancel"
            >
              <i class="fas fa-stop" aria-hidden="true"></i>
            </button>
            <button
              class="quick-btn primary ripple-trigger"
              type="submit"
              aria-label="发送"
              :disabled="sending || !draft.trim()"
            >
              <i class="fas fa-paper-plane" aria-hidden="true"></i>
            </button>
          </div>
        </form>
      </div>

      <footer v-if="pageReady && bootstrap.enabled" class="stage-footer">
        <span class="expression-caption">{{ expressionCaption }}</span>
        <span v-if="toolHint" class="status-pill accent">{{ toolHint }}</span>
      </footer>
    </section>
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
import { followMeguriTurn, isExpressionMeguriEventType } from '../utils/meguriTurnStream';

const SESSION_STORAGE_PREFIX = 'shizuki.meguri.session.v1.';
const RECENT_MESSAGE_COUNT = 4;

defineProps({
  /** 在 AI Hub / 其他容器内嵌时为 true：去掉页面级留白。 */
  embedded: { type: Boolean, default: false },
  /** stage = 大立绘舞台（默认）；side = 右侧栏紧凑形态。 */
  variant: {
    type: String,
    default: 'stage',
    validator: (value) => value === 'stage' || value === 'side'
  }
});

const auth = useAuthSession();

const pageReady = ref(false);
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
const expression = ref(null);
const historyOpen = ref(false);

const spriteBaseUrl = ref('');
const spriteOverlayUrl = ref('');
const spriteOverlayVisible = ref(false);
const spriteHint = ref('');

const messageListEl = ref(null);

let sessionId = '';
let activeTurnId = '';
let sessionLastSequence = 0;
let followAbortController = null;
let messageSeed = 0;
const spriteUrlCache = new Map();
let spriteSwapTimer = null;

const visibleMessages = computed(() =>
  historyOpen.value ? messages.value : messages.value.slice(-RECENT_MESSAGE_COUNT)
);

const coreStatusLabel = computed(() => {
  if (!pageReady.value) return '连接中...';
  if (!bootstrap.value.enabled) return '网关未启用';
  return bootstrap.value.coreOnline ? 'Meguri Core 在线' : 'Core 暂时离线';
});
const coreStatusTone = computed(() => {
  if (!pageReady.value || !bootstrap.value.enabled) return 'muted';
  return bootstrap.value.coreOnline ? 'accent' : 'warning';
});
const stageStatus = computed(() => (sending.value ? 'speaking' : 'idle'));
const composerPlaceholder = computed(() =>
  bootstrap.value.coreOnline ? '对爱莉说点什么...' : 'Core 离线，稍后再试'
);
const expressionCaption = computed(() => {
  if (!expression.value) return 'neutral · low';
  const parts = [expression.value.expressionTag || 'neutral', expression.value.expressionIntensity || 'low'];
  if (expression.value.outfitCode) parts.push(`outfit ${expression.value.outfitCode}`);
  return parts.join(' · ');
});

function resolveErrorMessage(error) {
  if (error instanceof Error && String(error.message || '').trim()) {
    return error.message;
  }
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
  if (typeof window === 'undefined') return;
  try {
    window.localStorage.setItem(
      storageKey(),
      JSON.stringify({ version: 1, sessionId, activeTurnId: activeTurnId || undefined })
    );
  } catch {
    // storage may be unavailable; the session still works in memory
  }
}

function ensureSession() {
  if (!sessionId) {
    const saved = loadSessionRecord();
    sessionId = saved?.sessionId || createMeguriSessionId();
    activeTurnId = saved?.activeTurnId || '';
    persistSessionRecord();
  }
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
  scrollMessagesToEnd();
  // Return the reactive proxy (not the raw object) so streaming mutations
  // trigger re-renders while text deltas arrive.
  return messages.value[messages.value.length - 1];
}

async function scrollMessagesToEnd() {
  await nextTick();
  const el = messageListEl.value;
  if (el) el.scrollTop = el.scrollHeight;
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
  if (!bootstrap.value.spriteAvailable) return;
  try {
    const url = await resolveSpriteUrl(fileName);
    if (!url) return;
    if (!spriteBaseUrl.value) {
      spriteBaseUrl.value = url;
      return;
    }
    if (url === spriteBaseUrl.value) return;
    spriteOverlayUrl.value = url;
    spriteOverlayVisible.value = false;
    await nextTick();
    spriteOverlayVisible.value = true;
    if (spriteSwapTimer) clearTimeout(spriteSwapTimer);
    spriteSwapTimer = setTimeout(() => {
      spriteBaseUrl.value = url;
      spriteOverlayUrl.value = '';
      spriteOverlayVisible.value = false;
    }, 360);
  } catch (error) {
    spriteHint.value = resolveErrorMessage(error);
  }
}

function handleTurnEvent(envelope, trackerState, assistantMessage) {
  if (envelope.sequence > sessionLastSequence) {
    sessionLastSequence = envelope.sequence;
  }
  if (envelope.type === 'text.delta' || envelope.type === 'text.completed') {
    assistantMessage.content = trackerState.text;
    scrollMessagesToEnd();
  } else if (isExpressionMeguriEventType(envelope.type)) {
    expression.value = trackerState.expression;
    if (trackerState.expression?.spriteFile) {
      showSprite(trackerState.expression.spriteFile);
    }
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
    if (assistantMessage.content) {
      assistantMessage.content += '（已停止）';
    }
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
  } finally {
    followAbortController = null;
    activeTurnId = '';
    persistSessionRecord();
    toolHint.value = '';
  }
}

async function handleSend() {
  const text = draft.value.trim();
  if (!text || sending.value || !bootstrap.value.enabled) return;

  errorText.value = '';
  draft.value = '';
  sending.value = true;
  ensureSession();

  appendMessage('user', text);
  const assistantMessage = appendMessage('assistant', '', { pending: true });

  try {
    const created = await createMeguriTurn(
      {
        message: text,
        sessionId,
        idempotencyKey: `website-${Date.now()}-${messageSeed}`
      },
      auth.authorizedFetch
    );
    sessionId = created.sessionId || sessionId;
    activeTurnId = created.turnId;
    persistSessionRecord();
    await followActiveTurn(assistantMessage, sessionLastSequence);
  } catch (error) {
    assistantMessage.pending = false;
    assistantMessage.failed = true;
    assistantMessage.failedReason = '发送失败';
    errorText.value = resolveErrorMessage(error);
  } finally {
    sending.value = false;
    scrollMessagesToEnd();
  }
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
  } catch {
    assistantMessage.pending = false;
    assistantMessage.failed = true;
    assistantMessage.failedReason = '上次回复未能恢复';
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
  errorText.value = '';
  expression.value = null;
  persistSessionRecord();
}

async function loadBootstrap() {
  const payload = await getMeguriBootstrap(auth.authorizedFetch);
  bootstrap.value = payload;
  if (payload.enabled && payload.spriteAvailable && payload.defaultSprite) {
    await showSprite(payload.defaultSprite);
  } else if (payload.enabled && !payload.spriteAvailable) {
    spriteHint.value = '服务端未配置立绘目录（MEGURI_SPRITE_DIR）';
  }
}

onMounted(async () => {
  try {
    await auth.ensureReady();
    ensureSession();
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
  for (const url of spriteUrlCache.values()) {
    try {
      URL.revokeObjectURL(url);
    } catch {
      // ignore revoke failures
    }
  }
  spriteUrlCache.clear();
});
</script>

<style scoped>
/* ============ AIRI 式立绘舞台：立绘为主角，对话浮层贴底 ============ */

.meguri-page {
  padding: 12px clamp(12px, 3vw, 32px) 24px;
}

.meguri-page.embedded {
  padding: 0;
}

.meguri-shell {
  position: relative;
  min-height: min(78vh, 860px);
  border-radius: 22px;
  overflow: hidden;
  background:
    radial-gradient(120% 90% at 50% 0%, rgba(255, 154, 197, 0.12), transparent 58%),
    linear-gradient(180deg, rgba(40, 30, 42, 0.97), rgba(24, 18, 28, 0.98));
  border: 1px solid rgba(255, 214, 229, 0.14);
  box-shadow: 0 24px 48px rgba(10, 6, 14, 0.4);
}

.meguri-page.embedded .meguri-shell {
  min-height: 640px;
  box-shadow: none;
}

/* —— 立绘层 —— */
.stage-layer {
  position: absolute;
  inset: 0;
}

.stage-sprite {
  position: absolute;
  inset: 0;
  width: 100%;
  height: 100%;
  object-fit: contain;
  object-position: bottom center;
  padding: 44px 8px 0;
}

.stage-sprite.overlay {
  opacity: 0;
  transition: opacity 0.32s ease;
}

.stage-sprite.overlay.visible {
  opacity: 1;
}

@media (prefers-reduced-motion: reduce) {
  .stage-sprite.overlay {
    transition: none;
  }
}

.stage-empty {
  position: absolute;
  inset: 0;
  display: grid;
  place-content: center;
  text-align: center;
  color: rgba(255, 231, 240, 0.7);
  font-size: 0.9rem;
}

.stage-glow {
  position: absolute;
  inset: auto 8% 0;
  height: 24%;
  background: radial-gradient(60% 100% at 50% 100%, rgba(255, 154, 197, 0.26), transparent 70%);
  pointer-events: none;
}

/* 底部渐暗压底，保证浮层文字在亮立绘上也可读。 */
.stage-scrim {
  position: absolute;
  inset: 46% 0 0;
  background: linear-gradient(180deg, transparent, rgba(16, 10, 20, 0.62) 78%, rgba(14, 9, 18, 0.78));
  pointer-events: none;
}

[data-stage-status='speaking'] .stage-glow {
  animation: meguri-breathe 1.6s ease-in-out infinite alternate;
}

@keyframes meguri-breathe {
  from { opacity: 0.7; }
  to { opacity: 1; }
}

/* —— 顶部悬浮条 —— */
.meguri-topbar {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  z-index: 3;
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
  padding: 12px 16px;
  color: rgba(255, 243, 240, 0.96);
  background: linear-gradient(180deg, rgba(18, 12, 22, 0.55), transparent);
  pointer-events: none;
}

.meguri-topbar > * {
  pointer-events: auto;
}

.meguri-title h1 {
  margin: 0;
  font-size: 1.1rem;
  font-family: var(--font-cute, inherit);
  letter-spacing: 0.04em;
}

.meguri-topbar-side {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
  justify-content: flex-end;
}

.status-pill {
  padding: 4px 12px;
  border-radius: 999px;
  font-size: 0.72rem;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(24, 16, 26, 0.55);
}

.status-pill.accent {
  border-color: rgba(255, 154, 197, 0.5);
  background: rgba(255, 154, 197, 0.16);
  color: #ffd3e4;
}

.status-pill.warning {
  border-color: rgba(255, 196, 128, 0.5);
  background: rgba(255, 176, 96, 0.16);
  color: #ffdcb0;
}

.status-pill.muted {
  opacity: 0.72;
}

.quick-btn {
  display: inline-flex;
  align-items: center;
  gap: 7px;
  padding: 7px 12px;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(26, 18, 28, 0.6);
  color: inherit;
  font-size: 0.8rem;
  cursor: pointer;
  transition: border-color 0.2s ease, background 0.2s ease, transform 0.2s ease;
}

.quick-btn.primary {
  border-color: rgba(255, 154, 197, 0.55);
  background: rgba(255, 122, 178, 0.3);
}

.quick-btn.active {
  border-color: rgba(255, 154, 197, 0.6);
  background: rgba(255, 154, 197, 0.22);
}

.quick-btn:hover:not(:disabled) {
  border-color: rgba(255, 154, 197, 0.6);
  transform: translateY(-1px);
}

.quick-btn:disabled {
  opacity: 0.5;
  cursor: not-allowed;
}

.meguri-placeholder {
  position: absolute;
  inset: 0;
  z-index: 2;
  display: grid;
  place-content: center;
  gap: 8px;
  text-align: center;
  color: rgba(255, 240, 244, 0.92);
  padding: 24px;
}

.meguri-placeholder p {
  margin: 0;
  font-size: 0.85rem;
  opacity: 0.7;
}

/* —— 浮层对话 —— */
.float-dialog {
  position: absolute;
  left: clamp(10px, 3vw, 28px);
  right: clamp(10px, 3vw, 28px);
  bottom: 12px;
  z-index: 2;
  display: flex;
  flex-direction: column;
  gap: 8px;
  max-height: 46%;
}

.float-dialog.history-open {
  top: 64px;
  max-height: none;
  background: rgba(20, 13, 24, 0.82);
  border: 1px solid rgba(255, 214, 229, 0.16);
  border-radius: 18px;
  padding: 12px;
  backdrop-filter: blur(6px);
}

.dialog-scroll {
  flex: 1;
  min-height: 0;
  overflow-y: auto;
  display: flex;
  flex-direction: column;
  gap: 10px;
  padding-right: 4px;
  scrollbar-width: thin;
  scrollbar-color: rgba(255, 190, 210, 0.35) transparent;
}

.dialog-empty {
  margin: auto auto 8px 4px;
  color: rgba(255, 236, 243, 0.75);
  font-size: 0.85rem;
}

.chat-row {
  display: flex;
  flex-direction: column;
  gap: 3px;
  max-width: min(76%, 560px);
  animation: meguri-bubble-in 0.32s var(--ease-out, ease) both;
}

@media (prefers-reduced-motion: reduce) {
  .chat-row {
    animation: none;
  }
}

@keyframes meguri-bubble-in {
  from { opacity: 0; transform: translateY(8px); }
  to { opacity: 1; transform: none; }
}

.chat-row.user {
  align-self: flex-end;
  align-items: flex-end;
}

.chat-row.assistant {
  align-self: flex-start;
  align-items: flex-start;
}

.bubble-meta {
  font-size: 0.68rem;
  opacity: 0.62;
  color: #ffe6ef;
}

.chat-bubble {
  padding: 9px 13px;
  border-radius: 16px;
  border: 1px solid rgba(255, 255, 255, 0.14);
  background: rgba(30, 20, 32, 0.78);
  color: rgba(255, 246, 248, 0.96);
  backdrop-filter: blur(4px);
}

.chat-row.user .chat-bubble {
  border-color: rgba(255, 154, 197, 0.45);
  background: linear-gradient(145deg, rgba(255, 122, 178, 0.4), rgba(214, 92, 148, 0.36));
  border-bottom-right-radius: 6px;
}

.chat-row.assistant .chat-bubble {
  border-bottom-left-radius: 6px;
}

.chat-bubble p {
  margin: 0;
  white-space: pre-wrap;
  word-break: break-word;
  font-size: 0.88rem;
  line-height: 1.6;
}

.bubble-tag {
  display: inline-block;
  margin-top: 5px;
  font-size: 0.68rem;
  opacity: 0.7;
}

.bubble-tag.error {
  color: #ffb4c4;
}

.chat-row.failed .chat-bubble {
  border-color: rgba(255, 120, 140, 0.5);
}

.error-banner {
  margin: 0;
  padding: 8px 12px;
  border-radius: 12px;
  border: 1px solid rgba(255, 120, 140, 0.45);
  background: rgba(60, 18, 28, 0.85);
  color: #ffc9d4;
  font-size: 0.8rem;
}

/* —— 输入条 —— */
.dialog-composer {
  display: flex;
  gap: 8px;
  align-items: flex-end;
  padding: 8px;
  border-radius: 18px;
  border: 1px solid rgba(255, 214, 229, 0.2);
  background: rgba(24, 16, 26, 0.82);
  backdrop-filter: blur(6px);
}

.composer-input {
  flex: 1;
  resize: none;
  padding: 8px 10px;
  border-radius: 12px;
  border: 1px solid transparent;
  background: rgba(255, 255, 255, 0.06);
  color: rgba(255, 247, 249, 0.96);
  font-size: 0.9rem;
  line-height: 1.5;
  font-family: inherit;
  max-height: 96px;
}

.composer-input:focus {
  outline: none;
  border-color: rgba(255, 154, 197, 0.55);
}

.composer-actions {
  display: flex;
  gap: 6px;
}

/* —— 底部状态 —— */
.stage-footer {
  position: absolute;
  right: 14px;
  bottom: 12px;
  z-index: 1;
  display: flex;
  align-items: center;
  gap: 8px;
  opacity: 0.85;
}

.expression-caption {
  font-size: 0.72rem;
  color: rgba(255, 205, 226, 0.8);
}

/* ============ side 变体：右侧栏紧凑形态 ============ */
.meguri-page.side {
  padding: 0;
  height: 100%;
}

.meguri-page.side .meguri-shell {
  min-height: 0;
  height: 100%;
  border-radius: 16px;
  display: flex;
  flex-direction: column;
}

.meguri-page.side .stage-layer {
  position: relative;
  inset: auto;
  height: 190px;
  flex: none;
}

.meguri-page.side .stage-sprite {
  padding: 34px 6px 0;
}

.meguri-page.side .stage-scrim {
  inset: 30% 0 0;
}

.meguri-page.side .float-dialog {
  position: relative;
  left: auto;
  right: auto;
  bottom: auto;
  flex: 1;
  min-height: 0;
  max-height: none;
  padding: 8px 10px 10px;
}

.meguri-page.side .float-dialog.history-open {
  top: auto;
  background: none;
  border: 0;
  backdrop-filter: none;
  padding: 8px 10px 10px;
}

.meguri-page.side .chat-row {
  max-width: 92%;
}

.meguri-page.side .stage-footer {
  display: none;
}

.meguri-page.side .meguri-title h1 {
  font-size: 0.95rem;
}

/* ============ 日间模式 ============ */
:root[data-theme-mode='day'] .meguri-shell {
  background:
    radial-gradient(120% 90% at 50% 0%, rgba(255, 170, 205, 0.24), transparent 58%),
    linear-gradient(180deg, rgba(255, 248, 251, 0.98), rgba(250, 238, 244, 0.98));
  border-color: rgba(190, 120, 140, 0.24);
  box-shadow: 0 22px 44px rgba(170, 120, 130, 0.2);
}

:root[data-theme-mode='day'] .meguri-topbar {
  color: rgba(72, 42, 54, 0.95);
  background: linear-gradient(180deg, rgba(255, 244, 249, 0.7), transparent);
}

:root[data-theme-mode='day'] .stage-scrim {
  background: linear-gradient(180deg, transparent, rgba(255, 240, 246, 0.6) 78%, rgba(255, 236, 244, 0.78));
}

:root[data-theme-mode='day'] .status-pill {
  border-color: rgba(150, 90, 110, 0.24);
  background: rgba(255, 255, 255, 0.66);
  color: #6d3a52;
}

:root[data-theme-mode='day'] .status-pill.accent {
  border-color: rgba(230, 120, 170, 0.5);
  background: rgba(255, 190, 216, 0.5);
  color: #a03e6c;
}

:root[data-theme-mode='day'] .quick-btn {
  border-color: rgba(150, 90, 110, 0.26);
  background: rgba(255, 255, 255, 0.72);
  color: #5d3348;
}

:root[data-theme-mode='day'] .quick-btn.primary {
  border-color: rgba(230, 120, 170, 0.55);
  background: rgba(255, 178, 210, 0.6);
}

:root[data-theme-mode='day'] .meguri-placeholder {
  color: rgba(90, 52, 66, 0.9);
}

:root[data-theme-mode='day'] .dialog-empty {
  color: rgba(120, 74, 92, 0.8);
}

:root[data-theme-mode='day'] .bubble-meta {
  color: rgba(150, 84, 110, 0.85);
}

:root[data-theme-mode='day'] .chat-bubble {
  border-color: rgba(150, 90, 110, 0.22);
  background: rgba(255, 255, 255, 0.85);
  color: #4a2c3a;
}

:root[data-theme-mode='day'] .chat-row.user .chat-bubble {
  border-color: rgba(230, 120, 170, 0.42);
  background: linear-gradient(145deg, rgba(255, 202, 224, 0.9), rgba(255, 184, 214, 0.85));
}

:root[data-theme-mode='day'] .dialog-composer {
  border-color: rgba(150, 90, 110, 0.24);
  background: rgba(255, 252, 253, 0.92);
}

:root[data-theme-mode='day'] .composer-input {
  background: rgba(255, 255, 255, 0.9);
  color: #402334;
}

:root[data-theme-mode='day'] .error-banner {
  border-color: rgba(220, 90, 120, 0.5);
  background: rgba(255, 210, 220, 0.7);
  color: #9c2f4a;
}

:root[data-theme-mode='day'] .float-dialog.history-open {
  background: rgba(255, 248, 251, 0.9);
  border-color: rgba(190, 120, 140, 0.24);
}

/* ============ 响应式 ============ */
@media (max-width: 900px) {
  .meguri-shell {
    min-height: 70vh;
  }

  .float-dialog {
    max-height: 54%;
  }

  .chat-row {
    max-width: 88%;
  }
}
</style>
