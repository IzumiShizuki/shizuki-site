/**
 * 队列抽屉动作层：以 queueEntryId（而非显示索引）解析每一条命令。
 *
 * Ported to shizuki-site from Twilight_Echo v1.2.1 (Apache-2.0).
 * Original: src/renderer/src/components/player-bar/usePlaybackQueueDrawerActions.ts
 * Author: Px-asen (Pxasen.com) — Twilight_Echo project.
 * Modified: TypeScript → JavaScript（JSDoc 类型）。
 *
 * TODO(对接点 4)：commands 由站点引擎适配器实现，映射到 usePlayerEngine：
 *   enqueueTrack      → appendToQueueEnd / enqueueTrack（队尾语义，已新增）
 *   playNextTrack     → enqueueNextTrack
 *   removeQueueItem   → removeQueueItem(entryIdOrIndex)（已新增，兼容整数索引）
 *   clearQueue        → clearQueue()（已新增）
 *   reorderQueue      → reorderTracks（已存在，注意 sort 字段维护）
 *   saveQueueAsPlaylist → 站点收藏/歌单对话框链路（MusicCollectTrackDialog）
 * 前置条件：站点曲目对象带 queueEntryId（见 types.js 对接点 1）——已由
 *   usePlayerEngine.normalizeTrack 落地。
 */

import { ref } from 'vue'
import './types.js'

/**
 * @typedef {Object} PlaybackQueueDrawerActionOptions
 * @property {import('vue').Ref<import('./types.js').QueueTrack[]>} queue
 * @property {import('./types.js').PlaybackQueueDrawerCommands} commands
 * @property {(name: string, tracks: import('./types.js').QueueTrack[]) => string} createPlaylistWithTracks
 */

function normalizePlaylistName(value) {
  return value.trim().slice(0, 120)
}

/**
 * Resolves every command from the queue entry identity at the instant it is
 * invoked. Virtual rows are recycled while scrolling, therefore their DOM
 * position and a captured display index are never a command input here.
 *
 * @param {PlaybackQueueDrawerActionOptions} options
 */
export function usePlaybackQueueDrawerActions({ queue, commands, createPlaylistWithTracks }) {
  const draggedEntryId = ref(null)

  function getEntryIndex(queueEntryId) {
    return queue.value.findIndex((track) => track.queueEntryId === queueEntryId)
  }

  function getEntry(queueEntryId) {
    const index = getEntryIndex(queueEntryId)
    return index === -1 ? null : (queue.value[index] ?? null)
  }

  function playNext(queueEntryId) {
    const track = getEntry(queueEntryId)
    if (track) commands.playNextTrack(track)
  }

  function addToTail(queueEntryId) {
    const track = getEntry(queueEntryId)
    if (track) commands.enqueueTrack(track)
  }

  function remove(queueEntryId) {
    const index = getEntryIndex(queueEntryId)
    if (index !== -1) commands.removeQueueItem(index)
  }

  function clear() {
    if (queue.value.length > 0) commands.clearQueue()
  }

  function saveAsPlaylist(name) {
    const normalized = normalizePlaylistName(name)
    if (!normalized || queue.value.length === 0) return null
    return commands.saveQueueAsPlaylist(normalized, createPlaylistWithTracks)
  }

  function onDragStart(event, queueEntryId) {
    if (getEntryIndex(queueEntryId) === -1) return
    draggedEntryId.value = queueEntryId
    event.dataTransfer?.setData('text/plain', queueEntryId)
    if (event.dataTransfer) event.dataTransfer.effectAllowed = 'move'
  }

  function onDragOver(event, targetEntryId) {
    if (!draggedEntryId.value || draggedEntryId.value === targetEntryId) return
    if (getEntryIndex(targetEntryId) === -1) return
    event.preventDefault()
    if (event.dataTransfer) event.dataTransfer.dropEffect = 'move'
  }

  function onDrop(event, targetEntryId) {
    event.preventDefault()
    const sourceEntryId = draggedEntryId.value ?? event.dataTransfer?.getData('text/plain')
    draggedEntryId.value = null
    if (!sourceEntryId || sourceEntryId === targetEntryId) return

    // Resolve both positions after drop: scrolling or a native/session update
    // may have changed the virtual window since dragstart.
    const fromIndex = getEntryIndex(sourceEntryId)
    const toIndex = getEntryIndex(targetEntryId)
    if (fromIndex !== -1 && toIndex !== -1) commands.reorderQueue(fromIndex, toIndex)
  }

  function onDragEnd() {
    draggedEntryId.value = null
  }

  return {
    draggedEntryId,
    getEntryIndex,
    playNext,
    addToTail,
    remove,
    clear,
    saveAsPlaylist,
    onDragStart,
    onDragOver,
    onDrop,
    onDragEnd
  }
}
