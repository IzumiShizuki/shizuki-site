import { mount } from '@vue/test-utils';
import { nextTick } from 'vue';
import { afterEach, describe, expect, it, vi } from 'vitest';
import RouteDotRail from './RouteDotRail.vue';

function mountRail(props = {}) {
  return mount(RouteDotRail, {
    props: {
      items: [
        { key: 'overview', label: '概览', icon: 'fas fa-house' },
        { key: 'journey', label: '经历', icon: 'fas fa-route' },
        { key: '', label: '忽略空 key', icon: 'fas fa-ban' }
      ],
      activeKey: 'journey',
      ...props
    }
  });
}

describe('RouteDotRail', () => {
  afterEach(() => {
    vi.unstubAllGlobals();
  });

  it('normalizes allowed distribution modes and emits selection', async () => {
    const wrapper = mountRail({
      distribution: 'full-sixths'
    });

    expect(wrapper.classes()).toContain('distribution-full-sixths');
    expect(wrapper.findAll('.dot-rail-btn')).toHaveLength(2);
    expect(wrapper.findAll('.dot-rail-btn')[1].classes()).toContain('active');

    await wrapper.findAll('.dot-rail-btn')[0].trigger('click');

    expect(wrapper.emitted('select')).toEqual([['overview']]);
  });

  it('falls back to stack distribution for unknown values', () => {
    const wrapper = mountRail({
      distribution: 'diagonal'
    });

    expect(wrapper.classes()).toContain('distribution-stack');
    expect(wrapper.classes()).not.toContain('distribution-diagonal');
  });

  it('renders grouped menu labels, exposes the active destination and emits selection', async () => {
    const wrapper = mountRail({
      variant: 'menu',
      activeKey: 'settings',
      items: [
        { key: 'overview', label: '网站主页', icon: 'fas fa-house', group: 'site', groupLabel: '公开内容' },
        { key: 'about', label: '关于网站', icon: 'fas fa-compass', group: 'site', groupLabel: '公开内容' },
        { key: 'settings', label: '站点设置', icon: 'fas fa-sliders', group: 'manage', groupLabel: '站点管理' }
      ]
    });

    expect(wrapper.classes()).toContain('variant-menu');
    expect(wrapper.findAll('.route-rail-group')).toHaveLength(2);
    expect(wrapper.findAll('.route-rail-group-label').map((item) => item.text())).toEqual(['公开内容', '站点管理']);
    expect(wrapper.findAll('.route-rail-label').map((item) => item.text())).toEqual(['网站主页', '关于网站', '站点设置']);
    expect(wrapper.findAll('.route-rail-group')[0].attributes('aria-labelledby')).toBe(
      wrapper.findAll('.route-rail-group-label')[0].attributes('id')
    );

    const activeButton = wrapper.get('button[aria-current="page"]');
    expect(activeButton.attributes('aria-label')).toBe('站点设置');
    expect(activeButton.classes()).toContain('active');

    await wrapper.findAll('.dot-rail-btn')[1].trigger('click');
    expect(wrapper.emitted('select')).toEqual([['about']]);
  });

  it('disconnects layout observation without scheduling a reveal after unmount', async () => {
    const observe = vi.fn();
    const disconnect = vi.fn();
    const requestAnimationFrame = vi.fn(() => 1);
    const cancelAnimationFrame = vi.fn();
    vi.stubGlobal(
      'ResizeObserver',
      class {
        observe(...args) {
          observe(...args);
        }

        disconnect() {
          disconnect();
        }
      }
    );
    vi.stubGlobal('requestAnimationFrame', requestAnimationFrame);
    vi.stubGlobal('cancelAnimationFrame', cancelAnimationFrame);

    const wrapper = mountRail({ variant: 'menu' });
    wrapper.unmount();
    await nextTick();

    expect(observe).toHaveBeenCalledTimes(1);
    expect(disconnect).toHaveBeenCalledTimes(1);
    expect(requestAnimationFrame).not.toHaveBeenCalled();
    expect(cancelAnimationFrame).not.toHaveBeenCalled();
  });
});
