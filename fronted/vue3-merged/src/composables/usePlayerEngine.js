import { computed, onBeforeUnmount, ref, watch } from 'vue';
import { parseLrc } from '../utils/lrc';

const STORAGE_KEY = 'shizuki.musicPlayer.v1';
const MODE_ORDER = ['sequential', 'random', 'single'];
const API_BASE = (import.meta.env.VITE_GATEWAY_BASE_URL || '').replace(/\/+$/, '');

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
  const id = track?.id != null ? String(track.id) : `track-${index}`;
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

  return {
    id,
    title: track?.title || id,
    artist: track?.artist || '未知歌手',
    sort: Number.isFinite(track?.sort) ? Number(track.sort) : index + 1,
    audio,
    lyric,
    cover,
    durationLabel: track?.duration || '--:--'
  };
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

export function usePlayerEngine() {
  const persisted = loadPersistedState();
  const tracks = ref([]);
  const loading = ref(false);

  const playMode = ref(MODE_ORDER.includes(persisted.playMode) ? persisted.playMode : 'sequential');
  const visualizerMode = ref(['ring', 'bars', 'none'].includes(persisted.visualizerMode) ? persisted.visualizerMode : 'none');
  const isPlayerExpanded = ref(Boolean(persisted.isPlayerExpanded));
  const isPinned = ref(Boolean(persisted.isPinned));
  const listOpen = ref(Boolean(persisted.listOpen));
  const volume = ref(Number.isFinite(persisted.volume) ? Math.max(0, Math.min(1, persisted.volume)) : 0.8);
  const currentTrackId = ref(typeof persisted.currentTrackId === 'string' ? persisted.currentTrackId : '');
  const randomQueue = ref([]);

  const currentTime = ref(0);
  const duration = ref(0);
  const isPlaying = ref(false);
  const currentLyricLine = ref('');
  const lyricEntries = ref([]);
  const currentLyricIndex = ref(-1);

  const audioElement = new Audio();
  audioElement.preload = 'metadata';
  audioElement.volume = volume.value;

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
    if (!track?.lyric) return;

    try {
      const resp = await fetch(track.lyric);
      if (!resp.ok) return;
      const text = await resp.text();
      lyricEntries.value = parseLrc(text);
      updateLyricState(currentTime.value);
    } catch {
      lyricEntries.value = [];
      currentLyricIndex.value = -1;
      currentLyricLine.value = '';
    }
  }

  async function selectTrackByIndex(index, autoPlay = false) {
    if (index < 0 || index >= tracks.value.length) return;
    const track = tracks.value[index];
    if (!track?.audio) return;

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

  async function loadManifest() {
    loading.value = true;
    try {
      let normalized = [];
      const remoteUrl = `${API_BASE || ''}/api/v1/music/playlist/default`;
      try {
        const remoteResp = await fetch(remoteUrl, { cache: 'no-store' });
        if (remoteResp.ok) {
          const remoteData = await remoteResp.json();
          const remoteTracks = Array.isArray(remoteData?.data) ? remoteData.data : [];
          normalized = remoteTracks.map((item, idx) =>
            normalizeTrack(
              {
                id: item.trackId || item.track_id || `remote-${idx + 1}`,
                title: item.title,
                artist: item.artist,
                cover: item.cover || item.coverUrl || item.cover_url,
                audio: item.audio || item.audioUrl || item.audio_url,
                lyric: item.lyric || item.lyricUrl || item.lyric_url,
                sort: item.sort
              },
              idx
            )
          );
        }
      } catch {
        normalized = [];
      }
      if (!normalized.length) {
        const resp = await fetch(`${import.meta.env.BASE_URL}media/manifest.json`, { cache: 'no-store' });
        if (!resp.ok) throw new Error('manifest not found');
        const data = await resp.json();
        normalized = Array.isArray(data?.tracks) ? data.tracks.map(normalizeTrack) : [];
      }
      normalized.sort((a, b) => (a.sort || 0) - (b.sort || 0));
      tracks.value = normalized;
      hydrateTrackDurations();
    } catch {
      tracks.value = [];
    } finally {
      loading.value = false;
    }

    if (!tracks.value.length) return;

    const persistedIndex = tracks.value.findIndex((item) => item.id === currentTrackId.value);
    const initialIndex = persistedIndex >= 0 ? persistedIndex : 0;
    await selectTrackByIndex(initialIndex, false);
    resetRandomQueue(tracks.value[initialIndex]?.id || '');
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
    [playMode, currentTrackId, volume, isPlayerExpanded, isPinned, listOpen, visualizerMode],
    () => {
      savePersistedState({
        playMode: playMode.value,
        currentTrackId: currentTrackId.value,
        volume: volume.value,
        isPlayerExpanded: isPlayerExpanded.value,
        isPinned: isPinned.value,
        listOpen: listOpen.value,
        visualizerMode: visualizerMode.value
      });
    }
  );

  onBeforeUnmount(() => {
    audioElement.pause();
    audioElement.src = '';
  });

  loadManifest();

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
    setPlayerExpanded,
    setPinned,
    setListOpen,
    reorderTracks,
    setVolume,
    adjustVolume
  };
}
