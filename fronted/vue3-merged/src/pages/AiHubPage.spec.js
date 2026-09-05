import { flushPromises, mount } from '@vue/test-utils';
import { defineComponent, ref } from 'vue';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import AiHubPage from './AiHubPage.vue';

const mocked = vi.hoisted(() => ({
  auth: null,
  createAdminTownNpcSession: vi.fn(),
  deleteAiSession: vi.fn(),
  getAiTownPublicMap: vi.fn(),
  getAiTownScene: vi.fn(),
  getLightAppBalanceOverview: vi.fn(),
  importAdminAiTownAsset: vi.fn(),
  listLightAppBalanceAccounts: vi.fn(),
  listLightAppBalanceSourceAccountStatus: vi.fn(),
  listAiTownScenes: vi.fn(),
  listAiSessions: vi.fn(),
  listAiSessionSummaries: vi.fn(),
  openLightAppShellWindow: vi.fn(),
  previewAdminAiTownAsset: vi.fn(),
  readGuestLightAppData: vi.fn(),
  readRemoteLightAppCache: vi.fn(),
  renameAiSession: vi.fn(),
  setBalanceWindowSection: vi.fn()
}));

const AiDialogStub = defineComponent({
  name: 'AiDialog',
  props: {
    allowedModes: {
      type: Array,
      default: () => []
    },
    chatMode: {
      type: String,
      default: 'normal'
    }
  },
  template: '<div class="ai-dialog-stub">{{ chatMode }}</div>'
});

const MeguriPageStub = defineComponent({
  name: 'MeguriPage',
  props: {
    embedded: {
      type: Boolean,
      default: false
    }
  },
  template: '<div class="meguri-page-stub">Meguri Web Companion</div>'
});

vi.mock('../composables/useAuthSession', () => ({
  useAuthSession: () => mocked.auth
}));

vi.mock('vue-router', () => ({
  useRoute: () => ({ query: {} })
}));

vi.mock('../services/aiApi', () => ({
  createAdminTownNpcSession: (...args) => mocked.createAdminTownNpcSession(...args),
  deleteAiSession: (...args) => mocked.deleteAiSession(...args),
  getAiTownPublicMap: (...args) => mocked.getAiTownPublicMap(...args),
  getAiTownScene: (...args) => mocked.getAiTownScene(...args),
  importAdminAiTownAsset: (...args) => mocked.importAdminAiTownAsset(...args),
  listAiSessions: (...args) => mocked.listAiSessions(...args),
  listAiSessionSummaries: (...args) => mocked.listAiSessionSummaries(...args),
  listAiTownScenes: (...args) => mocked.listAiTownScenes(...args),
  previewAdminAiTownAsset: (...args) => mocked.previewAdminAiTownAsset(...args),
  renameAiSession: (...args) => mocked.renameAiSession(...args)
}));

vi.mock('../services/lightAppsApi', () => ({
  getLightAppBalanceOverview: (...args) => mocked.getLightAppBalanceOverview(...args),
  listLightAppBalanceAccounts: (...args) => mocked.listLightAppBalanceAccounts(...args),
  listLightAppBalanceSourceAccountStatus: (...args) => mocked.listLightAppBalanceSourceAccountStatus(...args)
}));

vi.mock('../components/lightapps/lightAppShellStore', () => ({
  openLightAppShellWindow: (...args) => mocked.openLightAppShellWindow(...args)
}));

vi.mock('../components/lightapps/balance/balanceWindowState', () => ({
  BALANCE_SECTION_ACCOUNTS: 'accounts',
  BALANCE_SECTION_OVERVIEW: 'overview',
  BALANCE_SECTION_SOURCES: 'sources',
  BALANCE_SECTION_TRANSACTIONS: 'transactions',
  setBalanceWindowSection: (...args) => mocked.setBalanceWindowSection(...args)
}));

vi.mock('../utils/lightAppsDataStore', () => ({
  readGuestLightAppData: (...args) => mocked.readGuestLightAppData(...args),
  readRemoteLightAppCache: (...args) => mocked.readRemoteLightAppCache(...args)
}));

