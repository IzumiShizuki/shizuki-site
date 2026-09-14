/**
 * 队列编辑控制器（纯逻辑，快照化可单测）：
 * enqueue / playNext / remove / clear / reorder / saveAsPlaylist
 * + 个性化流（FM/雷达）会话语义。
 *
 * Ported to shizuki-site from Twilight_Echo v1.2.1 (Apache-2.0).
 * Original: src/renderer/src/stores/player/playbackQueueController.ts
 * Author: Px-asen (Pxasen.com) — Twilight_Echo project.
 * Modified: TypeScript → JavaScript（JSDoc 类型）。
 *
 * TODO(对接点 5)：接入 usePlayerEngine 时——
 *   - 所有 queue 变更经 commitQueueEdit（快照化 toPlaybackQueueSnapshots +
 *     持久化 + 原生队列同步）。站点的 queueNativeQueueStateSync 可先传 no-op
 *     （站点是 HTML5 Audio，无原生队列），persistPlaybackSessionAfterQueueMutation
 *     对应站点持久化函数，setAudioEngineError 对应站点错误上报。
 *   - clearAutomaticLyricsBaselines 对应站点歌词引擎基线清理（lyricEngine/）。
 *   - currentTrack / originalQueue / queueIndex / playMode 需由 usePlayerEngine
 *     提供对应 ref；playMode 取值差异见 types.js 对接点 2。
 */

import './types.js'
import { shuffleArray } from './playerQueueUtils.js'
import { toPlaybackQueueSnapshots } from './playbackQueueVirtualization.js'

/**
 * @typedef {Object} PlaybackQueueControllerOptions
 * @property {import('vue').Ref<import('./types.js').QueueTrack|null>} currentTrack
 * @property {import('vue').Ref<import('./types.js').QueueTrack[]>} queue
 * @property {import('vue').Ref<import('./types.js').QueueTrack[]>} originalQueue
 * @property {import('vue').Ref<number>} queueIndex
 * @property {import('vue').Ref<import('./types.js').PlayMode>} playMode
 * @property {import('vue').Ref<boolean>} isPlaying
 * @property {import('vue').Ref<import('./types.js').PersonalizedStreamSession|null>} personalizedStreamSession
 * @property {import('vue').Ref<number>} personalizedStreamRemaining
 * @property {Set<string>} personalizedStreamEntryIds
 * @property {Set<string>} personalizedStreamPlayedEntryIds
 * @property {import('vue').Ref<boolean>} rendererPlayModeBoundaryPending
 * @property {() => void} persistPlaybackSessionAfterQueueMutation
 * @property {() => Promise<void>} queueNativeQueueStateSync
 * @property {(error: string|null) => void} setAudioEngineError
 * @property {() => void} clearAutomaticLyricsBaselines
 */

/**
 * @param {PlaybackQueueControllerOptions} options
 */
