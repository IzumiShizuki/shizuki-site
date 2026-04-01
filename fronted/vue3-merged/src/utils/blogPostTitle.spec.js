import { describe, expect, it } from 'vitest';
import { DEFAULT_BLOG_POST_TITLE, resolveBlogPostDisplayTitle } from './blogPostTitle';

describe('blogPostTitle', () => {
  it('prefers explicit title', () => {
    expect(
      resolveBlogPostDisplayTitle({
        title: '文章标题',
        summary: '摘要标题',
        slugCode: 'article-title'
      })
    ).toBe('文章标题');
  });

  it('falls back to summary and slug code', () => {
    expect(
      resolveBlogPostDisplayTitle({
        title: '   ',
        summary: '摘要标题',
        slugCode: 'article-title'
      })
    ).toBe('摘要标题');

    expect(
      resolveBlogPostDisplayTitle({
        title: '',
        summary: '',
        slug_code: 'article-title'
      })
    ).toBe('article-title');
  });

  it('uses the default fallback when all fields are empty', () => {
    expect(
      resolveBlogPostDisplayTitle({
        title: '',
        summary: '',
        slugCode: ''
      })
    ).toBe(DEFAULT_BLOG_POST_TITLE);
  });
});
