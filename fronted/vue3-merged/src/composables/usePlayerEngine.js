import { computed, onBeforeUnmount, ref, watch } from 'vue';
import { getPlaylistBundleByCode, resolvePlaybackTrack } from '../services/musicApi';
import { parseLrc } from '../utils/lrc';
import { formatMediaTime } from '../utils/mediaTime';

const STORAGE_KEY = 'shizuki.musicPlayer.v2';
const DEFAULT_PLAYLIST_CODE = 'default_public';
const MODE_ORDER = ['sequential', 'random', 'single'];
const VISUALIZER_STYLES = ['bars-neon', 'bars-crystal', 'bars-firefly', 'ring-halo', 'ring-orbit', 'ring-pulse'];
const LYRIC_DEBUG_KEY = 'shizuki.music.debug.lyric';
const LYRIC_RENDER_MODES = ['original', 'original_translation', 'original_furigana'];

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

function lyricDebugEnabled() {
  if (typeof window === 'undefined') return false;
  try {
    const value = String(window.localStorage.getItem(LYRIC_DEBUG_KEY) || '').trim().toLowerCase();
    return value === '1' || value === 'true' || value === 'on';
  } catch {
    return false;
  }
}

function logLyricDebug(event, payload = {}) {
  if (!lyricDebugEnabled()) return;
  try {
    // eslint-disable-next-line no-console
    console.info(`[MUSIC_LYRIC_DEBUG] ${event}`, payload);
  } catch {
    // ignore
  }
}

function pickFirstNonBlankString(...candidates) {
  for (const candidate of candidates) {
    if (typeof candidate !== 'string') continue;
    if (!candidate.trim()) continue;
    return candidate;
  }
  return '';
}

