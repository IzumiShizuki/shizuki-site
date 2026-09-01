import { flushPromises, mount } from '@vue/test-utils';
import { afterEach, beforeEach, describe, expect, it } from 'vitest';
import {
  __resetMotionPreferenceForTests
} from '../../composables/useMotionPreference';
import { __resetHomeAppearanceForTests, setHomeMotionLevel } from '../../utils/homeTimeStageState';
import MediaLightbox from './MediaLightbox.vue';

const items = Object.freeze([
  {
    key: 'first',
    src: '/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1/variants/DISPLAY_WEBP',
    avifSrc: '/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1/variants/DISPLAY_AVIF',
    alt: '河岸晚霞',
    title: '晚霞',
    caption: '风从河岸吹过。',
    locationLabel: '河岸'
  },
  {
    key: 'second',
    src: '/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ2/variants/DISPLAY_WEBP',
    alt: '雨后的窗边',
    title: '雨后'
  }
]);

function pointerEvent(type, values) {
  const event = new Event(type, { bubbles: true, cancelable: true });
  Object.entries(values).forEach(([key, value]) => {
    Object.defineProperty(event, key, { configurable: true, value });
  });
  return event;
}

async function mountLightbox(props = {}) {
  const wrapper = mount(MediaLightbox, {
    attachTo: document.body,
    props: { modelValue: true, items, ...props }
  });
  await flushPromises();
  return wrapper;
}

beforeEach(() => {
  __resetMotionPreferenceForTests();
  __resetHomeAppearanceForTests();
  document.body.innerHTML = '';
  document.body.style.overflow = '';
});

afterEach(() => {
  document.body.innerHTML = '';
  document.body.style.overflow = '';
  __resetMotionPreferenceForTests();
  __resetHomeAppearanceForTests();
});

describe('MediaLightbox', () => {
  it('opens at the requested item with captions and ordered keyboard navigation', async () => {
    const wrapper = await mountLightbox({ startIndex: 1 });
    const dialog = document.querySelector('.media-lightbox');

    expect(dialog.getAttribute('role')).toBe('dialog');
    expect(dialog.textContent).toContain('2 / 2');
    expect(dialog.querySelector('img').getAttribute('alt')).toBe('雨后的窗边');
    expect(dialog.querySelector('[aria-label="下一张照片"]')).toBeNull();

    dialog.dispatchEvent(new KeyboardEvent('keydown', { key: 'ArrowLeft', bubbles: true }));
    await flushPromises();
    expect(dialog.textContent).toContain('1 / 2');
    expect(dialog.textContent).toContain('风从河岸吹过。');
    expect(dialog.querySelector('img').getAttribute('src')).toContain('/variants/DISPLAY_WEBP');
    expect(dialog.querySelector('source').getAttribute('srcset')).toContain('/variants/DISPLAY_AVIF');
    wrapper.unmount();
  });

  it('traps focus, locks the page, closes on Escape, restores scroll and returns focus', async () => {
    const scrollRoot = document.createElement('main');
    scrollRoot.className = 'route-content route-content-app-scroll';
    scrollRoot.scrollTop = 184;
    scrollRoot.style.overflow = 'auto';
    const origin = document.createElement('button');
    origin.textContent = '打开照片';
    scrollRoot.append(origin);
    document.body.append(scrollRoot);
    origin.focus();

    const wrapper = await mountLightbox();
    const dialog = document.querySelector('.media-lightbox');
    const closeButton = dialog.querySelector('[aria-label="关闭照片"]');
    const nextButton = dialog.querySelector('[aria-label="下一张照片"]');
    expect(document.activeElement).toBe(closeButton);
    expect(scrollRoot.style.overflow).toBe('hidden');
    expect(document.body.style.overflow).toBe('hidden');

    nextButton.focus();
    nextButton.dispatchEvent(new KeyboardEvent('keydown', { key: 'Tab', bubbles: true }));
    expect(document.activeElement).toBe(closeButton);

    dialog.dispatchEvent(new KeyboardEvent('keydown', { key: 'Escape', bubbles: true }));
    expect(wrapper.emitted('update:modelValue').at(-1)).toEqual([false]);
    expect(wrapper.emitted('close').at(-1)).toEqual(['escape']);
    await wrapper.setProps({ modelValue: false });
    await flushPromises();

    expect(scrollRoot.style.overflow).toBe('auto');
    expect(scrollRoot.scrollTop).toBe(184);
    expect(document.body.style.overflow).toBe('');
    expect(document.activeElement).toBe(origin);
    wrapper.unmount();
  });

  it('supports horizontal pointer swipes without inheriting Home soothing motion', async () => {
    setHomeMotionLevel('soothing');
    const wrapper = await mountLightbox();
    const dialog = document.querySelector('.media-lightbox');
    const stage = dialog.querySelector('.media-lightbox-stage');
    expect(dialog.classList.contains('motion-immersive')).toBe(true);

    stage.dispatchEvent(pointerEvent('pointerdown', {
      isPrimary: true,
      pointerId: 7,
      clientX: 220,
      clientY: 80
    }));
    stage.dispatchEvent(pointerEvent('pointerup', {
      isPrimary: true,
      pointerId: 7,
      clientX: 120,
      clientY: 82
    }));
    await flushPromises();

    expect(dialog.textContent).toContain('2 / 2');
    expect(wrapper.emitted('update:index').at(-1)).toEqual([1]);
    wrapper.unmount();
  });

  it('fails closed without switching to a provided original URL', async () => {
    const wrapper = await mountLightbox({
      items: [{
        key: 'safe-only',
        src: '/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1/variants/DISPLAY_WEBP',
        originalSrc: 'https://private-bucket.example/original.jpg',
        alt: '安全派生图'
      }]
    });
    const image = document.querySelector('.media-lightbox img');
    image.dispatchEvent(new Event('error'));
    await flushPromises();

    expect(document.querySelector('.media-lightbox-unavailable')).not.toBeNull();
    expect(document.querySelector('.media-lightbox img')).toBeNull();
    expect(document.body.innerHTML).not.toContain('private-bucket.example');
    wrapper.unmount();
  });
});
