<template>
  <aside class="music-right-panel liquid-material" :class="{ mobile: isMobile, 'drawer-open': drawerOpen }">
    <header class="right-head">
      <div class="head-text">
        <p class="overline">Now Playing</p>
        <h3 class="main-title">歌词与播放信息</h3>
      </div>
      <button v-if="isMobile" class="drawer-close ripple-trigger" type="button" @click="emit('close-drawer')">
        <i class="fas fa-xmark"></i>
      </button>
    </header>

    <div class="panel-sections">
      <article class="glass-card track-card highlight">
        <div class="cover-wrapper">
          <div class="cover" :style="coverStyle"></div>
          <div class="glow-effect"></div>
        </div>
        <div class="meta">
          <p class="title">{{ track?.title || '暂无歌曲' }}</p>
          <p class="artist">{{ track?.artist || '未知歌手' }}</p>
        </div>
      </article>

      <article class="glass-card lyric-card" :class="{ 'lyric-card--expanded': !expandedProviderKey }">
        <header class="card-head">
          <p class="card-label">实时歌词</p>
          <div class="indicator"></div>
        </header>
        <transition name="lyric-soft" mode="out-in">
          <div :key="lyricTransitionKey" class="lyric-triplet">
            <p class="line prev">{{ lyricDisplay.prev }}</p>
            <p class="line current">{{ lyricDisplay.current }}</p>
            <p class="line next">{{ lyricDisplay.next }}</p>
          </div>
        </transition>
      </article>

      <section class="glass-card mixer-card">
        <header class="card-head">
          <div class="head-info">
            <p class="card-label">音频调节器</p>
            <span class="status-pill">LIVE</span>
          </div>
        </header>

        <div class="mixer-grid">
          <article class="mixer-tile volume-tile">
            <div class="tile-header">
              <span class="tile-icon"><i class="fas fa-volume-high"></i></span>
              <span class="tile-label">Master VOL</span>
              <span class="tile-value">{{ Math.round(volume * 100) }}%</span>
            </div>
            <div class="slider-container">
              <input
                class="premium-range"
                type="range"
                min="0"
                max="100"
                step="1"
                :value="Math.round(volume * 100)"
                :style="{ '--level-percent': `${Math.round(volume * 100)}%` }"
                @input="onVolumeInput"
              />
            </div>
          </article>

          <article v-for="(item, idx) in eqItems" :key="item.label" class="mixer-tile">
            <div class="tile-header">
              <span class="tile-icon"><i class="fas" :class="item.icon"></i></span>
              <span class="tile-label">{{ item.label }} EQ</span>
              <div class="tile-stats">
                <span class="tile-value">{{ item.dbLabel }}</span>
              </div>
            </div>
            <div class="slider-container">
              <input
                class="premium-range eq"
                type="range"
                min="0"
                max="100"
                step="1"
                :value="item.percent"
                :style="{ '--level-percent': `${item.percent}%` }"
                @input="onEqInput($event, idx)"
              />
            </div>
          </article>
        </div>
      </section>

      <section class="integration-stack">
        <article class="glass-card integration-tile" :class="{ extended: isMetingExpanded }">
          <button class="tile-trigger ripple-trigger" type="button" @click="toggleProvider('meting')">
            <div class="tile-main">
              <div class="tile-brand">
                <i class="fas fa-bolt-lightning brand-icon"></i>
                <div class="brand-text">
                  <h4>Meting</h4>
                  <p>{{ metingSummary }}</p>
                </div>
              </div>
              <div class="tile-badge" :class="{ active: metingAvailable }">
                {{ metingAvailable ? 'ONLINE' : 'OFFLINE' }}
              </div>
            </div>
          </button>

          <transition name="provider-expand">
            <div v-if="isMetingExpanded" class="tile-expanded-content">
              <div class="status-box">{{ metingStatusText }}</div>
              <p class="helper-line">系统服务，无需用户 API Key</p>
              <div class="provider-tag-list">
                <span v-for="provider in metingProviders" :key="`meting-provider-${provider}`" class="provider-tag">
                  {{ providerLabel(provider) }}
                </span>
              </div>
              <div class="action-footer">
                <button
                  class="premium-btn subtle ripple-trigger"
                  type="button"
                  @click="emit('refresh-meting-status')"
                  :disabled="metingStatusBusy"
                >
                  刷新状态
                </button>
              </div>
            </div>
          </transition>
        </article>

        <article class="glass-card integration-tile" :class="{ extended: isSpotifyExpanded }">
          <button class="tile-trigger ripple-trigger" type="button" @click="toggleProvider('spotify')">
            <div class="tile-main">
              <div class="tile-brand">
                <i class="fab fa-spotify brand-icon spotify"></i>
                <div class="brand-text">
                  <h4>Spotify</h4>
                  <p>{{ spotifySummary }}</p>
                </div>
              </div>
              <div class="tile-badge" :class="{ active: spotifyBound }">
                {{ spotifyBound ? 'SYNCED' : 'READY' }}
              </div>
            </div>
          </button>

          <transition name="provider-expand">
            <div v-if="isSpotifyExpanded" class="tile-expanded-content">
              <div class="spotify-actions-top">
                <button class="premium-btn ghost ripple-trigger" @click="emit('open-music-authorization')">
                  Settings
                </button>
                <button class="premium-btn accent ripple-trigger" @click="emit('bind-spotify')" :disabled="spotifyBusy || !isAuthenticated">
                  {{ spotifyBound ? 'Reconnect' : 'Connect Account' }}
                </button>
              </div>

              <div class="search-widget">
                <div class="field-label">Music Discovery</div>
                <div class="input-with-action">
                  <input
                    :value="spotifyQuery"
                    type="text"
                    placeholder="Search Spotify..."
                    :disabled="!spotifySearchReady"
                    @input="emit('update:spotifyQuery', $event.target.value)"
                    @keydown.enter.prevent="emit('search-spotify')"
                  />
                  <button class="action-btn icon-only ripple-trigger" @click="emit('search-spotify')" :disabled="spotifySearching || !spotifySearchReady">
                    <i class="fas" :class="spotifySearching ? 'fa-spinner fa-spin' : 'fa-search'"></i>
                  </button>
                </div>
              </div>

              <div class="results-container">
                <div v-for="item in spotifyResults" :key="item.trackId || item.id" class="result-row">
                  <div class="res-meta">
                    <span class="res-title">{{ item.title }}</span>
                    <span class="res-artist">{{ item.artist }}</span>
                  </div>
                  <div class="res-actions">
                    <button class="mini-icon-btn ripple-trigger" @click="emit('preview-spotify', item)" :disabled="!item.previewUrl && !item.preview_url">
                      <i class="fas fa-play"></i>
                    </button>
                    <button class="mini-icon-btn ripple-trigger" @click="emit('enqueue-spotify', item)">
                      <i class="fas fa-plus"></i>
                    </button>
                  </div>
                </div>
                <p v-if="!spotifyResults.length" class="empty-notif">No tracks found</p>
              </div>
            </div>
          </transition>
        </article>
      </section>
    </div>
  </aside>
