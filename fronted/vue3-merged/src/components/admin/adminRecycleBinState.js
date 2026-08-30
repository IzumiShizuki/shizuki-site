export const RecycleBinKind = Object.freeze({
  ALBUM: 'ALBUM',
  MOMENT: 'MOMENT',
  PHOTO: 'PHOTO'
});

const KIND_META = Object.freeze({
  [RecycleBinKind.ALBUM]: { label: '相册', icon: 'far fa-images' },
  [RecycleBinKind.MOMENT]: { label: '动态', icon: 'fas fa-camera-retro' },
  [RecycleBinKind.PHOTO]: { label: '照片', icon: 'far fa-image' }
});

function timeOf(value) {
  const timestamp = Date.parse(String(value || ''));
  return Number.isFinite(timestamp) ? timestamp : 0;
}

function recycledEntry(kind, source, title) {
  return {
    kind,
    id: Number(source?.id),
    title: String(title || '').trim() || `${KIND_META[kind].label} #${source?.id}`,
    lifecycle: kind === RecycleBinKind.PHOTO ? 'RECYCLED' : String(source?.lifecycle || '').toUpperCase(),
    recycledAt: source?.recycledAt || null,
    purgeAfter: source?.purgeAfter || null,
    version: Number(source?.version) || 0,
    etag: String(source?.etag || '').trim(),
    source
  };
}

export function recycleKindMeta(kind) {
  return KIND_META[kind] || { label: '内容', icon: 'fas fa-box-archive' };
}

export function buildRecycleBinEntries({ albums = [], moments = [], photos = [] } = {}) {
  const entries = [
    ...(Array.isArray(albums) ? albums : [])
      .filter((item) => String(item?.lifecycle || '').toUpperCase() === 'RECYCLED')
      .map((item) => recycledEntry(RecycleBinKind.ALBUM, item, item.title)),
    ...(Array.isArray(moments) ? moments : [])
      .filter((item) => String(item?.lifecycle || '').toUpperCase() === 'RECYCLED')
      .map((item) => recycledEntry(RecycleBinKind.MOMENT, item, item.excerpt)),
    ...(Array.isArray(photos) ? photos : [])
      .filter((item) => Boolean(item?.recycledAt))
      .map((item) => recycledEntry(RecycleBinKind.PHOTO, item, item.title || item.altText))
  ];
  return entries.sort((left, right) => timeOf(right.recycledAt || right.source?.updatedAt) - timeOf(left.recycledAt || left.source?.updatedAt));
}

export function hydrateRecycleBinEntry(entry, detail) {
  const source = detail && typeof detail === 'object' ? detail : {};
  const audit = source.audit && typeof source.audit === 'object' ? source.audit : {};
  return {
    ...entry,
    ...source,
    recycledAt: source.recycledAt ?? audit.recycledAt ?? entry?.recycledAt ?? null,
    purgeAfter: source.purgeAfter ?? audit.purgeAfter ?? entry?.purgeAfter ?? null,
    version: Number(source.version ?? audit.version ?? entry?.version) || 0,
    etag: String(source.etag ?? audit.etag ?? entry?.etag ?? '').trim()
  };
}

export function isCapabilityActive(dryRun, now = Date.now()) {
  const capability = String(dryRun?.capability || '').trim();
  const expiresAt = timeOf(dryRun?.capabilityExpiresAt);
  return Boolean(capability && expiresAt > now);
}

export function canConfirmPurge(dryRun, confirmation, now = Date.now()) {
  return Boolean(dryRun?.eligible)
    && (Array.isArray(dryRun?.blockers) ? dryRun.blockers.length === 0 : true)
    && isCapabilityActive(dryRun, now)
    && String(confirmation || '').trim() === String(dryRun?.confirmationPhrase || '').trim();
}

export function recycleBinStatus(entry) {
  if (!entry?.purgeAfter) return '已回收；保留期限由服务端决定';
  const time = timeOf(entry.purgeAfter);
  if (time && time <= Date.now()) return '已到期；仍需人工执行永久清理';
  return `回收中 · 到期 ${String(entry.purgeAfter).replace('T', ' ')}`;
}
