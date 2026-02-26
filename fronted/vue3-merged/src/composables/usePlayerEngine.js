import { computed, onBeforeUnmount, ref, watch } from 'vue';
import { getPlaylistBundleByCode, resolvePlaybackTrack } from '../services/musicApi';
import { parseLrc } from '../utils/lrc';

const STORAGE_KEY = 'shizuki.musicPlayer.v1';
const DEFAULT_PLAYLIST_CODE = 'default_public';
const MODE_ORDER = ['sequential', 'random', 'single'];
const VISUALIZER_STYLES = ['bars-neon', 'bars-crystal', 'bars-firefly', 'ring-halo', 'ring-orbit', 'ring-pulse'];

function loadPersistedState() {
  try {
    const raw = window.localStorage.getItem(STORAGE_KEY);
    if (!raw) return {};
    const parsed = JSON.parse(raw);
    return parsed && typeof parsed === 'object' ? parsed : {};
  } catch {
    return {};
  }
}

function savePersistedState(nextPartial) {
  try {
    const prev = loadPersistedState();
    const merged = { ...prev, ...nextPartial };
    window.localStorage.setItem(STORAGE_KEY, JSON.stringify(merged));
  } catch {
    // ignore
  }
}

function normalizeTrack(track, index) {
  const idRaw = track?.id ?? track?.trackId ?? track?.track_id;
  const id = idRaw != null ? String(idRaw) : `track-${index}`;
  const cover = track?.cover
    ? track.cover.startsWith('http') || track.cover.startsWith('/')
      ? track.cover
      : `${import.meta.env.BASE_URL}${String(track.cover).replace(/^\/+/, '')}`
    : `${import.meta.env.BASE_URL}images/katanegai.jpg`;
  const audio = track?.audio
    ? track.audio.startsWith('http') || track.audio.startsWith('/')
      ? track.audio
      : `${import.meta.env.BASE_URL}${String(track.audio).replace(/^\/+/, '')}`
    : '';
  const lyric = track?.lyric
    ? track.lyric.startsWith('http') || track.lyric.startsWith('/')
      ? track.lyric
      : `${import.meta.env.BASE_URL}${String(track.lyric).replace(/^\/+/, '')}`
    : null;
  const lyricText = typeof track?.lyricText === 'string'
    ? track.lyricText
    : typeof track?.lyric_text === 'string'
      ? track.lyric_text
      : '';

  return {
    id,
    trackId: String(track?.trackId || track?.track_id || id),
    title: track?.title || id,
    artist: track?.artist || '未知歌手',
    provider: track?.provider || track?.providerCode || track?.provider_code || 'local',
    sort: Number.isFinite(track?.sort) ? Number(track.sort) : index + 1,
    audio,
    lyric,
    lyricText,
    cover,
    durationLabel: track?.duration || '--:--'
  };
}

function normalizePlaylistProfile(profile) {
  return {
    playlistCode: String(profile?.playlistCode || profile?.playlist_code || DEFAULT_PLAYLIST_CODE).trim() || DEFAULT_PLAYLIST_CODE,
    name: String(profile?.name || '默认歌单').trim() || '默认歌单',
    description: String(profile?.description || '').trim(),
    cover: String(profile?.cover || '').trim()
  };
}

function normalizePlaylistBundleProfile(rawProfile, fallbackCode = DEFAULT_PLAYLIST_CODE) {
  if (!rawProfile || typeof rawProfile !== 'object') {
    return normalizePlaylistProfile({ playlistCode: fallbackCode });
  }

  return normalizePlaylistProfile({
    playlistCode: rawProfile.playlistCode ?? rawProfile.playlist_code ?? fallbackCode,
    name: rawProfile.name,
    description: rawProfile.description,
    cover: rawProfile.cover
  });
}

function extractErrorMessage(error, fallback = '默认歌单加载失败') {
  if (typeof error?.detail === 'string' && error.detail.trim()) return error.detail.trim();
  if (typeof error?.message === 'string' && error.message.trim()) return error.message.trim();
  return fallback;
}

