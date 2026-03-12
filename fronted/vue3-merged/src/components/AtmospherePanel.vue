<template>
  <transition name="atmo-fade">
    <div v-if="visible" class="atmo-mask" @click.self="emit('close')">
      <section class="atmo-panel liquid-material" @click.stop>
        <header class="atmo-header">
          <div class="atmo-head-main">
            <p class="eyebrow">Atmosphere System</p>
            <h2>氛围面板</h2>
          </div>
          <div class="tab-strip">
            <button
              v-for="tab in tabs"
              :key="tab.key"
              class="tab-chip ripple-trigger"
              :class="{ active: activeTab === tab.key }"
              type="button"
              @click="emit('set-tab', tab.key)"
            >
              <i :class="tab.icon" aria-hidden="true"></i>
              <span>{{ tab.label }}</span>
            </button>
          </div>
          <button class="close-btn ripple-trigger" type="button" @click="emit('close')">关闭</button>
        </header>

        <section v-if="activeTab === 'music'" class="panel-body music-body">
          <article class="hero-card music-hero">
            <div class="hero-cover music-cover">
              <img v-if="musicTrack?.cover" :src="musicTrack.cover" alt="music-cover" />
              <div v-else class="fallback-cover"><i class="fas fa-music"></i></div>
            </div>
            <div class="hero-copy">
              <p class="section-kicker">Global Music</p>
              <h3>{{ musicTrack?.title || '当前未播放音乐' }}</h3>
              <p>{{ musicTrack?.artist || '可以继续使用现有播放器和音乐库。' }}</p>
              <div class="music-controls">
                <button class="action-btn ripple-trigger" type="button" @click="emit('music-prev')">
                  <i class="fas fa-backward-step"></i>
                </button>
                <button class="action-btn primary ripple-trigger" type="button" @click="emit('music-toggle-play')">
                  <i :class="musicPlaying ? 'fas fa-pause' : 'fas fa-play'"></i>
                </button>
                <button class="action-btn ripple-trigger" type="button" @click="emit('music-next')">
                  <i class="fas fa-forward-step"></i>
                </button>
                <button class="action-btn ripple-trigger" type="button" @click="emit('open-music-library')">音乐库</button>
              </div>
            </div>
          </article>
        </section>

        <section v-else-if="activeTab === 'ambient'" class="panel-body ambient-body">
          <div class="toolbar-row">
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
            <div class="toolbar-actions">
              <button class="action-btn ripple-trigger" type="button" @click="emit('ambient-mute-all')">全部静音</button>
              <button class="action-btn primary ripple-trigger" type="button" @click="openUploadPicker">
                {{ uploading ? '上传中...' : isAuthenticated ? '上传环境音' : '临时上传' }}
              </button>
              <input ref="uploadInputRef" class="hidden-input" type="file" accept="audio/*" @change="onUploadChange" />
            </div>
          </div>

          <p v-if="mixerNeedsGesture" class="panel-note">
            浏览器需要一次用户手势来恢复环境音播放。
            <button class="inline-link" type="button" @click="emit('resume-ambient')">恢复播放</button>
          </p>
          <p v-if="uploadHint" class="panel-note">{{ uploadHint }}</p>
          <p v-if="reducedMotion" class="panel-note">系统启用了“减少动态”，特效会自动降级，但环境音不受影响。</p>

          <section class="mix-card">
            <div class="mix-card-head">
              <div>
                <p class="section-kicker">Current Mix</p>
                <h3>正在混音的环境音</h3>
              </div>
              <div class="preset-actions">
                <input v-model.trim="presetName" class="preset-input" type="text" maxlength="24" placeholder="保存当前预设" />
                <button class="action-btn ripple-trigger" type="button" @click="savePreset">保存预设</button>
              </div>
            </div>

            <div v-if="enabledTracks.length" class="mix-list">
              <article v-for="track in enabledTracks" :key="track.trackId" class="mix-row">
                <div class="mix-copy">
                  <strong>{{ track.title }}</strong>
                  <small>{{ track.source === 'builtin' ? '内置音源' : track.source === 'asset' ? '账户上传' : '本次会话' }}</small>
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
                <button class="chip-btn ripple-trigger" type="button" @click="emit('ambient-toggle-track', track)">关闭</button>
              </article>
            </div>
            <p v-else class="empty-note">还没有激活的环境音。可以从下方卡片直接叠加多轨。</p>

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

          <section v-for="group in groupedLibrary" :key="group.key" class="library-group">
            <div class="group-head">
              <div>
                <p class="section-kicker">{{ group.caption }}</p>
                <h3>{{ group.label }}</h3>
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

        <section v-else class="panel-body effects-body">
          <article class="hero-card effect-hero">
            <div class="hero-copy">
              <p class="section-kicker">Scene Effects</p>
              <h3>覆盖在背景前的轻量动态层</h3>
              <p>特效默认关闭。开启后全站生效，非首页会自动降低透明度，避免压住正文内容。</p>
              <div class="toolbar-actions">
                <button class="action-btn primary ripple-trigger" type="button" @click="emit('effect-toggle-enabled', !effectState.enabled)">
                  {{ effectState.enabled ? '关闭特效' : '开启特效' }}
                </button>
              </div>
            </div>
          </article>

          <div class="toolbar-row">
            <label class="range-group">
              <span>密度 {{ effectState.density.toFixed(2) }}</span>
              <input type="range" min="0.4" max="1.8" step="0.01" :value="effectState.density" @input="emit('effect-set-density', Number($event.target.value))" />
            </label>
            <label class="range-group">
              <span>透明度 {{ Math.round(effectState.opacity * 100) }}%</span>
              <input type="range" min="0" max="1" step="0.01" :value="effectState.opacity" @input="emit('effect-set-opacity', Number($event.target.value))" />
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
      </section>
    </div>
  </transition>
