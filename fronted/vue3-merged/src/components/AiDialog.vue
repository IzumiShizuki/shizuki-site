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
        <button class="icon-btn ripple-trigger" type="button" title="重置当前模式会话" @click="resetActiveModeSession">
          <i class="fas fa-rotate-right"></i>
        </button>
        <div class="dialog-title">
          <span>AI 对话</span>
          <small>{{ activeModeMeta.caption }}</small>
        </div>
        <button class="icon-btn close-btn ripple-trigger" type="button" title="收起" @click="emitClose">
          <i class="fas fa-minus"></i>
        </button>
      </header>

      <nav class="mode-switcher" aria-label="AI chat modes">
        <button
          v-for="item in CHAT_MODE_OPTIONS"
          :key="item.value"
          class="mode-chip ripple-trigger"
          :class="{ active: activeChatMode === item.value }"
          type="button"
          @click="setActiveChatMode(item.value)"
        >
          <span>{{ item.label }}</span>
          <small>{{ item.kicker }}</small>
        </button>
      </nav>

      <section class="session-summary">
        <div class="summary-copy">
          <strong>{{ activeModeMeta.title }}</strong>
          <p>{{ modeSummaryText }}</p>
        </div>
        <div class="summary-pills">
          <span class="summary-pill">{{ auth.isAuthenticated.value ? '已登录会话' : '游客临时会话' }}</span>
          <span v-if="quotaLabel" class="summary-pill accent">{{ quotaLabel }}</span>
        </div>
      </section>

      <section v-if="activeChatMode === 'tavern'" class="mode-config liquid-material">
        <label class="config-field">
          <span>角色 ID</span>
          <input v-model.trim="activeState.config.characterId" type="text" maxlength="20" placeholder="如 1001" />
        </label>
        <label class="config-field">
          <span>世界书 IDs</span>
          <input v-model.trim="activeState.config.worldbookIdsText" type="text" maxlength="120" placeholder="如 11,12" />
        </label>
        <label class="config-field config-field-full">
          <span>场景设定</span>
          <textarea
            v-model.trim="activeState.config.scenePrompt"
            rows="2"
            maxlength="600"
            placeholder="例如：深夜图书馆，落地灯很暖，外面正在下雨。"
          ></textarea>
        </label>
        <label class="config-toggle">
          <input v-model="activeState.config.memoryEnabled" type="checkbox" />
          <span>发送时带上记忆开关与 scope_id 契约</span>
        </label>
      </section>

      <section v-else class="mode-note">
        <p>{{ activeModeMeta.note }}</p>
      </section>

      <div class="chat-stream">
        <div v-if="!activeState.messages.length" class="empty-state">
          <strong>{{ activeModeMeta.emptyTitle }}</strong>
          <p>{{ activeModeMeta.emptyBody }}</p>
        </div>

        <article
          v-for="message in activeState.messages"
          :key="message.id"
          class="chat-row"
          :class="[message.role, { pending: message.pending, failed: message.failed }]"
        >
          <div class="bubble-meta">{{ messageRoleLabel(message.role) }}</div>
          <div class="chat-bubble">
            <p>{{ message.content }}</p>
            <span v-if="message.pending" class="bubble-tag">发送中...</span>
            <span v-else-if="message.failed" class="bubble-tag error">发送失败</span>
          </div>
        </article>

        <div v-if="activeState.pending" class="typing-row">
          <span class="typing-dot"></span>
          <span class="typing-dot"></span>
          <span class="typing-dot"></span>
        </div>
      </div>

      <p v-if="activeState.errorText" class="error-banner">{{ activeState.errorText }}</p>

      <footer class="chat-input-wrap">
        <textarea
          v-model="activeState.draft"
          class="chat-input"
          rows="3"
          maxlength="1200"
          :placeholder="activeModeMeta.placeholder"
          @keydown.enter.exact.prevent="submitActiveMessage"
        ></textarea>
        <button class="send-btn ripple-trigger" type="button" :disabled="!canSendActiveMessage" @click="submitActiveMessage">
          <i class="fas fa-paper-plane"></i>
        </button>
      </footer>
    </section>
  </motion.aside>
