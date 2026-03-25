<template>
  <section class="route-page ai-hub-page">
    <section class="workspace-shell liquid-material">
      <header class="workspace-topbar">
        <div class="mode-switch">
          <button
            class="mode-tab ripple-trigger"
            :class="{ active: activePrimaryMode === 'town' }"
            type="button"
            @click="activateTownWorkspace()"
          >
            <i class="fas fa-map-location-dot" aria-hidden="true"></i>
            <span>小镇模式</span>
          </button>
          <button
            class="mode-tab ripple-trigger"
            :class="{ active: activePrimaryMode === 'conversation' }"
            type="button"
            @click="activateStandardConversation()"
          >
            <i class="fas fa-comments" aria-hidden="true"></i>
            <span>普通对话模式</span>
          </button>
        </div>

        <div class="topbar-status">
          <span class="status-pill muted">AI Chat 在 AI Hub 内已禁用</span>
          <span class="status-pill accent">
            {{ activePrimaryMode === 'town' ? `当前场景 · ${selectedTownScene?.title || '载入中'}` : currentConversationLabel }}
          </span>
        </div>
      </header>

      <div class="workspace-grid" :class="{ conversation: activePrimaryMode === 'conversation' }">
        <section class="workspace-main liquid-material">
          <template v-if="activePrimaryMode === 'town'">
            <template v-if="townSubView === 'editor'">
              <div class="stage-head">
                <div class="stage-copy">
                  <span class="stage-kicker">RPGMaker Editor Entry</span>
                  <h2>地图资源编辑入口</h2>
                  <p>这里负责承接上传、解析、预览和挂接四段链路。当前先把工作区入口放进 AI Hub，后续 bead 会继续接真实上传与解析能力。</p>
                </div>
                <div class="stage-actions">
                  <button class="stage-btn ripple-trigger" type="button" @click="activateTownWorkspace('map')">返回地图</button>
                </div>
              </div>

              <div class="editor-grid">
                <article class="editor-card liquid-material emphasis">
                  <span class="editor-step">01</span>
                  <strong>上传资源</strong>
                  <p>入口会承接 RPGMaker 地图、角色或素材包上传。本轮先完成工作台落位，不在这里提前塞运行时逻辑。</p>
                  <span class="editor-tag">上传入口待接入</span>
                </article>

                <article class="editor-card liquid-material">
                  <span class="editor-step">02</span>
                  <strong>解析结果</strong>
                  <p>解析面会显示地图块、点位元数据和素材引用状态，方便确认导入内容是否可挂到 AI 小镇展示层。</p>
                  <span class="editor-tag">解析 bead 继续实现</span>
                </article>

                <article class="editor-card liquid-material">
                  <span class="editor-step">03</span>
                  <strong>地图预览</strong>
                  <p>这里将承接预览缩略图、房间排布和入口检查。当前保留预览位，避免下一轮再返工主工作台结构。</p>
                  <span class="editor-tag">预览面预留</span>
                </article>

                <article class="editor-card liquid-material">
                  <span class="editor-step">04</span>
                  <strong>配置挂接</strong>
                  <p>最终会把解析出来的资源挂到公开漫游地图、场景点位和管理员编辑流。不会在一期实现 RPGMaker 运行时。</p>
                  <span class="editor-tag">挂接配置预留</span>
                </article>
              </div>
            </template>

            <template v-else>
              <div class="stage-head">
                <div class="stage-copy">
                  <span class="stage-kicker">RPG Town Map</span>
                  <h2>{{ selectedTownScene?.title || 'AI 小镇公开漫游' }}</h2>
                  <p>
                    {{
                      selectedTownScene?.description ||
                      '默认落点是公开漫游地图。点击地图节点或场景条目，右侧会刷新场景描述、NPC 展示与权限入口。'
                    }}
                  </p>
                </div>

                <div class="stage-actions">
                  <button class="stage-btn ripple-trigger" type="button" :disabled="townLoading" @click="loadTownExplorer">
                    {{ townLoading ? '刷新中...' : '刷新场景' }}
                  </button>
                  <button
                    v-if="isAdminUser"
                    class="stage-btn primary ripple-trigger"
                    type="button"
                    @click="activateTownWorkspace('editor')"
                  >
                    编辑
                  </button>
                </div>
              </div>

              <p v-if="townErrorText" class="feedback-banner error">{{ townErrorText }}</p>

              <div class="town-map-shell">
                <div class="town-map-board">
                  <div class="map-backdrop"></div>
                  <div class="map-gridline"></div>

                  <button
                    v-for="node in townMap.scenes"
                    :key="node.sceneCode"
                    class="map-node ripple-trigger"
                    :class="[`tone-${node.tone}`, { active: node.sceneCode === selectedTownSceneCode }]"
                    type="button"
                    :style="mapNodeStyle(node)"
                    @click="loadTownScene(node.sceneCode)"
                  >
                    <strong>{{ node.title }}</strong>
                    <small>{{ node.sceneCode }}</small>
                  </button>
                </div>

                <div class="scene-rail">
                  <button
                    v-for="scene in townScenes"
                    :key="scene.sceneCode"
                    class="scene-chip ripple-trigger"
                    :class="{ active: scene.sceneCode === selectedTownSceneCode }"
                    type="button"
                    @click="loadTownScene(scene.sceneCode)"
                  >
                    <strong>{{ scene.title }}</strong>
                    <span>{{ scene.npcCount }} 个展示点</span>
                  </button>
                </div>
              </div>
            </template>
          </template>

          <template v-else>
            <AiDialog
              :visible="true"
              mode="embedded"
              :chat-mode="conversationChatMode"
              :allowed-modes="conversationAllowedModes"
              :open-payload="conversationOpenPayload"
              :show-header="false"
              :show-close-button="false"
              @mode-change="handleConversationModeChange"
            />
          </template>
        </section>

        <aside v-if="activePrimaryMode === 'town'" class="workspace-side liquid-material">
          <template v-if="townSubView === 'editor'">
            <div class="side-panel-head">
              <span class="side-kicker">Editor Scope</span>
              <h3>编辑边界</h3>
            </div>

            <div class="side-info-list">
              <article class="side-info-card">
                <strong>只做地图资源链路</strong>
                <p>本轮编辑入口只承接上传、解析、预览、挂接，不混入场景运营或 companion 综合配置。</p>
              </article>
              <article class="side-info-card">
                <strong>管理员专属入口</strong>
                <p>编辑按钮只对管理员显示，普通用户仍然停留在公开漫游视角，不暴露后台编辑语义。</p>
              </article>
              <article class="side-info-card">
                <strong>为后续 bead 预留结构</strong>
                <p>这一层会继续承接 `shizuki-site-gyf` 的真实上传解析预览链路，避免再重做 AI Hub 壳层。</p>
              </article>
            </div>
          </template>

          <template v-else-if="selectedTownScene">
            <div class="side-panel-head">
              <div class="scene-meta-row">
                <span class="scene-type">{{ selectedTownScene.sceneType }}</span>
                <small>{{ selectedTownSceneSummary?.publicVisible === false ? '未公开' : '公开浏览中' }}</small>
              </div>
              <h3>{{ selectedTownScene.title }}</h3>
              <p>{{ selectedTownScene.description }}</p>
            </div>

            <p v-if="selectedTownScene.atmosphereHint" class="scene-atmosphere">{{ selectedTownScene.atmosphereHint }}</p>

            <div class="quick-actions">
              <button class="quick-btn ripple-trigger" type="button" @click="jumpToHomeExterior">快速跳到自宅</button>
              <button
                v-if="isAdminUser"
                class="quick-btn ripple-trigger"
                type="button"
                @click="activateTownWorkspace('editor')"
              >
                编辑地图
              </button>
              <button
                v-if="canOpenCompanion"
                class="quick-btn primary ripple-trigger"
                type="button"
                @click="openCompanionWorkspace"
              >
                进入自宅 companion
              </button>
            </div>

            <div class="highlight-list">
              <span v-for="item in selectedTownScene.highlights" :key="item" class="highlight-chip">{{ item }}</span>
            </div>

            <div class="npc-list">
              <article v-for="npc in selectedTownScene.npcs" :key="npc.npcCode" class="npc-card">
                <div class="npc-meta">
                  <span>{{ npc.roleLabel }}</span>
                  <small>{{ npc.adminOnly ? 'ADMIN' : '展示' }}</small>
                </div>
                <strong>{{ npc.displayName }}</strong>
                <p>{{ npc.intro }}</p>
                <button
                  v-if="npc.adminOnly"
                  class="npc-action ripple-trigger"
                  type="button"
                  :disabled="!isAdminUser || townPendingNpcCode === npc.npcCode"
                  @click="handleOpenTownNpc(npc)"
                >
                  {{
                    townPendingNpcCode === npc.npcCode
                      ? '创建会话中...'
                      : isAdminUser
                        ? '以特殊 NPC 开始对话'
                        : '仅 ADMIN 可用'
                  }}
                </button>
                <button v-else class="npc-action muted" type="button" disabled>公开展示中</button>
              </article>
            </div>

            <p v-if="townActionError" class="feedback-banner error">{{ townActionError }}</p>
            <p v-else class="side-tip">
              {{
                isAdminUser
                  ? '管理员可以从这里直接切入特殊 NPC 或 companion 会话；普通对话模式里仍可切回 normal / tavern。'
                  : '当前是公开漫游视角。你可以浏览场景和 NPC 展示，但特殊 NPC 对话只对管理员开放。'
              }}
            </p>
          </template>

          <div v-else class="side-empty">
            <strong>还没有选中场景</strong>
            <p>地图数据返回后，右侧会显示场景说明、NPC 展示和快捷入口。</p>
          </div>
        </aside>
      </div>
    </section>
  </section>
