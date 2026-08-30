import { flushPromises, mount } from '@vue/test-utils';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import LightAppWindowHost from './LightAppWindowHost.vue';
import { LIGHT_APP_WINDOW_OPEN_EVENT } from '../../utils/lightAppWindowBus';
import { __resetLightAppShellForTests } from './lightAppShellStore';
import { LIGHT_APPS_CATALOG } from '../../utils/lightAppsCatalog';

vi.mock('./pomodoro/PomodoroWindow.vue', () => ({
  default: { template: '<section />' }
}));
vi.mock('./balance/BalanceLedgerWindow.vue', () => ({
  default: { template: '<section />' }
}));
vi.mock('./timeprism/TimePrismTodoSuiteWindow.vue', () => ({
  default: { template: '<section />' }
}));
vi.mock('./url/UrlLinksWindow.vue', () => ({
  default: { template: '<section />' }
}));
vi.mock('./board/BoardCanvasWindow.vue', () => ({
  default: { template: '<section />' }
}));
vi.mock('./blog/BlogSlidevWindow.vue', () => ({
  default: { template: '<section />' }
}));
vi.mock('./qr/QrToolsWindow.vue', () => ({
  default: { template: '<section />' }
}));
vi.mock('./toolbox/WebToolboxWindow.vue', () => ({
  default: { template: '<section />' }
}));
vi.mock('./kj/KjToolSourceWindow.vue', () => ({
  default: { template: '<section />' }
}));

async function mountHost(props = {}) {
  const wrapper = mount(LightAppWindowHost, {
    props: {
      isHomeRoute: true,
      ...props
    },
    shallow: true,
    attachTo: document.body
  });

  await flushPromises();
  return wrapper;
}

async function openWindow(code) {
  window.dispatchEvent(
    new CustomEvent(LIGHT_APP_WINDOW_OPEN_EVENT, {
      detail: {
        code,
        source: 'test'
      }
    })
  );
  await flushPromises();
}