</template>

<script setup>
import { computed, reactive, ref, watch } from 'vue';
import { motion, useReducedMotion } from 'motion-v';
import { useAuthSession } from '../composables/useAuthSession';
import { createAiSession, getMyAiQuota, sendAiMessage } from '../services/aiApi';

const CHAT_MODE_OPTIONS = [
  {
    value: 'quick_chat',
    label: '快聊',
    kicker: 'Quick',
    title: '顶部快聊',
    caption: 'Quick Chat',
    note: '快聊保持轻量，不要求角色设定，也不会强制你进入 AI Hub 的完整路线。',
    placeholder: '说一句话试试看...',
    emptyTitle: '快聊适合短问短答',
    emptyBody: '首条消息发送时会自动创建临时会话。'
  },
  {
    value: 'normal',
    label: '普通对话',
    kicker: 'Normal',
    title: '普通对话模式',
    caption: 'Normal Mode',
    note: '普通对话只保留当前会话上下文，适合日常问答、一次性任务和轻陪伴。',
    placeholder: '输入你的问题或任务...',
    emptyTitle: '普通对话已接入共享聊天壳',
    emptyBody: '这里会创建 normal 模式会话，后续权限和配额 bead 会继续收口。'
  },
  {
    value: 'tavern',
    label: '酒馆模式',
    kicker: 'Tavern',
    title: '酒馆模式',
    caption: 'Tavern Mode',
    note: '酒馆模式与普通对话共享壳层，但额外携带角色、世界书和场景设定契约。',
    placeholder: '对角色说一句话，或描述你想进入的场景...',
    emptyTitle: '酒馆模式已支持基础契约',
    emptyBody: '现在可以先填角色 ID、世界书 IDs 和场景设定，后续 bead 会把管理页补齐。'
  }
];

let messageSequence = 0;

function toNumber(value) {
  const normalized = Number(value);
  return Number.isFinite(normalized) ? normalized : 0;
}

function normalizeOptionalText(value) {
  const normalized = String(value || '').trim();
  return normalized || '';
}

function normalizeChatMode(value) {
  const normalized = String(value || '').trim().toLowerCase();
  if (normalized === 'normal' || normalized === 'tavern') return normalized;
  return 'quick_chat';
}

function parseCsvIds(raw) {
  return String(raw || '')
    .split(',')
    .map((item) => Number.parseInt(item.trim(), 10))
    .filter((item) => Number.isFinite(item) && item > 0)
    .filter((item, index, list) => list.indexOf(item) === index)
    .slice(0, 20);
}

function createModeState(mode) {
  return {
    mode,
    sessionId: '',
    title: '',
    draft: '',
    pending: false,
    errorText: '',
    messages: [],
    config: {
      characterId: '',
      worldbookIdsText: '',
      scenePrompt: '',
      memoryEnabled: mode === 'tavern'
    }
  };
}

function createMessage(role, content, options = {}) {
  messageSequence += 1;
  return {
    id: `${role}-${messageSequence}`,
    role,
    content: String(content || ''),
    pending: Boolean(options.pending),
    failed: Boolean(options.failed)
  };
}

function normalizeSessionSummary(raw = {}) {
  const worldbookIds = Array.isArray(raw.worldbookIds || raw.worldbook_ids)
    ? (raw.worldbookIds || raw.worldbook_ids)
        .map((item) => Number.parseInt(item, 10))
        .filter((item) => Number.isFinite(item) && item > 0)
    : [];
  return {
    sessionId: String(raw.sessionId || raw.session_id || '').trim(),
    title: String(raw.title || '').trim(),
    mode: normalizeChatMode(raw.mode),
    characterId: toNumber(raw.characterId ?? raw.character_id),
    worldbookIds,
    scenePrompt: normalizeOptionalText(raw.scenePrompt ?? raw.scene_prompt)
  };
}

