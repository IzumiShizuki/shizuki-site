/**
 * @file equalizerWebAudio.ts
 * Web Audio 均衡器执行端（shizuki-site 新建文件）。
 *
 * 设计对齐 Twilight_Echo 引擎的 ParametricEqProcessor.cpp 规则
 * （Apache-2.0，https://TwilightEcho.com，作者 Px-asen），用 Web Audio
 * BiquadFilterNode 实现与 eqResponse.ts 的 RBJ 预览数学一一对应的执行链：
 *
 *   input ─┬─▶ preamp(GainNode) ─▶ f[0](BiquadFilterNode) ─▶ … ─▶ f[N-1] ─▶ chainPath(GainNode) ─┐
 *          └─▶ bypassPath(GainNode) ──────────────────────────────────────────────────────────────┴─▶ output
 *
 * 规则镜像（与 eqResponse.ts 的 isBandActive 同源）：
 * - 图形模式强制每段 'peaking'（Web Audio 的 peaking 即引擎的 peak）；
 * - 参数模式按 band.filterType 映射 Web Audio 的 8 种 BiquadFilterType（同名 RBJ 家族）；
 * - 旁路：enabled=false 的频段跳过；LP/HP 始终处理；其余 |gain| ≤ 0.0001 dB 旁路；
 * - 钳制与 C++ 一致：频率 [10, Nyquist×0.98]、Q [0.1, 20]、
 *   增益 graphic ±12 / parametric ±24 dB、preamp ±24 dB；
 * - 参数写入用 setTargetAtTime 做 a-rate 平滑（拖拽实时无爆音，优于原生重建）；
 * - 总开关走双路增益交叉淡化（chainPath/bypassPath），避免 click/pop。
 *
 * 本文件只交付执行端代码框架 + 纯函数单测；尚未接入 App.vue 音频链。
 * 后续接入方式：site 的 ensureAudioAnalyser() 创建 sourceNode 后，
 * chain = createEqualizerChain(audioCtx, sourceNode, state)，
 * chain.output.connect(analyser)，EQ 状态由站点模块（musicLibraryUiState
 * 或新 composable）驱动 chain.apply(state)。
 */
import type { EqMode, EqualizerBand, EqualizerFilterType } from './equalizerTypes'
import { isBandActive } from './eqResponse'

export interface EqualizerChainState {
  enabled: boolean
  mode: EqMode
  preampDb: number
  bands: EqualizerBand[]
  /** 默认取 AudioContext.sampleRate（设备实际采样率，与引擎行为一致）。 */
  sampleRate?: number
}

export interface AppliedFilterParams {
  type: BiquadFilterType
  frequency: number
  q: number
  gainDb: number
  active: boolean
}

export interface EqualizerChain {
  readonly input: AudioNode
  readonly output: AudioNode
  readonly preamp: GainNode
  readonly filters: BiquadFilterNode[]
  readonly bandCount: number
  apply(state: EqualizerChainState): void
  setEnabled(enabled: boolean): void
  dispose(): void
}

export const EQ_GRAPHIC_GAIN_LIMIT_DB = 12
export const EQ_PARAMETRIC_GAIN_LIMIT_DB = 24
export const EQ_PREAMP_LIMIT_DB = 24
export const EQ_MIN_FREQUENCY = 10
export const EQ_MIN_Q = 0.1
export const EQ_MAX_Q = 20

/** 与 ParametricEqProcessor.cpp 的 kGainEpsilonDb 相同：|gain|≤ε 视为旁路。 */
export const EQ_GAIN_EPSILON_DB = 0.0001

const PARAM_SMOOTHING_SECONDS = 0.015
const BYPASS_SMOOTHING_SECONDS = 0.02

interface InternalEqualizerChain extends EqualizerChain {
  context: BaseAudioContext
  chainPath: GainNode
  bypassPath: GainNode
}

export function dbToLinearGain(db: number): number {
  if (!Number.isFinite(db)) return 1
  return 10 ** (db / 20)
}

/** 引擎钳制：频率 clamp 到 [10, Nyquist×0.98]。 */
export function clampFilterFrequency(frequency: number, sampleRate: number): number {
  const nyquist = Math.max(1, sampleRate * 0.5)
  return Math.min(Math.max(frequency, EQ_MIN_FREQUENCY), nyquist * 0.98)
}

/** 引擎钳制：Q clamp 到 [0.1, 20]。 */
export function clampFilterQ(q: number): number {
  return Math.min(Math.max(q, EQ_MIN_Q), EQ_MAX_Q)
}

export function clampBandGainDb(gainDb: number, mode: EqMode): number {
  const limit = mode === 'graphic' ? EQ_GRAPHIC_GAIN_LIMIT_DB : EQ_PARAMETRIC_GAIN_LIMIT_DB
  return Math.min(Math.max(gainDb, -limit), limit)
}

export function clampPreampDb(preampDb: number): number {
  return Math.min(Math.max(preampDb, -EQ_PREAMP_LIMIT_DB), EQ_PREAMP_LIMIT_DB)
}

