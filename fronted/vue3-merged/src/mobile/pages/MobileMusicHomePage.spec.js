import { flushPromises, mount } from '@vue/test-utils';
import { createMemoryHistory, createRouter } from 'vue-router';
import { ref } from 'vue';
import { describe, expect, it, vi } from 'vitest';
import { MOBILE_SHELL_CONTEXT_KEY } from '../mobileShellContext';
import MobileMusicHomePage from './MobileMusicHomePage.vue';

async function renderHome() {
  const Empty = { template: '<div />' };
  const router = createRouter({
    history: createMemoryHistory(),
    routes: [
      { path: '/m/music', component: Empty },
      { path: '/music-library/voice', component: Empty }
    ]
  });
  await router.push('/m/music');
  const shell = {
    auth: { isAuthenticated: ref(false), user: ref(null) },
    library: { sections: ref([]), overviewLoading: ref(false), errorText: ref(''), loadOverview: vi.fn().mockResolvedValue(true) },
    player: { currentTrack: ref({ title: 'Fixture', artist: 'QA' }), currentLyricLine: ref(''), isPlaying: ref(true), togglePlay: vi.fn() },
    openPlayer: vi.fn()
  };
  const wrapper = mount(MobileMusicHomePage, {
    global: { plugins: [router], provide: { [MOBILE_SHELL_CONTEXT_KEY]: shell } }
  });
  return { wrapper, router, shell };
}

describe('mobile music home navigation', () => {
  it('opens the existing voice catalogue without asking playback to change', async () => {
    const { wrapper, router, shell } = await renderHome();
    const link = wrapper.get('a.voice-entry');
    expect(link.text()).toContain('找音声');
    await link.trigger('click');
    await flushPromises();
    expect(router.currentRoute.value.path).toBe('/music-library/voice');
    expect(shell.openPlayer).not.toHaveBeenCalled();
    expect(shell.player.togglePlay).not.toHaveBeenCalled();
    wrapper.unmount();
  });

  it('opens the current player with either keyboard activation key', async () => {
    const { wrapper, shell } = await renderHome();
    const card = wrapper.get('.now-card');
    await card.trigger('keydown', { key: 'Enter' });
    await card.trigger('keydown', { key: ' ' });
    expect(shell.openPlayer).toHaveBeenCalledTimes(2);
    wrapper.unmount();
  });
});
