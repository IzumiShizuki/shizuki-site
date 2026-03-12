<template>
  <transition name="atmo-fade">
    <div v-if="visible" class="atmo-mask" @click.self="emit('close')">
      <section class="atmo-panel liquid-material" @click.stop>
        <header class="atmo-header">
          <div class="atmo-head-main">
            <p class="eyebrow">Menu Atmosphere Hub</p>
            <h2>氛围面板</h2>
            <p class="head-copy">音乐、环境音和特效在同一页同时操作，界面基线对齐站内浅色毛玻璃面板。</p>
          </div>

          <div class="section-strip">
            <button
              v-for="anchor in sectionAnchors"
              :key="anchor.key"
              class="section-chip ripple-trigger"
              type="button"
              @click="scrollToSection(anchor.key)"
            >
              <i :class="anchor.icon" aria-hidden="true"></i>
              <span>{{ anchor.label }}</span>
            </button>
          </div>

          <button class="close-btn ripple-trigger" type="button" @click="emit('close')">关闭</button>
        </header>

        <div class="panel-layout">
          <section ref="musicSectionRef" class="overview-card music-zone">
            <header class="block-head">
              <div>
                <p class="section-kicker">Mini Music Library</p>
                <h3>歌单与歌曲列表</h3>
              </div>
              <div class="block-actions">
                <button class="soft-btn ripple-trigger" type="button" @click="emit('music-refresh')">刷新</button>
                <button class="soft-btn primary ripple-trigger" type="button" @click="emit('open-music-library')">完整音乐库</button>
              </div>
            </header>

            <p v-if="musicLibraryState?.errorText" class="inline-note warning">{{ musicLibraryState.errorText }}</p>
            <p v-else-if="!isAuthenticated" class="inline-note">未登录时只展示默认/精选歌单；登录后会补充红心、创建和收藏歌单。</p>

            <div class="playlist-group-stack">
              <section v-for="group in musicGroups" :key="group.key" class="playlist-group">
                <div class="group-head">
                  <div>
                    <p class="mini-label">{{ group.caption }}</p>
                    <h4>{{ group.label }}</h4>
                  </div>
                  <span class="count-pill">{{ group.items.length }}</span>
                </div>

                <div class="playlist-grid">
                  <button
                    v-for="playlist in group.items"
                    :key="playlist.playlistCode"
                    class="playlist-card ripple-trigger"
                    :class="{ active: playlist.playlistCode === currentPlaylist.playlistCode }"
                    type="button"
                    @click="emit('music-select-playlist', playlist.playlistCode)"
                  >
                    <div class="playlist-cover">
                      <img v-if="playlist.cover" :src="playlist.cover" :alt="playlist.name" />
                      <div v-else class="playlist-fallback">
                        <i class="fas fa-compact-disc" aria-hidden="true"></i>
                      </div>
                    </div>
                    <div class="playlist-copy">
                      <strong>{{ playlist.name }}</strong>
                      <small>{{ playlist.description || '点击查看这个歌单的曲目列表。' }}</small>
                    </div>
                  </button>
                </div>
              </section>
            </div>

            <section class="track-sheet">
              <header class="track-head">
                <div>
                  <p class="mini-label">Playlist Tracks</p>
                  <h4>{{ currentPlaylist.name || '歌单曲目' }}</h4>
                </div>
                <span class="count-pill">{{ currentTracks.length }}</span>
              </header>

              <p v-if="musicLibraryState?.playlistLoading" class="inline-note">歌单加载中...</p>
              <p v-else-if="!currentTracks.length" class="empty-note">当前歌单没有可展示的曲目。</p>

              <div v-else class="track-list">
                <article
                  v-for="(track, index) in currentTracks"
                  :key="`${track.trackId}-${index}`"
                  class="track-row ripple-trigger"
                  role="button"
                  tabindex="0"
                  @click="emit('music-play-track', index)"
                  @keydown.enter.prevent="emit('music-play-track', index)"
                  @keydown.space.prevent="emit('music-play-track', index)"
                >
                  <span class="track-index">{{ String(index + 1).padStart(2, '0') }}</span>
                  <div class="track-cover">
                    <img v-if="track.cover" :src="track.cover" :alt="track.title" />
                    <div v-else class="track-cover-fallback"><i class="fas fa-music"></i></div>
                  </div>
                  <div class="track-copy">
                    <strong>{{ track.title }}</strong>
                    <small>{{ track.artist || '未知歌手' }}</small>
                  </div>
                  <span class="track-duration">{{ track.durationLabel || '--:--' }}</span>
                  <button class="row-action ripple-trigger" type="button" @click.stop="emit('music-play-track', index)">
                    播放
                  </button>
                </article>
              </div>
            </section>
          </section>

          <aside class="side-stack">
            <section class="overview-card summary-card">
              <header class="block-head compact">
                <div>
                  <p class="section-kicker">Now Playing</p>
                  <h3>当前播放</h3>
                </div>
              </header>

              <div class="summary-track">
                <div class="summary-cover">
                  <img v-if="musicTrack?.cover" :src="musicTrack.cover" alt="music-cover" />
                  <div v-else class="playlist-fallback"><i class="fas fa-music"></i></div>
                </div>
                <div class="summary-copy">
                  <strong>{{ musicTrack?.title || '当前未播放音乐' }}</strong>
                  <span>{{ musicTrack?.artist || '可以在左侧歌单中快速切歌。' }}</span>
                </div>
              </div>

              <div class="summary-actions">
                <button class="soft-btn ripple-trigger" type="button" @click="emit('music-prev')">
                  <i class="fas fa-backward-step"></i>
                </button>
                <button class="soft-btn primary ripple-trigger" type="button" @click="emit('music-toggle-play')">
                  <i :class="musicPlaying ? 'fas fa-pause' : 'fas fa-play'"></i>
                </button>
                <button class="soft-btn ripple-trigger" type="button" @click="emit('music-next')">
                  <i class="fas fa-forward-step"></i>
                </button>
              </div>
            </section>

            <section ref="ambientSectionRef" class="overview-card ambient-zone">
              <header class="block-head compact">
                <div>
                  <p class="section-kicker">Ambient Mixer</p>
                  <h3>环境音 / 白噪音</h3>
                </div>
                <div class="block-actions">
                  <button class="soft-btn ripple-trigger" type="button" @click="emit('ambient-mute-all')">全部静音</button>
                  <button class="soft-btn primary ripple-trigger" type="button" @click="openUploadPicker">
                    {{ uploading ? '上传中...' : isAuthenticated ? '上传环境音' : '临时上传' }}
                  </button>
                </div>
                <input ref="uploadInputRef" class="hidden-input" type="file" accept="audio/*" @change="onUploadChange" />
              </header>

              <label class="range-group">
                <span>总音量 {{ Math.round((ambientState?.ambient?.masterVolume || 0) * 100) }}%</span>
                <input
                  type="range"
                  min="0"
                  max="1"
                  step="0.01"
                  :value="ambientState?.ambient?.masterVolume || 0"
                  @input="emit('ambient-set-master-volume', Number($event.target.value))"
                />
              </label>

              <p v-if="mixerNeedsGesture" class="inline-note warning">
                浏览器需要一次用户手势来恢复环境音播放。
                <button class="inline-link" type="button" @click="emit('resume-ambient')">恢复播放</button>
              </p>
              <p v-if="uploadHint" class="inline-note">{{ uploadHint }}</p>

              <section class="mix-card">
                <div class="group-head">
                  <div>
                    <p class="mini-label">Current Mix</p>
                    <h4>正在混音的轨道</h4>
                  </div>
                  <div class="preset-actions">
                    <input v-model.trim="presetName" class="preset-input" type="text" maxlength="24" placeholder="保存当前预设" />
                    <button class="soft-btn ripple-trigger" type="button" @click="savePreset">保存预设</button>
                  </div>
                </div>

                <div v-if="enabledTracks.length" class="mix-list">
                  <article v-for="track in enabledTracks" :key="track.trackId" class="mix-row">
                    <div class="mix-copy">
                      <strong>{{ track.title }}</strong>
                      <small>{{ resolveTrackSourceLabel(track) }}</small>
                    </div>
                    <label class="mix-slider">
                      <input
                        type="range"
                        min="0"
                        max="1"
                        step="0.01"
                        :value="track.volume"
                        @input="emit('ambient-set-track-volume', { trackId: track.trackId, volume: Number($event.target.value) })"
                      />
                    </label>
                    <button class="row-action ripple-trigger" type="button" @click="emit('ambient-toggle-track', track)">关闭</button>
                  </article>
                </div>
                <p v-else class="empty-note">还没有激活的环境音。可以直接叠加多轨。</p>

                <div v-if="ambientState?.ambient?.presets?.length" class="preset-list">
                  <button
                    v-for="preset in ambientState.ambient.presets"
                    :key="preset.id"
                    class="preset-chip ripple-trigger"
                    type="button"
                    @click="emit('ambient-apply-preset', preset.id)"
                  >
                    <span>{{ preset.name }}</span>
                    <i class="fas fa-trash-can" aria-hidden="true" @click.stop="emit('ambient-delete-preset', preset.id)"></i>
                  </button>
                </div>
              </section>

              <section v-for="group in groupedLibrary" :key="group.key" class="playlist-group">
                <div class="group-head">
                  <div>
                    <p class="mini-label">{{ group.caption }}</p>
                    <h4>{{ group.label }}</h4>
                  </div>
                </div>
                <div class="library-grid">
                  <article
                    v-for="item in group.items"
                    :key="item.id"
                    class="ambient-card"
                    :class="{ active: Boolean(activeTrackMap[item.id]?.enabled) }"
                  >
                    <button class="cover-button ripple-trigger" type="button" :style="{ '--cover-bg': item.cover }" @click="emit('ambient-toggle-track', item)">
                      <div class="cover-gloss"></div>
                      <i :class="item.icon" aria-hidden="true"></i>
                      <span class="card-tag">{{ item.categoryLabel }}</span>
                    </button>
                    <div class="card-copy">
                      <div class="card-headline">
                        <strong>{{ item.label }}</strong>
                        <button
                          v-if="item.source !== 'builtin'"
                          class="icon-link"
                          type="button"
                          title="移除"
                          @click="emit('ambient-remove-track', item.id)"
                        >
                          <i class="fas fa-xmark"></i>
                        </button>
                      </div>
                      <p>{{ item.description }}</p>
                      <label v-if="activeTrackMap[item.id]" class="card-slider">
                        <span>音量 {{ Math.round(activeTrackMap[item.id].volume * 100) }}%</span>
                        <input
                          type="range"
                          min="0"
                          max="1"
                          step="0.01"
                          :value="activeTrackMap[item.id].volume"
                          @input="emit('ambient-set-track-volume', { trackId: item.id, volume: Number($event.target.value) })"
                        />
                      </label>
                    </div>
                  </article>
                </div>
              </section>
            </section>

            <section ref="effectsSectionRef" class="overview-card effects-zone">
              <header class="block-head compact">
                <div>
                  <p class="section-kicker">Scene Effects</p>
                  <h3>背景前景特效</h3>
                </div>
                <button class="soft-btn primary ripple-trigger" type="button" @click="emit('effect-toggle-enabled', !effectState.enabled)">
                  {{ effectState.enabled ? '关闭特效' : '开启特效' }}
                </button>
              </header>

              <p v-if="reducedMotion" class="inline-note warning">系统启用了“减少动态”，特效会自动降级或暂停。</p>

              <div class="range-grid">
                <label class="range-group">
                  <span>密度 {{ effectState.density.toFixed(2) }}</span>
                  <input
                    type="range"
                    min="0.4"
                    max="1.8"
                    step="0.01"
                    :value="effectState.density"
                    @input="emit('effect-set-density', Number($event.target.value))"
                  />
                </label>
                <label class="range-group">
                  <span>透明度 {{ Math.round(effectState.opacity * 100) }}%</span>
                  <input
                    type="range"
                    min="0"
                    max="1"
                    step="0.01"
                    :value="effectState.opacity"
                    @input="emit('effect-set-opacity', Number($event.target.value))"
                  />
                </label>
              </div>

              <div class="library-grid effect-grid">
                <article
                  v-for="preset in effectPresets"
                  :key="preset.id"
                  class="ambient-card effect-card"
                  :class="{ active: effectState.presetId === preset.id }"
                >
                  <button class="cover-button ripple-trigger" type="button" :style="{ '--cover-bg': preset.cover }" @click="emit('effect-select-preset', preset.id)">
                    <div class="cover-gloss"></div>
                    <span class="effect-preview" :class="`effect-preview-${preset.id}`"></span>
                  </button>
                  <div class="card-copy">
                    <div class="card-headline">
                      <strong>{{ preset.label }}</strong>
                    </div>
                    <p>{{ preset.description }}</p>
                  </div>
                </article>
              </div>
            </section>
          </aside>
        </div>
      </section>
    </div>
  </transition>
