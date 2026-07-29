<template>
  <aside class="ai-session-rail" :class="{ collapsed }">
    <header class="rail-head">
      <button class="new-chat-btn ripple-trigger" type="button" @click="emitNewChat">
        <i class="fas fa-plus" aria-hidden="true"></i>
        <span>开启新对话</span>
      </button>
      <button
        class="rail-collapse-btn ripple-trigger"
        type="button"
        :title="collapsed ? '展开会话列表' : '收起会话列表'"
        @click="collapsed = !collapsed"
      >
        <i :class="collapsed ? 'fas fa-angles-right' : 'fas fa-angles-left'" aria-hidden="true"></i>
      </button>
    </header>

    <div v-if="!collapsed" class="rail-body">
      <p v-if="!auth.isAuthenticated.value" class="rail-hint">
        登录后会话会自动保存，可以随时回来继续聊。
        <button class="rail-link-btn" type="button" @click="goLogin">前往登录</button>
      </p>

      <template v-else>
        <div class="rail-toolbar">
          <span class="rail-count">{{ sessions.length ? `${sessions.length} 个会话` : '还没有会话' }}</span>
          <button
            class="rail-refresh-btn ripple-trigger"
            type="button"
            :disabled="loading"
            title="刷新列表"
            @click="refresh()"
          >
            <i class="fas fa-rotate-right" :class="{ spinning: loading }" aria-hidden="true"></i>
          </button>
        </div>

        <p v-if="errorText" class="rail-error">{{ errorText }}</p>

        <div v-if="loading && !sessions.length" class="rail-skeleton">
          <span v-for="index in 4" :key="index" class="skeleton-line"></span>
        </div>

        <p v-else-if="!sessions.length" class="rail-hint">发送第一条消息后，会话会出现在这里。</p>

        <nav v-else class="rail-groups" aria-label="AI 会话列表">
          <section v-for="group in groupedSessions" :key="group.key" class="rail-group">
            <span class="group-label">{{ group.label }}</span>
            <article
              v-for="session in group.sessions"
              :key="session.sessionId"
              class="session-item"
              :class="{ active: session.sessionId === activeSessionId }"
            >
              <template v-if="renamingSessionId === session.sessionId">
                <form class="rename-form" @submit.prevent="submitRename(session)">
                  <input
                    ref="renameInputRef"
                    v-model.trim="renameDraft"
                    type="text"
                    maxlength="60"
                    @keydown.esc.prevent="cancelRename"
                  />
                  <button class="item-icon-btn" type="submit" title="保存"><i class="fas fa-check"></i></button>
                  <button class="item-icon-btn" type="button" title="取消" @click="cancelRename"><i class="fas fa-xmark"></i></button>
                </form>
              </template>

              <template v-else-if="deletingSessionId === session.sessionId">
                <div class="delete-confirm">
                  <span>删除该会话？</span>
                  <button class="item-icon-btn danger" type="button" title="确认删除" @click="submitDelete(session)">
                    <i class="fas fa-check"></i>
                  </button>
                  <button class="item-icon-btn" type="button" title="取消" @click="deletingSessionId = ''">
                    <i class="fas fa-xmark"></i>
                  </button>
                </div>
              </template>

              <template v-else>
                <button class="session-main ripple-trigger" type="button" @click="emitSelect(session)">
                  <span class="session-title">{{ session.title || '未命名会话' }}</span>
                  <span class="session-meta">
                    <span class="mode-pill" :class="`mode-${session.mode}`">{{ modeLabel(session.mode) }}</span>
                  </span>
                </button>
                <div class="session-actions">
                  <button class="item-icon-btn" type="button" title="重命名" @click="startRename(session)">
                    <i class="fas fa-pen"></i>
                  </button>
                  <button class="item-icon-btn danger" type="button" title="删除" @click="deletingSessionId = session.sessionId">
                    <i class="fas fa-trash-can"></i>
                  </button>
                </div>
              </template>
            </article>
          </section>
        </nav>
      </template>
    </div>
  </aside>
</template>

<script setup>
import { computed, nextTick, onMounted, ref, watch } from 'vue';
import { useAuthSession } from '../composables/useAuthSession';
import { deleteAiSession, listAiSessions, listAiSessionSummaries, renameAiSession } from '../services/aiApi';
import { groupAiSessionsByRecency } from '../utils/aiChatMarkdown';

const props = defineProps({
  activeSessionId: {
    type: String,
    default: ''
  }
});