</template>

<script setup>
import { computed } from 'vue';
import { safeCssUrl } from '../../utils/url';

const props = defineProps({
  track: { type: Object, default: null },
  lyricLine: { type: String, default: '' },
  lyricContext: {
    type: Object,
    default: () => ({ prev: '', current: '', next: '' })
  },
  volume: { type: Number, default: 0.8 },
  eqLevels: { type: Array, default: () => [0.66, 0.52, 0.74] },
  isMobile: { type: Boolean, default: false },
  drawerOpen: { type: Boolean, default: false },
  isAuthenticated: { type: Boolean, default: false },
  expandedProvider: { type: String, default: '' },
  metingStatus: { type: Object, default: () => ({ available: false, providers: [] }) },
  metingStatusBusy: { type: Boolean, default: false },
  spotifyBound: { type: Boolean, default: false },
  spotifyPreviewMode: { type: Boolean, default: true },
  spotifyBusy: { type: Boolean, default: false },
  spotifyQuery: { type: String, default: '' },
  spotifySearching: { type: Boolean, default: false },
  spotifyResults: { type: Array, default: () => [] },
  spotifyError: { type: String, default: '' },
  sourceMode: { type: String, default: 'meting_first' },
  sourceProviderOrder: { type: Array, default: () => ['netease', 'qqmusic', 'kugou'] },
  sourceAccounts: { type: Object, default: () => ({}) },
  sourceCookieInputs: { type: Object, default: () => ({}) },
  sourceBusyMap: { type: Object, default: () => ({}) },
  sourceImportBusyMap: { type: Object, default: () => ({}) },
  sourceBindBusyMap: { type: Object, default: () => ({}) },
  sourceHelperAvailable: { type: Boolean, default: false }
});

