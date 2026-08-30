import { flushPromises, mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { __resetMotionPreferenceForTests, setMotionMode } from '../composables/useMotionPreference';
import AlbumsPage from './AlbumsPage.vue';

const apiMocks = vi.hoisted(() => ({
  getAlbumsPage: vi.fn()
}));

vi.mock('../services/lifeContentApi', () => apiMocks);

const album = Object.freeze({
  publicSlug: 'real-summer-a1',
  title: '真实的夏日相册',
  summary: '河岸与傍晚。',
  publishedAt: '2026-08-20T10:00:00Z',
  photoCount: 8,
  cover: {
    mediaRef: 'med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1',
    altText: '河岸傍晚',
    preview: {
      url: '/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1/variants/THUMB_WEBP',
      width: 640,
      height: 480
    }
  }
});

async function mountPage() {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/albums', name: 'albums', component: AlbumsPage },
      { path: '/albums/:publicSlug', name: 'album-detail', component: { template: '<main>detail</main>' } },
      { path: '/author', name: 'author', component: { template: '<main />' } },
      { path: '/moments', name: 'moments', component: { template: '<main />' } }
    ]
  });
  await router.push('/albums');
  await router.isReady();
  const wrapper = mount(AlbumsPage, { global: { plugins: [router] } });
  await flushPromises();
  return { wrapper, router };
}

beforeEach(() => {
  __resetMotionPreferenceForTests();
  apiMocks.getAlbumsPage.mockReset().mockResolvedValue({ items: [album], hasMore: false, nextCursor: '' });
});

afterEach(() => {
  delete document.startViewTransition;
  __resetMotionPreferenceForTests();
});

describe('AlbumsPage Memory Lens', () => {
  it('renders Polaroid material layers only for a real eligible cover and uses immersive transition', async () => {
    setMotionMode('immersive');
    const finished = Promise.resolve();
    document.startViewTransition = vi.fn((update) => {
      void update();
      return { finished };
    });
    const { wrapper, router } = await mountPage();

    const card = wrapper.get('.album-card');
    expect(card.findAll('.album-stack-layer')).toHaveLength(2);
    expect(card.get('img').attributes('src')).toContain('/api/v1/media/med_');
    await card.trigger('click');
    await flushPromises();

    expect(document.startViewTransition).toHaveBeenCalledOnce();
    expect(router.currentRoute.value.path).toBe('/albums/real-summer-a1');
    wrapper.unmount();
  });

  it('keeps the same link semantics but skips spatial transition in soothing mode', async () => {
    setMotionMode('soothing');
    document.startViewTransition = vi.fn();
    const { wrapper, router } = await mountPage();
    const card = wrapper.get('.album-card');

    expect(card.attributes('href')).toBe('/albums/real-summer-a1');
    await card.trigger('click');
    await flushPromises();

    expect(document.startViewTransition).not.toHaveBeenCalled();
    expect(router.currentRoute.value.path).toBe('/albums/real-summer-a1');
    wrapper.unmount();
  });

  it('renders an intentional empty state without fictional cards or images in both themes', async () => {
    apiMocks.getAlbumsPage.mockResolvedValue({ items: [], hasMore: false, nextCursor: '' });
    for (const theme of ['day', 'night']) {
      document.documentElement.dataset.themeMode = theme;
      const { wrapper } = await mountPage();
      expect(wrapper.get('[data-testid="albums-page-empty"]').text()).toContain('内容正在整理');
      expect(wrapper.find('.album-card').exists()).toBe(false);
      expect(wrapper.find('img').exists()).toBe(false);
      expect(document.documentElement.dataset.themeMode).toBe(theme);
      wrapper.unmount();
    }
    delete document.documentElement.dataset.themeMode;
  });

  it('isolates an upstream failure and can recover to a real empty response', async () => {
    apiMocks.getAlbumsPage.mockRejectedValueOnce(new Error('upstream unavailable'));
    const { wrapper } = await mountPage();
    expect(wrapper.get('[role="alert"]').text()).toContain('相册暂时没有读到');
    expect(wrapper.find('.album-card').exists()).toBe(false);

    apiMocks.getAlbumsPage.mockResolvedValueOnce({ items: [], hasMore: false, nextCursor: '' });
    await wrapper.get('[role="alert"] button').trigger('click');
    await flushPromises();
    expect(wrapper.get('[data-testid="albums-page-empty"]').exists()).toBe(true);
    wrapper.unmount();
  });

  it('fails a broken real cover closed without replacing it with another asset', async () => {
    const { wrapper } = await mountPage();
    const card = wrapper.get('.album-card');
    await card.get('img').trigger('error');
    await flushPromises();

    expect(card.classes()).toContain('without-cover');
    expect(card.find('img').exists()).toBe(false);
    expect(card.get('.album-cover-empty').exists()).toBe(true);
    wrapper.unmount();
  });
});
