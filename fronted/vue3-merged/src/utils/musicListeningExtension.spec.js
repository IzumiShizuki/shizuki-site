import { describe, expect, it } from 'vitest';
import {
  normalizeListeningExtensionWork,
  normalizeListeningExtensionWorks,
  normalizeListeningTag
} from './musicListeningExtension';

describe('musicListeningExtension', () => {
  it('normalizes voice tags from camel and snake fields', () => {
    expect(normalizeListeningTag({ tag_id: '12', label: 'ASMR' })).toEqual({
      tagId: 12,
      name: 'ASMR'
    });
  });

  it('normalizes voice works into music extension cards', () => {
    const card = normalizeListeningExtensionWork({
      work_id: '1001',
      title: 'Rain Room',
      circle: 'Studio',
      cover_url: 'https://cdn.example.com/cover.jpg',
      release_date: '2026-01-01',
      dl_count: '42',
      rate_average: '4.6',
      tags: [{ tagId: 1, name: '睡眠' }],
      vas: ['Aoi']
    });

    expect(card).toMatchObject({
      workId: 1001,
      id: 'voice-1001',
      title: 'Rain Room',
      circle: 'Studio',
      cover: 'https://cdn.example.com/cover.jpg',
      tagLine: '睡眠',
      statLine: '2026-01-01 · 销量 42 · 评分 4.6',
      description: '出演：Aoi'
    });
  });

  it('dedupes payload items and applies the requested limit', () => {
    const cards = normalizeListeningExtensionWorks({
      items: [
        { workId: 1, title: 'A' },
        { workId: 1, title: 'A duplicate' },
        { workId: 2, title: 'B' },
        { workId: 3, title: 'C' }
      ]
    }, 2);

    expect(cards.map((item) => item.workId)).toEqual([1, 2]);
  });
});
