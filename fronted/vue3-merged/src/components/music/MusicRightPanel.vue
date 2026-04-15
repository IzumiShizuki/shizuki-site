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
          <header class="control-chip-head">
            <p class="control-title">
              <i class="fas fa-volume-high"></i>
              VOL
            </p>
            <p class="control-value">{{ Math.round(volume * 100) }}%</p>
          </header>
          <div class="control-range-row">
            <span class="range-bound">0</span>
            <input
              class="control-range"
              type="range"
              min="0"
              max="100"
              step="1"
              :value="Math.round(volume * 100)"
              :style="{ '--level-percent': `${Math.round(volume * 100)}%` }"
              @input="onVolumeInput"
            />
            <span class="range-bound">100</span>
          </div>
        </article>

        <article v-for="(item, idx) in eqItems" :key="item.label" class="control-chip eq-chip">
          <header class="control-chip-head">
            <p class="control-title">
              <i class="fas" :class="item.icon"></i>
              {{ item.label }}
            </p>
            <p class="control-value">{{ item.percentLabel }}</p>
          </header>
          <div class="control-range-row">
            <span class="range-bound">0</span>
            <input
              class="control-range eq"
              type="range"
              min="0"
              max="100"
              step="1"
              :value="item.percent"
              :style="{ '--level-percent': `${item.percent}%` }"
              @input="onEqInput($event, idx)"
            />
            <span class="range-bound">100</span>
          </div>
          <p class="control-sub-value">{{ item.dbLabel }}</p>
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

      <article class="integration-card source-mode-card">
        <header class="integration-head">
          <h4>音乐源策略</h4>
        </header>
        <label class="field-block">
          <span>优先模式</span>
          <select
            class="strategy-select"
            :value="sourceMode"
            :disabled="!isAuthenticated"
            @change="emit('update:source-mode', $event.target.value)"
          >
            <option value="account_first">账号优先</option>
            <option value="tunehub_first">TuneHub 优先</option>
            <option value="account_only">仅账号源</option>
            <option value="tunehub_only">仅 TuneHub</option>
          </select>
        </label>
        <div class="order-row">
          <p>账号源顺序</p>
          <div class="order-actions">
            <button
              v-for="(provider, index) in normalizedSourceProviderOrder"
              :key="`${provider}-${index}`"
              class="mini-btn ripple-trigger"
              type="button"
              :disabled="!isAuthenticated"
              @click="emit('move-source-provider', { provider, direction: index === 0 ? 'down' : 'up' })"
            >
              {{ providerLabel(provider) }}
            </button>
          </div>
        </div>
      </article>

      <article
        v-for="item in sourceCards"
        :key="item.provider"
        class="integration-card accordion-card"
        :class="{ expanded: expandedProviderKey === item.provider }"
      >
        <button class="provider-summary ripple-trigger" type="button" @click="toggleProvider(item.provider)">
          <div class="summary-main">
            <h4>{{ item.title }}</h4>
            <p>{{ item.summary }}</p>
          </div>
          <span class="bind-tag" :class="{ ok: item.bound }">{{ item.bound ? '已绑定' : '未绑定' }}</span>
          <i class="fas" :class="expandedProviderKey === item.provider ? 'fa-chevron-up' : 'fa-chevron-down'"></i>
        </button>
        <transition name="provider-expand">
          <div v-if="expandedProviderKey === item.provider" class="provider-detail">
            <p class="status-text">{{ item.statusText }}</p>
            <div class="row-actions">
              <button
                class="mini-btn primary ripple-trigger"
                type="button"
                :disabled="item.busy || item.bindBusy || !isAuthenticated"
                @click="emit('bind-source-account', item.provider)"
              >
                {{ item.bindBusy ? '绑定中...' : item.bound ? '重新绑定' : '一键绑定' }}
              </button>
              <button
                class="mini-btn ripple-trigger"
                type="button"
                :disabled="item.bindBusy"
                @click="emit('detect-source-helper')"
              >
                检测助手
              </button>
              <button
                v-if="!sourceHelperAvailable"
                class="mini-btn ripple-trigger"
                type="button"
                :disabled="item.bindBusy"
                @click="emit('open-source-helper-guide')"
              >
                安装助手
              </button>
              <button
                class="mini-btn ripple-trigger"
                type="button"
                :disabled="item.busy || !isAuthenticated"
                @click="emit('delete-source-cookie', item.provider)"
              >
                删除
              </button>
              <button
                class="mini-btn ripple-trigger"
                type="button"
                :disabled="item.importBusy || !isAuthenticated || !item.importSupported"
                @click="emit('import-source-playlists', item.provider)"
              >
                {{ item.importSupported ? (item.importBusy ? '导入中...' : '导入歌单') : '暂不支持导入' }}
              </button>
            </div>
            <details class="manual-fallback">
              <summary>高级手动绑定</summary>
              <label class="field-block">
                <span>Cookie</span>
                <input
                  :value="item.cookieInput"
                  type="password"
                  :placeholder="`输入 ${item.title} Cookie`"
                  :disabled="!isAuthenticated"
                  @input="emit('update:source-cookie', { provider: item.provider, value: $event.target.value })"
                />
              </label>
              <div class="row-actions">
                <button
                  class="mini-btn primary ripple-trigger"
                  type="button"
                  :disabled="item.busy || !isAuthenticated"
                  @click="emit('save-source-cookie', item.provider)"
                >
                  {{ item.busy ? '保存中...' : '保存 Cookie' }}
                </button>
              </div>
            </details>
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
  spotifyError: { type: String, default: '' },
  sourceMode: { type: String, default: 'tunehub_first' },
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
  'update:tunehubKeyInput',
  'save-tunehub-key',
  'delete-tunehub-key',
  'refresh-tunehub-status',
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
const normalizedSourceProviderOrder = computed(() => {
  const source = Array.isArray(props.sourceProviderOrder) ? props.sourceProviderOrder : [];
  const next = source.map((item) => String(item || '').trim().toLowerCase()).filter(Boolean);
  if (!next.length) {
    return ['netease', 'qqmusic', 'kugou'];
  }
  return next;
});
const SOURCE_CARD_ORDER = ['netease', 'qqmusic', 'kugou'];
const sourceCards = computed(() => {
  const statusMap = props.sourceAccounts && typeof props.sourceAccounts === 'object' ? props.sourceAccounts : {};
  const cookieMap = props.sourceCookieInputs && typeof props.sourceCookieInputs === 'object' ? props.sourceCookieInputs : {};
  const busyMap = props.sourceBusyMap && typeof props.sourceBusyMap === 'object' ? props.sourceBusyMap : {};
  const importBusyMap = props.sourceImportBusyMap && typeof props.sourceImportBusyMap === 'object' ? props.sourceImportBusyMap : {};
  const bindBusyMap = props.sourceBindBusyMap && typeof props.sourceBindBusyMap === 'object' ? props.sourceBindBusyMap : {};
  return SOURCE_CARD_ORDER.map((provider) => {
    const status = statusMap?.[provider] && typeof statusMap[provider] === 'object' ? statusMap[provider] : {};
    const bound = Boolean(status?.bound ?? status?.keyBound ?? status?.key_bound);
    const mask = String(status?.mask || status?.keyMask || status?.key_mask || '').trim();
    const bindBusy = Boolean(bindBusyMap?.[provider]);
    const helperState = props.sourceHelperAvailable ? '助手已就绪' : '助手未安装';
    const statusText = !props.isAuthenticated
      ? '登录后可配置'
      : bindBusy
        ? '绑定中：请在新打开页面完成登录'
        : bound
          ? (mask ? `已绑定：${mask}` : '已绑定')
          : helperState;
    return {
      provider,
      title: providerLabel(provider),
      bound,
      summary: mask || statusText,
      statusText,
      cookieInput: String(cookieMap?.[provider] || ''),
      busy: Boolean(busyMap?.[provider]),
      bindBusy,
      importBusy: Boolean(importBusyMap?.[provider]),
      importSupported: provider === 'netease'
    };
  });
});
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