</template>

<script setup>
import { computed, ref } from 'vue';

const props = defineProps({
  visible: { type: Boolean, default: false },
  musicTrack: { type: Object, default: null },
  musicPlaying: { type: Boolean, default: false },
  musicLibraryState: {
    type: Object,
    default: () => ({
      loading: false,
      playlistLoading: false,
      errorText: '',
      sections: [],
      selectedPlaylist: { playlistCode: 'default_public', name: '默认歌单' },
      selectedTracks: []
    })
  },
  ambientState: {
    type: Object,
    default: () => ({
      ambient: { masterVolume: 0.65, tracks: [], presets: [] }
    })
  },
  ambientLibrary: { type: Array, default: () => [] },
  effectState: {
    type: Object,
    default: () => ({ enabled: false, presetId: 'none', density: 1, opacity: 0.7 })
  },
  effectPresets: { type: Array, default: () => [] },
  isAuthenticated: { type: Boolean, default: false },
  reducedMotion: { type: Boolean, default: false },
  uploading: { type: Boolean, default: false },
  uploadHint: { type: String, default: '' },
  mixerNeedsGesture: { type: Boolean, default: false }
});

const emit = defineEmits([
  'close',
  'music-toggle-play',
  'music-prev',
  'music-next',
  'music-refresh',
  'music-select-playlist',
  'music-play-track',
  'open-music-library',
  'ambient-toggle-track',
  'ambient-set-master-volume',
  'ambient-set-track-volume',
  'ambient-save-preset',
  'ambient-apply-preset',
  'ambient-delete-preset',
  'ambient-mute-all',
  'ambient-remove-track',
  'ambient-upload',
  'resume-ambient',
  'effect-toggle-enabled',
  'effect-select-preset',
  'effect-set-density',
  'effect-set-opacity'
]);