const emit = defineEmits(['select', 'new-chat', 'changed']);

const MODE_LABELS = {
  quick_chat: '快聊',
  normal: '普通',
  tavern: '酒馆',
  town_npc: 'NPC',
  companion: '自宅'
};

const auth = useAuthSession();
const collapsed = ref(false);
const loading = ref(false);
const errorText = ref('');
const sessions = ref([]);
const renamingSessionId = ref('');
const renameDraft = ref('');
const deletingSessionId = ref('');
const renameInputRef = ref(null);

const groupedSessions = computed(() => groupAiSessionsByRecency(sessions.value));

function modeLabel(mode) {
  return MODE_LABELS[String(mode || '').trim()] || '对话';
}

function normalizeSessionSummary(raw = {}) {
  const rawUpdatedMs = Number(raw.updatedAtEpochMs ?? raw.updated_at_epoch_ms);
  return {
    sessionId: String(raw.sessionId || raw.session_id || '').trim(),
    title: String(raw.title || '').trim(),
    mode: String(raw.mode || 'quick_chat').trim().toLowerCase(),
    characterId: Number(raw.characterId ?? raw.character_id) || 0,
    worldbookIds: Array.isArray(raw.worldbookIds || raw.worldbook_ids) ? (raw.worldbookIds || raw.worldbook_ids) : [],
    scenePrompt: String(raw.scenePrompt || raw.scene_prompt || '').trim(),
    townRoomCode: String(raw.townRoomCode || raw.town_room_code || '').trim(),
    actorCode: String(raw.actorCode || raw.actor_code || '').trim(),
    updatedAtMs: Number.isFinite(rawUpdatedMs) && rawUpdatedMs > 0 ? rawUpdatedMs : 0
  };
}

async function refresh(options = {}) {
  if (!auth.isAuthenticated.value) {
    sessions.value = [];
    return;
  }
  if (loading.value) return;
  loading.value = true;
  if (!options.silent) {
    errorText.value = '';
  }
  try {
    let payload;
    try {
      // 优先用带 updatedAt 时间戳的接口，让列表能按最近程度分组。
      payload = await listAiSessionSummaries(auth.authorizedFetch);
    } catch (summariesError) {
      // 旧部署没有该接口时回退到基础会话列表（无时间戳，收敛成「最近会话」一组）。
      const status = Number(summariesError?.status);
      if (status === 404 || status === 405 || status === 501) {
        payload = await listAiSessions(auth.authorizedFetch);
      } else {
        throw summariesError;
      }
    }
    sessions.value = (Array.isArray(payload) ? payload : [])
      .map(normalizeSessionSummary)
      .filter((item) => item.sessionId);
  } catch (error) {
    errorText.value = error instanceof Error && error.message ? error.message : '会话列表加载失败。';
  } finally {
    loading.value = false;
  }
}

function emitSelect(session) {
  emit('select', { ...session });
}

function emitNewChat() {
  emit('new-chat');
}

function goLogin() {
  auth.redirectToAuth('login_required', '/ai-hub');
}

function startRename(session) {
  renamingSessionId.value = session.sessionId;
  renameDraft.value = session.title || '';
  deletingSessionId.value = '';
  void nextTick(() => {
    const input = Array.isArray(renameInputRef.value) ? renameInputRef.value[0] : renameInputRef.value;
    input?.focus?.();
    input?.select?.();
  });
}

function cancelRename() {
  renamingSessionId.value = '';
  renameDraft.value = '';
}

async function submitRename(session) {
  const title = renameDraft.value.trim();
  if (!title) {
    cancelRename();
    return;
  }
  try {
    await renameAiSession(session.sessionId, title, auth.authorizedFetch);
    const target = sessions.value.find((item) => item.sessionId === session.sessionId);
    if (target) {
      target.title = title;
    }
    emit('changed', { type: 'renamed', sessionId: session.sessionId, title });
  } catch (error) {
    errorText.value = error instanceof Error && error.message ? error.message : '重命名失败。';
  } finally {
    cancelRename();
  }
}

async function submitDelete(session) {
  try {
    await deleteAiSession(session.sessionId, auth.authorizedFetch);
    sessions.value = sessions.value.filter((item) => item.sessionId !== session.sessionId);
    emit('changed', { type: 'deleted', sessionId: session.sessionId });
  } catch (error) {
    errorText.value = error instanceof Error && error.message ? error.message : '删除失败。';
  } finally {
    deletingSessionId.value = '';
  }
}