function normalizeSendResponse(raw = {}) {
  return {
    sessionId: String(raw.sessionId || raw.session_id || '').trim(),
    assistantMessage: normalizeOptionalText(raw.assistantMessage ?? raw.assistant_message),
    remainingRounds: raw.remainingRounds ?? raw.remaining_rounds,
    totalRounds: raw.totalRounds ?? raw.total_rounds,
    usedRounds: raw.usedRounds ?? raw.used_rounds
  };
}

function normalizeQuota(raw = {}) {
  const total = toNumber(raw.total);
  const used = toNumber(raw.used);
  const remaining = raw.remaining == null ? Math.max(0, total - used) : toNumber(raw.remaining);
  return {
    total,
    used,
    remaining
  };
}

function buildSessionTitle(mode, existingTitle, openingMessage) {
  const normalizedExisting = normalizeOptionalText(existingTitle);
  if (normalizedExisting) return normalizedExisting;
  const normalizedOpening = normalizeOptionalText(openingMessage);
  if (!normalizedOpening) {
    return mode === 'tavern' ? '酒馆模式会话' : mode === 'normal' ? '普通对话会话' : '快聊会话';
  }
  return normalizedOpening.slice(0, 24);
}

const props = defineProps({
  visible: {
    type: Boolean,
    default: false
  },
  mode: {
    type: String,
    default: 'sidebar',
    validator: (value) => value === 'sidebar' || value === 'sheet'
  },
  chatMode: {
    type: String,
    default: 'quick_chat'
  }
});

const emit = defineEmits(['close']);
const prefersReducedMotion = useReducedMotion();
const auth = useAuthSession();

const activeChatMode = ref('quick_chat');
const quota = ref(null);
const sessionStateByMode = reactive({
  quick_chat: createModeState('quick_chat'),
  normal: createModeState('normal'),
  tavern: createModeState('tavern')
});

const activeState = computed(() => sessionStateByMode[activeChatMode.value]);
const activeModeMeta = computed(() => CHAT_MODE_OPTIONS.find((item) => item.value === activeChatMode.value) || CHAT_MODE_OPTIONS[0]);
const canSendActiveMessage = computed(() => normalizeOptionalText(activeState.value.draft) && !activeState.value.pending);
const quotaLabel = computed(() => {
  if (!quota.value || !Number.isFinite(quota.value.remaining)) return '';
  return `剩余 ${quota.value.remaining}/${quota.value.total}`;
});
const modeSummaryText = computed(() => {
  const state = activeState.value;
  const parts = [];
  if (state.sessionId) {
    parts.push(`会话 ${state.sessionId}`);
  } else {
    parts.push('首条消息发送时自动创建会话');
  }
  if (activeChatMode.value === 'tavern') {
    const characterId = normalizeOptionalText(state.config.characterId);
    const worldbookIds = parseCsvIds(state.config.worldbookIdsText);
    parts.push(characterId ? `角色 ${characterId}` : '角色未绑定');
    parts.push(worldbookIds.length ? `世界书 ${worldbookIds.join(', ')}` : '世界书未绑定');
  }
  return parts.join(' · ');
});

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

watch(
  () => props.chatMode,
  (nextValue) => {
    activeChatMode.value = normalizeChatMode(nextValue);
  },
  { immediate: true }
);

watch(
  () => auth.isAuthenticated.value,
  async (authenticated) => {
    if (!authenticated) {
      quota.value = null;
      return;
    }
    await refreshQuota();
  },
  { immediate: true }
);

function emitClose() {
  emit('close');
}

function setActiveChatMode(mode) {
  activeChatMode.value = normalizeChatMode(mode);
}

function resetActiveModeSession() {
  const mode = activeChatMode.value;
  sessionStateByMode[mode] = createModeState(mode);
}

function syncStateFromSessionSummary(state, rawSummary) {
  const summary = normalizeSessionSummary(rawSummary);
  if (summary.sessionId) state.sessionId = summary.sessionId;
  if (summary.title) state.title = summary.title;
  if (summary.characterId > 0) state.config.characterId = String(summary.characterId);
  if (summary.worldbookIds.length) state.config.worldbookIdsText = summary.worldbookIds.join(', ');
  if (summary.scenePrompt) state.config.scenePrompt = summary.scenePrompt;
}

