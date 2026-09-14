/**
 * @license Apache-2.0
 * 来源: Twilight_Echo (https://TwilightEcho.com) — Apache-2.0
 * 作者: Px-asen (Pxasen.com)
 * 原路径: src/renderer/src/utils/equalizerSettingsPatch.ts
 * 移植说明: 逐字移植；类型 import 改为本地 ./equalizerTypes。
 */
import type { AudioProcessingSettings } from './equalizerTypes'

export function mergeEqualizerPatch(
  current: AudioProcessingSettings,
  patch: Partial<AudioProcessingSettings>
): AudioProcessingSettings {
  const eqTouched =
    patch.eqEnabled === true ||
    (current.eqEnabled &&
      (patch.eqMode !== undefined || patch.eqPreamp !== undefined || patch.eqBands !== undefined))
  return {
    ...current,
    ...patch,
    dspEnabled: patch.dspEnabled ?? (current.dspEnabled || eqTouched),
    eqEnabled: patch.eqEnabled ?? current.eqEnabled
  }
}