watch(
  () => auth.isAuthenticated.value,
  (authenticated) => {
    if (authenticated) {
      void refresh();
    } else {
      sessions.value = [];
    }
  }
);

onMounted(async () => {
  await auth.ensureReady();
  await refresh();
});

defineExpose({ refresh });
</script>

<style scoped>
.ai-session-rail {
  display: flex;
  flex-direction: column;
  gap: 12px;
  min-height: 0;
  min-width: 0;
}

.rail-head {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 8px;
  align-items: center;
}

.new-chat-btn {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 8px;
  padding: 11px 14px;
  border: 1px solid rgba(var(--accent-rgb), 0.34);
  border-radius: 14px;
  background: linear-gradient(140deg, rgba(var(--accent-rgb), 0.24), rgba(255, 255, 255, 0.06));
  color: rgba(247, 251, 255, 0.96);
  font-weight: 700;
  font-size: 13px;
  cursor: pointer;
  transition: transform 0.18s ease, background-color 0.18s ease;
}

.new-chat-btn:hover {
  transform: translateY(-1px);
  background: rgba(var(--accent-rgb), 0.32);
}

.collapsed .new-chat-btn span {
  display: none;
}

.rail-collapse-btn,
.rail-refresh-btn {
  width: 34px;
  height: 34px;
  border: 1px solid rgba(255, 255, 255, 0.1);
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.05);
  color: rgba(206, 220, 243, 0.85);
  cursor: pointer;
  transition: background-color 0.18s ease, color 0.18s ease;
}

.rail-collapse-btn:hover,
.rail-refresh-btn:hover:not(:disabled) {
  background: rgba(var(--accent-rgb), 0.2);
  color: rgba(247, 251, 255, 0.96);
}

.rail-refresh-btn:disabled {
  opacity: 0.5;
  cursor: default;
}

.rail-refresh-btn .spinning {
  animation: rail-spin 0.9s linear infinite;
}

.rail-body {
  display: flex;
  flex-direction: column;
  gap: 10px;
  min-height: 0;
  overflow-y: auto;
  padding-right: 2px;
}

