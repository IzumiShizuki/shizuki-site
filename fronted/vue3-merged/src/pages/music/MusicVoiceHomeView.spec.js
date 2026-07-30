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

function voicePayload(items = [], availableTags = []) {
  return {
    items,
    availableTags,
    hasMore: false
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
});
