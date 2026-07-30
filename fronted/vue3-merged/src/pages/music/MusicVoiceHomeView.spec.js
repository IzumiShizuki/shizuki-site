import { flushPromises, mount } from '@vue/test-utils';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import MusicVoiceHomeView from './MusicVoiceHomeView.vue';
import * as musicApi from '../../services/musicApi';

const push = vi.fn();

vi.mock('vue-router', () => ({
  useRouter: () => ({ push })
}));

vi.mock('../../composables/useAuthSession', () => ({
  useAuthSession: () => ({
    isAuthenticated: { value: false },
    authorizedFetch: vi.fn()
  })
}));

vi.mock('../../services/musicApi', () => ({
  searchVoiceWorks: vi.fn()
}));

function voicePayload(items = [], availableTags = [], hasMore = false) {
  return {
    items,
    availableTags,
    hasMore
  };
}

describe('MusicVoiceHomeView', () => {
  beforeEach(() => {
    vi.clearAllMocks();
    vi.mocked(musicApi.searchVoiceWorks).mockResolvedValue(
      voicePayload(
        [
          {
            workId: 1,
            title: 'Default work',
            ageCategory: '全年齢',
            nsfw: false,
            tags: [{ tagId: 11, name: 'Campus' }]
          }
        ],
        [{ tagId: 11, name: 'Campus' }]
      )
    );
  });

  it('starts a typed keyword search without retaining a stale tag-only filter', async () => {
    const wrapper = mount(MusicVoiceHomeView);
    await flushPromises();

    await wrapper.get('.tag-chip').trigger('click');
    await flushPromises();
    await wrapper.get('.voice-search-box input').setValue('school');
    await wrapper.get('.toolbar-btn').trigger('click');
    await flushPromises();

    expect(musicApi.searchVoiceWorks).toHaveBeenLastCalledWith(
      expect.objectContaining({
        q: 'school',
        tagIds: []
      }),
      undefined
    );
    expect(wrapper.find('.tag-chip.active').exists()).toBe(false);
  });

  it('defaults to general and R15 works and can switch to R18', async () => {
    const wrapper = mount(MusicVoiceHomeView);
    await flushPromises();

    expect(wrapper.get('.age-filter-chip.active').text()).toBe('全年龄 + R15');
    expect(wrapper.get('.voice-age-badge').text()).toBe('全年龄');
    expect(musicApi.searchVoiceWorks).toHaveBeenLastCalledWith(
      expect.objectContaining({
        ageCategories: ['general', 'r15']
      }),
      undefined
    );

    const adultFilter = wrapper.findAll('.age-filter-chip').find((item) => item.text() === 'R18');
    expect(adultFilter).toBeTruthy();
    await adultFilter.trigger('click');
    await flushPromises();

    expect(musicApi.searchVoiceWorks).toHaveBeenLastCalledWith(
      expect.objectContaining({
        ageCategories: ['adult']
      }),
      undefined
    );
  });

  it('retries once when the ASMR upstream times out', async () => {
    vi.mocked(musicApi.searchVoiceWorks)
      .mockRejectedValueOnce({
        problemCode: 'INTERNAL_ERROR',
        detail: 'ASMR upstream timeout',
        body: { music_error_code: 'MUSIC_ASMR_UPSTREAM_TIMEOUT' }
      })
      .mockResolvedValueOnce(
        voicePayload([{ workId: 9, title: 'Recovered work', ageCategory: 'general' }])
      );

    const wrapper = mount(MusicVoiceHomeView);
    await flushPromises();

    expect(musicApi.searchVoiceWorks).toHaveBeenCalledTimes(2);
    expect(wrapper.text()).toContain('Recovered work');
    expect(wrapper.find('.voice-error').exists()).toBe(false);
  });

  it('loads 20 works initially and 10 more after the scroll container passes 75 percent', async () => {
    const initialWorks = Array.from({ length: 20 }, (_, index) => ({
      workId: index + 1,
      title: `Initial ${index + 1}`,
      ageCategory: 'general'
    }));
    const appendedWorks = Array.from({ length: 10 }, (_, index) => ({
      workId: index + 21,
      title: `Appended ${index + 1}`,
      ageCategory: 'general'
    }));
    vi.mocked(musicApi.searchVoiceWorks)
      .mockResolvedValueOnce(voicePayload(initialWorks, [{ tagId: 11, name: 'Campus' }], true))
      .mockResolvedValueOnce(voicePayload(appendedWorks, [{ tagId: 11, name: 'Campus' }], false));

    const scrollHost = document.createElement('div');
    scrollHost.className = 'music-center-pane';
    Object.defineProperty(scrollHost, 'clientHeight', { configurable: true, value: 200 });
    Object.defineProperty(scrollHost, 'scrollHeight', { configurable: true, value: 1000 });
    document.body.appendChild(scrollHost);
    const wrapper = mount(MusicVoiceHomeView, { attachTo: scrollHost });
    await flushPromises();

    expect(musicApi.searchVoiceWorks).toHaveBeenNthCalledWith(
      1,
      expect.objectContaining({ page: 1, limit: 20 }),
      undefined
    );

    scrollHost.scrollTop = 600;
    scrollHost.dispatchEvent(new Event('scroll'));
    await flushPromises();

    expect(musicApi.searchVoiceWorks).toHaveBeenNthCalledWith(
      2,
      expect.objectContaining({ page: 3, limit: 10 }),
      undefined
    );
    expect(wrapper.findAll('.voice-work-card')).toHaveLength(30);

    wrapper.unmount();
    scrollHost.remove();
  });

  it('does not loop automatic loading when an appended request fails', async () => {
    const initialWorks = Array.from({ length: 20 }, (_, index) => ({
      workId: index + 1,
      title: `Initial ${index + 1}`,
      ageCategory: 'general'
    }));
    vi.mocked(musicApi.searchVoiceWorks)
      .mockResolvedValueOnce(voicePayload(initialWorks, [], true))
      .mockRejectedValueOnce(new Error('upstream unavailable'));

    const scrollHost = document.createElement('div');
    scrollHost.className = 'music-center-pane';
    Object.defineProperty(scrollHost, 'clientHeight', { configurable: true, value: 200 });
    Object.defineProperty(scrollHost, 'scrollHeight', { configurable: true, value: 1000 });
    document.body.appendChild(scrollHost);
    const wrapper = mount(MusicVoiceHomeView, { attachTo: scrollHost });
    await flushPromises();

    scrollHost.scrollTop = 600;
    scrollHost.dispatchEvent(new Event('scroll'));
    await flushPromises();

    expect(musicApi.searchVoiceWorks).toHaveBeenCalledTimes(2);
    expect(wrapper.get('.state-text.error').text()).toContain('upstream unavailable');

    wrapper.unmount();
    scrollHost.remove();
  });

  it('collapses age and tag filters independently', async () => {
    const wrapper = mount(MusicVoiceHomeView);
    await flushPromises();

    const ageToggle = wrapper.get('.age-filter-toggle');
    await ageToggle.trigger('click');
    expect(ageToggle.attributes('aria-expanded')).toBe('false');
    expect(wrapper.get('#voice-age-filter-body').attributes('style')).toContain('display: none');

    const tagToggle = wrapper.get('.tag-filter-toggle');
    await tagToggle.trigger('click');
    expect(tagToggle.attributes('aria-expanded')).toBe('false');
    expect(wrapper.get('#voice-tag-filter-body').attributes('style')).toContain('display: none');
  });
});
