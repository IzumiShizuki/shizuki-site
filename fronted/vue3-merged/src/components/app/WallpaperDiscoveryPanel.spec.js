import { flushPromises, mount } from '@vue/test-utils';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import WallpaperDiscoveryPanel from './WallpaperDiscoveryPanel.vue';
import {
  getWallpaperDiscoveryPreviewUrl,
  getWorkshopItemDetail,
  searchWallhavenWallpapers,
  searchWorkshopWallpapers
} from '../../services/wallpaperApi';

vi.mock('../../services/wallpaperApi', () => ({
  getWallpaperDiscoveryPreviewUrl: vi.fn((source, itemId) => `/preview/${source}/${itemId}`),
  searchWorkshopWallpapers: vi.fn(),
  searchWallhavenWallpapers: vi.fn(),
  getWorkshopItemDetail: vi.fn(),
  importWallhavenWallpaper: vi.fn()
}));

const authorizedFetch = vi.fn();

function mountPanel(props = {}) {
  return mount(WallpaperDiscoveryPanel, {
    props: {
      source: 'workshop',
      authorizedFetch,
      isAuthenticated: true,
      busy: false,
      importState: {
        lastImportJobId: 0,
        lastImportJobStatus: '',
        statusBusy: false,
        hint: ''
      },
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
      {
        id: 'x8gxgz',
        thumb_url: 'https://th.example/x8gxgz.jpg',
        full_url: 'https://w.example/full.jpg',
        detail_url: 'https://wallhaven.cc/w/x8gxgz',
        resolution: '3840x2160',
        ratio: '1.78',
        file_size_bytes: 2048000,
        file_type: 'image/jpeg',
        category: 'anime',
        purity: 'sfw',
        views: 42100,
        favorites: 860,
        created_at: '2026-08-01 12:30:00'
      }
    ],
    page: 1,
    last_page: 5,
    total: 120
  });
  getWorkshopItemDetail.mockResolvedValue({
    item_id: '2141505896',
    title: 'Rainy Night Cafe',
    has_direct_download: false,
    download_channel: 'STEAMCMD',
    download_available: true,
    channel_message: '可通过 SteamCMD 导入'
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
    expect(wrapper.text()).toContain('可通过 SteamCMD 导入');

    const selectEmitted = wrapper.emitted('select-workshop');
    expect(selectEmitted).toHaveLength(1);
    expect(selectEmitted[0][0]).toMatchObject({
      itemId: '2141505896',
      url: 'https://steamcommunity.com/sharedfiles/filedetails/?id=2141505896'
    });

    const importButton = wrapper.findAll('button').find((button) => button.text() === '导入壁纸');
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

  it('renders the backend unavailable reason without hiding the selected item', async () => {
    getWorkshopItemDetail.mockResolvedValueOnce({
      item_id: '2141505896',
      title: 'Rainy Night Cafe',
      has_direct_download: false,
      download_channel: 'UNAVAILABLE',
      download_available: false,
      channel_message: '服务器未配置 SteamCMD 账号'
    });
    const wrapper = mountPanel();
    await flushPromises();

    await wrapper.findAll('.discovery-item')[0].trigger('click');
    await flushPromises();

    expect(wrapper.text()).toContain('Rainy Night Cafe');
    expect(wrapper.text()).toContain('服务器未配置 SteamCMD 账号');
  });

  it('keeps the selected item visible when the channel request can be retried', async () => {
    getWorkshopItemDetail.mockRejectedValueOnce(new Error('upstream unavailable'));
    const wrapper = mountPanel();
    await flushPromises();

    await wrapper.findAll('.discovery-item')[0].trigger('click');
    await flushPromises();

    expect(wrapper.text()).toContain('Rainy Night Cafe');
    expect(wrapper.text()).toContain('暂时无法检查，可重试');
    expect(wrapper.text()).not.toContain('通道检查失败');
  });

  it('reacts to the controlled wallhaven source and emits wallhaven import payload', async () => {
    const wrapper = mountPanel();
    await flushPromises();

    await wrapper.setProps({ source: 'wallhaven' });
    await flushPromises();

    expect(searchWallhavenWallpapers).toHaveBeenCalledWith(
      expect.objectContaining({ page: 1, purity: '100' }),
      authorizedFetch
    );
    expect(wrapper.text()).toContain('动漫壁纸 · x8gxgz');
    expect(wrapper.text()).toContain('3840x2160');
    expect(wrapper.text()).toContain('动漫');
    expect(wrapper.text()).toContain('4.2万浏览');

    await wrapper.find('.discovery-item').trigger('click');
    const importButton = wrapper.findAll('button').find((button) => button.text() === '添加壁纸');
    await importButton.trigger('click');

    const emitted = wrapper.emitted('import-wallhaven');
    expect(emitted).toHaveLength(1);
    expect(emitted[0][0]).toMatchObject({ wallhavenId: 'x8gxgz', visibility: 'PRIVATE' });
  });

  it('submits Workshop tags and complete Wallhaven filters', async () => {
    const wrapper = mountPanel();
    await flushPromises();

    await wrapper.find('[aria-label="Workshop 类型"]').setValue('Scene');
    await wrapper.find('[aria-label="Workshop 风格"]').setValue('Anime');
    await wrapper.find('[aria-label="Workshop 分辨率"]').setValue('1920 x 1080');
    await flushPromises();

    expect(searchWorkshopWallpapers).toHaveBeenLastCalledWith(
      expect.objectContaining({ tags: ['Scene', 'Anime', '1920 x 1080'] }),
      authorizedFetch
    );

    await wrapper.setProps({ source: 'wallhaven' });
    await flushPromises();
    await wrapper.find('[aria-label="轻微敏感分级"]').setValue(true);
    await wrapper.find('[aria-label="Wallhaven 比例"]').setValue('21x9,32x9');
    await wrapper.find('[aria-label="Wallhaven 顺序"]').setValue('asc');
    await flushPromises();

    expect(searchWallhavenWallpapers).toHaveBeenLastCalledWith(
      expect.objectContaining({ purity: '110', ratios: '21x9,32x9', order: 'asc' }),
      authorizedFetch
    );
  });

  it('uses explicit age-rating checkboxes and keeps a safe fallback selected', async () => {
    const wrapper = mountPanel({ source: 'wallhaven' });
    await flushPromises();

    const safe = wrapper.get('[aria-label="安全分级"]');
    const sketchy = wrapper.get('[aria-label="轻微敏感分级"]');
    expect(safe.element.checked).toBe(true);
    expect(sketchy.element.checked).toBe(false);

    await sketchy.setValue(true);
    expect(searchWallhavenWallpapers).toHaveBeenLastCalledWith(
      expect.objectContaining({ purity: '110' }),
      authorizedFetch
    );

    await safe.setValue(false);
    expect(searchWallhavenWallpapers).toHaveBeenLastCalledWith(
      expect.objectContaining({ purity: '010' }),
      authorizedFetch
    );

    await sketchy.setValue(false);
    expect(wrapper.get('[aria-label="安全分级"]').element.checked).toBe(true);
    expect(searchWallhavenWallpapers).toHaveBeenLastCalledWith(
      expect.objectContaining({ purity: '100' }),
      authorizedFetch
    );
  });

  it('gives expanded native options an explicit readable theme surface', () => {
    const source = readFileSync(resolve(process.cwd(), 'src/components/app/WallpaperDiscoveryPanel.vue'), 'utf8');
    const themeSource = readFileSync(resolve(process.cwd(), 'src/styles/theme.css'), 'utf8');

    expect(source).toMatch(/\.filter-control option,[\s\S]*?\.inspector-control option\s*\{[\s\S]*?background:\s*var\(--theme-input-surface\)[^}]*color:\s*var\(--theme-text-primary\)/);
    expect(source).toMatch(/\.filter-control,[\s\S]*?\.inspector-control\s*\{[\s\S]*?color-scheme:\s*var\(--theme-color-scheme/);
    expect(themeSource).toMatch(/:root\s*\{[\s\S]*?--theme-color-scheme:\s*dark/);
    expect(themeSource).toMatch(/:root\[data-theme-mode='day'\]\s*\{[\s\S]*?--theme-color-scheme:\s*light/);
  });

  it('shows accessible download and parsing progress for the active import job', async () => {
    const wrapper = mountPanel({
      importState: {
        lastImportJobId: 9002,
        lastImportJobStatus: 'RUNNING',
        statusBusy: false,
        hint: 'Workshop 导入任务 #9002 正在下载和解析。'
      }
    });
    await flushPromises();
    await wrapper.findAll('.discovery-item')[0].trigger('click');

    const progress = wrapper.get('[role="progressbar"]');
    expect(progress.attributes('aria-valuetext')).toBe('正在下载和解析');
    expect(progress.attributes('aria-busy')).toBe('true');
    expect(wrapper.text()).toContain('正在下载和解析');
  });

  it('falls back through preview candidates and can retry the proxy preview', async () => {
    const wrapper = mountPanel();
    await flushPromises();

    const firstCard = wrapper.findAll('.discovery-item')[0];
    const preview = firstCard.find('img');
    expect(preview.attributes('src')).toBe('/preview/workshop/2141505896');

    await preview.trigger('error');
    await wrapper.vm.$nextTick();
    expect(firstCard.find('img').attributes('src')).toBe('https://img.example/1.jpg');

    await firstCard.find('img').trigger('error');
    await wrapper.vm.$nextTick();
    expect(firstCard.find('.discovery-thumb-empty').exists()).toBe(true);

    await firstCard.find('.preview-retry').trigger('click');
    await wrapper.vm.$nextTick();
    expect(firstCard.find('img').attributes('src')).toBe('/preview/workshop/2141505896');
  });

  it('keeps online discovery available to guests while protecting import actions', async () => {
    const wrapper = mountPanel({ authorizedFetch: null, isAuthenticated: false });
    await flushPromises();

    expect(searchWorkshopWallpapers).toHaveBeenCalledWith(
      expect.objectContaining({ page: 1, sort: 'trend' }),
      null
    );
    expect(wrapper.find('.discovery-item')).toBeTruthy();
    await wrapper.find('.discovery-item').trigger('click');
    await flushPromises();
    expect(wrapper.find('.import-button').attributes('disabled')).toBeDefined();
  });
});