</template>

<script setup>
import { computed, ref } from 'vue';

const props = defineProps({
  visible: { type: Boolean, default: false },
  activeTab: { type: String, default: 'ambient' },
  musicTrack: { type: Object, default: null },
  musicPlaying: { type: Boolean, default: false },
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
  'set-tab',
  'music-toggle-play',
  'music-prev',
  'music-next',
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
const tabs = [
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
</script>

<style scoped>
.atmo-mask {
  position: fixed;
  inset: 0;
  z-index: 1200;
  display: grid;
  place-items: center;
  padding: 16px;
  background:
    radial-gradient(circle at 12% 12%, rgba(132, 182, 255, 0.22), transparent 38%),
    radial-gradient(circle at 88% 84%, rgba(243, 169, 220, 0.18), transparent 40%),
    rgba(6, 11, 19, 0.6);
  backdrop-filter: blur(10px) saturate(115%);
  -webkit-backdrop-filter: blur(10px) saturate(115%);
}

.atmo-panel {
  --liquid-bg: linear-gradient(165deg, rgba(8, 18, 32, 0.84), rgba(10, 16, 28, 0.78));
  --liquid-border: rgba(171, 204, 235, 0.28);
  --liquid-shadow: 0 26px 60px rgba(2, 7, 14, 0.5);
  width: min(1120px, calc(100vw - 22px));
  max-height: calc(100dvh - 24px);
  border-radius: 26px;
  padding: 18px;
  color: rgba(231, 239, 248, 0.96);
  overflow: auto;
  display: grid;
  gap: 16px;
}

.atmo-header {
  display: grid;
  grid-template-columns: auto 1fr auto;
  gap: 14px;
  align-items: center;
}

.atmo-head-main h2,
.group-head h3,
.mix-card-head h3,
.hero-copy h3 {
  margin: 0;
}

.eyebrow,
.section-kicker {
  margin: 0 0 6px;
  font-size: 11px;
  letter-spacing: 0.18em;
  text-transform: uppercase;
  color: rgba(160, 199, 229, 0.8);
}

.tab-strip {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 8px;
}

.tab-chip,
.close-btn,
.action-btn,
.chip-btn,
.preset-chip,
.inline-link {
  border: 1px solid rgba(173, 206, 231, 0.24);
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.08);
  color: inherit;
}

.tab-chip {
  min-height: 40px;
  padding: 0 14px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
}

.tab-chip.active {
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
  box-shadow: 0 12px 22px rgba(var(--accent-rgb), 0.18);
}

.close-btn,
.action-btn,
.chip-btn {
  min-height: 38px;
  padding: 0 14px;
}

.action-btn.primary {
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.28));
}