const emit = defineEmits([
  'set-volume',
  'set-eq-level',
  'close-drawer',
  'update:expandedProvider',
  'refresh-meting-status',
  'open-music-authorization',
  'bind-spotify',
  'update:spotifyQuery',
  'search-spotify',
  'preview-spotify',
  'enqueue-spotify',
  'update:source-mode',
  'move-source-provider',
  'update:source-cookie',
  'save-source-cookie',
  'delete-source-cookie',
  'import-source-playlists',
  'bind-source-account',
  'detect-source-helper',
  'open-source-helper-guide'
]);

const coverStyle = computed(() => {
  const fallback = `${import.meta.env.BASE_URL}images/katanegai.jpg`;
  const safeCover = safeCssUrl(props.track?.cover || fallback);
  return {
    backgroundImage: safeCover ? `url('${safeCover}')` : 'none'
  };
});

function toEqDbLabel(rawValue) {
  const safe = Number.isFinite(Number(rawValue)) ? Number(rawValue) : 0.5;
  const db = Math.round((Math.max(0, Math.min(1, safe)) - 0.5) * 24);
  const prefix = db > 0 ? '+' : '';
  return `${prefix}${db}dB`;
}

const eqItems = computed(() => {
  const source = Array.isArray(props.eqLevels) ? props.eqLevels : [0.66, 0.52, 0.74];
  const clamp = (value, fallback) => {
    const parsed = Number(value);
    if (!Number.isFinite(parsed)) return fallback;
    return Math.max(0, Math.min(1, parsed));
  };
  const low = clamp(source[0], 0.66);
  const mid = clamp(source[1], 0.52);
  const high = clamp(source[2], 0.74);
  return [
    {
      label: 'LOW',
      icon: 'fa-wave-square',
      value: low,
      percent: Math.round(low * 100),
      percentLabel: `${Math.round(low * 100)}%`,
      dbLabel: toEqDbLabel(low)
    },
    {
      label: 'MID',
      icon: 'fa-sliders',
      value: mid,
      percent: Math.round(mid * 100),
      percentLabel: `${Math.round(mid * 100)}%`,
      dbLabel: toEqDbLabel(mid)
    },
    {
      label: 'HIGH',
      icon: 'fa-signal',
      value: high,
      percent: Math.round(high * 100),
      percentLabel: `${Math.round(high * 100)}%`,
      dbLabel: toEqDbLabel(high)
    }
  ];
});

const expandedProviderKey = computed(() => String(props.expandedProvider || '').trim().toLowerCase());
const isMetingExpanded = computed(() => expandedProviderKey.value === 'meting' || expandedProviderKey.value === 'tunehub');
const isSpotifyExpanded = computed(() => expandedProviderKey.value === 'spotify');
const metingAvailable = computed(() => Boolean(props.metingStatus?.available));
const metingProviders = computed(() => {
  const list = Array.isArray(props.metingStatus?.providers) ? props.metingStatus.providers : [];
  const normalized = list
    .map((item) => String(item || '').trim().toLowerCase())
    .map((item) => (item === 'qqmusic' || item === 'tencent' ? 'qq' : item))
    .filter((item) => ['netease', 'kuwo', 'qq'].includes(item));
  const deduped = [...new Set(normalized)];
  return deduped.length ? deduped : ['netease', 'kuwo', 'qq'];
});

const metingSummary = computed(() => (metingAvailable.value ? '系统服务已就绪' : '系统服务离线'));

const spotifySummary = computed(() => {
  if (props.spotifyPreviewMode && !props.spotifyBound) return '预览模式';
  if (!props.isAuthenticated) return '未登录';
  return props.spotifyBound ? '已绑定' : '未绑定';
});

const spotifySearchReady = computed(() => props.spotifyPreviewMode || props.spotifyBound);
const LYRIC_DEBUG_KEY = 'shizuki.music.debug.lyric';
let lastLyricDebugMode = '';

