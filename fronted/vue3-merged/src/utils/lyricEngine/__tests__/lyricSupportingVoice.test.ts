/**
 * Ported from Twilight_Echo (https://github.com/Px-asen/Twilight_Echo) — Apache-2.0.
 * Original author: Px-asen. Test runner adapted from node:test to vitest;
 * assertions and scenarios are unchanged.
 */

import assert from 'node:assert/strict'
import { test } from 'vitest'
import type { LyricLine, LyricVoiceLayer } from '../lyrics.ts'
import { isSupportingVoiceActive, resolveLyricVoiceWindow } from '../lyricSupportingVoice.ts'

function line(time = 1): LyricLine {
  return { time, text: 'lead', translation: null, romanization: null, timed: true }
}

function voice(partial: Partial<LyricVoiceLayer>): LyricVoiceLayer {
  return {
    voiceKey: 'background',
    role: 'background',
    lane: 'center',
    time: 2,
    endTime: 3,
    text: 'I see you again',
    ...partial
  }
}

test('secondary voice waits for its own start and hides after its end', () => {
  const source = line()
  const secondary = voice({})
  assert.equal(isSupportingVoiceActive(secondary, source, 1.9, true), false)
  assert.equal(isSupportingVoiceActive(secondary, source, 2, true), true)
  assert.equal(isSupportingVoiceActive(secondary, source, 2.99, true), true)
  assert.equal(isSupportingVoiceActive(secondary, source, 3, true), false)
  assert.equal(isSupportingVoiceActive(secondary, source, 2.5, false), false)
})

test('word timing fills a missing voice end', () => {
  const secondary = voice({ endTime: null, words: [{ time: 2, endTime: 2.8, text: 'I see' }] })
  assert.deepEqual(resolveLyricVoiceWindow(secondary, 1), { start: 2, end: 2.8 })
})
