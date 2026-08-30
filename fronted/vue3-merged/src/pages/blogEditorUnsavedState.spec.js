import { describe, expect, it } from 'vitest';
import { createBlogEditorSnapshot, hasBlogEditorUnsavedChanges } from './blogEditorUnsavedState';

const draft = {
  title: '一篇文章',
  summary: '摘要',
  categoryCode: 'Life',
  slugCode: 'a-post',
  coverImageUrl: '',
  visibility: 'public',
  tagsText: '#Vue, Blog',
  allowedGroupCodesText: 'user, admin',
  markdown: '# 正文\r\n内容'
};

describe('blog editor unsaved state', () => {
  it('normalizes transport-irrelevant casing and line endings', () => {
    const baseline = createBlogEditorSnapshot(draft);
    expect(
      hasBlogEditorUnsavedChanges(
        { ...draft, categoryCode: 'life', visibility: 'PUBLIC', markdown: '# 正文\n内容' },
        baseline
      )
    ).toBe(false);
  });

  it('detects content changes while ignoring server-only post status fields', () => {
    const baseline = createBlogEditorSnapshot(draft);
    expect(hasBlogEditorUnsavedChanges({ ...draft, markdown: '# 正文\n新内容' }, baseline)).toBe(true);
    expect(hasBlogEditorUnsavedChanges({ ...draft, statusCode: 'PUBLISHED' }, baseline)).toBe(false);
  });

  it('does not report dirty state before a baseline exists', () => {
    expect(hasBlogEditorUnsavedChanges(draft, null)).toBe(false);
  });
});