function providerLabel(provider) {
  const normalized = String(provider || '').trim().toLowerCase();
  if (normalized === 'netease') return '网易云';
  if (normalized === 'qqmusic') return 'QQ 音乐';
  if (normalized === 'kugou') return '酷狗';
  return normalized || '未知平台';
}
</script>

<style scoped>
.music-right-panel {
  --liquid-bg: var(--theme-panel-surface);
  --liquid-border: var(--theme-border);
  --liquid-shadow: var(--theme-shadow-soft, 0 16px 30px rgba(8, 10, 18, 0.12));
  border-radius: 18px;
  padding: 14px 12px calc(var(--music-bottom-dock-height, 124px) + 12px);
  height: 100%;
  min-height: 0;
  overflow-y: auto;
  overflow-x: hidden;
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
  color: var(--theme-text-tertiary);
  text-transform: uppercase;
}

.head-text h3 {
  margin: 4px 0 0;
  font-size: 17px;
  color: var(--theme-text-primary);
}

.drawer-close {
  width: 30px;
  height: 30px;
  border-radius: 9px;
  border: 1px solid var(--theme-border-strong);
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
}

.track-card {
  display: grid;
  grid-template-columns: 58px 1fr;
  gap: 10px;
  border: 1px solid var(--theme-border);
  border-radius: 14px;
  background: var(--theme-surface-soft);
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
  color: var(--theme-text-primary);
}

