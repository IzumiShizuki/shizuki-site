<!--
  @license Apache-2.0
  来源: Twilight_Echo (https://TwilightEcho.com) — Apache-2.0
  作者: Px-asen (Pxasen.com)
  原路径: src/renderer/src/components/equalizer/FrequencyResponseChart.vue
  移植说明: 纯 props/emits SVG 频响图；类型/工具函数改从 ../../utils/audioEngine/ 导入；
  --te-* 主题变量映射到站点 --theme-* 变量；html[data-te-*] 主题 hook 删除。
-->
<script setup lang="ts">
import type { ImportedFrequencyResponse } from '../../../utils/audioEngine/frequencyResponse'
import type { EqualizerBand } from '../../../utils/audioEngine/equalizerTypes'
import FrequencyResponseToolbar from './FrequencyResponseToolbar.vue'
import {
  FREQUENCY_TICKS,
  GAIN_TICKS,
  formatFrequency,
  frequencyToX,
  gainToY,
  isGainDisabled
} from '../../../utils/audioEngine/equalizerPageLogic'

type ResponseView = 'dsp' | 'headphone'
type HeadphoneCurveKey = 'source' | 'target' | 'individual' | 'combined' | 'corrected'

interface BandResponsePath {
  index: number
  path: string
}

const props = defineProps<{
  bands: EqualizerBand[]
  responseView: ResponseView
  importedFrequencyResponse: ImportedFrequencyResponse | null
  importing: boolean
  error: string
  opraCompensationEnabled: boolean
  manualResponsePath: string
  opraResponsePath: string
  opraEstimatedDeviationPath: string
  responsePath: string
  responseFillPath: string
  measuredSourcePath: string
  targetResponsePath: string
  combinedFilterPath: string
  correctedAcousticPath: string
  bandResponsePaths: BandResponsePath[]
  showManualResponse: boolean
  showOpraResponse: boolean
  showOpraEstimatedDeviation: boolean
  showMeasuredSource: boolean
  showTargetResponse: boolean
  showIndividualFilters: boolean
  showCombinedFilter: boolean
  showCorrectedResponse: boolean
}>()

const emit = defineEmits<{
  'update:responseView': [value: ResponseView]
  'toggle-manual': []
  'toggle-opra': []
  'toggle-estimated-deviation': []
  'toggle-headphone-curve': [curve: HeadphoneCurveKey]
  import: []
  clear: []
}>()
</script>

<template>
  <section class="chart-card">
    <FrequencyResponseToolbar
      :response-view="props.responseView"
      :imported-frequency-response="props.importedFrequencyResponse"
      :importing="props.importing"
      :error="props.error"
      @update:response-view="emit('update:responseView', $event)"
      @import="emit('import')"
      @clear="emit('clear')"
    />
    <div
      v-if="props.responseView === 'headphone'"
      class="response-legend acoustic"
      aria-label="耳机频响曲线显示控制"
    >
      <button
        type="button"
        class="response-legend-item measured"
        :class="{ muted: !props.showMeasuredSource }"
        :aria-pressed="props.showMeasuredSource"
        @click="emit('toggle-headphone-curve', 'source')"
      >
        <i></i>源频响 M(f)
      </button>
      <button
        type="button"
        class="response-legend-item target"
        :class="{ muted: !props.showTargetResponse }"
        :aria-pressed="props.showTargetResponse"
        @click="emit('toggle-headphone-curve', 'target')"
      >
        <i></i>目标曲线 T(f)
      </button>
      <button
        type="button"
        class="response-legend-item individual"
        :class="{ muted: !props.showIndividualFilters }"
        :aria-pressed="props.showIndividualFilters"
        @click="emit('toggle-headphone-curve', 'individual')"
      >
        <i></i>单个滤波 Hn(f)
      </button>
      <button
        type="button"
        class="response-legend-item combined"
        :class="{ muted: !props.showCombinedFilter }"
        :aria-pressed="props.showCombinedFilter"
        @click="emit('toggle-headphone-curve', 'combined')"
      >
        <i></i>合并滤波 H(f)
      </button>
      <button
        type="button"
        class="response-legend-item corrected"
        :class="{ muted: !props.showCorrectedResponse }"
        :aria-pressed="props.showCorrectedResponse"
        @click="emit('toggle-headphone-curve', 'corrected')"
      >
        <i></i>滤波结果 R(f)
      </button>
      <span class="response-estimate-note"
        >R(f) = M(f) + H(f) · 排除数字前级 · 预计值，非校正后实测</span
      >
    </div>
    <div v-if="props.responseView === 'dsp'" class="response-legend" aria-label="频响曲线图例">
      <span class="response-legend-item total"><i></i>总 DSP 合成</span>
      <button
        type="button"
        class="response-legend-item manual"
        :class="{ muted: !props.showManualResponse }"
        :aria-pressed="props.showManualResponse"
        @click="emit('toggle-manual')"
      >
        <i></i>手动 EQ（含前级）
      </button>
      <button
        v-if="props.opraCompensationEnabled"
        type="button"
        class="response-legend-item opra"
        :class="{ muted: !props.showOpraResponse }"
        :aria-pressed="props.showOpraResponse"
        @click="emit('toggle-opra')"
      >
        <i></i>OPRA 校正（含前级）
      </button>
      <button
        v-if="props.opraCompensationEnabled"
        type="button"
        class="response-legend-item estimated"
        :class="{ muted: !props.showOpraEstimatedDeviation }"
        :aria-pressed="props.showOpraEstimatedDeviation"
        title="OPRA 滤波器响应的反向估算；排除前级增益，不代表实测频响"
        @click="emit('toggle-estimated-deviation')"
      >
        <i></i>估算源偏差
      </button>
      <span v-if="props.opraCompensationEnabled" class="response-estimate-note"
        >相对隐含目标 0 dB · 非实测</span
      >
    </div>
    <div class="svg-container">
      <div class="chart-labels-y">
        <span
          v-for="gain in [...GAIN_TICKS].reverse()"
          :key="'g-' + gain"
          :class="{ zero: gain === 0 }"
          >{{ gain > 0 ? '+' + gain : gain }}</span
        >
      </div>
      <div class="chart-labels-x">
        <span
          v-for="freq in FREQUENCY_TICKS"
          :key="'f-' + freq"
          :style="{ left: frequencyToX(freq) + '%' }"
          >{{ formatFrequency(freq) }}</span
        >
      </div>

      <div
        v-for="(band, idx) in props.bands"
        :key="'point-' + idx"
        v-show="props.responseView === 'dsp' && !isGainDisabled(band)"
        class="chart-point"
        :style="{
          left: frequencyToX(band.frequency) + '%',
          top: gainToY(band.gain) + '%',
          borderColor: 'var(--te-primary-500)'
        }"
      ></div>

      <svg viewBox="0 0 100 100" preserveAspectRatio="none">
        <defs>
          <linearGradient id="curveGradient" x1="0" y1="0" x2="1" y2="0">
            <stop offset="0%" stop-color="#6366f1" />
            <stop offset="50%" stop-color="#22d3ee" />
            <stop offset="100%" stop-color="#ec4899" />
          </linearGradient>
          <linearGradient id="fillGradient" x1="0" y1="0" x2="0" y2="1">
            <stop offset="0%" stop-color="#6366f1" stop-opacity="0.25" />
            <stop offset="100%" stop-color="#22d3ee" stop-opacity="0.0" />
          </linearGradient>
        </defs>
        <line
          v-for="gain in GAIN_TICKS"
          :key="'gl-' + gain"
          x1="0"
          x2="100"
          :y1="gainToY(gain)"
          :y2="gainToY(gain)"
          class="grid-line"
          :class="{ zero: gain === 0 }"
        />
        <line
          v-for="freq in FREQUENCY_TICKS"
          :key="'fl-' + freq"
          :x1="frequencyToX(freq)"
          :x2="frequencyToX(freq)"
          y1="0"
          y2="100"
          class="grid-line"
        />
        <path
          v-if="
            props.responseView === 'headphone' &&
            props.showMeasuredSource &&
            props.measuredSourcePath
          "
          class="equalizer-measured-source-line"
          :d="props.measuredSourcePath"
          fill="none"
          vector-effect="non-scaling-stroke"
        />
        <path
          v-if="
            props.responseView === 'headphone' &&
            props.showTargetResponse &&
            props.targetResponsePath
          "
          class="equalizer-target-response-line"
          :d="props.targetResponsePath"
          fill="none"
          vector-effect="non-scaling-stroke"
        />
        <path
          v-for="bandPath in props.responseView === 'dsp' || props.showIndividualFilters
            ? props.bandResponsePaths
            : []"
          :key="`${props.responseView}-band-curve-${bandPath.index}`"
          class="equalizer-band-line"
          :d="bandPath.path"
          fill="none"
          vector-effect="non-scaling-stroke"
        />
        <path
          v-if="
            props.responseView === 'headphone' &&
            props.showCombinedFilter &&
            props.combinedFilterPath
          "
          class="equalizer-combined-filter-line"
          :d="props.combinedFilterPath"
          fill="none"
          vector-effect="non-scaling-stroke"
        />
        <path
          v-if="
            props.responseView === 'headphone' &&
            props.showCorrectedResponse &&
            props.correctedAcousticPath
          "
          class="equalizer-corrected-acoustic-line"
          :d="props.correctedAcousticPath"
          fill="none"
          vector-effect="non-scaling-stroke"
        />
        <path
          v-if="
            props.responseView === 'dsp' &&
            props.showOpraEstimatedDeviation &&
            props.opraEstimatedDeviationPath
          "
          class="equalizer-estimated-deviation-line"
          :d="props.opraEstimatedDeviationPath"
          fill="none"
          vector-effect="non-scaling-stroke"
        />
        <path
          v-if="props.responseView === 'dsp' && props.showManualResponse"
          class="equalizer-manual-response-line"
          :d="props.manualResponsePath"
          fill="none"
          vector-effect="non-scaling-stroke"
        />
        <path
          v-if="props.responseView === 'dsp' && props.showOpraResponse && props.opraResponsePath"
          class="equalizer-opra-response-line"
          :d="props.opraResponsePath"
          fill="none"
          vector-effect="non-scaling-stroke"
        />
        <path
          v-if="props.responseView === 'dsp'"
          class="equalizer-spectrum-area"
          :d="props.responseFillPath"
          fill="url(#fillGradient)"
        />
        <path
          v-if="props.responseView === 'dsp'"
          class="equalizer-spectrum-line"
          :d="props.responsePath"
          fill="none"
          stroke="url(#curveGradient)"
          stroke-width="3px"
          vector-effect="non-scaling-stroke"
          stroke-linecap="round"
          stroke-linejoin="round"
        />
      </svg>
    </div>
  </section>
