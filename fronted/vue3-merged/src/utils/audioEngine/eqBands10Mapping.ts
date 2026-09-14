/**
 * @file eqBands10Mapping.ts
 * 站点旧 3 段均衡（musicLibraryUiState.eqLevels，0..1 电平域）→
 * 10 段图形 EQ（musicLibraryUiState.eqBands10）的迁移与换算（shizuki-site 新建）。
 *
 * 迁移规则：
 * - 旧 3 段中心频率与 App.vue 原固定链一致：
 *   lowShelf 180 Hz / peaking 1200 Hz / highShelf 5200 Hz；
 * - 10 段取 Twilight_Echo 引擎图形模式的 DEFAULT_BAND_FREQUENCIES
 *   （31/62/125/250/500/1k/2k/4k/8k/16k，即任务书写的 31.25/62.5/…/16k
 *   同一 ISO 1/3 倍频程组），与执行链/预览曲线保持同一组频率；
 * - 每个 10 段频点按「对数频率就近」归属旧 3 段之一，继承其电平
 *   （500 Hz 落在 180 与 1200 的几何中点 465 Hz 之上，归 mid；
 *   2000 Hz 落在 1200 与 5200 的几何中点 2498 Hz 之下，归 mid）；
 * - 电平↔增益换算与旧 App.vue eqLevelToDb 公式一致：
 *   dB = clamp((level − 0.5) × 24, ±12)，0.5 电平为平坦 0 dB；
 * - 缺项/非法输入按旧 applyEqLevels 的逐项 fallback（0.66 / 0.52 / 0.74）
 *   补齐，保证旧设置迁移后行为不变。
 */
import { DEFAULT_BAND_FREQUENCIES } from './equalizerPageLogic'
import type { EqualizerBand } from './equalizerTypes'

/** 旧 3 段均衡的中心频率（与 App.vue 原固定链参数一致）。 */
export const LEGACY_EQ_BAND_CENTERS = [180, 1200, 5200]

/** 旧 3 段均衡各推子的默认电平（与 App.vue applyEqLevels 的逐项 fallback 一致）。 */
export const LEGACY_EQ_DEFAULT_LEVELS = [0.66, 0.52, 0.74]

/** 图形 EQ 增益范围 ±12 dB（与 equalizerWebAudio.EQ_GRAPHIC_GAIN_LIMIT_DB 同值）。 */
export const GRAPHIC_EQ_GAIN_LIMIT_DB = 12

/** 平坦电平：0.5 对应 0 dB。 */
export const EQ_FLAT_LEVEL = 0.5

/** 电平 0..1 归一化；非有限值退化为 fallback（默认平坦 0.5）。 */
export function normalizeLevel(value: number, fallback: number = EQ_FLAT_LEVEL): number {
  const numeric = Number(value)
  const base = Number.isFinite(numeric) ? numeric : fallback
  const safe = Number.isFinite(base) ? base : EQ_FLAT_LEVEL
  return Math.max(0, Math.min(1, safe))
}

/** 0..1 电平 → ±12 dB 增益（旧 App.vue eqLevelToDb 同式）。 */
export function levelToGainDb(level: number): number {
  const centered = normalizeLevel(level) - EQ_FLAT_LEVEL
  return Math.max(
    -GRAPHIC_EQ_GAIN_LIMIT_DB,
    Math.min(GRAPHIC_EQ_GAIN_LIMIT_DB, centered * 24)
  )
}

/** ±12 dB 增益 → 0..1 电平（levelToGainDb 的逆映射）。 */
export function gainDbToLevel(gainDb: number): number {
  const numeric = Number(gainDb)
  const safe = Number.isFinite(numeric) ? numeric : 0
  return normalizeLevel(safe / 24 + EQ_FLAT_LEVEL)
}

/** 按对数频率就近，返回给定频点归属的旧 3 段索引（0=low / 1=mid / 2=high）。 */
export function nearestLegacyBandIndex(
  frequency: number,
  centers: number[] = LEGACY_EQ_BAND_CENTERS
): number {
  const target = Math.log10(Math.max(Number(frequency) || 1, 1))
  let bestIndex = 0
  let bestDistance = Number.POSITIVE_INFINITY
  for (let index = 0; index < centers.length; index += 1) {
    const center = Math.max(Number(centers[index]) || 1, 1)
    const distance = Math.abs(target - Math.log10(center))
    if (distance < bestDistance) {
      bestDistance = distance
      bestIndex = index
    }
  }
  return bestIndex
}

/**
 * 旧 3 段电平（0..1）→ 10 段电平（0..1）。
 * 逐项 fallback 与旧 applyEqLevels 一致（0.66 / 0.52 / 0.74）。
 */
export function mapLegacyLevelsToBands10(
  levels: number[] | readonly number[],
  frequencies: number[] = DEFAULT_BAND_FREQUENCIES
): number[] {
  const source = Array.isArray(levels) ? levels : []
  const legacy = LEGACY_EQ_BAND_CENTERS.map((_, index) =>
    normalizeLevel(source[index], LEGACY_EQ_DEFAULT_LEVELS[index])
  )
  return frequencies.map((frequency) => legacy[nearestLegacyBandIndex(frequency)])
}

/** 10 段电平（0..1）→ 10 段增益（dB，±12）。缺项按平坦 0 dB。 */
export function bands10LevelsToGainDb(levels: number[] | readonly number[]): number[] {
  const source = Array.isArray(levels) ? levels : []
  return DEFAULT_BAND_FREQUENCIES.map((_, index) =>
    levelToGainDb(normalizeLevel(source[index], EQ_FLAT_LEVEL))
  )
}

/**
 * 10 段电平（0..1）→ EqualizerBand[]（图形模式：全部 peak、Q=1、增益 ±12 dB），
 * 可直接喂给 createEqualizerChain 的 state.bands 与 GraphicEqPanel 的 bands props。
 */
export function bands10LevelsToEqualizerBands(
  levels: number[] | readonly number[],
  frequencies: number[] = DEFAULT_BAND_FREQUENCIES
): EqualizerBand[] {
  const source = Array.isArray(levels) ? levels : []
  return frequencies.map((frequency, index) => ({
    frequency,
    gain: levelToGainDb(normalizeLevel(source[index], EQ_FLAT_LEVEL)),
    q: 1,
    filterType: 'peak'
  }))
}
