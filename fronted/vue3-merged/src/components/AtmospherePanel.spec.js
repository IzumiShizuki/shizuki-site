import { flushPromises, mount } from '@vue/test-utils';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import AtmospherePanel from './AtmospherePanel.vue';
import { searchAmbientLibrary } from '../services/ambientLibraryApi';

vi.mock('../services/ambientLibraryApi', () => ({
  buildAmbientAttribution: (track) => (track?.attributionRequired ? `by ${track.author}` : ''),
  searchAmbientLibrary: vi.fn()
}));

function mountPanel(props = {}) {
  return mount(AtmospherePanel, {
    props: {
      visible: true,
      activeTab: 'online',
      ambientState: {
        ambient: { masterVolume: 0.65, tracks: [], presets: [] }
      },
      onlineLibraryChecked: true,
      onlineLibraryEnabled: false,
      ...props
    }
  });
}

async function searchForRain(wrapper) {
  await wrapper.get('input[type="search"]').setValue('rain');
  const searchButton = wrapper.findAll('button').find((button) => button.text() === '搜索');
  expect(searchButton).toBeTruthy();
  await searchButton.trigger('click');
  await flushPromises();
}

describe('AtmospherePanel online ambient library', () => {
  beforeEach(() => {
    searchAmbientLibrary.mockReset();
    searchAmbientLibrary.mockResolvedValue({
      items: [
        {
          soundId: '42001',
          trackId: 'freesound:42001',
          title: 'Rain on a quiet window',
          author: 'field-recorder',
          previewUrl: 'https://cdn.freesound.org/previews/42/42001-hq.mp3',
          license: 'cc0',
          licenseName: 'CC0 公有领域',
          attributionRequired: false,
          pageUrl: 'https://freesound.org/s/42001/',
          duration: 90
        }
      ],
      total: 1,
      pageNo: 1,
      pageSize: 24
    });
  });

  it('keeps the online entry visible when the provider is not configured', () => {
    const wrapper = mountPanel();

    expect(wrapper.findAll('.atmo-tab').map((tab) => tab.text())).toContain('在线音源');
    expect(wrapper.text()).toContain('MUSIC_FREESOUND_API_KEY');
    expect(wrapper.get('input[type="search"]').attributes('disabled')).toBeDefined();
  });

  it('asks guests to sign in instead of pretending to add a temporary preview', async () => {
    const wrapper = mountPanel({ onlineLibraryEnabled: true, isAuthenticated: false });
    await searchForRain(wrapper);

    const saveButton = wrapper.findAll('button').find((button) => button.text() === '登录后保存');
    expect(saveButton).toBeTruthy();
    await saveButton.trigger('click');

    expect(wrapper.emitted('request-auth')).toHaveLength(1);
    expect(wrapper.emitted('import-remote-track')).toBeUndefined();
  });

  it('emits a durable import request for authenticated users', async () => {
    const wrapper = mountPanel({ onlineLibraryEnabled: true, isAuthenticated: true });
    await searchForRain(wrapper);

    const saveButton = wrapper.findAll('button').find((button) => button.text() === '保存并播放');
    expect(saveButton).toBeTruthy();
    await saveButton.trigger('click');

    expect(wrapper.emitted('import-remote-track')).toEqual([
      [expect.objectContaining({ soundId: '42001', trackId: 'freesound:42001' })]
    ]);
  });

  it('offers to reactivate an imported sound that is currently absent from the mix', async () => {
    const wrapper = mountPanel({
      onlineLibraryEnabled: true,
      isAuthenticated: true,
      onlineImportState: { 42001: { status: 'done', assetId: 88 } }
    });
    await searchForRain(wrapper);

    const saveButton = wrapper.findAll('button').find((button) => button.text() === '重新加入播放');
    expect(saveButton).toBeTruthy();
    await saveButton.trigger('click');

    expect(wrapper.emitted('import-remote-track')).toHaveLength(1);
  });

  it('keeps source and attribution actions on a persisted CC-BY asset', async () => {
    const wrapper = mountPanel({
      activeTab: 'ambient',
      ambientLibrary: [
        {
          id: 'asset:88',
          trackId: 'asset:88',
          label: 'Forest Rain',
          title: 'Forest Rain',
          description: '来自 Freesound',
          category: 'upload',
          categoryLabel: '在线音源',
          source: 'asset',
          sourceProvider: 'freesound',
          author: 'field-recorder',
          license: 'by',
          licenseName: 'CC-BY 需署名',
          attributionRequired: true,
          pageUrl: 'https://freesound.org/s/42001/',
          icon: 'fas fa-wave-square'
        }
      ]
    });

    expect(wrapper.get('a[href="https://freesound.org/s/42001/"]').text()).toContain('来源');
    expect(wrapper.findAll('button').some((button) => button.text() === '复制署名')).toBe(true);
  });
});