function lyricDebugEnabled() {
  if (typeof window === 'undefined') return false;
  try {
    const value = String(window.localStorage.getItem(LYRIC_DEBUG_KEY) || '').trim().toLowerCase();
    return value === '1' || value === 'true' || value === 'on';
  } catch {
    return false;
  }
}

function extractInlineLyricPreview(track) {
  const metadata = track?.metadata && typeof track.metadata === 'object' ? track.metadata : {};
  const raw = typeof track?.lyricText === 'string' && track.lyricText.trim()
    ? track.lyricText
    : typeof track?.lyric_text === 'string' && track.lyric_text.trim()
      ? track.lyric_text
      : typeof metadata?.lyricText === 'string' && metadata.lyricText.trim()
        ? metadata.lyricText
        : typeof metadata?.lyric_text === 'string' && metadata.lyric_text.trim()
          ? metadata.lyric_text
          : '';
  if (!raw.trim()) return '';
  const normalized = raw
    .replace(/\\r\\n/g, '\n')
    .replace(/\\n/g, '\n')
    .replace(/\\r/g, '\n')
    .replace(/\r\n/g, '\n')
    .replace(/\r/g, '\n')
    .trim();
  if (!normalized) return '';
  const first = normalized
    .split('\n')
    .map((line) => line.replace(/\[[^\]]+\]/g, '').trim())
    .find(Boolean);
  return String(first || '').trim();
}

const lyricDisplay = computed(() => {
  const raw = props.lyricContext && typeof props.lyricContext === 'object' ? props.lyricContext : {};
  const inlinePreview = extractInlineLyricPreview(props.track);
  const timelineLine = String(raw.current || props.lyricLine || '').trim();
  const current = String(timelineLine || inlinePreview || '').trim() || '纯音乐，无歌词';
  const renderMode = timelineLine ? 'timeline' : inlinePreview ? 'raw-fallback' : 'empty';
  if (lyricDebugEnabled() && renderMode !== lastLyricDebugMode) {
    lastLyricDebugMode = renderMode;
    // eslint-disable-next-line no-console
    console.info('[MUSIC_LYRIC_DEBUG] render_mode', {
      mode: renderMode,
      timelineLength: timelineLine.length,
      fallbackLength: inlinePreview.length
    });
  }
  return {
    prev: String(raw.prev || '').trim(),
    current,
    next: String(raw.next || '').trim()
  };
});

const lyricTransitionKey = computed(() => {
  const raw = props.lyricContext && typeof props.lyricContext === 'object' ? props.lyricContext : {};
  if (typeof raw.key === 'string' && raw.key.trim()) {
    return raw.key.trim();
  }
  return `${lyricDisplay.value.prev}|${lyricDisplay.value.current}|${lyricDisplay.value.next}`;
});

const metingStatusText = computed(() => {
  if (metingAvailable.value) {
    return `可用平台：${metingProviders.value.map((item) => providerLabel(item)).join(' / ')}`;
  }
  return 'Meting sidecar 当前不可用，请检查服务容器状态。';
});

function toggleProvider(provider) {
  const raw = String(provider || '').trim().toLowerCase();
  const key = raw === 'tunehub' ? 'meting' : raw;
  if (!key) return;
  if (expandedProviderKey.value === key) {
    emit('update:expandedProvider', '');
    return;
  }
  emit('update:expandedProvider', key);
}

function onVolumeInput(event) {
  const value = Number(event?.target?.value);
  emit('set-volume', Math.max(0, Math.min(1, value / 100)));
}

function onEqInput(event, index) {
  const value = Number(event?.target?.value);
  emit('set-eq-level', { index, value: Math.max(0, Math.min(1, value / 100)) });
}

function providerLabel(provider) {
  const normalized = String(provider || '').trim().toLowerCase();
  if (normalized === 'netease') return '网易云';
  if (normalized === 'kuwo') return '酷我';
  if (normalized === 'qq') return 'QQ 音乐';
  if (normalized === 'qqmusic') return 'QQ 音乐';
  if (normalized === 'kugou') return '酷狗';
  return normalized || '未知平台';
}

</script>

