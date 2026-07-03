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
                  <p>这里负责承接上传、解析、预览和挂接四段链路。当前支持 zip/json/image 资源导入，并把最近一次预览挂接到指定小镇场景。</p>
                </div>
                <div class="stage-actions">
                  <button
                    class="stage-btn ripple-trigger"
                    type="button"
                    :disabled="townAssetEditor.refreshing"
                    @click="loadTownAssetPreview({ sceneCode: townAssetEditor.attachedSceneCode })"
                  >
                    {{ townAssetEditor.refreshing ? '读取中...' : '刷新预览' }}
                  </button>
                  <button class="stage-btn ripple-trigger" type="button" @click="activateTownWorkspace('map')">返回地图</button>
                </div>
              </div>

              <div class="editor-grid">
                <article class="editor-card liquid-material emphasis">
                  <span class="editor-step">01</span>
                  <strong>上传资源</strong>
                  <p>支持导入 RPGMaker `zip / json / image`。上传后会自动抽取元数据，并把预览挂到你选择的场景。</p>
                  <label class="editor-file-field">
                    <span>目标场景</span>
                    <select v-model="townAssetEditor.attachedSceneCode" class="editor-select">
                      <option v-for="scene in townScenes" :key="`editor-${scene.sceneCode}`" :value="scene.sceneCode">
                        {{ scene.title }} · {{ scene.sceneCode }}
                      </option>
                    </select>
                  </label>
                  <label class="editor-file-field">
                    <span>选择资源</span>
                    <input type="file" accept=".zip,.json,.png,.jpg,.jpeg,.webp" @change="handleTownAssetFileChange" />
                  </label>
                  <small v-if="townAssetEditor.selectedFileName" class="editor-inline-tip">已选：{{ townAssetEditor.selectedFileName }}</small>
                  <button class="stage-btn primary ripple-trigger" type="button" :disabled="townAssetEditor.importing" @click="submitTownAssetImport">
                    {{ townAssetEditor.importing ? '导入中...' : '导入并解析' }}
                  </button>
                </article>

                <article class="editor-card liquid-material">
                  <span class="editor-step">02</span>
                  <strong>解析结果</strong>
                  <p v-if="townAssetEditor.preview">
                    类型：{{ townAssetEditor.preview.assetType }} · 状态：{{ townAssetEditor.preview.parserStatus }} · 大小：{{ townAssetEditor.preview.rawSizeBytes }} bytes
                  </p>
                  <p v-else>导入后这里会显示资源类型、解析状态和大小，方便确认是否已进入可挂接态。</p>
                  <span class="editor-tag">{{ townAssetEditor.preview?.assetCode || '等待导入' }}</span>
                </article>

                <article class="editor-card liquid-material">
                  <span class="editor-step">03</span>
                  <strong>地图预览</strong>
                  <template v-if="townAssetEditor.preview?.previewHighlights?.length">
                    <ul class="editor-preview-list">
                      <li v-for="item in townAssetEditor.preview.previewHighlights" :key="item">{{ item }}</li>
                    </ul>
                  </template>
                  <p v-else>预览会优先展示地图尺寸、事件数量、压缩包样本文件和当前挂接场景。</p>
                  <span class="editor-tag">{{ townAssetEditor.preview?.attachedSceneCode || townAssetEditor.attachedSceneCode || '未挂接' }}</span>
                </article>

                <article class="editor-card liquid-material">
                  <span class="editor-step">04</span>
                  <strong>配置挂接</strong>
                  <p>
                    当前挂接目标：{{ townAssetEditor.preview?.attachedSceneCode || townAssetEditor.attachedSceneCode || '未选择' }}。不会在一期实现 RPGMaker 运行时，只做展示挂接。
                  </p>
                  <span class="editor-tag">{{ townAssetEditor.preview ? '已挂接预览' : '挂接待确认' }}</span>
                </article>
              </div>

              <p v-if="townAssetEditor.errorText" class="feedback-banner error">{{ townAssetEditor.errorText }}</p>
              <p v-else-if="townAssetEditor.feedbackText" class="feedback-banner">{{ townAssetEditor.feedbackText }}</p>

              <div v-if="townAssetEditor.preview" class="editor-data-grid">
                <article class="editor-data-card liquid-material">
                  <strong>元数据</strong>
                  <dl>
                    <template v-for="[key, value] in townAssetMetadataEntries" :key="`meta-${key}`">
                      <dt>{{ key }}</dt>
                      <dd>{{ Array.isArray(value) ? value.join(', ') : typeof value === 'object' ? JSON.stringify(value) : value }}</dd>
                    </template>
                  </dl>
                </article>

                <article class="editor-data-card liquid-material">
                  <strong>预览结构</strong>
                  <dl>
                    <template v-for="[key, value] in townAssetPreviewEntries" :key="`preview-${key}`">
                      <dt>{{ key }}</dt>
                      <dd>{{ Array.isArray(value) ? value.join(', ') : typeof value === 'object' ? JSON.stringify(value) : value }}</dd>
                    </template>
                  </dl>
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
                  <button class="stage-btn ripple-trigger" type="button" :disabled="townLoading || townFinanceHub.loading" @click="refreshTownStage">
                    {{ townLoading ? '刷新中...' : '刷新场景' }}
                  </button>
                  <button
                    v-if="canManageTownAssets"
                    class="stage-btn primary ripple-trigger"
                    type="button"
                    @click="activateTownWorkspace('editor')"
                  >
                    编辑
                  </button>
                </div>
              </div>
              <section v-if="isFinanceBuildingSelected" class="finance-drawer liquid-material">
                  <div class="finance-hero">
                    <div class="finance-hero-copy">
                      <span class="stage-kicker">Town Treasury House</span>
                      <h3>{{ FINANCE_TOWN_BUILDING.title }}</h3>
                      <p>{{ FINANCE_TOWN_BUILDING.description }}</p>
                      <div class="highlight-list finance-highlight-list">
                        <span v-for="item in FINANCE_TOWN_BUILDING.highlights" :key="item" class="highlight-chip">{{ item }}</span>
                      </div>
                    </div>

                    <div class="finance-emblem" aria-hidden="true">
                      <i class="fas fa-building-columns"></i>
                      <span>00:00</span>
                      <small>夜间对账</small>
                    </div>
                  </div>

                  <p v-if="townFinanceHub.errorText" class="feedback-banner error">{{ townFinanceHub.errorText }}</p>

                  <div v-if="townFinanceHub.loading" class="finance-state-card">
                    <strong>账房正在盘点</strong>
                    <p>正在读取账户总览、账单源状态和自动同步配置。</p>
                  </div>

                  <template v-else>
                    <div class="finance-metrics-grid">
                      <article class="finance-metric-card liquid-material">
                        <span>总资产</span>
                        <strong>{{ formatFinanceAmount(townFinanceHub.overview.totalBalance, townFinanceHub.overview.baseCurrency) }}</strong>
                        <small>{{ financeOverviewCaption }}</small>
                      </article>
                      <article class="finance-metric-card liquid-material">
                        <span>待还债务</span>
                        <strong>{{ formatFinanceAmount(townFinanceHub.overview.totalDebt, townFinanceHub.overview.baseCurrency) }}</strong>
                        <small>把借款与分期一起折进来</small>
                      </article>
                      <article class="finance-metric-card liquid-material accent-card">
                        <span>净资产</span>
                        <strong>{{ formatFinanceAmount(townFinanceHub.overview.netAsset, townFinanceHub.overview.baseCurrency) }}</strong>
                        <small>{{ financeSyncSummary }}</small>
                      </article>
                    </div>

                    <div class="finance-detail-grid">
                      <article class="finance-panel liquid-material">
                        <div class="finance-panel-head">
                          <div>
                            <span class="side-kicker">Import Sources</span>
                            <h4>账单导入来源</h4>
                          </div>
                          <small>{{ financeSourceSummary }}</small>
                        </div>

                        <div v-if="!auth.isAuthenticated" class="finance-empty-card">
                          <strong>登录后导入钱迹账单</strong>
                          <p>钱迹本地导入状态只对当前用户展示；未登录时这里只保留建筑入口。</p>
                          <button class="stage-btn primary ripple-trigger" type="button" @click="openFinanceLogin">前往登录</button>
                        </div>

                        <div v-else class="finance-source-grid">
                          <article
                            v-for="item in financeSourceCards"
                            :key="item.provider"
                            class="finance-source-card"
                            :class="[`tone-${item.tone}`, `status-${item.status.toLowerCase()}`]"
                          >
                            <div class="finance-source-head">
                              <strong>{{ item.label }}</strong>
                              <span class="finance-source-pill">{{ formatFinanceSourceStatus(item.status) }}</span>
                            </div>
                            <p>{{ item.hint }}</p>
                            <small>目标账户：{{ item.targetAccountName || '未绑定' }}</small>
                            <small>最近同步：{{ formatFinanceDateTime(item.lastSyncedAt) }}</small>
                          </article>
                        </div>
                      </article>

                      <article class="finance-panel liquid-material">
                        <div class="finance-panel-head">
                          <div>
                            <span class="side-kicker">Account Shelf</span>
                            <h4>账户货架</h4>
                          </div>
                          <small>{{ financeAccountSummary }}</small>
                        </div>

                        <div v-if="!financeTopAccounts.length" class="finance-empty-card">
                          <strong>账房还是空的</strong>
                          <p>先去记账模块里创建一个接收钱迹导入的本地账户，这里就会开始长出货架。</p>
                        </div>

                        <div v-else class="finance-account-list">
                          <article v-for="item in financeTopAccounts" :key="item.accountId" class="finance-account-card">
                            <div>
                              <strong>{{ item.accountName }}</strong>
                              <small>{{ item.channelName || item.channelCode || '未分渠道' }}</small>
                            </div>
                            <span>{{ formatFinanceAmount(item.balanceAmount, item.currencyCode) }}</span>
                          </article>
                        </div>
                      </article>
                    </div>
                  </template>

                  <div class="finance-action-row">
                    <button class="stage-btn ripple-trigger" type="button" @click="openTownFinanceWindow(BALANCE_SECTION_OVERVIEW)">打开总览</button>
                    <button class="stage-btn ripple-trigger" type="button" @click="openTownFinanceWindow(BALANCE_SECTION_TRANSACTIONS)">查看收支</button>
                    <button class="stage-btn ripple-trigger" type="button" @click="openTownFinanceWindow(BALANCE_SECTION_ACCOUNTS)">整理账户</button>
                    <button
                      class="stage-btn primary ripple-trigger"
                      type="button"
                      :disabled="!auth.isAuthenticated"
                      @click="openTownFinanceWindow(BALANCE_SECTION_SOURCES)"
                    >
                      管理账房
                    </button>
                  </div>
                </section>

              <p v-if="townErrorText" class="feedback-banner error">{{ townErrorText }}</p>

              <div class="town-map-shell">
                <div class="town-map-board">
                  <div class="map-backdrop"></div>
                  <div class="map-gridline"></div>

                  <button
                    v-for="node in townMapNodes"
                    :key="node.sceneCode"
                    class="map-node ripple-trigger"
                    :class="[`tone-${node.tone}`, { active: node.sceneCode === selectedTownSceneCode }]"
                    type="button"
                    :style="mapNodeStyle(node)"
                    @click="handleTownDestinationClick(node.sceneCode)"
                  >
                    <span v-if="node.kind === 'finance'" class="map-node-mark" aria-hidden="true">
                      <i class="fas fa-coins"></i>
                    </span>
                    <strong>{{ node.title }}</strong>
                    <small>{{ node.kind === 'finance' ? 'vault house' : node.sceneCode }}</small>
                  </button>
                </div>

                <div class="scene-rail">
                  <button
                    v-for="scene in townRailItems"
                    :key="scene.sceneCode"
                    class="scene-chip ripple-trigger"
                    :class="{ active: scene.sceneCode === selectedTownSceneCode }"
                    type="button"
                    @click="handleTownDestinationClick(scene.sceneCode)"
                  >
                    <strong>{{ scene.title }}</strong>
                    <span>{{ scene.npcCount }} 个展示点</span>
                  </button>
                </div>
              </div>
            </template>
          </template>

          <template v-else>
            <div v-if="isCompanionConversation" class="companion-workspace">
              <section class="companion-stage liquid-material" :data-companion-status="companionStage.status">
                <header class="companion-stage-head">
                  <div>
                    <span class="stage-kicker">Live2D Companion</span>
                    <h2>自宅 companion 观看区</h2>
                    <p>复用公开 L2D 资源契约，随右侧对话切换 idle / thinking / speaking 状态。</p>
                  </div>
                  <span class="companion-status" :class="`status-${companionStage.status}`">
                    {{ companionStageLabel }}
                  </span>
                </header>

                <div class="companion-l2d-frame">
                  <WallpaperL2dCanvas
                    v-if="companionStageAsset && !companionStage.renderFailed"
                    :model-url="companionStageAsset.modelUrl"
                    :model-entry="companionStageAsset.modelEntry"
                    :fallback-src="companionStageAsset.fallbackSrc"
                    @error="handleCompanionL2dError"
                  />
                  <div v-else class="companion-l2d-empty">
                    <strong>{{ companionStage.loading ? 'L2D 资源读取中...' : '还没有可用 L2D companion' }}</strong>
                    <p>
                      {{
                        companionStage.errorText ||
                        '请先在公开首页角色池中准备一个 LIVE2D_PACKAGE，并确保它包含 downloadUrl 与 l2dEntryModelJson。'
                      }}
                    </p>
                  </div>
                  <div class="companion-stage-glow" aria-hidden="true"></div>
                </div>

                <div class="companion-stage-footer">
                  <span>{{ companionStageAsset?.title || '等待 L2D 资源' }}</span>
                  <small v-if="companionStage.lastAssistantMessage">{{ companionStage.lastAssistantMessage }}</small>
                  <small v-else>当前状态：{{ companionStageLabel }}</small>
                </div>
              </section>

              <AiDialog
                :visible="true"
                mode="embedded"
                chat-mode="companion"
                :allowed-modes="conversationAllowedModes"
                :open-payload="conversationOpenPayload"
                :show-header="false"
                :show-close-button="false"
                @mode-change="handleConversationModeChange"
                @chat-state="handleConversationChatState"
              />
            </div>

            <AiDialog
              v-else
              :visible="true"
              mode="embedded"
              :chat-mode="conversationChatMode"
              :allowed-modes="conversationAllowedModes"
              :open-payload="conversationOpenPayload"
              :show-header="false"
              :show-close-button="false"
              @mode-change="handleConversationModeChange"
              @chat-state="handleConversationChatState"
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
                <p>这一层已经接上真实上传、解析和预览链路；后续只需要继续细化挂接表现，而不用重做 AI Hub 壳层。</p>
              </article>
            </div>
          </template>

          <template v-else-if="isFinanceBuildingSelected">
            <div class="side-panel-head">
              <div class="scene-meta-row">
                <span class="scene-type">{{ FINANCE_TOWN_BUILDING.sceneType }}</span>
                <small>{{ financeAuthLabel }}</small>
              </div>
              <h3>{{ FINANCE_TOWN_BUILDING.title }}</h3>
              <p>{{ FINANCE_TOWN_BUILDING.description }}</p>
            </div>

            <p class="scene-atmosphere">{{ FINANCE_TOWN_BUILDING.atmosphereHint }}</p>

            <div class="quick-actions">
              <button class="quick-btn ripple-trigger" type="button" @click="openTownFinanceWindow(BALANCE_SECTION_OVERVIEW)">打开总账</button>
              <button class="quick-btn ripple-trigger" type="button" @click="openTownFinanceWindow(BALANCE_SECTION_ACCOUNTS)">整理账户</button>
              <button
                class="quick-btn primary ripple-trigger"
                type="button"
                :disabled="!auth.isAuthenticated"
                @click="openTownFinanceWindow(BALANCE_SECTION_SOURCES)"
              >
                自动同步
              </button>
            </div>

            <div class="highlight-list">
              <span v-for="item in FINANCE_TOWN_BUILDING.highlights" :key="item" class="highlight-chip">{{ item }}</span>
            </div>

            <div class="side-info-list">
              <article class="side-info-card">
                <strong>账房状态</strong>
                <p>{{ financeStatusSummary }}</p>
              </article>
              <article class="side-info-card">
                <strong>导入规则</strong>
                <p>{{ financeSyncSummary }}</p>
              </article>
              <article class="side-info-card">
                <strong>接入范围</strong>
                <p>这里只保留钱迹导出的本地文件导入，不再使用扫码登录、浏览器插件或服务器抓账。</p>
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
                v-if="canManageTownAssets"
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
import { computed, onMounted, reactive, ref, watch } from 'vue';
import AiDialog from '../components/AiDialog.vue';
import WallpaperL2dCanvas from '../components/WallpaperL2dCanvas.vue';
import { useAuthSession } from '../composables/useAuthSession';
import {
  createAdminTownNpcSession,
  getAiTownPublicMap,
  getAiTownScene,
  importAdminAiTownAsset,
  listAiTownScenes,
  previewAdminAiTownAsset
} from '../services/aiApi';
import {
  getLightAppBalanceOverview,
  listLightAppBalanceAccounts,
  listLightAppBalanceSourceAccountStatus
} from '../services/lightAppsApi';
import { listPublicHomeRoles } from '../services/wallpaperApi';
import { openLightAppShellWindow } from '../components/lightapps/lightAppShellStore';
import {
  BALANCE_SECTION_ACCOUNTS,
  BALANCE_SECTION_OVERVIEW,
  BALANCE_SECTION_SOURCES,
  BALANCE_SECTION_TRANSACTIONS,
  setBalanceWindowSection
} from '../components/lightapps/balance/balanceWindowState';
import { buildAiCapabilityState } from '../utils/aiAuthorizationState';
import { resolveCompanionStageStatus, selectCompanionL2dAsset } from '../utils/aiCompanionStage';
import { readGuestLightAppData, readRemoteLightAppCache } from '../utils/lightAppsDataStore';

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
const townAssetEditor = reactive(createTownAssetEditorState());
const companionStage = reactive(createCompanionStageState());

