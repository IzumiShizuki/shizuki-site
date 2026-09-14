<!--
  @license Apache-2.0
  来源: Twilight_Echo (https://TwilightEcho.com) — Apache-2.0
  作者: Px-asen (Pxasen.com)
  原路径: src/renderer/src/components/equalizer/GraphicEqPanel.vue
  移植说明: pinia/PrimeIcons 依赖已剔除（本组件本就是纯 props/emits）；
  类型与工具函数改从 ../../utils/audioEngine/ 导入；
  --te-* 主题变量映射到站点 --theme-*/--accent-* 变量（见 style 头部映射块）；
  html[data-te-*] 主题 hook 删除。
-->
<script setup lang="ts">
import type { EqualizerBand } from '../../../utils/audioEngine/equalizerTypes'
import {
  formatFrequency,
  getFillStyle,
  getThumbTop,
  isGainDisabled
} from '../../../utils/audioEngine/equalizerPageLogic'

const props = defineProps<{
  preamp: number
  bands: EqualizerBand[]
  autoPreampEnabled: boolean
}>()

// Sliders preview on every input and commit once the gesture ends. Applying to
// the engine per input event issued overlapping async round trips whose
// out-of-order responses left the board showing an earlier gain than the one the
// user dragged to.
const emit = defineEmits<{
  'preview-preamp': [value: number]
  'preview-band': [index: number, patch: Partial<EqualizerBand>]
  commit: []
  advanced: [index: number]
}>()
</script>

<template>
  <section class="sliders-board">
    <div class="slider-column master-column">
      <div class="slider-gain">
        {{ props.preamp > 0 ? '+' + props.preamp.toFixed(1) : props.preamp.toFixed(1) }}
      </div>
      <div class="slider-track">
        <div class="slider-fill" :style="getFillStyle(props.preamp, 24)"></div>
        <div class="slider-thumb" :style="{ top: getThumbTop(props.preamp, 24) }"></div>
        <input
          type="range"
          min="-24"
          max="24"
          step="0.1"
          :value="props.preamp"
          :disabled="props.autoPreampEnabled"
          @input="emit('preview-preamp', Number(($event.target as HTMLInputElement).value))"
          @change="emit('commit')"
          class="invisible-range"
        />
      </div>
      <div class="slider-freq">{{ props.autoPreampEnabled ? 'PREAMP · AUTO' : 'PREAMP' }}</div>
    </div>

    <div v-for="(band, index) in props.bands" :key="'band-' + index" class="slider-column">
      <div class="slider-gain">
        {{ band.gain > 0 ? '+' + band.gain.toFixed(1) : band.gain.toFixed(1) }}
      </div>
      <div class="slider-track">
        <div class="slider-fill" :style="getFillStyle(band.gain, 12)"></div>
        <div class="slider-thumb" :style="{ top: getThumbTop(band.gain, 12) }"></div>
        <input
          type="range"
          min="-12"
          max="12"
          step="0.1"
          :value="band.gain"
          :disabled="isGainDisabled(band)"
          @input="
            emit('preview-band', index, { gain: Number(($event.target as HTMLInputElement).value) })
          "
          @change="emit('commit')"
          class="invisible-range"
        />
      </div>
      <div
        class="slider-freq"
        role="button"
        tabindex="0"
        :aria-label="`高级设置 ${formatFrequency(band.frequency)}`"
        style="cursor: pointer"
        @click="emit('advanced', index)"
        @keydown.enter.prevent="emit('advanced', index)"
        @keydown.space.prevent="emit('advanced', index)"
      >
        {{ formatFrequency(band.frequency) }}
      </div>
    </div>
  </section>
</template>

<style scoped>
.sliders-board {
  /* Twilight --te-* 主题变量 → 站点主题变量映射 */
  --te-primary-500: rgb(var(--accent-rgb));
  --te-card-bg: var(--theme-panel-surface-elevated);
  --te-glass-bg: var(--theme-panel-surface);
  --te-glass-border: var(--theme-border);
  --te-neutral-500: var(--theme-text-tertiary);
  --te-font-size-body: 14px;

  display: flex;
  justify-content: space-between;
  align-items: center;
  gap: 10px;
  background: var(--te-glass-bg);
  padding: 30px 40px;
  border-radius: 20px;
  border: 1px solid var(--te-glass-border);
}
.slider-column {
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 16px;
  flex: 1;
}
.slider-gain {
  font-size: calc(var(--te-font-size-body, 14px) * 13 / 14);
  font-weight: 700;
  color: var(--te-primary-500);
  background: var(--te-card-bg);
  padding: 4px 10px;
  border-radius: 8px;
  box-shadow: 0 4px 12px rgba(15, 23, 42, 0.04);
}
.slider-freq {
  font-size: calc(var(--te-font-size-body, 14px) * 12 / 14);
  font-weight: 600;
  color: var(--te-neutral-500);
}
.slider-track {
  width: 6px;
  height: 180px;
  background: rgba(15, 23, 42, 0.06);
  border-radius: 999px;
  position: relative;
}
.slider-fill {
  position: absolute;
  left: 0;
  width: 100%;
  background: linear-gradient(to top, var(--te-primary-500), #818cf8);
  border-radius: 999px;
  z-index: 1;
}
.slider-thumb {
  width: 20px;
  height: 20px;
  background: #fff; /* keep-white: slider knob */
  border-radius: 50%;
  position: absolute;
  left: 50%;
  transform: translate(-50%, -50%);
  box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
  border: 2px solid var(--te-primary-500);
  cursor: grab;
  transition: transform 0.1s;
  z-index: 2;
}
.slider-thumb:hover {
  transform: translate(-50%, -50%) scale(1.2);
}

.invisible-range {
  position: absolute;
  width: 180px;
  height: 24px;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%) rotate(-90deg);
  opacity: 0;
  cursor: pointer;
  -webkit-appearance: none;
  appearance: none;
  margin: 0;
  z-index: 3;
}

.master-column {
  padding-right: 20px;
  margin-right: 10px;
  border-right: 2px dashed rgba(15, 23, 42, 0.08);
}
.master-column .slider-gain {
  color: rgb(var(--accent-strong-rgb));
}
.master-column .slider-fill {
  background: linear-gradient(to top, rgb(var(--accent-strong-rgb)), #f472b6);
}
.master-column .slider-thumb {
  border-color: rgb(var(--accent-strong-rgb));
}
</style>
