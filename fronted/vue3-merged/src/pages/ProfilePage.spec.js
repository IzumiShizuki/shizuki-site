import { flushPromises, mount } from '@vue/test-utils';
import { reactive, ref } from 'vue';
import { createMemoryHistory, createRouter } from 'vue-router';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import ProfilePage from './ProfilePage.vue';

const mocked = vi.hoisted(() => ({
  auth: null,
  ui: null,
  listMyPosts: vi.fn(),
  getMetingStatus: vi.fn(),
  getMusicSourceAccountStatus: vi.fn(),
  upsertMusicSourceAccountCookie: vi.fn(),
  deleteMusicSourceAccount: vi.fn(),
  importMusicSourcePlaylists: vi.fn(),
  createMusicSourceBindSession: vi.fn(),
  getMusicSourceBindSession: vi.fn(),
  completeMusicSourceBindSession: vi.fn(),
  waitForMusicSourceBind: vi.fn()
}));

vi.mock('../composables/useAuthSession', () => ({
  useAuthSession: () => mocked.auth
}));

vi.mock('../composables/useUiPreferences', () => ({
  useUiPreferences: () => mocked.ui
}));

vi.mock('../services/blogApi', () => ({
  listMyPosts: (...args) => mocked.listMyPosts(...args)
}));

vi.mock('../services/musicApi', () => ({
  getMetingStatus: (...args) => mocked.getMetingStatus(...args),
  getMusicSourceAccountStatus: (...args) => mocked.getMusicSourceAccountStatus(...args),
  upsertMusicSourceAccountCookie: (...args) => mocked.upsertMusicSourceAccountCookie(...args),
  deleteMusicSourceAccount: (...args) => mocked.deleteMusicSourceAccount(...args),
  importMusicSourcePlaylists: (...args) => mocked.importMusicSourcePlaylists(...args),
  createMusicSourceBindSession: (...args) => mocked.createMusicSourceBindSession(...args),
  getMusicSourceBindSession: (...args) => mocked.getMusicSourceBindSession(...args),
  completeMusicSourceBindSession: (...args) => mocked.completeMusicSourceBindSession(...args)
}));

vi.mock('../utils/musicSourceBindSession', async () => {
  const actual = await vi.importActual('../utils/musicSourceBindSession');
  return {
    ...actual,
    waitForMusicSourceBind: (...args) => mocked.waitForMusicSourceBind(...args)
  };
});

function createDeferred() {
  let resolve;
  let reject;
  const promise = new Promise((res, rej) => {
    resolve = res;
    reject = rej;
  });
  return { promise, resolve, reject };
}

function createAuthMock(overrides = {}) {
  return {
    user: ref({
      userId: 7,
      nickname: 'Izumi',
      avatarUrl: '',
      groups: ['ADMIN'],
      permissions: ['blog.post.write']
    }),
    isAuthenticated: ref(true),
    ensureReady: vi.fn().mockResolvedValue(),
    getAccountProfile: vi.fn().mockResolvedValue({
      userId: 7,
      username: 'izumi',
      nickname: 'Izumi',
      email: 'izumi@example.com',
      emailVerified: 1,
      avatarUrl: '',
      hasPassword: true,
      oauthBindings: []
    }),
    createImageCaptcha: vi.fn().mockResolvedValue({
      captchaId: 'captcha-1',
      svgContent: '<svg></svg>',
      expiresInSec: 60
    }),
    getPreference: vi.fn().mockResolvedValue({}),
    updatePreference: vi.fn().mockResolvedValue({}),
    uploadAvatar: vi.fn().mockResolvedValue({ avatarUrl: 'https://example.com/avatar.png' }),
    logout: vi.fn().mockResolvedValue(),
    startOAuthBind: vi.fn().mockResolvedValue(),
    sendEmailVerification: vi.fn().mockResolvedValue({ cooldownSec: 60 }),
    bindEmailCredential: vi.fn().mockResolvedValue(),
    sendResetPasswordVerification: vi.fn().mockResolvedValue({ cooldownSec: 60 }),
    changePasswordByEmail: vi.fn().mockResolvedValue(),
    authorizedFetch: vi.fn(),
    ...overrides
  };
}

