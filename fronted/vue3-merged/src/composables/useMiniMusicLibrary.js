import { computed, ref } from 'vue';
import * as defaultMusicApi from '../services/musicApi';

export const DEFAULT_MINI_MUSIC_PLAYLIST_CODE = 'default_public';

const DEFAULT_PLAYLIST_FALLBACK = Object.freeze({
  playlistCode: DEFAULT_MINI_MUSIC_PLAYLIST_CODE,
  name: '默认歌单',
  description: '全站共通默认歌单',
  cover: '',
  trackCount: 0
});

function parseErrorMessage(error, fallback = '加载失败，请稍后重试') {
  if (typeof error?.detail === 'string' && error.detail.trim()) return error.detail.trim();
  if (typeof error?.message === 'string' && error.message.trim()) return error.message.trim();
  return fallback;
}

export function formatMiniTrackDuration(seconds) {
  const safe = Math.max(0, Number(seconds || 0));
  const minute = Math.floor(safe / 60);
  const second = Math.floor(safe % 60);
  return `${String(minute).padStart(2, '0')}:${String(second).padStart(2, '0')}`;
}

export function normalizeMiniPlaylistSummary(raw, fallbackCode = DEFAULT_MINI_MUSIC_PLAYLIST_CODE) {
  return {
    playlistCode: String(raw?.playlistCode || raw?.playlist_code || fallbackCode || DEFAULT_MINI_MUSIC_PLAYLIST_CODE).trim(),
    name: String(raw?.name || '未命名歌单').trim() || '未命名歌单',
    description: String(raw?.description || '').trim(),
    cover: String(raw?.cover || '').trim(),
    playlistType: String(raw?.playlistType || raw?.playlist_type || '').trim(),
    ownerUserId: Number(raw?.ownerUserId || raw?.owner_user_id || 0),
    isPublic: Boolean(raw?.isPublic ?? raw?.is_public),
    trackCount: Number(raw?.trackCount || raw?.track_count || 0)
  };
}

export function normalizeMiniPlaylistTrack(raw, index = 0) {
  const id = String(raw?.trackId || raw?.track_id || raw?.id || `track-${index + 1}`).trim() || `track-${index + 1}`;
  const metadata = raw?.metadata && typeof raw.metadata === 'object' ? raw.metadata : {};
  const durationSec = Number.isFinite(
    Number(raw?.durationSec ?? raw?.duration_sec ?? metadata?.durationSec ?? metadata?.duration_sec)
  )
    ? Number(raw?.durationSec ?? raw?.duration_sec ?? metadata?.durationSec ?? metadata?.duration_sec)
    : null;
  const durationLabelRaw = String(
    raw?.durationLabel
      || raw?.duration_label
      || raw?.duration
      || metadata?.durationLabel
      || metadata?.duration_label
      || ''
  ).trim();
  const durationLabel = durationLabelRaw || (durationSec != null ? formatMiniTrackDuration(durationSec) : '--:--');

  return {
    id,
    trackId: id,
    title: String(raw?.title || id).trim() || id,
    artist: String(raw?.artist || '').trim() || '未知歌手',
    album: String(raw?.album || metadata?.album || metadata?.albumName || metadata?.album_name || '').trim(),
    cover: String(raw?.cover || raw?.coverUrl || raw?.cover_url || '').trim(),
    audio: String(raw?.audio || raw?.audioUrl || raw?.audio_url || '').trim(),
    lyric: String(raw?.lyric || raw?.lyricUrl || raw?.lyric_url || '').trim(),
    lyricText: String(raw?.lyricText || raw?.lyric_text || metadata?.lyricText || metadata?.lyric_text || '').trim(),
    provider: String(raw?.provider || raw?.providerCode || raw?.provider_code || 'local').trim() || 'local',
    durationSec,
    durationLabel,
    duration: durationLabel,
    metadata
  };
}

function uniquePlaylistRows(items) {
  const source = Array.isArray(items) ? items : [];
  const result = [];
  const seen = new Set();

  source.forEach((item) => {
    const normalized = normalizeMiniPlaylistSummary(item);
    if (!normalized.playlistCode || seen.has(normalized.playlistCode)) return;
    seen.add(normalized.playlistCode);
    result.push(normalized);
  });

  return result;
}

function toAuthValue(source) {
  if (typeof source === 'function') return Boolean(source());
  return Boolean(source?.value);
}

