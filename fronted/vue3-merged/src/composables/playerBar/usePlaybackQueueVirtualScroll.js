/**
 * 队列虚拟滚动 composable：滚动窗口 + 自动定位当前曲目（居中）。
 *
 * Ported to shizuki-site from Twilight_Echo v1.2.1 (Apache-2.0).
 * Original: src/renderer/src/components/player-bar/usePlaybackQueueVirtualScroll.ts
 * Author: Px-asen (Pxasen.com) — Twilight_Echo project.
 * Modified: TypeScript → JavaScript（JSDoc 类型）。
 *
 * 用法（站点 Dock 队列面板升级时）：queue 传 usePlayerEngine.tracks，
 * queueIndex 传当前曲目索引，open 传面板开关。行渲染用
 * `v-for="item in visibleItems" :key="item.queueEntryId"`，外层 spacer 高
 * totalHeight、内层 translateY 定位。
 */

import {
  computed,
  getCurrentInstance,
  nextTick,
  onMounted,
  onUnmounted,
  ref,
  watch
} from 'vue'
import {
  createPlaybackQueueDisplayItems,
  getPlaybackQueueScrollTopForIndex,
  getPlaybackQueueWindow,
  PLAYBACK_QUEUE_ROW_HEIGHT
} from './playbackQueueVirtualization.js'

/**
 * @param {import('vue').Ref<import('./types.js').QueueTrack[]>} queue
 * @param {import('vue').Ref<number>} queueIndex
 * @param {import('vue').Ref<boolean>} open
 */
export function usePlaybackQueueVirtualScroll(queue, queueIndex, open) {
  const containerRef = ref(null)
  const scrollTop = ref(0)
  const viewportHeight = ref(0)

  const visibleRange = computed(() =>
    getPlaybackQueueWindow(queue.value.length, scrollTop.value, viewportHeight.value)
  )
  const visibleItems = computed(() =>
    createPlaybackQueueDisplayItems(queue.value, visibleRange.value)
  )
  const totalHeight = computed(() => queue.value.length * PLAYBACK_QUEUE_ROW_HEIGHT)
  const translateY = computed(() => visibleRange.value.start * PLAYBACK_QUEUE_ROW_HEIGHT)

  function updateViewport() {
    viewportHeight.value = containerRef.value?.clientHeight ?? 0
  }

  function onScroll(event) {
    scrollTop.value = event.target.scrollTop
  }

  function scrollToCurrent() {
    const container = containerRef.value
    if (!container || queueIndex.value < 0) return
    const nextTop = getPlaybackQueueScrollTopForIndex(
      queueIndex.value,
      queue.value.length,
      container.clientHeight
    )
    container.scrollTop = nextTop
    scrollTop.value = nextTop
  }

  async function revealCurrent() {
    await nextTick()
    updateViewport()
    scrollToCurrent()
  }

  if (getCurrentInstance()) {
    onMounted(() => {
      updateViewport()
      window.addEventListener('resize', updateViewport)
    })

    onUnmounted(() => window.removeEventListener('resize', updateViewport))
  }

  watch(open, (isOpen) => {
    if (isOpen) void revealCurrent()
  })

  watch(queueIndex, () => {
    if (open.value) void revealCurrent()
  })

  return {
    containerRef,
    visibleItems,
    totalHeight,
    translateY,
    onScroll,
    scrollToCurrent
  }
}
