import { describe, expect, it } from 'vitest';
import { buildSiteLyricTimeline } from './siteProjection';

describe('siteProjection.buildSiteLyricTimeline', () => {
  it('projects LRC original + timestamped translation + romanization onto the site shape', () => {
    const timeline = buildSiteLyricTimeline({
      lyricText: '[00:01.00]line one\n[00:03.50]line two\n[00:06.00]line three',
      tlyricText: '[00:01.02]一\n[00:03.50]二\n[00:06.10]三',
      romalrcText: '[00:01.00]ichi\n[00:03.50]ni\n[00:06.05]san'
    });

    expect(timeline).toHaveLength(3);
    expect(timeline[0]).toEqual({
      time: 1,
      original: 'line one',
      translation: '一',
      furigana: 'ichi'
    });
    expect(timeline[1]).toEqual({
      time: 3.5,
      original: 'line two',
      translation: '二',
      furigana: 'ni'
    });
    expect(timeline[2]).toEqual({
      time: 6,
      original: 'line three',
      translation: '三',
      furigana: 'san'
    });
  });

  it('sorts multi-timestamp and out-of-order LRC lines by ascending time', () => {
    const timeline = buildSiteLyricTimeline({
      lyricText: '[00:09.00]late\n[00:02.00]early\n[00:02.00][00:05.00]double'
    });

    expect(timeline.map((row) => row.time)).toEqual([2, 2, 5, 9]);
    expect(timeline.map((row) => row.original)).toEqual(['early', 'double', 'double', 'late']);
  });

  it('places untimed plain-text rows after timed rows with incrementing markers', () => {
    const timeline = buildSiteLyricTimeline({
      lyricText: 'plain one\nplain two'
    });

    expect(timeline).toEqual([
      { time: 0, original: 'plain one', translation: '', furigana: '' },
      { time: 4, original: 'plain two', translation: '', furigana: '' }
    ]);
  });

  it('index-aligns plain translation and romanization layers like the legacy pipeline', () => {
    const timeline = buildSiteLyricTimeline({
      lyricText: 'あいう\nかきく',
      tlyricText: '一二\n三四',
      romalrcText: 'aiu\nkakiku'
    });

    expect(timeline).toEqual([
      { time: 0, original: 'あいう', translation: '一二', furigana: 'aiu' },
      { time: 4, original: 'かきく', translation: '三四', furigana: 'kakiku' }
    ]);
  });

  it('restores index alignment when a timed original has a plain translation layer', () => {
    const timeline = buildSiteLyricTimeline({
      lyricText: '[00:01.00]line one\n[00:03.00]line two',
      tlyricText: '一\n二'
    });

    expect(timeline).toEqual([
      { time: 1, original: 'line one', translation: '一', furigana: '' },
      { time: 3, original: 'line two', translation: '二', furigana: '' }
    ]);
  });

  it('unwraps JSON-wrapped payloads before parsing', () => {
    const payload = JSON.stringify({
      lrc: {
        lyric: '[00:05.00]hello\\n[00:07.00]world'
      }
    });
    const timeline = buildSiteLyricTimeline({ lyricText: payload });

    expect(timeline).toEqual([
      { time: 5, original: 'hello', translation: '', furigana: '' },
      { time: 7, original: 'world', translation: '', furigana: '' }
    ]);
  });

  it('parses NetEase YRC word lyrics', () => {
    const timeline = buildSiteLyricTimeline({
      lyricText: '[1000,2000](1000,1000,0)春(2000,1000,0)風'
    });

    expect(timeline).toEqual([
      { time: 1, original: '春風', translation: '', furigana: '' }
    ]);
  });

  it('returns null when there is no lyric content', () => {
    expect(buildSiteLyricTimeline({})).toBeNull();
    expect(buildSiteLyricTimeline({ lyricText: '', tlyricText: '', romalrcText: '' })).toBeNull();
    expect(buildSiteLyricTimeline({ lyricText: '   \n  ' })).toBeNull();
    expect(buildSiteLyricTimeline()).toBeNull();
  });

  it('returns null when input only contains unparseable metadata tags', () => {
    expect(buildSiteLyricTimeline({ lyricText: '[ar:artist]\n[al:album]' })).toBeNull();
  });

  it('keeps unwrappable payloads as plain text lines like the legacy pipeline', () => {
    expect(buildSiteLyricTimeline({ lyricText: '{"foo":42}' })).toEqual([
      { time: 0, original: '{"foo":42}', translation: '', furigana: '' }
    ]);
  });
});
