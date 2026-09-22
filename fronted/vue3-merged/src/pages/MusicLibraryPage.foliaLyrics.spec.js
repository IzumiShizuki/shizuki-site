import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

const bridgeSource = readFileSync(
  resolve(process.cwd(), '../../third_party/folia-major/shizukiExternalBridge.ts'),
  'utf8'
);

function readFunction(name) {
  const start = bridgeSource.indexOf(`function ${name}`);
  const next = bridgeSource.indexOf('\nfunction ', start + 1);
  return bridgeSource.slice(start, next < 0 ? bridgeSource.length : next);
}

describe('Folia followed lyric projection', () => {
  it('keeps an unchanged lyric timeline mounted across clock snapshots', () => {
    const applyFollowSession = readFunction('applyFollowSession');

    expect(bridgeSource).toContain('latestFollowLyricsFingerprint');
    expect(bridgeSource).toContain('buildFollowLyricsFingerprint');
    expect(applyFollowSession).toContain('lyricsFingerprint !== latestFollowLyricsFingerprint');
    expect(applyFollowSession).toContain('store.setLyricsState(lyrics)');
    expect(applyFollowSession.indexOf('const lyrics = buildFollowLyrics'))
      .toBeGreaterThan(applyFollowSession.indexOf('lyricsFingerprint !== latestFollowLyricsFingerprint'));
  });

  it('lets the projected clock commit the active line exactly once per snapshot', () => {
    const applyFollowSession = readFunction('applyFollowSession');
    const writeFollowClock = readFunction('writeFollowClock');

    expect(applyFollowSession).not.toContain('store.setCurrentLineIndex(session.lyricIndex)');
    expect(applyFollowSession).toContain('syncFollowClock(session.positionMs, session.playing)');
    expect(writeFollowClock).toContain('findLatestActiveLineIndex(lines, safePosition)');
    expect(writeFollowClock.match(/setCurrentLineIndex\(/g)).toHaveLength(1);
  });

  it('keeps expanded-workspace long lyrics inside the embed width', () => {
    const contentScale = readFunction('resolveEmbedLyricContentScale');
    const syncSizing = readFunction('syncEmbedLyricSizing');

    expect(contentScale).toContain('preferredScale: number');
    expect(contentScale).toContain('getEmbedLyricWeightedGraphemeWidth(text)');
    expect(contentScale).toContain('EMBED_LYRIC_ACTIVE_WORD_TRANSFORM_SAFETY');
    expect(contentScale).toContain('safePreferredScale');
    expect(contentScale).not.toContain('foliaExpanded');
    expect(syncSizing).toContain('resolveEmbedLyricContentScale(root, preferredScale)');
  });
});
