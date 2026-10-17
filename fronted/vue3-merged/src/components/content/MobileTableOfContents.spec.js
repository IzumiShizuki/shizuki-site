import { describe, it, expect, vi, beforeEach, afterEach } from 'vitest';
import { mount } from '@vue/test-utils';
import { nextTick } from 'vue';
import MobileTableOfContents from './MobileTableOfContents.vue';

describe('MobileTableOfContents', () => {
  let wrapper;

  beforeEach(() => {
    // Create a teleport target
    const el = document.createElement('div');
    el.id = 'app';
    document.body.appendChild(el);
  });

  afterEach(() => {
    if (wrapper) {
      wrapper.unmount();
    }
    document.body.innerHTML = '';
  });

  it('does not render when open is false', () => {
    wrapper = mount(MobileTableOfContents, {
      props: {
        open: false,
        title: 'Table of Contents'
      },
      attachTo: document.body
    });

    expect(document.querySelector('.mobile-toc-overlay')).toBeNull();
  });

  it('renders when open is true', async () => {
    wrapper = mount(MobileTableOfContents, {
      props: {
        open: true,
        title: 'Table of Contents'
      },
      attachTo: document.body
    });

    await nextTick();
    expect(document.querySelector('.mobile-toc-overlay')).toBeTruthy();
    expect(document.querySelector('.mobile-toc-panel')).toBeTruthy();
  });

  it('displays the title', async () => {
    wrapper = mount(MobileTableOfContents, {
      props: {
        open: true,
        title: 'Custom Title'
      },
      attachTo: document.body
    });

    await nextTick();
    const title = document.querySelector('.mobile-toc-header h2');
    expect(title?.textContent).toBe('Custom Title');
  });

  it('emits close event when overlay is clicked', async () => {
    wrapper = mount(MobileTableOfContents, {
      props: {
        open: true,
        title: 'Test'
      },
      attachTo: document.body
    });

    await nextTick();
    const overlay = document.querySelector('.mobile-toc-overlay');
    await overlay.click();

    expect(wrapper.emitted('update:open')).toBeTruthy();
    expect(wrapper.emitted('update:open')[0]).toEqual([false]);
    expect(wrapper.emitted('close')).toBeTruthy();
  });

  it('emits close event when close button is clicked', async () => {
    wrapper = mount(MobileTableOfContents, {
      props: {
        open: true,
        title: 'Test'
      },
      attachTo: document.body
    });

    await nextTick();
    const closeButton = document.querySelector('.mobile-toc-close');
    await closeButton.click();

    expect(wrapper.emitted('update:open')).toBeTruthy();
    expect(wrapper.emitted('close')).toBeTruthy();
  });

  it('renders slot content', async () => {
    wrapper = mount(MobileTableOfContents, {
      props: {
        open: true,
        title: 'Test'
      },
      slots: {
        default: '<div class="test-content">Slot Content</div>'
      },
      attachTo: document.body
    });

    await nextTick();
    const content = document.querySelector('.test-content');
    expect(content?.textContent).toBe('Slot Content');
  });

  it('sets body overflow hidden when open', async () => {
    const originalOverflow = document.body.style.overflow;

    wrapper = mount(MobileTableOfContents, {
      props: {
        open: false,
        title: 'Test'
      },
      attachTo: document.body
    });

    await nextTick();
    expect(document.body.style.overflow).toBe('');

    await wrapper.setProps({ open: true });
    await nextTick();
    // Allow watcher to run
    await new Promise(resolve => setTimeout(resolve, 10));
    expect(document.body.style.overflow).toBe('hidden');

    await wrapper.setProps({ open: false });
    await nextTick();
    // Allow watcher to run
    await new Promise(resolve => setTimeout(resolve, 10));
    expect(document.body.style.overflow).toBe('');

    document.body.style.overflow = originalOverflow;
  });

  it('contains keyboard focus, closes on Escape and restores the trigger and existing scroll style', async () => {
    const trigger = document.createElement('button');
    document.body.append(trigger);
    trigger.focus();
    document.body.style.overflow = 'auto';
    wrapper = mount(MobileTableOfContents, {
      props: { open: false },
      slots: { default: '<button class="last-heading">章节</button>' },
      global: { stubs: { transition: false } },
      attachTo: document.body
    });
    expect(document.body.style.overflow).toBe('auto');
    await wrapper.setProps({ open: true });
    const close = document.querySelector('.mobile-toc-close');
    const last = document.querySelector('.last-heading');
    await vi.waitFor(() => expect(document.activeElement).toBe(close));
    close.dispatchEvent(new KeyboardEvent('keydown', { key: 'Tab', shiftKey: true, bubbles: true, cancelable: true }));
    expect(document.activeElement).toBe(last);
    last.dispatchEvent(new KeyboardEvent('keydown', { key: 'Tab', bubbles: true, cancelable: true }));
    expect(document.activeElement).toBe(close);
    close.dispatchEvent(new KeyboardEvent('keydown', { key: 'Escape', bubbles: true, cancelable: true }));
    expect(wrapper.emitted('update:open')).toEqual([[false]]);
    await wrapper.setProps({ open: false });
    await vi.waitFor(() => expect(document.activeElement).toBe(trigger));
    expect(document.body.style.overflow).toBe('auto');
    document.body.style.overflow = '';
  });
});
