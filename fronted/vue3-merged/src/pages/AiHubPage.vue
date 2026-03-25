<template>
  <section class="route-page ai-hub-page">
    <header class="page-header">
      <p class="eyebrow">AI Hub</p>
      <h1>把快聊、完整对话、AI 小镇和自宅入口放进同一个壳层。</h1>
      <p class="intro-copy">
        这里先交付 AI 一期的统一入口。顶部 <strong>AI Chat</strong> 继续保留为全局快聊浮层，本页负责承接普通对话、酒馆模式、AI 小镇、自宅 companion 和 Agent 系统的后续落点。
      </p>
    </header>

    <section class="hero-band liquid-material">
      <div class="hero-copy">
        <span class="hero-chip ready">一期壳层已就位</span>
        <span class="hero-chip">顶部 AI Chat 继续可用</span>
        <h2>先把入口统一，再把能力逐个接上。</h2>
        <p>
          当前 AI Hub 不再伪装成“已经完成的 AI 酒馆”。它会先聚合所有 AI 入口，并在每个区域明确告诉你现在能做什么、下一步接什么。
        </p>
      </div>

      <div class="hero-actions">
        <button class="hero-action primary ripple-trigger" type="button" @click="handleOpenQuickChat">
          <i class="fas fa-bolt" aria-hidden="true"></i>
          唤起顶部 AI Chat
        </button>
        <div class="hero-note">
          <strong>快聊仍然是快聊。</strong>
          <span>在 AI Hub 页面内会以浮层方式打开，不再挤占右侧 1/4 辅助栏。</span>
        </div>
      </div>
    </section>

    <section class="hub-grid" aria-label="AI Hub capabilities">
      <article
        v-for="card in featureCards"
        :key="card.title"
        class="hub-card liquid-material"
        :class="[`tone-${card.tone}`]"
      >
        <div class="card-topline">
          <span class="card-kicker">{{ card.kicker }}</span>
          <span class="status-pill" :class="card.tone">{{ card.status }}</span>
        </div>
        <h3>{{ card.title }}</h3>
        <p>{{ card.description }}</p>

        <ul class="card-points">
          <li v-for="point in card.points" :key="point">{{ point }}</li>
        </ul>

        <button
          class="card-action ripple-trigger"
          type="button"
          :disabled="!card.action"
          @click="handleCardAction(card.action)"
        >
          {{ card.actionLabel }}
        </button>
      </article>
    </section>

    <section ref="townExplorerRef" class="town-shell liquid-material">
      <header class="town-head">
        <div>
          <p class="eyebrow">AI Town</p>
          <h2>公开漫游先交付三块场景，管理员特殊 NPC 入口再嵌进同一层。</h2>
        </div>
        <button class="town-refresh ripple-trigger" type="button" :disabled="townLoading" @click="loadTownExplorer">
          {{ townLoading ? '刷新中...' : '刷新场景' }}
        </button>
      </header>

      <p v-if="townErrorText" class="town-feedback error">{{ townErrorText }}</p>

      <div class="town-grid">
        <section class="town-map-card">
          <div class="town-map-canvas">
            <button
              v-for="node in townMap.scenes"
              :key="node.sceneCode"
              class="town-map-node ripple-trigger"
              :class="[`tone-${node.tone}`, { active: node.sceneCode === selectedTownSceneCode }]"
              type="button"
              :style="mapNodeStyle(node)"
              @click="loadTownScene(node.sceneCode)"
            >
              <strong>{{ node.title }}</strong>
              <span>{{ node.sceneCode }}</span>
            </button>
          </div>

          <div class="town-scene-list">
            <button
              v-for="scene in townScenes"
              :key="scene.sceneCode"
              class="town-scene-chip ripple-trigger"
              :class="{ active: scene.sceneCode === selectedTownSceneCode }"
              type="button"
              @click="loadTownScene(scene.sceneCode)"
            >
              <strong>{{ scene.title }}</strong>
              <span>{{ scene.npcCount }} 个展示点</span>
            </button>
          </div>
        </section>

        <section class="town-detail-card">
          <template v-if="selectedTownScene">
            <div class="town-detail-topline">
              <span>{{ selectedTownScene.sceneType }}</span>
              <small>{{ selectedTownSceneSummary?.publicVisible === false ? '未公开' : '公开浏览中' }}</small>
            </div>
            <h3>{{ selectedTownScene.title }}</h3>
            <p class="town-copy">{{ selectedTownScene.description }}</p>
            <p v-if="selectedTownScene.atmosphereHint" class="town-atmosphere">{{ selectedTownScene.atmosphereHint }}</p>

            <div class="town-highlight-list">
              <span v-for="item in selectedTownScene.highlights" :key="item" class="town-highlight">{{ item }}</span>
            </div>

            <div class="town-npc-grid">
              <article v-for="npc in selectedTownScene.npcs" :key="npc.npcCode" class="town-npc-card">
                <div class="town-npc-topline">
                  <span>{{ npc.roleLabel }}</span>
                  <small>{{ npc.adminOnly ? 'ADMIN' : '展示' }}</small>
                </div>
                <strong>{{ npc.displayName }}</strong>
                <p>{{ npc.intro }}</p>
                <button
                  v-if="npc.adminOnly"
                  class="town-npc-action ripple-trigger"
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
                <button v-else class="town-npc-action muted" type="button" disabled>
                  公开展示中
                </button>
              </article>
            </div>

            <p v-if="townActionError" class="town-feedback error">{{ townActionError }}</p>
            <p v-else class="town-feedback">
              {{ isAdminUser ? '管理员可以直接从这里创建 town_npc 会话；记忆作用域会由后端按 scene + actor 自动收口。' : '公开用户可以浏览场景和 NPC 展示，特殊 NPC 对话入口仅对 ADMIN 开放。' }}
            </p>
          </template>

          <div v-else class="town-empty">
            <strong>还没有选中场景</strong>
            <p>左侧地图或场景条目会在接口返回后展示这里的细节。</p>
          </div>
        </section>
      </div>
    </section>

    <section class="roadmap-shell liquid-material">
      <header class="roadmap-head">
        <p class="eyebrow">Phase 1 Map</p>
        <h2>AI 一期的顺序不是堆功能，而是先把入口和边界画清楚。</h2>
      </header>

      <ol class="roadmap-list">
        <li v-for="stage in roadmapStages" :key="stage.title" class="roadmap-item">
          <span class="roadmap-index">{{ stage.index }}</span>
          <div class="roadmap-copy">
            <strong>{{ stage.title }}</strong>
            <p>{{ stage.description }}</p>
          </div>
        </li>
      </ol>
    </section>
  </section>
