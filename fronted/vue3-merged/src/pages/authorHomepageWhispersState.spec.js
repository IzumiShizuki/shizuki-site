import { describe, expect, it } from 'vitest';
import { AUTHOR_HOME_WHISPER_SEEDS, buildAuthorHomepageWhisperPool } from './authorHomepageWhispersState';

describe('authorHomepageWhispersState', () => {
  it('keeps only published public whispers and fills the pool with seeds', () => {
    const items = buildAuthorHomepageWhisperPool([
      {
        whisper_id: 1,
        status: 'published',
        content: '公开悄悄话',
        nickname: 'guest-a',
        created_at: '2026-06-15T12:00:00Z'
      },
      {
        whisper_id: 2,
        status: 'created',
        content: 'private whisper',
        nickname: 'guest-b'
      }
    ]);

    expect(items).toHaveLength(10);
    expect(items[0]).toEqual({
      whisperId: 1,
      status: 'PUBLISHED',
      content: '公开悄悄话',
      nickname: 'guest-a',
      createdAt: '2026-06-15T12:00:00Z'
    });
    expect(items[1].content).toBe(AUTHOR_HOME_WHISPER_SEEDS[0]);
  });

  it('deduplicates by content and respects the limit', () => {
    const items = buildAuthorHomepageWhisperPool(
      [
        { whisperId: 1, status: 'PUBLISHED', content: 'same text', nickname: 'a' },
        { whisperId: 2, status: 'PUBLISHED', content: 'same text', nickname: 'b' },
        { whisperId: 3, status: 'PUBLISHED', content: 'another text', nickname: 'c' }
      ],
      2
    );

    expect(items).toHaveLength(2);
    expect(items.map((item) => item.content)).toEqual(['same text', 'another text']);
  });
});
