import { describe, expect, it } from 'vitest';
import {
  enrichSearchPlaylists,
  readDurationLabel,
  readPositiveDurationSec
} from './musicSearchMetadata';

describe('musicSearchMetadata', () => {
  it('does not turn missing or zero duration into a valid 00:00 value', () => {
    expect(readPositiveDurationSec({ duration_sec: null })).toBeNull();
    expect(readPositiveDurationSec({ durationSec: '' })).toBeNull();
    expect(readPositiveDurationSec({ durationSec: 0 })).toBeNull();
    expect(readPositiveDurationSec({ metadata: { durationSec: 245 } })).toBe(245);
  });

  it('preserves an upstream duration label when seconds are unavailable', () => {
    expect(readDurationLabel({ duration_label: '04:05' })).toBe('04:05');
    expect(readDurationLabel({ duration: '--:--' })).toBe('--:--');
  });

  it('hydrates a virtual playlist cover without inventing a total track count', () => {
    const result = enrichSearchPlaylists(
      [{ playlistCode: 'virtual-net', sourceProvider: 'netease', cover: '', trackCount: 0 }],
      [
        { provider: 'netease', cover: 'https://cdn.example/one.jpg' },
        { provider: 'netease', cover: 'https://cdn.example/two.jpg' }
      ]
    );

    expect(result[0]).toMatchObject({
      cover: 'https://cdn.example/one.jpg',
      trackCount: 0
    });
  });
});