</template>

<script setup>
import { computed, onMounted, ref } from 'vue';
import { useAuthSession } from '../composables/useAuthSession';
import {
  createAdminTownNpcSession,
  getAiTownPublicMap,
  getAiTownScene,
  listAiTownScenes
} from '../services/aiApi';
import { openAiChat } from '../utils/aiChatBus';

const auth = useAuthSession();
const townExplorerRef = ref(null);
const townLoading = ref(false);
const townErrorText = ref('');
const townActionError = ref('');
const townPendingNpcCode = ref('');
const townScenes = ref([]);
const townMap = ref({ scenes: [] });
const selectedTownSceneCode = ref('');
const selectedTownScene = ref(null);

const featureCards = computed(() => [
  {
    kicker: 'Quick Chat',
    status: '当前可用',
    tone: 'ready',
    title: '顶部 AI Chat 快聊',
    description: '保留全局快问快答入口，不把它混进完整对话路线里。',
    points: ['任意页面都能唤起', '在 AI Hub 内以浮层打开', '适合短问答、临时查询与快速试探'],
    action: 'open-quick-chat',
    actionLabel: '现在就打开'
  },
  {
    kicker: 'Normal Chat',
    status: '当前可用',
    tone: 'ready',
    title: '普通对话模式',
    description: '共享聊天壳层，优先落地 normal / tavern 双模式会话的普通模式部分。',
    points: ['承接基础会话', '为角色卡、世界书绑定留接口', '作为后续权限与配额整合基础'],
    action: 'open-normal-chat',
    actionLabel: '进入普通对话'
  },
  {
    kicker: 'Tavern Mode',
    status: '当前可用',
    tone: 'ready',
    title: '酒馆模式',
    description: '强调角色人格、设定和沉浸感，而不是普通问答式聊天。',
    points: ['角色卡与世界书管理会先补齐', '保留独立模式语义', '后续接入记忆隔离与设定注入'],
    action: 'open-tavern-chat',
    actionLabel: '进入酒馆模式'
  },
  {
    kicker: 'AI Town',
    status: '当前可逛',
    tone: 'ready',
    title: 'AI 小镇公开漫游',
    description: '图书馆、教室、自宅外部三块场景已经作为公开入口接到 AI Hub。',
    points: ['支持公开浏览与场景切换', '支持 NPC 卡片展示', '管理员可从特殊 NPC 卡片直接建会话'],
    action: 'jump-town',
    actionLabel: '查看 AI 小镇'
  },
  {
    kicker: 'Home Companion',
    status: isAdminUser.value ? '当前可用' : '仅 ADMIN',
    tone: isAdminUser.value ? 'ready' : 'planned',
    title: '自宅 companion',
    description: '管理员专属的高亲密度入口，已经接入人格配置、世界书绑定和记忆开关。',
    points: ['入口独立于 AI 小镇公开漫游', '支持保存 companion 配置', '通过专属会话创建接口收口到自宅 scope'],
    action: isAdminUser.value ? 'open-companion-chat' : '',
    actionLabel: isAdminUser.value ? '进入自宅 companion' : '仅 ADMIN 可用'
  },
  {
    kicker: 'Agent',
    status: '一期占位',
    tone: 'backlog',
    title: 'Agent 系统',
    description: '先在 AI Hub 里留出位置，不在本期提前塞进伪完成能力。',
    points: ['记录产品与技术 backlog', '明确不是一期交付范围', '后续再单独接入做事型智能体'],
    action: '',
    actionLabel: 'Backlog'
  }
]);

