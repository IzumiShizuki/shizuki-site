import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import AuthorAboutOverviewPremium from './AuthorAboutOverviewPremium.vue';

describe('About overview statistics', () => {
  it('keeps skill labels unique without making them interactive controls', () => {
    const wrapper = mount(AuthorAboutOverviewPremium, { props: { skills: ['Vue3', ' vue3 ', 'Java', ''] } });
    expect(wrapper.findAll('.about-skill-chip').map((el) => el.text())).toEqual(['Vue3', 'Java']);
    expect(wrapper.findAll('.about-skill-chip[tabindex]')).toHaveLength(0);
    wrapper.unmount();
  });

  it('renders delayed counts reactively instead of leaving mount-time zeroes', async () => {
    const wrapper = mount(AuthorAboutOverviewPremium, { props: { stats: {} } });
    await wrapper.setProps({ stats: { posts: 12, categories: 3, tags: 4 } });
    expect(wrapper.findAll('.stat-number').map((el) => el.text())).toEqual(['12', '3', '4']);
    wrapper.unmount();
  });

  it('distinguishes missing values from genuine zeroes and isolates instances', async () => {
    const first = mount(AuthorAboutOverviewPremium, { props: { stats: { posts: 0, categories: 0, tags: 0 } } });
    const second = mount(AuthorAboutOverviewPremium);
    expect(first.findAll('.stat-number').map((el) => el.text())).toEqual(['0', '0', '0']);
    expect(second.findAll('.stat-number').map((el) => el.text())).toEqual(['—', '—', '—']);
    await first.setProps({ stats: { posts: 1234, categories: 2, tags: 6 } });
    expect(first.find('.stat-number').text()).toBe('1,234');
    expect(second.find('.stat-number').text()).toBe('—');
    first.unmount();
    second.unmount();
  });

  it('keeps destinations and retry actionable', async () => {
    const portal = { key: 'blog', title: '文章', description: '阅读文章', icon: 'fas fa-book' };
    const wrapper = mount(AuthorAboutOverviewPremium, { props: { portals: [portal], statsError: '部分统计暂时无法加载' } });
    await wrapper.get('.about-portal-link').trigger('click');
    expect(wrapper.emitted('select-portal')[0]).toEqual([portal]);
    await wrapper.get('.stats-retry').trigger('click');
    expect(wrapper.emitted('retry-stats')).toHaveLength(1);
    wrapper.unmount();
  });
});