</template>

<style scoped>
.chart-card {
  /* Twilight --te-* 主题变量 → 站点主题变量映射 */
  --te-primary-500: rgb(var(--accent-rgb));
  --te-neutral-500: var(--theme-text-tertiary);
  --te-neutral-600: var(--theme-text-secondary);
  --te-neutral-900: var(--theme-text-primary);
  --te-danger-soft-fg: var(--theme-danger);
  --te-info-soft-fg: #38bdf8;
  --te-favorite-500: #ec4899;
  --te-warning-500: var(--theme-warning);
  --te-success-500: var(--theme-positive);
  --te-font-size-body: 14px;
  --te-font-sans: var(--font-ui);
}

.response-legend {
  min-height: 28px;
  margin: -2px 0 10px;
  display: flex;
  align-items: center;
  justify-content: flex-end;
  flex-wrap: wrap;
  gap: 8px 14px;
  color: var(--te-neutral-600);
  font-size: calc(var(--te-font-size-body, 14px) * 11 / 14);
}
.response-legend-item {
  appearance: none;
  border: 0;
  padding: 2px 0;
  background: transparent;
  color: inherit;
  font: inherit;
  display: inline-flex;
  align-items: center;
  gap: 6px;
  white-space: nowrap;
}
button.response-legend-item {
  cursor: pointer;
}
.response-legend-item.muted {
  opacity: 0.38;
}
.response-legend-item i {
  display: inline-block;
  width: 20px;
  height: 0;
  border-top: 2px solid var(--te-neutral-500);
}
.response-legend-item.total i {
  border-top-width: 3px;
  border-color: var(--te-primary-500);
}
.response-legend-item.manual i {
  border-color: var(--te-info-soft-fg);
}
.response-legend-item.opra i {
  border-color: var(--te-favorite-500);
}
.response-legend-item.estimated i {
  border-color: var(--te-warning-500);
  border-top-style: dashed;
}
.response-legend-item.measured i {
  border-color: var(--te-info-soft-fg);
}
.response-legend-item.target i {
  border-color: var(--te-neutral-500);
  border-top-style: dashed;
}
.response-legend-item.individual i {
  border-color: var(--te-favorite-500);
}
.response-legend-item.combined i {
  border-color: var(--te-warning-500);
  border-top-style: dashed;
}
.response-legend-item.corrected i {
  border-color: var(--te-success-500);
  border-top-width: 3px;
}
.response-estimate-note {
  color: var(--te-neutral-500);
  white-space: nowrap;
}
.svg-container {
  width: 100%;
  height: 210px;
  position: relative;
}
svg {
  width: 100%;
  height: 100%;
  display: block;
  overflow: visible;
}

