import { flushPromises, mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { __resetMotionPreferenceForTests } from '../composables/useMotionPreference';
import AlbumDetailPage from './AlbumDetailPage.vue';

const apiMocks = vi.hoisted(() => ({
  getAlbumDetail: vi.fn()
}));

vi.mock('../services/lifeContentApi', () => apiMocks);

const media = Object.freeze({
  mediaRef: 'med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1',
  altText: '河岸晚霞',
  thumbnail: {
    url: '/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1/variants/THUMB_WEBP',
    width: 640,
    height: 427
  },
  display: {
    url: '/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1/variants/DISPLAY_WEBP',
    width: 1600,
    height: 1067
  },
  displayAvif: {
    url: '/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1/variants/DISPLAY_AVIF',
    width: 1600,
    height: 1067
  },
  fullSanitized: {
    url: '/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1/variants/FULL_SANITIZED'
  }
});

async function mountPage() {
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/albums', component: { template: '<main />' } },
      { path: '/albums/:publicSlug', component: AlbumDetailPage }
    ]
  });
  await router.push('/albums/album_ABCDEFGHIJKLMNOPQRSTUVWXYZ');
  await router.isReady();
  const wrapper = mount(AlbumDetailPage, {
    attachTo: document.body,
    global: { plugins: [router] }
  });
  await flushPromises();
  return wrapper;
}

beforeEach(() => {
  __resetMotionPreferenceForTests();
  document.body.innerHTML = '';
  apiMocks.getAlbumDetail.mockReset().mockResolvedValue({
    publicSlug: 'album_ABCDEFGHIJKLMNOPQRSTUVWXYZ',
    title: '真实相册',
    summary: '真实内容。',
    publishedAt: '2026-08-20T10:00:00Z',
    noIndex: true,
    photos: [{
      title: '晚霞',
      altText: '河岸晚霞',
      caption: '风从河岸吹过。',
      locationLabel: '河岸',
      media
    }]
  });
});

afterEach(() => {
  document.body.innerHTML = '';
  document.head.querySelectorAll('meta[data-shizuki-runtime-robots]').forEach((element) => element.remove());
  vi.unstubAllGlobals();
  __resetMotionPreferenceForTests();
});

describe('AlbumDetailPage lightbox integration', () => {
  it('opens the safe display derivative and returns focus to the photo button', async () => {
    const wrapper = await mountPage();
    expect(wrapper.get('.album-detail-page').classes()).toContain('view-transition-fallback');
    const photoButton = wrapper.get('.photo-open');
    expect(photoButton.get('img').attributes('src')).toContain('/variants/THUMB_WEBP');

    photoButton.element.focus();
    await photoButton.trigger('click');
    await flushPromises();
    const dialog = document.querySelector('.media-lightbox');
    expect(dialog.querySelector('img').getAttribute('src')).toContain('/variants/DISPLAY_WEBP');
    expect(dialog.querySelector('source').getAttribute('srcset')).toContain('/variants/DISPLAY_AVIF');
    expect(dialog.innerHTML).not.toContain('FULL_SANITIZED');
    expect(document.head.querySelector('meta[name="robots"]')?.getAttribute('content'))
      .toBe('noindex, nofollow, noarchive');

    dialog.querySelector('[aria-label="关闭照片"]').click();
    await flushPromises();
    expect(document.querySelector('.media-lightbox')).toBeNull();
    expect(document.activeElement).toBe(photoButton.element);
    wrapper.unmount();
  });

  it('copies a sanitized Album route without media or capability data', async () => {
    const writeText = vi.fn().mockResolvedValue(undefined);
    vi.stubGlobal('navigator', { clipboard: { writeText } });
    const wrapper = await mountPage();

    await wrapper.get('.content-share button').trigger('click');
    await flushPromises();
    expect(writeText).toHaveBeenCalledOnce();
    expect(writeText.mock.calls[0][0]).toContain('#/albums/album_ABCDEFGHIJKLMNOPQRSTUVWXYZ');
    expect(writeText.mock.calls[0][0]).not.toMatch(/capability|FULL_SANITIZED|media\/med_|bucket/i);
    wrapper.unmount();
  });

  it('shows the same non-disclosing state when a private or missing Album is rejected', async () => {
    apiMocks.getAlbumDetail.mockRejectedValueOnce(new Error('404'));
    const wrapper = await mountPage();

    expect(wrapper.get('[role="alert"]').text()).toContain('这本相册暂时无法打开');
    expect(wrapper.find('.photo-frame').exists()).toBe(false);
    expect(wrapper.find('.content-share').exists()).toBe(false);
    expect(wrapper.text()).not.toMatch(/private|bucket|object key|capability/i);
    wrapper.unmount();
  });

  it('keeps a failed thumbnail honest while retaining the authorized display action', async () => {
    const wrapper = await mountPage();
    const photoButton = wrapper.get('.photo-open');
    await photoButton.get('img').trigger('error');
    await flushPromises();

    expect(photoButton.find('img').exists()).toBe(false);
    expect(photoButton.text()).toContain('打开后安全读取照片');
    await photoButton.trigger('click');
    await flushPromises();
    expect(document.querySelector('.media-lightbox img')?.getAttribute('src')).toContain('/variants/DISPLAY_WEBP');
    wrapper.unmount();
  });
});
