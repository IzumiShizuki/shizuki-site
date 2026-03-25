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
      <header v-if="showHeader" class="ai-dialog-header">
        <button
          v-if="showResetButton"
          class="icon-btn ripple-trigger"
          type="button"
          title="重置当前模式会话"
          @click="resetActiveModeSession"
        >
          <i class="fas fa-rotate-right"></i>
        </button>
        <div v-else class="header-spacer" aria-hidden="true"></div>
        <div class="dialog-title">
          <span>AI 对话</span>
          <small>{{ activeModeMeta.caption }}</small>
        </div>
        <button
          v-if="showCloseButton"
          class="icon-btn close-btn ripple-trigger"
          type="button"
          title="收起"
          @click="emitClose"
        >
          <i class="fas fa-minus"></i>
        </button>
        <div v-else class="header-spacer" aria-hidden="true"></div>
      </header>

      <nav v-if="visibleChatModeOptions.length" class="mode-switcher" aria-label="AI chat modes">
        <button
          v-for="item in visibleChatModeOptions"
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
        <div class="config-field config-field-full config-toolbar">
          <div>
            <span class="config-title">角色卡与世界书配置流</span>
            <p v-if="auth.isAuthenticated.value" class="config-helper">
              这里已经接上 `character / character_card_png / worldbook` 的管理路径。选择和创建都会直接走后端接口。
            </p>
            <p v-else class="config-helper">
              游客可以继续手动试玩酒馆模式，但角色卡和世界书管理需要登录后才能使用。
            </p>
          </div>
          <button
            v-if="auth.isAuthenticated.value"
            class="mini-action ripple-trigger"
            type="button"
            :disabled="tavernAssets.loading"
            @click="ensureTavernAssetsLoaded(true)"
          >
            {{ tavernAssets.loading ? '刷新中...' : '刷新资源' }}
          </button>
        </div>

        <p v-if="tavernAssets.errorText" class="config-feedback error">{{ tavernAssets.errorText }}</p>
        <p v-else-if="tavernAssets.feedbackText" class="config-feedback" :class="tavernAssets.feedbackTone">{{ tavernAssets.feedbackText }}</p>

        <label class="config-field">
          <span>角色选择</span>
          <select
            v-if="auth.isAuthenticated.value"
            v-model="activeState.config.characterId"
            class="config-select"
            :disabled="tavernAssets.loading"
          >
            <option value="">不绑定角色</option>
            <option v-for="item in tavernAssets.characters" :key="item.characterId" :value="String(item.characterId)">
              {{ item.displayName }} · {{ item.characterTypeLabel }}
            </option>
          </select>
          <input v-else v-model.trim="activeState.config.characterId" type="text" maxlength="20" placeholder="如 1001" />
          <small v-if="selectedCharacterSummary" class="config-inline-tip">
            已选：{{ selectedCharacterSummary.displayName }} · {{ selectedCharacterSummary.characterTypeLabel }}
          </small>
        </label>

        <div class="config-field">
          <span>世界书绑定</span>
          <div v-if="auth.isAuthenticated.value" class="worldbook-picker">
            <label
              v-for="item in tavernAssets.worldbooks"
              :key="item.worldbookId"
              class="worldbook-option"
              :class="{ active: isWorldbookSelected(item.worldbookId) }"
            >
              <input
                type="checkbox"
                :checked="isWorldbookSelected(item.worldbookId)"
                @change="toggleWorldbookSelection(item.worldbookId)"
              />
              <span>{{ item.title }}</span>
              <small>{{ item.entryCount }} 条 · {{ item.visibilityType }}</small>
            </label>
            <p v-if="auth.isAuthenticated.value && !tavernAssets.loading && !tavernAssets.worldbooks.length" class="picker-empty">
              还没有世界书，下面可以直接创建。
            </p>
          </div>
          <input v-else v-model.trim="activeState.config.worldbookIdsText" type="text" maxlength="120" placeholder="如 11,12" />
          <small v-if="selectedWorldbookLabels.length" class="config-inline-tip">
            已绑定：{{ selectedWorldbookLabels.join(' / ') }}
          </small>
        </div>

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

        <details v-if="auth.isAuthenticated.value" class="management-shell config-field-full" :open="!tavernAssets.characters.length || !tavernAssets.worldbooks.length">
          <summary>管理角色卡与世界书</summary>

          <div class="management-grid">
            <form class="management-card liquid-material" @submit.prevent="submitCreateCharacter">
              <header>
                <strong>结构化角色</strong>
                <span>走 `POST /ai-characters`</span>
              </header>
              <input
                v-model.trim="tavernAssets.createCharacterDraft.displayName"
                type="text"
                maxlength="128"
                placeholder="角色显示名，例如：馆长 Haru"
              />
              <textarea
                v-model.trim="tavernAssets.createCharacterDraft.persona"
                rows="3"
                maxlength="1200"
                placeholder="角色设定 / persona"
              ></textarea>
              <textarea
                v-model.trim="tavernAssets.createCharacterDraft.description"
                rows="2"
                maxlength="1200"
                placeholder="补充描述（可选）"
              ></textarea>
              <button class="management-btn ripple-trigger" type="submit" :disabled="tavernAssets.saving">
                创建结构化角色
              </button>
            </form>

            <form class="management-card liquid-material" @submit.prevent="submitImportCharacterCard">
              <header>
                <strong>导入角色卡</strong>
                <span>走 `POST /ai-character-cards/import`</span>
              </header>
              <input
                v-model.trim="tavernAssets.importCardDraft.displayName"
                type="text"
                maxlength="128"
                placeholder="角色卡显示名"
              />
              <textarea
                v-model.trim="tavernAssets.importCardDraft.rawCardJson"
                rows="5"
                maxlength="4000"
                placeholder="粘贴角色卡原始 JSON / 元数据"
              ></textarea>
              <button class="management-btn ripple-trigger" type="submit" :disabled="tavernAssets.saving">
                导入角色卡
              </button>
            </form>

            <form class="management-card liquid-material" @submit.prevent="submitCreateWorldbook">
              <header>
                <strong>创建世界书</strong>
                <span>走 `POST /ai-worldbooks` + entries</span>
              </header>
              <input
                v-model.trim="tavernAssets.createWorldbookDraft.title"
                type="text"
                maxlength="255"
                placeholder="世界书标题，例如：图书馆设定集"
              />
              <input
                v-model.trim="tavernAssets.createWorldbookDraft.entryKeywords"
                type="text"
                maxlength="240"
                placeholder="首条关键词，逗号分隔，例如：图书馆,夜间"
              />
              <textarea
                v-model.trim="tavernAssets.createWorldbookDraft.entryContent"
                rows="4"
                maxlength="2000"
                placeholder="首条世界书内容（可选）"
              ></textarea>
              <button class="management-btn ripple-trigger" type="submit" :disabled="tavernAssets.saving">
                创建世界书
              </button>
            </form>
          </div>
        </details>
      </section>

      <section v-else-if="activeChatMode === 'town_npc'" class="mode-config liquid-material scene-mode-config">
        <div class="config-field config-field-full config-toolbar">
          <div>
            <span class="config-title">AI 小镇特殊 NPC 会话</span>
            <p class="config-helper">
              这里会带上 scene / actor / memory 契约，作用域由后端按场景模式兜底生成。
            </p>
          </div>
        </div>

        <label class="config-field">
          <span>场景代号</span>
          <input v-model.trim="activeState.config.townRoomCode" type="text" maxlength="64" placeholder="如 library" />
        </label>

        <label class="config-field">
          <span>交互对象</span>
          <input v-model.trim="activeState.config.actorCode" type="text" maxlength="64" placeholder="如 librarian" />
        </label>

        <label class="config-field config-field-full">
          <span>场景提示</span>
          <textarea
            v-model.trim="activeState.config.scenePrompt"
            rows="2"
            maxlength="600"
            placeholder="例如：图书馆夜间只保留暖光与检索台。"
          ></textarea>
        </label>

        <label class="config-toggle">
          <input v-model="activeState.config.memoryEnabled" type="checkbox" />
          <span>启用分层记忆 contract</span>
        </label>
      </section>

      <section v-else-if="activeChatMode === 'companion'" class="mode-config liquid-material scene-mode-config">
        <div class="config-field config-field-full config-toolbar">
          <div>
            <span class="config-title">自宅 companion 会话</span>
            <p class="config-helper">
              companion 配置会单独保存到管理员专属接口，首次发送时自动创建 `/admin/ai-companion/sessions` 会话。
            </p>
          </div>
          <div v-if="auth.isAuthenticated.value && isAdminUser" class="config-toolbar-actions">
            <button class="toolbar-btn ripple-trigger" type="button" :disabled="companionProfile.loading || companionProfile.saving" @click="ensureCompanionConfigLoaded(true)">
              {{ companionProfile.loading ? '刷新中...' : '刷新配置' }}
            </button>
            <button class="toolbar-btn ripple-trigger" type="button" :disabled="companionProfile.loading || companionProfile.saving" @click="submitSaveCompanionConfig()">
              {{ companionProfile.saving ? '保存中...' : '保存配置' }}
            </button>
          </div>
        </div>

        <p v-if="companionProfile.errorText" class="feedback-banner error">{{ companionProfile.errorText }}</p>
        <p v-else-if="companionProfile.feedbackText" class="feedback-banner" :class="companionProfile.feedbackTone">{{ companionProfile.feedbackText }}</p>

        <p v-if="!auth.isAuthenticated.value" class="feedback-banner warning">
          登录后才能进入自宅 companion。
        </p>
        <p v-else-if="!isAdminUser" class="feedback-banner warning">
          自宅 companion 仅对 ADMIN 开放。
        </p>
        <template v-else>
          <label class="config-field">
            <span>companion 名称</span>
            <input v-model.trim="activeState.config.displayName" type="text" maxlength="128" placeholder="例如：小春" />
          </label>

          <label class="config-field">
            <span>companion 代号</span>
            <input v-model.trim="activeState.config.companionCode" type="text" maxlength="64" placeholder="例如：my_home_ai" />
          </label>

          <label class="config-field">
            <span>形象资源 ID</span>
            <input v-model.trim="activeState.config.avatarAssetId" type="text" maxlength="20" placeholder="可留空" />
          </label>

          <div class="config-field config-field-full">
            <span>绑定世界书</span>
            <div v-if="tavernAssets.worldbooks.length" class="worldbook-picker">
              <label
                v-for="item in tavernAssets.worldbooks"
                :key="`companion-${item.worldbookId}`"
                class="worldbook-option"
                :class="{ active: isWorldbookSelected(item.worldbookId) }"
              >
                <input
                  type="checkbox"
                  :checked="isWorldbookSelected(item.worldbookId)"
                  @change="toggleWorldbookSelection(item.worldbookId)"
                />
                <span>{{ item.title }}</span>
              </label>
            </div>
            <p v-else-if="tavernAssets.loading" class="picker-empty">世界书加载中...</p>
            <p v-else class="picker-empty">还没有可绑定的世界书，可先在酒馆模式创建。</p>
          </div>

          <label class="config-field config-field-full">
            <span>人格设定</span>
            <textarea
              v-model.trim="activeState.config.personaPrompt"
              rows="3"
              maxlength="2000"
              placeholder="例如：温柔、可靠，会记得我的习惯。"
            ></textarea>
          </label>

          <label class="config-field config-field-full">
            <span>自宅场景提示</span>
            <textarea
              v-model.trim="activeState.config.scenePrompt"
              rows="2"
              maxlength="1000"
              placeholder="例如：房间里有落地灯和书桌。"
            ></textarea>
          </label>

          <label class="config-toggle">
            <input v-model="activeState.config.memoryEnabled" type="checkbox" />
            <span>启用 companion 记忆开关</span>
          </label>
        </template>
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
import {
  createAdminAiCompanionSession,
  createAiCharacter,
  createAiSession,
  createAiWorldbook,
  createAiWorldbookEntry,
  getAdminAiCompanionConfig,
  getMyAiQuota,
  importAiCharacterCard,
  listAiCharacters,
  listAiWorldbooks,
  sendAiMessage,
  updateAdminAiCompanionConfig
} from '../services/aiApi';

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
    emptyBody: '现在可以直接选择角色、绑定世界书，并在当前面板内创建结构化角色、导入角色卡或新建世界书。'
  },
  {
    value: 'town_npc',
    label: '小镇 NPC',
    kicker: 'Town NPC',
    title: 'AI 小镇特殊 NPC',
    caption: '管理员特殊 NPC 对话',
    note: '该模式会携带 scene / actor / memory 契约，并由后端基于场景模式兜底生成 scope_id。',
    placeholder: '对这个场景角色说一句话...',
    emptyTitle: '场景模式会话已就位',
    emptyBody: '从 AI 小镇里点管理员特殊 NPC 入口后，会话会自动带上场景与角色信息。',
    hidden: true
  },
  {
    value: 'companion',
    label: '自宅',
    kicker: 'Companion',
    title: '自宅 companion',
    caption: '管理员专属 companion 对话',
    note: '该模式会加载管理员专属 companion 配置，并通过专用会话接口收口到自宅作用域。',
    placeholder: '对 companion 说一句话...',
    emptyTitle: 'companion 配置已独立接入',
    emptyBody: '先保存人格、世界书和记忆开关，再从同一个面板里直接开始自宅对话。',
    hidden: true
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
  if (normalized === 'normal' || normalized === 'tavern' || normalized === 'town_npc' || normalized === 'companion') {
    return normalized;
  }
  return 'quick_chat';
}