</template>

<script setup>
import { computed, onMounted, ref } from 'vue';
import AiDialog from '../components/AiDialog.vue';
import { useAuthSession } from '../composables/useAuthSession';
import {
  createAdminTownNpcSession,
  getAiTownPublicMap,
  getAiTownScene,
  listAiTownScenes
} from '../services/aiApi';

const auth = useAuthSession();
const activePrimaryMode = ref('town');
const townSubView = ref('map');
const conversationChatMode = ref('normal');
const conversationOpenPayload = ref(null);
const townLoading = ref(false);
const townErrorText = ref('');
const townActionError = ref('');
const townPendingNpcCode = ref('');
const townScenes = ref([]);
const townMap = ref({ scenes: [] });
const selectedTownSceneCode = ref('');
const selectedTownScene = ref(null);

const conversationAllowedModes = ['normal', 'tavern', 'town_npc', 'companion'];

function toNumber(value) {
  const normalized = Number(value);
  return Number.isFinite(normalized) ? normalized : 0;
}

function normalizeOptionalText(value) {
  const normalized = String(value || '').trim();
  return normalized || '';
}

function normalizeTownNpc(raw = {}) {
  const worldbookIds = Array.isArray(raw.worldbookIds || raw.worldbook_ids)
    ? (raw.worldbookIds || raw.worldbook_ids)
        .map((item) => toNumber(item))
        .filter((item) => item > 0)
    : [];
  return {
    npcCode: normalizeOptionalText(raw.npcCode || raw.npc_code),
    sceneCode: normalizeOptionalText(raw.sceneCode || raw.scene_code),
    displayName: normalizeOptionalText(raw.displayName || raw.display_name) || '未命名 NPC',
    roleLabel: normalizeOptionalText(raw.roleLabel || raw.role_label) || '场景角色',
    intro: normalizeOptionalText(raw.intro) || '暂无介绍。',
    adminOnly: raw.adminOnly === true || raw.admin_only === true,
    memoryEnabled: raw.memoryEnabled === true || raw.memory_enabled === true,
    characterId: toNumber(raw.characterId ?? raw.character_id),
    worldbookIds
  };
}

