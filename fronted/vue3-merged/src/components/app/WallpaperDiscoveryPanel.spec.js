import { flushPromises, mount } from '@vue/test-utils';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import WallpaperDiscoveryPanel from './WallpaperDiscoveryPanel.vue';
import {
  getWorkshopItemDetail,
  searchWallhavenWallpapers,
  searchWorkshopWallpapers
} from '../../services/wallpaperApi';

vi.mock('../../services/wallpaperApi', () => ({
  searchWorkshopWallpapers: vi.fn(),
  searchWallhavenWallpapers: vi.fn(),
  getWorkshopItemDetail: vi.fn(),
  importWallhavenWallpaper: vi.fn()
}));

const authorizedFetch = vi.fn();

function mountPanel(props = {}) {
  return mount(WallpaperDiscoveryPanel, {
    props: {
      authorizedFetch,
      busy: false,
      ...props
    }
  });
}

beforeEach(() => {
  vi.clearAllMocks();
  searchWorkshopWallpapers.mockResolvedValue({
    items: [
      { item_id: '2141505896', title: 'Rainy Night Cafe', preview_url: 'https://img.example/1.jpg', detail_url: 'https://steamcommunity.com/sharedfiles/filedetails/?id=2141505896' },
      { item_id: '987654321', title: 'City Lights', preview_url: 'https://img.example/2.jpg', detail_url: 'https://steamcommunity.com/sharedfiles/filedetails/?id=987654321' }
    ],
    page: 1,
    has_more: true,
    total: 100,
    source: 'browse_scrape'
  });
  searchWallhavenWallpapers.mockResolvedValue({
    items: [
      { id: 'x8gxgz', thumb_url: 'https://th.example/x8gxgz.jpg', full_url: 'https://w.example/full.jpg', detail_url: 'https://wallhaven.cc/w/x8gxgz', resolution: '3840x2160', file_size_bytes: 2048000, file_type: 'image/jpeg' }
    ],
    page: 1,
    last_page: 5,
    total: 120
  });
  getWorkshopItemDetail.mockResolvedValue({
    item_id: '2141505896',
    title: 'Rainy Night Cafe',
    has_direct_download: false
  });
});

describe('WallpaperDiscoveryPanel', () => {
  it('loads workshop results on mount and renders the grid', async () => {
    const wrapper = mountPanel();
    await flushPromises();

    expect(searchWorkshopWallpapers).toHaveBeenCalledWith(
      expect.objectContaining({ page: 1, sort: 'trend' }),
      authorizedFetch
    );
    expect(wrapper.text()).toContain('Rainy Night Cafe');
    expect(wrapper.text()).toContain('City Lights');
    expect(wrapper.findAll('.discovery-item')).toHaveLength(2);
  });

  it('selects a workshop item, checks download channel and emits import payload', async () => {
    const wrapper = mountPanel();
    await flushPromises();

    await wrapper.findAll('.discovery-item')[0].trigger('click');
    await flushPromises();

    expect(getWorkshopItemDetail).toHaveBeenCalledWith('2141505896', authorizedFetch);
    expect(wrapper.text()).toContain('无公开直链');

    const selectEmitted = wrapper.emitted('select-workshop');
    expect(selectEmitted).toHaveLength(1);
    expect(selectEmitted[0][0]).toMatchObject({
      itemId: '2141505896',
      url: 'https://steamcommunity.com/sharedfiles/filedetails/?id=2141505896'
    });

    const importButton = wrapper.findAll('button').find((button) => button.text().includes('导入选中壁纸'));
    expect(importButton).toBeTruthy();
    await importButton.trigger('click');

    const emitted = wrapper.emitted('import-workshop');
    expect(emitted).toHaveLength(1);
    expect(emitted[0][0]).toMatchObject({
      itemId: '2141505896',
      url: 'https://steamcommunity.com/sharedfiles/filedetails/?id=2141505896',
      visibility: 'PRIVATE'
    });
  });

  it('switches to wallhaven source and emits wallhaven import payload', async () => {
    const wrapper = mountPanel();
    await flushPromises();

    const wallhavenTab = wrapper.findAll('button').find((button) => button.text() === 'Wallhaven');
    await wallhavenTab.trigger('click');
    await flushPromises();

    expect(searchWallhavenWallpapers).toHaveBeenCalledWith(
      expect.objectContaining({ page: 1, purity: '100' }),
      authorizedFetch
    );
    expect(wrapper.text()).toContain('Wallhaven x8gxgz');
    expect(wrapper.text()).toContain('3840x2160');

    await wrapper.find('.discovery-item').trigger('click');
    const importButton = wrapper.findAll('button').find((button) => button.text().includes('拉取选中壁纸'));
    await importButton.trigger('click');

    const emitted = wrapper.emitted('import-wallhaven');
    expect(emitted).toHaveLength(1);
    expect(emitted[0][0]).toMatchObject({ wallhavenId: 'x8gxgz', visibility: 'PRIVATE' });
  });

  it('shows a login hint instead of calling the api without authorizedFetch', async () => {
    const wrapper = mountPanel({ authorizedFetch: null });
    await flushPromises();

    expect(searchWorkshopWallpapers).not.toHaveBeenCalled();
    expect(wrapper.text()).toContain('登录后才能使用在线壁纸浏览');
  });
});
