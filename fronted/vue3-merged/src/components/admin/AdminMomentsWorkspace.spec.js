import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

describe('AdminMomentsWorkspace contract', () => {
  const source = readFileSync(resolve(process.cwd(), 'src/components/admin/AdminMomentsWorkspace.vue'), 'utf8');

  it('connects body editing, photo reuse, preview, publication and withdrawal', () => {
    expect(source).toContain('updateAdminMoment');
    expect(source).toContain('attachAdminMomentPhotos');
    expect(source).toContain('getAdminMomentPreview');
    expect(source).toContain('publishAdminMoment');
    expect(source).toContain('archiveAdminMoment');
  });

  it('reuses the same processing status and protected preview components as albums', () => {
    expect(source).toContain('AdminMediaProcessingStatus');
    expect(source).toContain('AdminProtectedMediaImage');
    expect(source).toContain('retryAdminMediaDerivative');
  });

  it('offers atomic drag and keyboard ordering controls', () => {
    expect(source).toContain('reorderAdminMomentPhotos');
    expect(source).toContain('draggable="true"');
    expect(source).toContain('aria-label="上移动态照片"');
    expect(source).toContain('aria-label="下移动态照片"');
  });
});