function normalizeTownSceneSummary(raw = {}) {
  return {
    sceneCode: normalizeOptionalText(raw.sceneCode || raw.scene_code),
    title: normalizeOptionalText(raw.title) || '未命名场景',
    sceneType: normalizeOptionalText(raw.sceneType || raw.scene_type) || 'scene',
    description: normalizeOptionalText(raw.description) || '暂无场景描述。',
    atmosphereHint: normalizeOptionalText(raw.atmosphereHint || raw.atmosphere_hint) || '',
    npcCount: toNumber(raw.npcCount ?? raw.npc_count),
    publicVisible: raw.publicVisible === false || raw.public_visible === false ? false : true
  };
}

function normalizeTownSceneDetail(raw = {}) {
  return {
    sceneCode: normalizeOptionalText(raw.sceneCode || raw.scene_code),
    title: normalizeOptionalText(raw.title) || '未命名场景',
    sceneType: normalizeOptionalText(raw.sceneType || raw.scene_type) || 'scene',
    description: normalizeOptionalText(raw.description) || '暂无场景描述。',
    atmosphereHint: normalizeOptionalText(raw.atmosphereHint || raw.atmosphere_hint) || '',
    publicVisible: raw.publicVisible === false || raw.public_visible === false ? false : true,
    highlights: Array.isArray(raw.highlights) ? raw.highlights.map((item) => normalizeOptionalText(item)).filter(Boolean) : [],
    npcs: Array.isArray(raw.npcs) ? raw.npcs.map(normalizeTownNpc) : []
  };
}