function createUiMock() {
  const state = reactive({
    accentHex: '#F2B39D',
    accentMode: 'solid',
    accentGradientId: 'apricot-blush',
    accentGradientStartHex: '#F6C2A1',
    accentGradientEndHex: '#EFA0A8',
    routeBackgroundByKey: {},
    globalBackgroundId: '',
    aiPanelOpen: false
  });

  return {
    state,
    ACCENT_PRESETS: [
      { name: '奶杏桃粉', hex: '#F2B39D' },
      { name: '薄荷青', hex: '#8FDCC8' }
    ],
    GRADIENT_PRESETS: [
      { id: 'apricot-blush', name: '奶杏桃粉', startHex: '#F6C2A1', endHex: '#EFA0A8' }
    ],
    setAccentHex: vi.fn((hex) => {
      state.accentHex = hex;
      return { ok: true, normalized: hex };
    }),
    resetAccent: vi.fn(() => {
      state.accentHex = '#F2B39D';
      state.accentGradientId = 'apricot-blush';
      state.accentGradientStartHex = '#F6C2A1';
      state.accentGradientEndHex = '#EFA0A8';
    }),
    setAccentMode: vi.fn((mode) => {
      state.accentMode = mode === 'gradient' ? 'gradient' : 'solid';
      return state.accentMode;
    }),
    setAccentGradientPreset: vi.fn((presetId) => {
      state.accentGradientId = presetId;
      return { id: presetId, startHex: '#F6C2A1', endHex: '#EFA0A8' };
    }),
    setAccentGradientCustom: vi.fn((startHex, endHex) => {
      state.accentGradientId = 'custom';
      state.accentGradientStartHex = startHex;
      state.accentGradientEndHex = endHex;
      return { ok: true, startHex, endHex };
    }),
    clearRouteBackground: vi.fn((routeKey) => {
      delete state.routeBackgroundByKey[routeKey];
    }),
    setAiPanelOpen: vi.fn((open) => {
      state.aiPanelOpen = Boolean(open);
    })
  };
}

async function mountProfilePageWithRouter(initialPath = '/profile') {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/profile', component: { template: '<div />' } },
      { path: '/auth', component: { template: '<div />' } },
      { path: '/:pathMatch(.*)*', component: { template: '<div />' } }
    ]
  });

  await router.push(initialPath);
  await router.isReady();

  const wrapper = mount(ProfilePage, {
    attachTo: document.body,
    global: {
      plugins: [router],
      stubs: {
        RouteDotRail: true,
        AppearanceSettingsContent: true,
        ProfileHeroCard: true,
        ProfileAvatarActionSheet: true,
        ProfileAvatarPreviewDialog: true,
        ProfileAvatarCropDialog: true
      }
    }
  });

  await flushPromises();
  return { wrapper, router };
}

async function mountProfilePage() {
  const { wrapper } = await mountProfilePageWithRouter();
  return wrapper;
}

function findQuickAction(wrapper, label) {
  const button = wrapper
    .findAll('.profile-group[data-group-key="profile"] .quick-btn')
    .find((node) => node.text().includes(label));
  if (!button) {
    throw new Error(`Quick action not found: ${label}`);
  }
  return button;
}

function findSectionToggle(wrapper, groupKey, label) {
  const button = wrapper
    .findAll(`.profile-group[data-group-key="${groupKey}"] .head-toggle`)
    .find((node) => node.text().includes(label));
  if (!button) {
    throw new Error(`Section toggle not found: ${groupKey}/${label}`);
  }
  return button;
}

function findGroup(wrapper, groupKey) {
  const group = wrapper.find(`.profile-group[data-group-key="${groupKey}"]`);
  if (!group.exists()) {
    throw new Error(`Group not found: ${groupKey}`);
  }
  return group;
}