.meta .artist {
  margin: 6px 0 0;
  font-size: 12px;
  color: var(--theme-text-secondary);
}

.lyric-card {
  border: 1px solid var(--theme-border-strong);
  border-radius: 14px;
  background: var(--theme-surface-soft);
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
  color: var(--theme-text-tertiary);
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
  color: var(--theme-text-tertiary);
  opacity: 0.68;
  transform: translateY(0);
  filter: blur(0.2px);
}

.lyric-card .line.current {
  font-size: 15px;
  line-height: 1.55;
  font-weight: 700;
  color: var(--theme-text-primary);
  text-shadow: none;
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
  border: 1px solid var(--theme-border-strong);
  border-radius: 14px;
  background: var(--theme-panel-surface);
    /* radial-gradient(120% 100% at 8% 0%, rgba(var(--accent-soft-rgb), 0.16), transparent 55%), */
    /* linear-gradient(150deg, rgba(255, 255, 255, 0.09), rgba(255, 255, 255, 0.04)); */
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
  color: var(--theme-text-secondary);
}

.control-head-sub {
  margin: 0;
  font-size: 10px;
  letter-spacing: 0.08em;
  color: var(--theme-text-tertiary);
}

.control-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 8px;
}

.control-chip {
  display: grid;
  align-content: center;
  gap: 6px;
  border: 1px solid var(--theme-border);
  border-radius: 11px;
  padding: 8px 10px;
  background: var(--theme-surface-soft);
  box-shadow:
    inset 0 1px 0 var(--theme-border-soft),
    0 6px 16px rgba(6, 10, 18, 0.22);
}

.eq-chip {
  background: var(--theme-surface-soft);
}

.control-chip-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.control-title {
  margin: 0;
  display: inline-flex;
  align-items: center;
  gap: 5px;
  font-size: 10px;
  letter-spacing: 0.1em;
  color: var(--theme-text-tertiary);
}

.control-title i {
  font-size: 10px;
  color: rgba(var(--accent-soft-rgb), 0.94);
}

.control-value {
  margin: 0;
  font-size: 12px;
  font-weight: 700;
  color: var(--theme-text-primary);
  white-space: nowrap;
}

.control-sub-value {
  margin: 0;
  font-size: 10px;
  color: var(--theme-text-tertiary);
}

.control-range-row {
  display: grid;
  grid-template-columns: 20px 1fr 26px;
  align-items: center;
  gap: 6px;
}

.range-bound {
  font-size: 10px;
  color: rgba(182, 196, 226, 0.82);
}

.control-range {
  -webkit-appearance: none;
  appearance: none;
  width: 100%;
  height: 20px;
  cursor: pointer;
  background: transparent;
}

.control-range.eq {
  filter: saturate(1.08);
}

