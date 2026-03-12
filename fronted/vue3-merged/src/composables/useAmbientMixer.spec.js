import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { __resetAmbientMixerForTest, createAmbientMixerEngine } from './useAmbientMixer';

function createFakeAudioElement(playMock) {
  return {
    src: '',
    loop: false,
    preload: 'auto',
    crossOrigin: 'anonymous',
    play: playMock,
    pause: vi.fn(),
    load: vi.fn()
  };
}

function createFakeContext() {
  const destination = {
    connect: vi.fn(),
    disconnect: vi.fn()
  };
  const gainNodes = [];
  const context = {
    state: 'running',
    sampleRate: 44100,
    currentTime: 0,
    destination,
    gainNodes,
    createGain() {
      const gain = {
        value: 1,
        cancelScheduledValues: vi.fn(),
        setValueAtTime: vi.fn((value) => {
          gain.value = value;
        }),
        linearRampToValueAtTime: vi.fn((value) => {
          gain.value = value;
        })
      };
      const node = {
        gain,
        connect: vi.fn(),
        disconnect: vi.fn()
      };
      gainNodes.push(node);
      return node;
    },
    createBuffer(channels, length) {
      const data = Array.from({ length: channels }, () => new Float32Array(length));
      return {
        getChannelData(index) {
          return data[index];
        }
      };
    },
    createBufferSource() {
      return {
        loop: false,
        buffer: null,
        connect: vi.fn(),
        disconnect: vi.fn(),
        start: vi.fn(),
        stop: vi.fn()
      };
    },
    createMediaElementSource(audio) {
      return {
        audio,
        connect: vi.fn(),
        disconnect: vi.fn()
      };
    },
    resume: vi.fn(async () => {
      context.state = 'running';
    }),
    suspend: vi.fn(async () => {
      context.state = 'suspended';
    }),
    close: vi.fn(async () => {
      context.state = 'closed';
    })
  };
  return context;
}

describe('useAmbientMixer', () => {
  beforeEach(async () => {
    await __resetAmbientMixerForTest();
  });

  afterEach(async () => {
    await __resetAmbientMixerForTest();
  });

  it('deduplicates tracks and updates master volume across runtimes', async () => {
    const fakeContext = createFakeContext();
    const mixer = createAmbientMixerEngine({
      createAudioContext: () => fakeContext,
      createAudioElement: () => createFakeAudioElement(vi.fn().mockResolvedValue(undefined))
    });

    await mixer.setTracks([
      { trackId: 'rain', kind: 'media', audioUrl: '/ambient/rain.wav', volume: 0.5 },
      { trackId: 'rain', kind: 'media', audioUrl: '/ambient/rain-v2.wav', volume: 0.8 },
      { trackId: 'white', kind: 'noise', noiseType: 'white', volume: 0.4 }
    ]);

    expect(mixer.activeTrackIds.value).toEqual(['rain', 'white']);

    mixer.setMasterVolume(0.24);
    expect(mixer.masterVolume.value).toBe(0.24);
    expect(fakeContext.gainNodes[0].gain.value).toBe(0.24);
  });

  it('removes stale runtimes when track list changes', async () => {
    const fakeContext = createFakeContext();
    const mixer = createAmbientMixerEngine({
      createAudioContext: () => fakeContext,
      createAudioElement: () => createFakeAudioElement(vi.fn().mockResolvedValue(undefined))
    });

    await mixer.setTracks([{ trackId: 'wind', kind: 'media', audioUrl: '/ambient/wind.wav', volume: 0.7 }]);
    expect(mixer.activeTrackIds.value).toEqual(['wind']);

    await mixer.setTracks([]);
    expect(mixer.activeTrackIds.value).toEqual([]);
  });

  it('marks when user gesture is needed and clears after resume', async () => {
    const fakeContext = createFakeContext();
    const playMock = vi
      .fn()
      .mockRejectedValueOnce(new Error('autoplay blocked'))
      .mockResolvedValue(undefined);

    const mixer = createAmbientMixerEngine({
      createAudioContext: () => fakeContext,
      createAudioElement: () => createFakeAudioElement(playMock)
    });

    await mixer.setTracks([{ trackId: 'forest', kind: 'media', audioUrl: '/ambient/forest.wav', volume: 0.5 }]);
    expect(mixer.needsUserGesture.value).toBe(true);

    await mixer.resumeFromGesture();
    expect(playMock).toHaveBeenCalledTimes(2);
    expect(mixer.needsUserGesture.value).toBe(false);
  });
});
