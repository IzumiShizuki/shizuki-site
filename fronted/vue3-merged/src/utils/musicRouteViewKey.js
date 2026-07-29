export function resolveMusicCenterViewKey(viewRoute) {
  const routeName = String(viewRoute?.name || '');
  if (routeName === 'music-library-playlist') {
    const code = String(viewRoute?.params?.playlistCode || '').trim();
    return `playlist:${code}`;
  }
  if (routeName === 'music-library-voice-work') {
    const workId = String(viewRoute?.params?.workId || '').trim();
    return `voice-work:${workId}`;
  }
  return routeName || 'music-library-music';
}
