import { afterEach, describe, expect, it } from 'vitest';
import { applyPublicContentMetadata, publicSiteOrigin } from './publicContentMetadata';

afterEach(() => { document.head.innerHTML = ''; document.title = ''; });

describe('public content metadata', () => {
  it('updates unique article metadata as text and restores previous tags on leaving', () => {
    document.title = '原页面';
    const existing = document.createElement('meta');
    existing.name = 'description';
    existing.content = '原简介';
    document.head.append(existing);
    const restore = applyPublicContentMetadata({ title: '<script>标题</script>', description: '正文摘要', kind: 'post', identifier: '42', image: 'javascript:alert(1)' }, { documentTarget: document, locationTarget: 'https://site.example/#/blog/42' });
    expect(document.title).toBe('<script>标题</script> · Shizuki');
    expect(document.querySelector('script')).toBeNull();
    expect(document.querySelector('link[rel=canonical]').href).toBe('https://site.example/read/posts/42');
    expect(document.querySelector('meta[property="og:image"]').content).toBe('https://site.example/images/boot-bg-dark.webp');
    expect(existing.content).toBe('正文摘要');
    restore();
    expect(document.title).toBe('原页面');
    expect(existing.content).toBe('原简介');
    expect(document.querySelector('link[rel=canonical]')).toBeNull();
  });

  it('does not overwrite a newer title or disclose signed image URLs', () => {
    const restore = applyPublicContentMetadata({ title: '相册', kind: 'album', identifier: 'album_safe', image: 'https://bucket.example/image?capability=secret' }, { locationTarget: 'https://site.example/' });
    expect(document.head.innerHTML).not.toContain('secret');
    document.title = '更新后的页面';
    restore();
    expect(document.title).toBe('更新后的页面');
    expect(publicSiteOrigin('file:///D:/index.html')).toBe('https://site.shizuki.online');
  });
});