function normalizeTownMap(raw = {}) {
  return {
    scenes: Array.isArray(raw.scenes)
      ? raw.scenes.map((item) => ({
          sceneCode: normalizeOptionalText(item.sceneCode || item.scene_code),
          title: normalizeOptionalText(item.title) || '未命名场景',
          coordX: toNumber(item.coordX ?? item.coord_x),
          coordY: toNumber(item.coordY ?? item.coord_y),
          tone: normalizeOptionalText(item.tone) || 'neutral'
        }))
      : []
  };
}

function resolveTownError(error) {
  if (error instanceof Error && normalizeOptionalText(error.message)) {
    return error.message;
  }
  return 'AI 小镇数据加载失败，请稍后再试。';
}

const isAdminUser = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  return groups.some((groupCode) => String(groupCode || '').trim().toUpperCase() === 'ADMIN');
});

const selectedTownSceneSummary = computed(() =>
  townScenes.value.find((item) => item.sceneCode === selectedTownSceneCode.value) || null
);

const currentConversationLabel = computed(() => {
  if (conversationChatMode.value === 'tavern') {
    return '当前对话 · 酒馆模式';
  }
  if (conversationChatMode.value === 'town_npc') {
    return '当前对话 · 小镇 NPC';
  }
  if (conversationChatMode.value === 'companion') {
    return '当前对话 · 自宅 companion';
  }
  return '当前对话 · 普通模式';
});

const canOpenCompanion = computed(() => isAdminUser.value && selectedTownSceneCode.value === 'home_gate');

function activateTownWorkspace(nextSubView = 'map') {
  activePrimaryMode.value = 'town';
  townSubView.value = nextSubView;
}

function activateStandardConversation() {
  activePrimaryMode.value = 'conversation';
  if (conversationChatMode.value === 'town_npc' || conversationChatMode.value === 'companion') {
    conversationChatMode.value = 'normal';
  }
  conversationOpenPayload.value = null;
}

function openConversationWorkspace(mode, payload = null) {
  activePrimaryMode.value = 'conversation';
  conversationChatMode.value = mode;
  conversationOpenPayload.value = payload ? { ...payload, openedAt: Date.now() } : null;
}

function handleConversationModeChange(mode) {
  conversationChatMode.value = normalizeOptionalText(mode) || 'normal';
  if (conversationChatMode.value === 'normal' || conversationChatMode.value === 'tavern') {
    conversationOpenPayload.value = null;
  }
}

async function loadTownScene(sceneCode) {
  const normalizedSceneCode = normalizeOptionalText(sceneCode);
  if (!normalizedSceneCode) return;
  selectedTownSceneCode.value = normalizedSceneCode;
  selectedTownScene.value = normalizeTownSceneDetail(await getAiTownScene(normalizedSceneCode));
}

async function loadTownExplorer() {
  townLoading.value = true;
  townErrorText.value = '';
  try {
    const [sceneListPayload, mapPayload] = await Promise.all([listAiTownScenes(), getAiTownPublicMap()]);
    townScenes.value = Array.isArray(sceneListPayload) ? sceneListPayload.map(normalizeTownSceneSummary) : [];
    townMap.value = normalizeTownMap(mapPayload);
    const defaultSceneCode = selectedTownSceneCode.value || townScenes.value[0]?.sceneCode || 'library';
    await loadTownScene(defaultSceneCode);
  } catch (error) {
    townErrorText.value = resolveTownError(error);
  } finally {
    townLoading.value = false;
  }
}