const roadmapStages = [
  {
    index: '01',
    title: '统一入口',
    description: '先把 AI 相关能力聚合成一个明确的 Hub，而不是继续扩散在多个零散入口里。'
  },
  {
    index: '02',
    title: '普通对话与酒馆模式',
    description: '共享聊天壳层先建立起来，再把 normal / tavern 的模式差异补齐。'
  },
  {
    index: '03',
    title: 'AI 小镇与自宅 companion',
    description: '等入口稳定后，再把公开漫游、自宅 companion 和管理员特权能力分层接上。'
  },
  {
    index: '04',
    title: '权限、配额与验收',
    description: '最后再统一接配额守卫、记忆隔离和一期回归验收，不把这些基础能力散落到中途返工。'
  }
];

function handleOpenQuickChat() {
  openAiChat({ source: 'ai-hub', preferredMode: 'quick_chat' });
}

function handleCardAction(action) {
  if (action === 'open-quick-chat') {
    handleOpenQuickChat();
    return;
  }
  if (action === 'open-normal-chat') {
    openAiChat({ source: 'ai-hub', preferredMode: 'normal' });
    return;
  }
  if (action === 'open-tavern-chat') {
    openAiChat({ source: 'ai-hub', preferredMode: 'tavern' });
    return;
  }
  if (action === 'open-companion-chat') {
    openAiChat({ source: 'ai-hub', preferredMode: 'companion' });
    return;
  }
  if (action === 'jump-town') {
    townExplorerRef.value?.scrollIntoView({ behavior: 'smooth', block: 'start' });
  }
}

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
    openAiChat({
      source: 'ai-town',
      preferredMode: 'town_npc',
      bootstrap: {
        session
      }
    });
  } catch (error) {
    townActionError.value = resolveTownError(error);
  } finally {
    townPendingNpcCode.value = '';
  }
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

.page-header {
  padding: 8px 4px 20px;
}

.eyebrow {
  font-size: 12px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.95);
}

h1 {
  margin-top: 6px;
  max-width: 880px;
  font-size: clamp(30px, 4.3vw, 52px);
  line-height: 1.08;
}

.intro-copy {
  margin-top: 14px;
  max-width: 900px;
  color: rgba(223, 230, 249, 0.86);
  line-height: 1.7;
}

.hero-band {
  --liquid-bg: linear-gradient(145deg, rgba(18, 25, 41, 0.72), rgba(39, 24, 55, 0.56));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 18px 44px rgba(4, 7, 16, 0.34);
  border-radius: 26px;
  padding: 24px;
  display: grid;
  grid-template-columns: minmax(0, 1.7fr) minmax(280px, 0.95fr);
  gap: 18px;
  overflow: hidden;
}

