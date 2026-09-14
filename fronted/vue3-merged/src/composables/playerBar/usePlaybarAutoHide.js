/**
 * 播放栏自动隐藏策略 composable：底部阈值揭示、hold-open 条件、flashReveal、
 * rAF 帧合并节流。
 *
 * Ported to shizuki-site from Twilight_Echo v1.2.1 (Apache-2.0).
 * Original: src/renderer/src/components/player-bar/usePlaybarAutoHide.ts
 * Author: Px-asen (Pxasen.com) — Twilight_Echo project.
 * Modified: TypeScript → JavaScript（JSDoc 类型）；
 *           createFrameCoalescer 依赖降级为本地 ./frameCoalescer.js。
 *
 * TODO(对接点 6)：站点 MusicLibraryDock 升级形态（mini/compact）时接入；
 * autoHide / revealThresholdPx / hideDelayMs 建议沿用站点 persisted 设置模式。
 */

import { onBeforeUnmount, ref, watch } from 'vue'
import { createFrameCoalescer } from './frameCoalescer.js'

/**
 * Pure reveal test. Non-finite input reads as "no pointer information", which
 * must not trigger a reveal — a stray NaN should leave the bar where it is
 * rather than flashing it open.
 *
 * @param {number} pointerY
 * @param {number} viewportHeight
 * @param {number} thresholdPx
 * @returns {boolean}
 */
export function shouldRevealForPointer(pointerY, viewportHeight, thresholdPx) {
  if (!Number.isFinite(pointerY) || !Number.isFinite(viewportHeight)) return false
  if (!Number.isFinite(thresholdPx) || thresholdPx < 0) return false
  return viewportHeight - pointerY <= thresholdPx
}

/**
 * @typedef {Object} PlaybarAutoHideOptions
 * @property {import('vue').Ref<boolean>} autoHide 自动隐藏开关；false 时始终揭示。
 * @property {import('vue').Ref<number>} revealThresholdPx 视口底部揭示阈值带。
 * @property {import('vue').Ref<number>} hideDelayMs 离开后收起延时。
 * @property {import('vue').Ref<boolean>} keepOpen 浮层打开——绝不收起。
 * @property {import('vue').Ref<HTMLElement|null>} barRef 播放栏元素（hover/focus 判定）。
 */

/**
 * @typedef {Object} PlaybarAutoHide
 * @property {import('vue').Ref<boolean>} revealed
 * @property {() => void} flashReveal 揭示后重新计时（切歌/播放态变化用）。
 * @property {() => void} onBarPointerEnter
 * @property {() => void} onBarPointerLeave
 * @property {(event?: FocusEvent) => void} onBarFocusIn
 * @property {(event: FocusEvent) => void} onBarFocusOut
 */

/**
 * @param {PlaybarAutoHideOptions} options
 * @returns {PlaybarAutoHide}
 */
export function usePlaybarAutoHide(options) {
  const revealed = ref(true)
  const pointerInside = ref(false)
  let pointerNearBottom = false
  const focusInside = ref(false)
  /** @type {ReturnType<typeof setTimeout>|null} */
  let hideTimer = null
  let listening = false

  function clearHideTimer() {
    if (hideTimer !== null) {
      clearTimeout(hideTimer)
      hideTimer = null
    }
  }

  function holdsOpen() {
    return options.keepOpen.value || pointerNearBottom || pointerInside.value || focusInside.value
  }

  function scheduleHide() {
    if (!options.autoHide.value || holdsOpen() || hideTimer !== null || !revealed.value) return
    const delay = Math.max(0, options.hideDelayMs.value)
    hideTimer = setTimeout(() => {
      hideTimer = null
      if (!options.autoHide.value || holdsOpen()) return
      revealed.value = false
    }, delay)
  }

  function reveal() {
    clearHideTimer()
    revealed.value = true
  }

  const pointerCoalescer = createFrameCoalescer((pointerY) => {
    if (!options.autoHide.value) return
    pointerNearBottom = shouldRevealForPointer(
      pointerY,
      window.innerHeight,
      options.revealThresholdPx.value
    )
    if (pointerNearBottom) {
      reveal()
      return
    }
    if (revealed.value) scheduleHide()
  })

  function onPointerMove(event) {
    if (!options.autoHide.value) return
    // Skipping while the tab is hidden keeps this off the frame budget when the
    // window is in the background.
    if (document.hidden) return
    pointerCoalescer.schedule(event.clientY)
  }

  function onPointerLeaveDocument() {
    if (!options.autoHide.value) return
    pointerInside.value = false
    pointerNearBottom = false
    scheduleHide()
  }

  function onWindowBlur() {
    if (!options.autoHide.value) return
    pointerInside.value = false
    pointerNearBottom = false
    focusInside.value = false
    scheduleHide()
  }

  function startListening() {
    if (listening) return
    listening = true
    window.addEventListener('pointermove', onPointerMove, { passive: true })
    document.addEventListener('pointerleave', onPointerLeaveDocument)
    window.addEventListener('blur', onWindowBlur)
  }

  function stopListening() {
    if (!listening) return
    listening = false
    window.removeEventListener('pointermove', onPointerMove)
    document.removeEventListener('pointerleave', onPointerLeaveDocument)
    window.removeEventListener('blur', onWindowBlur)
    pointerCoalescer.cancel()
  }

  watch(
    options.autoHide,
    (active) => {
      pointerNearBottom = false
      pointerInside.value = false
      focusInside.value = false
      if (active) {
        startListening()
        // Start hidden so enabling the setting reads as "the bar tucked away",
        // not "the bar is stuck open until I move the mouse".
        clearHideTimer()
        revealed.value = false
        return
      }
      stopListening()
      clearHideTimer()
      revealed.value = true
    },
    { immediate: true }
  )

  watch([options.keepOpen, options.revealThresholdPx, options.hideDelayMs], () => {
    if (!options.autoHide.value) return
    if (holdsOpen()) {
      reveal()
      return
    }
    scheduleHide()
  })

  function flashReveal() {
    if (!options.autoHide.value) return
    reveal()
    scheduleHide()
  }

  function onBarPointerEnter() {
    pointerInside.value = true
    if (options.autoHide.value) reveal()
  }

  function onBarPointerLeave() {
    pointerInside.value = false
    scheduleHide()
  }

  function onBarFocusIn(event) {
    focusInside.value = event
      ? event.target?.matches(':focus-visible') === true
      : true
    if (options.autoHide.value && focusInside.value) reveal()
  }

  function onBarFocusOut(event) {
    const bar = options.barRef.value
    const next = event.relatedTarget
    // Focus moving between children of the bar must not count as leaving it.
    if (bar && next instanceof Node && bar.contains(next)) return
    focusInside.value = false
    scheduleHide()
  }

  onBeforeUnmount(() => {
    stopListening()
    clearHideTimer()
  })

  return {
    revealed,
    flashReveal,
    onBarPointerEnter,
    onBarPointerLeave,
    onBarFocusIn,
    onBarFocusOut
  }
}
