import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import BackgroundPickerDialog from './BackgroundPickerDialog.vue';

function mountDialog(props = {}) {
  return mount(BackgroundPickerDialog, {
    props: {
      visible: true,
      pickerMode: 'acquire',
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
        workshopSearchQuery: 'city rain',
        workshopUrl: 'https://steamcommunity.com/sharedfiles/filedetails/?id=2141505896',
        workshopVisibility: 'PRIVATE',
        workshopTitle: '',
        lastImportJobId: 9002,
        lastImportJobStatus: 'RUNNING',
        statusBusy: false,
        hint: 'Workshop 导入任务 #9002 正在下载和解析，请稍后查询状态。',
        busy: false
      },
      isAuthenticated: true,
      packageDropActive: false,
      activeBackground: {
        id: 'wp-3001',
        wallpaperId: 3001,
        name: 'Steam 雨夜',
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
      filteredBackgroundItems: [],
      activeBackgroundId: 'wp-3001',
      formatPercent: (value) => `${Math.round(Number(value || 0) * 100)}%`,
      ...props
    }
  });
}

describe('BackgroundPickerDialog wallpaper acquire flow', () => {
  it('shows workshop import status and emits manual job checks', async () => {
    const wrapper = mountDialog();

    expect(wrapper.text()).toContain('Workshop 搜索与导入');
    expect(wrapper.text()).toContain('#9002 RUNNING');
    expect(wrapper.text()).toContain('Workshop 导入任务 #9002 正在下载和解析');

    const statusButton = wrapper.findAll('button').find((button) => button.text() === '查询导入状态');
    expect(statusButton).toBeTruthy();
    await statusButton.trigger('click');

    expect(wrapper.emitted('check-wallpaper-import-job')).toHaveLength(1);
  });

  it('shows owned wallpaper management actions and emits edit/delete events', async () => {
    const wrapper = mountDialog();

    expect(wrapper.text()).toContain('Wallpaper 设置');
    expect(wrapper.text()).toContain('来源：WORKSHOP');
    expect(wrapper.text()).toContain('Workshop ID: 2141505896');
    expect(wrapper.find('input[placeholder="请输入壁纸标题"]').element.value).toBe('Steam 雨夜');

    const saveButton = wrapper.findAll('button').find((button) => button.text() === '保存设置');
    const publicButton = wrapper.findAll('button').find((button) => button.text() === '提交公开');
    const privateButton = wrapper.findAll('button').find((button) => button.text() === '设为私有');
    const deleteButton = wrapper.findAll('button').find((button) => button.text() === '删除壁纸');

    await saveButton.trigger('click');
    await publicButton.trigger('click');
    await privateButton.trigger('click');
    await deleteButton.trigger('click');

    expect(wrapper.emitted('save-active-wallpaper-settings')).toHaveLength(1);
    expect(wrapper.emitted('set-active-wallpaper-visibility')).toEqual([['PUBLIC'], ['PRIVATE']]);
    expect(wrapper.emitted('delete-active-wallpaper')).toHaveLength(1);
  });
});
