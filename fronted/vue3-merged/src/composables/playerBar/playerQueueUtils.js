/**
 * 队列工具纯函数。
 *
 * Ported to shizuki-site from Twilight_Echo v1.2.1 (Apache-2.0).
 * Original: src/renderer/src/utils/playerQueueUtils.ts
 * Author: Px-asen (Pxasen.com) — Twilight_Echo project.
 * Modified: TypeScript → JavaScript（JSDoc 类型）。
 */

/**
 * Fisher–Yates 洗牌，返回新数组，不改动入参。
 *
 * @template T
 * @param {T[]} arr
 * @returns {T[]}
 */
export function shuffleArray(arr) {
  const a = [...arr]
  for (let i = a.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1))
    ;[a[i], a[j]] = [a[j], a[i]]
  }
  return a
}