/**
 * Twilight 8 种 RBJ 滤波器 → Web Audio BiquadFilterType 映射。
 * Web Audio 的 `peaking` 即引擎的 `peak`；其余 7 种同名同家族。
 */
export function mapFilterTypeToBiquadType(filterType: EqualizerFilterType): BiquadFilterType {
  switch (filterType) {
    case 'lowShelf':
      return 'lowshelf'
    case 'highShelf':
      return 'highshelf'
    case 'lowPass':
      return 'lowpass'
    case 'highPass':
      return 'highpass'
    case 'bandPass':
      return 'bandpass'
    case 'allPass':
      return 'allpass'
    case 'notch':
      return 'notch'
    case 'peak':
    default:
      return 'peaking'
  }
}

/** 图形模式强制 peak，与引擎 graphic 模式一致。 */
export function effectiveFilterType(band: EqualizerBand, mode: EqMode): EqualizerFilterType {
  return mode === 'graphic' ? 'peak' : band.filterType
}

/**
 * 由频段状态推导要写入 BiquadFilterNode 的参数（纯函数，可无 AudioContext 测试）。
 * 旁路规则与 eqResponse.isBandActive 完全一致；旁路的频段 gainDb 写 0
 * （graphic 全 peak 时即恒等滤波，听感与预览曲线严格一致）。
 */
export function computeFilterParams(
  band: EqualizerBand,
  mode: EqMode,
  sampleRate: number
): AppliedFilterParams {
  const active = isBandActive(band, mode)
  return {
    type: mapFilterTypeToBiquadType(effectiveFilterType(band, mode)),
    frequency: clampFilterFrequency(band.frequency, sampleRate),
    q: clampFilterQ(band.q),
    gainDb: active ? clampBandGainDb(band.gain, mode) : 0,
    active
  }
}

function smoothParam(param: AudioParam, value: number, now: number): void {
  param.setTargetAtTime(value, now, PARAM_SMOOTHING_SECONDS)
}

/**
 * 构建固定 band 数的 BiquadFilterNode 串联链。
 * - 图形模式：bandCount = 10（DEFAULT_BAND_FREQUENCIES）；
 * - 参数模式：band 数可变，增删 band 时按引擎行为**重建链**（1 帧内重建无爆音），
 *   本工厂不支持运行时增删节点。
 */
export function createEqualizerChain(
  audioContext: BaseAudioContext,
  input: AudioNode,
  state: EqualizerChainState
): EqualizerChain {
  const preamp = audioContext.createGain()
  preamp.gain.value = 1
  const filters = state.bands.map(() => {
    const filter = audioContext.createBiquadFilter()
    filter.type = 'peaking'
    return filter
  })
  const chainPath = audioContext.createGain()
  const bypassPath = audioContext.createGain()
  const output = audioContext.createGain()

  input.connect(preamp)
  let previous: AudioNode = preamp
  for (const filter of filters) {
    previous.connect(filter)
    previous = filter
  }
  previous.connect(chainPath)
  input.connect(bypassPath)
  chainPath.connect(output)
  bypassPath.connect(output)

  const chain: InternalEqualizerChain = {
    input,
    output,
    preamp,
    filters,
    bandCount: filters.length,
    context: audioContext,
    chainPath,
    bypassPath,
    apply(next) {
      applyChainState(chain, next)
    },
    setEnabled(enabled) {
      setChainEnabled(chain, enabled)
    },
    dispose() {
      input.disconnect(preamp)
      input.disconnect(bypassPath)
      chainPath.disconnect(output)
      bypassPath.disconnect(output)
      let node: AudioNode = preamp
      for (const filter of filters) {
        node.disconnect(filter)
        node = filter
      }
      node.disconnect(chainPath)
    }
  }

  applyChainState(chain, state)
  setChainEnabled(chain, state.enabled !== false)
  return chain
}

function applyChainState(chain: InternalEqualizerChain, state: EqualizerChainState): void {
  const audioContext = chain.context
  const sampleRate = state.sampleRate ?? audioContext.sampleRate
  const now = audioContext.currentTime
  smoothParam(chain.preamp.gain, dbToLinearGain(clampPreampDb(state.preampDb)), now)

  for (let index = 0; index < chain.filters.length; index += 1) {
    const band = state.bands[index]
    if (!band) continue
    const params = computeFilterParams(band, state.mode, sampleRate)
    const filter = chain.filters[index]
    filter.type = params.type
    smoothParam(filter.frequency, params.frequency, now)
    smoothParam(filter.Q, params.q, now)
    smoothParam(filter.gain, dbToLinearGain(params.gainDb), now)
  }
}

function setChainEnabled(chain: InternalEqualizerChain, enabled: boolean): void {
  const now = chain.context.currentTime
  chain.chainPath.gain.setTargetAtTime(enabled ? 1 : 0, now, BYPASS_SMOOTHING_SECONDS)
  chain.bypassPath.gain.setTargetAtTime(enabled ? 0 : 1, now, BYPASS_SMOOTHING_SECONDS)
}