function normalizeAllowedModes(input) {
  if (!Array.isArray(input)) {
    return [];
  }
  return input
    .map((item) => normalizeChatMode(item))
    .filter((item, index, list) => list.indexOf(item) === index);
}

function resolveAllowedChatMode(input, allowedModes) {
  const normalized = normalizeChatMode(input);
  if (Array.isArray(allowedModes) && allowedModes.length && !allowedModes.includes(normalized)) {
    return allowedModes[0];
  }
  return normalized;
}

function parseCsvIds(raw) {
  return String(raw || '')
    .split(',')
    .map((item) => Number.parseInt(item.trim(), 10))
    .filter((item) => Number.isFinite(item) && item > 0)
    .filter((item, index, list) => list.indexOf(item) === index)
    .slice(0, 20);
}

function parseKeywordCsv(raw) {
  return String(raw || '')
    .split(',')
    .map((item) => String(item || '').trim())
    .filter(Boolean)
    .filter((item, index, list) => list.indexOf(item) === index)
    .slice(0, 12);
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
      displayName: '',
      companionCode: '',
      avatarAssetId: '',
      personaPrompt: '',
      scenePrompt: '',
      townRoomCode: '',
      actorCode: '',
      memoryEnabled: mode === 'tavern' || mode === 'town_npc' || mode === 'companion'
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

function createTavernAssetsState() {
  return {
    loading: false,
    loaded: false,
    saving: false,
    errorText: '',
    feedbackText: '',
    feedbackTone: '',
    characters: [],
    worldbooks: [],
    createCharacterDraft: {
      displayName: '',
      persona: '',
      description: ''
    },
    importCardDraft: {
      displayName: '',
      rawCardJson: ''
    },
    createWorldbookDraft: {
      title: '',
      entryKeywords: '',
      entryContent: ''
    }
  };
}

function createCompanionProfileState() {
  return {
    loading: false,
    loaded: false,
    saving: false,
    errorText: '',
    feedbackText: '',
    feedbackTone: ''
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
    scenePrompt: normalizeOptionalText(raw.scenePrompt ?? raw.scene_prompt),
    townRoomCode: normalizeOptionalText(raw.townRoomCode ?? raw.town_room_code),
    actorCode: normalizeOptionalText(raw.actorCode ?? raw.actor_code)
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

function normalizeCharacterSummary(raw = {}) {
  const characterType = String(raw.characterType || raw.character_type || 'character').trim() || 'character';
  return {
    characterId: toNumber(raw.characterId ?? raw.character_id),
    characterType,
    characterTypeLabel: characterType === 'character_card_png' ? '导入角色卡' : '结构化角色',
    displayName: normalizeOptionalText(raw.displayName || raw.display_name) || '未命名角色',
    coverAssetId: toNumber(raw.coverAssetId ?? raw.cover_asset_id),
    visibilityType: String(raw.visibilityType || raw.visibility_type || 'PRIVATE').trim().toUpperCase() || 'PRIVATE'
  };
}

function normalizeWorldbookSummary(raw = {}) {
  return {
    worldbookId: toNumber(raw.worldbookId ?? raw.worldbook_id),
    worldbookCode: normalizeOptionalText(raw.worldbookCode || raw.worldbook_code),
    title: normalizeOptionalText(raw.title) || '未命名世界书',
    visibilityType: String(raw.visibilityType || raw.visibility_type || 'PRIVATE').trim().toUpperCase() || 'PRIVATE',
    entryCount: toNumber(raw.entryCount ?? raw.entry_count),
    enabled: raw.enabled === false ? false : raw.enabled_flag === 0 ? false : true
  };
}

function normalizeCompanionConfig(raw = {}) {
  const worldbookIds = Array.isArray(raw.worldbookIds || raw.worldbook_ids)
    ? (raw.worldbookIds || raw.worldbook_ids)
        .map((item) => Number.parseInt(item, 10))
        .filter((item) => Number.isFinite(item) && item > 0)
    : [];
  return {
    companionProfileId: toNumber(raw.companionProfileId ?? raw.companion_profile_id),
    companionCode: normalizeOptionalText(raw.companionCode || raw.companion_code) || 'my_home_ai',
    displayName: normalizeOptionalText(raw.displayName || raw.display_name) || '自宅 companion',
    personaPrompt: normalizeOptionalText(raw.personaPrompt || raw.persona_prompt),
    avatarAssetId: toNumber(raw.avatarAssetId ?? raw.avatar_asset_id),
    memoryEnabled: raw.memoryEnabled === true || raw.memory_enabled === true,
    worldbookIds,
    scenePrompt: normalizeOptionalText(raw.scenePrompt || raw.scene_prompt)
  };
}

function buildSessionTitle(mode, existingTitle, openingMessage) {
  const normalizedExisting = normalizeOptionalText(existingTitle);
  if (normalizedExisting) return normalizedExisting;
  const normalizedOpening = normalizeOptionalText(openingMessage);
  if (!normalizedOpening) {
    if (mode === 'tavern') return '酒馆模式会话';
    if (mode === 'town_npc') return 'AI 小镇 NPC 会话';
    if (mode === 'companion') return '自宅 companion 会话';
    return mode === 'normal' ? '普通对话会话' : '快聊会话';
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
    validator: (value) => value === 'sidebar' || value === 'sheet' || value === 'embedded'
  },
  chatMode: {
    type: String,
    default: 'quick_chat'
  },
  allowedModes: {
    type: Array,
    default: () => []
  },
  showHeader: {
    type: Boolean,
    default: true
  },
  showCloseButton: {
    type: Boolean,
    default: true
  },
  showResetButton: {
    type: Boolean,
    default: true
  },
  openPayload: {
    type: Object,
    default: null
  }
});

const emit = defineEmits(['close', 'mode-change']);
const prefersReducedMotion = useReducedMotion();
const auth = useAuthSession();
const isAdminUser = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  return groups.some((groupCode) => String(groupCode || '').trim().toUpperCase() === 'ADMIN');
});

