import { flushPromises, mount } from '@vue/test-utils';
import { defineComponent, ref } from 'vue';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import AiHubPage from './AiHubPage.vue';

const mocked = vi.hoisted(() => ({
  auth: null,
  createAdminTownNpcSession: vi.fn(),
  getAiTownPublicMap: vi.fn(),
  getAiTownScene: vi.fn(),
  importAdminAiTownAsset: vi.fn(),
  listAiTownScenes: vi.fn(),
  previewAdminAiTownAsset: vi.fn()
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

vi.mock('../composables/useAuthSession', () => ({
  useAuthSession: () => mocked.auth
}));

vi.mock('../services/aiApi', () => ({
  createAdminTownNpcSession: (...args) => mocked.createAdminTownNpcSession(...args),
  getAiTownPublicMap: (...args) => mocked.getAiTownPublicMap(...args),
  getAiTownScene: (...args) => mocked.getAiTownScene(...args),
  importAdminAiTownAsset: (...args) => mocked.importAdminAiTownAsset(...args),
  listAiTownScenes: (...args) => mocked.listAiTownScenes(...args),
  previewAdminAiTownAsset: (...args) => mocked.previewAdminAiTownAsset(...args)
}));

function createAuth(groups = ['USER']) {
  return {
    isAuthenticated: ref(true),
    user: ref({
      userId: 12,
      groups
    }),
    authorizedFetch: vi.fn(),
    ensureReady: vi.fn().mockResolvedValue()
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
        AiDialog: AiDialogStub
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
    mocked.getAiTownPublicMap.mockReset();
    mocked.getAiTownScene.mockReset();
    mocked.importAdminAiTownAsset.mockReset();
    mocked.listAiTownScenes.mockReset();
    mocked.previewAdminAiTownAsset.mockReset();

    mocked.listAiTownScenes.mockResolvedValue([
      createSceneSummary('library', '图书馆'),
      createSceneSummary('home_gate', '自宅外部')
    ]);
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
  });

  it('limits embedded dialog modes to normal and tavern for non-admin users', async () => {
    const wrapper = await mountPage();
    const conversationButton = findButtonByText(wrapper, '普通对话模式');

    expect(conversationButton).toBeTruthy();
    await conversationButton.trigger('click');
    await flushPromises();

    const dialog = wrapper.findComponent(AiDialogStub);
    expect(dialog.exists()).toBe(true);
    expect(dialog.props('allowedModes')).toEqual(['normal', 'tavern']);
    expect(wrapper.text()).not.toContain('编辑地图');
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
});
