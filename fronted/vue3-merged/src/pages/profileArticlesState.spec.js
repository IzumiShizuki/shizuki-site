import { describe, expect, it } from 'vitest';
import { normalizeAuthorPostItem, summarizeAuthorPosts } from './profileArticlesState';

describe('profileArticlesState', () => {
  it('normalizes post item shape', () => {
    const item = normalizeAuthorPostItem({
      post_id: 9,
      title: 'Demo',
      status_code: 'published',
      category_code: 'Tech',
      visibility: 'group',
      published_at: '2026-03-10T10:00:00Z'
    });

    expect(item.postId).toBe(9);
    expect(item.statusCode).toBe('PUBLISHED');
    expect(item.categoryCode).toBe('tech');
    expect(item.visibility).toBe('GROUP');
    expect(item.publishedAt).toBeTruthy();
  });

  it('falls back to summary or slug when title is empty', () => {
    expect(
      normalizeAuthorPostItem({
        post_id: 10,
        title: '',
        summary: 'Summary Title',
        slug_code: 'summary-title'
      }).title
    ).toBe('Summary Title');

    expect(
      normalizeAuthorPostItem({
        post_id: 11,
        title: '',
        summary: '',
        slug_code: 'post-slug'
      }).title
    ).toBe('post-slug');
  });

  it('builds aggregate summary from author posts', () => {
    const summary = summarizeAuthorPosts([
      {
        postId: 1,
        title: 'A',
        statusCode: 'DRAFT',
        categoryCode: 'life',
        updatedAt: '2026-03-11T02:00:00Z'
      },
      {
        postId: 2,
        title: 'B',
        statusCode: 'PUBLISHED',
        categoryCode: 'tech',
        publishedAt: '2026-03-09T05:00:00Z',
        updatedAt: '2026-03-10T01:00:00Z'
      },
      {
        postId: 3,
        title: 'C',
        statusCode: 'ARCHIVED',
        categoryCode: 'tech',
        publishedAt: '2026-03-08T05:00:00Z'
      }
    ]);

    expect(summary.total).toBe(3);
    expect(summary.draftCount).toBe(1);
    expect(summary.publishedCount).toBe(1);
    expect(summary.otherCount).toBe(1);
    expect(summary.categories[0]).toEqual({ categoryCode: 'tech', count: 2 });
    expect(summary.recentUpdated.length).toBeGreaterThan(0);
    expect(summary.recentPublished.length).toBe(2);
    expect(summary.latestUpdatedAt).toBeTruthy();
    expect(summary.latestPublishedAt).toBeTruthy();
  });

  it('returns empty summary for empty input', () => {
    const summary = summarizeAuthorPosts([]);
    expect(summary.total).toBe(0);
    expect(summary.categories).toEqual([]);
    expect(summary.recentUpdated).toEqual([]);
    expect(summary.recentPublished).toEqual([]);
  });
});
