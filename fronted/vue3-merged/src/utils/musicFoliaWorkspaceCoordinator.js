const TRACK_SURFACES = new Set(['wall', 'lattice']);
let foliaNavigationSequence = 0;

export function allocateMusicFoliaNavigationRequestId() {
  foliaNavigationSequence += 1;
  return foliaNavigationSequence;
}

function readString(value) {
  return String(value ?? '').trim();
}

function normalizeSourceContext(context = {}) {
  const kind = ['collection', 'queue', 'single'].includes(context?.kind) ? context.kind : 'queue';
  const collection = context?.collection && typeof context.collection === 'object'
    ? {
        source: readString(context.collection.source) || 'online',
        providerId: readString(context.collection.providerId) || undefined,
        type: readString(context.collection.type) || undefined,
        id: readString(context.collection.id),
        name: readString(context.collection.name) || undefined
      }
    : undefined;
  const sitePlaylistCode = readString(context?.sitePlaylistCode);
  return {
    kind,
    ...(collection ? { collection } : {}),
    ...(sitePlaylistCode ? { sitePlaylistCode } : {})
  };
}

function sourceCodeFor(context) {
  return normalizeSourceContext(context).sitePlaylistCode || '';
}

function sourceNameFor(context, fallback = '') {
  const normalized = normalizeSourceContext(context);
  return normalized.collection?.name || readString(fallback) || '播放队列';
}

/**
 * Coordinates Folia entry as one latest-request-wins operation. The caller
 * injects the site's single playback engine and owns presentation state.
 */
