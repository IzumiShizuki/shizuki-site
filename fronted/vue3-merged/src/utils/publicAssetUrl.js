const SIGNED_STORAGE_QUERY_PREFIXES = Object.freeze(['x-oss-', 'x-amz-', 'x-cos-']);
const SIGNED_STORAGE_QUERY_KEYS = new Set([
  'expires',
  'signature',
  'ossaccesskeyid',
  'googleaccessid'
]);

function isAbsoluteUrl(raw) {
  return /^[a-z][a-z0-9+.-]*:/iu.test(raw);
}

function hasSignedStorageQuery(searchParams) {
  for (const key of searchParams.keys()) {
    const normalizedKey = String(key || '').trim().toLowerCase();
    if (!normalizedKey) continue;
    if (SIGNED_STORAGE_QUERY_KEYS.has(normalizedKey)) {
      return true;
    }
    if (SIGNED_STORAGE_QUERY_PREFIXES.some((prefix) => normalizedKey.startsWith(prefix))) {
      return true;
    }
  }
  return false;
}

export function normalizePermanentPublicAssetUrl(raw) {
  const url = String(raw || '').trim();
  if (!url || !isAbsoluteUrl(url)) {
    return url;
  }

  try {
    const parsed = new URL(url);
    if (!hasSignedStorageQuery(parsed.searchParams)) {
      return url;
    }
    parsed.search = '';
    parsed.hash = '';
    return parsed.toString();
  } catch {
    return url;
  }
}