export function createPlaybackQueueController(options) {
  let personalizedStreamSessionSequence = 0

  function getPersonalizedStreamEntryId(track) {
    if (!track) return null
    if (track.queueEntryId) return track.queueEntryId
    const queued = options.queue.value[options.queueIndex.value]
    if (queued?.id === track.id && queued.queueEntryId) return queued.queueEntryId
    return (
      options.queue.value.find((candidate) => candidate.id === track.id)?.queueEntryId ?? null
    )
  }

  function refreshPersonalizedStreamRemaining() {
    if (!options.personalizedStreamSession.value) {
      options.personalizedStreamRemaining.value = 0
      return
    }
    let remaining = 0
    for (const entryId of options.personalizedStreamEntryIds) {
      if (!options.personalizedStreamPlayedEntryIds.has(entryId)) remaining += 1
    }
    options.personalizedStreamRemaining.value = remaining
  }

  function markCurrentPersonalizedStreamTrackPlayed() {
    if (!options.personalizedStreamSession.value) return
    const entryId = getPersonalizedStreamEntryId(options.currentTrack.value)
    if (!entryId || !options.personalizedStreamEntryIds.has(entryId)) return
    options.personalizedStreamPlayedEntryIds.add(entryId)
    refreshPersonalizedStreamRemaining()
  }

  function endPersonalizedStream() {
    options.personalizedStreamSession.value = null
    options.personalizedStreamEntryIds.clear()
    options.personalizedStreamPlayedEntryIds.clear()
    options.personalizedStreamRemaining.value = 0
  }

  function isPersonalizedStreamTrack(track) {
    if (!options.personalizedStreamSession.value) return false
    if (track.queueEntryId) return options.personalizedStreamEntryIds.has(track.queueEntryId)
    return options.queue.value.some(
      (candidate) =>
        candidate.id === track.id &&
        !!candidate.queueEntryId &&
        options.personalizedStreamEntryIds.has(candidate.queueEntryId)
    )
  }

  function startPersonalizedStream(key) {
    options.personalizedStreamEntryIds.clear()
    options.personalizedStreamPlayedEntryIds.clear()
    for (const track of options.queue.value) {
      if (track.queueEntryId) options.personalizedStreamEntryIds.add(track.queueEntryId)
    }
    const session = { id: ++personalizedStreamSessionSequence, key }
    options.personalizedStreamSession.value = session
    markCurrentPersonalizedStreamTrackPlayed()
    refreshPersonalizedStreamRemaining()
    return session
  }

  function isPersonalizedStreamSessionCurrent(session) {
    const active = options.personalizedStreamSession.value
    return active?.id === session.id && active.key === session.key
  }

  function applyPendingRendererPlayModeAtBoundary() {
    if (!options.rendererPlayModeBoundaryPending.value) return
    options.rendererPlayModeBoundaryPending.value = false
    if (options.playMode.value === 'heart') return
    const current = options.currentTrack.value
    if (!current || options.originalQueue.value.length === 0) return

    if (options.playMode.value === 'shuffle') {
      const queueEntryIndex = current.queueEntryId
        ? options.originalQueue.value.findIndex(
            (track) => track.queueEntryId === current.queueEntryId
          )
        : -1
      const currentOriginalIndex =
        queueEntryIndex >= 0
          ? queueEntryIndex
          : options.originalQueue.value.findIndex((track) => track.id === current.id)
      const remaining = options.originalQueue.value.filter(
        (_, index) => index !== currentOriginalIndex
      )
      options.queue.value = [current, ...shuffleArray(remaining)]
      options.queueIndex.value = 0
      return
    }

    options.queue.value = [...options.originalQueue.value]
    options.queueIndex.value = options.queue.value.findIndex((track) => track.id === current.id)
    if (options.queueIndex.value === -1) options.queueIndex.value = 0
  }

  function commitQueueEdit(nextQueue, nextIndex) {
    endPersonalizedStream()
    const snapshots = toPlaybackQueueSnapshots(nextQueue)
    options.queue.value = snapshots
    options.originalQueue.value = [...snapshots]
    options.queueIndex.value =
      snapshots.length === 0 ? -1 : Math.max(0, Math.min(nextIndex, snapshots.length - 1))
    options.persistPlaybackSessionAfterQueueMutation()
    void options.queueNativeQueueStateSync().catch((error) => {
      options.setAudioEngineError(error instanceof Error ? error.message : String(error))
    })
  }

  function enqueueTrack(track) {
    const next = [...options.queue.value, track]
    commitQueueEdit(next, options.queueIndex.value)
  }

  function appendQueueTracks(tracks) {
    if (tracks.length === 0) return
    endPersonalizedStream()
    const additions = toPlaybackQueueSnapshots(tracks)
    options.originalQueue.value = [...options.originalQueue.value, ...additions]
    options.queue.value = [
      ...options.queue.value,
      ...(options.playMode.value === 'shuffle' ? shuffleArray(additions) : additions)
    ]
    options.persistPlaybackSessionAfterQueueMutation()
    void options.queueNativeQueueStateSync().catch((error) => {
      options.setAudioEngineError(error instanceof Error ? error.message : String(error))
    })
  }

  function appendPersonalizedStreamTracks(session, tracks) {
    if (tracks.length === 0 || !isPersonalizedStreamSessionCurrent(session)) return false
    const additions = toPlaybackQueueSnapshots(tracks)
    for (const track of additions) {
      if (track.queueEntryId) options.personalizedStreamEntryIds.add(track.queueEntryId)
    }
    options.originalQueue.value = [...options.originalQueue.value, ...additions]
    options.queue.value = [
      ...options.queue.value,
      ...(options.playMode.value === 'shuffle' ? shuffleArray(additions) : additions)
    ]
    refreshPersonalizedStreamRemaining()
    options.persistPlaybackSessionAfterQueueMutation()
    void options.queueNativeQueueStateSync().catch((error) => {
      options.setAudioEngineError(error instanceof Error ? error.message : String(error))
    })
    return true
  }

  function playNextTrack(track) {
    const insertAt = options.queueIndex.value >= 0 ? options.queueIndex.value + 1 : 0
    const next = [...options.queue.value]
    next.splice(insertAt, 0, track)
    commitQueueEdit(next, options.queueIndex.value)
  }

  function removeQueueItem(index) {
    if (!Number.isInteger(index) || index < 0 || index >= options.queue.value.length) return
    const next = [...options.queue.value]
    next.splice(index, 1)
    const nextIndex =
      index < options.queueIndex.value ? options.queueIndex.value - 1 : options.queueIndex.value
    commitQueueEdit(next, nextIndex)
  }

  function clearQueue() {
    commitQueueEdit([], -1)
    options.currentTrack.value = null
    options.isPlaying.value = false
    options.clearAutomaticLyricsBaselines()
  }

  function reorderQueue(fromIndex, toIndex) {
    if (
      !Number.isInteger(fromIndex) ||
      !Number.isInteger(toIndex) ||
      fromIndex < 0 ||
      toIndex < 0 ||
      fromIndex >= options.queue.value.length ||
      toIndex >= options.queue.value.length ||
      fromIndex === toIndex
    )
      return
    const next = [...options.queue.value]
    const [moved] = next.splice(fromIndex, 1)
    next.splice(toIndex, 0, moved)
    let nextIndex = options.queueIndex.value
    if (options.queueIndex.value === fromIndex) nextIndex = toIndex
    else if (fromIndex < options.queueIndex.value && toIndex >= options.queueIndex.value)
      nextIndex--
    else if (fromIndex > options.queueIndex.value && toIndex <= options.queueIndex.value)
      nextIndex++
    commitQueueEdit(next, nextIndex)
  }

  function saveQueueAsPlaylist(name, createPlaylistWithTracks) {
    return createPlaylistWithTracks(name, [...options.queue.value])
  }

  return {
    markCurrentPersonalizedStreamTrackPlayed,
    endPersonalizedStream,
    isPersonalizedStreamTrack,
    startPersonalizedStream,
    isPersonalizedStreamSessionCurrent,
    applyPendingRendererPlayModeAtBoundary,
    commitQueueEdit,
    enqueueTrack,
    appendQueueTracks,
    appendPersonalizedStreamTracks,
    playNextTrack,
    removeQueueItem,
    clearQueue,
    reorderQueue,
    saveQueueAsPlaylist
  }
}
