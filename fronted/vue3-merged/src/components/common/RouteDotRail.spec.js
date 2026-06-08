import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
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
});