function pickNextIndex({ mode, currentIndex, tracksLen }) {
  if (tracksLen <= 0) return -1;
  if (mode === 'single') return currentIndex;
  if (mode === 'random') {
    if (tracksLen === 1) return 0;
    let candidate = currentIndex;
    while (candidate === currentIndex) {
      candidate = Math.floor(Math.random() * tracksLen);
    }
    return candidate;
  }
  return (currentIndex + 1) % tracksLen;
}

function styleBelongsToMode(style, mode) {
  if (mode === 'bars') return style.startsWith('bars-');
  if (mode === 'ring') return style.startsWith('ring-');
  return true;
}

function getDefaultStyleByMode(mode) {
  if (mode === 'ring') return 'ring-halo';
  return 'bars-neon';
}

export function usePlayerEngine(options = {}) {
  const persisted = loadPersistedState();
  const tracks = ref([]);
  const playlistLoading = ref(false);
  const playlistError = ref('');
  const playlistProfile = ref(
    normalizePlaylistProfile({
      playlistCode: DEFAULT_PLAYLIST_CODE,
      name: '默认歌单',
      description: '全站共通默认歌单',
      cover: ''
    })
  );
  const loading = playlistLoading;

  const playMode = ref(MODE_ORDER.includes(persisted.playMode) ? persisted.playMode : 'sequential');
  const visualizerMode = ref(['ring', 'bars', 'none'].includes(persisted.visualizerMode) ? persisted.visualizerMode : 'none');
  const visualizerStyle = ref(VISUALIZER_STYLES.includes(persisted.visualizerStyle) ? persisted.visualizerStyle : 'bars-neon');
  const isPlayerExpanded = ref(Boolean(persisted.isPlayerExpanded));
  const isPinned = ref(Boolean(persisted.isPinned));
  const listOpen = ref(Boolean(persisted.listOpen));
  const volume = ref(Number.isFinite(persisted.volume) ? Math.max(0, Math.min(1, persisted.volume)) : 0.8);
  const currentTrackId = ref(typeof persisted.currentTrackId === 'string' ? persisted.currentTrackId : '');
  const randomQueue = ref([]);
  const getAuthorizedFetch = typeof options?.getAuthorizedFetch === 'function' ? options.getAuthorizedFetch : () => undefined;

  const currentTime = ref(0);
  const duration = ref(0);
  const isPlaying = ref(false);
  const currentLyricLine = ref('');
  const lyricEntries = ref([]);
  const currentLyricIndex = ref(-1);

  const audioElement = new Audio();
  audioElement.preload = 'metadata';
  audioElement.volume = volume.value;

  if (!styleBelongsToMode(visualizerStyle.value, visualizerMode.value) && visualizerMode.value !== 'none') {
    visualizerStyle.value = getDefaultStyleByMode(visualizerMode.value);
  }

  const currentIndex = computed(() => {
    if (!tracks.value.length) return -1;
    return tracks.value.findIndex((item) => item.id === currentTrackId.value);
  });

  const currentTrack = computed(() => {
    if (currentIndex.value < 0) return null;
    return tracks.value[currentIndex.value] || null;
  });

  function resetRandomQueue(anchorId = currentTrackId.value) {
    const ids = tracks.value.map((t) => t.id);
    if (!ids.length) {
      randomQueue.value = [];
      return;
    }

    for (let i = ids.length - 1; i > 0; i -= 1) {
      const j = Math.floor(Math.random() * (i + 1));
      [ids[i], ids[j]] = [ids[j], ids[i]];
    }

    if (anchorId && ids.includes(anchorId) && ids[0] !== anchorId) {
      const idx = ids.indexOf(anchorId);
      [ids[0], ids[idx]] = [ids[idx], ids[0]];
    }

    randomQueue.value = ids;
  }

  function updateLyricState(timeSec) {
    if (!lyricEntries.value.length) {
      currentLyricIndex.value = -1;
      currentLyricLine.value = '';
      return;
    }

    let idx = -1;
    for (let i = 0; i < lyricEntries.value.length; i += 1) {
      if (lyricEntries.value[i].time <= timeSec) idx = i;
      else break;
    }
    currentLyricIndex.value = idx;
    currentLyricLine.value = idx >= 0 ? lyricEntries.value[idx].text : '';
  }

  const lyricContext = computed(() => {
    const idx = currentLyricIndex.value;
    const list = lyricEntries.value;
    if (!list.length || idx < 0) {
      return { prev: '', current: '', next: '', key: 'empty' };
    }
    return {
      prev: list[idx - 1]?.text || '',
      current: list[idx]?.text || '',
      next: list[idx + 1]?.text || '',
      key: `l-${idx}`
    };
  });

  async function loadTrackLyric(track) {
    lyricEntries.value = [];
    currentLyricIndex.value = -1;
    currentLyricLine.value = '';
    if (!track?.lyric && !track?.lyricText) return;

    try {
      if (track?.lyric) {
        const resp = await fetch(track.lyric);
        if (!resp.ok) return;
        const text = await resp.text();
        lyricEntries.value = parseLrc(text);
      } else if (track?.lyricText) {
        const parsed = parseLrc(track.lyricText);
        if (parsed.length) {
          lyricEntries.value = parsed;
        } else {
          lyricEntries.value = String(track.lyricText || '')
            .split(/\r?\n/)
            .map((line) => line.trim())
            .filter(Boolean)
            .slice(0, 120)
            .map((text, idx) => ({ time: idx * 4, text }));
        }
      }
      updateLyricState(currentTime.value);
    } catch {
      lyricEntries.value = [];
      currentLyricIndex.value = -1;
      currentLyricLine.value = '';
    }
  }

  async function resolveTrackPlayback(index) {
    if (index < 0 || index >= tracks.value.length) return null;
    const track = tracks.value[index];
    if (!track || track.audio) return track;

    const provider = String(track.provider || '').trim().toLowerCase();
    const supported = provider === 'netease' || provider === 'kuwo' || provider === 'qq';
    if (!supported) return track;

    const trackId = String(track.trackId || track.id || '').trim();
    if (!trackId) return track;

    try {
      const payload = await resolvePlaybackTrack(
        {
          provider,
          trackId,
          title: String(track.title || '').trim(),
          artist: String(track.artist || '').trim(),
          cover: String(track.cover || '').trim(),
          playlistCode: String(playlistProfile.value?.playlistCode || '')
        },
        getAuthorizedFetch()
      );
      const resolved = normalizeTrack(
        {
          ...track,
          ...payload,
          id: track.id,
          trackId
        },
        index
      );
      const next = tracks.value.slice();
      next[index] = resolved;
      tracks.value = next;
      return resolved;
    } catch {
      return track;
    }
  }

  async function selectTrackByIndex(index, autoPlay = false, options = {}) {
    if (index < 0 || index >= tracks.value.length) return;
    const shouldResolve = options?.resolveIfMissing === true || (options?.resolveIfMissing !== false && autoPlay);
    let track = tracks.value[index];
    if (shouldResolve && !track?.audio) {
      track = await resolveTrackPlayback(index);
    }
    if (!track) return;
    if (!track.audio) {
      currentTrackId.value = track.id;
      audioElement.pause();
      audioElement.src = '';
      currentTime.value = 0;
      duration.value = 0;
      isPlaying.value = false;
      await loadTrackLyric(track);
      return;
    }

    currentTrackId.value = track.id;
    currentTime.value = 0;
    duration.value = 0;
    audioElement.src = track.audio;
    audioElement.load();
    await loadTrackLyric(track);

    if (autoPlay) {
      try {
        await audioElement.play();
        isPlaying.value = true;
      } catch {
        isPlaying.value = false;
      }
    }
  }

  async function togglePlay() {
    if (!currentTrack.value && tracks.value.length) {
      await selectTrackByIndex(0, true);
      return;
    }
    if (!currentTrack.value) return;
    if (!currentTrack.value.audio) {
      const idx = currentIndex.value >= 0 ? currentIndex.value : 0;
      await selectTrackByIndex(idx, true);
      return;
    }

    if (audioElement.paused) {
      try {
        await audioElement.play();
        isPlaying.value = true;
      } catch {
        isPlaying.value = false;
      }
    } else {
      audioElement.pause();
      isPlaying.value = false;
    }
  }

  async function playNext(forceSequential = false) {
    if (!tracks.value.length) return;
    const idx = currentIndex.value < 0 ? 0 : currentIndex.value;
    const mode = forceSequential ? 'sequential' : playMode.value;
    if (mode === 'random') {
      if (randomQueue.value.length !== tracks.value.length || !randomQueue.value.includes(currentTrackId.value)) {
        resetRandomQueue(currentTrackId.value);
      }
      const q = randomQueue.value;
      const qi = q.indexOf(currentTrackId.value);
      const nextId = q[(qi + 1 + q.length) % q.length];
      const nextIndex = tracks.value.findIndex((t) => t.id === nextId);
      await selectTrackByIndex(nextIndex >= 0 ? nextIndex : 0, true);
      return;
    }
    const nextIndex = pickNextIndex({ mode, currentIndex: idx, tracksLen: tracks.value.length });
    await selectTrackByIndex(nextIndex, true);
  }

  async function playPrev() {
    if (!tracks.value.length) return;
    if (playMode.value === 'random') {
      if (randomQueue.value.length !== tracks.value.length || !randomQueue.value.includes(currentTrackId.value)) {
        resetRandomQueue(currentTrackId.value);
      }
      const q = randomQueue.value;
      const qi = q.indexOf(currentTrackId.value);
      const prevId = q[(qi - 1 + q.length) % q.length];
      const prevIndex = tracks.value.findIndex((t) => t.id === prevId);
      await selectTrackByIndex(prevIndex >= 0 ? prevIndex : 0, true);
      return;
    }
    const idx = currentIndex.value < 0 ? 0 : currentIndex.value;
    const prevIndex = idx > 0 ? idx - 1 : tracks.value.length - 1;
    await selectTrackByIndex(prevIndex, true);
  }

  function seekToPercent(nextPercent) {
    if (!Number.isFinite(duration.value) || duration.value <= 0) return;
    const safe = Math.max(0, Math.min(1, nextPercent));
    audioElement.currentTime = safe * duration.value;
  }

  function cyclePlayMode() {
    const idx = MODE_ORDER.indexOf(playMode.value);
    playMode.value = MODE_ORDER[(idx + 1) % MODE_ORDER.length];
  }

  function setVisualizerMode(mode) {
    if (!['ring', 'bars', 'none'].includes(mode)) return;
    visualizerMode.value = mode;
    if (mode !== 'none' && !styleBelongsToMode(visualizerStyle.value, mode)) {
      visualizerStyle.value = getDefaultStyleByMode(mode);
    }
  }

  function setVisualizerStyle(style) {
    if (!VISUALIZER_STYLES.includes(style)) return;
    visualizerStyle.value = style;
    if (style.startsWith('bars-')) visualizerMode.value = 'bars';
    if (style.startsWith('ring-')) visualizerMode.value = 'ring';
  }

  function setPlayerExpanded(next) {
    isPlayerExpanded.value = next;
    // 每次切换展开状态都重置为无列表，避免收起后再次展开仍保留旧列表态
    listOpen.value = false;
  }

  function setPinned(next) {
    isPinned.value = next;
  }

  function setListOpen(next) {
    listOpen.value = next;
  }

  function setVolume(next) {
    const safe = Math.max(0, Math.min(1, Number(next)));
    volume.value = safe;
    audioElement.volume = safe;
  }

  function formatDuration(sec) {
    if (!Number.isFinite(sec) || sec <= 0) return '--:--';
    const t = Math.floor(sec);
    const mm = String(Math.floor(t / 60)).padStart(2, '0');
    const ss = String(t % 60).padStart(2, '0');
    return `${mm}:${ss}`;
  }

  function hydrateTrackDurations() {
    tracks.value.forEach((track, idx) => {
      if (!track?.audio || (track.durationLabel && track.durationLabel !== '--:--')) return;
      const probe = new Audio();
      probe.preload = 'metadata';
      probe.src = track.audio;

      const cleanup = () => {
        probe.removeEventListener('loadedmetadata', onLoaded);
        probe.removeEventListener('error', onError);
      };

      const onLoaded = () => {
        const label = formatDuration(probe.duration);
        if (tracks.value[idx] && tracks.value[idx].id === track.id) {
          tracks.value[idx].durationLabel = label;
        }
        cleanup();
      };

      const onError = () => cleanup();

      probe.addEventListener('loadedmetadata', onLoaded);
      probe.addEventListener('error', onError);
    });
  }

  function adjustVolume(delta) {
    setVolume(volume.value + Number(delta || 0));
  }

  function reorderTracks(fromIndex, toIndex) {
    if (
      !Number.isInteger(fromIndex) ||
      !Number.isInteger(toIndex) ||
      fromIndex < 0 ||
      toIndex < 0 ||
      fromIndex >= tracks.value.length ||
      toIndex >= tracks.value.length ||
      fromIndex === toIndex
    ) {
      return;
    }

    const next = tracks.value.slice();
    const [moved] = next.splice(fromIndex, 1);
    next.splice(toIndex, 0, moved);
    next.forEach((item, i) => {
      item.sort = i + 1;
    });
    tracks.value = next;
    if (playMode.value === 'random') resetRandomQueue(currentTrackId.value);
  }

  function normalizeRemoteTracks(remoteTracks) {
    const source = Array.isArray(remoteTracks) ? remoteTracks : [];
    const normalized = source.map((item, idx) =>
      normalizeTrack(
        {
          id: item?.trackId || item?.track_id || item?.id || `remote-${idx + 1}`,
          provider: item?.provider || item?.providerCode || item?.provider_code,
          title: item?.title,
          artist: item?.artist,
          cover: item?.cover || item?.coverUrl || item?.cover_url,
          audio: item?.audio || item?.audioUrl || item?.audio_url,
          lyric: item?.lyric || item?.lyricUrl || item?.lyric_url,
          lyricText: item?.lyricText || item?.lyric_text,
          sort: item?.sort
        },
        idx
      )
    );
    normalized.sort((a, b) => (a.sort || 0) - (b.sort || 0));
    return normalized;
  }

  async function loadPlaylistByCode(playlistCode = DEFAULT_PLAYLIST_CODE, options = {}) {
    const normalizedCode = String(playlistCode || '').trim() || DEFAULT_PLAYLIST_CODE;
    const previousCode = playlistProfile.value?.playlistCode || DEFAULT_PLAYLIST_CODE;
    const authorizedFetch = typeof options?.authorizedFetch === 'function' ? options.authorizedFetch : null;

    playlistLoading.value = true;
    playlistError.value = '';
    try {
      const payload = await getPlaylistBundleByCode(normalizedCode, authorizedFetch);
      const profile = normalizePlaylistBundleProfile(payload?.profile || payload?.playlist || {}, normalizedCode);
      const normalizedTracks = normalizeRemoteTracks(payload?.tracks);
      playlistProfile.value = profile;
      tracks.value = normalizedTracks;
      hydrateTrackDurations();
    } catch (error) {
      tracks.value = [];
      playlistProfile.value = normalizePlaylistProfile({
        playlistCode: normalizedCode,
        name: '默认歌单',
        description: '',
        cover: ''
      });
      playlistError.value = extractErrorMessage(error);
    } finally {
      playlistLoading.value = false;
    }

    if (!tracks.value.length) {
      audioElement.pause();
      audioElement.src = '';
      currentTrackId.value = '';
      currentTime.value = 0;
      duration.value = 0;
      isPlaying.value = false;
      lyricEntries.value = [];
      currentLyricIndex.value = -1;
      currentLyricLine.value = '';
      randomQueue.value = [];
      return;
    }

    const canReuseCurrentTrack = normalizedCode === previousCode;
    const persistedIndex = canReuseCurrentTrack ? tracks.value.findIndex((item) => item.id === currentTrackId.value) : -1;
    const initialIndex = persistedIndex >= 0 ? persistedIndex : 0;
    await selectTrackByIndex(initialIndex, false);
    resetRandomQueue(tracks.value[initialIndex]?.id || '');
  }

  async function enqueueExternalTrack(rawTrack, autoPlay = false) {
    const normalized = normalizeTrack(
      {
        id: rawTrack?.trackId || rawTrack?.track_id || rawTrack?.id || `pick-${Date.now()}`,
        title: rawTrack?.title,
        artist: rawTrack?.artist,
        cover: rawTrack?.cover || rawTrack?.coverUrl || rawTrack?.cover_url,
        audio: rawTrack?.audio || rawTrack?.audioUrl || rawTrack?.audio_url,
        lyric: rawTrack?.lyric || rawTrack?.lyricUrl || rawTrack?.lyric_url,
        lyricText: rawTrack?.lyricText || rawTrack?.lyric_text,
        sort: rawTrack?.sort || 0
      },
      0
    );
    const canLazyResolve = ['netease', 'kuwo', 'qq'].includes(String(normalized.provider || '').toLowerCase())
      && String(normalized.trackId || normalized.id || '').trim() !== '';
    if (!normalized.audio && !canLazyResolve) return false;

    const existingIndex = tracks.value.findIndex((item) => item.id === normalized.id);
    if (existingIndex >= 0) {
      const next = tracks.value.slice();
      next[existingIndex] = { ...next[existingIndex], ...normalized };
      tracks.value = next;
      if (autoPlay) {
        await selectTrackByIndex(existingIndex, true);
      }
    } else {
      tracks.value = [...tracks.value, normalized].map((item, idx) => ({
        ...item,
        sort: idx + 1
      }));
      if (autoPlay) {
        await selectTrackByIndex(tracks.value.length - 1, true);
      }
    }

    if (playMode.value === 'random') resetRandomQueue(normalized.id);
    return true;
  }

  async function playExternalTrack(rawTrack) {
    return enqueueExternalTrack(rawTrack, true);
  }

  audioElement.addEventListener('loadedmetadata', () => {
    duration.value = Number.isFinite(audioElement.duration) ? audioElement.duration : 0;
    const idx = tracks.value.findIndex((t) => t.id === currentTrackId.value);
    if (idx >= 0 && duration.value > 0) {
      tracks.value[idx].durationLabel = formatDuration(duration.value);
    }
  });

  audioElement.addEventListener('timeupdate', () => {
    currentTime.value = audioElement.currentTime;
    updateLyricState(currentTime.value);
  });

  audioElement.addEventListener('pause', () => {
    isPlaying.value = false;
  });

  audioElement.addEventListener('play', () => {
    isPlaying.value = true;
  });

  audioElement.addEventListener('ended', async () => {
    await playNext(false);
  });

  watch(
    [playMode, currentTrackId, volume, isPlayerExpanded, isPinned, listOpen, visualizerMode, visualizerStyle],
    () => {
      savePersistedState({
        playMode: playMode.value,
        currentTrackId: currentTrackId.value,
        volume: volume.value,
        isPlayerExpanded: isPlayerExpanded.value,
        isPinned: isPinned.value,
        listOpen: listOpen.value,
        visualizerMode: visualizerMode.value,
        visualizerStyle: visualizerStyle.value
      });
    }
  );

  onBeforeUnmount(() => {
    audioElement.pause();
    audioElement.src = '';
  });

  return {
    tracks,
    loading,
    audioElement,
    currentTrack,
    currentTrackId,
    currentIndex,
    currentTime,
    duration,
    isPlaying,
    playMode,
    volume,
    visualizerMode,
    visualizerStyle,
    listOpen,
    isPlayerExpanded,
    isPinned,
    currentLyricLine,
    lyricContext,
    selectTrackByIndex,
    togglePlay,
    playNext,
    playPrev,
    seekToPercent,
    cyclePlayMode,
    setVisualizerMode,
    setVisualizerStyle,
    setPlayerExpanded,
    setPinned,
    setListOpen,
    reorderTracks,
    setVolume,
    adjustVolume,
    playlistLoading,
    playlistError,
    playlistProfile,
    loadPlaylistByCode,
    reloadPlaylist: () => loadPlaylistByCode(playlistProfile.value?.playlistCode || DEFAULT_PLAYLIST_CODE),
    enqueueExternalTrack,
    playExternalTrack
  };
}