const uploadInputRef = ref(null);
const presetName = ref('');
const musicSectionRef = ref(null);
const ambientSectionRef = ref(null);
const effectsSectionRef = ref(null);

const sectionAnchors = [
  { key: 'music', label: '音乐', icon: 'fas fa-music' },
  { key: 'ambient', label: '环境音', icon: 'fas fa-sliders-h' },
  { key: 'effects', label: '特效', icon: 'fas fa-wand-magic-sparkles' }
];

const activeTrackMap = computed(() => {
  const map = {};
  (props.ambientState?.ambient?.tracks || []).forEach((track) => {
    map[track.trackId] = track;
  });
  return map;
});

const enabledTracks = computed(() =>
  (props.ambientState?.ambient?.tracks || []).filter((track) => Boolean(track.enabled))
);

const musicGroups = computed(() => (Array.isArray(props.musicLibraryState?.sections) ? props.musicLibraryState.sections : []));
const currentPlaylist = computed(() => props.musicLibraryState?.selectedPlaylist || { playlistCode: 'default_public', name: '默认歌单' });
const currentTracks = computed(() => (Array.isArray(props.musicLibraryState?.selectedTracks) ? props.musicLibraryState.selectedTracks : []));

const groupedLibrary = computed(() => {
  const groups = [
    { key: 'noise', label: '白噪音 / 噪声音景', caption: 'Noise Base', items: [] },
    { key: 'scene', label: '自然环境音', caption: 'Scene Sounds', items: [] },
    { key: 'upload', label: '我的上传', caption: 'Custom Uploads', items: [] }
  ];

  (props.ambientLibrary || []).forEach((item) => {
    const target =
      item.source === 'builtin' && item.category === 'noise'
        ? groups[0]
        : item.source === 'builtin'
          ? groups[1]
          : groups[2];
    target.items.push(item);
  });

  return groups.filter((group) => group.items.length);
});

