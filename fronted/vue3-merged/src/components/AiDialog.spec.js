import { flushPromises, mount } from '@vue/test-utils';
import { defineComponent, h, ref } from 'vue';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import AiDialog from './AiDialog.vue';

const mocked = vi.hoisted(() => ({
  auth: null,
  createAdminAiCompanionSession: vi.fn(),
  createAdminTownNpcSession: vi.fn(),
  getAdminAiMemoryScope: vi.fn(),
  createAiCharacter: vi.fn(),
  createAiSession: vi.fn(),
  createAiWorldbook: vi.fn(),
  createAiWorldbookEntry: vi.fn(),
  getAdminAiCompanionConfig: vi.fn(),
  getMyAiQuota: vi.fn(),
  importAiCharacterCard: vi.fn(),
  listAiCharacters: vi.fn(),
  listAiWorldbooks: vi.fn(),
  sendAiMessage: vi.fn(),
  updateAdminAiCompanionConfig: vi.fn(),
  updateAdminAiMemoryScope: vi.fn()
}));

vi.mock('motion-v', () => {
  const MotionAside = defineComponent({
    name: 'MotionAsideStub',
    setup(_, { slots, attrs }) {
      return () => h('aside', attrs, slots.default ? slots.default() : []);
    }
  });

  return {
    motion: {
      aside: MotionAside
    },
    useReducedMotion: () => ref(true)
  };
});

vi.mock('../composables/useAuthSession', () => ({
  useAuthSession: () => mocked.auth
}));

vi.mock('../services/aiApi', () => ({
  createAdminAiCompanionSession: (...args) => mocked.createAdminAiCompanionSession(...args),
  createAdminTownNpcSession: (...args) => mocked.createAdminTownNpcSession(...args),
  getAdminAiMemoryScope: (...args) => mocked.getAdminAiMemoryScope(...args),
  createAiCharacter: (...args) => mocked.createAiCharacter(...args),
  createAiSession: (...args) => mocked.createAiSession(...args),
  createAiWorldbook: (...args) => mocked.createAiWorldbook(...args),
  createAiWorldbookEntry: (...args) => mocked.createAiWorldbookEntry(...args),
  getAdminAiCompanionConfig: (...args) => mocked.getAdminAiCompanionConfig(...args),
  getMyAiQuota: (...args) => mocked.getMyAiQuota(...args),
  importAiCharacterCard: (...args) => mocked.importAiCharacterCard(...args),
  listAiCharacters: (...args) => mocked.listAiCharacters(...args),
  listAiWorldbooks: (...args) => mocked.listAiWorldbooks(...args),
  sendAiMessage: (...args) => mocked.sendAiMessage(...args),
  updateAdminAiCompanionConfig: (...args) => mocked.updateAdminAiCompanionConfig(...args),
  updateAdminAiMemoryScope: (...args) => mocked.updateAdminAiMemoryScope(...args)
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

async function mountDialog(props = {}) {
  const wrapper = mount(AiDialog, {
    props: {
      visible: true,
      mode: 'embedded',
      chatMode: 'normal',
      allowedModes: ['normal', 'tavern', 'town_npc', 'companion'],
      showHeader: true,
      showCloseButton: false,
      showResetButton: false,
      ...props
    }
  });

  await flushPromises();
  return wrapper;
}

describe('AiDialog', () => {
  beforeEach(() => {
    mocked.auth = createAuth(['USER']);
    mocked.createAdminAiCompanionSession.mockReset();
    mocked.createAdminTownNpcSession.mockReset();
    mocked.getAdminAiMemoryScope.mockReset();
    mocked.createAiCharacter.mockReset();
    mocked.createAiSession.mockReset();
    mocked.createAiWorldbook.mockReset();
    mocked.createAiWorldbookEntry.mockReset();
    mocked.getAdminAiCompanionConfig.mockReset();
    mocked.getMyAiQuota.mockReset();
    mocked.importAiCharacterCard.mockReset();
    mocked.listAiCharacters.mockReset();
    mocked.listAiWorldbooks.mockReset();
    mocked.sendAiMessage.mockReset();
    mocked.updateAdminAiCompanionConfig.mockReset();
    mocked.updateAdminAiMemoryScope.mockReset();

    mocked.getMyAiQuota.mockResolvedValue({ total: 5, used: 0, remaining: 5 });
    mocked.listAiCharacters.mockResolvedValue([]);
    mocked.listAiWorldbooks.mockResolvedValue([]);
    mocked.getAdminAiCompanionConfig.mockResolvedValue({
      companionCode: 'my_home_ai',
      displayName: '自宅 companion',
      worldbookIds: [],
      memoryEnabled: true,
      scenePrompt: ''
    });
    mocked.getAdminAiMemoryScope.mockResolvedValue({
      scopeId: '12:town_npc:librarian:library',
      enabled: true,
      note: '',
      lastQuery: '',
      profileSummary: '',
      summaryHighlights: [],
      episodicHighlights: [],
      journalHighlights: []
    });
  });

  it('hides admin-only modes for non-admin users', async () => {
    const wrapper = await mountDialog();

    expect(wrapper.text()).toContain('普通对话');
    expect(wrapper.text()).toContain('酒馆模式');
    expect(wrapper.text()).not.toContain('小镇 NPC');
    expect(wrapper.text()).not.toContain('自宅');
  });

  it('creates town npc sessions through the admin endpoint instead of generic create', async () => {
    mocked.auth = createAuth(['ADMIN']);
    mocked.createAdminTownNpcSession.mockResolvedValue({
      sessionId: 'session-town-001',
      title: '图书馆 · 馆长 Haru',
      mode: 'town_npc',
      townRoomCode: 'library',
      actorCode: 'librarian'
    });
    mocked.sendAiMessage.mockResolvedValue({
      assistantMessage: '馆长 Haru 已上线。',
      totalRounds: 5,
      usedRounds: 1,
      remainingRounds: 4,
      scopeId: '12:town_npc:librarian:library'
    });

    const wrapper = await mountDialog({
      chatMode: 'town_npc',
      allowedModes: ['town_npc']
    });
    wrapper.vm.sessionStateByMode.town_npc.config.townRoomCode = 'library';
    wrapper.vm.sessionStateByMode.town_npc.config.actorCode = 'librarian';
    wrapper.vm.sessionStateByMode.town_npc.config.memoryEnabled = true;

    await wrapper.get('.chat-input').setValue('你好，馆长。');
    await wrapper.get('.send-btn').trigger('click');
    await flushPromises();

    expect(mocked.createAdminTownNpcSession).toHaveBeenCalledWith('librarian', mocked.auth.authorizedFetch);
    expect(mocked.createAiSession).not.toHaveBeenCalled();
    expect(mocked.sendAiMessage).toHaveBeenCalledWith(
      'session-town-001',
      expect.objectContaining({
        message: '你好，馆长。',
        memoryEnabled: true
      }),
      mocked.auth.authorizedFetch
    );
  });
});