export function createMusicFoliaWorkspaceCoordinator({
  loadPlaylist,
  replaceQueueWithTracks,
  playTrack,
  selectQueueTrack,
  navigate,
  isTrackCurrent = () => false,
  onStateChange = () => {},
} = {}) {
  let generation = 0;
  let active = true;

  function publish(pending, error = '', requestId = generation) {
    onStateChange({ pending, error, requestId });
  }

  function begin() {
    generation = allocateMusicFoliaNavigationRequestId();
    active = true;
    publish(true, '', generation);
    return generation;
  }

  function isCurrent(requestId) {
    return requestId === generation && active;
  }

  function finish(requestId, error = '') {
    if (!isCurrent(requestId)) return;
    publish(false, error, requestId);
  }

  async function installCollection({
    tracks,
    profile,
    sourceContext,
    selectedIndex = 0,
    requestId,
    sourceType = 'folia-playlist',
    view = 'lattice'
  }) {
    const queue = Array.isArray(tracks) ? tracks.filter(Boolean) : [];
    if (!queue.length) {
      finish(requestId, '这个歌单没有可播放的歌曲');
      return { ok: false, requestId };
    }
    if (!isCurrent(requestId)) return { ok: false, stale: true, requestId };

    const context = normalizeSourceContext(sourceContext);
    const startIndex = Math.max(0, Math.min(queue.length - 1, Number.isInteger(Number(selectedIndex)) ? Number(selectedIndex) : 0));
    const sourceCode = sourceCodeFor(context);
    const accepted = await replaceQueueWithTracks?.(queue, startIndex, true, {
      ...(sourceCode ? { sourceCode } : {}),
      sourceName: sourceNameFor(context, profile?.name),
      sourceType,
      playlistProfile: profile,
      sourceContext: context
    });
    if (!isCurrent(requestId)) return { ok: false, stale: true, requestId };
    if (!accepted) {
      finish(requestId, '歌曲暂时无法播放，请重试或选择其他歌单');
      return { ok: false, requestId };
    }

    const result = await navigate?.({
      protocolVersion: 1,
      requestId,
      view,
      active: true,
      sourceContext: context,
      returnTarget: context.collection || null
    });
    if (!isCurrent(requestId)) return { ok: false, stale: true, requestId };
    if (result === false || result?.ok === false) {
      finish(requestId, result?.error || 'Folia 画面暂时无法打开，播放仍可继续');
      return { ok: false, requestId };
    }
    finish(requestId);
    return { ok: true, requestId, sourceContext: context };
  }

  async function selectPlaylist({
    playlistCode,
    playlist,
    tracks,
    sourceContext,
    view = 'lattice'
  } = {}) {
    const requestId = begin();
    const code = readString(playlistCode || playlist?.playlistCode || playlist?.playlist_code);
    if (!code && !Array.isArray(tracks)) {
      finish(requestId, '请选择一个歌单');
      return { ok: false, requestId };
    }
    try {
      const bundle = Array.isArray(tracks)
        ? { profile: playlist || {}, tracks }
        : await loadPlaylist?.(code);
      if (!isCurrent(requestId)) return { ok: false, stale: true, requestId };
      const profile = bundle?.profile || bundle?.playlist || playlist || {};
      const context = normalizeSourceContext(sourceContext || {
        kind: 'queue',
        sitePlaylistCode: code
      });
      const result = await installCollection({
        tracks: bundle?.tracks,
        profile,
        sourceContext: context,
        selectedIndex: 0,
        requestId,
        sourceType: 'folia-playlist',
        view
      });
      return result;
    } catch (error) {
      if (isCurrent(requestId)) finish(requestId, error?.message || '歌单加载失败，请重试');
      return { ok: false, requestId, error };
    }
  }

  async function selectNativeCollection({ collection, tracks, selectedIndex = 0, sourceContext } = {}) {
    const requestId = begin();
    const source = normalizeSourceContext(sourceContext || {
      kind: 'collection',
      collection
    });
    try {
      return await installCollection({
        tracks,
        profile: { name: source.collection?.name || collection?.name },
        sourceContext: source,
        selectedIndex,
        requestId,
        sourceType: 'folia-native-collection'
      });
    } catch (error) {
      if (isCurrent(requestId)) finish(requestId, error?.message || '歌单加载失败，请重试');
      return { ok: false, requestId, error };
    }
  }

  async function selectSong({ track, surface = 'player', sourceContext, queueIndex, queuePolicy = 'preserve-or-insert' } = {}) {
    const requestId = begin();
    if (!track) {
      finish(requestId, '未找到要播放的歌曲');
      return { ok: false, requestId };
    }
    try {
      let accepted;
      if (isTrackCurrent(track)) {
        accepted = true;
      } else if (Number.isInteger(Number(queueIndex)) && Number(queueIndex) >= 0 && selectQueueTrack) {
        accepted = await selectQueueTrack(Number(queueIndex));
      } else {
        accepted = await playTrack?.(track, { replaceQueue: false, queuePolicy });
      }
      if (!isCurrent(requestId)) return { ok: false, stale: true, requestId };
      if (!accepted) {
        finish(requestId, '歌曲暂时无法播放，请重试');
        return { ok: false, requestId };
      }
      const context = normalizeSourceContext(sourceContext);
      const view = TRACK_SURFACES.has(surface) ? 'lattice' : 'player';
      const result = await navigate?.({
        protocolVersion: 1,
        requestId,
        view,
        active: true,
        sourceContext: context,
        returnTarget: context.collection || null
      });
      if (!isCurrent(requestId)) return { ok: false, stale: true, requestId };
      if (result === false || result?.ok === false) {
        finish(requestId, result?.error || 'Folia 画面暂时无法打开，播放仍可继续');
        return { ok: false, requestId };
      }
      finish(requestId);
      return { ok: true, requestId, sourceContext: context };
    } catch (error) {
      if (isCurrent(requestId)) finish(requestId, error?.message || '歌曲暂时无法播放，请重试');
      return { ok: false, requestId, error };
    }
  }

  async function openCurrentSong({ sourceContext, view = 'player' } = {}) {
    const requestId = begin();
    const context = normalizeSourceContext(sourceContext);
    try {
      const result = await navigate?.({
        protocolVersion: 1,
        requestId,
        view,
        active: true,
        sourceContext: context,
        returnTarget: context.collection || null
      });
      if (!isCurrent(requestId)) return { ok: false, stale: true, requestId };
      if (result === false || result?.ok === false) {
        finish(requestId, result?.error || 'Folia 画面暂时无法打开，播放仍可继续');
        return { ok: false, requestId };
      }
      finish(requestId);
      return { ok: true, requestId, sourceContext: context };
    } catch (error) {
      if (isCurrent(requestId)) finish(requestId, error?.message || 'Folia 画面暂时无法打开');
      return { ok: false, requestId, error };
    }
  }

  function deactivate() {
    active = false;
    generation = allocateMusicFoliaNavigationRequestId();
    publish(false, '', generation);
  }

  return {
    selectPlaylist,
    selectNativeCollection,
    selectSong,
    openCurrentSong,
    deactivate,
    activate: () => { active = true; }
  };
}

