function firstPresentValue(values) {
  for (const value of values) {
    if (value === null || value === undefined || value === '') continue;
    return value;
  }
  return null;
}

export function readPositiveDurationSec(raw) {
  const metadata = raw?.metadata && typeof raw.metadata === 'object' ? raw.metadata : {};
  const value = firstPresentValue([
    raw?.durationSec,
    raw?.duration_sec,
    metadata?.durationSec,
    metadata?.duration_sec
  ]);
  if (value === null) return null;
  const parsed = Number(value);
  return Number.isFinite(parsed) && parsed > 0 ? parsed : null;
}

export function readDurationLabel(raw) {
  const metadata = raw?.metadata && typeof raw.metadata === 'object' ? raw.metadata : {};
  const value = firstPresentValue([
    raw?.durationLabel,
    raw?.duration_label,
    raw?.duration,
    metadata?.durationLabel,
    metadata?.duration_label
  ]);
  return String(value || '').trim();
}

function normalizeProvider(raw) {
  const value = String(
    raw?.sourceProvider
      || raw?.source_provider
      || raw?.provider
      || raw?.providerCode
      || raw?.provider_code
      || ''
  ).trim().toLowerCase();
  if (value === 'qqmusic' || value === 'tencent') return 'qq';
  return value;
}

export function enrichSearchPlaylists(playlists, tracks) {
  const playlistRows = Array.isArray(playlists) ? playlists : [];
  const trackRows = Array.isArray(tracks) ? tracks : [];
  const trackMetadataByProvider = new Map();

  trackRows.forEach((track) => {
    const provider = normalizeProvider(track);
    if (!provider) return;
    const current = trackMetadataByProvider.get(provider) || { cover: '' };
    if (!current.cover) {
      current.cover = String(track?.cover || track?.coverUrl || track?.cover_url || '').trim();
    }
    trackMetadataByProvider.set(provider, current);
  });

  return playlistRows.map((playlist) => {
    const provider = normalizeProvider(playlist);
    const fallback = trackMetadataByProvider.get(provider);
    if (!fallback) return playlist;
    const cover = String(playlist?.cover || playlist?.coverUrl || playlist?.cover_url || '').trim();
    return {
      ...playlist,
      cover: cover || fallback.cover
    };
  });
}
