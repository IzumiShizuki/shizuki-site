import { ref } from 'vue';
import { afterEach, describe, expect, it, vi } from 'vitest';
import { __resetMotionPreferenceForTests, setMotionMode } from './useMotionPreference';
import {
  __resetViewTransitionNavigationForTests,
  activeRouteTransitionName,
  consumeRouteFocusTarget,
  resolveMemoryLensName,
  resolveSharedTransitionName,
  supportsNativeViewTransitions,
  useViewTransitionNavigation
} from './useViewTransitionNavigation';

afterEach(() => {
  __resetMotionPreferenceForTests();
  __resetViewTransitionNavigationForTests();
  delete document.startViewTransition;
  delete document.documentElement.dataset.routeTransition;
});

describe('useViewTransitionNavigation', () => {
  it('creates a stable CSS-safe Memory Lens name', () => {
    expect(resolveMemoryLensName('Summer / 杭州 2026')).toBe('memory-lens-summer-2026');
    expect(resolveMemoryLensName('')).toBe('memory-lens-content');
    expect(resolveSharedTransitionName('Post / 42', 'content-flow')).toBe('content-flow-post-42');
  });

  it('reports native capability explicitly so pages can select the CSS fallback', () => {
    expect(supportsNativeViewTransitions({})).toBe(false);
    expect(supportsNativeViewTransitions({ startViewTransition() {} })).toBe(true);
  });

  it('uses one selected source as the immersive transition owner', async () => {
    setMotionMode('immersive');
    const router = { push: vi.fn().mockResolvedValue(undefined), currentRoute: ref({}) };
    const sourceElement = document.createElement('a');
    const finished = Promise.resolve();
    document.startViewTransition = vi.fn((update) => {
      void update();
      return { finished };
    });
    const navigation = useViewTransitionNavigation({ router });

    await navigation.navigate('/albums/real-a', { sourceElement, sharedName: 'real-a' });

    expect(document.startViewTransition).toHaveBeenCalledOnce();
    expect(router.push).toHaveBeenCalledWith('/albums/real-a');
    expect(sourceElement.style.viewTransitionName).toBe('memory-lens-real-a');
    await finished;
    await Promise.resolve();
    expect(sourceElement.style.viewTransitionName).toBe('');
  });

  it('uses ordinary navigation in soothing mode', async () => {
    setMotionMode('soothing');
    const router = { push: vi.fn().mockResolvedValue(undefined) };
    document.startViewTransition = vi.fn();
    const navigation = useViewTransitionNavigation({ router });

    await navigation.navigate('/albums/real-b', { sourceElement: document.createElement('a'), sharedName: 'real-b' });

    expect(document.startViewTransition).not.toHaveBeenCalled();
    expect(router.push).toHaveBeenCalledWith('/albums/real-b');
  });

  it('uses the restrained content-flow identity and hands reader focus over exactly once', async () => {
    setMotionMode('immersive');
    const router = { push: vi.fn().mockResolvedValue(undefined) };
    let finishTransition;
    const finished = new Promise((resolve) => {
      finishTransition = resolve;
    });
    document.startViewTransition = vi.fn((update) => {
      void update();
      return { finished };
    });
    const sourceElement = document.createElement('article');
    const navigation = useViewTransitionNavigation({ router });

    await navigation.navigate('/blog/42', {
      sourceElement,
      sharedName: 'post-42',
      transitionKind: 'content-flow',
      focusTarget: 'blog-reader-title-42'
    });

    expect(sourceElement.style.viewTransitionName).toBe('content-flow-post-42');
    expect(activeRouteTransitionName.value).toBe('content-flow-post-42');
    expect(document.documentElement.dataset.routeTransition).toBe('content-flow');
    expect(consumeRouteFocusTarget('blog-reader-title-42')).toBe(true);
    expect(consumeRouteFocusTarget('blog-reader-title-42')).toBe(false);

    finishTransition();
    await finished;
    await Promise.resolve();
    expect(activeRouteTransitionName.value).toBe('');
  });

  it('keeps focus handoff when native transitions are unavailable', async () => {
    setMotionMode('soothing');
    const router = { push: vi.fn().mockResolvedValue(undefined) };
    const navigation = useViewTransitionNavigation({ router });

    await navigation.navigate('/blog/9', {
      transitionKind: 'content-flow',
      focusTarget: 'blog-reader-title-9'
    });

    expect(consumeRouteFocusTarget('blog-reader-title-9')).toBe(true);
  });
});
