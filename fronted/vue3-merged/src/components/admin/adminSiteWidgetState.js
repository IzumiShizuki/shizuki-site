export function createSiteWidgetForm(value = {}) {
  return {
    version: Math.max(0, Number(value.version) || 0),
    displayName: String(value.displayName || ''),
    latitude: value.latitude == null ? '' : String(value.latitude),
    longitude: value.longitude == null ? '' : String(value.longitude),
    timezone: String(value.timezone || 'Asia/Shanghai'),
    weatherEnabled: value.weatherEnabled !== false,
    weatherMaxStaleMinutes: Math.max(15, Number(value.weatherMaxStaleMinutes) || 360),
    quoteSourceMode: String(value.quoteSourceMode || 'LOCAL').toUpperCase(),
    hitokotoEnabled: Boolean(value.hitokotoEnabled)
  };
}

export function validateSiteWidgetForm(value = {}) {
  const errors = [];
  const latitude = Number(value.latitude);
  const longitude = Number(value.longitude);
  if (!String(value.displayName || '').trim()) errors.push('请填写站点地点显示名');
  if (!Number.isFinite(latitude) || latitude < -90 || latitude > 90) errors.push('纬度必须在 -90 到 90 之间');
  if (!Number.isFinite(longitude) || longitude < -180 || longitude > 180) errors.push('经度必须在 -180 到 180 之间');
  const timezone = String(value.timezone || '').trim();
  try { new Intl.DateTimeFormat('zh-CN', { timeZone: timezone }).format(); }
  catch { errors.push('请输入有效的 IANA 时区'); }
  const stale = Number(value.weatherMaxStaleMinutes);
  if (!Number.isInteger(stale) || stale < 15 || stale > 10080) errors.push('天气 last-good 时长必须在 15 分钟到 7 天之间');
  if (value.quoteSourceMode === 'HITOKOTO' && !value.hitokotoEnabled) errors.push('使用 Hitokoto 主源时必须启用 provider');
  return Object.freeze({ valid: errors.length === 0, errors: Object.freeze(errors) });
}

export function normalizeMusicBundle(value = {}) {
  const profile = value.profile || value.playlist || {};
  const tracks = Array.isArray(value.tracks) ? value.tracks : [];
  return {
    profile: {
      playlistCode: String(profile.playlistCode || profile.playlist_code || 'default_public'),
      name: String(profile.name || '默认歌单'),
      description: String(profile.description || ''),
      cover: String(profile.cover || '')
    },
    tracks: tracks.map((track, index) => ({
      trackId: String(track.trackId || track.track_id || ''),
      provider: String(track.provider || 'local'),
      title: String(track.title || ''),
      artist: String(track.artist || ''),
      cover: String(track.cover || ''),
      audio: String(track.audio || ''),
      lyric: String(track.lyric || ''),
      sort: Number(track.sort) || index + 1,
      enabled: track.enabled !== false,
      metadata: track.metadata && typeof track.metadata === 'object' ? track.metadata : {}
    }))
  };
}