async function handleOpenTownNpc(npc) {
  if (!npc?.npcCode) return;
  if (!auth.isAuthenticated.value || !isAdminUser.value) {
    townActionError.value = '只有 ADMIN 可以创建特殊 NPC 会话。';
    return;
  }
  townPendingNpcCode.value = npc.npcCode;
  townActionError.value = '';
  try {
    const session = await createAdminTownNpcSession(npc.npcCode, auth.authorizedFetch);
    openConversationWorkspace('town_npc', {
      preferredMode: 'town_npc',
      bootstrap: {
        session,
        config: {
          townRoomCode: npc.sceneCode || selectedTownSceneCode.value,
          actorCode: npc.npcCode,
          scenePrompt: selectedTownScene.value?.description || ''
        }
      }
    });
  } catch (error) {
    townActionError.value = resolveTownError(error);
  } finally {
    townPendingNpcCode.value = '';
  }
}

function openCompanionWorkspace() {
  if (!isAdminUser.value) return;
  openConversationWorkspace('companion', {
    preferredMode: 'companion',
    bootstrap: {
      config: {
        townRoomCode: 'home',
        actorCode: 'my_home_ai'
      }
    }
  });
}

async function jumpToHomeExterior() {
  activateTownWorkspace('map');
  await loadTownScene('home_gate');
}

function mapNodeStyle(node) {
  return {
    left: `${node.coordX}%`,
    top: `${node.coordY}%`
  };
}

onMounted(async () => {
  await auth.ensureReady();
  await loadTownExplorer();
});
</script>

<style scoped>
.route-page {
  min-height: 100%;
  color: rgba(239, 244, 255, 0.96);
}

.ai-hub-page {
  display: grid;
}

.workspace-shell {
  --liquid-bg: linear-gradient(150deg, rgba(14, 20, 33, 0.86), rgba(10, 16, 26, 0.8));
  --liquid-border: rgba(255, 255, 255, 0.14);
  --liquid-shadow: 0 24px 48px rgba(3, 6, 16, 0.32);
  border-radius: 30px;
  padding: 18px;
  display: grid;
  gap: 16px;
  min-height: calc(100vh - 180px);
}

.workspace-topbar {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 16px;
  padding-bottom: 2px;
}

.mode-switch {
  display: inline-grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 8px;
  padding: 6px;
  border-radius: 20px;
  background: rgba(255, 255, 255, 0.05);
  border: 1px solid rgba(255, 255, 255, 0.08);
}

.mode-tab {
  min-width: 170px;
  border: 0;
  border-radius: 14px;
  padding: 12px 16px;
  background: transparent;
  color: rgba(221, 232, 250, 0.84);
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 10px;
  font-weight: 700;
  cursor: pointer;
  transition: background-color 0.22s ease, color 0.22s ease, transform 0.22s ease;
}

.mode-tab.active {
  background: linear-gradient(140deg, rgba(var(--accent-rgb), 0.26), rgba(255, 255, 255, 0.08));
  color: rgba(247, 250, 255, 0.98);
  box-shadow:
    0 0 0 1px rgba(var(--accent-rgb), 0.3),
    0 12px 24px rgba(4, 7, 16, 0.16);
}

.mode-tab:hover {
  transform: translateY(-1px);
}

.topbar-status {
  display: flex;
  flex-wrap: wrap;
  justify-content: flex-end;
  gap: 8px;
}

.status-pill {
  padding: 8px 12px;
  border-radius: 999px;
  font-size: 12px;
  color: rgba(237, 244, 255, 0.92);
  background: rgba(255, 255, 255, 0.06);
  border: 1px solid rgba(255, 255, 255, 0.08);
}

.status-pill.muted {
  color: rgba(206, 217, 238, 0.76);
}

.status-pill.accent {
  background: rgba(var(--accent-rgb), 0.16);
  border-color: rgba(var(--accent-rgb), 0.22);
}

.workspace-grid {
  min-height: 0;
  display: grid;
  grid-template-columns: minmax(0, 1.7fr) minmax(320px, 0.96fr);
  gap: 16px;
}

.workspace-grid.conversation {
  grid-template-columns: 1fr;
}

.workspace-main,
.workspace-side {
  --liquid-bg: rgba(255, 255, 255, 0.045);
  --liquid-border: rgba(255, 255, 255, 0.08);
  --liquid-shadow: none;
  border-radius: 26px;
}

.workspace-main {
  padding: 18px;
  display: grid;
  gap: 16px;
  min-height: 0;
}

.workspace-side {
  padding: 18px;
  display: grid;
  align-content: start;
  gap: 16px;
  min-height: 0;
  overflow: hidden;
}