function findPlaylistByCode(code, groups) {
  const normalizedCode = String(code || '').trim();
  if (!normalizedCode) return null;

  for (const group of groups) {
    const items = Array.isArray(group) ? group : [];
    const matched = items.find((item) => String(item?.playlistCode || '').trim() === normalizedCode);
    if (matched) return matched;
  }

  return null;
}

export function createMiniMusicLibraryEngine(options = {}) {
  const musicApi = options.musicApi || defaultMusicApi;
  const player = options.player || null;
  const getAuthorizedFetch = typeof options.getAuthorizedFetch === 'function' ? options.getAuthorizedFetch : () => undefined;
  const isAuthenticatedSource = options.isAuthenticated ?? (() => false);

  const initialized = ref(false);
  const overviewLoading = ref(false);
  const playlistLoading = ref(false);
  const overviewError = ref('');
  const playlistError = ref('');
  const featuredPlaylists = ref([]);
  const defaultPlaylist = ref({ ...DEFAULT_PLAYLIST_FALLBACK });
  const likedPlaylist = ref(null);
  const createdPlaylists = ref([]);
  const collectedPlaylists = ref([]);
  const selectedPlaylistCode = ref(DEFAULT_MINI_MUSIC_PLAYLIST_CODE);
  const selectedPlaylist = ref({ ...DEFAULT_PLAYLIST_FALLBACK });
  const selectedTracks = ref([]);

  const isAuthenticated = computed(() => toAuthValue(isAuthenticatedSource));
  const corePlaylists = computed(() => {
    const rows = [defaultPlaylist.value];
    if (isAuthenticated.value && likedPlaylist.value?.playlistCode) {
      rows.push(likedPlaylist.value);
    }
    return uniquePlaylistRows(rows);
  });
  const myPlaylists = computed(() =>
    uniquePlaylistRows([...createdPlaylists.value, ...collectedPlaylists.value]).filter(
      (item) => item.playlistCode !== defaultPlaylist.value.playlistCode && item.playlistCode !== likedPlaylist.value?.playlistCode
    )
  );
  const sections = computed(() => {
    const groups = [
      { key: 'core', label: '默认 / 快捷', caption: 'Core Collection', items: corePlaylists.value },
      { key: 'featured', label: '精选歌单', caption: 'Featured', items: uniquePlaylistRows(featuredPlaylists.value) },
      { key: 'mine', label: '我的歌单', caption: 'My Library', items: myPlaylists.value }
    ];
    return groups.filter((group) => group.items.length);
  });
  const loading = computed(() => overviewLoading.value || playlistLoading.value);
  const errorText = computed(() => playlistError.value || overviewError.value);

  function resolveAuthorizedFetch() {
    return isAuthenticated.value ? getAuthorizedFetch() : undefined;
  }

  function resetSidebarState() {
    defaultPlaylist.value = { ...DEFAULT_PLAYLIST_FALLBACK };
    likedPlaylist.value = null;
    createdPlaylists.value = [];
    collectedPlaylists.value = [];
  }

  async function loadOverview(options = {}) {
    const force = options?.force === true;
    if (overviewLoading.value) return;
    if (initialized.value && !force) return;

    overviewLoading.value = true;
    overviewError.value = '';

    try {
      const authorizedFetch = resolveAuthorizedFetch();
      const [homePayload, sidebarPayload] = await Promise.all([
        musicApi.getMusicLibraryHome(authorizedFetch),
        isAuthenticated.value ? musicApi.getMyMusicLibrarySidebar(authorizedFetch) : Promise.resolve(null)
      ]);

      featuredPlaylists.value = Array.isArray(homePayload?.featuredPlaylists || homePayload?.featured_playlists)
        ? uniquePlaylistRows(homePayload.featuredPlaylists || homePayload.featured_playlists)
        : [];

      if (sidebarPayload) {
        const fallbackDefault = featuredPlaylists.value[0] || DEFAULT_PLAYLIST_FALLBACK;
        defaultPlaylist.value = normalizeMiniPlaylistSummary(
          sidebarPayload.defaultPlaylist || sidebarPayload.default_playlist || fallbackDefault,
          fallbackDefault.playlistCode || DEFAULT_MINI_MUSIC_PLAYLIST_CODE
        );
        likedPlaylist.value = sidebarPayload.likedPlaylist || sidebarPayload.liked_playlist
          ? normalizeMiniPlaylistSummary(sidebarPayload.likedPlaylist || sidebarPayload.liked_playlist)
          : null;
        createdPlaylists.value = uniquePlaylistRows(sidebarPayload.createdPlaylists || sidebarPayload.created_playlists || []);
        collectedPlaylists.value = uniquePlaylistRows(sidebarPayload.collectedPlaylists || sidebarPayload.collected_playlists || []);
      } else {
        resetSidebarState();
      }

      initialized.value = true;
    } catch (error) {
      if (!initialized.value) {
        featuredPlaylists.value = [];
        resetSidebarState();
      }
      overviewError.value = parseErrorMessage(error, '歌单概览加载失败');
    } finally {
      overviewLoading.value = false;
    }
  }

  function resolveVisiblePlaylistCode() {
    const current = String(selectedPlaylistCode.value || '').trim();
    const visible = findPlaylistByCode(current, [corePlaylists.value, featuredPlaylists.value, myPlaylists.value]);
    if (visible?.playlistCode) return visible.playlistCode;
    return defaultPlaylist.value.playlistCode || featuredPlaylists.value[0]?.playlistCode || DEFAULT_MINI_MUSIC_PLAYLIST_CODE;
  }

  async function selectPlaylist(playlistCode, options = {}) {
    const code = String(playlistCode || '').trim() || DEFAULT_MINI_MUSIC_PLAYLIST_CODE;
    const force = options?.force === true;
    const nextSelection = findPlaylistByCode(code, [corePlaylists.value, featuredPlaylists.value, myPlaylists.value]);
    const canReuse =
      !force
      && selectedPlaylist.value?.playlistCode === code
      && Array.isArray(selectedTracks.value)
      && selectedTracks.value.length > 0;

    selectedPlaylistCode.value = code;
    if (nextSelection) {
      selectedPlaylist.value = normalizeMiniPlaylistSummary(nextSelection, code);
    }
    if (canReuse || playlistLoading.value) {
      return canReuse;
    }

    playlistLoading.value = true;
    playlistError.value = '';

    try {
      const payload = await musicApi.getPlaylistBundleByCode(code, resolveAuthorizedFetch());
      selectedPlaylist.value = normalizeMiniPlaylistSummary(payload?.profile || payload?.playlist || nextSelection || { playlistCode: code }, code);
      selectedTracks.value = Array.isArray(payload?.tracks) ? payload.tracks.map((item, index) => normalizeMiniPlaylistTrack(item, index)) : [];
      return true;
    } catch (error) {
      selectedPlaylist.value = normalizeMiniPlaylistSummary(nextSelection || { playlistCode: code, name: '歌单加载失败' }, code);
      selectedTracks.value = [];
      playlistError.value = parseErrorMessage(error, '歌单加载失败，请稍后重试');
      return false;
    } finally {
      playlistLoading.value = false;
    }
  }

  async function ensureReady(options = {}) {
    const force = options?.force === true;
    await loadOverview({ force });
    const code = force ? resolveVisiblePlaylistCode() : (selectedPlaylistCode.value || resolveVisiblePlaylistCode());
    if (force) {
      selectedTracks.value = [];
    }
    return selectPlaylist(code, {
      force: force || !selectedTracks.value.length
    });
  }

  async function handleAuthChanged() {
    initialized.value = false;
    await loadOverview({ force: true });
    return selectPlaylist(resolveVisiblePlaylistCode(), { force: true });
  }

  async function refreshCurrentPlaylist() {
    return selectPlaylist(resolveVisiblePlaylistCode(), { force: true });
  }

  async function playTrackAt(index) {
    const safeIndex = Number(index);
    if (!Number.isInteger(safeIndex) || safeIndex < 0 || safeIndex >= selectedTracks.value.length) return false;
    if (typeof player?.replaceQueueWithTracks !== "function") return false;
    return player.replaceQueueWithTracks(
      selectedTracks.value,
      safeIndex,
      true,
      {
        sourceType: 'mini-music-library',
        sourceCode: selectedPlaylist.value?.playlistCode || resolveVisiblePlaylistCode(),
        sourceName: selectedPlaylist.value?.name || '歌单'
      }
    );
  }

  return {
    initialized,
    loading,
    overviewLoading,
    playlistLoading,
    overviewError,
    playlistError,
    errorText,
    isAuthenticated,
    featuredPlaylists,
    corePlaylists,
    myPlaylists,
    sections,
    selectedPlaylistCode,
    selectedPlaylist,
    selectedTracks,
    loadOverview,
    ensureReady,
    selectPlaylist,
    refreshCurrentPlaylist,
    playTrackAt,
    handleAuthChanged
  };
}

export function useMiniMusicLibrary(options = {}) {
  return createMiniMusicLibraryEngine(options);
}
