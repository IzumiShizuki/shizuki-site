import { flushPromises, mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { __resetMotionPreferenceForTests } from '../composables/useMotionPreference';
import MomentsPage from './MomentsPage.vue';

const apiMocks = vi.hoisted(() => ({
  getMomentDetail: vi.fn(),
  getMomentsPage: vi.fn()
}));

vi.mock('../services/lifeContentApi', () => apiMocks);
const LONG_BODY = `${'窗外的风把树影轻轻推过墙面。'.repeat(16)}这是完整内容的结尾。`;

function photo(suffix, alt) {
  return Object.freeze({
    mediaRef: `med_ABCDEFGHIJKLMNOPQRSTUVWXYZ${suffix}`,
    altText: alt,
    thumbnail: {
      url: `/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ${suffix}/variants/THUMB_WEBP`,
      width: 640,
      height: 427
    },
    display: {
      url: `/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ${suffix}/variants/DISPLAY_WEBP`,
      width: 1600,
      height: 1067
    },
    displayAvif: null,
    locationLabel: '河岸'
  });
}

async function mountPage(path = '/moments') {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/moments', component: MomentsPage },
      { path: '/moments/:publicId', component: MomentsPage },
      { path: '/albums', component: { template: '<main />' } },
      { path: '/author', component: { template: '<main />' } }
    ]
  });
  await router.push(path);
  await router.isReady();
  const scrollRoot = document.createElement('main');
  scrollRoot.className = 'route-content route-content-app-scroll';
  document.body.append(scrollRoot);
  const wrapper = mount(MomentsPage, {
    attachTo: scrollRoot,
    global: { plugins: [router] }
  });
  await flushPromises();
  return { wrapper, router, scrollRoot };
}

beforeEach(() => {
  __resetMotionPreferenceForTests();
  document.body.innerHTML = '';
  apiMocks.getMomentDetail.mockReset().mockResolvedValue({
    publicId: 'moment_unlisted_ABCDEFGHIJKLMNOPQRSTUVWXYZ',
    body: '这是一条仅通过链接访问的动态。',
    publishedAt: '2026-08-22T10:00:00Z',
    pinned: false,
    noIndex: true,
    unlisted: true,
    photos: []
  });
  apiMocks.getMomentsPage.mockReset().mockResolvedValue({
    items: [
      {
        publicId: 'moment-first',
        body: LONG_BODY,
        publishedAt: '2026-08-20T10:00:00Z',
        pinned: false,
        photos: [photo('1', '第一张'), photo('2', '第二张')]
      },
      {
        publicId: 'moment-second',
        body: '另一条动态。',
        publishedAt: '2026-08-21T10:00:00Z',
        pinned: false,
        photos: [photo('3', '不属于当前组')]
      }
    ],
    hasMore: false,
    nextCursor: ''
  });
});

afterEach(() => {
  document.body.innerHTML = '';
  document.head.querySelectorAll('meta[data-shizuki-runtime-robots]').forEach((element) => element.remove());
  vi.unstubAllGlobals();
  __resetMotionPreferenceForTests();
});

