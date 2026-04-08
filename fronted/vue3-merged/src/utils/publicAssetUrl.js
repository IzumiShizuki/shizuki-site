const SIGNED_STORAGE_QUERY_PREFIXES = Object.freeze(['x-oss-', 'x-amz-', 'x-cos-']);
const SIGNED_STORAGE_QUERY_KEYS = new Set([
  'expires',
  'expire',
  'signature',
  'ossaccesskeyid',
  'googleaccessid',
  'x-oss-expires',
  'x-amz-expires'
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

function firstSearchParam(searchParams, ...keys) {
  for (const key of keys) {
    const value = searchParams.get(key);
    if (value !== null && value !== undefined && String(value).trim() !== '') {
      return String(value).trim();
    }
  }
  return '';
}

function parseEpochMs(raw) {
  const value = Number(raw);
  if (!Number.isFinite(value) || value <= 0) {
    return 0;
  }
  if (value >= 1e12) {
    return Math.floor(value);
  }
  return Math.floor(value * 1000);
}

function parseIsoBasicDate(raw) {
  const normalized = String(raw || '').trim();
  if (!normalized) {
    return 0;
  }
  const match = normalized.match(/^(\d{4})(\d{2})(\d{2})T(\d{2})(\d{2})(\d{2})Z$/i);
  if (!match) {
    return 0;
  }
  return Date.UTC(
    Number(match[1]),
    Number(match[2]) - 1,
    Number(match[3]),
    Number(match[4]),
    Number(match[5]),
    Number(match[6])
  );
}

export function resolveSignedStorageExpiryEpochMs(raw) {
  const url = String(raw || '').trim();
  if (!url || !isAbsoluteUrl(url)) {
    return 0;
  }

  try {
    const parsed = new URL(url);
    if (!hasSignedStorageQuery(parsed.searchParams)) {
      return 0;
    }

    const absoluteExpiry = firstSearchParam(parsed.searchParams, 'Expires', 'expires', 'expire');
    const absoluteExpiryMs = parseEpochMs(absoluteExpiry);
    if (absoluteExpiryMs > 0) {
      return absoluteExpiryMs;
    }

    const signedAtMs = parseIsoBasicDate(firstSearchParam(parsed.searchParams, 'X-Amz-Date', 'x-amz-date', 'X-Oss-Date', 'x-oss-date'));
    const relativeSeconds = Number(firstSearchParam(parsed.searchParams, 'X-Amz-Expires', 'x-amz-expires', 'X-Oss-Expires', 'x-oss-expires'));
    if (signedAtMs > 0 && Number.isFinite(relativeSeconds) && relativeSeconds > 0) {
      return signedAtMs + Math.floor(relativeSeconds * 1000);
    }
    return 0;
  } catch {
    return 0;
  }
}