const activeChatMode = ref('quick_chat');
const quota = ref(null);
const tavernAssets = reactive(createTavernAssetsState());
const companionProfile = reactive(createCompanionProfileState());
const sessionStateByMode = reactive({
  quick_chat: createModeState('quick_chat'),
  normal: createModeState('normal'),
  tavern: createModeState('tavern'),
  town_npc: createModeState('town_npc'),
  companion: createModeState('companion')
});

const activeState = computed(() => sessionStateByMode[activeChatMode.value]);
const allowedChatModes = computed(() => {
  const normalized = normalizeAllowedModes(props.allowedModes);
  return normalized.length ? normalized : CHAT_MODE_OPTIONS.map((item) => item.value);
});
const visibleChatModeOptions = computed(() =>
  CHAT_MODE_OPTIONS.filter((item) => allowedChatModes.value.includes(item.value) && !item.hidden)
);
const activeModeMeta = computed(() => CHAT_MODE_OPTIONS.find((item) => item.value === activeChatMode.value) || CHAT_MODE_OPTIONS[0]);
const canSendActiveMessage = computed(() => {
  if (!normalizeOptionalText(activeState.value.draft) || activeState.value.pending) {
    return false;
  }
  if (activeChatMode.value === 'companion') {
    return auth.isAuthenticated.value && isAdminUser.value;
  }
  return true;
});
const quotaLabel = computed(() => {
  if (!quota.value || !Number.isFinite(quota.value.remaining)) return '';
  return `剩余 ${quota.value.remaining}/${quota.value.total}`;
});
const selectedCharacterSummary = computed(() => {
  const characterId = normalizeOptionalText(activeState.value.config.characterId);
  if (!characterId) return null;
  return tavernAssets.characters.find((item) => String(item.characterId) === characterId) || null;
});
const selectedWorldbookIds = computed(() => parseCsvIds(activeState.value.config.worldbookIdsText));
const selectedWorldbookLabels = computed(() =>
  tavernAssets.worldbooks
    .filter((item) => selectedWorldbookIds.value.includes(item.worldbookId))
    .map((item) => item.title)
);
const modeSummaryText = computed(() => {
  const state = activeState.value;
  const parts = [];
  if (state.sessionId) {
    parts.push(`会话 ${state.sessionId}`);
  } else {
    parts.push('首条消息发送时自动创建会话');
  }
  if (activeChatMode.value === 'tavern') {
    parts.push(selectedCharacterSummary.value ? `角色 ${selectedCharacterSummary.value.displayName}` : '角色未绑定');
    parts.push(selectedWorldbookLabels.value.length ? `世界书 ${selectedWorldbookLabels.value.join(' / ')}` : '世界书未绑定');
  }
  if (activeChatMode.value === 'town_npc' || activeChatMode.value === 'companion') {
    parts.push(state.config.townRoomCode ? `场景 ${state.config.townRoomCode}` : '场景未绑定');
    parts.push(state.config.actorCode ? `对象 ${state.config.actorCode}` : '对象未绑定');
  }
  if (activeChatMode.value === 'companion' && normalizeOptionalText(state.config.displayName)) {
    parts.push(`companion ${state.config.displayName}`);
  }
  return parts.join(' · ');
});