.panel-body {
  display: grid;
  gap: 16px;
}

.hero-card,
.mix-card {
  border-radius: 22px;
  background: rgba(255, 255, 255, 0.08);
  border: 1px solid rgba(176, 208, 233, 0.18);
}

.music-hero,
.effect-hero {
  padding: 16px;
  display: grid;
  grid-template-columns: 180px minmax(0, 1fr);
  gap: 16px;
}

.hero-cover {
  border-radius: 18px;
  overflow: hidden;
  min-height: 180px;
  background: rgba(255, 255, 255, 0.06);
}

.hero-cover img,
.fallback-cover {
  width: 100%;
  height: 100%;
  display: grid;
  place-items: center;
  object-fit: cover;
}

.fallback-cover {
  font-size: 42px;
  color: rgba(215, 228, 241, 0.85);
  background: linear-gradient(160deg, rgba(88, 123, 186, 0.42), rgba(28, 36, 60, 0.72));
}

.hero-copy {
  display: grid;
  align-content: center;
  gap: 10px;
}

.hero-copy p {
  margin: 0;
  color: rgba(205, 220, 233, 0.86);
}

.music-controls,
.toolbar-actions,
.preset-actions,
.preset-list {
  display: flex;
  flex-wrap: wrap;
  gap: 10px;
  align-items: center;
}

.toolbar-row {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 14px;
  align-items: center;
}

.range-group {
  display: grid;
  gap: 8px;
}

.range-group span,
.card-slider span,
.mix-slider span {
  font-size: 12px;
  color: rgba(195, 212, 227, 0.85);
}

input[type='range'] {
  width: 100%;
  accent-color: rgb(var(--accent-strong-rgb));
}

.panel-note,
.empty-note {
  margin: 0;
  font-size: 13px;
  color: rgba(197, 215, 230, 0.82);
}

.inline-link {
  min-height: auto;
  padding: 2px 10px;
  margin-left: 8px;
}

.mix-card {
  padding: 14px;
  display: grid;
  gap: 14px;
}

.mix-card-head {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  gap: 12px;
}

.preset-input {
  min-width: 180px;
  min-height: 38px;
  border-radius: 12px;
  border: 1px solid rgba(176, 206, 230, 0.22);
  background: rgba(255, 255, 255, 0.06);
  color: inherit;
  padding: 0 12px;
}

.mix-list {
  display: grid;
  gap: 10px;
}

.mix-row {
  display: grid;
  grid-template-columns: 200px minmax(0, 1fr) auto;
  gap: 12px;
  align-items: center;
  border-radius: 14px;
  padding: 10px 12px;
  background: rgba(255, 255, 255, 0.06);
}

.mix-copy {
  display: grid;
  gap: 4px;
}

.mix-copy small {
  color: rgba(189, 206, 221, 0.78);
}

.mix-slider {
  display: grid;
  gap: 6px;
}

.preset-list {
  gap: 8px;
}

.preset-chip {
  min-height: 34px;
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 10px;
}

.library-group {
  display: grid;
  gap: 12px;
}

.library-grid {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 14px;
}

.ambient-card {
  display: grid;
  gap: 10px;
  padding: 10px;
  border-radius: 18px;
  background: rgba(255, 255, 255, 0.06);
  border: 1px solid rgba(174, 206, 232, 0.16);
  transition: transform 200ms ease, border-color 200ms ease, box-shadow 200ms ease;
}

