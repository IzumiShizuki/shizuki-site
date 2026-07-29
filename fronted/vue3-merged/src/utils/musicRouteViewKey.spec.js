import { describe, expect, it } from 'vitest';
import { resolveMusicCenterViewKey } from './musicRouteViewKey';

describe('resolveMusicCenterViewKey', () => {
  it('keeps the center view mounted when only its query changes', () => {
    expect(
      resolveMusicCenterViewKey({
        name: 'music-library-music',
        fullPath: '/music-library/music?query=first'
      })
    ).toBe('music-library-music');
    expect(
      resolveMusicCenterViewKey({
        name: 'music-library-music',
        fullPath: '/music-library/music?query=second'
      })
    ).toBe('music-library-music');
  });

  it('uses resource identity for playlist and voice work views', () => {
    expect(
      resolveMusicCenterViewKey({
        name: 'music-library-playlist',
        params: { playlistCode: 'favorite' }
      })
    ).toBe('playlist:favorite');
    expect(
      resolveMusicCenterViewKey({
        name: 'music-library-voice-work',
        params: { workId: '1610232' }
      })
    ).toBe('voice-work:1610232');
  });
});