const STANDARD_CONVERSATION_MODES = ['normal', 'tavern'];
const ADMIN_CONVERSATION_MODES = ['town_npc', 'companion'];
const FINANCE_TOWN_BUILDING_CODE = 'finance_vault';
const FINANCE_SOURCE_METAS = Object.freeze([
  { provider: 'qianji', label: '钱迹', hint: '读取你手动导出的 CSV / JSON 账单文件。', tone: 'emerald' }
]);
const FINANCE_TOWN_BUILDING = Object.freeze({
  sceneCode: FINANCE_TOWN_BUILDING_CODE,
  title: '账房库',
  sceneType: 'finance_house',
  description: '这里专门收拢资产、本地账单导入和日常对账。点开它，小镇就会露出真正的管钱后台。',
  atmosphereHint: '黄铜门轴、账本纸页和抽屉标签一起运转，像一座安静但很可靠的库房。',
  highlights: ['钱迹账单导入', '本地文件解析', '本地账户归档', '不再扫码抓账'],
  publicVisible: true,
  tone: 'emerald',
  coordX: 79,
  coordY: 74,
  npcCount: 0,
  npcs: []
});
const townFinanceHub = reactive(createTownFinanceHubState());

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

function createTownAssetEditorState() {
  return {
    importing: false,
    refreshing: false,
    errorText: '',
    feedbackText: '',
    selectedFile: null,
    selectedFileName: '',
    attachedSceneCode: '',
    preview: null
  };
}