function coerceLyricTracks(rawTracks) {
  if (!rawTracks || typeof rawTracks !== 'object') {
    return { original: '', translation: '', furigana: '' };
  }
  return {
    original: pickFirstNonBlankString(rawTracks.original, rawTracks.origin, rawTracks.main),
    translation: pickFirstNonBlankString(rawTracks.translation, rawTracks.translated, rawTracks.tlyric),
    furigana: pickFirstNonBlankString(rawTracks.furigana, rawTracks.romaji, rawTracks.pronunciation)
  };
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
  const metadata = track?.metadata && typeof track.metadata === 'object' ? track.metadata : {};
  const metadataLyricTracks = coerceLyricTracks(
    metadata?.lyricTracks || metadata?.lyric_tracks || metadata?.lyrics || metadata?.lrcTracks
  );
  const lyricText = pickFirstNonBlankString(
    track?.lyricText,
    track?.lyric_text,
    track?.originalLyricText,
    track?.original_lyric_text,
    metadata?.lyricText,
    metadata?.lyric_text,
    metadataLyricTracks.original
  );
  const translationLyricText = pickFirstNonBlankString(
    track?.translationLyricText,
    track?.translation_lyric_text,
    track?.translatedLyricText,
    track?.translated_lyric_text,
    metadata?.translationLyricText,
    metadata?.translation_lyric_text,
    metadata?.translatedLyricText,
    metadata?.translated_lyric_text,
    metadata?.tlyric,
    metadataLyricTracks.translation
  );
  const furiganaLyricText = pickFirstNonBlankString(
    track?.furiganaLyricText,
    track?.furigana_lyric_text,
    track?.pronunciationLyricText,
    track?.pronunciation_lyric_text,
    metadata?.furiganaLyricText,
    metadata?.furigana_lyric_text,
    metadata?.pronunciationLyricText,
    metadata?.pronunciation_lyric_text,
    metadata?.romaji,
    metadataLyricTracks.furigana
  );

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
    translationLyricText,
    furiganaLyricText,
    cover,
    durationLabel: track?.duration || '--:--',
    metadata: {
      ...metadata,
      lyricTracks: {
        original: lyricText,
        translation: translationLyricText,
        furigana: furiganaLyricText
      }
    }
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
  const lyricRenderMode = ref(
    LYRIC_RENDER_MODES.includes(String(persisted.lyricRenderMode || ''))
      ? String(persisted.lyricRenderMode)
      : 'original_translation'
  );
  const currentLyricLine = ref('');
  const lyricEntries = ref([]);
  const lyricTimeline = ref([]);
  const currentLyricIndex = ref(-1);
  const currentLyricEntryIndex = ref(-1);
  const lyricResolveAttempted = ref(new Set());
  const playbackResolveAttempted = ref(new Set());

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
    const list = lyricTimeline.value;
    if (!list.length) {
      currentLyricIndex.value = -1;
      currentLyricEntryIndex.value = -1;
      currentLyricLine.value = '';
      return;
    }

    let idx = -1;
    for (let i = 0; i < list.length; i += 1) {
      if (list[i].time <= timeSec) idx = i;
      else break;
    }
    currentLyricIndex.value = idx;
    currentLyricEntryIndex.value = idx;
    if (idx >= 0) {
      currentLyricLine.value = list[idx].original || '';
      return;
    }
    currentLyricLine.value = list[0]?.original || '';
  }

  const lyricContext = computed(() => {
    const idx = currentLyricEntryIndex.value;
    const list = lyricTimeline.value;
    if (!list.length) {
      return { prev: '', current: '', next: '', key: 'empty' };
    }
    if (idx < 0) {
      return {
        prev: '',
        current: list[0]?.original || '',
        next: list[1]?.original || '',
        key: 'l-prelude'
      };
    }
    return {
      prev: list[idx - 1]?.original || '',
      current: list[idx]?.original || '',
      next: list[idx + 1]?.original || '',
      key: `l-${idx}`
    };
  });

  const availableLyricModes = computed(() => {
    const baseModes = ['original'];
    const track = currentTrack.value;
    if (!track) return baseModes;
    const trackTexts = readLyricTrackTexts(track);
    const hasTranslation = Boolean(String(trackTexts.translation || '').trim())
      || lyricTimeline.value.some((item) => Boolean(String(item?.translation || '').trim()));
    const hasFurigana = Boolean(String(trackTexts.furigana || '').trim())
      || lyricTimeline.value.some((item) => Boolean(String(item?.furigana || '').trim()));
    if (hasTranslation) baseModes.push('original_translation');
    if (hasFurigana) baseModes.push('original_furigana');
    return baseModes;
  });

  function buildLyricEntriesFromText(rawText) {
    const source = String(rawText || '');
    if (!source.trim()) return [];
    const parsed = parseLrc(source);
    if (parsed.length) {
      logLyricDebug('parse_timeline_ok', { textLength: source.length, entryCount: parsed.length });
      return parsed;
    }
    logLyricDebug('parse_timeline_fallback_to_plain_lines', { textLength: source.length });
    return source
      .split(/\r?\n/)
      .map((line) => line.trim())
      .filter(Boolean)
      .slice(0, 120)
      .map((text, idx) => ({ time: idx * 4, text }));
  }

  function buildLyricTimelineFromTracks(originalEntries, translationEntries, furiganaEntries) {
    const base = Array.isArray(originalEntries) ? originalEntries : [];
    if (!base.length) return [];
    const trans = Array.isArray(translationEntries) ? translationEntries : [];
    const furi = Array.isArray(furiganaEntries) ? furiganaEntries : [];
    return base.map((item, idx) => {
      const byIndexTranslation = trans[idx]?.text || '';
      const byIndexFurigana = furi[idx]?.text || '';
      return {
        time: Number(item.time || 0),
        original: String(item.text || '').trim(),
        translation: String(byIndexTranslation || '').trim(),
        furigana: String(byIndexFurigana || '').trim()
      };
    });
  }

  function readLyricTrackTexts(track) {
    const metadata = track?.metadata && typeof track.metadata === 'object' ? track.metadata : {};
    const metadataTracks = coerceLyricTracks(metadata?.lyricTracks || metadata?.lyric_tracks || metadata?.lyrics || metadata?.lrcTracks);
    const metadataPlain = pickFirstNonBlankString(metadata?.lyricText, metadata?.lyric_text);
    return {
      original: pickFirstNonBlankString(track?.lyricText, metadataPlain, metadataTracks.original),
      translation: pickFirstNonBlankString(track?.translationLyricText, metadataTracks.translation),
      furigana: pickFirstNonBlankString(track?.furiganaLyricText, metadataTracks.furigana)
    };
  }

  function applyLyricTimeline(timeline) {
    const nextTimeline = Array.isArray(timeline) ? timeline : [];
    lyricTimeline.value = nextTimeline;
    lyricEntries.value = nextTimeline.map((item) => ({ time: item.time, text: item.original || '' }));
    updateLyricState(currentTime.value);
  }

  async function loadTrackLyric(track) {
    lyricEntries.value = [];
    lyricTimeline.value = [];
    currentLyricIndex.value = -1;
    currentLyricEntryIndex.value = -1;
    currentLyricLine.value = '';
    if (!track?.lyric && !track?.lyricText && !track?.translationLyricText && !track?.furiganaLyricText) return;

    try {
      let originalText = '';
      const lyricTracks = readLyricTrackTexts(track);
      let loadedByUrl = false;
      if (track?.lyric) {
        try {
          const resp = await fetch(track.lyric);
          if (resp.ok) {
            const text = await resp.text();
            const normalized = String(text || '').trim();
            if (normalized) {
              originalText = normalized;
            }
            const parsed = buildLyricEntriesFromText(normalized);
            loadedByUrl = parsed.length > 0;
            logLyricDebug('load_by_lyric_url', {
              ok: true,
              lyricUrl: track.lyric,
              textLength: String(text || '').length,
              entryCount: parsed.length
            });
          }
        } catch {
          loadedByUrl = false;
          logLyricDebug('load_by_lyric_url', { ok: false, lyricUrl: track.lyric });
        }
      }
      if (!loadedByUrl) {
        originalText = pickFirstNonBlankString(originalText, lyricTracks.original);
        logLyricDebug('load_by_lyric_text_inline', {
          textLength: String(originalText || '').length
        });
      }

      const originalEntries = buildLyricEntriesFromText(originalText);
      const translationEntries = buildLyricEntriesFromText(lyricTracks.translation);
      const furiganaEntries = buildLyricEntriesFromText(lyricTracks.furigana);
      applyLyricTimeline(buildLyricTimelineFromTracks(originalEntries, translationEntries, furiganaEntries));
    } catch {
      lyricEntries.value = [];
      lyricTimeline.value = [];
      currentLyricIndex.value = -1;
      currentLyricEntryIndex.value = -1;
      currentLyricLine.value = '';
      logLyricDebug('load_track_lyric_failed', {
        trackId: String(track?.trackId || track?.id || ''),
        provider: String(track?.provider || '')
      });
    }
  }

  async function resolveTrackLyricFallback(index) {
    if (index < 0 || index >= tracks.value.length) return;
    const track = tracks.value[index];
    if (!track) return;
    const provider = String(track.provider || '').trim().toLowerCase();
    if (!['netease', 'kuwo', 'qq'].includes(provider)) return;
    const trackId = String(track.trackId || track.id || '').trim();
    if (!trackId) return;
    const resolveKey = `${provider}:${trackId}`;
    if (lyricResolveAttempted.value.has(resolveKey)) return;
    lyricResolveAttempted.value.add(resolveKey);

    try {
      const payload = await resolvePlaybackTrack(
        {
          provider,
          trackId,
          title: String(track.title || '').trim(),
          artist: String(track.artist || '').trim(),
          cover: String(track.cover || '').trim(),
          playlistCode: String(playlistProfile.value?.playlistCode || ''),
          resolveLyric: true
        },
        getAuthorizedFetch()
      );
      const merged = normalizeTrack(
        {
          ...track,
          ...payload,
          id: track.id,
          trackId
        },
        index
      );
      if (!String(track.audio || '').trim() && String(merged.audio || '').trim()) {
        // no-op, keep merged audio from payload
      } else {
        merged.audio = track.audio;
      }
      const next = tracks.value.slice();
      next[index] = merged;
      tracks.value = next;
      await loadTrackLyric(merged);
      if (!lyricEntries.value.length) {
        lyricResolveAttempted.value.delete(resolveKey);
      }
    } catch {
      lyricResolveAttempted.value.delete(resolveKey);
    }
  }

  function buildResolveKey(track) {
    const provider = String(track?.provider || '').trim().toLowerCase();
    const trackId = String(track?.trackId || track?.id || '').trim();
    if (!provider || !trackId) return '';
    return `${provider}:${trackId}`;
  }

  async function resolveTrackPlayback(index, options = {}) {
    if (index < 0 || index >= tracks.value.length) return null;
    const track = tracks.value[index];
    const force = options?.force === true;
    if (!track || (!force && track.audio)) return track;

    const provider = String(track.provider || '').trim().toLowerCase();
    const supported = provider === 'netease' || provider === 'kuwo' || provider === 'qq';
    if (!supported) return track;

    const trackId = String(track.trackId || track.id || '').trim();
    if (!trackId) return track;
    const shouldResolveLyric = true;

    try {
      const payload = await resolvePlaybackTrack(
        {
          provider,
          trackId,
          title: String(track.title || '').trim(),
          artist: String(track.artist || '').trim(),
          cover: String(track.cover || '').trim(),
          playlistCode: String(playlistProfile.value?.playlistCode || ''),
          resolveLyric: shouldResolveLyric
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
      logLyricDebug('resolve_playback_response', {
        provider,
        trackId,
        lyricTextLength: String(resolved?.lyricText || '').length,
        lyricUrlPresent: Boolean(String(resolved?.lyric || '').trim())
      });
      return resolved;
    } catch {
      return track;
    }
  }

  async function selectTrackByIndex(index, autoPlay = false, options = {}) {
    if (index < 0 || index >= tracks.value.length) return false;
    const shouldResolve = options?.resolveIfMissing === true || (options?.resolveIfMissing !== false && autoPlay);
    let track = tracks.value[index];
    if (shouldResolve && !track?.audio) {
      track = await resolveTrackPlayback(index);
    }
    if (!track) return false;
    if (!track.audio) {
      currentTrackId.value = track.id;
      audioElement.pause();
      audioElement.src = '';
      currentTime.value = 0;
      duration.value = 0;
      isPlaying.value = false;
      await loadTrackLyric(track);
      return false;
    }

    currentTrackId.value = track.id;
    currentTime.value = 0;
    duration.value = 0;
    audioElement.src = track.audio;
    audioElement.load();
    await loadTrackLyric(track);
    if (!lyricEntries.value.length) {
      await resolveTrackLyricFallback(index);
    }

    if (autoPlay) {
      try {
        await audioElement.play();
        isPlaying.value = true;
        return true;
      } catch {
        isPlaying.value = false;
        return false;
      }
    }
    return true;
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
    return true;
  }

  async function playNext(forceSequential = false, options = {}) {
    if (!tracks.value.length) return;
    const idx = currentIndex.value < 0 ? 0 : currentIndex.value;
    const mode = forceSequential ? 'sequential' : playMode.value;
    if (mode === 'sequential' && options?.stopAtTail === true && idx >= tracks.value.length - 1) {
      audioElement.pause();
      isPlaying.value = false;
      return;
    }
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

  function seekToTime(nextTimeSec) {
    const target = Number(nextTimeSec);
    if (!Number.isFinite(target) || target < 0) return;
    if (Number.isFinite(duration.value) && duration.value > 0) {
      audioElement.currentTime = Math.max(0, Math.min(duration.value, target));
    } else {
      audioElement.currentTime = Math.max(0, target);
    }
  }

  function setLyricRenderMode(nextMode) {
    const mode = String(nextMode || '');
    if (!LYRIC_RENDER_MODES.includes(mode)) return;
    if (!availableLyricModes.value.includes(mode)) return;
    lyricRenderMode.value = mode;
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
    return formatMediaTime(sec, { fallback: '--:--' });
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
      lyricResolveAttempted.value = new Set();
      playbackResolveAttempted.value = new Set();
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
      lyricTimeline.value = [];
      currentLyricIndex.value = -1;
      currentLyricEntryIndex.value = -1;
      currentLyricLine.value = '';
      lyricResolveAttempted.value = new Set();
      playbackResolveAttempted.value = new Set();
      randomQueue.value = [];
      return;
    }

    const canReuseCurrentTrack = normalizedCode === previousCode;
    const persistedIndex = canReuseCurrentTrack ? tracks.value.findIndex((item) => item.id === currentTrackId.value) : -1;
    const initialIndex = persistedIndex >= 0 ? persistedIndex : 0;
    await selectTrackByIndex(initialIndex, false);
    resetRandomQueue(tracks.value[initialIndex]?.id || '');
  }

  async function replaceQueueWithTracks(rawTracks, startIndex = 0, autoPlay = true, source = {}) {
    const input = Array.isArray(rawTracks) ? rawTracks : [];
    if (!input.length) return false;
    const normalized = input.map((item, idx) => normalizeTrack(item, idx));
    if (!normalized.length) return false;

    tracks.value = normalized.map((item, idx) => ({ ...item, sort: idx + 1 }));
    lyricResolveAttempted.value = new Set();
    playbackResolveAttempted.value = new Set();

    const sourceCode = String(source?.sourceCode || source?.playlistCode || playlistProfile.value?.playlistCode || DEFAULT_PLAYLIST_CODE).trim();
    if (sourceCode) {
      playlistProfile.value = normalizePlaylistProfile({
        playlistCode: sourceCode,
        name: String(source?.sourceName || playlistProfile.value?.name || '播放队列'),
        description: String(source?.sourceType || playlistProfile.value?.description || ''),
        cover: String(source?.cover || playlistProfile.value?.cover || '')
      });
    }

    const safeIndex = Math.max(0, Math.min(tracks.value.length - 1, Number.isFinite(Number(startIndex)) ? Number(startIndex) : 0));
    const selected = await selectTrackByIndex(safeIndex, autoPlay, { resolveIfMissing: true });
    resetRandomQueue(tracks.value[safeIndex]?.id || '');
    if (!autoPlay) return true;
    return selected === true;
  }

  async function enqueueExternalTrack(rawTrack, autoPlay = false, options = {}) {
    const normalized = normalizeTrack(
      {
        id: rawTrack?.trackId || rawTrack?.track_id || rawTrack?.id || `pick-${Date.now()}`,
        provider: rawTrack?.provider || rawTrack?.providerCode || rawTrack?.provider_code,
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
    const replaceQueue = options?.replaceQueue === true;

    if (replaceQueue) {
      tracks.value = [{ ...normalized, sort: 1 }];
      lyricResolveAttempted.value = new Set();
      randomQueue.value = [];
      if (autoPlay) {
        const selected = await selectTrackByIndex(0, true);
        return selected === true;
      }
      return true;
    }

    const existingIndex = tracks.value.findIndex((item) => item.id === normalized.id);
    if (existingIndex >= 0) {
      const next = tracks.value.slice();
      next[existingIndex] = { ...next[existingIndex], ...normalized };
      tracks.value = next;
      if (autoPlay) {
        const selected = await selectTrackByIndex(existingIndex, true);
        return selected === true;
      }
    } else {
      tracks.value = [...tracks.value, normalized].map((item, idx) => ({
        ...item,
        sort: idx + 1
      }));
      if (autoPlay) {
        const selected = await selectTrackByIndex(tracks.value.length - 1, true);
        return selected === true;
      }
    }

    if (playMode.value === 'random') resetRandomQueue(normalized.id);
    return true;
  }

  async function enqueueNextTrack(rawTrack) {
    const normalized = normalizeTrack(
      {
        id: rawTrack?.trackId || rawTrack?.track_id || rawTrack?.id || `next-${Date.now()}`,
        provider: rawTrack?.provider || rawTrack?.providerCode || rawTrack?.provider_code,
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

    const targetBase = currentIndex.value >= 0 ? currentIndex.value + 1 : tracks.value.length;
    const existingIndex = tracks.value.findIndex((item) => item.id === normalized.id);
    const next = tracks.value.slice();

    if (existingIndex >= 0) {
      const [existing] = next.splice(existingIndex, 1);
      const merged = { ...existing, ...normalized };
      const targetIndex = Math.max(0, Math.min(next.length, existingIndex < targetBase ? targetBase - 1 : targetBase));
      next.splice(targetIndex, 0, merged);
    } else {
      const targetIndex = Math.max(0, Math.min(next.length, targetBase));
      next.splice(targetIndex, 0, normalized);
    }

    tracks.value = next.map((item, idx) => ({
      ...item,
      sort: idx + 1
    }));

    if (playMode.value === 'random') resetRandomQueue(currentTrackId.value || normalized.id);
    return true;
  }

  async function playExternalTrack(rawTrack, options = {}) {
    return enqueueExternalTrack(rawTrack, true, options);
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

  audioElement.addEventListener('error', async () => {
    const idx = currentIndex.value;
    if (idx < 0 || idx >= tracks.value.length) {
      isPlaying.value = false;
      return;
    }
    const current = tracks.value[idx];
    const resolveKey = buildResolveKey(current);
    if (!resolveKey || playbackResolveAttempted.value.has(resolveKey)) {
      isPlaying.value = false;
      return;
    }
    playbackResolveAttempted.value.add(resolveKey);
    const previousAudio = String(current?.audio || '').trim();
    const resolved = await resolveTrackPlayback(idx, { force: true });
    const nextAudio = String(resolved?.audio || '').trim();
    if (!nextAudio || nextAudio === previousAudio) {
      isPlaying.value = false;
      return;
    }
    try {
      audioElement.src = nextAudio;
      audioElement.load();
      await loadTrackLyric(resolved);
      await audioElement.play();
      isPlaying.value = true;
    } catch {
      isPlaying.value = false;
    }
  });

  audioElement.addEventListener('ended', async () => {
    await playNext(false, { stopAtTail: true });
  });

  watch(
    [playMode, currentTrackId, volume, isPlayerExpanded, isPinned, listOpen, visualizerMode, visualizerStyle, lyricRenderMode],
    () => {
      savePersistedState({
        playMode: playMode.value,
        currentTrackId: currentTrackId.value,
        volume: volume.value,
        isPlayerExpanded: isPlayerExpanded.value,
        isPinned: isPinned.value,
        listOpen: listOpen.value,
        visualizerMode: visualizerMode.value,
        visualizerStyle: visualizerStyle.value,
        lyricRenderMode: lyricRenderMode.value
      });
    }
  );

  watch(
    () => availableLyricModes.value.join(','),
    () => {
      const modes = availableLyricModes.value;
      if (!modes.length) {
        lyricRenderMode.value = 'original';
        return;
      }
      if (!modes.includes(lyricRenderMode.value)) {
        lyricRenderMode.value = modes[0];
      }
    },
    { immediate: true }
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
    lyricTimeline,
    currentLyricEntryIndex,
    lyricRenderMode,
    availableLyricModes,
    selectTrackByIndex,
    togglePlay,
    playNext,
    playPrev,
    seekToPercent,
    seekToTime,
    setLyricRenderMode,
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
    replaceQueueWithTracks,
    enqueueExternalTrack,
    enqueueNextTrack,
    playExternalTrack
  };
}