const shellMotion = computed(() => {
  if (props.mode === 'embedded') {
    return { opacity: props.visible ? 1 : 0, x: 0, y: 0, scale: 1 };
  }
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
    activeChatMode.value = resolveAllowedChatMode(nextValue, allowedChatModes.value);
  },
  { immediate: true }
);

watch(
  () => allowedChatModes.value,
  (nextValue) => {
    activeChatMode.value = resolveAllowedChatMode(activeChatMode.value, nextValue);
  },
  { deep: true, immediate: true }
);

watch(
  () => props.openPayload,
  (nextValue) => {
    applyOpenPayload(nextValue);
  },
  { deep: true }
);

watch(
  () => auth.isAuthenticated.value,
  async (authenticated) => {
    if (!authenticated) {
      quota.value = null;
      tavernAssets.characters = [];
      tavernAssets.worldbooks = [];
      tavernAssets.loaded = false;
      tavernAssets.errorText = '';
      tavernAssets.feedbackText = '';
      tavernAssets.feedbackTone = '';
      companionProfile.loaded = false;
      companionProfile.loading = false;
      companionProfile.saving = false;
      companionProfile.errorText = '';
      companionProfile.feedbackText = '';
      companionProfile.feedbackTone = '';
      return;
    }
    await refreshQuota();
    if (activeChatMode.value === 'tavern' || activeChatMode.value === 'companion') {
      await ensureTavernAssetsLoaded();
    }
    if (activeChatMode.value === 'companion') {
      await ensureCompanionConfigLoaded();
    }
  },
  { immediate: true }
);

