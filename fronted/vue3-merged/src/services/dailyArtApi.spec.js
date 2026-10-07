import { describe, expect, it, vi } from 'vitest';
import { createDailyArtApi, normalizeDailyContent, normalizeDailySettings, parsePixivUserId, shanghaiDate } from './dailyArtApi';

describe('daily art API', () => {
  it('accepts numeric IDs and localized Pixiv profiles but rejects unrelated hosts', () => {
    expect(parsePixivUserId('https://www.pixiv.net/en/users/12345/artworks')).toBe('12345');
    expect(parsePixivUserId(' 12345 ')).toBe('12345');
    expect(parsePixivUserId('https://www.pixiv.net.evil.test/users/123')).toBe('');
    expect(parsePixivUserId('https://www.pixiv.net/artworks/123')).toBe('');
    expect(parsePixivUserId('0')).toBe('');
  });

  it('changes date at Shanghai midnight regardless of client timezone', () => {
    expect(shanghaiDate(new Date('2026-10-07T15:59:59Z'))).toBe('2026-10-07');
    expect(shanghaiDate(new Date('2026-10-07T16:00:00Z'))).toBe('2026-10-08');
  });

  it('rebuilds trusted artwork destinations and drops any secret in settings responses', () => {
    const settings = normalizeDailySettings({ connected: true, account_id: '42', session_cipher: 'should-never-appear' });
    expect(JSON.stringify(settings)).not.toContain('should-never-appear');
    const content = normalizeDailyContent({ date: '2026-10-07', recommendation_state: 'ready', artworks: [
      { id: '123', artist_id: '42', title: '作品', image_url: 'https://evil.test/image', source_url: 'javascript:alert(1)' },
      { id: 'bad' }
    ] });
    expect(content.artworks).toHaveLength(1);
    expect(content.artworks[0].imageUrl).toBe('/api/v1/daily-art/pixiv/artworks/123/preview');
    expect(content.artworks[0].sourceUrl).toBe('https://www.pixiv.net/artworks/123');
  });

  it('pins requests to the initiating website user and sends credentials only in the connection body', async () => {
    const fetch = vi.fn().mockResolvedValue({ data: { connected: true, account_id: '42' } });
    await createDailyArtApi(fetch, 7).connect('42', '42_abcdefghijklmnop');
    expect(fetch).toHaveBeenCalledWith('/api/v1/me/daily-art/pixiv', expect.objectContaining({
      method: 'PUT', body: { accountId: '42', session: '42_abcdefghijklmnop' }
    }), { expectedUserId: 7 });
  });
});