function createAuth(groups = ['USER']) {
  return {
    isAuthenticated: ref(true),
    user: ref({
      userId: 12,
      groups
    }),
    authorizedFetch: vi.fn(),
    ensureReady: vi.fn().mockResolvedValue(),
    redirectToAuth: vi.fn()
  };
}

function createSceneSummary(sceneCode, title) {
  return {
    sceneCode,
    title,
    sceneType: 'scene',
    description: `${title} 描述`,
    atmosphereHint: '',
    npcCount: sceneCode === 'library' ? 1 : 0,
    publicVisible: true
  };
}

function createSceneDetail(sceneCode, title) {
  return {
    sceneCode,
    title,
    sceneType: 'scene',
    description: `${title} 描述`,
    atmosphereHint: '',
    publicVisible: true,
    highlights: ['高亮'],
    npcs: sceneCode === 'library'
      ? [
          {
            npcCode: 'librarian',
            sceneCode: 'library',
            displayName: '馆长 Haru',
            roleLabel: '管理员特殊 NPC',
            intro: '负责资料整理',
            adminOnly: true,
            memoryEnabled: true
          }
        ]
      : []
  };
}

function createPreview(overrides = {}) {
  return {
    assetImportId: 7001,
    assetCode: 'rpg-import-001',
    sourceName: 'Map001.json',
    assetType: 'rpg_map',
    parserStatus: 'READY',
    rawSizeBytes: 128,
    attachedSceneCode: 'library',
    previewHighlights: ['地图尺寸 20x15'],
    metadata: { width: 20, height: 15 },
    preview: { mapLike: true },
    ...overrides
  };
}

async function mountPage() {
  const wrapper = mount(AiHubPage, {
    global: {
      stubs: {
        AiDialog: AiDialogStub,
        MeguriPage: MeguriPageStub
      }
    }
  });

  await flushPromises();
  return wrapper;
}

function findButtonByText(wrapper, text) {
  return wrapper.findAll('button').find((node) => node.text().includes(text));
}

