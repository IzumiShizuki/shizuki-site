import { describe, expect, it } from 'vitest';
import { buildCollectPlaylistTargets } from './musicCollectTargets';

describe('buildCollectPlaylistTargets', () => {
  it('merges created and collected playlists, deduplicates and excludes default_public', () => {
    const created = [
      { playlistCode: 'upl_a', name: 'A' },
      { playlistCode: 'default_public', name: 'Default' }
    ];
    const collected = [
      { playlist_code: 'upl_b', name: 'B' },
      { playlistCode: 'upl_a', name: 'A2' }
    ];

    const targets = buildCollectPlaylistTargets(created, collected);
    expect(targets.map((item) => item.playlistCode)).toEqual(['upl_a', 'upl_b']);
  });

  it('supports custom excluded codes', () => {
    const created = [{ playlistCode: 'x1' }, { playlistCode: 'x2' }];
    const targets = buildCollectPlaylistTargets(created, [], { excludedCodes: ['x2'] });
    expect(targets.map((item) => item.playlistCode)).toEqual(['x1']);
  });
});