.rail-toolbar {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.rail-count {
  font-size: 11px;
  letter-spacing: 0.08em;
  color: rgba(178, 194, 223, 0.66);
}

.rail-hint {
  margin: 0;
  padding: 12px;
  border: 1px dashed rgba(255, 255, 255, 0.14);
  border-radius: 14px;
  background: rgba(255, 255, 255, 0.03);
  color: rgba(203, 216, 239, 0.8);
  font-size: 12px;
  line-height: 1.7;
}

.rail-link-btn {
  border: 0;
  padding: 0;
  margin-left: 4px;
  background: transparent;
  color: rgb(var(--accent-strong-rgb));
  font-size: 12px;
  cursor: pointer;
}

.rail-error {
  margin: 0;
  padding: 8px 10px;
  border-radius: 10px;
  background: rgba(255, 110, 110, 0.12);
  border: 1px solid rgba(255, 120, 120, 0.2);
  color: rgba(255, 190, 190, 0.95);
  font-size: 12px;
}

.rail-skeleton {
  display: grid;
  gap: 8px;
}

.skeleton-line {
  height: 40px;
  border-radius: 12px;
  background: linear-gradient(100deg, rgba(255, 255, 255, 0.04) 30%, rgba(255, 255, 255, 0.1) 50%, rgba(255, 255, 255, 0.04) 70%);
  background-size: 220% 100%;
  animation: rail-shimmer 1.3s ease-in-out infinite;
}

.rail-groups {
  display: grid;
  gap: 12px;
}

.rail-group {
  display: grid;
  gap: 6px;
}

.group-label {
  padding: 0 4px;
  font-size: 10px;
  letter-spacing: 0.14em;
  text-transform: uppercase;
  color: rgba(164, 182, 213, 0.6);
}

.session-item {
  position: relative;
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  align-items: center;
  gap: 6px;
  border-radius: 13px;
  border: 1px solid transparent;
  transition: background-color 0.16s ease, border-color 0.16s ease;
}

.session-item:hover {
  background: rgba(255, 255, 255, 0.05);
}

.session-item.active {
  background: rgba(var(--accent-rgb), 0.16);
  border-color: rgba(var(--accent-rgb), 0.3);
}

.session-main {
  min-width: 0;
  display: grid;
  gap: 3px;
  padding: 9px 10px;
  border: 0;
  border-radius: 13px;
  background: transparent;
  color: inherit;
  text-align: left;
  cursor: pointer;
}

.session-title {
  font-size: 13px;
  color: rgba(238, 245, 255, 0.94);
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.session-meta {
  display: inline-flex;
  gap: 6px;
}

.mode-pill {
  padding: 1px 8px;
  border-radius: 999px;
  font-size: 10px;
  background: rgba(255, 255, 255, 0.07);
  border: 1px solid rgba(255, 255, 255, 0.09);
  color: rgba(198, 213, 238, 0.8);
}

.mode-pill.mode-tavern {
  background: rgba(255, 190, 118, 0.14);
  border-color: rgba(255, 190, 118, 0.26);
  color: rgba(255, 218, 176, 0.92);
}

.mode-pill.mode-town_npc {
  background: rgba(140, 220, 255, 0.12);
  border-color: rgba(140, 220, 255, 0.24);
  color: rgba(186, 232, 255, 0.92);
}

.mode-pill.mode-companion {
  background: rgba(255, 150, 200, 0.12);
  border-color: rgba(255, 150, 200, 0.26);
  color: rgba(255, 199, 226, 0.92);
}

.session-actions {
  display: inline-flex;
  gap: 4px;
  padding-right: 8px;
  opacity: 0;
  transition: opacity 0.16s ease;
}

.session-item:hover .session-actions,
.session-item:focus-within .session-actions {
  opacity: 1;
}

.item-icon-btn {
  width: 24px;
  height: 24px;
  border: 1px solid rgba(255, 255, 255, 0.1);
  border-radius: 8px;
  background: rgba(255, 255, 255, 0.05);
  color: rgba(205, 219, 242, 0.82);
  font-size: 10px;
  cursor: pointer;
  transition: background-color 0.16s ease, color 0.16s ease;
}

.item-icon-btn:hover {
  background: rgba(var(--accent-rgb), 0.22);
  color: rgba(247, 251, 255, 0.98);
}

.item-icon-btn.danger:hover {
  background: rgba(255, 110, 110, 0.22);
  color: rgba(255, 210, 210, 0.98);
}

.rename-form,
.delete-confirm {
  grid-column: 1 / -1;
  display: flex;
  align-items: center;
  gap: 6px;
  padding: 7px 8px;
}

.rename-form input {
  flex: 1;
  min-width: 0;
  padding: 6px 9px;
  border-radius: 9px;
  border: 1px solid rgba(var(--accent-rgb), 0.34);
  background: rgba(8, 12, 22, 0.6);
  color: rgba(240, 246, 255, 0.95);
  font-size: 12px;
}

.delete-confirm {
  justify-content: space-between;
  font-size: 12px;
  color: rgba(255, 200, 200, 0.9);
}

:root[data-theme-mode='day'] .new-chat-btn {
  background: linear-gradient(140deg, rgba(var(--accent-rgb), 0.16), rgba(255, 253, 250, 0.9));
  border-color: rgba(var(--accent-strong-rgb), 0.28);
  color: var(--theme-text-primary);
}

:root[data-theme-mode='day'] .rail-collapse-btn,
:root[data-theme-mode='day'] .rail-refresh-btn,
:root[data-theme-mode='day'] .item-icon-btn,
:root[data-theme-mode='day'] .mode-pill {
  background: rgba(255, 253, 250, 0.88);
  border-color: var(--theme-border);
  color: var(--theme-text-secondary);
}

:root[data-theme-mode='day'] .rail-count,
:root[data-theme-mode='day'] .group-label,
:root[data-theme-mode='day'] .session-meta {
  color: var(--theme-text-tertiary);
}

:root[data-theme-mode='day'] .rail-hint {
  background: rgba(255, 253, 250, 0.62);
  border-color: var(--theme-border);
  color: var(--theme-text-secondary);
}

:root[data-theme-mode='day'] .session-title {
  color: var(--theme-text-primary);
}

:root[data-theme-mode='day'] .session-item:hover,
:root[data-theme-mode='day'] .session-item.active {
  background: rgba(var(--accent-rgb), 0.1);
  border-color: rgba(var(--accent-strong-rgb), 0.24);
}

@keyframes rail-shimmer {
  0% {
    background-position: 120% 0;
  }

  100% {
    background-position: -120% 0;
  }
}

@keyframes rail-spin {
  to {
    transform: rotate(360deg);
  }
}
</style>