.grid-line {
  stroke: rgba(15, 23, 42, 0.05);
  stroke-width: 1px;
  vector-effect: non-scaling-stroke;
}

/* Faint per-band response curves under the composite line */
.equalizer-band-line {
  stroke: var(--te-primary-500);
  stroke-width: 1px;
  opacity: 0.18;
}
.equalizer-manual-response-line,
.equalizer-opra-response-line,
.equalizer-estimated-deviation-line,
.equalizer-measured-source-line,
.equalizer-target-response-line,
.equalizer-combined-filter-line,
.equalizer-corrected-acoustic-line {
  stroke-width: 1.6px;
  stroke-linecap: round;
  stroke-linejoin: round;
  opacity: 0.82;
}
.equalizer-manual-response-line {
  stroke: var(--te-info-soft-fg);
}
.equalizer-opra-response-line {
  stroke: var(--te-favorite-500);
}
.equalizer-estimated-deviation-line {
  stroke: var(--te-warning-500);
  stroke-dasharray: 5 4;
  opacity: 0.9;
}
.equalizer-measured-source-line {
  stroke: var(--te-info-soft-fg);
}
.equalizer-target-response-line {
  stroke: var(--te-neutral-500);
  stroke-dasharray: 6 4;
  opacity: 0.85;
}
.equalizer-combined-filter-line {
  stroke: var(--te-warning-500);
  stroke-dasharray: 3 3;
  stroke-width: 2px;
  opacity: 0.9;
}
.equalizer-corrected-acoustic-line {
  stroke: var(--te-success-500);
  stroke-width: 2.6px;
  opacity: 0.95;
}
.grid-line.zero {
  stroke: rgba(15, 23, 42, 0.15);
  stroke-width: 2px;
  stroke-dasharray: 4 4;
  vector-effect: non-scaling-stroke;
}

