import { flushPromises, mount } from '@vue/test-utils';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import SiteMenuPopover from './SiteMenuPopover.vue';

const apiMocks = vi.hoisted(() => ({
  getFeaturedAlbums: vi.fn(),
  getFeaturedMoments: vi.fn()
}));

vi.mock('../../services/lifeContentApi', () => apiMocks);

const realAlbum = Object.freeze({
  publicSlug: 'album-real-a1',
  title: '河岸散步',
  photoCount: 4,
  cover: {
    mediaRef: 'med_album_real_a1',
    altText: '夕阳下的河岸',
    preview: {
      url: '/api/v1/media/med_album_real_a1/variants/THUMB_WEBP',
      width: 320,
      height: 240
    }
  }
});

const realMoment = Object.freeze({
  publicId: 'moment-real-b2',
  body: '今天把窗边的花和书重新整理了一遍。',
  publishedAt: '2026-08-28T10:00:00Z',
  cover: null
});

beforeEach(() => {
  apiMocks.getFeaturedAlbums.mockReset().mockResolvedValue([]);
  apiMocks.getFeaturedMoments.mockReset().mockResolvedValue([]);
});

describe('SiteMenuPopover', () => {
  it('loads only on first open and keeps its resolved state while closed', async () => {
    apiMocks.getFeaturedAlbums.mockResolvedValue([realAlbum]);
    const wrapper = mount(SiteMenuPopover, { props: { open: false } });

    expect(apiMocks.getFeaturedAlbums).not.toHaveBeenCalled();
    await wrapper.setProps({ open: true });
    await flushPromises();
    expect(wrapper.get('[data-testid="album-previews"]').text()).toContain('河岸散步');

    await wrapper.setProps({ open: false });
    await wrapper.setProps({ open: true });
    await flushPromises();
    expect(apiMocks.getFeaturedAlbums).toHaveBeenCalledTimes(1);
    expect(apiMocks.getFeaturedMoments).toHaveBeenCalledTimes(1);
  });

  it('always exposes About, Albums and Moments with honest empty states', async () => {
    const wrapper = mount(SiteMenuPopover, { props: { open: true } });
    await flushPromises();

    expect(wrapper.findAll('.site-destination').map((item) => item.text())).toEqual([
      expect.stringContaining('About'),
      expect.stringContaining('Albums'),
      expect.stringContaining('Moments')
    ]);
    expect(wrapper.get('[data-testid="albums-empty"]').text()).toContain('内容正在整理');
    expect(wrapper.get('[data-testid="moments-empty"]').text()).toContain('内容正在整理');
    expect(wrapper.find('img').exists()).toBe(false);
    expect(wrapper.html()).not.toContain('katanegai');
    expect(wrapper.html()).not.toContain('wallpaper');
  });

  it('isolates a Moments failure while keeping real Album previews usable', async () => {
    apiMocks.getFeaturedAlbums.mockResolvedValue([realAlbum]);
    apiMocks.getFeaturedMoments.mockRejectedValue(new Error('moments unavailable'));
    const wrapper = mount(SiteMenuPopover, { props: { open: true } });
    await flushPromises();

    expect(wrapper.get('[data-testid="album-previews"]').text()).toContain('河岸散步');
    expect(wrapper.get('[data-testid="moments-error"]').text()).toContain('暂时没有读到');
  });

  it('emits exact destinations for hierarchy and real recent content', async () => {
    apiMocks.getFeaturedAlbums.mockResolvedValue([realAlbum]);
    apiMocks.getFeaturedMoments.mockResolvedValue([realMoment]);
    const wrapper = mount(SiteMenuPopover, {
      props: { open: true, activeDestination: 'albums' }
    });
    await flushPromises();

    expect(wrapper.findAll('.site-destination')[1].classes()).toContain('active');
    await wrapper.findAll('.site-destination')[0].trigger('click');
    await wrapper.get('[data-testid="album-previews"] .content-preview').trigger('click');
    await wrapper.get('[data-testid="moment-previews"] .content-preview').trigger('click');

    expect(wrapper.emitted('select')).toEqual([
      [{ destination: 'about' }],
      [{ destination: 'album-detail', publicSlug: 'album-real-a1' }],
      [{ destination: 'moments', publicId: 'moment-real-b2' }]
    ]);
  });
});