function scrollToSection(sectionKey) {
  const refMap = {
    music: musicSectionRef,
    ambient: ambientSectionRef,
    effects: effectsSectionRef
  };
  refMap[sectionKey]?.value?.scrollIntoView?.({
    behavior: 'smooth',
    block: 'start'
  });
}

function openUploadPicker() {
  if (props.uploading) return;
  uploadInputRef.value?.click();
}

function onUploadChange(event) {
  const file = event?.target?.files?.[0];
  if (event?.target) {
    event.target.value = '';
  }
  if (!file) return;
  emit('ambient-upload', file);
}

function savePreset() {
  const value = String(presetName.value || '').trim();
  if (!value) return;
  emit('ambient-save-preset', value);
  presetName.value = '';
}

function resolveTrackSourceLabel(track) {
  if (track?.source === 'builtin') return '内置音源';
  if (track?.source === 'asset') return '账户上传';
  return '本次会话';
}
</script>

<style scoped>
.atmo-mask {
  position: fixed;
  inset: 0;
  z-index: 1200;
  display: grid;
  place-items: center;
  padding: 14px;
  background:
    radial-gradient(circle at 12% 10%, rgba(115, 182, 220, 0.22), transparent 34%),
    radial-gradient(circle at 88% 82%, rgba(255, 207, 170, 0.18), transparent 38%),
    rgba(8, 12, 18, 0.42);
  backdrop-filter: blur(6px) saturate(120%);
  -webkit-backdrop-filter: blur(6px) saturate(120%);
}