.stage-head {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 16px;
  align-items: start;
}

.stage-copy {
  display: grid;
  gap: 8px;
}

.stage-kicker,
.side-kicker {
  font-size: 11px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.95);
}

.stage-copy h2,
.side-panel-head h3 {
  margin: 0;
  font-size: clamp(24px, 3vw, 34px);
  line-height: 1.06;
}

.stage-copy p,
.side-panel-head p,
.scene-atmosphere,
.side-tip,
.editor-card p,
.npc-card p,
.side-info-card p {
  margin: 0;
  color: rgba(214, 225, 245, 0.8);
  line-height: 1.7;
}

.stage-actions,
.quick-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 10px;
}

.stage-btn,
.quick-btn,
.npc-action {
  border: 0;
  border-radius: 14px;
  padding: 10px 14px;
  background: rgba(255, 255, 255, 0.08);
  color: rgba(243, 248, 255, 0.95);
  cursor: pointer;
  transition: transform 0.22s ease, background-color 0.22s ease, opacity 0.22s ease;
}

.stage-btn.primary,
.quick-btn.primary {
  background: rgba(var(--accent-rgb), 0.2);
}

.stage-btn:hover:not(:disabled),
.quick-btn:hover:not(:disabled),
.npc-action:hover:not(:disabled) {
  transform: translateY(-1px);
  background: rgba(var(--accent-rgb), 0.26);
}

.stage-btn:disabled,
.quick-btn:disabled,
.npc-action:disabled {
  cursor: not-allowed;
  opacity: 0.58;
}

.town-map-shell {
  display: grid;
  gap: 14px;
  min-height: 0;
}

.town-map-board {
  position: relative;
  min-height: clamp(320px, 46vh, 560px);
  border-radius: 30px;
  overflow: hidden;
  background:
    radial-gradient(circle at 20% 18%, rgba(246, 184, 92, 0.22), transparent 24%),
    radial-gradient(circle at 76% 28%, rgba(107, 181, 255, 0.18), transparent 28%),
    radial-gradient(circle at 78% 72%, rgba(255, 128, 148, 0.18), transparent 22%),
    linear-gradient(180deg, rgba(16, 22, 36, 0.98), rgba(8, 12, 22, 0.96));
  border: 1px solid rgba(255, 255, 255, 0.08);
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.08);
}

.map-backdrop,
.map-gridline {
  position: absolute;
  inset: 0;
  pointer-events: none;
}

.map-backdrop {
  background:
    linear-gradient(135deg, rgba(255, 255, 255, 0.04) 25%, transparent 25%) 0 0 / 64px 64px,
    linear-gradient(225deg, rgba(255, 255, 255, 0.025) 25%, transparent 25%) 0 0 / 64px 64px;
  opacity: 0.55;
}

.map-gridline {
  background-image:
    linear-gradient(rgba(255, 255, 255, 0.06) 1px, transparent 1px),
    linear-gradient(90deg, rgba(255, 255, 255, 0.06) 1px, transparent 1px);
  background-size: 42px 42px;
  mask-image: linear-gradient(180deg, rgba(0, 0, 0, 0.85), transparent 100%);
}

.map-node {
  position: absolute;
  min-width: 132px;
  border: 1px solid rgba(255, 255, 255, 0.14);
  border-radius: 18px;
  padding: 12px 14px;
  transform: translate(-50%, -50%);
  background: rgba(8, 13, 24, 0.88);
  color: rgba(247, 250, 255, 0.96);
  display: grid;
  gap: 2px;
  text-align: left;
  box-shadow: 0 14px 30px rgba(4, 7, 16, 0.28);
  transition: transform 0.22s ease, border-color 0.22s ease, background-color 0.22s ease;
}

.map-node strong {
  font-size: 14px;
}

.map-node small {
  color: rgba(198, 212, 239, 0.72);
  font-size: 11px;
  letter-spacing: 0.08em;
  text-transform: uppercase;
}

.map-node:hover,
.map-node.active {
  transform: translate(-50%, calc(-50% - 2px));
  border-color: rgba(var(--accent-rgb), 0.38);
  background: linear-gradient(145deg, rgba(var(--accent-rgb), 0.22), rgba(10, 14, 24, 0.94));
}

.map-node.tone-amber {
  box-shadow: 0 18px 32px rgba(180, 123, 45, 0.18);
}

