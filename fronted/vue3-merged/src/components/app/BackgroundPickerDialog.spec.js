import { mount } from '@vue/test-utils';
import { describe, expect, it, vi } from 'vitest';
import BackgroundPickerDialog from './BackgroundPickerDialog.vue';
import WallpaperDiscoveryPanel from './WallpaperDiscoveryPanel.vue';

function mountDialog(props = {}) {
  return mount(BackgroundPickerDialog, {
    props: {
      visible: true,
      pickerMode: 'select',
      bgTabs: [
        { key: 'all', label: '全部' },
        { key: 'static', label: '静态壁纸' }
      ],
      bgTab: 'all',
      backgroundApplyTarget: 'route',
      currentRouteLabel: '首页',
      currentRouteBackgroundId: '',
      wallpaperLoading: false,
      backgroundEmergencyFallbackUsed: false,
      wallpaperErrorHint: '',
      importState: {
        packageVisibility: 'PRIVATE',
        packageTitle: '',
        packageFile: null,
        workshopUrl: 'https://steamcommunity.com/sharedfiles/filedetails/?id=2141505896',
        workshopVisibility: 'PRIVATE',
        workshopTitle: '',
        lastImportJobId: 9002,
        lastImportJobStatus: 'RUNNING',
        statusBusy: false,
        hint: '导入任务 #9002 正在处理。',
        busy: false
      },
      isAuthenticated: true,
      packageDropActive: false,
      activeBackground: {
        id: 'wp-3001',
        wallpaperId: 3001,
        name: 'Steam 雨夜',
        preview: '/images/rain.jpg',
        src: '/images/rain.jpg',
        type: 'dynamic',
        visibility: 'PRIVATE',
        importSource: 'WORKSHOP',
        workshopItemId: '2141505896'
      },
      canEditActiveWallpaper: true,
      activeCustomSchemaItems: [],
      wallpaperSettingState: {
        title: 'Steam 雨夜',
        masterVolume: 1,
        bgmVolume: 0.8,
        bgvVolume: 0.5,
        bgmEnabled: true,
        bgvEnabled: false,
        bgmAssetIdText: '',
        bgvAssetIdText: '',
        customValues: {},
        saving: false,
        visibilitySaving: false,
        deleting: false,
        error: ''
      },
      filteredBackgroundItems: [
        {
          id: 'wp-3001',
          name: 'Steam 雨夜',
          preview: '/images/rain.jpg',
          src: '/images/rain.jpg',
          type: 'dynamic',
          importSource: 'WORKSHOP'
        }
      ],
      activeBackgroundId: 'wp-3001',
      formatPercent: (value) => `${Math.round(Number(value || 0) * 100)}%`,
      ...props
    }
  });
}

describe('BackgroundPickerDialog unified wallpaper workspace', () => {
  it('renders installed wallpaper cards and the selected detail preview', () => {
    const wrapper = mountDialog();

    expect(wrapper.find('.wallpaper-grid').exists()).toBe(true);
    expect(wrapper.find('.wallpaper-detail img').attributes('src')).toBe('/images/rain.jpg');
    expect(wrapper.text()).toContain('Steam 雨夜');
    expect(wrapper.text()).toContain('动态');
    expect(wrapper.text()).toContain('Workshop');
    expect(wrapper.find('.workspace-tab.active').text()).toBe('我的壁纸');
  });

  it('maps the three workspace tabs onto the existing picker contract and online sources', async () => {
    const wrapper = mountDialog();
    const tabs = wrapper.findAll('.workspace-tab');

    await tabs[1].trigger('click');
    expect(wrapper.emitted('update:pickerMode')).toEqual([['acquire']]);
    await wrapper.setProps({ pickerMode: 'acquire' });
    expect(wrapper.findComponent(WallpaperDiscoveryPanel).props('source')).toBe('wallhaven');
    expect(wrapper.find('.workspace-tab.active').text()).toBe('发现');

    await tabs[2].trigger('click');
    expect(wrapper.findComponent(WallpaperDiscoveryPanel).props('source')).toBe('workshop');
    expect(wrapper.find('.workspace-tab.active').text()).toBe('创意工坊');

    await tabs[0].trigger('click');
    expect(wrapper.emitted('update:pickerMode')).toEqual([['acquire'], ['acquire'], ['select']]);
  });

  it('keeps import status concise and emits manual job checks', async () => {
    const wrapper = mountDialog({ pickerMode: 'acquire' });

    expect(wrapper.text()).toContain('#9002 RUNNING');
    expect(wrapper.text()).toContain('导入任务 #9002 正在处理。');
    expect(wrapper.text()).not.toContain('上传后资源会落到服务器对象存储');

    const statusButton = wrapper.findAll('button').find((button) => button.text() === '查询状态');
    await statusButton.trigger('click');

    expect(wrapper.emitted('check-wallpaper-import-job')).toHaveLength(1);
  });

  it('keeps owned wallpaper settings in the installed detail rail', async () => {
    const wrapper = mountDialog();

    expect(wrapper.find('input[placeholder="壁纸标题"]').element.value).toBe('Steam 雨夜');
    expect(wrapper.text()).toContain('主音量');

    const saveButton = wrapper.findAll('button').find((button) => button.text() === '保存');
    const publicButton = wrapper.findAll('button').find((button) => button.text() === '公开');
    const privateButton = wrapper.findAll('button').find((button) => button.text() === '私有');
    const deleteButton = wrapper.findAll('button').find((button) => button.text() === '删除');

    await saveButton.trigger('click');
    await publicButton.trigger('click');
    await privateButton.trigger('click');
    await deleteButton.trigger('click');

    expect(wrapper.emitted('save-active-wallpaper-settings')).toHaveLength(1);
    expect(wrapper.emitted('set-active-wallpaper-visibility')).toEqual([['PUBLIC'], ['PRIVATE']]);
    expect(wrapper.emitted('delete-active-wallpaper')).toHaveLength(1);
  });

  it('passes authorizedFetch to discovery and relays import events', async () => {
    const authorizedFetch = vi.fn().mockResolvedValue({ items: [], page: 1, has_more: false });
    const wrapper = mountDialog({ pickerMode: 'acquire', authorizedFetch });

    const panel = wrapper.findComponent(WallpaperDiscoveryPanel);
    expect(panel.props('authorizedFetch')).toBe(authorizedFetch);

    panel.vm.$emit('import-workshop', { itemId: '2141505896' });
    panel.vm.$emit('import-wallhaven', { wallhavenId: 'x8gxgz' });
    panel.vm.$emit('select-workshop', { itemId: '2141505896' });

    expect(wrapper.emitted('discovery-import-workshop')).toHaveLength(1);
    expect(wrapper.emitted('discovery-import-wallhaven')).toHaveLength(1);
    expect(wrapper.emitted('discovery-select-workshop')).toHaveLength(1);
  });

  it('opens compact add controls and protects them for guests', async () => {
    const wrapper = mountDialog({ isAuthenticated: false });

    await wrapper.find('.head-action').trigger('click');
    expect(wrapper.text()).toContain('登录后可上传或导入壁纸');
    expect(wrapper.find('.add-wallpaper-grid').exists()).toBe(false);
  });

  it('closes the workspace with Escape without selecting a wallpaper', async () => {
    const wrapper = mountDialog();

    window.dispatchEvent(new KeyboardEvent('keydown', { key: 'Escape' }));
    await wrapper.vm.$nextTick();

    expect(wrapper.emitted('close')).toHaveLength(1);
    expect(wrapper.emitted('select-background')).toBeUndefined();
  });
});