.atmo-panel {
  --liquid-bg: rgba(var(--glass-rgb), 0.4);
  --liquid-border: rgba(255, 255, 255, 0.48);
  --liquid-shadow: 0 18px 42px rgba(8, 12, 20, 0.24);
  width: min(1380px, calc(100vw - 20px));
  max-height: calc(100dvh - 20px);
  border-radius: 24px;
  padding: 16px;
  overflow: auto;
  color: rgba(24, 30, 40, 0.9);
  display: grid;
  gap: 16px;
}

.atmo-header {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto auto;
  gap: 12px;
  align-items: start;
}

.atmo-head-main {
  display: grid;
  gap: 4px;
}

.atmo-head-main h2,
.block-head h3,
.group-head h4,
.track-head h4 {
  margin: 0;
}

.head-copy,
.card-copy p,
.summary-copy span,
.mix-copy small,
.inline-note,
.empty-note {
  margin: 0;
  color: rgba(46, 57, 72, 0.72);
}

.eyebrow,
.section-kicker,
.mini-label {
  margin: 0;
  font-size: 11px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(82, 104, 132, 0.74);
}

.section-strip,
.block-actions,
.summary-actions,
.preset-actions,
.preset-list {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  align-items: center;
}

.section-strip {
  justify-content: flex-end;
}

.section-chip,
.close-btn,
.soft-btn,
.preset-chip,
.inline-link,
.row-action {
  border: 1px solid rgba(255, 255, 255, 0.42);
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.34);
  color: rgba(24, 30, 40, 0.84);
  transition: background-color 160ms ease, border-color 160ms ease, box-shadow 160ms ease, transform 160ms ease;
}

.section-chip,
.soft-btn,
.row-action {
  min-height: 36px;
  padding: 0 12px;
}

.section-chip {
  display: inline-flex;
  align-items: center;
  gap: 8px;
}

.close-btn {
  min-width: 64px;
  min-height: 36px;
  padding: 0 14px;
}

.soft-btn.primary {
  background: rgba(var(--accent-strong-rgb), 0.9);
  color: rgba(248, 245, 255, 0.96);
  border-color: rgba(var(--accent-strong-rgb), 0.9);
}

.section-chip:hover,
.soft-btn:hover,
.close-btn:hover,
.row-action:hover,
.preset-chip:hover {
  transform: translateY(-1px);
  box-shadow: 0 12px 24px rgba(17, 24, 36, 0.08);
}

.panel-layout {
  display: grid;
  grid-template-columns: minmax(0, 1.35fr) minmax(340px, 0.95fr);
  gap: 16px;
  align-items: start;
}

.side-stack {
  display: grid;
  gap: 16px;
}

.overview-card,
.mix-card,
.track-sheet {
  border-radius: 22px;
  border: 1px solid rgba(255, 255, 255, 0.42);
  background: rgba(255, 255, 255, 0.24);
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.28);
}

.music-zone,
.ambient-zone,
.effects-zone,
.summary-card {
  padding: 14px;
  display: grid;
  gap: 14px;
}

.block-head,
.group-head,
.track-head {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 12px;
}

.block-head.compact {
  align-items: center;
}

.count-pill {
  min-height: 28px;
  padding: 0 10px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  background: rgba(255, 255, 255, 0.46);
  color: rgba(37, 47, 61, 0.72);
  font-size: 12px;
}

.playlist-group-stack,
.playlist-group {
  display: grid;
  gap: 12px;
}

.playlist-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 12px;
}

.playlist-card {
  border: 1px solid rgba(255, 255, 255, 0.42);
  border-radius: 18px;
  background: rgba(255, 255, 255, 0.34);
  padding: 10px;
  display: grid;
  grid-template-columns: 72px minmax(0, 1fr);
  gap: 10px;
  text-align: left;
  color: inherit;
}

