/**
 * usePlaybarAutoHide 核心测试（纯函数 + effectScope 驱动的组合式 API 测试）。
 * Ported with Apache-2.0 attribution (Twilight_Echo, author Px-asen / Pxasen.com).
 */
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { defineComponent, effectScope, h, nextTick, ref } from 'vue';
import { mount } from '@vue/test-utils';
import { shouldRevealForPointer, usePlaybarAutoHide } from './usePlaybarAutoHide.js';

describe('shouldRevealForPointer', () => {
  it('reads non-finite input as no pointer information', () => {
    expect(shouldRevealForPointer(Number.NaN, 600, 80)).toBe(false);
    expect(shouldRevealForPointer(100, Number.NaN, 80)).toBe(false);
    expect(shouldRevealForPointer(Number.POSITIVE_INFINITY, 600, 80)).toBe(false);
    expect(shouldRevealForPointer(100, 600, Number.NaN)).toBe(false);
    expect(shouldRevealForPointer(100, 600, -1)).toBe(false);
  });

  it('reveals only inside the bottom threshold band', () => {
    expect(shouldRevealForPointer(520, 600, 80)).toBe(true); // exactly on the edge
    expect(shouldRevealForPointer(590, 600, 80)).toBe(true);
    expect(shouldRevealForPointer(519, 600, 80)).toBe(false);
    expect(shouldRevealForPointer(0, 600, 80)).toBe(false);
  });
});

describe('usePlaybarAutoHide', () => {
  beforeEach(() => {
    vi.useFakeTimers();
    Object.defineProperty(window, 'innerHeight', { value: 600, configurable: true });
  });

  afterEach(() => {
    vi.useRealTimers();
  });

  function setup(overrides = {}) {
    const options = {
      autoHide: ref(true),
      revealThresholdPx: ref(80),
      hideDelayMs: ref(300),
      keepOpen: ref(false),
      barRef: ref(null),
      ...overrides
    };
    const scope = effectScope();
    const api = scope.run(() => usePlaybarAutoHide(options));
    return { options, scope, api };
  }

  function pointerEvent(clientY) {
    const event = new window.Event('pointermove');
    Object.defineProperty(event, 'clientY', { value: clientY });
    return event;
  }

  it('enabling auto-hide starts hidden; disabling it restores an always-revealed bar', async () => {
    const { options, api } = setup({ autoHide: ref(false) });

    expect(api.revealed.value).toBe(true);

    options.autoHide.value = true;
    await nextTick();
    expect(api.revealed.value).toBe(false);

    options.autoHide.value = false;
    await nextTick();
    expect(api.revealed.value).toBe(true);
  });

  it('reveals inside the bottom band and hides after the delay once the pointer leaves', async () => {
    const { api } = setup();

    window.dispatchEvent(pointerEvent(590));
    await vi.advanceTimersByTimeAsync(32); // rAF frame coalescer flush
    expect(api.revealed.value).toBe(true);

    window.dispatchEvent(pointerEvent(100));
    await vi.advanceTimersByTimeAsync(32); // flush: outside band, countdown starts
    expect(api.revealed.value).toBe(true);
    await vi.advanceTimersByTimeAsync(400);
    expect(api.revealed.value).toBe(false);
  });

  it('flashReveal reveals then restarts the hide countdown', async () => {
    const { api } = setup();

    api.flashReveal();
    expect(api.revealed.value).toBe(true);
    await vi.advanceTimersByTimeAsync(200);
    expect(api.revealed.value).toBe(true);
    await vi.advanceTimersByTimeAsync(200);
    expect(api.revealed.value).toBe(false);
  });

  it('keepOpen holds the bar open indefinitely', async () => {
    const { options, api } = setup();

    options.keepOpen.value = true;
    await nextTick();
    expect(api.revealed.value).toBe(true);

    api.flashReveal();
    await vi.advanceTimersByTimeAsync(2_000);
    expect(api.revealed.value).toBe(true);

    options.keepOpen.value = false;
    await nextTick();
    await vi.advanceTimersByTimeAsync(400);
    expect(api.revealed.value).toBe(false);
  });

  it('pointer resting on the bar holds it open', async () => {
    const { api } = setup();

    api.onBarPointerEnter();
    expect(api.revealed.value).toBe(true);

    await vi.advanceTimersByTimeAsync(2_000);
    expect(api.revealed.value).toBe(true);

    api.onBarPointerLeave();
    await vi.advanceTimersByTimeAsync(400);
    expect(api.revealed.value).toBe(false);
  });

  it('keyboard focus inside the bar holds it open; focus moving to a child is not a leave', async () => {
    const { options, api } = setup();
    const bar = document.createElement('div');
    const child = document.createElement('button');
    bar.appendChild(child);
    options.barRef.value = bar;

    api.onBarFocusIn();
    expect(api.revealed.value).toBe(true);

    const focusOutInside = new window.FocusEvent('focusout', { relatedTarget: child });
    api.onBarFocusOut(focusOutInside);
    await vi.advanceTimersByTimeAsync(2_000);
    expect(api.revealed.value).toBe(true);

    const focusOutOutside = new window.FocusEvent('focusout', { relatedTarget: document.body });
    api.onBarFocusOut(focusOutOutside);
    await vi.advanceTimersByTimeAsync(400);
    expect(api.revealed.value).toBe(false);
  });

  it('unmounting the host component stops listening and clears the pending hide', async () => {
    const options = {
      autoHide: ref(true),
      revealThresholdPx: ref(80),
      hideDelayMs: ref(300),
      keepOpen: ref(false),
      barRef: ref(null)
    };
    let api = null;
    const host = defineComponent({
      setup() {
        api = usePlaybarAutoHide(options);
        return () => h('div');
      }
    });
    const wrapper = mount(host);

    api.flashReveal();
    expect(api.revealed.value).toBe(true);
    wrapper.unmount();
    // onBeforeUnmount cleared the timer: no late hide fires after teardown.
    await vi.advanceTimersByTimeAsync(2_000);
    expect(api.revealed.value).toBe(true);

    // pointermove listener was removed: post-unmount events are inert.
    window.dispatchEvent(pointerEvent(590));
    await vi.advanceTimersByTimeAsync(32);
    expect(api.revealed.value).toBe(true);
  });
});