function findSectionCard(wrapper, sectionKey) {
  const card = wrapper.find(`.section-item[data-section-key="${sectionKey}"]`);
  if (!card.exists()) {
    throw new Error(`Section card not found: ${sectionKey}`);
  }
  return card;
}

function createAccountProfile(overrides = {}) {
  return {
    userId: 7,
    username: 'izumi',
    nickname: 'Izumi',
    email: 'izumi@example.com',
    emailVerified: 1,
    avatarUrl: '',
    hasPassword: true,
    oauthBindings: [],
    ...overrides
  };
}

let originalScrollIntoView;
let originalRequestAnimationFrame;
let originalCancelAnimationFrame;
let scrollIntoViewCalls = [];

describe('ProfilePage immediate account expansion', () => {
  beforeEach(() => {
    originalScrollIntoView = HTMLElement.prototype.scrollIntoView;
    originalRequestAnimationFrame = window.requestAnimationFrame;
    originalCancelAnimationFrame = window.cancelAnimationFrame;
    scrollIntoViewCalls = [];
    Object.defineProperty(HTMLElement.prototype, 'scrollIntoView', {
      configurable: true,
      value: vi.fn(function scrollIntoViewMock() {
        scrollIntoViewCalls.push(this?.getAttribute?.('data-section-key') || this?.getAttribute?.('data-group-key') || '');
      })
    });
    Object.defineProperty(window, 'requestAnimationFrame', {
      configurable: true,
      value: vi.fn((callback) => {
        callback(0);
        return 1;
      })
    });
    Object.defineProperty(window, 'cancelAnimationFrame', {
      configurable: true,
      value: vi.fn()
    });
    mocked.listMyPosts.mockReset().mockResolvedValue({ items: [] });
    mocked.getMetingStatus.mockReset().mockResolvedValue({ available: true, providers: ['netease', 'kuwo', 'qq'] });
    mocked.getMusicSourceAccountStatus.mockReset().mockResolvedValue([]);
    mocked.upsertMusicSourceAccountCookie.mockReset().mockResolvedValue({});
    mocked.deleteMusicSourceAccount.mockReset().mockResolvedValue({});
    mocked.importMusicSourcePlaylists.mockReset().mockResolvedValue({});
    mocked.createMusicSourceBindSession.mockReset().mockResolvedValue({});
    mocked.getMusicSourceBindSession.mockReset().mockResolvedValue({});
    mocked.completeMusicSourceBindSession.mockReset().mockResolvedValue({});
    mocked.waitForMusicSourceBind.mockReset().mockResolvedValue();
    mocked.ui = createUiMock();
  });

  afterEach(() => {
    if (originalScrollIntoView) {
      Object.defineProperty(HTMLElement.prototype, 'scrollIntoView', {
        configurable: true,
        value: originalScrollIntoView
      });
    } else {
      delete HTMLElement.prototype.scrollIntoView;
    }
    Object.defineProperty(window, 'requestAnimationFrame', {
      configurable: true,
      value: originalRequestAnimationFrame
    });
    Object.defineProperty(window, 'cancelAnimationFrame', {
      configurable: true,
      value: originalCancelAnimationFrame
    });
    mocked.auth = null;
    mocked.ui = null;
    document.body.innerHTML = '';
    vi.restoreAllMocks();
  });

  it('expands account info immediately before account data resolves', async () => {
    const accountDeferred = createDeferred();
    mocked.auth = createAuthMock({
      getAccountProfile: vi.fn(() => accountDeferred.promise)
    });

    const wrapper = await mountProfilePage();
    expect(wrapper.classes()).toContain('profile-no-motion');
    const profileGroup = findGroup(wrapper, 'profile');
    const accountGroup = findGroup(wrapper, 'account');
    const accountInfoCard = findSectionCard(wrapper, 'account-info');

    expect(profileGroup.isVisible()).toBe(true);
    expect(accountGroup.isVisible()).toBe(false);
    expect(accountInfoCard.classes()).not.toContain('focused');

    await findQuickAction(wrapper, '查看账号信息').trigger('click');
    await flushPromises();

    expect(profileGroup.isVisible()).toBe(false);
    expect(accountGroup.isVisible()).toBe(true);
    expect(accountInfoCard.classes()).toContain('focused');
    expect(mocked.auth.getAccountProfile).toHaveBeenCalledTimes(1);

    accountDeferred.resolve(createAccountProfile());
    await flushPromises();

    expect(mocked.auth.getPreference).toHaveBeenCalledTimes(1);
    wrapper.unmount();
  }, 10000);

  it('shows email bind as expanded before captcha initialization completes', async () => {
    const accountDeferred = createDeferred();
    const captchaDeferred = createDeferred();
    mocked.auth = createAuthMock({
      getAccountProfile: vi.fn(() => accountDeferred.promise),
      createImageCaptcha: vi.fn(() => captchaDeferred.promise)
    });

    const wrapper = await mountProfilePage();
    const accountGroup = findGroup(wrapper, 'account');
    const emailBindCard = findSectionCard(wrapper, 'email-bind');

    await findQuickAction(wrapper, '绑定邮箱').trigger('click');
    await flushPromises();

    expect(accountGroup.isVisible()).toBe(true);
    expect(emailBindCard.classes()).toContain('focused');
    expect(mocked.auth.createImageCaptcha).not.toHaveBeenCalled();

    accountDeferred.resolve(createAccountProfile());
    await flushPromises();

    expect(mocked.auth.createImageCaptcha).toHaveBeenCalledTimes(1);
    expect(emailBindCard.classes()).toContain('focused');

    captchaDeferred.resolve({
      captchaId: 'captcha-1',
      svgContent: '<svg></svg>',
      expiresInSec: 60
    });
    await flushPromises();

    expect(emailBindCard.classes()).toContain('focused');
    wrapper.unmount();
  });

  it('dedupes account profile loading across rapid quick-action clicks', async () => {
    const accountDeferred = createDeferred();
    mocked.auth = createAuthMock({
      getAccountProfile: vi.fn(() => accountDeferred.promise)
    });

    const wrapper = await mountProfilePage();
    const accountGroup = findGroup(wrapper, 'account');
    const emailBindCard = findSectionCard(wrapper, 'email-bind');
    const changePasswordCard = findSectionCard(wrapper, 'change-password');

    await findQuickAction(wrapper, '绑定邮箱').trigger('click');
    await findQuickAction(wrapper, '修改密码').trigger('click');
    await flushPromises();

    expect(accountGroup.isVisible()).toBe(true);
    expect(emailBindCard.classes()).not.toContain('focused');
    expect(changePasswordCard.classes()).toContain('focused');
    expect(mocked.auth.getAccountProfile).toHaveBeenCalledTimes(1);

    accountDeferred.resolve(createAccountProfile());
    await flushPromises();

    expect(mocked.auth.createImageCaptcha).toHaveBeenCalledTimes(1);
    wrapper.unmount();
  });

  it('shows music auth section immediately before account data resolves', async () => {
    const accountDeferred = createDeferred();
    mocked.auth = createAuthMock({
      getAccountProfile: vi.fn(() => accountDeferred.promise)
    });

    const wrapper = await mountProfilePage();
    const accountGroup = findGroup(wrapper, 'account');
    const musicAuthCard = findSectionCard(wrapper, 'music-auth');
    scrollIntoViewCalls = [];

    await findQuickAction(wrapper, '音乐授权与排序').trigger('click');
    await flushPromises();

    expect(accountGroup.isVisible()).toBe(true);
    expect(musicAuthCard.classes()).toContain('focused');
    expect(mocked.auth.getAccountProfile).toHaveBeenCalledTimes(1);
    expect(scrollIntoViewCalls).toContain('music-auth');

    accountDeferred.resolve(createAccountProfile());
    await flushPromises();

    expect(mocked.getMusicSourceAccountStatus).toHaveBeenCalledTimes(1);
    wrapper.unmount();
  });

  it('renders music auth cards from the shared provider model', async () => {
    mocked.auth = createAuthMock({
      getAccountProfile: vi.fn().mockResolvedValue(
        createAccountProfile({
          oauthBindings: [{ provider: 'spotify', providerLogin: 'izumi_spotify' }]
        })
      ),
      getPreference: vi.fn().mockResolvedValue({
        'music.source_mode': 'account_first',
        'music.account_provider_order': ['qqmusic', 'kugou', 'netease']
      })
    });
    mocked.getMetingStatus.mockResolvedValue({
      available: true,
      providers: ['netease', 'kuwo', 'qq']
    });
    mocked.getMusicSourceAccountStatus.mockResolvedValue([
      { provider: 'netease', bound: true, mask: 'MUSIC_U=***', status: 'BOUND' },
      { provider: 'qqmusic', bound: true, mask: 'uin=***', status: 'BOUND' },
      { provider: 'kugou', bound: false, status: 'UNBOUND' }
    ]);

    const wrapper = await mountProfilePage();
    await findQuickAction(wrapper, '音乐授权与排序').trigger('click');
    await flushPromises();

    const musicAuthCard = findSectionCard(wrapper, 'music-auth');
    const musicText = musicAuthCard.text();

    expect(musicAuthCard.classes()).toContain('focused');
    expect(mocked.auth.getPreference).toHaveBeenCalled();
    expect(mocked.getMusicSourceAccountStatus).toHaveBeenCalledTimes(1);
    expect(musicText).toContain('Meting');
    expect(musicText).toContain('Spotify');
    expect(musicText).toContain('网易云');
    expect(musicText).toContain('QQ 音乐');
    expect(musicText).toContain('酷狗');
    expect(musicText).toContain('酷我');
    expect(wrapper.get('[data-testid="music-source-mode-select"]').element.value).toBe('account_first');
    expect(
      wrapper.findAll('.music-source-provider-card .primary-btn').map((node) => node.text())
    ).toEqual(['重新扫码绑定', '扫码绑定', '重新扫码绑定']);
    expect(musicText).not.toContain('检测助手');
    expect(musicText).not.toContain('安装助手');
    expect(musicText).not.toContain('高级手动绑定');
    expect(
      wrapper.findAll('.music-source-order-item .provider-name').map((node) => node.text())
    ).toEqual(['QQ 音乐', '酷狗', '网易云']);
    wrapper.unmount();
  });

  it('completes the netease qr bind flow without helper actions', async () => {
    const pollGate = createDeferred();
    mocked.auth = createAuthMock({
      getAccountProfile: vi.fn().mockResolvedValue(createAccountProfile())
    });
    mocked.getMusicSourceAccountStatus
      .mockResolvedValueOnce([])
      .mockResolvedValueOnce([
        { provider: 'netease', bound: true, mask: 'MUSIC_U=***', status: 'BOUND' }
      ]);
    mocked.createMusicSourceBindSession.mockResolvedValue({
      provider: 'netease',
      session_id: 'session-qr-1',
      status: 'PENDING',
      login_mode: 'qr',
      qr_status: 'WAIT_SCAN',
      qr_image: 'data:image/png;base64,qr-demo',
      qr_message: '请使用手机网易云扫码登录',
      poll_interval_ms: 10,
      expires_at: '2099-06-28T12:05:00'
    });
    mocked.getMusicSourceBindSession
      .mockResolvedValueOnce({
        provider: 'netease',
        session_id: 'session-qr-1',
        status: 'PENDING',
        login_mode: 'qr',
        qr_status: 'WAIT_CONFIRM',
        qr_message: '扫码成功，请在手机上确认登录',
        poll_interval_ms: 10
      })
      .mockResolvedValueOnce({
        provider: 'netease',
        session_id: 'session-qr-1',
        status: 'COMPLETED',
        login_mode: 'qr',
        qr_status: 'AUTHORIZED',
        qr_message: '网易云登录确认成功',
        poll_interval_ms: 10
      });
    mocked.waitForMusicSourceBind
      .mockImplementationOnce(() => pollGate.promise)
      .mockResolvedValue(undefined);

    const wrapper = await mountProfilePage();
    await findQuickAction(wrapper, '音乐授权与排序').trigger('click');
    await flushPromises();

    const providerCard = wrapper.get('.music-source-provider-card[data-provider-code="netease"]');
    expect(providerCard.text()).not.toContain('检测助手');
    expect(providerCard.text()).not.toContain('安装助手');

    void providerCard.get('.primary-btn').trigger('click');
    await flushPromises();

    expect(mocked.createMusicSourceBindSession).toHaveBeenCalledWith('netease', mocked.auth.authorizedFetch);
    expect(providerCard.find('.music-source-qr-image').exists()).toBe(true);
    expect(providerCard.text()).toContain('扫码成功');

    pollGate.resolve();
    await flushPromises();
    await flushPromises();

    expect(mocked.getMusicSourceBindSession).toHaveBeenCalledTimes(2);
    expect(mocked.waitForMusicSourceBind).toHaveBeenCalled();
    expect(mocked.getMusicSourceAccountStatus).toHaveBeenCalledTimes(2);
    expect(wrapper.get('.music-source-provider-card[data-provider-code="netease"]').text()).toContain('MUSIC_U=***');
    wrapper.unmount();
  });

  it('shows expired qr state for qqmusic and stops polling', async () => {
    mocked.auth = createAuthMock({
      getAccountProfile: vi.fn().mockResolvedValue(createAccountProfile())
    });
    mocked.createMusicSourceBindSession.mockResolvedValue({
      provider: 'qqmusic',
      session_id: 'session-qq-expired',
      status: 'PENDING',
      login_mode: 'qr',
      qr_status: 'WAIT_SCAN',
      qr_image: 'data:image/png;base64,qq-expired',
      qr_message: '请使用手机扫码登录 QQ 音乐',
      poll_interval_ms: 10,
      expires_at: '2099-06-28T12:05:00'
    });
    mocked.getMusicSourceBindSession.mockResolvedValue({
      provider: 'qqmusic',
      session_id: 'session-qq-expired',
      status: 'EXPIRED',
      login_mode: 'qr',
      qr_status: 'EXPIRED',
      failure_reason: '二维码已过期，请点击“重新扫码绑定”',
      poll_interval_ms: 10
    });

    const wrapper = await mountProfilePage();
    await findQuickAction(wrapper, '音乐授权与排序').trigger('click');
    await flushPromises();

    await wrapper.get('.music-source-provider-card[data-provider-code="qqmusic"] .primary-btn').trigger('click');
    await flushPromises();

    const providerCard = wrapper.get('.music-source-provider-card[data-provider-code="qqmusic"]');
    expect(mocked.getMusicSourceBindSession).toHaveBeenCalledTimes(1);
    expect(mocked.waitForMusicSourceBind).not.toHaveBeenCalled();
    expect(providerCard.text()).toContain('二维码过期');
    expect(wrapper.text()).toContain('二维码已过期');
    wrapper.unmount();
  });

  it('shows failed qr state for kugou and stops polling', async () => {
    mocked.auth = createAuthMock({
      getAccountProfile: vi.fn().mockResolvedValue(createAccountProfile())
    });
    mocked.createMusicSourceBindSession.mockResolvedValue({
      provider: 'kugou',
      session_id: 'session-kugou-failed',
      status: 'PENDING',
      login_mode: 'qr',
      qr_status: 'WAIT_SCAN',
      qr_image: 'data:image/png;base64,kugou-failed',
      qr_message: '请使用手机扫码登录酷狗音乐',
      poll_interval_ms: 10,
      expires_at: '2099-06-28T12:05:00'
    });
    mocked.getMusicSourceBindSession.mockResolvedValue({
      provider: 'kugou',
      session_id: 'session-kugou-failed',
      status: 'FAILED',
      login_mode: 'qr',
      qr_status: 'FAILED',
      failure_reason: '扫码绑定失败，请重新发起',
      poll_interval_ms: 10
    });

    const wrapper = await mountProfilePage();
    await findQuickAction(wrapper, '音乐授权与排序').trigger('click');
    await flushPromises();

    await wrapper.get('.music-source-provider-card[data-provider-code="kugou"] .primary-btn').trigger('click');
    await flushPromises();

    const providerCard = wrapper.get('.music-source-provider-card[data-provider-code="kugou"]');
    expect(mocked.getMusicSourceBindSession).toHaveBeenCalledTimes(1);
    expect(mocked.waitForMusicSourceBind).not.toHaveBeenCalled();
    expect(providerCard.text()).toContain('绑定失败');
    expect(wrapper.text()).toContain('扫码绑定失败');
    wrapper.unmount();
  });

  it('persists source mode and provider order updates through preferences', async () => {
    mocked.auth = createAuthMock({
      getAccountProfile: vi.fn().mockResolvedValue(createAccountProfile()),
      getPreference: vi.fn().mockResolvedValue({
        music: {
          source_mode: 'tunehub_first',
          account_provider_order: ['netease', 'qqmusic', 'kugou']
        }
      })
    });

    const wrapper = await mountProfilePage();
    await findQuickAction(wrapper, '音乐授权与排序').trigger('click');
    await flushPromises();

    expect(wrapper.get('[data-testid="music-source-mode-select"]').element.value).toBe('meting_first');

    await wrapper.get('[data-testid="music-source-mode-select"]').setValue('account_only');
    await flushPromises();

    expect(mocked.auth.updatePreference).toHaveBeenCalledWith(
      expect.objectContaining({
        'music.source_mode': 'account_only',
        'music.account_provider_order': ['netease', 'qqmusic', 'kugou'],
        music: expect.objectContaining({
          source_mode: 'account_only',
          account_provider_order: ['netease', 'qqmusic', 'kugou']
        })
      })
    );

    await wrapper.get('.music-source-order-item[data-provider-code="qqmusic"] .move-up-btn').trigger('click');
    await flushPromises();

    expect(mocked.auth.updatePreference).toHaveBeenLastCalledWith(
      expect.objectContaining({
        'music.account_provider_order': ['qqmusic', 'netease', 'kugou'],
        music: expect.objectContaining({
          account_provider_order: ['qqmusic', 'netease', 'kugou']
        })
      })
    );
    wrapper.unmount();
  });

  it('keeps logout actions in profile core and account management', async () => {
    const confirmSpy = vi.spyOn(window, 'confirm').mockReturnValue(true);
    mocked.auth = createAuthMock();

    const { wrapper, router } = await mountProfilePageWithRouter();
    expect(wrapper.get('[data-testid="profile-core-logout"]').exists()).toBe(true);

    await findQuickAction(wrapper, '查看账号信息').trigger('click');
    await flushPromises();

    const accountGroup = findGroup(wrapper, 'account');
    expect(accountGroup.isVisible()).toBe(true);

    await accountGroup.get('[data-testid="profile-account-logout"]').trigger('click');
    await flushPromises();

    expect(confirmSpy).toHaveBeenCalledWith('确认登出当前账号？');
    expect(mocked.auth.logout).toHaveBeenCalledTimes(1);
    expect(router.currentRoute.value.path).toBe('/profile');
    expect(router.currentRoute.value.hash).toBe('#settings');
    wrapper.unmount();
  });

  it('keeps local settings available without an authenticated account', async () => {
    mocked.auth = createAuthMock({
      user: ref(null),
      isAuthenticated: ref(false)
    });

    const { wrapper, router } = await mountProfilePageWithRouter('/profile#settings');

    expect(router.currentRoute.value.path).toBe('/profile');
    expect(router.currentRoute.value.hash).toBe('#settings');
    expect(wrapper.text()).toContain('外观设置');

    await router.push('/profile#account');
    await flushPromises();
    expect(wrapper.text()).toContain('账号功能需要登录');
    expect(mocked.auth.getAccountProfile).not.toHaveBeenCalled();
    wrapper.unmount();
  });
});
