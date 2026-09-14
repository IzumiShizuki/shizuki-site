/**
 * Ported from Twilight_Echo (https://github.com/Px-asen/Twilight_Echo) — Apache-2.0.
 * Original author: Px-asen. Test runner adapted from node:test to vitest;
 * assertions and scenarios are unchanged.
 */

import assert from 'node:assert/strict'
import { test } from 'vitest'
import type { ResolverLyricsState } from '../managedLyricsSource.ts'

import { resolverLyricsInput } from '../managedLyricsSource.ts'

test('forced source reloads from a clean automatic baseline and Auto restores that baseline', () => {
  const automatic: ResolverLyricsState = {
    lyrics: '[00:01]Embedded',
    translatedLyrics: '[00:01]Auto translation',
    lyricsSource: 'embedded',
    translatedLyricsSource: 'provider'
  }
  const forcedProvider: ResolverLyricsState = {
    lyrics: '[00:01]Provider replacement',
    translatedLyrics: null,
    lyricsSource: 'provider',
    translatedLyricsSource: null
  }

  assert.deepEqual(resolverLyricsInput(forcedProvider, automatic, 'provider'), {
    lyrics: null,
    translatedLyrics: null,
    lyricsSource: null,
    translatedLyricsSource: null
  })
  assert.equal(resolverLyricsInput(forcedProvider, automatic, 'auto'), automatic)
})
