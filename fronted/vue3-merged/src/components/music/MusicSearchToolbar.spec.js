import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import MusicSearchToolbar from './MusicSearchToolbar.vue';

describe('music search toolbar', () => {
  it('uses a native search form and safely disables submit for a restored null draft', async () => {
    const wrapper = mount(MusicSearchToolbar, { props: { keyword: null } });
    expect(wrapper.get('form').attributes('role')).toBe('search');
    expect(wrapper.get('input').attributes('aria-label')).toBeTruthy();
    expect(wrapper.get('button[type=submit]').element.disabled).toBe(true);
    await wrapper.get('form').trigger('submit');
    expect(wrapper.emitted('search')).toBeUndefined();
    await wrapper.setProps({ keyword: 'QA Query' });
    await wrapper.get('form').trigger('submit');
    expect(wrapper.emitted('search')).toHaveLength(1);
    wrapper.unmount();
  });

  it('distinguishes applied and pending filters and exposes selected options', async () => {
    const wrapper = mount(MusicSearchToolbar, { props: {
      keyword: 'QA Query', type: 'track', draftChanged: true, showActions: true,
      typeOptions: [{ value: 'track', label: '歌曲' }],
      providerOptions: [{ value: 'local', label: '本站' }],
      selectedProviders: ['local']
    } });
    expect(wrapper.get('.toolbar-hint').text()).toContain('筛选尚未应用');
    expect(wrapper.findAll('[aria-pressed=true]')).toHaveLength(2);
    await wrapper.get('button.refresh-btn').trigger('click');
    expect(wrapper.emitted('clear')).toHaveLength(1);
    wrapper.unmount();
  });
});
