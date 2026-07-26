<template>
  <section class="route-page meguri-page" :class="{ embedded }">
    <section class="meguri-shell liquid-material">
      <header class="meguri-topbar">
        <div class="meguri-title">
          <span class="stage-kicker">Meguri Companion</span>
          <h1>Meguri（爱莉）</h1>
          <p>网站端 · 文字与静态立绘 · 与桌宠 / AstrBot 共享同一角色核心</p>
        </div>
        <div class="meguri-topbar-side">
          <span class="status-pill" :class="coreStatusTone">{{ coreStatusLabel }}</span>
          <span v-if="bootstrap.buildId" class="status-pill muted">build · {{ bootstrap.buildId }}</span>
          <button
            class="quick-btn ripple-trigger"
            type="button"
            :disabled="sending"
            @click="startNewSession"
          >
            <i class="fas fa-rotate" aria-hidden="true"></i>
            新会话
          </button>
        </div>
      </header>

      <div v-if="!pageReady" class="meguri-placeholder">
        <strong>正在连接 Meguri Core...</strong>
        <p>读取网关状态与默认立绘。</p>
      </div>

      <div v-else-if="!bootstrap.enabled" class="meguri-placeholder">
        <strong>Meguri 网关尚未启用</strong>
        <p>请在服务端配置 <code>MEGURI_GATEWAY_ENABLED=true</code> 与 Core Token 后刷新本页。</p>
      </div>

      <div v-else class="meguri-grid">
        <section class="meguri-stage liquid-material" :data-stage-status="stageStatus">
          <div class="stage-frame">
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
            <div v-if="!spriteBaseUrl" class="stage-empty">
              <strong>{{ spriteHint || '立绘尚未就绪' }}</strong>
              <p>对话仍可正常进行；配置立绘目录后这里会显示 Meguri。</p>
            </div>
            <div class="stage-glow" aria-hidden="true"></div>
          </div>
          <footer class="stage-footer">
            <span class="expression-caption">{{ expressionCaption }}</span>
            <span v-if="toolHint" class="status-pill accent">{{ toolHint }}</span>
            <span v-else class="status-pill muted">{{ stageStatusLabel }}</span>
          </footer>
        </section>

        <section class="meguri-dialog liquid-material">
          <div ref="messageListEl" class="dialog-scroll">
            <div v-if="!messages.length" class="dialog-empty">
              <strong>和爱莉打个招呼吧</strong>
              <p>回复通过统一角色核心流式返回，表情与立绘随语义事件切换。</p>
            </div>
            <article
              v-for="message in messages"
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
              rows="2"
              :placeholder="composerPlaceholder"
              :disabled="sending || !bootstrap.enabled"
              @keydown.enter.exact.prevent="handleSend"
            ></textarea>
            <div class="composer-actions">
              <button
                v-if="sending"
                class="quick-btn ripple-trigger"
                type="button"
                @click="handleCancel"
              >
                <i class="fas fa-stop" aria-hidden="true"></i>
                停止
              </button>
              <button
                class="quick-btn primary ripple-trigger"
                type="submit"
                :disabled="sending || !draft.trim()"
              >
                <i class="fas fa-paper-plane" aria-hidden="true"></i>
                发送
              </button>
            </div>
          </form>
        </section>
      </div>
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