function createCompanionStageState() {
  return {
    loading: false,
    loaded: false,
    status: 'idle',
    asset: null,
    errorText: '',
    renderFailed: false,
    lastAssistantMessage: ''
  };
}

function createTownFinanceHubState() {
  return {
    loading: false,
    loaded: false,
    mode: 'guest',
    errorText: '',
    overview: {
      baseCurrency: 'CNY',
      totalBalance: 0,
      totalDebt: 0,
      netAsset: 0,
      calculatedAt: ''
    },
    accounts: [],
    sourceAccounts: []
  };
}

function normalizeTownAssetPreview(raw = {}) {
  return {
    assetImportId: toNumber(raw.assetImportId ?? raw.asset_import_id),
    assetCode: normalizeOptionalText(raw.assetCode || raw.asset_code),
    sourceName: normalizeOptionalText(raw.sourceName || raw.source_name) || '未命名资源',
    assetType: normalizeOptionalText(raw.assetType || raw.asset_type) || 'unknown',
    parserStatus: normalizeOptionalText(raw.parserStatus || raw.parser_status) || 'UNKNOWN',
    rawSizeBytes: toNumber(raw.rawSizeBytes ?? raw.raw_size_bytes),
    attachedSceneCode: normalizeOptionalText(raw.attachedSceneCode || raw.attached_scene_code) || '',
    previewHighlights: Array.isArray(raw.previewHighlights || raw.preview_highlights)
      ? (raw.previewHighlights || raw.preview_highlights).map((item) => normalizeOptionalText(item)).filter(Boolean)
      : [],
    metadata: raw.metadata && typeof raw.metadata === 'object' ? raw.metadata : {},
    preview: raw.preview && typeof raw.preview === 'object' ? raw.preview : {}
  };
}