async function refreshQuota() {
  if (!auth.isAuthenticated.value) return;
  try {
    quota.value = normalizeQuota(await getMyAiQuota(auth.authorizedFetch));
  } catch (error) {
    quota.value = null;
    console.warn('load ai quota failed', error);
  }
}

async function ensureSession(state, openingMessage) {
  if (normalizeOptionalText(state.sessionId)) return;

  const payload = {
    title: buildSessionTitle(state.mode, state.title, openingMessage),
    mode: state.mode
  };

  if (state.mode === 'tavern') {
    const characterId = Number.parseInt(state.config.characterId, 10);
    const worldbookIds = parseCsvIds(state.config.worldbookIdsText);
    if (Number.isFinite(characterId) && characterId > 0) {
      payload.characterId = characterId;
    }
    if (worldbookIds.length) {
      payload.worldbookIds = worldbookIds;
    }
    if (normalizeOptionalText(state.config.scenePrompt)) {
      payload.scenePrompt = normalizeOptionalText(state.config.scenePrompt);
    }
  }

  const summary = await createAiSession(payload, auth.isAuthenticated.value ? auth.authorizedFetch : undefined);
  syncStateFromSessionSummary(state, summary);
}

function toContextMessages(messages) {
  return messages
    .filter((item) => !item.failed)
    .map((item) => ({
      role: item.role,
      content: item.content
    }))
    .slice(-40);
}

function resolveErrorMessage(error) {
  if (error instanceof Error && normalizeOptionalText(error.message)) {
    return error.message;
  }
  return '消息发送失败，请稍后再试。';
}

async function submitActiveMessage() {
  const state = activeState.value;
  const draft = normalizeOptionalText(state.draft);
  if (!draft || state.pending) return;

  state.errorText = '';
  const pendingMessage = createMessage('user', draft, { pending: true });
  const context = toContextMessages(state.messages);
  state.messages.push(pendingMessage);
  state.draft = '';
  state.pending = true;

  try {
    await ensureSession(state, draft);
    const response = normalizeSendResponse(
      await sendAiMessage(
        state.sessionId,
        {
          message: draft,
          context,
          memoryEnabled: Boolean(state.config.memoryEnabled),
          scopeId: normalizeOptionalText(state.sessionId || `${state.mode}-scope`)
        },
        auth.isAuthenticated.value ? auth.authorizedFetch : undefined
      )
    );

    pendingMessage.pending = false;
    if (!state.title) {
      state.title = buildSessionTitle(state.mode, state.title, draft);
    }
    if (response.assistantMessage) {
      state.messages.push(createMessage('assistant', response.assistantMessage));
    }
    if (Number.isFinite(Number(response.remainingRounds))) {
      quota.value = normalizeQuota({
        total: response.totalRounds,
        used: response.usedRounds,
        remaining: response.remainingRounds
      });
    }
  } catch (error) {
    pendingMessage.pending = false;
    pendingMessage.failed = true;
    state.errorText = resolveErrorMessage(error);
  } finally {
    state.pending = false;
  }
}

function messageRoleLabel(role) {
  if (role === 'assistant') return 'Assistant';
  if (role === 'system') return 'System';
  return 'You';
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
  --liquid-bg: linear-gradient(180deg, rgba(19, 27, 42, 0.86), rgba(11, 17, 28, 0.82));
  --liquid-border: rgba(255, 255, 255, 0.14);
  --liquid-shadow: 0 18px 44px rgba(4, 7, 16, 0.34);
  position: relative;
  width: 100%;
  height: 100%;
  border-radius: 20px;
  padding: 12px;
  display: flex;
  flex-direction: column;
  gap: 12px;
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
  max-height: min(92vh, 920px);
  height: min(92vh, 920px);
  box-shadow: 0 -12px 36px rgba(8, 10, 16, 0.42);
}