describe('MomentsPage photo group lightbox', () => {
  it('opens at the selected image and keeps navigation inside its moment-defined order', async () => {
    const { wrapper } = await mountPage();
    const buttons = wrapper.findAll('.moment-photo-open');
    const origin = buttons[1];
    origin.element.focus();
    await origin.trigger('click');
    await flushPromises();

    const dialog = document.querySelector('.media-lightbox');
    expect(dialog.textContent).toContain('2 / 2');
    expect(dialog.querySelector('img').getAttribute('alt')).toBe('第二张');
    expect(dialog.innerHTML).not.toContain('不属于当前组');

    dialog.dispatchEvent(new KeyboardEvent('keydown', { key: 'ArrowLeft', bubbles: true }));
    await flushPromises();
    expect(dialog.querySelector('img').getAttribute('alt')).toBe('第一张');

    dialog.querySelector('[aria-label="关闭照片"]').click();
    await flushPromises();
    expect(document.activeElement).toBe(origin.element);
    wrapper.unmount();
  });

  it('expands and collapses in place without refetching, navigating, losing focus or resetting scroll', async () => {
    const { wrapper, router, scrollRoot } = await mountPage();
    expect(wrapper.get('.moments-page').classes()).toContain('view-transition-fallback');
    scrollRoot.scrollTop = 236;
    const firstCard = wrapper.get('#moment-moment-first');
    const body = firstCard.get('#moment-body-moment-first');
    const toggle = firstCard.get('.moment-expand-button');

    expect(body.text()).toMatch(/…$/);
    expect(body.text()).not.toContain('这是完整内容的结尾。');
    expect(toggle.attributes('aria-expanded')).toBe('false');

    toggle.element.focus();
    await toggle.trigger('click');
    await flushPromises();
    expect(body.text()).toContain('这是完整内容的结尾。');
    expect(toggle.attributes('aria-expanded')).toBe('true');
    expect(document.activeElement).toBe(toggle.element);
    expect(scrollRoot.scrollTop).toBe(236);
    expect(router.currentRoute.value.path).toBe('/moments');
    expect(apiMocks.getMomentsPage).toHaveBeenCalledOnce();

    await toggle.trigger('click');
    await flushPromises();
    expect(body.text()).toMatch(/…$/);
    expect(toggle.attributes('aria-expanded')).toBe('false');
    expect(document.activeElement).toBe(toggle.element);
    expect(scrollRoot.scrollTop).toBe(236);
    expect(apiMocks.getMomentsPage).toHaveBeenCalledOnce();
    wrapper.unmount();
  });

  it('opens an unlisted direct route with noindex and copies only its clean content URL', async () => {
    const writeText = vi.fn().mockResolvedValue(undefined);
    vi.stubGlobal('navigator', { clipboard: { writeText } });
    const directId = 'moment_unlisted_ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    const { wrapper } = await mountPage(`/moments/${directId}`);

    expect(apiMocks.getMomentDetail).toHaveBeenCalledWith(directId, expect.any(AbortSignal));
    expect(apiMocks.getMomentsPage).not.toHaveBeenCalled();
    expect(document.head.querySelector('meta[name="robots"]')?.getAttribute('content'))
      .toBe('noindex, nofollow, noarchive');
    expect(wrapper.text()).toContain('仅通过链接访问');

    await wrapper.get('.content-share button').trigger('click');
    await flushPromises();
    const copiedUrl = writeText.mock.calls[0][0];
    expect(copiedUrl).toContain(`#/moments/${directId}`);
    expect(copiedUrl).not.toMatch(/capability|signature|media\/med_|bucket/i);

    wrapper.unmount();
    expect(document.head.querySelector('meta[data-shizuki-runtime-robots]')).toBeNull();
  });

  it('shows a truthful empty feed with no invented cards, photos or social actions', async () => {
    apiMocks.getMomentsPage.mockResolvedValueOnce({ items: [], hasMore: false, nextCursor: '' });
    const { wrapper } = await mountPage();

    expect(wrapper.get('[data-testid="moments-page-empty"]').text()).toContain('内容正在整理');
    expect(wrapper.find('.moment-card').exists()).toBe(false);
    expect(wrapper.find('img').exists()).toBe(false);
    expect(wrapper.find('[aria-label*="点赞"], [aria-label*="评论"]').exists()).toBe(false);
    expect(wrapper.text()).not.toContain('示例动态');
    wrapper.unmount();
  });

  it('isolates a feed failure and recovers without affecting the route', async () => {
    apiMocks.getMomentsPage.mockRejectedValueOnce(new Error('upstream unavailable'));
    const { wrapper, router } = await mountPage();
    expect(wrapper.get('[role="alert"]').text()).toContain('动态暂时没有读到');

    apiMocks.getMomentsPage.mockResolvedValueOnce({ items: [], hasMore: false, nextCursor: '' });
    await wrapper.get('[role="alert"] button').trigger('click');
    await flushPromises();
    expect(wrapper.get('[data-testid="moments-page-empty"]').exists()).toBe(true);
    expect(router.currentRoute.value.path).toBe('/moments');
    wrapper.unmount();
  });

  it('uses the same non-disclosing direct-route state for private and missing Moments', async () => {
    apiMocks.getMomentDetail.mockRejectedValueOnce(new Error('404'));
    const { wrapper } = await mountPage('/moments/moment_private_ABCDEFGHIJKLMNOPQRSTUVWXYZ');

    expect(wrapper.get('[role="alert"]').text()).toContain('动态暂时没有读到');
    expect(wrapper.find('.moment-card').exists()).toBe(false);
    expect(wrapper.text()).not.toMatch(/private|bucket|capability|object key/i);
    wrapper.unmount();
  });

  it('keeps a failed Moment thumbnail unavailable without substituting another source', async () => {
    const { wrapper } = await mountPage();
    const firstButton = wrapper.get('.moment-photo-open');
    await firstButton.get('img').trigger('error');
    await flushPromises();

    expect(firstButton.find('img').exists()).toBe(false);
    expect(firstButton.text()).toContain('打开后安全读取图片');
    expect(firstButton.html()).not.toContain('original');
    wrapper.unmount();
  });
});
