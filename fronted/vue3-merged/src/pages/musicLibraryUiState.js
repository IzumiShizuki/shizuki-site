import { reactive, ref } from 'vue';
import { mapLegacyLevelsToBands10 } from '../utils/audioEngine/eqBands10Mapping';

const DEFAULT_PLAYLIST_CODE = 'default_public';
const DEFAULT_SEARCH_PROVIDERS = ['netease', 'kuwo', 'qq'];

export const MUSIC_PRIMARY_NAV = [
  { key: 'recommend', label: '推荐', icon: 'fas fa-house' },
  { key: 'playlist', label: '歌单', icon: 'fas fa-compact-disc' },
  { key: 'radio', label: '播客', icon: 'fas fa-podcast' }
];

function clamp01(value) {
  if (!Number.isFinite(value)) return 0;
  return Math.max(0, Math.min(1, value));
}

function normalizePath(path) {
  const value = String(path || '').trim();
  return value.startsWith('/') ? value : '/music-library/music';
}

function createMusicLibraryUiState() {
  const activeNav = ref(MUSIC_PRIMARY_NAV[0].key);
  const selectedPlaylistCode = ref(DEFAULT_PLAYLIST_CODE);
  const homeSearchKeyword = ref('');
  const globalSearchKeyword = ref('');
  const globalSearchType = ref('all');
  const globalSearchProviders = ref(DEFAULT_SEARCH_PROVIDERS.slice());
  const detailSearchByCode = reactive({});
  const leftDrawerOpen = ref(false);
  const rightDrawerOpen = ref(false);
  const expandedProvider = ref('');
  const eqLevels = ref([0.66, 0.52, 0.74]);
  // 10 段图形 EQ 电平（0..1，0.5 平坦），初始值由旧 3 段设置迁移而来；
  // 旧 eqLevels 保留，3 段 UI 与 shizuki:music:eq-change 事件仍向后兼容。
  const eqBands10 = ref(mapLegacyLevelsToBands10(eqLevels.value));
  const scrollTopByPath = reactive({});
  const lastContentPath = ref('/music-library/music');

  function setActiveNav(navKey) {
    const normalized = String(navKey || '').trim();
    if (!normalized) return;
    activeNav.value = normalized;
  }

  function setSelectedPlaylistCode(playlistCode) {
    const normalized = String(playlistCode || '').trim();
    if (!normalized) return;
    selectedPlaylistCode.value = normalized;
  }

  function setHomeSearchKeyword(keyword) {
    homeSearchKeyword.value = String(keyword || '').trimStart();
  }

  function setGlobalSearchKeyword(keyword) {
    globalSearchKeyword.value = String(keyword || '').trimStart();
  }

  function setGlobalSearchType(type) {
    const normalized = String(type || '').trim().toLowerCase();
    if (!normalized) return;
    if (!['all', 'playlist', 'track', 'artist'].includes(normalized)) return;
    globalSearchType.value = normalized;
  }

  function setGlobalSearchProviders(nextProviders) {
    if (!Array.isArray(nextProviders)) return;
    const normalized = nextProviders
      .map((item) => String(item || '').trim().toLowerCase())
      .filter((item) => item);
    const deduped = [...new Set(normalized)];
    globalSearchProviders.value = deduped.length ? deduped : DEFAULT_SEARCH_PROVIDERS.slice();
  }

  function toggleGlobalSearchProvider(provider) {
    const normalized = String(provider || '').trim().toLowerCase();
    if (!normalized) return;
    const set = new Set(globalSearchProviders.value);
    if (set.has(normalized)) {
      if (set.size <= 1) return;
      set.delete(normalized);
    } else {
      set.add(normalized);
    }
    globalSearchProviders.value = [...set];
  }

  function resetGlobalSearch() {
    globalSearchKeyword.value = '';
    globalSearchType.value = 'all';
    globalSearchProviders.value = DEFAULT_SEARCH_PROVIDERS.slice();
  }

  function setDetailSearchKeyword(playlistCode, keyword) {
    const code = String(playlistCode || '').trim();
    if (!code) return;
    detailSearchByCode[code] = String(keyword || '').trimStart();
  }

  function getDetailSearchKeyword(playlistCode) {
    const code = String(playlistCode || '').trim();
    if (!code) return '';
    return String(detailSearchByCode[code] || '');
  }

  function setLeftDrawerOpen(open) {
    leftDrawerOpen.value = Boolean(open);
  }

  function setRightDrawerOpen(open) {
    rightDrawerOpen.value = Boolean(open);
  }

  function closeDrawers() {
    leftDrawerOpen.value = false;
    rightDrawerOpen.value = false;
  }

  function setExpandedProvider(providerKey) {
    const normalized = String(providerKey || '').trim().toLowerCase();
    if (!normalized) {
      expandedProvider.value = '';
      return;
    }
    if (normalized === 'meting' || normalized === 'spotify') {
      expandedProvider.value = normalized;
    }
  }

  function setEqLevel(index, value) {
    if (!Number.isInteger(index) || index < 0 || index >= eqLevels.value.length) return;
    const next = eqLevels.value.slice();
    next[index] = clamp01(Number(value));
    eqLevels.value = next;
  }

  function setEqBand10(index, value) {
    if (!Number.isInteger(index) || index < 0 || index >= eqBands10.value.length) return;
    const next = eqBands10.value.slice();
    next[index] = clamp01(Number(value));
    eqBands10.value = next;
  }

  function setEqBands10(bands) {
    if (!Array.isArray(bands) || bands.length !== eqBands10.value.length) return;
    eqBands10.value = bands.map((item) => clamp01(Number(item)));
  }

  function rememberScroll(path, top) {
    const normalizedPath = normalizePath(path);
    const safeTop = Number.isFinite(Number(top)) ? Math.max(0, Number(top)) : 0;
    scrollTopByPath[normalizedPath] = safeTop;
  }

  function readScroll(path) {
    const normalizedPath = normalizePath(path);
    return Number(scrollTopByPath[normalizedPath] || 0);
  }

  function setLastContentPath(path) {
    lastContentPath.value = normalizePath(path);
  }

  return {
    activeNav,
    selectedPlaylistCode,
    homeSearchKeyword,
    globalSearchKeyword,
    globalSearchType,
    globalSearchProviders,
    leftDrawerOpen,
    rightDrawerOpen,
    expandedProvider,
    eqLevels,
    eqBands10,
    lastContentPath,
    setActiveNav,
    setSelectedPlaylistCode,
    setHomeSearchKeyword,
    setGlobalSearchKeyword,
    setGlobalSearchType,
    setGlobalSearchProviders,
    toggleGlobalSearchProvider,
    resetGlobalSearch,
    setDetailSearchKeyword,
    getDetailSearchKeyword,
    setLeftDrawerOpen,
    setRightDrawerOpen,
    closeDrawers,
    setExpandedProvider,
    setEqLevel,
    setEqBand10,
    setEqBands10,
    rememberScroll,
    readScroll,
    setLastContentPath
  };
}

let singleton;

export function useMusicLibraryUiState() {
  if (!singleton) {
    singleton = createMusicLibraryUiState();
  }
  return singleton;
}
