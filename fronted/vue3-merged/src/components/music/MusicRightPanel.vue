<template>
  <aside class="music-right-panel liquid-material" :class="{ mobile: isMobile, 'drawer-open': drawerOpen }">
    <header class="right-head">
      <div class="head-text">
        <p>Now Playing</p>
        <h3>歌词与播放信息</h3>
      </div>
      <button v-if="isMobile" class="drawer-close ripple-trigger" type="button" @click="emit('close-drawer')">
        <i class="fas fa-xmark"></i>
      </button>
    </header>

    <article class="track-card">
      <div class="cover" :style="coverStyle"></div>
      <div class="meta">
        <p class="title">{{ track?.title || '暂无歌曲' }}</p>
        <p class="artist">{{ track?.artist || '未知歌手' }}</p>
      </div>
    </article>

    <article class="lyric-card" :class="{ 'lyric-card--expanded': !expandedProviderKey }">
      <p class="label">实时歌词</p>
      <transition name="lyric-soft" mode="out-in">
        <div :key="lyricTransitionKey" class="lyric-triplet">
          <p class="line prev">{{ lyricDisplay.prev }}</p>
          <p class="line current">{{ lyricDisplay.current }}</p>
          <p class="line next">{{ lyricDisplay.next }}</p>
        </div>
      </transition>
    </article>

    <section class="control-panel">
      <header class="control-head">
        <p class="control-head-title">音频调节器</p>
        <p class="control-head-sub">实时生效</p>
      </header>

      <div class="control-grid">
        <article class="control-chip volume-chip">
          <p class="control-title">
            <i class="fas fa-volume-high"></i>
            VOL
          </p>
          <input
            class="vertical-range"
            type="range"
            min="0"
            max="100"
            :value="Math.round(volume * 100)"
            :style="{ '--level': `${Math.round(volume * 100)}%` }"
            @input="onVolumeInput"
          />
          <p class="control-value">{{ Math.round(volume * 100) }}%</p>
        </article>

        <article v-for="(item, idx) in eqItems" :key="item.label" class="control-chip eq-chip">
          <p class="control-title">
            <i class="fas" :class="item.icon"></i>
            {{ item.label }}
          </p>
          <input
            class="vertical-range eq"
            type="range"
            min="0"
            max="100"
            :value="Math.round(item.value * 100)"
            :style="{ '--level': `${Math.round(item.value * 100)}%` }"
            @input="onEqInput($event, idx)"
          />
          <p class="control-value">{{ item.dbLabel }}</p>
        </article>
      </div>
    </section>

    <section class="integration-panel">
      <article class="integration-card accordion-card" :class="{ expanded: isTunehubExpanded }">
        <button class="provider-summary ripple-trigger" type="button" @click="toggleProvider('tunehub')">
          <div class="summary-main">
            <h4>TuneHub</h4>
            <p>{{ tunehubSummary }}</p>
          </div>
          <span class="bind-tag" :class="{ ok: tunehubBound }">{{ tunehubBound ? '已绑定' : '未绑定' }}</span>
          <i class="fas" :class="isTunehubExpanded ? 'fa-chevron-up' : 'fa-chevron-down'"></i>
        </button>

        <transition name="provider-expand">
          <div v-if="isTunehubExpanded" class="provider-detail">
            <header class="integration-head">
              <h4>TuneHub Key</h4>
              <div class="head-actions">
                <button class="mini-btn ripple-trigger" type="button" @click="emit('open-music-authorization')">
                  用户中心
                </button>
                <button
                  class="mini-btn ripple-trigger"
                  type="button"
                  @click="emit('refresh-tunehub-status')"
                  :disabled="tunehubBusy || !isAuthenticated"
                >
                  <i class="fas fa-rotate-right"></i>
                </button>
              </div>
            </header>

            <label class="field-block">
              <span>API Key</span>
              <input
                :value="tunehubKeyInput"
                type="password"
                placeholder="输入 TuneHub API Key"
                :disabled="!isAuthenticated"
                @input="emit('update:tunehubKeyInput', $event.target.value)"
              />
            </label>

            <p class="status-text">{{ tunehubStatusText }}</p>

            <div class="row-actions">
              <button
                class="mini-btn primary ripple-trigger"
                type="button"
                @click="emit('save-tunehub-key')"
                :disabled="tunehubBusy || !isAuthenticated"
              >
                {{ tunehubBusy ? '保存中...' : '保存' }}
              </button>
              <button
                class="mini-btn ripple-trigger"
                type="button"
                @click="emit('delete-tunehub-key')"
                :disabled="tunehubBusy || !isAuthenticated"
              >
                删除
              </button>
            </div>
          </div>
        </transition>
      </article>

      <article class="integration-card accordion-card" :class="{ expanded: isSpotifyExpanded }">
        <button class="provider-summary ripple-trigger" type="button" @click="toggleProvider('spotify')">
          <div class="summary-main">
            <h4>Spotify</h4>
            <p>{{ spotifySummary }}</p>
          </div>
          <span class="bind-tag" :class="{ ok: spotifyBound }">{{ spotifyBound ? '已绑定' : '未绑定' }}</span>
          <i class="fas" :class="isSpotifyExpanded ? 'fa-chevron-up' : 'fa-chevron-down'"></i>
        </button>

        <transition name="provider-expand">
          <div v-if="isSpotifyExpanded" class="provider-detail">
            <div class="row-actions">
              <button class="mini-btn ripple-trigger" type="button" @click="emit('open-music-authorization')">
                用户中心
              </button>
              <button class="mini-btn primary ripple-trigger" type="button" @click="emit('bind-spotify')" :disabled="spotifyBusy || !isAuthenticated">
                {{ spotifyBusy ? '跳转中...' : spotifyBound ? '重新绑定' : '连接 Spotify（可选）' }}
              </button>
            </div>

            <div class="spotify-search-row">
              <input
                :value="spotifyQuery"
                type="text"
                placeholder="搜索 Spotify 曲目"
                :disabled="!spotifySearchReady"
                @input="emit('update:spotifyQuery', $event.target.value)"
                @keydown.enter.prevent="emit('search-spotify')"
              />
              <button class="mini-btn ripple-trigger" type="button" :disabled="spotifySearching || !spotifySearchReady" @click="emit('search-spotify')">
                {{ spotifySearching ? '搜索中...' : '搜索' }}
              </button>
            </div>

            <p v-if="spotifyPreviewMode && !spotifyBound" class="status-text">预览模式：未绑定也可搜索、试听与入队</p>
            <p v-else-if="spotifyPreviewMode && spotifyBound" class="status-text">已绑定账号：优先使用你的 Spotify 授权能力</p>
            <p v-else-if="!spotifyBound" class="status-text">先连接 Spotify 后可搜索与入队</p>
            <p v-if="spotifyError" class="status-text error">{{ spotifyError }}</p>

            <div class="spotify-results">
              <article v-for="item in spotifyResults" :key="item.trackId || item.id" class="spotify-item">
                <div class="spotify-meta">
                  <p class="song">{{ item.title || '未知歌曲' }}</p>
                  <p class="artist">{{ item.artist || '未知歌手' }}</p>
                </div>
                <div class="spotify-actions">
                  <button
                    class="mini-btn ripple-trigger"
                    type="button"
                    :disabled="!spotifySearchReady || (!item.previewUrl && !item.preview_url)"
                    @click="emit('preview-spotify', item)"
                  >
                    试听
                  </button>
                  <button class="mini-btn ripple-trigger" type="button" :disabled="!spotifySearchReady" @click="emit('enqueue-spotify', item)">
                    入队
                  </button>
                </div>
              </article>

              <p v-if="!spotifyResults.length" class="empty-tip">暂无 Spotify 搜索结果</p>
            </div>
          </div>
        </transition>
      </article>
    </section>
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
  tunehubKeyInput: { type: String, default: '' },
  tunehubStatus: { type: Object, default: () => ({ keyBound: false, keyMask: '', updatedAt: '' }) },
  tunehubBusy: { type: Boolean, default: false },
  spotifyBound: { type: Boolean, default: false },
  spotifyPreviewMode: { type: Boolean, default: true },
  spotifyBusy: { type: Boolean, default: false },
  spotifyQuery: { type: String, default: '' },
  spotifySearching: { type: Boolean, default: false },
  spotifyResults: { type: Array, default: () => [] },
  spotifyError: { type: String, default: '' }
});