.map-node.tone-sky {
  box-shadow: 0 18px 32px rgba(76, 142, 223, 0.18);
}

.map-node.tone-rose {
  box-shadow: 0 18px 32px rgba(194, 88, 127, 0.18);
}

.scene-rail {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 10px;
}

.scene-chip {
  border: 1px solid rgba(255, 255, 255, 0.08);
  border-radius: 18px;
  padding: 14px;
  background: rgba(255, 255, 255, 0.04);
  color: rgba(233, 240, 253, 0.9);
  text-align: left;
  display: grid;
  gap: 4px;
  cursor: pointer;
  transition: transform 0.22s ease, border-color 0.22s ease, background-color 0.22s ease;
}

.scene-chip strong {
  font-size: 14px;
}

.scene-chip span {
  color: rgba(192, 206, 233, 0.72);
  font-size: 12px;
}

.scene-chip.active,
.scene-chip:hover {
  transform: translateY(-1px);
  border-color: rgba(var(--accent-rgb), 0.32);
  background: rgba(var(--accent-rgb), 0.12);
}

.side-panel-head,
.side-info-list,
.npc-list {
  display: grid;
  gap: 14px;
}

.scene-meta-row,
.npc-meta {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
  color: rgba(194, 208, 235, 0.72);
  font-size: 11px;
  letter-spacing: 0.12em;
  text-transform: uppercase;
}

.scene-type {
  color: rgba(var(--accent-soft-rgb), 0.94);
}

.highlight-list {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.highlight-chip,
.editor-tag {
  padding: 7px 11px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.08);
  color: rgba(235, 243, 255, 0.86);
  font-size: 11px;
}

.npc-card,
.side-info-card {
  padding: 14px;
  border-radius: 18px;
  background: rgba(255, 255, 255, 0.04);
  border: 1px solid rgba(255, 255, 255, 0.08);
  display: grid;
  gap: 10px;
}

.npc-card strong,
.side-info-card strong,
.editor-card strong {
  color: rgba(246, 250, 255, 0.95);
}

.npc-action.muted {
  background: rgba(255, 255, 255, 0.06);
}

.side-empty {
  margin: auto 0;
  padding: 18px;
  border-radius: 18px;
  border: 1px dashed rgba(255, 255, 255, 0.16);
  display: grid;
  gap: 8px;
}

.side-empty strong {
  color: rgba(246, 250, 255, 0.94);
}

.feedback-banner {
  margin: 0;
  padding: 12px 14px;
  border-radius: 16px;
  background: rgba(78, 210, 156, 0.12);
  border: 1px solid rgba(78, 210, 156, 0.18);
  color: rgba(189, 250, 223, 0.95);
  font-size: 12px;
}

.feedback-banner.error {
  background: rgba(255, 110, 110, 0.12);
  border-color: rgba(255, 120, 120, 0.2);
  color: rgba(255, 190, 190, 0.96);
}

.editor-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 12px;
}

.editor-card {
  border-radius: 22px;
  padding: 18px;
  display: grid;
  gap: 10px;
}

.editor-card.emphasis {
  --liquid-bg: linear-gradient(145deg, rgba(var(--accent-rgb), 0.18), rgba(255, 255, 255, 0.04));
  --liquid-border: rgba(var(--accent-rgb), 0.24);
}

.editor-step {
  width: 34px;
  height: 34px;
  border-radius: 12px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  background: rgba(255, 255, 255, 0.08);
  color: rgba(244, 248, 255, 0.92);
  font-size: 12px;
  font-weight: 700;
}

@media (max-width: 1200px) {
  .workspace-grid {
    grid-template-columns: 1fr;
  }

  .workspace-side {
    min-height: 0;
  }
}

@media (max-width: 900px) {
  .workspace-shell {
    padding: 14px;
    border-radius: 24px;
  }

  .workspace-topbar,
  .stage-head {
    grid-template-columns: 1fr;
    display: grid;
  }

  .mode-switch,
  .scene-rail,
  .editor-grid {
    grid-template-columns: 1fr;
  }

  .mode-tab {
    min-width: 0;
  }

  .topbar-status {
    justify-content: flex-start;
  }

  .workspace-main,
  .workspace-side {
    padding: 14px;
  }

  .town-map-board {
    min-height: 320px;
  }

  .map-node {
    min-width: 118px;
    padding: 10px 12px;
  }
}
</style>
