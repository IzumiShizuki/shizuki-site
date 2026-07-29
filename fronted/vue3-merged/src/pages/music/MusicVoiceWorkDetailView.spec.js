import { flushPromises, mount } from '@vue/test-utils';
import { ref } from 'vue';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import MusicVoiceWorkDetailView from './MusicVoiceWorkDetailView.vue';

const mocked = vi.hoisted(() => ({
  getVoiceWorkBundle: vi.fn(),
  replaceQueueWithTracks: vi.fn(),
  routerPush: vi.fn()
}));

vi.mock('vue-router', () => ({
  useRoute: () => ({ params: { workId: '1610232' } }),
  useRouter: () => ({ push: mocked.routerPush })
}));

vi.mock('../../composables/useAuthSession', () => ({
  useAuthSession: () => ({
    isAuthenticated: ref(true),
    authorizedFetch: vi.fn()
  })
}));

vi.mock('../../composables/musicLibraryContext', () => ({
  useMusicLibraryContext: () => ({
    player: {
      replaceQueueWithTracks: mocked.replaceQueueWithTracks,
      enqueueNextTrack: vi.fn()
    }
  })
}));

vi.mock('../../services/musicApi', () => ({
  getVoiceWorkBundle: (...args) => mocked.getVoiceWorkBundle(...args)
}));

describe('MusicVoiceWorkDetailView', () => {
  beforeEach(() => {
    mocked.getVoiceWorkBundle.mockReset();
    mocked.replaceQueueWithTracks.mockReset();
    mocked.routerPush.mockReset();
    mocked.replaceQueueWithTracks.mockResolvedValue(true);
    mocked.getVoiceWorkBundle.mockResolvedValue({
      work: {
        workId: 1610232,
        title: 'Voice work',
        circle: 'Circle',
        cover: '/cover.webp'
      },
      trackTree: [
        {
          nodeType: 'folder',
          title: 'Main',
          children: [
            {
              nodeType: 'audio',
              title: '01-track.mp3',
              hash: 'audio-hash',
              durationSec: 95
            },
            {
              nodeType: 'image',
              title: 'booklet.webp',
              mediaDownloadUrl: 'https://cdn.example.com/booklet.webp'
            }
          ]
        }
      ],
      playableTracks: [
        {
          trackId: '1610232|audio-hash',
          hash: 'audio-hash',
          title: '01-track.mp3',
          path: 'Main/01-track.mp3',
          durationSec: 95
        }
      ]
    });
  });

  it('plays audio nodes directly from the tree and exposes images as files', async () => {
    const wrapper = mount(MusicVoiceWorkDetailView);
    await flushPromises();

    const playButton = wrapper.get('[aria-label="播放 01-track.mp3"]');
    await playButton.trigger('click');
    await flushPromises();

    expect(mocked.replaceQueueWithTracks).toHaveBeenCalledWith(
      [expect.objectContaining({ trackId: '1610232|audio-hash', title: '01-track.mp3' })],
      0,
      true,
      { sourceType: 'voice-work', sourceCode: '1610232' }
    );

    const imageLink = wrapper.get('[aria-label="查看文件 booklet.webp"]');
    expect(imageLink.attributes('href')).toBe('https://cdn.example.com/booklet.webp');
    expect(imageLink.attributes('target')).toBe('_blank');
  });
});
