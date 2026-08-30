import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

describe('AdminAlbumsWorkspace contract', () => {
  const source = readFileSync(resolve(process.cwd(), 'src/components/admin/AdminAlbumsWorkspace.vue'), 'utf8');

  it('keeps uploads, reuse, protected preview and publishing in the secondary workspace', () => {
    expect(source).toContain('uploadAdminManagedPhoto');
    expect(source).toContain('attachAdminAlbumPhotos');
    expect(source).toContain('AdminProtectedMediaImage');
    expect(source).toContain('publishAdminAlbum');
    expect(source).toContain('retryAdminMediaDerivative');
  });

  it('requires explicit acknowledgement for location and original download exposure', () => {
    expect(source).toContain('locationReviewAcknowledged');
    expect(source).toContain('已审核可公开位置');
    expect(source).toContain('已确认原图隐私风险');
  });

  it('offers both drag and keyboard-accessible reordering', () => {
    expect(source).toContain('draggable="true"');
    expect(source).toContain('aria-label="上移照片"');
    expect(source).toContain('aria-label="下移照片"');
    expect(source).toContain('reorderAdminAlbumPhotos');
  });

  it('makes ETag conflict resolution an explicit administrator action', () => {
    expect(source).toContain('系统没有自动覆盖另一会话的修改');
    expect(source).toContain('采用服务器版本');
    expect(source).toContain('在最新版本上重新应用');
    expect(source).toContain('canReapplyPhotoOrder');
  });
});