describe('AiHubPage', () => {
  beforeEach(() => {
    mocked.auth = createAuth(['USER']);
    mocked.createAdminTownNpcSession.mockReset();
    mocked.deleteAiSession.mockReset();
    mocked.getAiTownPublicMap.mockReset();
    mocked.getAiTownScene.mockReset();
    mocked.getLightAppBalanceOverview.mockReset();
    mocked.importAdminAiTownAsset.mockReset();
    mocked.listLightAppBalanceAccounts.mockReset();
    mocked.listLightAppBalanceSourceAccountStatus.mockReset();
    mocked.listAiTownScenes.mockReset();
    mocked.listAiSessions.mockReset();
    mocked.listAiSessionSummaries.mockReset();
    mocked.openLightAppShellWindow.mockReset();
    mocked.previewAdminAiTownAsset.mockReset();
    mocked.readGuestLightAppData.mockReset();
    mocked.readRemoteLightAppCache.mockReset();
    mocked.renameAiSession.mockReset();
    mocked.setBalanceWindowSection.mockReset();

    mocked.listAiTownScenes.mockResolvedValue([
      createSceneSummary('library', '图书馆'),
      createSceneSummary('home_gate', '自宅外部')
    ]);
    mocked.listAiSessions.mockResolvedValue([]);
    mocked.listAiSessionSummaries.mockResolvedValue([]);
    mocked.getAiTownPublicMap.mockResolvedValue({
      scenes: [
        { sceneCode: 'library', title: '图书馆', coordX: 18, coordY: 26, tone: 'amber' },
        { sceneCode: 'home_gate', title: '自宅外部', coordX: 62, coordY: 60, tone: 'sky' }
      ]
    });
    mocked.getAiTownScene.mockImplementation(async (sceneCode) => {
      if (sceneCode === 'home_gate') {
        return createSceneDetail('home_gate', '自宅外部');
      }
      return createSceneDetail('library', '图书馆');
    });
    mocked.previewAdminAiTownAsset.mockResolvedValue(createPreview());
    mocked.importAdminAiTownAsset.mockResolvedValue(createPreview());
    mocked.getLightAppBalanceOverview.mockResolvedValue({
      baseCurrency: 'CNY',
      totalBalance: 12888,
      totalDebt: 3200,
      netAsset: 9688,
      calculatedAt: '2026-06-29T00:00:00+08:00'
    });
    mocked.listLightAppBalanceAccounts.mockResolvedValue([
      {
        accountId: 1,
        accountName: '钱迹导入账户',
        channelName: '钱迹',
        currencyCode: 'CNY',
        balanceAmount: 9200
      }
    ]);
    mocked.listLightAppBalanceSourceAccountStatus.mockResolvedValue([
      {
        provider: 'qianji',
        status: 'BOUND',
        bound: true,
        targetAccountName: '钱迹导入账户',
        nightlyEnabled: false,
        lastSyncedAt: '2026-06-29T00:05:00+08:00'
      }
    ]);
    mocked.openLightAppShellWindow.mockReturnValue(910003);
    mocked.readGuestLightAppData.mockReturnValue({
      balanceOverview: {},
      balanceAccounts: []
    });
    mocked.readRemoteLightAppCache.mockReturnValue({
      balanceOverview: {},
      balanceAccounts: []
    });
  });

  it('limits embedded dialog modes to normal and tavern for non-admin users', async () => {
    const wrapper = await mountPage();
    const conversationButton = findButtonByText(wrapper, '普通对话模式');

    expect(conversationButton).toBeTruthy();
    await conversationButton.trigger('click');
    await flushPromises();

    const dialog = wrapper.findComponent(AiDialogStub);
    expect(dialog.exists()).toBe(true);
    expect(dialog.props('chatMode')).toBe('normal');
    expect(dialog.props('allowedModes')).toEqual(['normal', 'tavern']);
    expect(wrapper.text()).toContain('共享对话工作台');
    expect(wrapper.text()).not.toContain('AI Chat 在 AI Hub 内已禁用');
    expect(wrapper.text()).not.toContain('编辑地图');
    expect(wrapper.text()).not.toContain('爱莉伴聊');
  });

  it('keeps the shared conversation workspace visible for guests with a login prompt', async () => {
    mocked.auth = createAuth(['USER']);
    mocked.auth.isAuthenticated.value = false;
    mocked.auth.user.value = null;

    const wrapper = await mountPage();
    const conversationButton = findButtonByText(wrapper, '普通对话模式');

    await conversationButton.trigger('click');
    await flushPromises();

    expect(wrapper.find('.ai-session-rail').exists()).toBe(true);
    expect(wrapper.findComponent(AiDialogStub).exists()).toBe(true);
    expect(wrapper.text()).toContain('登录后会话会自动保存');
    expect(wrapper.text()).toContain('前往登录');
  });

  it('explains a network failure in Chinese and recovers through scene refresh', async () => {
    mocked.listAiTownScenes.mockRejectedValueOnce(
      Object.assign(new Error('Network request failed'), {
        problemCode: 'NETWORK_ERROR',
        status: 0
      })
    );

    const wrapper = await mountPage();

    expect(wrapper.text()).toContain('AI 服务暂时不可达，请稍后重试或确认后端服务已启动。');
    expect(wrapper.text()).not.toContain('Network request failed');

    const refreshButton = findButtonByText(wrapper, '刷新场景');
    expect(refreshButton).toBeTruthy();
    await refreshButton.trigger('click');
    await flushPromises();

    expect(wrapper.text()).not.toContain('AI 服务暂时不可达');
    expect(wrapper.text()).toContain('图书馆');
  });

  it('exposes and activates the owner-only Meguri companion for admin users', async () => {
    mocked.auth = createAuth(['ADMIN']);

    const wrapper = await mountPage();
    const companionButton = findButtonByText(wrapper, '爱莉伴聊');
    const conversationButton = findButtonByText(wrapper, '普通对话模式');

    expect(companionButton).toBeTruthy();
    await companionButton.trigger('click');
    await flushPromises();

    const companion = wrapper.findComponent(MeguriPageStub);
    expect(companion.exists()).toBe(true);
    expect(companion.props('embedded')).toBe(true);
    expect(wrapper.text()).toContain('当前陪伴 · 爱莉');
    expect(wrapper.get('.workspace-grid').classes()).toContain('conversation');

    expect(conversationButton).toBeTruthy();
    await conversationButton.trigger('click');
    await flushPromises();

    const dialog = wrapper.findComponent(AiDialogStub);
    expect(dialog.props('allowedModes')).toEqual(['normal', 'tavern', 'town_npc']);
  });

  it('shows fixed empty-preview feedback for admin scene refresh 404', async () => {
    mocked.auth = createAuth(['ADMIN']);
    mocked.previewAdminAiTownAsset
      .mockRejectedValueOnce(Object.assign(new Error('Town asset preview not found'), { status: 404 }))
      .mockRejectedValueOnce(Object.assign(new Error('Town asset preview not found'), { status: 404 }));

    const wrapper = await mountPage();
    const editorButton = findButtonByText(wrapper, '编辑');

    expect(editorButton).toBeTruthy();
    await editorButton.trigger('click');
    await flushPromises();

    const refreshButton = findButtonByText(wrapper, '刷新预览');
    expect(refreshButton).toBeTruthy();
    await refreshButton.trigger('click');
    await flushPromises();

    expect(wrapper.text()).toContain('当前场景还没有已挂接的 RPGMaker 预览。');
  });

  it('refreshes the latest preview after a successful admin import', async () => {
    mocked.auth = createAuth(['ADMIN']);

    const wrapper = await mountPage();
    const editorButton = findButtonByText(wrapper, '编辑');

    expect(editorButton).toBeTruthy();
    await editorButton.trigger('click');
    await flushPromises();

    mocked.previewAdminAiTownAsset.mockClear();
    mocked.previewAdminAiTownAsset.mockResolvedValueOnce(createPreview({ assetCode: 'rpg-import-001' }));

    const fileInput = wrapper.get('input[type="file"]');
    const file = new File(['{"width":20,"height":15,"data":[1]}'], 'Map001.json', { type: 'application/json' });
    Object.defineProperty(fileInput.element, 'files', {
      value: [file],
      configurable: true
    });
    await fileInput.trigger('change');
    await flushPromises();

    const importButton = findButtonByText(wrapper, '导入并解析');
    expect(importButton).toBeTruthy();
    await importButton.trigger('click');
    await flushPromises();

    expect(mocked.importAdminAiTownAsset).toHaveBeenCalledTimes(1);
    expect(mocked.previewAdminAiTownAsset).toHaveBeenCalledWith(
      { assetCode: 'rpg-import-001' },
      mocked.auth.authorizedFetch
    );
    expect(wrapper.text()).toContain('RPGMaker 资源已导入并生成预览。');
  });

  it('expands the finance building and routes to the local qianji import section', async () => {
    const wrapper = await mountPage();
    const financeButton = findButtonByText(wrapper, '账房库');

    expect(financeButton).toBeTruthy();
    await financeButton.trigger('click');
    await flushPromises();

    expect(mocked.getLightAppBalanceOverview).toHaveBeenCalledWith('CNY', mocked.auth.authorizedFetch);
    expect(wrapper.text()).toContain('账单导入来源');
    expect(wrapper.text()).toContain('钱迹');

    const syncButton = findButtonByText(wrapper, '管理账房');
    expect(syncButton).toBeTruthy();
    await syncButton.trigger('click');
    await flushPromises();

    expect(mocked.openLightAppShellWindow).toHaveBeenCalledWith('balance-ledger', { source: 'ai_town_finance_house' });
    expect(mocked.setBalanceWindowSection).toHaveBeenCalledWith(910003, 'sources');
  });
});