describe('LightAppWindowHost', () => {
  beforeEach(() => {
    __resetLightAppShellForTests();
  });

  it('closes window by header action button click', async () => {
    const wrapper = await mountHost();
    await openWindow('timeprism-todo');

    const closeButton = wrapper.get('button[title="关闭"]');
    await closeButton.trigger('click');
    await flushPromises();

    expect(wrapper.find('button[title="关闭"]').exists()).toBe(false);
    wrapper.unmount();
  });

  it('toggles pinned state by header action button click', async () => {
    const wrapper = await mountHost();
    await openWindow('timeprism-todo');

    const pinButton = wrapper.get('button[title="固定到主页"]');
    await pinButton.trigger('click');
    await flushPromises();
    expect(wrapper.find('button[title="取消固定"]').exists()).toBe(true);

    const pinnedButton = wrapper.get('button[title="取消固定"]');
    await pinnedButton.trigger('click');
    await flushPromises();
    expect(wrapper.find('button[title="固定到主页"]').exists()).toBe(true);

    wrapper.unmount();
  });

  it('toggles minimized state by header action button click', async () => {
    const wrapper = await mountHost();
    await openWindow('timeprism-todo');

    const minButton = wrapper.get('button[title="最小化"]');
    await minButton.trigger('click');
    await flushPromises();

    expect(wrapper.find('button[title="还原"]').exists()).toBe(true);
    expect(wrapper.find('.window-body').exists()).toBe(false);

    const restoreButton = wrapper.get('button[title="还原"]');
    await restoreButton.trigger('click');
    await flushPromises();

    expect(wrapper.find('button[title="最小化"]').exists()).toBe(true);
    expect(wrapper.find('.window-body').exists()).toBe(true);

    wrapper.unmount();
  });

  it('applies header actions to the clicked window when multiple windows are open', async () => {
    const wrapper = await mountHost();
    await openWindow('timeprism-todo');
    await openWindow('pomodoro-timer');

    const todoWindow = wrapper.get('article[data-window-code="timeprism-todo"]');
    await todoWindow.get('button[title="最小化"]').trigger('click');
    await flushPromises();

    const todoAfterMin = wrapper.get('article[data-window-code="timeprism-todo"]');
    const pomodoroAfterMin = wrapper.get('article[data-window-code="pomodoro-timer"]');
    expect(todoAfterMin.find('button[title="还原"]').exists()).toBe(true);
    expect(pomodoroAfterMin.find('button[title="还原"]').exists()).toBe(false);

    await todoAfterMin.get('button[title="关闭"]').trigger('click');
    await flushPromises();

    expect(wrapper.find('article[data-window-code="timeprism-todo"]').exists()).toBe(false);
    expect(wrapper.find('article[data-window-code="pomodoro-timer"]').exists()).toBe(true);
    wrapper.unmount();
  });

  it('keeps first window action isolated after second window opens', async () => {
    const wrapper = await mountHost();
    await openWindow('timeprism-todo');
    await openWindow('pomodoro-timer');

    const todoWindow = wrapper.get('article[data-window-code="timeprism-todo"]');
    const todoPinButton = todoWindow.get('button[title="固定到主页"]');
    await todoPinButton.trigger('pointerdown', { button: 0, pointerId: 1 });
    await todoPinButton.trigger('click');
    await flushPromises();

    const todoAfterPin = wrapper.get('article[data-window-code="timeprism-todo"]');
    const pomodoroAfterPin = wrapper.get('article[data-window-code="pomodoro-timer"]');
    expect(todoAfterPin.find('button[title="取消固定"]').exists()).toBe(true);
    expect(pomodoroAfterPin.find('button[title="取消固定"]').exists()).toBe(false);

    wrapper.unmount();
  });

  it.each(LIGHT_APPS_CATALOG.map((app) => [app.code, app.title]))(
    'gives %s (%s) a labeled edge-to-edge fullscreen control',
    async (code) => {
      const wrapper = await mountHost();
      await openWindow(code);

      const appWindow = wrapper.get(`article[data-window-code="${code}"]`);
      const enterButton = appWindow.get('button[aria-label="进入全屏"]');
      await enterButton.trigger('click');
      await flushPromises();

      const fullscreenWindow = wrapper.get(`article[data-window-code="${code}"]`);
      expect(fullscreenWindow.classes()).toContain('is-fullscreen');
      expect(fullscreenWindow.attributes('role')).toBe('dialog');
      expect(fullscreenWindow.attributes('aria-modal')).toBe('true');
      expect(fullscreenWindow.get('button[aria-label="退出全屏"]').exists()).toBe(true);
      expect(fullscreenWindow.find('.window-resize-handle').exists()).toBe(false);
      expect(fullscreenWindow.get('.window-drag-zone').classes()).toContain('is-disabled');

      await fullscreenWindow.get('button[aria-label="退出全屏"]').trigger('click');
      await flushPromises();
      expect(wrapper.get(`article[data-window-code="${code}"]`).classes()).not.toContain('is-fullscreen');
      wrapper.unmount();
    }
  );

  it('locks and isolates the page, traps Tab, exits on Escape, and restores focus', async () => {
    const wrapper = await mountHost();
    const backgroundButton = document.createElement('button');
    backgroundButton.textContent = 'background';
    wrapper.element.parentElement.append(backgroundButton);
    backgroundButton.focus();
    await openWindow('timeprism-todo');

    await wrapper.get('button[aria-label="进入全屏"]').trigger('click');
    await flushPromises();

    const fullscreenWindow = wrapper.get('article.is-fullscreen');
    expect(document.body.style.overflow).toBe('hidden');
    expect(backgroundButton.hasAttribute('inert')).toBe(true);
    expect(fullscreenWindow.element.contains(document.activeElement)).toBe(true);

    const focusable = fullscreenWindow.findAll('button:not([disabled])');
    focusable.at(-1).element.focus();
    await fullscreenWindow.trigger('keydown', { key: 'Tab' });
    expect(document.activeElement).toBe(focusable[0].element);

    await fullscreenWindow.trigger('keydown', { key: 'Escape' });
    await flushPromises();
    expect(wrapper.find('article.is-fullscreen').exists()).toBe(false);
    expect(document.body.style.overflow).toBe('');
    expect(backgroundButton.hasAttribute('inert')).toBe(false);
    expect(document.activeElement).toBe(backgroundButton);

    backgroundButton.remove();
    wrapper.unmount();
  });

  it('does not consume Escape from editable fields or nested application dialogs', async () => {
    const wrapper = await mountHost();
    await openWindow('timeprism-todo');
    await wrapper.get('button[aria-label="进入全屏"]').trigger('click');
    await flushPromises();
    const fullscreenWindow = wrapper.get('article.is-fullscreen');

    const input = document.createElement('input');
    fullscreenWindow.element.append(input);
    input.focus();
    input.dispatchEvent(new KeyboardEvent('keydown', { key: 'Escape', bubbles: true }));
    await flushPromises();
    expect(wrapper.find('article.is-fullscreen').exists()).toBe(true);

    const nestedDialog = document.createElement('section');
    nestedDialog.setAttribute('role', 'dialog');
    const nestedButton = document.createElement('button');
    nestedDialog.append(nestedButton);
    fullscreenWindow.element.append(nestedDialog);
    nestedButton.focus();
    nestedButton.dispatchEvent(new KeyboardEvent('keydown', { key: 'Escape', bubbles: true }));
    await flushPromises();
    expect(wrapper.find('article.is-fullscreen').exists()).toBe(true);

    wrapper.unmount();
  });
});
