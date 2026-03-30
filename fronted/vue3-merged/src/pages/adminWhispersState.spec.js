import { describe, expect, it } from 'vitest';
import { normalizeAdminWhisperItem, normalizeAdminWhisperPage } from './adminWhispersState';

describe('adminWhispersState', () => {
  it('normalizes whisper item fields from snake case payloads', () => {
    const item = normalizeAdminWhisperItem({
      whisper_id: 12,
      status: 'created',
      post_id: 34,
      post_title: '测试文章',
      content: 'hello',
      nickname: 'guest',
      remark: 'qq',
      created_at: '2026-03-30T12:00:00Z'
    });

    expect(item.whisperId).toBe(12);
    expect(item.status).toBe('CREATED');
    expect(item.postId).toBe(34);
    expect(item.postTitle).toBe('测试文章');
  });

  it('normalizes whisper page payload with pageNo/pageSize', () => {
    const page = normalizeAdminWhisperPage({
      items: [
        {
          whisperId: 1,
          status: 'CREATED',
          postId: 0,
          postTitle: '',
          content: 'site whisper'
        }
      ],
      total: 8,
      pageNo: 2,
      pageSize: 20
    });

    expect(page.items).toHaveLength(1);
    expect(page.page).toBe(2);
    expect(page.pageSize).toBe(20);
    expect(page.total).toBe(8);
    expect(page.items[0].postTitle).toBe('站点留言');
  });
});
