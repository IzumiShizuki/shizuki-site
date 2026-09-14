/**
 * 队列虚拟化纯函数：54px 固定行高 + overscan 6 + translateY 窗口 + 快照瘦身
 * （queueEntryId 稳定身份）。
 *
 * Ported to shizuki-site from Twilight_Echo v1.2.1 (Apache-2.0).
 * Original: src/renderer/src/utils/playbackQueueVirtualization.ts
 * Author: Px-asen (Pxasen.com) — Twilight_Echo project.
 * Modified: TypeScript → JavaScript（JSDoc 类型，类型骨架见 ./types.js）。
 *
 * TODO(对接点 1)：toPlaybackQueueSnapshot 只保留 Twilight Track 的路由字段；
 * 站点曲目形状（audio / lyricText / translationLyricText / durationLabel /
 * sort / provider）未包含在内。接入 usePlayerEngine 前，需在此函数保留站点
 * 播放必需字段，或让站点 normalizeTrack 产出本骨架字段。
 */

import './types.js'

export const PLAYBACK_QUEUE_ROW_HEIGHT = 54
export const PLAYBACK_QUEUE_OVERSCAN = 6

/**
 * 播放只需要稳定身份、路由字段与精简展示元数据；
 * 歌词与匹配负载只留在活动曲目/曲库上。
 *
 * @param {import('./types.js').QueueTrack} track
 * @returns {import('./types.js').QueueTrack}
 */
export function toPlaybackQueueSnapshot(track) {
  return {
    id: track.id,
    queueEntryId: track.queueEntryId,
    title: track.title,
    artist: track.artist,
    artists: track.artists,
    album: track.album,
    filePath: track.filePath,
    fileName: track.fileName,
    dir: track.dir,
    subTrack: track.subTrack,
    cueRange: track.cueRange,
    cueSheetPath: track.cueSheetPath,
    cueEncoding: track.cueEncoding,
    duration: track.duration,
    size: track.size,
    cover: track.cover,
    coverSource: track.coverSource ?? null,
    lyrics: null,
    source: track.source,
    ncmSongId: track.ncmSongId,
    streamUrl: track.streamUrl ?? null,
    streamQuality: track.streamQuality,
    format: track.format,
    sampleRate: track.sampleRate,
    bitrate: track.bitrate,
    bitDepth: track.bitDepth,
    bpm: track.bpm,
    replayGainTrackGainDb: track.replayGainTrackGainDb,
    replayGainAlbumGainDb: track.replayGainAlbumGainDb,
    replayGainTrackPeak: track.replayGainTrackPeak,
    replayGainAlbumPeak: track.replayGainAlbumPeak,
    r128TrackGainDb: track.r128TrackGainDb,
    r128AlbumGainDb: track.r128AlbumGainDb
  }
}

/**
 * 批量生成队列快照，并为每个条目分配稳定的 queueEntryId：
 * 已有 queueEntryId 的条目保持身份；重复曲目按出现次序分配
 * `queue:<id>:<occurrence>`，冲突时追加 `:<suffix>`。
 *
 * @param {readonly import('./types.js').QueueTrack[]} tracks
 * @returns {import('./types.js').QueueTrack[]}
 */
export function toPlaybackQueueSnapshots(tracks) {
  const assignedIds = new Set()
  const occurrenceByTrack = new Map()

  return tracks.map((track) => {
    const occurrence = occurrenceByTrack.get(track.id) ?? 0
    occurrenceByTrack.set(track.id, occurrence + 1)
    const base = track.queueEntryId?.trim() || `queue:${track.id}:${occurrence}`
    let queueEntryId = base
    let suffix = 1
    while (assignedIds.has(queueEntryId)) {
      queueEntryId = `${base}:${suffix}`
      suffix += 1
    }
    assignedIds.add(queueEntryId)
    return toPlaybackQueueSnapshot({ ...track, queueEntryId })
  })
}

/**
 * 计算可见窗口 [start, end)。非法输入收敛到安全值。
 *
 * @param {number} total
 * @param {number} scrollTop
 * @param {number} viewportHeight
 * @param {number} [rowHeight]
 * @param {number} [overscan]
 * @returns {import('./types.js').PlaybackQueueWindow}
 */
export function getPlaybackQueueWindow(
  total,
  scrollTop,
  viewportHeight,
  rowHeight = PLAYBACK_QUEUE_ROW_HEIGHT,
  overscan = PLAYBACK_QUEUE_OVERSCAN
) {
  const safeTotal = Math.max(0, Math.floor(total))
  const safeRowHeight = Math.max(1, rowHeight)
  const start = Math.max(0, Math.floor(Math.max(0, scrollTop) / safeRowHeight) - overscan)
  const visibleCount = Math.ceil(Math.max(0, viewportHeight) / safeRowHeight) + overscan * 2
  return { start: Math.min(safeTotal, start), end: Math.min(safeTotal, start + visibleCount) }
}

/**
 * 将 index 行居中所需的 scrollTop（不越过两端）。
 *
 * @param {number} index
 * @param {number} total
 * @param {number} viewportHeight
 * @param {number} [rowHeight]
 * @returns {number}
 */
export function getPlaybackQueueScrollTopForIndex(
  index,
  total,
  viewportHeight,
  rowHeight = PLAYBACK_QUEUE_ROW_HEIGHT
) {
  const safeTotal = Math.max(0, Math.floor(total))
  if (safeTotal === 0) return 0
  const safeRowHeight = Math.max(1, rowHeight)
  const safeIndex = Math.min(safeTotal - 1, Math.max(0, Math.floor(index)))
  const maxScrollTop = Math.max(0, safeTotal * safeRowHeight - Math.max(0, viewportHeight))
  const centered = safeIndex * safeRowHeight - (viewportHeight - safeRowHeight) / 2
  return Math.min(maxScrollTop, Math.max(0, centered))
}

/**
 * 只为可见窗口生成精简展示记录。
 *
 * @param {readonly import('./types.js').QueueTrack[]} tracks
 * @param {import('./types.js').PlaybackQueueWindow} window
 * @returns {import('./types.js').PlaybackQueueDisplayItem[]}
 */
export function createPlaybackQueueDisplayItems(tracks, window) {
  /** @type {import('./types.js').PlaybackQueueDisplayItem[]} */
  const items = []
  for (let index = window.start; index < window.end; index += 1) {
    const track = tracks[index]
    if (!track) continue
    items.push({
      index,
      id: track.id,
      queueEntryId: track.queueEntryId ?? `queue:${track.id}:${index}`,
      title: track.title,
      artist: track.artist,
      cover: track.cover
    })
  }
  return items
}