.hero-copy {
  display: grid;
  gap: 12px;
}

.hero-copy h2 {
  font-size: clamp(22px, 3vw, 34px);
  line-height: 1.15;
}

.hero-copy p {
  max-width: 58ch;
  line-height: 1.7;
  color: rgba(233, 239, 250, 0.82);
}

.hero-chip {
  display: inline-flex;
  align-items: center;
  width: fit-content;
  padding: 7px 12px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.12);
  border: 1px solid rgba(255, 255, 255, 0.14);
  font-size: 12px;
  letter-spacing: 0.05em;
  text-transform: uppercase;
  color: rgba(240, 245, 255, 0.84);
}

.hero-chip.ready {
  background: rgba(104, 214, 164, 0.14);
  border-color: rgba(104, 214, 164, 0.28);
  color: rgba(196, 255, 227, 0.92);
}

.hero-actions {
  display: grid;
  align-content: end;
  gap: 14px;
}

.hero-action {
  min-height: 48px;
  border-radius: 16px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 10px;
  padding: 0 18px;
  font-weight: 700;
  letter-spacing: 0.02em;
  color: rgba(247, 250, 255, 0.96);
}

.hero-action.primary {
  background: linear-gradient(135deg, rgba(var(--accent-rgb), 0.58), rgba(255, 255, 255, 0.2));
  box-shadow: 0 14px 28px rgba(var(--accent-rgb), 0.18);
}

.hero-note {
  border-radius: 18px;
  padding: 16px 18px;
  background: rgba(7, 12, 24, 0.26);
  border: 1px solid rgba(255, 255, 255, 0.08);
  display: grid;
  gap: 6px;
  color: rgba(224, 231, 244, 0.78);
  line-height: 1.6;
}

.hero-note strong {
  color: rgba(248, 251, 255, 0.94);
}

.hub-grid {
  margin-top: 18px;
  display: grid;
  grid-template-columns: repeat(12, minmax(0, 1fr));
  gap: 14px;
}

.hub-card {
  --liquid-bg: rgba(16, 22, 36, 0.44);
  --liquid-border: rgba(255, 255, 255, 0.14);
  --liquid-shadow: 0 14px 28px rgba(4, 8, 16, 0.2);
  grid-column: span 4;
  min-height: 280px;
  border-radius: 22px;
  padding: 18px;
  display: grid;
  align-content: start;
  gap: 12px;
}

.hub-card.tone-ready {
  --liquid-bg: linear-gradient(165deg, rgba(16, 31, 38, 0.72), rgba(23, 50, 49, 0.52));
}

.hub-card.tone-queued {
  --liquid-bg: linear-gradient(165deg, rgba(22, 25, 42, 0.7), rgba(44, 31, 59, 0.5));
}

.hub-card.tone-planned {
  --liquid-bg: linear-gradient(165deg, rgba(26, 25, 39, 0.72), rgba(56, 38, 38, 0.48));
}

.hub-card.tone-backlog {
  --liquid-bg: linear-gradient(165deg, rgba(20, 20, 29, 0.74), rgba(31, 34, 42, 0.56));
}

.card-topline {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
}

.card-kicker {
  font-size: 11px;
  letter-spacing: 0.14em;
  text-transform: uppercase;
  color: rgba(202, 211, 230, 0.68);
}

.status-pill {
  display: inline-flex;
  align-items: center;
  min-height: 26px;
  padding: 0 10px;
  border-radius: 999px;
  border: 1px solid transparent;
  font-size: 12px;
}

.status-pill.ready {
  background: rgba(104, 214, 164, 0.14);
  border-color: rgba(104, 214, 164, 0.24);
  color: rgba(196, 255, 227, 0.92);
}

.status-pill.queued {
  background: rgba(var(--accent-rgb), 0.14);
  border-color: rgba(var(--accent-rgb), 0.22);
  color: rgba(231, 236, 255, 0.9);
}

.status-pill.planned,
.status-pill.backlog {
  background: rgba(255, 255, 255, 0.08);
  border-color: rgba(255, 255, 255, 0.12);
  color: rgba(224, 231, 245, 0.82);
}

.hub-card h3 {
  font-size: clamp(22px, 2vw, 26px);
  line-height: 1.18;
}

.hub-card p {
  color: rgba(224, 231, 245, 0.78);
  line-height: 1.66;
}

