import { flushPromises, mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import { ref } from 'vue';
import { PLAYER_BRIDGE_KEY } from '../composables/playerBridge';
import { AI_CHAT_OPEN_EVENT } from '../utils/aiChatBus';
import { __resetFocusSessionForTests, getFocusSessionSnapshot, setFocusTask } from '../utils/focusSessionState';
import {
  HOME_STAGE_CONTEXT_KEY,
  __resetHomeAppearanceForTests,
  setHomeMotionLevel,
  setWallpaperClockOverride
} from '../utils/homeTimeStageState';
import { LIGHT_APP_WINDOW_OPEN_EVENT } from '../utils/lightAppWindowBus';
import HomePage from './HomePage.vue';

const mockAuth = vi.hoisted(() => ({
  isAuthenticated: { value: true },
  user: { value: { userId: 1, groups: ['ADMIN'] } },
  redirectToAuth: vi.fn()
}));

vi.mock('../composables/useAuthSession', () => ({
  useAuthSession: () => mockAuth
}));

vi.mock('../services/blogApi', () => ({
  listPublicPostWhispers: vi.fn().mockResolvedValue([])
}));

async function mountPage({
  initialPath = '/',
  wallpaper = { id: 'still-1', isDynamic: false },
  track = null,
  isPlaying = false
} = {}) {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/', name: 'home', component: HomePage },
      { path: '/author', name: 'author', component: { template: '<div class="author-route" />' } },
      { path: '/blog', name: 'blog', component: { template: '<div class="blog-route" />' } },
      { path: '/music-library/music', name: 'music-library', component: { template: '<div class="music-route" />' } }
    ]
  });
  const player = {
    currentTrack: ref(track),
    isPlaying: ref(isPlaying),
    togglePlay: vi.fn()
  };
  const wallpaperRef = ref(wallpaper);

  await router.push(initialPath);
  await router.isReady();

  const wrapper = mount(HomePage, {
    global: {
      plugins: [router],
      provide: {
        [PLAYER_BRIDGE_KEY]: player,
        [HOME_STAGE_CONTEXT_KEY]: { wallpaper: wallpaperRef }
      }
    }
  });

  return { wrapper, router, player, wallpaperRef };
}