watch(
  () => activeChatMode.value,
  async (mode) => {
    emit('mode-change', mode);
    if ((mode === 'tavern' || mode === 'companion') && auth.isAuthenticated.value) {
      await ensureTavernAssetsLoaded();
    }
    if (mode === 'companion' && auth.isAuthenticated.value) {
      await ensureCompanionConfigLoaded();
    }
  },
  { immediate: true }
);

function emitClose() {
  emit('close');
}

function setActiveChatMode(mode) {
  activeChatMode.value = resolveAllowedChatMode(mode, allowedChatModes.value);
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
  if (summary.townRoomCode) state.config.townRoomCode = summary.townRoomCode;
  if (summary.actorCode) state.config.actorCode = summary.actorCode;
}

function applyOpenPayload(payload) {
  if (!payload || typeof payload !== 'object') return;
  const nextMode = resolveAllowedChatMode(payload.preferredMode || payload.mode || props.chatMode, allowedChatModes.value);
  const nextState = createModeState(nextMode);
  const bootstrap = payload.bootstrap && typeof payload.bootstrap === 'object' ? payload.bootstrap : payload;
  const session = bootstrap.session && typeof bootstrap.session === 'object' ? bootstrap.session : null;
  const config = bootstrap.config && typeof bootstrap.config === 'object' ? bootstrap.config : {};

  if (session) {
    syncStateFromSessionSummary(nextState, session);
  }
  if (config.characterId != null) {
    nextState.config.characterId = String(config.characterId);
  }
  if (Array.isArray(config.worldbookIds)) {
    nextState.config.worldbookIdsText = parseCsvIds(config.worldbookIds.join(',')).join(', ');
  }
  if (normalizeOptionalText(config.scenePrompt)) {
    nextState.config.scenePrompt = normalizeOptionalText(config.scenePrompt);
  }
  if (normalizeOptionalText(config.townRoomCode)) {
    nextState.config.townRoomCode = normalizeOptionalText(config.townRoomCode);
  }
  if (normalizeOptionalText(config.actorCode)) {
    nextState.config.actorCode = normalizeOptionalText(config.actorCode);
  }
  if (typeof config.memoryEnabled === 'boolean') {
    nextState.config.memoryEnabled = config.memoryEnabled;
  }

  sessionStateByMode[nextMode] = nextState;
  activeChatMode.value = nextMode;
}

function setTavernFeedback(text, tone = 'success') {
  tavernAssets.feedbackText = normalizeOptionalText(text);
  tavernAssets.feedbackTone = tavernAssets.feedbackText ? tone : '';
}

function clearTavernFeedback() {
  tavernAssets.errorText = '';
  tavernAssets.feedbackText = '';
  tavernAssets.feedbackTone = '';
}

function setCompanionFeedback(text, tone = 'success') {
  companionProfile.feedbackText = normalizeOptionalText(text);
  companionProfile.feedbackTone = companionProfile.feedbackText ? tone : '';
}

function clearCompanionFeedback() {
  companionProfile.errorText = '';
  companionProfile.feedbackText = '';
  companionProfile.feedbackTone = '';
}