.card-points {
  margin: 0;
  padding-left: 18px;
  display: grid;
  gap: 8px;
  color: rgba(233, 239, 249, 0.84);
}

.card-action {
  margin-top: auto;
  min-height: 42px;
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.14);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(244, 248, 255, 0.92);
  font-weight: 700;
}

.card-action:disabled {
  cursor: default;
  opacity: 0.54;
}

.town-shell {
  --liquid-bg: linear-gradient(155deg, rgba(15, 21, 35, 0.8), rgba(25, 30, 46, 0.56));
  --liquid-border: rgba(255, 255, 255, 0.14);
  --liquid-shadow: 0 18px 42px rgba(4, 7, 16, 0.24);
  margin-top: 18px;
  border-radius: 24px;
  padding: 22px;
}

.town-head {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 16px;
}

.town-head h2 {
  margin-top: 8px;
  font-size: clamp(24px, 3vw, 34px);
  line-height: 1.18;
}

.town-refresh {
  min-width: 104px;
  min-height: 42px;
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.14);
  background: rgba(var(--accent-rgb), 0.16);
  color: rgba(245, 248, 255, 0.94);
  font-weight: 700;
}

.town-grid {
  margin-top: 18px;
  display: grid;
  grid-template-columns: minmax(320px, 0.95fr) minmax(0, 1.15fr);
  gap: 18px;
}

.town-map-card,
.town-detail-card {
  border-radius: 20px;
  border: 1px solid rgba(255, 255, 255, 0.1);
  background: rgba(255, 255, 255, 0.04);
  padding: 18px;
}

.town-map-canvas {
  position: relative;
  min-height: 320px;
  border-radius: 18px;
  overflow: hidden;
  background:
    radial-gradient(circle at 20% 18%, rgba(255, 196, 106, 0.14), transparent 30%),
    radial-gradient(circle at 70% 22%, rgba(114, 199, 255, 0.14), transparent 28%),
    radial-gradient(circle at 78% 72%, rgba(255, 145, 162, 0.16), transparent 30%),
    linear-gradient(180deg, rgba(12, 16, 28, 0.92), rgba(17, 22, 36, 0.82));
  border: 1px solid rgba(255, 255, 255, 0.08);
}

.town-map-canvas::before {
  content: '';
  position: absolute;
  inset: 0;
  background-image:
    linear-gradient(rgba(255, 255, 255, 0.04) 1px, transparent 1px),
    linear-gradient(90deg, rgba(255, 255, 255, 0.04) 1px, transparent 1px);
  background-size: 28px 28px;
  opacity: 0.36;
}

.town-map-node {
  position: absolute;
  z-index: 1;
  min-width: 112px;
  padding: 12px 14px;
  border-radius: 16px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(8, 12, 22, 0.72);
  color: rgba(246, 249, 255, 0.95);
  text-align: left;
  transform: translate(-50%, -50%);
  box-shadow: 0 16px 26px rgba(3, 6, 14, 0.24);
}

.town-map-node strong,
.town-scene-chip strong,
.town-npc-card strong {
  display: block;
}

.town-map-node span,
.town-scene-chip span,
.town-npc-topline span,
.town-npc-topline small {
  font-size: 11px;
  color: rgba(215, 223, 240, 0.72);
}

.town-map-node.active {
  border-color: rgba(var(--accent-rgb), 0.42);
  box-shadow: 0 18px 30px rgba(var(--accent-rgb), 0.18);
}

.town-map-node.tone-amber {
  background: linear-gradient(135deg, rgba(61, 41, 16, 0.88), rgba(29, 21, 14, 0.78));
}

.town-map-node.tone-sky {
  background: linear-gradient(135deg, rgba(18, 40, 58, 0.88), rgba(12, 21, 35, 0.8));
}

.town-map-node.tone-rose {
  background: linear-gradient(135deg, rgba(58, 28, 39, 0.88), rgba(28, 17, 28, 0.8));
}

.town-scene-list {
  margin-top: 14px;
  display: grid;
  gap: 10px;
}

.town-scene-chip {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
  min-height: 54px;
  padding: 0 14px;
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.12);
  background: rgba(255, 255, 255, 0.04);
  color: rgba(245, 249, 255, 0.94);
  text-align: left;
}

