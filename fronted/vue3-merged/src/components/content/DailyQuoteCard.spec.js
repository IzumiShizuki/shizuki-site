import { flushPromises, mount } from '@vue/test-utils';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { __resetMotionPreferenceForTests } from '../../composables/useMotionPreference';
import DailyQuoteCard from './DailyQuoteCard.vue';

const todayQuote = Object.freeze({
  available: true,
  state: 'current',
  snapshotId: 9,
  localQuoteId: 4,
  effectiveDate: '2026-08-29',
  text: '风经过书页，也经过今天。',
  author: '某位作者',
  sourceTitle: '某本书',
  categoryCode: 'literature',
  providerCode: 'HITOKOTO',
  sourceUrl: 'https://hitokoto.cn/',
  fetchedAt: '2026-08-29T01:05:00Z'
});

function mountCard({ loadToday, loadAlternative } = {}) {
  return mount(DailyQuoteCard, {
    attachTo: document.body,
    props: {
      loadToday: loadToday || vi.fn().mockResolvedValue(todayQuote),
      loadAlternative: loadAlternative || vi.fn()
    }
  });
}

beforeEach(() => {
  __resetMotionPreferenceForTests();
  document.body.innerHTML = '';
});

afterEach(() => {
  document.body.innerHTML = '';
  __resetMotionPreferenceForTests();
});

describe('DailyQuoteCard', () => {
  it('shows stable provenance and uses only the local-alternative loader for 换一句', async () => {
    const loadToday = vi.fn().mockResolvedValue(todayQuote);
    const loadAlternative = vi.fn().mockResolvedValue({
      ...todayQuote,
      state: 'local_alternative',
      localQuoteId: 12,
      text: '另一句经过审核的本地精选。',
      providerCode: 'LOCAL',
      sourceUrl: ''
    });
    const wrapper = mountCard({ loadToday, loadAlternative });
    await flushPromises();
    expect(loadToday).toHaveBeenCalledOnce();
    expect(wrapper.text()).toContain('风经过书页');
    expect(wrapper.text()).toContain('Hitokoto 一言');

    await wrapper.findAll('.widget-actions button')[0].trigger('click');
    await flushPromises();
    expect(loadAlternative).toHaveBeenCalledWith(4, expect.any(AbortSignal));
    expect(loadToday).toHaveBeenCalledOnce();
    expect(wrapper.text()).toContain('另一句经过审核的本地精选');
    expect(wrapper.text()).toContain('本地精选');

    await wrapper.findAll('.widget-actions button')
      .find((button) => button.text().includes('返回今日'))
      .trigger('click');
    await flushPromises();
    expect(loadToday).toHaveBeenCalledTimes(2);
    expect(wrapper.text()).toContain('风经过书页');
    wrapper.unmount();
  });

  it('reveals committed source details and the safe source link in place', async () => {
    const wrapper = mountCard();
    await flushPromises();
    const detailsButton = wrapper.findAll('.widget-actions button')
      .find((button) => button.text().includes('查看来源'));
    await detailsButton.trigger('click');
    await flushPromises();

    expect(wrapper.get('.quote-details').text()).toContain('literature');
    expect(wrapper.get('.quote-details').text()).toContain('Hitokoto 一言');
    expect(wrapper.get('.quote-details a').attributes('href')).toBe('https://hitokoto.cn/');
    wrapper.unmount();
  });

  it('retains today when no local alternative is available', async () => {
    const loadAlternative = vi.fn().mockRejectedValue(new Error('no alternative'));
    const wrapper = mountCard({ loadAlternative });
    await flushPromises();
    await wrapper.findAll('.widget-actions button')[0].trigger('click');
    await flushPromises();

    expect(wrapper.text()).toContain('风经过书页');
    expect(wrapper.text()).toContain('今日一言保持不变');
    wrapper.unmount();
  });

  it('shows an honest empty state without sample quotation text', async () => {
    const wrapper = mountCard({
      loadToday: vi.fn().mockResolvedValue({
        available: false,
        state: 'unavailable',
        text: '',
        providerCode: ''
      })
    });
    await flushPromises();

    expect(wrapper.text()).toContain('一言来源尚未配置');
    expect(wrapper.find('blockquote').exists()).toBe(false);
    expect(wrapper.find('.widget-actions').exists()).toBe(false);
    expect(wrapper.find('.widget-provenance button').exists()).toBe(false);
    expect(wrapper.text()).not.toContain('风经过书页');
    wrapper.unmount();
  });

  it('keeps retry for a transient initial quote failure', async () => {
    const loadToday = vi.fn()
      .mockRejectedValueOnce(new Error('temporary outage'))
      .mockResolvedValueOnce(todayQuote);
    const wrapper = mountCard({ loadToday });
    await flushPromises();

    expect(wrapper.text()).toContain('今日一言读取失败');
    await wrapper.get('.widget-provenance button').trigger('click');
    await flushPromises();
    expect(loadToday).toHaveBeenCalledTimes(2);
    expect(wrapper.text()).toContain('风经过书页');
    wrapper.unmount();
  });
});
