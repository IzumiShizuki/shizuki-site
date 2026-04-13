import { flushPromises, mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import LightAppWindowHost from './LightAppWindowHost.vue';
import { LIGHT_APP_WINDOW_OPEN_EVENT } from '../../utils/lightAppWindowBus';

async function mountHost(props = {}) {
  const wrapper = mount(LightAppWindowHost, {
    props: {
      isHomeRoute: true,
      ...props
    },
    shallow: true
  });

  await flushPromises();
  return wrapper;
}

describe('LightAppWindowHost', () => {
  it('closes window on pointerdown fallback when click is missing', async () => {
    const wrapper = await mountHost();

    window.dispatchEvent(
      new CustomEvent(LIGHT_APP_WINDOW_OPEN_EVENT, {
        detail: {
          code: 'timeprism-todo',
          source: 'test'
        }
      })
    );
    await flushPromises();

    const closeButton = wrapper.get('button[title="关闭"]');
    await closeButton.trigger('pointerdown', { button: 0 });
    await flushPromises();

    expect(wrapper.find('button[title="关闭"]').exists()).toBe(false);
    wrapper.unmount();
  });
});