const emit = defineEmits([
  'set-volume',
  'set-eq-level',
  'close-drawer',
  'update:expandedProvider',
  'update:tunehubKeyInput',
  'save-tunehub-key',
  'delete-tunehub-key',
  'refresh-tunehub-status',
  'open-music-authorization',
  'bind-spotify',
  'update:spotifyQuery',
  'search-spotify',
  'preview-spotify',
  'enqueue-spotify'
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
  return [
    {
      label: 'LOW',
      icon: 'fa-wave-square',
      value: Number(source[0] ?? 0.66),
      dbLabel: toEqDbLabel(source[0] ?? 0.66)
    },
    {
      label: 'MID',
      icon: 'fa-sliders',
      value: Number(source[1] ?? 0.52),
      dbLabel: toEqDbLabel(source[1] ?? 0.52)
    },
    {
      label: 'HIGH',
      icon: 'fa-signal',
      value: Number(source[2] ?? 0.74),
      dbLabel: toEqDbLabel(source[2] ?? 0.74)
    }
  ];
});

const expandedProviderKey = computed(() => String(props.expandedProvider || '').trim().toLowerCase());
const isTunehubExpanded = computed(() => expandedProviderKey.value === 'tunehub');
const isSpotifyExpanded = computed(() => expandedProviderKey.value === 'spotify');
const tunehubBound = computed(() => Boolean(props.tunehubStatus?.keyBound));

