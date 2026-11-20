import { flushPromises, mount as mountComponent, RouterLinkStub } from '@vue/test-utils';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import MusicVoiceHomeView from './MusicVoiceHomeView.vue';
import * as musicApi from '../../services/musicApi';

const mount = (component, options) => mountComponent(component, {
  ...options,
  global: { stubs: { RouterLink: RouterLinkStub } }
});

const push = vi.fn();
const replace = vi.fn();

vi.mock('vue-router', () => ({
  useRoute: () => ({ query: {}, fullPath: '/music-library/voice' }),
  useRouter: () => ({ push, replace, resolve: (location) => ({ fullPath: JSON.stringify(location.query) }) })
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

  it('combines keyword and tag filters and retains the clear control after facets change', async () => {
    const wrapper = mount(MusicVoiceHomeView);
    await flushPromises();

    await wrapper.get('.tag-chip').trigger('click');
    await flushPromises();
    vi.mocked(musicApi.searchVoiceWorks).mockResolvedValueOnce(
      voicePayload([{ workId: 2, title: 'Matched work', ageCategory: 'general' }])
    );
    await wrapper.get('.voice-search-box input').setValue('school');
    await wrapper.get('form').trigger('submit');
    await flushPromises();

    expect(musicApi.searchVoiceWorks).toHaveBeenLastCalledWith(
      expect.objectContaining({
        q: 'school',
        tagIds: [11]
      }),
      undefined
    );
    expect(wrapper.get('.voice-active-filters [aria-label="移除标签 Campus"]').exists()).toBe(true);
    expect(replace).toHaveBeenLastCalledWith({
      name: 'music-library-voice', query: { q: 'school', voiceTags: '11' }
    });
  });

  it('cancels a previous search and ignores a response that completes out of order', async () => {
    const wrapper = mount(MusicVoiceHomeView);
    await flushPromises();
    let resolveOld;
    vi.mocked(musicApi.searchVoiceWorks).mockImplementationOnce(
      () => new Promise((resolve) => { resolveOld = resolve; })
    );
    vi.mocked(musicApi.searchVoiceWorks).mockResolvedValueOnce(voicePayload([
      { workId: 3, title: 'Newest', ageCategory: 'general' }
    ]));
    await wrapper.get('.voice-search-box input').setValue('slow');
    await wrapper.get('form').trigger('submit');
    const oldSignal = vi.mocked(musicApi.searchVoiceWorks).mock.lastCall[0].signal;
    await wrapper.get('.voice-search-box input').setValue('fast');
    await wrapper.get('form').trigger('submit');
    await flushPromises();
    expect(oldSignal.aborted).toBe(true);
    resolveOld(voicePayload([{ workId: 4, title: 'Stale', ageCategory: 'general' }]));
    await flushPromises();
    expect(wrapper.text()).toContain('Newest');
    expect(wrapper.text()).not.toContain('Stale');
    wrapper.unmount();
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
    scrollHost.dispatchEvent(new Event('scroll'));
    await flushPromises();
    expect(musicApi.searchVoiceWorks).toHaveBeenCalledTimes(2);
    vi.mocked(musicApi.searchVoiceWorks).mockResolvedValueOnce(voicePayload());
    await wrapper.get('.voice-error button').trigger('click');
    await flushPromises();
    expect(musicApi.searchVoiceWorks).toHaveBeenLastCalledWith(
      expect.objectContaining({ page: 3, limit: 10 }), undefined
    );

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
