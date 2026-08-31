import { effectScope, nextTick, ref } from 'vue';
import { afterEach, describe, expect, it } from 'vitest';
import { createAppScrollOwnerController, useActiveScrollSource } from './useAppScrollRoot';

describe('useActiveScrollSource', () => {
  const scopes = [];

  afterEach(() => {
    while (scopes.length) scopes.pop()?.stop();
    document.body.innerHTML = '';
  });

  it('observes only the currently active App scroll source', async () => {
    const first = document.createElement('main');
    const second = document.createElement('main');
    document.body.append(first, second);
    const source = ref(first);
    const scope = effectScope();
    scopes.push(scope);

    let state;
    scope.run(() => {
      state = useActiveScrollSource(source);
    });
    await nextTick();

    first.scrollTop = 48;
    first.dispatchEvent(new Event('scroll'));
    expect(state.scrollTop.value).toBe(48);

    second.scrollTop = 12;
    source.value = second;
    await nextTick();
    expect(state.activeSource.value).toBe(second);
    expect(state.scrollTop.value).toBe(12);

    first.scrollTop = 96;
    first.dispatchEvent(new Event('scroll'));
    expect(state.scrollTop.value).toBe(12);

    second.scrollTop = 64;
    second.dispatchEvent(new Event('scroll'));
    expect(state.scrollTop.value).toBe(64);
  });

  it('detaches the route scroll listener while a fixed workspace is active', async () => {
    const publicRoot = document.createElement('main');
    const source = ref(publicRoot);
    const scope = effectScope();
    scopes.push(scope);

    let state;
    scope.run(() => {
      state = useActiveScrollSource(source);
    });
    await nextTick();

    publicRoot.scrollTop = 30;
    publicRoot.dispatchEvent(new Event('scroll'));
    expect(state.scrollTop.value).toBe(30);

    source.value = null;
    await nextTick();
    expect(state.activeSource.value).toBeNull();
    expect(state.scrollTop.value).toBe(0);

    publicRoot.scrollTop = 80;
    publicRoot.dispatchEvent(new Event('scroll'));
    expect(state.scrollTop.value).toBe(0);
  });
});

describe('createAppScrollOwnerController', () => {
  it('keeps the newest owner when an older claim releases late', () => {
    const first = document.createElement('section');
    const second = document.createElement('section');
    const controller = createAppScrollOwnerController();

    const releaseFirst = controller.claim(first);
    const releaseSecond = controller.claim(second);
    releaseFirst();

    expect(controller.element.value).toBe(second);
    releaseSecond();
    expect(controller.element.value).toBeNull();
  });

  it('can clear the active owner during a route transition', () => {
    const controller = createAppScrollOwnerController();
    controller.claim(document.createElement('section'));

    controller.clear();

    expect(controller.element.value).toBeNull();
  });
});