function resolveTownError(error) {
  if (error instanceof Error && normalizeOptionalText(error.message)) {
    return error.message;
  }
  return 'AI 小镇数据加载失败，请稍后再试。';
}

function isAdminOnlyConversationMode(mode) {
  return ADMIN_CONVERSATION_MODES.includes(normalizeOptionalText(mode));
}

function resolveConversationMode(mode) {
  const normalized = normalizeOptionalText(mode);
  if (STANDARD_CONVERSATION_MODES.includes(normalized) || ADMIN_CONVERSATION_MODES.includes(normalized)) {
    return normalized;
  }
  return 'normal';
}

function isTownPreviewNotFound(error) {
  if (Number(error?.status) === 404) {
    return true;
  }
  const message = normalizeOptionalText(error?.message).toLowerCase();
  return message.includes('not found');
}

function isFinanceBuildingCode(sceneCode) {
  return normalizeOptionalText(sceneCode) === FINANCE_TOWN_BUILDING_CODE;
}

function formatFinanceAmount(value, currencyCode = 'CNY') {
  const amount = Number(value);
  const currency = normalizeOptionalText(currencyCode).toUpperCase() || 'CNY';
  const safeAmount = Number.isFinite(amount) ? amount : 0;
  try {
    return new Intl.NumberFormat('zh-CN', {
      style: 'currency',
      currency,
      maximumFractionDigits: 2
    }).format(safeAmount);
  } catch {
    return `${currency} ${safeAmount.toFixed(2)}`;
  }
}

function formatFinanceDateTime(value) {
  const text = normalizeOptionalText(value);
  if (!text) return '未记录';
  const date = new Date(text);
  if (Number.isNaN(date.getTime())) {
    return text;
  }
  return new Intl.DateTimeFormat('zh-CN', {
    month: '2-digit',
    day: '2-digit',
    hour: '2-digit',
    minute: '2-digit'
  }).format(date);
}

function formatFinanceSourceStatus(status) {
  const normalized = normalizeOptionalText(status).toUpperCase();
  if (normalized === 'BOUND') return '已绑定';
  if (normalized === 'PENDING') return '绑定中';
  if (normalized === 'REAUTH_REQUIRED') return '待重绑';
  if (normalized === 'RUNNING') return '同步中';
  return '未绑定';
}

function applyTownFinanceSnapshot(snapshot = {}, mode = 'guest') {
  const overview = snapshot?.overview && typeof snapshot.overview === 'object' ? snapshot.overview : {};
  townFinanceHub.mode = mode;
  townFinanceHub.overview = {
    baseCurrency: normalizeOptionalText(overview.baseCurrency || overview.base_currency).toUpperCase() || 'CNY',
    totalBalance: Number(overview.totalBalance ?? overview.total_balance) || 0,
    totalDebt: Number(overview.totalDebt ?? overview.total_debt) || 0,
    netAsset: Number(overview.netAsset ?? overview.net_asset) || 0,
    calculatedAt: overview.calculatedAt || overview.calculated_at || ''
  };
  townFinanceHub.accounts = Array.isArray(snapshot?.accounts) ? snapshot.accounts.slice() : [];
  townFinanceHub.sourceAccounts = Array.isArray(snapshot?.sourceAccounts) ? snapshot.sourceAccounts.slice() : [];
  townFinanceHub.loaded = true;
}

async function loadTownFinanceHub(force = false) {
  if (townFinanceHub.loading) return;
  const targetMode = auth.isAuthenticated.value ? 'remote' : 'guest';
  if (townFinanceHub.loaded && townFinanceHub.mode === targetMode && !force) return;

  townFinanceHub.loading = true;
  townFinanceHub.errorText = '';
  try {
    if (auth.isAuthenticated.value) {
      const [overview, accounts, sourceAccounts] = await Promise.all([
        getLightAppBalanceOverview('CNY', auth.authorizedFetch),
        listLightAppBalanceAccounts(auth.authorizedFetch),
        listLightAppBalanceSourceAccountStatus(auth.authorizedFetch)
      ]);
      applyTownFinanceSnapshot({ overview, accounts, sourceAccounts }, 'remote');
      return;
    }

    const guest = readGuestLightAppData();
    applyTownFinanceSnapshot(
      {
        overview: guest.balanceOverview || {},
        accounts: guest.balanceAccounts || [],
        sourceAccounts: []
      },
      'guest'
    );
  } catch (error) {
    townFinanceHub.errorText = error instanceof Error && normalizeOptionalText(error.message)
      ? error.message
      : '账房账册暂时打不开，请稍后再试。';
    const fallback = auth.isAuthenticated.value ? readRemoteLightAppCache() : readGuestLightAppData();
    applyTownFinanceSnapshot(
      {
        overview: fallback.balanceOverview || {},
        accounts: fallback.balanceAccounts || [],
        sourceAccounts: auth.isAuthenticated.value ? townFinanceHub.sourceAccounts : []
      },
      auth.isAuthenticated.value ? 'cache' : 'guest'
    );
  } finally {
    townFinanceHub.loading = false;
  }
}

async function selectTownFinanceBuilding(force = false) {
  selectedTownSceneCode.value = FINANCE_TOWN_BUILDING.sceneCode;
  selectedTownScene.value = {
    ...FINANCE_TOWN_BUILDING,
    highlights: [...FINANCE_TOWN_BUILDING.highlights],
    npcs: []
  };
  await loadTownFinanceHub(force);
}

function openTownFinanceWindow(section = BALANCE_SECTION_OVERVIEW) {
  const windowId = openLightAppShellWindow('balance-ledger', { source: 'ai_town_finance_house' });
  if (windowId > 0) {
    setBalanceWindowSection(windowId, section);
  }
}

function openFinanceLogin() {
  auth.redirectToAuth('login_required', '/ai-hub');
}

async function handleTownDestinationClick(sceneCode) {
  if (isFinanceBuildingCode(sceneCode)) {
    await selectTownFinanceBuilding();
    return;
  }
  await loadTownScene(sceneCode);
}