const tunehubSummary = computed(() => {
  if (!props.isAuthenticated) return '未登录';
  if (!tunehubBound.value) return '未绑定';
  const mask = String(props.tunehubStatus?.keyMask || '').trim();
  return mask || '已绑定';
});

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

const tunehubStatusText = computed(() => {
  if (!props.isAuthenticated) return '登录后可保存 TuneHub Key';
  if (tunehubBound.value) {
    const mask = String(props.tunehubStatus?.keyMask || '').trim();
    return mask ? `已绑定：${mask}` : '已绑定 Key';
  }
  return '未绑定 TuneHub Key';
});

function toggleProvider(provider) {
  const key = String(provider || '').trim().toLowerCase();
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
</script>

<style scoped>
.music-right-panel {
  --liquid-bg: linear-gradient(170deg, rgba(21, 24, 34, 0.78), rgba(17, 20, 29, 0.62));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 16px 30px rgba(8, 10, 18, 0.32);
  border-radius: 18px;
  padding: 14px 12px;
  height: 100%;
  min-height: 0;
  overflow: hidden;
  display: grid;
  align-content: start;
  gap: 10px;
}

.right-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.head-text p {
  margin: 0;
  font-size: 11px;
  letter-spacing: 0.12em;
  color: rgba(184, 194, 217, 0.72);
  text-transform: uppercase;
}

.head-text h3 {
  margin: 4px 0 0;
  font-size: 17px;
  color: rgba(238, 243, 255, 0.96);
}

.drawer-close {
  width: 30px;
  height: 30px;
  border-radius: 9px;
  border: 1px solid rgba(255, 255, 255, 0.24);
  background: rgba(255, 255, 255, 0.12);
  color: rgba(243, 247, 255, 0.92);
}

.track-card {
  display: grid;
  grid-template-columns: 58px 1fr;
  gap: 10px;
  border: 1px solid rgba(255, 255, 255, 0.14);
  border-radius: 14px;
  background: rgba(255, 255, 255, 0.08);
  padding: 8px;
}

.cover {
  width: 58px;
  height: 58px;
  border-radius: 10px;
  background-size: cover;
  background-position: center;
}

.meta .title {
  margin: 3px 0 0;
  font-size: 14px;
  color: rgba(240, 245, 255, 0.96);
}

.meta .artist {
  margin: 6px 0 0;
  font-size: 12px;
  color: rgba(174, 186, 214, 0.86);
}

.lyric-card {
  border: 1px solid rgba(255, 255, 255, 0.14);
  border-radius: 14px;
  background: linear-gradient(145deg, rgba(var(--accent-rgb), 0.2), rgba(var(--accent-soft-rgb), 0.14));
  padding: 10px;
  min-height: 86px;
}

.lyric-card.lyric-card--expanded {
  min-height: 146px;
}

.lyric-card .label {
  margin: 0;
  font-size: 11px;
  letter-spacing: 0.1em;
  color: rgba(188, 201, 227, 0.78);
  text-transform: uppercase;
}

.lyric-triplet {
  margin-top: 6px;
  display: grid;
  gap: 6px;
}

.lyric-card .line {
  margin: 0;
  transition: opacity 280ms ease, transform 320ms ease, filter 300ms ease;
}

.lyric-card .line.prev,
.lyric-card .line.next {
  font-size: 12px;
  color: rgba(183, 195, 220, 0.78);
  opacity: 0.68;
  transform: translateY(0);
  filter: blur(0.2px);
}

.lyric-card .line.current {
  font-size: 15px;
  line-height: 1.55;
  font-weight: 700;
  color: rgba(248, 251, 255, 0.98);
  text-shadow: 0 0 14px rgba(var(--accent-rgb), 0.2);
  opacity: 1;
}

.lyric-soft-enter-active,
.lyric-soft-leave-active {
  transition: opacity 320ms ease, transform 380ms cubic-bezier(0.22, 1, 0.36, 1), filter 320ms ease;
}

.lyric-soft-enter-from {
  opacity: 0;
  transform: translateY(10px) scale(0.98);
  filter: blur(4px);
}

.lyric-soft-leave-to {
  opacity: 0;
  transform: translateY(-8px) scale(0.99);
  filter: blur(4px);
}

.lyric-soft-enter-to,
.lyric-soft-leave-from {
  opacity: 1;
  transform: translateY(0) scale(1);
  filter: blur(0);
}

.control-panel {
  border: 1px solid rgba(255, 255, 255, 0.14);
  border-radius: 14px;
  background:
    radial-gradient(120% 100% at 8% 0%, rgba(var(--accent-soft-rgb), 0.16), transparent 55%),
    linear-gradient(150deg, rgba(255, 255, 255, 0.09), rgba(255, 255, 255, 0.04));
  padding: 10px 9px 12px;
  display: grid;
  gap: 10px;
}

.control-head {
  display: flex;
  align-items: baseline;
  justify-content: space-between;
}

.control-head-title {
  margin: 0;
  font-size: 12px;
  letter-spacing: 0.08em;
  color: rgba(234, 241, 255, 0.94);
}

.control-head-sub {
  margin: 0;
  font-size: 10px;
  letter-spacing: 0.08em;
  color: rgba(174, 188, 217, 0.82);
}

.control-grid {
  display: grid;
  grid-template-columns: repeat(4, minmax(0, 1fr));
  gap: 8px;
}

.control-chip {
  display: grid;
  justify-items: center;
  align-content: start;
  gap: 6px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  border-radius: 11px;
  padding: 7px 4px 6px;
  background: linear-gradient(180deg, rgba(255, 255, 255, 0.11), rgba(255, 255, 255, 0.04));
  box-shadow:
    inset 0 1px 0 rgba(255, 255, 255, 0.2),
    0 6px 16px rgba(6, 10, 18, 0.22);
}

.eq-chip {
  background: linear-gradient(180deg, rgba(var(--accent-rgb), 0.12), rgba(255, 255, 255, 0.04));
}

.control-title {
  margin: 0;
  display: inline-flex;
  align-items: center;
  gap: 5px;
  font-size: 10px;
  letter-spacing: 0.1em;
  color: rgba(191, 204, 231, 0.86);
}

.control-title i {
  font-size: 10px;
  color: rgba(var(--accent-soft-rgb), 0.94);
}

.control-value {
  margin: 0;
  font-size: 10px;
  font-weight: 600;
  color: rgba(238, 244, 255, 0.94);
}

.vertical-range {
  -webkit-appearance: slider-vertical;
  appearance: none;
  width: 18px;
  height: 120px;
  writing-mode: bt-lr;
  cursor: pointer;
  background: transparent;
  accent-color: rgb(var(--accent-strong-rgb));
}

.vertical-range.eq {
  accent-color: rgb(var(--accent-rgb));
  filter: saturate(1.08);
}

.vertical-range::-webkit-slider-runnable-track {
  width: 10px;
  border-radius: 999px;
  background:
    linear-gradient(
      180deg,
      rgba(var(--accent-soft-rgb), 0.88) 0%,
      rgba(var(--accent-rgb), 0.7) var(--level, 50%),
      rgba(255, 255, 255, 0.22) var(--level, 50%),
      rgba(255, 255, 255, 0.08) 100%
    );
  border: 1px solid rgba(255, 255, 255, 0.34);
  box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.12);
}

