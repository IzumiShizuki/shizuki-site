import { mount } from '@vue/test-utils';
import { nextTick } from 'vue';
import { afterEach, describe, expect, it, vi } from 'vitest';
import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import {
  __resetMotionPreferenceForTests,
  useMotionPreference
} from '../../composables/useMotionPreference';
import AuxiliaryDrawer from './AuxiliaryDrawer.vue';
import HorizontalCardRail from './HorizontalCardRail.vue';
import StickyCardStack from './StickyCardStack.vue';
import ThreeColumnContentShell from './ThreeColumnContentShell.vue';

describe('personal content layout primitives', () => {
  afterEach(() => {
    document.body.innerHTML = '';
    document.body.style.overflow = '';
    vi.unstubAllGlobals();
    window.localStorage.clear();
    __resetMotionPreferenceForTests();
  });

  it('keeps the main column dominant and declares exact desktop/tablet/mobile boundaries', () => {
    const wrapper = mount(ThreeColumnContentShell, {
      slots: {
        left: '<nav>left</nav>',
        default: '<article>story</article>',
        right: '<section>weather</section>',
        'auxiliary-trigger': '<button>生活</button>'
      }
    });

    expect(wrapper.get('.content-shell__main').text()).toBe('story');
    expect(wrapper.get('.content-shell__left').element.tagName).toBe('ASIDE');
    expect(wrapper.get('.content-shell__right').element.tagName).toBe('ASIDE');

    const landmarkFree = mount(ThreeColumnContentShell, {
      props: { mainTag: 'div' },
      slots: { default: '<article>nested workspace</article>' }
    });
    expect(landmarkFree.get('.content-shell__main').element.tagName).toBe('DIV');

    const source = readFileSync(
      resolve(process.cwd(), 'src/components/content/ThreeColumnContentShell.vue'),
      'utf8'
    );
    expect(source).toContain('grid-template-columns: var(--content-shell-left) minmax(0, 1fr) var(--content-shell-right)');
    expect(source).toContain('@media (min-width: 900px) and (max-width: 1199.98px)');
    expect(source).toContain('@media (max-width: 899.98px)');
  });

  it('uses segmented page stickiness without an independent vertical scroller', () => {
    const wrapper = mount(StickyCardStack, {
      props: { top: '96px', gap: '20px' },
      slots: { default: '<section>card</section>' }
    });

    expect(wrapper.attributes('style')).toContain('--sticky-card-top: 96px');
    expect(wrapper.attributes('style')).toContain('--sticky-card-gap: 20px');
    const source = readFileSync(
      resolve(process.cwd(), 'src/components/content/StickyCardStack.vue'),
      'utf8'
    );
    expect(source).toContain('position: sticky');
    expect(source).toContain('overflow: visible');
    expect(source).not.toContain('overflow-y: auto');
  });

  it('consumes wheel input only while the horizontal track can continue in that direction', async () => {
    useMotionPreference().setMode('soothing');
    vi.stubGlobal('ResizeObserver', class {
      observe() {}
      disconnect() {}
    });
    const wrapper = mount(HorizontalCardRail, {
      props: { title: '相册', label: '相册预览' },
      slots: { default: '<article>A</article><article>B</article>' }
    });
    const track = wrapper.get('.horizontal-card-rail__track').element;
    Object.defineProperties(track, {
      clientWidth: { configurable: true, value: 300 },
      scrollWidth: { configurable: true, value: 900 },
      scrollLeft: { configurable: true, writable: true, value: 0 }
    });
    track.scrollTo = vi.fn(({ left }) => {
      track.scrollLeft = left;
      track.dispatchEvent(new Event('scroll'));
    });
    track.dispatchEvent(new Event('scroll'));
    await nextTick();

    const forward = new WheelEvent('wheel', { deltaY: 120, bubbles: true, cancelable: true });
    track.dispatchEvent(forward);
    await nextTick();
    expect(forward.defaultPrevented).toBe(true);
    expect(track.scrollLeft).toBe(120);
    expect(wrapper.findAll('.horizontal-card-rail__button')[1].attributes('disabled')).toBeUndefined();

    track.scrollLeft = 600;
    track.dispatchEvent(new Event('scroll'));
    await nextTick();
    const beyondEnd = new WheelEvent('wheel', { deltaY: 120, bubbles: true, cancelable: true });
    track.dispatchEvent(beyondEnd);
    expect(beyondEnd.defaultPrevented).toBe(false);
    expect(track.scrollLeft).toBe(600);

    const back = new WheelEvent('wheel', { deltaY: -80, bubbles: true, cancelable: true });
    track.dispatchEvent(back);
    expect(back.defaultPrevented).toBe(true);
    expect(track.scrollLeft).toBe(520);
  });

  it('supports visible controls and keyboard navigation without moving the page', async () => {
    useMotionPreference().setMode('soothing');
    const wrapper = mount(HorizontalCardRail, {
      props: { title: '动态', step: 200 }
    });
    const trackWrapper = wrapper.get('.horizontal-card-rail__track');
    const track = trackWrapper.element;
    Object.defineProperties(track, {
      clientWidth: { configurable: true, value: 300 },
      scrollWidth: { configurable: true, value: 900 },
      scrollLeft: { configurable: true, writable: true, value: 0 }
    });
    track.scrollTo = vi.fn(({ left }) => { track.scrollLeft = left; });
    track.dispatchEvent(new Event('scroll'));
    await nextTick();

    await wrapper.findAll('.horizontal-card-rail__button')[1].trigger('click');
    expect(track.scrollLeft).toBe(200);
    await trackWrapper.trigger('keydown', { key: 'End' });
    expect(track.scrollLeft).toBe(600);
    await trackWrapper.trigger('keydown', { key: 'Home' });
    expect(track.scrollLeft).toBe(0);
  });

  it('locks the page, closes with Escape, and restores focus for the auxiliary drawer', async () => {
    useMotionPreference().setMode('soothing');
    const opener = document.createElement('button');
    opener.textContent = '打开生活抽屉';
    document.body.appendChild(opener);
    opener.focus();

    const wrapper = mount(AuxiliaryDrawer, {
      attachTo: document.body,
      props: { modelValue: false, teleportDisabled: true },
      slots: { default: '<a href="/about">About</a>' }
    });
    await wrapper.setProps({ modelValue: true });
    await nextTick();

    expect(document.body.style.overflow).toBe('hidden');
    expect(wrapper.get('.auxiliary-drawer').attributes('data-motion-mode')).toBe('soothing');
    expect(wrapper.get('.auxiliary-drawer').classes()).toContain('motion-soothing');
    expect(document.activeElement).toBe(wrapper.get('.auxiliary-drawer__close').element);
    await wrapper.get('.auxiliary-drawer__panel').trigger('keydown', { key: 'Escape' });
    expect(wrapper.emitted('update:modelValue')).toEqual([[false]]);
    expect(wrapper.emitted('close')).toEqual([['escape']]);

    await wrapper.setProps({ modelValue: false });
    await nextTick();
    expect(document.body.style.overflow).toBe('');
    expect(document.activeElement).toBe(opener);
    wrapper.unmount();
  });
});