async function refreshTownStage() {
  await loadTownExplorer({
    preserveSelectedCode: selectedTownSceneCode.value,
    refreshFinance: isFinanceBuildingCode(selectedTownSceneCode.value)
  });
}

const adminCapability = computed(() =>
  buildAiCapabilityState({
    authenticated: auth.isAuthenticated.value,
    groups: Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [],
    mode: 'town_npc'
  })
);
const isAdminUser = computed(() => adminCapability.value.isAdmin);
const canManageTownAssets = computed(() => adminCapability.value.canManageTownAssets);
const conversationAllowedModes = computed(() =>
  isAdminUser.value ? [...STANDARD_CONVERSATION_MODES, ...ADMIN_CONVERSATION_MODES] : [...STANDARD_CONVERSATION_MODES]
);

const selectedTownSceneSummary = computed(() =>
  townScenes.value.find((item) => item.sceneCode === selectedTownSceneCode.value) || null
);
const isFinanceBuildingSelected = computed(() => isFinanceBuildingCode(selectedTownSceneCode.value));
const townMapNodes = computed(() => [
  ...townMap.value.scenes.map((item) => ({ ...item, kind: 'scene' })),
  {
    sceneCode: FINANCE_TOWN_BUILDING.sceneCode,
    title: FINANCE_TOWN_BUILDING.title,
    coordX: FINANCE_TOWN_BUILDING.coordX,
    coordY: FINANCE_TOWN_BUILDING.coordY,
    tone: FINANCE_TOWN_BUILDING.tone,
    kind: 'finance'
  }
]);
const townRailItems = computed(() => [
  ...townScenes.value.map((item) => ({
    ...item,
    metaLabel: `${item.npcCount} 个展示点`
  })),
  {
    ...FINANCE_TOWN_BUILDING,
    npcCount: '账务中心',
    metaLabel: '账务中心',
    kind: 'finance'
  }
]);
const townAssetMetadataEntries = computed(() => Object.entries(townAssetEditor.preview?.metadata || {}).slice(0, 8));
const townAssetPreviewEntries = computed(() => Object.entries(townAssetEditor.preview?.preview || {}).slice(0, 6));
const financeSourceCards = computed(() =>
  FINANCE_SOURCE_METAS.map((meta) => {
    const source = townFinanceHub.sourceAccounts.find((item) => item.provider === meta.provider) || {};
    return {
      ...meta,
      status: normalizeOptionalText(source.status).toUpperCase() || 'UNBOUND',
      bound: source.bound === true,
      nightlyEnabled: source.nightlyEnabled === true,
      targetAccountName: normalizeOptionalText(source.targetAccountName),
      lastSyncedAt: source.lastSyncedAt || ''
    };
  })
);
const financeTopAccounts = computed(() =>
  [...townFinanceHub.accounts]
    .sort((left, right) => Number(right.balanceAmount || 0) - Number(left.balanceAmount || 0))
    .slice(0, 5)
);
const financeOverviewCaption = computed(() => {
  if (townFinanceHub.overview.calculatedAt) {
    return `更新于 ${formatFinanceDateTime(townFinanceHub.overview.calculatedAt)}`;
  }
  return auth.isAuthenticated.value ? '实时汇总你的账户余额' : '游客模式下展示本地缓存';
});
const financeSourceSummary = computed(() => {
  const boundCount = financeSourceCards.value.filter((item) => item.bound).length;
  return `${boundCount}/${financeSourceCards.value.length} 已就绪`;
});
const financeAccountSummary = computed(() => `${townFinanceHub.accounts.length} 个账户`);
const financeAuthLabel = computed(() => (auth.isAuthenticated.value ? '私有账本已开启' : '未登录，仅展示建筑入口'));
const financeStatusSummary = computed(() => {
  if (!auth.isAuthenticated.value) {
    return '登录后这里会展示你的资产总览、钱迹导入状态和本地账户归档情况。';
  }
  return `当前共管理 ${townFinanceHub.accounts.length} 个账户，${financeSourceCards.value.filter((item) => item.bound).length} 个钱迹来源已就绪。`;
});
const financeSyncSummary = computed(() => {
  const nightlyCount = financeSourceCards.value.filter((item) => item.nightlyEnabled).length;
  if (!auth.isAuthenticated.value) {
    return '登录后可把钱迹导出的账单文件导入到账本。';
  }
  return nightlyCount > 0 ? `已保留 ${nightlyCount} 个来源的导入配置` : '还没有保存钱迹导入配置';
});

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

const isCompanionConversation = computed(() => activePrimaryMode.value === 'conversation' && conversationChatMode.value === 'companion');
const companionStageAsset = computed(() => companionStage.asset);
const companionStageLabel = computed(() => {
  if (companionStage.status === 'thinking') return 'Thinking';
  if (companionStage.status === 'speaking') return 'Speaking';
  return 'Idle';
});
const canOpenCompanion = computed(() => isAdminUser.value && selectedTownSceneCode.value === 'home_gate');

function activateTownWorkspace(nextSubView = 'map') {
  if (nextSubView === 'editor' && !canManageTownAssets.value) {
    townSubView.value = 'map';
    townActionError.value = '只有 ADMIN 可以使用地图编辑器。';
    return;
  }
  activePrimaryMode.value = 'town';
  townSubView.value = nextSubView;
  if (nextSubView === 'editor') {
    townAssetEditor.attachedSceneCode = isFinanceBuildingCode(selectedTownSceneCode.value)
      ? townScenes.value[0]?.sceneCode || 'library'
      : selectedTownSceneCode.value || townScenes.value[0]?.sceneCode || 'library';
    void loadTownAssetPreview({ sceneCode: townAssetEditor.attachedSceneCode, silent: true });
  }
}

function activateStandardConversation() {
  activePrimaryMode.value = 'conversation';
  if (conversationChatMode.value === 'town_npc' || conversationChatMode.value === 'companion') {
    conversationChatMode.value = 'normal';
  }
  conversationOpenPayload.value = null;
}

function openConversationWorkspace(mode, payload = null) {
  if (isAdminOnlyConversationMode(mode) && !isAdminUser.value) {
    conversationChatMode.value = 'normal';
    conversationOpenPayload.value = null;
    activePrimaryMode.value = 'conversation';
    return;
  }
  activePrimaryMode.value = 'conversation';
  conversationChatMode.value = resolveConversationMode(mode);
  conversationOpenPayload.value = payload ? { ...payload, openedAt: Date.now() } : null;
}

function handleConversationModeChange(mode) {
  conversationChatMode.value = resolveConversationMode(mode);
  if (conversationChatMode.value === 'normal' || conversationChatMode.value === 'tavern') {
    conversationOpenPayload.value = null;
  }
  if (conversationChatMode.value !== 'companion') {
    resetCompanionStageStatus();
  }
}

