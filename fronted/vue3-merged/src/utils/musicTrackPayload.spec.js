import { describe, expect, it } from 'vitest';
import { buildPlaylistTrackUpsertPayload } from './musicTrackPayload';

describe('buildPlaylistTrackUpsertPayload', () => {
  it('builds payload with metadata fields', () => {
    const payload = buildPlaylistTrackUpsertPayload(
      {
        trackId: '123',
        provider: 'netease',
        title: 'Song',
        artist: 'Artist',
        cover: 'https://img.example.com/c.jpg',
        audio: 'https://audio.example.com/a.mp3',
        lyric: 'https://lyric.example.com/l.lrc',
        durationSec: 250,
        durationLabel: '04:10',
        album: 'Album A',
        lyricText: '[00:00.00]line'
      },
      {
        fallbackSort: 7,
        playlistCode: 'pl_001',
        activeNav: 'podcast',
        hasActiveSearch: true,
        isPlaylistRoute: false
      }
    );

    expect(payload.trackId).toBe('123');
    expect(payload.provider).toBe('netease');
    expect(payload.sort).toBe(7);
    expect(payload.enabled).toBe(true);
    expect(payload.metadata).toMatchObject({
      album: 'Album A',
      durationSec: 250,
      durationLabel: '04:10',
      provider: 'netease',
      playlistCode: 'pl_001',
      sourceScene: 'search',
      lyricTextAvailable: true,
      coverSource: 'track'
    });
  });

  it('falls back to defaults when optional fields missing', () => {
    const payload = buildPlaylistTrackUpsertPayload(
      {
        id: 'abc',
        title: 'No Meta',
        sort: 3,
        enabled: false
      },
      {
        fallbackSort: 9,
        activeNav: 'recommend'
      }
    );

    expect(payload.trackId).toBe('abc');
    expect(payload.provider).toBe('local');
    expect(payload.sort).toBe(3);
    expect(payload.enabled).toBe(false);
    expect(payload.metadata.provider).toBe('local');
    expect(payload.metadata.sourceScene).toBe('recommend');
    expect(payload.metadata.lyricTextAvailable).toBe(false);
    expect(payload.metadata.coverSource).toBeUndefined();
  });
});