.ai-dialog-header {
  display: grid;
  grid-template-columns: auto 1fr auto;
  align-items: center;
  gap: 10px;
}

.dialog-title {
  display: grid;
  justify-items: center;
  gap: 2px;
}

.dialog-title span {
  color: rgba(244, 248, 255, 0.94);
  font-size: 14px;
  font-weight: 700;
  letter-spacing: 0.04em;
}

.dialog-title small {
  color: rgba(198, 211, 237, 0.78);
  font-size: 11px;
  letter-spacing: 0.1em;
  text-transform: uppercase;
}

.icon-btn {
  width: 30px;
  height: 30px;
  border: 0;
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.08);
  color: rgba(231, 238, 250, 0.88);
  cursor: pointer;
  transition: background-color 0.2s ease, color 0.2s ease;
}

.icon-btn:hover {
  background: rgba(var(--accent-rgb), 0.22);
  color: rgba(255, 255, 255, 0.98);
}

.mode-switcher {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 8px;
}

.mode-chip {
  border: 1px solid rgba(255, 255, 255, 0.1);
  border-radius: 14px;
  padding: 10px 12px;
  background: rgba(255, 255, 255, 0.04);
  color: rgba(233, 240, 253, 0.9);
  display: grid;
  gap: 2px;
  text-align: left;
  cursor: pointer;
  transition: transform 0.2s ease, border-color 0.2s ease, background-color 0.2s ease;
}

.mode-chip span {
  font-size: 13px;
  font-weight: 700;
}

.mode-chip small {
  font-size: 10px;
  letter-spacing: 0.12em;
  text-transform: uppercase;
  color: rgba(190, 204, 231, 0.72);
}

.mode-chip.active {
  background: linear-gradient(140deg, rgba(var(--accent-rgb), 0.24), rgba(255, 255, 255, 0.08));
  border-color: rgba(var(--accent-rgb), 0.42);
  transform: translateY(-1px);
}

.session-summary {
  border-radius: 16px;
  padding: 12px 14px;
  background: rgba(255, 255, 255, 0.05);
  border: 1px solid rgba(255, 255, 255, 0.08);
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
}

.summary-copy {
  display: grid;
  gap: 4px;
}

.summary-copy strong {
  color: rgba(248, 251, 255, 0.95);
  font-size: 14px;
}

.summary-copy p {
  margin: 0;
  color: rgba(205, 217, 239, 0.82);
  font-size: 12px;
  line-height: 1.5;
}

.summary-pills {
  display: flex;
  flex-wrap: wrap;
  justify-content: flex-end;
  gap: 8px;
}

.summary-pill {
  padding: 6px 10px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.07);
  color: rgba(233, 241, 255, 0.86);
  font-size: 11px;
}

.summary-pill.accent {
  background: rgba(var(--accent-rgb), 0.16);
  color: rgba(255, 255, 255, 0.96);
}

.mode-config {
  border-radius: 18px;
  padding: 14px;
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 12px;
}

.config-field {
  display: grid;
  gap: 6px;
}

.config-field span,
.config-toggle span {
  color: rgba(214, 225, 245, 0.82);
  font-size: 12px;
}

.config-field input,
.config-field textarea,
.chat-input {
  width: 100%;
  border: 1px solid rgba(255, 255, 255, 0.12);
  border-radius: 14px;
  padding: 10px 12px;
  background: rgba(7, 13, 22, 0.34);
  color: rgba(246, 250, 255, 0.96);
  outline: none;
  resize: none;
}

.config-field-full {
  grid-column: 1 / -1;
}

.config-toggle {
  grid-column: 1 / -1;
  display: flex;
  align-items: center;
  gap: 8px;
}

.mode-note {
  padding: 0 2px;
}

.mode-note p {
  margin: 0;
  color: rgba(198, 211, 237, 0.78);
  font-size: 12px;
  line-height: 1.6;
}

.chat-stream {
  flex: 1;
  min-height: 0;
  display: flex;
  flex-direction: column;
  gap: 12px;
  padding: 4px 2px 2px;
  overflow-y: auto;
}

