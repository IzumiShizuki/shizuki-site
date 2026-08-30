import { describe, expect, it } from 'vitest';
import { buildRecycleBinEntries, canConfirmPurge, hydrateRecycleBinEntry, isCapabilityActive, RecycleBinKind } from './adminRecycleBinState';

describe('adminRecycleBinState', () => {
  it('builds one unified RECYCLED list without treating active records as deleted', () => {
    const entries = buildRecycleBinEntries({
      albums: [{ id: 1, title: '保留', lifecycle: 'PUBLISHED' }, { id: 2, title: '回收相册', lifecycle: 'RECYCLED', recycledAt: '2026-08-20T10:00:00' }],
      moments: [{ id: 3, excerpt: '回收动态', lifecycle: 'RECYCLED', recycledAt: '2026-08-21T10:00:00' }],
      photos: [{ id: 4, title: '回收照片', recycledAt: '2026-08-22T10:00:00' }]
    });

    expect(entries.map((entry) => [entry.kind, entry.id])).toEqual([
      [RecycleBinKind.PHOTO, 4], [RecycleBinKind.MOMENT, 3], [RecycleBinKind.ALBUM, 2]
    ]);
  });

  it('requires an unexpired server capability and exact server confirmation phrase', () => {
    const dryRun = {
      eligible: true,
      blockers: [],
      capability: 'single-use',
      capabilityExpiresAt: '2026-08-30T00:00:00Z',
      confirmationPhrase: 'PURGE ALBUM 9'
    };

    expect(isCapabilityActive(dryRun, Date.parse('2026-08-29T00:00:00Z'))).toBe(true);
    expect(canConfirmPurge(dryRun, 'PURGE ALBUM 9', Date.parse('2026-08-29T00:00:00Z'))).toBe(true);
    expect(canConfirmPurge(dryRun, 'purge album 9', Date.parse('2026-08-29T00:00:00Z'))).toBe(false);
    expect(canConfirmPurge(dryRun, 'PURGE ALBUM 9', Date.parse('2026-08-31T00:00:00Z'))).toBe(false);
  });

  it('hydrates album retention and concurrency fields from its nested audit contract', () => {
    const hydrated = hydrateRecycleBinEntry(
      { kind: RecycleBinKind.ALBUM, id: 9, version: 2, etag: '"v2"' },
      { title: '旧相册', audit: { recycledAt: '2026-08-01T00:00:00', purgeAfter: '2026-08-31T00:00:00', version: 3, etag: '"v3"' } }
    );

    expect(hydrated).toMatchObject({
      recycledAt: '2026-08-01T00:00:00',
      purgeAfter: '2026-08-31T00:00:00',
      version: 3,
      etag: '"v3"'
    });
  });
});
