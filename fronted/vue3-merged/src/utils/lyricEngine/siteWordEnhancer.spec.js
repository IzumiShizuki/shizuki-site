import { describe, expect, it } from 'vitest';
import { enhanceTimelineWithWords } from './siteWordEnhancer';

const SAMPLE_TTML = `<?xml version="1.0" encoding="utf-8"?>
<tt xmlns="http://www.w3.org/ns/ttml" xmlns:ttm="http://www.w3.org/ns/ttml#metadata">
  <head><metadata/></head>
  <body dur="00:30.000">
    <div>
      <p begin="00:00.500" end="00:02.000"><span begin="00:00.500" end="00:01.000">春</span><span begin="00:01.000" end="00:02.000">风</span></p>
      <p begin="00:03.200" end="00:05.000"><span begin="00:03.200" end="00:04.000">拂</span><span begin="00:04.000" end="00:05.000">面</span></p>
      <p begin="00:06.000" end="00:08.000"><span begin="00:06.000" end="00:07.000">暖</span><span begin="00:07.000" end="00:08.000">意</span></p>
    </div>
  </body>
</tt>`;

function sampleTimeline() {
  return [
    { time: 0.5, original: '春风', translation: '一', furigana: 'harukaze' },
    { time: 3.2, original: '拂面', translation: '二', furigana: 'fumen' },
    { time: 6.0, original: '暖意', translation: '三', furigana: "dan'i" }
  ];
}

describe('siteWordEnhancer.enhanceTimelineWithWords', () => {
  it('attaches per-word timestamps to rows whose timestamps match the TTML lines', () => {
    const timeline = sampleTimeline();
    const result = enhanceTimelineWithWords(timeline, SAMPLE_TTML);

    expect(result).not.toBe(timeline);
    expect(result).toHaveLength(3);
    expect(result[0]).toEqual({
      time: 0.5,
      original: '春风',
      translation: '一',
      furigana: 'harukaze',
      words: [
        { time: 0.5, endTime: 1, text: '春' },
        { time: 1, endTime: 2, text: '风' }
      ]
    });
    expect(result[1].words).toEqual([
      { time: 3.2, endTime: 4, text: '拂' },
      { time: 4, endTime: 5, text: '面' }
    ]);
    expect(result[2].words).toEqual([
      { time: 6, endTime: 7, text: '暖' },
      { time: 7, endTime: 8, text: '意' }
    ]);
  });

  it('matches drifted timestamps within tolerance and leaves far-away rows untouched', () => {
    const timeline = [
      { time: 0.62, original: '春风', translation: '', furigana: '' },
      { time: 3.3, original: '拂面', translation: '', furigana: '' },
      { time: 30, original: '太远', translation: '', furigana: '' }
    ];
    const result = enhanceTimelineWithWords(timeline, SAMPLE_TTML);

    expect(result[0].words).toEqual([
      { time: 0.5, endTime: 1, text: '春' },
      { time: 1, endTime: 2, text: '风' }
    ]);
    expect(result[1].words).toHaveLength(2);
    expect(result[2].words).toBeUndefined();
    expect(result[2]).toBe(timeline[2]);
  });

  it('does not attach words when the line text does not match the AMLL source', () => {
    const timeline = [{ time: 0.5, original: '完全不同的一句词', translation: '', furigana: '' }];
    const result = enhanceTimelineWithWords(timeline, SAMPLE_TTML);

    expect(result).toBe(timeline);
    expect(result[0].words).toBeUndefined();
  });

  it('keeps punctuation/space differences compatible', () => {
    const timeline = [
      { time: 0.5, original: '春 风。', translation: '', furigana: '' }
    ];
    const result = enhanceTimelineWithWords(timeline, SAMPLE_TTML);

    expect(result[0].words).toEqual([
      { time: 0.5, endTime: 1, text: '春' },
      { time: 1, endTime: 2, text: '风' }
    ]);
  });

  it('returns the original timeline reference when the AMLL payload is missing', () => {
    const timeline = sampleTimeline();
    expect(enhanceTimelineWithWords(timeline, null)).toBe(timeline);
    expect(enhanceTimelineWithWords(timeline, undefined)).toBe(timeline);
    expect(enhanceTimelineWithWords(timeline, '')).toBe(timeline);
    expect(enhanceTimelineWithWords(timeline, '   \n ')).toBe(timeline);
  });

  it('returns the original timeline when the payload parses but carries no word data', () => {
    const ttmlWithoutSpans = `<?xml version="1.0" encoding="utf-8"?>
<tt xmlns="http://www.w3.org/ns/ttml">
  <body><div><p begin="00:00.500" end="00:02.000">春風</p></div></body>
</tt>`;
    const timeline = sampleTimeline();
    const result = enhanceTimelineWithWords(timeline, ttmlWithoutSpans);

    expect(result).toBe(timeline);
    expect(timeline[0].words).toBeUndefined();
  });

  it('returns the original timeline for unusable payloads (non-lyric garbage)', () => {
    const timeline = sampleTimeline();
    expect(enhanceTimelineWithWords(timeline, '{"foo":42}')).toBe(timeline);
    expect(enhanceTimelineWithWords(timeline, '<html><body>error</body></html>')).toBe(timeline);
  });

  it('does not mutate the input timeline and never overwrites pre-attached words', () => {
    const preWorded = { time: 0.5, original: '春风', translation: '', furigana: '', words: [{ time: 0, endTime: 1, text: '旧' }] };
    const timeline = [preWorded, { time: 3.2, original: '拂面', translation: '', furigana: '' }];
    const result = enhanceTimelineWithWords(timeline, SAMPLE_TTML);

    expect(timeline[0].words).toEqual([{ time: 0, endTime: 1, text: '旧' }]);
    expect(result[0]).toBe(preWorded);
    expect(result[1].words).toEqual([
      { time: 3.2, endTime: 4, text: '拂' },
      { time: 4, endTime: 5, text: '面' }
    ]);
  });

  it('returns non-array input as-is', () => {
    expect(enhanceTimelineWithWords(null, SAMPLE_TTML)).toBeNull();
    expect(enhanceTimelineWithWords(undefined, SAMPLE_TTML)).toBeUndefined();
    expect(enhanceTimelineWithWords({}, SAMPLE_TTML)).toEqual({});
  });
});