/* HTML based labels & points */
.chart-labels-y {
  position: absolute;
  top: 0;
  left: -32px;
  height: 100%;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  color: var(--te-neutral-500);
  font-size: calc(var(--te-font-size-body, 14px) * 11 / 14);
  font-weight: 600;
  font-family: var(--te-font-sans);
  text-align: right;
  width: 24px;
}
.chart-labels-y span.zero {
  font-weight: 800;
  color: var(--te-neutral-900);
}

.chart-labels-x {
  position: absolute;
  bottom: -24px;
  left: 0;
  width: 100%;
  height: 16px;
  color: var(--te-neutral-500);
  font-size: calc(var(--te-font-size-body, 14px) * 11 / 14);
  font-weight: 600;
  font-family: var(--te-font-sans);
}
.chart-labels-x span {
  position: absolute;
  transform: translateX(-50%);
  text-align: center;
}

/* Pure HTML perfect circles for points to avoid SVG transform stretching */
.chart-point {
  position: absolute;
  width: 10px;
  height: 10px;
  border-radius: 50%;
  background: #fff; /* keep-white: chart point center */
  border: 3px solid;
  transform: translate(-50%, -50%);
  box-shadow: 0 0 0 2px rgba(255, 255, 255, 0.5);
  z-index: 10;
}
</style>
