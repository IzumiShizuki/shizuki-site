/**
 * Ported from Twilight_Echo (https://github.com/Px-asen/Twilight_Echo) — Apache-2.0.
 * Original author: Px-asen. Test runner adapted from node:test to vitest;
 * assertions and scenarios are unchanged.
 */

import assert from 'node:assert/strict'
import { test } from 'vitest'
import { getLyricFocusLineIndices } from '../lyricFocusWindow.ts'

test('lyric focus window centers the active line and clamps at both ends', () => {
  assert.deepEqual(getLyricFocusLineIndices(8, 0, 5), [0, 1, 2, 3, 4])
  assert.deepEqual(getLyricFocusLineIndices(8, 4, 5), [2, 3, 4, 5, 6])
  assert.deepEqual(getLyricFocusLineIndices(8, 7, 5), [3, 4, 5, 6, 7])
})

test('full lyrics mode retains every line while automatic follow is active', () => {
  assert.deepEqual(getLyricFocusLineIndices(8, 4, 'all'), [0, 1, 2, 3, 4, 5, 6, 7])
})

test('lyric focus window handles untimed lyrics and short lyric lists', () => {
  assert.deepEqual(getLyricFocusLineIndices(3, -1, 5), [0, 1, 2])
  assert.deepEqual(getLyricFocusLineIndices(0, -1, 3), [])
  assert.deepEqual(getLyricFocusLineIndices(4, 2, 1), [2])
})