.playlist-card.active {
  border-color: rgba(var(--accent-strong-rgb), 0.7);
  background: rgba(var(--accent-strong-rgb), 0.12);
  box-shadow: 0 16px 28px rgba(var(--accent-rgb), 0.12);
}

.playlist-cover,
.summary-cover,
.track-cover {
  overflow: hidden;
  border-radius: 16px;
  background: rgba(255, 255, 255, 0.4);
}

.playlist-cover {
  width: 72px;
  height: 72px;
}

.summary-cover {
  width: 76px;
  height: 76px;
}

.track-cover {
  width: 42px;
  height: 42px;
}

.playlist-cover img,
.summary-cover img,
.track-cover img,
.playlist-fallback,
.track-cover-fallback {
  width: 100%;
  height: 100%;
  display: grid;
  place-items: center;
  object-fit: cover;
}

.playlist-fallback,
.track-cover-fallback {
  background: linear-gradient(155deg, rgba(131, 186, 225, 0.4), rgba(255, 226, 194, 0.42));
  color: rgba(47, 62, 84, 0.76);
}

.playlist-copy,
.track-copy,
.summary-copy,
.mix-copy,
.card-copy {
  display: grid;
  gap: 5px;
}

.playlist-copy small,
.track-copy small {
  color: rgba(65, 78, 95, 0.66);
  line-height: 1.5;
}

.track-sheet {
  padding: 14px;
  display: grid;
  gap: 12px;
}

.track-list {
  display: grid;
  gap: 8px;
}

.track-row {
  display: grid;
  grid-template-columns: 28px 42px minmax(0, 1fr) 52px auto;
  gap: 10px;
  align-items: center;
  border-radius: 16px;
  padding: 10px 12px;
  background: rgba(255, 255, 255, 0.32);
  outline: none;
}

.track-row:focus-visible {
  box-shadow: 0 0 0 2px rgba(var(--accent-strong-rgb), 0.4);
}

.track-index,
.track-duration {
  font-size: 12px;
  color: rgba(70, 83, 102, 0.68);
}

.track-copy strong,
.playlist-copy strong,
.summary-copy strong,
.mix-copy strong,
.card-headline strong {
  color: rgba(24, 30, 40, 0.9);
}

.summary-track {
  display: grid;
  grid-template-columns: 76px minmax(0, 1fr);
  gap: 12px;
  align-items: center;
}

.summary-actions {
  justify-content: flex-start;
}

.inline-note.warning {
  color: rgba(114, 80, 22, 0.92);
}

.range-group,
.mix-slider,
.card-slider {
  display: grid;
  gap: 8px;
}

.range-group span,
.card-slider span {
  font-size: 12px;
  color: rgba(66, 78, 96, 0.72);
}

input[type='range'] {
  width: 100%;
  accent-color: rgb(var(--accent-strong-rgb));
}

.mix-card {
  padding: 12px;
  display: grid;
  gap: 12px;
}

.preset-input {
  min-width: 180px;
  min-height: 36px;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.42);
  background: rgba(255, 255, 255, 0.36);
  color: rgba(24, 30, 40, 0.84);
  padding: 0 12px;
}

.mix-list {
  display: grid;
  gap: 8px;
}

.mix-row {
  display: grid;
  grid-template-columns: 160px minmax(0, 1fr) auto;
  gap: 10px;
  align-items: center;
  border-radius: 14px;
  padding: 10px;
  background: rgba(255, 255, 255, 0.32);
}

.preset-chip {
  min-height: 34px;
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 10px;
}

.library-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 12px;
}

.ambient-card {
  display: grid;
  gap: 10px;
  padding: 10px;
  border-radius: 18px;
  background: rgba(255, 255, 255, 0.32);
  border: 1px solid rgba(255, 255, 255, 0.38);
  transition: transform 160ms ease, border-color 160ms ease, box-shadow 160ms ease;
}

.ambient-card.active {
  border-color: rgba(var(--accent-strong-rgb), 0.65);
  box-shadow: 0 16px 26px rgba(var(--accent-rgb), 0.12);
  transform: translateY(-2px);
}

.cover-button {
  border: 0;
  border-radius: 16px;
  padding: 0;
  width: 100%;
  min-height: 144px;
  background: var(--cover-bg);
  position: relative;
  overflow: hidden;
  color: rgba(248, 251, 255, 0.96);
  display: grid;
  place-items: center;
}

