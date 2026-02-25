import { reactive, ref } from 'vue';

const DEFAULT_PLAYLIST_CODE = 'default_public';

export const MUSIC_PRIMARY_NAV = [
  { key: 'recommend', label: '推荐', icon: 'fas fa-house' },
  { key: 'playlist', label: '歌单', icon: 'fas fa-compact-disc' },
  { key: 'discover', label: '发现', icon: 'fas fa-sparkles' },
  { key: 'radio', label: '播客', icon: 'fas fa-podcast' }
];

function clamp01(value) {
  if (!Number.isFinite(value)) return 0;
  return Math.max(0, Math.min(1, value));
}

function normalizePath(path) {
  const value = String(path || '').trim();
  return value.startsWith('/') ? value : '/music-library';
}

function createMusicLibraryUiState() {
  const activeNav = ref(MUSIC_PRIMARY_NAV[0].key);
  const selectedPlaylistCode = ref(DEFAULT_PLAYLIST_CODE);
  const homeSearchKeyword = ref('');
  const detailSearchByCode = reactive({});
  const leftDrawerOpen = ref(false);
  const rightDrawerOpen = ref(false);
  const eqLevels = ref([0.66, 0.52, 0.74]);
  const scrollTopByPath = reactive({});
  const lastContentPath = ref('/music-library');

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

  function setEqLevel(index, value) {
    if (!Number.isInteger(index) || index < 0 || index >= eqLevels.value.length) return;
    const next = eqLevels.value.slice();
    next[index] = clamp01(Number(value));
    eqLevels.value = next;
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
    leftDrawerOpen,
    rightDrawerOpen,
    eqLevels,
    lastContentPath,
    setActiveNav,
    setSelectedPlaylistCode,
    setHomeSearchKeyword,
    setDetailSearchKeyword,
    getDetailSearchKeyword,
    setLeftDrawerOpen,
    setRightDrawerOpen,
    closeDrawers,
    setEqLevel,
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
