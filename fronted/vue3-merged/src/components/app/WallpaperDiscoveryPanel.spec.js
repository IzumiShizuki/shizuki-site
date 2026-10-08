import { flushPromises, mount } from '@vue/test-utils';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import WallpaperDiscoveryPanel from './WallpaperDiscoveryPanel.vue';
import {
  getWallpaperDiscoveryPreviewUrl,
  getWorkshopItemDetail,
  getWallhavenItemDetail,
  searchWallhavenWallpapers,
  searchWorkshopWallpapers
} from '../../services/wallpaperApi';

vi.mock('../../services/wallpaperApi', () => ({
  getWallpaperDiscoveryPreviewUrl: vi.fn((source, itemId) => `/preview/${source}/${itemId}`),
  searchWorkshopWallpapers: vi.fn(),
  searchWallhavenWallpapers: vi.fn(),
  getWorkshopItemDetail: vi.fn(),
  getWallhavenItemDetail: vi.fn(),
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
        lastImportJobProgressStage: '',
        lastImportJobProgressPercent: null,
        statusBusy: false,
        hint: ''
      },
      ...props
    }
  });
}

beforeEach(() => {
  vi.clearAllMocks();
  getWallhavenItemDetail.mockResolvedValue({ title: 'Tokyo · architecture', retry_after_seconds: 0 });
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
        title: 'Robot Dave',
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
  it('shows declared Workshop resolution and explicit unknown values before import', async () => {
    searchWorkshopWallpapers.mockResolvedValueOnce({ items: [
      { item_id: '123456', title: 'Video', resolution: '1920x1080' },
      { item_id: '234567', title: 'Scene', resolution: 'Dynamic Resolution' },
      { item_id: '345678', title: 'Unknown' }
    ], page: 1, has_more: false });
    getWorkshopItemDetail.mockResolvedValueOnce({ resolution: '1920x1080', download_available: true });
    const wrapper = mountPanel();
    await flushPromises();
    expect(wrapper.findAll('.resolution-badge').map((node) => node.text())).toEqual([
      '1920 × 1080', '动态分辨率', '分辨率未提供'
    ]);
    await wrapper.find('.discovery-item').trigger('click');
    await flushPromises();
    expect(wrapper.find('.resolution-notice').text()).toContain('来源于作者标注');
    wrapper.unmount();
  });

  it('replaces legacy Wallhaven ID titles from details without blocking the list', async () => {
    searchWallhavenWallpapers.mockResolvedValueOnce({
      items: [{ id: 'pomle9', title: 'Wallhaven #pomle9' }], page: 1, last_page: 1
    });
    const wrapper = mountPanel({ source: 'wallhaven' });
    await flushPromises();
    expect(getWallhavenItemDetail).toHaveBeenCalledWith('pomle9', authorizedFetch);
    expect(wrapper.find('.item-copy strong').text()).toBe('Tokyo · architecture');
    expect(wrapper.text()).not.toContain('Wallhaven #pomle9');
    wrapper.unmount();
  });

  it('ignores late name details from a previous search and limits parallel enrichment', async () => {
    const pending = [];
    getWallhavenItemDetail.mockImplementation(() => new Promise((resolve) => pending.push(resolve)));
    searchWallhavenWallpapers.mockResolvedValueOnce({
      items: Array.from({ length: 6 }, (_, i) => ({ id: `test0${i}`, title: '未命名壁纸' })),
      page: 1, last_page: 2
    });
    const wrapper = mountPanel({ source: 'wallhaven' });
    await flushPromises();
    expect(pending).toHaveLength(3);
    searchWallhavenWallpapers.mockResolvedValueOnce({ items: [{ id: 'new123', title: 'New artwork' }], page: 2, last_page: 2 });
    await wrapper.vm.runSearch(2);
    pending.forEach((resolve) => resolve({ title: 'Old artwork' }));
    await flushPromises();
    expect(wrapper.find('.item-copy strong').text()).toBe('New artwork');
    expect(getWallhavenItemDetail).toHaveBeenCalledTimes(3);
    wrapper.unmount();
  });

  it('defers throttled names while leaving results usable', async () => {
    vi.useFakeTimers();
    searchWallhavenWallpapers.mockResolvedValueOnce({ items: [{ id: 'pomle9' }], page: 1, last_page: 1 });
    getWallhavenItemDetail.mockResolvedValueOnce({ retry_after_seconds: 61 }).mockResolvedValue({ title: 'Tokyo' });
    const wrapper = mountPanel({ source: 'wallhaven' });
    try {
      await flushPromises();
      expect(wrapper.findAll('.discovery-item')).toHaveLength(1);
      expect(getWallhavenItemDetail).toHaveBeenCalledTimes(1);
      await vi.advanceTimersByTimeAsync(61_000);
      await flushPromises();
      expect(wrapper.find('.item-copy strong').text()).toBe('Tokyo');
    } finally { wrapper.unmount(); vi.useRealTimers(); }
  });
  it('loads workshop results on mount and renders the grid', async () => {
    const wrapper = mountPanel();
    await flushPromises();

    expect(searchWorkshopWallpapers).toHaveBeenCalledWith(
      expect.objectContaining({ page: 1, sort: 'trend' }),
      authorizedFetch,
      { forceRefresh: false }
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
      authorizedFetch,
      { forceRefresh: false }
    );
    expect(wrapper.text()).toContain('Robot Dave');
    expect(wrapper.text()).not.toContain('动漫壁纸 · x8gxgz');
    expect(wrapper.text()).toContain('3840x2160');
    expect(wrapper.text()).toContain('动漫');
    expect(wrapper.text()).toContain('4.2万浏览');

    await wrapper.find('.discovery-item').trigger('click');
    const importButton = wrapper.findAll('button').find((button) => button.text() === '添加壁纸');
    await importButton.trigger('click');

    const emitted = wrapper.emitted('import-wallhaven');
    expect(emitted).toHaveLength(1);
    expect(emitted[0][0]).toMatchObject({ wallhavenId: 'x8gxgz', title: 'Robot Dave', visibility: 'PRIVATE' });

    await wrapper.find('.import-controls input').setValue('我的自定义标题');
    await importButton.trigger('click');
    expect(wrapper.emitted('import-wallhaven')[1][0].title).toBe('我的自定义标题');
  });

  it('submits Workshop tags and complete Wallhaven filters', async () => {
    const wrapper = mountPanel();
    await flushPromises();

    await wrapper.find('[aria-label="Workshop 类型"]').setValue('Scene');
    await wrapper.find('[aria-label="Workshop 风格"]').setValue('Anime');
    await wrapper.find('[aria-label="Workshop 分辨率"]').setValue('1920 x 1080');
    await vi.waitFor(() => expect(searchWorkshopWallpapers).toHaveBeenLastCalledWith(
      expect.objectContaining({ tags: ['Scene', 'Anime', '1920 x 1080'] }),
      authorizedFetch,
      { forceRefresh: false }
    ));

    await wrapper.setProps({ source: 'wallhaven' });
    await flushPromises();
    await wrapper.find('[aria-label="轻微敏感分级"]').setValue(true);
    await wrapper.find('[aria-label="Wallhaven 比例"]').setValue('21x9,32x9');
    await wrapper.find('[aria-label="Wallhaven 顺序"]').setValue('asc');
    await vi.waitFor(() => expect(searchWallhavenWallpapers).toHaveBeenLastCalledWith(
      expect.objectContaining({ purity: '110', ratios: '21x9,32x9', order: 'asc' }),
      authorizedFetch,
      { forceRefresh: false }
    ));
  });

  it('uses explicit age-rating checkboxes and keeps a safe fallback selected', async () => {
    const wrapper = mountPanel({ source: 'wallhaven' });
    await flushPromises();

    const safe = wrapper.get('[aria-label="安全分级"]');
    const sketchy = wrapper.get('[aria-label="轻微敏感分级"]');
    expect(safe.element.checked).toBe(true);
    expect(sketchy.element.checked).toBe(false);

    await sketchy.setValue(true);
    await vi.waitFor(() => expect(searchWallhavenWallpapers).toHaveBeenLastCalledWith(
      expect.objectContaining({ purity: '110' }),
      authorizedFetch,
      { forceRefresh: false }
    ));

    await safe.setValue(false);
    await vi.waitFor(() => expect(searchWallhavenWallpapers).toHaveBeenLastCalledWith(
      expect.objectContaining({ purity: '010' }),
      authorizedFetch,
      { forceRefresh: false }
    ));

    await sketchy.setValue(false);
    expect(wrapper.get('[aria-label="安全分级"]').element.checked).toBe(true);
    await vi.waitFor(() => expect(searchWallhavenWallpapers).toHaveBeenLastCalledWith(
      expect.objectContaining({ purity: '100' }),
      authorizedFetch,
      { forceRefresh: false }
    ));
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
        lastImportJobProgressStage: 'DOWNLOADING',
        lastImportJobProgressPercent: 55,
        statusBusy: false,
        hint: 'Workshop 导入任务 #9002 正在下载资源（55%）。'
      }
    });
    await flushPromises();
    await wrapper.findAll('.discovery-item')[0].trigger('click');

    const progress = wrapper.get('[role="progressbar"]');
    expect(progress.attributes('aria-valuenow')).toBe('55');
    expect(progress.attributes('aria-valuetext')).toBe('正在下载资源');
    expect(progress.attributes('aria-busy')).toBe('true');
    expect(wrapper.text()).toContain('正在下载资源');
    expect(wrapper.text()).toContain('55%');
  });

  it('offers retry only for the failed workshop item and never shows fallback as 100 percent', async () => {
    const wrapper = mountPanel({
      importState: {
        lastImportJobId: 9003,
        lastImportJobSourceType: 'WORKSHOP',
        lastImportJobStatus: 'FALLBACK_REQUIRED',
        lastImportJobProgressStage: 'FALLBACK_REQUIRED',
        lastImportJobProgressPercent: 100,
        lastImportWorkshopItemId: '2141505896',
        lastImportJobFallbackHint: 'Steam Guard validation required'
      }
    });
    await flushPromises();
    await wrapper.findAll('.discovery-item')[0].trigger('click');

    expect(wrapper.find('.import-button').text()).toContain('重试下载');
    const progress = wrapper.get('[role="progressbar"]');
    expect(progress.attributes('aria-valuenow')).toBeUndefined();
    expect(progress.attributes('aria-busy')).toBe('false');
    expect(wrapper.text()).toContain('自动下载未完成');
    expect(wrapper.text()).toContain('Steam Guard validation required');
    await wrapper.find('.import-button').trigger('click');
    expect(wrapper.emitted('import-workshop')?.[0]?.[0]).toMatchObject({ itemId: '2141505896' });

    await wrapper.findAll('.discovery-item')[1].trigger('click');
    expect(wrapper.find('.import-button').text()).toContain('导入壁纸');
  });

  it('exposes an accessible filter disclosure for narrow layouts', async () => {
    const wrapper = mountPanel();
    const toggle = wrapper.get('.filter-disclosure-toggle');
    expect(toggle.attributes('aria-controls')).toBe('wallpaper-filter-controls');
    expect(toggle.attributes('aria-expanded')).toBe('false');
    expect(wrapper.get('#wallpaper-filter-controls').classes()).toContain('is-collapsed');
    await toggle.trigger('click');
    expect(wrapper.get('.filter-disclosure-toggle').attributes('aria-expanded')).toBe('true');
    expect(wrapper.get('#wallpaper-filter-controls').classes()).not.toContain('is-collapsed');
  });

  it('falls back through preview candidates and can retry the proxy preview', async () => {
    const wrapper = mountPanel();
    await flushPromises();

    const firstCard = wrapper.findAll('.discovery-item')[0];
    const preview = firstCard.find('img');
    expect(preview.attributes('src')).toBe('https://img.example/1.jpg');

    await preview.trigger('error');
    await wrapper.vm.$nextTick();
    expect(firstCard.find('img').attributes('src')).toBe('/preview/workshop/2141505896');

    await firstCard.find('img').trigger('error');
    await wrapper.vm.$nextTick();
    expect(firstCard.find('.discovery-thumb-empty').exists()).toBe(true);

    await firstCard.find('.preview-retry').trigger('click');
    await wrapper.vm.$nextTick();
    expect(firstCard.find('img').attributes('src')).toBe('https://img.example/1.jpg');
  });

  it('keeps online discovery available to guests while protecting import actions', async () => {
    const wrapper = mountPanel({ authorizedFetch: null, isAuthenticated: false });
    await flushPromises();

    expect(searchWorkshopWallpapers).toHaveBeenCalledWith(
      expect.objectContaining({ page: 1, sort: 'trend' }),
      null,
      { forceRefresh: false }
    );
    expect(wrapper.find('.discovery-item')).toBeTruthy();
    await wrapper.find('.discovery-item').trigger('click');
    await flushPromises();
    expect(wrapper.find('.import-button').attributes('disabled')).toBeDefined();
  });
});
