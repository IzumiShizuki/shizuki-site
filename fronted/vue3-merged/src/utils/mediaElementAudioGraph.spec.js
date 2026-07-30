import { describe, expect, it } from 'vitest';
import {
  canAttachMediaElementAudioGraph,
  shouldPrepareVisualizerAudioGraph
} from './mediaElementAudioGraph';

const PAGE_URL = 'https://shizuki.example/music';

function mediaElement(src, currentSrc = src) {
  return { src, currentSrc };
}

describe('media element audio graph policy', () => {
  it('rejects cross-origin playback sources that Web Audio would silence', () => {
    expect(
      canAttachMediaElementAudioGraph(
        mediaElement('https://music.example/stream.mp3'),
        PAGE_URL
      )
    ).toBe(false);
    expect(
      canAttachMediaElementAudioGraph(
        mediaElement('https://music.example/new.mp3', '/media/previous.mp3'),
        PAGE_URL
      )
    ).toBe(false);
  });

  it('accepts same-origin, blob, and data playback sources', () => {
    expect(canAttachMediaElementAudioGraph(mediaElement('/media/song.mp3'), PAGE_URL)).toBe(true);
    expect(
      canAttachMediaElementAudioGraph(
        mediaElement('blob:https://shizuki.example/1234'),
        PAGE_URL
      )
    ).toBe(true);
    expect(
      canAttachMediaElementAudioGraph(
        mediaElement('data:audio/wav;base64,UklGRg=='),
        PAGE_URL
      )
    ).toBe(true);
  });

  it('does not attach before a playback source exists', () => {
    expect(canAttachMediaElementAudioGraph(mediaElement('', ''), PAGE_URL)).toBe(false);
  });

  it('prepares a safe graph while playing or handling a gesture on home', () => {
    const sameOriginAudio = mediaElement('/media/song.mp3');

    expect(
      shouldPrepareVisualizerAudioGraph({
        audioElement: sameOriginAudio,
        isPlaying: true,
        visualizerMode: 'bars',
        pageUrl: PAGE_URL
      })
    ).toBe(true);
    expect(
      shouldPrepareVisualizerAudioGraph({
        audioElement: sameOriginAudio,
        isPlaying: false,
        isHomeRoute: true,
        visualizerMode: 'bars',
        pageUrl: PAGE_URL
      })
    ).toBe(true);
    expect(
      shouldPrepareVisualizerAudioGraph({
        audioElement: sameOriginAudio,
        isPlaying: false,
        visualizerMode: 'bars',
        pageUrl: PAGE_URL
      })
    ).toBe(false);
    expect(
      shouldPrepareVisualizerAudioGraph({
        audioElement: sameOriginAudio,
        isPlaying: true,
        visualizerMode: 'none',
        pageUrl: PAGE_URL
      })
    ).toBe(false);
  });
});
