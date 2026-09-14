/**
 * Ported from Twilight_Echo v1.2.1 (Apache-2.0), author Px-asen (Pxasen.com).
 * Original: src/renderer/src/utils/playbackQueueVirtualization.test.ts
 * (node:test → vitest；两条读取 PlayerBar.vue / usePlayerStore.ts 的源文件巡检测试
 * 不属于纯逻辑层，未搬运；另补 usePlaybackQueueVirtualScroll 揭示测试适配)
 */
import { describe, expect, it } from 'vitest';
import { nextTick, ref } from 'vue';
import {
  createPlaybackQueueDisplayItems,
  getPlaybackQueueScrollTopForIndex,
  getPlaybackQueueWindow,
  toPlaybackQueueSnapshot,
  toPlaybackQueueSnapshots
} from './playbackQueueVirtualization.js';
import { usePlaybackQueueVirtualScroll } from './usePlaybackQueueVirtualScroll.js';

function track(index, lyrics = 'long lyric payload') {
  return {
    id: `local:${index}`,
    title: `Track ${index}`,
    artist: 'Artist',
    album: 'Album',
    filePath: `E:\\Music\\${index}.flac`,
    fileName: `${index}.flac`,
    duration: 180,
    size: 1,
    cover: null,
    lyrics,
    translatedLyrics: lyrics,
    metadataMatch: { providerId: 'ncm', trackId: String(index), confidence: 'high', score: 1 },
    source: 'local'
  };
}

describe('playbackQueueVirtualization', () => {
  it('playback queue snapshots retain routing metadata while dropping lyric and match payloads', () => {
    const snapshot = toPlaybackQueueSnapshot(track(1));

    expect(snapshot.id).toBe('local:1');
    expect(snapshot.filePath).toBe('E:\\Music\\1.flac');
    expect(snapshot.lyrics).toBeNull();
    expect(snapshot.translatedLyrics).toBeUndefined();
    expect(snapshot.metadataMatch).toBeUndefined();
  });

  it('queue snapshots keep a unique stable entry identity for duplicate tracks through reordering', () => {
    const snapshots = toPlaybackQueueSnapshots([track(1), track(1)]);
    expect(snapshots[0].queueEntryId).not.toBe(snapshots[1].queueEntryId);

    const reordered = toPlaybackQueueSnapshots([snapshots[1], snapshots[0]]);
    expect(reordered[0].queueEntryId).toBe(snapshots[1].queueEntryId);
    expect(reordered[1].queueEntryId).toBe(snapshots[0].queueEntryId);
  });

  it('virtual queue window mounts only bounded rows at 5k and 20k positions', () => {
    for (const total of [5_000, 20_000]) {
      const window = getPlaybackQueueWindow(total, (total - 1) * 54, 324);
      expect(window.end).toBe(total);
      expect(window.end - window.start).toBeLessThanOrEqual(18);
    }
  });

  it('virtual queue renders compact display records only for its visible range', () => {
    const queue = Array.from({ length: 20_000 }, (_, index) => track(index, 'x'.repeat(16_384)));
    const window = getPlaybackQueueWindow(queue.length, 10_000 * 54, 324);
    const items = createPlaybackQueueDisplayItems(queue, window);

    expect(items.length).toBeLessThanOrEqual(18);
    expect(items[0].index).toBe(window.start);
    expect(Object.keys(items[0] ?? {}).sort()).toEqual([
      'artist',
      'cover',
      'id',
      'index',
      'queueEntryId',
      'title'
    ]);
  });

  it('current queue item is centered without scrolling past either end', () => {
    expect(getPlaybackQueueScrollTopForIndex(0, 5_000, 324)).toBe(0);
    expect(getPlaybackQueueScrollTopForIndex(4_999, 5_000, 324)).toBe(5_000 * 54 - 324);
    expect(getPlaybackQueueScrollTopForIndex(2, 5_000, 324)).toBe(0);
  });

  it('virtual-scroll composable reveals the current item in a 20k queue', async () => {
    const queue = ref(Array.from({ length: 20_000 }, (_, index) => track(index)));
    const queueIndex = ref(10_000);
    const open = ref(false);
    const virtualScroll = usePlaybackQueueVirtualScroll(queue, queueIndex, open);
    const container = { clientHeight: 324, scrollTop: 0 };
    virtualScroll.containerRef.value = container;

    open.value = true;
    await nextTick();
    await nextTick();

    expect(container.scrollTop).toBeGreaterThan(0);
    expect(virtualScroll.visibleItems.value.some((item) => item.index === 10_000)).toBe(true);
    expect(virtualScroll.visibleItems.value.length).toBeLessThanOrEqual(18);
  });
});
