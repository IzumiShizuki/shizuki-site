/**
 * rAF 帧合并节流器（createFrameCoalescer）。
 *
 * Ported to shizuki-site from Twilight_Echo v1.2.1 (Apache-2.0).
 * Original: src/renderer/src/utils/liquidGlassPointer.ts（仅移植 createFrameCoalescer，
 *           指针高光/偏移部分与本站液体玻璃体系无关，未移植）
 * Author: Px-asen (Pxasen.com) — Twilight_Echo project.
 * Modified: TypeScript → JavaScript（JSDoc 类型），独立成 playerBar 内部工具模块。
 */

/**
 * @typedef {Object} FrameCoalescer
 * @property {(payload: any) => void} schedule 入队一次更新；下一帧只保留最新 payload。
 * @property {() => boolean} hasPending 是否有待刷新的 payload。
 * @property {() => void} cancel 丢弃待刷新 payload 与已排的帧回调。
 */

/**
 * @typedef {Object} FrameCoalescerOptions
 * @property {(callback: () => void) => number} [requestFrame] 可注入 rAF（测试用）。
 * @property {(handle: number) => void} [cancelFrame] 可注入 cancelAF（测试用）。
 * @property {number} [minIntervalMs] 两次刷新间最小间隔；0 = 每帧一次。
 * @property {() => number} [now] 可注入时钟（测试用）。
 */

/**
 * Coalesces bursts of updates into one callback per animation frame, latest wins.
 * Pointer events fire far faster than frames; without this the hot path would write
 * style on every event.
 *
 * @template T
 * @param {(payload: T) => void} flush
 * @param {FrameCoalescerOptions} [options]
 * @returns {FrameCoalescer}
 */
export function createFrameCoalescer(flush, options = {}) {
  const requestFrame =
    options.requestFrame ??
    (typeof requestAnimationFrame === 'function'
      ? requestAnimationFrame
      : (callback) => setTimeout(callback, 16))
  const cancelFrame =
    options.cancelFrame ??
    (typeof cancelAnimationFrame === 'function'
      ? cancelAnimationFrame
      : (handle) => clearTimeout(handle))
  const now =
    options.now ??
    (typeof performance !== 'undefined' && typeof performance.now === 'function'
      ? () => performance.now()
      : () => Date.now())
  const minIntervalMs = Math.max(
    0,
    Number.isFinite(options.minIntervalMs) ? options.minIntervalMs : 0
  )

  let handle = null
  let pending = null
  let lastFlushAt = Number.NEGATIVE_INFINITY

  function flushFrame() {
    handle = null
    const next = pending
    if (!next) return

    const timestamp = now()
    if (timestamp - lastFlushAt < minIntervalMs) {
      // Preserve the latest input and wait for the next compositor frame instead
      // of using a timer that could contend with rendering work.
      handle = requestFrame(flushFrame)
      return
    }

    pending = null
    lastFlushAt = timestamp
    flush(next.payload)
  }

  return {
    schedule(payload) {
      pending = { payload }
      if (handle !== null) return
      handle = requestFrame(flushFrame)
    },
    hasPending() {
      return pending !== null
    },
    cancel() {
      if (handle !== null) {
        cancelFrame(handle)
        handle = null
      }
      pending = null
      // Re-enabling a surface should never wait behind an old interaction.
      lastFlushAt = Number.NEGATIVE_INFINITY
    }
  }
}
