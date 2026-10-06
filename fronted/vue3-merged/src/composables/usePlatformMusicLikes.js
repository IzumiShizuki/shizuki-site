import { ref, watch } from 'vue';

export function resolveMusicLikeTarget(track) {
  const raw = track && typeof track === 'object' ? track : { trackId: track, provider: 'netease' };
  let provider = String(raw.provider || raw.providerId || raw.sourceRef?.providerId || 'local').trim().toLowerCase();
  if (['qqmusic', 'tencent'].includes(provider)) provider = 'qq';
  const trackId = String(raw.trackId || raw.track_id || raw.id || raw.sourceRef?.mediaId || '').trim();
  return { provider, trackId, key: `${provider}:${trackId}` };
}

export function usePlatformMusicLikes(options) {
  const likedKeys = ref(new Set());
  const pendingKeys = ref(new Set());
  const error = ref('');
  let accountGeneration = 0;
  let refreshGeneration = 0;
  let mutationGeneration = 0;
  function reset() {
    accountGeneration += 1;
    refreshGeneration += 1;
    likedKeys.value = new Set();
    pendingKeys.value = new Set();
    error.value = '';
  }
  watch(() => [options.isAuthenticated(), options.getAccountId()], reset, { flush: 'sync' });

  function scope() {
    const accountId = options.getAccountId();
    const generation = accountGeneration;
    return { accountId, current: () => options.isAuthenticated() && options.getAccountId() === accountId && accountGeneration === generation };
  }

  async function refresh() {
    if (!options.isAuthenticated()) return false;
    const requestScope = scope();
    const version = ++refreshGeneration;
    const mutations = mutationGeneration;
    try {
      const ids = await options.api.getMusicSourceLikes('netease', options.getAuthorizedFetch(requestScope.accountId));
      if (!requestScope.current() || version !== refreshGeneration || mutations !== mutationGeneration) return false;
      if (!Array.isArray(ids)) throw new Error('网易云喜欢列表返回异常');
      likedKeys.value = new Set(ids.map((id) => `netease:${String(id).trim()}`));
      error.value = '';
      return true;
    } catch (failure) {
      if (requestScope.current() && version === refreshGeneration) error.value = failure?.detail || failure?.message || '喜欢列表加载失败，请重试';
      return false;
    }
  }

  function isLiked(track) {
    return likedKeys.value.has(resolveMusicLikeTarget(track).key);
  }

  function isPending(track) {
    return pendingKeys.value.has(resolveMusicLikeTarget(track).key);
  }

  async function toggle(track) {
    const target = resolveMusicLikeTarget(track);
    if (!target.trackId || isPending(track)) return false;
    if (!options.isAuthenticated()) {
      options.onLogin?.();
      return false;
    }
    if (target.provider !== 'netease') {
      options.onError?.('该平台暂未启用账号点赞接口');
      return false;
    }
    const requestScope = scope();
    const liked = !isLiked(track);
    pendingKeys.value = new Set([...pendingKeys.value, target.key]);
    mutationGeneration += 1;
    try {
      const response = await options.api.setMusicSourceTrackLiked(target.provider, target.trackId, liked, options.getAuthorizedFetch(requestScope.accountId));
      if (!requestScope.current()) return false;
      if (response?.liked !== liked) throw new Error('网易云未确认喜欢状态，请重试');
      mutationGeneration += 1;
      const next = new Set(likedKeys.value);
      if (liked) next.add(target.key);
      else next.delete(target.key);
      likedKeys.value = next;
      error.value = '';
      options.onSynced?.({ ...target, liked });
      return true;
    } catch (failure) {
      if (requestScope.current()) options.onError?.(failure?.detail || failure?.message || '网易云点赞失败，请重试');
      return false;
    } finally {
      if (requestScope.current()) {
        const next = new Set(pendingKeys.value);
        next.delete(target.key);
        pendingKeys.value = next;
      }
    }
  }

  return { likedKeys, pendingKeys, error, refresh, reset, isLiked, isPending, toggle };
}