function resetAdminOnlyWorkspaceState() {
  if (townSubView.value === 'editor') {
    townSubView.value = 'map';
  }
  if (conversationChatMode.value === 'town_npc' || conversationChatMode.value === 'companion') {
    conversationChatMode.value = 'normal';
  }
  if (isAdminOnlyConversationMode(conversationOpenPayload.value?.preferredMode) || isAdminOnlyConversationMode(conversationOpenPayload.value?.mode)) {
    conversationOpenPayload.value = null;
  }
}

async function loadTownScene(sceneCode) {
  const normalizedSceneCode = normalizeOptionalText(sceneCode);
  if (!normalizedSceneCode) return;
  selectedTownSceneCode.value = normalizedSceneCode;
  selectedTownScene.value = normalizeTownSceneDetail(await getAiTownScene(normalizedSceneCode));
  if (canManageTownAssets.value) {
    townAssetEditor.attachedSceneCode = normalizedSceneCode;
    if (townSubView.value === 'editor') {
      await loadTownAssetPreview({ sceneCode: normalizedSceneCode, silent: true, preserveFeedback: true });
    }
  } else if (!townAssetEditor.attachedSceneCode) {
    townAssetEditor.attachedSceneCode = normalizedSceneCode;
  }
}

function resetCompanionStageStatus() {
  companionStage.status = 'idle';
  companionStage.lastAssistantMessage = '';
}

function handleConversationChatState(event) {
  if (event?.mode !== 'companion') return;
  companionStage.status = resolveCompanionStageStatus(event, companionStage.status);
  if (event?.assistantMessage || event?.assistant_message) {
    companionStage.lastAssistantMessage = normalizeOptionalText(event.assistantMessage || event.assistant_message).slice(0, 120);
  }
  if (event?.phase === 'send-error') {
    companionStage.lastAssistantMessage = normalizeOptionalText(event.errorText).slice(0, 120);
  }
}

function handleCompanionL2dError(message) {
  companionStage.renderFailed = true;
  companionStage.errorText = `L2D companion 渲染失败：${normalizeOptionalText(message) || 'runtime unavailable'}`;
}

async function loadCompanionStageAssets(force = false) {
  if (companionStage.loading) return;
  if (companionStage.loaded && !force) return;

  companionStage.loading = true;
  companionStage.errorText = '';
  try {
    const roles = await listPublicHomeRoles();
    const preferredAssetId = toNumber(conversationOpenPayload.value?.bootstrap?.config?.avatarAssetId);
    companionStage.asset = selectCompanionL2dAsset(roles, preferredAssetId);
    companionStage.renderFailed = false;
    companionStage.loaded = true;
    if (!companionStage.asset) {
      companionStage.errorText = '公开角色池里还没有可渲染的 L2D 资源。';
    }
  } catch (error) {
    companionStage.asset = null;
    companionStage.errorText = resolveTownError(error);
  } finally {
    companionStage.loading = false;
  }
}

function handleTownAssetFileChange(event) {
  const file = event?.target?.files?.[0] || null;
  townAssetEditor.selectedFile = file;
  townAssetEditor.selectedFileName = file?.name || '';
}

async function submitTownAssetImport() {
  if (!auth.isAuthenticated.value || !canManageTownAssets.value) {
    townAssetEditor.errorText = '只有 ADMIN 可以上传 RPGMaker 资源。';
    return;
  }
  if (!townAssetEditor.selectedFile) {
    townAssetEditor.errorText = '请先选择一个 RPGMaker zip/json/image 文件。';
    return;
  }

  townAssetEditor.importing = true;
  townAssetEditor.errorText = '';
  townAssetEditor.feedbackText = '';
  try {
    const formData = new FormData();
    formData.append('file', townAssetEditor.selectedFile);
    if (normalizeOptionalText(townAssetEditor.attachedSceneCode)) {
      formData.append('scene_code', townAssetEditor.attachedSceneCode);
    }
    const preview = await importAdminAiTownAsset(formData, auth.authorizedFetch);
    townAssetEditor.preview = normalizeTownAssetPreview(preview);
    if (townAssetEditor.preview.attachedSceneCode) {
      townAssetEditor.attachedSceneCode = townAssetEditor.preview.attachedSceneCode;
    }
    await loadTownAssetPreview({
      assetCode: townAssetEditor.preview.assetCode,
      sceneCode: townAssetEditor.attachedSceneCode,
      silent: true,
      preserveFeedback: true,
      suppressEmptyFeedback: true
    });
    townAssetEditor.feedbackText = 'RPGMaker 资源已导入并生成预览。';
    townAssetEditor.selectedFile = null;
    townAssetEditor.selectedFileName = '';
  } catch (error) {
    townAssetEditor.errorText = resolveTownError(error);
  } finally {
    townAssetEditor.importing = false;
  }
}

async function loadTownAssetPreview(options = {}) {
  if (!auth.isAuthenticated.value || !canManageTownAssets.value) {
    return;
  }
  const sceneCode = normalizeOptionalText(options.sceneCode || townAssetEditor.attachedSceneCode);
  const assetCode = normalizeOptionalText(options.assetCode || townAssetEditor.preview?.assetCode);
  if (!sceneCode && !assetCode) {
    townAssetEditor.preview = null;
    return;
  }

  townAssetEditor.refreshing = true;
  if (!options.silent) {
    townAssetEditor.errorText = '';
    if (!options.preserveFeedback) {
      townAssetEditor.feedbackText = '';
    }
  }
  try {
    const preview = await previewAdminAiTownAsset(
      assetCode ? { assetCode } : { sceneCode },
      auth.authorizedFetch
    );
    townAssetEditor.preview = normalizeTownAssetPreview(preview);
    if (townAssetEditor.preview.attachedSceneCode) {
      townAssetEditor.attachedSceneCode = townAssetEditor.preview.attachedSceneCode;
    }
  } catch (error) {
    if (isTownPreviewNotFound(error)) {
      townAssetEditor.preview = null;
      if (!options.silent && !options.suppressEmptyFeedback) {
        townAssetEditor.feedbackText = '当前场景还没有已挂接的 RPGMaker 预览。';
      }
    } else {
      townAssetEditor.errorText = resolveTownError(error);
    }
  } finally {
    townAssetEditor.refreshing = false;
  }
}

