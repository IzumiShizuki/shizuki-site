import { describe, expect, it } from 'vitest';
import { readBlogReadingContext, saveBlogReadingContext } from './blogReadingContext';

function memoryStorage() {
  let value = null;
  return { getItem: () => value, setItem: (_, next) => { value = next; } };
}

describe('blog reading continuity', () => {
  it('retains filters, pagination and position while excluding arbitrary state', () => {
    const storage = memoryStorage();
    saveBlogReadingContext({ filters: { keyword: '正文星空', category: 'travel', token: 'secret' }, pageNo: 3, scrollTop: 620, privateArticle: 'hidden' }, storage, 1000);
    const restored = readBlogReadingContext(storage, 1100);
    expect(restored).toMatchObject({ filters: { keyword: '正文星空', category: 'travel' }, pageNo: 3, scrollTop: 620 });
    expect(JSON.stringify(restored)).not.toMatch(/secret|hidden/);
    expect(readBlogReadingContext(storage, 1000 + 7 * 60 * 60 * 1000)).toBeNull();
  });

  it('handles disabled or corrupted session storage without breaking navigation', () => {
    const unavailable = { getItem: () => { throw new Error('denied'); }, setItem: () => { throw new Error('denied'); } };
    expect(readBlogReadingContext(unavailable)).toBeNull();
    expect(saveBlogReadingContext({}, unavailable)).toBeNull();
    expect(readBlogReadingContext({ getItem: () => '{broken' })).toBeNull();
  });
});