.vertical-range::-webkit-slider-thumb {
  -webkit-appearance: none;
  width: 15px;
  height: 15px;
  margin-top: -2px;
  border-radius: 50%;
  border: 2px solid rgba(236, 242, 255, 0.95);
  background: linear-gradient(145deg, rgba(var(--accent-soft-rgb), 0.98), rgba(var(--accent-rgb), 0.94));
  box-shadow:
    0 0 0 3px rgba(var(--accent-rgb), 0.16),
    0 0 12px rgba(var(--accent-rgb), 0.52);
}

.vertical-range::-moz-range-track {
  width: 10px;
  border-radius: 999px;
  background:
    linear-gradient(
      180deg,
      rgba(var(--accent-soft-rgb), 0.88) 0%,
      rgba(var(--accent-rgb), 0.7) var(--level, 50%),
      rgba(255, 255, 255, 0.22) var(--level, 50%),
      rgba(255, 255, 255, 0.08) 100%
    );
  border: 1px solid rgba(255, 255, 255, 0.34);
  box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.12);
}

.vertical-range::-moz-range-thumb {
  width: 15px;
  height: 15px;
  border-radius: 50%;
  border: 2px solid rgba(236, 242, 255, 0.95);
  background: linear-gradient(145deg, rgba(var(--accent-soft-rgb), 0.98), rgba(var(--accent-rgb), 0.94));
  box-shadow:
    0 0 0 3px rgba(var(--accent-rgb), 0.16),
    0 0 12px rgba(var(--accent-rgb), 0.52);
}