<style scoped>
.music-right-panel {
  --liquid-bg: var(--theme-panel-surface);
  --liquid-shadow: var(--theme-shadow-soft, 0 16px 40px rgba(0, 0, 0, 0.1));
  --card-bg: var(--theme-surface-soft);
  --accent-glow: rgba(var(--accent-rgb), 0.12);
  
  border-radius: 18px;
  padding: 16px 14px calc(var(--music-bottom-dock-height, 124px) + 16px);
  height: 100%;
  min-height: 0;
  overflow-y: auto;
  overflow-x: hidden;
  display: grid;
  align-content: start;
  gap: 16px;
  scrollbar-width: thin;
  scrollbar-color: var(--theme-border) transparent;
}

.right-head {
  padding: 4px 6px;
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.overline {
  margin: 0;
  font-size: 10px;
  font-weight: 700;
  letter-spacing: 0.15em;
  color: var(--music-soft-text-dim);
  text-transform: uppercase;
}

.main-title {
  margin: 0;
  font-size: 18px;
  font-weight: 800;
  color: var(--music-soft-text);
  letter-spacing: -0.01em;
}

.drawer-close {
  width: 32px;
  height: 32px;
  border-radius: 10px;
  border: 1px solid var(--music-soft-border-strong);
  background: var(--music-soft-fill);
  color: var(--music-soft-text);
  transition: all 0.2s cubic-bezier(0.2, 0, 0, 1);
}

.drawer-close:hover {
  transform: scale(1.08);
  border-color: rgba(var(--accent-rgb), 0.4);
}

.panel-sections {
  display: flex;
  flex-direction: column;
  gap: 12px;
}

/* Glass Card Architecture */
.glass-card {
  position: relative;
  background: var(--card-bg);
  border: 1px solid var(--theme-border-strong);
  border-radius: 16px;
  padding: 12px;
  box-shadow: var(--liquid-shadow);
  overflow: hidden;
  transition: transform 0.25s ease, box-shadow 0.25s ease;
}

.glass-card.highlight {
  border-color: rgba(var(--accent-rgb), 0.28);
  background: linear-gradient(135deg, var(--card-bg), var(--accent-glow));
}

.glass-card:hover {
  box-shadow: var(--theme-shadow-strong, 0 12px 30px rgba(0, 0, 0, 0.15));
}

/* Track Card */
.track-card {
  display: grid;
  grid-template-columns: 66px 1fr;
  gap: 14px;
  align-items: center;
}

.cover-wrapper {
  position: relative;
  width: 66px;
  height: 66px;
}

.cover {
  width: 100%;
  height: 100%;
  border-radius: 12px;
  background-size: cover;
  background-position: center;
  z-index: 2;
  position: relative;
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.25);
}

.glow-effect {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 80%;
  height: 80%;
  background: rgb(var(--accent-rgb));
  filter: blur(15px);
  opacity: 0.35;
  z-index: 1;
}

.meta .title {
  margin: 0;
  font-size: 15px;
  font-weight: 700;
  color: var(--theme-text-primary);
}

.meta .artist {
  margin: 4px 0 0;
  font-size: 13px;
  color: var(--theme-text-secondary);
}

/* Lyric Card */
.lyric-card {
  min-height: 96px;
}

.lyric-card--expanded {
  min-height: 156px;
}

.card-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-bottom: 8px;
}

.card-label {
  margin: 0;
  font-size: 11px;
  font-weight: 700;
  letter-spacing: 0.08em;
  color: var(--theme-text-tertiary);
  text-transform: uppercase;
}

.indicator {
  width: 4px;
  height: 4px;
  border-radius: 50%;
  background: rgb(var(--accent-strong-rgb));
  box-shadow: 0 0 8px rgba(var(--accent-rgb), 0.6);
}

.lyric-triplet {
  display: grid;
  gap: 8px;
}

.lyric-card .line {
  margin: 0;
  transition: all 0.3s ease;
}

.lyric-card .line.prev,
.lyric-card .line.next {
  font-size: 12px;
  color: var(--theme-text-tertiary);
  opacity: 0.55;
  filter: blur(0.4px);
}

.lyric-card .line.current {
  font-size: 16px;
  line-height: 1.45;
  font-weight: 700;
  color: var(--theme-text-primary);
}

/* Mixer Card (Audio Adjuster) */
.mixer-card {
  padding: 14px;
}

.head-info {
  display: flex;
  align-items: center;
  gap: 8px;
}