describe('HomePage time stage', () => {
  beforeEach(() => {
    window.localStorage.clear();
    __resetFocusSessionForTests();
    __resetHomeAppearanceForTests();
    mockAuth.isAuthenticated.value = true;
    mockAuth.user.value = { userId: 1, groups: ['ADMIN'] };
    mockAuth.redirectToAuth.mockReset();
  });

  it('renders a borderless time stage and no more than three contextual islands', async () => {
    const { wrapper } = await mountPage();

    expect(wrapper.get('[data-testid="home-stage-clock"]').exists()).toBe(true);
    expect(wrapper.findAll('.context-island')).toHaveLength(3);
    expect(wrapper.find('.home-welcome-panel').exists()).toBe(false);
    expect(wrapper.get('[data-testid="home-room-utilities"]').findAll('button')).toHaveLength(2);
    expect(wrapper.find('.home-quick-links').exists()).toBe(false);

    wrapper.unmount();
  });

  it('hides a dynamic-wallpaper clock by default and honors the wallpaper override', async () => {
    const { wrapper } = await mountPage({ wallpaper: { id: 'video-1', isDynamic: true } });

    expect(wrapper.find('[data-testid="home-stage-clock"]').exists()).toBe(false);
    expect(wrapper.get('[data-testid="home-clock-hidden-note"]').text()).toContain('已隐藏时钟');

    setWallpaperClockOverride('video-1', 'show');
    await wrapper.vm.$nextTick();
    expect(wrapper.get('[data-testid="home-stage-clock"]').exists()).toBe(true);

    wrapper.unmount();
  });

  it('starts the existing desk Focus preset without changing route and suppresses Home chrome', async () => {
    const { wrapper, router } = await mountPage();

    await wrapper.get('[data-testid="home-focus-island"]').trigger('click');
    await flushPromises();

    expect(router.currentRoute.value.path).toBe('/');
    expect(getFocusSessionSnapshot()).toMatchObject({ status: 'active', presetId: 'desk' });
    expect(wrapper.find('.context-island-row').exists()).toBe(false);
    expect(wrapper.find('[data-testid="home-stage-clock"]').exists()).toBe(false);
    expect(wrapper.find('[data-testid="home-room-utilities"]').exists()).toBe(false);

    wrapper.unmount();
  });

  it('shows the selected Todo in the Focus island without creating a task board', async () => {
    setFocusTask({ moduleCode: 'todo', itemId: 22, title: '整理首页结构' });
    const { wrapper } = await mountPage();

    expect(wrapper.get('[data-testid="home-focus-island"]').text()).toContain('整理首页结构');
    expect(wrapper.get('[data-testid="home-focus-island"]').text()).toContain('进入专注继续这件事');
    expect(wrapper.findAll('.context-island')).toHaveLength(3);

    wrapper.unmount();
  });

  it('uses the real player bridge or existing music route from the music island', async () => {
    const withTrack = await mountPage({
      track: { id: '1', title: 'Asterism', artist: 'Shizuki' },
      isPlaying: true
    });

    await withTrack.wrapper.get('[data-testid="home-music-island"]').trigger('click');
    expect(withTrack.player.togglePlay).toHaveBeenCalledOnce();
    expect(withTrack.router.currentRoute.value.path).toBe('/');
    withTrack.wrapper.unmount();

    const withoutTrack = await mountPage();
    await withoutTrack.wrapper.get('[data-testid="home-music-island"]').trigger('click');
    await flushPromises();
    expect(withoutTrack.router.currentRoute.value.path).toBe('/music-library/music');
    withoutTrack.wrapper.unmount();
  });

  it('opens the existing Todo light app from the reminder island', async () => {
    const { wrapper } = await mountPage();
    const listener = vi.fn();
    window.addEventListener(LIGHT_APP_WINDOW_OPEN_EVENT, listener);

    await wrapper.get('[data-testid="home-reminder-island"]').trigger('click');

    expect(listener).toHaveBeenCalledOnce();
    expect(listener.mock.calls[0][0].detail).toMatchObject({
      code: 'timeprism-todo',
      source: 'home-context-island'
    });

    window.removeEventListener(LIGHT_APP_WINDOW_OPEN_EVENT, listener);
    wrapper.unmount();
  });

  it('opens the existing author route from the quiet Home introduction action', async () => {
    const { wrapper, router } = await mountPage();

    await wrapper.get('[data-testid="home-intro-action"]').trigger('click');
    await flushPromises();

    expect(router.currentRoute.value.path).toBe('/author');
    wrapper.unmount();
  });

  it('opens companion mode for ADMIN users without leaving Home', async () => {
    const { wrapper, router } = await mountPage();
    const listener = vi.fn();
    window.addEventListener(AI_CHAT_OPEN_EVENT, listener);

    await wrapper.get('[data-testid="home-companion-action"]').trigger('click');

    expect(listener).toHaveBeenCalledOnce();
    expect(listener.mock.calls[0][0].detail).toMatchObject({
      source: 'home-room',
      preferredMode: 'companion'
    });
    expect(router.currentRoute.value.path).toBe('/');

    window.removeEventListener(AI_CHAT_OPEN_EVENT, listener);
    wrapper.unmount();
  });

  it('uses the existing login flow for guests', async () => {
    mockAuth.isAuthenticated.value = false;
    mockAuth.user.value = null;
    const { wrapper } = await mountPage();

    expect(wrapper.get('[data-testid="home-companion-action"]').text()).toContain('登录后回家');
    await wrapper.get('[data-testid="home-companion-action"]').trigger('click');

    expect(mockAuth.redirectToAuth).toHaveBeenCalledWith('login_required', '/');
    wrapper.unmount();
  });

  it('shows a locked companion state to authenticated non-ADMIN users', async () => {
    mockAuth.user.value = { userId: 2, groups: ['USER'] };
    const { wrapper } = await mountPage();
    const action = wrapper.get('[data-testid="home-companion-action"]');

    expect(action.attributes('disabled')).toBeDefined();
    expect(action.text()).toContain('伴聊未开放');
    expect(action.text()).toContain('当前仅限 ADMIN');
    wrapper.unmount();
  });

  it('applies the persisted motion level to the Home root only', async () => {
    setHomeMotionLevel('calm');
    const { wrapper } = await mountPage();

    expect(wrapper.attributes('data-motion-level')).toBe('calm');
    expect(wrapper.classes()).toContain('motion-calm');

    wrapper.unmount();
  });
});