defineProps({
  /** 在 AI Hub 内作为「爱莉伴聊」模式内嵌时为 true：去掉页面级留白。 */
  embedded: { type: Boolean, default: false }
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
const stageStatusLabel = computed(() => (sending.value ? '爱莉正在回复...' : '待机中'));
const composerPlaceholder = computed(() =>
  bootstrap.value.coreOnline ? '对爱莉说点什么...（Enter 发送）' : 'Core 离线时发送会快速失败，可稍后再试'
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
.meguri-page {
  padding: 18px clamp(12px, 3vw, 32px) 32px;
}

/* AI Hub 内嵌形态：外层 hub 已提供留白与底板。 */
.meguri-page.embedded {
  padding: 0;
}

.meguri-page.embedded .meguri-shell {
  --liquid-shadow: none;
  border-radius: 18px;
}

.meguri-shell {
  --liquid-bg: linear-gradient(150deg, rgba(24, 15, 26, 0.88), rgba(13, 10, 20, 0.82));
  --liquid-border: rgba(255, 255, 255, 0.14);
  --liquid-shadow: 0 24px 48px rgba(8, 3, 14, 0.34);
  display: flex;
  flex-direction: column;
  gap: 16px;
  padding: 18px;
  border-radius: 22px;
}

.meguri-topbar {
  display: flex;
  align-items: flex-end;
  justify-content: space-between;
  gap: 16px;
  flex-wrap: wrap;
}

.stage-kicker {
  font-size: 0.72rem;
  letter-spacing: 0.14em;
  text-transform: uppercase;
  color: rgba(255, 195, 220, 0.75);
}

.meguri-title h1 {
  margin: 4px 0 6px;
  font-size: 1.35rem;
}

.meguri-title p {
  margin: 0;
  font-size: 0.85rem;
  opacity: 0.72;
}

.meguri-topbar-side {
  display: flex;
  align-items: center;
  gap: 10px;
  flex-wrap: wrap;
}

.status-pill {
  padding: 4px 12px;
  border-radius: 999px;
  font-size: 0.75rem;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.06);
}

.status-pill.accent {
  border-color: rgba(255, 154, 197, 0.5);
  background: rgba(255, 154, 197, 0.14);
  color: #ffd3e4;
}

.status-pill.warning {
  border-color: rgba(255, 196, 128, 0.5);
  background: rgba(255, 176, 96, 0.14);
  color: #ffdcb0;
}

.status-pill.muted {
  opacity: 0.7;
}

.quick-btn {
  display: inline-flex;
  align-items: center;
  gap: 8px;
  padding: 8px 14px;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.06);
  color: inherit;
  font-size: 0.82rem;
  cursor: pointer;
  transition: border-color 0.2s ease, background 0.2s ease, transform 0.2s ease;
}

.quick-btn.primary {
  border-color: rgba(255, 154, 197, 0.55);
  background: rgba(255, 122, 178, 0.2);
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
  padding: 48px 20px;
  text-align: center;
  border-radius: 18px;
  border: 1px dashed rgba(255, 255, 255, 0.2);
}

.meguri-placeholder p {
  margin: 8px 0 0;
  font-size: 0.85rem;
  opacity: 0.7;
}

.meguri-grid {
  display: grid;
  grid-template-columns: minmax(280px, 420px) minmax(0, 1fr);
  gap: 16px;
  align-items: stretch;
}

.meguri-stage,
.meguri-dialog {
  border-radius: 18px;
  padding: 14px;
  display: flex;
  flex-direction: column;
  gap: 10px;
  min-height: 520px;
}

.stage-frame {
  position: relative;
  flex: 1;
  min-height: 380px;
  border-radius: 14px;
  overflow: hidden;
  background:
    radial-gradient(120% 80% at 50% 0%, rgba(255, 154, 197, 0.14), transparent 60%),
    linear-gradient(180deg, rgba(30, 20, 36, 0.6), rgba(14, 10, 22, 0.85));
  display: flex;
  align-items: flex-end;
  justify-content: center;
}

.stage-sprite {
  position: absolute;
  inset: 0;
  width: 100%;
  height: 100%;
  object-fit: contain;
  object-position: bottom center;
  padding: 8px 8px 0;
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
  position: relative;
  z-index: 1;
  align-self: center;
  text-align: center;
  padding: 24px;
  opacity: 0.85;
}

.stage-empty p {
  margin: 8px 0 0;
  font-size: 0.8rem;
  opacity: 0.7;
}

.stage-glow {
  position: absolute;
  inset: auto 10% 0;
  height: 22%;
  background: radial-gradient(60% 100% at 50% 100%, rgba(255, 154, 197, 0.24), transparent 70%);
  pointer-events: none;
}

.stage-footer {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
  flex-wrap: wrap;
}

.expression-caption {
  font-size: 0.78rem;
  color: rgba(255, 205, 226, 0.85);
}

.dialog-scroll {
  flex: 1;
  overflow-y: auto;
  display: flex;
  flex-direction: column;
  gap: 12px;
  padding-right: 4px;
  min-height: 0;
}

.dialog-empty {
  margin: auto;
  text-align: center;
  opacity: 0.75;
}

.dialog-empty p {
  margin: 8px 0 0;
  font-size: 0.8rem;
}

.chat-row {
  display: flex;
  flex-direction: column;
  gap: 4px;
  max-width: 86%;
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
  font-size: 0.7rem;
  opacity: 0.6;
}

.chat-bubble {
  padding: 10px 14px;
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.12);
  background: rgba(255, 255, 255, 0.05);
}

