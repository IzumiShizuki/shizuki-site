import { flushPromises, mount } from '@vue/test-utils';
import { reactive, ref } from 'vue';
import { createMemoryHistory, createRouter } from 'vue-router';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import ProfilePage from './ProfilePage.vue';

const mocked = vi.hoisted(() => ({
  auth: null,
  ui: null,
  listMyPosts: vi.fn(),
  getMusicApiKeyStatus: vi.fn(),
  upsertMusicApiKey: vi.fn(),
  deleteMusicApiKey: vi.fn()
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
  getMusicApiKeyStatus: (...args) => mocked.getMusicApiKeyStatus(...args),
  upsertMusicApiKey: (...args) => mocked.upsertMusicApiKey(...args),
  deleteMusicApiKey: (...args) => mocked.deleteMusicApiKey(...args)
}));

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
    accentHex: '#C8B4FF',
    accentMode: 'solid',
    accentGradientId: 'berry',
    accentGradientStartHex: '#E94BC5',
    accentGradientEndHex: '#9D6BFF',
    routeBackgroundByKey: {},
    globalBackgroundId: '',
    aiPanelOpen: false
  });

  return {
    state,
    ACCENT_PRESETS: [
      { name: '淡紫', hex: '#C8B4FF' },
      { name: '薄荷青', hex: '#8FDCC8' }
    ],
    GRADIENT_PRESETS: [
      { id: 'berry', name: '莓果粉紫', startHex: '#E94BC5', endHex: '#9D6BFF' }
    ],
    setAccentHex: vi.fn((hex) => {
      state.accentHex = hex;
      return { ok: true, normalized: hex };
    }),
    resetAccent: vi.fn(() => {
      state.accentHex = '#C8B4FF';
    }),
    setAccentMode: vi.fn((mode) => {
      state.accentMode = mode === 'gradient' ? 'gradient' : 'solid';
      return state.accentMode;
    }),
    setAccentGradientPreset: vi.fn((presetId) => {
      state.accentGradientId = presetId;
      return { id: presetId, startHex: '#E94BC5', endHex: '#9D6BFF' };
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

async function mountProfilePage() {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/profile', component: { template: '<div />' } },
      { path: '/auth', component: { template: '<div />' } },
      { path: '/:pathMatch(.*)*', component: { template: '<div />' } }
    ]
  });

  await router.push('/profile');
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

describe('ProfilePage immediate account expansion', () => {
  beforeEach(() => {
    mocked.listMyPosts.mockReset().mockResolvedValue({ items: [] });
    mocked.getMusicApiKeyStatus.mockReset().mockResolvedValue({});
    mocked.upsertMusicApiKey.mockReset().mockResolvedValue({});
    mocked.deleteMusicApiKey.mockReset().mockResolvedValue({});
    mocked.ui = createUiMock();
  });

  afterEach(() => {
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

    accountDeferred.resolve({
      userId: 7,
      username: 'izumi',
      nickname: 'Izumi',
      email: 'izumi@example.com',
      emailVerified: 1,
      avatarUrl: '',
      hasPassword: true,
      oauthBindings: []
    });
    await flushPromises();

    expect(mocked.auth.getPreference).toHaveBeenCalledTimes(1);
    wrapper.unmount();
  });

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

    accountDeferred.resolve({
      userId: 7,
      username: 'izumi',
      nickname: 'Izumi',
      email: 'izumi@example.com',
      emailVerified: 1,
      avatarUrl: '',
      hasPassword: true,
      oauthBindings: []
    });
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

    accountDeferred.resolve({
      userId: 7,
      username: 'izumi',
      nickname: 'Izumi',
      email: 'izumi@example.com',
      emailVerified: 1,
      avatarUrl: '',
      hasPassword: true,
      oauthBindings: []
    });
    await flushPromises();

    expect(mocked.auth.createImageCaptcha).toHaveBeenCalledTimes(1);
    wrapper.unmount();
  });
});
