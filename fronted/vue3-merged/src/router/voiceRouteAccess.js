import { listMusicProviders } from '../services/musicApi';

const TTL_MS = 60 * 1000;
let cached = null;

export function voiceRouteAccountKey(auth) {
  return auth?.isAuthenticated?.value ? String(auth?.user?.value?.userId || auth?.user?.value?.id || 'me') : 'guest';
}

export async function resolveVoiceRouteVisible(auth) {
  const key = voiceRouteAccountKey(auth);
  const now = Date.now();
  if (cached?.key === key && cached.expiresAt > now) return cached.visible;
  try {
    const rows = await listMusicProviders(auth?.isAuthenticated?.value ? auth.authorizedFetch : undefined);
    const voice = Array.isArray(rows) && rows.find((item) => String(item?.provider || item?.providerCode || '').trim().toLowerCase() === 'asmr');
    const visible = Boolean(voice?.enabled && voice?.visible);
    if (voiceRouteAccountKey(auth) !== key) return false;
    cached = { key, visible, expiresAt: now + TTL_MS };
    return visible;
  } catch {
    return false;
  }
}
