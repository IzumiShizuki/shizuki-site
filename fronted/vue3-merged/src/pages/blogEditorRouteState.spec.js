import { describe, expect, it } from 'vitest';
import { shouldSyncEditorRoute } from './blogEditorRouteState';

describe('shouldSyncEditorRoute', () => {
  it('returns true when editor route has no bound post id yet', () => {
    expect(shouldSyncEditorRoute('blog-editor', undefined, 42)).toBe(true);
  });

  it('returns false when route is already bound to the same post', () => {
    expect(shouldSyncEditorRoute('blog-editor', '42', 42)).toBe(false);
  });

  it('returns false outside blog editor route', () => {
    expect(shouldSyncEditorRoute('blog-detail', undefined, 42)).toBe(false);
  });
});