.integration-panel {
  display: grid;
  gap: 8px;
}

.integration-card {
  border: 1px solid rgba(255, 255, 255, 0.14);
  border-radius: 14px;
  background: rgba(255, 255, 255, 0.06);
  padding: 8px;
  display: grid;
  gap: 8px;
}

.provider-summary {
  width: 100%;
  border: 0;
  border-radius: 10px;
  background: rgba(var(--accent-rgb), 0.08);
  color: rgba(236, 243, 255, 0.94);
  padding: 8px 10px;
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto auto;
  align-items: center;
  gap: 8px;
  text-align: left;
}

.summary-main {
  min-width: 0;
}

.summary-main h4 {
  margin: 0;
  font-size: 13px;
  color: rgba(238, 244, 255, 0.95);
}

.summary-main p {
  margin: 4px 0 0;
  font-size: 11px;
  color: rgba(194, 206, 228, 0.88);
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.bind-tag {
  border-radius: 999px;
  padding: 2px 8px;
  font-size: 11px;
  color: rgba(var(--accent-soft-rgb), 0.94);
  background: rgba(var(--accent-rgb), 0.2);
}

.bind-tag.ok {
  color: rgba(var(--accent-soft-rgb), 0.96);
  background: rgba(var(--accent-rgb), 0.3);
}

.provider-detail {
  display: grid;
  gap: 10px;
  padding: 2px 2px 4px;
}

.provider-expand-enter-active,
.provider-expand-leave-active {
  overflow: hidden;
  transition:
    max-height 240ms cubic-bezier(0.22, 1, 0.36, 1),
    opacity 180ms ease,
    transform 220ms ease;
}

@media (prefers-reduced-motion: reduce) {
  .lyric-soft-enter-active,
  .lyric-soft-leave-active,
  .lyric-card .line {
    transition-duration: 1ms !important;
    transition-delay: 0ms !important;
  }
}

.provider-expand-enter-from,
.provider-expand-leave-to {
  max-height: 0;
  opacity: 0;
  transform: translateY(-4px);
}

.provider-expand-enter-to,
.provider-expand-leave-from {
  max-height: 420px;
  opacity: 1;
  transform: translateY(0);
}

.integration-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.integration-head h4 {
  margin: 0;
  font-size: 13px;
  color: rgba(238, 244, 255, 0.95);
}

.head-actions {
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.field-block {
  display: grid;
  gap: 6px;
}

.field-block span {
  font-size: 11px;
  color: rgba(188, 198, 220, 0.84);
}

.field-block input {
  border-radius: 9px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(240, 246, 255, 0.95);
  padding: 8px;
  outline: none;
}

.row-actions {
  display: flex;
  gap: 8px;
}

.mini-btn {
  border-radius: 8px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(236, 243, 255, 0.94);
  min-height: 30px;
  padding: 0 10px;
}

.mini-btn.primary {
  border-color: rgba(var(--accent-rgb), 0.58);
  background: rgba(var(--accent-rgb), 0.24);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.28);
}

.status-text {
  margin: 0;
  font-size: 12px;
  color: rgba(194, 206, 228, 0.88);
}

.status-text.error {
  color: rgba(var(--accent-soft-rgb), 0.98);
}

.spotify-search-row {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 8px;
}

.spotify-search-row input {
  border-radius: 9px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(240, 246, 255, 0.95);
  padding: 8px;
  outline: none;
}

.spotify-results {
  display: grid;
  gap: 8px;
  max-height: 220px;
  overflow: auto;
}

.spotify-item {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 8px;
  border: 1px solid rgba(255, 255, 255, 0.12);
  border-radius: 10px;
  padding: 8px;
  background: rgba(255, 255, 255, 0.04);
}

.spotify-meta {
  min-width: 0;
}

.spotify-meta .song,
.spotify-meta .artist {
  margin: 0;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.spotify-meta .song {
  font-size: 12px;
  color: rgba(242, 247, 255, 0.96);
}

.spotify-meta .artist {
  margin-top: 4px;
  font-size: 11px;
  color: rgba(178, 191, 218, 0.86);
}

.spotify-actions {
  display: flex;
  gap: 6px;
}

.empty-tip {
  margin: 0;
  font-size: 12px;
  color: rgba(178, 191, 218, 0.8);
}

@media (max-width: 900px) {
  .music-right-panel.mobile {
    position: fixed;
    right: 10px;
    top: 68px;
    bottom: 96px;
    width: min(78vw, 320px);
    z-index: 1220;
    transform: translateX(112%);
    transition: transform 260ms ease;
  }

  .music-right-panel.mobile.drawer-open {
    transform: translateX(0);
  }
}
</style>