.town-scene-chip.active {
  border-color: rgba(var(--accent-rgb), 0.38);
  background: rgba(var(--accent-rgb), 0.1);
}

.town-detail-topline {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
  color: rgba(205, 214, 232, 0.72);
  text-transform: uppercase;
  letter-spacing: 0.1em;
  font-size: 11px;
}

.town-detail-card h3 {
  margin-top: 10px;
  font-size: clamp(26px, 2.5vw, 34px);
}

.town-copy,
.town-npc-card p {
  color: rgba(226, 232, 245, 0.8);
  line-height: 1.7;
}

.town-atmosphere {
  margin-top: 10px;
  color: rgba(239, 244, 255, 0.9);
}

.town-highlight-list {
  margin-top: 14px;
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.town-highlight {
  display: inline-flex;
  align-items: center;
  min-height: 28px;
  padding: 0 12px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.08);
  color: rgba(239, 244, 255, 0.9);
  font-size: 12px;
}

.town-npc-grid {
  margin-top: 18px;
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 12px;
}

.town-npc-card {
  border-radius: 18px;
  border: 1px solid rgba(255, 255, 255, 0.1);
  background: rgba(10, 15, 27, 0.44);
  padding: 16px;
}

.town-npc-topline {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
}

.town-npc-action {
  margin-top: 14px;
  min-height: 40px;
  width: 100%;
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.14);
  background: rgba(var(--accent-rgb), 0.16);
  color: rgba(246, 250, 255, 0.95);
  font-weight: 700;
}

.town-npc-action.muted {
  background: rgba(255, 255, 255, 0.06);
  color: rgba(214, 222, 238, 0.72);
}

.town-feedback {
  margin: 16px 0 0;
  color: rgba(214, 222, 238, 0.76);
  line-height: 1.7;
}

.town-feedback.error {
  color: rgba(255, 186, 186, 0.96);
}

.town-empty {
  min-height: 320px;
  display: grid;
  place-content: center;
  text-align: center;
  gap: 8px;
  color: rgba(222, 230, 246, 0.76);
}

.roadmap-shell {
  --liquid-bg: rgba(14, 20, 30, 0.44);
  --liquid-border: rgba(255, 255, 255, 0.12);
  --liquid-shadow: 0 14px 28px rgba(4, 7, 16, 0.18);
  margin-top: 18px;
  border-radius: 24px;
  padding: 22px;
}

.roadmap-head h2 {
  margin-top: 8px;
  font-size: clamp(24px, 3vw, 34px);
  line-height: 1.16;
}

.roadmap-list {
  margin: 18px 0 0;
  padding: 0;
  list-style: none;
  display: grid;
  gap: 12px;
}

.roadmap-item {
  display: grid;
  grid-template-columns: 62px minmax(0, 1fr);
  gap: 14px;
  align-items: start;
  padding: 16px 0;
  border-top: 1px solid rgba(255, 255, 255, 0.08);
}

.roadmap-item:first-child {
  border-top: 0;
  padding-top: 0;
}

.roadmap-index {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  min-height: 44px;
  border-radius: 14px;
  background: rgba(255, 255, 255, 0.08);
  color: rgba(var(--accent-soft-rgb), 0.96);
  font-size: 18px;
  font-weight: 700;
}

.roadmap-copy {
  display: grid;
  gap: 6px;
}

.roadmap-copy strong {
  font-size: 18px;
}

.roadmap-copy p {
  color: rgba(224, 231, 245, 0.76);
  line-height: 1.66;
}

@media (max-width: 1180px) {
  .hub-card {
    grid-column: span 6;
  }
}

@media (max-width: 920px) {
  .hero-band {
    grid-template-columns: 1fr;
  }

  .town-grid {
    grid-template-columns: 1fr;
  }

  .town-npc-grid {
    grid-template-columns: 1fr;
  }

  .hub-card {
    grid-column: span 12;
    min-height: 0;
  }
}

@media (max-width: 640px) {
  .hero-band,
  .town-shell,
  .roadmap-shell,
  .hub-card {
    border-radius: 20px;
  }

  .hero-band,
  .town-shell,
  .roadmap-shell {
    padding: 18px;
  }

  .town-head {
    flex-direction: column;
  }

  .town-map-canvas {
    min-height: 280px;
  }

  .roadmap-item {
    grid-template-columns: 1fr;
  }
}
</style>