function syncCompanionStateFromConfig(rawConfig) {
  const config = normalizeCompanionConfig(rawConfig);
  const state = sessionStateByMode.companion;
  state.config.displayName = config.displayName;
  state.config.companionCode = config.companionCode;
  state.config.avatarAssetId = config.avatarAssetId > 0 ? String(config.avatarAssetId) : '';
  state.config.personaPrompt = config.personaPrompt;
  state.config.worldbookIdsText = config.worldbookIds.join(', ');
  state.config.scenePrompt = config.scenePrompt;
  state.config.townRoomCode = 'home';
  state.config.actorCode = config.companionCode;
  state.config.memoryEnabled = config.memoryEnabled;
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

async function ensureTavernAssetsLoaded(force = false) {
  if (!auth.isAuthenticated.value) return;
  if (tavernAssets.loading) return;
  if (tavernAssets.loaded && !force) return;

  tavernAssets.loading = true;
  tavernAssets.errorText = '';
  try {
    const [characterList, worldbookList] = await Promise.all([
      listAiCharacters(auth.authorizedFetch),
      listAiWorldbooks(auth.authorizedFetch)
    ]);
    tavernAssets.characters = Array.isArray(characterList) ? characterList.map(normalizeCharacterSummary) : [];
    tavernAssets.worldbooks = Array.isArray(worldbookList) ? worldbookList.map(normalizeWorldbookSummary) : [];
    tavernAssets.loaded = true;
  } catch (error) {
    tavernAssets.errorText = resolveErrorMessage(error);
  } finally {
    tavernAssets.loading = false;
  }
}

async function ensureCompanionConfigLoaded(force = false) {
  if (!auth.isAuthenticated.value || !isAdminUser.value) return;
  if (companionProfile.loading) return;
  if (companionProfile.loaded && !force) return;

  companionProfile.loading = true;
  clearCompanionFeedback();
  try {
    const config = await getAdminAiCompanionConfig(auth.authorizedFetch);
    syncCompanionStateFromConfig(config);
    companionProfile.loaded = true;
  } catch (error) {
    companionProfile.errorText = resolveErrorMessage(error);
  } finally {
    companionProfile.loading = false;
  }
}

function isWorldbookSelected(worldbookId) {
  return selectedWorldbookIds.value.includes(Number(worldbookId));
}

function toggleWorldbookSelection(worldbookId) {
  const normalizedId = Number(worldbookId);
  if (!Number.isFinite(normalizedId) || normalizedId <= 0) return;
  const ids = parseCsvIds(activeState.value.config.worldbookIdsText);
  const next = ids.includes(normalizedId) ? ids.filter((item) => item !== normalizedId) : [...ids, normalizedId];
  activeState.value.config.worldbookIdsText = next.join(', ');
}

async function submitCreateCharacter() {
  const displayName = normalizeOptionalText(tavernAssets.createCharacterDraft.displayName);
  if (!displayName) {
    tavernAssets.errorText = '角色显示名不能为空。';
    return;
  }

  tavernAssets.saving = true;
  clearTavernFeedback();
  try {
    const payload = {
      displayName,
      persona: normalizeOptionalText(tavernAssets.createCharacterDraft.persona),
      description: normalizeOptionalText(tavernAssets.createCharacterDraft.description),
      visibilityType: 'PRIVATE'
    };
    const created = await createAiCharacter(payload, auth.authorizedFetch);
    await ensureTavernAssetsLoaded(true);
    if (created?.id) {
      activeState.value.config.characterId = String(created.id);
    }
    tavernAssets.createCharacterDraft.displayName = '';
    tavernAssets.createCharacterDraft.persona = '';
    tavernAssets.createCharacterDraft.description = '';
    setTavernFeedback('结构化角色已创建并自动绑定。');
  } catch (error) {
    tavernAssets.errorText = resolveErrorMessage(error);
  } finally {
    tavernAssets.saving = false;
  }
}

async function submitImportCharacterCard() {
  const displayName = normalizeOptionalText(tavernAssets.importCardDraft.displayName);
  const rawCardJson = normalizeOptionalText(tavernAssets.importCardDraft.rawCardJson);
  if (!displayName || !rawCardJson) {
    tavernAssets.errorText = '角色卡显示名和原始内容都不能为空。';
    return;
  }

  tavernAssets.saving = true;
  clearTavernFeedback();
  try {
    const created = await importAiCharacterCard(
      {
        displayName,
        rawCardJson,
        visibilityType: 'PRIVATE'
      },
      auth.authorizedFetch
    );
    await ensureTavernAssetsLoaded(true);
    if (created?.id) {
      activeState.value.config.characterId = String(created.id);
    }
    tavernAssets.importCardDraft.displayName = '';
    tavernAssets.importCardDraft.rawCardJson = '';
    setTavernFeedback('角色卡已导入并自动绑定。');
  } catch (error) {
    tavernAssets.errorText = resolveErrorMessage(error);
  } finally {
    tavernAssets.saving = false;
  }
}

async function submitCreateWorldbook() {
  const title = normalizeOptionalText(tavernAssets.createWorldbookDraft.title);
  if (!title) {
    tavernAssets.errorText = '世界书标题不能为空。';
    return;
  }

  tavernAssets.saving = true;
  clearTavernFeedback();
  try {
    const created = await createAiWorldbook(
      {
        title,
        visibilityType: 'PRIVATE',
        enabled: true
      },
      auth.authorizedFetch
    );
    const worldbookId = toNumber(created?.worldbookId ?? created?.worldbook_id);
    const keywords = parseKeywordCsv(tavernAssets.createWorldbookDraft.entryKeywords);
    const content = normalizeOptionalText(tavernAssets.createWorldbookDraft.entryContent);

    if (worldbookId > 0 && content) {
      await createAiWorldbookEntry(
        worldbookId,
        {
          keywords,
          content,
          priorityNum: 10,
          enabled: true
        },
        auth.authorizedFetch
      );
    }

    await ensureTavernAssetsLoaded(true);
    if (worldbookId > 0 && !isWorldbookSelected(worldbookId)) {
      toggleWorldbookSelection(worldbookId);
    }
    tavernAssets.createWorldbookDraft.title = '';
    tavernAssets.createWorldbookDraft.entryKeywords = '';
    tavernAssets.createWorldbookDraft.entryContent = '';
    setTavernFeedback('世界书已创建并自动绑定到当前酒馆模式。');
  } catch (error) {
    tavernAssets.errorText = resolveErrorMessage(error);
  } finally {
    tavernAssets.saving = false;
  }
}

async function submitSaveCompanionConfig(options = {}) {
  if (!auth.isAuthenticated.value || !isAdminUser.value) {
    companionProfile.errorText = '自宅 companion 仅对 ADMIN 开放。';
    if (options.throwOnError) {
      throw new Error(companionProfile.errorText);
    }
    return null;
  }

  const displayName = normalizeOptionalText(activeState.value.config.displayName);
  if (!displayName) {
    companionProfile.errorText = 'companion 名称不能为空。';
    if (options.throwOnError) {
      throw new Error(companionProfile.errorText);
    }
    return null;
  }

  companionProfile.saving = true;
  clearCompanionFeedback();
  try {
    const payload = {
      companionCode: normalizeOptionalText(activeState.value.config.companionCode) || 'my_home_ai',
      displayName,
      personaPrompt: normalizeOptionalText(activeState.value.config.personaPrompt),
      avatarAssetId: toNumber(activeState.value.config.avatarAssetId) || undefined,
      worldbookIds: parseCsvIds(activeState.value.config.worldbookIdsText),
      memoryEnabled: Boolean(activeState.value.config.memoryEnabled),
      scenePrompt: normalizeOptionalText(activeState.value.config.scenePrompt)
    };
    const config = await updateAdminAiCompanionConfig(payload, auth.authorizedFetch);
    syncCompanionStateFromConfig(config);
    companionProfile.loaded = true;
    if (!options.silent) {
      setCompanionFeedback('companion 配置已保存。');
    }
    return config;
  } catch (error) {
    companionProfile.errorText = resolveErrorMessage(error);
    if (options.throwOnError) {
      throw error;
    }
    return null;
  } finally {
    companionProfile.saving = false;
  }
}

async function ensureSession(state, openingMessage) {
  if (normalizeOptionalText(state.sessionId)) return;

  if (state.mode === 'companion') {
    if (!auth.isAuthenticated.value || !isAdminUser.value) {
      throw new Error('自宅 companion 仅对 ADMIN 开放。');
    }
    await submitSaveCompanionConfig({ silent: true, throwOnError: true });
    const summary = await createAdminAiCompanionSession(auth.authorizedFetch);
    syncStateFromSessionSummary(state, summary);
    return;
  }

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

  if (state.mode === 'town_npc' || state.mode === 'companion') {
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
    if (normalizeOptionalText(state.config.townRoomCode)) {
      payload.townRoomCode = normalizeOptionalText(state.config.townRoomCode);
    }
    if (normalizeOptionalText(state.config.actorCode)) {
      payload.actorCode = normalizeOptionalText(state.config.actorCode);
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

.ai-dialog-shell.mode-embedded {
  height: auto;
  min-height: 0;
  pointer-events: auto;
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

.mode-embedded .ai-dialog {
  min-height: min(78vh, 880px);
  height: auto;
  border-radius: 28px;
  padding: 18px;
  gap: 14px;
  box-shadow: 0 18px 44px rgba(4, 7, 16, 0.3);
}

.ai-dialog-header {
  display: grid;
  grid-template-columns: auto 1fr auto;
  align-items: center;
  gap: 10px;
}

.header-spacer {
  width: 30px;
  height: 30px;
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

.config-toolbar {
  grid-template-columns: minmax(0, 1fr) auto;
  align-items: start;
}

.config-toolbar-actions {
  display: flex;
  flex-wrap: wrap;
  justify-content: flex-end;
  gap: 8px;
}

.config-title {
  color: rgba(246, 250, 255, 0.95);
  font-size: 13px;
  font-weight: 700;
}

.config-helper {
  margin: 6px 0 0;
  color: rgba(198, 211, 237, 0.78);
  font-size: 12px;
  line-height: 1.6;
}

.config-field span,
.config-toggle span {
  color: rgba(214, 225, 245, 0.82);
  font-size: 12px;
}

.config-field input,
.config-field textarea,
.config-select,
.management-card input,
.management-card textarea,
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

.config-select {
  appearance: none;
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

.config-inline-tip {
  color: rgba(186, 201, 231, 0.74);
  font-size: 11px;
}

.mini-action,
.management-btn,
.toolbar-btn {
  border: 0;
  border-radius: 12px;
  background: rgba(var(--accent-rgb), 0.18);
  color: rgba(247, 251, 255, 0.96);
  cursor: pointer;
  transition: background-color 0.2s ease, transform 0.2s ease;
}

.mini-action {
  min-width: 92px;
  padding: 10px 12px;
}

.management-btn {
  padding: 11px 14px;
}

.toolbar-btn {
  min-width: 96px;
  padding: 10px 12px;
}

.mini-action:hover:not(:disabled),
.management-btn:hover:not(:disabled),
.toolbar-btn:hover:not(:disabled) {
  background: rgba(var(--accent-rgb), 0.3);
  transform: translateY(-1px);
}

.mini-action:disabled,
.management-btn:disabled,
.toolbar-btn:disabled {
  cursor: not-allowed;
  opacity: 0.54;
}

.config-feedback {
  grid-column: 1 / -1;
  margin: 0;
  padding: 10px 12px;
  border-radius: 12px;
  background: rgba(78, 210, 156, 0.12);
  border: 1px solid rgba(78, 210, 156, 0.18);
  color: rgba(189, 250, 223, 0.95);
  font-size: 12px;
}

.config-feedback.error {
  background: rgba(255, 110, 110, 0.12);
  border-color: rgba(255, 120, 120, 0.2);
  color: rgba(255, 190, 190, 0.96);
}

.feedback-banner {
  grid-column: 1 / -1;
  margin: 0;
  padding: 10px 12px;
  border-radius: 12px;
  background: rgba(78, 210, 156, 0.12);
  border: 1px solid rgba(78, 210, 156, 0.18);
  color: rgba(189, 250, 223, 0.95);
  font-size: 12px;
}

.feedback-banner.success {
  background: rgba(78, 210, 156, 0.12);
  border-color: rgba(78, 210, 156, 0.18);
  color: rgba(189, 250, 223, 0.95);
}

.feedback-banner.warning {
  background: rgba(255, 196, 92, 0.12);
  border-color: rgba(255, 196, 92, 0.2);
  color: rgba(255, 225, 166, 0.96);
}

.feedback-banner.error {
  background: rgba(255, 110, 110, 0.12);
  border-color: rgba(255, 120, 120, 0.2);
  color: rgba(255, 190, 190, 0.96);
}

.worldbook-picker {
  display: grid;
  gap: 8px;
}

.worldbook-option {
  display: grid;
  grid-template-columns: auto 1fr;
  gap: 8px 10px;
  align-items: center;
  padding: 10px 12px;
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.08);
  background: rgba(255, 255, 255, 0.04);
}

.worldbook-option.active {
  border-color: rgba(var(--accent-rgb), 0.36);
  background: rgba(var(--accent-rgb), 0.1);
}

.worldbook-option span {
  font-size: 12px;
  color: rgba(243, 247, 255, 0.95);
}

.worldbook-option small {
  grid-column: 2;
  color: rgba(184, 198, 228, 0.72);
  font-size: 11px;
}

.picker-empty {
  margin: 0;
  color: rgba(184, 198, 228, 0.72);
  font-size: 11px;
}

.management-shell {
  border-radius: 16px;
  background: rgba(255, 255, 255, 0.04);
  border: 1px solid rgba(255, 255, 255, 0.08);
  padding: 10px 12px 12px;
}

.management-shell summary {
  cursor: pointer;
  color: rgba(244, 248, 255, 0.94);
  font-size: 13px;
  font-weight: 700;
}

.management-grid {
  margin-top: 12px;
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 12px;
}

.management-card {
  --liquid-bg: rgba(255, 255, 255, 0.04);
  --liquid-border: rgba(255, 255, 255, 0.08);
  --liquid-shadow: none;
  border-radius: 16px;
  padding: 14px;
  display: grid;
  gap: 10px;
}

.management-card header {
  display: grid;
  gap: 4px;
}

.management-card strong {
  color: rgba(247, 250, 255, 0.95);
  font-size: 13px;
}

.management-card span {
  color: rgba(187, 201, 230, 0.72);
  font-size: 11px;
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
  max-width: min(100%, 420px);
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

@media (min-width: 901px) {
  .mode-embedded .ai-dialog {
    display: grid;
    grid-template-columns: minmax(0, 1.68fr) minmax(300px, 0.92fr);
    grid-template-areas:
      'header header'
      'switch switch'
      'summary summary'
      'chat side'
      'error side'
      'input side';
    align-content: start;
  }

  .mode-embedded .ai-dialog-header {
    grid-area: header;
  }

  .mode-embedded .mode-switcher {
    grid-area: switch;
    max-width: 420px;
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }

  .mode-embedded .session-summary {
    grid-area: summary;
  }

  .mode-embedded .mode-config,
  .mode-embedded .mode-note {
    grid-area: side;
    align-self: stretch;
    height: 100%;
  }

  .mode-embedded .mode-note {
    border-radius: 18px;
    padding: 14px;
    background: rgba(255, 255, 255, 0.04);
    border: 1px solid rgba(255, 255, 255, 0.08);
  }

  .mode-embedded .chat-stream {
    grid-area: chat;
    min-height: clamp(320px, 44vh, 620px);
    padding-right: 10px;
  }

  .mode-embedded .error-banner {
    grid-area: error;
  }

  .mode-embedded .chat-input-wrap {
    grid-area: input;
  }

  .mode-embedded .chat-bubble {
    max-width: min(100%, 560px);
  }
}

@media (max-width: 900px) {
  .mode-sheet .ai-dialog {
    max-height: 100dvh;
    height: 100dvh;
    border-radius: 0;
  }

  .mode-embedded .ai-dialog {
    min-height: 0;
    padding: 16px;
  }

  .mode-switcher,
  .mode-config,
  .management-grid {
    grid-template-columns: 1fr;
  }

  .config-toolbar,
  .session-summary {
    align-items: flex-start;
    grid-template-columns: 1fr;
    flex-direction: column;
  }

  .summary-pills {
    justify-content: flex-start;
  }
}
</style>