.empty-state {
  margin: auto 0;
  padding: 18px;
  border: 1px dashed rgba(255, 255, 255, 0.16);
  border-radius: 18px;
  background: rgba(255, 255, 255, 0.03);
  display: grid;
  gap: 8px;
}

.empty-state strong {
  color: rgba(247, 251, 255, 0.94);
}

.empty-state p {
  margin: 0;
  color: rgba(203, 216, 239, 0.78);
  line-height: 1.6;
}

.chat-row {
  display: grid;
  gap: 6px;
}

.chat-row.user {
  justify-items: end;
}

.bubble-meta {
  font-size: 10px;
  letter-spacing: 0.12em;
  text-transform: uppercase;
  color: rgba(178, 194, 223, 0.68);
}

.chat-bubble {
  max-width: min(100%, 360px);
  border-radius: 18px;
  padding: 12px 14px;
  background: rgba(255, 255, 255, 0.07);
  border: 1px solid rgba(255, 255, 255, 0.08);
  display: grid;
  gap: 8px;
}

.chat-row.user .chat-bubble {
  background: linear-gradient(145deg, rgba(var(--accent-rgb), 0.22), rgba(var(--accent-rgb), 0.12));
  border-color: rgba(var(--accent-rgb), 0.3);
}

.chat-row.failed .chat-bubble {
  border-color: rgba(255, 96, 96, 0.32);
}

.chat-bubble p {
  margin: 0;
  color: rgba(243, 247, 255, 0.94);
  line-height: 1.65;
  white-space: pre-wrap;
  word-break: break-word;
}

.bubble-tag {
  font-size: 11px;
  color: rgba(200, 214, 239, 0.72);
}

.bubble-tag.error {
  color: rgba(255, 164, 164, 0.9);
}

.typing-row {
  display: flex;
  align-items: center;
  gap: 6px;
  padding: 0 4px;
}

.typing-dot {
  width: 8px;
  height: 8px;
  border-radius: 50%;
  background: rgba(var(--accent-rgb), 0.72);
  animation: ai-typing 0.8s ease-in-out infinite;
}

.typing-dot:nth-child(2) {
  animation-delay: 0.12s;
}

.typing-dot:nth-child(3) {
  animation-delay: 0.24s;
}

.error-banner {
  margin: 0;
  padding: 10px 12px;
  border-radius: 12px;
  background: rgba(255, 110, 110, 0.12);
  border: 1px solid rgba(255, 120, 120, 0.2);
  color: rgba(255, 190, 190, 0.96);
  font-size: 12px;
}

.chat-input-wrap {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 10px;
  align-items: end;
}

.chat-input {
  min-height: 66px;
  max-height: 180px;
}

.send-btn {
  width: 42px;
  height: 42px;
  border: 0;
  border-radius: 14px;
  background: rgba(var(--accent-rgb), 0.24);
  color: rgba(247, 241, 255, 0.95);
  cursor: pointer;
  transition: background-color 0.2s ease, color 0.2s ease, transform 0.2s ease;
}

.send-btn:hover:not(:disabled) {
  background: rgba(var(--accent-rgb), 0.38);
  color: rgb(var(--accent-strong-rgb));
  transform: translateY(-1px);
}

.send-btn:disabled {
  cursor: not-allowed;
  opacity: 0.54;
}

@keyframes ai-typing {
  0%,
  80%,
  100% {
    transform: translateY(0);
    opacity: 0.45;
  }

  40% {
    transform: translateY(-4px);
    opacity: 1;
  }
}

@media (max-width: 900px) {
  .mode-sheet .ai-dialog {
    max-height: 100dvh;
    height: 100dvh;
    border-radius: 0;
  }

  .mode-switcher,
  .mode-config {
    grid-template-columns: 1fr;
  }

  .session-summary {
    align-items: flex-start;
    flex-direction: column;
  }

  .summary-pills {
    justify-content: flex-start;
  }
}
</style>