.ambient-card.active {
  border-color: rgba(var(--accent-rgb), 0.5);
  box-shadow: 0 18px 26px rgba(var(--accent-rgb), 0.14);
  transform: translateY(-2px);
}

.cover-button {
  border: 0;
  border-radius: 16px;
  padding: 0;
  width: 100%;
  min-height: 156px;
  background: var(--cover-bg);
  position: relative;
  overflow: hidden;
  color: rgba(255, 255, 255, 0.96);
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
    radial-gradient(circle at 22% 18%, rgba(255, 255, 255, 0.46), transparent 24%),
    linear-gradient(180deg, rgba(255, 255, 255, 0.16), rgba(255, 255, 255, 0));
}

.card-tag {
  position: absolute;
  left: 10px;
  bottom: 10px;
  z-index: 1;
  min-height: 24px;
  padding: 0 10px;
  border-radius: 999px;
  background: rgba(6, 11, 19, 0.26);
  display: inline-flex;
  align-items: center;
  font-size: 11px;
}

.card-copy {
  display: grid;
  gap: 8px;
}

.card-copy p {
  margin: 0;
  min-height: 40px;
  font-size: 13px;
  line-height: 1.5;
  color: rgba(200, 216, 230, 0.84);
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
  color: rgba(214, 225, 236, 0.86);
}

.card-slider {
  display: grid;
  gap: 6px;
}

.effect-grid .cover-button {
  min-height: 136px;
}

.effect-preview {
  width: 78px;
  height: 78px;
  border-radius: 999px;
  pointer-events: none;
}

.effect-preview-none {
  border: 1px dashed rgba(255, 255, 255, 0.4);
}

.effect-preview-sakura {
  background:
    radial-gradient(circle at 28% 30%, rgba(255, 255, 255, 0.5), transparent 18%),
    radial-gradient(circle at 64% 48%, rgba(255, 214, 228, 0.9), transparent 16%),
    radial-gradient(circle at 46% 70%, rgba(255, 201, 222, 0.7), transparent 14%);
}

.effect-preview-snow {
  background:
    radial-gradient(circle at 24% 28%, rgba(255, 255, 255, 0.88), transparent 12%),
    radial-gradient(circle at 66% 50%, rgba(232, 243, 255, 0.92), transparent 14%),
    radial-gradient(circle at 42% 72%, rgba(255, 255, 255, 0.7), transparent 10%);
}

.effect-preview-soft-rain {
  background:
    linear-gradient(120deg, rgba(255, 255, 255, 0) 28%, rgba(222, 236, 255, 0.64) 30%, rgba(255, 255, 255, 0) 34%),
    linear-gradient(120deg, rgba(255, 255, 255, 0) 52%, rgba(216, 231, 255, 0.72) 54%, rgba(255, 255, 255, 0) 58%);
}

.effect-preview-fireflies {
  background:
    radial-gradient(circle at 26% 28%, rgba(255, 232, 129, 0.94), transparent 18%),
    radial-gradient(circle at 64% 52%, rgba(255, 219, 108, 0.82), transparent 16%),
    radial-gradient(circle at 42% 72%, rgba(255, 235, 151, 0.68), transparent 12%);
}

.hidden-input {
  display: none;
}

.atmo-fade-enter-active,
.atmo-fade-leave-active {
  transition: opacity 180ms ease;
}

.atmo-fade-enter-from,
.atmo-fade-leave-to {
  opacity: 0;
}

@media (max-width: 960px) {
  .atmo-header,
  .toolbar-row,
  .music-hero,
  .effect-hero,
  .mix-row {
    grid-template-columns: 1fr;
  }

  .library-grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }
}

@media (max-width: 680px) {
  .atmo-panel {
    padding: 14px;
    border-radius: 20px;
  }

  .library-grid {
    grid-template-columns: 1fr;
  }

  .cover-button {
    min-height: 132px;
  }
}
</style>
