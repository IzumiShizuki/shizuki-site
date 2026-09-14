/**
 * playerBar — queue identity model skeleton (B 级参考，本次不做数据层对接).
 *
 * Ported to shizuki-site from Twilight_Echo v1.2.1 (Apache-2.0).
 * Original: src/renderer/src/types/music.ts / types/settings.ts (Track, PlayMode)
 * Author: Px-asen (Pxasen.com) — Twilight_Echo project.
 * Modified: TypeScript → JavaScript (JSDoc typedefs), trimmed to the queue-entry
 *           identity model only; nothing here is wired to the site data layer yet.
 */

/**
 * 队列条目身份模型（Twilight_Echo `Track.queueEntryId` 的最小降级版）。
 *
 * 站点 usePlayerEngine 目前按 `id` 唯一（currentTrackId + findIndex），无法表达
 * 「同一曲目重复入队」。要启用队列抽屉的拖拽排序/行操作，必须给站点曲目对象
 * 增加 `queueEntryId`（每次入队生成一次，格式 `queue:<id>:<occurrence>`，
 * 见 playbackQueueVirtualization.js 的 toPlaybackQueueSnapshots）。
 *
 * @typedef {Object} QueueEntryIdentity
 * @property {string} id 曲目提供方 id（可重复出现于队列）。
 * @property {string} [queueEntryId] 队列条目稳定身份；同一曲目多次入队时互不相同。
 */

/**
 * 播放队列中一条曲目的最小骨架（对齐 Twilight_Echo Track 的播放路由字段）。
 *
 * TODO(对接点 1)：站点 usePlayerEngine 的曲目形状不同（audio / lyricText /
 * translationLyricText / durationLabel / sort / provider…），接入时二选一：
 *   a) 站点 normalizeTrack 直接补 queueEntryId 并补齐以下字段（推荐）；
 *   b) 在 playbackQueueVirtualization.js 的 toPlaybackQueueSnapshot 里
 *      保留站点播放必需字段（audio、lyric*、durationLabel、sort）。
 * 未对接前，snapshot 会丢弃这些站点字段——纯逻辑层可单测，但不可直接接引擎。
 *
 * @typedef {Object} QueueTrack
 * @property {string} id
 * @property {string} [queueEntryId] 队列条目稳定身份（重复入队时唯一）。
 * @property {string} title
 * @property {string} artist
 * @property {Array<{id?: (string|number), name: string}>} [artists] 结构化歌手身份。
 * @property {string} album
 * @property {string} filePath
 * @property {string} fileName
 * @property {string} [dir]
 * @property {string} [subTrack]
 * @property {Object} [cueRange]
 * @property {string} [cueSheetPath]
 * @property {string} [cueEncoding]
 * @property {number} duration
 * @property {number} size
 * @property {string|null} cover
 * @property {string|null} [coverSource]
 * @property {string|null} lyrics 快照层固定置 null（歌词只在活动曲目上保留）。
 * @property {string} [source]
 * @property {number} [ncmSongId]
 * @property {string|null} [streamUrl]
 * @property {string} [streamQuality]
 * @property {string} [format]
 * @property {number} [sampleRate]
 * @property {number} [bitrate]
 * @property {number} [bitDepth]
 * @property {number} [bpm]
 * @property {number} [replayGainTrackGainDb]
 * @property {number} [replayGainAlbumGainDb]
 * @property {number} [replayGainTrackPeak]
 * @property {number} [replayGainAlbumPeak]
 * @property {number} [r128TrackGainDb]
 * @property {number} [r128AlbumGainDb]
 */

/**
 * 播放模式（对齐 Twilight_Echo PlayMode；站点现有 playMode 为
 * sequential/random/single，接入时需做映射）。
 *
 * TODO(对接点 2)：站点 usePlayerEngine.playMode 取值是 'sequential' | 'random' |
 * 'single'，与这里的 'shuffle' / 'heart' 语义不同。applyPendingRendererPlayModeAtBoundary
 * 只在站点引入「shuffle = 洗牌后重新排队」语义时才可用。
 *
 * @typedef {'sequential' | 'listLoop' | 'repeat' | 'shuffle' | 'heart'} PlayMode
 */

/** 队列虚拟滚动的一行显示记录（瘦身快照，只含渲染所需字段）。 */
/**
 * @typedef {Object} PlaybackQueueDisplayItem
 * @property {number} index
 * @property {string} id
 * @property {string} queueEntryId
 * @property {string} title
 * @property {string} artist
 * @property {string|null} cover
 */

/** 队列虚拟滚动的可见窗口（[start, end)，不含 end）。 */
/**
 * @typedef {Object} PlaybackQueueWindow
 * @property {number} start
 * @property {number} end
 */

/**
 * 个性化流（FM/雷达）会话键。
 *
 * TODO(对接点 3)：站点尚无 FM/雷达语义。若后续做在线发现二期，需在 usePlayerEngine
 * 增加「个性化流会话」状态（追加去重、队列被编辑即结束会话、剩余计数）。
 *
 * @typedef {'fm' | 'radar'} PersonalizedStreamKey
 */

/**
 * @typedef {Object} PersonalizedStreamSession
 * @property {number} id 会话序号（自增，用于跨追加竞态识别）。
 * @property {PersonalizedStreamKey} key
 */

/** 队列抽屉动作层注入的命令集合（由站点引擎适配器实现）。 */
/**
 * @typedef {Object} PlaybackQueueDrawerCommands
 * @property {(track: QueueTrack) => void} enqueueTrack 追加到队尾。
 * @property {(track: QueueTrack) => void} playNextTrack 插入到当前曲目之后。
 * @property {(index: number) => void} removeQueueItem 按索引移除。
 * @property {() => void} clearQueue 清空队列。
 * @property {(fromIndex: number, toIndex: number) => void} reorderQueue 拖拽重排。
 * @property {(name: string, create: (name: string, tracks: QueueTrack[]) => string) => string} saveQueueAsPlaylist 队列存为歌单。
 */

export {}
