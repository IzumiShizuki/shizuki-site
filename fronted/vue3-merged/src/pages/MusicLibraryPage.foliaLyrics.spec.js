import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

const bridgeSource = readFileSync(
  resolve(process.cwd(), '../../third_party/folia-major/shizukiExternalBridge.ts'),
  'utf8'
);
const cadenzaSource = readFileSync(
  resolve(process.cwd(), '../../third_party/folia-major/src/components/visualizer/cadenza/VisualizerCadenza.tsx'),
  'utf8'
);
const classicSource = readFileSync(
  resolve(process.cwd(), '../../third_party/folia-major/src/components/visualizer/classic/Visualizer.tsx'),
  'utf8'
);
const partitaSource = readFileSync(
  resolve(process.cwd(), '../../third_party/folia-major/src/components/visualizer/partita/VisualizerPartita.tsx'),
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
    expect(writeFollowClock).toContain('scheduleEmbedLyricSizingAudit()');
    expect(writeFollowClock.indexOf('scheduleEmbedLyricSizingAudit()'))
      .toBeGreaterThan(writeFollowClock.indexOf('store.setCurrentLineIndex(index)'));
  });

  it('keeps expanded-workspace long lyrics inside the embed width', () => {
    const contentScale = readFunction('resolveEmbedLyricContentScale');
    const syncSizing = readFunction('syncEmbedLyricSizing');
    const sizingAudit = readFunction('scheduleEmbedLyricSizingAudit');
    const horizontalOffset = readFunction('resolveEmbedLyricHorizontalOffset');
    const horizontalCorrection = readFunction('syncEmbedLyricHorizontalCorrection');
    const restoreHorizontalCorrection = readFunction('restoreEmbedLyricHorizontalCorrection');

    expect(contentScale).toContain('preferredScale: number');
    expect(contentScale).toContain('currentScale: number');
    expect(contentScale).toContain('getEmbedLyricWeightedGraphemeWidth(text)');
    expect(contentScale).toContain('EMBED_LYRIC_ACTIVE_WORD_TRANSFORM_SAFETY');
    expect(contentScale).toContain('safePreferredScale');
    expect(contentScale).toContain('measureEmbedActiveLyricBounds(root, activeLine)');
    expect(contentScale).toContain('renderedBounds.layoutWidth');
    expect(contentScale).toContain('isEmbedLyricGeometryStable(activeLine, renderedBounds)');
    expect(contentScale).toContain('EMBED_LYRIC_ACTIVE_WORD_TRANSFORM_SAFETY');
    expect(contentScale).toContain('return Math.max(layoutScale, visualScale)');
    expect(contentScale).toContain('const widthScale = availableTextWidth / renderedBounds.width');
    expect(contentScale).not.toContain('availableHalfWidth');
    expect(contentScale).not.toContain('positionScale');
    expect(contentScale).toContain('maximumGrowth');
    expect(contentScale).toContain('EMBED_LYRIC_PRIMARY_FONT_SCALE');
    expect(contentScale).not.toContain('foliaExpanded');
    expect(bridgeSource).not.toContain('MIN_EMBED_LYRIC_SCALE');
    expect(syncSizing).toContain('resolveEmbedLyricContentScale(root, preferredScale, currentScale)');
    expect(syncSizing).not.toContain('requestAnimationFrame');
    expect(sizingAudit).toContain('frameCount = 90');
    expect(sizingAudit).toContain('if (embedLyricSizingAuditFrame) return;');
    expect(sizingAudit).toContain('embedLyricSizingAuditFrames = Math.max(');
    expect(sizingAudit).toContain('embedLyricSizingAuditFrame = 0;');
    expect(sizingAudit).toContain('window.requestAnimationFrame(run)');
    expect(cadenzaSource).toContain("outer.dataset.shizukiFoliaActiveLyricWord = 'true'");
    expect(classicSource).toContain('data-shizuki-folia-active-lyric-word="true"');
    expect(partitaSource).toContain('data-shizuki-folia-active-lyric-word="true"');
    expect(classicSource).toContain('data-shizuki-folia-lyric-line={String(activeLine.startTime)}');
    expect(partitaSource).toContain('data-shizuki-folia-lyric-line={String(activeLine.startTime)}');
    expect(bridgeSource).toContain(".find((element) => element.dataset.shizukiFoliaLyricLine === lineKey) ?? null");
    expect(bridgeSource).toContain('EMBED_LYRIC_STABLE_GEOMETRY_FRAMES = 4');
    expect(bridgeSource).toContain('embedLyricGeometryCommittedLineKey = lineKey');
    expect(horizontalOffset).toContain('const minimumOffset = safeLeft - bounds.left');
    expect(horizontalOffset).toContain('const maximumOffset = safeRight - bounds.right');
    expect(horizontalOffset).toContain('Math.min(maximumOffset, Math.max(minimumOffset, 0))');
    expect(horizontalOffset).toContain('((safeLeft + safeRight) - (bounds.left + bounds.right)) / 2');
    expect(horizontalCorrection).toContain('renderedBounds.left - appliedOffset');
    expect(horizontalCorrection).toContain('renderedBounds.right - appliedOffset');
    expect(horizontalCorrection).toContain("scope.style.setProperty('translate'");
    expect(horizontalCorrection).not.toContain('style.transform');
    expect(restoreHorizontalCorrection).toContain("style.removeProperty('translate')");
    expect(syncSizing).toContain('restoreEmbedLyricHorizontalCorrection()');
    expect(syncSizing).toContain('resetEmbedLyricGeometry()');
    expect(syncSizing).toContain('syncEmbedLyricHorizontalCorrection(root, activeLine)');
  });
});