async function loadTownExplorer(options = {}) {
  townLoading.value = true;
  townErrorText.value = '';
  try {
    const [sceneListPayload, mapPayload] = await Promise.all([listAiTownScenes(), getAiTownPublicMap()]);
    townScenes.value = Array.isArray(sceneListPayload) ? sceneListPayload.map(normalizeTownSceneSummary) : [];
    townMap.value = normalizeTownMap(mapPayload);
    const preferredSceneCode = normalizeOptionalText(options.preserveSelectedCode || selectedTownSceneCode.value);
    if (isFinanceBuildingCode(preferredSceneCode)) {
      await selectTownFinanceBuilding(Boolean(options.refreshFinance));
      if (!townAssetEditor.attachedSceneCode) {
        townAssetEditor.attachedSceneCode = townScenes.value[0]?.sceneCode || 'library';
      }
      return;
    }
    const defaultSceneCode = preferredSceneCode || townScenes.value[0]?.sceneCode || 'library';
    await loadTownScene(defaultSceneCode);
    if (!townAssetEditor.attachedSceneCode) {
      townAssetEditor.attachedSceneCode = defaultSceneCode;
    }
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

watch(
  () => isCompanionConversation.value,
  (active) => {
    if (active) {
      void loadCompanionStageAssets();
      return;
    }
    resetCompanionStageStatus();
  }
);

watch(
  () => [auth.isAuthenticated.value, isAdminUser.value],
  ([authenticated, admin]) => {
    if (authenticated && admin) {
      return;
    }
    resetAdminOnlyWorkspaceState();
  },
  { immediate: true }
);

watch(
  () => auth.isAuthenticated.value,
  (authenticated, previous) => {
    if (authenticated === previous) return;
    if (isFinanceBuildingSelected.value) {
      void loadTownFinanceHub(true);
    }
  }
);
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

.map-node-mark {
  width: 28px;
  height: 28px;
  border-radius: 10px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  margin-bottom: 4px;
  background: linear-gradient(145deg, rgba(255, 213, 120, 0.28), rgba(255, 255, 255, 0.08));
  color: rgba(255, 232, 179, 0.96);
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.12);
}

.finance-drawer {
  margin-top: 6px;
  padding: 18px;
  border-radius: 26px;
  display: grid;
  gap: 16px;
  background:
    radial-gradient(circle at top right, rgba(255, 192, 110, 0.16), transparent 28%),
    radial-gradient(circle at bottom left, rgba(91, 173, 255, 0.12), transparent 24%),
    rgba(255, 255, 255, 0.045);
}

.finance-hero {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 150px;
  gap: 18px;
  align-items: center;
}

.finance-hero-copy {
  display: grid;
  gap: 10px;
}

.finance-hero-copy h3,
.finance-panel-head h4 {
  margin: 0;
  font-size: clamp(22px, 2vw, 28px);
  line-height: 1.08;
}

.finance-emblem {
  min-height: 150px;
  border-radius: 28px;
  display: grid;
  place-items: center;
  gap: 6px;
  background:
    radial-gradient(circle at 50% 36%, rgba(255, 214, 122, 0.32), transparent 34%),
    linear-gradient(180deg, rgba(39, 27, 14, 0.82), rgba(16, 13, 10, 0.94));
  border: 1px solid rgba(255, 219, 158, 0.22);
  color: rgba(255, 240, 207, 0.95);
  text-align: center;
  box-shadow: 0 18px 40px rgba(10, 7, 5, 0.26);
}

.finance-emblem i {
  font-size: 34px;
}

.finance-emblem span {
  font-size: 28px;
  font-weight: 800;
  letter-spacing: 0.08em;
}

.finance-emblem small {
  color: rgba(255, 235, 196, 0.78);
  letter-spacing: 0.12em;
  text-transform: uppercase;
}

.finance-highlight-list {
  gap: 10px;
}

.finance-state-card,
.finance-panel,
.finance-metric-card {
  border-radius: 22px;
  padding: 16px;
  display: grid;
  gap: 10px;
}

.finance-state-card {
  background: rgba(255, 255, 255, 0.05);
  border: 1px dashed rgba(255, 255, 255, 0.16);
}

.finance-metrics-grid,
.finance-detail-grid {
  display: grid;
  gap: 12px;
}

.finance-metrics-grid {
  grid-template-columns: repeat(3, minmax(0, 1fr));
}

.finance-detail-grid {
  grid-template-columns: minmax(0, 1.1fr) minmax(300px, 0.9fr);
}

.finance-metric-card span,
.finance-panel-head small,
.finance-account-card small,
.finance-source-card small {
  color: rgba(203, 217, 240, 0.78);
  font-size: 12px;
}

.finance-metric-card strong {
  font-size: clamp(24px, 2.6vw, 34px);
  line-height: 1;
}

.finance-metric-card.accent-card {
  background: linear-gradient(145deg, rgba(var(--accent-rgb), 0.18), rgba(255, 255, 255, 0.04));
}

.finance-panel-head {
  display: flex;
  align-items: start;
  justify-content: space-between;
  gap: 10px;
}

.finance-source-grid,
.finance-account-list,
.finance-action-row {
  display: grid;
  gap: 10px;
}

.finance-source-grid {
  grid-template-columns: repeat(3, minmax(0, 1fr));
}

.finance-action-row {
  grid-template-columns: repeat(4, minmax(0, 1fr));
}

.finance-source-card,
.finance-account-card,
.finance-empty-card {
  border-radius: 18px;
  padding: 14px;
  background: rgba(255, 255, 255, 0.04);
  border: 1px solid rgba(255, 255, 255, 0.08);
  display: grid;
  gap: 8px;
}

.finance-empty-card {
  align-content: start;
}

.finance-source-card.tone-amber {
  box-shadow: inset 0 0 0 1px rgba(245, 183, 96, 0.14);
}

.finance-source-card.tone-sky {
  box-shadow: inset 0 0 0 1px rgba(111, 183, 255, 0.14);
}

.finance-source-card.tone-emerald {
  box-shadow: inset 0 0 0 1px rgba(103, 211, 161, 0.16);
}

.finance-source-card.status-bound {
  background: linear-gradient(145deg, rgba(63, 168, 132, 0.16), rgba(255, 255, 255, 0.04));
}

.finance-source-card.status-reauth_required {
  background: linear-gradient(145deg, rgba(201, 105, 105, 0.18), rgba(255, 255, 255, 0.04));
}

.finance-source-head,
.finance-account-card {
  display: flex;
  align-items: start;
  justify-content: space-between;
  gap: 10px;
}

.finance-source-pill {
  padding: 6px 9px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.08);
  color: rgba(247, 250, 255, 0.9);
  font-size: 11px;
}

.finance-account-card span {
  font-weight: 700;
  color: rgba(247, 250, 255, 0.96);
  text-align: right;
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

.editor-file-field {
  display: grid;
  gap: 6px;
}

.editor-file-field span,
.editor-inline-tip,
.editor-preview-list,
.editor-data-card dt,
.editor-data-card dd {
  color: rgba(214, 225, 245, 0.82);
  font-size: 12px;
}

.editor-file-field input,
.editor-select {
  width: 100%;
  border: 1px solid rgba(255, 255, 255, 0.12);
  border-radius: 14px;
  padding: 10px 12px;
  background: rgba(7, 13, 22, 0.34);
  color: rgba(246, 250, 255, 0.96);
}

.editor-select {
  appearance: none;
}

.editor-preview-list {
  margin: 0;
  padding-left: 18px;
  line-height: 1.7;
}

.editor-data-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 12px;
}