.status-pill {
  font-size: 9px;
  font-weight: 800;
  color: white;
  background: rgb(var(--accent-strong-rgb));
  padding: 1px 5px;
  border-radius: 4px;
  letter-spacing: 0.05em;
}

.mixer-grid {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  gap: 10px;
  margin-top: 4px;
}

.mixer-tile {
  background: var(--theme-surface-strong);
  border: 1px solid var(--theme-border);
  border-radius: 12px;
  padding: 10px;
  display: flex;
  flex-direction: column;
  gap: 8px;
}

.tile-header {
  display: flex;
  align-items: center;
  gap: 6px;
  font-size: 10px;
  font-weight: 700;
  color: var(--theme-text-tertiary);
}

.tile-icon {
  color: rgb(var(--accent-strong-rgb));
}

.tile-value {
  margin-left: auto;
  color: var(--theme-text-primary);
  font-family: monospace;
  font-size: 11px;
}

.slider-container {
  height: 20px;
  display: flex;
  align-items: center;
}

.premium-range {
  -webkit-appearance: none;
  appearance: none;
  width: 100%;
  height: 4px;
  border-radius: 2px;
  background: var(--theme-border);
  cursor: pointer;
  outline: none;
}

.premium-range::-webkit-slider-runnable-track {
  height: 4px;
  border-radius: 2px;
  background: linear-gradient(
    90deg,
    rgb(var(--accent-strong-rgb)) var(--level-percent, 0%),
    var(--theme-border) var(--level-percent, 0%)
  );
}

.premium-range::-webkit-slider-thumb {
  -webkit-appearance: none;
  width: 12px;
  height: 12px;
  margin-top: -4px;
  border-radius: 50%;
  background: white;
  border: 2px solid rgb(var(--accent-strong-rgb));
  box-shadow: 0 0 10px rgba(var(--accent-rgb), 0.4);
  transition: transform 0.15s ease;
}

.premium-range:hover::-webkit-slider-thumb {
  transform: scale(1.25);
}

/* Integration Stack */
.integration-stack {
  display: flex;
  flex-direction: column;
  gap: 10px;
}

.integration-tile {
  padding: 0;
}

.tile-trigger {
  width: 100%;
  padding: 12px;
  border: 0;
  background: transparent;
  text-align: left;
}

