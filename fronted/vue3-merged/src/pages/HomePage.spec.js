import { flushPromises, mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import { AI_CHAT_OPEN_EVENT } from '../utils/aiChatBus';
import { __resetFocusSessionForTests, exitFocusSession, setFocusTask } from '../utils/focusSessionState';
import HomePage from './HomePage.vue';

const mockAuth = vi.hoisted(() => ({
  isAuthenticated: { value: true },
  user: { value: { userId: 1, groups: ['ADMIN'] } },
  redirectToAuth: vi.fn()
}));

vi.mock('../composables/useAuthSession', () => ({
  useAuthSession: () => mockAuth
}));

async function mountPage(initialPath = '/') {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/', name: 'home', component: HomePage },
      { path: '/author', name: 'author', component: { template: '<div />' } },
      { path: '/blog', name: 'blog', component: { template: '<div />' } },
      { path: '/music-library/music', name: 'music-library', component: { template: '<div />' } },
      { path: '/apps', name: 'apps', component: { template: '<div />' } },
      { path: '/ai-hub', name: 'ai-hub', component: { template: '<div />' } }
    ]
  });

  await router.push(initialPath);
  await router.isReady();

  const wrapper = mount(HomePage, {
    global: {
      plugins: [router]
    }
  });

  return { wrapper, router };
}

describe('HomePage home room', () => {
  beforeEach(() => {
    __resetFocusSessionForTests();
    mockAuth.isAuthenticated.value = true;
    mockAuth.user.value = { userId: 1, groups: ['ADMIN'] };
    mockAuth.redirectToAuth.mockReset();
  });

  it('enters Focus as the primary action without navigating away from Home', async () => {
    const { wrapper, router } = await mountPage('/');

    await wrapper.get('.home-primary-action').trigger('click');
    await flushPromises();

    expect(router.currentRoute.value.path).toBe('/');
    expect(router.currentRoute.value.name).toBe('home');
    expect(wrapper.get('.home-primary-action').text()).toContain('返回专注');
  });

  it('shows the selected current task without turning Home into a task board', async () => {
    setFocusTask({ moduleCode: 'todo', itemId: 22, title: '整理首页结构' });
    const { wrapper } = await mountPage('/');

    expect(wrapper.get('[data-testid="home-focus-summary"]').text()).toContain('整理首页结构');
    exitFocusSession();
  });

  it('keeps the site intro as a secondary action', async () => {
    const { wrapper, router } = await mountPage('/');

    await wrapper.get('.home-secondary-action').trigger('click');
    await flushPromises();

    expect(router.currentRoute.value.path).toBe('/author');
    expect(router.currentRoute.value.name).toBe('author');
  });

  it('opens the existing chat shell in companion mode from the home room', async () => {
    const { wrapper } = await mountPage('/');
    const listener = vi.fn();
    window.addEventListener(AI_CHAT_OPEN_EVENT, listener);

    await wrapper.get('.home-companion-action').trigger('click');

    expect(listener).toHaveBeenCalledOnce();
    expect(listener.mock.calls[0][0].detail).toMatchObject({
      source: 'home-room',
      preferredMode: 'companion'
    });

    window.removeEventListener(AI_CHAT_OPEN_EVENT, listener);
  });

  it('sends guests to login instead of silently falling back to quick chat', async () => {
    mockAuth.isAuthenticated.value = false;
    mockAuth.user.value = null;
    const { wrapper } = await mountPage('/');

    expect(wrapper.get('.home-companion-action').text()).toContain('登录后回家');
    await wrapper.get('.home-companion-action').trigger('click');

    expect(mockAuth.redirectToAuth).toHaveBeenCalledWith('login_required', '/');
  });
});
