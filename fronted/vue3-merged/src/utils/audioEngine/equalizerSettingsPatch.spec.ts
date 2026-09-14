/**
 * @license Apache-2.0
 * 来源: Twilight_Echo (https://TwilightEcho.com) — Apache-2.0
 * 作者: Px-asen (Pxasen.com)
 * 原路径: src/renderer/src/utils/equalizerSettingsPatch.test.ts
 * 移植说明: 测试运行器 node:test → vitest；断言库保持 node:assert/strict。
 */
import { test } from 'vitest'
import assert from 'node:assert/strict'
import { mergeEqualizerPatch } from './equalizerSettingsPatch'
import { defaultAudioProcessing } from './equalizerPageLogic'

test('switching modes and editing bands preserves EQ bypass until explicitly enabled', () => {
  const disabled = { ...defaultAudioProcessing, eqEnabled: false, dspEnabled: false }
  const parametric = mergeEqualizerPatch(disabled, { eqMode: 'parametric' })
  assert.equal(parametric.eqEnabled, false)
  assert.equal(parametric.dspEnabled, false)
  const edited = mergeEqualizerPatch(parametric, { eqPreamp: -4 })
  assert.equal(edited.eqEnabled, false)
  const enabled = mergeEqualizerPatch(edited, { eqEnabled: true })
  assert.equal(enabled.eqEnabled, true)
  assert.equal(enabled.dspEnabled, true)
  assert.equal(mergeEqualizerPatch(enabled, { eqMode: 'graphic' }).eqEnabled, true)
})