.tile-main {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.tile-brand {
  display: flex;
  align-items: center;
  gap: 12px;
}

.brand-icon {
  font-size: 20px;
  color: var(--theme-text-tertiary);
}

.brand-icon.spotify {
  color: #1ed760;
}

.brand-icon.netease {
  color: #e03f3f;
}

.brand-icon.qqmusic {
  color: #12b7f5;
}

.brand-icon.kugou {
  color: #00a1d6;
}

.brand-text h4 {
  margin: 0;
  font-size: 14px;
  font-weight: 700;
  color: var(--music-soft-text);
}

.brand-text p {
  margin: 2px 0 0;
  font-size: 11px;
  color: var(--music-soft-text-muted);
}

.tile-badge {
  font-size: 9px;
  font-weight: 800;
  color: var(--music-soft-text);
  border: 1px solid var(--music-soft-border);
  background: var(--music-soft-fill);
  padding: 2px 6px;
  border-radius: 6px;
}

.tile-badge.active {
  color: var(--music-accent-text, var(--accent-mode-text));
  background: var(--accent-mode-fill-strong);
  border-color: var(--accent-mode-border-strong);
  box-shadow: 0 6px 16px rgba(var(--accent-rgb), 0.18);
}

.tile-expanded-content {
  padding: 0 12px 14px;
  display: flex;
  flex-direction: column;
  gap: 12px;
}

/* Premium Inputs & Buttons */
.premium-field {
  display: flex;
  flex-direction: column;
  gap: 6px;
}

.field-label {
  font-size: 10px;
  font-weight: 700;
  color: var(--music-soft-text-dim);
  text-transform: uppercase;
}

.input-with-action {
  position: relative;
  display: flex;
  gap: 6px;
}

.input-with-action input {
  flex: 1;
  background: var(--music-soft-fill);
  border: 1px solid var(--music-soft-border);
  border-radius: 10px;
  padding: 8px 12px;
  font-size: 12px;
  color: var(--music-soft-text);
  outline: none;
  transition: border-color 0.2s ease;
}

.input-with-action input:focus {
  border-color: rgb(var(--accent-strong-rgb));
}

.action-btn {
  width: 36px;
  background: var(--music-soft-fill);
  border: 1px solid var(--music-soft-border);
  border-radius: 10px;
  color: var(--music-soft-text);
}

.action-footer {
  display: flex;
  gap: 8px;
}

.premium-btn {
  flex: 1;
  height: 36px;
  border-radius: 10px;
  font-size: 12px;
  font-weight: 700;
  border: 1px solid transparent;
  transition: all 0.2s ease;
}

.premium-btn.accent {
  background: var(--accent-mode-fill-strong);
  color: var(--music-accent-text, var(--accent-mode-text));
  border-color: var(--accent-mode-border-strong);
}

.premium-btn.accent:hover {
  filter: brightness(1.1);
  box-shadow: 0 4px 12px rgba(var(--accent-rgb), 0.3);
}

.premium-btn.subtle {
  background: var(--music-soft-fill);
  border-color: var(--music-soft-border);
  color: var(--music-soft-text);
}

.premium-btn.ghost {
  background: transparent;
  border-color: var(--music-soft-border);
  color: var(--music-soft-text);
}

.premium-btn.danger {
  background: rgba(255, 68, 68, 0.1);
  color: #ff4444;
  border-color: rgba(255, 68, 68, 0.2);
}

/* Animations & Transitions */
.provider-expand-enter-active,
.provider-expand-leave-active {
  transition: all 0.35s cubic-bezier(0.3, 0, 0, 1);
  max-height: 500px;
  overflow: hidden;
}

.provider-expand-enter-from,
.provider-expand-leave-to {
  max-height: 0;
  opacity: 0;
  transform: translateY(-10px);
}

/* Spotify Detail Specifics */
.spotify-actions-top {
  display: flex;
  gap: 8px;
}

.search-widget {
  display: flex;
  flex-direction: column;
  gap: 6px;
}

.results-container {
  max-height: 180px;
  overflow-y: auto;
  border: 1px solid var(--music-soft-border);
  border-radius: 10px;
  background: var(--music-soft-fill);
}

.result-row {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 8px 10px;
  border-bottom: 1px solid var(--theme-border-soft);
}

.res-meta {
  display: flex;
  flex-direction: column;
  min-width: 0;
}

.res-title {
  font-size: 12px;
  font-weight: 700;
  color: var(--music-soft-text);
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.res-artist {
  font-size: 11px;
  color: var(--music-soft-text-dim);
}

.res-actions {
  display: flex;
  gap: 4px;
}

.mini-icon-btn {
  width: 26px;
  height: 26px;
  border-radius: 6px;
  background: var(--music-soft-fill);
  border: 1px solid var(--music-soft-border);
  font-size: 10px;
  display: grid;
  place-items: center;
  color: var(--music-soft-text);
}

.empty-notif {
  padding: 16px;
  text-align: center;
  font-size: 11px;
  color: var(--music-soft-text-dim);
}

.status-box {
  background: var(--music-soft-fill);
  padding: 8px;
  border-radius: 8px;
  font-size: 11px;
  color: var(--music-soft-text-muted);
  border: 1px solid var(--music-soft-border);
}

.helper-line {
  margin: 0;
  font-size: 11px;
  color: var(--music-soft-text-dim);
}

.provider-tag-list {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
}

.provider-tag {
  border: 1px solid var(--music-soft-border);
  border-radius: 999px;
  padding: 2px 8px;
  font-size: 10px;
  color: var(--music-soft-text);
  background: var(--music-soft-fill);
}

@media (max-width: 900px) {
  .music-right-panel.mobile {
    position: fixed;
    right: 12px;
    top: 72px;
    bottom: 108px;
    width: min(85vw, 340px);
    z-index: 1220;
    transform: translateX(115%);
    transition: transform 0.4s cubic-bezier(0.1, 0, 0, 1);
    background: var(--theme-panel-surface);
    backdrop-filter: blur(20px);
  }

  .music-right-panel.mobile.drawer-open {
    transform: translateX(0);
    box-shadow: 0 20px 60px rgba(0,0,0,0.3);
  }
}
</style>
