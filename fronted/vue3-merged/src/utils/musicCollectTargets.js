const DEFAULT_EXCLUDE_CODES = ['default_public'];

function normalizeCode(raw) {
  return String(raw || '').trim();
}

function normalizePlaylistItem(raw) {
  const playlistCode = normalizeCode(raw?.playlistCode || raw?.playlist_code);
  if (!playlistCode) return null;
  return {
    ...raw,
    playlistCode
  };
}

export function buildCollectPlaylistTargets(createdPlaylists, collectedPlaylists, options = {}) {
  const excludedCodesRaw = Array.isArray(options?.excludedCodes) ? options.excludedCodes : DEFAULT_EXCLUDE_CODES;
  const excludedCodes = new Set(excludedCodesRaw.map((item) => normalizeCode(item)).filter(Boolean));
  const targets = new Map();
  const source = []
    .concat(Array.isArray(createdPlaylists) ? createdPlaylists : [])
    .concat(Array.isArray(collectedPlaylists) ? collectedPlaylists : []);

  source.forEach((item) => {
    const normalized = normalizePlaylistItem(item);
    if (!normalized) return;
    if (excludedCodes.has(normalized.playlistCode)) return;
    if (targets.has(normalized.playlistCode)) return;
    targets.set(normalized.playlistCode, normalized);
  });

  return Array.from(targets.values());
}