.editor-data-card {
  border-radius: 22px;
  padding: 18px;
  display: grid;
  gap: 10px;
}

.editor-data-card dl {
  margin: 0;
  display: grid;
  grid-template-columns: minmax(90px, 120px) minmax(0, 1fr);
  gap: 8px 12px;
}

.editor-data-card dt,
.editor-data-card dd {
  margin: 0;
  line-height: 1.6;
  word-break: break-word;
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

:root[data-theme-mode='day'] .route-page {
  color: var(--theme-text-primary, rgba(52, 34, 29, 0.96));
}

:root[data-theme-mode='day'] .workspace-shell {
  --liquid-bg: var(--theme-panel-surface, var(--theme-surface));
  --liquid-border: var(--theme-border, rgba(255, 224, 208, 0.24));
  --liquid-shadow: 0 22px 42px rgba(88, 60, 50, 0.12);
}

:root[data-theme-mode='day'] .mode-switch,
:root[data-theme-mode='day'] .workspace-main,
:root[data-theme-mode='day'] .workspace-side,
:root[data-theme-mode='day'] .npc-card,
:root[data-theme-mode='day'] .side-info-card,
:root[data-theme-mode='day'] .editor-card,
:root[data-theme-mode='day'] .editor-data-card,
:root[data-theme-mode='day'] .scene-chip,
:root[data-theme-mode='day'] .map-node,
:root[data-theme-mode='day'] .highlight-chip,
:root[data-theme-mode='day'] .editor-tag,
:root[data-theme-mode='day'] .side-empty {
  border-color: var(--theme-border, rgba(255, 224, 208, 0.24));
  box-shadow: 0 12px 24px rgba(88, 60, 50, 0.08);
}

:root[data-theme-mode='day'] .mode-tab {
  color: var(--theme-text-secondary, rgba(88, 62, 53, 0.86));
}

:root[data-theme-mode='day'] .mode-tab.active {
  background: var(--theme-floating-surface-hover, var(--theme-panel-surface-elevated));
  color: var(--theme-text-primary, rgba(52, 34, 29, 0.96));
  box-shadow:
    0 0 0 1px rgba(var(--accent-rgb), 0.24),
    0 10px 22px rgba(88, 60, 50, 0.08);
}

:root[data-theme-mode='day'] .stage-btn,
:root[data-theme-mode='day'] .npc-action {
  background: var(--theme-panel-surface-elevated, var(--theme-surface-elevated));
  color: var(--theme-text-primary, rgba(52, 34, 29, 0.96));
  border: 1px solid var(--theme-border, rgba(255, 224, 208, 0.24));
}

:root[data-theme-mode='day'] .stage-btn.primary {
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
}

:root[data-theme-mode='day'] .stage-btn:hover:not(:disabled),
:root[data-theme-mode='day'] .npc-action:hover:not(:disabled) {
  background: var(--theme-floating-surface-hover, var(--theme-panel-surface-elevated));
}

:root[data-theme-mode='day'] .status-pill {
  color: var(--theme-text-primary, rgba(52, 34, 29, 0.96));
}

:root[data-theme-mode='day'] .status-pill.muted {
  color: var(--theme-text-secondary, rgba(88, 62, 53, 0.86));
}

:root[data-theme-mode='day'] .stage-copy p,
:root[data-theme-mode='day'] .side-panel-head p,
:root[data-theme-mode='day'] .scene-atmosphere,
:root[data-theme-mode='day'] .side-tip,
:root[data-theme-mode='day'] .editor-card p,
:root[data-theme-mode='day'] .npc-card p,
:root[data-theme-mode='day'] .side-info-card p,
:root[data-theme-mode='day'] .editor-file-field span,
:root[data-theme-mode='day'] .editor-inline-tip,
:root[data-theme-mode='day'] .editor-preview-list,
:root[data-theme-mode='day'] .editor-data-card dt,
:root[data-theme-mode='day'] .editor-data-card dd,
:root[data-theme-mode='day'] .scene-chip span,
:root[data-theme-mode='day'] .map-node small,
:root[data-theme-mode='day'] .scene-meta-row,
:root[data-theme-mode='day'] .npc-meta {
  color: var(--theme-text-secondary, rgba(88, 62, 53, 0.86));
}

:root[data-theme-mode='day'] .editor-file-field input,
:root[data-theme-mode='day'] .editor-select {
  background: var(--theme-surface-soft, rgba(255, 255, 255, 0.16));
  color: var(--theme-text-primary, rgba(52, 34, 29, 0.96));
  border-color: var(--theme-border, rgba(255, 224, 208, 0.24));
}

:root[data-theme-mode='day'] .editor-step {
  background: var(--theme-panel-surface-elevated, var(--theme-surface-elevated));
  color: var(--theme-icon-strong, rgba(72, 52, 46, 0.98));
}

:root[data-theme-mode='day'] .finance-drawer,
:root[data-theme-mode='day'] .finance-state-card,
:root[data-theme-mode='day'] .finance-panel,
:root[data-theme-mode='day'] .finance-metric-card,
:root[data-theme-mode='day'] .finance-source-card,
:root[data-theme-mode='day'] .finance-account-card,
:root[data-theme-mode='day'] .finance-empty-card {
  border-color: var(--theme-border, rgba(255, 224, 208, 0.24));
  color: var(--theme-text-primary, rgba(52, 34, 29, 0.96));
}

:root[data-theme-mode='day'] .finance-drawer {
  background:
    radial-gradient(circle at top right, rgba(255, 192, 110, 0.18), transparent 28%),
    radial-gradient(circle at bottom left, rgba(91, 173, 255, 0.12), transparent 24%),
    var(--theme-panel-surface, var(--theme-surface));
}

:root[data-theme-mode='day'] .finance-emblem {
  background:
    radial-gradient(circle at 50% 36%, rgba(255, 214, 122, 0.34), transparent 34%),
    linear-gradient(180deg, rgba(129, 95, 58, 0.9), rgba(83, 60, 37, 0.96));
  border-color: rgba(166, 121, 68, 0.22);
}

:root[data-theme-mode='day'] :is(.finance-metric-card span, .finance-panel-head small, .finance-account-card small, .finance-source-card small) {
  color: var(--theme-text-secondary, rgba(88, 62, 53, 0.86));
}

:root[data-theme-mode='day'] .finance-source-pill {
  background: var(--theme-panel-surface-elevated, var(--theme-surface-elevated));
  color: var(--theme-text-primary, rgba(52, 34, 29, 0.96));
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
  .finance-metrics-grid,
  .finance-detail-grid,
  .finance-source-grid,
  .finance-action-row,
  .editor-grid,
  .editor-data-grid {
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

  .finance-hero {
    grid-template-columns: 1fr;
  }

  .map-node {
    min-width: 118px;
    padding: 10px 12px;
  }
}
</style>