.cover-button i,
.effect-preview {
  position: relative;
  z-index: 1;
}

.cover-button i {
  font-size: 34px;
}

.cover-gloss {
  position: absolute;
  inset: 0;
  background:
    radial-gradient(circle at 20% 18%, rgba(255, 255, 255, 0.46), transparent 24%),
    linear-gradient(180deg, rgba(255, 255, 255, 0.18), rgba(255, 255, 255, 0));
}

.card-tag {
  position: absolute;
  left: 10px;
  bottom: 10px;
  z-index: 1;
  min-height: 24px;
  padding: 0 10px;
  border-radius: 999px;
  background: rgba(15, 19, 28, 0.24);
  display: inline-flex;
  align-items: center;
  font-size: 11px;
}

.card-copy p {
  min-height: 40px;
  font-size: 13px;
  line-height: 1.5;
}

.card-headline {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
}

.icon-link {
  border: 0;
  background: transparent;
  color: rgba(48, 59, 74, 0.74);
}

.range-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.effect-grid .cover-button {
  min-height: 132px;
}

.effect-preview {
  width: 78px;
  height: 78px;
  border-radius: 999px;
  pointer-events: none;
}

.effect-preview-none {
  border: 1px dashed rgba(255, 255, 255, 0.56);
}

.effect-preview-sakura {
  background:
    radial-gradient(circle at 28% 30%, rgba(255, 255, 255, 0.56), transparent 18%),
    radial-gradient(circle at 64% 48%, rgba(255, 214, 228, 0.96), transparent 16%),
    radial-gradient(circle at 46% 70%, rgba(255, 201, 222, 0.76), transparent 14%);
}

.effect-preview-snow {
  background:
    radial-gradient(circle at 24% 28%, rgba(255, 255, 255, 0.92), transparent 12%),
    radial-gradient(circle at 66% 50%, rgba(232, 243, 255, 0.94), transparent 14%),
    radial-gradient(circle at 42% 72%, rgba(255, 255, 255, 0.74), transparent 10%);
}

.effect-preview-soft-rain {
  background:
    linear-gradient(120deg, rgba(255, 255, 255, 0) 28%, rgba(222, 236, 255, 0.72) 30%, rgba(255, 255, 255, 0) 34%),
    linear-gradient(120deg, rgba(255, 255, 255, 0) 52%, rgba(216, 231, 255, 0.8) 54%, rgba(255, 255, 255, 0) 58%);
}

.effect-preview-fireflies {
  background:
    radial-gradient(circle at 26% 28%, rgba(255, 232, 129, 0.96), transparent 18%),
    radial-gradient(circle at 64% 52%, rgba(255, 219, 108, 0.84), transparent 16%),
    radial-gradient(circle at 42% 72%, rgba(255, 235, 151, 0.7), transparent 12%);
}

.hidden-input {
  display: none;
}

.inline-link {
  min-height: auto;
  padding: 2px 10px;
  margin-left: 8px;
}

.atmo-fade-enter-active,
.atmo-fade-leave-active {
  transition: opacity 180ms ease;
}

.atmo-fade-enter-from,
.atmo-fade-leave-to {
  opacity: 0;
}

@media (max-width: 1120px) {
  .panel-layout {
    grid-template-columns: 1fr;
  }

  .side-stack {
    display: grid;
    gap: 16px;
  }
}

@media (max-width: 860px) {
  .atmo-header,
  .block-head,
  .group-head,
  .track-head,
  .mix-row,
  .range-grid {
    grid-template-columns: 1fr;
  }

  .atmo-header,
  .block-head,
  .group-head,
  .track-head {
    display: grid;
  }

  .playlist-grid,
  .library-grid {
    grid-template-columns: 1fr;
  }

  .track-row {
    grid-template-columns: 28px 42px minmax(0, 1fr);
  }

  .track-duration,
  .row-action {
    justify-self: start;
  }
}

@media (max-width: 640px) {
  .atmo-panel {
    width: calc(100vw - 12px);
    max-height: calc(100dvh - 12px);
    padding: 12px;
    border-radius: 20px;
  }

  .playlist-card,
  .summary-track {
    grid-template-columns: 60px minmax(0, 1fr);
  }

  .playlist-cover,
  .summary-cover {
    width: 60px;
    height: 60px;
  }
}
</style>
