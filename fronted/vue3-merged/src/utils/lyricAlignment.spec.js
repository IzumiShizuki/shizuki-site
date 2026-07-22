import { describe, expect, it } from 'vitest';
import {
  alignAuxiliaryLyricEntries,
  buildAlignedLyricTimeline,
  resolveClosestLyricRowIndex,
  resolveLyricEdgePadding,
  resolveLyricScrollTop
} from './lyricAlignment';

describe('lyricAlignment', () => {
  it('aligns translated and furigana lines by timestamp without shifting over missing lines', () => {
    const original = [
      { time: 1, text: 'line one', synchronized: true },
      { time: 3, text: 'line two', synchronized: true },
      { time: 5, text: 'line three', synchronized: true }
    ];
    const translation = [
      { time: 1.02, text: '译文一', synchronized: true },
      { time: 5.08, text: '译文三', synchronized: true }
    ];
    const furigana = [
      { time: 0, text: 'metadata', synchronized: true },
      { time: 1, text: 'よみ一', synchronized: true },
      { time: 3, text: 'よみ二', synchronized: true }
    ];

    expect(buildAlignedLyricTimeline(original, translation, furigana)).toEqual([
      { time: 1, original: 'line one', translation: '译文一', furigana: 'よみ一' },
      { time: 3, original: 'line two', translation: '', furigana: 'よみ二' },
      { time: 5, original: 'line three', translation: '译文三', furigana: '' }
    ]);
  });

  it('keeps index alignment only for explicitly unsynchronized plain-text tracks', () => {
    const base = [
      { time: 0, text: 'one', synchronized: false },
      { time: 4, text: 'two', synchronized: false }
    ];
    const plainTranslation = [
      { time: 0, text: '一', synchronized: false },
      { time: 4, text: '二', synchronized: false }
    ];

    expect(alignAuxiliaryLyricEntries(base, plainTranslation)).toEqual(['一', '二']);
  });

  it('uses measured viewport and row sizes to center first and last lyric rows', () => {
    expect(resolveLyricEdgePadding(600, 80)).toBe(260);
    expect(
      resolveLyricScrollTop({
        rowOffsetTop: 260,
        rowHeight: 80,
        containerHeight: 600,
        scrollHeight: 1200
      })
    ).toBe(0);
    expect(
      resolveLyricScrollTop({
        rowOffsetTop: 1120,
        rowHeight: 80,
        containerHeight: 600,
        scrollHeight: 1460
      })
    ).toBe(860);
  });

  it('finds the row whose visual center is closest to the viewport guide', () => {
    const rows = [
      { offsetTop: 120, offsetHeight: 50 },
      { offsetTop: 210, offsetHeight: 80 },
      { offsetTop: 330, offsetHeight: 60 }
    ];

    expect(resolveClosestLyricRowIndex(rows, 255)).toBe(1);
    expect(resolveClosestLyricRowIndex([], 255)).toBe(-1);
  });
});
