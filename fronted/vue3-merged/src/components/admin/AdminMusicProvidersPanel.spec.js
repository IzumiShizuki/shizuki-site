import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import AdminMusicProvidersPanel from './AdminMusicProvidersPanel.vue';

function mountPanel(props = {}) {
  return mount(AdminMusicProvidersPanel, {
    props: {
      items: [
        { provider: 'meting', enabled: true, visible: true, sort: 10 },
        { provider: 'spotify', enabled: true, visible: true, sort: 20 },
        { provider: 'asmr', enabled: true, visible: false, sort: 30 }
      ],
      ...props
    }
  });
}

describe('AdminMusicProvidersPanel', () => {
  it('renders provider rows with states', () => {
    const wrapper = mountPanel();

    expect(wrapper.text()).toContain('音乐源管理');
    expect(wrapper.text()).toContain('Meting 聚合');
    expect(wrapper.text()).toContain('音声 · ASMR');
    expect(wrapper.text()).toContain('music.asmr.access');
    expect(wrapper.text()).toContain('前台隐藏');
  });

  it('emits visible patch when toggling asmr visibility', async () => {
    const wrapper = mountPanel();

    await wrapper.find('button[data-action="toggle-visible"][data-provider="asmr"]').trigger('click');
    const events = wrapper.emitted('update');
    expect(events).toBeTruthy();
    expect(events[0][0]).toEqual({
      provider: 'asmr',
      patch: {
        visible: true
      }
    });
  });

  it('emits enabled patch when toggling enabled state', async () => {
    const wrapper = mountPanel();

    await wrapper.find('button[data-action="toggle-enabled"][data-provider="meting"]').trigger('click');
    const events = wrapper.emitted('update');
    expect(events).toBeTruthy();
    expect(events[0][0]).toEqual({
      provider: 'meting',
      patch: {
        enabled: false
      }
    });
  });

  it('disables visibility toggle for disabled providers', () => {
    const wrapper = mountPanel({
      items: [{ provider: 'asmr', enabled: false, visible: false, sort: 30 }]
    });

    expect(
      wrapper.find('button[data-action="toggle-visible"][data-provider="asmr"]').attributes('disabled')
    ).toBeDefined();
  });

  it('disables buttons while the provider is saving', () => {
    const wrapper = mountPanel({
      savingProvider: 'asmr'
    });

    expect(
      wrapper.find('button[data-action="toggle-enabled"][data-provider="asmr"]').attributes('disabled')
    ).toBeDefined();
    expect(wrapper.text()).toContain('保存中...');
  });

  it('shows empty tip when there is no provider row', () => {
    const wrapper = mountPanel({
      items: []
    });

    expect(wrapper.text()).toContain('暂无音乐源配置');
  });
});
