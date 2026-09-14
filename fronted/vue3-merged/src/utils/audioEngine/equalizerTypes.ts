/**
 * @license Apache-2.0
 * 来源: Twilight_Echo (https://TwilightEcho.com) — Apache-2.0
 * 作者: Px-asen (Pxasen.com)
 * 原路径: src/shared/audioEngineTypes.ts + src/types/settings.ts + src/shared/appSettings.ts
 *         （仅抽取 EQ / 频响相关最小子集，其余类型随桌面端剔除）
 * 移植说明:
 * - 站点无 Electron/pinia，本文件是 Web 端最小类型镜像；
 * - AudioProcessingSettings 仅保留 EQ 相关字段（DSD/卷积/输出设备等 C 级字段剔除）；
 * - OpraCatalogStatus / HeadphoneCompensationSettings 仅为纯文案格式化函数提供类型，
 *   OPRA 目录与耳机补偿的**执行端**属 C 级，不在本次移植范围。
 */

export type EqMode = 'graphic' | 'parametric'

export type EqualizerFilterType =
  | 'peak'
  | 'lowShelf'
  | 'highShelf'
  | 'bandPass'
  | 'lowPass'
  | 'highPass'
  | 'allPass'
  | 'notch'

export interface EqualizerBand {
  frequency: number
  gain: number
  q: number
  filterType: EqualizerFilterType
  enabled?: boolean
  channelMask?: number
}

/**
 * Web 端最小音频处理设置：只保留 EQ 链所需字段。
 * `dspEnabled` 语义保留（触碰 EQ 自动接通处理链），与
 * Twilight_Echo 的 equalizerSettingsPatch 行为对齐。
 */
export interface AudioProcessingSettings {
  dspEnabled: boolean
  eqEnabled: boolean
  eqMode: EqMode
  eqPreamp: number
  eqBands: EqualizerBand[]
}

export interface AudioEqPreset {
  id: string
  name: string
  eqMode: EqMode
  eqPreamp: number
  eqBands: EqualizerBand[]
}

/** OPRA(AutoEq) 目录状态的最小类型镜像（仅支撑 equalizerPageLogic 的文案格式化）。 */
export interface OpraCatalogStatus {
  loading: boolean
  loaded: boolean
  source?: 'network' | 'cache' | string
  profileCount: number
  lastError?: string
}

/** 耳机补偿设置的最小类型镜像（仅支撑 equalizerPageLogic 的文案格式化）。 */
export interface HeadphoneCompensationSettings {
  enabled: boolean
  productId: string
  productName: string
  vendorName: string
  eqId: string
  author: string
  details: string
  link: string
  preampDb: number
  bands: EqualizerBand[]
}
