import { describe, expect, it, vi } from 'vitest';
import { buildContentShareUrl, shareContentLink } from './contentShare';

describe('contentShare', () => {
  it('builds only a clean hash route and removes existing queries or media secrets', () => {
    const url = buildContentShareUrl('album', 'album_ABCDEFGHIJKLMNOPQRSTUVWXYZ', {
      locationTarget: 'https://site.example/app/?capability=secret#/albums/old?signature=leak'
    });

    expect(url).toBe('https://site.example/app/#/albums/album_ABCDEFGHIJKLMNOPQRSTUVWXYZ');
    expect(url).not.toMatch(/capability|signature|secret|media\/med_/i);
  });

  it('uses Web Share when available and passes title plus sanitized content URL only', async () => {
    const share = vi.fn().mockResolvedValue(undefined);
    const result = await shareContentLink({
      title: '真实相册',
      url: 'https://site.example/#/albums/album_ABCDEFGHIJKLMNOPQRSTUVWXYZ',
      navigatorTarget: { share }
    });

    expect(result.status).toBe('shared');
    expect(share).toHaveBeenCalledWith({
      title: '真实相册',
      url: 'https://site.example/#/albums/album_ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    });
    expect(Object.keys(share.mock.calls[0][0]).sort()).toEqual(['title', 'url']);
  });

  it('falls back to Clipboard when Web Share fails', async () => {
    const writeText = vi.fn().mockResolvedValue(undefined);
    const result = await shareContentLink({
      title: '一条动态',
      url: 'https://site.example/#/moments/moment_ABCDEFGHIJKLMNOPQRSTUVWXYZ',
      navigatorTarget: {
        share: vi.fn().mockRejectedValue(new Error('not supported')),
        clipboard: { writeText }
      }
    });

    expect(result.status).toBe('copied');
    expect(writeText).toHaveBeenCalledWith('https://site.example/#/moments/moment_ABCDEFGHIJKLMNOPQRSTUVWXYZ');
  });

  it('rejects arbitrary URLs before invoking any share surface', async () => {
    const writeText = vi.fn();
    await expect(shareContentLink({
      title: 'unsafe',
      url: 'https://bucket.example/original.jpg?signature=secret',
      navigatorTarget: { clipboard: { writeText } }
    })).rejects.toThrow('sanitized site content route');
    expect(writeText).not.toHaveBeenCalled();
  });
});
