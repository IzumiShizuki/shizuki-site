function readText(value) {
  return String(value || '').trim();
}

function resolveProvider(track) {
  const provider = readText(track?.provider || track?.providerCode || track?.provider_code || 'local');
  return provider || 'local';
}

export function buildPlaylistTrackUpsertPayload(track, options = {}) {
  const fallbackSort = Number(options?.fallbackSort || 0);
  const playlistCode = readText(options?.playlistCode);
  const activeNav = readText(options?.activeNav) || 'recommend';
  const hasActiveSearch = options?.hasActiveSearch === true;
  const isPlaylistRoute = options?.isPlaylistRoute === true;

  const metadata = {};
  const album = readText(track?.album);
  const durationSec = Number(track?.durationSec ?? track?.duration_sec);
  const durationLabel = readText(track?.durationLabel || track?.duration);
  const intro = readText(track?.intro);
  const description = readText(track?.description);
  const sourceScene = hasActiveSearch ? 'search' : (isPlaylistRoute ? 'playlist' : activeNav);

  if (album) metadata.album = album;
  if (Number.isFinite(durationSec) && durationSec > 0) metadata.durationSec = Math.floor(durationSec);
  if (durationLabel) metadata.durationLabel = durationLabel;
  metadata.provider = resolveProvider(track);
  if (playlistCode) metadata.playlistCode = playlistCode;
  if (sourceScene) metadata.sourceScene = sourceScene;
  if (intro) metadata.intro = intro;
  if (description) metadata.description = description;
  metadata.lyricTextAvailable = readText(track?.lyricText || track?.lyric_text).length > 0;
  if (readText(track?.cover || track?.coverUrl || track?.cover_url)) {
    metadata.coverSource = 'track';
  }

  return {
    trackId: readText(track?.trackId || track?.track_id || track?.id),
    provider: resolveProvider(track),
    title: readText(track?.title),
    artist: readText(track?.artist),
    cover: readText(track?.cover || track?.coverUrl || track?.cover_url),
    audio: readText(track?.audio || track?.audioUrl || track?.audio_url),
    lyric: readText(track?.lyric || track?.lyricUrl || track?.lyric_url),
    sort: Number.isFinite(Number(track?.sort)) ? Number(track.sort) : fallbackSort,
    enabled: track?.enabled !== false,
    metadata
  };
}