.chat-row.user .chat-bubble {
  border-color: rgba(140, 190, 255, 0.4);
  background: rgba(110, 168, 255, 0.14);
}

.chat-row.assistant .chat-bubble {
  border-color: rgba(255, 154, 197, 0.38);
  background: rgba(255, 140, 190, 0.1);
}

.chat-bubble p {
  margin: 0;
  white-space: pre-wrap;
  word-break: break-word;
  font-size: 0.9rem;
  line-height: 1.6;
}

.bubble-tag {
  display: inline-block;
  margin-top: 6px;
  font-size: 0.7rem;
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
  padding: 10px 14px;
  border-radius: 12px;
  border: 1px solid rgba(255, 120, 140, 0.45);
  background: rgba(255, 96, 120, 0.12);
  color: #ffc9d4;
  font-size: 0.82rem;
}

.dialog-composer {
  display: flex;
  gap: 10px;
  align-items: flex-end;
}

.composer-input {
  flex: 1;
  resize: none;
  padding: 10px 12px;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(10, 8, 16, 0.5);
  color: inherit;
  font-size: 0.9rem;
  line-height: 1.5;
  font-family: inherit;
}

.composer-input:focus {
  outline: none;
  border-color: rgba(255, 154, 197, 0.6);
}

.composer-actions {
  display: flex;
  gap: 8px;
}

:root[data-theme-mode='day'] .meguri-shell {
  --liquid-bg: linear-gradient(150deg, rgba(255, 250, 252, 0.92), rgba(248, 240, 246, 0.88));
  --liquid-border: rgba(120, 80, 110, 0.18);
  --liquid-shadow: 0 20px 40px rgba(150, 110, 140, 0.16);
}

:root[data-theme-mode='day'] .stage-kicker {
  color: rgba(190, 90, 140, 0.85);
}

:root[data-theme-mode='day'] .status-pill {
  border-color: rgba(120, 80, 110, 0.24);
  background: rgba(255, 255, 255, 0.6);
}

:root[data-theme-mode='day'] .status-pill.accent {
  border-color: rgba(230, 120, 170, 0.5);
  background: rgba(255, 190, 216, 0.4);
  color: #a03e6c;
}

:root[data-theme-mode='day'] .status-pill.warning {
  color: #a06430;
}

:root[data-theme-mode='day'] .quick-btn {
  border-color: rgba(120, 80, 110, 0.24);
  background: rgba(255, 255, 255, 0.7);
}

:root[data-theme-mode='day'] .quick-btn.primary {
  border-color: rgba(230, 120, 170, 0.55);
  background: rgba(255, 178, 210, 0.5);
}

:root[data-theme-mode='day'] .stage-frame {
  background:
    radial-gradient(120% 80% at 50% 0%, rgba(255, 170, 205, 0.3), transparent 60%),
    linear-gradient(180deg, rgba(255, 244, 250, 0.9), rgba(248, 232, 242, 0.95));
}

:root[data-theme-mode='day'] .expression-caption {
  color: rgba(170, 80, 125, 0.9);
}

:root[data-theme-mode='day'] .chat-bubble {
  border-color: rgba(120, 80, 110, 0.2);
  background: rgba(255, 255, 255, 0.75);
}

:root[data-theme-mode='day'] .chat-row.user .chat-bubble {
  border-color: rgba(90, 140, 220, 0.4);
  background: rgba(170, 205, 255, 0.4);
}

:root[data-theme-mode='day'] .chat-row.assistant .chat-bubble {
  border-color: rgba(230, 120, 170, 0.4);
  background: rgba(255, 214, 232, 0.55);
}

:root[data-theme-mode='day'] .composer-input {
  background: rgba(255, 255, 255, 0.85);
  border-color: rgba(120, 80, 110, 0.24);
  color: #402334;
}

:root[data-theme-mode='day'] .error-banner {
  border-color: rgba(220, 90, 120, 0.5);
  background: rgba(255, 210, 220, 0.6);
  color: #9c2f4a;
}

@media (max-width: 1200px) {
  .meguri-grid {
    grid-template-columns: minmax(260px, 360px) minmax(0, 1fr);
  }
}

@media (max-width: 900px) {
  .meguri-grid {
    grid-template-columns: 1fr;
  }

  .meguri-stage {
    min-height: 380px;
  }

  .meguri-dialog {
    min-height: 460px;
  }
}
</style>