.control-range::-webkit-slider-runnable-track {
  height: 8px;
  border-radius: 999px;
  background:
    linear-gradient(
      90deg,
      rgba(var(--accent-soft-rgb), 0.9) 0%,
      rgba(var(--accent-rgb), 0.72) var(--level-percent, 50%),
      var(--theme-border) var(--level-percent, 50%),
      var(--theme-surface-soft) 100%
    );
  border: 1px solid var(--theme-border-strong);
  box-shadow: inset 0 0 0 1px var(--theme-border-soft);
}

.control-range::-webkit-slider-thumb {
  -webkit-appearance: none;
  width: 14px;
  height: 14px;
  margin-top: -4px;
  border-radius: 50%;
  border: 2px solid var(--theme-surface-strong);
  background: linear-gradient(145deg, rgba(var(--accent-soft-rgb), 0.98), rgba(var(--accent-rgb), 0.94));
  box-shadow:
    0 0 0 3px rgba(var(--accent-rgb), 0.16),
    0 0 12px rgba(var(--accent-rgb), 0.52);
}

.control-range::-moz-range-track {
  height: 8px;
  border-radius: 999px;
  background:
    linear-gradient(
      90deg,
      rgba(var(--accent-soft-rgb), 0.9) 0%,
      rgba(var(--accent-rgb), 0.72) var(--level-percent, 50%),
      var(--theme-border) var(--level-percent, 50%),
      var(--theme-surface-soft) 100%
    );
  border: 1px solid var(--theme-border-strong);
  box-shadow: inset 0 0 0 1px var(--theme-border-soft);
}

.control-range::-moz-range-thumb {
  width: 14px;
  height: 14px;
  border-radius: 50%;
  border: 2px solid var(--theme-surface-strong);
  background: linear-gradient(145deg, rgba(var(--accent-soft-rgb), 0.98), rgba(var(--accent-rgb), 0.94));
  box-shadow:
    0 0 0 3px rgba(var(--accent-rgb), 0.16),
    0 0 12px rgba(var(--accent-rgb), 0.52);
}

@media (max-width: 1100px) {
  .control-grid {
    grid-template-columns: 1fr;
  }
}

.integration-panel {
  display: grid;
  gap: 8px;
}

.integration-card {
  border: 1px solid var(--theme-border);
  border-radius: 14px;
  background: var(--theme-surface-soft);
  padding: 8px;
  display: grid;
  gap: 8px;
}

.provider-summary {
  width: 100%;
  border: 0;
  border-radius: 10px;
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
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
  color: var(--theme-text-primary);
}

.summary-main p {
  margin: 4px 0 0;
  font-size: 11px;
  color: var(--theme-text-tertiary);
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.bind-tag {
  border-radius: 999px;
  padding: 2px 8px;
  font-size: 11px;
  color: rgba(var(--accent-soft-rgb), 0.94);
  background: var(--theme-surface-soft);
}

.bind-tag.ok {
  color: rgba(var(--accent-soft-rgb), 0.96);
  background: var(--theme-surface-soft);
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
  color: var(--theme-text-primary);
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
  color: var(--theme-text-tertiary);
}

.field-block input {
  border-radius: 9px;
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-text-primary);
  padding: 8px;
  outline: none;
}

.strategy-select {
  border-radius: 9px;
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-text-primary);
  padding: 8px;
  outline: none;
}

.order-row {
  display: grid;
  gap: 8px;
}

.order-row p {
  margin: 0;
  font-size: 11px;
  color: var(--theme-text-tertiary);
}

.order-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
}

.row-actions {
  display: flex;
  gap: 8px;
}

.mini-btn {
  border-radius: 8px;
  border: 1px solid var(--theme-border-strong);
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
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
  color: var(--theme-text-tertiary);
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
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-text-primary);
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
  border: 1px solid var(--theme-border);
  border-radius: 10px;
  padding: 8px;
  background: var(--theme-surface-soft);
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
  color: var(--theme-text-primary);
}

.spotify-meta .artist {
  margin-top: 4px;
  font-size: 11px;
  color: var(--theme-text-secondary);
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
    padding-bottom: 16px;
  }

  .music-right-panel.mobile.drawer-open {
    transform: translateX(0);
  }
}
</style>
